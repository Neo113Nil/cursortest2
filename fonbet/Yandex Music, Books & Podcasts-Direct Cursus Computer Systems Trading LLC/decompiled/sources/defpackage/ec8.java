package defpackage;

import android.os.Handler;
import android.util.Base64;
import android.view.View;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.DataSourceParameters;
import ru.yandex.video.m3.data.DelegatePrepareParams;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.drm.DrmSessionManagerMode;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class ec8 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec8(g23 g23Var, f23 f23Var, e23 e23Var, pz9 pz9Var, tz9 tz9Var, l0a l0aVar, pm9 pm9Var) {
        super(0);
        this.r = 1;
        this.s = g23Var;
        this.t = f23Var;
        this.u = e23Var;
        this.v = pz9Var;
        this.w = tz9Var;
        this.x = l0aVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ic8 histogramReporter;
        ic8 histogramReporter2;
        grm grmVar;
        af9 af9Var;
        eqb a;
        rmh io7Var;
        DrmSessionManagerMode drmSessionManagerMode;
        HashSet u0;
        Object t7oVar;
        String str;
        rmh rmhVar;
        rmh rmhVar2;
        yeg yegVar = null;
        int i = 0;
        boolean z = true;
        int i2 = 1;
        switch (this.r) {
            case 0:
                f23 f23Var = (f23) this.t;
                qv8 qv8Var = (qv8) this.w;
                rv8 rv8Var = (rv8) this.v;
                gc8 gc8Var = (gc8) this.u;
                ((g23) this.s).d();
                try {
                    histogramReporter = gc8Var.getHistogramReporter();
                    histogramReporter.getClass();
                    histogramReporter.h = Long.valueOf(vp4.a());
                    dfb b = gc8Var.getViewComponent$div_release().i().b(gc8Var.getDivData(), gc8Var.getDataTag());
                    if (b != null) {
                        b.c();
                    }
                    gc8Var.set_divData(rv8Var);
                    gc8Var.getDiv2Component$div_release().n().c(gc8Var.getDataTag(), qv8Var.b, true);
                    hp8 v = gc8Var.getDiv2Component$div_release().v();
                    e23 bindingContext$div_release = gc8Var.getBindingContext$div_release();
                    View childAt = gc8Var.getChildAt(0);
                    jc8 jc8Var = qv8Var.a;
                    long j = qv8Var.b;
                    StringBuilder sb = new StringBuilder();
                    sb.append(j);
                    dp8 d = jc8Var.d();
                    String H = d instanceof dm9 ? wvo.H((dm9) d) : d.getId();
                    sb.append(H != null ? StringUtils.PROCESS_POSTFIX_DELIMITER.concat(H) : "");
                    v.b(bindingContext$div_release, childAt, jc8Var, new pm9(c5b.a, 8, t75.c(sb.toString()), j));
                    gc8Var.requestLayout();
                    gc8Var.X(rv8Var);
                    histogramReporter2 = gc8Var.getHistogramReporter();
                    histogramReporter2.d();
                    ((j23) this.x).getClass();
                    g23.b(f23Var);
                    return Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            case 1:
                f23 f23Var2 = (f23) this.t;
                e23 e23Var = (e23) this.u;
                pz9 pz9Var = (pz9) this.v;
                tz9 tz9Var = (tz9) this.w;
                l0a l0aVar = (l0a) this.x;
                ((g23) this.s).d();
                try {
                    xzb xzbVar = e23Var.b;
                    gc8 gc8Var2 = e23Var.a;
                    List N = lg3.N(pz9Var, xzbVar);
                    xe9 H2 = tz9.H(tz9Var, pz9Var, xzbVar);
                    we9 we9Var = tz9Var.f;
                    if (N.isEmpty() && pz9Var.z == null) {
                        tz9.I(tz9Var, gc8Var2, pz9Var);
                    }
                    af9 playerView = l0aVar.getPlayerView();
                    int childCount = l0aVar.getChildCount();
                    while (true) {
                        if (i < childCount) {
                            View childAt2 = l0aVar.getChildAt(i);
                            if (childAt2 instanceof grm) {
                                grmVar = (grm) childAt2;
                            } else {
                                i++;
                            }
                        } else {
                            grmVar = null;
                        }
                    }
                    if (playerView == null) {
                        af9Var = we9Var.a(l0aVar.getContext());
                        af9Var.setVisibility(4);
                    } else {
                        af9Var = playerView;
                    }
                    grm grmVar2 = grmVar == null ? new grm(l0aVar.getContext()) : grmVar;
                    grm grmVar3 = grmVar;
                    tz9.G(tz9Var, pz9Var, xzbVar, new lj0(28, af9Var, grmVar2, e23Var));
                    se9 c = we9Var.c(N, H2);
                    grm grmVar4 = grmVar2;
                    c.f(new rz9(tz9Var, gc8Var2, e23Var.b, pz9Var, grmVar4));
                    af9Var.a(c);
                    String str2 = pz9Var.m;
                    if (str2 != null) {
                        l0aVar.f(tz9Var.b.l(e23Var, str2, new bnd(25, c)));
                    }
                    l0aVar.f(pz9Var.w.d(xzbVar, new az6(28, c)));
                    l0aVar.f(pz9Var.G.d(xzbVar, new sv4(27, af9Var, grmVar4)));
                    tz9.J(tz9Var, (l0a) this.x, pz9Var, xzbVar, c, gc8Var2);
                    if (grmVar3 == null && playerView == null) {
                        l0aVar.removeAllViews();
                        l0aVar.addView(af9Var);
                        l0aVar.addView(grmVar4);
                    }
                    tz9Var.d.a.put(l0aVar, pz9Var);
                    g23.b(f23Var2);
                    return Unit.a;
                } finally {
                    g23.b(f23Var2);
                }
            case 2:
                int sourceIndex = ((DelegatePrepareParams) this.s).getSourceIndex();
                wa6 wa6Var = ((crb) this.t).z;
                if (wa6Var != null) {
                    wa6Var.accept(Integer.valueOf(sourceIndex));
                }
                ((crb) this.t).I.f.set(false);
                crb crbVar = (crb) this.t;
                crbVar.K.l = false;
                c38 c38Var = crbVar.O;
                c38Var.a = -9223372036854775807L;
                c38Var.b = -9223372036854775807L;
                ybr ybrVar = crbVar.G;
                ybrVar.h = null;
                ybrVar.b = null;
                ybrVar.d = null;
                ybrVar.e = null;
                ybrVar.f = null;
                ybrVar.g = null;
                ybrVar.b();
                ybrVar.l.removeCallbacksAndMessages(null);
                try {
                    ((crb) this.t).h.getClass();
                    z0j z0jVar = ((crb) this.t).H;
                    String str3 = (String) this.u;
                    Long l = (Long) this.v;
                    z0jVar.getClass();
                    z0jVar.d = str3;
                    if (l.longValue() != 0) {
                        z = false;
                    }
                    z0jVar.b = z;
                    crb crbVar2 = (crb) this.t;
                    gom gomVar = crbVar2.L;
                    if (gomVar == null) {
                        ((ConcurrentHashMap) crbVar2.P.c).clear();
                        a = new iqb();
                    } else {
                        a = crbVar2.d.a(gomVar.c, crbVar2.P);
                    }
                    crb crbVar3 = (crb) this.t;
                    gom gomVar2 = crbVar3.L;
                    if (gomVar2 != null && (rmhVar2 = gomVar2.a) != null) {
                        rmhVar2.b(crbVar3.A);
                    }
                    gom gomVar3 = ((crb) this.t).L;
                    if (gomVar3 != null && (rmhVar = gomVar3.a) != null) {
                        smh smhVar = rmhVar instanceof smh ? (smh) rmhVar : null;
                        if (smhVar != null) {
                            ((jxj) smhVar).c = Integer.valueOf(sourceIndex);
                        }
                    }
                    gom gomVar4 = ((crb) this.t).L;
                    if (gomVar4 == null || (io7Var = gomVar4.a) == null) {
                        io7Var = new io7();
                    }
                    a.b(io7Var);
                    gom gomVar5 = ((crb) this.t).L;
                    if (gomVar5 == null || gomVar5.b == null || (drmSessionManagerMode = DrmSessionManagerMode.QUERY) == null) {
                        drmSessionManagerMode = DrmSessionManagerMode.PLAYBACK;
                    }
                    a.c(drmSessionManagerMode, (gomVar5 == null || (str = gomVar5.b) == null) ? null : Base64.decode(str, 2));
                    String str4 = (String) this.u;
                    crb crbVar4 = (crb) this.t;
                    bl2 bl2Var = crbVar4.g.c;
                    ybr ybrVar2 = crbVar4.G;
                    DataSourceParameters dataSourceParameters = (DataSourceParameters) this.w;
                    DataSourceParameters dataSourceParameters2 = (DataSourceParameters) this.x;
                    DelegatePrepareParams delegatePrepareParams = (DelegatePrepareParams) this.s;
                    Object obj = crbVar4.r;
                    if (obj == null) {
                        obj = ehv.f;
                    }
                    hgp hgpVar = new hgp();
                    hgpVar.d = str4;
                    hgpVar.b = a;
                    hgpVar.c = bl2Var;
                    hgpVar.e = crbVar4;
                    hgpVar.f = ybrVar2;
                    hgpVar.a = obj;
                    hgpVar.g = dataSourceParameters;
                    hgpVar.h = dataSourceParameters2;
                    hgpVar.i = delegatePrepareParams;
                    wvh a2 = crbVar4.b.a(hgpVar);
                    vyi vyiVar = a2 instanceof vyi ? (vyi) a2 : null;
                    crb crbVar5 = (crb) this.t;
                    if (crbVar5.t != null) {
                        boolean P = crbVar5.r.P();
                        yeg yegVar2 = new yeg();
                        yegVar2.a = P;
                        yegVar = yegVar2;
                    }
                    crb crbVar6 = (crb) this.t;
                    a2.b((Handler) crbVar6.f.b, new uue(crbVar6.m, crbVar6, yegVar));
                    Long l2 = (Long) this.v;
                    if (((crb) this.t).q && l2.longValue() == 0) {
                        ((crb) this.t).a.U0(a2);
                    } else {
                        ((crb) this.t).a.X0(a2, ((Long) this.v).longValue());
                    }
                    ((crb) this.t).a.q();
                    ((crb) this.t).h.getClass();
                    yjj yjjVar = ((crb) this.t).m;
                    synchronized (yjjVar.a) {
                        u0 = CollectionsKt.u0(yjjVar.a);
                    }
                    Iterator it = u0.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        try {
                            r7o r7oVar = z7o.b;
                            zbl zblVar = (zbl) next;
                            if (vyiVar != null) {
                                zblVar.R(vyiVar.d(), vyiVar.g());
                            }
                            t7oVar = Unit.a;
                        } catch (Throwable th2) {
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(th2);
                        }
                        Throwable a3 = z7o.a(t7oVar);
                        if (a3 != null) {
                            Timber.INSTANCE.e(a3, "notifyObservers", new Object[0]);
                        }
                    }
                    return Unit.a;
                } finally {
                    ((crb) this.t).h.getClass();
                    PlaybackException e = hrb.e(th);
                    ((crb) this.t).h.getClass();
                }
            default:
                goo gooVar = (goo) this.s;
                zoo zooVar = (zoo) this.t;
                koo kooVar = (koo) this.u;
                String str5 = (String) this.v;
                Object obj2 = this.w;
                Object[] objArr = (Object[]) this.x;
                if (gooVar.b != kooVar) {
                    gooVar.b = kooVar;
                    i = 1;
                }
                if (Intrinsics.d(gooVar.c, str5)) {
                    i2 = i;
                } else {
                    gooVar.c = str5;
                }
                gooVar.a = zooVar;
                gooVar.d = obj2;
                gooVar.e = objArr;
                joo jooVar = gooVar.f;
                if (jooVar != null && i2 != 0) {
                    ((lum) jooVar).l0();
                    gooVar.f = null;
                    gooVar.a();
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ec8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        super(0);
        this.r = i;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
        this.v = obj4;
        this.w = obj5;
        this.x = obj6;
    }
}
