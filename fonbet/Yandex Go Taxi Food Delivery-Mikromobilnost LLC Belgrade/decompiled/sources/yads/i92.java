package yads;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import defpackage.nc71;
import defpackage.ny61;
import defpackage.v291;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes7.dex */
public final class i92 implements SensorEventListener {
    public final float[] a = new float[16];
    public final float[] b = new float[16];
    public final float[] c = new float[16];
    public final float[] d = new float[3];
    public final Display e;
    public final nc71[] f;
    public boolean g;

    public i92(Display display, nc71... nc71VarArr) {
        this.e = display;
        this.f = nc71VarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        SensorManager.getRotationMatrixFromVector(this.a, sensorEvent.values);
        float[] fArr = this.a;
        int rotation = this.e.getRotation();
        if (rotation != 0) {
            int i2 = HProv.PP_SECURITY_LEVEL;
            if (rotation != 1) {
                i = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        ny61.k();
                        return;
                    } else {
                        i2 = 130;
                        i = 1;
                    }
                }
            } else {
                i = 129;
                i2 = 2;
            }
            float[] fArr2 = this.b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.b, i2, i, fArr);
        }
        SensorManager.remapCoordinateSystem(this.a, 1, HProv.PP_FAST_CODE, this.b);
        SensorManager.getOrientation(this.b, this.d);
        float f = this.d[2];
        Matrix.rotateM(this.a, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        float[] fArr3 = this.a;
        if (!this.g) {
            v291.a(this.c, fArr3);
            this.g = true;
        }
        float[] fArr4 = this.b;
        System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
        Matrix.multiplyMM(fArr3, 0, this.b, 0, this.c, 0);
        float[] fArr5 = this.a;
        nc71[] nc71VarArr = this.f;
        for (int i3 = 0; i3 < 2; i3++) {
            nc71VarArr[i3].a(fArr5, f);
        }
    }
}
