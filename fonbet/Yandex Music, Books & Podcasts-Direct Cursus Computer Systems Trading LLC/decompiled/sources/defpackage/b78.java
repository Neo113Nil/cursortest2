package defpackage;

/* loaded from: classes5.dex */
public final class b78 extends ysc {
    public boolean b;
    public final /* synthetic */ k78 c;
    public final /* synthetic */ d78 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b78(lt1 lt1Var, k78 k78Var, d78 d78Var) {
        super(lt1Var);
        this.c = k78Var;
        this.d = d78Var;
    }

    @Override // defpackage.ysc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (this.b) {
            return;
        }
        this.b = true;
        k78 k78Var = this.c;
        d78 d78Var = this.d;
        synchronized (k78Var) {
            int i = d78Var.h - 1;
            d78Var.h = i;
            if (i == 0 && d78Var.f) {
                k78Var.R(d78Var);
            }
        }
    }
}
