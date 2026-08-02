package defpackage;

/* loaded from: classes8.dex */
public final class v8g implements xvf0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z8g b;

    public /* synthetic */ v8g(z8g z8gVar, int i) {
        this.a = i;
        this.b = z8gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        z8g z8gVar = this.b;
        switch (i) {
            case 0:
                return new n8g(z8gVar.b);
            default:
                return new e9g(z8gVar.b);
        }
    }
}
