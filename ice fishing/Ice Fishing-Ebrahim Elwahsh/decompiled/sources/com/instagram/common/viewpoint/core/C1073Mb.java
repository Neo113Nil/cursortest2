package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Mb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1073Mb implements XN {
    public final /* synthetic */ MW A00;

    public C1073Mb(MW mw) {
        this.A00 = mw;
    }

    public /* synthetic */ C1073Mb(MW mw, C1084Mm c1084Mm) {
        this(mw);
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        AtomicBoolean atomicBoolean;
        boolean z8;
        C1111No c1111No;
        boolean z9;
        this.A00.A0D();
        atomicBoolean = this.A00.A0R;
        if (!atomicBoolean.get()) {
            z8 = this.A00.A0T;
            if (!z8) {
                z9 = this.A00.A0D;
                if (z9) {
                    this.A00.A0U.setToolbarActionMode(0);
                    return;
                }
            }
            c1111No = this.A00.A0H;
            if (c1111No.A0V()) {
                this.A00.A0U.setToolbarActionMode(1);
            } else {
                this.A00.A0U.setToolbarActionMode(0);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f6) {
        C1111No c1111No;
        C1111No c1111No2;
        c1111No = this.A00.A0H;
        if (c1111No.A0A() > 0) {
            c1111No2 = this.A00.A0H;
            if (f6 == c1111No2.A0A()) {
                this.A00.A0U.setToolbarActionMode(8);
            }
        }
    }
}
