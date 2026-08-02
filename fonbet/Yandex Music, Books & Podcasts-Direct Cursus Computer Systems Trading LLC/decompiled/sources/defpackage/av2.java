package defpackage;

/* loaded from: classes5.dex */
public abstract class av2 implements wjj, x8n {
    public final wjj a;
    public ka8 b;
    public x8n c;
    public boolean d;

    public av2(wjj wjjVar) {
        this.a = wjjVar;
    }

    @Override // defpackage.ka8
    public final void a() {
        this.b.a();
    }

    @Override // defpackage.wjj
    public final void b(ka8 ka8Var) {
        if (ra8.h(this.b, ka8Var)) {
            this.b = ka8Var;
            if (ka8Var instanceof x8n) {
                this.c = (x8n) ka8Var;
            }
            this.a.b(this);
        }
    }

    @Override // defpackage.x8n
    public int c() {
        return 0;
    }

    @Override // defpackage.qjq
    public final void clear() {
        this.c.clear();
    }

    @Override // defpackage.qjq
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // defpackage.qjq
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.wjj
    public final void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.a.onComplete();
    }

    @Override // defpackage.wjj
    public final void onError(Throwable th) {
        if (this.d) {
            y5g.g0(th);
        } else {
            this.d = true;
            this.a.onError(th);
        }
    }
}
