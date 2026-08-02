package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* loaded from: classes.dex */
public final class fxj implements SensorEventListener {
    public final /* synthetic */ int a;
    public final float[] b;
    public final float[] c;
    public final float[] d;
    public final float[] e;
    public final Display f;
    public boolean g;
    public final Object[] h;

    public fxj(Display display, dxj[] dxjVarArr) {
        this.a = 0;
        this.b = new float[16];
        this.c = new float[16];
        this.d = new float[16];
        this.e = new float[3];
        this.f = display;
        this.h = dxjVarArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
        int i2 = this.a;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                float[] fArr = sensorEvent.values;
                float[] fArr2 = this.b;
                SensorManager.getRotationMatrixFromVector(fArr2, fArr);
                int rotation = this.f.getRotation();
                float[] fArr3 = this.c;
                if (rotation != 0) {
                    int i3 = 129;
                    if (rotation != 1) {
                        i = 130;
                        if (rotation != 2) {
                            if (rotation != 3) {
                                e7o.n();
                                break;
                            } else {
                                i3 = 130;
                                i = 1;
                            }
                        }
                    } else {
                        i = 129;
                        i3 = 2;
                    }
                    System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
                    SensorManager.remapCoordinateSystem(fArr3, i3, i, fArr2);
                }
                SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
                float[] fArr4 = this.e;
                SensorManager.getOrientation(fArr3, fArr4);
                float f = fArr4[2];
                Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
                boolean z = this.g;
                float[] fArr5 = this.d;
                if (!z) {
                    z0j.G(fArr5, fArr2);
                    this.g = true;
                }
                System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
                Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
                dxj[] dxjVarArr = (dxj[]) this.h;
                for (int i4 = 0; i4 < 2; i4++) {
                    dxjVarArr[i4].a(f, fArr2);
                }
                break;
            default:
                float[] fArr6 = sensorEvent.values;
                float[] fArr7 = this.b;
                SensorManager.getRotationMatrixFromVector(fArr7, fArr6);
                int rotation2 = this.f.getRotation();
                float[] fArr8 = this.c;
                if (rotation2 != 0) {
                    int i5 = 129;
                    if (rotation2 != 1) {
                        i2 = 130;
                        if (rotation2 != 2) {
                            if (rotation2 != 3) {
                                e7o.n();
                                break;
                            } else {
                                i5 = 130;
                                i2 = 1;
                            }
                        }
                    } else {
                        i2 = 129;
                        i5 = 2;
                    }
                    System.arraycopy(fArr7, 0, fArr8, 0, fArr8.length);
                    SensorManager.remapCoordinateSystem(fArr8, i5, i2, fArr7);
                }
                SensorManager.remapCoordinateSystem(fArr7, 1, 131, fArr8);
                float[] fArr9 = this.e;
                SensorManager.getOrientation(fArr8, fArr9);
                float f2 = fArr9[2];
                Matrix.rotateM(fArr7, 0, 90.0f, 1.0f, 0.0f, 0.0f);
                boolean z2 = this.g;
                float[] fArr10 = this.d;
                if (!z2) {
                    z0j.I(fArr10, fArr7);
                    this.g = true;
                }
                System.arraycopy(fArr7, 0, fArr8, 0, fArr8.length);
                Matrix.multiplyMM(fArr7, 0, fArr8, 0, fArr10, 0);
                exj[] exjVarArr = (exj[]) this.h;
                for (int i6 = 0; i6 < 2; i6++) {
                    exjVarArr[i6].a(f2, fArr7);
                }
                break;
        }
    }

    public fxj(Display display, exj[] exjVarArr) {
        this.a = 1;
        this.b = new float[16];
        this.c = new float[16];
        this.d = new float[16];
        this.e = new float[3];
        this.f = display;
        this.h = exjVarArr;
    }

    private final void a(Sensor sensor, int i) {
    }

    private final void b(Sensor sensor, int i) {
    }
}
