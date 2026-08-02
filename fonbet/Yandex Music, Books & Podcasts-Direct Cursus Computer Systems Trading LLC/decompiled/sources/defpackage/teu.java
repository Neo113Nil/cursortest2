package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class teu implements SensorEventListener {
    public pt0 a;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            sensor.getClass();
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        boolean a;
        Set set = bp6.a;
        if (set.contains(this)) {
            return;
        }
        try {
            sensorEvent.getClass();
            pt0 pt0Var = this.a;
            if (pt0Var != null) {
                float[] fArr = sensorEvent.values;
                int i = 0;
                double d = fArr[0] / 9.80665f;
                double d2 = fArr[1] / 9.80665f;
                double d3 = fArr[2] / 9.80665f;
                if (Math.sqrt((d3 * d3) + (d2 * d2) + (d * d)) > 2.3d) {
                    n8c n8cVar = (n8c) pt0Var.b;
                    boolean z = n8cVar != null && n8cVar.g;
                    HashSet hashSet = j3c.a;
                    AtomicBoolean atomicBoolean = gtt.a;
                    if (!set.contains(gtt.class)) {
                        try {
                            gtt.i.e();
                            a = gtt.f.a();
                        } catch (Throwable th) {
                            bp6.a(gtt.class, th);
                        }
                        if (z || !a) {
                        }
                        String str = (String) pt0Var.a;
                        if (bp6.a.contains(ds4.class)) {
                            return;
                        }
                        try {
                            if (ds4.g) {
                                return;
                            }
                            ds4.g = true;
                            j3c.d().execute(new cs4(str, i));
                            return;
                        } catch (Throwable th2) {
                            bp6.a(ds4.class, th2);
                            return;
                        }
                    }
                    a = false;
                    if (z) {
                    }
                }
            }
        } catch (Throwable th3) {
            bp6.a(this, th3);
        }
    }
}
