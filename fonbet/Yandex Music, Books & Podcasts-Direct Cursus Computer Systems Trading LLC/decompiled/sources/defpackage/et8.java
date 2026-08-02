package defpackage;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* loaded from: classes3.dex */
public final class et8 implements ComponentCallbacks {
    public final /* synthetic */ ltm a;

    public et8(ltm ltmVar) {
        this.a = ltmVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        ((oc4) this.a).c(Integer.valueOf(configuration.orientation));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}
