package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import java.util.Set;

/* loaded from: classes9.dex */
public final class zdy implements q {
    public final /* synthetic */ Set a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ Lifecycle c;

    public zdy(Set set, Runnable runnable, Lifecycle lifecycle) {
        this.a = set;
        this.b = runnable;
        this.c = lifecycle;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        if (this.a.contains(event)) {
            this.b.run();
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.c.d(this);
        }
    }
}
