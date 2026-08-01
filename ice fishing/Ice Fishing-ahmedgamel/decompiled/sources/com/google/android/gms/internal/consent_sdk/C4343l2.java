package com.google.android.gms.internal.consent_sdk;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.consent_sdk.l2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4343l2 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f35713c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final K2 f35714a = new K2();

    /* renamed from: b, reason: collision with root package name */
    public boolean f35715b;

    static {
        new C4343l2(0);
    }

    public C4343l2() {
    }

    public static void b(C4331i2 c4331i2, W2 w22, int i, Object obj) {
        if (w22 == W2.f35630x) {
            c4331i2.y(i, 3);
            ((AbstractC4307c2) obj).a(c4331i2);
            c4331i2.y(i, 4);
            return;
        }
        c4331i2.y(i, w22.f35633u);
        X2 x22 = X2.f35637n;
        switch (w22.ordinal()) {
            case 0:
                c4331i2.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c4331i2.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c4331i2.C(((Long) obj).longValue());
                break;
            case 3:
                c4331i2.C(((Long) obj).longValue());
                break;
            case 4:
                c4331i2.w(((Integer) obj).intValue());
                break;
            case 5:
                c4331i2.u(((Long) obj).longValue());
                break;
            case 6:
                c4331i2.s(((Integer) obj).intValue());
                break;
            case 7:
                byte booleanValue = ((Boolean) obj).booleanValue();
                if (c4331i2.f35691e == c4331i2.f35690d) {
                    c4331i2.k();
                }
                int i6 = c4331i2.f35691e;
                c4331i2.f35689c[i6] = booleanValue;
                c4331i2.f35691e = i6 + 1;
                break;
            case 8:
                if (!(obj instanceof C4327h2)) {
                    c4331i2.x((String) obj);
                    break;
                } else {
                    c4331i2.q((C4327h2) obj);
                    break;
                }
            case 9:
                ((AbstractC4307c2) obj).a(c4331i2);
                break;
            case 10:
                AbstractC4307c2 abstractC4307c2 = (AbstractC4307c2) obj;
                c4331i2.A(abstractC4307c2.c());
                abstractC4307c2.a(c4331i2);
                break;
            case 11:
                if (!(obj instanceof C4327h2)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c4331i2.A(length);
                    c4331i2.D(length, bArr);
                    break;
                } else {
                    c4331i2.q((C4327h2) obj);
                    break;
                }
            case 12:
                c4331i2.A(((Integer) obj).intValue());
                break;
            case 13:
                c4331i2.w(((Integer) obj).intValue());
                break;
            case 14:
                c4331i2.s(((Integer) obj).intValue());
                break;
            case 15:
                c4331i2.u(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c4331i2.A((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                c4331i2.C((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    public final void a() {
        if (this.f35715b) {
            return;
        }
        K2 k22 = this.f35714a;
        int i = k22.f35558u;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj = k22.c(i6).f35566u;
            if (obj instanceof AbstractC4355o2) {
                ((AbstractC4355o2) obj).j();
            }
        }
        Iterator it = k22.a().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof AbstractC4355o2) {
                ((AbstractC4355o2) value).j();
            }
        }
        if (!k22.f35560w) {
            if (k22.f35558u > 0) {
                k22.c(0).f35565n.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = k22.a().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!k22.f35560w) {
            k22.f35559v = k22.f35559v.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(k22.f35559v);
            k22.f35562y = k22.f35562y.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(k22.f35562y);
            k22.f35560w = true;
        }
        this.f35715b = true;
    }

    public final Object clone() {
        C4343l2 c4343l2 = new C4343l2();
        K2 k22 = this.f35714a;
        if (k22.f35558u > 0) {
            L2 c9 = k22.c(0);
            if (c9.f35565n != null) {
                throw new ClassCastException();
            }
            Object obj = c9.f35566u;
            throw null;
        }
        Iterator it = k22.a().iterator();
        if (!it.hasNext()) {
            return c4343l2;
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
        if (obj instanceof C4343l2) {
            return this.f35714a.equals(((C4343l2) obj).f35714a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35714a.hashCode();
    }

    public C4343l2(int i) {
        a();
        a();
    }
}
