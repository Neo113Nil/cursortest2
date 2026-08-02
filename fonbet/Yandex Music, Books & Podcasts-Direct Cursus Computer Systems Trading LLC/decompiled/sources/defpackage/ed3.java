package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class ed3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public /* synthetic */ ed3(String str, boolean z, int i) {
        this.a = 2;
        this.c = str;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        yci u;
        long j;
        int i = this.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(1 & intValue, (intValue & 3) != 2)) {
                    ges j2 = nu0.j();
                    long j3 = ((dq0) oq5Var.j(eq0.a)).b.a;
                    o9s o9sVar = z ? new o9s(3) : null;
                    u = d.u(a.n(d.d(d.g(vci.a, 56, 0.0f, 2), 1.0f), 16, 8), b2c.l, (r2 & 2) == 0);
                    xcs.b(this.c, u, j3, 0L, null, 0L, null, o9sVar, 0L, 2, false, 1, 0, null, j2, oq5Var, 0, 3120, 54776);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                w4k E = a0g.E(z ? R.drawable.ic_full_screen_off_24 : R.drawable.ic_full_screen_on_24, 0, hq5Var2);
                oq5 oq5Var3 = (oq5) hq5Var2;
                if (z) {
                    oq5Var3.Z(-407261164);
                    j = ((dq0) oq5Var3.j(eq0.a)).a.a;
                } else {
                    oq5Var3.Z(-407260106);
                    j = ((dq0) oq5Var3.j(eq0.a)).a.c;
                }
                oq5Var3.p(false);
                gae.b(E, this.c, null, j, hq5Var2, 0, 4);
            default:
                ((Integer) obj2).getClass();
                v3g.a(this.c, z, (hq5) obj, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ed3(boolean z, String str, int i) {
        this.a = i;
        this.b = z;
        this.c = str;
    }
}
