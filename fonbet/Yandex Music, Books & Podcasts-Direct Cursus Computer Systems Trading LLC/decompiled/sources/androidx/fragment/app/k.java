package androidx.fragment.app;

import android.os.Bundle;
import defpackage.htc;
import defpackage.q6k;

/* loaded from: classes.dex */
public final class k extends htc {
    public final /* synthetic */ o a;

    public k(o oVar) {
        this.a = oVar;
    }

    @Override // defpackage.htc
    public final void a() {
        o oVar = this.a;
        oVar.mSavedStateRegistryController.a.a();
        q6k.p(oVar);
        Bundle bundle = oVar.mSavedFragmentState;
        oVar.mSavedStateRegistryController.a(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
