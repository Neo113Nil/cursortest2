package io.flutter.view;

import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class e {
    public static e e;
    public static VsyncWaiter$DisplayListener f;
    public final FlutterJNI b;
    public long a = -1;
    public VsyncWaiter$FrameCallback c = new VsyncWaiter$FrameCallback(this, 0);
    public final d d = new d(this);

    public e(FlutterJNI flutterJNI) {
        this.b = flutterJNI;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [io.flutter.view.VsyncWaiter$DisplayListener] */
    public static e a(final DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (e == null) {
            e = new e(flutterJNI);
        }
        if (f == null) {
            final e eVar = e;
            Objects.requireNonNull(eVar);
            ?? r0 = new DisplayManager.DisplayListener(displayManager) { // from class: io.flutter.view.VsyncWaiter$DisplayListener
                private DisplayManager displayManager;

                {
                    this.displayManager = displayManager;
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayAdded(int i) {
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayChanged(int i) {
                    if (i == 0) {
                        float refreshRate = this.displayManager.getDisplay(0).getRefreshRate();
                        e eVar2 = e.this;
                        eVar2.a = (long) (1.0E9d / refreshRate);
                        eVar2.b.setRefreshRateFPS(refreshRate);
                    }
                }

                @Override // android.hardware.display.DisplayManager.DisplayListener
                public void onDisplayRemoved(int i) {
                }

                public void register() {
                    this.displayManager.registerDisplayListener(this, null);
                }
            };
            f = r0;
            r0.register();
        }
        if (e.a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            e.a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return e;
    }
}
