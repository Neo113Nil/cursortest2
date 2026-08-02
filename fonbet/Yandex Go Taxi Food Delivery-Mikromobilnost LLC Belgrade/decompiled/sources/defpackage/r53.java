package defpackage;

/* loaded from: classes.dex */
public final class r53 extends yqv {
    public final /* synthetic */ int w = 1;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r53(j63 j63Var) {
        super(j63Var.c);
        this.x = j63Var;
    }

    @Override // defpackage.yqv
    public final Object a(int i) {
        int i2 = this.w;
        Object obj = this.x;
        switch (i2) {
            case 0:
                return ((w53) obj).f(i);
            default:
                return ((j63) obj).b[i];
        }
    }

    @Override // defpackage.yqv
    public final void b(int i) {
        int i2 = this.w;
        Object obj = this.x;
        switch (i2) {
            case 0:
                ((w53) obj).h(i);
                break;
            default:
                ((j63) obj).b(i);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r53(w53 w53Var) {
        super(w53Var.c);
        this.x = w53Var;
    }
}
