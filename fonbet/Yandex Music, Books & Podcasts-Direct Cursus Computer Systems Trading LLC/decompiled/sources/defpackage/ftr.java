package defpackage;

import android.net.http.SslError;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.work.impl.WorkDatabase;
import com.yandex.passport.common.core.f;
import com.yandex.passport.internal.flags.o;
import com.yandex.passport.internal.properties.r;
import com.yandex.passport.internal.properties.u;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.j8;
import com.yandex.passport.internal.report.reporters.h0;
import com.yandex.passport.internal.report.reporters.i0;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomSheetComposeActivity;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.p;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.r0;
import com.yandex.passport.internal.ui.sloth.q;
import com.yandex.passport.sloth.ui.error.a;
import com.yandex.passport.sloth.ui.error.b;
import com.yandex.passport.sloth.ui.error.c;
import com.yandex.passport.sloth.ui.error.e;
import com.yandex.plus.bdui.flex.utils.g;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class ftr implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ftr(gtv gtvVar, String str, String str2) {
        this.a = 17;
        this.d = gtvVar;
        this.b = str;
        this.c = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long j;
        final boolean z;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.a) {
            case 0:
                return new tn((String) this.b, (String) this.c, ((htr) this.d).c);
            case 1:
                pfm pfmVar = (pfm) this.b;
                Function1 function1 = (Function1) this.c;
                aqi aqiVar = (aqi) this.d;
                iur iurVar = (iur) pfmVar;
                if (Math.abs(Float.intBitsToFloat((int) (((enj) aqiVar.getValue()).a >> 32))) > iurVar.getDensity() * 50 && Math.abs(Float.intBitsToFloat((int) (((enj) aqiVar.getValue()).a & 4294967295L))) < iurVar.getDensity() * 30) {
                    function1.invoke(Float.intBitsToFloat((int) (((enj) aqiVar.getValue()).a >> 32)) > 0.0f ? yur.b : yur.a);
                }
                aqiVar.setValue(new enj(0L));
                return Unit.a;
            case 2:
                rar rarVar = (rar) this.b;
                ExoPlayer exoPlayer = (ExoPlayer) this.c;
                tzs tzsVar = (tzs) this.d;
                rarVar.g(null);
                exoPlayer.x0(tzsVar);
                return Unit.a;
            case 3:
                njt njtVar = (njt) this.b;
                spd spdVar = (spd) this.c;
                yit yitVar = (yit) this.d;
                cvo cvoVar = njtVar.b;
                jab jabVar = new jab(qkb.Carousel, spdVar.a + 1, spdVar.b + 1, 1);
                pkb pkbVar = pkb.Wave;
                String str = ((llu) yitVar).a.a;
                int i = spdVar.a;
                int i2 = spdVar.b;
                str.getClass();
                return new w5l(cvoVar, jabVar, new thj(pkbVar, str, i, i2, ""), null);
            case 4:
                return new zcr((y6u) ((jyr) this.b).getValue(), (agn) ((jyr) this.c).getValue(), (uoh) this.d);
            case 5:
                return new Pair(((sbu) this.d).d.getValue(), Boolean.valueOf(((u7l) ((sdr) this.b).getValue()).a || ((Boolean) ((aqi) this.c).getValue()).booleanValue()));
            case 6:
                return new i3((jnq) this.b, (hoq) this.c, (wn5) this.d);
            case 7:
                ((csu) this.b).a((r3s) this.c, (co5) this.d);
                return Unit.a;
            case 8:
                nru nruVar = (nru) this.b;
                hsu hsuVar = (hsu) this.c;
                sai saiVar = (sai) this.d;
                nruVar.j(hsuVar);
                saiVar.a();
                return Unit.a;
            case 9:
                rmb rmbVar = (rmb) this.b;
                sai saiVar2 = (sai) this.c;
                o1v o1vVar = (o1v) this.d;
                rmb.j(rmbVar, wjb.SettingsScreen, null, null, 14);
                saiVar2.a();
                o1vVar.invoke();
                return Unit.a;
            case 10:
                return sk3.a0((mm6) this.d, ((uwu) this.b).a(o8g.E(((twu) this.c).d)));
            case 11:
                jap japVar = (jap) this.b;
                Function1 function12 = (Function1) this.c;
                aqi aqiVar2 = (aqi) this.d;
                if (!japVar.a()) {
                    function12.invoke(aqiVar2.getValue());
                }
                return Unit.a;
            case 12:
                n7v n7vVar = (n7v) this.b;
                z8v z8vVar = (z8v) this.c;
                c8v c8vVar = (c8v) this.d;
                m6v m6vVar = z8vVar.a;
                n6v n6vVar = ((a8v) c8vVar).a;
                n7vVar.getClass();
                m6vVar.getClass();
                n6vVar.getClass();
                n7vVar.i.p(m6vVar, n6vVar);
                return Unit.a;
            case 13:
                r4v r4vVar = (r4v) this.b;
                m6v m6vVar2 = (m6v) this.c;
                n6v n6vVar2 = (n6v) this.d;
                r4vVar.getClass();
                n6vVar2.getClass();
                r4vVar.g.p(m6vVar2, n6vVar2);
                return Unit.a;
            case 14:
                lev levVar = (lev) this.b;
                SslError sslError = (SslError) this.c;
                aqi aqiVar3 = (aqi) this.d;
                ssg.a(6, levVar.c, k5r.l("error while loading ", sslError.getPrimaryError(), sslError.getUrl(), " with "), null);
                tdv tdvVar = (tdv) aqiVar3.getValue();
                if (tdvVar != null) {
                    tdvVar.m(sslError);
                }
                return Unit.a;
            case 15:
                ((q0v) this.b).invoke(((List) this.c).get(((Number) ((sdr) this.d).getValue()).intValue()));
                return Unit.a;
            case 16:
                ((q0v) this.b).invoke(((List) this.c).get(((fp7) this.d).j()));
                return Unit.a;
            case 17:
                return ((Boolean) ((gtv) this.d).a.getValue()).booleanValue() ? (String) this.b : (String) this.c;
            case 18:
                sdr sdrVar = (sdr) this.b;
                lyv lyvVar = (lyv) this.c;
                geh gehVar = (geh) this.d;
                jtv a = ((yyv) sdrVar.getValue()).c.a();
                if (a == null || lyvVar.d.isEmpty()) {
                    return null;
                }
                geh G = hag.G(a);
                rxv rxvVar = lyvVar.a;
                gehVar.getClass();
                int i3 = G.a;
                long d = rxvVar.d();
                rk6 rk6Var = rxvVar.k;
                int i4 = gehVar.b;
                int i5 = gehVar.a;
                int i6 = G.b;
                if (i4 != i6 || i5 <= i3) {
                    j = 4294967295L;
                } else {
                    j = 4294967295L;
                    if (i5 == ((int) (d >> 32)) + rk6Var.a) {
                        return geh.a(gehVar, i5 + 1, 0, 2);
                    }
                }
                if (i4 == i6 && i5 < i3 && i5 == ((int) (d >> 32)) - rk6Var.b) {
                    return geh.a(gehVar, i5 - 1, 0, 2);
                }
                int i7 = i3 - 1;
                int i8 = i3 + 1;
                if (i7 > i5 || i5 > i8 || i4 <= i6 || i4 != ((int) (d & j)) + rk6Var.c) {
                    return null;
                }
                return geh.a(gehVar, 0, i4 + 1, 1);
            case 19:
                i3w i3wVar = (i3w) this.b;
                t1w t1wVar = (t1w) this.c;
                kxi kxiVar = (kxi) this.d;
                cq4 F = ot0.F(t1wVar);
                p0w K = t1wVar.K();
                ia0 ia0Var = i3wVar.a;
                K.getClass();
                return new a3w((k6t) ia0Var.a, (f7l) ia0Var.b, (k1l) ia0Var.c, (q7l) ia0Var.d, (z6u) ia0Var.e, (g0l) ia0Var.f, kxiVar, (nxv) ia0Var.g, F, K);
            case 20:
                g4w g4wVar = (g4w) this.c;
                String str2 = (String) this.b;
                p4w p4wVar = (p4w) this.d;
                x4w A = g4wVar.c.A();
                List f = A.f(str2);
                if (f.size() > 1) {
                    qq6.d("Can't apply UPDATE policy to the chains of work.");
                    return null;
                }
                r4w r4wVar = (r4w) CollectionsKt.firstOrNull(f);
                if (r4wVar == null) {
                    p8b.a(new s3w(g4wVar, str2, opb.b, t75.c(p4wVar), 0));
                    return Unit.a;
                }
                String str3 = r4wVar.a;
                t4w e = A.e(str3);
                if (e == null) {
                    xq0.q(hrg.s("WorkSpec with ", str3, ", that matches a name \"", str2, "\", wasn't found"));
                    return null;
                }
                if (!e.c()) {
                    qq6.d("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                    return null;
                }
                if (r4wVar.b == c4w.f) {
                    A.c(str3);
                    p8b.a(new s3w(g4wVar, str2, opb.b, t75.c(p4wVar), 0));
                    return Unit.a;
                }
                final t4w b = t4w.b(p4wVar.b, r4wVar.a, null, null, null, 0, 0L, 0, 0, 0L, 0, 33554430);
                htm htmVar = g4wVar.f;
                htmVar.getClass();
                final WorkDatabase workDatabase = g4wVar.c;
                workDatabase.getClass();
                r46 r46Var = g4wVar.b;
                r46Var.getClass();
                final List list = g4wVar.e;
                list.getClass();
                final Set set = p4wVar.c;
                final String str4 = b.a;
                final t4w e2 = workDatabase.A().e(str4);
                if (e2 == null) {
                    xq0.x(hrg.q("Worker with ", str4, " doesn't exist"));
                    return null;
                }
                if (e2.b.a()) {
                    f4w[] f4wVarArr = f4w.a;
                } else {
                    if (e2.c() ^ b.c()) {
                        StringBuilder sb = new StringBuilder("Can't update ");
                        sb.append(e2.c() ? "Periodic" : "OneTime");
                        sb.append(" Worker to ");
                        throw new UnsupportedOperationException(su4.o(sb, b.c() ? "Periodic" : "OneTime", " Worker. Update operation must preserve worker's type."));
                    }
                    synchronized (htmVar.k) {
                        z = htmVar.c(str4) != null;
                    }
                    if (!z) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((kto) it.next()).b(str4);
                        }
                    }
                    workDatabase.s(new b6n(25, new Runnable() { // from class: f5w
                        @Override // java.lang.Runnable
                        public final void run() {
                            WorkDatabase workDatabase2 = WorkDatabase.this;
                            x4w A2 = workDatabase2.A();
                            z4w B = workDatabase2.B();
                            t4w t4wVar = e2;
                            c4w c4wVar = t4wVar.b;
                            int i9 = t4wVar.k;
                            long j2 = t4wVar.n;
                            int i10 = t4wVar.t + 1;
                            int i11 = t4wVar.s;
                            long j3 = t4wVar.u;
                            int i12 = t4wVar.v;
                            t4w t4wVar2 = b;
                            t4w b2 = t4w.b(t4wVar2, null, c4wVar, null, null, i9, j2, i11, i10, j3, i12, 29613053);
                            if (t4wVar2.v == 1) {
                                b2.u = t4wVar2.u;
                                b2.v++;
                            }
                            t4w G2 = bow.G(list, b2);
                            A2.getClass();
                            up6.F(A2.a, false, true, new q0v(A2, G2));
                            B.getClass();
                            String str5 = str4;
                            str5.getClass();
                            up6.F(B.a, false, true, new v4w(str5, 9));
                            B.a(str5, set);
                            if (z) {
                                return;
                            }
                            A2.g(-1L, str5);
                            m4w z2 = workDatabase2.z();
                            z2.getClass();
                            up6.F(z2.a, false, true, new srp(str5, 27));
                        }
                    }));
                    if (!z) {
                        tto.b(r46Var, workDatabase, list);
                    }
                    f4w[] f4wVarArr2 = f4w.a;
                }
                return Unit.a;
            case 21:
                return new sqd("ynison.music.yandex.net:443", ((dd4) this.b).a("ynison.music.yandex.net:443", null, new lqn("redirector", new xum(8, (uiq) this.c, (dgw) this.d))));
            case 22:
                xpn xpnVar = (xpn) this.b;
                dd4 dd4Var = (dd4) this.c;
                dgw dgwVar = (dgw) this.d;
                wpn wpnVar = xpnVar.d;
                c9n c9nVar = wpnVar != null ? new c9n(wpnVar.a, wpnVar.b, 2) : null;
                String str5 = xpnVar.b;
                return new sqd(str5, dd4Var.a(str5, c9nVar, new lqn("ynison_redirector_sesion(session=" + xpnVar.a + ", ticket=" + xpnVar.c + ")", new itv(15, xpnVar, dgwVar))));
            case 23:
                Function1 function13 = (Function1) this.b;
                List list2 = (List) this.c;
                u6k u6kVar = (u6k) this.d;
                if (u6kVar.h() != -1) {
                    function13.invoke(list2.get(u6kVar.h()));
                }
                return Unit.a;
            case 24:
                p pVar = (p) this.b;
                LogoutBottomSheetComposeActivity logoutBottomSheetComposeActivity = (LogoutBottomSheetComposeActivity) this.c;
                u uVar = (u) this.d;
                int i9 = LogoutBottomSheetComposeActivity.f;
                (((Boolean) pVar.getFlagRepository().b(o.X)).booleanValue() ? logoutBottomSheetComposeActivity.e : logoutBottomSheetComposeActivity.d).a(new r(uVar.a, uVar.e, uVar.b, uVar.f));
                return Unit.a;
            case 25:
                Function1 function14 = (Function1) this.b;
                h0 h0Var = (h0) this.c;
                com.yandex.passport.internal.ui.challenge.logout.bottomsheet.h0 h0Var2 = (com.yandex.passport.internal.ui.challenge.logout.bottomsheet.h0) this.d;
                function14.invoke(r0.e);
                f fVar = h0Var2.a;
                i0 i0Var = (i0) h0Var;
                i0Var.getClass();
                fVar.getClass();
                i0Var.n(j8.d, new ff(fVar));
                return Unit.a;
            case 26:
                mm6 mm6Var = (mm6) this.b;
                aqi aqiVar4 = (aqi) this.c;
                xpi xpiVar = (xpi) this.d;
                aqiVar4.setValue(null);
                x97.y(mm6Var, null, null, new r1w(xpiVar, objArr == true ? 1 : 0, 26), 3);
                return Unit.a;
            case 27:
                e eVar = (e) this.b;
                Function0 function0 = (Function0) this.c;
                Function1 function15 = (Function1) this.d;
                c cVar = eVar.d;
                if (cVar instanceof a) {
                    function0.invoke();
                } else if (cVar instanceof b) {
                    function15.invoke(((b) cVar).a);
                } else if (cVar != null) {
                    b6e.s();
                    return null;
                }
                return Unit.a;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                x97.y((mm6) this.b, null, null, new q(this.c, this.d, (Continuation) (objArr2 == true ? 1 : 0), 22), 3);
                return Unit.a;
            default:
                return new g((com.yandex.plus.bdui.flex.factory.e) this.b, (com.yandex.plus.bdui.plus.content.controller.f) this.c, ((com.yandex.plus.bdui.flex.action.f) this.d).d, "FlexActionHandler", "Action");
        }
    }

    public /* synthetic */ ftr(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ ftr(g4w g4wVar, String str, rkk rkkVar) {
        this.a = 20;
        this.c = g4wVar;
        this.b = str;
        this.d = rkkVar;
    }
}
