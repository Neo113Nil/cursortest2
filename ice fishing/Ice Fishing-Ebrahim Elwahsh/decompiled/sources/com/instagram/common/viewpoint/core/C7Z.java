package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.b;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.7Z, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C7Z {
    public static final C2247no A0E = new C2247no(new Object());
    public final int A00;
    public final long A01;
    public final long A02;
    public final Timeline A03;
    public final C2247no A04;
    public final C2247no A05;
    public final C2229nW A06;
    public final C0889Ex A07;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Start Stall Logging")
    public final EnumC1965ir A08;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Determine if stall is from Audio for logging")
    public final boolean A09;
    public final boolean A0A;
    public volatile long A0B;
    public volatile long A0C;
    public volatile long A0D;

    public C7Z(Timeline timeline, long j9, C2229nW c2229nW, C0889Ex c0889Ex) {
        this(timeline, A0E, j9, b.f6539b, 1, false, c2229nW, c0889Ex, A0E, j9, j9, j9, EnumC1965ir.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to call base constructor")
    public C7Z(Timeline timeline, C2247no c2247no, long j9, long j10, int i, boolean z8, C2229nW c2229nW, C0889Ex c0889Ex, C2247no c2247no2, long j11, long j12, long j13) {
        this(timeline, c2247no, j9, j10, i, z8, c2229nW, c0889Ex, c2247no2, j11, j12, j13, EnumC1965ir.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to add new parameters")
    public C7Z(@MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) Timeline timeline, @MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) C2247no c2247no, long j9, long j10, int i, boolean z8, C2229nW c2229nW, C0889Ex c0889Ex, C2247no c2247no2, long j11, long j12, long j13, EnumC1965ir enumC1965ir, boolean z9) {
        this.A03 = timeline;
        this.A05 = c2247no;
        this.A02 = j9;
        this.A01 = j10;
        this.A0C = j9;
        this.A00 = i;
        this.A0A = z8;
        this.A06 = c2229nW;
        this.A07 = c0889Ex;
        this.A04 = c2247no2;
        this.A0B = j11;
        this.A0D = j12;
        this.A0C = j13;
        this.A08 = enumC1965ir;
        this.A09 = z9;
    }

    public static void A00(C7Z c7z, C7Z c7z2) {
        c7z2.A0C = c7z.A0C;
        c7z2.A0B = c7z.A0B;
        c7z2.A0D = c7z.A0D;
    }

    public final C7Z A01(int i) {
        C7Z c7z = new C7Z(this.A03, this.A05, this.A02, this.A01, i, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c7z);
        return c7z;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Stall Reason Logging in Hero")
    public final C7Z A02(int i, EnumC1965ir enumC1965ir, boolean z8) {
        C7Z c7z = new C7Z(this.A03, this.A05, this.A02, this.A01, i, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, enumC1965ir, z8);
        A00(this, c7z);
        return c7z;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "To track Audio Stalls for Logging")
    public final C7Z A03(int i, boolean z8) {
        C7Z c7z = new C7Z(this.A03, this.A05, this.A02, this.A01, i, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, z8);
        A00(this, c7z);
        return c7z;
    }

    public final C7Z A04(Timeline timeline) {
        C7Z c7z = new C7Z(timeline, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c7z);
        return c7z;
    }

    public final C7Z A05(C2247no c2247no) {
        return new C7Z(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, c2247no, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
    }

    public final C7Z A06(C2247no c2247no, long j9, long j10, long j11) {
        long j12 = j10;
        Timeline timeline = this.A03;
        if (!c2247no.A00()) {
            j12 = b.f6539b;
        }
        return new C7Z(timeline, c2247no, j9, j12, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, j11, j9);
    }

    public final C7Z A07(C2229nW c2229nW, C0889Ex c0889Ex) {
        C7Z c7z = new C7Z(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, c2229nW, c0889Ex, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c7z);
        return c7z;
    }

    public final C7Z A08(boolean z8) {
        C7Z c7z = new C7Z(this.A03, this.A05, this.A02, this.A01, this.A00, z8, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c7z);
        return c7z;
    }
}
