package com.instagram.common.viewpoint.core;

import android.util.SparseArray;

/* loaded from: assets/audience_network/classes2.dex */
public final class K1 {
    public C1015Jv A00;
    public C1017Jx A01;
    public final int A02;
    public final int A03;
    public final SparseArray<C1019Jz> A08 = new SparseArray<>();
    public final SparseArray<C1014Ju> A06 = new SparseArray<>();
    public final SparseArray<C1016Jw> A07 = new SparseArray<>();
    public final SparseArray<C1014Ju> A04 = new SparseArray<>();
    public final SparseArray<C1016Jw> A05 = new SparseArray<>();

    public K1(int i, int i4) {
        this.A03 = i;
        this.A02 = i4;
    }

    public final void A00() {
        this.A08.clear();
        this.A06.clear();
        this.A07.clear();
        this.A04.clear();
        this.A05.clear();
        this.A00 = null;
        this.A01 = null;
    }
}
