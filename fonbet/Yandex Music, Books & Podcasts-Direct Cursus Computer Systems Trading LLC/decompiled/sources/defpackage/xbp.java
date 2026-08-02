package defpackage;

/* loaded from: classes5.dex */
public final class xbp {
    public final Object a;
    public final pyc b;
    public final pyc c;
    public final Object d;
    public final aur e;
    public final pyc f;
    public Object g;
    public int h = -1;
    public final /* synthetic */ acp i;

    public xbp(acp acpVar, Object obj, pyc pycVar, pyc pycVar2, js3 js3Var, aur aurVar, pyc pycVar3) {
        this.i = acpVar;
        this.a = obj;
        this.b = pycVar;
        this.c = pycVar2;
        this.d = js3Var;
        this.e = aurVar;
        this.f = pycVar3;
    }

    public final void a() {
        Object obj = this.g;
        if (obj instanceof yap) {
            ((yap) obj).h(this.h, this.i.a);
            return;
        }
        qa8 qa8Var = obj instanceof qa8 ? (qa8) obj : null;
        if (qa8Var != null) {
            qa8Var.a();
        }
    }
}
