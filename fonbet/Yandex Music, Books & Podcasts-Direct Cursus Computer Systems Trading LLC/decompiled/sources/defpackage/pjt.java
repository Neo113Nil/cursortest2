package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.provider.Settings;
import androidx.fragment.app.y;
import com.yandex.passport.common.logger.a;
import com.yandex.passport.common.logger.b;
import com.yandex.passport.internal.config.n;
import com.yandex.passport.internal.link_auth.d;
import com.yandex.passport.internal.social.esia.o;
import com.yandex.passport.internal.storage.p;
import com.yandex.passport.internal.usecase.i1;
import com.yandex.passport.internal.usecase.k1;
import com.yandex.passport.internal.usecase.vpn.e;
import com.yandex.passport.sloth.r0;
import com.yandex.passport.sloth.ui.g;
import com.yandex.plus.experiments.impl.cache.c;
import com.yandex.plus.home.animation.f;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.h;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.m;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.GiftProgressView;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class pjt extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pjt(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = obj;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new pjt((njt) this.k, continuation, 0);
            case 1:
                return new pjt((yxc) this.k, continuation, 1);
            case 2:
                return new pjt((urt) this.k, continuation, 2);
            case 3:
                return new pjt((nst) this.k, continuation, 3);
            case 4:
                return new pjt((ohu) this.k, continuation, 4);
            case 5:
                return new pjt((cju) this.k, continuation, 5);
            case 6:
                return new pjt((aqi) this.k, continuation, 6);
            case 7:
                return new pjt((u3v) this.k, continuation, 7);
            case 8:
                return new pjt((yoc) this.k, continuation, 8);
            case 9:
                return new pjt((rdk) this.k, continuation, 9);
            case 10:
                return new pjt((udw) this.k, continuation, 10);
            case 11:
                return new pjt((dgw) this.k, continuation, 11);
            case 12:
                return new pjt((phw) this.k, continuation, 12);
            case 13:
                return new pjt((oqw) this.k, continuation, 13);
            case 14:
                return new pjt((ltw) this.k, continuation, 14);
            case 15:
                return new pjt((cqi) this.k, continuation, 15);
            case 16:
                return new pjt((zh) this.k, continuation, 16);
            case 17:
                return new pjt((d) this.k, continuation, 17);
            case 18:
                return new pjt((FileInputStream) this.k, continuation, 18);
            case 19:
                return new pjt((o) this.k, continuation, 19);
            case 20:
                return new pjt((i1) this.k, continuation, 20);
            case 21:
                return new pjt((k1) this.k, continuation, 21);
            case 22:
                return new pjt((e) this.k, continuation, 22);
            case 23:
                return new pjt((com.yandex.passport.sloth.ui.d) this.k, continuation, 23);
            case 24:
                return new pjt((c) this.k, continuation, 24);
            case 25:
                return new pjt((com.yandex.plus.experiments.impl.cooldown.c) this.k, continuation, 25);
            case 26:
                return new pjt((f) this.k, continuation, 26);
            case 27:
                return new pjt((m) this.k, continuation, 27);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new pjt((GiftProgressView) this.k, continuation, 28);
            default:
                return new pjt((com.yandex.plus.home.feature.webviews.internal.d) this.k, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((pjt) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((pjt) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 2:
                return ((pjt) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 3:
                return ((pjt) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 4:
                return ((pjt) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 5:
                return ((pjt) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 6:
                return ((pjt) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 7:
                return ((pjt) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 8:
                return ((pjt) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 9:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((pjt) create(bool, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 10:
                return ((pjt) create((gow) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 11:
                return ((pjt) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 12:
                return ((pjt) create((nhw) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 13:
                return ((pjt) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 14:
                return ((pjt) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 15:
                return ((pjt) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 16:
                return ((pjt) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 17:
                return ((pjt) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 18:
                return ((pjt) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 19:
                return ((pjt) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 20:
                return ((pjt) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 21:
                return ((pjt) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 22:
                return ((pjt) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 23:
                return ((pjt) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 24:
                return ((pjt) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 25:
                return ((pjt) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 26:
                return ((pjt) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case 27:
                return ((pjt) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return ((pjt) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((pjt) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107, types: [t7o] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Map map;
        Map map2;
        com.yandex.plus.experiments.api.cache.f t7oVar;
        List c;
        Integer intOrNull;
        String str;
        boolean z = false;
        ?? r4 = 1;
        ?? r42 = 1;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                ((ckt) ((njt) this.k).e.b).k.d();
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                byb bybVar = (byb) qdcVar.C(I);
                String str2 = ((yxc) this.k).a.a;
                str2.getClass();
                bybVar.f(str2, false);
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                ((vdr) ((urt) this.k).i.getValue()).getValue();
                return Unit.a;
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(((nst) this.k).a.getPackageManager().hasSystemFeature("com.yandex.software.yphone"));
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                ohu ohuVar = (ohu) this.k;
                nhu nhuVar = ohuVar.d;
                if (nhuVar != null) {
                    nyf nyfVar = nhuVar.d;
                    nhuVar.e.g(null);
                    lhu lhuVar = nhuVar.c;
                    if (lhuVar instanceof czf) {
                        nyfVar.d((czf) lhuVar);
                    }
                    nyfVar.d(nhuVar);
                }
                ohuVar.d = null;
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                cju cjuVar = (cju) this.k;
                if (cjuVar.f.getAndIncrement() <= 0) {
                    ssg.a(3, cju.k, "registered", null);
                    cjuVar.a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, cjuVar.h);
                }
                return Unit.a;
            case 6:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                ((Function0) ((aqi) this.k).getValue()).invoke();
                return Unit.a;
            case 7:
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                q1v q1vVar = ((ltu) ((u3v) this.k).g.b).o;
                y yVar = q1vVar.b;
                o1v o1vVar = new o1v(q1vVar, r4 == true ? 1 : 0);
                cvo cvoVar = cvo.i;
                fxf.Q(yVar, o6m.b(wjb.ShakeWaveScreen, null, 6), null, null, pd.t(new qzm[0]), null, new wn5(new t31(22, o1vVar), -908863957, true), 22);
                return Unit.a;
            case 8:
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                yoc yocVar = (yoc) this.k;
                yocVar.getClass();
                yocVar.a(new u8b((int) (r42 == true ? 1 : 0), 4));
                return Unit.a;
            case 9:
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                rdk.p((rdk) this.k);
                return Unit.a;
            case 10:
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                ((udw) this.k).d.set(null);
                return Unit.a;
            case 11:
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                dgw dgwVar = (dgw) this.k;
                if (dgwVar.e.b().c.a && dgwVar.c.a(cyk.b)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                ((phw) this.k).a.g();
                return Unit.a;
            case 13:
                nm6 nm6Var14 = nm6.a;
                qgg.h0(obj);
                ((dk4) ((oqw) this.k).b.getValue()).b();
                return Unit.a;
            case 14:
                nm6 nm6Var15 = nm6.a;
                qgg.h0(obj);
                ltw ltwVar = (ltw) this.k;
                ReentrantLock reentrantLock = ltwVar.f;
                reentrantLock.lock();
                try {
                    if (ltwVar.g.isEmpty()) {
                        Unit unit = Unit.a;
                        reentrantLock.unlock();
                        return unit;
                    }
                    wqw wqwVar = ltwVar.e;
                    if (wqwVar == null) {
                        wqwVar = ltwVar.b();
                    }
                    Iterator it = ltwVar.g.iterator();
                    while (it.hasNext()) {
                        wqwVar = ((itw) it.next()).a(wqwVar);
                    }
                    ltwVar.g.clear();
                    ltwVar.e = wqwVar;
                    reentrantLock.unlock();
                    ((ltw) this.k).c.invoke(wqwVar);
                    return Unit.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 15:
                nm6 nm6Var16 = nm6.a;
                qgg.h0(obj);
                ((cqi) this.k).c.setValue(Boolean.TRUE);
                return Unit.a;
            case 16:
                nm6 nm6Var17 = nm6.a;
                qgg.h0(obj);
                zh zhVar = (zh) this.k;
                Unit unit2 = Unit.a;
                zhVar.a(unit2);
                return unit2;
            case 17:
                nm6 nm6Var18 = nm6.a;
                qgg.h0(obj);
                d dVar = (d) this.k;
                SharedPreferences sharedPreferences = dVar.d;
                long j = sharedPreferences.getLong("link_auth_last_update", 0L);
                dVar.c.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = currentTimeMillis - j;
                ?? r2 = j2 < 86400000;
                if (!dVar.a(currentTimeMillis, j2)) {
                    if (r2 == true) {
                        sharedPreferences.edit().putInt("link_auth_current_count", sharedPreferences.getInt("link_auth_current_count", 0) + 1).commit();
                    } else {
                        sharedPreferences.edit().putInt("link_auth_current_count", 1).commit();
                        sharedPreferences.edit().putLong("link_auth_last_update", System.currentTimeMillis()).commit();
                    }
                }
                SharedPreferences sharedPreferences2 = dVar.d;
                long j3 = sharedPreferences2.getLong("link_auth_one_time_last_update", 0L);
                dVar.c.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                long j4 = currentTimeMillis2 - j3;
                if (!dVar.b(currentTimeMillis2, j4)) {
                    if (j4 < 600000) {
                        sharedPreferences2.edit().putInt("link_auth_one_time_count", sharedPreferences2.getInt("link_auth_one_time_count", 0) + 1).commit();
                    } else {
                        sharedPreferences2.edit().putLong("link_auth_one_time_last_update", System.currentTimeMillis()).commit();
                        sharedPreferences2.edit().putInt("link_auth_one_time_count", 1).commit();
                    }
                }
                return Unit.a;
            case 18:
                nm6 nm6Var19 = nm6.a;
                qgg.h0(obj);
                try {
                    w3f w3fVar = x3f.d;
                    t9f serializer = p.Companion.serializer();
                    serializer.getClass();
                    return w3fVar.b(new qy0(serializer, 2), kotlin.text.c.m(vnj.N((FileInputStream) this.k)));
                } catch (zhp e) {
                    throw new wm6("Unable to read Set<UidWithTtl>.", e);
                }
            case 19:
                nm6 nm6Var20 = nm6.a;
                qgg.h0(obj);
                if (a.a.isEnabled()) {
                    a.c(b.b, null, "observeForceFinish trigger to finish", 8);
                }
                ((o) this.k).i();
                return Unit.a;
            case 20:
                nm6 nm6Var21 = nm6.a;
                qgg.h0(obj);
                i1 i1Var = (i1) this.k;
                SharedPreferences sharedPreferences3 = i1Var.e;
                sharedPreferences3.getClass();
                SharedPreferences.Editor edit = sharedPreferences3.edit();
                i1Var.c.getClass();
                edit.putLong("last_update", System.currentTimeMillis());
                edit.commit();
                return Unit.a;
            case 21:
                nm6 nm6Var22 = nm6.a;
                qgg.h0(obj);
                k1 k1Var = (k1) this.k;
                SharedPreferences sharedPreferences4 = k1Var.e;
                sharedPreferences4.getClass();
                SharedPreferences.Editor edit2 = sharedPreferences4.edit();
                k1Var.c.getClass();
                edit2.putLong("last_update", System.currentTimeMillis());
                edit2.commit();
                return Unit.a;
            case 22:
                nm6 nm6Var23 = nm6.a;
                qgg.h0(obj);
                n nVar = ((e) this.k).e;
                com.yandex.passport.common.core.b bVar = com.yandex.passport.common.core.b.c;
                nVar.getClass();
                SharedPreferences a = nVar.a.a(bVar);
                return Boolean.valueOf(a != null ? a.getBoolean("vpnBlockerUserDisabled", true) : true);
            case 23:
                nm6 nm6Var24 = nm6.a;
                qgg.h0(obj);
                com.yandex.passport.sloth.ui.d dVar2 = (com.yandex.passport.sloth.ui.d) this.k;
                g gVar = dVar2.a;
                Activity activity = dVar2.d;
                try {
                    gao gaoVar = new gao(17);
                    try {
                        try {
                            activity.getPackageManager().getPackageInfo("com.whatsapp", 0);
                        } catch (PackageManager.NameNotFoundException unused) {
                            activity.getPackageManager().getPackageInfo("com.whatsapp.w4b", 0);
                        }
                        z = true;
                    } catch (PackageManager.NameNotFoundException unused2) {
                    }
                    if (z) {
                        gaoVar.N(activity, chv.CONSUMER);
                        gaoVar.N(activity, chv.BUSINESS);
                        if (a.a.isEnabled()) {
                            a.c(b.b, null, "Success sendOtpIntentToWhatsApp", 8);
                        }
                    } else {
                        Pair[] pairArr = {new Pair("error_message", "whatsapp_is_not_installed")};
                        r0 r0Var = r0.ACTIVATED;
                        Map b = tah.b(new Pair("ui_error", "send_otp_intent_to_whats_app"));
                        b.getClass();
                        if (b.isEmpty()) {
                            map2 = uah.p(pairArr);
                        } else {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(b);
                            uah.k(linkedHashMap, pairArr);
                            map2 = linkedHashMap;
                        }
                        com.yandex.passport.internal.sloth.o oVar = (com.yandex.passport.internal.sloth.o) ((com.yandex.passport.internal.ui.sloth.c) gVar).a;
                        oVar.getClass();
                        if (oVar.a()) {
                            oVar.a.a("sloth.reportWebAmEvent.".concat("webam_error"), map2);
                        }
                        if (a.a.isEnabled()) {
                            a.c(b.b, null, "Failed sendOtpIntentToWhatsApp: WhatsApp is not installed", 8);
                        }
                    }
                } catch (Exception e2) {
                    Pair[] pairArr2 = {new Pair("error_message", String.valueOf(e2.getMessage()))};
                    r0 r0Var2 = r0.ACTIVATED;
                    Map b2 = tah.b(new Pair("ui_error", "send_otp_intent_to_whats_app"));
                    b2.getClass();
                    if (b2.isEmpty()) {
                        map = uah.p(pairArr2);
                    } else {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(b2);
                        uah.k(linkedHashMap2, pairArr2);
                        map = linkedHashMap2;
                    }
                    com.yandex.passport.internal.sloth.o oVar2 = (com.yandex.passport.internal.sloth.o) ((com.yandex.passport.internal.ui.sloth.c) gVar).a;
                    oVar2.getClass();
                    if (oVar2.a()) {
                        oVar2.a.a("sloth.reportWebAmEvent.".concat("webam_error"), map);
                    }
                    com.yandex.passport.common.logger.d dVar3 = a.a;
                    if (a.a.isEnabled()) {
                        a.b(b.b, null, "Failed sendOtpIntentToWhatsApp", e2);
                    }
                }
                return Unit.a;
            case 24:
                nm6 nm6Var25 = nm6.a;
                qgg.h0(obj);
                c cVar = (c) this.k;
                String string = cVar.f.getString(c.j(cVar), null);
                if (string == null) {
                    return null;
                }
                try {
                    r7o r7oVar = z7o.b;
                    x3f x3fVar = cVar.e;
                    x3fVar.getClass();
                    t7oVar = (com.yandex.plus.experiments.api.cache.f) x3fVar.b(com.yandex.plus.experiments.api.cache.f.Companion.serializer(), string);
                } catch (Throwable th2) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th2);
                }
                return t7oVar instanceof t7o ? null : t7oVar;
            case 25:
                nm6 nm6Var26 = nm6.a;
                qgg.h0(obj);
                SharedPreferences sharedPreferences5 = (SharedPreferences) ((com.yandex.plus.experiments.impl.cooldown.c) this.k).e;
                if (!sharedPreferences5.contains("RECHARGE_END")) {
                    sharedPreferences5 = null;
                }
                if (sharedPreferences5 == null) {
                    return null;
                }
                long j5 = sharedPreferences5.getLong("RECHARGE_END", Long.MIN_VALUE);
                msa msaVar = nsa.b;
                return new nsa(yd5.N(j5, ssa.SECONDS));
            case 26:
                nm6 nm6Var27 = nm6.a;
                qgg.h0(obj);
                f fVar = (f) this.k;
                fVar.c.a(fVar);
                return Unit.a;
            case 27:
                nm6 nm6Var28 = nm6.a;
                qgg.h0(obj);
                m mVar = (m) this.k;
                com.yandex.plus.log.api.b bVar2 = mVar.k;
                h hVar = mVar.r;
                if (hVar != null) {
                    com.yandex.plus.home.feature.panel.internalapi.analytics.b bVar3 = mVar.g;
                    com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.g gVar2 = hVar.a;
                    com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.b bVar4 = gVar2.i;
                    String str3 = bVar4 != null ? bVar4.b : null;
                    com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.c cVar2 = hVar.b;
                    String str4 = gVar2.a;
                    if (cVar2 == null || (str = cVar2.a) == null || (c = u75.h(str4, str)) == null) {
                        c = t75.c(str4);
                    }
                    com.yandex.plus.home.analytics.b bVar5 = (com.yandex.plus.home.analytics.b) bVar3;
                    bVar5.getClass();
                    c.getClass();
                    omb ombVar = bVar5.a;
                    int intValue = (str3 == null || (intOrNull = StringsKt.toIntOrNull(str3)) == null) ? -1 : intOrNull.intValue();
                    e5b e5bVar = e5b.a;
                    e5bVar.getClass();
                    ombVar.getClass();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap3.put("counter_val", String.valueOf(intValue));
                    linkedHashMap3.put("origin", e5bVar);
                    linkedHashMap3.put("shortcut_ids", c);
                    linkedHashMap3.put("_meta", omb.a(1, new HashMap()));
                    ombVar.d("PlusPult.DailyWidget.Shown", linkedHashMap3);
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
                    if (bVar2.b(aVar)) {
                        bVar2.c(aVar, "PlusDailyViewController", "onViewAttachedToWindow() daily view displayed");
                    }
                } else {
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
                    if (bVar2.b(aVar2)) {
                        bVar2.c(aVar2, "PlusDailyViewController", "onViewAttachedToWindow() daily content is empty");
                    }
                }
                return Unit.a;
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                nm6 nm6Var29 = nm6.a;
                qgg.h0(obj);
                fmq fmqVar = ((GiftProgressView) this.k).m;
                if (!fmqVar.b) {
                    fmqVar.b = true;
                    ValueAnimator valueAnimator = (ValueAnimator) fmqVar.c;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
                return Unit.a;
            default:
                nm6 nm6Var30 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.home.feature.webviews.internal.d dVar4 = (com.yandex.plus.home.feature.webviews.internal.d) this.k;
                String c2 = dVar4.c();
                if (c2 == null) {
                    c2 = dVar4.a;
                }
                com.yandex.plus.core.analytics.logging.b bVar6 = com.yandex.plus.core.analytics.logging.b.b;
                String g = f1d.g("reload() reloadedUrl=", c2);
                jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar6, g, null);
                dVar4.k(c2);
                return Unit.a;
        }
    }
}
