package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3232g extends C4013ua {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f30929A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f30930B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f30931C;

    /* renamed from: D, reason: collision with root package name */
    public final SparseArray f30932D;

    /* renamed from: E, reason: collision with root package name */
    public final SparseBooleanArray f30933E;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f30934w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f30935x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f30936y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f30937z;

    public C3232g() {
        this.f30932D = new SparseArray();
        this.f30933E = new SparseBooleanArray();
        this.f30934w = true;
        this.f30935x = true;
        this.f30936y = true;
        this.f30937z = true;
        this.f30929A = true;
        this.f30930B = true;
        this.f30931C = true;
    }

    public C3232g(C3286h c3286h) {
        a(c3286h);
        this.f30934w = c3286h.f31126w;
        this.f30935x = c3286h.f31127x;
        this.f30936y = c3286h.f31128y;
        this.f30937z = c3286h.f31129z;
        this.f30929A = c3286h.f31121A;
        this.f30930B = c3286h.f31122B;
        this.f30931C = c3286h.f31123C;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = c3286h.f31124D;
            if (i < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i), new HashMap((Map) sparseArray2.valueAt(i)));
                i++;
            } else {
                this.f30932D = sparseArray;
                this.f30933E = c3286h.f31125E.clone();
                return;
            }
        }
    }
}
