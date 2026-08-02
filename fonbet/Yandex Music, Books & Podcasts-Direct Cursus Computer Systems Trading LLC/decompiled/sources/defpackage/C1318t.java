package defpackage;

import com.google.android.gms.common.api.Scope;
import com.yandex.pulse.metrics.o;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.util.Comparator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1318t implements Comparator {
    public static final C1318t b = new C1318t(0);
    public static final C1318t c = new C1318t(1);
    public static final C1318t d = new C1318t(2);
    public static final C1318t e = new C1318t(3);
    public static final C1318t f = new C1318t(4);
    public static final C1318t g = new C1318t(5);
    public static final C1318t h = new C1318t(6);
    public static final C1318t i = new C1318t(7);
    public static final C1318t j = new C1318t(8);
    public static final C1318t k = new C1318t(9);
    public static final C1318t l = new C1318t(10);
    public static final C1318t m = new C1318t(11);
    public static final C1318t n = new C1318t(12);
    public static final /* synthetic */ C1318t o = new C1318t(13);
    public final /* synthetic */ int a;

    public /* synthetic */ C1318t(int i2) {
        this.a = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                dpe dpeVar = (dpe) obj;
                dpe dpeVar2 = (dpe) obj2;
                dpeVar2.getClass();
                dpeVar.getClass();
                Long l2 = dpeVar.g;
                if (l2 == null) {
                    return -1;
                }
                long longValue = l2.longValue();
                Long l3 = dpeVar2.g;
                if (l3 != null) {
                    return (l3.longValue() > longValue ? 1 : (l3.longValue() == longValue ? 0 : -1));
                }
                return 1;
            case 1:
                long j2 = ((xs1) obj).b;
                long j3 = ((xs1) obj2).b;
                if (j2 == j3) {
                    return 0;
                }
                return j2 > j3 ? 1 : -1;
            case 2:
                dpe dpeVar3 = (dpe) obj;
                dpe dpeVar4 = (dpe) obj2;
                dpeVar4.getClass();
                dpeVar3.getClass();
                Long l4 = dpeVar3.g;
                if (l4 == null) {
                    return -1;
                }
                long longValue2 = l4.longValue();
                Long l5 = dpeVar4.g;
                if (l5 != null) {
                    return (l5.longValue() > longValue2 ? 1 : (l5.longValue() == longValue2 ? 0 : -1));
                }
                return 1;
            case 3:
                mgb mgbVar = (mgb) obj;
                mgb mgbVar2 = (mgb) obj2;
                mgbVar2.getClass();
                mgbVar.getClass();
                Long l6 = mgbVar.c;
                if (l6 == null) {
                    return -1;
                }
                long longValue3 = l6.longValue();
                Long l7 = mgbVar2.c;
                if (l7 != null) {
                    return (l7.longValue() > longValue3 ? 1 : (l7.longValue() == longValue3 ? 0 : -1));
                }
                return 1;
            case 4:
                dpc dpcVar = (dpc) obj;
                dpc dpcVar2 = (dpc) obj2;
                if (!ff7.G(dpcVar) || !ff7.G(dpcVar2)) {
                    if (ff7.G(dpcVar)) {
                        return -1;
                    }
                    return ff7.G(dpcVar2) ? 1 : 0;
                }
                mpf F = bcx.F(dpcVar);
                mpf F2 = bcx.F(dpcVar2);
                if (Intrinsics.d(F, F2)) {
                    return 0;
                }
                mpf[] mpfVarArr = new mpf[16];
                int i2 = 0;
                while (F != null) {
                    int i3 = i2 + 1;
                    if (mpfVarArr.length < i3) {
                        int length = mpfVarArr.length;
                        ?? r5 = new Object[Math.max(i3, length * 2)];
                        System.arraycopy(mpfVarArr, 0, r5, 0, length);
                        mpfVarArr = r5;
                    }
                    if (i2 != 0) {
                        System.arraycopy(mpfVarArr, 0, mpfVarArr, 0 + 1, i2 + 0);
                    }
                    mpfVarArr[0] = F;
                    i2++;
                    F = F.u();
                }
                mpf[] mpfVarArr2 = new mpf[16];
                int i4 = 0;
                while (F2 != null) {
                    int i5 = i4 + 1;
                    if (mpfVarArr2.length < i5) {
                        int length2 = mpfVarArr2.length;
                        ?? r52 = new Object[Math.max(i5, length2 * 2)];
                        System.arraycopy(mpfVarArr2, 0, r52, 0, length2);
                        mpfVarArr2 = r52;
                    }
                    if (i4 != 0) {
                        System.arraycopy(mpfVarArr2, 0, mpfVarArr2, 0 + 1, i4 + 0);
                    }
                    mpfVarArr2[0] = F2;
                    i4++;
                    F2 = F2.u();
                }
                int min = Math.min(i2 - 1, i4 - 1);
                if (min >= 0) {
                    int i6 = 0;
                    while (Intrinsics.d(mpfVarArr[i6], mpfVarArr2[i6])) {
                        if (i6 != min) {
                            i6++;
                        }
                    }
                    return Intrinsics.e(mpfVarArr[i6].v(), mpfVarArr2[i6].v());
                }
                xq0.q("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            case 5:
                opd opdVar = (opd) obj;
                opd opdVar2 = (opd) obj2;
                int i7 = opdVar.b;
                int i8 = opdVar.c;
                int i9 = opdVar.d;
                int i10 = opdVar.e;
                int i11 = ((i7 + i8) + i9) / i10;
                int i12 = opdVar2.b;
                int i13 = opdVar2.c;
                int i14 = opdVar2.d;
                int i15 = opdVar2.e;
                if (i11 < ((i12 + i13) + i14) / i15) {
                    return 1;
                }
                return ((i7 + i8) + i9) / i10 > ((i12 + i13) + i14) / i15 ? -1 : 0;
            case 6:
                ynn f2 = ((qfp) obj).f();
                ynn f3 = ((qfp) obj2).f();
                int compare = Float.compare(f2.a, f3.a);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(f2.b, f3.b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(f2.d, f3.d);
                return compare3 != 0 ? compare3 : Float.compare(f2.c, f3.c);
            case 7:
                return ((irh) obj).d.compareToIgnoreCase(((irh) obj2).d);
            case 8:
                return ((irh) obj).d.compareToIgnoreCase(((irh) obj2).d);
            case 9:
                return ((irh) obj).d.compareToIgnoreCase(((irh) obj2).d);
            case 10:
                mpf mpfVar = (mpf) obj;
                mpf mpfVar2 = (mpf) obj2;
                int e2 = Intrinsics.e(mpfVar2.p, mpfVar.p);
                return e2 != 0 ? e2 : Intrinsics.e(mpfVar.hashCode(), mpfVar2.hashCode());
            case 11:
                ynn f4 = ((qfp) obj).f();
                ynn f5 = ((qfp) obj2).f();
                int compare4 = Float.compare(f5.c, f4.c);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(f4.b, f5.b);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(f4.d, f5.d);
                return compare6 != 0 ? compare6 : Float.compare(f5.a, f4.a);
            case 12:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                int compare7 = Float.compare(((ynn) pair.a).b, ((ynn) pair2.a).b);
                return compare7 != 0 ? compare7 : Float.compare(((ynn) pair.a).d, ((ynn) pair2.a).d);
            case 13:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 14:
                return gl5.b(q7g.R(((kca) obj).a.b), q7g.R(((kca) obj2).a.b));
            case 15:
                return gl5.b(Long.valueOf(((kca) obj2).b), Long.valueOf(((kca) obj).b));
            case 16:
                zp2 zp2Var = (zp2) CollectionsKt.firstOrNull(((jja) obj).a.f);
                String R = q7g.R(zp2Var != null ? zp2Var.b : null);
                zp2 zp2Var2 = (zp2) CollectionsKt.firstOrNull(((jja) obj2).a.f);
                return gl5.b(R, q7g.R(zp2Var2 != null ? zp2Var2.b : null));
            case 17:
                return gl5.b(q7g.R(((jja) obj).a.c), q7g.R(((jja) obj2).a.c));
            case 18:
                return gl5.b(Long.valueOf(((jja) obj2).b), Long.valueOf(((jja) obj).b));
            case 19:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 20:
                return gl5.b(Integer.valueOf(((ln0) obj).b), Integer.valueOf(((ln0) obj2).b));
            case 21:
                return gl5.b(Integer.valueOf(((ln0) obj).b), Integer.valueOf(((ln0) obj2).b));
            case 22:
                InetAddress inetAddress = (InetAddress) obj;
                InetAddress inetAddress2 = (InetAddress) obj2;
                boolean z = inetAddress instanceof Inet4Address;
                if (z && (inetAddress2 instanceof Inet4Address)) {
                    return 0;
                }
                if ((inetAddress instanceof Inet6Address) && (inetAddress2 instanceof Inet6Address)) {
                    return 0;
                }
                return (z && (inetAddress2 instanceof Inet6Address)) ? -1 : 1;
            case 23:
                return gl5.b(Long.valueOf(((y62) obj).b.a), Long.valueOf(((y62) obj2).b.a));
            case 24:
                return gl5.b(Long.valueOf(((y62) obj).b.a), Long.valueOf(((y62) obj2).b.a));
            case 25:
                return gl5.b(q7g.R(((jja) obj).a.c), q7g.R(((jja) obj2).a.c));
            case 26:
                return gl5.b(Long.valueOf(((jja) obj2).b), Long.valueOf(((jja) obj).b));
            case 27:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                ByteBuffer byteBuffer2 = (ByteBuffer) obj2;
                if (byteBuffer.capacity() == byteBuffer2.capacity()) {
                    return 0;
                }
                return byteBuffer.capacity() > byteBuffer2.capacity() ? 1 : -1;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return gl5.b(Long.valueOf(((e24) obj2).e), Long.valueOf(((e24) obj).e));
            default:
                return gl5.b(((irh) obj2).d, ((irh) obj).d);
        }
    }
}
