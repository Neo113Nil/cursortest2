package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.SystemClock;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* loaded from: assets/audience_network/classes2.dex */
public final class GP {
    public final Handler A00;
    public final GQ A01;

    public GP(Handler handler, GQ gq) {
        this.A00 = gq != null ? (Handler) AbstractC06443y.A01(handler) : null;
        this.A01 = gq;
    }

    public final void A00(final int i, final long j6) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GL
                @Override // java.lang.Runnable
                public final void run() {
                    GP.this.A02(i, j6);
                }
            });
        }
    }

    public final void A01(final int i, final long j6) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GC
                @Override // java.lang.Runnable
                public final void run() {
                    GP.this.A03(i, j6);
                }
            });
        }
    }

    public final /* synthetic */ void A02(int i, long j6) {
        ((GQ) C5C.A0f(this.A01)).ADU(i, j6);
    }

    public final /* synthetic */ void A03(int i, long j6) {
        ((GQ) C5C.A0f(this.A01)).ADl(i, j6);
    }

    @MetaExoPlayerCustomization("New event handler")
    public final void A04(int i, C2420qI c2420qI) {
        if (this.A01 != null) {
            this.A00.post(new GO(this, i, c2420qI));
        }
    }

    public final void A05(final C2420qI c2420qI, final C6L c6l) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GI
                @Override // java.lang.Runnable
                public final void run() {
                    GP.this.A06(c2420qI, c6l);
                }
            });
        }
    }

    public final /* synthetic */ void A06(C2420qI c2420qI, C6L c6l) {
        ((GQ) C5C.A0f(this.A01)).AGU(c2420qI);
        ((GQ) C5C.A0f(this.A01)).AGV(c2420qI, c6l);
    }

    public final void A07(final C2373pW c2373pW) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GK
                @Override // java.lang.Runnable
                public final void run() {
                    GP.this.A08(c2373pW);
                }
            });
        }
    }

    public final /* synthetic */ void A08(C2373pW c2373pW) {
        ((GQ) C5C.A0f(this.A01)).AGb(c2373pW);
    }

    public final void A09(final C6I c6i) {
        c6i.A02();
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GM
                @Override // java.lang.Runnable
                public final void run() {
                    GP.this.A0B(c6i);
                }
            });
        }
    }

    public final void A0A(final C6I c6i) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GG
                @Override // java.lang.Runnable
                public final void run() {
                    GP.this.A0C(c6i);
                }
            });
        }
    }

    public final /* synthetic */ void A0B(C6I c6i) {
        c6i.A02();
        ((GQ) C5C.A0f(this.A01)).AGO(c6i);
    }

    public final /* synthetic */ void A0C(C6I c6i) {
        ((GQ) C5C.A0f(this.A01)).AGP(c6i);
    }

    public final void A0D(final Object obj) {
        if (this.A00 != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GH
                @Override // java.lang.Runnable
                public final void run() {
                    GP.this.A0E(obj, elapsedRealtime);
                }
            });
        }
    }

    public final /* synthetic */ void A0E(Object obj, long j6) {
        ((GQ) C5C.A0f(this.A01)).AFf(obj, j6);
    }

    @MetaExoPlayerCustomization("New event handler")
    public final void A0F(final String str) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GJ
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0G(final String str, final long j6, final long j9) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.GF
                @Override // java.lang.Runnable
                public final void run() {
                    GP.this.A0H(str, j6, j9);
                }
            });
        }
    }

    public final /* synthetic */ void A0H(String str, long j6, long j9) {
        ((GQ) C5C.A0f(this.A01)).AGN(str, j6, j9);
    }
}
