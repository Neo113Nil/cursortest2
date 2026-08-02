package com.squareup.cash.db.contacts;

import java.text.Collator;
import java.text.Normalizer;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class RecipientComparator implements Comparable {
    public final List emailAddresses;
    public final String[] fullNameTokens;
    public final Recipient recipient;
    public final List smsNumbers;

    public RecipientComparator(Recipient recipient) {
        String[] strArr;
        List split$default;
        List split$default2;
        this.recipient = recipient;
        String str = recipient.fullName;
        if (str != null) {
            Regex regex = RecipientNameNormalizer.DIACRITICS_STRIPPING_REGEX;
            String normalize = Normalizer.normalize(str, Normalizer.Form.NFD);
            normalize.getClass();
            Locale locale = Locale.getDefault();
            locale.getClass();
            String lowerCase = normalize.toLowerCase(locale);
            lowerCase.getClass();
            strArr = RecipientTokenizer.tokenizeUniqueName(RecipientNameNormalizer.DIACRITICS_STRIPPING_REGEX.replace(lowerCase, ""));
        } else {
            strArr = null;
        }
        this.fullNameTokens = strArr;
        String str2 = recipient.emailAddresses;
        this.emailAddresses = (str2 == null || (split$default2 = StringsKt.split$default(str2, new char[]{','}, 6)) == null) ? EmptyList.INSTANCE : split$default2;
        String str3 = recipient.smsNumbers;
        this.smsNumbers = (str3 == null || (split$default = StringsKt.split$default(str3, new char[]{','}, 6)) == null) ? EmptyList.INSTANCE : split$default;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Recipient recipient) {
        recipient.getClass();
        String str = recipient.displayName;
        String str2 = this.recipient.displayName;
        if (str2 == null && str == null) {
            return 0;
        }
        if (str2 == null) {
            return 1;
        }
        if (str == null) {
            return -1;
        }
        return Collator.getInstance(Locale.US).compare(str2, str);
    }
}
