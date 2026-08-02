package yads;

import android.app.Dialog;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import defpackage.gs71;
import defpackage.nga1;

/* loaded from: classes7.dex */
public final class nb implements View.OnTouchListener {
    public final ViewGroup a;
    public final Dialog b;
    public final gs71 c;
    public float d;

    public nb(ViewGroup viewGroup, Dialog dialog, gs71 gs71Var) {
        this.a = viewGroup;
        this.b = dialog;
        this.c = gs71Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.d = rawY;
            return true;
        }
        if (action == 1) {
            if (rawY > this.d) {
                this.c.getClass();
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                nga1.c(this.b);
            }
            return true;
        }
        if (action != 2) {
            return false;
        }
        float f = this.d;
        ViewGroup viewGroup = this.a;
        if (rawY > f) {
            viewGroup.setTranslationY(rawY - f);
            return true;
        }
        viewGroup.setTranslationY(0.0f);
        return true;
    }
}
