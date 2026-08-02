package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.i.a;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.nR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2245nR implements InterfaceC0899Em {
    public static String[] A0B = {"ziZaTeBfSFNnIBcgtlZExnB4uOVj2q5B", "5IZt5NWgPCitKNTqtiA", "aLHVXVzU6ljMUMq9dZgrDfQ8JzHl8MF", "mvLcqO7QF6VGSUKAdCZC8bhhp8aLucng", "FQUZNhR4lN6thgMMBkcdaTgoY6ZzypcM", "72R8UBsha86AOqtb805OpiOBiH7oe8El", "AjNBccUrYW9zDFgtuo7TyJwkSvkBJU7y", "GkSBWsvGG5dBFRJxqtw9GV4lDtiTWOM"};
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final AnonymousClass45 A08;

    @MetaExoPlayerCustomization("This is no longer set in the constructor")
    public final F6 A09;
    public final int A0A;

    public C2245nR() {
        this(10000, 25000, 25000, 0.75f);
    }

    public C2245nR(int i, int i4, int i6, float f2) {
        this(null, -1, i, i4, i6, 1279, 719, f2, 0.75f, a.f8669f, AnonymousClass45.A00);
    }

    public C2245nR(F6 f62) {
        this(f62, -1, 10000, 25000, 25000, 1279, 719, 0.75f, 0.75f, a.f8669f, AnonymousClass45.A00);
    }

    public C2245nR(@MetaExoPlayerCustomization("No longer set through factory") F6 f62, @MetaExoPlayerCustomization("Non standard variable; used in oculus") int i, @MetaExoPlayerCustomization("Removed from upstream") int i4, int i6, int i9, int i10, int i11, float f2, float f9, long j6, AnonymousClass45 anonymousClass45) {
        this.A09 = f62;
        this.A0A = i;
        this.A05 = i4;
        this.A02 = i6;
        this.A06 = i9;
        this.A04 = i10;
        this.A03 = i11;
        this.A00 = f2;
        this.A01 = f9;
        this.A07 = j6;
        this.A08 = anonymousClass45;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    private final C05721a A00(C2383pg c2383pg, int[] iArr, int i, F6 f62, BP<EU> bp) {
        return new C05721a(c2383pg, iArr, i, f62, this.A0A, this.A05, this.A02, this.A06, this.A04, this.A03, this.A00, this.A01, this.A07, bp, this.A08);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0899Em
    public final InterfaceC2232nE[] A5b(C0898El[] c0898ElArr, F6 f62, C2268no c2268no, Timeline timeline) {
        BP A00;
        InterfaceC2232nE A002;
        A00 = C05721a.A00(c0898ElArr);
        InterfaceC2232nE[] interfaceC2232nEArr = new InterfaceC2232nE[c0898ElArr.length];
        for (int i = 0; i < c0898ElArr.length; i++) {
            C0898El c0898El = c0898ElArr[i];
            if (c0898El != null && c0898El.A02.length != 0) {
                int length = c0898El.A02.length;
                if (A0B[3].length() != 32) {
                    throw new RuntimeException();
                }
                A0B[1] = "4JDRhnBkti3";
                if (length == 1) {
                    A002 = new C1Z(c0898El.A01, c0898El.A02[0], c0898El.A00);
                } else {
                    A002 = A00(c0898El.A01, c0898El.A02, c0898El.A00, f62, (BP) A00.get(i));
                }
                interfaceC2232nEArr[i] = A002;
            }
        }
        return interfaceC2232nEArr;
    }
}
