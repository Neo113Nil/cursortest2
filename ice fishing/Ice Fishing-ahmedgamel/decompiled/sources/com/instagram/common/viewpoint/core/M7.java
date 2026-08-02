package com.instagram.common.viewpoint.core;

import android.widget.ImageView;

/* loaded from: assets/audience_network/classes2.dex */
public class M7 implements InterfaceC1499ar {
    public final /* synthetic */ M6 A00;

    public M7(M6 m62) {
        this.A00 = m62;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1499ar
    public final void ADB(boolean z6) {
        boolean z9;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        this.A00.A0D(z6);
        z9 = this.A00.A0B;
        if (z9) {
            imageView = this.A00.A00;
            if (imageView != null) {
                imageView2 = this.A00.A00;
                imageView2.setEnabled(z6);
                imageView3 = this.A00.A00;
                imageView3.setAlpha(z6 ? 1.0f : 0.3f);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1499ar
    public final void ADx(boolean z6) {
        boolean z9;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        this.A00.A0D(z6);
        z9 = this.A00.A0B;
        if (z9) {
            imageView = this.A00.A02;
            if (imageView != null) {
                imageView2 = this.A00.A02;
                imageView2.setEnabled(z6);
                imageView3 = this.A00.A02;
                imageView3.setAlpha(z6 ? 1.0f : 0.3f);
            }
        }
    }
}
