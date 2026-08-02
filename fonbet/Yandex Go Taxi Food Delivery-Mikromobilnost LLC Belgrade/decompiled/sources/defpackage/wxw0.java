package defpackage;

import android.view.View;
import androidx.customview.widget.a;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes11.dex */
public final class wxw0 implements Runnable {
    public final View a;
    public final boolean b;
    public final /* synthetic */ SwipeDismissBehavior c;

    public wxw0(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.c = swipeDismissBehavior;
        this.a = view;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dc5 dc5Var;
        SwipeDismissBehavior swipeDismissBehavior = this.c;
        a aVar = swipeDismissBehavior.a;
        View view = this.a;
        if (aVar != null && aVar.h()) {
            view.postOnAnimation(this);
        } else {
            if (!this.b || (dc5Var = swipeDismissBehavior.b) == null) {
                return;
            }
            dc5Var.a(view);
        }
    }
}
