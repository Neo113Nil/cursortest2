package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import com.yandex.music.core.ui.compose.b;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final /* synthetic */ class d5r implements pyc {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ a5r c;

    public /* synthetic */ d5r(long j, a5r a5rVar) {
        this.b = j;
        this.c = a5rVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                dh3 dh3Var = (dh3) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                dh3Var.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(dh3Var) ? 4 : 2;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
                    String str = this.c.b;
                    yci a = a.a(dh3Var.a(d.d(vci.a, 1.0f), b2c.h), "special_title");
                    long j = this.b;
                    xv7.j(str, b.c(a, "color_special_title", jxd.h(c3x.U(j))), j, 0L, 0L, 0, 0L, 2, false, 3, 0, null, null, oq5Var, 0, 3120, 120824);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((dh3) obj).getClass();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                    yci a2 = a.a(d.d(vci.a, 1.0f), "special_subtitle");
                    long j2 = this.b;
                    xv7.j(this.c.c, b.c(a2, "color_special_subtitle", jxd.h(c3x.U(j2))), j2, 0L, 0L, 0, 0L, 2, false, 2, 0, null, null, oq5Var2, 0, 3120, 120824);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ d5r(a5r a5rVar, long j) {
        this.c = a5rVar;
        this.b = j;
    }
}
