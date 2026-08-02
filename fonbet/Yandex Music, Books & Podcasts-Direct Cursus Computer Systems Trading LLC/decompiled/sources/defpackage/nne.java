package defpackage;

/* loaded from: classes3.dex */
public final class nne implements rlk {
    public boolean a;
    public final /* synthetic */ one b;

    public nne(one oneVar) {
        this.b = oneVar;
    }

    @Override // defpackage.rlk
    public final void a() {
        one oneVar = this.b;
        oneVar.b = false;
        if (this.a) {
            return;
        }
        oneVar.a = null;
    }

    @Override // defpackage.rlk
    public final void b() {
        this.b.b = true;
        this.a = false;
    }
}
