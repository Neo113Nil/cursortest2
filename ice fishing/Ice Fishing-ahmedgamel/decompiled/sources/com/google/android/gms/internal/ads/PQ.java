package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class PQ {

    /* renamed from: d, reason: collision with root package name */
    public static final PQ f26818d = new PQ(new A8[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f26819a;

    /* renamed from: b, reason: collision with root package name */
    public final C3500lC f26820b;

    /* renamed from: c, reason: collision with root package name */
    public int f26821c;

    static {
        String str = AbstractC3159eu.f29993a;
        Integer.toString(0, 36);
    }

    public PQ(A8... a8Arr) {
        this.f26820b = RB.o(a8Arr);
        this.f26819a = a8Arr.length;
        int i = 0;
        while (i < this.f26820b.f31747w) {
            int i6 = i + 1;
            int i9 = i6;
            while (true) {
                C3500lC c3500lC = this.f26820b;
                if (i9 < c3500lC.f31747w) {
                    if (((A8) c3500lC.get(i)).equals(this.f26820b.get(i9))) {
                        AbstractC2968bG.J("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                    i9++;
                }
            }
            i = i6;
        }
    }

    public final A8 a(int i) {
        return (A8) this.f26820b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PQ.class != obj.getClass()) {
            return false;
        }
        PQ pq = (PQ) obj;
        return this.f26819a == pq.f26819a && this.f26820b.equals(pq.f26820b);
    }

    public final int hashCode() {
        int i = this.f26821c;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f26820b.hashCode();
        this.f26821c = hashCode;
        return hashCode;
    }

    public final String toString() {
        return this.f26820b.toString();
    }
}
