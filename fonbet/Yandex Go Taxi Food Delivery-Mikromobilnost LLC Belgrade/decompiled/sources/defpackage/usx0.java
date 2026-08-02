package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.navigator.domain.o;
import com.yandex.go.navigator.driving.p0;
import com.yandex.go.navigator.driving.r;
import com.yandex.go.preorder.navigation.s;
import com.yandex.go.summary.interactor.anchored.state.t;
import com.yandex.go.summary.interactor.anchored.state.y;
import com.yandex.go.taxi.summary.verticalsummary.interactor.f;
import com.yandex.go.walking.navigation.impl.overview.interactor.j;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.displayname.a;
import com.yandex.messaging.internal.textsuggest.d;
import com.yandex.messaging.internal.view.chat.input.textsuggest.c;
import com.yandex.messaging.ui.timeline.g;
import com.yandex.passport.internal.account.b;
import com.yandex.passport.internal.ui.challenge.delete.f1;
import com.yandex.passport.internal.ui.challenge.delete.y0;
import com.yandex.passport.internal.ui.challenge.k;
import com.yandex.passport.internal.ui.challenge.n;
import com.yandex.passport.sloth.c1;
import com.yandex.passport.sloth.data.SlothParams;
import com.yandex.passport.sloth.h;
import com.yandex.passport.sloth.ui.a1;
import com.yandex.passport.sloth.v;
import com.yandex.passport.sloth.z0;
import java.util.Set;
import ru.yandex.taxi.am.f0;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes14.dex */
public final class usx0 implements v7p {
    public final /* synthetic */ int a;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final yvf0 f;
    public final yvf0 g;
    public final yvf0 h;
    public final yvf0 i;
    public final yvf0 j;

    public usx0(n3w n3wVar, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, xvf0 xvf0Var, yvf0 yvf0Var7) {
        this.a = 11;
        this.f = n3wVar;
        this.c = yvf0Var;
        this.d = yvf0Var2;
        this.e = yvf0Var3;
        this.g = yvf0Var4;
        this.h = yvf0Var5;
        this.i = yvf0Var6;
        this.b = xvf0Var;
        this.j = yvf0Var7;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.j;
        yvf0 yvf0Var2 = this.b;
        yvf0 yvf0Var3 = this.i;
        yvf0 yvf0Var4 = this.h;
        yvf0 yvf0Var5 = this.g;
        yvf0 yvf0Var6 = this.e;
        yvf0 yvf0Var7 = this.d;
        yvf0 yvf0Var8 = this.c;
        yvf0 yvf0Var9 = this.f;
        switch (i) {
            case 0:
                return new f((Context) ((t0g) yvf0Var9).get(), (e) ((xvf0) yvf0Var2).get(), (wiq0) ((w0g) yvf0Var5).get(), (pwy0) ((xvf0) yvf0Var8).get(), (fk31) ((mg11) yvf0Var4).get(), (aqv0) ((miv0) yvf0Var3).get(), i5m.a((z6x0) yvf0Var), (cg31) ((xvf0) yvf0Var7).get(), (bgx0) ((xvf0) yvf0Var6).get());
            case 1:
                return new c((ChatRequest) ((xvf0) yvf0Var2).get(), i5m.a((xvf0) yvf0Var8), (d) ((wun0) yvf0Var9).get(), i5m.a((xvf0) yvf0Var7), (pet) ((wrh) yvf0Var5).get(), (Lifecycle) ((xvf0) yvf0Var6).get(), i5m.a((xvf0) yvf0Var4), (i720) ((xvf0) yvf0Var3).get(), (q6b) ((xvf0) yvf0Var).get());
            case 2:
                return new g((Activity) ((xvf0) yvf0Var2).get(), (ChatRequest) ((xvf0) yvf0Var8).get(), (cft) ((xvf0) yvf0Var7).get(), (com.yandex.messaging.internal.e) ((xvf0) yvf0Var6).get(), i5m.a((xvf0) yvf0Var9), (a) ((xvf0) yvf0Var5).get(), (com.yandex.messaging.internal.team.gaps.a) ((xvf0) yvf0Var4).get(), (w6t) ((xvf0) yvf0Var3).get(), (w4t) ((zo0) yvf0Var).get());
            case 3:
                return new com.yandex.go.transfer_requirement.card_state.a((crg) ((pbg) yvf0Var9).get(), (jtq0) ((pbg) yvf0Var8).get(), (com.yandex.go.transfer_requirement.transferapi.a) ((pbg) yvf0Var7).get(), (kcz0) ((flx0) yvf0Var6).get(), (zo01) ((xvf0) yvf0Var2).get(), (f0) ((pbg) yvf0Var5).get(), (kcz0) ((flx0) yvf0Var4).get(), (bo5) ((y501) yvf0Var3).get(), (ulx0) ((qcz0) yvf0Var).get());
            case 4:
                return new com.yandex.go.universal_qr_scanner.domain.camera.image.analyze.qr.a((tt2) ((sag) yvf0Var9).get(), (oep0) ((sag) yvf0Var7).get(), (ha1) ((sag) yvf0Var6).get(), (Set) ((sag) yvf0Var5).get(), (Set) ((sag) yvf0Var4).get(), (Set) ((sag) yvf0Var3).get(), (Set) ((sag) yvf0Var).get(), (lz11) ((xvf0) yvf0Var2).get(), (yz11) ((xvf0) yvf0Var8).get());
            case 5:
                return new s((zuj0) ((xvf0) yvf0Var2).get(), (gu11) ((xvf0) yvf0Var8).get(), (i130) ((xvf0) yvf0Var7).get(), (jl50) ((xvf0) yvf0Var6).get(), (fy01) ((xvf0) yvf0Var9).get(), (xvf0) yvf0Var5, (r521) ((xvf0) yvf0Var4).get(), (vpr0) ((xvf0) yvf0Var3).get(), (o521) ((nb11) yvf0Var).get());
            case 6:
                return new p0((o) ((xvf0) yvf0Var2).get(), (b621) ((j4g) yvf0Var9).get(), (r) ((xvf0) yvf0Var8).get(), (q290) ((f380) yvf0Var5).get(), (com.yandex.go.navigator.events.g) ((l4g) yvf0Var4).get(), (tt2) ((xvf0) yvf0Var7).get(), (gpv) ((xvf0) yvf0Var6).get(), (zuj0) ((xvf0) yvf0Var3).get(), (wsk0) ((xvf0) yvf0Var).get());
            case 7:
                return new li31((tt2) ((xvf0) yvf0Var2).get(), (t) ((nt0) yvf0Var9).get(), (y) ((sit0) yvf0Var7).get(), (f) ((usx0) yvf0Var6).get(), (com.yandex.go.summary.interactor.common.state.c) ((k4) yvf0Var5).get(), (aa1) ((p4) yvf0Var4).get(), (hhs0) ((y2s0) yvf0Var3).get(), (nej0) ((cta0) yvf0Var).get(), (cg31) ((xvf0) yvf0Var8).get());
            case 8:
                return new t441((Context) ((jcg) yvf0Var9).get(), (w030) ((pcg) yvf0Var5).get(), (j) ((xvf0) yvf0Var2).get(), (com.yandex.go.walking.navigation.impl.overview.interactor.a) ((xvf0) yvf0Var8).get(), (pso0) yvf0Var4, (a3v) ((xvf0) yvf0Var7).get(), (b741) ((xvf0) yvf0Var6).get(), (w041) ((xvf0) yvf0Var3).get(), (v541) ((ocg) yvf0Var).get());
            case 9:
                return new com.yandex.go.where_you_are.impl.router.a((qd21) yvf0Var9, (dz41) ((ucg) yvf0Var7).get(), (i130) ((ucg) yvf0Var6).get(), (jpn0) yvf0Var5, (yy41) ((e641) yvf0Var4).get(), (ah00) ((c1g) yvf0Var3).get(), (ly41) ((xvf0) yvf0Var2).get(), (com.yandex.go.navigation.screen.c) ((c1g) yvf0Var).get(), (hz41) ((xvf0) yvf0Var8).get());
            case 10:
                k kVar = (k) yvf0Var9.get();
                f1 f1Var = (f1) yvf0Var2.get();
                n nVar = (n) yvf0Var8.get();
                boolean booleanValue = ((Boolean) yvf0Var7.get()).booleanValue();
                com.yandex.passport.internal.core.accounts.d dVar = (com.yandex.passport.internal.core.accounts.d) yvf0Var6.get();
                com.yandex.passport.internal.usecase.ui.t tVar = (com.yandex.passport.internal.usecase.ui.t) yvf0Var5.get();
                com.yandex.passport.internal.usecase.ui.r rVar = (com.yandex.passport.internal.usecase.ui.r) yvf0Var4.get();
                b bVar = (b) yvf0Var3.get();
                return new y0(kVar, f1Var, nVar, booleanValue, dVar, tVar, rVar, bVar);
            default:
                return new c1((SlothParams) ((n3w) yvf0Var9).a, (com.yandex.passport.sloth.command.f) yvf0Var8.get(), (v) yvf0Var7.get(), (com.yandex.passport.sloth.url.j) yvf0Var6.get(), (h) yvf0Var5.get(), (com.yandex.passport.sloth.url.c) yvf0Var4.get(), (a1) yvf0Var3.get(), (com.yandex.passport.sloth.url.a) ((xvf0) yvf0Var2).get(), (z0) yvf0Var.get());
        }
    }

    public /* synthetic */ usx0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var6, xvf0 xvf0Var7, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = v7pVar;
        this.g = xvf0Var5;
        this.h = xvf0Var6;
        this.i = xvf0Var7;
        this.j = v7pVar2;
    }

    public usx0(yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, yvf0 yvf0Var5, yvf0 yvf0Var6, yvf0 yvf0Var7, yvf0 yvf0Var8, yvf0 yvf0Var9) {
        this.a = 10;
        this.f = yvf0Var;
        this.b = yvf0Var2;
        this.c = yvf0Var3;
        this.d = yvf0Var4;
        this.e = yvf0Var5;
        this.g = yvf0Var6;
        this.h = yvf0Var7;
        this.i = yvf0Var8;
        this.j = yvf0Var9;
    }

    public usx0(t0g t0gVar, nt0 nt0Var, sit0 sit0Var, usx0 usx0Var, k4 k4Var, p4 p4Var, y2s0 y2s0Var, cta0 cta0Var, dby0 dby0Var) {
        this.a = 7;
        this.b = t0gVar;
        this.f = nt0Var;
        this.d = sit0Var;
        this.e = usx0Var;
        this.g = k4Var;
        this.h = p4Var;
        this.i = y2s0Var;
        this.j = cta0Var;
        this.c = dby0Var;
    }

    public usx0(pbg pbgVar, pbg pbgVar2, pbg pbgVar3, flx0 flx0Var, xvf0 xvf0Var, pbg pbgVar4, flx0 flx0Var2, y501 y501Var, qcz0 qcz0Var) {
        this.a = 3;
        this.f = pbgVar;
        this.c = pbgVar2;
        this.d = pbgVar3;
        this.e = flx0Var;
        this.b = xvf0Var;
        this.g = pbgVar4;
        this.h = flx0Var2;
        this.i = y501Var;
        this.j = qcz0Var;
    }

    public usx0(qd21 qd21Var, ucg ucgVar, ucg ucgVar2, jpn0 jpn0Var, e641 e641Var, c1g c1gVar, xvf0 xvf0Var, c1g c1gVar2, xvf0 xvf0Var2) {
        this.a = 9;
        this.f = qd21Var;
        this.d = ucgVar;
        this.e = ucgVar2;
        this.g = jpn0Var;
        this.h = e641Var;
        this.i = c1gVar;
        this.b = xvf0Var;
        this.j = c1gVar2;
        this.c = xvf0Var2;
    }

    public usx0(j4g j4gVar, j4g j4gVar2, epf epfVar, f380 f380Var, l4g l4gVar, h4g h4gVar, h1t h1tVar, l4g l4gVar2, l4g l4gVar3) {
        this.a = 6;
        this.b = j4gVar;
        this.f = j4gVar2;
        this.c = epfVar;
        this.g = f380Var;
        this.h = l4gVar;
        this.d = h4gVar;
        this.e = h1tVar;
        this.i = l4gVar2;
        this.j = l4gVar3;
    }

    public usx0(sag sagVar, sag sagVar2, sag sagVar3, sag sagVar4, sag sagVar5, sag sagVar6, sag sagVar7, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.a = 4;
        this.f = sagVar;
        this.d = sagVar2;
        this.e = sagVar3;
        this.g = sagVar4;
        this.h = sagVar5;
        this.i = sagVar6;
        this.j = sagVar7;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    public usx0(v8c0 v8c0Var, xvf0 xvf0Var, wun0 wun0Var, xvf0 xvf0Var2, wrh wrhVar, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, n3w n3wVar) {
        this.a = 1;
        this.b = v8c0Var;
        this.c = xvf0Var;
        this.f = wun0Var;
        this.d = xvf0Var2;
        this.g = wrhVar;
        this.e = xvf0Var3;
        this.h = xvf0Var4;
        this.i = xvf0Var5;
        this.j = n3wVar;
    }

    public usx0(t0g t0gVar, xvf0 xvf0Var, w0g w0gVar, x0g x0gVar, mg11 mg11Var, miv0 miv0Var, z6x0 z6x0Var, dby0 dby0Var, x0g x0gVar2) {
        this.a = 0;
        this.f = t0gVar;
        this.b = xvf0Var;
        this.g = w0gVar;
        this.c = x0gVar;
        this.h = mg11Var;
        this.i = miv0Var;
        this.j = z6x0Var;
        this.d = dby0Var;
        this.e = x0gVar2;
    }

    public usx0(jcg jcgVar, pcg pcgVar, qd21 qd21Var, qd21 qd21Var2, pso0 pso0Var, pcg pcgVar2, d441 d441Var, xvf0 xvf0Var, ocg ocgVar) {
        this.a = 8;
        this.f = jcgVar;
        this.g = pcgVar;
        this.b = qd21Var;
        this.c = qd21Var2;
        this.h = pso0Var;
        this.d = pcgVar2;
        this.e = d441Var;
        this.i = xvf0Var;
        this.j = ocgVar;
    }
}
