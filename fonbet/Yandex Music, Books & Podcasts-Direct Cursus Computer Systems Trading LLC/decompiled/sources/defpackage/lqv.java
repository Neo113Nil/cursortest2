package defpackage;

import android.view.View;
import android.view.Window;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;

/* loaded from: classes.dex */
public class lqv extends y5g {
    public final Window a;
    public final knn b;

    public lqv(Window window, knn knnVar) {
        this.a = window;
        this.b = knnVar;
    }

    public final void C0(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void D0(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // defpackage.y5g
    public final void b0(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    C0(4);
                } else if (i2 == 2) {
                    C0(2);
                } else if (i2 == 8) {
                    ((f4m) this.b.b).u();
                }
            }
        }
    }

    @Override // defpackage.y5g
    public final boolean c0() {
        return (this.a.getDecorView().getSystemUiVisibility() & RemoteCameraConfig.Notification.ID) != 0;
    }

    @Override // defpackage.y5g
    public final void k0(boolean z) {
        if (!z) {
            D0(RemoteCameraConfig.Notification.ID);
            return;
        }
        Window window = this.a;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        C0(RemoteCameraConfig.Notification.ID);
    }

    @Override // defpackage.y5g
    public final void l0() {
        this.a.getDecorView().setTag(356039078, 2);
        D0(2048);
        C0(4096);
    }

    @Override // defpackage.y5g
    public final void m0(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    D0(4);
                    this.a.clearFlags(1024);
                } else if (i2 == 2) {
                    D0(2);
                } else if (i2 == 8) {
                    ((f4m) this.b.b).A();
                }
            }
        }
    }
}
