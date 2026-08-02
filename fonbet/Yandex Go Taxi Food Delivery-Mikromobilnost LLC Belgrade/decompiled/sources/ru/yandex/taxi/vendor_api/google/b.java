package ru.yandex.taxi.vendor_api.google;

import android.content.Context;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import defpackage.bdz;
import defpackage.cug;
import defpackage.evu0;
import defpackage.gmt;
import defpackage.gtq0;
import defpackage.i3y;
import defpackage.ih91;
import defpackage.j7u;
import defpackage.k991;
import defpackage.ny61;
import defpackage.ppr;
import defpackage.tst;
import defpackage.wly0;
import defpackage.x4e;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class b implements tst {
    public final Context a;
    public final cug b;
    public final i3y c = kotlin.a.a(new ppr(7, this));
    public final i3y d = kotlin.a.a(new gmt(12));
    public final i3y e = kotlin.a.a(new gmt(13));
    public final AtomicInteger f = new AtomicInteger(-1);

    public b(Context context, cug cugVar) {
        this.a = context;
        this.b = cugVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        GoogleApiImpl$checkFusedLocationAvailability$1 googleApiImpl$checkFusedLocationAvailability$1;
        int i;
        if (continuationImpl instanceof GoogleApiImpl$checkFusedLocationAvailability$1) {
            googleApiImpl$checkFusedLocationAvailability$1 = (GoogleApiImpl$checkFusedLocationAvailability$1) continuationImpl;
            int i2 = googleApiImpl$checkFusedLocationAvailability$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                googleApiImpl$checkFusedLocationAvailability$1.label = i2 - Integer.MIN_VALUE;
                Object obj = googleApiImpl$checkFusedLocationAvailability$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googleApiImpl$checkFusedLocationAvailability$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!b()) {
                        throw new Exception() { // from class: ru.yandex.taxi.vendor_api.api.GoogleApi$UnavailableException
                        };
                    }
                    com.google.android.gms.common.a aVar = (com.google.android.gms.common.a) this.d.getValue();
                    k991 a = bdz.a(this.a);
                    aVar.getClass();
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(a);
                    arrayList.addAll(Arrays.asList(new j7u[0]));
                    Task p = GoogleApiManager.zaj().zam(arrayList).p(wly0.x);
                    googleApiImpl$checkFusedLocationAvailability$1.label = 1;
                    if (gtq0.c(p, googleApiImpl$checkFusedLocationAvailability$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        googleApiImpl$checkFusedLocationAvailability$1 = new GoogleApiImpl$checkFusedLocationAvailability$1(this, continuationImpl);
        Object obj2 = googleApiImpl$checkFusedLocationAvailability$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googleApiImpl$checkFusedLocationAvailability$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final boolean b() {
        int d = ((com.google.android.gms.common.a) this.d.getValue()).d(this.a, com.google.android.gms.common.b.a);
        if (this.f.getAndSet(d) != d) {
            cug cugVar = this.b;
            cugVar.getClass();
            HashMap hashMap = new HashMap();
            cugVar.a.a("GoogleApi.GmsAvailability", hashMap, 1, x4e.n(d, hashMap, "connection_result"));
        }
        return d == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        GoogleApiImpl$locationServiceEnablingRequest$1 googleApiImpl$locationServiceEnablingRequest$1;
        int i;
        try {
            if (continuationImpl instanceof GoogleApiImpl$locationServiceEnablingRequest$1) {
                googleApiImpl$locationServiceEnablingRequest$1 = (GoogleApiImpl$locationServiceEnablingRequest$1) continuationImpl;
                int i2 = googleApiImpl$locationServiceEnablingRequest$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    googleApiImpl$locationServiceEnablingRequest$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = googleApiImpl$locationServiceEnablingRequest$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = googleApiImpl$locationServiceEnablingRequest$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        zzw e = ((ih91) this.c.getValue()).e((LocationSettingsRequest) this.e.getValue());
                        googleApiImpl$locationServiceEnablingRequest$1.label = 1;
                        obj = gtq0.c(e, googleApiImpl$locationServiceEnablingRequest$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null || evu0.J(message)) {
                message = "Unknown error";
            }
            cug cugVar = this.b;
            cugVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put(Constants.KEY_MESSAGE, message);
            cugVar.a.a("GoogleApi.LocationSettingsError", hashMap, 1, new HashMap());
            throw th;
        }
        googleApiImpl$locationServiceEnablingRequest$1 = new GoogleApiImpl$locationServiceEnablingRequest$1(this, continuationImpl);
        Object obj2 = googleApiImpl$locationServiceEnablingRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googleApiImpl$locationServiceEnablingRequest$1.label;
    }
}
