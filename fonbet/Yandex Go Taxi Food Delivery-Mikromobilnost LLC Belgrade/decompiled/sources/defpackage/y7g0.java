package defpackage;

/* loaded from: classes3.dex */
public final class y7g0 implements v7p {
    public final /* synthetic */ int a;
    public final c6g b;

    public /* synthetic */ y7g0(c6g c6gVar, int i) {
        this.a = i;
        this.b = c6gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        c6g c6gVar = this.b;
        switch (i) {
            case 0:
                return new v5c0(18, (w530) c6gVar.get());
            default:
                return new fbg0((w530) c6gVar.get());
        }
    }
}
