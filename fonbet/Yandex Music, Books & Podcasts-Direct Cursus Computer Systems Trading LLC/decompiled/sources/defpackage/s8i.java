package defpackage;

import android.content.Context;
import android.net.Uri;
import android.widget.FrameLayout;
import com.yandex.music.shared.plus.features.plaque.api.PlusPlaqueContainerView;
import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.home.api.panel.g;
import com.yandex.plus.home.feature.webviews.internal.container.t;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internal.uri.j;
import com.yandex.plus.log.api.a;
import com.yandex.plus.log.api.b;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class s8i implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s8i(qqi qqiVar, pqi pqiVar) {
        this.a = 1;
        this.b = qqiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01e7, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r0.d) > 1000) goto L59;
     */
    /* JADX WARN: Type inference failed for: r0v97, types: [java.lang.Object, mhp] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        qec qecVar;
        int i = 2;
        boolean z = true;
        int i2 = 3;
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                w8i w8iVar = (w8i) this.b;
                ((Boolean) obj).getClass();
                b9i b9iVar = w8iVar.a;
                x97.y(ot0.F(b9iVar), null, null, new m1i(b9iVar, continuation, i2), 3);
                break;
            case 1:
                ((qqi) this.b).b(null);
                break;
            case 2:
                dvi dviVar = (dvi) this.b;
                ((Boolean) obj).getClass();
                rvi rviVar = dviVar.a;
                if (((z66) rviVar.q.getValue()).g()) {
                    xdr xdrVar = rviVar.k;
                    gvi gviVar = gvi.a;
                    xdrVar.getClass();
                    xdrVar.m(null, gviVar);
                    xdr xdrVar2 = rviVar.l;
                    Boolean bool = Boolean.TRUE;
                    xdrVar2.getClass();
                    xdrVar2.m(null, bool);
                } else {
                    x97.y(ot0.F(rviVar), null, null, new ovi(rviVar, continuation, i), 3);
                }
                break;
            case 3:
                s3j s3jVar = (s3j) this.b;
                ((Boolean) obj).getClass();
                s3jVar.a.G();
                break;
            case 4:
                qnq qnqVar = (qnq) this.b;
                Throwable th = (Throwable) obj;
                th.getClass();
                hn5 hn5Var = qnqVar.b;
                hn5Var.getClass();
                new lum(hn5Var).Q(th);
                break;
            case 5:
                q6j q6jVar = (q6j) this.b;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                cib cibVar = q6jVar.a;
                if (cibVar != null && (qecVar = (qec) ((z0j) cibVar.b).c) != null) {
                    p6j p6jVar = (p6j) qecVar.b;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(z66.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    x66 a = ((z66) qdcVar.C(I)).a();
                    if (a.a) {
                        p6jVar.B();
                    } else if (booleanValue) {
                        hld.H(p6jVar.getContext(), a);
                    }
                }
                break;
            case 6:
                ebj ebjVar = (ebj) this.b;
                ((Boolean) obj).getClass();
                ebjVar.b.S();
                break;
            case 7:
                e00 e00Var = (e00) this.b;
                ((l13) obj).getClass();
                wbj wbjVar = (wbj) e00Var.b;
                break;
            case 8:
                udb udbVar = (udb) this.b;
                mm4 mm4Var = (mm4) obj;
                mm4Var.getClass();
                List list = (List) udbVar.c;
                list.getClass();
                mm4Var.b = list;
                break;
            case 9:
                nmj nmjVar = (nmj) this.b;
                ((is6) obj).getClass();
                break;
            case 10:
                wsj wsjVar = (wsj) this.b;
                eul eulVar = (eul) obj;
                eulVar.getClass();
                break;
            case 11:
                g5k g5kVar = (g5k) this.b;
                ((Context) obj).getClass();
                g gVar = ((s5k) g5kVar.e.getValue()).a.i;
                gVar.setVisibility(8);
                break;
            case 12:
                tck tckVar = (tck) this.b;
                mm6 mm6Var = (mm6) obj;
                mm6Var.getClass();
                x97.y(mm6Var, null, null, new m1i(tckVar, continuation, 24), 3);
                break;
            case 13:
                m88 m88Var = (m88) this.b;
                l13 l13Var = (l13) obj;
                l13Var.getClass();
                bdt I2 = hag.I(b4m.class);
                qdc qdcVar2 = l13Var.a;
                Set set = l13Var.b;
                break;
            case 14:
                r3q r3qVar = (r3q) this.b;
                ((List) obj).getClass();
                break;
            case 15:
                rjp rjpVar = (rjp) this.b;
                mqs mqsVar = (mqs) obj;
                mqsVar.getClass();
                break;
            case 16:
                qfj qfjVar = (qfj) this.b;
                grc grcVar = frc.a;
                grcVar.getClass();
                grcVar.b.remove(qfjVar);
                break;
            case 17:
                lm4 lm4Var = (lm4) this.b;
                jfl jflVar = (jfl) obj;
                jflVar.getClass();
                if (!(jflVar instanceof hfl)) {
                    if (!jflVar.equals(ifl.a)) {
                        b6e.s();
                        break;
                    }
                } else {
                    r5 = lm4Var.i(((hfl) jflVar).b);
                }
                break;
            case 18:
                til tilVar = (til) this.b;
                x1u x1uVar = (x1u) obj;
                x1uVar.getClass();
                new tao((mvp) tilVar.f.getValue(), pd.t(new qzm[0]), tilVar.b, tilVar.a, tilVar.c.a, 0).r(x1uVar);
                break;
            case 19:
                t1f t1fVar = (t1f) this.b;
                mwk mwkVar = (mwk) obj;
                mwkVar.getClass();
                break;
            case 20:
                xpl xplVar = (xpl) this.b;
                e6l e6lVar = (e6l) obj;
                e6lVar.getClass();
                if (!e6lVar.equals(b6l.a) && !(e6lVar instanceof c6l)) {
                    if (!(e6lVar instanceof d6l)) {
                        b6e.s();
                        break;
                    } else {
                        d6l d6lVar = (d6l) e6lVar;
                        if (d6lVar.b != w0l.b) {
                            if (((Boolean) wdg.A(d6lVar.a, zbn.a)).booleanValue()) {
                                break;
                            }
                        }
                    }
                }
                z = false;
                break;
            case 21:
                cyl cylVar = (cyl) this.b;
                ((Boolean) obj).getClass();
                n0m n0mVar = cylVar.a;
                if (n0mVar.t.g()) {
                    n0mVar.H();
                    x97.y(ot0.F(n0mVar), null, null, new d0m(n0mVar, continuation, 7), 3);
                } else {
                    n0mVar.J();
                }
                break;
            case 22:
                pzl pzlVar = (pzl) this.b;
                ((l13) obj).getClass();
                qdc qdcVar3 = (qdc) pzlVar.b;
                break;
            case 23:
                j3m j3mVar = (j3m) this.b;
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.i(jfpVar, new ky4(j3mVar.b.size(), 1));
                break;
            case 24:
                ?? r0 = this.b;
                int intValue = ((Integer) obj).intValue();
                break;
            case 25:
                qzc qzcVar = (qzc) this.b;
                Context context = (Context) obj;
                context.getClass();
                PlusPlaqueContainerView plusPlaqueContainerView = new PlusPlaqueContainerView(context, null, 0, 6, null);
                qzcVar.getClass();
                context.getClass();
                plusPlaqueContainerView.a(context, (g9m) qzcVar.b);
                break;
            case 26:
                aam aamVar = (aam) this.b;
                ((Context) obj).getClass();
                v9m v9mVar = aamVar.a;
                FrameLayout frameLayout = v9mVar.a.K;
                l1j l1jVar = new l1j(17);
                WeakHashMap weakHashMap = wdu.a;
                ndu.n(frameLayout, l1jVar);
                ox6.B(v9mVar.b, aamVar.d, new gfl(10, aamVar));
                String str = aamVar.c;
                t tVar = v9mVar.a;
                s sVar = tVar.i;
                b bVar = tVar.u;
                a aVar = a.b;
                if (bVar.b(aVar)) {
                    bVar.c(aVar, "WebViewsControllerImpl", hrg.q("showWithDeeplink(deeplink=", str, ", from=deeplink, place=null, payload=null)"));
                }
                FrameLayout frameLayout2 = tVar.K;
                if (!frameLayout2.isAttachedToWindow()) {
                    frameLayout2.addOnAttachStateChangeListener(new com.yandex.passport.common.ui.view.b(frameLayout2, tVar, str, i));
                    break;
                } else {
                    Object r = sVar.r(Uri.parse(str));
                    if (r instanceof t7o) {
                        r = null;
                    }
                    j jVar = (j) r;
                    if (jVar == null) {
                        jVar = (com.yandex.plus.home.feature.webviews.internal.uri.b) ((jyr) sVar.e).getValue();
                    }
                    u.b(tVar, jVar, false, null, 4);
                    break;
                }
            case 27:
                jbm jbmVar = (jbm) this.b;
                ((Boolean) obj).booleanValue();
                gcm gcmVar = jbmVar.a;
                ie5 ie5Var = gcmVar.m;
                if (gcmVar.p.g()) {
                    gcmVar.J();
                    ie5Var.c();
                } else {
                    ie5Var.f();
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                efm efmVar = (efm) this.b;
                String str2 = (String) obj;
                str2.getClass();
                xdr xdrVar3 = efmVar.m;
                xdrVar3.getClass();
                xdrVar3.m(null, str2);
                break;
            default:
                kgm kgmVar = (kgm) this.b;
                mm4 mm4Var2 = (mm4) obj;
                mm4Var2.getClass();
                ff7.N(ekr.a);
                mm4.a(mm4Var2, "type", tkr.b);
                mm4.a(mm4Var2, Constants.KEY_VALUE, avf.y("kotlinx.serialization.Polymorphic<" + ((lm4) kgmVar.a).h() + '>', shp.b, new mhp[0]));
                List list2 = kgmVar.b;
                list2.getClass();
                mm4Var2.b = list2;
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ s8i(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ s8i(knq knqVar, Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
