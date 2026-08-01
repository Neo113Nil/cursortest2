package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4109wb {

    /* renamed from: b, reason: collision with root package name */
    public static final C4109wb f34842b;

    /* renamed from: a, reason: collision with root package name */
    public final RB f34843a;

    static {
        PB pb = RB.f27177u;
        f34842b = new C4109wb(C3500lC.f31745x);
        String str = AbstractC3159eu.f29993a;
        Integer.toString(0, 36);
    }

    public C4109wb(RB rb) {
        this.f34843a = RB.n(rb);
    }

    public final boolean a(int i) {
        int i6 = 0;
        while (true) {
            RB rb = this.f34843a;
            if (i6 >= rb.size()) {
                return false;
            }
            C3140eb c3140eb = (C3140eb) rb.get(i6);
            boolean[] zArr = c3140eb.f29945e;
            int length = zArr.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                if (!zArr[i9]) {
                    i9++;
                } else if (c3140eb.f29942b.f23637c == i) {
                    return true;
                }
            }
            i6++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4109wb.class != obj.getClass()) {
            return false;
        }
        return this.f34843a.equals(((C4109wb) obj).f34843a);
    }

    public final int hashCode() {
        return this.f34843a.hashCode();
    }
}
