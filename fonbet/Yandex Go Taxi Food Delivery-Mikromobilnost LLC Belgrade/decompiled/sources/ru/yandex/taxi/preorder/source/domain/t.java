package ru.yandex.taxi.preorder.source.domain;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.ah00;
import defpackage.bvf0;
import defpackage.dqe0;
import defpackage.gh00;
import defpackage.git0;
import defpackage.hp0;
import defpackage.jjt0;
import defpackage.kr0;
import defpackage.ky2;
import defpackage.lcz;
import defpackage.mo21;
import defpackage.n8k0;
import defpackage.ny61;
import defpackage.o61;
import defpackage.o950;
import defpackage.pft0;
import defpackage.po21;
import defpackage.r8c0;
import defpackage.r9p;
import defpackage.s8z;
import defpackage.tft0;
import defpackage.tje;
import defpackage.tse;
import defpackage.urv0;
import defpackage.z6r;
import defpackage.zy11;
import defpackage.zzs;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.FallbackLocationAnalytics$FallbackSource;
import ru.yandex.taxi.analytics.LocationRequestAnalytics$Source;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.CoordinateProvider$Source;
import ru.yandex.taxi.systemrequeirements.location.LocationRequirementsException;

/* loaded from: classes6.dex */
public final class t implements pft0 {
    public final Lifecycle a;
    public final ah00 b;
    public final dqe0 c;
    public final ky2 d;
    public final ru.yandex.taxi.preorder.source.mode.interactor.e e;
    public final com.yandex.go.route.interactor.c f;
    public final po21 g;
    public final s8z h;
    public final r9p i;
    public final urv0 j;
    public final jjt0 k;
    public final tft0 l;
    public final kr0 m;
    public final z6r n;
    public final git0 o;
    public final lcz p;
    public final hp0 q;
    public final ru.yandex.taxi.systemrequeirements.location.l r;
    public final n8k0 s = new n8k0(1, this);
    public boolean t;
    public boolean u;

    public t(Lifecycle lifecycle, ah00 ah00Var, dqe0 dqe0Var, ky2 ky2Var, ru.yandex.taxi.preorder.source.mode.interactor.e eVar, com.yandex.go.route.interactor.c cVar, po21 po21Var, s8z s8zVar, r9p r9pVar, urv0 urv0Var, jjt0 jjt0Var, tft0 tft0Var, kr0 kr0Var, z6r z6rVar, git0 git0Var, lcz lczVar, hp0 hp0Var, ru.yandex.taxi.systemrequeirements.location.l lVar) {
        this.a = lifecycle;
        this.b = ah00Var;
        this.c = dqe0Var;
        this.d = ky2Var;
        this.e = eVar;
        this.f = cVar;
        this.g = po21Var;
        this.h = s8zVar;
        this.i = r9pVar;
        this.j = urv0Var;
        this.k = jjt0Var;
        this.l = tft0Var;
        this.m = kr0Var;
        this.n = z6rVar;
        this.o = git0Var;
        this.p = lczVar;
        this.q = hp0Var;
        this.r = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0096, code lost:
    
        if (r9.g(r11, r0, false) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(t tVar, LocationRequirementsException locationRequirementsException, ContinuationImpl continuationImpl) {
        SourcePointLocationOnStartInteractor$handleLocationRequirementsException$1 sourcePointLocationOnStartInteractor$handleLocationRequirementsException$1;
        int i;
        tVar.getClass();
        if (continuationImpl instanceof SourcePointLocationOnStartInteractor$handleLocationRequirementsException$1) {
            sourcePointLocationOnStartInteractor$handleLocationRequirementsException$1 = (SourcePointLocationOnStartInteractor$handleLocationRequirementsException$1) continuationImpl;
            int i2 = sourcePointLocationOnStartInteractor$handleLocationRequirementsException$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sourcePointLocationOnStartInteractor$handleLocationRequirementsException$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sourcePointLocationOnStartInteractor$handleLocationRequirementsException$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourcePointLocationOnStartInteractor$handleLocationRequirementsException$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mo21 fallbackUserLocation = locationRequirementsException.getFallbackUserLocation();
                    if (fallbackUserLocation != null) {
                        r9p r9pVar = tVar.i;
                        r9pVar.getClass();
                        if (fallbackUserLocation.h.equals(CoordinateProvider$Source.ZERO_KM.toString())) {
                            FallbackLocationAnalytics$FallbackSource fallbackLocationAnalytics$FallbackSource = FallbackLocationAnalytics$FallbackSource.PREDEFINED;
                            o61 o61Var = r9pVar.a;
                            String lowerCase = fallbackLocationAnalytics$FallbackSource.toString().toLowerCase(Locale.ROOT);
                            o61Var.getClass();
                            HashMap hashMap = new HashMap();
                            hashMap.put("source", lowerCase);
                            o61Var.a.a("Geofallback.Used", hashMap, 1, new HashMap());
                        }
                    }
                    sourcePointLocationOnStartInteractor$handleLocationRequirementsException$1.L$0 = locationRequirementsException;
                    sourcePointLocationOnStartInteractor$handleLocationRequirementsException$1.L$1 = null;
                    sourcePointLocationOnStartInteractor$handleLocationRequirementsException$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    locationRequirementsException = (LocationRequirementsException) sourcePointLocationOnStartInteractor$handleLocationRequirementsException$1.L$0;
                    kotlin.b.b(obj);
                }
                sourcePointLocationOnStartInteractor$handleLocationRequirementsException$1.L$0 = null;
                sourcePointLocationOnStartInteractor$handleLocationRequirementsException$1.L$1 = null;
                sourcePointLocationOnStartInteractor$handleLocationRequirementsException$1.label = 2;
                Object f = tVar.f(locationRequirementsException, sourcePointLocationOnStartInteractor$handleLocationRequirementsException$1);
                return f != obj2 ? obj2 : f;
            }
        }
        sourcePointLocationOnStartInteractor$handleLocationRequirementsException$1 = new SourcePointLocationOnStartInteractor$handleLocationRequirementsException$1(tVar, continuationImpl);
        Object obj3 = sourcePointLocationOnStartInteractor$handleLocationRequirementsException$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourcePointLocationOnStartInteractor$handleLocationRequirementsException$1.label;
        if (i != 0) {
        }
        sourcePointLocationOnStartInteractor$handleLocationRequirementsException$1.L$0 = null;
        sourcePointLocationOnStartInteractor$handleLocationRequirementsException$1.L$1 = null;
        sourcePointLocationOnStartInteractor$handleLocationRequirementsException$1.label = 2;
        Object f2 = tVar.f(locationRequirementsException, sourcePointLocationOnStartInteractor$handleLocationRequirementsException$1);
        if (f2 != obj22) {
        }
    }

    @Override // defpackage.pft0
    public final void b(tse tseVar) {
        tje.N(tseVar, null, null, new SourcePointLocationOnStartInteractor$onStart$1(this, null), 3);
    }

    @Override // defpackage.pft0
    public final void c() {
        this.d.d(this.s);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:19|20))(5:21|22|23|(4:26|14|15|16)|25))(1:27))(1:37)|28|(1:30)|31|(6:33|34|(2:36|25)|23|(0)|25)|15|16))|43|6|7|(0)(0)|28|(0)|31|(0)|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006f, code lost:
    
        if (r9 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b8, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x003d, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b1, code lost:
    
        r5.b(ru.yandex.taxi.analytics.LocationRequestAnalytics$Source.GEO_AVAILABLE_SUBSCRIPTION, r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(LocationRequirementsException locationRequirementsException, ContinuationImpl continuationImpl) {
        SourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1 sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1;
        int i;
        Object c;
        Throwable a;
        mo21 mo21Var;
        mo21 mo21Var2;
        if (continuationImpl instanceof SourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1) {
            sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1 = (SourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1) continuationImpl;
            int i2 = sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1.label;
                lcz lczVar = this.p;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1.L$0 = null;
                    sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1.label = 1;
                    c = this.r.c(locationRequirementsException, sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            mo21Var2 = (mo21) sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1.L$3;
                            kotlin.b.b(obj);
                            lczVar.a(LocationRequestAnalytics$Source.GEO_AVAILABLE_SUBSCRIPTION, mo21Var2);
                            return zy11.a;
                        }
                        c = sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1.L$1;
                        kotlin.b.b(obj);
                        mo21Var = (mo21) obj;
                        sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1.L$0 = null;
                        sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1.L$1 = c;
                        sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1.L$2 = null;
                        sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1.L$3 = mo21Var;
                        sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1.label = 3;
                        if (g(mo21Var, sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1, true) != obj2) {
                            mo21Var2 = mo21Var;
                            lczVar.a(LocationRequestAnalytics$Source.GEO_AVAILABLE_SUBSCRIPTION, mo21Var2);
                            return zy11.a;
                        }
                        return obj2;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a != null) {
                    lczVar.b(LocationRequestAnalytics$Source.GEO_AVAILABLE_SUBSCRIPTION, a);
                }
                if (!(c instanceof Result.Failure)) {
                    po21 po21Var = this.g;
                    sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1.L$0 = null;
                    sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1.L$1 = c;
                    sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1.L$2 = null;
                    sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1.label = 2;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).f(sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                    mo21Var = (mo21) obj;
                    sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1.L$0 = null;
                    sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1.L$1 = c;
                    sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1.L$2 = null;
                    sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1.L$3 = mo21Var;
                    sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1.label = 3;
                    if (g(mo21Var, sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1, true) != obj2) {
                    }
                    return obj2;
                }
                return zy11.a;
            }
        }
        sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1 = new SourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1(this, continuationImpl);
        Object obj3 = sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourcePointLocationOnStartInteractor$awaitLocationRequirementsAndUpdateLocation$1.label;
        lcz lczVar2 = this.p;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a != null) {
        }
        if (!(c instanceof Result.Failure)) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0168, code lost:
    
        if (r0 == r7) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0114 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(mo21 mo21Var, ContinuationImpl continuationImpl, boolean z) {
        SourcePointLocationOnStartInteractor$handleUserLocationOnStart$1 sourcePointLocationOnStartInteractor$handleUserLocationOnStart$1;
        Object obj;
        int i;
        String str;
        ZoneAddress zoneAddress;
        Zone zone;
        ZoneAddress zoneAddress2;
        zzs a;
        PositionInitAction positionInitAction;
        ZoneAddress zoneAddress3;
        boolean z2;
        zzs zzsVar;
        String str2;
        PositionInitAction positionInitAction2;
        mo21 mo21Var2 = mo21Var;
        boolean z3 = z;
        if (continuationImpl instanceof SourcePointLocationOnStartInteractor$handleUserLocationOnStart$1) {
            sourcePointLocationOnStartInteractor$handleUserLocationOnStart$1 = (SourcePointLocationOnStartInteractor$handleUserLocationOnStart$1) continuationImpl;
            int i2 = sourcePointLocationOnStartInteractor$handleUserLocationOnStart$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sourcePointLocationOnStartInteractor$handleUserLocationOnStart$1.label = i2 - Integer.MIN_VALUE;
                SourcePointLocationOnStartInteractor$handleUserLocationOnStart$1 sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12 = sourcePointLocationOnStartInteractor$handleUserLocationOnStart$1;
                obj = sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.label;
                str = "auto";
                Object obj3 = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (mo21Var2 == null) {
                        this.u = false;
                        return obj3;
                    }
                    zoneAddress = this.f.c().a;
                    if (this.e.a.a().q() || this.q.a()) {
                        if (zoneAddress != null && (zone = zoneAddress.b) != null) {
                            this.k.b(zone, zoneAddress.a.B());
                        }
                        this.u = false;
                        return obj3;
                    }
                    if (zoneAddress != null && !z3) {
                        if (this.j.a()) {
                            sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.L$0 = mo21Var2;
                            sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.L$1 = zoneAddress;
                            sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.Z$0 = z3;
                            sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.label = 1;
                            Object b = ((com.yandex.go.clarify_address.a) this.m).b(sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12);
                            if (b != obj2) {
                                zoneAddress2 = zoneAddress;
                                obj = b;
                            }
                            return obj2;
                        }
                        a = zoneAddress.a.B();
                        String pickAction = zoneAddress.a.getPickAction();
                        str = pickAction != null ? pickAction : "auto";
                        positionInitAction = PositionInitAction.CACHE;
                        zoneAddress3 = zoneAddress;
                        mo21 mo21Var3 = mo21Var2;
                        z2 = z3;
                        String str3 = str;
                        zzsVar = a;
                        gh00 gh00Var = (gh00) this.b;
                        gh00Var.G(zzsVar);
                        if (!this.u || z2) {
                            gh00Var.J(mo21Var3.d);
                        }
                        if (zoneAddress3 != null) {
                            sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.L$0 = null;
                            sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.L$1 = null;
                            sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.L$2 = zzsVar;
                            sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.L$3 = str3;
                            sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.L$4 = positionInitAction;
                            sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.Z$0 = z2;
                            sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.label = 2;
                            obj = h(zoneAddress3, zzsVar, sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12);
                            if (obj != obj2) {
                                str2 = str3;
                                positionInitAction2 = positionInitAction;
                                boolean z4 = z2;
                                if (!((Boolean) obj).booleanValue()) {
                                }
                            }
                            return obj2;
                        }
                        this.u = false;
                        return obj3;
                    }
                    a = mo21Var2.a();
                    positionInitAction = PositionInitAction.AUTO_LOCATION;
                    zoneAddress3 = zoneAddress;
                    mo21 mo21Var32 = mo21Var2;
                    z2 = z3;
                    String str32 = str;
                    zzsVar = a;
                    gh00 gh00Var2 = (gh00) this.b;
                    gh00Var2.G(zzsVar);
                    if (!this.u) {
                    }
                    gh00Var2.J(mo21Var32.d);
                    if (zoneAddress3 != null) {
                    }
                    this.u = false;
                    return obj3;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        this.t = false;
                        this.n.a.set(false);
                        this.u = false;
                        return obj3;
                    }
                    z2 = sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.Z$0;
                    PositionInitAction positionInitAction3 = (PositionInitAction) sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.L$4;
                    String str4 = (String) sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.L$3;
                    zzsVar = (zzs) sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.L$2;
                    kotlin.b.b(obj);
                    positionInitAction2 = positionInitAction3;
                    str2 = str4;
                    boolean z42 = z2;
                    if (!((Boolean) obj).booleanValue()) {
                        o950 o950Var = this.o.a;
                        r8c0 r8c0Var = new r8c0(this, zzsVar, str2, positionInitAction2, 12);
                        sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.L$0 = null;
                        sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.L$1 = null;
                        sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.L$2 = null;
                        sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.L$3 = null;
                        sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.L$4 = null;
                        sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.Z$0 = z42;
                        sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.label = 3;
                        Object n = bvf0.n(new SourcePointLocationOnStartInteractor$withResumedInRouter$2(o950Var, this.a, r8c0Var, null), sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12);
                        if (n != obj2) {
                            n = obj3;
                        }
                    }
                    this.u = false;
                    return obj3;
                }
                boolean z5 = sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.Z$0;
                ZoneAddress zoneAddress4 = (ZoneAddress) sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.L$1;
                mo21 mo21Var4 = (mo21) sourcePointLocationOnStartInteractor$handleUserLocationOnStart$12.L$0;
                kotlin.b.b(obj);
                z3 = z5;
                mo21Var2 = mo21Var4;
                zoneAddress2 = zoneAddress4;
                if (((Boolean) obj).booleanValue()) {
                    zoneAddress = zoneAddress2;
                    a = mo21Var2.a();
                    positionInitAction = PositionInitAction.AUTO_LOCATION;
                    zoneAddress3 = zoneAddress;
                    mo21 mo21Var322 = mo21Var2;
                    z2 = z3;
                    String str322 = str;
                    zzsVar = a;
                    gh00 gh00Var22 = (gh00) this.b;
                    gh00Var22.G(zzsVar);
                    if (!this.u) {
                    }
                    gh00Var22.J(mo21Var322.d);
                    if (zoneAddress3 != null) {
                    }
                    this.u = false;
                    return obj3;
                }
                zoneAddress = zoneAddress2;
                a = zoneAddress.a.B();
                String pickAction2 = zoneAddress.a.getPickAction();
                if (pickAction2 != null) {
                }
                positionInitAction = PositionInitAction.CACHE;
                zoneAddress3 = zoneAddress;
                mo21 mo21Var3222 = mo21Var2;
                z2 = z3;
                String str3222 = str;
                zzsVar = a;
                gh00 gh00Var222 = (gh00) this.b;
                gh00Var222.G(zzsVar);
                if (!this.u) {
                }
                gh00Var222.J(mo21Var3222.d);
                if (zoneAddress3 != null) {
                }
                this.u = false;
                return obj3;
            }
        }
        sourcePointLocationOnStartInteractor$handleUserLocationOnStart$1 = new SourcePointLocationOnStartInteractor$handleUserLocationOnStart$1(this, continuationImpl);
        SourcePointLocationOnStartInteractor$handleUserLocationOnStart$1 sourcePointLocationOnStartInteractor$handleUserLocationOnStart$122 = sourcePointLocationOnStartInteractor$handleUserLocationOnStart$1;
        obj = sourcePointLocationOnStartInteractor$handleUserLocationOnStart$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourcePointLocationOnStartInteractor$handleUserLocationOnStart$122.label;
        str = "auto";
        Object obj32 = zy11.a;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0072, code lost:
    
        if (((java.lang.Boolean) r8).booleanValue() != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ZoneAddress zoneAddress, zzs zzsVar, ContinuationImpl continuationImpl) {
        SourcePointLocationOnStartInteractor$shouldNotUpdateSuggest$1 sourcePointLocationOnStartInteractor$shouldNotUpdateSuggest$1;
        int i;
        if (continuationImpl instanceof SourcePointLocationOnStartInteractor$shouldNotUpdateSuggest$1) {
            sourcePointLocationOnStartInteractor$shouldNotUpdateSuggest$1 = (SourcePointLocationOnStartInteractor$shouldNotUpdateSuggest$1) continuationImpl;
            int i2 = sourcePointLocationOnStartInteractor$shouldNotUpdateSuggest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sourcePointLocationOnStartInteractor$shouldNotUpdateSuggest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sourcePointLocationOnStartInteractor$shouldNotUpdateSuggest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourcePointLocationOnStartInteractor$shouldNotUpdateSuggest$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (this.t || !Objects.equals(zoneAddress.a.B(), zzsVar) || this.n.a.get()) {
                        if (this.j.a()) {
                            sourcePointLocationOnStartInteractor$shouldNotUpdateSuggest$1.L$0 = null;
                            sourcePointLocationOnStartInteractor$shouldNotUpdateSuggest$1.L$1 = null;
                            sourcePointLocationOnStartInteractor$shouldNotUpdateSuggest$1.label = 1;
                            obj = ((com.yandex.go.clarify_address.a) this.m).b(sourcePointLocationOnStartInteractor$shouldNotUpdateSuggest$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
        }
        sourcePointLocationOnStartInteractor$shouldNotUpdateSuggest$1 = new SourcePointLocationOnStartInteractor$shouldNotUpdateSuggest$1(this, continuationImpl);
        Object obj2 = sourcePointLocationOnStartInteractor$shouldNotUpdateSuggest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourcePointLocationOnStartInteractor$shouldNotUpdateSuggest$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
    }

    @Override // defpackage.pft0
    public final void onDestroyView() {
        this.d.c.remove(this.s);
    }
}
