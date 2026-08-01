package com.google.android.gms.internal.ads;

import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public final class FD extends AbstractC4040vD {

    /* renamed from: I, reason: collision with root package name */
    public ED f24757I;

    @Override // com.google.android.gms.internal.ads.AbstractC3287hD
    public final void l() {
        ED ed = this.f24757I;
        if (ed != null) {
            ed.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4040vD
    public final void s(int i) {
        this.f34676E = null;
        if (i == 1) {
            this.f24757I = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4040vD
    public final void x(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4040vD
    public final void y() {
        ED ed = this.f24757I;
        if (ed != null) {
            try {
                ed.f24561v.execute(ed);
            } catch (RejectedExecutionException e9) {
                ed.f24562w.e(e9);
            }
        }
    }
}
