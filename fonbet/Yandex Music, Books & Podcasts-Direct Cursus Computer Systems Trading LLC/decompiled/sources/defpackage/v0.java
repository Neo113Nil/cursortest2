package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class v0 extends s0 implements Iterable {
    public static final y b = new y(7, v0.class);
    public d0[] a;

    public v0(s0 s0Var) {
        if (s0Var != null) {
            this.a = new d0[]{s0Var};
        } else {
            jj4.j("'element' cannot be null");
            throw null;
        }
    }

    public static v0 E(Object obj) {
        if (obj == null || (obj instanceof v0)) {
            return (v0) obj;
        }
        if (obj instanceof d0) {
            s0 n = ((d0) obj).n();
            if (n instanceof v0) {
                return (v0) n;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (v0) b.c((byte[]) obj);
            } catch (IOException e) {
                kac.l(e.getMessage(), "failed to construct sequence from byte[]: ");
                return null;
            }
        }
        xq0.x("unknown object in getInstance: ".concat(obj.getClass().getName()));
        return null;
    }

    @Override // defpackage.s0
    public s0 A() {
        f67 f67Var = new f67(this.a);
        f67Var.c = -1;
        return f67Var;
    }

    public final z[] B() {
        d0 d0Var;
        int size = size();
        z[] zVarArr = new z[size];
        for (int i = 0; i < size; i++) {
            d0 d0Var2 = this.a[i];
            if (d0Var2 == null || (d0Var2 instanceof z)) {
                d0Var = d0Var2;
            } else {
                d0Var = d0Var2.n();
                if (!(d0Var instanceof z)) {
                    xq0.x("illegal object in getInstance: ".concat(d0Var2.getClass().getName()));
                    return null;
                }
            }
            zVarArr[i] = (z) d0Var;
        }
        return zVarArr;
    }

    public final o0[] D() {
        int size = size();
        o0[] o0VarArr = new o0[size];
        for (int i = 0; i < size; i++) {
            o0VarArr[i] = o0.B(this.a[i]);
        }
        return o0VarArr;
    }

    public d0 F(int i) {
        return this.a[i];
    }

    public Enumeration G() {
        return new u0(this);
    }

    public abstract z H();

    public abstract o0 K();

    public abstract w0 L();

    @Override // defpackage.s0, defpackage.k0
    public int hashCode() {
        int length = this.a.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ this.a[length].n().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new qz0(this.a);
    }

    public int size() {
        return this.a.length;
    }

    @Override // defpackage.s0
    public final boolean t(s0 s0Var) {
        if (s0Var instanceof v0) {
            v0 v0Var = (v0) s0Var;
            int size = size();
            if (v0Var.size() == size) {
                for (int i = 0; i < size; i++) {
                    s0 n = this.a[i].n();
                    s0 n2 = v0Var.a[i].n();
                    if (n == n2 || n.t(n2)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        int size = size();
        if (size == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i = 0;
        while (true) {
            stringBuffer.append(this.a[i]);
            i++;
            if (i >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    @Override // defpackage.s0
    public final boolean v() {
        return true;
    }

    @Override // defpackage.s0
    public s0 z() {
        d07 d07Var = new d07(this.a);
        d07Var.c = -1;
        return d07Var;
    }

    public v0(e0 e0Var) {
        if (e0Var != null) {
            this.a = e0Var.k();
        } else {
            jj4.j("'elementVector' cannot be null");
            throw null;
        }
    }

    public v0() {
        this.a = e0.e;
    }

    public v0(d0[] d0VarArr) {
        this.a = d0VarArr;
    }
}
