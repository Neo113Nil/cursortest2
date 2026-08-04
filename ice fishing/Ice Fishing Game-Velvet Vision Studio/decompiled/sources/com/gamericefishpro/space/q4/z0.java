package com.gamericefishpro.space.q4;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {
    public static y0 a(Object obj) {
        s sVar = (s) obj;
        y0 y0Var = sVar.unknownFields;
        if (y0Var != y0.f) {
            return y0Var;
        }
        y0 y0Var2 = new y0(0, new int[8], new Object[8], true);
        sVar.unknownFields = y0Var2;
        return y0Var2;
    }

    public static boolean b(int i, com.gamericefishpro.space.d4.z zVar, Object obj) throws w {
        int i2 = zVar.a;
        com.gamericefishpro.space.d4.o0 o0Var = (com.gamericefishpro.space.d4.o0) zVar.d;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            zVar.z(0);
            ((y0) obj).c(i3 << 3, Long.valueOf(o0Var.s()));
            return true;
        }
        if (i4 == 1) {
            zVar.z(1);
            ((y0) obj).c((i3 << 3) | 1, Long.valueOf(o0Var.p()));
            return true;
        }
        if (i4 == 2) {
            ((y0) obj).c((i3 << 3) | 2, zVar.h());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw w.b();
            }
            zVar.z(5);
            ((y0) obj).c(5 | (i3 << 3), Integer.valueOf(o0Var.o()));
            return true;
        }
        y0 y0Var = new y0(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new w("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zVar.b() != Integer.MAX_VALUE && b(i7, zVar, y0Var)) {
        }
        if (i6 != zVar.a) {
            throw new w("Protocol message end-group tag did not match expected tag.");
        }
        if (y0Var.e) {
            y0Var.e = false;
        }
        ((y0) obj).c(i5 | 3, y0Var);
        return true;
    }
}
