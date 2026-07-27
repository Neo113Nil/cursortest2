package com.instagram.common.viewpoint.core;

import android.util.SparseArray;

/* loaded from: assets/audience_network/classes2.dex */
public final class K1 {
    public C1016Jv A00;
    public C1018Jx A01;
    public final int A02;
    public final int A03;
    public final SparseArray<C1020Jz> A08 = new SparseArray<>();
    public final SparseArray<C1015Ju> A06 = new SparseArray<>();
    public final SparseArray<C1017Jw> A07 = new SparseArray<>();
    public final SparseArray<C1015Ju> A04 = new SparseArray<>();
    public final SparseArray<C1017Jw> A05 = new SparseArray<>();

    public K1(int i, int i6) {
        this.A03 = i;
        this.A02 = i6;
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
