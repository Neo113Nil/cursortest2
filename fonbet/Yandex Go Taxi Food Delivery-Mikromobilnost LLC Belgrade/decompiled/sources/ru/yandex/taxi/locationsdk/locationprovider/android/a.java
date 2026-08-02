package ru.yandex.taxi.locationsdk.locationprovider.android;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import androidx.core.location.j;
import com.google.android.gms.common.b;
import defpackage.ab2;
import defpackage.bb2;
import defpackage.ca2;
import defpackage.d7z;
import defpackage.d9;
import defpackage.dnr;
import defpackage.e3n;
import defpackage.g92;
import defpackage.i3y;
import defpackage.igz;
import defpackage.jl40;
import defpackage.kp50;
import defpackage.la2;
import defpackage.ma2;
import defpackage.na2;
import defpackage.p92;
import defpackage.p9z;
import defpackage.ppr;
import defpackage.pvn;
import defpackage.q92;
import defpackage.qb2;
import defpackage.rb2;
import defpackage.rcz;
import defpackage.s9z;
import defpackage.sb2;
import defpackage.tpr;
import defpackage.vng;
import defpackage.w511;
import defpackage.y6i0;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.locationsdk.locationprovider.android.gms.GoogleMobileServicesClientAdapter$requestLocationUpdates$$inlined$flatMapLatest$1;
import ru.yandex.taxi.locationsdk.locationprovider.android.impl.LocationManagerAdapter$requestLocationUpdates$$inlined$flatMapLatest$1;

/* loaded from: classes9.dex */
public final class a {
    public final Context a;
    public final rcz b;
    public final LinkedHashMap c;
    public final i3y d = kotlin.a.a(new d9(12, this));

    public a(Context context, rcz rczVar, LinkedHashMap linkedHashMap) {
        this.a = context;
        this.b = rczVar;
        this.c = linkedHashMap;
    }

    public final Object a(ca2 ca2Var, Continuation continuation) {
        AndroidLocationProviderType androidLocationProviderType = ca2Var.a;
        AndroidPlatformLocationProvider$getLastKnownLocation$2 androidPlatformLocationProvider$getLastKnownLocation$2 = new AndroidPlatformLocationProvider$getLastKnownLocation$2(ca2Var, null);
        AndroidPlatformLocationProvider$getLastKnownLocation$3 androidPlatformLocationProvider$getLastKnownLocation$3 = new AndroidPlatformLocationProvider$getLastKnownLocation$3(2, null);
        int i = qb2.a[androidLocationProviderType.ordinal()];
        i3y i3yVar = this.d;
        if (i != 1) {
            return androidPlatformLocationProvider$getLastKnownLocation$2.invoke((s9z) i3yVar.getValue(), continuation);
        }
        q92 d = d(null);
        if (d instanceof AndroidFusedLocationProviderType$MobileServicesClient) {
            bb2 bb2Var = (bb2) this.c.get(d);
            if (bb2Var != null) {
                return androidPlatformLocationProvider$getLastKnownLocation$3.invoke(bb2Var, continuation);
            }
        } else {
            if (jl40.l(d, p92.a)) {
                return androidPlatformLocationProvider$getLastKnownLocation$2.invoke((s9z) i3yVar.getValue(), continuation);
            }
            if (d != null) {
                w511.b();
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tpr b(na2 na2Var, AndroidLocationProviderType androidLocationProviderType) {
        tpr c;
        ma2 ma2Var;
        e3n e3nVar;
        la2 la2Var = na2Var.g;
        boolean z = na2Var.h;
        if (z && androidLocationProviderType != AndroidLocationProviderType.PASSIVE && (e3nVar = na2Var.a) != null) {
            AndroidLocationUpdatesRequest$Quality androidLocationUpdatesRequest$Quality = na2Var.d;
            AndroidLocationUpdatesRequest$Quality androidLocationUpdatesRequest$Quality2 = AndroidLocationUpdatesRequest$Quality.PASSIVE;
            if (androidLocationUpdatesRequest$Quality != androidLocationUpdatesRequest$Quality2) {
                c = e.s(e.K(c(na2Var, androidLocationProviderType), c(new na2(e3nVar, na2Var.b, na2Var.c, androidLocationUpdatesRequest$Quality2, na2Var.e, na2Var.f, la2Var, z), androidLocationProviderType)), AndroidPlatformLocationProvider$requestLocationUpdatesWithPassiveIfNeeded$1.b);
                ma2Var = na2Var.f;
                if (ma2Var != null) {
                    c = ru.yandex.taxi.locationsdk.common_utils.a.d(c, ((e3n) y6i0.a(new e3n(ma2Var.a), new e3n(kp50.U(10, DurationUnit.SECONDS)))).a, ma2Var.b);
                }
                DecimalFormat decimalFormat = ru.yandex.taxi.locationsdk.locationprovider.android.impl.e.a;
                return e.f(ru.yandex.taxi.locationsdk.locationprovider.android.impl.e.a(c, androidLocationProviderType, la2Var, this.b, new AndroidPlatformLocationProvider$filterAndLogDiscarded$1(this, a.class, "nowElapsedRealtimeNs", "getNowElapsedRealtimeNs()J", 0)), Integer.MAX_VALUE, null, 2);
            }
        }
        c = c(na2Var, androidLocationProviderType);
        ma2Var = na2Var.f;
        if (ma2Var != null) {
        }
        DecimalFormat decimalFormat2 = ru.yandex.taxi.locationsdk.locationprovider.android.impl.e.a;
        return e.f(ru.yandex.taxi.locationsdk.locationprovider.android.impl.e.a(c, androidLocationProviderType, la2Var, this.b, new AndroidPlatformLocationProvider$filterAndLogDiscarded$1(this, a.class, "nowElapsedRealtimeNs", "getNowElapsedRealtimeNs()J", 0)), Integer.MAX_VALUE, null, 2);
    }

    public final tpr c(na2 na2Var, AndroidLocationProviderType androidLocationProviderType) {
        AndroidMobileServicesClientAdapter$Request$Priority androidMobileServicesClientAdapter$Request$Priority;
        int i = qb2.a[androidLocationProviderType.ordinal()];
        int i2 = 26;
        i3y i3yVar = this.d;
        int i3 = 1;
        if (i != 1) {
            s9z s9zVar = (s9z) i3yVar.getValue();
            p9z d = sb2.d(na2Var, androidLocationProviderType);
            s9zVar.getClass();
            return e.X(new g92(i3, new ppr(i2, s9zVar)), new LocationManagerAdapter$requestLocationUpdates$$inlined$flatMapLatest$1(null, d, s9zVar));
        }
        q92 d2 = d(na2Var.e);
        igz.a(new Pair("selected", String.valueOf(d2)), new Pair("request", na2Var.toString()));
        if (d2 instanceof AndroidFusedLocationProviderType$MobileServicesClient) {
            bb2 bb2Var = (bb2) this.c.get(d2);
            if (bb2Var != null) {
                e3n e3nVar = na2Var.a;
                long j = e3nVar != null ? e3nVar.a : na2.j;
                e3n e3nVar2 = na2Var.b;
                double d3 = na2Var.c;
                int i4 = rb2.a[na2Var.d.ordinal()];
                if (i4 == 1) {
                    androidMobileServicesClientAdapter$Request$Priority = AndroidMobileServicesClientAdapter$Request$Priority.HIGH_ACCURACY;
                } else if (i4 == 2) {
                    androidMobileServicesClientAdapter$Request$Priority = AndroidMobileServicesClientAdapter$Request$Priority.BALANCED_POWER_ACCURACY;
                } else if (i4 == 3) {
                    androidMobileServicesClientAdapter$Request$Priority = AndroidMobileServicesClientAdapter$Request$Priority.LOW_POWER;
                } else {
                    if (i4 != 4) {
                        w511.b();
                        return null;
                    }
                    androidMobileServicesClientAdapter$Request$Priority = AndroidMobileServicesClientAdapter$Request$Priority.PASSIVE;
                }
                ru.yandex.taxi.locationsdk.locationprovider.android.gms.a aVar = (ru.yandex.taxi.locationsdk.locationprovider.android.gms.a) bb2Var;
                return e.X(new g92(i3, new dnr(28, aVar)), new GoogleMobileServicesClientAdapter$requestLocationUpdates$$inlined$flatMapLatest$1(null, new ab2(j, e3nVar2, d3, androidMobileServicesClientAdapter$Request$Priority), aVar));
            }
        } else {
            if (jl40.l(d2, p92.a)) {
                s9z s9zVar2 = (s9z) i3yVar.getValue();
                p9z d4 = sb2.d(na2Var, androidLocationProviderType);
                s9zVar2.getClass();
                return e.X(new g92(i3, new ppr(i2, s9zVar2)), new LocationManagerAdapter$requestLocationUpdates$$inlined$flatMapLatest$1(null, d4, s9zVar2));
            }
            if (d2 != null) {
                w511.b();
                return null;
            }
        }
        return pvn.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        if (r1.getProvider(r2) != null) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[LOOP:0: B:4:0x000a->B:28:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q92 d(List list) {
        Object obj;
        Object failure;
        Throwable a;
        boolean z;
        Object failure2;
        if (list == null) {
            list = na2.i;
        }
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            q92 q92Var = (q92) next;
            try {
                z = true;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (jl40.l(q92Var, p92.a)) {
                s9z s9zVar = (s9z) this.d.getValue();
                AndroidLocationProviderType androidLocationProviderType = AndroidLocationProviderType.FUSED;
                LocationManager a2 = s9zVar.a();
                if (a2 != null) {
                    String c = vng.c(androidLocationProviderType);
                    WeakHashMap weakHashMap = j.a;
                    if (Build.VERSION.SDK_INT >= 31) {
                        z = d7z.a(a2, c);
                    } else if (!a2.getAllProviders().contains(c)) {
                    }
                }
                z = false;
            } else {
                if (!(q92Var instanceof AndroidFusedLocationProviderType$MobileServicesClient)) {
                    throw new NoWhenBranchMatchedException();
                }
                bb2 bb2Var = (bb2) this.c.get(q92Var);
                if (bb2Var != null) {
                    try {
                        if (b.b.d(((ru.yandex.taxi.locationsdk.locationprovider.android.gms.a) bb2Var).a, b.a) != 0) {
                            z = false;
                        }
                        failure2 = Boolean.valueOf(z);
                    } catch (Throwable th2) {
                        failure2 = new Result.Failure(th2);
                    }
                    if (!(failure2 instanceof Result.Failure)) {
                        obj = failure2;
                    }
                    Boolean bool = (Boolean) obj;
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                }
                z = false;
                failure = new Result.Failure(th);
                a = Result.a(failure);
                if (a != null) {
                    this.b.b("AndroidLocationProvider", a, new Pair[0]);
                }
                Boolean bool2 = Boolean.FALSE;
                if (failure instanceof Result.Failure) {
                    failure = bool2;
                }
                if (!((Boolean) failure).booleanValue()) {
                    obj = next;
                    break;
                }
            }
            failure = Boolean.valueOf(z);
            a = Result.a(failure);
            if (a != null) {
            }
            Boolean bool22 = Boolean.FALSE;
            if (failure instanceof Result.Failure) {
            }
            if (!((Boolean) failure).booleanValue()) {
            }
        }
        return (q92) obj;
    }
}
