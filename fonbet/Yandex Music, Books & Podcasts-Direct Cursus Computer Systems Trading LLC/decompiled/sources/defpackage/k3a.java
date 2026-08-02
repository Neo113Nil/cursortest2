package defpackage;

/* loaded from: classes5.dex */
public final class k3a implements yn7 {
    public boolean a;
    public final /* synthetic */ o3a b;

    public k3a(o3a o3aVar) {
        this.b = o3aVar;
    }

    @Override // defpackage.yn7
    public final void onCreate(dzf dzfVar) {
        dzfVar.getClass();
    }

    @Override // defpackage.yn7
    public final void onResume(dzf dzfVar) {
        dzfVar.getClass();
    }

    @Override // defpackage.yn7
    public final void onStart(dzf dzfVar) {
        if (this.a) {
            this.b.y.D(b4a.n);
        }
    }

    @Override // defpackage.yn7
    public final void onStop(dzf dzfVar) {
        this.b.y.D(z3a.n);
        this.a = true;
    }

    @Override // defpackage.yn7
    public final void onDestroy(dzf dzfVar) {
    }

    @Override // defpackage.yn7
    public final void onPause(dzf dzfVar) {
    }
}
