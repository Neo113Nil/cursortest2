package defpackage;

import com.connectsdk.etc.helper.HttpMessage;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class j0o {
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;
    public final u7e b;
    public String c;
    public s7e d;
    public final b0o e = new b0o();
    public final pv9 f;
    public twh g;
    public final boolean h;
    public final ime i;
    public final xiu j;
    public h0o k;

    public j0o(String str, u7e u7eVar, String str2, zvd zvdVar, twh twhVar, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = u7eVar;
        this.c = str2;
        this.g = twhVar;
        this.h = z;
        if (zvdVar != null) {
            this.f = zvdVar.m();
        } else {
            this.f = new pv9(9);
        }
        if (z2) {
            this.j = new xiu(27);
        } else if (z3) {
            ime imeVar = new ime(13);
            this.i = imeVar;
            imeVar.Y(bhi.f);
        }
    }

    public final void a(String str, String str2, boolean z) {
        xiu xiuVar = this.j;
        if (!z) {
            xiuVar.f(str, str2);
            return;
        }
        xiuVar.getClass();
        str.getClass();
        ((ArrayList) xiuVar.b).add(ofc.g(str, true, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 0, 0, 83));
        ((ArrayList) xiuVar.c).add(ofc.g(str2, true, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 0, 0, 83));
    }

    public final void b(String str, String str2) {
        if (!HttpMessage.CONTENT_TYPE_HEADER.equalsIgnoreCase(str)) {
            this.f.e(str, str2);
            return;
        }
        try {
            Pattern pattern = twh.e;
            this.g = q5g.C(str2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(f1d.g("Malformed content type: ", str2), e);
        }
    }

    public final void c(zvd zvdVar, h0o h0oVar) {
        ime imeVar = this.i;
        imeVar.getClass();
        h0oVar.getClass();
        if (zvdVar.a(HttpMessage.CONTENT_TYPE_HEADER) != null) {
            xq0.x("Unexpected header: Content-Type");
        } else if (zvdVar.a("Content-Length") != null) {
            xq0.x("Unexpected header: Content-Length");
        } else {
            ((ArrayList) imeVar.d).add(new ahi(zvdVar, h0oVar));
        }
    }

    public final void d(String str, String str2, boolean z) {
        s7e s7eVar;
        String str3 = this.c;
        if (str3 != null) {
            u7e u7eVar = this.b;
            u7eVar.getClass();
            try {
                s7eVar = new s7e();
                s7eVar.h(u7eVar, str3);
            } catch (IllegalArgumentException unused) {
                s7eVar = null;
            }
            this.d = s7eVar;
            if (s7eVar == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(u7eVar);
                wvs.l(sb, ", Relative: ", this.c);
                return;
            }
            this.c = null;
        }
        s7e s7eVar2 = this.d;
        if (z) {
            s7eVar2.a(str, str2);
        } else {
            s7eVar2.d(str, str2);
        }
    }
}
