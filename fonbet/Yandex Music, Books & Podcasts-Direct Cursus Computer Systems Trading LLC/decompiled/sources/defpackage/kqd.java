package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.core.ui.compose.b;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class kqd implements pyc {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ kqd(int i, tsf tsfVar, ynn ynnVar, njt njtVar, yit yitVar) {
        this.b = i;
        this.c = tsfVar;
        this.d = ynnVar;
        this.e = njtVar;
        this.f = yitVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Integer num;
        int i = this.a;
        vci vciVar = vci.a;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                mqd mqdVar = (mqd) obj7;
                float f = mqdVar.a;
                o0k o0kVar = (o0k) obj6;
                List list = (List) obj5;
                wn5 wn5Var = (wn5) obj4;
                c cVar = (c) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(cVar) ? 4 : 2;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
                    float e = cVar.e();
                    xof xofVar = (xof) oq5Var.j(es5.n);
                    oq5Var.Z(1222085893);
                    float f2 = a.f(o0kVar, xofVar);
                    int e2 = Float.compare(e, lqd.a) < 0 ? 1 : Float.compare(e, vt0.f) < 0 ? 2 : (int) ((((e - f2) - a.e(o0kVar, xofVar)) + f) / (vt0.d + f));
                    if (e2 <= i2) {
                        i2 = e2;
                    }
                    jx7 jx7Var = (jx7) oq5Var.j(es5.h);
                    jx7Var.getClass();
                    float d0 = jx7Var.d0(jx7Var.n0(((e - (f2 * 2)) - ((i2 - 1) * f)) / i2) - 1);
                    oq5Var.p(false);
                    x2i x2iVar = qx0.a;
                    vq2.k(androidx.compose.ui.platform.a.a(a.l(d.d(vciVar, 1.0f), o0kVar), "grid_flow_row"), qx0.g(f), qx0.g(mqdVar.b), null, i2, 0, ild.C(-61578205, new j6c(list, d0, wn5Var, i2), oq5Var), oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                tsf tsfVar = (tsf) obj7;
                ynn ynnVar = (ynn) obj6;
                njt njtVar = (njt) obj5;
                yit yitVar = (yit) obj4;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((dsf) obj).getClass();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Iterator it = tsfVar.h().l.iterator();
                    if (it.hasNext()) {
                        Integer valueOf = Integer.valueOf(((lsf) it.next()).v);
                        while (it.hasNext()) {
                            Integer valueOf2 = Integer.valueOf(((lsf) it.next()).v);
                            if (valueOf.compareTo(valueOf2) < 0) {
                                valueOf = valueOf2;
                            }
                        }
                        num = valueOf;
                    } else {
                        num = null;
                    }
                    int intValue3 = num != null ? 1 + num.intValue() : 1;
                    spd spdVar = new spd(i2 % intValue3, i2 / intValue3, i2);
                    yci b = b.b(vciVar, i2);
                    boolean h = oq5Var2.h(njtVar) | oq5Var2.d(i2) | oq5Var2.h(yitVar);
                    Object K = oq5Var2.K();
                    kjn kjnVar = gq5.a;
                    if (h || K == kjnVar) {
                        K = new hjt(i2, 0, yitVar, njtVar);
                        oq5Var2.k0(K);
                    }
                    yci b2 = com.yandex.music.core.ui.compose.a.b(b, ynnVar, 0L, 0.0f, null, (Function2) K, 14);
                    boolean h2 = oq5Var2.h(njtVar) | oq5Var2.h(yitVar) | oq5Var2.d(i2);
                    Object K2 = oq5Var2.K();
                    if (h2 || K2 == kjnVar) {
                        K2 = new ijt(i2, 0, yitVar, njtVar);
                        oq5Var2.k0(K2);
                    }
                    Function0 function0 = (Function0) K2;
                    boolean h3 = oq5Var2.h(njtVar) | oq5Var2.h(yitVar);
                    Object K3 = oq5Var2.K();
                    if (h3 || K3 == kjnVar) {
                        K3 = new jjt(njtVar, yitVar, 0);
                        oq5Var2.k0(K3);
                    }
                    wyf.o(yitVar, njtVar, spdVar, function0, (Function0) K3, b2, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ kqd(mqd mqdVar, o0k o0kVar, int i, List list, wn5 wn5Var) {
        this.c = mqdVar;
        this.d = o0kVar;
        this.b = i;
        this.e = list;
        this.f = wn5Var;
    }
}
