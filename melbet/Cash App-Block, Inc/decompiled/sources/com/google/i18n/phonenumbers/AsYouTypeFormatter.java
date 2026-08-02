package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.ConnectionPool;

/* loaded from: classes.dex */
public final class AsYouTypeFormatter {
    public static final Pattern DIGIT_PATTERN;
    public static final Pattern ELIGIBLE_FORMAT_PATTERN;
    public static final Phonemetadata$PhoneMetadata.Builder EMPTY_METADATA;
    public static final Pattern NATIONAL_PREFIX_SEPARATORS_PATTERN;
    public Phonemetadata$PhoneMetadata currentMetadata;
    public final String defaultCountry;
    public final Phonemetadata$PhoneMetadata defaultMetadata;
    public String extractedNationalPrefix;
    public int lastMatchPosition;
    public final StringBuilder nationalNumber;
    public final PhoneNumberUtil phoneUtil;
    public final ArrayList possibleFormats;
    public final StringBuilder prefixBeforeNationalNumber;
    public final ConnectionPool regexCache;
    public boolean shouldAddSpaceAfterNationalPrefix;
    public final StringBuilder formattingTemplate = new StringBuilder();
    public String currentFormattingPattern = "";
    public final StringBuilder accruedInput = new StringBuilder();
    public final StringBuilder accruedInputWithoutFormatting = new StringBuilder();
    public boolean ableToFormat = true;
    public boolean inputHasFormatting = false;
    public boolean isCompleteNumber = false;
    public boolean isExpectingCountryCallingCode = false;

    static {
        Phonemetadata$PhoneMetadata.Builder builder = new Phonemetadata$PhoneMetadata.Builder();
        builder.id_ = "<ignored>";
        builder.internationalPrefix_ = "NA";
        EMPTY_METADATA = builder;
        ELIGIBLE_FORMAT_PATTERN = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*\\$1[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*)*");
        NATIONAL_PREFIX_SEPARATORS_PATTERN = Pattern.compile("[- ]");
        DIGIT_PATTERN = Pattern.compile("\u2008");
    }

    public AsYouTypeFormatter(String str) {
        PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
        this.phoneUtil = phoneNumberUtil;
        this.lastMatchPosition = 0;
        this.prefixBeforeNationalNumber = new StringBuilder();
        this.shouldAddSpaceAfterNationalPrefix = false;
        this.extractedNationalPrefix = "";
        this.nationalNumber = new StringBuilder();
        this.possibleFormats = new ArrayList();
        this.regexCache = new ConnectionPool(64);
        this.defaultCountry = str;
        Phonemetadata$PhoneMetadata metadataForRegion = phoneNumberUtil.getMetadataForRegion(phoneNumberUtil.getRegionCodeForCountryCode(phoneNumberUtil.getCountryCodeForRegion(str)));
        metadataForRegion = metadataForRegion == null ? EMPTY_METADATA : metadataForRegion;
        this.currentMetadata = metadataForRegion;
        this.defaultMetadata = metadataForRegion;
    }

    public final String appendNationalNumber(String str) {
        StringBuilder sb = this.prefixBeforeNationalNumber;
        int length = sb.length();
        if (!this.shouldAddSpaceAfterNationalPrefix || length <= 0 || sb.charAt(length - 1) == ' ') {
            return ((Object) sb) + str;
        }
        return new String(sb) + ' ' + str;
    }

    public final String attemptToChooseFormattingPattern() {
        StringBuilder sb = this.nationalNumber;
        if (sb.length() < 3) {
            return appendNationalNumber(sb.toString());
        }
        String sb2 = sb.toString();
        for (Phonemetadata$NumberFormat phonemetadata$NumberFormat : (this.isCompleteNumber && this.extractedNationalPrefix.length() == 0 && this.currentMetadata.intlNumberFormat_.size() > 0) ? this.currentMetadata.intlNumberFormat_ : this.currentMetadata.numberFormat_) {
            if (this.extractedNationalPrefix.length() > 0) {
                String str = phonemetadata$NumberFormat.nationalPrefixFormattingRule_;
                if ((str.length() == 0 || PhoneNumberUtil.FIRST_GROUP_ONLY_PREFIX_PATTERN.matcher(str).matches()) && !phonemetadata$NumberFormat.nationalPrefixOptionalWhenFormatting_ && !phonemetadata$NumberFormat.hasDomesticCarrierCodeFormattingRule) {
                }
            }
            if (this.extractedNationalPrefix.length() == 0 && !this.isCompleteNumber) {
                String str2 = phonemetadata$NumberFormat.nationalPrefixFormattingRule_;
                if (str2.length() != 0 && !PhoneNumberUtil.FIRST_GROUP_ONLY_PREFIX_PATTERN.matcher(str2).matches() && !phonemetadata$NumberFormat.nationalPrefixOptionalWhenFormatting_) {
                }
            }
            if (ELIGIBLE_FORMAT_PATTERN.matcher(phonemetadata$NumberFormat.format_).matches()) {
                this.possibleFormats.add(phonemetadata$NumberFormat);
            }
        }
        narrowDownPossibleFormats(sb2);
        String attemptToFormatAccruedDigits = attemptToFormatAccruedDigits();
        return attemptToFormatAccruedDigits.length() > 0 ? attemptToFormatAccruedDigits : maybeCreateNewTemplate() ? inputAccruedNationalNumber() : this.accruedInput.toString();
    }

    public final boolean attemptToExtractCountryCallingCode() {
        StringBuilder sb;
        PhoneNumberUtil phoneNumberUtil;
        int extractCountryCode;
        StringBuilder sb2 = this.nationalNumber;
        if (sb2.length() == 0 || (extractCountryCode = (phoneNumberUtil = this.phoneUtil).extractCountryCode(sb2, (sb = new StringBuilder()))) == 0) {
            return false;
        }
        sb2.setLength(0);
        sb2.append((CharSequence) sb);
        String regionCodeForCountryCode = phoneNumberUtil.getRegionCodeForCountryCode(extractCountryCode);
        if ("001".equals(regionCodeForCountryCode)) {
            this.currentMetadata = phoneNumberUtil.getMetadataForNonGeographicalRegion(extractCountryCode);
        } else if (!regionCodeForCountryCode.equals(this.defaultCountry)) {
            Phonemetadata$PhoneMetadata metadataForRegion = phoneNumberUtil.getMetadataForRegion(phoneNumberUtil.getRegionCodeForCountryCode(phoneNumberUtil.getCountryCodeForRegion(regionCodeForCountryCode)));
            if (metadataForRegion == null) {
                metadataForRegion = EMPTY_METADATA;
            }
            this.currentMetadata = metadataForRegion;
        }
        String num = Integer.toString(extractCountryCode);
        StringBuilder sb3 = this.prefixBeforeNationalNumber;
        sb3.append(num);
        sb3.append(' ');
        this.extractedNationalPrefix = "";
        return true;
    }

    public final boolean attemptToExtractIdd() {
        Pattern patternForRegex = this.regexCache.getPatternForRegex("\\+|" + this.currentMetadata.internationalPrefix_);
        StringBuilder sb = this.accruedInputWithoutFormatting;
        Matcher matcher = patternForRegex.matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.isCompleteNumber = true;
        int end = matcher.end();
        StringBuilder sb2 = this.nationalNumber;
        sb2.setLength(0);
        sb2.append(sb.substring(end));
        StringBuilder sb3 = this.prefixBeforeNationalNumber;
        sb3.setLength(0);
        sb3.append(sb.substring(0, end));
        if (sb.charAt(0) != '+') {
            sb3.append(' ');
        }
        return true;
    }

    public final String attemptToFormatAccruedDigits() {
        Iterator it = this.possibleFormats.iterator();
        while (it.hasNext()) {
            Phonemetadata$NumberFormat phonemetadata$NumberFormat = (Phonemetadata$NumberFormat) it.next();
            Matcher matcher = this.regexCache.getPatternForRegex(phonemetadata$NumberFormat.pattern_).matcher(this.nationalNumber);
            if (matcher.matches()) {
                this.shouldAddSpaceAfterNationalPrefix = NATIONAL_PREFIX_SEPARATORS_PATTERN.matcher(phonemetadata$NumberFormat.nationalPrefixFormattingRule_).find();
                String appendNationalNumber = appendNationalNumber(matcher.replaceAll(phonemetadata$NumberFormat.format_));
                if (PhoneNumberUtil.normalizeHelper(appendNationalNumber, PhoneNumberUtil.DIALLABLE_CHAR_MAPPINGS).contentEquals(this.accruedInputWithoutFormatting)) {
                    return appendNationalNumber;
                }
            }
        }
        return "";
    }

    public final void clear() {
        this.accruedInput.setLength(0);
        this.accruedInputWithoutFormatting.setLength(0);
        this.formattingTemplate.setLength(0);
        this.lastMatchPosition = 0;
        this.currentFormattingPattern = "";
        this.prefixBeforeNationalNumber.setLength(0);
        this.extractedNationalPrefix = "";
        this.nationalNumber.setLength(0);
        this.ableToFormat = true;
        this.inputHasFormatting = false;
        this.isCompleteNumber = false;
        this.isExpectingCountryCallingCode = false;
        this.possibleFormats.clear();
        this.shouldAddSpaceAfterNationalPrefix = false;
        if (this.currentMetadata.equals(this.defaultMetadata)) {
            return;
        }
        PhoneNumberUtil phoneNumberUtil = this.phoneUtil;
        Phonemetadata$PhoneMetadata metadataForRegion = phoneNumberUtil.getMetadataForRegion(phoneNumberUtil.getRegionCodeForCountryCode(phoneNumberUtil.getCountryCodeForRegion(this.defaultCountry)));
        if (metadataForRegion == null) {
            metadataForRegion = EMPTY_METADATA;
        }
        this.currentMetadata = metadataForRegion;
    }

    public final String inputAccruedNationalNumber() {
        StringBuilder sb = this.nationalNumber;
        int length = sb.length();
        if (length <= 0) {
            return this.prefixBeforeNationalNumber.toString();
        }
        String str = "";
        for (int i = 0; i < length; i++) {
            str = inputDigitHelper(sb.charAt(i));
        }
        return this.ableToFormat ? appendNationalNumber(str) : this.accruedInput.toString();
    }

    public final String inputDigit(char c) {
        StringBuilder sb = this.accruedInput;
        sb.append(c);
        boolean isDigit = Character.isDigit(c);
        StringBuilder sb2 = this.accruedInputWithoutFormatting;
        StringBuilder sb3 = this.nationalNumber;
        if (!isDigit && (sb.length() != 1 || !PhoneNumberUtil.PLUS_CHARS_PATTERN.matcher(Character.toString(c)).matches())) {
            this.ableToFormat = false;
            this.inputHasFormatting = true;
        } else if (c == '+') {
            sb2.append(c);
        } else {
            c = Character.forDigit(Character.digit(c, 10), 10);
            sb2.append(c);
            sb3.append(c);
        }
        boolean z = this.ableToFormat;
        ArrayList arrayList = this.possibleFormats;
        StringBuilder sb4 = this.prefixBeforeNationalNumber;
        if (z) {
            int length = sb2.length();
            if (length == 0 || length == 1 || length == 2) {
                return sb.toString();
            }
            if (length == 3) {
                if (!attemptToExtractIdd()) {
                    this.extractedNationalPrefix = removeNationalPrefixFromNationalNumber();
                    return attemptToChooseFormattingPattern();
                }
                this.isExpectingCountryCallingCode = true;
            }
            if (this.isExpectingCountryCallingCode) {
                if (attemptToExtractCountryCallingCode()) {
                    this.isExpectingCountryCallingCode = false;
                }
                return ((Object) sb4) + sb3.toString();
            }
            if (arrayList.size() <= 0) {
                return attemptToChooseFormattingPattern();
            }
            String inputDigitHelper = inputDigitHelper(c);
            String attemptToFormatAccruedDigits = attemptToFormatAccruedDigits();
            if (attemptToFormatAccruedDigits.length() > 0) {
                return attemptToFormatAccruedDigits;
            }
            narrowDownPossibleFormats(sb3.toString());
            return maybeCreateNewTemplate() ? inputAccruedNationalNumber() : this.ableToFormat ? appendNationalNumber(inputDigitHelper) : sb.toString();
        }
        if (this.inputHasFormatting) {
            return sb.toString();
        }
        boolean attemptToExtractIdd = attemptToExtractIdd();
        StringBuilder sb5 = this.formattingTemplate;
        if (!attemptToExtractIdd) {
            if (this.extractedNationalPrefix.length() > 0) {
                sb3.insert(0, this.extractedNationalPrefix);
                sb4.setLength(sb4.lastIndexOf(this.extractedNationalPrefix));
            }
            if (!this.extractedNationalPrefix.equals(removeNationalPrefixFromNationalNumber())) {
                sb4.append(' ');
                this.ableToFormat = true;
                this.isExpectingCountryCallingCode = false;
                arrayList.clear();
                this.lastMatchPosition = 0;
                sb5.setLength(0);
                this.currentFormattingPattern = "";
                return attemptToChooseFormattingPattern();
            }
        } else if (attemptToExtractCountryCallingCode()) {
            this.ableToFormat = true;
            this.isExpectingCountryCallingCode = false;
            arrayList.clear();
            this.lastMatchPosition = 0;
            sb5.setLength(0);
            this.currentFormattingPattern = "";
            return attemptToChooseFormattingPattern();
        }
        return sb.toString();
    }

    public final String inputDigitHelper(char c) {
        Pattern pattern = DIGIT_PATTERN;
        StringBuilder sb = this.formattingTemplate;
        Matcher matcher = pattern.matcher(sb);
        if (!matcher.find(this.lastMatchPosition)) {
            if (this.possibleFormats.size() == 1) {
                this.ableToFormat = false;
            }
            this.currentFormattingPattern = "";
            return this.accruedInput.toString();
        }
        String replaceFirst = matcher.replaceFirst(Character.toString(c));
        sb.replace(0, replaceFirst.length(), replaceFirst);
        int start = matcher.start();
        this.lastMatchPosition = start;
        return sb.substring(0, start + 1);
    }

    public final boolean maybeCreateNewTemplate() {
        Iterator it = this.possibleFormats.iterator();
        while (it.hasNext()) {
            Phonemetadata$NumberFormat phonemetadata$NumberFormat = (Phonemetadata$NumberFormat) it.next();
            String str = phonemetadata$NumberFormat.pattern_;
            if (this.currentFormattingPattern.equals(str)) {
                return false;
            }
            String str2 = phonemetadata$NumberFormat.pattern_;
            StringBuilder sb = this.formattingTemplate;
            sb.setLength(0);
            String str3 = phonemetadata$NumberFormat.format_;
            Matcher matcher = this.regexCache.getPatternForRegex(str2).matcher("999999999999999");
            matcher.find();
            String group = matcher.group();
            String replaceAll = group.length() < this.nationalNumber.length() ? "" : group.replaceAll(str2, str3).replaceAll("9", "\u2008");
            if (replaceAll.length() > 0) {
                sb.append(replaceAll);
                this.currentFormattingPattern = str;
                this.shouldAddSpaceAfterNationalPrefix = NATIONAL_PREFIX_SEPARATORS_PATTERN.matcher(phonemetadata$NumberFormat.nationalPrefixFormattingRule_).find();
                this.lastMatchPosition = 0;
                return true;
            }
            it.remove();
        }
        this.ableToFormat = false;
        return false;
    }

    public final void narrowDownPossibleFormats(String str) {
        int length = str.length() - 3;
        Iterator it = this.possibleFormats.iterator();
        while (it.hasNext()) {
            Phonemetadata$NumberFormat phonemetadata$NumberFormat = (Phonemetadata$NumberFormat) it.next();
            ArrayList arrayList = phonemetadata$NumberFormat.leadingDigitsPattern_;
            ArrayList arrayList2 = phonemetadata$NumberFormat.leadingDigitsPattern_;
            if (arrayList.size() != 0) {
                if (!this.regexCache.getPatternForRegex((String) arrayList2.get(Math.min(length, arrayList2.size() - 1))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    public final String removeNationalPrefixFromNationalNumber() {
        int i = this.currentMetadata.countryCode_;
        StringBuilder sb = this.prefixBeforeNationalNumber;
        StringBuilder sb2 = this.nationalNumber;
        int i2 = 1;
        if (i != 1 || sb2.charAt(0) != '1' || sb2.charAt(1) == '0' || sb2.charAt(1) == '1') {
            Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata = this.currentMetadata;
            if (phonemetadata$PhoneMetadata.hasNationalPrefixForParsing) {
                Matcher matcher = this.regexCache.getPatternForRegex(phonemetadata$PhoneMetadata.nationalPrefixForParsing_).matcher(sb2);
                if (matcher.lookingAt() && matcher.end() > 0) {
                    this.isCompleteNumber = true;
                    i2 = matcher.end();
                    sb.append(sb2.substring(0, i2));
                }
            }
            i2 = 0;
        } else {
            sb.append('1');
            sb.append(' ');
            this.isCompleteNumber = true;
        }
        String substring = sb2.substring(0, i2);
        sb2.delete(0, i2);
        return substring;
    }
}
