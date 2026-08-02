package g8;

import D.G;
import N3.C;
import b8.C0538b;
import b8.InterfaceC0537a;
import f8.AbstractC4526c;
import i1.C4585b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import v7.AbstractC5119j;
import v7.AbstractC5120k;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class p extends C implements d8.b, d8.a {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC4526c f37757b;

    /* renamed from: c, reason: collision with root package name */
    public final t f37758c;

    /* renamed from: d, reason: collision with root package name */
    public final G f37759d;

    /* renamed from: e, reason: collision with root package name */
    public int f37760e;

    /* renamed from: f, reason: collision with root package name */
    public final f8.j f37761f;

    /* renamed from: g, reason: collision with root package name */
    public final i f37762g;

    public p(AbstractC4526c json, t tVar, G g9, c8.e descriptor) {
        kotlin.jvm.internal.h.e(json, "json");
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        this.f37757b = json;
        this.f37758c = tVar;
        this.f37759d = g9;
        this.f37760e = -1;
        f8.j jVar = json.f37501a;
        this.f37761f = jVar;
        this.f37762g = jVar.f37519c ? null : new i(descriptor);
    }

    @Override // N3.C
    public final Object E(InterfaceC0537a deserializer) {
        kotlin.jvm.internal.h.e(deserializer, "deserializer");
        try {
            return deserializer.b(this);
        } catch (C0538b e9) {
            String message = e9.getMessage();
            kotlin.jvm.internal.h.b(message);
            if (Q7.j.k0(message, "at path", false)) {
                throw e9;
            }
            String str = e9.getMessage() + " at path: " + ((F.d) this.f37759d.f334v).f();
            kotlin.jvm.internal.h.e(null, "missingFields");
            throw new C0538b(str, e9);
        }
    }

    public final f8.l X() {
        return new I1.a(this.f37757b.f37501a, this.f37759d).i();
    }

    @Override // N3.C, d8.b
    public final boolean a() {
        boolean z6;
        boolean z9;
        G g9 = this.f37759d;
        int t6 = g9.t();
        String str = (String) g9.f337y;
        if (t6 == str.length()) {
            G.n(g9, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(t6) == '\"') {
            t6++;
            z6 = true;
        } else {
            z6 = false;
        }
        int s9 = g9.s(t6);
        if (s9 >= str.length() || s9 == -1) {
            G.n(g9, "EOF", 0, 6);
            throw null;
        }
        int i = s9 + 1;
        int charAt = str.charAt(s9) | ' ';
        if (charAt == 102) {
            g9.c(i, "alse");
            z9 = false;
        } else {
            if (charAt != 116) {
                G.n(g9, "Expected valid boolean literal prefix, but had '" + g9.j() + '\'', 0, 6);
                throw null;
            }
            g9.c(i, "rue");
            z9 = true;
        }
        if (!z6) {
            return z9;
        }
        if (g9.f333u == str.length()) {
            G.n(g9, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(g9.f333u) == '\"') {
            g9.f333u++;
            return z9;
        }
        G.n(g9, "Expected closing quotation mark", 0, 6);
        throw null;
    }

    @Override // N3.C, d8.b
    public final char b() {
        G g9 = this.f37759d;
        String j6 = g9.j();
        if (j6.length() == 1) {
            return j6.charAt(0);
        }
        G.n(g9, AbstractC5128c.b('\'', "Expected single char, but got '", j6), 0, 6);
        throw null;
    }

    @Override // d8.a
    public final int c(c8.e descriptor) {
        byte b9;
        byte b10;
        Object invoke;
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        t tVar = this.f37758c;
        int ordinal = tVar.ordinal();
        G g9 = this.f37759d;
        byte b11 = 1;
        int i = 0;
        r7 = false;
        boolean z6 = false;
        Throwable th = null;
        char c9 = ':';
        AbstractC4526c json = this.f37757b;
        int i4 = -1;
        F.d dVar = (F.d) g9.f334v;
        if (ordinal == 0) {
            boolean v9 = g9.v();
            while (true) {
                boolean b12 = g9.b();
                Throwable th2 = th;
                i iVar = this.f37762g;
                if (b12) {
                    f8.j jVar = this.f37761f;
                    String name = g9.d();
                    g9.g(c9);
                    kotlin.jvm.internal.h.e(descriptor, "<this>");
                    kotlin.jvm.internal.h.e(json, "json");
                    kotlin.jvm.internal.h.e(name, "name");
                    l.g(descriptor, json);
                    int c10 = descriptor.c(name);
                    if (c10 == -3 && json.f37501a.f37520d) {
                        m mVar = l.f37744a;
                        k kVar = new k(descriptor, json);
                        C4585b c4585b = json.f37503c;
                        c4585b.getClass();
                        c4585b.getClass();
                        b9 = b11;
                        kotlin.jvm.internal.h.e(descriptor, "descriptor");
                        Map map = (Map) ((ConcurrentHashMap) c4585b.f38152u).get(descriptor);
                        Object obj = map != null ? map.get(mVar) : null;
                        Object obj2 = obj != null ? obj : null;
                        if (obj2 != null) {
                            invoke = obj2;
                        } else {
                            invoke = kVar.invoke();
                            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c4585b.f38152u;
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
                            e8.r rVar = iVar.f37740a;
                            if (c10 < 64) {
                                rVar.f37393c |= 1 << c10;
                            } else {
                                int i6 = (c10 >>> 6) - 1;
                                long[] jArr = rVar.f37394d;
                                jArr[i6] = jArr[i6] | (1 << (c10 & 63));
                            }
                        }
                        i4 = c10;
                    } else {
                        boolean z9 = jVar.f37518b;
                        String str = (String) g9.f337y;
                        if (!z9) {
                            g9.m(Q7.j.t0(6, str.subSequence(0, g9.f333u).toString(), name), AbstractC5128c.b('\'', "Encountered an unknown key '", name), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                            throw th2;
                        }
                        ArrayList arrayList = new ArrayList();
                        byte r9 = g9.r();
                        if (r9 == 8 || r9 == 6) {
                            while (true) {
                                byte r10 = g9.r();
                                b10 = b9;
                                if (r10 == b10) {
                                    g9.d();
                                } else {
                                    if (r10 == 8 || r10 == 6) {
                                        arrayList.add(Byte.valueOf(r10));
                                    } else if (r10 == 9) {
                                        if (((Number) AbstractC5119j.D(arrayList)).byteValue() != 8) {
                                            throw l.b(g9.f333u, str, "found ] instead of } at path: " + dVar);
                                        }
                                        if (arrayList.isEmpty()) {
                                            throw new NoSuchElementException("List is empty.");
                                        }
                                        arrayList.remove(AbstractC5120k.s(arrayList));
                                    } else if (r10 == 7) {
                                        if (((Number) AbstractC5119j.D(arrayList)).byteValue() != 6) {
                                            throw l.b(g9.f333u, str, "found } instead of ] at path: " + dVar);
                                        }
                                        if (arrayList.isEmpty()) {
                                            throw new NoSuchElementException("List is empty.");
                                        }
                                        arrayList.remove(AbstractC5120k.s(arrayList));
                                    } else if (r10 == 10) {
                                        G.n(g9, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, 6);
                                        throw th2;
                                    }
                                    g9.e();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                }
                                b9 = b10;
                            }
                        } else {
                            g9.j();
                            b10 = b9;
                        }
                        v9 = g9.v();
                        b11 = b10;
                        th = th2;
                        i = 0;
                        c9 = ':';
                    }
                } else {
                    if (v9) {
                        f8.j jVar2 = json.f37501a;
                        l.e(g9, "object");
                        throw th2;
                    }
                    if (iVar != null) {
                        e8.r rVar2 = iVar.f37740a;
                        c8.e eVar = rVar2.f37391a;
                        int e9 = eVar.e();
                        while (true) {
                            long j6 = rVar2.f37393c;
                            long j9 = -1;
                            h hVar = rVar2.f37392b;
                            if (j6 != -1) {
                                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j6);
                                rVar2.f37393c |= 1 << numberOfTrailingZeros;
                                hVar.invoke(eVar, Integer.valueOf(numberOfTrailingZeros));
                                if (Boolean.FALSE.booleanValue()) {
                                    i4 = numberOfTrailingZeros;
                                    break;
                                }
                            } else if (e9 > 64) {
                                long[] jArr2 = rVar2.f37394d;
                                int length = jArr2.length;
                                loop3: while (i < length) {
                                    int i9 = i + 1;
                                    int i10 = i9 * 64;
                                    long j10 = jArr2[i];
                                    while (j10 != j9) {
                                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j10);
                                        j10 |= 1 << numberOfTrailingZeros2;
                                        int i11 = numberOfTrailingZeros2 + i10;
                                        hVar.invoke(eVar, Integer.valueOf(i11));
                                        if (Boolean.FALSE.booleanValue()) {
                                            jArr2[i] = j10;
                                            i4 = i11;
                                            break loop3;
                                        }
                                        j9 = -1;
                                    }
                                    jArr2[i] = j10;
                                    i = i9;
                                    j9 = -1;
                                }
                            }
                        }
                    }
                    i4 = -1;
                }
            }
        } else if (ordinal != 2) {
            boolean v10 = g9.v();
            if (g9.b()) {
                int i12 = this.f37760e;
                if (i12 != -1 && !v10) {
                    G.n(g9, "Expected end of the array or comma", 0, 6);
                    throw null;
                }
                i4 = i12 + 1;
                this.f37760e = i4;
            } else if (v10) {
                f8.j jVar3 = json.f37501a;
                l.e(g9, "array");
                throw null;
            }
        } else {
            int i13 = this.f37760e;
            boolean z10 = i13 % 2 != 0;
            if (!z10) {
                g9.g(':');
            } else if (i13 != -1) {
                z6 = g9.v();
            }
            if (g9.b()) {
                if (z10) {
                    if (this.f37760e == -1) {
                        int i14 = g9.f333u;
                        if (z6) {
                            G.n(g9, "Unexpected leading comma", i14, 4);
                            throw null;
                        }
                    } else {
                        int i15 = g9.f333u;
                        if (!z6) {
                            G.n(g9, "Expected comma after the key-value pair", i15, 4);
                            throw null;
                        }
                    }
                }
                i4 = this.f37760e + 1;
                this.f37760e = i4;
            } else if (z6) {
                f8.j jVar4 = json.f37501a;
                l.e(g9, "object");
                throw null;
            }
        }
        if (tVar != t.f37775x) {
            ((int[]) dVar.f919d)[dVar.f917b] = i4;
        }
        return i4;
    }

    @Override // N3.C, d8.b
    public final d8.b d(c8.e descriptor) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        return r.a(descriptor) ? new f(this.f37759d, this.f37757b) : this;
    }

    @Override // N3.C, d8.b
    public final int e() {
        G g9 = this.f37759d;
        long h3 = g9.h();
        int i = (int) h3;
        if (h3 == i) {
            return i;
        }
        G.n(g9, "Failed to parse int for input '" + h3 + '\'', 0, 6);
        throw null;
    }

    @Override // N3.C, d8.b
    public final String g() {
        return this.f37759d.i();
    }

    @Override // N3.C, d8.b
    public final d8.a h(c8.e descriptor) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        AbstractC4526c abstractC4526c = this.f37757b;
        t h3 = l.h(descriptor, abstractC4526c);
        G g9 = this.f37759d;
        F.d dVar = (F.d) g9.f334v;
        int i = dVar.f917b + 1;
        dVar.f917b = i;
        Object[] objArr = (Object[]) dVar.f918c;
        if (i == objArr.length) {
            int i4 = i * 2;
            Object[] copyOf = Arrays.copyOf(objArr, i4);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            dVar.f918c = copyOf;
            int[] copyOf2 = Arrays.copyOf((int[]) dVar.f919d, i4);
            kotlin.jvm.internal.h.d(copyOf2, "copyOf(...)");
            dVar.f919d = copyOf2;
        }
        ((Object[]) dVar.f918c)[i] = descriptor;
        g9.g(h3.f37778n);
        if (g9.r() != 4) {
            int ordinal = h3.ordinal();
            return (ordinal == 1 || ordinal == 2 || ordinal == 3) ? new p(abstractC4526c, h3, g9, descriptor) : (this.f37758c == h3 && abstractC4526c.f37501a.f37519c) ? this : new p(abstractC4526c, h3, g9, descriptor);
        }
        G.n(g9, "Unexpected leading comma", 0, 6);
        throw null;
    }

    @Override // N3.C, d8.a
    public final Object i(c8.e descriptor, int i, InterfaceC0537a deserializer, Object obj) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        kotlin.jvm.internal.h.e(deserializer, "deserializer");
        boolean z6 = this.f37758c == t.f37775x && (i & 1) == 0;
        F.d dVar = (F.d) this.f37759d.f334v;
        if (z6) {
            int[] iArr = (int[]) dVar.f919d;
            int i4 = dVar.f917b;
            if (iArr[i4] == -2) {
                ((Object[]) dVar.f918c)[i4] = m.f37745a;
            }
        }
        Object i6 = super.i(descriptor, i, deserializer, obj);
        if (z6) {
            int[] iArr2 = (int[]) dVar.f919d;
            int i9 = dVar.f917b;
            if (iArr2[i9] != -2) {
                int i10 = i9 + 1;
                dVar.f917b = i10;
                Object[] objArr = (Object[]) dVar.f918c;
                if (i10 == objArr.length) {
                    int i11 = i10 * 2;
                    Object[] copyOf = Arrays.copyOf(objArr, i11);
                    kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
                    dVar.f918c = copyOf;
                    int[] copyOf2 = Arrays.copyOf((int[]) dVar.f919d, i11);
                    kotlin.jvm.internal.h.d(copyOf2, "copyOf(...)");
                    dVar.f919d = copyOf2;
                }
            }
            Object[] objArr2 = (Object[]) dVar.f918c;
            int i12 = dVar.f917b;
            objArr2[i12] = i6;
            ((int[]) dVar.f919d)[i12] = -2;
        }
        return i6;
    }

    @Override // N3.C, d8.b
    public final long j() {
        return this.f37759d.h();
    }

    @Override // N3.C, d8.a
    public final void k(c8.e descriptor) {
        kotlin.jvm.internal.h.e(descriptor, "descriptor");
        if (this.f37757b.f37501a.f37518b && descriptor.e() == 0) {
            while (c(descriptor) != -1) {
            }
        }
        G g9 = this.f37759d;
        if (g9.v()) {
            l.e(g9, "");
            throw null;
        }
        g9.g(this.f37758c.f37779u);
        F.d dVar = (F.d) g9.f334v;
        int i = dVar.f917b;
        int[] iArr = (int[]) dVar.f919d;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            dVar.f917b = i - 1;
        }
        int i4 = dVar.f917b;
        if (i4 != -1) {
            dVar.f917b = i4 - 1;
        }
    }

    @Override // N3.C, d8.b
    public final boolean m() {
        i iVar = this.f37762g;
        if (!(iVar != null ? iVar.f37741b : false)) {
            G g9 = this.f37759d;
            int s9 = g9.s(g9.t());
            String str = (String) g9.f337y;
            int length = str.length() - s9;
            boolean z6 = false;
            if (length >= 4 && s9 != -1) {
                int i = 0;
                while (true) {
                    if (i < 4) {
                        if ("null".charAt(i) != str.charAt(s9 + i)) {
                            break;
                        }
                        i++;
                    } else if (length <= 4 || l.d(str.charAt(s9 + 4)) != 0) {
                        g9.f333u = s9 + 4;
                        z6 = true;
                    }
                }
            }
            if (!z6) {
                return true;
            }
        }
        return false;
    }

    @Override // N3.C, d8.b
    public final byte r() {
        G g9 = this.f37759d;
        long h3 = g9.h();
        byte b9 = (byte) h3;
        if (h3 == b9) {
            return b9;
        }
        G.n(g9, "Failed to parse byte for input '" + h3 + '\'', 0, 6);
        throw null;
    }

    @Override // N3.C, d8.b
    public final short t() {
        G g9 = this.f37759d;
        long h3 = g9.h();
        short s9 = (short) h3;
        if (h3 == s9) {
            return s9;
        }
        G.n(g9, "Failed to parse short for input '" + h3 + '\'', 0, 6);
        throw null;
    }

    @Override // N3.C, d8.b
    public final float u() {
        G g9 = this.f37759d;
        String j6 = g9.j();
        try {
            float parseFloat = Float.parseFloat(j6);
            f8.j jVar = this.f37757b.f37501a;
            if (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat)) {
                return parseFloat;
            }
            l.i(g9, Float.valueOf(parseFloat));
            throw null;
        } catch (IllegalArgumentException unused) {
            G.n(g9, AbstractC5128c.b('\'', "Failed to parse type 'float' for input '", j6), 0, 6);
            throw null;
        }
    }

    @Override // N3.C, d8.b
    public final double v() {
        G g9 = this.f37759d;
        String j6 = g9.j();
        try {
            double parseDouble = Double.parseDouble(j6);
            f8.j jVar = this.f37757b.f37501a;
            if (!Double.isInfinite(parseDouble) && !Double.isNaN(parseDouble)) {
                return parseDouble;
            }
            l.i(g9, Double.valueOf(parseDouble));
            throw null;
        } catch (IllegalArgumentException unused) {
            G.n(g9, AbstractC5128c.b('\'', "Failed to parse type 'double' for input '", j6), 0, 6);
            throw null;
        }
    }
}
