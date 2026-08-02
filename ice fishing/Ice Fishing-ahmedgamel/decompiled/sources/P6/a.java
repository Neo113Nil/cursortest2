package P6;

import N6.o;
import N6.p;
import N6.q;
import N6.t;
import g6.InterfaceC4536b;
import h6.C4579a;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class a implements q, p {

    /* renamed from: b, reason: collision with root package name */
    public static final a f2395b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f2396c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f2397d = new a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final a f2398e = new a(3);

    /* renamed from: f, reason: collision with root package name */
    public static final a f2399f = new a(4);

    /* renamed from: g, reason: collision with root package name */
    public static final a f2400g = new a(5);

    /* renamed from: h, reason: collision with root package name */
    public static final a f2401h = new a(6);
    public static final a i = new a(7);

    /* renamed from: j, reason: collision with root package name */
    public static final a f2402j = new a(8);

    /* renamed from: k, reason: collision with root package name */
    public static final a f2403k = new a(9);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2404a;

    public /* synthetic */ a(int i4) {
        this.f2404a = i4;
    }

    @Override // N6.p
    public int a(Object obj, Object obj2, N6.j jVar) {
        int i4 = 0;
        a aVar = f2396c;
        switch (this.f2404a) {
            case 1:
                List list = (List) obj2;
                int ordinal = ((f6.b) obj).ordinal();
                if (ordinal != 4) {
                    if (ordinal == 5) {
                        return t.c(U6.b.f3335a, list, f2399f, jVar);
                    }
                    if (ordinal == 6) {
                        return t.c(U6.b.f3335a, list, i, jVar);
                    }
                    if (ordinal == 7) {
                        return t.c(U6.b.f3335a, list, f2400g, jVar);
                    }
                    throw new IllegalArgumentException("Unsupported attribute type.");
                }
                N6.b bVar = U6.b.f3335a;
                if (list.isEmpty()) {
                    return 0;
                }
                int i6 = bVar.f2043c;
                int i9 = 0;
                while (i4 < list.size()) {
                    Object obj3 = list.get(i4);
                    int b9 = jVar.b();
                    int d9 = t.d(U6.a.f3328a, (String) obj3, jVar);
                    jVar.f2066c[b9] = d9;
                    i9 += N6.d.b(d9) + i6 + d9;
                    i4++;
                }
                return i9;
            case 2:
                f6.b bVar2 = ((k6.e) obj).f38612a;
                switch (bVar2.ordinal()) {
                    case 0:
                        return t.d(U6.a.f3328a, (String) obj2, jVar);
                    case 1:
                        int i10 = U6.a.f3329b.f2043c;
                        ((Boolean) obj2).getClass();
                        int i11 = N6.d.f2049e;
                        return i10 + 1;
                    case 2:
                        return U6.a.f3330c.f2043c + N6.d.a(((Long) obj2).longValue());
                    case 3:
                        int i12 = U6.a.f3331d.f2043c;
                        ((Double) obj2).getClass();
                        int i13 = N6.d.f2049e;
                        return i12 + 8;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return t.b(U6.a.f3332e, bVar2, (List) obj2, aVar, jVar);
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
            case 3:
                k6.e eVar = (k6.e) obj;
                if (!eVar.f38613b.isEmpty()) {
                    byte[] bArr = eVar.f38615d;
                    if (bArr == null) {
                        bArr = eVar.f38613b.getBytes(StandardCharsets.UTF_8);
                        eVar.f38615d = bArr;
                    }
                    i4 = N6.k.b(U6.d.f3339a, bArr);
                }
                return t.b(U6.d.f3340b, eVar, obj2, f2397d, jVar) + i4;
            default:
                C4579a c4579a = (C4579a) obj;
                switch (AbstractC5050e.d(c4579a.f38136a)) {
                    case 0:
                        return t.d(U6.a.f3328a, (String) obj2, jVar);
                    case 1:
                        int i14 = U6.a.f3329b.f2043c;
                        ((Boolean) obj2).getClass();
                        int i15 = N6.d.f2049e;
                        return i14 + 1;
                    case 2:
                        return N6.d.a(((Long) obj2).longValue()) + U6.a.f3330c.f2043c;
                    case 3:
                        int i16 = U6.a.f3331d.f2043c;
                        ((Double) obj2).getClass();
                        int i17 = N6.d.f2049e;
                        return i16 + 8;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        N6.b bVar3 = U6.a.f3332e;
                        k6.e a9 = c4579a.a();
                        Objects.requireNonNull(a9);
                        return t.b(bVar3, a9.f38612a, (List) obj2, aVar, jVar);
                    case 8:
                        N6.b bVar4 = U6.a.f3333f;
                        int b10 = jVar.b();
                        int f2 = i.f(U6.e.f3341a, (InterfaceC4536b) obj2, jVar);
                        int b11 = N6.d.b(f2) + bVar4.f2043c + f2;
                        jVar.f2066c[b10] = f2;
                        return b11;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
        }
    }

    @Override // N6.p
    public void b(o oVar, Object obj, Object obj2, N6.j jVar) {
        switch (this.f2404a) {
            case 1:
                List list = (List) obj2;
                int ordinal = ((f6.b) obj).ordinal();
                if (ordinal == 4) {
                    oVar.l(U6.b.f3335a, list, f2403k, jVar);
                    return;
                }
                if (ordinal == 5) {
                    oVar.l(U6.b.f3335a, list, f2399f, jVar);
                    return;
                } else if (ordinal == 6) {
                    oVar.l(U6.b.f3335a, list, i, jVar);
                    return;
                } else {
                    if (ordinal != 7) {
                        throw new IllegalArgumentException("Unsupported attribute type.");
                    }
                    oVar.l(U6.b.f3335a, list, f2400g, jVar);
                    return;
                }
            case 2:
                f6.b bVar = ((k6.e) obj).f38612a;
                switch (bVar.ordinal()) {
                    case 0:
                        oVar.p(U6.a.f3328a, (String) obj2, jVar);
                        return;
                    case 1:
                        oVar.q(U6.a.f3329b, ((Boolean) obj2).booleanValue());
                        return;
                    case 2:
                        oVar.G(U6.a.f3330c, ((Long) obj2).longValue());
                        return;
                    case 3:
                        oVar.x(U6.a.f3331d, ((Double) obj2).doubleValue());
                        return;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        oVar.i(U6.a.f3332e, bVar, (List) obj2, f2396c, jVar);
                        return;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
            case 3:
                k6.e eVar = (k6.e) obj;
                if (eVar.f38613b.isEmpty()) {
                    N6.b bVar2 = U6.d.f3339a;
                    oVar.getClass();
                } else {
                    byte[] bArr = eVar.f38615d;
                    if (bArr == null) {
                        bArr = eVar.f38613b.getBytes(StandardCharsets.UTF_8);
                        eVar.f38615d = bArr;
                    }
                    oVar.n(U6.d.f3339a, bArr);
                }
                oVar.i(U6.d.f3340b, eVar, obj2, f2397d, jVar);
                return;
            default:
                C4579a c4579a = (C4579a) obj;
                switch (AbstractC5050e.d(c4579a.f38136a)) {
                    case 0:
                        oVar.p(U6.a.f3328a, (String) obj2, jVar);
                        return;
                    case 1:
                        oVar.q(U6.a.f3329b, ((Boolean) obj2).booleanValue());
                        return;
                    case 2:
                        oVar.G(U6.a.f3330c, ((Long) obj2).longValue());
                        return;
                    case 3:
                        oVar.x(U6.a.f3331d, ((Double) obj2).doubleValue());
                        return;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        N6.b bVar3 = U6.a.f3332e;
                        k6.e a9 = c4579a.a();
                        Objects.requireNonNull(a9);
                        p pVar = f2396c;
                        oVar.i(bVar3, a9.f38612a, (List) obj2, pVar, jVar);
                        return;
                    case 8:
                        N6.b bVar4 = U6.a.f3333f;
                        oVar.getClass();
                        oVar.K(bVar4, jVar.e());
                        i.e(oVar, U6.e.f3341a, (InterfaceC4536b) obj2, jVar);
                        oVar.z();
                        return;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
        }
    }

    @Override // N6.q
    public void c(o oVar, Object obj, N6.j jVar) {
        switch (this.f2404a) {
            case 0:
                f6.g gVar = (f6.g) obj;
                switch (AbstractC5050e.d(gVar.getType())) {
                    case 0:
                        oVar.p(U6.a.f3328a, (String) gVar.getValue(), jVar);
                        return;
                    case 1:
                        oVar.q(U6.a.f3329b, ((Boolean) gVar.getValue()).booleanValue());
                        return;
                    case 2:
                        oVar.G(U6.a.f3330c, ((Long) gVar.getValue()).longValue());
                        return;
                    case 3:
                        oVar.x(U6.a.f3331d, ((Double) gVar.getValue()).doubleValue());
                        return;
                    case 4:
                        N6.b bVar = U6.a.f3332e;
                        List list = (List) gVar.getValue();
                        oVar.K(bVar, jVar.e());
                        oVar.l(U6.b.f3335a, list, f2395b, jVar);
                        oVar.z();
                        return;
                    case 5:
                        N6.b bVar2 = U6.a.f3333f;
                        List list2 = (List) gVar.getValue();
                        oVar.K(bVar2, jVar.e());
                        oVar.l(U6.e.f3341a, list2, f2402j, jVar);
                        oVar.z();
                        return;
                    case 6:
                        oVar.w(U6.a.f3334g, (byte[]) jVar.c(byte[].class));
                        return;
                    default:
                        throw new IllegalArgumentException("Unsupported value type.");
                }
            case 1:
            case 2:
            case 3:
            case 6:
            default:
                oVar.p(U6.a.f3328a, (String) obj, jVar);
                return;
            case 4:
                oVar.q(U6.a.f3329b, ((Boolean) obj).booleanValue());
                return;
            case 5:
                oVar.x(U6.a.f3331d, ((Double) obj).doubleValue());
                return;
            case 7:
                oVar.G(U6.a.f3330c, ((Long) obj).longValue());
                return;
            case 8:
                f6.d dVar = (f6.d) obj;
                String str = dVar.f37485a;
                if (str.isEmpty()) {
                    N6.b bVar3 = U6.d.f3339a;
                } else {
                    oVar.p(U6.d.f3339a, str, jVar);
                }
                oVar.b(U6.d.f3340b, dVar.f37486b, jVar);
                return;
        }
    }

    @Override // N6.q
    public int d(Object obj, N6.j jVar) {
        int b9;
        switch (this.f2404a) {
            case 0:
                f6.g gVar = (f6.g) obj;
                switch (AbstractC5050e.d(gVar.getType())) {
                    case 0:
                        return t.d(U6.a.f3328a, (String) gVar.getValue(), jVar);
                    case 1:
                        Boolean bool = (Boolean) gVar.getValue();
                        int i4 = U6.a.f3329b.f2043c;
                        bool.getClass();
                        int i6 = N6.d.f2049e;
                        return i4 + 1;
                    case 2:
                        return U6.a.f3330c.f2043c + N6.d.a(((Long) gVar.getValue()).longValue());
                    case 3:
                        Double d9 = (Double) gVar.getValue();
                        int i9 = U6.a.f3331d.f2043c;
                        d9.getClass();
                        int i10 = N6.d.f2049e;
                        return i9 + 8;
                    case 4:
                        N6.b bVar = U6.a.f3332e;
                        List list = (List) gVar.getValue();
                        int b10 = jVar.b();
                        int c9 = t.c(U6.b.f3335a, list, f2395b, jVar);
                        b9 = N6.d.b(c9) + bVar.f2043c + c9;
                        jVar.f2066c[b10] = c9;
                        break;
                    case 5:
                        N6.b bVar2 = U6.a.f3333f;
                        List list2 = (List) gVar.getValue();
                        int b11 = jVar.b();
                        int c10 = t.c(U6.e.f3341a, list2, f2402j, jVar);
                        b9 = N6.d.b(c10) + bVar2.f2043c + c10;
                        jVar.f2066c[b11] = c10;
                        break;
                    case 6:
                        ByteBuffer byteBuffer = (ByteBuffer) gVar.getValue();
                        int remaining = byteBuffer.remaining();
                        byte[] bArr = new byte[remaining];
                        byteBuffer.get(bArr);
                        jVar.a(bArr);
                        return N6.d.b(remaining) + remaining + U6.a.f3334g.f2043c;
                    default:
                        throw new IllegalArgumentException("Unsupported value type.");
                }
                return b9;
            case 1:
            case 2:
            case 3:
            case 6:
            default:
                return t.d(U6.a.f3328a, (String) obj, jVar);
            case 4:
                int i11 = U6.a.f3329b.f2043c;
                ((Boolean) obj).getClass();
                int i12 = N6.d.f2049e;
                return i11 + 1;
            case 5:
                int i13 = U6.a.f3331d.f2043c;
                ((Double) obj).getClass();
                int i14 = N6.d.f2049e;
                return i13 + 8;
            case 7:
                return N6.d.a(((Long) obj).longValue()) + U6.a.f3330c.f2043c;
            case 8:
                f6.d dVar = (f6.d) obj;
                String str = dVar.f37485a;
                return t.a(U6.d.f3340b, dVar.f37486b, jVar) + (!str.isEmpty() ? t.d(U6.d.f3339a, str, jVar) : 0);
        }
    }
}
