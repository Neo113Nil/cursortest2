package defpackage;

/* loaded from: classes3.dex */
public final class s9b0 implements v7p {
    public final /* synthetic */ int a;
    public final f380 b;

    public /* synthetic */ s9b0(f380 f380Var, int i) {
        this.a = i;
        this.b = f380Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        f380 f380Var = this.b;
        switch (i) {
            case 0:
                return new aq80((gdb0) f380Var.get());
            case 1:
                return new uab0((gdb0) f380Var.get());
            default:
                return new yj70((gdb0) f380Var.get());
        }
    }
}
