package defpackage;

import android.view.Window;
import android.view.WindowInsets;

/* loaded from: classes10.dex */
public abstract class tle0 {
    public static void a(Window window) {
        window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
    }
}
