package com.instagram.common.viewpoint.core;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Lq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1063Lq extends AbstractC1784fo {
    public final /* synthetic */ LV A00;

    public C1063Lq(LV lv) {
        this.A00 = lv;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r0.A07() == false) goto L6;
     */
    @Override // com.instagram.common.viewpoint.core.AbstractC1784fo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A03() {
        boolean z3;
        Y2 y22;
        WeakReference weakReference;
        WeakReference weakReference2;
        Y2 y23;
        z3 = this.A00.A05;
        if (!z3) {
            y23 = this.A00.A01;
        }
        y22 = this.A00.A01;
        y22.A05();
        weakReference = this.A00.A0A;
        if (weakReference.get() != null) {
            weakReference2 = this.A00.A0A;
            ((InterfaceC1489b1) weakReference2.get()).AEA();
        }
    }
}
