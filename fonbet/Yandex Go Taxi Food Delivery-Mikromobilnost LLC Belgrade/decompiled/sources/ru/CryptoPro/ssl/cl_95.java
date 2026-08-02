package ru.CryptoPro.ssl;

import java.util.Enumeration;
import java.util.Map;
import java.util.Vector;
import ru.CryptoPro.ssl.util.Cache;

/* loaded from: classes4.dex */
final class cl_95 implements Cache.CacheVisitor {
    public Vector a = null;
    public final /* synthetic */ SSLSessionContextImpl b;

    public cl_95(SSLSessionContextImpl sSLSessionContextImpl) {
        this.b = sSLSessionContextImpl;
    }

    public Enumeration a() {
        Vector vector = this.a;
        return vector != null ? vector.elements() : new Vector().elements();
    }

    @Override // ru.CryptoPro.ssl.util.Cache.CacheVisitor
    public void visit(Map map) {
        this.a = new Vector(map.size());
        for (cl_106 cl_106Var : map.keySet()) {
            SSLSessionImpl sSLSessionImpl = (SSLSessionImpl) map.get(cl_106Var);
            if (sSLSessionImpl != null && !sSLSessionImpl.a(this.b.d)) {
                this.a.addElement(cl_106Var.b());
            }
        }
    }
}
