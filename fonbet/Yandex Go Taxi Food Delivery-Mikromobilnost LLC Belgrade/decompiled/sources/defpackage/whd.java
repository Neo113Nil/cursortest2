package defpackage;

import androidx.compose.ui.tooling.ComposeViewAdapter;
import androidx.lifecycle.Lifecycle;

/* loaded from: classes10.dex */
public final class whd implements rx60 {
    public final qx60 a = new qx60(null);
    public final /* synthetic */ ComposeViewAdapter b;

    public whd(ComposeViewAdapter composeViewAdapter) {
        this.b = composeViewAdapter;
    }

    @Override // defpackage.pey
    public final Lifecycle getLifecycle() {
        xhd xhdVar;
        xhdVar = this.b.FakeSavedStateRegistryOwner;
        return xhdVar.a;
    }

    @Override // defpackage.rx60
    public final qx60 getOnBackPressedDispatcher() {
        return this.a;
    }
}
