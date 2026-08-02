package defpackage;

import com.connectsdk.service.airplay.PListParser;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class wjr extends wdp implements s4f {
    public final x3f k;
    public final j6w l;
    public final y6 m;
    public final uhp n;
    public int o;
    public fd p;
    public final j4f q;
    public final y4f r;

    public wjr(x3f x3fVar, j6w j6wVar, y6 y6Var, mhp mhpVar, fd fdVar) {
        mhpVar.getClass();
        this.k = x3fVar;
        this.l = j6wVar;
        this.m = y6Var;
        this.n = x3fVar.b;
        this.o = -1;
        this.p = fdVar;
        j4f j4fVar = x3fVar.a;
        this.q = j4fVar;
        this.r = j4fVar.e ? null : new y4f(mhpVar);
    }

    @Override // defpackage.wdp, defpackage.eg7
    public final String A() {
        boolean z = this.q.c;
        y6 y6Var = this.m;
        return z ? y6Var.m() : y6Var.j();
    }

    @Override // defpackage.wdp, defpackage.eg7
    public final int B(mhp mhpVar) {
        mhpVar.getClass();
        return c3x.J(mhpVar, this.k, A(), " at path ".concat(((x0) this.m.c).E()));
    }

    @Override // defpackage.wdp, defpackage.eg7
    public final boolean C() {
        y4f y4fVar = this.r;
        return ((y4fVar != null ? y4fVar.b : false) || this.m.F(true)) ? false : true;
    }

    @Override // defpackage.wdp, defpackage.eg7
    public final byte E() {
        y6 y6Var = this.m;
        long i = y6Var.i();
        byte b = (byte) i;
        if (i == b) {
            return b;
        }
        y6.q(y6Var, "Failed to parse byte for input '" + i + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.eg7, defpackage.tq5
    public final uhp a() {
        return this.n;
    }

    @Override // defpackage.wdp, defpackage.tq5
    public final void b(mhp mhpVar) {
        mhpVar.getClass();
        if (mhpVar.e() == 0 && c3x.K(this.k, mhpVar)) {
            while (w(mhpVar) != -1) {
            }
        }
        y6 y6Var = this.m;
        if (y6Var.E()) {
            ghh.y(y6Var, "");
            throw null;
        }
        y6Var.h(this.l.b);
        x0 x0Var = (x0) y6Var.c;
        int i = x0Var.b;
        int[] iArr = (int[]) x0Var.d;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            x0Var.b = i - 1;
        }
        int i2 = x0Var.b;
        if (i2 != -1) {
            x0Var.b = i2 - 1;
        }
    }

    @Override // defpackage.wdp, defpackage.eg7
    public final tq5 c(mhp mhpVar) {
        mhpVar.getClass();
        x3f x3fVar = this.k;
        j6w t0 = szf.t0(x3fVar, mhpVar);
        y6 y6Var = this.m;
        x0 x0Var = (x0) y6Var.c;
        int i = x0Var.b + 1;
        x0Var.b = i;
        if (i == ((Object[]) x0Var.c).length) {
            x0Var.a0();
        }
        ((Object[]) x0Var.c)[i] = mhpVar;
        y6Var.h(t0.a);
        if (y6Var.x() != 4) {
            int ordinal = t0.ordinal();
            return (ordinal == 1 || ordinal == 2 || ordinal == 3) ? new wjr(x3fVar, t0, y6Var, mhpVar, this.p) : (this.l == t0 && x3fVar.a.e) ? this : new wjr(x3fVar, t0, y6Var, mhpVar, this.p);
        }
        y6.q(y6Var, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // defpackage.s4f
    public final x3f d() {
        return this.k;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0122  */
    @Override // defpackage.wdp, defpackage.eg7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(t9f t9fVar) {
        String message;
        x3f x3fVar = this.k;
        y6 y6Var = this.m;
        x0 x0Var = (x0) y6Var.c;
        t9fVar.getClass();
        try {
        } catch (z5i e) {
            message = e.getMessage();
            message.getClass();
            if (!StringsKt.M(message, "at path", false)) {
            }
        }
        if (!(t9fVar instanceof p8)) {
            return t9fVar.deserialize(this);
        }
        String p = wxf.p(x3fVar, ((p8) t9fVar).getDescriptor());
        String w = y6Var.w(p, this.q.c);
        String str = null;
        if (w != null) {
            try {
                t9f C = hyf.C((p8) t9fVar, this, w);
                fd fdVar = new fd();
                fdVar.a = p;
                this.p = fdVar;
                return C.deserialize(this);
            } catch (zhp e2) {
                String message2 = e2.getMessage();
                message2.getClass();
                String a0 = StringsKt.a0(StringsKt.m0('\n', message2, message2), ".");
                String message3 = e2.getMessage();
                message3.getClass();
                String str2 = "";
                int S = StringsKt.S(message3, '\n', 0, 6);
                if (S != -1) {
                    str2 = message3.substring(S + 1, message3.length());
                }
                y6.q(y6Var, a0, 0, str2, 2);
                throw null;
            }
        }
        String p2 = wxf.p(x3fVar, ((p8) t9fVar).getDescriptor());
        w4f f = f();
        String i = ((p8) t9fVar).getDescriptor().i();
        if (!(f instanceof q5f)) {
            throw ghh.j("Expected " + ern.a(q5f.class).h() + ", but had " + ern.a(f.getClass()).h() + " as the serialized body of " + i + " at element: " + x0Var.E(), f.toString(), -1);
        }
        q5f q5fVar = (q5f) f;
        w4f w4fVar = (w4f) q5fVar.get(p2);
        if (w4fVar != null) {
            v6f g = x4f.g(w4fVar);
            if (!(g instanceof m5f)) {
                str = g.a();
            }
        }
        try {
            return s7g.z(x3fVar, p2, q5fVar, hyf.C((p8) t9fVar, this, str));
        } catch (zhp e3) {
            String message4 = e3.getMessage();
            message4.getClass();
            throw ghh.j(message4, q5fVar.toString(), -1);
        }
        message = e.getMessage();
        message.getClass();
        if (!StringsKt.M(message, "at path", false)) {
            throw e;
        }
        throw new z5i(e.a, e.getMessage() + " at path: " + x0Var.E(), e);
    }

    @Override // defpackage.s4f
    public final w4f f() {
        return new e0(this.k.a, this.m).h();
    }

    @Override // defpackage.wdp, defpackage.eg7
    public final int h() {
        y6 y6Var = this.m;
        long i = y6Var.i();
        int i2 = (int) i;
        if (i == i2) {
            return i2;
        }
        y6.q(y6Var, "Failed to parse int for input '" + i + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.wdp, defpackage.eg7
    public final Void i() {
        return null;
    }

    @Override // defpackage.wdp, defpackage.eg7
    public final eg7 j(mhp mhpVar) {
        mhpVar.getClass();
        return yjr.a(mhpVar) ? new t4f(this.m, this.k) : this;
    }

    @Override // defpackage.wdp, defpackage.eg7
    public final long l() {
        return this.m.i();
    }

    @Override // defpackage.wdp, defpackage.eg7
    public final short o() {
        y6 y6Var = this.m;
        long i = y6Var.i();
        short s = (short) i;
        if (i == s) {
            return s;
        }
        y6.q(y6Var, "Failed to parse short for input '" + i + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.wdp, defpackage.eg7
    public final float p() {
        y6 y6Var = this.m;
        String l = y6Var.l();
        try {
            float parseFloat = Float.parseFloat(l);
            if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            ghh.K(y6Var, Float.valueOf(parseFloat));
            throw null;
        } catch (IllegalArgumentException unused) {
            y6.q(y6Var, ouj.k('\'', "Failed to parse type 'float' for input '", l), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.wdp, defpackage.eg7
    public final double r() {
        y6 y6Var = this.m;
        String l = y6Var.l();
        try {
            double parseDouble = Double.parseDouble(l);
            if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            ghh.K(y6Var, Double.valueOf(parseDouble));
            throw null;
        } catch (IllegalArgumentException unused) {
            y6.q(y6Var, ouj.k('\'', "Failed to parse type 'double' for input '", l), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.wdp, defpackage.eg7
    public final boolean t() {
        boolean z;
        boolean z2;
        y6 y6Var = this.m;
        int C = y6Var.C();
        if (C == y6Var.s().length()) {
            y6.q(y6Var, "EOF", 0, null, 6);
            throw null;
        }
        if (y6Var.s().charAt(C) == '\"') {
            C++;
            z = true;
        } else {
            z = false;
        }
        int z3 = y6Var.z(C);
        if (z3 >= y6Var.s().length() || z3 == -1) {
            y6.q(y6Var, "EOF", 0, null, 6);
            throw null;
        }
        int i = z3 + 1;
        int charAt = y6Var.s().charAt(z3) | ' ';
        if (charAt == 102) {
            y6Var.d(i, "alse");
            z2 = false;
        } else {
            if (charAt != 116) {
                y6.q(y6Var, "Expected valid boolean literal prefix, but had '" + y6Var.l() + '\'', 0, null, 6);
                throw null;
            }
            y6Var.d(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (y6Var.b == y6Var.s().length()) {
            y6.q(y6Var, "EOF", 0, null, 6);
            throw null;
        }
        if (y6Var.s().charAt(y6Var.b) == '\"') {
            y6Var.b++;
            return z2;
        }
        y6.q(y6Var, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // defpackage.wdp, defpackage.eg7
    public final char u() {
        y6 y6Var = this.m;
        String l = y6Var.l();
        if (l.length() == 1) {
            return l.charAt(0);
        }
        y6.q(y6Var, ouj.k('\'', "Expected single char, but got '", l), 0, null, 6);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0124, code lost:
    
        r1 = r15.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0128, code lost:
    
        if (r11 >= 64) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x012a, code lost:
    
        r1.a |= 1 << r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0133, code lost:
    
        r2 = (r11 >>> 6) - 1;
        r1 = (long[]) r1.d;
        r1[r2] = r1[r2] | (1 << (r11 & 63));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0164, code lost:
    
        r1 = r3.b;
        r4 = (int[]) r3.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016d, code lost:
    
        if (r4[r1] != (-2)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016f, code lost:
    
        r4[r1] = r19;
        r3.b = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0175, code lost:
    
        r1 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0179, code lost:
    
        if (r1 == r19) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017b, code lost:
    
        r3.b = r1 + r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017e, code lost:
    
        r1 = kotlin.text.StringsKt.V(6, r2.D(0, r2.b), r7);
        r5 = defpackage.f1d.l(r1, "Encountered an unknown key '", r7, "' at offset ", " at path: ");
        r5.append(r3.E());
        r5.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
        r5.append((java.lang.Object) defpackage.ghh.z(r1, r2.s()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b3, code lost:
    
        throw new defpackage.u4f(r5.toString());
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tq5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int w(mhp mhpVar) {
        byte b;
        byte b2;
        char c;
        String y;
        y6 y6Var = this.m;
        x0 x0Var = (x0) y6Var.c;
        mhpVar.getClass();
        j6w j6wVar = this.l;
        int ordinal = j6wVar.ordinal();
        char c2 = ':';
        int i = 0;
        r9 = false;
        boolean z = false;
        boolean z2 = true;
        int i2 = -1;
        if (ordinal == 0) {
            boolean E = y6Var.E();
            while (true) {
                boolean c3 = y6Var.c();
                y4f y4fVar = this.r;
                if (c3) {
                    j4f j4fVar = this.q;
                    boolean z3 = j4fVar.c;
                    String m = z3 ? y6Var.m() : y6Var.e();
                    y6Var.h(c2);
                    x3f x3fVar = this.k;
                    int i3 = i2;
                    i2 = c3x.I(mhpVar, x3fVar, m);
                    if (i2 == -3) {
                        b = z2;
                        E = false;
                    } else {
                        if (!j4fVar.g) {
                            break;
                        }
                        boolean j = mhpVar.j(i2);
                        mhp h = mhpVar.h(i2);
                        if (!j || h.c() || !y6Var.F(z2)) {
                            b = z2;
                            if (!Intrinsics.d(h.a(), thp.b) || ((h.c() && y6Var.F(false)) || (y = y6Var.y(z3)) == null)) {
                                break;
                            }
                            int I = c3x.I(h, x3fVar, y);
                            byte b3 = (x3fVar.a.e || !h.c()) ? (byte) 0 : b;
                            if (I != -3 || (!j && b3 == 0)) {
                                break;
                            }
                            y6Var.j();
                        } else {
                            b = z2;
                        }
                        E = y6Var.E();
                        z2 = false;
                    }
                    if (z2) {
                        if (!c3x.K(x3fVar, mhpVar)) {
                            fd fdVar = this.p;
                            if (fdVar == null || !Intrinsics.d(fdVar.a, m)) {
                                break;
                            }
                            fdVar.a = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte x = y6Var.x();
                        if (x == 8 || x == 6) {
                            while (true) {
                                byte x2 = y6Var.x();
                                b2 = b;
                                if (x2 != b2) {
                                    c = 6;
                                    if (x2 == 8 || x2 == 6) {
                                        arrayList.add(Byte.valueOf(x2));
                                    } else {
                                        if (x2 == 9) {
                                            if (((Number) CollectionsKt.Y(arrayList)).byteValue() != 8) {
                                                throw ghh.j("found ] instead of } at path: " + x0Var, y6Var.s(), y6Var.b);
                                            }
                                            z75.A(arrayList);
                                        } else if (x2 == 7) {
                                            if (((Number) CollectionsKt.Y(arrayList)).byteValue() != 6) {
                                                throw ghh.j("found } instead of ] at path: " + x0Var, y6Var.s(), y6Var.b);
                                            }
                                            z75.A(arrayList);
                                        } else if (x2 == 10) {
                                            y6.q(y6Var, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                            throw null;
                                        }
                                        c = 6;
                                    }
                                    y6Var.f();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                } else if (z3) {
                                    y6Var.l();
                                } else {
                                    y6Var.e();
                                }
                                b = b2;
                            }
                        } else {
                            y6Var.l();
                            b2 = b;
                            c = 6;
                        }
                        E = y6Var.E();
                        z2 = b2;
                        i2 = i3;
                        c2 = ':';
                    } else {
                        i2 = i3;
                        z2 = b;
                        c2 = ':';
                    }
                } else {
                    if (E) {
                        ghh.y(y6Var, "object");
                        throw null;
                    }
                    if (y4fVar != null) {
                        p2b p2bVar = y4fVar.a;
                        le0 le0Var = (le0) p2bVar.c;
                        mhp mhpVar2 = (mhp) p2bVar.b;
                        int e = mhpVar2.e();
                        while (true) {
                            long j2 = p2bVar.a;
                            if (j2 != -1) {
                                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j2);
                                p2bVar.a |= 1 << numberOfTrailingZeros;
                                if (((Boolean) le0Var.invoke(mhpVar2, Integer.valueOf(numberOfTrailingZeros))).booleanValue()) {
                                    i2 = numberOfTrailingZeros;
                                    break;
                                }
                            } else if (e > 64) {
                                long[] jArr = (long[]) p2bVar.d;
                                int length = jArr.length;
                                loop3: while (i < length) {
                                    int i4 = i + 1;
                                    int i5 = i4 * 64;
                                    long j3 = jArr[i];
                                    while (j3 != -1) {
                                        int i6 = i;
                                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j3);
                                        j3 |= 1 << numberOfTrailingZeros2;
                                        int i7 = numberOfTrailingZeros2 + i5;
                                        if (((Boolean) le0Var.invoke(mhpVar2, Integer.valueOf(i7))).booleanValue()) {
                                            jArr[i6] = j3;
                                            i2 = i7;
                                            break loop3;
                                        }
                                        i = i6;
                                    }
                                    jArr[i] = j3;
                                    i = i4;
                                }
                            }
                        }
                    }
                    i2 = -1;
                }
            }
        } else if (ordinal != 2) {
            boolean E2 = y6Var.E();
            if (y6Var.c()) {
                int i8 = this.o;
                if (i8 != -1 && !E2) {
                    y6.q(y6Var, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i2 = i8 + 1;
                this.o = i2;
            } else if (E2) {
                ghh.y(y6Var, PListParser.TAG_ARRAY);
                throw null;
            }
        } else {
            int i9 = this.o;
            Object[] objArr = i9 % 2 != 0;
            if (objArr != true) {
                y6Var.h(':');
            } else if (i9 != -1) {
                z = y6Var.E();
            }
            if (y6Var.c()) {
                if (objArr != false) {
                    int i10 = this.o;
                    int i11 = y6Var.b;
                    if (i10 == -1) {
                        if (z) {
                            y6.q(y6Var, "Unexpected leading comma", i11, null, 4);
                            throw null;
                        }
                    } else if (!z) {
                        y6.q(y6Var, "Expected comma after the key-value pair", i11, null, 4);
                        throw null;
                    }
                }
                i2 = this.o + 1;
                this.o = i2;
            } else if (z) {
                ghh.y(y6Var, "object");
                throw null;
            }
        }
        if (j6wVar != j6w.e) {
            ((int[]) x0Var.d)[x0Var.b] = i2;
        }
        return i2;
    }

    @Override // defpackage.wdp, defpackage.tq5
    public final Object z(mhp mhpVar, int i, t9f t9fVar, Object obj) {
        x0 x0Var = (x0) this.m.c;
        mhpVar.getClass();
        t9fVar.getClass();
        boolean z = this.l == j6w.e && (i & 1) == 0;
        if (z) {
            int[] iArr = (int[]) x0Var.d;
            int i2 = x0Var.b;
            if (iArr[i2] == -2) {
                ((Object[]) x0Var.c)[i2] = ofc.g;
            }
        }
        Object e = e(t9fVar);
        if (z) {
            int[] iArr2 = (int[]) x0Var.d;
            int i3 = x0Var.b;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                x0Var.b = i4;
                if (i4 == ((Object[]) x0Var.c).length) {
                    x0Var.a0();
                }
            }
            Object[] objArr = (Object[]) x0Var.c;
            int i5 = x0Var.b;
            objArr[i5] = e;
            ((int[]) x0Var.d)[i5] = -2;
        }
        return e;
    }
}
