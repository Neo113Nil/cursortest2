package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* loaded from: classes4.dex */
public final class wtp implements SensorEventListener {
    public final cte a;
    public SensorManager b;
    public long c;
    public int d;
    public long e;

    public wtp(cte cteVar) {
        this.a = cteVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        sensor.getClass();
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        sensorEvent.getClass();
        float[] fArr = sensorEvent.values;
        float f = fArr[0] / 9.80665f;
        float f2 = fArr[1] / 9.80665f;
        float f3 = fArr[2] / 9.80665f;
        if (((float) Math.sqrt((f3 * f3) + (f2 * f2) + (f * f))) < 2.7f) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.e + 500 > currentTimeMillis) {
            return;
        }
        this.e = currentTimeMillis;
        if (this.c + 3000 < currentTimeMillis) {
            this.d = 0;
        }
        this.c = currentTimeMillis;
        int i = this.d + 1;
        this.d = i;
        if (i >= 3) {
            this.d = 0;
            this.a.invoke();
        }
    }
}
