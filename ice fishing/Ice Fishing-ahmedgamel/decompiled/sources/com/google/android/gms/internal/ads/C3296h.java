package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3296h extends C3969ta {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f31456A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f31457B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f31458C;

    /* renamed from: D, reason: collision with root package name */
    public final SparseArray f31459D;

    /* renamed from: E, reason: collision with root package name */
    public final SparseBooleanArray f31460E;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f31461w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f31462x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f31463y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f31464z;

    public C3296h() {
        this.f31459D = new SparseArray();
        this.f31460E = new SparseBooleanArray();
        this.f31461w = true;
        this.f31462x = true;
        this.f31463y = true;
        this.f31464z = true;
        this.f31456A = true;
        this.f31457B = true;
        this.f31458C = true;
    }

    public C3296h(C3350i c3350i) {
        a(c3350i);
        this.f31461w = c3350i.f31756w;
        this.f31462x = c3350i.f31757x;
        this.f31463y = c3350i.f31758y;
        this.f31464z = c3350i.f31759z;
        this.f31456A = c3350i.f31751A;
        this.f31457B = c3350i.f31752B;
        this.f31458C = c3350i.f31753C;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = c3350i.f31754D;
            if (i < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i), new HashMap((Map) sparseArray2.valueAt(i)));
                i++;
            } else {
                this.f31459D = sparseArray;
                this.f31460E = c3350i.f31755E.clone();
                return;
            }
        }
    }
}
