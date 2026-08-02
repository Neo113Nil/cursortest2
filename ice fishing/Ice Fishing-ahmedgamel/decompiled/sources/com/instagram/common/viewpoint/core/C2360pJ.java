package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.pJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2360pJ implements C4X {
    public static final List<C2361pK> A01 = new ArrayList(50);
    public final Handler A00;

    public C2360pJ(Handler handler) {
        this.A00 = handler;
    }

    public static C2361pK A00() {
        C2361pK c2361pK;
        synchronized (A01) {
            c2361pK = A01.isEmpty() ? new C2361pK() : A01.remove(A01.size() - 1);
        }
        return c2361pK;
    }

    public static void A01(C2361pK c2361pK) {
        synchronized (A01) {
            if (A01.size() < 50) {
                A01.add(c2361pK);
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
    public final C2361pK ACg(int i) {
        return A00().A01(this.A00.obtainMessage(i), this);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final C2361pK ACh(int i, int i4, int i6) {
        return A00().A01(this.A00.obtainMessage(i, i4, i6), this);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final C2361pK ACi(int i, int i4, int i6, Object obj) {
        return A00().A01(this.A00.obtainMessage(i, i4, i6, obj), this);
    }

    @Override // com.instagram.common.viewpoint.core.C4X
    public final C2361pK ACj(int i, Object obj) {
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
        return ((C2361pK) c4w).A03(this.A00);
    }
}
