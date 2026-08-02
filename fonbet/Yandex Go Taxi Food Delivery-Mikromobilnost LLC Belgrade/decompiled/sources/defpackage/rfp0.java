package defpackage;

import android.content.Context;
import android.os.Process;
import android.view.WindowManager;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class rfp0 {
    public final Context a;
    public final i3y b;
    public final n0 c;
    public final i3y d;

    public rfp0(Context context) {
        this.a = context;
        final int i = 0;
        sls slsVar = new sls(this) { // from class: qfp0
            public final /* synthetic */ rfp0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                rfp0 rfp0Var = this.b;
                switch (i2) {
                    case 0:
                        return (WindowManager) rfp0Var.a.getSystemService("window");
                    default:
                        return new qa0(25, rfp0Var);
                }
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = a.b(lazyThreadSafetyMode, slsVar);
        final int i2 = 1;
        this.c = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.d = a.b(lazyThreadSafetyMode, new sls(this) { // from class: qfp0
            public final /* synthetic */ rfp0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                rfp0 rfp0Var = this.b;
                switch (i22) {
                    case 0:
                        return (WindowManager) rfp0Var.a.getSystemService("window");
                    default:
                        return new qa0(25, rfp0Var);
                }
            }
        });
    }

    public final boolean a() {
        if (!jx81.g()) {
            return false;
        }
        if (this.a.checkPermission("android.permission.DETECT_SCREEN_RECORDING", Process.myPid(), Process.myUid()) == 0) {
            return true;
        }
        jst.e.h("ScreencastTracker", "No DETECT_SCREEN_RECORDING permission for Android 15+", new IllegalStateException());
        return false;
    }
}
