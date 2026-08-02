package defpackage;

/* loaded from: classes3.dex */
public final class nkt {
    public static lkt a(Object obj) {
        o3d o3dVar = (o3d) obj;
        lkt lktVar = o3dVar.unknownFields;
        if (lktVar != lkt.f) {
            return lktVar;
        }
        lkt lktVar2 = new lkt();
        o3dVar.unknownFields = lktVar2;
        return lktVar2;
    }

    public static boolean b(int i, n8n n8nVar, Object obj) {
        qr4 qr4Var = (qr4) n8nVar.e;
        int i2 = n8nVar.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            n8nVar.C0(0);
            ((lkt) obj).f(i3 << 3, Long.valueOf(qr4Var.r()));
            return true;
        }
        if (i4 == 1) {
            n8nVar.C0(1);
            ((lkt) obj).f((i3 << 3) | 1, Long.valueOf(qr4Var.o()));
            return true;
        }
        if (i4 == 2) {
            ((lkt) obj).f((i3 << 3) | 2, n8nVar.v());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                throw bye.a();
            }
            if (i4 != 5) {
                throw bye.d();
            }
            n8nVar.C0(5);
            ((lkt) obj).f(5 | (i3 << 3), Integer.valueOf(qr4Var.n()));
            return true;
        }
        lkt lktVar = new lkt();
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new bye("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (n8nVar.h() != Integer.MAX_VALUE && b(i7, n8nVar, lktVar)) {
        }
        if (i6 != n8nVar.b) {
            throw bye.a();
        }
        if (lktVar.e) {
            lktVar.e = false;
        }
        ((lkt) obj).f(i5 | 3, lktVar);
        return true;
    }
}
