package defpackage;

/* loaded from: classes5.dex */
public final class oij extends aij implements kso {
    public final Object a;

    public oij(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.aij
    public final void c(wjj wjjVar) {
        gjj gjjVar = new gjj(wjjVar, this.a);
        wjjVar.b(gjjVar);
        gjjVar.run();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a;
    }
}
