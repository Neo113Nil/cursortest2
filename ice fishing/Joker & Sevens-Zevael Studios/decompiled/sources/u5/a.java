package u5;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f6694c = d.g("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: d, reason: collision with root package name */
    public static final Set f6695d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f6696e;

    /* renamed from: a, reason: collision with root package name */
    public final String f6697a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6698b;

    static {
        String g8 = d.g("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String g10 = d.g("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f6695d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new t5.c("proto"), new t5.c("json"))));
        f6696e = new a(g8, g10);
    }

    public a(String str, String str2) {
        this.f6697a = str;
        this.f6698b = str2;
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
