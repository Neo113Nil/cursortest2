package ru.yandex.taxi.persuggest.fingerprint;

import android.content.Context;
import android.hardware.SensorManager;
import android.location.GnssClock;
import android.location.GnssMeasurement;
import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import android.os.BatteryManager;
import android.os.PowerManager;
import com.yandex.go.g;
import defpackage.adz;
import defpackage.blt;
import defpackage.f9r;
import defpackage.g8e;
import defpackage.hlt;
import defpackage.ifb1;
import defpackage.j8r;
import defpackage.jst;
import defpackage.k7z;
import defpackage.klt;
import defpackage.ky80;
import defpackage.m8r;
import defpackage.m9r;
import defpackage.nlt;
import defpackage.nm21;
import defpackage.ny61;
import defpackage.olt;
import defpackage.pzo;
import defpackage.q6z;
import defpackage.sm21;
import defpackage.tcc;
import defpackage.tm21;
import defpackage.ult;
import defpackage.vm21;
import defpackage.w691;
import defpackage.wm21;
import defpackage.xby;
import defpackage.xm21;
import defpackage.y6i0;
import defpackage.z8r;
import defpackage.zm21;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.experiments.u;

/* loaded from: classes9.dex */
public final class b {
    public final Context a;
    public final zm21 b;
    public final tm21 c;
    public final adz d;
    public final u e;
    public final olt f;

    public b(Context context, zm21 zm21Var, tm21 tm21Var, adz adzVar, u uVar, olt oltVar) {
        this.a = context;
        this.b = zm21Var;
        this.c = tm21Var;
        this.d = adzVar;
        this.e = uVar;
        this.f = oltVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a7, code lost:
    
        if (r1.isEmpty() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e7, code lost:
    
        if (r2.isEmpty() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r0.equals(new defpackage.blt(r2)) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static z8r a(sm21 sm21Var, nlt nltVar, Boolean bool) {
        blt bltVar;
        List A0;
        Set N0;
        ArrayList arrayList;
        Collection<GnssMeasurement> measurements;
        ArrayList arrayList2;
        GnssClock clock;
        GnssMeasurementsEvent gnssMeasurementsEvent = sm21Var.a;
        GnssStatus gnssStatus = sm21Var.b;
        int i = 0;
        if (gnssMeasurementsEvent != null && (clock = gnssMeasurementsEvent.getClock()) != null) {
            bltVar = w691.g(clock, nltVar.c);
        }
        bltVar = null;
        int i2 = nltVar.g;
        if (i2 > 0 && gnssStatus != null) {
            int satelliteCount = gnssStatus.getSatelliteCount();
            float[] fArr = new float[satelliteCount];
            for (int i3 = 0; i3 < satelliteCount; i3++) {
                fArr[i3] = gnssStatus.getCn0DbHz(i3);
            }
            A0 = kotlin.collections.a.A0(kotlin.collections.a.x0(y6i0.n(0, gnssStatus.getSatelliteCount()), new pzo(8, fArr)), i2);
        } else {
            A0 = null;
        }
        if (A0 == null || gnssStatus == null) {
            N0 = null;
        } else {
            List list = A0;
            ArrayList arrayList3 = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                arrayList3.add(Long.valueOf(w691.f(gnssStatus.getSvid(intValue), gnssStatus.getConstellationType(intValue))));
            }
            N0 = kotlin.collections.a.N0(arrayList3);
        }
        ult ultVar = nltVar.e;
        if (A0 != null) {
            arrayList = gnssStatus != null ? w691.i(gnssStatus, ultVar, A0) : null;
            if (arrayList != null) {
            }
        }
        arrayList = null;
        GnssMeasurementsEvent gnssMeasurementsEvent2 = sm21Var.a;
        int i4 = nltVar.h;
        klt kltVar = nltVar.d;
        if (N0 != null && i4 > 0 && gnssMeasurementsEvent2 != null && (measurements = gnssMeasurementsEvent2.getMeasurements()) != null) {
            ArrayList c = w691.c(measurements, N0, i4);
            arrayList2 = new ArrayList();
            Iterator it2 = c.iterator();
            while (it2.hasNext()) {
                hlt h = w691.h((GnssMeasurement) it2.next(), kltVar);
                if (h != null) {
                    arrayList2.add(h);
                }
            }
        }
        arrayList2 = null;
        if (arrayList2 == null && bltVar == null && arrayList == null && bool == null) {
            return null;
        }
        return new z8r(bltVar, arrayList2, arrayList, bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(ContinuationImpl continuationImpl) {
        UserFingerprintDeviceFingerprintRepository$collect$1 userFingerprintDeviceFingerprintRepository$collect$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        ArrayList arrayList;
        Object b;
        boolean z;
        ArrayList arrayList2;
        nlt nltVar;
        k7z k7zVar;
        m8r m8rVar;
        j8r j8rVar;
        Double d;
        double d2;
        if (continuationImpl instanceof UserFingerprintDeviceFingerprintRepository$collect$1) {
            userFingerprintDeviceFingerprintRepository$collect$1 = (UserFingerprintDeviceFingerprintRepository$collect$1) continuationImpl;
            int i2 = userFingerprintDeviceFingerprintRepository$collect$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userFingerprintDeviceFingerprintRepository$collect$1.label = i2 - Integer.MIN_VALUE;
                Object obj = userFingerprintDeviceFingerprintRepository$collect$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = userFingerprintDeviceFingerprintRepository$collect$1.label;
                Boolean bool = null;
                if (i != 0) {
                    ArrayList t = g8e.t(obj);
                    u uVar = this.e;
                    userFingerprintDeviceFingerprintRepository$collect$1.L$0 = t;
                    userFingerprintDeviceFingerprintRepository$collect$1.label = 1;
                    Object a = uVar.a(userFingerprintDeviceFingerprintRepository$collect$1);
                    if (a != coroutineSingletons) {
                        arrayList = t;
                        obj = a;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = userFingerprintDeviceFingerprintRepository$collect$1.Z$0;
                    arrayList2 = (ArrayList) userFingerprintDeviceFingerprintRepository$collect$1.L$0;
                    kotlin.b.b(obj);
                    nltVar = (nlt) obj;
                    if (z) {
                        try {
                            m8rVar = new m8r(y6i0.b(((BatteryManager) r0.getSystemService("batterymanager")).getIntProperty(4) / 100.0d, 0.0d, 1.0d), ((PowerManager) this.a.getSystemService("power")).isPowerSaveMode());
                        } catch (Exception e) {
                            xby.l(jst.e, "UserFingerprintDeviceFingerprint", null, e, "battery read failed", 2);
                            m8rVar = null;
                        }
                        xm21 xm21Var = (xm21) this.b.b.get();
                        wm21 wm21Var = xm21Var.a;
                        m9r m9rVar = wm21Var != null ? new m9r(wm21Var.a, wm21Var.b, wm21Var.c) : null;
                        vm21 vm21Var = xm21Var.b;
                        f9r f9rVar = vm21Var != null ? new f9r(vm21Var.a, vm21Var.b) : null;
                        Float f = xm21Var.c;
                        Integer num = xm21Var.d;
                        if (f9rVar != null) {
                            arrayList2.add(f9rVar);
                        }
                        if (m9rVar != null) {
                            arrayList2.add(m9rVar);
                        }
                        if (m8rVar != null) {
                            arrayList2.add(m8rVar);
                        }
                        if (f != null) {
                            float floatValue = f.floatValue();
                            double d3 = floatValue / 10.0d;
                            double altitude = SensorManager.getAltitude(1013.25f, floatValue);
                            if (num != null) {
                                int intValue = num.intValue();
                                if (intValue == 1) {
                                    d2 = 3.0d;
                                } else if (intValue == 2) {
                                    d2 = 1.5d;
                                } else if (intValue == 3) {
                                    d2 = 0.5d;
                                }
                                d = Double.valueOf(Math.abs(SensorManager.getAltitude(1013.25f, floatValue + 1.0f) - altitude) * d2);
                                j8rVar = new j8r(d3, Double.valueOf(altitude), d);
                            }
                            d = null;
                            j8rVar = new j8r(d3, Double.valueOf(altitude), d);
                        } else {
                            j8rVar = null;
                        }
                        if (j8rVar != null) {
                            arrayList2.add(j8rVar);
                        }
                    }
                    if (nltVar.b) {
                        if (nltVar.f) {
                            g gVar = (g) this.d;
                            k7z k7zVar2 = gVar.h().c.l;
                            boolean z2 = false;
                            if (k7zVar2 != null && (k7zVar = (k7z) gVar.h().a.c().get(new q6z(((ky80) k7zVar2.e).b))) != null) {
                                z2 = ifb1.c(k7zVar);
                            }
                            bool = Boolean.valueOf(z2);
                        }
                        try {
                            z8r a2 = a((sm21) this.c.d.get(), nltVar, bool);
                            if (a2 != null) {
                                arrayList2.add(a2);
                            }
                        } catch (CancellationException e2) {
                            throw e2;
                        } catch (Throwable th) {
                            xby.l(jst.e, "UserFingerprintGnss", null, th, "buildGnssItem failed", 2);
                        }
                    }
                    return arrayList2;
                }
                arrayList = (ArrayList) userFingerprintDeviceFingerprintRepository$collect$1.L$0;
                kotlin.b.b(obj);
                boolean z3 = ((nm21) obj).a;
                olt oltVar = this.f;
                userFingerprintDeviceFingerprintRepository$collect$1.L$0 = arrayList;
                userFingerprintDeviceFingerprintRepository$collect$1.Z$0 = z3;
                userFingerprintDeviceFingerprintRepository$collect$1.label = 2;
                b = oltVar.a.b(userFingerprintDeviceFingerprintRepository$collect$1);
                if (b != coroutineSingletons) {
                    z = z3;
                    obj = b;
                    arrayList2 = arrayList;
                    nltVar = (nlt) obj;
                    if (z) {
                    }
                    if (nltVar.b) {
                    }
                    return arrayList2;
                }
                return coroutineSingletons;
            }
        }
        userFingerprintDeviceFingerprintRepository$collect$1 = new UserFingerprintDeviceFingerprintRepository$collect$1(this, continuationImpl);
        Object obj2 = userFingerprintDeviceFingerprintRepository$collect$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = userFingerprintDeviceFingerprintRepository$collect$1.label;
        Boolean bool2 = null;
        if (i != 0) {
        }
        boolean z32 = ((nm21) obj2).a;
        olt oltVar2 = this.f;
        userFingerprintDeviceFingerprintRepository$collect$1.L$0 = arrayList;
        userFingerprintDeviceFingerprintRepository$collect$1.Z$0 = z32;
        userFingerprintDeviceFingerprintRepository$collect$1.label = 2;
        b = oltVar2.a.b(userFingerprintDeviceFingerprintRepository$collect$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
