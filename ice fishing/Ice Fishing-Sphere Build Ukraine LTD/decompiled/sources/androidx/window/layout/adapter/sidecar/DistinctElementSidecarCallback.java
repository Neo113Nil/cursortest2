package androidx.window.layout.adapter.sidecar;

import X.f;
import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: b, reason: collision with root package name */
    public SidecarDeviceState f1631b;

    /* renamed from: d, reason: collision with root package name */
    public final f f1633d;

    /* renamed from: e, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f1634e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1630a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f1632c = new WeakHashMap();

    public DistinctElementSidecarCallback(f fVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f1633d = fVar;
        this.f1634e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f1630a) {
            try {
                f fVar = this.f1633d;
                SidecarDeviceState sidecarDeviceState2 = this.f1631b;
                fVar.getClass();
                if (f.a(sidecarDeviceState2, sidecarDeviceState)) {
                    return;
                }
                this.f1631b = sidecarDeviceState;
                this.f1634e.onDeviceStateChanged(sidecarDeviceState);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f1630a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f1632c.get(iBinder);
                this.f1633d.getClass();
                if (f.d(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f1632c.put(iBinder, sidecarWindowLayoutInfo);
                this.f1634e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
