package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Looper;
import com.anythink.basead.exoplayer.b;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.9n, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07819n extends AbstractC2275nv implements DI {
    public long A00;
    public InterfaceC06915t A01;
    public InterfaceC2101ku<InterfaceExecutorC0914Fb> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final AnonymousClass32 A07;
    public final C2409q7 A08;
    public final C5Y A09;
    public final A6 A0A;
    public final DC A0B;
    public final FF A0C;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ku != com.google.common.base.Supplier<com.facebook.ads.androidx.media3.exoplayer.util.ReleasableExecutor> */
    @MetaExoPlayerCustomization("Allow for passing a new drmSessionManager")
    public C07819n(C2409q7 c2409q7, C5Y c5y, DC dc, A6 a62, FF ff, int i, InterfaceC2101ku<InterfaceExecutorC0914Fb> interfaceC2101ku) {
        this.A07 = (AnonymousClass32) AbstractC06443y.A01(c2409q7.A03);
        this.A08 = c2409q7;
        this.A09 = c5y;
        this.A0B = dc;
        this.A0A = a62 == null ? A6.A00 : a62;
        this.A0C = ff;
        this.A06 = i;
        this.A04 = true;
        this.A00 = b.f7168b;
        this.A02 = interfaceC2101ku;
    }

    private void A00() {
        final Timeline c07809m = new C07809m(this.A00, this.A05, false, this.A03, null, this.A08);
        if (this.A04) {
            Timeline timeline = new C9t(c07809m) { // from class: com.facebook.ads.redexgen.X.1e
                @Override // com.instagram.common.viewpoint.core.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final C2387pl A0I(int i, C2387pl c2387pl, boolean z6) {
                    super.A0I(i, c2387pl, z6);
                    c2387pl.A05 = true;
                    return c2387pl;
                }

                @Override // com.instagram.common.viewpoint.core.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final C2385pj A0L(int i, C2385pj c2385pj, long j6) {
                    super.A0L(i, c2385pj, j6);
                    c2385pj.A0F = true;
                    return c2385pj;
                }
            };
            c07809m = timeline;
        }
        A05(c07809m);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2275nv
    public final void A09() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2275nv
    public final void A0A(InterfaceC06915t interfaceC06915t) {
        this.A01 = interfaceC06915t;
        this.A0A.AH4();
        this.A0A.AJe((Looper) AbstractC06443y.A01(Looper.myLooper()), A00());
        A00();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0858Cx
    @MetaExoPlayerCustomization("PlayerId needs to be set")
    public final InterfaceC2269np A5W(C2268no c2268no, F0 f02, long j6) {
        InterfaceExecutorC0914Fb interfaceExecutorC0914Fb;
        InterfaceC2356pF A5I = this.A09.A5I();
        if (this.A01 != null) {
            A5I.A43(this.A01);
        }
        Uri uri = this.A07.A00;
        DD A5X = this.A0B.A5X(C8O.A03);
        A6 a62 = this.A0A;
        A1 A01 = A01(c2268no);
        FF ff = this.A0C;
        D8 A02 = A02(c2268no);
        String str = this.A07.A04;
        int i = this.A06;
        if (this.A02 != null) {
            interfaceExecutorC0914Fb = this.A02.get();
        } else {
            interfaceExecutorC0914Fb = null;
        }
        return new C07839p(uri, A5I, A5X, a62, A01, ff, A02, this, f02, str, i, interfaceExecutorC0914Fb);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0858Cx
    public final void ACT() {
    }

    @Override // com.instagram.common.viewpoint.core.DI
    public final void AG0(long j6, boolean z6, boolean z9) {
        if (j6 == b.f7168b) {
            j6 = this.A00;
        }
        if (!this.A04 && this.A00 == j6 && this.A05 == z6 && this.A03 == z9) {
            return;
        }
        this.A00 = j6;
        this.A05 = z6;
        this.A03 = z9;
        this.A04 = false;
        A00();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0858Cx
    public final void AHk(InterfaceC2269np interfaceC2269np) {
        ((C07839p) interfaceC2269np).A0a();
    }
}
