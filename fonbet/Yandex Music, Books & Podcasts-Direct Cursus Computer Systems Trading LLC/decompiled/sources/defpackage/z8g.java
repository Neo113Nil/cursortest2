package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class z8g implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e9g b;

    public /* synthetic */ z8g(e9g e9gVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                break;
            default:
                qo6 qo6Var = qo6.a;
                break;
        }
        this.b = e9gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        int i = this.a;
        vci vciVar = vci.a;
        e9g e9gVar = this.b;
        switch (i) {
            case 0:
                wn5 wn5Var = i4w.l;
                qo6 qo6Var = qo6.d;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                wn5Var.invoke(Boolean.TRUE, xp3.u(d.m(vciVar, lsq.s(e9gVar)), lsq.r(e9gVar, qo6Var, hq5Var, 0)), hq5Var, 0);
            default:
                hq5 hq5Var2 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    w4k E = a0g.E(R.drawable.ic_more_24, 0, oq5Var2);
                    String M = rvf.M(R.string.overflow_menu_content_description, oq5Var2);
                    if (e9gVar == e9g.a) {
                        oq5Var2.Z(268619309);
                        j = ((dq0) oq5Var2.j(eq0.a)).a.a;
                    } else {
                        oq5Var2.Z(268620367);
                        j = ((dq0) oq5Var2.j(eq0.a)).a.c;
                    }
                    oq5Var2.p(false);
                    gae.b(E, M, a.a(d.m(vciVar, 24), "clip_overflow"), j, oq5Var2, 384, 0);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
