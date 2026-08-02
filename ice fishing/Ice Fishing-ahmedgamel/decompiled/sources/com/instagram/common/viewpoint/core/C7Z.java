package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.b;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.7Z, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C7Z {
    public static final C2268no A0E = new C2268no(new Object());
    public final int A00;
    public final long A01;
    public final long A02;
    public final Timeline A03;
    public final C2268no A04;
    public final C2268no A05;
    public final C2250nW A06;
    public final C0910Ex A07;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Start Stall Logging")
    public final EnumC1986ir A08;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Determine if stall is from Audio for logging")
    public final boolean A09;
    public final boolean A0A;
    public volatile long A0B;
    public volatile long A0C;
    public volatile long A0D;

    public C7Z(Timeline timeline, long j6, C2250nW c2250nW, C0910Ex c0910Ex) {
        this(timeline, A0E, j6, b.f7168b, 1, false, c2250nW, c0910Ex, A0E, j6, j6, j6, EnumC1986ir.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to call base constructor")
    public C7Z(Timeline timeline, C2268no c2268no, long j6, long j9, int i, boolean z6, C2250nW c2250nW, C0910Ex c0910Ex, C2268no c2268no2, long j10, long j11, long j12) {
        this(timeline, c2268no, j6, j9, i, z6, c2250nW, c0910Ex, c2268no2, j10, j11, j12, EnumC1986ir.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to add new parameters")
    public C7Z(@MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) Timeline timeline, @MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) C2268no c2268no, long j6, long j9, int i, boolean z6, C2250nW c2250nW, C0910Ex c0910Ex, C2268no c2268no2, long j10, long j11, long j12, EnumC1986ir enumC1986ir, boolean z9) {
        this.A03 = timeline;
        this.A05 = c2268no;
        this.A02 = j6;
        this.A01 = j9;
        this.A0C = j6;
        this.A00 = i;
        this.A0A = z6;
        this.A06 = c2250nW;
        this.A07 = c0910Ex;
        this.A04 = c2268no2;
        this.A0B = j10;
        this.A0D = j11;
        this.A0C = j12;
        this.A08 = enumC1986ir;
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
    public final C7Z A02(int i, EnumC1986ir enumC1986ir, boolean z6) {
        C7Z c7z = new C7Z(this.A03, this.A05, this.A02, this.A01, i, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, enumC1986ir, z6);
        A00(this, c7z);
        return c7z;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "To track Audio Stalls for Logging")
    public final C7Z A03(int i, boolean z6) {
        C7Z c7z = new C7Z(this.A03, this.A05, this.A02, this.A01, i, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, z6);
        A00(this, c7z);
        return c7z;
    }

    public final C7Z A04(Timeline timeline) {
        C7Z c7z = new C7Z(timeline, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c7z);
        return c7z;
    }

    public final C7Z A05(C2268no c2268no) {
        return new C7Z(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, c2268no, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
    }

    public final C7Z A06(C2268no c2268no, long j6, long j9, long j10) {
        long j11 = j9;
        Timeline timeline = this.A03;
        if (!c2268no.A00()) {
            j11 = b.f7168b;
        }
        return new C7Z(timeline, c2268no, j6, j11, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, j10, j6);
    }

    public final C7Z A07(C2250nW c2250nW, C0910Ex c0910Ex) {
        C7Z c7z = new C7Z(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, c2250nW, c0910Ex, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c7z);
        return c7z;
    }

    public final C7Z A08(boolean z6) {
        C7Z c7z = new C7Z(this.A03, this.A05, this.A02, this.A01, this.A00, z6, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c7z);
        return c7z;
    }
}
