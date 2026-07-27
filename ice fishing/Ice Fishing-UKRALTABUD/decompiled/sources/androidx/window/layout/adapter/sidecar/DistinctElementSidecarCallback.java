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
    public SidecarDeviceState f1623b;

    /* renamed from: d, reason: collision with root package name */
    public final f f1625d;

    /* renamed from: e, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f1626e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1622a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f1624c = new WeakHashMap();

    public DistinctElementSidecarCallback(f fVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f1625d = fVar;
        this.f1626e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f1622a) {
            try {
                f fVar = this.f1625d;
                SidecarDeviceState sidecarDeviceState2 = this.f1623b;
                fVar.getClass();
                if (f.a(sidecarDeviceState2, sidecarDeviceState)) {
                    return;
                }
                this.f1623b = sidecarDeviceState;
                this.f1626e.onDeviceStateChanged(sidecarDeviceState);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f1622a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f1624c.get(iBinder);
                this.f1625d.getClass();
                if (f.d(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f1624c.put(iBinder, sidecarWindowLayoutInfo);
                this.f1626e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
