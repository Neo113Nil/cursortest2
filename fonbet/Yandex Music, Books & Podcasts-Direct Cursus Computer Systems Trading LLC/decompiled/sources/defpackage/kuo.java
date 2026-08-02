package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class kuo implements View.OnAttachStateChangeListener {
    public final f44 a;
    public final bgg b;
    public mm6 c;

    public kuo(f44 f44Var, bgg bggVar) {
        this.a = f44Var;
        this.b = bggVar;
    }

    public final void c() {
        mm6 mm6Var = this.c;
        if (mm6Var == null) {
            mm6Var = gld.e(ca8.b);
        }
        x97.y(mm6Var, null, null, new s1n(this, (Continuation) null, 24), 3);
        this.c = mm6Var;
        this.b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        mm6 mm6Var = this.c;
        if (mm6Var != null) {
            gld.L(mm6Var, null);
        }
        this.c = null;
    }
}
