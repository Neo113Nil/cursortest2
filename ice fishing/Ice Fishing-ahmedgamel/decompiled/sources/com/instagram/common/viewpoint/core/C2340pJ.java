package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.pJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2340pJ implements C4X {
    public static final List<C2341pK> A01 = new ArrayList(50);
    public final Handler A00;

    public C2340pJ(Handler handler) {
        this.A00 = handler;
    }

    public static C2341pK A00() {
        C2341pK c2341pK;
        synchronized (A01) {
            c2341pK = A01.isEmpty() ? new C2341pK() : A01.remove(A01.size() - 1);
        }
        return c2341pK;
    }

    public static void A01(C2341pK c2341pK) {
        synchronized (A01) {
            if (A01.size() < 50) {
                A01.add(c2341pK);
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
    public final C2341pK ACg(int i) {
        return A00().A01(this.A00.obtainMessage(i), this);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final C2341pK ACh(int i, int i6, int i9) {
        return A00().A01(this.A00.obtainMessage(i, i6, i9), this);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final C2341pK ACi(int i, int i6, int i9, Object obj) {
        return A00().A01(this.A00.obtainMessage(i, i6, i9, obj), this);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final C2341pK ACj(int i, Object obj) {
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
    public final boolean AJB(int i, long j6) {
        return this.A00.sendEmptyMessageAtTime(i, j6);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final boolean AJD(C4W c4w) {
        return ((C2341pK) c4w).A03(this.A00);
    }
}
