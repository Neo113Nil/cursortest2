package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class e0 {
    public static d0 a(Object obj) {
        AbstractC0122w abstractC0122w = (AbstractC0122w) obj;
        d0 d0Var = abstractC0122w.unknownFields;
        if (d0Var != d0.f2378f) {
            return d0Var;
        }
        d0 d0Var2 = new d0(0, new int[8], new Object[8], true);
        abstractC0122w.unknownFields = d0Var2;
        return d0Var2;
    }

    public static void b(Object obj) {
        d0 d0Var = ((AbstractC0122w) obj).unknownFields;
        if (d0Var.f2383e) {
            d0Var.f2383e = false;
        }
    }

    public static boolean c(int i2, C0111k c0111k, Object obj) {
        int i3 = c0111k.f2417b;
        int i4 = i3 >>> 3;
        int i5 = i3 & 7;
        AbstractC0110j abstractC0110j = c0111k.f2416a;
        if (i5 == 0) {
            c0111k.w(0);
            ((d0) obj).c(i4 << 3, Long.valueOf(abstractC0110j.n()));
            return true;
        }
        if (i5 == 1) {
            c0111k.w(1);
            ((d0) obj).c((i4 << 3) | 1, Long.valueOf(abstractC0110j.k()));
            return true;
        }
        if (i5 == 2) {
            ((d0) obj).c((i4 << 3) | 2, c0111k.e());
            return true;
        }
        if (i5 != 3) {
            if (i5 == 4) {
                return false;
            }
            if (i5 != 5) {
                throw A.b();
            }
            c0111k.w(5);
            ((d0) obj).c(5 | (i4 << 3), Integer.valueOf(abstractC0110j.j()));
            return true;
        }
        d0 d0Var = new d0(0, new int[8], new Object[8], true);
        int i6 = i4 << 3;
        int i7 = i6 | 4;
        int i8 = i2 + 1;
        if (i8 >= 100) {
            throw new A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c0111k.a() != Integer.MAX_VALUE && c(i8, c0111k, d0Var)) {
        }
        if (i7 != c0111k.f2417b) {
            throw new A("Protocol message end-group tag did not match expected tag.");
        }
        if (d0Var.f2383e) {
            d0Var.f2383e = false;
        }
        ((d0) obj).c(i6 | 3, d0Var);
        return true;
    }
}
