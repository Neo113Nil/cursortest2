package defpackage;

import android.view.View;
import com.yandex.messenger.websdk.internal.view.BackHandlingFrameLayout;

/* loaded from: classes15.dex */
public final class ze4 {
    public final BackHandlingFrameLayout a;
    public boolean b = false;
    public we4 c;

    public ze4(BackHandlingFrameLayout backHandlingFrameLayout) {
        this.a = backHandlingFrameLayout;
    }

    public final void a() {
        View rootView;
        if (this.b) {
            BackHandlingFrameLayout backHandlingFrameLayout = this.a;
            boolean z = backHandlingFrameLayout.isShown() && this.c != null;
            if (backHandlingFrameLayout.hasWindowFocus()) {
                boolean hasFocus = backHandlingFrameLayout.hasFocus();
                backHandlingFrameLayout.setFocusable(this.b);
                backHandlingFrameLayout.setFocusableInTouchMode(this.b);
                if (z) {
                    backHandlingFrameLayout.requestFocus();
                } else {
                    if (!hasFocus || (rootView = backHandlingFrameLayout.getRootView()) == null) {
                        return;
                    }
                    rootView.requestFocus(33);
                }
            }
        }
    }
}
