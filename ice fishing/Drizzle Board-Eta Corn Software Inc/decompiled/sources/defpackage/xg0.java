package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class xg0 {
    public final WeakReference qoPGr6Ce;

    public xg0(View view) {
        this.qoPGr6Ce = new WeakReference(view);
    }

    public final void MdtA4re8(long j) {
        View view = (View) this.qoPGr6Ce.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void NCTxEWno() {
        View view = (View) this.qoPGr6Ce.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void VgvYg0wo(float f) {
        View view = (View) this.qoPGr6Ce.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    public final void qoPGr6Ce(float f) {
        View view = (View) this.qoPGr6Ce.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void wxUZMvaN(zg0 zg0Var) {
        View view = (View) this.qoPGr6Ce.get();
        if (view != null) {
            if (zg0Var != null) {
                view.animate().setListener(new tef3qNMP(zg0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }
}
