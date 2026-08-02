package Z1;

import a.AbstractC0426a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f4105c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f4106d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f4107e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f4108f;

    /* renamed from: a, reason: collision with root package name */
    public final String f4109a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4110b;

    static {
        String j6 = AbstractC0426a.j("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f4105c = j6;
        String j9 = AbstractC0426a.j("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String j10 = AbstractC0426a.j("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f4106d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Y1.c("proto"), new Y1.c("json"))));
        f4107e = new a(j6, null);
        f4108f = new a(j9, j10);
    }

    public a(String str, String str2) {
        this.f4109a = str;
        this.f4110b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }
}
