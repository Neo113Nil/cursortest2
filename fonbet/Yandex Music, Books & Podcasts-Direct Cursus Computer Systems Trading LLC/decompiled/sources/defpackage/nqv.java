package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;

/* loaded from: classes.dex */
public class nqv extends y5g {
    public final WindowInsetsController a;
    public final knn b;
    public final Window c;

    public nqv(Window window, knn knnVar) {
        this(window.getInsetsController(), knnVar);
        this.c = window;
    }

    public final void C0(int i) {
        View decorView = this.c.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void D0(int i) {
        View decorView = this.c.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // defpackage.y5g
    public final void b0(int i) {
        if ((i & 8) != 0) {
            ((f4m) this.b.b).u();
        }
        this.a.hide(i & (-9));
    }

    @Override // defpackage.y5g
    public boolean c0() {
        this.a.setSystemBarsAppearance(0, 0);
        return (this.a.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // defpackage.y5g
    public final void j0(boolean z) {
        Window window = this.c;
        if (z) {
            if (window != null) {
                C0(16);
            }
            this.a.setSystemBarsAppearance(16, 16);
        } else {
            if (window != null) {
                D0(16);
            }
            this.a.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // defpackage.y5g
    public final void k0(boolean z) {
        Window window = this.c;
        if (z) {
            if (window != null) {
                C0(RemoteCameraConfig.Notification.ID);
            }
            this.a.setSystemBarsAppearance(8, 8);
        } else {
            if (window != null) {
                D0(RemoteCameraConfig.Notification.ID);
            }
            this.a.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // defpackage.y5g
    public void l0() {
        Window window = this.c;
        if (window == null) {
            this.a.setSystemBarsBehavior(2);
            return;
        }
        window.getDecorView().setTag(356039078, 2);
        D0(2048);
        C0(4096);
    }

    @Override // defpackage.y5g
    public final void m0(int i) {
        if ((i & 8) != 0) {
            ((f4m) this.b.b).A();
        }
        this.a.show(i & (-9));
    }

    public nqv(WindowInsetsController windowInsetsController, knn knnVar) {
        this.a = windowInsetsController;
        this.b = knnVar;
    }
}
