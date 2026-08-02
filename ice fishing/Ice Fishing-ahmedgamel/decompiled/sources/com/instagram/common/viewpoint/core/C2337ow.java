package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ow, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2337ow implements AnonymousClass78 {
    public static byte[] A07;
    public static String[] A08 = {"yII62Bxz4ePSH41vB2jdKSugEbZVWw1P", "xxJts2URfaqafakNk2KbG7F81xmmDazV", "4dv2SznKWSxWwafbIX2ls1ujl8jSHd2n", "ZTUBGrXVNXomnx09AH", "GEOoy7FoThRACcjBmfZ1TUIlEpKlWtQ8", "rZtP7yRh3duuKSKGXoPyzbqapeA3agH5", "0fM4GZ86zQsT7VByU2LW0lXLtFUbu0NT", "1qHBrVxL1wzL98lt8KL7QvczAsaDn4yk"};
    public AnonymousClass78 A00;
    public InterfaceC2329oo A01;
    public boolean A04;
    public final C6P A05;
    public final C2325ok A06;
    public boolean A03 = true;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "This reverts a bug introduced in D48802706. The upgraded exoaccounts for this but not the old exo. Hence, this is needed here temporarily")
    public boolean A02 = MetaExoPlayerUpgradeConfig.A03(EnumC2020jX.A1h);

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{86, 110, 119, 111, 114, 107, 119, 126, 59, 105, 126, 117, Byte.MAX_VALUE, 126, 105, 126, 105, 59, 118, 126, Byte.MAX_VALUE, 114, 122, 59, 120, 119, 116, 120, 112, 104, 59, 126, 117, 122, 121, 119, 126, Byte.MAX_VALUE, 53};
    }

    static {
        A01();
    }

    public C2337ow(C6P c6p, AnonymousClass45 anonymousClass45) {
        this.A05 = c6p;
        this.A06 = new C2325ok(anonymousClass45);
    }

    private void A02(boolean z6) {
        if (A03(z6)) {
            this.A03 = true;
            if (this.A04) {
                this.A06.A00();
                return;
            }
            return;
        }
        AnonymousClass78 anonymousClass78 = (AnonymousClass78) AbstractC06443y.A01(this.A00);
        long A8p = anonymousClass78.A8p();
        if (this.A03) {
            AnonymousClass78 rendererClock = this.A06;
            long rendererClockPositionUs = rendererClock.A8p();
            if (A8p < rendererClockPositionUs) {
                this.A06.A01();
                return;
            }
            this.A03 = false;
            if (this.A04) {
                C2325ok c2325ok = this.A06;
                String[] strArr = A08;
                if (strArr[0].charAt(6) != strArr[7].charAt(6)) {
                    throw new RuntimeException();
                }
                A08[3] = "DdBgGw0WSHdH6u";
                c2325ok.A00();
            }
        }
        this.A06.A02(A8p);
        C2399px A8m = anonymousClass78.A8m();
        AnonymousClass78 rendererClock2 = this.A06;
        if (!A8m.equals(rendererClock2.A8m())) {
            AnonymousClass78 rendererClock3 = this.A06;
            rendererClock3.AJd(A8m);
            this.A05.AFI(A8m);
        }
    }

    private boolean A03(boolean z6) {
        if (this.A01 != null) {
            InterfaceC2329oo interfaceC2329oo = this.A01;
            String[] strArr = A08;
            if (strArr[0].charAt(6) != strArr[7].charAt(6)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[0] = "259perxNRfR5uYao2q6cSAfIVJfeeK6N";
            strArr2[7] = "EI3wTVxb9Zi5034aB38J7XgUXur7uJJK";
            if (!interfaceC2329oo.AAP()) {
                if (!this.A01.AAe()) {
                    if (!z6) {
                        boolean A9p = this.A01.A9p();
                        String[] strArr3 = A08;
                        if (strArr3[4].charAt(0) != strArr3[5].charAt(0)) {
                            A08[3] = "UNE8e4mByuhRiLOUb8sZtJ";
                            if (A9p) {
                            }
                        } else if (A9p) {
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final long A04(boolean z6) {
        A02(z6);
        return A8p();
    }

    public final void A05() {
        this.A04 = true;
        this.A06.A00();
    }

    public final void A06() {
        this.A04 = false;
        this.A06.A01();
    }

    public final void A07(long j6) {
        this.A06.A02(j6);
    }

    public final void A08(InterfaceC2329oo interfaceC2329oo) {
        if (interfaceC2329oo == this.A01) {
            this.A00 = null;
            this.A01 = null;
            this.A03 = true;
        }
    }

    public final void A09(InterfaceC2329oo interfaceC2329oo) throws AD {
        AnonymousClass78 A8T = interfaceC2329oo.A8T();
        if (A8T != null) {
            AnonymousClass78 rendererMediaClock = this.A00;
            if (A8T != rendererMediaClock) {
                AnonymousClass78 anonymousClass78 = this.A00;
                String[] strArr = A08;
                if (strArr[0].charAt(6) != strArr[7].charAt(6)) {
                    throw new RuntimeException();
                }
                A08[3] = "dGOISEf";
                if (anonymousClass78 == null) {
                    this.A00 = A8T;
                    this.A01 = interfaceC2329oo;
                    AnonymousClass78 anonymousClass782 = this.A00;
                    AnonymousClass78 rendererMediaClock2 = this.A06;
                    anonymousClass782.AJd(rendererMediaClock2.A8m());
                    return;
                }
                throw AD.A02(new IllegalStateException(A00(0, 39, 8)));
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass78
    public final C2399px A8m() {
        if (this.A00 != null) {
            return this.A00.A8m();
        }
        return this.A06.A8m();
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass78
    public final long A8p() {
        if (this.A03) {
            return this.A06.A8p();
        }
        return ((AnonymousClass78) AbstractC06443y.A01(this.A00)).A8p();
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass78
    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "This reverts a bug introduced in D48802706. The upgraded exoaccounts for this but not the old exo. Hence, this is needed here temporarily")
    public final void AJd(C2399px c2399px) {
        if (this.A00 != null) {
            this.A00.AJd(c2399px);
            c2399px = this.A00.A8m();
        }
        this.A06.AJd(c2399px);
        if (this.A02) {
            this.A05.AFI(c2399px);
        }
    }
}
