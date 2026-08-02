package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Mb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1094Mb implements XN {
    public final /* synthetic */ MW A00;

    public C1094Mb(MW mw) {
        this.A00 = mw;
    }

    public /* synthetic */ C1094Mb(MW mw, C1105Mm c1105Mm) {
        this(mw);
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        AtomicBoolean atomicBoolean;
        boolean z6;
        C1132No c1132No;
        boolean z9;
        this.A00.A0D();
        atomicBoolean = this.A00.A0R;
        if (!atomicBoolean.get()) {
            z6 = this.A00.A0T;
            if (!z6) {
                z9 = this.A00.A0D;
                if (z9) {
                    this.A00.A0U.setToolbarActionMode(0);
                    return;
                }
            }
            c1132No = this.A00.A0H;
            if (c1132No.A0V()) {
                this.A00.A0U.setToolbarActionMode(1);
            } else {
                this.A00.A0U.setToolbarActionMode(0);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f2) {
        C1132No c1132No;
        C1132No c1132No2;
        c1132No = this.A00.A0H;
        if (c1132No.A0A() > 0) {
            c1132No2 = this.A00.A0H;
            if (f2 == c1132No2.A0A()) {
                this.A00.A0U.setToolbarActionMode(8);
            }
        }
    }
}
