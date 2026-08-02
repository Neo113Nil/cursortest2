package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes6.dex */
public final class abe implements View.OnTouchListener {
    public static final abe b = new abe(0);
    public static final abe c = new abe(1);
    public final /* synthetic */ int a;

    public /* synthetic */ abe(int i) {
        this.a = i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                if (view.hasFocus()) {
                    return false;
                }
                view.requestFocus();
                return false;
            case 2:
                return true;
            case 3:
                return true;
            default:
                return false;
        }
    }
}
