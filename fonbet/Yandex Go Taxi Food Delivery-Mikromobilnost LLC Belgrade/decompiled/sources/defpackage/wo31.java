package defpackage;

import android.view.View;

/* loaded from: classes14.dex */
public final class wo31 extends yo31 {
    public final View a;

    public wo31(View view) {
        this.a = view;
    }

    @Override // defpackage.yo31
    public final void a() {
        this.a.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
    }

    @Override // defpackage.yo31
    public final void b() {
        this.a.animate().scaleX(0.7f).scaleY(0.7f).setDuration(150L).start();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wo31) && jl40.l(this.a, ((wo31) obj).a) && Float.compare(1.0f, 1.0f) == 0 && Float.compare(0.7f, 0.7f) == 0;
    }

    public final int hashCode() {
        return Long.hashCode(150L) + g8e.c(0.7f, g8e.c(1.0f, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ScaleAnimationTask(view=" + this.a + ", scaleFrom=1.0, scaleTo=0.7, duration=150)";
    }
}
