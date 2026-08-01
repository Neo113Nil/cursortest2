package com.instagram.common.viewpoint.core;

import android.media.MediaFormat;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.oq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2311oq implements G2, GR, InterfaceC07067c {
    public static byte[] A04;
    public static String[] A05 = {"s2pX1dUuV9yMGkOQMpNHWy9uhNawnk9Y", "g94kU4b", "NzGTwCFJguijRpsE4vnu2khyHl2vzHxI", "mcwg2", "3H7kdFWigyqN00XNlLPoaD6s2Om", "arwBjFb", "zwCIEju4cqvLZ8D4reT2LOc82uEYQHt6", "4voNbHG588W1rePZ0VIdJriIAfqG9T"};
    public G2 A00;
    public G2 A01;
    public GR A02;
    public GR A03;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 1);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{2, 0, 17, 51, 12, 1, 0, 10, 35, 23, 4, 8, 0, 40, 0, 17, 4, 1, 4, 17, 4, 41, 12, 22, 17, 0, 11, 0, 23};
    }

    static {
        A01();
    }

    public C2311oq() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC07067c
    public final void A9i(int i, Object obj) {
        switch (i) {
            case 7:
                this.A01 = (G2) obj;
                return;
            case 8:
                this.A02 = (GR) obj;
                return;
            case 10000:
                if (0 == 0) {
                    this.A00 = null;
                    this.A03 = null;
                    return;
                }
                throw new NullPointerException(A00(0, 29, 100));
            default:
                return;
        }
    }

    @Override // com.instagram.common.viewpoint.core.G2
    public final void AGS(long j6, long j9, C2400qI c2400qI, MediaFormat mediaFormat) {
        if (this.A00 != null) {
            G2 g22 = this.A00;
            if (A05[0].charAt(20) != 'W') {
                throw new RuntimeException();
            }
            A05[4] = "rCzQpO90p93bI0FQ7tWj9IORt31";
            g22.AGS(j6, j9, c2400qI, mediaFormat);
        }
        if (this.A01 != null) {
            this.A01.AGS(j6, j9, c2400qI, mediaFormat);
        }
    }
}
