package com.instagram.common.viewpoint.core;

import com.facebook.ads.androidx.media3.extractor.mkv.MatroskaExtractor;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.mK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2167mK implements InterfaceC0979Ik {
    public final /* synthetic */ MatroskaExtractor A00;

    public C2167mK(MatroskaExtractor matroskaExtractor) {
        this.A00 = matroskaExtractor;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0979Ik
    public final void A4i(int i, int i4, InterfaceC2190ms interfaceC2190ms) throws IOException {
        this.A00.A0U(i, i4, interfaceC2190ms);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0979Ik
    public final void A6N(int i) throws C3K {
        this.A00.A0S(i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0979Ik
    public final void A6a(int i, double d2) throws C3K {
        this.A00.A0T(i, d2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0979Ik
    public final int A7u(int i) {
        return this.A00.A0R(i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0979Ik
    public final void AAH(int i, long j9) throws C3K {
        this.A00.A0V(i, j9);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0979Ik
    public final boolean AAW(int i) {
        return this.A00.A0Y(i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0979Ik
    public final void AK9(int i, long j9, long j10) throws C3K {
        this.A00.A0W(i, j9, j10);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0979Ik
    public final void AKK(int i, String str) throws C3K {
        this.A00.A0X(i, str);
    }
}
