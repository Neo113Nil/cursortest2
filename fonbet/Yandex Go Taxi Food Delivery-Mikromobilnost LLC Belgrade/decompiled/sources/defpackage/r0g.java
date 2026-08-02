package defpackage;

/* loaded from: classes5.dex */
public final class r0g implements xvf0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1g b;

    public /* synthetic */ r0g(d1g d1gVar, int i) {
        this.a = i;
        this.b = d1gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        d1g d1gVar = this.b;
        switch (i) {
            case 0:
                return new e1g(d1gVar.b);
            default:
                return new gyc(d1gVar.b);
        }
    }
}
