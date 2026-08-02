package defpackage;

import android.view.WindowId;

/* loaded from: classes5.dex */
public final class vqv extends WindowId.FocusObserver {
    @Override // android.view.WindowId.FocusObserver
    public final void onFocusGained(WindowId windowId) {
        if (windowId == null) {
            return;
        }
        ssg.a(4, "WindowLogger", "Window gained focus: " + windowId, null);
    }

    @Override // android.view.WindowId.FocusObserver
    public final void onFocusLost(WindowId windowId) {
        if (windowId == null) {
            return;
        }
        ssg.a(4, "WindowLogger", "Window lost focus: " + windowId, null);
    }
}
