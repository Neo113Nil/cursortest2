package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3273h extends C3946ta {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f30690A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f30691B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f30692C;

    /* renamed from: D, reason: collision with root package name */
    public final SparseArray f30693D;

    /* renamed from: E, reason: collision with root package name */
    public final SparseBooleanArray f30694E;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f30695w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f30696x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f30697y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f30698z;

    public C3273h() {
        this.f30693D = new SparseArray();
        this.f30694E = new SparseBooleanArray();
        this.f30695w = true;
        this.f30696x = true;
        this.f30697y = true;
        this.f30698z = true;
        this.f30690A = true;
        this.f30691B = true;
        this.f30692C = true;
    }

    public C3273h(C3327i c3327i) {
        a(c3327i);
        this.f30695w = c3327i.f30983w;
        this.f30696x = c3327i.f30984x;
        this.f30697y = c3327i.f30985y;
        this.f30698z = c3327i.f30986z;
        this.f30690A = c3327i.f30978A;
        this.f30691B = c3327i.f30979B;
        this.f30692C = c3327i.f30980C;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = c3327i.f30981D;
            if (i < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i), new HashMap((Map) sparseArray2.valueAt(i)));
                i++;
            } else {
                this.f30693D = sparseArray;
                this.f30694E = c3327i.f30982E.clone();
                return;
            }
        }
    }
}
