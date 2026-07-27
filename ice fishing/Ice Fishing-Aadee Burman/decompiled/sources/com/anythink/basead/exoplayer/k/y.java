package com.anythink.basead.exoplayer.k;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<a> f8516a = new Comparator<a>() { // from class: com.anythink.basead.exoplayer.k.y.1
        private static int a(a aVar, a aVar2) {
            return aVar.f8528a - aVar2.f8528a;
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(a aVar, a aVar2) {
            return aVar.f8528a - aVar2.f8528a;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final Comparator<a> f8517b = new Comparator<a>() { // from class: com.anythink.basead.exoplayer.k.y.2
        private static int a(a aVar, a aVar2) {
            float f3 = aVar.f8530c;
            float f9 = aVar2.f8530c;
            if (f3 < f9) {
                return -1;
            }
            return f9 < f3 ? 1 : 0;
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(a aVar, a aVar2) {
            float f3 = aVar.f8530c;
            float f9 = aVar2.f8530c;
            if (f3 < f9) {
                return -1;
            }
            return f9 < f3 ? 1 : 0;
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final int f8518c = -1;

    /* renamed from: d, reason: collision with root package name */
    private static final int f8519d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static final int f8520e = 1;

    /* renamed from: f, reason: collision with root package name */
    private static final int f8521f = 5;

    /* renamed from: g, reason: collision with root package name */
    private final int f8522g;

    /* renamed from: k, reason: collision with root package name */
    private int f8525k;

    /* renamed from: l, reason: collision with root package name */
    private int f8526l;

    /* renamed from: m, reason: collision with root package name */
    private int f8527m;
    private final a[] i = new a[5];

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList<a> f8523h = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    private int f8524j = -1;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f8528a;

        /* renamed from: b, reason: collision with root package name */
        public int f8529b;

        /* renamed from: c, reason: collision with root package name */
        public float f8530c;

        private a() {
        }

        public /* synthetic */ a(byte b9) {
            this();
        }
    }

    public y(int i) {
        this.f8522g = i;
    }

    private void b() {
        if (this.f8524j != 1) {
            Collections.sort(this.f8523h, f8516a);
            this.f8524j = 1;
        }
    }

    private void c() {
        if (this.f8524j != 0) {
            Collections.sort(this.f8523h, f8517b);
            this.f8524j = 0;
        }
    }

    public final void a(int i, float f3) {
        a aVar;
        if (this.f8524j != 1) {
            Collections.sort(this.f8523h, f8516a);
            this.f8524j = 1;
        }
        int i6 = this.f8527m;
        byte b9 = 0;
        if (i6 > 0) {
            a[] aVarArr = this.i;
            int i9 = i6 - 1;
            this.f8527m = i9;
            aVar = aVarArr[i9];
        } else {
            aVar = new a(b9);
        }
        int i10 = this.f8525k;
        this.f8525k = i10 + 1;
        aVar.f8528a = i10;
        aVar.f8529b = i;
        aVar.f8530c = f3;
        this.f8523h.add(aVar);
        this.f8526l += i;
        while (true) {
            int i11 = this.f8526l;
            int i12 = this.f8522g;
            if (i11 <= i12) {
                return;
            }
            int i13 = i11 - i12;
            a aVar2 = this.f8523h.get(0);
            int i14 = aVar2.f8529b;
            if (i14 <= i13) {
                this.f8526l -= i14;
                this.f8523h.remove(0);
                int i15 = this.f8527m;
                if (i15 < 5) {
                    a[] aVarArr2 = this.i;
                    this.f8527m = i15 + 1;
                    aVarArr2[i15] = aVar2;
                }
            } else {
                aVar2.f8529b = i14 - i13;
                this.f8526l -= i13;
            }
        }
    }

    public final float a() {
        if (this.f8524j != 0) {
            Collections.sort(this.f8523h, f8517b);
            this.f8524j = 0;
        }
        float f3 = this.f8526l * 0.5f;
        int i = 0;
        for (int i6 = 0; i6 < this.f8523h.size(); i6++) {
            a aVar = this.f8523h.get(i6);
            i += aVar.f8529b;
            if (i >= f3) {
                return aVar.f8530c;
            }
        }
        if (this.f8523h.isEmpty()) {
            return Float.NaN;
        }
        return this.f8523h.get(r0.size() - 1).f8530c;
    }
}
