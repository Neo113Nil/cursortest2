package com.instagram.common.viewpoint.core;

import android.util.SparseArray;
import java.util.ArrayList;

/* loaded from: assets/audience_network/classes2.dex */
public class R9 {
    public SparseArray<R8> A00 = new SparseArray<>();
    public int A01 = 0;

    private final long A00(long j9, long j10) {
        if (j9 == 0) {
            return j10;
        }
        return ((j9 / 4) * 3) + (j10 / 4);
    }

    private R8 A01(int i) {
        R8 r82 = this.A00.get(i);
        if (r82 == null) {
            R8 r83 = new R8();
            this.A00.put(i, r83);
            return r83;
        }
        return r82;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void A02() {
        for (int i = 0; i < i; i++) {
            this.A00.valueAt(i).A03.clear();
        }
    }

    public final RK A03(int i) {
        R8 r82 = this.A00.get(i);
        if (r82 != null && !r82.A03.isEmpty()) {
            return r82.A03.remove(r1.size() - 1);
        }
        return null;
    }

    public final void A04() {
        this.A01--;
    }

    public final void A05(int i, long j9) {
        R8 A01 = A01(i);
        A01.A01 = A00(A01.A01, j9);
    }

    public final void A06(int i, long j9) {
        R8 A01 = A01(i);
        A01.A02 = A00(A01.A02, j9);
    }

    public final void A07(AbstractC1187Qq abstractC1187Qq) {
        this.A01++;
    }

    public final void A08(AbstractC1187Qq abstractC1187Qq, AbstractC1187Qq abstractC1187Qq2, boolean z8) {
        if (abstractC1187Qq != null) {
            A04();
        }
        if (!z8 && this.A01 == 0) {
            A02();
        }
        if (abstractC1187Qq2 != null) {
            A07(abstractC1187Qq2);
        }
    }

    public final void A09(RK rk) {
        int A0N = rk.A0N();
        ArrayList<RK> arrayList = A01(A0N).A03;
        int i = this.A00.get(A0N).A00;
        int viewType = arrayList.size();
        if (i <= viewType) {
            return;
        }
        rk.A0W();
        arrayList.add(rk);
    }

    public final boolean A0A(int i, long j9, long j10) {
        long j11 = A01(i).A01;
        return j11 == 0 || j9 + j11 < j10;
    }

    public final boolean A0B(int i, long j9, long j10) {
        long j11 = A01(i).A02;
        return j11 == 0 || j9 + j11 < j10;
    }
}
