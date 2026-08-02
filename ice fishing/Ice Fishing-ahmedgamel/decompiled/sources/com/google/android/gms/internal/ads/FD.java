package com.google.android.gms.internal.ads;

import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public final class FD extends AbstractC4063vD {

    /* renamed from: I, reason: collision with root package name */
    public ED f25513I;

    @Override // com.google.android.gms.internal.ads.AbstractC3310hD
    public final void l() {
        ED ed = this.f25513I;
        if (ed != null) {
            ed.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4063vD
    public final void s(int i) {
        this.f35439E = null;
        if (i == 1) {
            this.f25513I = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4063vD
    public final void x(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4063vD
    public final void y() {
        ED ed = this.f25513I;
        if (ed != null) {
            try {
                ed.f25322v.execute(ed);
            } catch (RejectedExecutionException e9) {
                ed.f25323w.e(e9);
            }
        }
    }
}
