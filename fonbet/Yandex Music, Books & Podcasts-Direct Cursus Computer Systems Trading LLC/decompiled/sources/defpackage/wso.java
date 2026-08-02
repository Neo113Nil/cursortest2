package defpackage;

/* loaded from: classes5.dex */
public final class wso implements t9f {
    public final t9f a;
    public final ux0 b;

    public wso(t9f t9fVar) {
        this.a = t9fVar;
        mhp descriptor = t9fVar.getDescriptor();
        descriptor.getClass();
        this.b = new ux0(descriptor, 3);
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        ux0 ux0Var = this.b;
        tq5 c = eg7Var.c(ux0Var);
        boolean m = c.m();
        int s = m ? c.s(ux0Var) : -1;
        upi upiVar = s >= 0 ? new upi(s) : new upi();
        t9f t9fVar = this.a;
        if (!m || s == -1) {
            while (true) {
                int w = c.w(ux0Var);
                if (w == -1) {
                    break;
                }
                upiVar.a(c.z(ux0Var, w, t9fVar, null));
            }
        } else {
            for (int i = 0; i < s; i++) {
                upiVar.a(c.z(ux0Var, i, t9fVar, null));
            }
        }
        c.b(ux0Var);
        return upiVar;
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return this.b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        upi upiVar = (upi) obj;
        l6bVar.getClass();
        upiVar.getClass();
        int i = upiVar.d;
        ux0 ux0Var = this.b;
        wq5 t = l6bVar.t(ux0Var, i);
        Object[] objArr = upiVar.b;
        long[] jArr = upiVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            t.k(ux0Var, i3, this.a, objArr[(i2 << 3) + i5]);
                            i3++;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        t.b(ux0Var);
    }
}
