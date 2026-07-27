package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ho, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1906ho extends AbstractC1183Qm {
    public C1906ho(R2 r22) {
        super(r22, null);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1183Qm
    public final int A06() {
        return this.A02.A0Z();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1183Qm
    public final int A07() {
        return this.A02.A0Z() - this.A02.A0f();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1183Qm
    public final int A08() {
        return this.A02.A0f();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1183Qm
    public final int A09() {
        return this.A02.A0a();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1183Qm
    public final int A0A() {
        return this.A02.A0i();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1183Qm
    public final int A0B() {
        return (this.A02.A0Z() - this.A02.A0i()) - this.A02.A0f();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1183Qm
    public final int A0C(View view) {
        return this.A02.A0l(view) + ((R3) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1183Qm
    public final int A0D(View view) {
        R3 r32 = (R3) view.getLayoutParams();
        return this.A02.A0n(view) + r32.topMargin + r32.bottomMargin;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1183Qm
    public final int A0E(View view) {
        R3 r32 = (R3) view.getLayoutParams();
        return this.A02.A0o(view) + r32.leftMargin + r32.rightMargin;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1183Qm
    public final int A0F(View view) {
        return this.A02.A0q(view) - ((R3) view.getLayoutParams()).topMargin;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1183Qm
    public final int A0G(View view) {
        this.A02.A1G(view, true, this.A01);
        return this.A01.bottom;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1183Qm
    public final int A0H(View view) {
        this.A02.A1G(view, true, this.A01);
        return this.A01.top;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1183Qm
    public final void A0J(int i) {
        this.A02.A12(i);
    }
}
