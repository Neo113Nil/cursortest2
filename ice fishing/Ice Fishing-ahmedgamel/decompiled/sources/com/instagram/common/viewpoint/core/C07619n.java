package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Looper;
import com.anythink.basead.exoplayer.b;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.9n, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07619n extends AbstractC2255nv implements DI {
    public long A00;
    public InterfaceC06715t A01;
    public InterfaceC2081ku<InterfaceExecutorC0894Fb> A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final AnonymousClass32 A07;
    public final C2389q7 A08;
    public final C5Y A09;
    public final A6 A0A;
    public final DC A0B;
    public final FF A0C;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ku != com.google.common.base.Supplier<com.facebook.ads.androidx.media3.exoplayer.util.ReleasableExecutor> */
    @MetaExoPlayerCustomization("Allow for passing a new drmSessionManager")
    public C07619n(C2389q7 c2389q7, C5Y c5y, DC dc, A6 a62, FF ff, int i, InterfaceC2081ku<InterfaceExecutorC0894Fb> interfaceC2081ku) {
        this.A07 = (AnonymousClass32) AbstractC06243y.A01(c2389q7.A03);
        this.A08 = c2389q7;
        this.A09 = c5y;
        this.A0B = dc;
        this.A0A = a62 == null ? A6.A00 : a62;
        this.A0C = ff;
        this.A06 = i;
        this.A04 = true;
        this.A00 = b.f6382b;
        this.A02 = interfaceC2081ku;
    }

    private void A00() {
        final Timeline c07609m = new C07609m(this.A00, this.A05, false, this.A03, null, this.A08);
        if (this.A04) {
            Timeline timeline = new C9t(c07609m) { // from class: com.facebook.ads.redexgen.X.1e
                @Override // com.instagram.common.viewpoint.core.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final C2367pl A0I(int i, C2367pl c2367pl, boolean z3) {
                    super.A0I(i, c2367pl, z3);
                    c2367pl.A05 = true;
                    return c2367pl;
                }

                @Override // com.instagram.common.viewpoint.core.C9t, com.facebook.ads.androidx.media3.common.Timeline
                public final C2365pj A0L(int i, C2365pj c2365pj, long j6) {
                    super.A0L(i, c2365pj, j6);
                    c2365pj.A0F = true;
                    return c2365pj;
                }
            };
            c07609m = timeline;
        }
        A05(c07609m);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2255nv
    public final void A09() {
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2255nv
    public final void A0A(InterfaceC06715t interfaceC06715t) {
        this.A01 = interfaceC06715t;
        this.A0A.AH4();
        this.A0A.AJe((Looper) AbstractC06243y.A01(Looper.myLooper()), A00());
        A00();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0838Cx
    @MetaExoPlayerCustomization("PlayerId needs to be set")
    public final InterfaceC2249np A5W(C2248no c2248no, F0 f02, long j6) {
        InterfaceExecutorC0894Fb interfaceExecutorC0894Fb;
        InterfaceC2336pF A5I = this.A09.A5I();
        if (this.A01 != null) {
            A5I.A43(this.A01);
        }
        Uri uri = this.A07.A00;
        DD A5X = this.A0B.A5X(C8O.A03);
        A6 a62 = this.A0A;
        A1 A01 = A01(c2248no);
        FF ff = this.A0C;
        D8 A02 = A02(c2248no);
        String str = this.A07.A04;
        int i = this.A06;
        if (this.A02 != null) {
            interfaceExecutorC0894Fb = this.A02.get();
        } else {
            interfaceExecutorC0894Fb = null;
        }
        return new C07639p(uri, A5I, A5X, a62, A01, ff, A02, this, f02, str, i, interfaceExecutorC0894Fb);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0838Cx
    public final void ACT() {
    }

    @Override // com.instagram.common.viewpoint.core.DI
    public final void AG0(long j6, boolean z3, boolean z6) {
        if (j6 == b.f6382b) {
            j6 = this.A00;
        }
        if (!this.A04 && this.A00 == j6 && this.A05 == z3 && this.A03 == z6) {
            return;
        }
        this.A00 = j6;
        this.A05 = z3;
        this.A03 = z6;
        this.A04 = false;
        A00();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0838Cx
    public final void AHk(InterfaceC2249np interfaceC2249np) {
        ((C07639p) interfaceC2249np).A0a();
    }
}
