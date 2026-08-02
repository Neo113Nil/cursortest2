package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.t;
import com.google.gson.Gson;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.main.MainScreenActivity;
import ru.yandex.music.nonmusic.shelf.screen.MyShelfEntitiesScreenActivity;
import ru.yandex.music.phonoteka.mymusic.CollectionMainActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class y6g implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y6g(wdj wdjVar, aqi aqiVar) {
        this.a = 23;
        this.c = wdjVar;
        this.b = aqiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.Map] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        fvs evsVar;
        int i = 8;
        boolean z = false;
        boolean z2 = false;
        fvs fvsVar = null;
        v0s v0sVar = null;
        switch (this.a) {
            case 0:
                return new Pair(((sdr) this.b).getValue(), Float.valueOf(((cjc) this.c).e()));
            case 1:
                arf arfVar = (arf) this.b;
                arf arfVar2 = (arf) this.c;
                if (arfVar != null) {
                    return arfVar2 == null ? (Map) arfVar.getValue() : uah.i((Map) arfVar2.getValue(), (Map) arfVar.getValue());
                }
                r6 = arfVar2 != null ? (Map) arfVar2.getValue() : null;
                if (r6 != null) {
                    return r6;
                }
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                return e5bVar;
            case 2:
                qe3 qe3Var = (qe3) this.b;
                x0h x0hVar = (x0h) this.c;
                qe3Var.a(sjb.LumenAwakened);
                q0h q0hVar = x0hVar.a;
                if (q0hVar.d()) {
                    q0hVar.i = true;
                    rar rarVar = q0hVar.j;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                    q0hVar.j = x97.y(q0hVar.a, null, null, new m0h(q0hVar, r6, 2), 3);
                }
                return Unit.a;
            case 3:
                sai saiVar = (sai) this.b;
                Function0 function0 = (Function0) this.c;
                saiVar.a();
                function0.invoke();
                return Unit.a;
            case 4:
                return ((Function1) this.b).invoke(((vdr) this.c).getValue());
            case 5:
                pbh pbhVar = (pbh) this.b;
                nbh nbhVar = (nbh) this.c;
                jx7 jx7Var = bcx.F(nbhVar).y;
                nbhVar.s.h();
                return Integer.valueOf(pbhVar.c(jx7Var, nbhVar.t.h()));
            case 6:
                ((Context) this.b).unregisterReceiver((l83) this.c);
                return Unit.a;
            case 7:
                ((Function1) this.b).invoke(((c8i) this.c).c);
                return Unit.a;
            case 8:
                x97.y((mm6) this.b, null, null, new dbi((bci) this.c, r6, z ? 1 : 0), 3);
                return Unit.a;
            case 9:
                no2 no2Var = (no2) this.b;
                jfu jfuVar = (jfu) this.c;
                e00 e00Var = no2Var.a;
                return new an2(jfuVar, new ri1(26, e00Var), new gn2(e00Var), new uu1(e00Var, 16));
            case 10:
                kii kiiVar = (kii) this.b;
                aqi aqiVar = (aqi) this.c;
                int i2 = kii.p;
                kiiVar.u();
                aqiVar.setValue(Boolean.TRUE);
                return Unit.a;
            case 11:
                return ghh.C((vm) this.b, (o0k) ((Function0) this.c).invoke());
            case 12:
                bmi bmiVar = (bmi) this.b;
                fvf fvfVar = (fvf) this.c;
                List list = bmiVar.b;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        ?? previous = listIterator.previous();
                        if (((v0s) previous).a <= fvfVar.h() + 1) {
                            v0sVar = previous;
                        }
                    }
                }
                v0s v0sVar2 = v0sVar;
                return v0sVar2 == null ? (v0s) CollectionsKt.Q(bmiVar.b) : v0sVar2;
            case 13:
                ArrayList arrayList = (ArrayList) this.b;
                gmi gmiVar = (gmi) this.c;
                return new kli(arrayList, gmiVar.k, gmiVar.l, gmiVar.m, gmiVar.n, gmiVar.o, new m2g(14, gmiVar, arrayList));
            case 14:
                ((svi) this.b).a(((dti) this.c).b);
                return Unit.a;
            case 15:
                dvi dviVar = (dvi) this.b;
                eti etiVar = (eti) CollectionsKt.Q(((mvi) this.c).a.b);
                pui puiVar = dviVar.b;
                etiVar.getClass();
                if (etiVar instanceof zsi) {
                    puiVar.d(((zsi) etiVar).b);
                } else if (etiVar instanceof ati) {
                    mqs mqsVar = ((ati) etiVar).b;
                    puiVar.getClass();
                    x97.y(puiVar.k, null, null, new zig(puiVar, mqsVar, r6, 28), 3);
                } else if (etiVar instanceof bti) {
                    puiVar.d(((bti) etiVar).b);
                } else if (etiVar instanceof cti) {
                    puiVar.d(((cti) etiVar).b);
                } else {
                    if (!(etiVar instanceof dti)) {
                        b6e.s();
                        return null;
                    }
                    puiVar.d(((dti) etiVar).b);
                }
                dviVar.a.G();
                return Unit.a;
            case 16:
                dvi dviVar2 = (dvi) this.b;
                String str = ((lvi) this.c).a.a;
                str.getClass();
                pui puiVar2 = dviVar2.b;
                puiVar2.getClass();
                psi psiVar = new psi(str, ysi.a);
                t tVar = puiVar2.a;
                int i3 = MyShelfEntitiesScreenActivity.Y;
                tVar.getClass();
                Intent putExtra = new Intent(tVar, (Class<?>) MyShelfEntitiesScreenActivity.class).putExtra("extra.activityParams", psiVar);
                putExtra.getClass();
                tVar.startActivity(putExtra);
                return Unit.a;
            case 17:
                x97.y((mm6) this.b, null, null, new yvi((aqi) this.c, r6, z2 ? 1 : 0), 3);
                return Unit.a;
            case 18:
                qn2 qn2Var = (qn2) this.b;
                ko2 ko2Var = (ko2) this.c;
                vo2 vo2Var = qn2Var.a;
                xiu xiuVar = qn2Var.b;
                ko2Var.getClass();
                if (ko2Var instanceof fo2) {
                    ((z66) xiuVar.c).i(u0j.b);
                } else if (ko2Var instanceof co2) {
                    vo2Var.H(ko2Var, wjb.DownloadedContentScreen);
                    Activity R = vq2.R((Context) xiuVar.b);
                    if (R != null) {
                        lhs lhsVar = MainScreenActivity.Q0;
                        R.startActivity(imp.J(R, rf3.l, null, w6h.a, 4));
                    }
                } else if (ko2Var instanceof ho2) {
                    vo2Var.H(ko2Var, wjb.SettingsAutoDownloadScreen);
                    Activity R2 = vq2.R((Context) xiuVar.b);
                    if (R2 != null) {
                        int i4 = CollectionMainActivity.v0;
                        R2.startActivity(men.B(R2, v35.l));
                    }
                } else if (!ko2Var.equals(lo2.a) && !ko2Var.equals(bo2.a)) {
                    b6e.s();
                    return null;
                }
                return Unit.a;
            case 19:
                i0j i0jVar = (i0j) this.b;
                xdh xdhVar = new xdh((Gson) this.c, i0jVar.i);
                h50 h50Var = i0jVar.c;
                h50Var.getClass();
                sci sciVar = new sci(xdhVar);
                h50Var.invoke(sciVar);
                ArrayList arrayList2 = sciVar.a;
                arrayList2.add(als.a);
                return new rci(xdhVar, arrayList2, sciVar.b);
            case 20:
                ime imeVar = (ime) this.b;
                asq.t(z5l.e((z5l) imeVar.b, (jw) this.c), (Context) imeVar.c, new p1n(i));
                return Unit.a;
            case 21:
                r8j r8jVar = (r8j) this.b;
                lt ltVar = (lt) this.c;
                e eVar = (e) r8jVar.s.getValue();
                PlaybackScope playbackScope = r8jVar.d;
                eVar.getClass();
                playbackScope.getClass();
                ltVar.getClass();
                return playbackScope.c(ltVar).a();
            case 22:
                ((Function1) this.b).invoke((te) this.c);
                return Unit.a;
            case 23:
                ((wdj) this.c).m(((j1g) ((sdr) this.b).getValue()) == j1g.a);
                return Unit.a;
            case 24:
                bz4 bz4Var = (bz4) this.b;
                kxi kxiVar = (kxi) this.c;
                l18 l18Var = l18.b;
                bdt I = hag.I(vg6.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return new ce((vg6) qdcVar.C(I), (jnq) bz4Var.d, kxiVar, bz4Var.b);
            case 25:
                lcj lcjVar = (lcj) this.b;
                ovs ovsVar = (ovs) this.c;
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(byb.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                boolean h = ((s5j) ((byb) qdcVar2.C(I2)).b(s5j.class)).h();
                mqs mqsVar2 = lcjVar.a;
                if (!h) {
                    return f8g.H(mqsVar2, lcjVar.b, lcjVar.c, lcjVar.d, ovsVar, lcjVar.e, lcjVar.g, lcjVar.h, lcjVar.i, lcjVar.j, lcjVar.k, lcjVar.f);
                }
                gj gjVar = lcjVar.b;
                if (ovsVar != null) {
                    if (ovsVar instanceof mvs) {
                        mvs mvsVar = (mvs) ovsVar;
                        evsVar = new dvs(mvsVar.a, mvsVar.b);
                    } else {
                        if (!(ovsVar instanceof nvs)) {
                            b6e.s();
                            return null;
                        }
                        nvs nvsVar = (nvs) ovsVar;
                        evsVar = new evs(nvsVar.a, nvsVar.b);
                    }
                    fvsVar = evsVar;
                }
                fvs fvsVar2 = fvsVar;
                ve veVar = lcjVar.e;
                return hyf.z(mqsVar2, gjVar, fvsVar2, o8g.V(veVar, lcjVar.a, o8g.U(veVar.b)), lcjVar.c.a, lcjVar.f, new mcj(lcjVar.g, lcjVar.j, lcjVar.k, lcjVar.l, lcjVar.h, (k8w) lcjVar.m.getValue(), (qe3) lcjVar.q.getValue()), lcjVar, (qe3) lcjVar.q.getValue());
            case 26:
                return avf.x((String) this.b, emr.e, new mhp[0], new s8i(i, (udb) this.c));
            case 27:
                ((rvj) this.b).b(((ewj) this.c).a.e);
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                kck kckVar = (kck) this.b;
                String str2 = ((pck) this.c).e;
                tck tckVar = kckVar.a;
                if (str2 != null) {
                    w1g.y(kckVar.b.a.b, str2, true);
                    tckVar.e.d(-1, -1, str2);
                    tckVar.j.set(true);
                }
                return Unit.a;
            default:
                n8m n8mVar = (n8m) this.b;
                jik jikVar = (jik) this.c;
                l13 l13Var = n8mVar.a;
                u8m u8mVar = (u8m) l13Var.a.D(hag.I(u8m.class), l13Var, l13Var.b);
                dik dikVar = jikVar.k;
                dikVar.getClass();
                pzl pzlVar = u8mVar.a;
                pzlVar.getClass();
                return new kjk(dikVar, pzlVar.b(hag.I(fjk.class), true), pzlVar.b(hag.I(kik.class), true), pzlVar.b(hag.I(s8m.class), true), pzlVar.b(hag.I(dqi.class), true));
        }
    }

    public /* synthetic */ y6g(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
