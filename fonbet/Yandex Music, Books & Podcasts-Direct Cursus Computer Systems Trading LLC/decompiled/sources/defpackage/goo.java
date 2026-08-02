package defpackage;

/* loaded from: classes.dex */
public final class goo implements eun {
    public zoo a;
    public koo b;
    public String c;
    public Object d;
    public Object[] e;
    public joo f;
    public final kgk g = new kgk(13, this);

    public goo(zoo zooVar, koo kooVar, String str, Object obj, Object[] objArr) {
        this.a = zooVar;
        this.b = kooVar;
        this.c = str;
        this.d = obj;
        this.e = objArr;
    }

    public final void a() {
        String Z;
        koo kooVar = this.b;
        if (this.f != null) {
            tiu.g(this.f, ") is not null", "entry(");
            return;
        }
        if (kooVar != null) {
            kgk kgkVar = this.g;
            Object invoke = kgkVar.invoke();
            if (invoke == null || kooVar.c(invoke)) {
                this.f = kooVar.a(this.c, kgkVar);
                return;
            }
            if (invoke instanceof l2r) {
                l2r l2rVar = (l2r) invoke;
                if (l2rVar.f() == wvo.e || l2rVar.f() == ehv.h || l2rVar.f() == rwd.h) {
                    Z = "MutableState containing " + l2rVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    Z = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                Z = o2g.Z(invoke);
            }
            throw new IllegalArgumentException(Z);
        }
    }

    @Override // defpackage.eun
    public final void b() {
        a();
    }

    @Override // defpackage.eun
    public final void d() {
        joo jooVar = this.f;
        if (jooVar != null) {
            ((lum) jooVar).l0();
        }
    }

    @Override // defpackage.eun
    public final void e() {
        joo jooVar = this.f;
        if (jooVar != null) {
            ((lum) jooVar).l0();
        }
    }
}
