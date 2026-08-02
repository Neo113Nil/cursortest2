package defpackage;

import java.nio.charset.Charset;
import kotlin.text.Regex;

/* loaded from: classes9.dex */
public final class wg10 {
    public static final Regex e = new Regex("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Regex f = new Regex(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;
    public final String b;
    public final String c;
    public final String[] d;

    public wg10(String[] strArr, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Charset a(Charset charset) {
        String str;
        String[] strArr = this.d;
        int i = 0;
        int v = jx81.v(0, strArr.length - 1, 2);
        if (v >= 0) {
            while (!cvu0.t(strArr[i], "charset", true)) {
                if (i != v) {
                    i += 2;
                }
            }
            str = strArr[i + 1];
            if (str != null) {
                return charset;
            }
            try {
                return Charset.forName(str);
            } catch (IllegalArgumentException unused) {
                return charset;
            }
        }
        str = null;
        if (str != null) {
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wg10) && jl40.l(((wg10) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
