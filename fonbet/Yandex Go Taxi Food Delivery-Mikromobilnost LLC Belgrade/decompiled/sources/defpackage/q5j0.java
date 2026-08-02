package defpackage;

import com.ybsdk.widgets.common.MoneyInputEditView;
import java.util.regex.Pattern;
import kotlin.text.Regex;

/* loaded from: classes9.dex */
public final class q5j0 {
    public static final char[] l = {MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;
    public final kwu b;
    public String c;
    public jwu d;
    public final t4j0 e = new t4j0();
    public final keu f;
    public wg10 g;
    public final boolean h;
    public final yw40 i;
    public final l3s j;
    public m5j0 k;

    public q5j0(String str, kwu kwuVar, String str2, meu meuVar, wg10 wg10Var, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = kwuVar;
        this.c = str2;
        this.g = wg10Var;
        this.h = z;
        if (meuVar != null) {
            this.f = meuVar.d();
        } else {
            this.f = new keu();
        }
        if (z2) {
            this.j = new l3s();
        } else if (z3) {
            yw40 yw40Var = new yw40();
            this.i = yw40Var;
            yw40Var.d(ax40.g);
        }
    }

    public final void a(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                Regex regex = wg10.e;
                this.g = qje.o(str2);
                return;
            } catch (IllegalArgumentException e) {
                yci0.p(g8e.o("Malformed content type: ", str2), e);
                return;
            }
        }
        keu keuVar = this.f;
        if (z) {
            keuVar.c(str, str2);
        } else {
            keuVar.a(str, str2);
        }
    }

    public final void b(String str, String str2, boolean z) {
        jwu jwuVar;
        String str3 = this.c;
        if (str3 != null) {
            kwu kwuVar = this.b;
            kwuVar.getClass();
            try {
                jwuVar = new jwu();
                jwuVar.i(kwuVar, str3);
            } catch (IllegalArgumentException unused) {
                jwuVar = null;
            }
            this.d = jwuVar;
            if (jwuVar == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(kwuVar);
                w511.p(sb, ", Relative: ", this.c);
                return;
            }
            this.c = null;
        }
        jwu jwuVar2 = this.d;
        if (z) {
            jwuVar2.a(str, str2);
        } else {
            jwuVar2.d(str, str2);
        }
    }
}
