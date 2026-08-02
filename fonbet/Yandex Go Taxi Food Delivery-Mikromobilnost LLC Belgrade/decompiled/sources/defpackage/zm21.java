package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import defpackage.f9r;
import defpackage.scc;
import defpackage.um21;
import defpackage.vm21;
import defpackage.wm21;
import defpackage.xm21;
import defpackage.y6i0;
import defpackage.ym21;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import ru.yandex.taxi.persuggest.fingerprint.UserFingerprintSensorSession$createMotionSensorListener$1;

/* loaded from: classes9.dex */
public final class zm21 {
    public final SensorManager a;
    public final AtomicReference b = new AtomicReference(xm21.f);
    public volatile boolean c;
    public UserFingerprintSensorSession$createMotionSensorListener$1 d;

    public zm21(Context context) {
        this.a = (SensorManager) context.getSystemService("sensor");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.hardware.SensorEventListener, ru.yandex.taxi.persuggest.fingerprint.UserFingerprintSensorSession$createMotionSensorListener$1] */
    public final void a() {
        synchronized (this) {
            if (this.c) {
                return;
            }
            this.c = true;
            SensorManager sensorManager = this.a;
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            Sensor defaultSensor2 = sensorManager.getDefaultSensor(4);
            Sensor defaultSensor3 = sensorManager.getDefaultSensor(11);
            Sensor defaultSensor4 = sensorManager.getDefaultSensor(2);
            Sensor defaultSensor5 = sensorManager.getDefaultSensor(6);
            Sensor defaultSensor6 = sensorManager.getDefaultSensor(19);
            final ym21 ym21Var = new ym21(defaultSensor, defaultSensor2, defaultSensor3, defaultSensor4, defaultSensor5, defaultSensor6);
            final um21 um21Var = new um21();
            ?? r10 = new SensorEventListener() { // from class: ru.yandex.taxi.persuggest.fingerprint.UserFingerprintSensorSession$createMotionSensorListener$1
                @Override // android.hardware.SensorEventListener
                public void onAccuracyChanged(Sensor sensor, int accuracy) {
                }

                @Override // android.hardware.SensorEventListener
                public void onSensorChanged(SensorEvent event) {
                    boolean z;
                    boolean z2;
                    double sqrt;
                    um21 um21Var2 = um21.this;
                    um21Var2.getClass();
                    int type = event.sensor.getType();
                    int i = 2;
                    if (type == 1) {
                        z = false;
                        float[] fArr = event.values;
                        z2 = true;
                        um21Var2.a = scc.g(Double.valueOf(fArr[0] / 9.80665d), Double.valueOf(fArr[1] / 9.80665d), Double.valueOf(fArr[2] / 9.80665d));
                    } else if (type == 2) {
                        z = false;
                        float[] fArr2 = event.values;
                        double d = fArr2[0];
                        double d2 = fArr2[1];
                        double d3 = fArr2[2];
                        um21Var2.d = Double.valueOf(Math.sqrt((d3 * d3) + (d2 * d2) + (d * d)));
                        int i2 = event.accuracy;
                        if (i2 == 1) {
                            i = 1;
                        } else if (i2 != 2) {
                            i = i2 != 3 ? 0 : 3;
                        }
                        um21Var2.e = Integer.valueOf(i);
                        z2 = true;
                    } else if (type == 4) {
                        z = false;
                        z2 = true;
                        float[] fArr3 = event.values;
                        um21Var2.b = scc.g(Double.valueOf(fArr3[0]), Double.valueOf(fArr3[1]), Double.valueOf(fArr3[2]));
                    } else if (type == 6) {
                        z = false;
                        z2 = true;
                        um21Var2.f = Float.valueOf(event.values[0]);
                        um21Var2.g = Integer.valueOf(event.accuracy);
                    } else if (type != 11) {
                        if (type == 19) {
                            um21Var2.h = Float.valueOf(event.values[0]);
                        }
                        z = false;
                        z2 = true;
                    } else {
                        float[] fArr4 = event.values;
                        double d4 = fArr4[0];
                        double d5 = fArr4[1];
                        double d6 = fArr4[2];
                        if (fArr4.length >= 4) {
                            sqrt = fArr4[3];
                        } else {
                            double d7 = ((1.0d - (d4 * d4)) - (d5 * d5)) - (d6 * d6);
                            if (d7 < 0.0d) {
                                d7 = 0.0d;
                            }
                            sqrt = Math.sqrt(d7);
                        }
                        double d8 = d5 * d5;
                        z = false;
                        z2 = true;
                        um21Var2.c = scc.g(Double.valueOf(Math.atan2(((d5 * d6) + (sqrt * d4)) * 2.0d, 1.0d - (((d4 * d4) + d8) * 2.0d))), Double.valueOf(Math.asin(y6i0.b(((sqrt * d5) - (d6 * d4)) * 2.0d, -1.0d, 1.0d))), Double.valueOf(Math.atan2(((d4 * d5) + (sqrt * d6)) * 2.0d, 1.0d - (((d6 * d6) + d8) * 2.0d))));
                    }
                    AtomicReference atomicReference = this.b;
                    um21 um21Var3 = um21.this;
                    ym21 ym21Var2 = ym21Var;
                    boolean z3 = ym21Var2.e != null ? z2 : z;
                    boolean z4 = ym21Var2.f != null ? z2 : z;
                    Double d9 = um21Var3.d;
                    Integer num = um21Var3.e;
                    f9r f9rVar = (d9 == null || num == null) ? null : new f9r(d9.doubleValue(), num.intValue());
                    atomicReference.set(new xm21(new wm21(um21Var3.a, um21Var3.b, um21Var3.c), f9rVar != null ? new vm21(f9rVar.a, f9rVar.b) : null, z3 ? um21Var3.f : null, z3 ? um21Var3.g : null, z4 ? um21Var3.h : null));
                }
            };
            this.d = r10;
            Iterator it = ((ArrayList) j73.A(new Sensor[]{defaultSensor, defaultSensor2, defaultSensor3, defaultSensor4, defaultSensor5, defaultSensor6})).iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (this.a.registerListener((SensorEventListener) r10, (Sensor) it.next(), 2)) {
                    z = true;
                }
            }
            if (!z) {
                this.c = false;
                this.d = null;
                this.b.set(xm21.f);
            }
        }
    }
}
