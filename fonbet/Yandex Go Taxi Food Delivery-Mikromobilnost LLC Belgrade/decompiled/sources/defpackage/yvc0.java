package defpackage;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import io.flutter.embedding.engine.systemchannels.PlatformChannel$Brightness;
import io.flutter.plugin.platform.a;

/* loaded from: classes2.dex */
public class yvc0 {
    public final Activity a;
    public final y4a0 b;
    public final lrr c;
    public wrr d;
    public int e;

    public yvc0(Activity activity, y4a0 y4a0Var, lrr lrrVar) {
        a aVar = new a(this);
        this.a = activity;
        this.b = y4a0Var;
        y4a0Var.c = aVar;
        this.c = lrrVar;
        this.e = 1280;
    }

    public final void a(wrr wrrVar) {
        Window window = this.a.getWindow();
        va90 va90Var = new va90(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        bvf0 q751Var = i >= 35 ? new q751(window, va90Var) : i >= 30 ? new p751(window, va90Var) : new o751(window, va90Var);
        if (Build.VERSION.SDK_INT < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        PlatformChannel$Brightness platformChannel$Brightness = (PlatformChannel$Brightness) wrrVar.c;
        if (platformChannel$Brightness != null) {
            int i2 = wvc0.c[platformChannel$Brightness.ordinal()];
            if (i2 == 1) {
                q751Var.U(true);
            } else if (i2 == 2) {
                q751Var.U(false);
            }
        }
        Integer num = (Integer) wrrVar.b;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = (Boolean) wrrVar.w;
        if (bool != null) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        PlatformChannel$Brightness platformChannel$Brightness2 = (PlatformChannel$Brightness) wrrVar.y;
        if (platformChannel$Brightness2 != null) {
            int i3 = wvc0.c[platformChannel$Brightness2.ordinal()];
            if (i3 == 1) {
                q751Var.T(true);
            } else if (i3 == 2) {
                q751Var.T(false);
            }
        }
        Integer num2 = (Integer) wrrVar.x;
        if (num2 != null) {
            window.setNavigationBarColor(num2.intValue());
        }
        Integer num3 = (Integer) wrrVar.z;
        if (num3 != null) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = (Boolean) wrrVar.A;
        if (bool2 != null) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.d = wrrVar;
    }

    public void b() {
        this.a.getWindow().getDecorView().setSystemUiVisibility(this.e);
        wrr wrrVar = this.d;
        if (wrrVar != null) {
            a(wrrVar);
        }
    }
}
