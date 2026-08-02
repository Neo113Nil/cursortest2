package ru.yandex.taxi.locationsdk.locationprovider.android.gms;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.tasks.zzw;
import defpackage.bb2;
import defpackage.bdz;
import defpackage.eqs;
import defpackage.gtq0;
import defpackage.igz;
import defpackage.k991;
import defpackage.ny61;
import defpackage.rcz;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a implements bb2 {
    public final Context a;
    public final igz b;

    public a(Context context, igz igzVar) {
        this.a = context;
        this.b = igzVar;
    }

    public final eqs a() {
        Object failure;
        try {
            failure = bdz.a(this.a);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            ((rcz) this.b).b("GoogleMobileServicesClientAdapter", a, new Pair[0]);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (eqs) failure;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:22|23))(3:24|25|(5:32|12|(1:14)|15|(1:20)(2:17|18))(2:29|(1:31)))|11|12|(0)|15|(0)(0)))|37|6|7|(0)(0)|11|12|(0)|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0029, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        r7 = new kotlin.Result.Failure(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        GoogleMobileServicesClientAdapter$getLastKnownLocation$1 googleMobileServicesClientAdapter$getLastKnownLocation$1;
        int i;
        Object failure;
        Throwable a;
        zzw e;
        if (continuationImpl instanceof GoogleMobileServicesClientAdapter$getLastKnownLocation$1) {
            googleMobileServicesClientAdapter$getLastKnownLocation$1 = (GoogleMobileServicesClientAdapter$getLastKnownLocation$1) continuationImpl;
            int i2 = googleMobileServicesClientAdapter$getLastKnownLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                googleMobileServicesClientAdapter$getLastKnownLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = googleMobileServicesClientAdapter$getLastKnownLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googleMobileServicesClientAdapter$getLastKnownLocation$1.label;
                if (i != 0) {
                    b.b(obj);
                    eqs a2 = a();
                    if (a2 == null || (e = ((k991) a2).e()) == null) {
                        failure = null;
                        a = Result.a(failure);
                        if (a != null) {
                            ((rcz) this.b).b("GoogleMobileServicesClientAdapter", a, new Pair[0]);
                        }
                        if (failure instanceof Result.Failure) {
                            return null;
                        }
                        return failure;
                    }
                    googleMobileServicesClientAdapter$getLastKnownLocation$1.I$0 = 0;
                    googleMobileServicesClientAdapter$getLastKnownLocation$1.I$1 = 0;
                    googleMobileServicesClientAdapter$getLastKnownLocation$1.label = 1;
                    obj = gtq0.c(e, googleMobileServicesClientAdapter$getLastKnownLocation$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                failure = (Location) obj;
                a = Result.a(failure);
                if (a != null) {
                }
                if (failure instanceof Result.Failure) {
                }
            }
        }
        googleMobileServicesClientAdapter$getLastKnownLocation$1 = new GoogleMobileServicesClientAdapter$getLastKnownLocation$1(this, continuationImpl);
        Object obj2 = googleMobileServicesClientAdapter$getLastKnownLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googleMobileServicesClientAdapter$getLastKnownLocation$1.label;
        if (i != 0) {
        }
        failure = (Location) obj2;
        a = Result.a(failure);
        if (a != null) {
        }
        if (failure instanceof Result.Failure) {
        }
    }
}
