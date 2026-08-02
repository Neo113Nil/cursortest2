package defpackage;

/* loaded from: classes.dex */
public final class s2m0 implements m2m0 {
    public final /* synthetic */ wls a;
    public final /* synthetic */ tls b;

    public s2m0(wls wlsVar, tls tlsVar) {
        this.a = wlsVar;
        this.b = tlsVar;
    }

    @Override // defpackage.m2m0
    public final Object a(Object obj) {
        return this.b.invoke(obj);
    }

    @Override // defpackage.m2m0
    public final Object b(g1m0 g1m0Var, Object obj) {
        return this.a.invoke(g1m0Var, obj);
    }
}
