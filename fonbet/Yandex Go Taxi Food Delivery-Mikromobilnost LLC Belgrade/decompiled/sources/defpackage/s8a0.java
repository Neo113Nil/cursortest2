package defpackage;

/* loaded from: classes12.dex */
public final class s8a0 extends u0x implements r7u, s7u, u7u {
    public final String a;
    public final String b = "payment_method_widget";
    public final u8a0 c;

    public s8a0(String str, u8a0 u8a0Var) {
        this.a = str;
        this.c = u8a0Var;
    }

    @Override // defpackage.r7u
    public final Object g() {
        return this.b;
    }

    @Override // defpackage.s7u
    public final Object getItemId() {
        return this.a;
    }

    @Override // defpackage.u7u
    public final Object getModel() {
        return this.c;
    }
}
