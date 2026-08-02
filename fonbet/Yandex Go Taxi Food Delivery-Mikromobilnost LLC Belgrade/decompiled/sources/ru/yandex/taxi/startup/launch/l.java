package ru.yandex.taxi.startup.launch;

import android.os.SystemClock;
import androidx.core.app.s0;
import com.yandex.go.mob.HostMobSupportedApiNames;
import defpackage.bk1;
import defpackage.blh;
import defpackage.bpt;
import defpackage.cw11;
import defpackage.evu0;
import defpackage.ewx;
import defpackage.fmt;
import defpackage.fse;
import defpackage.h0b0;
import defpackage.hd7;
import defpackage.iq20;
import defpackage.k0b0;
import defpackage.kb20;
import defpackage.kd7;
import defpackage.lq20;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.of;
import defpackage.owx;
import defpackage.pr20;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v4r0;
import defpackage.xd1;
import defpackage.yd1;
import defpackage.zux;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.client.api.LaunchApi;

/* loaded from: classes10.dex */
public final class l {
    public final LaunchApi a;
    public final zux b;
    public final j c;
    public final bk1 d;
    public final bpt e;
    public final kb20 f;
    public final ru.yandex.taxi.am.token.a g;
    public final yd1 h;
    public final blh i;
    public final tt2 j;

    public l(LaunchApi launchApi, zux zuxVar, j jVar, bk1 bk1Var, bpt bptVar, kb20 kb20Var, ru.yandex.taxi.am.token.a aVar, yd1 yd1Var, blh blhVar, tt2 tt2Var) {
        this.a = launchApi;
        this.b = zuxVar;
        this.c = jVar;
        this.d = bk1Var;
        this.e = bptVar;
        this.f = kb20Var;
        this.g = aVar;
        this.h = yd1Var;
        this.i = blhVar;
        this.j = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ewx ewxVar, hd7 hd7Var, boolean z, String str, String str2, ContinuationImpl continuationImpl) {
        LaunchRepositoryImpl$makeRequest$1 launchRepositoryImpl$makeRequest$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        ewx ewxVar2;
        boolean z2;
        hd7 hd7Var2;
        String str3;
        String str4;
        Object obj2;
        cw11 cw11Var;
        String str5;
        boolean z3;
        fmt fmtVar;
        String a;
        fmt fmtVar2;
        if (continuationImpl instanceof LaunchRepositoryImpl$makeRequest$1) {
            launchRepositoryImpl$makeRequest$1 = (LaunchRepositoryImpl$makeRequest$1) continuationImpl;
            int i2 = launchRepositoryImpl$makeRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                launchRepositoryImpl$makeRequest$1.label = i2 - Integer.MIN_VALUE;
                LaunchRepositoryImpl$makeRequest$1 launchRepositoryImpl$makeRequest$12 = launchRepositoryImpl$makeRequest$1;
                obj = launchRepositoryImpl$makeRequest$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = launchRepositoryImpl$makeRequest$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ewxVar2 = ewxVar;
                    launchRepositoryImpl$makeRequest$12.L$0 = ewxVar2;
                    launchRepositoryImpl$makeRequest$12.L$1 = hd7Var;
                    launchRepositoryImpl$makeRequest$12.L$2 = str;
                    launchRepositoryImpl$makeRequest$12.L$3 = str2;
                    z2 = z;
                    launchRepositoryImpl$makeRequest$12.Z$0 = z2;
                    launchRepositoryImpl$makeRequest$12.label = 1;
                    Object b = ((com.yandex.go.ads.prefetch.impl.c) this.h).b(launchRepositoryImpl$makeRequest$12);
                    if (b != coroutineSingletons) {
                        hd7Var2 = hd7Var;
                        str3 = str;
                        str4 = str2;
                        obj2 = b;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fmtVar2 = (fmt) launchRepositoryImpl$makeRequest$12.L$7;
                        kotlin.b.b(obj);
                        fmtVar = fmtVar2;
                        return fmtVar.a;
                    }
                    z3 = launchRepositoryImpl$makeRequest$12.Z$0;
                    str5 = (String) launchRepositoryImpl$makeRequest$12.L$2;
                    kotlin.b.b(obj);
                    fmtVar = (fmt) obj;
                    a = fmtVar.d.a("Authorization");
                    if ((str5 != null || evu0.J(str5)) && a != null && !evu0.J(a) && !((owx) fmtVar.a).o) {
                        launchRepositoryImpl$makeRequest$12.L$0 = null;
                        launchRepositoryImpl$makeRequest$12.L$1 = null;
                        launchRepositoryImpl$makeRequest$12.L$2 = null;
                        launchRepositoryImpl$makeRequest$12.L$3 = null;
                        launchRepositoryImpl$makeRequest$12.L$4 = null;
                        launchRepositoryImpl$makeRequest$12.L$5 = null;
                        launchRepositoryImpl$makeRequest$12.L$6 = null;
                        launchRepositoryImpl$makeRequest$12.L$7 = fmtVar;
                        launchRepositoryImpl$makeRequest$12.L$8 = null;
                        launchRepositoryImpl$makeRequest$12.Z$0 = z3;
                        launchRepositoryImpl$makeRequest$12.label = 3;
                        if (this.g.h(a, launchRepositoryImpl$makeRequest$12) != coroutineSingletons) {
                            fmtVar2 = fmtVar;
                            fmtVar = fmtVar2;
                        }
                        return coroutineSingletons;
                    }
                    return fmtVar.a;
                }
                boolean z4 = launchRepositoryImpl$makeRequest$12.Z$0;
                str4 = (String) launchRepositoryImpl$makeRequest$12.L$3;
                String str6 = (String) launchRepositoryImpl$makeRequest$12.L$2;
                hd7 hd7Var3 = (hd7) launchRepositoryImpl$makeRequest$12.L$1;
                ewx ewxVar3 = (ewx) launchRepositoryImpl$makeRequest$12.L$0;
                kotlin.b.b(obj);
                obj2 = obj;
                ewxVar2 = ewxVar3;
                hd7Var2 = hd7Var3;
                z2 = z4;
                str3 = str6;
                xd1 xd1Var = (xd1) obj2;
                cw11Var = (cw11) launchRepositoryImpl$makeRequest$12.get_context().get(cw11.c);
                if (cw11Var == null) {
                    cw11Var = new cw11(true, false);
                }
                this.j.getClass();
                sjh sjhVar = uyj.a;
                fse plus = mdh.b.plus(cw11Var);
                LaunchRepositoryImpl$makeRequest$response$1 launchRepositoryImpl$makeRequest$response$1 = new LaunchRepositoryImpl$makeRequest$response$1(str3, this, ewxVar2, str4, xd1Var, z2, hd7Var2, null);
                launchRepositoryImpl$makeRequest$12.L$0 = null;
                launchRepositoryImpl$makeRequest$12.L$1 = null;
                launchRepositoryImpl$makeRequest$12.L$2 = str3;
                launchRepositoryImpl$makeRequest$12.L$3 = null;
                launchRepositoryImpl$makeRequest$12.L$4 = null;
                launchRepositoryImpl$makeRequest$12.L$5 = null;
                launchRepositoryImpl$makeRequest$12.L$6 = null;
                launchRepositoryImpl$makeRequest$12.Z$0 = z2;
                launchRepositoryImpl$makeRequest$12.label = 2;
                obj = tje.k0(plus, launchRepositoryImpl$makeRequest$response$1, launchRepositoryImpl$makeRequest$12);
                if (obj != coroutineSingletons) {
                    str5 = str3;
                    z3 = z2;
                    fmtVar = (fmt) obj;
                    a = fmtVar.d.a("Authorization");
                    if (str5 != null) {
                    }
                    launchRepositoryImpl$makeRequest$12.L$0 = null;
                    launchRepositoryImpl$makeRequest$12.L$1 = null;
                    launchRepositoryImpl$makeRequest$12.L$2 = null;
                    launchRepositoryImpl$makeRequest$12.L$3 = null;
                    launchRepositoryImpl$makeRequest$12.L$4 = null;
                    launchRepositoryImpl$makeRequest$12.L$5 = null;
                    launchRepositoryImpl$makeRequest$12.L$6 = null;
                    launchRepositoryImpl$makeRequest$12.L$7 = fmtVar;
                    launchRepositoryImpl$makeRequest$12.L$8 = null;
                    launchRepositoryImpl$makeRequest$12.Z$0 = z3;
                    launchRepositoryImpl$makeRequest$12.label = 3;
                    if (this.g.h(a, launchRepositoryImpl$makeRequest$12) != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        launchRepositoryImpl$makeRequest$1 = new LaunchRepositoryImpl$makeRequest$1(this, continuationImpl);
        LaunchRepositoryImpl$makeRequest$1 launchRepositoryImpl$makeRequest$122 = launchRepositoryImpl$makeRequest$1;
        obj = launchRepositoryImpl$makeRequest$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = launchRepositoryImpl$makeRequest$122.label;
        if (i != 0) {
        }
        xd1 xd1Var2 = (xd1) obj2;
        cw11Var = (cw11) launchRepositoryImpl$makeRequest$122.get_context().get(cw11.c);
        if (cw11Var == null) {
        }
        this.j.getClass();
        sjh sjhVar2 = uyj.a;
        fse plus2 = mdh.b.plus(cw11Var);
        LaunchRepositoryImpl$makeRequest$response$1 launchRepositoryImpl$makeRequest$response$12 = new LaunchRepositoryImpl$makeRequest$response$1(str3, this, ewxVar2, str4, xd1Var2, z2, hd7Var2, null);
        launchRepositoryImpl$makeRequest$122.L$0 = null;
        launchRepositoryImpl$makeRequest$122.L$1 = null;
        launchRepositoryImpl$makeRequest$122.L$2 = str3;
        launchRepositoryImpl$makeRequest$122.L$3 = null;
        launchRepositoryImpl$makeRequest$122.L$4 = null;
        launchRepositoryImpl$makeRequest$122.L$5 = null;
        launchRepositoryImpl$makeRequest$122.L$6 = null;
        launchRepositoryImpl$makeRequest$122.Z$0 = z2;
        launchRepositoryImpl$makeRequest$122.label = 2;
        obj = tje.k0(plus2, launchRepositoryImpl$makeRequest$response$12, launchRepositoryImpl$makeRequest$122);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, boolean z, ContinuationImpl continuationImpl) {
        LaunchRepositoryImpl$request$1 launchRepositoryImpl$request$1;
        Object obj;
        int i;
        String str4;
        String str5;
        boolean z2;
        Set set;
        j jVar;
        Object b;
        String str6;
        String str7;
        hd7 hd7Var;
        boolean z3;
        Set set2;
        boolean z4;
        String str8;
        hd7 hd7Var2;
        lq20 lq20Var;
        boolean z5;
        Set set3;
        pr20 pr20Var;
        owx owxVar;
        owx owxVar2;
        if (continuationImpl instanceof LaunchRepositoryImpl$request$1) {
            launchRepositoryImpl$request$1 = (LaunchRepositoryImpl$request$1) continuationImpl;
            int i2 = launchRepositoryImpl$request$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                launchRepositoryImpl$request$1.label = i2 - Integer.MIN_VALUE;
                LaunchRepositoryImpl$request$1 launchRepositoryImpl$request$12 = launchRepositoryImpl$request$1;
                Object obj2 = launchRepositoryImpl$request$12.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = launchRepositoryImpl$request$12.label;
                zux zuxVar = this.b;
                bk1 bk1Var = this.d;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ((ru.yandex.taxi.analytics.j) zuxVar.a).q("LaunchProcessing.Request", "from", str);
                    String str9 = ((s0) zuxVar.e.getValue()).b.areNotificationsEnabled() ? "Registered" : "NotRegisteredOrUnknown";
                    k0b0 k0b0Var = zuxVar.c;
                    ru.yandex.taxi.systemrequeirements.location.n nVar = zuxVar.d;
                    String str10 = "Unavailable";
                    if (!nVar.c()) {
                        if (k0b0Var.g()) {
                            str10 = "Precise";
                        } else if (k0b0Var.a()) {
                            str10 = "Inaccurate";
                        } else if (nVar.c() || k0b0Var.g() || k0b0Var.a()) {
                            str10 = "Unknown";
                        }
                    }
                    h0b0 h0b0Var = zuxVar.b;
                    h0b0Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("location", str10);
                    hashMap.put("push_notifications", str9);
                    h0b0Var.a.a("Permissions", hashMap, 1, new HashMap());
                    Set n = ((com.yandex.go.agreement.interactor.a) bk1Var).b.a.n("ru.yandex.taxi.gdpr.NEED_SEND_TYPES");
                    this.j.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    LaunchRepositoryImpl$request$cachedExperimentsRequest$1 launchRepositoryImpl$request$cachedExperimentsRequest$1 = new LaunchRepositoryImpl$request$cachedExperimentsRequest$1(this, null);
                    launchRepositoryImpl$request$12.L$0 = null;
                    str4 = str2;
                    launchRepositoryImpl$request$12.L$1 = str4;
                    str5 = str3;
                    launchRepositoryImpl$request$12.L$2 = str5;
                    launchRepositoryImpl$request$12.L$3 = n;
                    z2 = z;
                    launchRepositoryImpl$request$12.Z$0 = z2;
                    launchRepositoryImpl$request$12.label = 1;
                    Object k0 = tje.k0(mdhVar, launchRepositoryImpl$request$cachedExperimentsRequest$1, launchRepositoryImpl$request$12);
                    if (k0 != obj) {
                        set = n;
                        obj2 = k0;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i == 2) {
                        z3 = launchRepositoryImpl$request$12.Z$0;
                        str6 = (String) launchRepositoryImpl$request$12.L$6;
                        jVar = (j) launchRepositoryImpl$request$12.L$5;
                        hd7Var = (hd7) launchRepositoryImpl$request$12.L$4;
                        set2 = (Set) launchRepositoryImpl$request$12.L$3;
                        str7 = (String) launchRepositoryImpl$request$12.L$2;
                        kotlin.b.b(obj2);
                        kd7 kd7Var = hd7Var.d;
                        launchRepositoryImpl$request$12.L$0 = null;
                        launchRepositoryImpl$request$12.L$1 = null;
                        launchRepositoryImpl$request$12.L$2 = str7;
                        launchRepositoryImpl$request$12.L$3 = set2;
                        launchRepositoryImpl$request$12.L$4 = hd7Var;
                        launchRepositoryImpl$request$12.L$5 = null;
                        launchRepositoryImpl$request$12.L$6 = null;
                        launchRepositoryImpl$request$12.Z$0 = z3;
                        launchRepositoryImpl$request$12.label = 3;
                        obj2 = jVar.a(str6, (Set) obj2, kd7Var, launchRepositoryImpl$request$12);
                        if (obj2 != obj) {
                            z4 = z3;
                            str8 = str7;
                            hd7Var2 = hd7Var;
                            ewx ewxVar = (ewx) obj2;
                            iq20 a = this.e.a.a(HostMobSupportedApiNames.TAXI_V4);
                            if (a != null) {
                            }
                            if (lq20Var != null) {
                            }
                            String str11 = "unknown";
                            launchRepositoryImpl$request$12.L$0 = null;
                            launchRepositoryImpl$request$12.L$1 = null;
                            launchRepositoryImpl$request$12.L$2 = null;
                            launchRepositoryImpl$request$12.L$3 = set2;
                            launchRepositoryImpl$request$12.L$4 = null;
                            launchRepositoryImpl$request$12.L$5 = null;
                            launchRepositoryImpl$request$12.Z$0 = z4;
                            launchRepositoryImpl$request$12.label = 4;
                            obj2 = a(ewxVar, hd7Var2, z4, str8, str11, launchRepositoryImpl$request$12);
                            if (obj2 != obj) {
                            }
                        }
                        return obj;
                    }
                    if (i == 3) {
                        boolean z6 = launchRepositoryImpl$request$12.Z$0;
                        hd7 hd7Var3 = (hd7) launchRepositoryImpl$request$12.L$4;
                        Set set4 = (Set) launchRepositoryImpl$request$12.L$3;
                        String str12 = (String) launchRepositoryImpl$request$12.L$2;
                        kotlin.b.b(obj2);
                        z4 = z6;
                        hd7Var2 = hd7Var3;
                        set2 = set4;
                        str8 = str12;
                        ewx ewxVar2 = (ewx) obj2;
                        iq20 a2 = this.e.a.a(HostMobSupportedApiNames.TAXI_V4);
                        lq20Var = (a2 != null || (pr20Var = a2.a) == null) ? null : pr20Var.a;
                        if (lq20Var != null || (str11 = lq20Var.b) == null) {
                            String str112 = "unknown";
                        }
                        launchRepositoryImpl$request$12.L$0 = null;
                        launchRepositoryImpl$request$12.L$1 = null;
                        launchRepositoryImpl$request$12.L$2 = null;
                        launchRepositoryImpl$request$12.L$3 = set2;
                        launchRepositoryImpl$request$12.L$4 = null;
                        launchRepositoryImpl$request$12.L$5 = null;
                        launchRepositoryImpl$request$12.Z$0 = z4;
                        launchRepositoryImpl$request$12.label = 4;
                        obj2 = a(ewxVar2, hd7Var2, z4, str8, str112, launchRepositoryImpl$request$12);
                        if (obj2 != obj) {
                            z5 = z4;
                            set3 = set2;
                            owxVar = (owx) obj2;
                            if (owxVar.a) {
                            }
                            launchRepositoryImpl$request$12.L$0 = null;
                            launchRepositoryImpl$request$12.L$1 = null;
                            launchRepositoryImpl$request$12.L$2 = null;
                            launchRepositoryImpl$request$12.L$3 = null;
                            launchRepositoryImpl$request$12.L$4 = null;
                            launchRepositoryImpl$request$12.L$5 = null;
                            launchRepositoryImpl$request$12.L$6 = owxVar;
                            launchRepositoryImpl$request$12.Z$0 = z5;
                            launchRepositoryImpl$request$12.label = 5;
                            if (((com.yandex.go.agreement.interactor.a) bk1Var).c.a(launchRepositoryImpl$request$12) != obj) {
                            }
                        }
                        return obj;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        owxVar2 = (owx) launchRepositoryImpl$request$12.L$6;
                        kotlin.b.b(obj2);
                        zuxVar.getClass();
                        String concat = "launch".concat("success");
                        ru.yandex.taxi.analytics.j jVar2 = (ru.yandex.taxi.analytics.j) zuxVar.a;
                        ru.yandex.taxi.analytics.i d = jVar2.d(concat);
                        d.j((r2 & 1) == 0);
                        d.m();
                        ru.yandex.taxi.analytics.i d2 = jVar2.d(concat);
                        d2.j((r2 & 1) == 0);
                        d2.n();
                        return owxVar2;
                    }
                    z5 = launchRepositoryImpl$request$12.Z$0;
                    set3 = (Set) launchRepositoryImpl$request$12.L$3;
                    kotlin.b.b(obj2);
                    owxVar = (owx) obj2;
                    if (owxVar.a) {
                        of ofVar = ((com.yandex.go.agreement.interactor.a) bk1Var).b;
                        Iterator it = set3.iterator();
                        while (it.hasNext()) {
                            ofVar.d.put((String) it.next(), Long.valueOf(SystemClock.elapsedRealtime()));
                        }
                        Set n2 = ofVar.a.n("ru.yandex.taxi.gdpr.NEED_SEND_TYPES");
                        boolean isEmpty = n2.isEmpty();
                        boolean isEmpty2 = set3.isEmpty();
                        if (!isEmpty && !isEmpty2) {
                            ofVar.a.t("ru.yandex.taxi.gdpr.NEED_SEND_TYPES", v4r0.g(n2, set3));
                        }
                    }
                    launchRepositoryImpl$request$12.L$0 = null;
                    launchRepositoryImpl$request$12.L$1 = null;
                    launchRepositoryImpl$request$12.L$2 = null;
                    launchRepositoryImpl$request$12.L$3 = null;
                    launchRepositoryImpl$request$12.L$4 = null;
                    launchRepositoryImpl$request$12.L$5 = null;
                    launchRepositoryImpl$request$12.L$6 = owxVar;
                    launchRepositoryImpl$request$12.Z$0 = z5;
                    launchRepositoryImpl$request$12.label = 5;
                    if (((com.yandex.go.agreement.interactor.a) bk1Var).c.a(launchRepositoryImpl$request$12) != obj) {
                        owxVar2 = owxVar;
                        zuxVar.getClass();
                        String concat2 = "launch".concat("success");
                        ru.yandex.taxi.analytics.j jVar22 = (ru.yandex.taxi.analytics.j) zuxVar.a;
                        ru.yandex.taxi.analytics.i d3 = jVar22.d(concat2);
                        d3.j((r2 & 1) == 0);
                        d3.m();
                        ru.yandex.taxi.analytics.i d22 = jVar22.d(concat2);
                        d22.j((r2 & 1) == 0);
                        d22.n();
                        return owxVar2;
                    }
                    return obj;
                }
                boolean z7 = launchRepositoryImpl$request$12.Z$0;
                set = (Set) launchRepositoryImpl$request$12.L$3;
                String str13 = (String) launchRepositoryImpl$request$12.L$2;
                str4 = (String) launchRepositoryImpl$request$12.L$1;
                kotlin.b.b(obj2);
                z2 = z7;
                str5 = str13;
                hd7 hd7Var4 = (hd7) obj2;
                launchRepositoryImpl$request$12.L$0 = null;
                launchRepositoryImpl$request$12.L$1 = null;
                launchRepositoryImpl$request$12.L$2 = str5;
                launchRepositoryImpl$request$12.L$3 = set;
                launchRepositoryImpl$request$12.L$4 = hd7Var4;
                jVar = this.c;
                launchRepositoryImpl$request$12.L$5 = jVar;
                launchRepositoryImpl$request$12.L$6 = str4;
                launchRepositoryImpl$request$12.Z$0 = z2;
                launchRepositoryImpl$request$12.label = 2;
                b = ((com.yandex.go.agreement.interactor.a) bk1Var).b(set, launchRepositoryImpl$request$12);
                if (b != obj) {
                    str6 = str4;
                    str7 = str5;
                    hd7Var = hd7Var4;
                    obj2 = b;
                    z3 = z2;
                    set2 = set;
                    kd7 kd7Var2 = hd7Var.d;
                    launchRepositoryImpl$request$12.L$0 = null;
                    launchRepositoryImpl$request$12.L$1 = null;
                    launchRepositoryImpl$request$12.L$2 = str7;
                    launchRepositoryImpl$request$12.L$3 = set2;
                    launchRepositoryImpl$request$12.L$4 = hd7Var;
                    launchRepositoryImpl$request$12.L$5 = null;
                    launchRepositoryImpl$request$12.L$6 = null;
                    launchRepositoryImpl$request$12.Z$0 = z3;
                    launchRepositoryImpl$request$12.label = 3;
                    obj2 = jVar.a(str6, (Set) obj2, kd7Var2, launchRepositoryImpl$request$12);
                    if (obj2 != obj) {
                    }
                }
                return obj;
            }
        }
        launchRepositoryImpl$request$1 = new LaunchRepositoryImpl$request$1(this, continuationImpl);
        LaunchRepositoryImpl$request$1 launchRepositoryImpl$request$122 = launchRepositoryImpl$request$1;
        Object obj22 = launchRepositoryImpl$request$122.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = launchRepositoryImpl$request$122.label;
        zux zuxVar2 = this.b;
        bk1 bk1Var2 = this.d;
        if (i != 0) {
        }
        hd7 hd7Var42 = (hd7) obj22;
        launchRepositoryImpl$request$122.L$0 = null;
        launchRepositoryImpl$request$122.L$1 = null;
        launchRepositoryImpl$request$122.L$2 = str5;
        launchRepositoryImpl$request$122.L$3 = set;
        launchRepositoryImpl$request$122.L$4 = hd7Var42;
        jVar = this.c;
        launchRepositoryImpl$request$122.L$5 = jVar;
        launchRepositoryImpl$request$122.L$6 = str4;
        launchRepositoryImpl$request$122.Z$0 = z2;
        launchRepositoryImpl$request$122.label = 2;
        b = ((com.yandex.go.agreement.interactor.a) bk1Var2).b(set, launchRepositoryImpl$request$122);
        if (b != obj) {
        }
        return obj;
    }
}
