package androidx.fragment.app;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ o a;

    public /* synthetic */ j(o oVar) {
        this.a = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = this.a;
        d0 d0Var = oVar.mViewLifecycleOwner;
        d0Var.f.a(oVar.mSavedViewRegistryState);
        oVar.mSavedViewRegistryState = null;
    }
}
