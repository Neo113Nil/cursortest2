package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* loaded from: classes5.dex */
public final class jn5 implements ComponentCallbacks2 {
    public final /* synthetic */ ej6 a;

    public jn5(ej6 ej6Var) {
        this.a = ej6Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.a.invoke();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i >= 40) {
            this.a.invoke();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
