package ru.yandex.taxi.systemrequeirements.location;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import defpackage.avj0;
import defpackage.ej1;
import defpackage.ffx;
import defpackage.h3y;
import defpackage.ha2;
import defpackage.hxx;
import defpackage.ic60;
import defpackage.k0b0;
import defpackage.kyh0;
import defpackage.nc60;
import defpackage.ncz;
import defpackage.ny61;
import defpackage.oc60;
import defpackage.oep0;
import defpackage.p0u;
import defpackage.pc60;
import defpackage.pep0;
import defpackage.ptw;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.w7j0;
import defpackage.x4e;
import defpackage.x8z;
import defpackage.zuj0;
import defpackage.zy11;
import defpackage.zz2;
import java.util.EnumSet;
import java.util.HashMap;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.statebar.data.LocationErrorReason;
import ru.yandex.taxi.ui.MainUiAvailabilityMonitor;

/* loaded from: classes10.dex */
public final class l {
    public final Activity a;
    public final tse b;
    public final Lifecycle c;
    public final zuj0 d;
    public final ncz e;
    public final h3y f;
    public final MainUiAvailabilityMonitor g;
    public final n h;
    public final c i;
    public final x8z j;
    public final oc60 k;
    public final w7j0 l;
    public final com.yandex.go.permission.location_with_agreement.interactor.e m;
    public final ic60 n;
    public final k0b0 o;
    public final ru.yandex.taxi.main.map.f p;
    public final oep0 q;
    public final n0 r = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    public pzt0 s;

    public l(Activity activity, tse tseVar, Lifecycle lifecycle, zuj0 zuj0Var, ncz nczVar, h3y h3yVar, MainUiAvailabilityMonitor mainUiAvailabilityMonitor, n nVar, c cVar, x8z x8zVar, oc60 oc60Var, w7j0 w7j0Var, com.yandex.go.permission.location_with_agreement.interactor.e eVar, ic60 ic60Var, k0b0 k0b0Var, ru.yandex.taxi.main.map.f fVar, oep0 oep0Var) {
        this.a = activity;
        this.b = tseVar;
        this.c = lifecycle;
        this.d = zuj0Var;
        this.e = nczVar;
        this.f = h3yVar;
        this.g = mainUiAvailabilityMonitor;
        this.h = nVar;
        this.i = cVar;
        this.j = x8zVar;
        this.k = oc60Var;
        this.l = w7j0Var;
        this.m = eVar;
        this.n = ic60Var;
        this.o = k0b0Var;
        this.p = fVar;
        this.q = oep0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r6.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(l lVar, Continuation continuation) {
        LocationRequirementsResolveStrategyImpl$checkRequirements$1 locationRequirementsResolveStrategyImpl$checkRequirements$1;
        int i;
        lVar.getClass();
        if (continuation instanceof LocationRequirementsResolveStrategyImpl$checkRequirements$1) {
            locationRequirementsResolveStrategyImpl$checkRequirements$1 = (LocationRequirementsResolveStrategyImpl$checkRequirements$1) continuation;
            int i2 = locationRequirementsResolveStrategyImpl$checkRequirements$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationRequirementsResolveStrategyImpl$checkRequirements$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationRequirementsResolveStrategyImpl$checkRequirements$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationRequirementsResolveStrategyImpl$checkRequirements$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = lVar.i;
                    locationRequirementsResolveStrategyImpl$checkRequirements$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                locationRequirementsResolveStrategyImpl$checkRequirements$1.label = 2;
                n nVar = lVar.h;
                Object d = !nVar.c() ? nVar.d(locationRequirementsResolveStrategyImpl$checkRequirements$1) : zy11.a;
                return d != coroutineSingletons ? coroutineSingletons : d;
            }
        }
        locationRequirementsResolveStrategyImpl$checkRequirements$1 = new LocationRequirementsResolveStrategyImpl$checkRequirements$1(lVar, continuation);
        Object obj2 = locationRequirementsResolveStrategyImpl$checkRequirements$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationRequirementsResolveStrategyImpl$checkRequirements$1.label;
        if (i != 0) {
        }
        locationRequirementsResolveStrategyImpl$checkRequirements$1.label = 2;
        n nVar2 = lVar.h;
        if (!nVar2.c()) {
        }
        if (d != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (r10 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(l lVar, tls tlsVar, ContinuationImpl continuationImpl) {
        LocationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1 locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1;
        int i;
        boolean booleanValue;
        boolean z;
        lVar.getClass();
        if (continuationImpl instanceof LocationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1) {
            locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1 = (LocationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1) continuationImpl;
            int i2 = locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ha2 b = lVar.m.b();
                    locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1.L$0 = tlsVar;
                    locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(b, locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        z = locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1.Z$0;
                        tlsVar = (tls) locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1.L$0;
                        kotlin.b.b(obj);
                        locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1.L$0 = null;
                        locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1.Z$0 = z;
                        locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1.label = 3;
                        return tlsVar.invoke(locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1) != coroutineSingletons ? coroutineSingletons : zy11Var;
                    }
                    tlsVar = (tls) locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1.L$0;
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (!booleanValue) {
                    k kVar = new k(lVar.g.e);
                    locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1.L$0 = tlsVar;
                    locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1.Z$0 = booleanValue;
                    locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1.label = 2;
                    if (kotlinx.coroutines.flow.e.y(kVar, locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1) != coroutineSingletons) {
                        z = booleanValue;
                        locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1.L$0 = null;
                        locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1.Z$0 = z;
                        locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1.label = 3;
                        if (tlsVar.invoke(locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1) != coroutineSingletons) {
                        }
                    }
                }
            }
        }
        locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1 = new LocationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1(lVar, continuationImpl);
        Object obj2 = locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationRequirementsResolveStrategyImpl$onlyOnceOnLaunch$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (!booleanValue) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Throwable th, ContinuationImpl continuationImpl) {
        LocationRequirementsResolveStrategyImpl$awaitLocationRequirements$1 locationRequirementsResolveStrategyImpl$awaitLocationRequirements$1;
        int i;
        Object obj;
        if (continuationImpl instanceof LocationRequirementsResolveStrategyImpl$awaitLocationRequirements$1) {
            locationRequirementsResolveStrategyImpl$awaitLocationRequirements$1 = (LocationRequirementsResolveStrategyImpl$awaitLocationRequirements$1) continuationImpl;
            int i2 = locationRequirementsResolveStrategyImpl$awaitLocationRequirements$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationRequirementsResolveStrategyImpl$awaitLocationRequirements$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = locationRequirementsResolveStrategyImpl$awaitLocationRequirements$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationRequirementsResolveStrategyImpl$awaitLocationRequirements$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1 && i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11Var;
                }
                kotlin.b.b(obj2);
                LocationRequirementsException.Companion.getClass();
                boolean b = e.b(th);
                n nVar = this.h;
                if (b) {
                    locationRequirementsResolveStrategyImpl$awaitLocationRequirements$1.L$0 = null;
                    locationRequirementsResolveStrategyImpl$awaitLocationRequirements$1.label = 1;
                    if (nVar.c.g() || (obj = kotlinx.coroutines.flow.e.y(nVar.e, locationRequirementsResolveStrategyImpl$awaitLocationRequirements$1)) != coroutineSingletons) {
                        obj = zy11Var;
                    }
                    return obj == coroutineSingletons ? coroutineSingletons : zy11Var;
                }
                if (!e.a(th)) {
                    return new Result.Failure(th);
                }
                locationRequirementsResolveStrategyImpl$awaitLocationRequirements$1.L$0 = null;
                locationRequirementsResolveStrategyImpl$awaitLocationRequirements$1.label = 2;
                if (nVar.a(locationRequirementsResolveStrategyImpl$awaitLocationRequirements$1) == coroutineSingletons) {
                }
            }
        }
        locationRequirementsResolveStrategyImpl$awaitLocationRequirements$1 = new LocationRequirementsResolveStrategyImpl$awaitLocationRequirements$1(this, continuationImpl);
        Object obj22 = locationRequirementsResolveStrategyImpl$awaitLocationRequirements$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationRequirementsResolveStrategyImpl$awaitLocationRequirements$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }

    public final void d(Throwable th) {
        LocationRequirementsException.Companion.getClass();
        boolean a = e.a(th);
        x8z x8zVar = this.j;
        zuj0 zuj0Var = this.d;
        if (a) {
            avj0 avj0Var = (avj0) zuj0Var;
            final int i = 0;
            x8zVar.c(avj0Var.h(kyh0.state_bar_precise_location_permission_on_title), avj0Var.h(kyh0.state_bar_location_permission_on_subtitle), LocationErrorReason.LOCATION_SERVICE_ERROR_REASON, new Runnable(this) { // from class: ru.yandex.taxi.systemrequeirements.location.g
                public final /* synthetic */ l b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = 21;
                    switch (i) {
                        case 0:
                            l lVar = this.b;
                            ncz nczVar = lVar.e;
                            nczVar.getClass();
                            nczVar.a.a("EnableLocationSettingsClicked", new HashMap(), 1, new HashMap());
                            lVar.e(new LocationRequirementsResolveStrategyImpl$handleErrors$1$1(1, lVar, l.class, "checkRequirements", "checkRequirements(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), new p0u(i2));
                            break;
                        default:
                            l lVar2 = this.b;
                            c cVar = lVar2.i;
                            Activity activity = lVar2.a;
                            if (!((com.yandex.go.permission.b) cVar.a).f(1)) {
                                Intent intent = new Intent();
                                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                                intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
                                activity.startActivity(intent);
                                lVar2.e(new LocationRequirementsResolveStrategyImpl$runResolving$1(lVar2, null), new p0u(i2));
                                break;
                            } else {
                                lVar2.e(new LocationRequirementsResolveStrategyImpl$handleErrors$2$1(1, lVar2, l.class, "checkRequirements", "checkRequirements(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), new p0u(i2));
                                break;
                            }
                    }
                }
            });
        } else if (e.b(th)) {
            avj0 avj0Var2 = (avj0) zuj0Var;
            final int i2 = 1;
            x8zVar.c(avj0Var2.h(kyh0.state_bar_precise_location_permission_on_title), avj0Var2.h(kyh0.state_bar_location_permission_on_subtitle), LocationErrorReason.LOCATION_PERMISSION_ERROR_REASON, new Runnable(this) { // from class: ru.yandex.taxi.systemrequeirements.location.g
                public final /* synthetic */ l b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = 21;
                    switch (i2) {
                        case 0:
                            l lVar = this.b;
                            ncz nczVar = lVar.e;
                            nczVar.getClass();
                            nczVar.a.a("EnableLocationSettingsClicked", new HashMap(), 1, new HashMap());
                            lVar.e(new LocationRequirementsResolveStrategyImpl$handleErrors$1$1(1, lVar, l.class, "checkRequirements", "checkRequirements(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), new p0u(i22));
                            break;
                        default:
                            l lVar2 = this.b;
                            c cVar = lVar2.i;
                            Activity activity = lVar2.a;
                            if (!((com.yandex.go.permission.b) cVar.a).f(1)) {
                                Intent intent = new Intent();
                                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                                intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
                                activity.startActivity(intent);
                                lVar2.e(new LocationRequirementsResolveStrategyImpl$runResolving$1(lVar2, null), new p0u(i22));
                                break;
                            } else {
                                lVar2.e(new LocationRequirementsResolveStrategyImpl$handleErrors$2$1(1, lVar2, l.class, "checkRequirements", "checkRequirements(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), new p0u(i22));
                                break;
                            }
                    }
                }
            });
        }
    }

    public final void e(tls tlsVar, tls tlsVar2) {
        pzt0 pzt0Var = this.s;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.s = tje.N(this.b, null, null, new LocationRequirementsResolveStrategyImpl$handleResultsOf$2(tlsVar, this, EnumSet.of(LocationErrorReason.LOCATION_SERVICE_ERROR_REASON, LocationErrorReason.LOCATION_PERMISSION_ERROR_REASON), tlsVar2, null), 3);
    }

    public final void f(boolean z) {
        if (z || !this.h.b()) {
            e(new LocationRequirementsResolveStrategyImpl$onGeoButtonClick$1(this), new ptw(23, this));
        } else {
            g();
        }
    }

    public final void g() {
        ej1 b;
        ic60 ic60Var = this.n;
        zz2 zz2Var = ic60Var.c;
        k0b0 k0b0Var = ic60Var.a;
        int i = 0;
        boolean z = k0b0Var.g() || k0b0Var.a();
        boolean z2 = !ic60Var.b.c();
        boolean g = k0b0Var.g();
        Boolean valueOf = Boolean.valueOf(z2);
        zz2Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("app_geo_permission", Boolean.valueOf(z));
        hashMap.put("system_geo_permission", valueOf);
        zz2Var.a.a("Application.AllowGeoPermissionModalCard.Shown", hashMap, 1, x4e.r(g, hashMap, "precise_location"));
        b = ((pc60) this.k).b(false);
        ((pep0) this.q).f(b, new nc60(i), hxx.a);
    }
}
