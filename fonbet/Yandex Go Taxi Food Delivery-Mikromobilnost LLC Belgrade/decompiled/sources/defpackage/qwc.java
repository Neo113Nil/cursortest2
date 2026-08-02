package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.os.Handler;
import com.yandex.go.location.provider.CompassProviderImpl$adaptiveSmooth$$inlined$transform$1;
import com.yandex.go.location.provider.g;
import com.yandex.go.location.provider.i;
import defpackage.g92;
import defpackage.i6u;
import defpackage.iwc;
import defpackage.kwc;
import defpackage.lwc;
import defpackage.mwc;
import defpackage.nwc;
import defpackage.owc;
import defpackage.pwc;
import defpackage.qwc;
import defpackage.tpr;
import defpackage.w511;
import defpackage.wsr0;
import defpackage.xsr0;
import kotlin.a;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes.dex */
public final class qwc {
    public final SensorManager a;
    public final tse b;
    public final LocationManager c;
    public final k0b0 d;
    public final float[] e = new float[9];
    public final float[] f = new float[3];
    public final i3y g = a.a(new bgc(9));
    public final i3y h;
    public final i3y i;
    public final i3y j;
    public final i3y k;
    public final i3y l;

    public qwc(SensorManager sensorManager, tse tseVar, LocationManager locationManager, k0b0 k0b0Var) {
        this.a = sensorManager;
        this.b = tseVar;
        this.c = locationManager;
        this.d = k0b0Var;
        final int i = 0;
        this.h = a.a(new sls(this) { // from class: jwc
            public final /* synthetic */ qwc b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                qwc qwcVar = this.b;
                switch (i2) {
                    case 0:
                        SensorManager sensorManager2 = qwcVar.a;
                        Sensor defaultSensor = sensorManager2.getDefaultSensor(2);
                        Object obj = owc.a;
                        if (defaultSensor != null) {
                            Sensor defaultSensor2 = sensorManager2.getDefaultSensor(11);
                            if (defaultSensor2 != null) {
                                obj = nwc.a(defaultSensor2);
                            } else {
                                Sensor defaultSensor3 = sensorManager2.getDefaultSensor(20);
                                if (defaultSensor3 != null) {
                                    obj = lwc.a(defaultSensor3);
                                } else {
                                    Sensor defaultSensor4 = sensorManager2.getDefaultSensor(9);
                                    if (defaultSensor4 != null) {
                                        obj = new mwc(defaultSensor4, defaultSensor);
                                    } else {
                                        Sensor defaultSensor5 = sensorManager2.getDefaultSensor(1);
                                        if (defaultSensor5 != null) {
                                            obj = new kwc(defaultSensor5, defaultSensor);
                                        }
                                    }
                                }
                            }
                        }
                        if (obj instanceof owc) {
                            g8e.A(jst.e, "No suitable sensor strategy found. Compass is disabled.");
                        }
                        return obj;
                    default:
                        tpr tprVar = (tpr) qwcVar.j.getValue();
                        Ref$LongRef ref$LongRef = new Ref$LongRef();
                        ref$LongRef.element = 0L;
                        return e.O(e.F(new rol0(new CompassProviderImpl$adaptiveSmooth$$inlined$transform$1(tprVar, null, ref$LongRef, new Ref$LongRef())), i6u.d((Handler) qwcVar.g.getValue(), null)), qwcVar.b, wsr0.a(xsr0.a, 3), 1);
                }
            }
        });
        this.i = a.a(new sls(this) { // from class: com.yandex.go.location.provider.a
            public final /* synthetic */ qwc b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tpr tprVar;
                tpr m0Var;
                int i2 = i;
                int i3 = 2;
                qwc qwcVar = this.b;
                switch (i2) {
                    case 0:
                        return kotlinx.coroutines.flow.e.R(kotlinx.coroutines.flow.e.g(new CompassProviderImpl$declinationFlow$2$1(qwcVar, null)), qwcVar.b, wsr0.a(xsr0.a, 3), Float.valueOf(Float.NaN));
                    case 1:
                        pwc pwcVar = (pwc) qwcVar.h.getValue();
                        if (pwcVar instanceof nwc) {
                            tprVar = new d(kotlinx.coroutines.flow.e.N(kotlinx.coroutines.flow.e.g(new CompassProviderImpl$sensorValuesFlow$1(qwcVar, ((nwc) pwcVar).b(), null)), 66L), qwcVar);
                        } else if (pwcVar instanceof lwc) {
                            tprVar = new d(kotlinx.coroutines.flow.e.N(kotlinx.coroutines.flow.e.g(new CompassProviderImpl$sensorValuesFlow$1(qwcVar, ((lwc) pwcVar).b(), null)), 66L), qwcVar);
                        } else {
                            if (pwcVar instanceof mwc) {
                                mwc mwcVar = (mwc) pwcVar;
                                m0Var = new m0(kotlinx.coroutines.flow.e.N(kotlinx.coroutines.flow.e.g(new CompassProviderImpl$sensorValuesFlow$1(qwcVar, mwcVar.a(), null)), 66L), kotlinx.coroutines.flow.e.N(kotlinx.coroutines.flow.e.g(new CompassProviderImpl$sensorValuesFlow$1(qwcVar, mwcVar.b(), null)), 66L), new CompassProviderImpl$createOrientationAndMagneticFlow$1(qwcVar));
                            } else if (pwcVar instanceof kwc) {
                                kwc kwcVar = (kwc) pwcVar;
                                m0Var = new m0(kotlinx.coroutines.flow.e.N(kotlinx.coroutines.flow.e.g(new CompassProviderImpl$sensorValuesFlow$1(qwcVar, kwcVar.a(), null)), 66L), kotlinx.coroutines.flow.e.N(kotlinx.coroutines.flow.e.g(new CompassProviderImpl$sensorValuesFlow$1(qwcVar, kwcVar.b(), null)), 66L), new CompassProviderImpl$createOrientationAndMagneticFlow$1(qwcVar));
                            } else {
                                if (!(pwcVar instanceof owc)) {
                                    w511.b();
                                    return null;
                                }
                                tprVar = null;
                            }
                            tprVar = m0Var;
                        }
                        return tprVar != null ? kotlinx.coroutines.flow.e.O(kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.s(new m0(tprVar, (tpr) qwcVar.i.getValue(), new CompassProviderImpl$azimuthFlow$2$1$1()), new CompassProviderImpl$azimuthFlow$2$1$2(qwcVar)), i6u.d((Handler) qwcVar.g.getValue(), null)), qwcVar.b, wsr0.a(xsr0.a, 3), 1) : new g92(i3, iwc.a());
                    default:
                        return kotlinx.coroutines.flow.e.O(kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.f(kotlinx.coroutines.flow.e.i(new CompassProviderImpl$interpolateForUi$1((tpr) qwcVar.k.getValue(), null)), -1, null, 2), i6u.d((Handler) qwcVar.g.getValue(), null)), qwcVar.b, wsr0.a(xsr0.a, 3), 1);
                }
            }
        });
        final int i2 = 1;
        this.j = a.a(new sls(this) { // from class: com.yandex.go.location.provider.a
            public final /* synthetic */ qwc b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tpr tprVar;
                tpr m0Var;
                int i22 = i2;
                int i3 = 2;
                qwc qwcVar = this.b;
                switch (i22) {
                    case 0:
                        return kotlinx.coroutines.flow.e.R(kotlinx.coroutines.flow.e.g(new CompassProviderImpl$declinationFlow$2$1(qwcVar, null)), qwcVar.b, wsr0.a(xsr0.a, 3), Float.valueOf(Float.NaN));
                    case 1:
                        pwc pwcVar = (pwc) qwcVar.h.getValue();
                        if (pwcVar instanceof nwc) {
                            tprVar = new d(kotlinx.coroutines.flow.e.N(kotlinx.coroutines.flow.e.g(new CompassProviderImpl$sensorValuesFlow$1(qwcVar, ((nwc) pwcVar).b(), null)), 66L), qwcVar);
                        } else if (pwcVar instanceof lwc) {
                            tprVar = new d(kotlinx.coroutines.flow.e.N(kotlinx.coroutines.flow.e.g(new CompassProviderImpl$sensorValuesFlow$1(qwcVar, ((lwc) pwcVar).b(), null)), 66L), qwcVar);
                        } else {
                            if (pwcVar instanceof mwc) {
                                mwc mwcVar = (mwc) pwcVar;
                                m0Var = new m0(kotlinx.coroutines.flow.e.N(kotlinx.coroutines.flow.e.g(new CompassProviderImpl$sensorValuesFlow$1(qwcVar, mwcVar.a(), null)), 66L), kotlinx.coroutines.flow.e.N(kotlinx.coroutines.flow.e.g(new CompassProviderImpl$sensorValuesFlow$1(qwcVar, mwcVar.b(), null)), 66L), new CompassProviderImpl$createOrientationAndMagneticFlow$1(qwcVar));
                            } else if (pwcVar instanceof kwc) {
                                kwc kwcVar = (kwc) pwcVar;
                                m0Var = new m0(kotlinx.coroutines.flow.e.N(kotlinx.coroutines.flow.e.g(new CompassProviderImpl$sensorValuesFlow$1(qwcVar, kwcVar.a(), null)), 66L), kotlinx.coroutines.flow.e.N(kotlinx.coroutines.flow.e.g(new CompassProviderImpl$sensorValuesFlow$1(qwcVar, kwcVar.b(), null)), 66L), new CompassProviderImpl$createOrientationAndMagneticFlow$1(qwcVar));
                            } else {
                                if (!(pwcVar instanceof owc)) {
                                    w511.b();
                                    return null;
                                }
                                tprVar = null;
                            }
                            tprVar = m0Var;
                        }
                        return tprVar != null ? kotlinx.coroutines.flow.e.O(kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.s(new m0(tprVar, (tpr) qwcVar.i.getValue(), new CompassProviderImpl$azimuthFlow$2$1$1()), new CompassProviderImpl$azimuthFlow$2$1$2(qwcVar)), i6u.d((Handler) qwcVar.g.getValue(), null)), qwcVar.b, wsr0.a(xsr0.a, 3), 1) : new g92(i3, iwc.a());
                    default:
                        return kotlinx.coroutines.flow.e.O(kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.f(kotlinx.coroutines.flow.e.i(new CompassProviderImpl$interpolateForUi$1((tpr) qwcVar.k.getValue(), null)), -1, null, 2), i6u.d((Handler) qwcVar.g.getValue(), null)), qwcVar.b, wsr0.a(xsr0.a, 3), 1);
                }
            }
        });
        this.k = a.a(new sls(this) { // from class: jwc
            public final /* synthetic */ qwc b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                qwc qwcVar = this.b;
                switch (i22) {
                    case 0:
                        SensorManager sensorManager2 = qwcVar.a;
                        Sensor defaultSensor = sensorManager2.getDefaultSensor(2);
                        Object obj = owc.a;
                        if (defaultSensor != null) {
                            Sensor defaultSensor2 = sensorManager2.getDefaultSensor(11);
                            if (defaultSensor2 != null) {
                                obj = nwc.a(defaultSensor2);
                            } else {
                                Sensor defaultSensor3 = sensorManager2.getDefaultSensor(20);
                                if (defaultSensor3 != null) {
                                    obj = lwc.a(defaultSensor3);
                                } else {
                                    Sensor defaultSensor4 = sensorManager2.getDefaultSensor(9);
                                    if (defaultSensor4 != null) {
                                        obj = new mwc(defaultSensor4, defaultSensor);
                                    } else {
                                        Sensor defaultSensor5 = sensorManager2.getDefaultSensor(1);
                                        if (defaultSensor5 != null) {
                                            obj = new kwc(defaultSensor5, defaultSensor);
                                        }
                                    }
                                }
                            }
                        }
                        if (obj instanceof owc) {
                            g8e.A(jst.e, "No suitable sensor strategy found. Compass is disabled.");
                        }
                        return obj;
                    default:
                        tpr tprVar = (tpr) qwcVar.j.getValue();
                        Ref$LongRef ref$LongRef = new Ref$LongRef();
                        ref$LongRef.element = 0L;
                        return e.O(e.F(new rol0(new CompassProviderImpl$adaptiveSmooth$$inlined$transform$1(tprVar, null, ref$LongRef, new Ref$LongRef())), i6u.d((Handler) qwcVar.g.getValue(), null)), qwcVar.b, wsr0.a(xsr0.a, 3), 1);
                }
            }
        });
        final int i3 = 2;
        this.l = a.a(new sls(this) { // from class: com.yandex.go.location.provider.a
            public final /* synthetic */ qwc b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tpr tprVar;
                tpr m0Var;
                int i22 = i3;
                int i32 = 2;
                qwc qwcVar = this.b;
                switch (i22) {
                    case 0:
                        return kotlinx.coroutines.flow.e.R(kotlinx.coroutines.flow.e.g(new CompassProviderImpl$declinationFlow$2$1(qwcVar, null)), qwcVar.b, wsr0.a(xsr0.a, 3), Float.valueOf(Float.NaN));
                    case 1:
                        pwc pwcVar = (pwc) qwcVar.h.getValue();
                        if (pwcVar instanceof nwc) {
                            tprVar = new d(kotlinx.coroutines.flow.e.N(kotlinx.coroutines.flow.e.g(new CompassProviderImpl$sensorValuesFlow$1(qwcVar, ((nwc) pwcVar).b(), null)), 66L), qwcVar);
                        } else if (pwcVar instanceof lwc) {
                            tprVar = new d(kotlinx.coroutines.flow.e.N(kotlinx.coroutines.flow.e.g(new CompassProviderImpl$sensorValuesFlow$1(qwcVar, ((lwc) pwcVar).b(), null)), 66L), qwcVar);
                        } else {
                            if (pwcVar instanceof mwc) {
                                mwc mwcVar = (mwc) pwcVar;
                                m0Var = new m0(kotlinx.coroutines.flow.e.N(kotlinx.coroutines.flow.e.g(new CompassProviderImpl$sensorValuesFlow$1(qwcVar, mwcVar.a(), null)), 66L), kotlinx.coroutines.flow.e.N(kotlinx.coroutines.flow.e.g(new CompassProviderImpl$sensorValuesFlow$1(qwcVar, mwcVar.b(), null)), 66L), new CompassProviderImpl$createOrientationAndMagneticFlow$1(qwcVar));
                            } else if (pwcVar instanceof kwc) {
                                kwc kwcVar = (kwc) pwcVar;
                                m0Var = new m0(kotlinx.coroutines.flow.e.N(kotlinx.coroutines.flow.e.g(new CompassProviderImpl$sensorValuesFlow$1(qwcVar, kwcVar.a(), null)), 66L), kotlinx.coroutines.flow.e.N(kotlinx.coroutines.flow.e.g(new CompassProviderImpl$sensorValuesFlow$1(qwcVar, kwcVar.b(), null)), 66L), new CompassProviderImpl$createOrientationAndMagneticFlow$1(qwcVar));
                            } else {
                                if (!(pwcVar instanceof owc)) {
                                    w511.b();
                                    return null;
                                }
                                tprVar = null;
                            }
                            tprVar = m0Var;
                        }
                        return tprVar != null ? kotlinx.coroutines.flow.e.O(kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.s(new m0(tprVar, (tpr) qwcVar.i.getValue(), new CompassProviderImpl$azimuthFlow$2$1$1()), new CompassProviderImpl$azimuthFlow$2$1$2(qwcVar)), i6u.d((Handler) qwcVar.g.getValue(), null)), qwcVar.b, wsr0.a(xsr0.a, 3), 1) : new g92(i32, iwc.a());
                    default:
                        return kotlinx.coroutines.flow.e.O(kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.f(kotlinx.coroutines.flow.e.i(new CompassProviderImpl$interpolateForUi$1((tpr) qwcVar.k.getValue(), null)), -1, null, 2), i6u.d((Handler) qwcVar.g.getValue(), null)), qwcVar.b, wsr0.a(xsr0.a, 3), 1);
                }
            }
        });
    }

    public final i a() {
        return new i(new g((tpr) this.j.getValue()));
    }
}
