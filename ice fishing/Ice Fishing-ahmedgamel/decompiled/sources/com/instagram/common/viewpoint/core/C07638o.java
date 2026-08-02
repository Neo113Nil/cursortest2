package com.instagram.common.viewpoint.core;

import android.os.Handler;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.8o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C07638o {
    public final Handler A00;
    public final InterfaceC07648p A01;

    public C07638o(Handler handler, InterfaceC07648p interfaceC07648p) {
        this.A00 = interfaceC07648p != null ? (Handler) AbstractC06443y.A01(handler) : null;
        this.A01 = interfaceC07648p;
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "New API")
    public final void A00(final int i) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8a
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A01(final int i, final long j6, final long j9) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8e
                @Override // java.lang.Runnable
                public final void run() {
                    C07638o.this.A02(i, j6, j9);
                }
            });
        }
    }

    public final /* synthetic */ void A02(int i, long j6, long j9) {
        ((InterfaceC07648p) C5C.A0f(this.A01)).AD9(i, j6, j9);
    }

    public final void A03(final long j6) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8f
                @Override // java.lang.Runnable
                public final void run() {
                    C07638o.this.A04(j6);
                }
            });
        }
    }

    public final /* synthetic */ void A04(long j6) {
        ((InterfaceC07648p) C5C.A0f(this.A01)).AD5(j6);
    }

    public final void A05(final C2420qI c2420qI, final C6L c6l) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8j
                @Override // java.lang.Runnable
                public final void run() {
                    C07638o.this.A06(c2420qI, c6l);
                }
            });
        }
    }

    public final /* synthetic */ void A06(C2420qI c2420qI, C6L c6l) {
        ((InterfaceC07648p) C5C.A0f(this.A01)).AD3(c2420qI);
        ((InterfaceC07648p) C5C.A0f(this.A01)).AD4(c2420qI, c6l);
    }

    public final void A07(final C6I c6i) {
        c6i.A02();
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8h
                @Override // java.lang.Runnable
                public final void run() {
                    C07638o.this.A09(c6i);
                }
            });
        }
    }

    public final void A08(final C6I c6i) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8n
                @Override // java.lang.Runnable
                public final void run() {
                    C07638o.this.A0A(c6i);
                }
            });
        }
    }

    public final /* synthetic */ void A09(C6I c6i) {
        c6i.A02();
        ((InterfaceC07648p) C5C.A0f(this.A01)).AD1(c6i);
    }

    public final /* synthetic */ void A0A(C6I c6i) {
        ((InterfaceC07648p) C5C.A0f(this.A01)).AD2(c6i);
    }

    public final void A0B(final C07658r c07658r) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8d
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0C(final C07658r c07658r) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8Z
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0D(final Exception exc) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8g
                @Override // java.lang.Runnable
                public final void run() {
                    C07638o.this.A0E(exc);
                }
            });
        }
    }

    public final /* synthetic */ void A0E(Exception exc) {
        ((InterfaceC07648p) C5C.A0f(this.A01)).AD6(exc);
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "New API")
    public final void A0F(final String str) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8k
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    public final void A0G(final String str, final long j6, final long j9) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8Y
                @Override // java.lang.Runnable
                public final void run() {
                    C07638o.this.A0H(str, j6, j9);
                }
            });
        }
    }

    public final /* synthetic */ void A0H(String str, long j6, long j9) {
        ((InterfaceC07648p) C5C.A0f(this.A01)).AD0(str, j6, j9);
    }

    public final void A0I(final boolean z6) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8c
                @Override // java.lang.Runnable
                public final void run() {
                    C07638o.this.A0J(z6);
                }
            });
        }
    }

    public final /* synthetic */ void A0J(boolean z6) {
        ((InterfaceC07648p) C5C.A0f(this.A01)).AFy(z6);
    }

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "New API")
    public final void A0K(final byte[] bArr, final long j6) {
        if (this.A00 != null) {
            this.A00.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8l
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }
}
