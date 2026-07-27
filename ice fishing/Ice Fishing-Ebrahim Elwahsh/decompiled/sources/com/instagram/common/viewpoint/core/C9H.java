package com.instagram.common.viewpoint.core;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.anythink.core.common.s.a.c;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.9H, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C9H {
    public static byte[] A0A;
    public static String[] A0B = {"rRI8qFzkORd3qFRWXYKq4VZ7aOLIEK5J", "8iww", "9Fk01UJleHjJYWOvUCOjDovINy", "Tv7H9N81DtUxkF43CmkgrLrGhTLdsXix", "nBkKdwNSwO57UCO3SoKJGDMTXuqjBDbM", "lOXwNuIjFjHmQAdnwK2N8OZR9kPb", "lPFUJhDD1cvxNL1LCxfPRC2f3Pky1Kvn", "6r"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C2399qI A07;
    public final boolean A08;
    public final InterfaceC06093k[] A09;

    public static String A06(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 4);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{5, 36, 39, 32, 52, 45, 53, 0, 52, 37, 40, 46, 18, 40, 47, 42, 40, c.f16476c, 35, 38, 46, 11, c.f16476c, 46, 35, 37, 30, 56, 43, 41, 33, 112, 106, 57, 62, 43, 62, 47, 119, 111, 46, 102, 106, 43, c.f16476c, 46, 35, 37, 30, 56, 43, 41, 33, 11, 38, 38, 37, 41, 43, 62, 47, 46, 100, 45, 47, 62, 98, 99, 119, 111, 46};
    }

    static {
        A07();
    }

    public C9H(C2399qI c2399qI, int i, int i4, int i9, int i10, int i11, int i12, int i13, InterfaceC06093k[] interfaceC06093kArr, boolean z8) {
        this.A07 = c2399qI;
        this.A01 = i;
        this.A04 = i4;
        this.A05 = i9;
        this.A06 = i10;
        this.A02 = i11;
        this.A03 = i12;
        this.A00 = i13;
        this.A09 = interfaceC06093kArr;
        this.A08 = z8;
    }

    public static AudioAttributes A00() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    public static AudioAttributes A01(C2405qQ c2405qQ, boolean z8) {
        if (z8) {
            return A00();
        }
        return c2405qQ.A01().A00;
    }

    private AudioTrack A02(C2405qQ c2405qQ, int i) {
        int A04 = C5C.A04(c2405qQ.A05);
        if (i != 0) {
            return new AudioTrack(A04, this.A06, this.A02, this.A03, this.A00, 1, i);
        }
        return new AudioTrack(A04, this.A06, this.A02, this.A03, this.A00, 1);
    }

    private AudioTrack A03(boolean z8, C2405qQ c2405qQ, int i) {
        if (C5C.A02 >= 29) {
            return A05(z8, c2405qQ, i);
        }
        if (C5C.A02 >= 21) {
            return A04(z8, c2405qQ, i);
        }
        AudioTrack A02 = A02(c2405qQ, i);
        String[] strArr = A0B;
        if (strArr[5].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0B;
        strArr2[5] = "QYyaIvQJX9uBRZ92y0XmWMx9BnIt";
        strArr2[7] = "OM";
        return A02;
    }

    private AudioTrack A04(boolean z8, C2405qQ c2405qQ, int i) {
        AudioFormat A0D;
        AudioAttributes A01 = A01(c2405qQ, z8);
        A0D = C2280oM.A0D(this.A06, this.A02, this.A03);
        return new AudioTrack(A01, A0D, this.A00, 1, i);
    }

    private AudioTrack A05(boolean z8, C2405qQ c2405qQ, int i) {
        AudioFormat A0D;
        A0D = C2280oM.A0D(this.A06, this.A02, this.A03);
        AudioAttributes audioTrackAttributes = A01(c2405qQ, z8);
        AudioTrack.Builder audioFormat = new AudioTrack.Builder().setAudioAttributes(audioTrackAttributes).setAudioFormat(A0D);
        boolean z9 = true;
        AudioTrack.Builder sessionId = audioFormat.setTransferMode(1).setBufferSizeInBytes(this.A00).setSessionId(i);
        if (this.A04 != 1) {
            z9 = false;
        }
        AudioTrack build = sessionId.setOffloadedPlayback(z9).build();
        String[] strArr = A0B;
        if (strArr[4].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        A0B[1] = "btQ69Jh";
        return build;
    }

    public final long A08(long j9) {
        return (1000000 * j9) / this.A06;
    }

    public final long A09(long j9) {
        return (1000000 * j9) / this.A07.A0G;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D23918943: Monitor the audio track usage through audioTrackAllocated")
    public final AudioTrack A0A(boolean z8, C2405qQ c2405qQ, int i) throws C07468t {
        try {
            AudioTrack A03 = A03(z8, c2405qQ, i);
            C2280oM.A0M().incrementAndGet();
            int state = A03.getState();
            if (state == 1) {
                return A03;
            }
            try {
                A03.release();
                C2280oM.A0M().decrementAndGet();
            } catch (Exception e6) {
                AbstractC06314g.A08(A06(0, 16, 69), String.format(A06(16, 55, 78), Integer.valueOf(state), Integer.valueOf(C2280oM.A0M().get())), e6);
            }
            throw new C07468t(state, this.A06, this.A02, this.A00, this.A07, A0D(), null, C2280oM.A0M().get());
        } catch (IllegalArgumentException | UnsupportedOperationException e9) {
            throw new C07468t(0, this.A06, this.A02, this.A00, this.A07, A0D(), e9, C2280oM.A0M().get());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.8r] */
    public final C07448r A0B() {
        final int i = this.A03;
        final int i4 = this.A06;
        final int i9 = this.A02;
        final boolean z8 = this.A08;
        final boolean z9 = this.A04 == 1;
        final int i10 = this.A00;
        return new Object(i, i4, i9, z8, z9, i10) { // from class: com.facebook.ads.redexgen.X.8r
            public final int A00;
            public final int A01;
            public final int A02;
            public final int A03;
            public final boolean A04;
            public final boolean A05;

            {
                this.A02 = i;
                this.A03 = i4;
                this.A01 = i9;
                this.A05 = z8;
                this.A04 = z9;
                this.A00 = i10;
            }
        };
    }

    public final C9H A0C(int i) {
        return new C9H(this.A07, this.A01, this.A04, this.A05, this.A06, this.A02, this.A03, i, this.A09, this.A08);
    }

    public final boolean A0D() {
        return this.A04 == 1;
    }

    public final boolean A0E(C9H c9h) {
        return c9h.A04 == this.A04 && c9h.A03 == this.A03 && c9h.A06 == this.A06 && c9h.A02 == this.A02 && c9h.A05 == this.A05;
    }
}
