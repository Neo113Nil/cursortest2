package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes9.dex */
public final /* synthetic */ class xd2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ xd2(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                if (Math.abs(view.getAlpha()) < 1.0E-4f) {
                    view.setVisibility(4);
                    break;
                }
                break;
            default:
                if (view != null) {
                    Object systemService = view.getContext().getSystemService("input_method");
                    InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                    if (inputMethodManager != null) {
                        inputMethodManager.showSoftInput(view, 0);
                        break;
                    }
                }
                break;
        }
    }
}
