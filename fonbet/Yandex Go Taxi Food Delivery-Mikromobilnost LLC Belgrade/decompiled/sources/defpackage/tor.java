package defpackage;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes11.dex */
public final class tor {
    public final qw01 a;
    public final /* synthetic */ FloatingActionButton b;

    public tor(FloatingActionButton floatingActionButton, qw01 qw01Var) {
        this.b = floatingActionButton;
        this.a = qw01Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof tor) && ((tor) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
