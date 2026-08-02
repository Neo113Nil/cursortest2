package com.anythink.basead.exoplayer.k;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<a> f9302a = new Comparator<a>() { // from class: com.anythink.basead.exoplayer.k.y.1
        private static int a(a aVar, a aVar2) {
            return aVar.f9314a - aVar2.f9314a;
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(a aVar, a aVar2) {
            return aVar.f9314a - aVar2.f9314a;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final Comparator<a> f9303b = new Comparator<a>() { // from class: com.anythink.basead.exoplayer.k.y.2
        private static int a(a aVar, a aVar2) {
            float f2 = aVar.f9316c;
            float f9 = aVar2.f9316c;
            if (f2 < f9) {
                return -1;
            }
            return f9 < f2 ? 1 : 0;
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(a aVar, a aVar2) {
            float f2 = aVar.f9316c;
            float f9 = aVar2.f9316c;
            if (f2 < f9) {
                return -1;
            }
            return f9 < f2 ? 1 : 0;
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final int f9304c = -1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f9305d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final int f9306e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f9307f = 5;

    /* renamed from: g, reason: collision with root package name */
    private final int f9308g;

    /* renamed from: k, reason: collision with root package name */
    private int f9311k;

    /* renamed from: l, reason: collision with root package name */
    private int f9312l;

    /* renamed from: m, reason: collision with root package name */
    private int f9313m;
    private final a[] i = new a[5];

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList<a> f9309h = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    private int f9310j = -1;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f9314a;

        /* renamed from: b, reason: collision with root package name */
        public int f9315b;

        /* renamed from: c, reason: collision with root package name */
        public float f9316c;

        private a() {
        }

        public /* synthetic */ a(byte b9) {
            this();
        }
    }

    public y(int i) {
        this.f9308g = i;
    }

    private void b() {
        if (this.f9310j != 1) {
            Collections.sort(this.f9309h, f9302a);
            this.f9310j = 1;
        }
    }

    private void c() {
        if (this.f9310j != 0) {
            Collections.sort(this.f9309h, f9303b);
            this.f9310j = 0;
        }
    }

    public final void a(int i, float f2) {
        a aVar;
        if (this.f9310j != 1) {
            Collections.sort(this.f9309h, f9302a);
            this.f9310j = 1;
        }
        int i4 = this.f9313m;
        byte b9 = 0;
        if (i4 > 0) {
            a[] aVarArr = this.i;
            int i6 = i4 - 1;
            this.f9313m = i6;
            aVar = aVarArr[i6];
        } else {
            aVar = new a(b9);
        }
        int i9 = this.f9311k;
        this.f9311k = i9 + 1;
        aVar.f9314a = i9;
        aVar.f9315b = i;
        aVar.f9316c = f2;
        this.f9309h.add(aVar);
        this.f9312l += i;
        while (true) {
            int i10 = this.f9312l;
            int i11 = this.f9308g;
            if (i10 <= i11) {
                return;
            }
            int i12 = i10 - i11;
            a aVar2 = this.f9309h.get(0);
            int i13 = aVar2.f9315b;
            if (i13 <= i12) {
                this.f9312l -= i13;
                this.f9309h.remove(0);
                int i14 = this.f9313m;
                if (i14 < 5) {
                    a[] aVarArr2 = this.i;
                    this.f9313m = i14 + 1;
                    aVarArr2[i14] = aVar2;
                }
            } else {
                aVar2.f9315b = i13 - i12;
                this.f9312l -= i12;
            }
        }
    }

    public final float a() {
        if (this.f9310j != 0) {
            Collections.sort(this.f9309h, f9303b);
            this.f9310j = 0;
        }
        float f2 = this.f9312l * 0.5f;
        int i = 0;
        for (int i4 = 0; i4 < this.f9309h.size(); i4++) {
            a aVar = this.f9309h.get(i4);
            i += aVar.f9315b;
            if (i >= f2) {
                return aVar.f9316c;
            }
        }
        if (this.f9309h.isEmpty()) {
            return Float.NaN;
        }
        return this.f9309h.get(r0.size() - 1).f9316c;
    }
}
