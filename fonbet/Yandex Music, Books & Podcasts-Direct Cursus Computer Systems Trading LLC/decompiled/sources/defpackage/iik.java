package defpackage;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.t;
import com.yandex.passport.data.network.l;
import com.yandex.passport.internal.entities.j;
import com.yandex.passport.sloth.ui.c;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.core.theme.e;
import com.yandex.plus.home.dailyquests.feature.api.model.i;
import com.yandex.plus.home.dailyquests.plugin.internal.proxy.g;
import com.yandex.plus.home.k;
import com.yandex.plus.home.plaque.plugin.internal.proxy.a;
import com.yandex.plus.home.plaque.plugin.internal.proxy.h;
import com.yandex.plus.home.r;
import com.yandex.plus.log.api.b;
import com.yandex.plus.plaquesdk.plaque.api.dependencies.d;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public final /* synthetic */ class iik implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iik(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v3, types: [n7q] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        l3o l3oVar;
        d0o d0oVar;
        int i = this.a;
        int i2 = 12;
        boolean z = false;
        int i3 = 2;
        int i4 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                suh suhVar = (suh) obj2;
                t requireActivity = ((jik) obj).requireActivity();
                requireActivity.getClass();
                return new eik((w6s) suhVar.c, (t36) ((fik) suhVar.b).b.invoke(requireActivity));
            case 1:
                return "load playlist " + ((nvl) obj2) + " error " + ((pj6) obj).a();
            case 2:
                return "load " + ((String) obj2) + " warning notLoaded " + ((ArrayList) obj);
            case 3:
                return "Unexpected sync state for playlist " + ((cvl) obj2).g() + ": " + ((byr) obj);
            case 4:
                h hVar = (h) obj2;
                Context context = (Context) obj;
                hVar.getClass();
                context.getClass();
                xqn xqnVar = new xqn();
                msa msaVar = nsa.b;
                ssa ssaVar = ssa.MILLISECONDS;
                long M = yd5.M(300, ssaVar);
                long M2 = yd5.M(850, ssaVar);
                yd5.M(200, ssaVar);
                zp0 zp0Var = new zp0(M, M2, yd5.M(100, ssaVar), yd5.M(100, ssaVar));
                ce5 ce5Var = hVar.a;
                a aVar = new a(zp0Var);
                if (xqnVar.a != null) {
                    l1j.f();
                    return null;
                }
                c cVar = new c(i2, aVar);
                jyr jyrVar = (jyr) ce5Var.a;
                j jVar = (j) ce5Var.k;
                b bVar = (b) ce5Var.l;
                ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) ce5Var.n)).getClass();
                bsd bsdVar = com.yandex.plus.core.dispatcher.a.d;
                context.getClass();
                jyrVar.getClass();
                jVar.getClass();
                bsdVar.getClass();
                com.yandex.plus.home.plaque.feature.internal.presentation.b bVar2 = new com.yandex.plus.home.plaque.feature.internal.presentation.b();
                bVar2.a = jVar;
                bVar2.b = bVar;
                bVar2.c = bsdVar;
                bVar2.d = jyrVar;
                com.yandex.plus.plaquesdk.plaque.c cVar2 = new com.yandex.plus.plaquesdk.plaque.c(context, d.s0, new c(13, bVar2), new com.yandex.plus.home.feature.webviews.internal.webview.a(1, (com.yandex.plus.home.plaque.feature.internal.presentation.h) jyrVar.getValue(), com.yandex.plus.home.plaque.feature.internal.presentation.h.class, "onWidgetClicked", "onWidgetClicked(Lcom/yandex/plus/plaquesdk/plaque/api/models/MicroWidgetModel;)V", 0, 23), cVar);
                bVar2.f = cVar2;
                cVar2.setId(View.generateViewId());
                cVar2.addOnAttachStateChangeListener(new r(5, bVar2));
                com.yandex.plus.plaquesdk.plaque.c cVar3 = (com.yandex.plus.plaquesdk.plaque.c) bVar2.f;
                cVar3.addOnAttachStateChangeListener((r) ce5Var.b);
                cVar3.addOnAttachStateChangeListener((com.yandex.plus.home.plaque.feature.api.a) ce5Var.i);
                cVar3.addOnAttachStateChangeListener((r) ce5Var.j);
                return new com.yandex.plus.home.plaque.plugin.internal.proxy.j(bVar2);
            case 5:
                yyk yykVar = (yyk) obj2;
                return new toh(yykVar.c.a, yykVar.a, (jyr) ((jac) obj).a);
            case 6:
                yyk yykVar2 = (yyk) obj2;
                return new h9q(yykVar2.c.a, yykVar2.a, (arf) obj);
            case 7:
                return new w3q(i3, ((yyk) obj2).c.c, (jyr) obj);
            case 8:
                l13 l13Var = (l13) obj;
                oq7 oq7Var = ((yyk) obj2).c;
                bdt I = hag.I(k1l.class);
                qdc qdcVar = l13Var.a;
                Set set = l13Var.b;
                return new t1o(oq7Var, (k1l) qdcVar.D(I, l13Var, set), (q9w) l13Var.a.D(hag.I(q9w.class), l13Var, set));
            case 9:
                jac jacVar = (jac) obj2;
                l13 l13Var2 = (l13) obj;
                return new pr3((et) ((jyr) jacVar.c).getValue(), (p51) ((jyr) jacVar.d).getValue(), (rtl) ((faw) jacVar.g).f.getValue(), (i2m) ((jyr) jacVar.e).getValue(), (rus) ((jyr) jacVar.f).getValue(), (frt) l13Var2.a.D(hag.I(frt.class), l13Var2, l13Var2.b));
            case 10:
                x97.y((mm6) obj2, null, null, new ejl((ja0) obj, r8, i4), 3);
                return Unit.a;
            case 11:
                evj evjVar = (evj) obj2;
                hgp hgpVar = new hgp();
                hgpVar.i = (tf6) obj;
                hgpVar.a = btf.b(new yjl(evjVar, i4));
                bdt I2 = hag.I(kll.class);
                l18 l18Var = l18.b;
                hgpVar.b = l18Var.b(I2, true);
                hgpVar.c = btf.b(new ufl(16));
                hgpVar.d = btf.b(new ufl(17));
                hgpVar.e = btf.b(new ufl(18));
                hgpVar.f = l18Var.b(hag.I(k1l.class), true);
                hgpVar.g = btf.b(new yjl(evjVar, i3));
                hgpVar.h = l18Var.b(hag.I(oq7.class), true);
                return new qjl(hgpVar);
            case 12:
                uvf uvfVar = new uvf(new wcj(11, (evj) obj2, (ce5) obj));
                uvfVar.d();
                return uvfVar;
            case 13:
                zus zusVar = (zus) obj;
                d6l x = p6g.x((e6l) ((oq7) ((tf4) obj2).v.getValue()).a.c.getValue());
                r8 = x != null ? x.a : 0;
                if (r8 != 0 && ((Boolean) wdg.A(r8, bs4.g)).booleanValue() && y7g.B(r8).size() >= 2) {
                    z = f8g.F(r8) != zusVar.a ? true : ((Boolean) wdg.A(r8, rwd.i)).booleanValue();
                }
                return Boolean.valueOf(z);
            case 14:
                return new w5l(((yrl) obj2).d.b, new jab(qkb.MyWave, 1, 2, 1), new thj(pkb.Wave, ((StationId) obj).h(), 1, 1, ""), null);
            case 15:
                ((aqi) obj).setValue(Boolean.FALSE);
                ((bg5) obj2).i();
                return Unit.a;
            case 16:
                ((Function1) obj2).invoke((cki) obj);
                return Unit.a;
            case 17:
                qzl qzlVar = (qzl) obj2;
                qzlVar.getClass();
                rmb.a(qzlVar.h.a((jab) obj, null), sjb.Refresh, null, null, 14);
                n0m n0mVar = qzlVar.a;
                n0mVar.getClass();
                x97.y(ot0.F(n0mVar), null, null, new d0m(n0mVar, r8, 6), 3);
                return Unit.a;
            case 18:
                return ((rmb) obj2).b((thj) obj);
            case 19:
                uu5 uu5Var = (uu5) obj2;
                cvl cvlVar = (cvl) ((xdh) obj).b;
                cvlVar.getClass();
                j1t j1tVar = (j1t) uu5Var.d;
                j1tVar.dismiss();
                ((qe3) uu5Var.e).a(sjb.RemoveFromPlaylist);
                j1tVar.a(cvlVar, (mqs) uu5Var.a);
                return Unit.a;
            case 20:
                ((at5) obj2).invoke((us5) obj);
                return Unit.a;
            case 21:
                uhb uhbVar = (uhb) obj2;
                Context requireContext = ((jim) obj).requireContext();
                requireContext.getClass();
                qxm qxmVar = uhbVar.a;
                String str = uhbVar.b;
                HashMap hashMap = new HashMap();
                hashMap.put("type", qxmVar.a());
                hashMap.put("title", qxmVar.a);
                lg3.e0("Post_SharePost", hashMap);
                y7g.O(requireContext, y7g.N(str));
                return Unit.a;
            case 22:
                p7s p7sVar = (p7s) obj;
                q2n b = ((h3n) obj2).b();
                if (b != null) {
                    p7sVar.c(b);
                }
                return Unit.a;
            case 23:
                ((Function1) obj2).invoke((q2n) obj);
                return Unit.a;
            case 24:
                ((ygk) obj).a.f.invoke(Boolean.valueOf(((os8) ((t1f) obj2).d).a()));
                return Unit.a;
            case 25:
                ((r7n) obj2).b((qmu) ((aqi) obj).getValue());
                return Unit.a;
            case 26:
                ((r7n) obj2).a.b((qmu) obj);
                return Unit.a;
            case 27:
                com.yandex.plus.home.dailyquests.plugin.internal.proxy.b bVar3 = (com.yandex.plus.home.dailyquests.plugin.internal.proxy.b) obj2;
                Context context2 = (Context) obj;
                bVar3.getClass();
                context2.getClass();
                com.yandex.plus.home.dailyquests.feature.api.c cVar4 = bVar3.c;
                i iVar = bVar3.b;
                com.yandex.plus.home.dailyquests.repository.rest.c cVar5 = (com.yandex.plus.home.dailyquests.repository.rest.c) cVar4.a;
                com.yandex.plus.ui.core.theme.a aVar2 = (com.yandex.plus.ui.core.theme.a) ((fkn) cVar4.e).a.getValue();
                boolean r = u.r(context2, aVar2);
                Context a = ((e) cVar4.f).a(com.yandex.plus.home.common.utils.a.n(context2, r ? R.style.PlusSDK_DailyQuests_Widget_Theme_Dark : R.style.PlusSDK_DailyQuests_Widget_Theme_Light), aVar2);
                com.yandex.passport.internal.core.accounts.h hVar2 = new com.yandex.passport.internal.core.accounts.h(context2, new a1(12), new n20(r), (com.yandex.plus.core.imageloader.b) cVar4.d, (com.yandex.plus.core.dispatcher.b) cVar4.g);
                com.yandex.plus.home.dailyquests.feature.internal.domain.b bVar4 = new com.yandex.plus.home.dailyquests.feature.internal.domain.b(cVar5, iVar);
                com.yandex.plus.home.dailyquests.feature.internal.domain.b bVar5 = new com.yandex.plus.home.dailyquests.feature.internal.domain.b(cVar5, iVar);
                com.yandex.plus.home.dailyquests.feature.internal.domain.b bVar6 = new com.yandex.plus.home.dailyquests.feature.internal.domain.b(cVar5);
                com.yandex.plus.home.dailyquests.plugin.internal.proxy.d dVar = (com.yandex.plus.home.dailyquests.plugin.internal.proxy.d) cVar4.b;
                com.yandex.plus.home.dailyquests.plugin.internal.proxy.a aVar3 = (com.yandex.plus.home.dailyquests.plugin.internal.proxy.a) cVar4.c;
                s sVar = new s(a);
                l lVar = new l(15);
                f fVar = new f(14);
                ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) cVar4.g)).getClass();
                return new g(bVar3.a, new rjf(bVar4, bVar5, bVar6, dVar, aVar3, hVar2, sVar, lVar, fVar, com.yandex.plus.core.dispatcher.a.c, ((Boolean) ((k) cVar4.h).invoke()).booleanValue()));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                Function0 function0 = (Function0) obj2;
                if (((Number) ((sdr) obj).getValue()).floatValue() == 1.0f) {
                    function0.invoke();
                }
                return Unit.a;
            default:
                l3o l3oVar2 = (l3o) obj;
                mns mnsVar = (mns) ((ljn) obj2).a.b.get();
                if (mnsVar != null && (l3oVar = l3oVar2.h) != null && (d0oVar = l3oVar.a) != null) {
                    String a2 = d0oVar.c.a("Authorization");
                    mns mnsVar2 = a2 != null ? new mns(kotlin.text.c.r(a2, "OAuth ", "", false)) : null;
                    if (mnsVar2 != null && mnsVar2.equals(mnsVar)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
