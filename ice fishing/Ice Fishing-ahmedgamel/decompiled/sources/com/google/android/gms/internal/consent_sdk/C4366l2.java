package com.google.android.gms.internal.consent_sdk;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.consent_sdk.l2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4366l2 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f36482c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final K2 f36483a = new K2();

    /* renamed from: b, reason: collision with root package name */
    public boolean f36484b;

    static {
        new C4366l2(0);
    }

    public C4366l2() {
    }

    public static void b(C4354i2 c4354i2, W2 w22, int i, Object obj) {
        if (w22 == W2.f36399x) {
            c4354i2.y(i, 3);
            ((AbstractC4330c2) obj).a(c4354i2);
            c4354i2.y(i, 4);
            return;
        }
        c4354i2.y(i, w22.f36402u);
        X2 x22 = X2.f36406n;
        switch (w22.ordinal()) {
            case 0:
                c4354i2.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c4354i2.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c4354i2.C(((Long) obj).longValue());
                break;
            case 3:
                c4354i2.C(((Long) obj).longValue());
                break;
            case 4:
                c4354i2.w(((Integer) obj).intValue());
                break;
            case 5:
                c4354i2.u(((Long) obj).longValue());
                break;
            case 6:
                c4354i2.s(((Integer) obj).intValue());
                break;
            case 7:
                byte booleanValue = ((Boolean) obj).booleanValue();
                if (c4354i2.f36460e == c4354i2.f36459d) {
                    c4354i2.k();
                }
                int i4 = c4354i2.f36460e;
                c4354i2.f36458c[i4] = booleanValue;
                c4354i2.f36460e = i4 + 1;
                break;
            case 8:
                if (!(obj instanceof C4350h2)) {
                    c4354i2.x((String) obj);
                    break;
                } else {
                    c4354i2.q((C4350h2) obj);
                    break;
                }
            case 9:
                ((AbstractC4330c2) obj).a(c4354i2);
                break;
            case 10:
                AbstractC4330c2 abstractC4330c2 = (AbstractC4330c2) obj;
                c4354i2.A(abstractC4330c2.c());
                abstractC4330c2.a(c4354i2);
                break;
            case 11:
                if (!(obj instanceof C4350h2)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c4354i2.A(length);
                    c4354i2.D(length, bArr);
                    break;
                } else {
                    c4354i2.q((C4350h2) obj);
                    break;
                }
            case 12:
                c4354i2.A(((Integer) obj).intValue());
                break;
            case 13:
                c4354i2.w(((Integer) obj).intValue());
                break;
            case 14:
                c4354i2.s(((Integer) obj).intValue());
                break;
            case 15:
                c4354i2.u(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c4354i2.A((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                c4354i2.C((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    public final void a() {
        if (this.f36484b) {
            return;
        }
        K2 k22 = this.f36483a;
        int i = k22.f36327u;
        for (int i4 = 0; i4 < i; i4++) {
            Object obj = k22.c(i4).f36335u;
            if (obj instanceof AbstractC4378o2) {
                ((AbstractC4378o2) obj).j();
            }
        }
        Iterator it = k22.a().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof AbstractC4378o2) {
                ((AbstractC4378o2) value).j();
            }
        }
        if (!k22.f36329w) {
            if (k22.f36327u > 0) {
                k22.c(0).f36334n.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = k22.a().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!k22.f36329w) {
            k22.f36328v = k22.f36328v.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(k22.f36328v);
            k22.f36331y = k22.f36331y.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(k22.f36331y);
            k22.f36329w = true;
        }
        this.f36484b = true;
    }

    public final Object clone() {
        C4366l2 c4366l2 = new C4366l2();
        K2 k22 = this.f36483a;
        if (k22.f36327u > 0) {
            L2 c9 = k22.c(0);
            if (c9.f36334n != null) {
                throw new ClassCastException();
            }
            Object obj = c9.f36335u;
            throw null;
        }
        Iterator it = k22.a().iterator();
        if (!it.hasNext()) {
            return c4366l2;
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
        if (obj instanceof C4366l2) {
            return this.f36483a.equals(((C4366l2) obj).f36483a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36483a.hashCode();
    }

    public C4366l2(int i) {
        a();
        a();
    }
}
