package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class gci {
    public static final HashMap m = uah.d(new Pair("embedding.weight", "embed.weight"), new Pair("dense1.weight", "fc1.weight"), new Pair("dense2.weight", "fc2.weight"), new Pair("dense3.weight", "fc3.weight"), new Pair("dense1.bias", "fc1.bias"), new Pair("dense2.bias", "fc2.bias"), new Pair("dense3.bias", "fc3.bias"));
    public final n4h a;
    public final n4h b;
    public final n4h c;
    public final n4h d;
    public final n4h e;
    public final n4h f;
    public final n4h g;
    public final n4h h;
    public final n4h i;
    public final n4h j;
    public final n4h k;
    public final HashMap l;

    public gci(HashMap hashMap) {
        Object obj = hashMap.get("embed.weight");
        if (obj == null) {
            xq0.q("Required value was null.");
            throw null;
        }
        this.a = (n4h) obj;
        Object obj2 = hashMap.get("convs.0.weight");
        if (obj2 == null) {
            xq0.q("Required value was null.");
            throw null;
        }
        this.b = quj.m0((n4h) obj2);
        Object obj3 = hashMap.get("convs.1.weight");
        if (obj3 == null) {
            xq0.q("Required value was null.");
            throw null;
        }
        this.c = quj.m0((n4h) obj3);
        Object obj4 = hashMap.get("convs.2.weight");
        if (obj4 == null) {
            xq0.q("Required value was null.");
            throw null;
        }
        this.d = quj.m0((n4h) obj4);
        Object obj5 = hashMap.get("convs.0.bias");
        if (obj5 == null) {
            xq0.q("Required value was null.");
            throw null;
        }
        this.e = (n4h) obj5;
        Object obj6 = hashMap.get("convs.1.bias");
        if (obj6 == null) {
            xq0.q("Required value was null.");
            throw null;
        }
        this.f = (n4h) obj6;
        Object obj7 = hashMap.get("convs.2.bias");
        if (obj7 == null) {
            xq0.q("Required value was null.");
            throw null;
        }
        this.g = (n4h) obj7;
        Object obj8 = hashMap.get("fc1.weight");
        if (obj8 == null) {
            xq0.q("Required value was null.");
            throw null;
        }
        this.h = quj.l0((n4h) obj8);
        Object obj9 = hashMap.get("fc2.weight");
        if (obj9 == null) {
            xq0.q("Required value was null.");
            throw null;
        }
        this.i = quj.l0((n4h) obj9);
        Object obj10 = hashMap.get("fc1.bias");
        if (obj10 == null) {
            xq0.q("Required value was null.");
            throw null;
        }
        this.j = (n4h) obj10;
        Object obj11 = hashMap.get("fc2.bias");
        if (obj11 == null) {
            xq0.q("Required value was null.");
            throw null;
        }
        this.k = (n4h) obj11;
        this.l = new HashMap();
        for (String str : xz0.Y(new String[]{hrg.a(1), hrg.a(2)})) {
            String n = ouj.n(str, ".weight");
            String n2 = ouj.n(str, ".bias");
            n4h n4hVar = (n4h) hashMap.get(n);
            n4h n4hVar2 = (n4h) hashMap.get(n2);
            if (n4hVar != null) {
                this.l.put(n, quj.l0(n4hVar));
            }
            if (n4hVar2 != null) {
                this.l.put(n2, n4hVar2);
            }
        }
    }

    public final n4h a(n4h n4hVar, String[] strArr, String str) {
        HashMap hashMap = this.l;
        if (!bp6.a.contains(this)) {
            try {
                n4h G = quj.G(quj.J(strArr, this.a), this.b);
                quj.A(G, this.e);
                quj.j0(G);
                n4h G2 = quj.G(G, this.c);
                quj.A(G2, this.f);
                quj.j0(G2);
                n4h a0 = quj.a0(G2, 2);
                n4h G3 = quj.G(a0, this.d);
                quj.A(G3, this.g);
                quj.j0(G3);
                n4h a02 = quj.a0(G, G.c[1]);
                n4h a03 = quj.a0(a0, a0.c[1]);
                n4h a04 = quj.a0(G3, G3.c[1]);
                quj.K(a02);
                quj.K(a03);
                quj.K(a04);
                n4h I = quj.I(quj.F(new n4h[]{a02, a03, a04, n4hVar}), this.h, this.j);
                quj.j0(I);
                n4h I2 = quj.I(I, this.i, this.k);
                quj.j0(I2);
                n4h n4hVar2 = (n4h) hashMap.get(str.concat(".weight"));
                n4h n4hVar3 = (n4h) hashMap.get(str.concat(".bias"));
                if (n4hVar2 != null && n4hVar3 != null) {
                    n4h I3 = quj.I(I2, n4hVar2, n4hVar3);
                    quj.k0(I3);
                    return I3;
                }
            } catch (Throwable th) {
                bp6.a(this, th);
                return null;
            }
        }
        return null;
    }
}
