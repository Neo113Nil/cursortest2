package defpackage;

/* loaded from: classes13.dex */
public class s5o implements tys {
    public final tfx a;

    public s5o(tfx tfxVar) {
        this.a = tfxVar;
    }

    @Override // defpackage.tys
    public final void a(wys wysVar, Object obj) {
        tfx tfxVar = this.a;
        if (tfxVar != null) {
            ((wls) tfxVar).invoke(wysVar, obj);
        } else {
            wysVar.c(obj);
        }
    }

    @Override // defpackage.tys
    public final boolean b(Object obj, Object obj2) {
        return !jl40.l(obj, obj2);
    }

    public s5o() {
        this(null);
    }
}
