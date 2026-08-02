package defpackage;

import android.net.Uri;
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;

/* loaded from: classes10.dex */
public final class rjl0 {
    public final long a;
    public final int b;
    public final Uri c;

    public rjl0(int i, long j, Uri uri) {
        this.a = j;
        this.b = i;
        this.c = uri;
    }

    public static ImmutableList a(Uri uri, String str) {
        ImmutableList.a aVar = new ImmutableList.a();
        int i = tw21.a;
        int i2 = -1;
        String[] split = str.split(",", -1);
        int length = split.length;
        int i3 = 0;
        while (i3 < length) {
            String str2 = split[i3];
            String[] split2 = str2.split(";", i2);
            int length2 = split2.length;
            int i4 = i2;
            int i5 = i3;
            long j = -9223372036854775807L;
            int i6 = 0;
            Uri uri2 = null;
            while (i6 < length2) {
                String str3 = split2[i6];
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
                                i6++;
                                split = strArr;
                            }
                            throw ParserException.b(null, str4);
                        }
                        if (!str4.equals("url")) {
                            throw ParserException.b(null, str4);
                        }
                        uri2 = b(uri, str5);
                        i6++;
                        split = strArr;
                    } else {
                        if (!str4.equals("seq")) {
                            throw ParserException.b(null, str4);
                        }
                        i4 = Integer.parseInt(str5);
                        i6++;
                        split = strArr;
                    }
                } catch (Exception e) {
                    throw ParserException.b(e, str3);
                }
                throw ParserException.b(e, str3);
            }
            String[] strArr2 = split;
            if (uri2 != null && uri2.getScheme() != null) {
                i2 = -1;
                if (i4 != -1 || j != -9223372036854775807L) {
                    aVar.a(new rjl0(i4, j, uri2));
                    i3 = i5 + 1;
                    split = strArr2;
                }
            }
            throw ParserException.b(null, str2);
        }
        return aVar.g();
    }

    public static Uri b(Uri uri, String str) {
        String scheme = uri.getScheme();
        scheme.getClass();
        d6z.l(scheme.equals("rtsp"));
        Uri parse = Uri.parse(str);
        if (parse.isAbsolute()) {
            return parse;
        }
        Uri parse2 = Uri.parse("rtsp://" + str);
        String uri2 = uri.toString();
        String host = parse2.getHost();
        host.getClass();
        return host.equals(uri.getHost()) ? parse2 : uri2.endsWith("/") ? m4m0.j(uri2, str) : m4m0.j(uri2.concat("/"), str);
    }
}
