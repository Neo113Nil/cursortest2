package com.google.android.datatransport.cct;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.datatransport.Encoding;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class CCTDestination {
    public static final String DEFAULT_END_POINT;
    public static final CCTDestination INSTANCE;
    public static final CCTDestination LEGACY_INSTANCE;
    public static final Set SUPPORTED_ENCODINGS;
    public final String apiKey;
    public final String endPoint;

    static {
        String mergeStrings = StringMerger.mergeStrings("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        DEFAULT_END_POINT = mergeStrings;
        String mergeStrings2 = StringMerger.mergeStrings("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String mergeStrings3 = StringMerger.mergeStrings("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        SUPPORTED_ENCODINGS = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Encoding("proto"), new Encoding("json"))));
        INSTANCE = new CCTDestination(mergeStrings, null);
        LEGACY_INSTANCE = new CCTDestination(mergeStrings2, mergeStrings3);
    }

    public CCTDestination(String str, String str2) {
        this.endPoint = str;
        this.apiKey = str2;
    }

    public static CCTDestination fromByteArray(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            a$$ExternalSyntheticBUOutline0.m$3("Version marker missing from extras");
            return null;
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            a$$ExternalSyntheticBUOutline0.m$3("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$3("Missing endpoint in CCTDestination extras");
            return null;
        }
        String str3 = split[1];
        return new CCTDestination(str2, str3.isEmpty() ? null : str3);
    }
}
