package com.instagram.common.viewpoint.core;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class ED extends RelativeLayout implements InterfaceC1728eu {
    public C0877Ek A00;

    public ED(C1840gi c1840gi) {
        super(c1840gi);
    }

    public ED(C1840gi c1840gi, AttributeSet attributeSet, int i) {
        super(c1840gi, attributeSet, i);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1728eu
    public final void AAv(C0877Ek c0877Ek) {
        this.A00 = c0877Ek;
        A07();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1728eu
    public final void AKV(C0877Ek c0877Ek) {
        A08();
        this.A00 = null;
    }

    public C0877Ek getVideoView() {
        return this.A00;
    }
}
