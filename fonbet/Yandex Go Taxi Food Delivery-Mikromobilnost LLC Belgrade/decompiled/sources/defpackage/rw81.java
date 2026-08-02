package defpackage;

import java.util.List;

/* loaded from: classes7.dex */
public abstract class rw81 extends db71 implements fh81 {
    public long b;
    public fh81 c;
    public long w;

    @Override // defpackage.fh81
    public final int a(long j) {
        fh81 fh81Var = this.c;
        fh81Var.getClass();
        return fh81Var.a(j - this.w);
    }

    @Override // defpackage.fh81
    public final long b(int i) {
        fh81 fh81Var = this.c;
        fh81Var.getClass();
        return fh81Var.b(i) + this.w;
    }

    @Override // defpackage.fh81
    public final List d(long j) {
        fh81 fh81Var = this.c;
        fh81Var.getClass();
        return fh81Var.d(j - this.w);
    }

    public abstract void e();

    @Override // defpackage.fh81
    public final int a() {
        fh81 fh81Var = this.c;
        fh81Var.getClass();
        return fh81Var.a();
    }
}
