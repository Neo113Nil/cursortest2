package defpackage;

/* loaded from: classes4.dex */
public final class s3l0 implements r3l0 {
    public final r3l0 a;
    public final klc b;

    public s3l0(r3l0 r3l0Var, klc klcVar) {
        this.a = r3l0Var;
        this.b = klcVar;
    }

    @Override // defpackage.r3l0
    public final o3l0 get() {
        return new p3l0(this.a.get(), this.b);
    }
}
