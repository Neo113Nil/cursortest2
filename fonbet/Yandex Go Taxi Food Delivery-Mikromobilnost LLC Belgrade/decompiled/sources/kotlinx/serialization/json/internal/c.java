package kotlinx.serialization.json.internal;

import defpackage.b8;
import defpackage.ccx;
import defpackage.cjx;
import defpackage.ddx;
import defpackage.evu0;
import defpackage.fsq0;
import defpackage.g7;
import defpackage.i9;
import defpackage.jl40;
import defpackage.kex;
import defpackage.kf5;
import defpackage.kl40;
import defpackage.myi;
import defpackage.ncx;
import defpackage.o430;
import defpackage.ocx;
import defpackage.pqn;
import defpackage.qcx;
import defpackage.qdx;
import defpackage.qje;
import defpackage.qoi0;
import defpackage.rzo;
import defpackage.s8o;
import defpackage.sbx;
import defpackage.sjd;
import defpackage.tru0;
import defpackage.unr0;
import defpackage.vez0;
import defpackage.wls;
import defpackage.wru0;
import defpackage.ycc;
import java.util.ArrayList;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonDecodingException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes9.dex */
public final class c extends g7 implements ncx {
    public final sbx a;
    public final WriteMode b;
    public final b8 c;
    public final kf5 d;
    public int e = -1;
    public cjx f;
    public final ccx g;
    public final a h;

    public c(sbx sbxVar, WriteMode writeMode, b8 b8Var, SerialDescriptor serialDescriptor, cjx cjxVar) {
        this.a = sbxVar;
        this.b = writeMode;
        this.c = b8Var;
        this.d = sbxVar.b;
        this.f = cjxVar;
        ccx ccxVar = sbxVar.a;
        this.g = ccxVar;
        this.h = ccxVar.f ? null : new a(serialDescriptor);
    }

    @Override // defpackage.g7, defpackage.sjd
    public final Object A(SerialDescriptor serialDescriptor, int i, myi myiVar, Object obj) {
        boolean z = this.b == WriteMode.MAP && (i & 1) == 0;
        b8 b8Var = this.c;
        if (z) {
            qdx qdxVar = b8Var.c;
            int[] iArr = (int[]) qdxVar.x;
            int i2 = qdxVar.b;
            if (iArr[i2] == -2) {
                ((Object[]) qdxVar.w)[i2] = kl40.C;
            }
        }
        Object B = B(myiVar);
        if (z) {
            qdx qdxVar2 = b8Var.c;
            int[] iArr2 = (int[]) qdxVar2.x;
            int i3 = qdxVar2.b;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                qdxVar2.b = i4;
                if (i4 == ((Object[]) qdxVar2.w).length) {
                    qdxVar2.r();
                }
            }
            Object[] objArr = (Object[]) qdxVar2.w;
            int i5 = qdxVar2.b;
            objArr[i5] = ((ccx) qdxVar2.c).n ? B : o430.A;
            ((int[]) qdxVar2.x)[i5] = -2;
        }
        return B;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013e  */
    @Override // kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(myi myiVar) {
        String obj;
        sbx sbxVar = this.a;
        b8 b8Var = this.c;
        try {
        } catch (MissingFieldException e) {
            if (!evu0.y(e.getMessage(), "at path", false)) {
            }
        }
        if (!(myiVar instanceof i9)) {
            return myiVar.deserialize(this);
        }
        ccx ccxVar = sbxVar.a;
        String f = s8o.f(sbxVar, ((i9) myiVar).getDescriptor());
        String u = b8Var.u(f, this.g.c);
        if (u != null) {
            try {
                myi w = rzo.w((i9) myiVar, this, u);
                cjx cjxVar = new cjx();
                cjxVar.b = f;
                this.f = cjxVar;
                return w.deserialize(this);
            } catch (SerializationException e2) {
                String message = e2.getMessage();
                b8.q(b8Var, evu0.S(Extension.DOT_CHAR, evu0.f0('\n', message, message)), 0, evu0.c0('\n', e2.getMessage(), ""), 2);
                throw null;
            }
        }
        ccx ccxVar2 = sbxVar.a;
        String f2 = s8o.f(sbxVar, ((i9) myiVar).getDescriptor());
        kotlinx.serialization.json.b t = t();
        String h = ((i9) myiVar).getDescriptor().h();
        if (t instanceof kotlinx.serialization.json.c) {
            kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) t;
            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVar.get(f2);
            try {
                myi w2 = rzo.w((i9) myiVar, this, bVar != null ? qcx.g(qcx.n(bVar)) : null);
                return new kex(sbxVar, cVar, f2, w2.getDescriptor()).B(w2);
            } catch (SerializationException e3) {
                String message2 = e3.getMessage();
                obj = sbxVar.a.n ? qje.G(-1, cVar.toString()).toString() : null;
                throw new JsonDecodingException(qje.n(-1, message2, null, null, obj), message2, null, obj, -1, null);
            }
        }
        String str = "Expected " + qoi0.a(kotlinx.serialization.json.c.class).d() + ", but had " + qoi0.a(t.getClass()).d() + " as the serialized body of " + h;
        String o = b8Var.c.o();
        obj = sbxVar.a.n ? qje.G(-1, t.toString()).toString() : null;
        throw new JsonDecodingException(qje.n(-1, str, o, null, obj), str, o, obj, -1, null);
        if (!evu0.y(e.getMessage(), "at path", false)) {
            throw e;
        }
        throw e.a(e.getMessage() + " at path: " + b8Var.c.o());
    }

    @Override // defpackage.g7, kotlinx.serialization.encoding.Decoder
    public final boolean D() {
        a aVar = this.h;
        return ((aVar != null ? aVar.b : false) || this.c.B(true)) ? false : true;
    }

    @Override // defpackage.g7, kotlinx.serialization.encoding.Decoder
    public final byte F() {
        b8 b8Var = this.c;
        long i = b8Var.i();
        byte b = (byte) i;
        if (i == b) {
            return b;
        }
        b8.q(b8Var, "Failed to parse byte for input '" + i + '\'', 0, null, 6);
        throw null;
    }

    @Override // kotlinx.serialization.encoding.Decoder, defpackage.sjd
    public final kf5 a() {
        return this.d;
    }

    @Override // defpackage.g7, kotlinx.serialization.encoding.Decoder
    public final sjd b(SerialDescriptor serialDescriptor) {
        sbx sbxVar = this.a;
        WriteMode W = vez0.W(sbxVar, serialDescriptor);
        b8 b8Var = this.c;
        qdx qdxVar = b8Var.c;
        int i = qdxVar.b + 1;
        qdxVar.b = i;
        if (i == ((Object[]) qdxVar.w).length) {
            qdxVar.r();
        }
        ((Object[]) qdxVar.w)[i] = serialDescriptor;
        b8Var.h(W.begin);
        if (b8Var.v() == 4) {
            b8.q(b8Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int i2 = tru0.a[W.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return new c(this.a, W, this.c, serialDescriptor, this.f);
        }
        if (this.b == W && sbxVar.a.f) {
            return this;
        }
        return new c(this.a, W, this.c, serialDescriptor, this.f);
    }

    @Override // defpackage.g7, defpackage.sjd
    public final void c(SerialDescriptor serialDescriptor) {
        int e = serialDescriptor.e();
        sbx sbxVar = this.a;
        if (e == 0 && ddx.d(sbxVar, serialDescriptor)) {
            while (v(serialDescriptor) != -1) {
            }
        }
        b8 b8Var = this.c;
        if (b8Var.A() && !sbxVar.a.l) {
            qje.z(b8Var, "");
            throw null;
        }
        b8Var.h(this.b.end);
        qdx qdxVar = b8Var.c;
        int i = qdxVar.b;
        int[] iArr = (int[]) qdxVar.x;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            qdxVar.b = i - 1;
        }
        int i2 = qdxVar.b;
        if (i2 != -1) {
            qdxVar.b = i2 - 1;
        }
    }

    @Override // defpackage.ncx
    public final sbx d() {
        return this.a;
    }

    @Override // defpackage.g7, kotlinx.serialization.encoding.Decoder
    public final Void i() {
        return null;
    }

    @Override // defpackage.g7, kotlinx.serialization.encoding.Decoder
    public final long j() {
        return this.c.i();
    }

    @Override // defpackage.g7, kotlinx.serialization.encoding.Decoder
    public final short l() {
        b8 b8Var = this.c;
        long i = b8Var.i();
        short s = (short) i;
        if (i == s) {
            return s;
        }
        b8.q(b8Var, "Failed to parse short for input '" + i + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.g7, kotlinx.serialization.encoding.Decoder
    public final double m() {
        b8 b8Var = this.c;
        String l = b8Var.l();
        try {
            double parseDouble = Double.parseDouble(l);
            ccx ccxVar = this.a.a;
            if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            b8.q(b8Var, qje.I(Double.valueOf(parseDouble), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            b8.q(b8Var, unr0.l('\'', "Failed to parse type 'double' for input '", l), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.g7, kotlinx.serialization.encoding.Decoder
    public final char n() {
        b8 b8Var = this.c;
        String l = b8Var.l();
        if (l.length() == 1) {
            return l.charAt(0);
        }
        b8.q(b8Var, unr0.l('\'', "Expected single char, but got '", l), 0, null, 6);
        throw null;
    }

    @Override // defpackage.g7, kotlinx.serialization.encoding.Decoder
    public final String p() {
        boolean z = this.g.c;
        b8 b8Var = this.c;
        return z ? b8Var.m() : b8Var.j();
    }

    @Override // defpackage.g7, kotlinx.serialization.encoding.Decoder
    public final int q(SerialDescriptor serialDescriptor) {
        return ddx.c(serialDescriptor, this.a, p(), " at path ".concat(this.c.c.o()));
    }

    @Override // defpackage.ncx
    public final kotlinx.serialization.json.b t() {
        return new b(this.a.a, this.c).b();
    }

    @Override // defpackage.g7, kotlinx.serialization.encoding.Decoder
    public final int u() {
        b8 b8Var = this.c;
        long i = b8Var.i();
        int i2 = (int) i;
        if (i == i2) {
            return i2;
        }
        b8.q(b8Var, "Failed to parse int for input '" + i + '\'', 0, null, 6);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x00dd, code lost:
    
        r0 = r14.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x00df, code lost:
    
        if (r6 >= 64) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x00e1, code lost:
    
        r0.b |= 1 << r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x00eb, code lost:
    
        r1 = (r6 >>> 6) - 1;
        r0 = (long[]) r0.e;
        r0[r1] = r0[r1] | (1 << (r6 & 63));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011c, code lost:
    
        r0 = r11.c;
        r1 = r0.b;
        r2 = (int[]) r0.x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0127, code lost:
    
        if (r2[r1] != (-2)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0129, code lost:
    
        r2[r1] = r18;
        r0.b = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012f, code lost:
    
        r1 = r0.b;
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0133, code lost:
    
        if (r1 == r2) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0135, code lost:
    
        r0.b = r1 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0138, code lost:
    
        r11.p(defpackage.evu0.L(r15, r11.z(0, r11.b), 6), defpackage.unr0.l('\'', "Encountered an unknown key '", r15), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0152, code lost:
    
        throw null;
     */
    @Override // defpackage.sjd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int v(SerialDescriptor serialDescriptor) {
        int b;
        boolean z;
        int i;
        boolean z2;
        char c;
        String w;
        int[] iArr = tru0.a;
        WriteMode writeMode = this.b;
        int i2 = iArr[writeMode.ordinal()];
        char c2 = ':';
        boolean z3 = false;
        int i3 = 0;
        z3 = false;
        sbx sbxVar = this.a;
        boolean z4 = true;
        int i4 = -1;
        b8 b8Var = this.c;
        if (i2 == 2) {
            int i5 = this.e;
            boolean z5 = i5 % 2 != 0;
            if (!z5) {
                b8Var.h(':');
            } else if (i5 != -1) {
                z3 = b8Var.A();
            }
            if (b8Var.c()) {
                if (z5) {
                    int i6 = this.e;
                    int i7 = b8Var.b;
                    if (i6 == -1) {
                        if (z3) {
                            b8.q(b8Var, "Unexpected leading comma", i7, null, 4);
                            throw null;
                        }
                    } else if (!z3) {
                        b8.q(b8Var, "Expected comma after the key-value pair", i7, null, 4);
                        throw null;
                    }
                }
                i4 = this.e + 1;
                this.e = i4;
            } else {
                if (z3 && !sbxVar.a.l) {
                    qje.A(b8Var);
                    throw null;
                }
                i4 = -1;
            }
        } else if (i2 != 4) {
            boolean A = b8Var.A();
            if (b8Var.c()) {
                int i8 = this.e;
                if (i8 != -1 && !A) {
                    b8.q(b8Var, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i4 = i8 + 1;
                this.e = i4;
            } else if (A && !sbxVar.a.l) {
                qje.z(b8Var, "array");
                throw null;
            }
        } else {
            boolean A2 = b8Var.A();
            while (true) {
                boolean c3 = b8Var.c();
                a aVar = this.h;
                if (c3) {
                    ccx ccxVar = this.g;
                    boolean z6 = ccxVar.c;
                    String m = z6 ? b8Var.m() : b8Var.e();
                    b8Var.h(c2);
                    b = ddx.b(serialDescriptor, sbxVar, m);
                    if (b == -3) {
                        z = z4;
                        i = i4;
                        A2 = false;
                        z2 = z;
                    } else {
                        if (!ccxVar.h) {
                            break;
                        }
                        boolean i9 = serialDescriptor.i(b);
                        i = i4;
                        SerialDescriptor d = serialDescriptor.d(b);
                        if (!i9 || d.b() || !b8Var.B(z4)) {
                            z = z4;
                            if (!jl40.l(d.getKind(), fsq0.g) || ((d.b() && b8Var.B(false)) || (w = b8Var.w(z6)) == null)) {
                                break;
                            }
                            int b2 = ddx.b(d, sbxVar, w);
                            boolean z7 = (sbxVar.a.f || !d.b()) ? false : z;
                            if (b2 != -3 || (!i9 && !z7)) {
                                break;
                            }
                            b8Var.j();
                        } else {
                            z = z4;
                        }
                        A2 = b8Var.A();
                        z2 = false;
                    }
                    if (z2) {
                        if (!ddx.d(sbxVar, serialDescriptor)) {
                            cjx cjxVar = this.f;
                            if (cjxVar == null || !jl40.l(cjxVar.b, m)) {
                                break;
                            }
                            cjxVar.b = null;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte v = b8Var.v();
                        if (v == 8 || v == 6) {
                            while (true) {
                                byte v2 = b8Var.v();
                                if (v2 != z) {
                                    c = 6;
                                    if (v2 == 8 || v2 == 6) {
                                        arrayList.add(Byte.valueOf(v2));
                                    } else if (v2 == 9) {
                                        if (((Number) kotlin.collections.a.Z(arrayList)).byteValue() != 8) {
                                            b8.q(b8Var, "found ] instead of }", 0, null, 6);
                                            throw null;
                                        }
                                        ycc.z(arrayList);
                                    } else if (v2 == 7) {
                                        if (((Number) kotlin.collections.a.Z(arrayList)).byteValue() != 6) {
                                            b8.q(b8Var, "found } instead of ]", 0, null, 6);
                                            throw null;
                                        }
                                        ycc.z(arrayList);
                                    } else if (v2 == 10) {
                                        b8.q(b8Var, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                        throw null;
                                    }
                                    b8Var.f();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                } else if (z6) {
                                    b8Var.l();
                                } else {
                                    b8Var.e();
                                }
                                z = true;
                            }
                        } else {
                            b8Var.l();
                            c = 6;
                        }
                        A2 = b8Var.A();
                    }
                    c2 = ':';
                    z4 = true;
                    i4 = -1;
                } else {
                    if (A2 && !sbxVar.a.l) {
                        qje.A(b8Var);
                        throw null;
                    }
                    if (aVar != null) {
                        pqn pqnVar = aVar.a;
                        wls wlsVar = (wls) pqnVar.d;
                        SerialDescriptor serialDescriptor2 = (SerialDescriptor) pqnVar.c;
                        int e = serialDescriptor2.e();
                        while (true) {
                            long j = pqnVar.b;
                            if (j != -1) {
                                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                                pqnVar.b |= 1 << numberOfTrailingZeros;
                                if (((Boolean) ((JsonElementMarker$origin$1) wlsVar).invoke(serialDescriptor2, Integer.valueOf(numberOfTrailingZeros))).booleanValue()) {
                                    i4 = numberOfTrailingZeros;
                                    break;
                                }
                            } else if (e > 64) {
                                long[] jArr = (long[]) pqnVar.e;
                                int length = jArr.length;
                                loop3: while (i3 < length) {
                                    int i10 = i3 + 1;
                                    int i11 = i10 * 64;
                                    long j2 = jArr[i3];
                                    while (j2 != -1) {
                                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j2);
                                        j2 |= 1 << numberOfTrailingZeros2;
                                        i4 = numberOfTrailingZeros2 + i11;
                                        if (((Boolean) ((JsonElementMarker$origin$1) wlsVar).invoke(serialDescriptor2, Integer.valueOf(i4))).booleanValue()) {
                                            jArr[i3] = j2;
                                            break loop3;
                                        }
                                    }
                                    jArr[i3] = j2;
                                    i3 = i10;
                                }
                            }
                        }
                    }
                    i4 = -1;
                }
            }
            i4 = b;
        }
        if (writeMode != WriteMode.MAP) {
            qdx qdxVar = b8Var.c;
            ((int[]) qdxVar.x)[qdxVar.b] = i4;
        }
        return i4;
    }

    @Override // defpackage.g7, kotlinx.serialization.encoding.Decoder
    public final Decoder w(SerialDescriptor serialDescriptor) {
        return wru0.a(serialDescriptor) ? new ocx(this.c, this.a) : this;
    }

    @Override // defpackage.g7, kotlinx.serialization.encoding.Decoder
    public final float x() {
        b8 b8Var = this.c;
        String l = b8Var.l();
        try {
            float parseFloat = Float.parseFloat(l);
            ccx ccxVar = this.a.a;
            if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            b8.q(b8Var, qje.I(Float.valueOf(parseFloat), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            b8.q(b8Var, unr0.l('\'', "Failed to parse type 'float' for input '", l), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.g7, kotlinx.serialization.encoding.Decoder
    public final boolean z() {
        boolean z;
        boolean z2;
        b8 b8Var = this.c;
        int y = b8Var.y();
        if (y == b8Var.s().length()) {
            b8.q(b8Var, "EOF", 0, null, 6);
            throw null;
        }
        if (b8Var.s().charAt(y) == '\"') {
            y++;
            z = true;
        } else {
            z = false;
        }
        int x = b8Var.x(y);
        if (x >= b8Var.s().length() || x == -1) {
            b8.q(b8Var, "EOF", 0, null, 6);
            throw null;
        }
        int i = x + 1;
        int charAt = b8Var.s().charAt(x) | HexString.CHAR_SPACE;
        if (charAt == 102) {
            b8Var.d(i, "alse");
            z2 = false;
        } else {
            if (charAt != 116) {
                b8.q(b8Var, "Expected valid boolean literal prefix, but had '" + b8Var.l() + '\'', 0, null, 6);
                throw null;
            }
            b8Var.d(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (b8Var.b == b8Var.s().length()) {
            b8.q(b8Var, "EOF", 0, null, 6);
            throw null;
        }
        if (b8Var.s().charAt(b8Var.b) == '\"') {
            b8Var.b++;
            return z2;
        }
        b8.q(b8Var, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }
}
