package ru.yandex.taxi.personalstate.domain.interactor;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.VerticalMode;
import com.yandex.go.zone.model.Zone;
import defpackage.ck31;
import defpackage.dvx;
import defpackage.e3n;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.j6b0;
import defpackage.j7b0;
import defpackage.k6b0;
import defpackage.kp50;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.o430;
import defpackage.pex0;
import defpackage.qoh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import ru.yandex.taxi.personalstate.api.interactor.SavePersonalStateNotifier$SavePersonalStateReason;

/* loaded from: classes9.dex */
public final class i {
    public final tt2 a;
    public final ru.yandex.taxi.launch.c b;
    public final ru.yandex.taxi.personalstate.data.remote.b c;
    public final ru.yandex.taxi.personalstate.data.local.a d;
    public final ck31 e;
    public final com.yandex.go.taxi.tariffs.repository.g f;
    public final k6b0 g;
    public final hbp0 h;
    public final kotlinx.coroutines.sync.a i = gtq0.a();
    public qoh j;

    public i(hit hitVar, tt2 tt2Var, ru.yandex.taxi.launch.c cVar, ru.yandex.taxi.personalstate.data.remote.b bVar, ru.yandex.taxi.personalstate.data.local.a aVar, ck31 ck31Var, com.yandex.go.taxi.tariffs.repository.g gVar, k6b0 k6b0Var) {
        this.a = tt2Var;
        this.b = cVar;
        this.c = bVar;
        this.d = aVar;
        this.e = ck31Var;
        this.f = gVar;
        this.g = k6b0Var;
        this.h = hitVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0133 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:15:0x0042, B:16:0x0149, B:17:0x014e, B:27:0x012f, B:29:0x0133, B:35:0x0081, B:36:0x0109), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2 A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #1 {all -> 0x006d, blocks: (B:25:0x0062, B:38:0x0094, B:40:0x00ee, B:42:0x00f2, B:45:0x010c, B:49:0x00cc), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010c A[Catch: all -> 0x006d, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x006d, blocks: (B:25:0x0062, B:38:0x0094, B:40:0x00ee, B:42:0x00f2, B:45:0x010c, B:49:0x00cc), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v12, types: [g050] */
    /* JADX WARN: Type inference failed for: r13v2, types: [g050] */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, Zone zone, ContinuationImpl continuationImpl) {
        RequestPersonalStateInteractor$fetchPersonalState$1 requestPersonalStateInteractor$fetchPersonalState$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        boolean z;
        Zone zone2;
        g050 g050Var;
        List list2;
        Object k0;
        List list3;
        boolean z2;
        Object x;
        boolean z3;
        g050 g050Var2;
        g050 g050Var3;
        Zone zone3;
        j7b0 j7b0Var;
        j7b0 j7b0Var2;
        g050 g050Var4;
        try {
            try {
                if (continuationImpl instanceof RequestPersonalStateInteractor$fetchPersonalState$1) {
                    requestPersonalStateInteractor$fetchPersonalState$1 = (RequestPersonalStateInteractor$fetchPersonalState$1) continuationImpl;
                    int i2 = requestPersonalStateInteractor$fetchPersonalState$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        requestPersonalStateInteractor$fetchPersonalState$1.label = i2 - Integer.MIN_VALUE;
                        Object obj = requestPersonalStateInteractor$fetchPersonalState$1.result;
                        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = requestPersonalStateInteractor$fetchPersonalState$1.label;
                        ru.yandex.taxi.personalstate.data.local.a aVar = this.d;
                        if (i != 0) {
                            kotlin.b.b(obj);
                            requestPersonalStateInteractor$fetchPersonalState$1.L$0 = list;
                            requestPersonalStateInteractor$fetchPersonalState$1.L$1 = zone;
                            kotlinx.coroutines.sync.a aVar2 = this.i;
                            requestPersonalStateInteractor$fetchPersonalState$1.L$2 = aVar2;
                            z = false;
                            requestPersonalStateInteractor$fetchPersonalState$1.Z$0 = false;
                            requestPersonalStateInteractor$fetchPersonalState$1.label = 1;
                            if (aVar2.a(requestPersonalStateInteractor$fetchPersonalState$1) != coroutineSingletons) {
                                zone2 = zone;
                                g050Var = aVar2;
                                list2 = list;
                            }
                            return coroutineSingletons;
                        }
                        if (i != 1) {
                            if (i == 2) {
                                z2 = requestPersonalStateInteractor$fetchPersonalState$1.Z$0;
                                g050Var = (g050) requestPersonalStateInteractor$fetchPersonalState$1.L$2;
                                Zone zone4 = (Zone) requestPersonalStateInteractor$fetchPersonalState$1.L$1;
                                List list4 = (List) requestPersonalStateInteractor$fetchPersonalState$1.L$0;
                                kotlin.b.b(obj);
                                k0 = obj;
                                zone2 = zone4;
                                list3 = list4;
                                dvx dvxVar = (dvx) k0;
                                if (z2) {
                                    o430 o430Var = e3n.b;
                                    long U = kp50.U(3, DurationUnit.SECONDS);
                                    RequestPersonalStateInteractor$fetchPersonalState$2$personalStateResponse$1 requestPersonalStateInteractor$fetchPersonalState$2$personalStateResponse$1 = new RequestPersonalStateInteractor$fetchPersonalState$2$personalStateResponse$1(this, dvxVar, list3, null);
                                    requestPersonalStateInteractor$fetchPersonalState$1.L$0 = null;
                                    requestPersonalStateInteractor$fetchPersonalState$1.L$1 = zone2;
                                    requestPersonalStateInteractor$fetchPersonalState$1.L$2 = g050Var;
                                    requestPersonalStateInteractor$fetchPersonalState$1.L$3 = null;
                                    requestPersonalStateInteractor$fetchPersonalState$1.Z$0 = z2;
                                    requestPersonalStateInteractor$fetchPersonalState$1.label = 4;
                                    x = kotlinx.coroutines.a.x(U, requestPersonalStateInteractor$fetchPersonalState$2$personalStateResponse$1, requestPersonalStateInteractor$fetchPersonalState$1);
                                    if (x != coroutineSingletons) {
                                        g050 g050Var5 = g050Var;
                                        z3 = z2;
                                        g050Var2 = g050Var5;
                                        j7b0Var2 = (j7b0) x;
                                        if (j7b0Var2 == null) {
                                        }
                                    }
                                } else {
                                    requestPersonalStateInteractor$fetchPersonalState$1.L$0 = null;
                                    requestPersonalStateInteractor$fetchPersonalState$1.L$1 = zone2;
                                    requestPersonalStateInteractor$fetchPersonalState$1.L$2 = g050Var;
                                    requestPersonalStateInteractor$fetchPersonalState$1.L$3 = null;
                                    requestPersonalStateInteractor$fetchPersonalState$1.Z$0 = z2;
                                    requestPersonalStateInteractor$fetchPersonalState$1.label = 3;
                                    Object b = aVar.b(requestPersonalStateInteractor$fetchPersonalState$1);
                                    if (b != coroutineSingletons) {
                                        Zone zone5 = zone2;
                                        obj = b;
                                        g050Var3 = g050Var;
                                        zone3 = zone5;
                                        j7b0Var = (j7b0) obj;
                                        list = g050Var3;
                                        this.g.getClass();
                                        j6b0 a = k6b0.a(zone3, j7b0Var);
                                        list.d(null);
                                        return a;
                                    }
                                }
                                return coroutineSingletons;
                            }
                            if (i == 3) {
                                g050 g050Var6 = (g050) requestPersonalStateInteractor$fetchPersonalState$1.L$2;
                                zone3 = (Zone) requestPersonalStateInteractor$fetchPersonalState$1.L$1;
                                kotlin.b.b(obj);
                                g050Var3 = g050Var6;
                                j7b0Var = (j7b0) obj;
                                list = g050Var3;
                                this.g.getClass();
                                j6b0 a2 = k6b0.a(zone3, j7b0Var);
                                list.d(null);
                                return a2;
                            }
                            if (i != 4) {
                                if (i != 5) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                g050 g050Var7 = (g050) requestPersonalStateInteractor$fetchPersonalState$1.L$2;
                                zone3 = (Zone) requestPersonalStateInteractor$fetchPersonalState$1.L$1;
                                kotlin.b.b(obj);
                                g050Var4 = g050Var7;
                                j7b0Var = (j7b0) obj;
                                list = g050Var4;
                                this.g.getClass();
                                j6b0 a22 = k6b0.a(zone3, j7b0Var);
                                list.d(null);
                                return a22;
                            }
                            boolean z4 = requestPersonalStateInteractor$fetchPersonalState$1.Z$0;
                            g050 g050Var8 = (g050) requestPersonalStateInteractor$fetchPersonalState$1.L$2;
                            Zone zone6 = (Zone) requestPersonalStateInteractor$fetchPersonalState$1.L$1;
                            kotlin.b.b(obj);
                            z3 = z4;
                            g050Var2 = g050Var8;
                            x = obj;
                            zone2 = zone6;
                            j7b0Var2 = (j7b0) x;
                            if (j7b0Var2 == null) {
                                zone3 = zone2;
                                j7b0Var = j7b0Var2;
                                list = g050Var2;
                                this.g.getClass();
                                j6b0 a222 = k6b0.a(zone3, j7b0Var);
                                list.d(null);
                                return a222;
                            }
                            requestPersonalStateInteractor$fetchPersonalState$1.L$0 = null;
                            requestPersonalStateInteractor$fetchPersonalState$1.L$1 = zone2;
                            requestPersonalStateInteractor$fetchPersonalState$1.L$2 = g050Var2;
                            requestPersonalStateInteractor$fetchPersonalState$1.L$3 = null;
                            requestPersonalStateInteractor$fetchPersonalState$1.Z$0 = z3;
                            requestPersonalStateInteractor$fetchPersonalState$1.label = 5;
                            Object b2 = aVar.b(requestPersonalStateInteractor$fetchPersonalState$1);
                            if (b2 != coroutineSingletons) {
                                Zone zone7 = zone2;
                                obj = b2;
                                zone3 = zone7;
                                g050Var4 = g050Var2;
                                j7b0Var = (j7b0) obj;
                                list = g050Var4;
                                this.g.getClass();
                                j6b0 a2222 = k6b0.a(zone3, j7b0Var);
                                list.d(null);
                                return a2222;
                            }
                            return coroutineSingletons;
                        }
                        boolean z5 = requestPersonalStateInteractor$fetchPersonalState$1.Z$0;
                        g050Var = (g050) requestPersonalStateInteractor$fetchPersonalState$1.L$2;
                        Zone zone8 = (Zone) requestPersonalStateInteractor$fetchPersonalState$1.L$1;
                        List list5 = (List) requestPersonalStateInteractor$fetchPersonalState$1.L$0;
                        kotlin.b.b(obj);
                        zone2 = zone8;
                        z = z5;
                        list2 = list5;
                        this.a.getClass();
                        sjh sjhVar = uyj.a;
                        mdh mdhVar = mdh.b;
                        RequestPersonalStateInteractor$fetchPersonalState$2$launchInfo$1 requestPersonalStateInteractor$fetchPersonalState$2$launchInfo$1 = new RequestPersonalStateInteractor$fetchPersonalState$2$launchInfo$1(this, null);
                        requestPersonalStateInteractor$fetchPersonalState$1.L$0 = list2;
                        requestPersonalStateInteractor$fetchPersonalState$1.L$1 = zone2;
                        requestPersonalStateInteractor$fetchPersonalState$1.L$2 = g050Var;
                        requestPersonalStateInteractor$fetchPersonalState$1.Z$0 = z;
                        requestPersonalStateInteractor$fetchPersonalState$1.label = 2;
                        k0 = tje.k0(mdhVar, requestPersonalStateInteractor$fetchPersonalState$2$launchInfo$1, requestPersonalStateInteractor$fetchPersonalState$1);
                        if (k0 != coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        boolean z6 = z;
                        list3 = list2;
                        z2 = z6;
                        dvx dvxVar2 = (dvx) k0;
                        if (z2) {
                        }
                        return coroutineSingletons;
                    }
                }
                if (i != 0) {
                }
                this.a.getClass();
                sjh sjhVar2 = uyj.a;
                mdh mdhVar2 = mdh.b;
                RequestPersonalStateInteractor$fetchPersonalState$2$launchInfo$1 requestPersonalStateInteractor$fetchPersonalState$2$launchInfo$12 = new RequestPersonalStateInteractor$fetchPersonalState$2$launchInfo$1(this, null);
                requestPersonalStateInteractor$fetchPersonalState$1.L$0 = list2;
                requestPersonalStateInteractor$fetchPersonalState$1.L$1 = zone2;
                requestPersonalStateInteractor$fetchPersonalState$1.L$2 = g050Var;
                requestPersonalStateInteractor$fetchPersonalState$1.Z$0 = z;
                requestPersonalStateInteractor$fetchPersonalState$1.label = 2;
                k0 = tje.k0(mdhVar2, requestPersonalStateInteractor$fetchPersonalState$2$launchInfo$12, requestPersonalStateInteractor$fetchPersonalState$1);
                if (k0 != coroutineSingletons) {
                }
            } catch (Throwable th) {
                th = th;
                list.d(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            list = zone;
            list.d(null);
            throw th;
        }
        requestPersonalStateInteractor$fetchPersonalState$1 = new RequestPersonalStateInteractor$fetchPersonalState$1(this, continuationImpl);
        Object obj2 = requestPersonalStateInteractor$fetchPersonalState$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requestPersonalStateInteractor$fetchPersonalState$1.label;
        ru.yandex.taxi.personalstate.data.local.a aVar3 = this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0131, code lost:
    
        if (r3 != r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, Zone zone, pex0 pex0Var, String str2, boolean z, SavePersonalStateNotifier$SavePersonalStateReason savePersonalStateNotifier$SavePersonalStateReason, String str3, ContinuationImpl continuationImpl) {
        RequestPersonalStateInteractor$patchPersonalState$1 requestPersonalStateInteractor$patchPersonalState$1;
        int i;
        String str4;
        Zone zone2;
        pex0 pex0Var2;
        String str5;
        String str6;
        SavePersonalStateNotifier$SavePersonalStateReason savePersonalStateNotifier$SavePersonalStateReason2;
        boolean z2;
        k kVar;
        Map t;
        Zone zone3;
        Object obj;
        Object b;
        Zone zone4;
        if (continuationImpl instanceof RequestPersonalStateInteractor$patchPersonalState$1) {
            requestPersonalStateInteractor$patchPersonalState$1 = (RequestPersonalStateInteractor$patchPersonalState$1) continuationImpl;
            int i2 = requestPersonalStateInteractor$patchPersonalState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requestPersonalStateInteractor$patchPersonalState$1.label = i2 - Integer.MIN_VALUE;
                RequestPersonalStateInteractor$patchPersonalState$1 requestPersonalStateInteractor$patchPersonalState$12 = requestPersonalStateInteractor$patchPersonalState$1;
                Object obj2 = requestPersonalStateInteractor$patchPersonalState$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requestPersonalStateInteractor$patchPersonalState$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    RequestPersonalStateInteractor$patchPersonalState$launchInfo$1 requestPersonalStateInteractor$patchPersonalState$launchInfo$1 = new RequestPersonalStateInteractor$patchPersonalState$launchInfo$1(this, null);
                    str4 = str;
                    requestPersonalStateInteractor$patchPersonalState$12.L$0 = str4;
                    zone2 = zone;
                    requestPersonalStateInteractor$patchPersonalState$12.L$1 = zone2;
                    pex0Var2 = pex0Var;
                    requestPersonalStateInteractor$patchPersonalState$12.L$2 = pex0Var2;
                    str5 = str2;
                    requestPersonalStateInteractor$patchPersonalState$12.L$3 = str5;
                    requestPersonalStateInteractor$patchPersonalState$12.L$4 = savePersonalStateNotifier$SavePersonalStateReason;
                    requestPersonalStateInteractor$patchPersonalState$12.L$5 = str3;
                    requestPersonalStateInteractor$patchPersonalState$12.Z$0 = z;
                    requestPersonalStateInteractor$patchPersonalState$12.label = 1;
                    obj2 = tje.k0(mdhVar, requestPersonalStateInteractor$patchPersonalState$launchInfo$1, requestPersonalStateInteractor$patchPersonalState$12);
                    if (obj2 != coroutineSingletons) {
                        str6 = str3;
                        savePersonalStateNotifier$SavePersonalStateReason2 = savePersonalStateNotifier$SavePersonalStateReason;
                        z2 = z;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        zone4 = (Zone) requestPersonalStateInteractor$patchPersonalState$12.L$1;
                        kotlin.b.b(obj2);
                        this.g.getClass();
                        return k6b0.a(zone4, (j7b0) obj2);
                    }
                    boolean z3 = requestPersonalStateInteractor$patchPersonalState$12.Z$0;
                    zone3 = (Zone) requestPersonalStateInteractor$patchPersonalState$12.L$1;
                    kotlin.b.b(obj2);
                    z2 = z3;
                    b = obj2;
                    obj = null;
                    requestPersonalStateInteractor$patchPersonalState$12.L$0 = obj;
                    requestPersonalStateInteractor$patchPersonalState$12.L$1 = zone3;
                    requestPersonalStateInteractor$patchPersonalState$12.L$2 = obj;
                    requestPersonalStateInteractor$patchPersonalState$12.L$3 = obj;
                    requestPersonalStateInteractor$patchPersonalState$12.L$4 = obj;
                    requestPersonalStateInteractor$patchPersonalState$12.L$5 = obj;
                    requestPersonalStateInteractor$patchPersonalState$12.L$6 = obj;
                    requestPersonalStateInteractor$patchPersonalState$12.L$7 = obj;
                    requestPersonalStateInteractor$patchPersonalState$12.Z$0 = z2;
                    requestPersonalStateInteractor$patchPersonalState$12.label = 3;
                    obj2 = this.d.c((j7b0) b, requestPersonalStateInteractor$patchPersonalState$12);
                    if (obj2 != coroutineSingletons) {
                        zone4 = zone3;
                        this.g.getClass();
                        return k6b0.a(zone4, (j7b0) obj2);
                    }
                    return coroutineSingletons;
                }
                boolean z4 = requestPersonalStateInteractor$patchPersonalState$12.Z$0;
                str6 = (String) requestPersonalStateInteractor$patchPersonalState$12.L$5;
                SavePersonalStateNotifier$SavePersonalStateReason savePersonalStateNotifier$SavePersonalStateReason3 = (SavePersonalStateNotifier$SavePersonalStateReason) requestPersonalStateInteractor$patchPersonalState$12.L$4;
                String str7 = (String) requestPersonalStateInteractor$patchPersonalState$12.L$3;
                pex0Var2 = (pex0) requestPersonalStateInteractor$patchPersonalState$12.L$2;
                Zone zone5 = (Zone) requestPersonalStateInteractor$patchPersonalState$12.L$1;
                String str8 = (String) requestPersonalStateInteractor$patchPersonalState$12.L$0;
                kotlin.b.b(obj2);
                str5 = str7;
                zone2 = zone5;
                savePersonalStateNotifier$SavePersonalStateReason2 = savePersonalStateNotifier$SavePersonalStateReason3;
                str4 = str8;
                z2 = z4;
                String str9 = str6;
                pex0 pex0Var3 = pex0Var2;
                String str10 = ((dvx) obj2).a;
                kVar = (k) this.e;
                t = kotlin.collections.b.t(kVar.j.e);
                if (kVar.j().b != VerticalMode.SELECTOR) {
                    t = null;
                }
                if (t == null) {
                    t = kotlin.collections.b.f();
                }
                com.yandex.go.taxi.tariffs.repository.g gVar = this.f;
                Map map = t;
                LinkedHashMap c = gVar.c();
                Set b2 = gVar.b();
                requestPersonalStateInteractor$patchPersonalState$12.L$0 = null;
                requestPersonalStateInteractor$patchPersonalState$12.L$1 = zone2;
                requestPersonalStateInteractor$patchPersonalState$12.L$2 = null;
                requestPersonalStateInteractor$patchPersonalState$12.L$3 = null;
                requestPersonalStateInteractor$patchPersonalState$12.L$4 = null;
                requestPersonalStateInteractor$patchPersonalState$12.L$5 = null;
                requestPersonalStateInteractor$patchPersonalState$12.L$6 = null;
                requestPersonalStateInteractor$patchPersonalState$12.Z$0 = z2;
                requestPersonalStateInteractor$patchPersonalState$12.label = 2;
                zone3 = zone2;
                obj = null;
                b = this.c.b(str4, zone3, pex0Var3, str10, str5, map, c, b2, z2, savePersonalStateNotifier$SavePersonalStateReason2, str9, requestPersonalStateInteractor$patchPersonalState$12);
            }
        }
        requestPersonalStateInteractor$patchPersonalState$1 = new RequestPersonalStateInteractor$patchPersonalState$1(this, continuationImpl);
        RequestPersonalStateInteractor$patchPersonalState$1 requestPersonalStateInteractor$patchPersonalState$122 = requestPersonalStateInteractor$patchPersonalState$1;
        Object obj22 = requestPersonalStateInteractor$patchPersonalState$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requestPersonalStateInteractor$patchPersonalState$122.label;
        if (i != 0) {
        }
        String str92 = str6;
        pex0 pex0Var32 = pex0Var2;
        String str102 = ((dvx) obj22).a;
        kVar = (k) this.e;
        t = kotlin.collections.b.t(kVar.j.e);
        if (kVar.j().b != VerticalMode.SELECTOR) {
        }
        if (t == null) {
        }
        com.yandex.go.taxi.tariffs.repository.g gVar2 = this.f;
        Map map2 = t;
        LinkedHashMap c2 = gVar2.c();
        Set b22 = gVar2.b();
        requestPersonalStateInteractor$patchPersonalState$122.L$0 = null;
        requestPersonalStateInteractor$patchPersonalState$122.L$1 = zone2;
        requestPersonalStateInteractor$patchPersonalState$122.L$2 = null;
        requestPersonalStateInteractor$patchPersonalState$122.L$3 = null;
        requestPersonalStateInteractor$patchPersonalState$122.L$4 = null;
        requestPersonalStateInteractor$patchPersonalState$122.L$5 = null;
        requestPersonalStateInteractor$patchPersonalState$122.L$6 = null;
        requestPersonalStateInteractor$patchPersonalState$122.Z$0 = z2;
        requestPersonalStateInteractor$patchPersonalState$122.label = 2;
        zone3 = zone2;
        obj = null;
        b = this.c.b(str4, zone3, pex0Var32, str102, str5, map2, c2, b22, z2, savePersonalStateNotifier$SavePersonalStateReason2, str92, requestPersonalStateInteractor$patchPersonalState$122);
    }
}
