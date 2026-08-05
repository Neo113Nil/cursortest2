package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class w3 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ Object MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ w3(int i, Object obj) {
        this.NCTxEWno = i;
        this.MdtA4re8 = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.NCTxEWno) {
            case 1:
                View view2 = (View) this.MdtA4re8;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = hg0.qoPGr6Ce;
                view2.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.NCTxEWno;
        Object obj = this.MdtA4re8;
        switch (i) {
            case 0:
                z3 z3Var = (z3) obj;
                ViewTreeObserver viewTreeObserver = z3Var.WYNAV5pd;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        z3Var.WYNAV5pd = view.getViewTreeObserver();
                    }
                    z3Var.WYNAV5pd.removeGlobalOnLayoutListener(z3Var.eVhOlqcC);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                break;
            default:
                r90 r90Var = (r90) obj;
                ViewTreeObserver viewTreeObserver2 = r90Var.sjUBp5pO;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        r90Var.sjUBp5pO = view.getViewTreeObserver();
                    }
                    r90Var.sjUBp5pO.removeGlobalOnLayoutListener(r90Var.eVhOlqcC);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void MdtA4re8(View view) {
    }

    private final void NCTxEWno(View view) {
    }

    private final void qoPGr6Ce(View view) {
    }
}
