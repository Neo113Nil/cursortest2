package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Mb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1074Mb implements XN {
    public final /* synthetic */ MW A00;

    public C1074Mb(MW mw) {
        this.A00 = mw;
    }

    public /* synthetic */ C1074Mb(MW mw, C1085Mm c1085Mm) {
        this(mw);
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        AtomicBoolean atomicBoolean;
        boolean z3;
        C1112No c1112No;
        boolean z6;
        this.A00.A0D();
        atomicBoolean = this.A00.A0R;
        if (!atomicBoolean.get()) {
            z3 = this.A00.A0T;
            if (!z3) {
                z6 = this.A00.A0D;
                if (z6) {
                    this.A00.A0U.setToolbarActionMode(0);
                    return;
                }
            }
            c1112No = this.A00.A0H;
            if (c1112No.A0V()) {
                this.A00.A0U.setToolbarActionMode(1);
            } else {
                this.A00.A0U.setToolbarActionMode(0);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f3) {
        C1112No c1112No;
        C1112No c1112No2;
        c1112No = this.A00.A0H;
        if (c1112No.A0A() > 0) {
            c1112No2 = this.A00.A0H;
            if (f3 == c1112No2.A0A()) {
                this.A00.A0U.setToolbarActionMode(8);
            }
        }
    }
}
