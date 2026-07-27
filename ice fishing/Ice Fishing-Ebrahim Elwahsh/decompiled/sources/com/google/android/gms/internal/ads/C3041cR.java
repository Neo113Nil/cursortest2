package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.cR, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3041cR {

    /* renamed from: d, reason: collision with root package name */
    public static final C3041cR f29709d = new C3041cR(new B8[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f29710a;

    /* renamed from: b, reason: collision with root package name */
    public final C3675oC f29711b;

    /* renamed from: c, reason: collision with root package name */
    public int f29712c;

    static {
        String str = AbstractC3548lu.f32613a;
        Integer.toString(0, 36);
    }

    public C3041cR(B8... b8Arr) {
        this.f29711b = UB.o(b8Arr);
        this.f29710a = b8Arr.length;
        int i = 0;
        while (i < this.f29711b.f33117w) {
            int i4 = i + 1;
            int i9 = i4;
            while (true) {
                C3675oC c3675oC = this.f29711b;
                if (i9 < c3675oC.f33117w) {
                    if (((B8) c3675oC.get(i)).equals(this.f29711b.get(i9))) {
                        AbstractC3217fl.X("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                    i9++;
                }
            }
            i = i4;
        }
    }

    public final B8 a(int i) {
        return (B8) this.f29711b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3041cR.class != obj.getClass()) {
            return false;
        }
        C3041cR c3041cR = (C3041cR) obj;
        return this.f29710a == c3041cR.f29710a && this.f29711b.equals(c3041cR.f29711b);
    }

    public final int hashCode() {
        int i = this.f29712c;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f29711b.hashCode();
        this.f29712c = hashCode;
        return hashCode;
    }

    public final String toString() {
        return this.f29711b.toString();
    }
}
