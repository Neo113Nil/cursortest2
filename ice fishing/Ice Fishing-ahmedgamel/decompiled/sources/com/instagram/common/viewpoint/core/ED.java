package com.instagram.common.viewpoint.core;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class ED extends RelativeLayout implements InterfaceC1748eu {
    public C0897Ek A00;

    public ED(C1860gi c1860gi) {
        super(c1860gi);
    }

    public ED(C1860gi c1860gi, AttributeSet attributeSet, int i) {
        super(c1860gi, attributeSet, i);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1748eu
    public final void AAv(C0897Ek c0897Ek) {
        this.A00 = c0897Ek;
        A07();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1748eu
    public final void AKV(C0897Ek c0897Ek) {
        A08();
        this.A00 = null;
    }

    public C0897Ek getVideoView() {
        return this.A00;
    }
}
