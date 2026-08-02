package defpackage;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;

/* loaded from: classes14.dex */
public abstract class sik0 extends qpk0 {
    public final j8y R;
    public vfk0 S;

    public sik0(ViewGroup viewGroup, j8y j8yVar) {
        super(viewGroup);
        this.R = j8yVar;
    }

    public final void c0(olk0 olk0Var) {
        j8y j8yVar = this.R;
        if (j8yVar == null) {
            return;
        }
        vfk0 o = olk0Var.o();
        if (jl40.l(this.S, o)) {
            return;
        }
        this.S = o;
        View view = this.a;
        OneShotPreDrawListener.add(view, new z8k0(view, view, SystemClock.elapsedRealtimeNanos(), j8yVar, o, 11));
    }
}
