package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class SQ {

    /* renamed from: d, reason: collision with root package name */
    public static final SQ f28273d = new SQ(new A8[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f28274a;

    /* renamed from: b, reason: collision with root package name */
    public final C3523lC f28275b;

    /* renamed from: c, reason: collision with root package name */
    public int f28276c;

    static {
        String str = AbstractC3182eu.f30782a;
        Integer.toString(0, 36);
    }

    public SQ(A8... a8Arr) {
        this.f28275b = RB.o(a8Arr);
        this.f28274a = a8Arr.length;
        int i = 0;
        while (i < this.f28275b.f32527w) {
            int i4 = i + 1;
            int i6 = i4;
            while (true) {
                C3523lC c3523lC = this.f28275b;
                if (i6 < c3523lC.f32527w) {
                    if (((A8) c3523lC.get(i)).equals(this.f28275b.get(i6))) {
                        AbstractC2991bG.J("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                    i6++;
                }
            }
            i = i4;
        }
    }

    public final A8 a(int i) {
        return (A8) this.f28275b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SQ.class != obj.getClass()) {
            return false;
        }
        SQ sq = (SQ) obj;
        return this.f28274a == sq.f28274a && this.f28275b.equals(sq.f28275b);
    }

    public final int hashCode() {
        int i = this.f28276c;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f28275b.hashCode();
        this.f28276c = hashCode;
        return hashCode;
    }

    public final String toString() {
        return this.f28275b.toString();
    }
}
