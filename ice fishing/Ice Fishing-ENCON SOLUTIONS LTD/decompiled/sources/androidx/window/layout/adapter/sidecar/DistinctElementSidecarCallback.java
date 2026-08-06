package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import c0.C0137f;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: b, reason: collision with root package name */
    public SidecarDeviceState f2597b;

    /* renamed from: d, reason: collision with root package name */
    public final C0137f f2599d;

    /* renamed from: e, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f2600e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f2596a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final WeakHashMap f2598c = new WeakHashMap();

    public DistinctElementSidecarCallback(C0137f c0137f, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f2599d = c0137f;
        this.f2600e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f2596a) {
            try {
                C0137f c0137f = this.f2599d;
                SidecarDeviceState sidecarDeviceState2 = this.f2597b;
                c0137f.getClass();
                if (C0137f.a(sidecarDeviceState2, sidecarDeviceState)) {
                    return;
                }
                this.f2597b = sidecarDeviceState;
                this.f2600e.onDeviceStateChanged(sidecarDeviceState);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f2596a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f2598c.get(iBinder);
                this.f2599d.getClass();
                if (C0137f.d(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f2598c.put(iBinder, sidecarWindowLayoutInfo);
                this.f2600e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
