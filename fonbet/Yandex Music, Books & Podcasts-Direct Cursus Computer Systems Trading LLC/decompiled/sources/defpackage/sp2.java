package defpackage;

/* loaded from: classes4.dex */
public final class sp2 implements rzm {
    public final /* synthetic */ int a = 1;
    public final szm b;
    public final szm c;
    public final szm d;
    public final Object e;

    public sp2(j6e j6eVar, rzm rzmVar, rzm rzmVar2, rzm rzmVar3) {
        this.e = j6eVar;
        this.b = rzmVar;
        this.c = rzmVar2;
        this.d = rzmVar3;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                l9i l9iVar = (l9i) this.b.get();
                g0c g0cVar = (g0c) this.c.get();
                hos hosVar = (hos) this.d.get();
                ti4 ti4Var = (ti4) ((szm) this.e).get();
                l9iVar.getClass();
                g0cVar.getClass();
                hosVar.getClass();
                ti4Var.getClass();
                return new o9e(l9iVar, g0cVar, hosVar, ti4Var);
            default:
                j6e j6eVar = (j6e) this.e;
                sdk sdkVar = (sdk) this.b.get();
                hek hekVar = (hek) this.c.get();
                egk egkVar = (egk) this.d.get();
                sdkVar.getClass();
                hekVar.getClass();
                egkVar.getClass();
                return new jek((ehk) j6eVar.a, (xwj) j6eVar.b, sdkVar, hekVar, egkVar);
        }
    }

    public sp2(mvn mvnVar, rzm rzmVar, toe toeVar, rzm rzmVar2, rzm rzmVar3) {
        this.b = rzmVar;
        this.c = toeVar;
        this.d = rzmVar2;
        this.e = rzmVar3;
    }
}
