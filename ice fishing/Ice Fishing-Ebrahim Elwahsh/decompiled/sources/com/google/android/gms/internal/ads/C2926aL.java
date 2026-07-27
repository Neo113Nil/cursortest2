package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.aL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2926aL {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f29199c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final QL f29200a = new QL();

    /* renamed from: b, reason: collision with root package name */
    public boolean f29201b;

    static {
        new C2926aL(0);
    }

    public C2926aL() {
    }

    public static void b(XK xk, EnumC3200fM enumC3200fM, int i, Object obj) {
        if (enumC3200fM == EnumC3200fM.f30692w) {
            xk.m(i, 3);
            ((AbstractC3199fL) ((IK) obj)).v(xk);
            xk.m(i, 4);
            return;
        }
        xk.m(i, enumC3200fM.f30696u);
        EnumC3255gM enumC3255gM = EnumC3255gM.f30995n;
        switch (enumC3200fM.ordinal()) {
            case 0:
                xk.D(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                xk.B(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                xk.C(((Long) obj).longValue());
                break;
            case 3:
                xk.C(((Long) obj).longValue());
                break;
            case 4:
                xk.z(((Integer) obj).intValue());
                break;
            case 5:
                xk.D(((Long) obj).longValue());
                break;
            case 6:
                xk.B(((Integer) obj).intValue());
                break;
            case 7:
                xk.y(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof SK)) {
                    xk.E((String) obj);
                    break;
                } else {
                    xk.v((SK) obj);
                    break;
                }
            case 9:
                ((AbstractC3199fL) ((IK) obj)).v(xk);
                break;
            case 10:
                xk.x((IK) obj);
                break;
            case 11:
                if (!(obj instanceof SK)) {
                    byte[] bArr = (byte[]) obj;
                    xk.w(bArr.length, bArr);
                    break;
                } else {
                    xk.v((SK) obj);
                    break;
                }
            case 12:
                xk.A(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof InterfaceC3308hL)) {
                    xk.z(((Integer) obj).intValue());
                    break;
                } else {
                    xk.z(((InterfaceC3308hL) obj).a());
                    break;
                }
            case 14:
                xk.B(((Integer) obj).intValue());
                break;
            case 15:
                xk.D(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                xk.A((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                xk.C((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    public final void a() {
        if (this.f29201b) {
            return;
        }
        QL ql = this.f29200a;
        int i = ql.f27143u;
        for (int i4 = 0; i4 < i; i4++) {
            Object obj = ql.a(i4).f27346u;
            if (obj instanceof AbstractC3199fL) {
                ((AbstractC3199fL) obj).q();
            }
        }
        Iterator it = ql.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof AbstractC3199fL) {
                ((AbstractC3199fL) value).q();
            }
        }
        if (!ql.f27145w) {
            if (ql.f27143u > 0) {
                ql.a(0).f27345n.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = ql.b().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!ql.f27145w) {
            ql.f27144v = ql.f27144v.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ql.f27144v);
            ql.f27147y = ql.f27147y.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(ql.f27147y);
            ql.f27145w = true;
        }
        this.f29201b = true;
    }

    public final Object clone() {
        C2926aL c2926aL = new C2926aL();
        QL ql = this.f29200a;
        if (ql.f27143u > 0) {
            RL a9 = ql.a(0);
            if (a9.f27345n != null) {
                throw new ClassCastException();
            }
            Object obj = a9.f27346u;
            throw null;
        }
        Iterator it = ql.b().iterator();
        if (!it.hasNext()) {
            return c2926aL;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2926aL) {
            return this.f29200a.equals(((C2926aL) obj).f29200a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29200a.hashCode();
    }

    public C2926aL(int i) {
        a();
        a();
    }
}
