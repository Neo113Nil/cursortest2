package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4132wb {

    /* renamed from: b, reason: collision with root package name */
    public static final C4132wb f35619b;

    /* renamed from: a, reason: collision with root package name */
    public final RB f35620a;

    static {
        PB pb = RB.f27933u;
        f35619b = new C4132wb(C3523lC.f32525x);
        String str = AbstractC3182eu.f30782a;
        Integer.toString(0, 36);
    }

    public C4132wb(RB rb) {
        this.f35620a = RB.n(rb);
    }

    public final boolean a(int i) {
        int i4 = 0;
        while (true) {
            RB rb = this.f35620a;
            if (i4 >= rb.size()) {
                return false;
            }
            C3163eb c3163eb = (C3163eb) rb.get(i4);
            boolean[] zArr = c3163eb.f30736e;
            int length = zArr.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                if (!zArr[i6]) {
                    i6++;
                } else if (c3163eb.f30733b.f24417c == i) {
                    return true;
                }
            }
            i4++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4132wb.class != obj.getClass()) {
            return false;
        }
        return this.f35620a.equals(((C4132wb) obj).f35620a);
    }

    public final int hashCode() {
        return this.f35620a.hashCode();
    }
}
