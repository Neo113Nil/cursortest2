package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.pJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2339pJ implements C4X {
    public static final List<C2340pK> A01 = new ArrayList(50);
    public final Handler A00;

    public C2339pJ(Handler handler) {
        this.A00 = handler;
    }

    public static C2340pK A00() {
        C2340pK c2340pK;
        synchronized (A01) {
            c2340pK = A01.isEmpty() ? new C2340pK() : A01.remove(A01.size() - 1);
        }
        return c2340pK;
    }

    public static void A01(C2340pK c2340pK) {
        synchronized (A01) {
            if (A01.size() < 50) {
                A01.add(c2340pK);
            }
        }
    }

    public final boolean A03(Runnable runnable) {
        return this.A00.post(runnable);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final Looper A8R() {
        return this.A00.getLooper();
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final boolean A9n(int i) {
        return this.A00.hasMessages(i);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final C2340pK ACg(int i) {
        return A00().A01(this.A00.obtainMessage(i), this);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final C2340pK ACh(int i, int i4, int i9) {
        return A00().A01(this.A00.obtainMessage(i, i4, i9), this);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final C2340pK ACi(int i, int i4, int i9, Object obj) {
        return A00().A01(this.A00.obtainMessage(i, i4, i9, obj), this);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final C2340pK ACj(int i, Object obj) {
        return A00().A01(this.A00.obtainMessage(i, obj), this);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final void AIT(int i) {
        this.A00.removeMessages(i);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final boolean AJA(int i) {
        return this.A00.sendEmptyMessage(i);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final boolean AJB(int i, long j9) {
        return this.A00.sendEmptyMessageAtTime(i, j9);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final boolean AJD(C4W c4w) {
        return ((C2340pK) c4w).A03(this.A00);
    }
}
