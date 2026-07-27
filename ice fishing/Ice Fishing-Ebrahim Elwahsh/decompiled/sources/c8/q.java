package c8;

import D.H;
import b8.AbstractC0534c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import r7.AbstractC4979j;
import r7.AbstractC4980k;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class q extends com.bumptech.glide.g implements Z7.b, Z7.a {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0534c f5789b;

    /* renamed from: c, reason: collision with root package name */
    public final u f5790c;

    /* renamed from: d, reason: collision with root package name */
    public final H f5791d;

    /* renamed from: e, reason: collision with root package name */
    public int f5792e;

    /* renamed from: f, reason: collision with root package name */
    public final b8.j f5793f;

    /* renamed from: g, reason: collision with root package name */
    public final j f5794g;

    public q(AbstractC0534c json, u uVar, H h9, Y7.e descriptor) {
        kotlin.jvm.internal.h.e(json, "json");
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        this.f5789b = json;
        this.f5790c = uVar;
        this.f5791d = h9;
        this.f5792e = -1;
        b8.j jVar = json.f5583a;
        this.f5793f = jVar;
        this.f5794g = jVar.f5601c ? null : new j(descriptor);
    }

    @Override // com.bumptech.glide.g
    public final Object H(X7.a deserializer) {
        kotlin.jvm.internal.h.e(deserializer, "deserializer");
        try {
            return deserializer.b(this);
        } catch (X7.b e6) {
            String message = e6.getMessage();
            kotlin.jvm.internal.h.b(message);
            if (M7.j.L(message, "at path", false)) {
                throw e6;
            }
            String str = e6.getMessage() + " at path: " + ((F.d) this.f5791d.f492v).f();
            kotlin.jvm.internal.h.e(null, "missingFields");
            throw new X7.b(str, e6);
        }
    }

    public final b8.l Y() {
        return new G1.a(this.f5789b.f5583a, this.f5791d).i();
    }

    @Override // com.bumptech.glide.g, Z7.b
    public final boolean c() {
        boolean z8;
        boolean z9;
        H h9 = this.f5791d;
        int t9 = h9.t();
        String str = (String) h9.f495y;
        if (t9 == str.length()) {
            H.n(h9, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(t9) == '\"') {
            t9++;
            z8 = true;
        } else {
            z8 = false;
        }
        int s3 = h9.s(t9);
        if (s3 >= str.length() || s3 == -1) {
            H.n(h9, "EOF", 0, 6);
            throw null;
        }
        int i = s3 + 1;
        int charAt = str.charAt(s3) | ' ';
        if (charAt == 102) {
            h9.c(i, "alse");
            z9 = false;
        } else {
            if (charAt != 116) {
                H.n(h9, "Expected valid boolean literal prefix, but had '" + h9.k() + '\'', 0, 6);
                throw null;
            }
            h9.c(i, "rue");
            z9 = true;
        }
        if (!z8) {
            return z9;
        }
        if (h9.f491u == str.length()) {
            H.n(h9, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(h9.f491u) == '\"') {
            h9.f491u++;
            return z9;
        }
        H.n(h9, "Expected closing quotation mark", 0, 6);
        throw null;
    }

    @Override // com.bumptech.glide.g, Z7.b
    public final char e() {
        H h9 = this.f5791d;
        String k6 = h9.k();
        if (k6.length() == 1) {
            return k6.charAt(0);
        }
        H.n(h9, AbstractC5051n.b('\'', "Expected single char, but got '", k6), 0, 6);
        throw null;
    }

    @Override // com.bumptech.glide.g, Z7.b
    public final int h() {
        H h9 = this.f5791d;
        long h10 = h9.h();
        int i = (int) h10;
        if (h10 == i) {
            return i;
        }
        H.n(h9, "Failed to parse int for input '" + h10 + '\'', 0, 6);
        throw null;
    }

    @Override // com.bumptech.glide.g, Z7.a
    public final Object i(Y7.e descriptor, int i, X7.a deserializer, Object obj) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        kotlin.jvm.internal.h.e(deserializer, "deserializer");
        boolean z8 = this.f5790c == u.f5807x && (i & 1) == 0;
        F.d dVar = (F.d) this.f5791d.f492v;
        if (z8) {
            int[] iArr = (int[]) dVar.f910d;
            int i4 = dVar.f908b;
            if (iArr[i4] == -2) {
                ((Object[]) dVar.f909c)[i4] = n.f5777a;
            }
        }
        Object i9 = super.i(descriptor, i, deserializer, obj);
        if (z8) {
            int[] iArr2 = (int[]) dVar.f910d;
            int i10 = dVar.f908b;
            if (iArr2[i10] != -2) {
                int i11 = i10 + 1;
                dVar.f908b = i11;
                Object[] objArr = (Object[]) dVar.f909c;
                if (i11 == objArr.length) {
                    int i12 = i11 * 2;
                    Object[] copyOf = Arrays.copyOf(objArr, i12);
                    kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
                    dVar.f909c = copyOf;
                    int[] copyOf2 = Arrays.copyOf((int[]) dVar.f910d, i12);
                    kotlin.jvm.internal.h.d(copyOf2, "copyOf(...)");
                    dVar.f910d = copyOf2;
                }
            }
            Object[] objArr2 = (Object[]) dVar.f909c;
            int i13 = dVar.f908b;
            objArr2[i13] = i9;
            ((int[]) dVar.f910d)[i13] = -2;
        }
        return i9;
    }

    @Override // com.bumptech.glide.g, Z7.b
    public final String j() {
        return this.f5791d.i();
    }

    @Override // com.bumptech.glide.g, Z7.b
    public final long m() {
        return this.f5791d.h();
    }

    @Override // com.bumptech.glide.g, Z7.b
    public final boolean n() {
        j jVar = this.f5794g;
        if (!(jVar != null ? jVar.f5773b : false)) {
            H h9 = this.f5791d;
            int s3 = h9.s(h9.t());
            String str = (String) h9.f495y;
            int length = str.length() - s3;
            boolean z8 = false;
            if (length >= 4 && s3 != -1) {
                int i = 0;
                while (true) {
                    if (i < 4) {
                        if ("null".charAt(i) != str.charAt(s3 + i)) {
                            break;
                        }
                        i++;
                    } else if (length <= 4 || m.d(str.charAt(s3 + 4)) != 0) {
                        h9.f491u = s3 + 4;
                        z8 = true;
                    }
                }
            }
            if (!z8) {
                return true;
            }
        }
        return false;
    }

    @Override // Z7.a
    public final int o(Y7.e descriptor) {
        byte b9;
        byte b10;
        Object invoke;
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        u uVar = this.f5790c;
        int ordinal = uVar.ordinal();
        H h9 = this.f5791d;
        byte b11 = 1;
        int i = 0;
        r7 = false;
        boolean z8 = false;
        Throwable th = null;
        char c4 = ':';
        AbstractC0534c json = this.f5789b;
        int i4 = -1;
        F.d dVar = (F.d) h9.f492v;
        if (ordinal == 0) {
            boolean v6 = h9.v();
            while (true) {
                boolean b12 = h9.b();
                Throwable th2 = th;
                j jVar = this.f5794g;
                if (b12) {
                    b8.j jVar2 = this.f5793f;
                    String name = h9.d();
                    h9.g(c4);
                    kotlin.jvm.internal.h.e(descriptor, "<this>");
                    kotlin.jvm.internal.h.e(json, "json");
                    kotlin.jvm.internal.h.e(name, "name");
                    m.g(descriptor, json);
                    int c9 = descriptor.c(name);
                    if (c9 == -3 && json.f5583a.f5602d) {
                        n nVar = m.f5776a;
                        l lVar = new l(descriptor, json);
                        h4.c cVar = json.f5585c;
                        cVar.getClass();
                        cVar.getClass();
                        b9 = b11;
                        kotlin.jvm.internal.h.e(descriptor, "descriptor");
                        Map map = (Map) ((ConcurrentHashMap) cVar.f38233u).get(descriptor);
                        Object obj = map != null ? map.get(nVar) : null;
                        Object obj2 = obj != null ? obj : null;
                        if (obj2 != null) {
                            invoke = obj2;
                        } else {
                            invoke = lVar.invoke();
                            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) cVar.f38233u;
                            Object obj3 = concurrentHashMap.get(descriptor);
                            Object obj4 = obj3;
                            if (obj3 == null) {
                                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(2);
                                concurrentHashMap.put(descriptor, concurrentHashMap2);
                                obj4 = concurrentHashMap2;
                            }
                            ((Map) obj4).put(nVar, invoke);
                        }
                        Integer num = (Integer) ((Map) invoke).get(name);
                        c9 = num != null ? num.intValue() : -3;
                    } else {
                        b9 = b11;
                    }
                    if (c9 != -3) {
                        if (jVar != null) {
                            a8.r rVar = jVar.f5772a;
                            if (c9 < 64) {
                                rVar.f4502c |= 1 << c9;
                            } else {
                                int i9 = (c9 >>> 6) - 1;
                                long[] jArr = rVar.f4503d;
                                jArr[i9] = jArr[i9] | (1 << (c9 & 63));
                            }
                        }
                        i4 = c9;
                    } else {
                        boolean z9 = jVar2.f5600b;
                        String str = (String) h9.f495y;
                        if (!z9) {
                            h9.m(M7.j.U(6, str.subSequence(0, h9.f491u).toString(), name), AbstractC5051n.b('\'', "Encountered an unknown key '", name), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                            throw th2;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte r9 = h9.r();
                        if (r9 == 8 || r9 == 6) {
                            while (true) {
                                byte r10 = h9.r();
                                b10 = b9;
                                if (r10 == b10) {
                                    h9.d();
                                } else {
                                    if (r10 == 8 || r10 == 6) {
                                        arrayList.add(Byte.valueOf(r10));
                                    } else if (r10 == 9) {
                                        if (((Number) AbstractC4979j.L(arrayList)).byteValue() != 8) {
                                            throw m.b(h9.f491u, str, "found ] instead of } at path: " + dVar);
                                        }
                                        if (arrayList.isEmpty()) {
                                            throw new NoSuchElementException("List is empty.");
                                        }
                                        arrayList.remove(AbstractC4980k.A(arrayList));
                                    } else if (r10 == 7) {
                                        if (((Number) AbstractC4979j.L(arrayList)).byteValue() != 6) {
                                            throw m.b(h9.f491u, str, "found } instead of ] at path: " + dVar);
                                        }
                                        if (arrayList.isEmpty()) {
                                            throw new NoSuchElementException("List is empty.");
                                        }
                                        arrayList.remove(AbstractC4980k.A(arrayList));
                                    } else if (r10 == 10) {
                                        H.n(h9, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, 6);
                                        throw th2;
                                    }
                                    h9.e();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                }
                                b9 = b10;
                            }
                        } else {
                            h9.k();
                            b10 = b9;
                        }
                        v6 = h9.v();
                        b11 = b10;
                        th = th2;
                        i = 0;
                        c4 = ':';
                    }
                } else {
                    if (v6) {
                        b8.j jVar3 = json.f5583a;
                        m.e(h9, "object");
                        throw th2;
                    }
                    if (jVar != null) {
                        a8.r rVar2 = jVar.f5772a;
                        Y7.e eVar = rVar2.f4500a;
                        int e6 = eVar.e();
                        while (true) {
                            long j9 = rVar2.f4502c;
                            long j10 = -1;
                            i iVar = rVar2.f4501b;
                            if (j9 != -1) {
                                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j9);
                                rVar2.f4502c |= 1 << numberOfTrailingZeros;
                                iVar.invoke(eVar, Integer.valueOf(numberOfTrailingZeros));
                                if (Boolean.FALSE.booleanValue()) {
                                    i4 = numberOfTrailingZeros;
                                    break;
                                }
                            } else if (e6 > 64) {
                                long[] jArr2 = rVar2.f4503d;
                                int length = jArr2.length;
                                loop3: while (i < length) {
                                    int i10 = i + 1;
                                    int i11 = i10 * 64;
                                    long j11 = jArr2[i];
                                    while (j11 != j10) {
                                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j11);
                                        j11 |= 1 << numberOfTrailingZeros2;
                                        int i12 = numberOfTrailingZeros2 + i11;
                                        iVar.invoke(eVar, Integer.valueOf(i12));
                                        if (Boolean.FALSE.booleanValue()) {
                                            jArr2[i] = j11;
                                            i4 = i12;
                                            break loop3;
                                        }
                                        j10 = -1;
                                    }
                                    jArr2[i] = j11;
                                    i = i10;
                                    j10 = -1;
                                }
                            }
                        }
                    }
                    i4 = -1;
                }
            }
        } else if (ordinal != 2) {
            boolean v9 = h9.v();
            if (h9.b()) {
                int i13 = this.f5792e;
                if (i13 != -1 && !v9) {
                    H.n(h9, "Expected end of the array or comma", 0, 6);
                    throw null;
                }
                i4 = i13 + 1;
                this.f5792e = i4;
            } else if (v9) {
                b8.j jVar4 = json.f5583a;
                m.e(h9, "array");
                throw null;
            }
        } else {
            int i14 = this.f5792e;
            boolean z10 = i14 % 2 != 0;
            if (!z10) {
                h9.g(':');
            } else if (i14 != -1) {
                z8 = h9.v();
            }
            if (h9.b()) {
                if (z10) {
                    if (this.f5792e == -1) {
                        int i15 = h9.f491u;
                        if (z8) {
                            H.n(h9, "Unexpected leading comma", i15, 4);
                            throw null;
                        }
                    } else {
                        int i16 = h9.f491u;
                        if (!z8) {
                            H.n(h9, "Expected comma after the key-value pair", i16, 4);
                            throw null;
                        }
                    }
                }
                i4 = this.f5792e + 1;
                this.f5792e = i4;
            } else if (z8) {
                b8.j jVar5 = json.f5583a;
                m.e(h9, "object");
                throw null;
            }
        }
        if (uVar != u.f5807x) {
            ((int[]) dVar.f910d)[dVar.f908b] = i4;
        }
        return i4;
    }

    @Override // com.bumptech.glide.g, Z7.a
    public final void p(Y7.e descriptor) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        if (this.f5789b.f5583a.f5600b && descriptor.e() == 0) {
            while (o(descriptor) != -1) {
            }
        }
        H h9 = this.f5791d;
        if (h9.v()) {
            m.e(h9, "");
            throw null;
        }
        h9.g(this.f5790c.f5811u);
        F.d dVar = (F.d) h9.f492v;
        int i = dVar.f908b;
        int[] iArr = (int[]) dVar.f910d;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            dVar.f908b = i - 1;
        }
        int i4 = dVar.f908b;
        if (i4 != -1) {
            dVar.f908b = i4 - 1;
        }
    }

    @Override // com.bumptech.glide.g, Z7.b
    public final Z7.b q(Y7.e descriptor) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        return s.a(descriptor) ? new g(this.f5791d, this.f5789b) : this;
    }

    @Override // com.bumptech.glide.g, Z7.b
    public final Z7.a s(Y7.e descriptor) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        AbstractC0534c abstractC0534c = this.f5789b;
        u h9 = m.h(descriptor, abstractC0534c);
        H h10 = this.f5791d;
        F.d dVar = (F.d) h10.f492v;
        int i = dVar.f908b + 1;
        dVar.f908b = i;
        Object[] objArr = (Object[]) dVar.f909c;
        if (i == objArr.length) {
            int i4 = i * 2;
            Object[] copyOf = Arrays.copyOf(objArr, i4);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            dVar.f909c = copyOf;
            int[] copyOf2 = Arrays.copyOf((int[]) dVar.f910d, i4);
            kotlin.jvm.internal.h.d(copyOf2, "copyOf(...)");
            dVar.f910d = copyOf2;
        }
        ((Object[]) dVar.f909c)[i] = descriptor;
        h10.g(h9.f5810n);
        if (h10.r() != 4) {
            int ordinal = h9.ordinal();
            return (ordinal == 1 || ordinal == 2 || ordinal == 3) ? new q(abstractC0534c, h9, h10, descriptor) : (this.f5790c == h9 && abstractC0534c.f5583a.f5601c) ? this : new q(abstractC0534c, h9, h10, descriptor);
        }
        H.n(h10, "Unexpected leading comma", 0, 6);
        throw null;
    }

    @Override // com.bumptech.glide.g, Z7.b
    public final byte u() {
        H h9 = this.f5791d;
        long h10 = h9.h();
        byte b9 = (byte) h10;
        if (h10 == b9) {
            return b9;
        }
        H.n(h9, "Failed to parse byte for input '" + h10 + '\'', 0, 6);
        throw null;
    }

    @Override // com.bumptech.glide.g, Z7.b
    public final short v() {
        H h9 = this.f5791d;
        long h10 = h9.h();
        short s3 = (short) h10;
        if (h10 == s3) {
            return s3;
        }
        H.n(h9, "Failed to parse short for input '" + h10 + '\'', 0, 6);
        throw null;
    }

    @Override // com.bumptech.glide.g, Z7.b
    public final float w() {
        H h9 = this.f5791d;
        String k6 = h9.k();
        try {
            float parseFloat = Float.parseFloat(k6);
            b8.j jVar = this.f5789b.f5583a;
            if (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat)) {
                return parseFloat;
            }
            m.i(h9, Float.valueOf(parseFloat));
            throw null;
        } catch (IllegalArgumentException unused) {
            H.n(h9, AbstractC5051n.b('\'', "Failed to parse type 'float' for input '", k6), 0, 6);
            throw null;
        }
    }

    @Override // com.bumptech.glide.g, Z7.b
    public final double x() {
        H h9 = this.f5791d;
        String k6 = h9.k();
        try {
            double parseDouble = Double.parseDouble(k6);
            b8.j jVar = this.f5789b.f5583a;
            if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                return parseDouble;
            }
            m.i(h9, Double.valueOf(parseDouble));
            throw null;
        } catch (IllegalArgumentException unused) {
            H.n(h9, AbstractC5051n.b('\'', "Failed to parse type 'double' for input '", k6), 0, 6);
            throw null;
        }
    }
}
