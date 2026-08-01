package androidx.navigation;

import android.os.Bundle;
import f0.C0134C;
import f0.N;
import f0.w;

/* loaded from: classes.dex */
public final class NavDeepLinkBuilder$PermissiveNavigatorProvider$mDestNavigator$1 extends N {
    @Override // f0.N
    public final w a() {
        return new w("permissive");
    }

    @Override // f0.N
    public final w c(w wVar, Bundle bundle, C0134C c0134c) {
        throw new IllegalStateException("navigate is not supported");
    }

    @Override // f0.N
    public final boolean j() {
        throw new IllegalStateException("popBackStack is not supported");
    }
}
