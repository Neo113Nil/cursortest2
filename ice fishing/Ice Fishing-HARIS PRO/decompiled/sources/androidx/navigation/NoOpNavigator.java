package androidx.navigation;

import android.os.Bundle;
import f0.C0134C;
import f0.M;
import f0.N;
import f0.w;

@M("NoOp")
/* loaded from: classes.dex */
public final class NoOpNavigator extends N {
    @Override // f0.N
    public final w a() {
        return new w(this);
    }

    @Override // f0.N
    public final w c(w wVar, Bundle bundle, C0134C c0134c) {
        return wVar;
    }
}
