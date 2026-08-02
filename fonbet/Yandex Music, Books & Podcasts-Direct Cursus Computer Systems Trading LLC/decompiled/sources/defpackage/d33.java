package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class d33 extends ysc {
    public final /* synthetic */ int b = 2;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d33(doj dojVar, ij3 ij3Var) {
        super(ij3Var);
        this.c = dojVar;
    }

    @Override // defpackage.ysc, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.b) {
            case 1:
                ((po3) this.c).b.close();
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // defpackage.ysc, defpackage.n3r
    public long e0(hi3 hi3Var, long j) {
        switch (this.b) {
            case 0:
                try {
                    return super.e0(hi3Var, j);
                } catch (Exception e) {
                    this.c = e;
                    throw e;
                }
            case 1:
            default:
                return super.e0(hi3Var, j);
            case 2:
                try {
                    return super.e0(hi3Var, j);
                } catch (IOException e2) {
                    ((doj) this.c).d = e2;
                    throw e2;
                }
        }
    }

    public /* synthetic */ d33(n3r n3rVar) {
        super(n3rVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d33(n3r n3rVar, po3 po3Var) {
        super(n3rVar);
        this.c = po3Var;
    }
}
