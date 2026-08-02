package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import com.yandex.music.core.ui.compose.b;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class cu0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cu0(long j, k75 k75Var, int i) {
        this.a = 3;
        this.b = j;
        this.c = k75Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = this.a;
        int i4 = 5;
        long j = this.b;
        vci vciVar = vci.a;
        Continuation continuation = null;
        int i5 = 3;
        Object obj3 = this.c;
        switch (i3) {
            case 0:
                String str = (String) obj3;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        break;
                    }
                }
                w4k E = a0g.E(R.drawable.ic_arrow_mid_right_24, 0, hq5Var);
                yci j2 = a.j(d.c(vciVar, 1.0f), ff7.P(v7g.z(-3), hq5Var), ff7.P(v7g.z(5), hq5Var));
                if (str == null) {
                    str = "content_heading_show_more";
                }
                gae.b(E, null, androidx.compose.ui.platform.a.a(j2, str), this.b, hq5Var, 48, 0);
            case 1:
                pv0 pv0Var = (pv0) obj3;
                hq5 hq5Var2 = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                    hjp hjpVar = pv0Var.c;
                    rkd rkdVar = (rkd) oq5Var2.j(cs5.d);
                    qov h = pv0Var.h(((fma) oq5Var2.j(cs5.a)).a);
                    qov h2 = pv0Var.h(j);
                    hjpVar.getClass();
                    rkdVar.getClass();
                    pov a = ((knv) hjpVar.b).a();
                    eps epsVar = a.i;
                    if (h == qov.c) {
                        x97.y(a.d, null, null, new kov(a, continuation, i5), 3);
                    }
                    epsVar.getClass();
                    ssg.a(4, "WidgetManager", "[registerWidget] request to register new widget", null);
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) epsVar.g;
                    if (concurrentHashMap.get(rkdVar) == null) {
                        x97.y((mm6) epsVar.a, null, null, new y6v(epsVar, rkdVar, continuation, i4), 3);
                    }
                    concurrentHashMap.put(rkdVar, h2);
                    yks yksVar = new yks(epsVar);
                    oq5Var2.Z(-1518626783);
                    bg3.g(null, ild.C(1077426655, new lv0(pv0Var, yksVar), oq5Var2), oq5Var2, 48);
                    oq5Var2.p(false);
                } else {
                    oq5Var2.S();
                }
                break;
            case 2:
                cwk cwkVar = (cwk) obj3;
                hq5 hq5Var3 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                oq5 oq5Var3 = (oq5) hq5Var3;
                if (oq5Var3.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    int ordinal = cwkVar.ordinal();
                    if (ordinal == 0) {
                        i = R.string.listen;
                    } else if (ordinal != 1) {
                        b6e.s();
                        break;
                    } else {
                        i = R.string.pause;
                    }
                    int ordinal2 = cwkVar.ordinal();
                    if (ordinal2 == 0) {
                        i2 = R.drawable.ic_play_mid_24;
                    } else if (ordinal2 != 1) {
                        b6e.s();
                        break;
                    } else {
                        i2 = R.drawable.ic_pause_mid_24;
                    }
                    gae.b(a0g.E(i2, 0, oq5Var3), rvf.M(i, oq5Var3), null, this.b, oq5Var3, 0, 4);
                } else {
                    oq5Var3.S();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                wct.d(j, (k75) obj3, (hq5) obj, rvf.R(49));
                break;
            default:
                c0g c0gVar = (c0g) obj3;
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var4;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                c0g c0gVar2 = c0g.c;
                a0g.e(c0gVar == c0gVar2, b.c(androidx.compose.ui.platform.a.a(vciVar, "like_icon"), "like_icon_state", Boolean.valueOf(c0gVar == c0gVar2)), null, ((dq0) ((oq5) hq5Var4).j(eq0.a)).a.g, this.b, b0g.c, hq5Var4, 196608, 4);
        }
        return Unit.a;
    }

    public /* synthetic */ cu0(pv0 pv0Var, long j, rkd rkdVar) {
        this.a = 1;
        this.c = pv0Var;
        this.b = j;
    }

    public /* synthetic */ cu0(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
