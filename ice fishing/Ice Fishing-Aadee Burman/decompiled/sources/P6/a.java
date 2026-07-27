package P6;

import N6.o;
import N6.p;
import N6.q;
import N6.t;
import g6.InterfaceC4532b;
import h6.C4574a;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class a implements q, p {

    /* renamed from: b, reason: collision with root package name */
    public static final a f2560b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f2561c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f2562d = new a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final a f2563e = new a(3);

    /* renamed from: f, reason: collision with root package name */
    public static final a f2564f = new a(4);

    /* renamed from: g, reason: collision with root package name */
    public static final a f2565g = new a(5);

    /* renamed from: h, reason: collision with root package name */
    public static final a f2566h = new a(6);
    public static final a i = new a(7);

    /* renamed from: j, reason: collision with root package name */
    public static final a f2567j = new a(8);

    /* renamed from: k, reason: collision with root package name */
    public static final a f2568k = new a(9);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2569a;

    public /* synthetic */ a(int i6) {
        this.f2569a = i6;
    }

    @Override // N6.p
    public int a(Object obj, Object obj2, N6.j jVar) {
        int i6 = 0;
        a aVar = f2561c;
        switch (this.f2569a) {
            case 1:
                List list = (List) obj2;
                int ordinal = ((f6.b) obj).ordinal();
                if (ordinal != 4) {
                    if (ordinal == 5) {
                        return t.c(U6.b.f3212a, list, f2564f, jVar);
                    }
                    if (ordinal == 6) {
                        return t.c(U6.b.f3212a, list, i, jVar);
                    }
                    if (ordinal == 7) {
                        return t.c(U6.b.f3212a, list, f2565g, jVar);
                    }
                    throw new IllegalArgumentException("Unsupported attribute type.");
                }
                N6.b bVar = U6.b.f3212a;
                if (list.isEmpty()) {
                    return 0;
                }
                int i9 = bVar.f1955c;
                int i10 = 0;
                while (i6 < list.size()) {
                    Object obj3 = list.get(i6);
                    int b9 = jVar.b();
                    int d2 = t.d(U6.a.f3205a, (String) obj3, jVar);
                    jVar.f1978c[b9] = d2;
                    i10 += N6.d.b(d2) + i9 + d2;
                    i6++;
                }
                return i10;
            case 2:
                f6.b bVar2 = ((k6.e) obj).f38685a;
                switch (bVar2.ordinal()) {
                    case 0:
                        return t.d(U6.a.f3205a, (String) obj2, jVar);
                    case 1:
                        int i11 = U6.a.f3206b.f1955c;
                        ((Boolean) obj2).getClass();
                        int i12 = N6.d.f1961e;
                        return i11 + 1;
                    case 2:
                        return U6.a.f3207c.f1955c + N6.d.a(((Long) obj2).longValue());
                    case 3:
                        int i13 = U6.a.f3208d.f1955c;
                        ((Double) obj2).getClass();
                        int i14 = N6.d.f1961e;
                        return i13 + 8;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return t.b(U6.a.f3209e, bVar2, (List) obj2, aVar, jVar);
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
            case 3:
                k6.e eVar = (k6.e) obj;
                if (!eVar.f38686b.isEmpty()) {
                    byte[] bArr = eVar.f38688d;
                    if (bArr == null) {
                        bArr = eVar.f38686b.getBytes(StandardCharsets.UTF_8);
                        eVar.f38688d = bArr;
                    }
                    i6 = N6.k.b(U6.d.f3216a, bArr);
                }
                return t.b(U6.d.f3217b, eVar, obj2, f2562d, jVar) + i6;
            default:
                C4574a c4574a = (C4574a) obj;
                switch (AbstractC5049e.d(c4574a.f38019a)) {
                    case 0:
                        return t.d(U6.a.f3205a, (String) obj2, jVar);
                    case 1:
                        int i15 = U6.a.f3206b.f1955c;
                        ((Boolean) obj2).getClass();
                        int i16 = N6.d.f1961e;
                        return i15 + 1;
                    case 2:
                        return N6.d.a(((Long) obj2).longValue()) + U6.a.f3207c.f1955c;
                    case 3:
                        int i17 = U6.a.f3208d.f1955c;
                        ((Double) obj2).getClass();
                        int i18 = N6.d.f1961e;
                        return i17 + 8;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        N6.b bVar3 = U6.a.f3209e;
                        k6.e a9 = c4574a.a();
                        Objects.requireNonNull(a9);
                        return t.b(bVar3, a9.f38685a, (List) obj2, aVar, jVar);
                    case 8:
                        N6.b bVar4 = U6.a.f3210f;
                        int b10 = jVar.b();
                        int f3 = i.f(U6.e.f3218a, (InterfaceC4532b) obj2, jVar);
                        int b11 = N6.d.b(f3) + bVar4.f1955c + f3;
                        jVar.f1978c[b10] = f3;
                        return b11;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
        }
    }

    @Override // N6.p
    public void b(o oVar, Object obj, Object obj2, N6.j jVar) {
        switch (this.f2569a) {
            case 1:
                List list = (List) obj2;
                int ordinal = ((f6.b) obj).ordinal();
                if (ordinal == 4) {
                    oVar.l(U6.b.f3212a, list, f2568k, jVar);
                    return;
                }
                if (ordinal == 5) {
                    oVar.l(U6.b.f3212a, list, f2564f, jVar);
                    return;
                } else if (ordinal == 6) {
                    oVar.l(U6.b.f3212a, list, i, jVar);
                    return;
                } else {
                    if (ordinal != 7) {
                        throw new IllegalArgumentException("Unsupported attribute type.");
                    }
                    oVar.l(U6.b.f3212a, list, f2565g, jVar);
                    return;
                }
            case 2:
                f6.b bVar = ((k6.e) obj).f38685a;
                switch (bVar.ordinal()) {
                    case 0:
                        oVar.p(U6.a.f3205a, (String) obj2, jVar);
                        return;
                    case 1:
                        oVar.q(U6.a.f3206b, ((Boolean) obj2).booleanValue());
                        return;
                    case 2:
                        oVar.G(U6.a.f3207c, ((Long) obj2).longValue());
                        return;
                    case 3:
                        oVar.x(U6.a.f3208d, ((Double) obj2).doubleValue());
                        return;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        oVar.i(U6.a.f3209e, bVar, (List) obj2, f2561c, jVar);
                        return;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
            case 3:
                k6.e eVar = (k6.e) obj;
                if (eVar.f38686b.isEmpty()) {
                    N6.b bVar2 = U6.d.f3216a;
                    oVar.getClass();
                } else {
                    byte[] bArr = eVar.f38688d;
                    if (bArr == null) {
                        bArr = eVar.f38686b.getBytes(StandardCharsets.UTF_8);
                        eVar.f38688d = bArr;
                    }
                    oVar.n(U6.d.f3216a, bArr);
                }
                oVar.i(U6.d.f3217b, eVar, obj2, f2562d, jVar);
                return;
            default:
                C4574a c4574a = (C4574a) obj;
                switch (AbstractC5049e.d(c4574a.f38019a)) {
                    case 0:
                        oVar.p(U6.a.f3205a, (String) obj2, jVar);
                        return;
                    case 1:
                        oVar.q(U6.a.f3206b, ((Boolean) obj2).booleanValue());
                        return;
                    case 2:
                        oVar.G(U6.a.f3207c, ((Long) obj2).longValue());
                        return;
                    case 3:
                        oVar.x(U6.a.f3208d, ((Double) obj2).doubleValue());
                        return;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        N6.b bVar3 = U6.a.f3209e;
                        k6.e a9 = c4574a.a();
                        Objects.requireNonNull(a9);
                        p pVar = f2561c;
                        oVar.i(bVar3, a9.f38685a, (List) obj2, pVar, jVar);
                        return;
                    case 8:
                        N6.b bVar4 = U6.a.f3210f;
                        oVar.getClass();
                        oVar.K(bVar4, jVar.e());
                        i.e(oVar, U6.e.f3218a, (InterfaceC4532b) obj2, jVar);
                        oVar.z();
                        return;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
        }
    }

    @Override // N6.q
    public void c(o oVar, Object obj, N6.j jVar) {
        switch (this.f2569a) {
            case 0:
                f6.g gVar = (f6.g) obj;
                switch (AbstractC5049e.d(gVar.getType())) {
                    case 0:
                        oVar.p(U6.a.f3205a, (String) gVar.getValue(), jVar);
                        return;
                    case 1:
                        oVar.q(U6.a.f3206b, ((Boolean) gVar.getValue()).booleanValue());
                        return;
                    case 2:
                        oVar.G(U6.a.f3207c, ((Long) gVar.getValue()).longValue());
                        return;
                    case 3:
                        oVar.x(U6.a.f3208d, ((Double) gVar.getValue()).doubleValue());
                        return;
                    case 4:
                        N6.b bVar = U6.a.f3209e;
                        List list = (List) gVar.getValue();
                        oVar.K(bVar, jVar.e());
                        oVar.l(U6.b.f3212a, list, f2560b, jVar);
                        oVar.z();
                        return;
                    case 5:
                        N6.b bVar2 = U6.a.f3210f;
                        List list2 = (List) gVar.getValue();
                        oVar.K(bVar2, jVar.e());
                        oVar.l(U6.e.f3218a, list2, f2567j, jVar);
                        oVar.z();
                        return;
                    case 6:
                        oVar.w(U6.a.f3211g, (byte[]) jVar.c(byte[].class));
                        return;
                    default:
                        throw new IllegalArgumentException("Unsupported value type.");
                }
            case 1:
            case 2:
            case 3:
            case 6:
            default:
                oVar.p(U6.a.f3205a, (String) obj, jVar);
                return;
            case 4:
                oVar.q(U6.a.f3206b, ((Boolean) obj).booleanValue());
                return;
            case 5:
                oVar.x(U6.a.f3208d, ((Double) obj).doubleValue());
                return;
            case 7:
                oVar.G(U6.a.f3207c, ((Long) obj).longValue());
                return;
            case 8:
                f6.d dVar = (f6.d) obj;
                String str = dVar.f37523a;
                if (str.isEmpty()) {
                    N6.b bVar3 = U6.d.f3216a;
                } else {
                    oVar.p(U6.d.f3216a, str, jVar);
                }
                oVar.b(U6.d.f3217b, dVar.f37524b, jVar);
                return;
        }
    }

    @Override // N6.q
    public int d(Object obj, N6.j jVar) {
        int b9;
        switch (this.f2569a) {
            case 0:
                f6.g gVar = (f6.g) obj;
                switch (AbstractC5049e.d(gVar.getType())) {
                    case 0:
                        return t.d(U6.a.f3205a, (String) gVar.getValue(), jVar);
                    case 1:
                        Boolean bool = (Boolean) gVar.getValue();
                        int i6 = U6.a.f3206b.f1955c;
                        bool.getClass();
                        int i9 = N6.d.f1961e;
                        return i6 + 1;
                    case 2:
                        return U6.a.f3207c.f1955c + N6.d.a(((Long) gVar.getValue()).longValue());
                    case 3:
                        Double d2 = (Double) gVar.getValue();
                        int i10 = U6.a.f3208d.f1955c;
                        d2.getClass();
                        int i11 = N6.d.f1961e;
                        return i10 + 8;
                    case 4:
                        N6.b bVar = U6.a.f3209e;
                        List list = (List) gVar.getValue();
                        int b10 = jVar.b();
                        int c9 = t.c(U6.b.f3212a, list, f2560b, jVar);
                        b9 = N6.d.b(c9) + bVar.f1955c + c9;
                        jVar.f1978c[b10] = c9;
                        break;
                    case 5:
                        N6.b bVar2 = U6.a.f3210f;
                        List list2 = (List) gVar.getValue();
                        int b11 = jVar.b();
                        int c10 = t.c(U6.e.f3218a, list2, f2567j, jVar);
                        b9 = N6.d.b(c10) + bVar2.f1955c + c10;
                        jVar.f1978c[b11] = c10;
                        break;
                    case 6:
                        ByteBuffer byteBuffer = (ByteBuffer) gVar.getValue();
                        int remaining = byteBuffer.remaining();
                        byte[] bArr = new byte[remaining];
                        byteBuffer.get(bArr);
                        jVar.a(bArr);
                        return N6.d.b(remaining) + remaining + U6.a.f3211g.f1955c;
                    default:
                        throw new IllegalArgumentException("Unsupported value type.");
                }
                return b9;
            case 1:
            case 2:
            case 3:
            case 6:
            default:
                return t.d(U6.a.f3205a, (String) obj, jVar);
            case 4:
                int i12 = U6.a.f3206b.f1955c;
                ((Boolean) obj).getClass();
                int i13 = N6.d.f1961e;
                return i12 + 1;
            case 5:
                int i14 = U6.a.f3208d.f1955c;
                ((Double) obj).getClass();
                int i15 = N6.d.f1961e;
                return i14 + 8;
            case 7:
                return N6.d.a(((Long) obj).longValue()) + U6.a.f3207c.f1955c;
            case 8:
                f6.d dVar = (f6.d) obj;
                String str = dVar.f37523a;
                return t.a(U6.d.f3217b, dVar.f37524b, jVar) + (!str.isEmpty() ? t.d(U6.d.f3216a, str, jVar) : 0);
        }
    }
}
