package defpackage;

import android.view.View;

/* loaded from: classes14.dex */
public final class vo31 extends yo31 {
    public final View a;

    public vo31(View view) {
        this.a = view;
    }

    @Override // defpackage.yo31
    public final void a() {
        this.a.animate().setDuration(300L).alpha(1.0f).setListener(null).start();
    }

    @Override // defpackage.yo31
    public final void b() {
        this.a.animate().setDuration(300L).alpha(0.5f).setListener(null).start();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vo31) && jl40.l(this.a, ((vo31) obj).a) && Float.compare(1.0f, 1.0f) == 0 && Float.compare(0.5f, 0.5f) == 0;
    }

    public final int hashCode() {
        return Long.hashCode(300L) + g8e.c(0.5f, g8e.c(1.0f, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "AlphaAnimationTask(view=" + this.a + ", from=1.0, to=0.5, duration=300)";
    }
}
