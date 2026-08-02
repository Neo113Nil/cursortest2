package androidx.media3.exoplayer.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.Response;
import com.plaid.internal.EnumC0170g;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class OrientationListener implements SensorEventListener {
    public final Display display;
    public final Listener[] listeners;
    public boolean recenterMatrixComputed;
    public final float[] deviceOrientationMatrix4x4 = new float[16];
    public final float[] tempMatrix4x4 = new float[16];
    public final float[] recenterMatrix4x4 = new float[16];
    public final float[] angles = new float[3];

    public interface Listener {
        void onOrientationChange(float f, float[] fArr);
    }

    public OrientationListener(Display display, Listener... listenerArr) {
        this.display = display;
        this.listeners = listenerArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.deviceOrientationMatrix4x4;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.display.getRotation();
        float[] fArr3 = this.tempMatrix4x4;
        if (rotation != 0) {
            int i2 = EnumC0170g.SDK_ASSET_ILLUSTRATION_FORM_VALUE;
            if (rotation != 1) {
                i = EnumC0170g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE;
                if (rotation != 2) {
                    if (rotation != 3) {
                        Path$$ExternalSyntheticBUOutline0.m();
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
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i2, i, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.angles;
        SensorManager.getOrientation(fArr3, fArr4);
        float f = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
        boolean z = this.recenterMatrixComputed;
        float[] fArr5 = this.recenterMatrix4x4;
        if (!z) {
            Response.computeRecenterMatrix(fArr5, fArr2);
            this.recenterMatrixComputed = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        for (int i3 = 0; i3 < 2; i3++) {
            this.listeners[i3].onOrientationChange(f, fArr2);
        }
    }
}
