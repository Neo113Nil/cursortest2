package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4176xb {

    /* renamed from: b, reason: collision with root package name */
    public static final C4176xb f35186b;

    /* renamed from: a, reason: collision with root package name */
    public final UB f35187a;

    static {
        SB sb = UB.f27942u;
        f35186b = new C4176xb(C3675oC.f33115x);
        String str = AbstractC3548lu.f32613a;
        Integer.toString(0, 36);
    }

    public C4176xb(UB ub) {
        this.f35187a = UB.n(ub);
    }

    public final boolean a(int i) {
        int i4 = 0;
        while (true) {
            UB ub = this.f35187a;
            if (i4 >= ub.size()) {
                return false;
            }
            C3207fb c3207fb = (C3207fb) ub.get(i4);
            boolean[] zArr = c3207fb.f30729e;
            int length = zArr.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                if (!zArr[i9]) {
                    i9++;
                } else if (c3207fb.f30726b.f23999c == i) {
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
        if (obj == null || C4176xb.class != obj.getClass()) {
            return false;
        }
        return this.f35187a.equals(((C4176xb) obj).f35187a);
    }

    public final int hashCode() {
        return this.f35187a.hashCode();
    }
}
