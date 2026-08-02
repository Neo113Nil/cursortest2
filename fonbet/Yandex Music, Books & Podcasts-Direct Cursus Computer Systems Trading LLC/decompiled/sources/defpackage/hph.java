package defpackage;

/* loaded from: classes.dex */
public final class hph extends zqh {
    public final String a;
    public final gph b;

    public hph(String str, gph gphVar) {
        this.a = str;
        this.b = gphVar;
    }

    @Override // defpackage.zqh
    public final void f(int i) {
        gph gphVar;
        String str = this.a;
        if (str == null || (gphVar = this.b) == null) {
            return;
        }
        gphVar.q(i, str);
    }

    @Override // defpackage.zqh
    public final void i(int i) {
        gph gphVar;
        String str = this.a;
        if (str == null || (gphVar = this.b) == null) {
            return;
        }
        gphVar.r(i, str);
    }
}
