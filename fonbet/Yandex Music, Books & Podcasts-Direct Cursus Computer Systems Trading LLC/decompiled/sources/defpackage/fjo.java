package defpackage;

import android.net.Uri;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class fjo {
    public final long a;
    public final int b;
    public final Uri c;

    public fjo(int i, long j, Uri uri) {
        this.a = j;
        this.b = i;
        this.c = uri;
    }

    public static qsn a(Uri uri, String str) {
        hld.w(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = dvt.a;
        int i2 = -1;
        String[] split = str.split(StringUtils.COMMA, -1);
        int length = split.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            String str2 = split[i3];
            String[] split2 = str2.split(";", i2);
            int length2 = split2.length;
            int i5 = i2;
            int i6 = i3;
            long j = -9223372036854775807L;
            int i7 = 0;
            Uri uri2 = null;
            while (i7 < length2) {
                String str3 = split2[i7];
                try {
                    String[] split3 = str3.split("=", 2);
                    String str4 = split3[0];
                    String str5 = split3[1];
                    int hashCode = str4.hashCode();
                    String[] strArr = split;
                    if (hashCode != 113759) {
                        if (hashCode != 116079) {
                            if (hashCode == 1524180539 && str4.equals("rtptime")) {
                                j = Long.parseLong(str5);
                                i7++;
                                split = strArr;
                            }
                            throw r7k.b(str4, null);
                        }
                        if (!str4.equals("url")) {
                            throw r7k.b(str4, null);
                        }
                        uri2 = b(uri, str5);
                        i7++;
                        split = strArr;
                    } else {
                        if (!str4.equals("seq")) {
                            throw r7k.b(str4, null);
                        }
                        i5 = Integer.parseInt(str5);
                        i7++;
                        split = strArr;
                    }
                } catch (Exception e) {
                    throw r7k.b(str3, e);
                }
                throw r7k.b(str3, e);
            }
            String[] strArr2 = split;
            if (uri2 != null && uri2.getScheme() != null) {
                i2 = -1;
                if (i5 != -1 || j != -9223372036854775807L) {
                    fjo fjoVar = new fjo(i5, j, uri2);
                    int i8 = i4 + 1;
                    int e2 = pde.e(objArr.length, i8);
                    if (e2 > objArr.length) {
                        objArr = Arrays.copyOf(objArr, e2);
                    }
                    objArr[i4] = fjoVar;
                    i4 = i8;
                    split = strArr2;
                    i3 = i6 + 1;
                }
            }
            throw r7k.b(str2, null);
        }
        return yde.t(i4, objArr);
    }

    public static Uri b(Uri uri, String str) {
        String scheme = uri.getScheme();
        scheme.getClass();
        vq1.v(scheme.equals("rtsp"));
        Uri parse = Uri.parse(str);
        if (parse.isAbsolute()) {
            return parse;
        }
        Uri parse2 = Uri.parse("rtsp://" + str);
        String uri2 = uri.toString();
        String host = parse2.getHost();
        host.getClass();
        return host.equals(uri.getHost()) ? parse2 : uri2.endsWith("/") ? p1g.N(uri2, str) : p1g.N(uri2.concat("/"), str);
    }
}
