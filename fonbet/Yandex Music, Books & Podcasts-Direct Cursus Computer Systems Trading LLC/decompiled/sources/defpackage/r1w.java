package defpackage;

import android.content.SharedPreferences;
import android.os.Messenger;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.music.shared.downloading.api.service.DownloadService;
import com.yandex.music.shared.playback.core.api.PlaybackQueueStartValidator$InvalidQueueException;
import com.yandex.passport.api.exception.d;
import com.yandex.passport.common.core.b;
import com.yandex.passport.data.models.t;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.config.template.f;
import com.yandex.passport.internal.config.template.g;
import com.yandex.passport.internal.di.a;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.entities.w;
import com.yandex.passport.internal.flags.experiments.FetchExperimentsService;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.methods.performer.s1;
import com.yandex.passport.internal.network.h;
import com.yandex.passport.internal.properties.j0;
import com.yandex.passport.internal.push.f0;
import com.yandex.passport.internal.push.m;
import com.yandex.passport.internal.push.s;
import com.yandex.passport.internal.report.c4;
import com.yandex.passport.internal.report.diary.w0;
import com.yandex.passport.internal.sloth.credentialmanager.e;
import com.yandex.passport.internal.ui.autologin.c;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.bouncer.i;
import com.yandex.passport.internal.ui.bouncer.model.z0;
import com.yandex.passport.internal.ui.bouncer.roundabout.a0;
import com.yandex.passport.internal.ui.challenge.delete.h1;
import com.yandex.passport.internal.ui.challenge.delete.q1;
import com.yandex.passport.internal.ui.challenge.delete.v0;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.i0;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.q0;
import com.yandex.passport.internal.ui.challenge.webview.k;
import com.yandex.passport.internal.ui.sloth.menu.UserMenuActivity;
import com.yandex.passport.internal.ui.sloth.z;
import com.yandex.passport.sloth.d1;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import ru.yandex.music.YMApplication;
import ru.yandex.music.utils.Assertions;
import ru.yandex.music.utils.Preconditions;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class r1w extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1w(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new r1w((t1w) this.l, continuation, 0);
            case 1:
                return new r1w((x2w) this.l, continuation, 1);
            case 2:
                return new r1w((YMApplication) this.l, continuation, 2);
            case 3:
                return new r1w((rdk) this.l, continuation, 3);
            case 4:
                return new r1w((cbw) this.l, continuation, 4);
            case 5:
                return new r1w((epw) this.l, continuation, 5);
            case 6:
                return new r1w((m88) this.l, continuation, 6);
            case 7:
                return new r1w((ikl) this.l, continuation, 7);
            case 8:
                return new r1w((evj) this.l, continuation, 8);
            case 9:
                return new r1w((x0q) this.l, continuation, 9);
            case 10:
                return new r1w((g) this.l, continuation, 10);
            case 11:
                return new r1w((b) this.l, continuation, 11);
            case 12:
                return new r1w((s1) this.l, continuation, 12);
            case 13:
                return new r1w((h) this.l, continuation, 13);
            case 14:
                return new r1w((j5) this.l, continuation, 14);
            case 15:
                return new r1w((m) this.l, continuation, 15);
            case 16:
                return new r1w((rar) this.l, continuation, 16);
            case 17:
                return new r1w((s) this.l, continuation, 17);
            case 18:
                return new r1w((f0) this.l, continuation, 18);
            case 19:
                return new r1w((c) this.l, continuation, 19);
            case 20:
                return new r1w((BouncerActivity) this.l, continuation, 20);
            case 21:
                return new r1w((a0) this.l, continuation, 21);
            case 22:
                return new r1w((bsh) this.l, continuation, 22);
            case 23:
                return new r1w((q1) this.l, continuation, 23);
            case 24:
                return new r1w((q0) this.l, continuation, 24);
            case 25:
                return new r1w((rjc) this.l, continuation, 25);
            case 26:
                return new r1w((xpi) this.l, continuation, 26);
            case 27:
                return new r1w((com.yandex.passport.internal.ui.domik.identifier.c) this.l, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new r1w((z) this.l, continuation, 28);
            default:
                return new r1w((UserMenuActivity) this.l, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
            case 3:
                ((r1w) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
        }
        return ((r1w) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object k;
        String K;
        t0u t0uVar;
        Object obj2;
        ArrayList arrayList;
        Object C;
        Object lowVar;
        Object b;
        Object g0;
        Object s;
        Object a;
        Object a2;
        Object obj3;
        Object obj4;
        int i = 4;
        int i2 = 11;
        int i3 = 10;
        int i4 = 8;
        int i5 = 2;
        int i6 = 3;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                Object obj5 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    m2w m2wVar = ((t1w) this.l).m;
                    this.k = 1;
                    Object a3 = lmm.a((wb7) m2wVar.a.getValue(), new d4t(i5, i6, continuation), this);
                    Object obj6 = a3;
                    if (a3 != obj5) {
                        obj6 = Unit.a;
                    }
                    if (obj6 == obj5) {
                        return obj5;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                x2w x2wVar = (x2w) this.l;
                nm6 nm6Var = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    frt frtVar = (frt) x2wVar.a.getValue();
                    this.k = 1;
                    k = frtVar.k(this);
                    if (k == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    k = obj;
                }
                yxc yxcVar = (yxc) k;
                if ((yxcVar == null || !yxcVar.h) && (K = avf.K()) != null) {
                    oy2 oy2Var = (oy2) x2wVar.d.getValue();
                    oy2Var.getClass();
                    x97.y(oy2Var.b, null, null, new ov(oy2Var, K, continuation, i), 3);
                }
                return Unit.a;
            case 2:
                YMApplication yMApplication = (YMApplication) this.l;
                nm6 nm6Var2 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    oot[] ootVarArr = {new an4(yMApplication, i6), new ymm(yMApplication), new an4(yMApplication, i9), new an4(yMApplication, i5), new an4(yMApplication, i7)};
                    SharedPreferences sharedPreferences = yMApplication.getSharedPreferences("Yandex_Music", 0);
                    int i13 = sharedPreferences.getInt("version_code", -1);
                    boolean z = sharedPreferences.getBoolean("is_app_first_start", true);
                    if (z) {
                        sharedPreferences.edit().putBoolean("is_app_first_start", false).apply();
                    }
                    int i14 = t0u.d;
                    if (z) {
                        t0uVar = new t0u(-1, true);
                    } else {
                        if (i13 < 0) {
                            Timber.d("fixed version code for early versions", new Object[0]);
                            i13 = 214000;
                        }
                        Assertions.assertTrue(i13 >= 0);
                        t0uVar = new t0u(i13, false);
                    }
                    int i15 = t0uVar.c;
                    Timber.tag("UpgradeHelper").d("version info: %s", t0uVar);
                    if (t0uVar.b) {
                        not.a(sharedPreferences);
                    } else if (t0uVar.a) {
                        bow.z("app_upgrade", i15 + " to 24026391");
                        Timber.tag("UpgradeHelper").d("upgrading from %d", Integer.valueOf(i15));
                        oot[] ootVarArr2 = (oot[]) Preconditions.nonEmpty(ootVarArr);
                        sharedPreferences.edit().putBoolean("upgrade_in_progress", true).apply();
                        uiq uiqVar = new uiq(ootVarArr2.length);
                        int length = ootVarArr2.length;
                        while (i7 < length) {
                            oot ootVar = ootVarArr2[i7];
                            if (ootVar.a(t0uVar)) {
                                ootVar.b(uiqVar, t0uVar);
                            } else {
                                Timber.tag("UpgradeHelper").d("upgrade isn't needed: %s", ootVar);
                                uiqVar.x();
                            }
                            i7++;
                        }
                    } else {
                        Timber.d("no upgrade for common startup", new Object[0]);
                    }
                    vka vkaVar = DownloadService.c;
                    l18 l18Var = l18.b;
                    bdt I = hag.I(kij.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    kij kijVar = (kij) qdcVar.C(I);
                    bdt I2 = hag.I(vka.class);
                    qdc qdcVar2 = l18Var.a;
                    qdcVar2.getClass();
                    vka vkaVar2 = (vka) qdcVar2.C(I2);
                    es6 es6Var = new es6(yMApplication, 12);
                    this.k = 1;
                    DownloadService.c = vkaVar2;
                    DownloadService.d = es6Var;
                    Object collect = zsd.b0(new clc(new d64(kijVar.c, 29), new lf2(i5, 6, continuation), 3)).collect(new tg6(yMApplication, i9), this);
                    if (collect != nm6.a) {
                        collect = Unit.a;
                    }
                    if (collect == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                nm6 nm6Var3 = nm6.a;
                int i16 = this.k;
                if (i16 != 0) {
                    if (i16 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                rdk rdkVar = (rdk) this.l;
                xdr xdrVar = (xdr) rdkVar.g;
                lot lotVar = new lot(23, rdkVar);
                this.k = 1;
                xdrVar.collect(lotVar, this);
                return nm6Var3;
            case 4:
                Object obj7 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    cbw cbwVar = (cbw) this.l;
                    this.k = 1;
                    if (cbwVar.f.f) {
                        obj2 = Unit.a;
                    } else {
                        cbwVar.f.f = true;
                        long currentTimeMillis = System.currentTimeMillis();
                        cbwVar.p = currentTimeMillis;
                        cbwVar.P.put("releaseTimestamp", new Long(currentTimeMillis));
                        Object O = a4g.O(new j9w(cbwVar, continuation, i), this);
                        obj2 = O;
                        if (O != obj7) {
                            obj2 = Unit.a;
                        }
                    }
                    if (obj2 == obj7) {
                        return obj7;
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 5:
                nm6 nm6Var4 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    trw trwVar = ((epw) this.l).h;
                    this.k = 1;
                    if (trwVar.a(this) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 6:
                nm6 nm6Var5 = nm6.a;
                int i19 = this.k;
                if (i19 != 0) {
                    if (i19 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                frt frtVar2 = (frt) ((m88) this.l).a.getValue();
                this.k = 1;
                Object k2 = frtVar2.k(this);
                return k2 == nm6Var5 ? nm6Var5 : k2;
            case 7:
                ikl iklVar = (ikl) this.l;
                nm6 nm6Var6 = nm6.a;
                int i20 = this.k;
                try {
                    if (i20 == 0) {
                        qgg.h0(obj);
                        kpm kpmVar = (kpm) ((sfn) iklVar.c).a.a;
                        List list = (List) iklVar.d;
                        if (list != null) {
                            List list2 = list;
                            arrayList = new ArrayList(v75.o(list2, 10));
                            for (Object obj8 : list2) {
                                int i21 = i8 + 1;
                                if (i8 < 0) {
                                    u75.n();
                                    throw null;
                                }
                                x1u x1uVar = (x1u) obj8;
                                tfn tfnVar = new tfn(x1uVar.a);
                                List list3 = (List) iklVar.e;
                                arrayList.add(new y1u(tfnVar, x1uVar, list3 != null ? (wmn) CollectionsKt.S(list3, i8) : null));
                                i8 = i21;
                            }
                        } else {
                            arrayList = null;
                        }
                        String str = (String) iklVar.f;
                        ybu D = f8g.D(arrayList, str != null ? new o9u(str) : null);
                        this.k = 1;
                        C = kpmVar.C(D, this);
                        if (C == nm6Var6) {
                            return nm6Var6;
                        }
                    } else {
                        if (i20 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        C = obj;
                    }
                    f7u f7uVar = ((j7u) C).e;
                    List list4 = f7uVar.b;
                    ArrayList arrayList2 = new ArrayList(v75.o(list4, 10));
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((s7u) it.next()).b);
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (hashSet.add(((y1u) next).a)) {
                            arrayList3.add(next);
                        }
                    }
                    ArrayList arrayList4 = !arrayList3.isEmpty() ? arrayList3 : null;
                    if (arrayList4 != null) {
                        return new now((String) iklVar.g, new v80((String) iklVar.h, (gxc) iklVar.i, null), arrayList4, iklVar.a, new Integer(f7uVar.c.a).intValue(), ((zzp) iklVar.b).b());
                    }
                    throw new PlaybackQueueStartValidator$InvalidQueueException("failed to fetch initial radio tracks", new NoSuchElementException());
                } catch (IOException e) {
                    throw new PlaybackQueueStartValidator$InvalidQueueException("failed to fetch initial radio tracks", e);
                }
            case 8:
                evj evjVar = (evj) this.l;
                xsu xsuVar = (xsu) evjVar.b;
                nm6 nm6Var7 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    oyu oyuVar = (oyu) evjVar.d;
                    if (!(oyuVar instanceof lyu)) {
                        if (!(oyuVar instanceof jyu)) {
                            b6e.s();
                            return null;
                        }
                        xsuVar.getClass();
                        b5q b5qVar = new b5q(new ynu(bfg.m(xsuVar)), ((jyu) oyuVar).a);
                        xsuVar.getClass();
                        eu7 e0 = n7w.e0(bfg.K(xsuVar));
                        nyn nynVar = (nyn) evjVar.e;
                        boolean z2 = evjVar.a;
                        h4q h4qVar = (h4q) evjVar.f;
                        Long u = ngg.u(xsuVar);
                        lowVar = new low(e0, b5qVar, nynVar, z2, h4qVar, u != null ? u.longValue() : 0L, System.currentTimeMillis());
                        return lowVar;
                    }
                    f5v f5vVar = (f5v) evjVar.c;
                    lyu lyuVar = (lyu) oyuVar;
                    this.k = 1;
                    f5vVar.getClass();
                    if (lyuVar instanceof kyu) {
                        kyu kyuVar = (kyu) lyuVar;
                        eu7 K2 = bfg.K(xsuVar);
                        u4q u4qVar = new u4q(kyuVar.a, kyuVar.b, kyuVar.c, bfg.o(xsuVar), kyuVar.d, null);
                        b = new x4v(n7w.e0(f5v.d(K2, u4qVar)), u4qVar);
                    } else {
                        if (!(lyuVar instanceof myu)) {
                            b6e.s();
                            return null;
                        }
                        b = f5vVar.b(xsuVar, (myu) lyuVar, this);
                    }
                    if (b == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    b = obj;
                }
                y4v y4vVar = (y4v) b;
                if (!(y4vVar instanceof x4v)) {
                    if (y4vVar instanceof w4v) {
                        throw new PlaybackQueueStartValidator$InvalidQueueException(((w4v) y4vVar).a.a(), "failed to fetch initial wave info");
                    }
                    b6e.s();
                    return null;
                }
                x4v x4vVar = (x4v) y4vVar;
                eu7 eu7Var = x4vVar.a;
                q4q q4qVar = x4vVar.b;
                nyn nynVar2 = (nyn) evjVar.e;
                boolean z3 = evjVar.a;
                h4q h4qVar2 = (h4q) evjVar.f;
                Long u2 = ngg.u(xsuVar);
                lowVar = new kow(eu7Var, q4qVar, nynVar2, z3, h4qVar2, u2 != null ? u2.longValue() : 0L, System.currentTimeMillis());
                return lowVar;
            case 9:
                nm6 nm6Var8 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar = (x0q) this.l;
                    r7o r7oVar = z7o.b;
                    z7o z7oVar = new z7o(new t7o(new d("Account is childish")));
                    this.k = 1;
                    if (x0qVar.emit(z7oVar, this) == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 10:
                g gVar = (g) this.l;
                nm6 nm6Var9 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    pjc data = gVar.a.getData();
                    this.k = 1;
                    g0 = zsd.g0(data, this);
                    if (g0 == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i24 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    g0 = obj;
                }
                com.yandex.passport.internal.config.template.c cVar = (com.yandex.passport.internal.config.template.c) g0;
                if (cVar == null) {
                    gVar.getClass();
                    return new t(new com.yandex.passport.data.models.s(u75.h("auth", "profiles", "start"), c5b.a), g.a());
                }
                gVar.getClass();
                f fVar = cVar.a;
                com.yandex.passport.data.models.s sVar = fVar != null ? new com.yandex.passport.data.models.s(fVar.a, fVar.b) : new com.yandex.passport.data.models.s(u75.h("auth", "profiles", "start"), c5b.a);
                f fVar2 = cVar.b;
                return new t(sVar, fVar2 != null ? new com.yandex.passport.data.models.s(fVar2.a, fVar2.b) : g.a());
            case 11:
                nm6 nm6Var10 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    int i26 = FetchExperimentsService.i;
                    b bVar = (b) this.l;
                    this.k = 1;
                    Object a4 = a.a().getExperimentsFetcher().a(bVar, this);
                    if (a4 != nm6Var10) {
                        a4 = Unit.a;
                    }
                    if (a4 == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 12:
                nm6 nm6Var11 = nm6.a;
                int i27 = this.k;
                if (i27 != 0) {
                    if (i27 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                w0 w0Var = ((s1) this.l).a;
                Unit unit = Unit.a;
                this.k = 1;
                Object g = w0Var.g(unit, this);
                return g == nm6Var11 ? nm6Var11 : g;
            case 13:
                nm6 nm6Var12 = nm6.a;
                int i28 = this.k;
                if (i28 != 0) {
                    if (i28 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                g gVar2 = ((h) this.l).e;
                this.k = 1;
                gVar2.getClass();
                dq7 dq7Var = ca8.a;
                Object V = x97.V(mn7.d, new r1w(gVar2, continuation, i3), this);
                return V == nm6Var12 ? nm6Var12 : V;
            case 14:
                nm6 nm6Var13 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    gm5 gm5Var = (gm5) ((j5) this.l).b;
                    if (gm5Var == null) {
                        return null;
                    }
                    this.k = 1;
                    s = gm5Var.s(this);
                    if (s == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i29 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    s = obj;
                }
                return (Messenger) s;
            case 15:
                nm6 nm6Var14 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.analytics.f fVar3 = ((m) this.l).e;
                    long c = com.yandex.passport.common.time.a.c(0, 5, 0, 11);
                    this.k = 1;
                    a = fVar3.a(c, this);
                    if (a == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i30 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a = obj;
                }
                String str2 = ((com.yandex.passport.common.analytics.b) a).a;
                if (str2 != null) {
                    return new com.yandex.passport.common.value.a(str2);
                }
                return null;
            case 16:
                nm6 nm6Var15 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    rar rarVar = (rar) this.l;
                    this.k = 1;
                    if (rarVar.j0(this) == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i31 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 17:
                nm6 nm6Var16 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    s sVar2 = (s) this.l;
                    this.k = 1;
                    if (sVar2.f(this) == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i32 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 18:
                nm6 nm6Var17 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.analytics.f fVar4 = ((f0) this.l).c;
                    long c2 = com.yandex.passport.common.time.a.c(0, 5, 0, 11);
                    this.k = 1;
                    a2 = fVar4.a(c2, this);
                    if (a2 == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i33 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a2 = obj;
                }
                String str3 = ((com.yandex.passport.common.analytics.b) a2).a;
                if (str3 != null) {
                    return new com.yandex.passport.common.value.a(str3);
                }
                return null;
            case 19:
                c cVar2 = (c) this.l;
                nm6 nm6Var18 = nm6.a;
                int i34 = this.k;
                if (i34 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.account.d dVar = cVar2.q;
                    w wVar = cVar2.r;
                    com.yandex.passport.internal.analytics.a aVar = com.yandex.passport.internal.analytics.a.n;
                    this.k = 1;
                    Object a5 = dVar.a(wVar, aVar, this);
                    if (a5 == nm6Var18) {
                        return nm6Var18;
                    }
                    obj3 = a5;
                } else {
                    if (i34 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    obj3 = ((z7o) obj).a;
                }
                r7o r7oVar2 = z7o.b;
                if (!(obj3 instanceof t7o)) {
                    cVar2.u.m(((l) obj3).b);
                }
                Throwable a6 = z7o.a(obj3);
                if (a6 != null) {
                    String message = a6.getMessage();
                    if (message != null) {
                        o0 o0Var = cVar2.s;
                        o0Var.getClass();
                        xy0 xy0Var = new xy0(0);
                        xy0Var.put("error", message);
                        o0Var.a.b(com.yandex.passport.internal.analytics.d.f, xy0Var);
                    }
                    cVar2.t.m(Boolean.valueOf((a6 instanceof JSONException) || (a6 instanceof IOException)));
                }
                cVar2.l.m(Boolean.FALSE);
                return Unit.a;
            case 20:
                BouncerActivity bouncerActivity = (BouncerActivity) this.l;
                nm6 nm6Var19 = nm6.a;
                int i35 = this.k;
                if (i35 == 0) {
                    qgg.h0(obj);
                    int i36 = BouncerActivity.e;
                    i iVar = (i) bouncerActivity.d.getValue();
                    com.yandex.passport.internal.ui.bouncer.c cVar3 = bouncerActivity.b;
                    if (cVar3 == null) {
                        Intrinsics.j("component");
                        throw null;
                    }
                    com.yandex.passport.internal.ui.bouncer.s wishSource = cVar3.getWishSource();
                    com.yandex.passport.internal.ui.bouncer.c cVar4 = bouncerActivity.b;
                    if (cVar4 == null) {
                        Intrinsics.j("component");
                        throw null;
                    }
                    com.yandex.passport.common.mvi.f renderer = cVar4.getRenderer();
                    this.k = 1;
                    tf6 e2 = gld.e(getContext());
                    z0 model = iVar.l.getModel();
                    x97.y(e2, null, null, new com.yandex.passport.internal.provider.communication.c(model, wishSource, continuation, i3), 3);
                    x97.y(e2, null, null, new com.yandex.passport.internal.provider.communication.c(model, renderer, continuation, i2), 3);
                    if (Unit.a == nm6Var19) {
                        return nm6Var19;
                    }
                } else {
                    if (i35 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                PassportProcessGlobalComponent passportProcessGlobalComponent = bouncerActivity.a;
                if (passportProcessGlobalComponent == null) {
                    Intrinsics.j("globalComponent");
                    throw null;
                }
                com.yandex.passport.internal.report.reporters.m bouncerReporter = passportProcessGlobalComponent.getBouncerReporter();
                bouncerReporter.getClass();
                bouncerReporter.p(c4.d);
                return Unit.a;
            case 21:
                nm6 nm6Var20 = nm6.a;
                int i37 = this.k;
                if (i37 == 0) {
                    qgg.h0(obj);
                    long X = fxf.X(0, 100);
                    this.k = 1;
                    if (y2x.o(X, this) == nm6Var20) {
                        return nm6Var20;
                    }
                } else {
                    if (i37 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                a0 a0Var = (a0) this.l;
                BottomSheetBehavior bottomSheetBehavior = a0Var.o.e;
                bottomSheetBehavior.setState(3);
                bottomSheetBehavior.addBottomSheetCallback(new xe3(i4, a0Var));
                return Unit.a;
            case 22:
                nm6 nm6Var21 = nm6.a;
                int i38 = this.k;
                if (i38 == 0) {
                    qgg.h0(obj);
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Model started", 8);
                    }
                    bsh bshVar = (bsh) this.l;
                    this.k = 1;
                    if (bsh.e(bshVar, this) == nm6Var21) {
                        return nm6Var21;
                    }
                } else {
                    if (i38 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 23:
                nm6 nm6Var22 = nm6.a;
                int i39 = this.k;
                if (i39 == 0) {
                    qgg.h0(obj);
                    h1 h1Var = ((q1) this.l).l;
                    if (h1Var == null) {
                        Intrinsics.j(CommonUrlParts.MODEL);
                        throw null;
                    }
                    v0 v0Var = v0.d;
                    this.k = 1;
                    if (h1Var.k0(v0Var, this) == nm6Var22) {
                        return nm6Var22;
                    }
                } else {
                    if (i39 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 24:
                nm6 nm6Var23 = nm6.a;
                int i40 = this.k;
                if (i40 != 0) {
                    if (i40 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                x0q x0qVar2 = ((q0) this.l).q;
                this.k = 1;
                Object g02 = zsd.g0(x0qVar2, this);
                return g02 == nm6Var23 ? nm6Var23 : g02;
            case 25:
                nm6 nm6Var24 = nm6.a;
                int i41 = this.k;
                if (i41 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar = (rjc) this.l;
                    i0 i0Var = i0.a;
                    this.k = 1;
                    if (rjcVar.emit(i0Var, this) == nm6Var24) {
                        return nm6Var24;
                    }
                } else {
                    if (i41 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 26:
                nm6 nm6Var25 = nm6.a;
                int i42 = this.k;
                if (i42 == 0) {
                    qgg.h0(obj);
                    xpi xpiVar = (xpi) this.l;
                    k kVar = k.a;
                    this.k = 1;
                    if (xpiVar.emit(kVar, this) == nm6Var25) {
                        return nm6Var25;
                    }
                } else {
                    if (i42 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 27:
                com.yandex.passport.internal.ui.domik.identifier.c cVar5 = (com.yandex.passport.internal.ui.domik.identifier.c) this.l;
                nm6 nm6Var26 = nm6.a;
                int i43 = this.k;
                if (i43 == 0) {
                    qgg.h0(obj);
                    cVar5.u = true;
                    com.yandex.passport.internal.sloth.credentialmanager.d dVar2 = cVar5.t;
                    if (dVar2 == null) {
                        Intrinsics.j("credentialManager");
                        throw null;
                    }
                    e eVar = e.Native;
                    this.k = 1;
                    Object a7 = dVar2.a(false, eVar, this);
                    if (a7 == nm6Var26) {
                        return nm6Var26;
                    }
                    obj4 = a7;
                } else {
                    if (i43 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    obj4 = ((z7o) obj).a;
                }
                r7o r7oVar3 = z7o.b;
                if (!(obj4 instanceof t7o)) {
                    com.yandex.passport.internal.sloth.credentialmanager.a aVar2 = (com.yandex.passport.internal.sloth.credentialmanager.a) obj4;
                    cVar5.u = false;
                    cVar5.p.s.m(aVar2 != null ? new com.yandex.passport.internal.ui.domik.identifier.a(aVar2.b, aVar2.c, null, aVar2.a) : new com.yandex.passport.internal.ui.domik.identifier.a(null, null, null, false));
                }
                Throwable a8 = z7o.a(obj4);
                if (a8 != null) {
                    cVar5.u = false;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Failed to get credentials from Credential Manager: " + a8.getMessage(), 8);
                    }
                    cVar5.p.s.m(new com.yandex.passport.internal.ui.domik.identifier.a(null, null, null, false));
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                nm6 nm6Var27 = nm6.a;
                int i44 = this.k;
                if (i44 == 0) {
                    qgg.h0(obj);
                    d1 d1Var = ((z) this.l).k;
                    this.k = 1;
                    if (d1Var.a(this) == nm6Var27) {
                        return nm6Var27;
                    }
                } else {
                    if (i44 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                UserMenuActivity userMenuActivity = (UserMenuActivity) this.l;
                nm6 nm6Var28 = nm6.a;
                int i45 = this.k;
                if (i45 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.ui.sloth.menu.e eVar2 = userMenuActivity.b;
                    if (eVar2 == null) {
                        Intrinsics.j("component");
                        throw null;
                    }
                    eVar2.getUserMenuRequestsProcessor().a();
                    com.yandex.passport.internal.ui.sloth.menu.e eVar3 = userMenuActivity.b;
                    if (eVar3 == null) {
                        Intrinsics.j("component");
                        throw null;
                    }
                    j0 userMenuProperties = eVar3.getUserMenuProperties();
                    this.k = 1;
                    if (gld.Q(new l1p(userMenuActivity, userMenuProperties, continuation, 19), this) == nm6Var28) {
                        return nm6Var28;
                    }
                } else {
                    if (i45 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }
}
