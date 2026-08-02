package defpackage;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes3.dex */
public final class gjc {
    public final efo a;
    public final /* synthetic */ FloatingActionButton b;

    public gjc(FloatingActionButton floatingActionButton, efo efoVar) {
        this.b = floatingActionButton;
        this.a = efoVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof gjc) && ((gjc) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
