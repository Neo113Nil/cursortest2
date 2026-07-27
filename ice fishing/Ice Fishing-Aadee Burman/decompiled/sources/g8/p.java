package g8;

import D.H;
import b8.C0530b;
import b8.InterfaceC0529a;
import f8.AbstractC4516c;
import g1.C4523c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import v7.AbstractC5129j;
import v7.AbstractC5130k;

/* loaded from: classes2.dex */
public final class p extends X2.e implements d8.b, d8.a {

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC4516c f37732h;
    public final t i;

    /* renamed from: j, reason: collision with root package name */
    public final H f37733j;

    /* renamed from: k, reason: collision with root package name */
    public int f37734k;

    /* renamed from: l, reason: collision with root package name */
    public final f8.j f37735l;

    /* renamed from: m, reason: collision with root package name */
    public final i f37736m;

    public p(AbstractC4516c json, t tVar, H h9, c8.e descriptor) {
        kotlin.jvm.internal.h.e(json, "json");
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        this.f37732h = json;
        this.i = tVar;
        this.f37733j = h9;
        this.f37734k = -1;
        f8.j jVar = json.f37539a;
        this.f37735l = jVar;
        this.f37736m = jVar.f37557c ? null : new i(descriptor);
    }

    @Override // X2.e
    public final Object D(InterfaceC0529a deserializer) {
        kotlin.jvm.internal.h.e(deserializer, "deserializer");
        try {
            return deserializer.b(this);
        } catch (C0530b e9) {
            String message = e9.getMessage();
            kotlin.jvm.internal.h.b(message);
            if (Q7.j.U(message, "at path", false)) {
                throw e9;
            }
            String str = e9.getMessage() + " at path: " + ((F.d) this.f37733j.f437v).f();
            kotlin.jvm.internal.h.e(null, "missingFields");
            throw new C0530b(str, e9);
        }
    }

    public final f8.l T() {
        return new G1.a(this.f37732h.f37539a, this.f37733j).j();
    }

    @Override // X2.e, d8.b
    public final boolean a() {
        boolean z3;
        boolean z6;
        H h9 = this.f37733j;
        int t6 = h9.t();
        String str = (String) h9.f440y;
        if (t6 == str.length()) {
            H.m(h9, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(t6) == '\"') {
            t6++;
            z3 = true;
        } else {
            z3 = false;
        }
        int s9 = h9.s(t6);
        if (s9 >= str.length() || s9 == -1) {
            H.m(h9, "EOF", 0, 6);
            throw null;
        }
        int i = s9 + 1;
        int charAt = str.charAt(s9) | ' ';
        if (charAt == 102) {
            h9.c(i, "alse");
            z6 = false;
        } else {
            if (charAt != 116) {
                H.m(h9, "Expected valid boolean literal prefix, but had '" + h9.j() + '\'', 0, 6);
                throw null;
            }
            h9.c(i, "rue");
            z6 = true;
        }
        if (!z3) {
            return z6;
        }
        if (h9.f436u == str.length()) {
            H.m(h9, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(h9.f436u) == '\"') {
            h9.f436u++;
            return z6;
        }
        H.m(h9, "Expected closing quotation mark", 0, 6);
        throw null;
    }

    @Override // X2.e, d8.b
    public final char b() {
        H h9 = this.f37733j;
        String j6 = h9.j();
        if (j6.length() == 1) {
            return j6.charAt(0);
        }
        H.m(h9, u1.h.b('\'', "Expected single char, but got '", j6), 0, 6);
        throw null;
    }

    @Override // d8.a
    public final int c(c8.e descriptor) {
        byte b9;
        byte b10;
        Object invoke;
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        t tVar = this.i;
        int ordinal = tVar.ordinal();
        H h9 = this.f37733j;
        byte b11 = 1;
        int i = 0;
        r7 = false;
        boolean z3 = false;
        Throwable th = null;
        char c9 = ':';
        AbstractC4516c json = this.f37732h;
        int i6 = -1;
        F.d dVar = (F.d) h9.f437v;
        if (ordinal == 0) {
            boolean v9 = h9.v();
            while (true) {
                boolean b12 = h9.b();
                Throwable th2 = th;
                i iVar = this.f37736m;
                if (b12) {
                    f8.j jVar = this.f37735l;
                    String name = h9.d();
                    h9.g(c9);
                    kotlin.jvm.internal.h.e(descriptor, "<this>");
                    kotlin.jvm.internal.h.e(json, "json");
                    kotlin.jvm.internal.h.e(name, "name");
                    l.g(descriptor, json);
                    int c10 = descriptor.c(name);
                    if (c10 == -3 && json.f37539a.f37558d) {
                        m mVar = l.f37719a;
                        k kVar = new k(descriptor, json);
                        C4523c c4523c = json.f37541c;
                        c4523c.getClass();
                        c4523c.getClass();
                        b9 = b11;
                        kotlin.jvm.internal.h.e(descriptor, "descriptor");
                        Map map = (Map) ((ConcurrentHashMap) c4523c.f37627u).get(descriptor);
                        Object obj = map != null ? map.get(mVar) : null;
                        Object obj2 = obj != null ? obj : null;
                        if (obj2 != null) {
                            invoke = obj2;
                        } else {
                            invoke = kVar.invoke();
                            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c4523c.f37627u;
                            Object obj3 = concurrentHashMap.get(descriptor);
                            Object obj4 = obj3;
                            if (obj3 == null) {
                                ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(2);
                                concurrentHashMap.put(descriptor, concurrentHashMap2);
                                obj4 = concurrentHashMap2;
                            }
                            ((Map) obj4).put(mVar, invoke);
                        }
                        Integer num = (Integer) ((Map) invoke).get(name);
                        c10 = num != null ? num.intValue() : -3;
                    } else {
                        b9 = b11;
                    }
                    if (c10 != -3) {
                        if (iVar != null) {
                            e8.r rVar = iVar.f37715a;
                            if (c10 < 64) {
                                rVar.f37317c |= 1 << c10;
                            } else {
                                int i9 = (c10 >>> 6) - 1;
                                long[] jArr = rVar.f37318d;
                                jArr[i9] = jArr[i9] | (1 << (c10 & 63));
                            }
                        }
                        i6 = c10;
                    } else {
                        boolean z6 = jVar.f37556b;
                        String str = (String) h9.f440y;
                        if (!z6) {
                            h9.l(Q7.j.d0(6, str.subSequence(0, h9.f436u).toString(), name), u1.h.b('\'', "Encountered an unknown key '", name), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
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
                                        if (((Number) AbstractC5129j.F(arrayList)).byteValue() != 8) {
                                            throw l.b(h9.f436u, str, "found ] instead of } at path: " + dVar);
                                        }
                                        if (arrayList.isEmpty()) {
                                            throw new NoSuchElementException("List is empty.");
                                        }
                                        arrayList.remove(AbstractC5130k.u(arrayList));
                                    } else if (r10 == 7) {
                                        if (((Number) AbstractC5129j.F(arrayList)).byteValue() != 6) {
                                            throw l.b(h9.f436u, str, "found } instead of ] at path: " + dVar);
                                        }
                                        if (arrayList.isEmpty()) {
                                            throw new NoSuchElementException("List is empty.");
                                        }
                                        arrayList.remove(AbstractC5130k.u(arrayList));
                                    } else if (r10 == 10) {
                                        H.m(h9, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, 6);
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
                            h9.j();
                            b10 = b9;
                        }
                        v9 = h9.v();
                        b11 = b10;
                        th = th2;
                        i = 0;
                        c9 = ':';
                    }
                } else {
                    if (v9) {
                        f8.j jVar2 = json.f37539a;
                        l.e(h9, "object");
                        throw th2;
                    }
                    if (iVar != null) {
                        e8.r rVar2 = iVar.f37715a;
                        c8.e eVar = rVar2.f37315a;
                        int e9 = eVar.e();
                        while (true) {
                            long j6 = rVar2.f37317c;
                            long j9 = -1;
                            h hVar = rVar2.f37316b;
                            if (j6 != -1) {
                                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j6);
                                rVar2.f37317c |= 1 << numberOfTrailingZeros;
                                hVar.invoke(eVar, Integer.valueOf(numberOfTrailingZeros));
                                if (Boolean.FALSE.booleanValue()) {
                                    i6 = numberOfTrailingZeros;
                                    break;
                                }
                            } else if (e9 > 64) {
                                long[] jArr2 = rVar2.f37318d;
                                int length = jArr2.length;
                                loop3: while (i < length) {
                                    int i10 = i + 1;
                                    int i11 = i10 * 64;
                                    long j10 = jArr2[i];
                                    while (j10 != j9) {
                                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j10);
                                        j10 |= 1 << numberOfTrailingZeros2;
                                        int i12 = numberOfTrailingZeros2 + i11;
                                        hVar.invoke(eVar, Integer.valueOf(i12));
                                        if (Boolean.FALSE.booleanValue()) {
                                            jArr2[i] = j10;
                                            i6 = i12;
                                            break loop3;
                                        }
                                        j9 = -1;
                                    }
                                    jArr2[i] = j10;
                                    i = i10;
                                    j9 = -1;
                                }
                            }
                        }
                    }
                    i6 = -1;
                }
            }
        } else if (ordinal != 2) {
            boolean v10 = h9.v();
            if (h9.b()) {
                int i13 = this.f37734k;
                if (i13 != -1 && !v10) {
                    H.m(h9, "Expected end of the array or comma", 0, 6);
                    throw null;
                }
                i6 = i13 + 1;
                this.f37734k = i6;
            } else if (v10) {
                f8.j jVar3 = json.f37539a;
                l.e(h9, "array");
                throw null;
            }
        } else {
            int i14 = this.f37734k;
            boolean z9 = i14 % 2 != 0;
            if (!z9) {
                h9.g(':');
            } else if (i14 != -1) {
                z3 = h9.v();
            }
            if (h9.b()) {
                if (z9) {
                    if (this.f37734k == -1) {
                        int i15 = h9.f436u;
                        if (z3) {
                            H.m(h9, "Unexpected leading comma", i15, 4);
                            throw null;
                        }
                    } else {
                        int i16 = h9.f436u;
                        if (!z3) {
                            H.m(h9, "Expected comma after the key-value pair", i16, 4);
                            throw null;
                        }
                    }
                }
                i6 = this.f37734k + 1;
                this.f37734k = i6;
            } else if (z3) {
                f8.j jVar4 = json.f37539a;
                l.e(h9, "object");
                throw null;
            }
        }
        if (tVar != t.f37749x) {
            ((int[]) dVar.f856d)[dVar.f854b] = i6;
        }
        return i6;
    }

    @Override // X2.e, d8.b
    public final d8.b d(c8.e descriptor) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        return r.a(descriptor) ? new f(this.f37733j, this.f37732h) : this;
    }

    @Override // X2.e, d8.b
    public final int e() {
        H h9 = this.f37733j;
        long h10 = h9.h();
        int i = (int) h10;
        if (h10 == i) {
            return i;
        }
        H.m(h9, "Failed to parse int for input '" + h10 + '\'', 0, 6);
        throw null;
    }

    @Override // X2.e, d8.b
    public final String g() {
        return this.f37733j.i();
    }

    @Override // X2.e, d8.b
    public final d8.a h(c8.e descriptor) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        AbstractC4516c abstractC4516c = this.f37732h;
        t h9 = l.h(descriptor, abstractC4516c);
        H h10 = this.f37733j;
        F.d dVar = (F.d) h10.f437v;
        int i = dVar.f854b + 1;
        dVar.f854b = i;
        Object[] objArr = (Object[]) dVar.f855c;
        if (i == objArr.length) {
            int i6 = i * 2;
            Object[] copyOf = Arrays.copyOf(objArr, i6);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            dVar.f855c = copyOf;
            int[] copyOf2 = Arrays.copyOf((int[]) dVar.f856d, i6);
            kotlin.jvm.internal.h.d(copyOf2, "copyOf(...)");
            dVar.f856d = copyOf2;
        }
        ((Object[]) dVar.f855c)[i] = descriptor;
        h10.g(h9.f37752n);
        if (h10.r() != 4) {
            int ordinal = h9.ordinal();
            return (ordinal == 1 || ordinal == 2 || ordinal == 3) ? new p(abstractC4516c, h9, h10, descriptor) : (this.i == h9 && abstractC4516c.f37539a.f37557c) ? this : new p(abstractC4516c, h9, h10, descriptor);
        }
        H.m(h10, "Unexpected leading comma", 0, 6);
        throw null;
    }

    @Override // X2.e, d8.a
    public final Object i(c8.e descriptor, int i, InterfaceC0529a deserializer, Object obj) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        kotlin.jvm.internal.h.e(deserializer, "deserializer");
        boolean z3 = this.i == t.f37749x && (i & 1) == 0;
        F.d dVar = (F.d) this.f37733j.f437v;
        if (z3) {
            int[] iArr = (int[]) dVar.f856d;
            int i6 = dVar.f854b;
            if (iArr[i6] == -2) {
                ((Object[]) dVar.f855c)[i6] = m.f37720a;
            }
        }
        Object i9 = super.i(descriptor, i, deserializer, obj);
        if (z3) {
            int[] iArr2 = (int[]) dVar.f856d;
            int i10 = dVar.f854b;
            if (iArr2[i10] != -2) {
                int i11 = i10 + 1;
                dVar.f854b = i11;
                Object[] objArr = (Object[]) dVar.f855c;
                if (i11 == objArr.length) {
                    int i12 = i11 * 2;
                    Object[] copyOf = Arrays.copyOf(objArr, i12);
                    kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
                    dVar.f855c = copyOf;
                    int[] copyOf2 = Arrays.copyOf((int[]) dVar.f856d, i12);
                    kotlin.jvm.internal.h.d(copyOf2, "copyOf(...)");
                    dVar.f856d = copyOf2;
                }
            }
            Object[] objArr2 = (Object[]) dVar.f855c;
            int i13 = dVar.f854b;
            objArr2[i13] = i9;
            ((int[]) dVar.f856d)[i13] = -2;
        }
        return i9;
    }

    @Override // X2.e, d8.b
    public final long j() {
        return this.f37733j.h();
    }

    @Override // X2.e, d8.a
    public final void k(c8.e descriptor) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        if (this.f37732h.f37539a.f37556b && descriptor.e() == 0) {
            while (c(descriptor) != -1) {
            }
        }
        H h9 = this.f37733j;
        if (h9.v()) {
            l.e(h9, "");
            throw null;
        }
        h9.g(this.i.f37753u);
        F.d dVar = (F.d) h9.f437v;
        int i = dVar.f854b;
        int[] iArr = (int[]) dVar.f856d;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            dVar.f854b = i - 1;
        }
        int i6 = dVar.f854b;
        if (i6 != -1) {
            dVar.f854b = i6 - 1;
        }
    }

    @Override // X2.e, d8.b
    public final boolean m() {
        i iVar = this.f37736m;
        if (!(iVar != null ? iVar.f37716b : false)) {
            H h9 = this.f37733j;
            int s9 = h9.s(h9.t());
            String str = (String) h9.f440y;
            int length = str.length() - s9;
            boolean z3 = false;
            if (length >= 4 && s9 != -1) {
                int i = 0;
                while (true) {
                    if (i < 4) {
                        if ("null".charAt(i) != str.charAt(s9 + i)) {
                            break;
                        }
                        i++;
                    } else if (length <= 4 || l.d(str.charAt(s9 + 4)) != 0) {
                        h9.f436u = s9 + 4;
                        z3 = true;
                    }
                }
            }
            if (!z3) {
                return true;
            }
        }
        return false;
    }

    @Override // X2.e, d8.b
    public final byte r() {
        H h9 = this.f37733j;
        long h10 = h9.h();
        byte b9 = (byte) h10;
        if (h10 == b9) {
            return b9;
        }
        H.m(h9, "Failed to parse byte for input '" + h10 + '\'', 0, 6);
        throw null;
    }

    @Override // X2.e, d8.b
    public final short t() {
        H h9 = this.f37733j;
        long h10 = h9.h();
        short s9 = (short) h10;
        if (h10 == s9) {
            return s9;
        }
        H.m(h9, "Failed to parse short for input '" + h10 + '\'', 0, 6);
        throw null;
    }

    @Override // X2.e, d8.b
    public final float u() {
        H h9 = this.f37733j;
        String j6 = h9.j();
        try {
            float parseFloat = Float.parseFloat(j6);
            f8.j jVar = this.f37732h.f37539a;
            if (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat)) {
                return parseFloat;
            }
            l.i(h9, Float.valueOf(parseFloat));
            throw null;
        } catch (IllegalArgumentException unused) {
            H.m(h9, u1.h.b('\'', "Failed to parse type 'float' for input '", j6), 0, 6);
            throw null;
        }
    }

    @Override // X2.e, d8.b
    public final double v() {
        H h9 = this.f37733j;
        String j6 = h9.j();
        try {
            double parseDouble = Double.parseDouble(j6);
            f8.j jVar = this.f37732h.f37539a;
            if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                return parseDouble;
            }
            l.i(h9, Double.valueOf(parseDouble));
            throw null;
        } catch (IllegalArgumentException unused) {
            H.m(h9, u1.h.b('\'', "Failed to parse type 'double' for input '", j6), 0, 6);
            throw null;
        }
    }
}
