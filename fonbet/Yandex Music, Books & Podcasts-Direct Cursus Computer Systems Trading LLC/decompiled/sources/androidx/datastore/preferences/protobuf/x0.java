package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
abstract class x0<T, B> {
    public final boolean a(Object obj, q0 q0Var) {
        int tag = q0Var.getTag();
        int i = tag >>> 3;
        int i2 = tag & 7;
        if (i2 == 0) {
            ((y0) obj).c(i << 3, Long.valueOf(q0Var.K()));
            return true;
        }
        if (i2 == 1) {
            ((y0) obj).c((i << 3) | 1, Long.valueOf(q0Var.a()));
            return true;
        }
        if (i2 == 2) {
            ((y0) obj).c((i << 3) | 2, q0Var.o());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw v.b();
            }
            ((y0) obj).c((i << 3) | 5, Integer.valueOf(q0Var.v()));
            return true;
        }
        y0 b = y0.b();
        int i3 = i << 3;
        int i4 = i3 | 4;
        while (q0Var.D() != Integer.MAX_VALUE && a(b, q0Var)) {
        }
        if (i4 != q0Var.getTag()) {
            throw new v("Protocol message end-group tag did not match expected tag.");
        }
        b.e = false;
        ((y0) obj).c(i3 | 3, b);
        return true;
    }
}
