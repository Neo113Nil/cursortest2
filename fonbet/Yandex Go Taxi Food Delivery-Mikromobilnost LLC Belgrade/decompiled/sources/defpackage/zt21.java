package defpackage;

/* loaded from: classes15.dex */
public final class zt21 implements x08 {
    public final String a;
    public final /* synthetic */ au21 b;

    public zt21(au21 au21Var, String str) {
        this.b = au21Var;
        this.a = str;
        au21Var.j.add(this);
        au21.a(au21Var);
    }

    @Override // defpackage.x08
    public final void cancel() {
        au21 au21Var = this.b;
        au21Var.j.remove(this);
        au21.a(au21Var);
    }
}
