package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.extractor.mkv.MatroskaExtractor;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.mK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2168mK implements InterfaceC0980Ik {
    public final /* synthetic */ MatroskaExtractor A00;

    public C2168mK(MatroskaExtractor matroskaExtractor) {
        this.A00 = matroskaExtractor;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0980Ik
    public final void A4i(int i, int i6, InterfaceC2191ms interfaceC2191ms) throws IOException {
        this.A00.A0U(i, i6, interfaceC2191ms);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0980Ik
    public final void A6N(int i) throws C3K {
        this.A00.A0S(i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0980Ik
    public final void A6a(int i, double d2) throws C3K {
        this.A00.A0T(i, d2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0980Ik
    public final int A7u(int i) {
        return this.A00.A0R(i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0980Ik
    public final void AAH(int i, long j6) throws C3K {
        this.A00.A0V(i, j6);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0980Ik
    public final boolean AAW(int i) {
        return this.A00.A0Y(i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0980Ik
    public final void AK9(int i, long j6, long j9) throws C3K {
        this.A00.A0W(i, j6, j9);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0980Ik
    public final void AKK(int i, String str) throws C3K {
        this.A00.A0X(i, str);
    }
}
