package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.extractor.mkv.MatroskaExtractor;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.mK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2188mK implements InterfaceC1000Ik {
    public final /* synthetic */ MatroskaExtractor A00;

    public C2188mK(MatroskaExtractor matroskaExtractor) {
        this.A00 = matroskaExtractor;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1000Ik
    public final void A4i(int i, int i4, InterfaceC2211ms interfaceC2211ms) throws IOException {
        this.A00.A0U(i, i4, interfaceC2211ms);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1000Ik
    public final void A6N(int i) throws C3K {
        this.A00.A0S(i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1000Ik
    public final void A6a(int i, double d9) throws C3K {
        this.A00.A0T(i, d9);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1000Ik
    public final int A7u(int i) {
        return this.A00.A0R(i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1000Ik
    public final void AAH(int i, long j6) throws C3K {
        this.A00.A0V(i, j6);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1000Ik
    public final boolean AAW(int i) {
        return this.A00.A0Y(i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1000Ik
    public final void AK9(int i, long j6, long j9) throws C3K {
        this.A00.A0W(i, j6, j9);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1000Ik
    public final void AKK(int i, String str) throws C3K {
        this.A00.A0X(i, str);
    }
}
