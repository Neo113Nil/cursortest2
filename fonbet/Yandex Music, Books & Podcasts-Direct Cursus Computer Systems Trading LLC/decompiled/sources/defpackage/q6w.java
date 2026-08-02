package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

/* loaded from: classes5.dex */
public final class q6w extends k0 implements c0 {
    public static final zh2 f = zh2.C;
    public boolean a;
    public int b;
    public jf0 c;
    public final nen[] d;
    public final d07 e;

    public q6w(v0 v0Var) {
        nen nenVar;
        w0 w0Var;
        this.c = f;
        this.d = new nen[v0Var.size()];
        Enumeration G = v0Var.G();
        boolean z = true;
        int i = 0;
        while (G.hasMoreElements()) {
            Object nextElement = G.nextElement();
            if (nextElement instanceof nen) {
                nenVar = (nen) nextElement;
            } else if (nextElement != null) {
                if (nextElement instanceof w0) {
                    w0Var = (w0) nextElement;
                } else if (nextElement instanceof d0) {
                    s0 n = ((d0) nextElement).n();
                    if (!(n instanceof w0)) {
                        xq0.x("unknown object in getInstance: ".concat(nextElement.getClass().getName()));
                        throw null;
                    }
                    w0Var = (w0) n;
                } else {
                    if (!(nextElement instanceof byte[])) {
                        xq0.x("unknown object in getInstance: ".concat(nextElement.getClass().getName()));
                        throw null;
                    }
                    try {
                        s0 y = s0.y((byte[]) nextElement);
                        if (!w0.class.isInstance(y)) {
                            throw new IllegalStateException("unexpected object: ".concat(y.getClass().getName()));
                        }
                        w0Var = (w0) y;
                    } catch (IOException e) {
                        kac.l(e.getMessage(), "failed to construct set from byte[]: ");
                        throw null;
                    }
                }
                nenVar = new nen();
                nenVar.a = w0Var;
            } else {
                nenVar = null;
            }
            z &= nenVar == nextElement;
            this.d[i] = nenVar;
            i++;
        }
        if (z) {
            this.e = (d07) v0Var.z();
        } else {
            this.e = new d07(this.d);
        }
    }

    public static q6w t(Object obj) {
        if (obj instanceof q6w) {
            return (q6w) obj;
        }
        if (obj != null) {
            return new q6w(v0.E(obj));
        }
        return null;
    }

    @Override // defpackage.k0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q6w) && !(obj instanceof v0)) {
            return false;
        }
        if (this.e.x(((d0) obj).n())) {
            return true;
        }
        try {
            jf0 jf0Var = this.c;
            q6w q6wVar = new q6w(v0.E(((d0) obj).n()));
            jf0Var.getClass();
            return jf0.w(this, q6wVar);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // defpackage.k0
    public final int hashCode() {
        if (this.a) {
            return this.b;
        }
        this.a = true;
        this.c.getClass();
        nen[] nenVarArr = (nen[]) this.d.clone();
        int i = 0;
        for (int i2 = 0; i2 != nenVarArr.length; i2++) {
            nen nenVar = nenVarArr[i2];
            if (nenVar.a.a.length > 1) {
                vu1[] u = nenVar.u();
                for (int i3 = 0; i3 != u.length; i3++) {
                    i = (i ^ u[i3].a.a.hashCode()) ^ xp3.r(u[i3].b).hashCode();
                }
            } else {
                i = (i ^ nenVar.t().a.a.hashCode()) ^ xp3.r(nenVarArr[i2].t().b).hashCode();
            }
        }
        this.b = i;
        return i;
    }

    @Override // defpackage.d0
    public final s0 n() {
        return this.e;
    }

    public final String toString() {
        zh2 zh2Var = (zh2) this.c;
        zh2Var.getClass();
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        for (nen nenVar : (nen[]) this.d.clone()) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append(',');
            }
            Hashtable hashtable = zh2Var.r;
            if (nenVar.a.a.length > 1) {
                vu1[] u = nenVar.u();
                boolean z2 = true;
                for (int i = 0; i != u.length; i++) {
                    if (z2) {
                        z2 = false;
                    } else {
                        stringBuffer.append('+');
                    }
                    xp3.q(stringBuffer, u[i], hashtable);
                }
            } else if (nenVar.t() != null) {
                xp3.q(stringBuffer, nenVar.t(), hashtable);
            }
        }
        return stringBuffer.toString();
    }

    public q6w(jf0 jf0Var, nen[] nenVarArr) {
        this.c = jf0Var;
        nen[] nenVarArr2 = (nen[]) nenVarArr.clone();
        this.d = nenVarArr2;
        this.e = new d07(nenVarArr2);
    }
}
