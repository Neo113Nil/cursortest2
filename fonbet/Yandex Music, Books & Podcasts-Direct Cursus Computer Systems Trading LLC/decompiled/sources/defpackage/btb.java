package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* loaded from: classes3.dex */
public final class btb implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ dtb c;
    public final /* synthetic */ ExpandableBehavior d;

    public btb(ExpandableBehavior expandableBehavior, View view, int i, dtb dtbVar) {
        this.d = expandableBehavior;
        this.a = view;
        this.b = i;
        this.c = dtbVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i;
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.d;
        i = expandableBehavior.currentState;
        if (i == this.b) {
            Object obj = this.c;
            expandableBehavior.onExpandedStateChange((View) obj, view, ((FloatingActionButton) obj).o.b, false);
        }
        return false;
    }
}
