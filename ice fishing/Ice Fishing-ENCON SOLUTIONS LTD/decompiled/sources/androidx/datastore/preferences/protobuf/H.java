package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final G f2319a;

    public H(n0 n0Var, p0 p0Var, H.k kVar) {
        this.f2319a = new G(n0Var, p0Var, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(G g2, Object obj, Object obj2) {
        int j02;
        int size;
        int h02;
        p0 p0Var;
        int size2;
        int h03;
        int i2 = 1;
        int i3 = r.f2434c;
        int f0 = C0113m.f0(1);
        o0 o0Var = r0.f2438d;
        n0 n0Var = g2.f2316a;
        if (n0Var == o0Var) {
            f0 *= 2;
        }
        switch (n0Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                j02 = 8;
                int i4 = j02 + f0;
                int f02 = C0113m.f0(2);
                p0Var = g2.f2317b;
                if (p0Var == o0Var) {
                    f02 *= 2;
                }
                switch (p0Var.ordinal()) {
                    case 0:
                        ((Double) obj2).getClass();
                        i2 = 8;
                        return i2 + f02 + i4;
                    case 1:
                        ((Float) obj2).getClass();
                        i2 = 4;
                        return i2 + f02 + i4;
                    case 2:
                        i2 = C0113m.j0(((Long) obj2).longValue());
                        return i2 + f02 + i4;
                    case 3:
                        i2 = C0113m.j0(((Long) obj2).longValue());
                        return i2 + f02 + i4;
                    case 4:
                        i2 = C0113m.j0(((Integer) obj2).intValue());
                        return i2 + f02 + i4;
                    case 5:
                        ((Long) obj2).getClass();
                        i2 = 8;
                        return i2 + f02 + i4;
                    case 6:
                        ((Integer) obj2).getClass();
                        i2 = 4;
                        return i2 + f02 + i4;
                    case 7:
                        ((Boolean) obj2).getClass();
                        return i2 + f02 + i4;
                    case 8:
                        if (!(obj2 instanceof C0107g)) {
                            i2 = C0113m.e0((String) obj2);
                            return i2 + f02 + i4;
                        }
                        size2 = ((C0107g) obj2).size();
                        h03 = C0113m.h0(size2);
                        i2 = h03 + size2;
                        return i2 + f02 + i4;
                    case 9:
                        i2 = ((AbstractC0122w) ((AbstractC0101a) obj2)).a(null);
                        return i2 + f02 + i4;
                    case 10:
                        size2 = ((AbstractC0122w) ((AbstractC0101a) obj2)).a(null);
                        h03 = C0113m.h0(size2);
                        i2 = h03 + size2;
                        return i2 + f02 + i4;
                    case 11:
                        if (obj2 instanceof C0107g) {
                            size2 = ((C0107g) obj2).size();
                            h03 = C0113m.h0(size2);
                        } else {
                            size2 = ((byte[]) obj2).length;
                            h03 = C0113m.h0(size2);
                        }
                        i2 = h03 + size2;
                        return i2 + f02 + i4;
                    case 12:
                        i2 = C0113m.h0(((Integer) obj2).intValue());
                        return i2 + f02 + i4;
                    case 13:
                        i2 = C0113m.j0(((Integer) obj2).intValue());
                        return i2 + f02 + i4;
                    case 14:
                        ((Integer) obj2).getClass();
                        i2 = 4;
                        return i2 + f02 + i4;
                    case 15:
                        ((Long) obj2).getClass();
                        i2 = 8;
                        return i2 + f02 + i4;
                    case 16:
                        int intValue = ((Integer) obj2).intValue();
                        i2 = C0113m.h0((intValue >> 31) ^ (intValue << 1));
                        return i2 + f02 + i4;
                    case 17:
                        long longValue = ((Long) obj2).longValue();
                        i2 = C0113m.j0((longValue >> 63) ^ (longValue << 1));
                        return i2 + f02 + i4;
                    default:
                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                }
            case 1:
                ((Float) obj).getClass();
                j02 = 4;
                int i42 = j02 + f0;
                int f022 = C0113m.f0(2);
                p0Var = g2.f2317b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 2:
                j02 = C0113m.j0(((Long) obj).longValue());
                int i422 = j02 + f0;
                int f0222 = C0113m.f0(2);
                p0Var = g2.f2317b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 3:
                j02 = C0113m.j0(((Long) obj).longValue());
                int i4222 = j02 + f0;
                int f02222 = C0113m.f0(2);
                p0Var = g2.f2317b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 4:
                j02 = C0113m.j0(((Integer) obj).intValue());
                int i42222 = j02 + f0;
                int f022222 = C0113m.f0(2);
                p0Var = g2.f2317b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 5:
                ((Long) obj).getClass();
                j02 = 8;
                int i422222 = j02 + f0;
                int f0222222 = C0113m.f0(2);
                p0Var = g2.f2317b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 6:
                ((Integer) obj).getClass();
                j02 = 4;
                int i4222222 = j02 + f0;
                int f02222222 = C0113m.f0(2);
                p0Var = g2.f2317b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 7:
                ((Boolean) obj).getClass();
                j02 = 1;
                int i42222222 = j02 + f0;
                int f022222222 = C0113m.f0(2);
                p0Var = g2.f2317b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 8:
                if (obj instanceof C0107g) {
                    size = ((C0107g) obj).size();
                    h02 = C0113m.h0(size);
                    j02 = size + h02;
                    int i422222222 = j02 + f0;
                    int f0222222222 = C0113m.f0(2);
                    p0Var = g2.f2317b;
                    if (p0Var == o0Var) {
                    }
                    switch (p0Var.ordinal()) {
                    }
                } else {
                    j02 = C0113m.e0((String) obj);
                    int i4222222222 = j02 + f0;
                    int f02222222222 = C0113m.f0(2);
                    p0Var = g2.f2317b;
                    if (p0Var == o0Var) {
                    }
                    switch (p0Var.ordinal()) {
                    }
                }
            case 9:
                j02 = ((AbstractC0122w) ((AbstractC0101a) obj)).a(null);
                int i42222222222 = j02 + f0;
                int f022222222222 = C0113m.f0(2);
                p0Var = g2.f2317b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 10:
                size = ((AbstractC0122w) ((AbstractC0101a) obj)).a(null);
                h02 = C0113m.h0(size);
                j02 = size + h02;
                int i422222222222 = j02 + f0;
                int f0222222222222 = C0113m.f0(2);
                p0Var = g2.f2317b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 11:
                if (obj instanceof C0107g) {
                    size = ((C0107g) obj).size();
                    h02 = C0113m.h0(size);
                } else {
                    size = ((byte[]) obj).length;
                    h02 = C0113m.h0(size);
                }
                j02 = size + h02;
                int i4222222222222 = j02 + f0;
                int f02222222222222 = C0113m.f0(2);
                p0Var = g2.f2317b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 12:
                j02 = C0113m.h0(((Integer) obj).intValue());
                int i42222222222222 = j02 + f0;
                int f022222222222222 = C0113m.f0(2);
                p0Var = g2.f2317b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 13:
                j02 = C0113m.j0(((Integer) obj).intValue());
                int i422222222222222 = j02 + f0;
                int f0222222222222222 = C0113m.f0(2);
                p0Var = g2.f2317b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 14:
                ((Integer) obj).getClass();
                j02 = 4;
                int i4222222222222222 = j02 + f0;
                int f02222222222222222 = C0113m.f0(2);
                p0Var = g2.f2317b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 15:
                ((Long) obj).getClass();
                j02 = 8;
                int i42222222222222222 = j02 + f0;
                int f022222222222222222 = C0113m.f0(2);
                p0Var = g2.f2317b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                j02 = C0113m.h0((intValue2 >> 31) ^ (intValue2 << 1));
                int i422222222222222222 = j02 + f0;
                int f0222222222222222222 = C0113m.f0(2);
                p0Var = g2.f2317b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            case 17:
                long longValue2 = ((Long) obj).longValue();
                j02 = C0113m.j0((longValue2 >> 63) ^ (longValue2 << 1));
                int i4222222222222222222 = j02 + f0;
                int f02222222222222222222 = C0113m.f0(2);
                p0Var = g2.f2317b;
                if (p0Var == o0Var) {
                }
                switch (p0Var.ordinal()) {
                }
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
