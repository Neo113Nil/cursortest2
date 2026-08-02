package defpackage;

/* loaded from: classes4.dex */
public final class d27 implements gfu {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public d27(z2j z2jVar, hek hekVar, j3j j3jVar, osh oshVar) {
        this.a = 2;
        hekVar.getClass();
        j3jVar.getClass();
        oshVar.getClass();
        this.d = z2jVar;
        this.b = hekVar;
        this.e = j3jVar;
        this.c = oshVar;
    }

    @Override // defpackage.gfu
    public final bfu b(Class cls) {
        switch (this.a) {
            case 0:
                if (cls.equals(c27.class)) {
                    return new c27((dn9) this.d, (g0c) this.b, (o6c) this.e, (sdk) this.c);
                }
                xq0.q("Unknown view model");
                return null;
            case 1:
                return new h37((rn5) this.d, (g0c) this.b, (tc1) this.e, (sdk) this.c);
            default:
                if (cls.equals(e3j.class)) {
                    return new e3j((z2j) this.d, (hek) this.b, (j3j) this.e, (osh) this.c);
                }
                xq0.q("Unknown view model");
                return null;
        }
    }

    public /* synthetic */ d27(Object obj, g0c g0cVar, Object obj2, sdk sdkVar, int i) {
        this.a = i;
        this.d = obj;
        this.b = g0cVar;
        this.e = obj2;
        this.c = sdkVar;
    }
}
