package com.google.i18n.phonenumbers;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.core.SimpleActor;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.util.DBUtil;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.KeysetHandle;
import com.google.i18n.phonenumbers.metadata.DefaultMetadataDependenciesProvider;
import com.google.i18n.phonenumbers.metadata.init.ClassPathResourceMetadataLoader;
import com.squareup.cash.db.WireAdapter;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.internal.Symbol;
import okhttp3.ConnectionPool;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* loaded from: classes.dex */
public final class PhoneNumberUtil {
    public static final Map ALPHA_MAPPINGS;
    public static final Map ALPHA_PHONE_MAPPINGS;
    public static final Pattern CAPTURING_DIGIT_PATTERN;
    public static final Map DIALLABLE_CHAR_MAPPINGS;
    public static final Pattern EXTN_PATTERN;
    public static final Pattern FIRST_GROUP_ONLY_PREFIX_PATTERN;
    public static final Pattern FIRST_GROUP_PATTERN;
    public static final Map MOBILE_TOKEN_MAPPINGS;
    public static final Pattern NON_DIGITS_PATTERN;
    public static final Pattern PLUS_CHARS_PATTERN;
    public static final Pattern RFC3966_DOMAINNAME_PATTERN;
    public static final Pattern RFC3966_GLOBAL_NUMBER_DIGITS_PATTERN;
    public static final Pattern SECOND_NUMBER_START_PATTERN;
    public static final Pattern SEPARATOR_PATTERN;
    public static final Pattern UNWANTED_END_CHAR_PATTERN;
    public static final Pattern VALID_ALPHA_PHONE_PATTERN;
    public static final Pattern VALID_PHONE_NUMBER_PATTERN;
    public static final Pattern VALID_START_CHAR_PATTERN;
    public static PhoneNumberUtil instance;
    public static final Logger logger = Logger.getLogger(PhoneNumberUtil.class.getName());
    public final HashMap countryCallingCodeToRegionCodeMap;
    public final KeysetHandle metadataSource;
    public final WireAdapter matcherApi = new WireAdapter(4);
    public final HashSet nanpaRegions = new HashSet(35);
    public final ConnectionPool regexCache = new ConnectionPool(100);
    public final HashSet supportedRegions = new HashSet(320);
    public final HashSet countryCodesForNonGeographicalRegion = new HashSet();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(54, "9");
        MOBILE_TOKEN_MAPPINGS = Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        Collections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet();
        hashSet3.add(52);
        hashSet3.add(54);
        hashSet3.add(55);
        hashSet3.add(62);
        hashSet3.addAll(hashSet);
        Collections.unmodifiableSet(hashSet3);
        HashMap hashMap2 = new HashMap();
        hashMap2.put('0', '0');
        hashMap2.put('1', '1');
        hashMap2.put('2', '2');
        hashMap2.put('3', '3');
        hashMap2.put('4', '4');
        hashMap2.put('5', '5');
        hashMap2.put('6', '6');
        hashMap2.put('7', '7');
        hashMap2.put('8', '8');
        hashMap2.put('9', '9');
        HashMap hashMap3 = new HashMap(40);
        hashMap3.put('A', '2');
        hashMap3.put('B', '2');
        hashMap3.put('C', '2');
        hashMap3.put('D', '3');
        hashMap3.put('E', '3');
        hashMap3.put('F', '3');
        hashMap3.put('G', '4');
        hashMap3.put('H', '4');
        hashMap3.put('I', '4');
        hashMap3.put('J', '5');
        hashMap3.put('K', '5');
        hashMap3.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_LT), '5');
        hashMap3.put('M', '6');
        hashMap3.put('N', '6');
        hashMap3.put('O', '6');
        hashMap3.put('P', '7');
        hashMap3.put('Q', '7');
        hashMap3.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_REGULAR), '7');
        hashMap3.put('S', '7');
        hashMap3.put('T', '8');
        hashMap3.put(Character.valueOf(Matrix.MATRIX_TYPE_RANDOM_UT), '8');
        hashMap3.put('V', '8');
        hashMap3.put('W', '9');
        hashMap3.put('X', '9');
        hashMap3.put('Y', '9');
        hashMap3.put(Character.valueOf(Matrix.MATRIX_TYPE_ZERO), '9');
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap3);
        ALPHA_MAPPINGS = unmodifiableMap;
        HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(unmodifiableMap);
        hashMap4.putAll(hashMap2);
        ALPHA_PHONE_MAPPINGS = Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.putAll(hashMap2);
        hashMap5.put('+', '+');
        hashMap5.put('*', '*');
        hashMap5.put('#', '#');
        DIALLABLE_CHAR_MAPPINGS = Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        for (Character ch : unmodifiableMap.keySet()) {
            hashMap6.put(Character.valueOf(Character.toLowerCase(ch.charValue())), ch);
            hashMap6.put(ch, ch);
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put('-', '-');
        hashMap6.put((char) 65293, '-');
        hashMap6.put((char) 8208, '-');
        hashMap6.put((char) 8209, '-');
        hashMap6.put((char) 8210, '-');
        hashMap6.put((char) 8211, '-');
        hashMap6.put((char) 8212, '-');
        hashMap6.put((char) 8213, '-');
        hashMap6.put((char) 8722, '-');
        hashMap6.put('/', '/');
        hashMap6.put((char) 65295, '/');
        hashMap6.put(' ', ' ');
        hashMap6.put((char) 12288, ' ');
        hashMap6.put((char) 8288, ' ');
        hashMap6.put('.', '.');
        hashMap6.put((char) 65294, '.');
        Collections.unmodifiableMap(hashMap6);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder sb = new StringBuilder();
        Map map = ALPHA_MAPPINGS;
        sb.append(Arrays.toString(map.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(map.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String sb2 = sb.toString();
        PLUS_CHARS_PATTERN = Pattern.compile("[+＋]+");
        SEPARATOR_PATTERN = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        CAPTURING_DIGIT_PATTERN = Pattern.compile("(\\p{Nd})");
        VALID_START_CHAR_PATTERN = Pattern.compile("[+＋\\p{Nd}]");
        SECOND_NUMBER_START_PATTERN = Pattern.compile("[\\\\/] *x");
        UNWANTED_END_CHAR_PATTERN = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        VALID_ALPHA_PHONE_PATTERN = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*", sb2, "\\p{Nd}]*");
        String createExtnPattern = createExtnPattern(true);
        createExtnPattern(false);
        RFC3966_GLOBAL_NUMBER_DIGITS_PATTERN = Pattern.compile("^\\+(\\p{Nd}|[\\-\\.\\(\\)]?)*\\p{Nd}(\\p{Nd}|[\\-\\.\\(\\)]?)*$");
        String concat = sb2.concat("\\p{Nd}");
        RFC3966_DOMAINNAME_PATTERN = Pattern.compile("^(" + Boxes$$ExternalSyntheticOutline1.m("[", concat, "]+((\\-)*[", concat, "])*") + "\\.)*" + Boxes$$ExternalSyntheticOutline1.m("[", sb2, "]+((\\-)*[", concat, "])*") + "\\.?$");
        StringBuilder sb3 = new StringBuilder("(?:");
        sb3.append(createExtnPattern);
        sb3.append(")$");
        EXTN_PATTERN = Pattern.compile(sb3.toString(), 66);
        VALID_PHONE_NUMBER_PATTERN = Pattern.compile(m + "(?:" + createExtnPattern + ")?", 66);
        NON_DIGITS_PATTERN = Pattern.compile("(\\D+)");
        FIRST_GROUP_PATTERN = Pattern.compile("(\\$\\d)");
        FIRST_GROUP_ONLY_PREFIX_PATTERN = Pattern.compile("\\(?\\$1\\)?");
        instance = null;
    }

    public PhoneNumberUtil(KeysetHandle keysetHandle, HashMap hashMap) {
        this.metadataSource = keysetHandle;
        this.countryCallingCodeToRegionCodeMap = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.countryCodesForNonGeographicalRegion.add((Integer) entry.getKey());
            } else {
                this.supportedRegions.addAll(list);
            }
        }
        if (this.supportedRegions.remove("001")) {
            logger.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.nanpaRegions.addAll((Collection) hashMap.get(1));
    }

    public static String createExtnPattern(boolean z) {
        String concat = ";ext=".concat(extnDigits(20));
        String str = "[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + extnDigits(20) + "#?";
        String str2 = "[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + extnDigits(9) + "#?";
        String str3 = "[- ]+" + extnDigits(6) + "#";
        StringBuilder sb = new StringBuilder();
        sb.append(concat);
        sb.append("|");
        sb.append(str);
        sb.append("|");
        sb.append(str2);
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, "|", str3);
        if (!z) {
            return m;
        }
        return Boxes$$ExternalSyntheticOutline1.m$1(m, "|", "[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + extnDigits(15) + "#?", "|", "[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + extnDigits(9) + "#?");
    }

    public static String extnDigits(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "(\\p{Nd}{1,", "})");
    }

    public static synchronized PhoneNumberUtil getInstance() {
        PhoneNumberUtil phoneNumberUtil;
        synchronized (PhoneNumberUtil.class) {
            try {
                if (instance == null) {
                    DefaultMetadataDependenciesProvider defaultMetadataDependenciesProvider = DefaultMetadataDependenciesProvider.INSTANCE;
                    ClassPathResourceMetadataLoader classPathResourceMetadataLoader = defaultMetadataDependenciesProvider.metadataLoader;
                    if (classPathResourceMetadataLoader == null) {
                        throw new IllegalArgumentException("metadataLoader could not be null.");
                    }
                    PhoneNumberUtil phoneNumberUtil2 = new PhoneNumberUtil(new KeysetHandle(defaultMetadataDependenciesProvider.phoneNumberMetadataFileNameProvider, classPathResourceMetadataLoader, defaultMetadataDependenciesProvider.metadataParser), DBUtil.getCountryCodeToRegionCodeMap());
                    synchronized (PhoneNumberUtil.class) {
                        instance = phoneNumberUtil2;
                    }
                }
                phoneNumberUtil = instance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return phoneNumberUtil;
    }

    public static String getNationalSignificantNumber(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        int i;
        StringBuilder sb = new StringBuilder();
        if (phonenumber$PhoneNumber.italianLeadingZero_ && (i = phonenumber$PhoneNumber.numberOfLeadingZeros_) > 0) {
            char[] cArr = new char[i];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(phonenumber$PhoneNumber.nationalNumber_);
        return sb.toString();
    }

    public static Phonemetadata$PhoneNumberDesc getNumberDescByType(Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, int i) {
        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i)) {
            case 0:
            case 2:
                return phonemetadata$PhoneMetadata.fixedLine_;
            case 1:
                return phonemetadata$PhoneMetadata.mobile_;
            case 3:
                return phonemetadata$PhoneMetadata.tollFree_;
            case 4:
                return phonemetadata$PhoneMetadata.premiumRate_;
            case 5:
                return phonemetadata$PhoneMetadata.sharedCost_;
            case 6:
                return phonemetadata$PhoneMetadata.voip_;
            case 7:
                return phonemetadata$PhoneMetadata.personalNumber_;
            case 8:
                return phonemetadata$PhoneMetadata.pager_;
            case 9:
                return phonemetadata$PhoneMetadata.uan_;
            case 10:
                return phonemetadata$PhoneMetadata.voicemail_;
            default:
                return phonemetadata$PhoneMetadata.generalDesc_;
        }
    }

    public static void normalize(StringBuilder sb) {
        if (VALID_ALPHA_PHONE_PATTERN.matcher(sb).matches()) {
            sb.replace(0, sb.length(), normalizeHelper(sb, ALPHA_PHONE_MAPPINGS));
        } else {
            sb.replace(0, sb.length(), normalizeDigitsOnly(sb));
        }
    }

    public static String normalizeDigitsOnly(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            int digit = Character.digit(charSequence.charAt(i), 10);
            if (digit != -1) {
                sb.append(digit);
            }
        }
        return sb.toString();
    }

    public static String normalizeHelper(CharSequence charSequence, Map map) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(charSequence.charAt(i))));
            if (ch != null) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void prefixNumberWithCountryCallingCode(StringBuilder sb, int i, int i2) {
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i2);
        if (ordinal == 0) {
            sb.insert(0, i).insert(0, '+');
        } else if (ordinal == 1) {
            sb.insert(0, " ").insert(0, i).insert(0, '+');
        } else {
            if (ordinal != 3) {
                return;
            }
            sb.insert(0, "-").insert(0, i).insert(0, '+').insert(0, "tel:");
        }
    }

    public static int testNumberLength(CharSequence charSequence, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, int i) {
        Phonemetadata$PhoneNumberDesc numberDescByType = getNumberDescByType(phonemetadata$PhoneMetadata, i);
        ArrayList arrayList = numberDescByType.possibleLength_.isEmpty() ? phonemetadata$PhoneMetadata.generalDesc_.possibleLength_ : numberDescByType.possibleLength_;
        ArrayList arrayList2 = numberDescByType.possibleLengthLocalOnly_;
        if (i == 3) {
            Phonemetadata$PhoneNumberDesc numberDescByType2 = getNumberDescByType(phonemetadata$PhoneMetadata, 1);
            if (numberDescByType2.possibleLength_.size() == 1 && ((Integer) numberDescByType2.possibleLength_.get(0)).intValue() == -1) {
                return testNumberLength(charSequence, phonemetadata$PhoneMetadata, 2);
            }
            Phonemetadata$PhoneNumberDesc numberDescByType3 = getNumberDescByType(phonemetadata$PhoneMetadata, 2);
            ArrayList arrayList3 = numberDescByType3.possibleLength_;
            ArrayList arrayList4 = numberDescByType3.possibleLength_;
            boolean z = (arrayList3.size() == 1 && ((Integer) arrayList4.get(0)).intValue() == -1) ? false : true;
            ArrayList arrayList5 = numberDescByType3.possibleLengthLocalOnly_;
            if (z) {
                ArrayList arrayList6 = new ArrayList(arrayList);
                if (arrayList4.size() == 0) {
                    arrayList4 = phonemetadata$PhoneMetadata.generalDesc_.possibleLength_;
                }
                arrayList6.addAll(arrayList4);
                Collections.sort(arrayList6);
                if (arrayList2.isEmpty()) {
                    arrayList2 = arrayList5;
                } else {
                    ArrayList arrayList7 = new ArrayList(arrayList2);
                    arrayList7.addAll(arrayList5);
                    Collections.sort(arrayList7);
                    arrayList2 = arrayList7;
                }
                arrayList = arrayList6;
            }
        }
        if (((Integer) arrayList.get(0)).intValue() == -1) {
            return 5;
        }
        int length = charSequence.length();
        if (arrayList2.contains(Integer.valueOf(length))) {
            return 2;
        }
        int intValue = ((Integer) arrayList.get(0)).intValue();
        if (intValue != length) {
            if (intValue > length) {
                return 4;
            }
            if (((Integer) arrayList.get(arrayList.size() - 1)).intValue() < length) {
                return 6;
            }
            if (!arrayList.subList(1, arrayList.size()).contains(Integer.valueOf(length))) {
                return 5;
            }
        }
        return 1;
    }

    public final int extractCountryCode(StringBuilder sb, StringBuilder sb2) {
        if (sb.length() != 0 && sb.charAt(0) != '0') {
            int length = sb.length();
            for (int i = 1; i <= 3 && i <= length; i++) {
                int parseInt = Integer.parseInt(sb.substring(0, i));
                if (this.countryCallingCodeToRegionCodeMap.containsKey(Integer.valueOf(parseInt))) {
                    sb2.append(sb.substring(i));
                    return parseInt;
                }
            }
        }
        return 0;
    }

    public final String format(Phonenumber$PhoneNumber phonenumber$PhoneNumber, int i) {
        ConnectionPool connectionPool;
        Phonemetadata$NumberFormat phonemetadata$NumberFormat;
        if (phonenumber$PhoneNumber.nationalNumber_ == 0) {
            String str = phonenumber$PhoneNumber.rawInput_;
            if (str.length() > 0 || !phonenumber$PhoneNumber.hasCountryCode) {
                return str;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        sb.setLength(0);
        int i2 = phonenumber$PhoneNumber.countryCode_;
        String nationalSignificantNumber = getNationalSignificantNumber(phonenumber$PhoneNumber);
        if (i == 1) {
            sb.append(nationalSignificantNumber);
            prefixNumberWithCountryCallingCode(sb, i2, 1);
        } else if (this.countryCallingCodeToRegionCodeMap.containsKey(Integer.valueOf(i2))) {
            Phonemetadata$PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(i2, getRegionCodeForCountryCode(i2));
            Iterator it = ((metadataForRegionOrCallingCode.intlNumberFormat_.size() == 0 || i == 3) ? metadataForRegionOrCallingCode.numberFormat_ : metadataForRegionOrCallingCode.intlNumberFormat_).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                connectionPool = this.regexCache;
                if (!hasNext) {
                    phonemetadata$NumberFormat = null;
                    break;
                }
                phonemetadata$NumberFormat = (Phonemetadata$NumberFormat) it.next();
                int size = phonemetadata$NumberFormat.leadingDigitsPattern_.size();
                if (size != 0) {
                    if (!connectionPool.getPatternForRegex((String) phonemetadata$NumberFormat.leadingDigitsPattern_.get(size - 1)).matcher(nationalSignificantNumber).lookingAt()) {
                        continue;
                    }
                }
                if (connectionPool.getPatternForRegex(phonemetadata$NumberFormat.pattern_).matcher(nationalSignificantNumber).matches()) {
                    break;
                }
            }
            if (phonemetadata$NumberFormat != null) {
                String str2 = phonemetadata$NumberFormat.format_;
                Matcher matcher = connectionPool.getPatternForRegex(phonemetadata$NumberFormat.pattern_).matcher(nationalSignificantNumber);
                String str3 = phonemetadata$NumberFormat.nationalPrefixFormattingRule_;
                nationalSignificantNumber = (i != 3 || str3 == null || str3.length() <= 0) ? matcher.replaceAll(str2) : matcher.replaceAll(FIRST_GROUP_PATTERN.matcher(str2).replaceFirst(str3));
                if (i == 4) {
                    Matcher matcher2 = SEPARATOR_PATTERN.matcher(nationalSignificantNumber);
                    if (matcher2.lookingAt()) {
                        nationalSignificantNumber = matcher2.replaceFirst("");
                    }
                    nationalSignificantNumber = matcher2.reset(nationalSignificantNumber).replaceAll("-");
                }
            }
            sb.append(nationalSignificantNumber);
            if (phonenumber$PhoneNumber.hasExtension && phonenumber$PhoneNumber.extension_.length() > 0) {
                if (i == 4) {
                    sb.append(";ext=");
                    sb.append(phonenumber$PhoneNumber.extension_);
                } else if (metadataForRegionOrCallingCode.hasPreferredExtnPrefix) {
                    sb.append(metadataForRegionOrCallingCode.preferredExtnPrefix_);
                    sb.append(phonenumber$PhoneNumber.extension_);
                } else {
                    sb.append(" ext. ");
                    sb.append(phonenumber$PhoneNumber.extension_);
                }
            }
            prefixNumberWithCountryCallingCode(sb, i2, i);
        } else {
            sb.append(nationalSignificantNumber);
        }
        return sb.toString();
    }

    public final int getCountryCodeForRegion(String str) {
        if (str != null && this.supportedRegions.contains(str)) {
            Phonemetadata$PhoneMetadata metadataForRegion = getMetadataForRegion(str);
            if (metadataForRegion != null) {
                return metadataForRegion.countryCode_;
            }
            a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Invalid region code: ", str));
            return 0;
        }
        Level level = Level.WARNING;
        StringBuilder sb = new StringBuilder("Invalid or missing region code (");
        if (str == null) {
            str = "null";
        }
        sb.append(str);
        sb.append(") provided.");
        logger.log(level, sb.toString());
        return 0;
    }

    public final int getLengthOfNationalDestinationCode(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        Phonenumber$PhoneNumber phonenumber$PhoneNumber2;
        boolean z = phonenumber$PhoneNumber.hasExtension;
        if (z) {
            phonenumber$PhoneNumber2 = new Phonenumber$PhoneNumber();
            if (phonenumber$PhoneNumber.hasCountryCode) {
                int i = phonenumber$PhoneNumber.countryCode_;
                phonenumber$PhoneNumber2.hasCountryCode = true;
                phonenumber$PhoneNumber2.countryCode_ = i;
            }
            if (phonenumber$PhoneNumber.hasNationalNumber) {
                long j = phonenumber$PhoneNumber.nationalNumber_;
                phonenumber$PhoneNumber2.hasNationalNumber = true;
                phonenumber$PhoneNumber2.nationalNumber_ = j;
            }
            if (z) {
                String str = phonenumber$PhoneNumber.extension_;
                phonenumber$PhoneNumber2.hasExtension = true;
                phonenumber$PhoneNumber2.extension_ = str;
            }
            if (phonenumber$PhoneNumber.hasItalianLeadingZero) {
                boolean z2 = phonenumber$PhoneNumber.italianLeadingZero_;
                phonenumber$PhoneNumber2.hasItalianLeadingZero = true;
                phonenumber$PhoneNumber2.italianLeadingZero_ = z2;
            }
            if (phonenumber$PhoneNumber.hasNumberOfLeadingZeros) {
                int i2 = phonenumber$PhoneNumber.numberOfLeadingZeros_;
                phonenumber$PhoneNumber2.hasNumberOfLeadingZeros = true;
                phonenumber$PhoneNumber2.numberOfLeadingZeros_ = i2;
            }
            if (phonenumber$PhoneNumber.hasRawInput) {
                String str2 = phonenumber$PhoneNumber.rawInput_;
                phonenumber$PhoneNumber2.hasRawInput = true;
                phonenumber$PhoneNumber2.rawInput_ = str2;
            }
            if (phonenumber$PhoneNumber.hasCountryCodeSource) {
                int i3 = phonenumber$PhoneNumber.countryCodeSource_;
                CameraSelector$$ExternalSyntheticOutline0.checkNotZero(i3);
                phonenumber$PhoneNumber2.hasCountryCodeSource = true;
                phonenumber$PhoneNumber2.countryCodeSource_ = i3;
            }
            if (phonenumber$PhoneNumber.hasPreferredDomesticCarrierCode) {
                String str3 = phonenumber$PhoneNumber.preferredDomesticCarrierCode_;
                phonenumber$PhoneNumber2.hasPreferredDomesticCarrierCode = true;
                phonenumber$PhoneNumber2.preferredDomesticCarrierCode_ = str3;
            }
            phonenumber$PhoneNumber2.hasExtension = false;
            phonenumber$PhoneNumber2.extension_ = "";
        } else {
            phonenumber$PhoneNumber2 = phonenumber$PhoneNumber;
        }
        String[] split = NON_DIGITS_PATTERN.split(format(phonenumber$PhoneNumber2, 2));
        if (split.length <= 3) {
            return 0;
        }
        Phonemetadata$PhoneMetadata metadataForRegionOrCallingCode = getMetadataForRegionOrCallingCode(phonenumber$PhoneNumber.countryCode_, getRegionCodeForNumber(phonenumber$PhoneNumber));
        if ((metadataForRegionOrCallingCode == null ? 12 : getNumberTypeHelper(getNationalSignificantNumber(phonenumber$PhoneNumber), metadataForRegionOrCallingCode)) == 2) {
            int i4 = phonenumber$PhoneNumber.countryCode_;
            Integer valueOf = Integer.valueOf(i4);
            Map map = MOBILE_TOKEN_MAPPINGS;
            if (!(map.containsKey(valueOf) ? (String) map.get(Integer.valueOf(i4)) : "").equals("")) {
                return split[3].length() + split[2].length();
            }
        }
        return split[2].length();
    }

    public final Phonemetadata$PhoneMetadata getMetadataForNonGeographicalRegion(int i) {
        if (!this.countryCodesForNonGeographicalRegion.contains(Integer.valueOf(i))) {
            return null;
        }
        KeysetHandle keysetHandle = this.metadataSource;
        keysetHandle.getClass();
        List list = (List) DBUtil.getCountryCodeToRegionCodeMap().get(Integer.valueOf(i));
        if (list != null && !list.contains("001")) {
            a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(i, " calling code belongs to a geo entity"));
            return null;
        }
        KeysetHandle keysetHandle2 = (KeysetHandle) ((SimpleActor) keysetHandle.annotationsMap).getOrBootstrap(((Symbol) keysetHandle.entries).getFor(Integer.valueOf(i))).entries;
        Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata = (Phonemetadata$PhoneMetadata) ((ConcurrentHashMap) keysetHandle2.entries).get(Integer.valueOf(i));
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Missing metadata for country code ");
        if (phonemetadata$PhoneMetadata != null) {
            return phonemetadata$PhoneMetadata;
        }
        throw new MissingMetadataException(m);
    }

    public final Phonemetadata$PhoneMetadata getMetadataForRegion(String str) {
        if (str != null && this.supportedRegions.contains(str)) {
            KeysetHandle keysetHandle = this.metadataSource;
            keysetHandle.getClass();
            if (!str.equals("001")) {
                Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata = (Phonemetadata$PhoneMetadata) ((ConcurrentHashMap) ((KeysetHandle) ((SimpleActor) keysetHandle.annotationsMap).getOrBootstrap(((Symbol) keysetHandle.entries).getFor(str)).annotationsMap).entries).get(str);
                String concat = "Missing metadata for region code ".concat(str);
                if (phonemetadata$PhoneMetadata != null) {
                    return phonemetadata$PhoneMetadata;
                }
                throw new MissingMetadataException(concat);
            }
            a$$ExternalSyntheticBUOutline0.m$3(str.concat(" region code is a non-geo entity"));
        }
        return null;
    }

    public final Phonemetadata$PhoneMetadata getMetadataForRegionOrCallingCode(int i, String str) {
        return "001".equals(str) ? getMetadataForNonGeographicalRegion(i) : getMetadataForRegion(str);
    }

    public final int getNumberTypeHelper(String str, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata) {
        if (!isNumberMatchingDesc(str, phonemetadata$PhoneMetadata.generalDesc_)) {
            return 12;
        }
        if (isNumberMatchingDesc(str, phonemetadata$PhoneMetadata.premiumRate_)) {
            return 5;
        }
        if (isNumberMatchingDesc(str, phonemetadata$PhoneMetadata.tollFree_)) {
            return 4;
        }
        if (isNumberMatchingDesc(str, phonemetadata$PhoneMetadata.sharedCost_)) {
            return 6;
        }
        if (isNumberMatchingDesc(str, phonemetadata$PhoneMetadata.voip_)) {
            return 7;
        }
        if (isNumberMatchingDesc(str, phonemetadata$PhoneMetadata.personalNumber_)) {
            return 8;
        }
        if (isNumberMatchingDesc(str, phonemetadata$PhoneMetadata.pager_)) {
            return 9;
        }
        if (isNumberMatchingDesc(str, phonemetadata$PhoneMetadata.uan_)) {
            return 10;
        }
        if (isNumberMatchingDesc(str, phonemetadata$PhoneMetadata.voicemail_)) {
            return 11;
        }
        boolean isNumberMatchingDesc = isNumberMatchingDesc(str, phonemetadata$PhoneMetadata.fixedLine_);
        boolean z = phonemetadata$PhoneMetadata.sameMobileAndFixedLinePattern_;
        return isNumberMatchingDesc ? (z || isNumberMatchingDesc(str, phonemetadata$PhoneMetadata.mobile_)) ? 3 : 1 : (z || !isNumberMatchingDesc(str, phonemetadata$PhoneMetadata.mobile_)) ? 12 : 2;
    }

    public final String getRegionCodeForCountryCode(int i) {
        List list = (List) this.countryCallingCodeToRegionCodeMap.get(Integer.valueOf(i));
        return list == null ? "ZZ" : (String) list.get(0);
    }

    public final String getRegionCodeForNumber(Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        int i = phonenumber$PhoneNumber.countryCode_;
        List<String> list = (List) this.countryCallingCodeToRegionCodeMap.get(Integer.valueOf(i));
        if (list == null) {
            logger.log(Level.INFO, "Missing/invalid country_code (" + i + ")");
            return null;
        }
        if (list.size() == 1) {
            return (String) list.get(0);
        }
        String nationalSignificantNumber = getNationalSignificantNumber(phonenumber$PhoneNumber);
        for (String str : list) {
            Phonemetadata$PhoneMetadata metadataForRegion = getMetadataForRegion(str);
            if (metadataForRegion.hasLeadingDigits) {
                if (this.regexCache.getPatternForRegex(metadataForRegion.leadingDigits_).matcher(nationalSignificantNumber).lookingAt()) {
                    return str;
                }
            } else if (getNumberTypeHelper(nationalSignificantNumber, metadataForRegion) != 12) {
                return str;
            }
        }
        return null;
    }

    public final boolean isNumberMatchingDesc(String str, Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc) {
        int length = str.length();
        ArrayList arrayList = phonemetadata$PhoneNumberDesc.possibleLength_;
        if (arrayList.size() <= 0 || arrayList.contains(Integer.valueOf(length))) {
            return this.matcherApi.matchNationalNumber(str, phonemetadata$PhoneNumberDesc);
        }
        return false;
    }

    public final int maybeExtractCountryCode(CharSequence charSequence, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, StringBuilder sb, Phonenumber$PhoneNumber phonenumber$PhoneNumber) {
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        String str = phonemetadata$PhoneMetadata != null ? phonemetadata$PhoneMetadata.internationalPrefix_ : "NonMatch";
        if (sb2.length() != 0) {
            Matcher matcher = PLUS_CHARS_PATTERN.matcher(sb2);
            if (matcher.lookingAt()) {
                sb2.delete(0, matcher.end());
                normalize(sb2);
            } else {
                Pattern patternForRegex = this.regexCache.getPatternForRegex(str);
                normalize(sb2);
                Matcher matcher2 = patternForRegex.matcher(sb2);
                if (matcher2.lookingAt()) {
                    int end = matcher2.end();
                    Matcher matcher3 = CAPTURING_DIGIT_PATTERN.matcher(sb2.substring(end));
                    if (!matcher3.find() || !normalizeDigitsOnly(matcher3.group(1)).equals("0")) {
                        sb2.delete(0, end);
                    }
                }
            }
            if (sb2.length() <= 2) {
                throw new NumberParseException(3, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
            }
            int extractCountryCode = extractCountryCode(sb2, sb);
            if (extractCountryCode == 0) {
                throw new NumberParseException(1, "Country calling code supplied was not recognised.");
            }
            phonenumber$PhoneNumber.hasCountryCode = true;
            phonenumber$PhoneNumber.countryCode_ = extractCountryCode;
            return extractCountryCode;
        }
        if (phonemetadata$PhoneMetadata != null) {
            int i = phonemetadata$PhoneMetadata.countryCode_;
            String valueOf = String.valueOf(i);
            String sb3 = sb2.toString();
            if (sb3.startsWith(valueOf)) {
                StringBuilder sb4 = new StringBuilder(sb3.substring(valueOf.length()));
                Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc = phonemetadata$PhoneMetadata.generalDesc_;
                maybeStripNationalPrefixAndCarrierCode(sb4, phonemetadata$PhoneMetadata, null);
                WireAdapter wireAdapter = this.matcherApi;
                if ((!wireAdapter.matchNationalNumber(sb2, phonemetadata$PhoneNumberDesc) && wireAdapter.matchNationalNumber(sb4, phonemetadata$PhoneNumberDesc)) || testNumberLength(sb2, phonemetadata$PhoneMetadata, 12) == 6) {
                    sb.append((CharSequence) sb4);
                    phonenumber$PhoneNumber.hasCountryCode = true;
                    phonenumber$PhoneNumber.countryCode_ = i;
                    return i;
                }
            }
        }
        phonenumber$PhoneNumber.hasCountryCode = true;
        phonenumber$PhoneNumber.countryCode_ = 0;
        return 0;
    }

    public final void maybeStripNationalPrefixAndCarrierCode(StringBuilder sb, Phonemetadata$PhoneMetadata phonemetadata$PhoneMetadata, StringBuilder sb2) {
        int length = sb.length();
        String str = phonemetadata$PhoneMetadata.nationalPrefixForParsing_;
        if (length == 0 || str.length() == 0) {
            return;
        }
        Matcher matcher = this.regexCache.getPatternForRegex(str).matcher(sb);
        if (matcher.lookingAt()) {
            Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc = phonemetadata$PhoneMetadata.generalDesc_;
            WireAdapter wireAdapter = this.matcherApi;
            boolean matchNationalNumber = wireAdapter.matchNationalNumber(sb, phonemetadata$PhoneNumberDesc);
            int groupCount = matcher.groupCount();
            String str2 = phonemetadata$PhoneMetadata.nationalPrefixTransformRule_;
            if (str2 == null || str2.length() == 0 || matcher.group(groupCount) == null) {
                if (!matchNationalNumber || wireAdapter.matchNationalNumber(sb.substring(matcher.end()), phonemetadata$PhoneNumberDesc)) {
                    if (sb2 != null && groupCount > 0 && matcher.group(groupCount) != null) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return;
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder(sb);
            sb3.replace(0, length, matcher.replaceFirst(str2));
            if (!matchNationalNumber || wireAdapter.matchNationalNumber(sb3.toString(), phonemetadata$PhoneNumberDesc)) {
                if (sb2 != null && groupCount > 1) {
                    sb2.append(matcher.group(1));
                }
                sb.replace(0, sb.length(), sb3.toString());
            }
        }
    }

    public final Phonenumber$PhoneNumber parse(String str, String str2) {
        String substring;
        CharSequence charSequence;
        int maybeExtractCountryCode;
        Phonenumber$PhoneNumber phonenumber$PhoneNumber = new Phonenumber$PhoneNumber();
        if (str == null) {
            throw new NumberParseException(2, "The phone number supplied was null.");
        }
        if (str.length() > 250) {
            throw new NumberParseException(5, "The string supplied was too long to parse.");
        }
        StringBuilder sb = new StringBuilder();
        String str3 = str.toString();
        int indexOf = str3.indexOf(";phone-context=");
        String str4 = "";
        if (indexOf == -1) {
            substring = null;
        } else {
            int i = indexOf + 15;
            if (i >= str3.length()) {
                substring = "";
            } else {
                int indexOf2 = str3.indexOf(59, i);
                substring = indexOf2 != -1 ? str3.substring(i, indexOf2) : str3.substring(i);
            }
        }
        if (substring != null && (substring.length() == 0 || !(RFC3966_GLOBAL_NUMBER_DIGITS_PATTERN.matcher(substring).matches() || RFC3966_DOMAINNAME_PATTERN.matcher(substring).matches()))) {
            throw new NumberParseException(2, "The phone-context value is invalid.");
        }
        if (substring != null) {
            if (substring.charAt(0) == '+') {
                sb.append(substring);
            }
            int indexOf3 = str3.indexOf("tel:");
            sb.append(str3.substring(indexOf3 >= 0 ? indexOf3 + 4 : 0, indexOf));
        } else {
            Matcher matcher = VALID_START_CHAR_PATTERN.matcher(str3);
            if (matcher.find()) {
                charSequence = str3.subSequence(matcher.start(), str3.length());
                Matcher matcher2 = UNWANTED_END_CHAR_PATTERN.matcher(charSequence);
                if (matcher2.find()) {
                    charSequence = charSequence.subSequence(0, matcher2.start());
                }
                Matcher matcher3 = SECOND_NUMBER_START_PATTERN.matcher(charSequence);
                if (matcher3.find()) {
                    charSequence = charSequence.subSequence(0, matcher3.start());
                }
            } else {
                charSequence = "";
            }
            sb.append(charSequence);
        }
        int indexOf4 = sb.indexOf(";isub=");
        if (indexOf4 > 0) {
            sb.delete(indexOf4, sb.length());
        }
        int length = sb.length();
        Pattern pattern = VALID_PHONE_NUMBER_PATTERN;
        if (!(length < 2 ? false : pattern.matcher(sb).matches())) {
            throw new NumberParseException(2, "The string supplied did not seem to be a phone number.");
        }
        Pattern pattern2 = PLUS_CHARS_PATTERN;
        if ((str2 == null || !this.supportedRegions.contains(str2)) && (sb.length() == 0 || !pattern2.matcher(sb).lookingAt())) {
            throw new NumberParseException(1, "Missing or invalid default region.");
        }
        Matcher matcher4 = EXTN_PATTERN.matcher(sb);
        if (matcher4.find()) {
            String substring2 = sb.substring(0, matcher4.start());
            if (substring2.length() < 2 ? false : pattern.matcher(substring2).matches()) {
                int groupCount = matcher4.groupCount();
                int i2 = 1;
                while (true) {
                    if (i2 > groupCount) {
                        break;
                    }
                    if (matcher4.group(i2) != null) {
                        str4 = matcher4.group(i2);
                        sb.delete(matcher4.start(), sb.length());
                        break;
                    }
                    i2++;
                }
            }
        }
        if (str4.length() > 0) {
            phonenumber$PhoneNumber.hasExtension = true;
            phonenumber$PhoneNumber.extension_ = str4;
        }
        Phonemetadata$PhoneMetadata metadataForRegion = getMetadataForRegion(str2);
        StringBuilder sb2 = new StringBuilder();
        try {
            maybeExtractCountryCode = maybeExtractCountryCode(sb, metadataForRegion, sb2, phonenumber$PhoneNumber);
        } catch (NumberParseException e) {
            Matcher matcher5 = pattern2.matcher(sb);
            int i3 = e.errorType;
            if (i3 != 1 || !matcher5.lookingAt()) {
                throw new NumberParseException(i3, e.getMessage());
            }
            maybeExtractCountryCode = maybeExtractCountryCode(sb.substring(matcher5.end()), metadataForRegion, sb2, phonenumber$PhoneNumber);
            if (maybeExtractCountryCode == 0) {
                throw new NumberParseException(1, "Could not interpret numbers after plus-sign.");
            }
        }
        if (maybeExtractCountryCode != 0) {
            String regionCodeForCountryCode = getRegionCodeForCountryCode(maybeExtractCountryCode);
            if (!regionCodeForCountryCode.equals(str2)) {
                metadataForRegion = getMetadataForRegionOrCallingCode(maybeExtractCountryCode, regionCodeForCountryCode);
            }
        } else {
            normalize(sb);
            sb2.append((CharSequence) sb);
            if (str2 != null) {
                int i4 = metadataForRegion.countryCode_;
                phonenumber$PhoneNumber.hasCountryCode = true;
                phonenumber$PhoneNumber.countryCode_ = i4;
            }
        }
        if (sb2.length() < 2) {
            throw new NumberParseException(4, "The string supplied is too short to be a phone number.");
        }
        if (metadataForRegion != null) {
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder(sb2);
            maybeStripNationalPrefixAndCarrierCode(sb4, metadataForRegion, sb3);
            int testNumberLength = testNumberLength(sb4, metadataForRegion, 12);
            if (testNumberLength != 4 && testNumberLength != 2 && testNumberLength != 5) {
                sb2 = sb4;
            }
        }
        int length2 = sb2.length();
        if (length2 < 2) {
            throw new NumberParseException(4, "The string supplied is too short to be a phone number.");
        }
        if (length2 > 17) {
            throw new NumberParseException(5, "The string supplied is too long to be a phone number.");
        }
        if (sb2.length() > 1 && sb2.charAt(0) == '0') {
            phonenumber$PhoneNumber.hasItalianLeadingZero = true;
            phonenumber$PhoneNumber.italianLeadingZero_ = true;
            int i5 = 1;
            while (i5 < sb2.length() - 1 && sb2.charAt(i5) == '0') {
                i5++;
            }
            if (i5 != 1) {
                phonenumber$PhoneNumber.hasNumberOfLeadingZeros = true;
                phonenumber$PhoneNumber.numberOfLeadingZeros_ = i5;
            }
        }
        long parseLong = Long.parseLong(sb2.toString());
        phonenumber$PhoneNumber.hasNationalNumber = true;
        phonenumber$PhoneNumber.nationalNumber_ = parseLong;
        return phonenumber$PhoneNumber;
    }
}
