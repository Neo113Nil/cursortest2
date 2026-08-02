package defpackage;

import android.hardware.camera2.CameraManager;
import android.util.Log;
import androidx.camera.camera2.internal.Camera2PresenceSource$startMonitoring$1;
import androidx.concurrent.futures.b;
import defpackage.gl7;
import defpackage.jx81;
import defpackage.qqs;
import defpackage.zn7;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class zn7 extends x6 {
    public final kr7 f;
    public final Executor g;
    public Camera2PresenceSource$startMonitoring$1 h;

    public zn7(List list, kr7 kr7Var, Executor executor) {
        super(list);
        this.f = kr7Var;
        this.g = executor;
    }

    @Override // defpackage.gq60
    public final euy c() {
        b bVar = new b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            this.g.execute(new nm7(5, this, bVar));
            bVar.a = "FetchData for CameraAvailability";
        } catch (Exception e) {
            gl7Var.a(e);
        }
        return gl7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.hardware.camera2.CameraManager$AvailabilityCallback, androidx.camera.camera2.internal.Camera2PresenceSource$startMonitoring$1] */
    @Override // defpackage.x6
    public final void d() {
        if (this.h != null) {
            e();
        }
        Log.i("Camera2PresenceSrc", "Starting system availability monitoring.");
        ?? r0 = new CameraManager.AvailabilityCallback() { // from class: androidx.camera.camera2.internal.Camera2PresenceSource$startMonitoring$1
            @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
            public void onCameraAccessPrioritiesChanged() {
                jx81.r(new qqs((gl7) zn7.this.c(), 0));
            }

            @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
            public void onCameraAvailable(String cameraId) {
                jx81.r(new qqs((gl7) zn7.this.c(), 0));
            }

            @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
            public void onCameraUnavailable(String cameraId) {
                jx81.r(new qqs((gl7) zn7.this.c(), 0));
            }
        };
        this.h = r0;
        ((CameraManager) this.f.a.b).registerAvailabilityCallback(this.g, (CameraManager.AvailabilityCallback) r0);
        jx81.r(new qqs(c(), 0));
    }

    @Override // defpackage.x6
    public final void e() {
        Log.i("Camera2PresenceSrc", "Stopping system availability monitoring.");
        Camera2PresenceSource$startMonitoring$1 camera2PresenceSource$startMonitoring$1 = this.h;
        if (camera2PresenceSource$startMonitoring$1 != null) {
            try {
                ((CameraManager) this.f.a.b).unregisterAvailabilityCallback(camera2PresenceSource$startMonitoring$1);
            } catch (Exception unused) {
            } finally {
                this.h = null;
            }
        }
    }
}
