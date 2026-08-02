package yads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import defpackage.gp51;
import defpackage.o071;
import defpackage.rf71;
import defpackage.rp61;

/* loaded from: classes7.dex */
public final class fg3 implements o071, DisplayManager.DisplayListener {
    public final DisplayManager a;
    public rp61 b;

    public fg3(DisplayManager displayManager) {
        this.a = displayManager;
    }

    @Override // defpackage.o071
    public final void a(rp61 rp61Var) {
        this.b = rp61Var;
        this.a.registerDisplayListener(this, rf71.i(null));
        ((gp51) rp61Var).f(this.a.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        rp61 rp61Var = this.b;
        if (rp61Var == null || i != 0) {
            return;
        }
        ((gp51) rp61Var).f(this.a.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    public static fg3 a(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new fg3(displayManager);
        }
        return null;
    }

    @Override // defpackage.o071
    public final void a() {
        this.a.unregisterDisplayListener(this);
        this.b = null;
    }
}
