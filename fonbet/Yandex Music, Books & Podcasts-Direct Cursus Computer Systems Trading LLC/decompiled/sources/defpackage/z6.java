package defpackage;

import com.yandex.metrica.push.common.CoreConstants;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* loaded from: classes5.dex */
public abstract class z6 implements s4f, eg7, tq5 {
    public final ArrayList a = new ArrayList();
    public boolean b;
    public final x3f c;
    public final String d;
    public final j4f e;

    public z6(x3f x3fVar, String str) {
        this.c = x3fVar;
        this.d = str;
        this.e = x3fVar.a;
    }

    @Override // defpackage.eg7
    public final String A() {
        return T(X());
    }

    @Override // defpackage.eg7
    public final int B(mhp mhpVar) {
        mhpVar.getClass();
        String str = (String) X();
        str.getClass();
        w4f I = I(str);
        String i = mhpVar.i();
        if (I instanceof v6f) {
            return c3x.J(mhpVar, this.c, ((v6f) I).a(), "");
        }
        throw ghh.j("Expected " + ern.a(v6f.class).h() + ", but had " + ern.a(I.getClass()).h() + " as the serialized body of " + i + " at element: " + Z(str), I.toString(), -1);
    }

    @Override // defpackage.eg7
    public boolean C() {
        return !(J() instanceof m5f);
    }

    @Override // defpackage.tq5
    public final boolean D(mhp mhpVar, int i) {
        mhpVar.getClass();
        return K(V(mhpVar, i));
    }

    @Override // defpackage.eg7
    public final byte E() {
        return L(X());
    }

    @Override // defpackage.tq5
    public final double F(mhp mhpVar, int i) {
        mhpVar.getClass();
        return N(V(mhpVar, i));
    }

    @Override // defpackage.tq5
    public final char G(mhp mhpVar, int i) {
        mhpVar.getClass();
        return M(V(mhpVar, i));
    }

    @Override // defpackage.tq5
    public final short H(mhp mhpVar, int i) {
        mhpVar.getClass();
        return S(V(mhpVar, i));
    }

    public abstract w4f I(String str);

    public final w4f J() {
        w4f I;
        String str = (String) CollectionsKt.Z(this.a);
        return (str == null || (I = I(str)) == null) ? W() : I;
    }

    public final boolean K(Object obj) {
        String str = (String) obj;
        str.getClass();
        w4f I = I(str);
        if (!(I instanceof v6f)) {
            throw ghh.j("Expected " + ern.a(v6f.class).h() + ", but had " + ern.a(I.getClass()).h() + " as the serialized body of boolean at element: " + Z(str), I.toString(), -1);
        }
        v6f v6fVar = (v6f) I;
        try {
            ome omeVar = x4f.a;
            Boolean b = pkr.b(v6fVar.a());
            if (b != null) {
                return b.booleanValue();
            }
            a0(v6fVar, "boolean", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            a0(v6fVar, "boolean", str);
            throw null;
        }
    }

    public final byte L(Object obj) {
        String str = (String) obj;
        str.getClass();
        w4f I = I(str);
        if (!(I instanceof v6f)) {
            throw ghh.j("Expected " + ern.a(v6f.class).h() + ", but had " + ern.a(I.getClass()).h() + " as the serialized body of byte at element: " + Z(str), I.toString(), -1);
        }
        v6f v6fVar = (v6f) I;
        try {
            long i = x4f.i(v6fVar);
            Byte valueOf = (-128 > i || i > 127) ? null : Byte.valueOf((byte) i);
            if (valueOf != null) {
                return valueOf.byteValue();
            }
            a0(v6fVar, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            a0(v6fVar, "byte", str);
            throw null;
        }
    }

    public final char M(Object obj) {
        String str = (String) obj;
        str.getClass();
        w4f I = I(str);
        if (!(I instanceof v6f)) {
            throw ghh.j("Expected " + ern.a(v6f.class).h() + ", but had " + ern.a(I.getClass()).h() + " as the serialized body of char at element: " + Z(str), I.toString(), -1);
        }
        v6f v6fVar = (v6f) I;
        try {
            String a = v6fVar.a();
            a.getClass();
            int length = a.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return a.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            a0(v6fVar, "char", str);
            throw null;
        }
    }

    public final double N(Object obj) {
        String str = (String) obj;
        str.getClass();
        w4f I = I(str);
        if (!(I instanceof v6f)) {
            throw ghh.j("Expected " + ern.a(v6f.class).h() + ", but had " + ern.a(I.getClass()).h() + " as the serialized body of double at element: " + Z(str), I.toString(), -1);
        }
        v6f v6fVar = (v6f) I;
        try {
            ome omeVar = x4f.a;
            double parseDouble = Double.parseDouble(v6fVar.a());
            j4f j4fVar = this.c.a;
            if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            Double valueOf = Double.valueOf(parseDouble);
            String obj2 = J().toString();
            obj2.getClass();
            throw ghh.i(-1, ghh.U(valueOf, str, obj2));
        } catch (IllegalArgumentException unused) {
            a0(v6fVar, "double", str);
            throw null;
        }
    }

    public final float O(Object obj) {
        String str = (String) obj;
        str.getClass();
        w4f I = I(str);
        if (!(I instanceof v6f)) {
            throw ghh.j("Expected " + ern.a(v6f.class).h() + ", but had " + ern.a(I.getClass()).h() + " as the serialized body of float at element: " + Z(str), I.toString(), -1);
        }
        v6f v6fVar = (v6f) I;
        try {
            ome omeVar = x4f.a;
            float parseFloat = Float.parseFloat(v6fVar.a());
            j4f j4fVar = this.c.a;
            if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            Float valueOf = Float.valueOf(parseFloat);
            String obj2 = J().toString();
            obj2.getClass();
            throw ghh.i(-1, ghh.U(valueOf, str, obj2));
        } catch (IllegalArgumentException unused) {
            a0(v6fVar, "float", str);
            throw null;
        }
    }

    public final eg7 P(Object obj, mhp mhpVar) {
        String str = (String) obj;
        str.getClass();
        mhpVar.getClass();
        if (!yjr.a(mhpVar)) {
            this.a.add(str);
            return this;
        }
        w4f I = I(str);
        String i = mhpVar.i();
        if (I instanceof v6f) {
            String a = ((v6f) I).a();
            x3f x3fVar = this.c;
            x3fVar.getClass();
            a.getClass();
            return new t4f(new kkr(a), x3fVar);
        }
        throw ghh.j("Expected " + ern.a(v6f.class).h() + ", but had " + ern.a(I.getClass()).h() + " as the serialized body of " + i + " at element: " + Z(str), I.toString(), -1);
    }

    public final int Q(Object obj) {
        String str = (String) obj;
        str.getClass();
        w4f I = I(str);
        if (!(I instanceof v6f)) {
            throw ghh.j("Expected " + ern.a(v6f.class).h() + ", but had " + ern.a(I.getClass()).h() + " as the serialized body of int at element: " + Z(str), I.toString(), -1);
        }
        v6f v6fVar = (v6f) I;
        try {
            long i = x4f.i(v6fVar);
            Integer valueOf = (-2147483648L > i || i > 2147483647L) ? null : Integer.valueOf((int) i);
            if (valueOf != null) {
                return valueOf.intValue();
            }
            a0(v6fVar, "int", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            a0(v6fVar, "int", str);
            throw null;
        }
    }

    public final long R(Object obj) {
        String str = (String) obj;
        str.getClass();
        w4f I = I(str);
        if (I instanceof v6f) {
            v6f v6fVar = (v6f) I;
            try {
                return x4f.i(v6fVar);
            } catch (IllegalArgumentException unused) {
                a0(v6fVar, "long", str);
                throw null;
            }
        }
        throw ghh.j("Expected " + ern.a(v6f.class).h() + ", but had " + ern.a(I.getClass()).h() + " as the serialized body of long at element: " + Z(str), I.toString(), -1);
    }

    public final short S(Object obj) {
        String str = (String) obj;
        str.getClass();
        w4f I = I(str);
        if (!(I instanceof v6f)) {
            throw ghh.j("Expected " + ern.a(v6f.class).h() + ", but had " + ern.a(I.getClass()).h() + " as the serialized body of short at element: " + Z(str), I.toString(), -1);
        }
        v6f v6fVar = (v6f) I;
        try {
            long i = x4f.i(v6fVar);
            Short valueOf = (-32768 > i || i > 32767) ? null : Short.valueOf((short) i);
            if (valueOf != null) {
                return valueOf.shortValue();
            }
            a0(v6fVar, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            a0(v6fVar, "short", str);
            throw null;
        }
    }

    public final String T(Object obj) {
        String str = (String) obj;
        str.getClass();
        w4f I = I(str);
        if (!(I instanceof v6f)) {
            throw ghh.j("Expected " + ern.a(v6f.class).h() + ", but had " + ern.a(I.getClass()).h() + " as the serialized body of string at element: " + Z(str), I.toString(), -1);
        }
        v6f v6fVar = (v6f) I;
        if (!(v6fVar instanceof j5f)) {
            StringBuilder u = ouj.u("Expected string value for a non-null key '", str, "', got null literal instead at element: ");
            u.append(Z(str));
            throw ghh.j(u.toString(), J().toString(), -1);
        }
        j5f j5fVar = (j5f) v6fVar;
        if (j5fVar.a || this.c.a.c) {
            return j5fVar.c;
        }
        StringBuilder u2 = ouj.u("String literal for key '", str, "' should be quoted at element: ");
        u2.append(Z(str));
        u2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw ghh.j(u2.toString(), J().toString(), -1);
    }

    public String U(mhp mhpVar, int i) {
        mhpVar.getClass();
        return mhpVar.f(i);
    }

    public final String V(mhp mhpVar, int i) {
        mhpVar.getClass();
        String U = U(mhpVar, i);
        U.getClass();
        return U;
    }

    public abstract w4f W();

    public final Object X() {
        ArrayList arrayList = this.a;
        Object remove = arrayList.remove(u75.g(arrayList));
        this.b = true;
        return remove;
    }

    public final String Y() {
        ArrayList arrayList = this.a;
        return arrayList.isEmpty() ? "$" : CollectionsKt.X(arrayList, ".", "$.", null, null, 60);
    }

    public final String Z(String str) {
        str.getClass();
        return Y() + '.' + str;
    }

    @Override // defpackage.eg7, defpackage.tq5
    public final uhp a() {
        return this.c.b;
    }

    public final void a0(v6f v6fVar, String str, String str2) {
        throw ghh.j("Failed to parse literal '" + v6fVar + "' as " + (c.v(str, CoreConstants.PushMessage.SERVICE_TYPE, false) ? "an " : "a ").concat(str) + " value at element: " + Z(str2), J().toString(), -1);
    }

    public void b(mhp mhpVar) {
        mhpVar.getClass();
    }

    @Override // defpackage.eg7
    public tq5 c(mhp mhpVar) {
        mhpVar.getClass();
        w4f J = J();
        ivf a = mhpVar.a();
        boolean d = Intrinsics.d(a, emr.c);
        x3f x3fVar = this.c;
        if (d || (a instanceof igm)) {
            String i = mhpVar.i();
            if (J instanceof c4f) {
                return new g7f(x3fVar, (c4f) J);
            }
            throw ghh.j("Expected " + ern.a(c4f.class).h() + ", but had " + ern.a(J.getClass()).h() + " as the serialized body of " + i + " at element: " + Y(), J.toString(), -1);
        }
        if (!Intrinsics.d(a, emr.d)) {
            String i2 = mhpVar.i();
            if (J instanceof q5f) {
                return new f7f(x3fVar, (q5f) J, this.d, 8);
            }
            throw ghh.j("Expected " + ern.a(q5f.class).h() + ", but had " + ern.a(J.getClass()).h() + " as the serialized body of " + i2 + " at element: " + Y(), J.toString(), -1);
        }
        mhp O = szf.O(mhpVar.h(0), x3fVar.b);
        ivf a2 = O.a();
        if ((a2 instanceof csm) || Intrinsics.d(a2, thp.b)) {
            String i3 = mhpVar.i();
            if (J instanceof q5f) {
                return new h7f(x3fVar, (q5f) J);
            }
            throw ghh.j("Expected " + ern.a(q5f.class).h() + ", but had " + ern.a(J.getClass()).h() + " as the serialized body of " + i3 + " at element: " + Y(), J.toString(), -1);
        }
        if (!x3fVar.a.d) {
            throw ghh.h(O);
        }
        String i4 = mhpVar.i();
        if (J instanceof c4f) {
            return new g7f(x3fVar, (c4f) J);
        }
        throw ghh.j("Expected " + ern.a(c4f.class).h() + ", but had " + ern.a(J.getClass()).h() + " as the serialized body of " + i4 + " at element: " + Y(), J.toString(), -1);
    }

    @Override // defpackage.s4f
    public final x3f d() {
        return this.c;
    }

    @Override // defpackage.eg7
    public final Object e(t9f t9fVar) {
        t9fVar.getClass();
        if (!(t9fVar instanceof p8)) {
            return t9fVar.deserialize(this);
        }
        x3f x3fVar = this.c;
        j4f j4fVar = x3fVar.a;
        p8 p8Var = (p8) t9fVar;
        String p = wxf.p(x3fVar, p8Var.getDescriptor());
        w4f J = J();
        String i = p8Var.getDescriptor().i();
        if (!(J instanceof q5f)) {
            throw ghh.j("Expected " + ern.a(q5f.class).h() + ", but had " + ern.a(J.getClass()).h() + " as the serialized body of " + i + " at element: " + Y(), J.toString(), -1);
        }
        q5f q5fVar = (q5f) J;
        w4f w4fVar = (w4f) q5fVar.get(p);
        String str = null;
        if (w4fVar != null) {
            v6f g = x4f.g(w4fVar);
            if (!(g instanceof m5f)) {
                str = g.a();
            }
        }
        try {
            return s7g.z(x3fVar, p, q5fVar, hyf.C((p8) t9fVar, this, str));
        } catch (zhp e) {
            String message = e.getMessage();
            message.getClass();
            throw ghh.j(message, q5fVar.toString(), -1);
        }
    }

    @Override // defpackage.s4f
    public final w4f f() {
        return J();
    }

    @Override // defpackage.tq5
    public final String g(mhp mhpVar, int i) {
        mhpVar.getClass();
        return T(V(mhpVar, i));
    }

    @Override // defpackage.eg7
    public final int h() {
        return Q(X());
    }

    @Override // defpackage.eg7
    public final Void i() {
        return null;
    }

    @Override // defpackage.eg7
    public final eg7 j(mhp mhpVar) {
        mhpVar.getClass();
        if (CollectionsKt.Z(this.a) != null) {
            return P(X(), mhpVar);
        }
        return new w6f(this.c, W(), this.d).j(mhpVar);
    }

    @Override // defpackage.tq5
    public final int k(mhp mhpVar, int i) {
        mhpVar.getClass();
        return Q(V(mhpVar, i));
    }

    @Override // defpackage.eg7
    public final long l() {
        return R(X());
    }

    @Override // defpackage.tq5
    public final boolean m() {
        return false;
    }

    @Override // defpackage.tq5
    public final Object n(mhp mhpVar, int i, t9f t9fVar, Object obj) {
        mhpVar.getClass();
        t9fVar.getClass();
        this.a.add(V(mhpVar, i));
        Object e = (t9fVar.getDescriptor().c() || C()) ? e(t9fVar) : null;
        if (!this.b) {
            X();
        }
        this.b = false;
        return e;
    }

    @Override // defpackage.eg7
    public final short o() {
        return S(X());
    }

    @Override // defpackage.eg7
    public final float p() {
        return O(X());
    }

    @Override // defpackage.tq5
    public final long q(mhp mhpVar, int i) {
        mhpVar.getClass();
        return R(V(mhpVar, i));
    }

    @Override // defpackage.eg7
    public final double r() {
        return N(X());
    }

    @Override // defpackage.tq5
    public final int s(mhp mhpVar) {
        mhpVar.getClass();
        return -1;
    }

    @Override // defpackage.eg7
    public final boolean t() {
        return K(X());
    }

    @Override // defpackage.eg7
    public final char u() {
        return M(X());
    }

    @Override // defpackage.tq5
    public final float v(mhp mhpVar, int i) {
        mhpVar.getClass();
        return O(V(mhpVar, i));
    }

    @Override // defpackage.tq5
    public final eg7 x(mhp mhpVar, int i) {
        mhpVar.getClass();
        return P(V(mhpVar, i), mhpVar.h(i));
    }

    @Override // defpackage.tq5
    public final byte y(mhp mhpVar, int i) {
        mhpVar.getClass();
        return L(V(mhpVar, i));
    }

    @Override // defpackage.tq5
    public final Object z(mhp mhpVar, int i, t9f t9fVar, Object obj) {
        mhpVar.getClass();
        t9fVar.getClass();
        this.a.add(V(mhpVar, i));
        t9fVar.getClass();
        Object e = e(t9fVar);
        if (!this.b) {
            X();
        }
        this.b = false;
        return e;
    }
}
