package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import com.yandex.passport.internal.entities.j;
import com.yandex.passport.sloth.ui.p;
import com.yandex.plus.bdui.m;
import com.yandex.plus.bdui.plus.checkout.content.controller.r0;
import com.yandex.plus.bdui.plus.content.r;
import com.yandex.plus.bdui.s;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.pay.ui.core.b;
import com.yandex.plus.webview.core.resource.c;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class huw implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ huw(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ?? r0;
        boolean z;
        vci vciVar;
        kb5 kb5Var;
        kb5 kb5Var2;
        kb5 kb5Var3;
        kb5 kb5Var4;
        grb grbVar;
        Function0 function0;
        Function0 function02;
        ?? r1;
        int i;
        oq5 oq5Var;
        String str;
        switch (this.a) {
            case 0:
                r0w r0wVar = (r0w) this.b;
                jv jvVar = (jv) this.c;
                tqn tqnVar = (tqn) this.d;
                tqn tqnVar2 = (tqn) this.e;
                xqn xqnVar = (xqn) this.f;
                ffm ffmVar = (ffm) obj;
                if (((Boolean) obj2).booleanValue()) {
                    float z2 = q5g.z(ffmVar, true);
                    List<lfm> list = ffmVar.a;
                    float z3 = q5g.z(ffmVar, false);
                    float f = (z2 == 0.0f || z3 == 0.0f) ? 1.0f : z2 / z3;
                    long A = q5g.A(ffmVar);
                    if (f == 1.0f && enj.c(A, 0L)) {
                        z = true;
                    } else {
                        long y = q5g.y(ffmVar, false);
                        long j = ((lfm) list.get(0)).b;
                        if (((Boolean) r0wVar.invoke(new enj(A), Float.valueOf(f))).booleanValue()) {
                            jvVar.invoke(new enj(y), new enj(A), Float.valueOf(f), Long.valueOf(j));
                            for (lfm lfmVar : list) {
                                if (!enj.c(swf.f0(lfmVar, false), 0L)) {
                                    lfmVar.a();
                                }
                            }
                        }
                        z = true;
                    }
                    tqnVar.a = z;
                    r0 = z;
                } else {
                    r0 = 1;
                }
                if (ffmVar.a.size() > r0) {
                    tqnVar2.a = r0;
                }
                xqnVar.a = ffmVar.a.get(0);
                return Unit.a;
            case 1:
                String str2 = (String) this.b;
                String str3 = (String) this.c;
                Function0 function03 = (Function0) this.d;
                String str4 = (String) this.e;
                Function0 function04 = (Function0) this.f;
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                vci vciVar2 = vci.a;
                yci o = a.o(d.d(vciVar2, 1.0f), 32, 0.0f, 2);
                kfh d = ug3.d(b2c.f, false);
                oq5 oq5Var3 = (oq5) hq5Var;
                int i2 = oq5Var3.P;
                androidx.compose.runtime.internal.a l = oq5Var3.l();
                yci H = vnj.H(hq5Var, o);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(grbVar2);
                } else {
                    oq5Var3.n0();
                }
                kb5 kb5Var5 = wp5.f;
                g0g.U(hq5Var, d, kb5Var5);
                kb5 kb5Var6 = wp5.e;
                g0g.U(hq5Var, l, kb5Var6);
                kb5 kb5Var7 = wp5.g;
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i2))) {
                    ouj.x(i2, oq5Var3, i2, kb5Var7);
                }
                kb5 kb5Var8 = wp5.d;
                g0g.U(hq5Var, H, kb5Var8);
                float f2 = 20;
                yci u = xp3.u(d.t(vciVar2, 0.0f, 445, 1), ugo.a(f2));
                agr agrVar = j95.a;
                oq5 oq5Var4 = (oq5) hq5Var;
                yci n = a.n(androidx.compose.foundation.a.b(u, ((i95) oq5Var4.j(agrVar)).p, vnj.i), f2, 24);
                ta5 a = sa5.a(qx0.g(16), b2c.o, hq5Var, 54);
                int i3 = oq5Var3.P;
                androidx.compose.runtime.internal.a l2 = oq5Var3.l();
                yci H2 = vnj.H(hq5Var, n);
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(grbVar2);
                } else {
                    oq5Var3.n0();
                }
                g0g.U(hq5Var, a, kb5Var5);
                g0g.U(hq5Var, l2, kb5Var6);
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i3))) {
                    ouj.x(i3, oq5Var3, i3, kb5Var7);
                }
                g0g.U(hq5Var, H2, kb5Var8);
                if (str2 == null || str2.length() == 0) {
                    vciVar = vciVar2;
                    kb5Var = kb5Var5;
                    kb5Var2 = kb5Var7;
                    kb5Var3 = kb5Var8;
                    kb5Var4 = kb5Var6;
                    grbVar = grbVar2;
                    oq5 oq5Var5 = oq5Var3;
                    function0 = function03;
                    function02 = function04;
                    r1 = 0;
                    i = -1726611320;
                    oq5Var5.Z(-1726611320);
                    oq5Var5.p(false);
                    oq5Var = oq5Var5;
                } else {
                    oq5Var3.Z(-1723214495);
                    ges gesVar = ((rdt) oq5Var4.j(vdt.a)).f;
                    long j2 = ((i95) oq5Var4.j(agrVar)).q;
                    grbVar = grbVar2;
                    function0 = function03;
                    vciVar = vciVar2;
                    kb5Var2 = kb5Var7;
                    kb5Var3 = kb5Var8;
                    oq5 oq5Var6 = oq5Var3;
                    kb5Var4 = kb5Var6;
                    kb5Var = kb5Var5;
                    function02 = function04;
                    r1 = 0;
                    wcs.b(str2, d.d(vciVar2, 1.0f), j2, 0L, null, 0L, new o9s(3), 0L, 0, false, 0, 0, gesVar, hq5Var, 48, 0, 65016);
                    hq5Var = hq5Var;
                    oq5Var6.p(false);
                    i = -1726611320;
                    oq5Var = oq5Var6;
                }
                oq5Var.Z(i);
                oq5Var.p(r1);
                vci vciVar3 = vciVar;
                yci q = a.q(d.d(vciVar3, 1.0f), 0.0f, 10, 0.0f, (float) r1, 5);
                ta5 a2 = sa5.a(qx0.g(2), b2c.n, hq5Var, 6);
                int i4 = oq5Var.P;
                androidx.compose.runtime.internal.a l3 = oq5Var.l();
                yci H3 = vnj.H(hq5Var, q);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(hq5Var, a2, kb5Var);
                g0g.U(hq5Var, l3, kb5Var4);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var, i4, kb5Var2);
                }
                g0g.U(hq5Var, H3, kb5Var3);
                Object obj3 = gq5.a;
                if (str3 == null || str3.length() == 0) {
                    str = str3;
                    oq5Var.Z(-1221589954);
                } else {
                    oq5Var.Z(-1216896554);
                    Function0 function05 = function0;
                    boolean f3 = oq5Var.f(function05);
                    Object K = oq5Var.K();
                    if (f3 || K == obj3) {
                        K = new gct(25, function05);
                        oq5Var.k0(K);
                    }
                    str = str3;
                    b.e(384, 8, hq5Var, d.e(d.d(vciVar3, 1.0f), 48), str, (Function0) K, false);
                }
                oq5Var.p(r1);
                if (str == null || str4 == null) {
                    oq5Var.Z(-1221589954);
                } else {
                    oq5Var.Z(-1216403034);
                    u1g.l(hq5Var, d.e(vciVar3, 4));
                }
                oq5Var.p(r1);
                if (str4 == null || str4.length() == 0) {
                    oq5Var.Z(-1221589954);
                } else {
                    oq5Var.Z(-1216204076);
                    Function0 function06 = function02;
                    boolean f4 = oq5Var.f(function06);
                    Object K2 = oq5Var.K();
                    if (f4 || K2 == obj3) {
                        K2 = new gct(26, function06);
                        oq5Var.k0(K2);
                    }
                    b.f(384, hq5Var, d.e(d.d(vciVar3, 1.0f), 48), str4, (Function0) K2, false);
                }
                oq5Var.p(r1);
                f1d.u(oq5Var, true, true, true);
                return Unit.a;
            case 2:
                com.yandex.plus.pay.ui.core.api.common.a aVar = (com.yandex.plus.pay.ui.core.api.common.a) this.b;
                com.yandex.plus.core.imageloader.b bVar = (com.yandex.plus.core.imageloader.b) this.c;
                com.yandex.plus.pay.ui.design.api.api.a aVar2 = (com.yandex.plus.pay.ui.design.api.api.a) this.d;
                y yVar = (y) this.e;
                com.yandex.plus.log.api.b bVar2 = (com.yandex.plus.log.api.b) this.f;
                m mVar = (m) obj2;
                ((s) obj).getClass();
                mVar.getClass();
                return new r0(mVar, aVar, bVar, aVar2, yVar, bVar2);
            default:
                mm6 mm6Var = (mm6) this.b;
                com.yandex.plus.bdui.flex.ui.s sVar = (com.yandex.plus.bdui.flex.ui.s) this.c;
                r rVar = (r) this.d;
                j jVar = (j) this.e;
                h8e h8eVar = (h8e) this.f;
                com.yandex.plus.webview.core.d dVar = (com.yandex.plus.webview.core.d) obj;
                c cVar = (c) obj2;
                dVar.getClass();
                cVar.getClass();
                return x97.y(mm6Var, null, null, new p(sVar, rVar, cVar, jVar, h8eVar, dVar, (Continuation) null), 3);
        }
    }
}
