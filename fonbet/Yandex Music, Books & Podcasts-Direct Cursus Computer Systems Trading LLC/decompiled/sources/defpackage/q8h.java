package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class q8h {
    public final o8h a;
    public final Map b;
    public final Map c;
    public final mao d;
    public final Object e;
    public final Map f;

    public q8h(o8h o8hVar, HashMap hashMap, HashMap hashMap2, mao maoVar, Object obj, Map map) {
        this.a = o8hVar;
        this.b = vz1.y(hashMap);
        this.c = vz1.y(hashMap2);
        this.d = maoVar;
        this.e = obj;
        this.f = map != null ? Collections.unmodifiableMap(new HashMap(map)) : null;
    }

    public static q8h a(Map map, boolean z, int i, int i2, Object obj) {
        mao maoVar;
        Map V;
        mao maoVar2;
        if (z) {
            if (map == null || (V = qwp.V("retryThrottling", map)) == null) {
                maoVar2 = null;
            } else {
                float floatValue = qwp.T("maxTokens", V).floatValue();
                float floatValue2 = qwp.T("tokenRatio", V).floatValue();
                o2g.U("maxToken should be greater than zero", floatValue > 0.0f);
                o2g.U("tokenRatio should be greater than zero", floatValue2 > 0.0f);
                maoVar2 = new mao(floatValue, floatValue2);
            }
            maoVar = maoVar2;
        } else {
            maoVar = null;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Map V2 = map == null ? null : qwp.V("healthCheckConfig", map);
        List<Map> R = qwp.R("methodConfig", map);
        if (R == null) {
            R = null;
        } else {
            qwp.F(R);
        }
        if (R == null) {
            return new q8h(null, hashMap, hashMap2, maoVar, obj, V2);
        }
        o8h o8hVar = null;
        for (Map map2 : R) {
            o8h o8hVar2 = new o8h(map2, z, i, i2);
            List<Map> R2 = qwp.R("name", map2);
            if (R2 == null) {
                R2 = null;
            } else {
                qwp.F(R2);
            }
            if (R2 != null && !R2.isEmpty()) {
                for (Map map3 : R2) {
                    String X = qwp.X("service", map3);
                    String X2 = qwp.X("method", map3);
                    if (ywf.G(X)) {
                        o2g.H(X2, "missing service name for method %s", ywf.G(X2));
                        o2g.H(map, "Duplicate default method config in service config %s", o8hVar == null);
                        o8hVar = o8hVar2;
                    } else if (ywf.G(X2)) {
                        o2g.H(X, "Duplicate service %s", !hashMap2.containsKey(X));
                        hashMap2.put(X, o8hVar2);
                    } else {
                        String a = k3i.a(X, X2);
                        o2g.H(a, "Duplicate method name %s", !hashMap.containsKey(a));
                        hashMap.put(a, o8hVar2);
                    }
                }
            }
        }
        return new q8h(o8hVar, hashMap, hashMap2, maoVar, obj, V2);
    }

    public final p8h b() {
        if (this.c.isEmpty() && this.b.isEmpty() && this.a == null) {
            return null;
        }
        return new p8h(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q8h.class == obj.getClass()) {
            q8h q8hVar = (q8h) obj;
            if (hdg.S(this.a, q8hVar.a) && hdg.S(this.b, q8hVar.b) && hdg.S(this.c, q8hVar.c) && hdg.S(this.d, q8hVar.d) && hdg.S(this.e, q8hVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.q(this.a, "defaultMethodConfig");
        Y.q(this.b, "serviceMethodMap");
        Y.q(this.c, "serviceMap");
        Y.q(this.d, "retryThrottling");
        Y.q(this.e, "loadBalancingConfig");
        return Y.toString();
    }
}
