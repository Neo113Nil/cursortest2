package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.i.a;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* renamed from: com.facebook.ads.redexgen.X.nR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2224nR implements InterfaceC0878Em {
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

    public C2224nR() {
        this(10000, 25000, 25000, 0.75f);
    }

    public C2224nR(int i, int i4, int i9, float f6) {
        this(null, -1, i, i4, i9, 1279, 719, f6, 0.75f, a.f8040f, AnonymousClass45.A00);
    }

    public C2224nR(F6 f6) {
        this(f6, -1, 10000, 25000, 25000, 1279, 719, 0.75f, 0.75f, a.f8040f, AnonymousClass45.A00);
    }

    public C2224nR(@MetaExoPlayerCustomization("No longer set through factory") F6 f6, @MetaExoPlayerCustomization("Non standard variable; used in oculus") int i, @MetaExoPlayerCustomization("Removed from upstream") int i4, int i9, int i10, int i11, int i12, float f9, float f10, long j9, AnonymousClass45 anonymousClass45) {
        this.A09 = f6;
        this.A0A = i;
        this.A05 = i4;
        this.A02 = i9;
        this.A06 = i10;
        this.A04 = i11;
        this.A03 = i12;
        this.A00 = f9;
        this.A01 = f10;
        this.A07 = j9;
        this.A08 = anonymousClass45;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    private final C05511a A00(C2362pg c2362pg, int[] iArr, int i, F6 f6, BP<EU> bp) {
        return new C05511a(c2362pg, iArr, i, f6, this.A0A, this.A05, this.A02, this.A06, this.A04, this.A03, this.A00, this.A01, this.A07, bp, this.A08);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0878Em
    public final InterfaceC2211nE[] A5b(C0877El[] c0877ElArr, F6 f6, C2247no c2247no, Timeline timeline) {
        BP A00;
        InterfaceC2211nE A002;
        A00 = C05511a.A00(c0877ElArr);
        InterfaceC2211nE[] interfaceC2211nEArr = new InterfaceC2211nE[c0877ElArr.length];
        for (int i = 0; i < c0877ElArr.length; i++) {
            C0877El c0877El = c0877ElArr[i];
            if (c0877El != null && c0877El.A02.length != 0) {
                int length = c0877El.A02.length;
                if (A0B[3].length() != 32) {
                    throw new RuntimeException();
                }
                A0B[1] = "4JDRhnBkti3";
                if (length == 1) {
                    A002 = new C1Z(c0877El.A01, c0877El.A02[0], c0877El.A00);
                } else {
                    A002 = A00(c0877El.A01, c0877El.A02, c0877El.A00, f6, (BP) A00.get(i));
                }
                interfaceC2211nEArr[i] = A002;
            }
        }
        return interfaceC2211nEArr;
    }
}
