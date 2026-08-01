package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.facebook.ads.redexgen.X.lw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2145lw implements H9 {
    public static byte[] A03;
    public static String[] A04 = {"IFBRawCVF0AWJOiiVagp2bzm1iWWQKSj", "auHMqC8YUXWsvqiTg7", "x05hwyQceYKgfv4KdHsaZDzMFYGIFABO", "EiWauAjA92n8uYBsDF1eTop4V9uY", "nHLlm8XHOjaWHtwU5p4BIc0GM3UweWlu", "dBwF9hq9j3gGLabp", "n4a5QuSOEmxq5i2DA2", "Zy0ftHIbrTR5qGqkd"};
    public static final HD A05;
    public HA A00;
    public AbstractC0996Jb A01;
    public boolean A02;

    public static String A01(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i6);
        int i10 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A04[3].length() == 20) {
                throw new RuntimeException();
            }
            A04[3] = "IEdap1c7a0gADNuxefg";
            if (i10 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 36);
            i10++;
        }
    }

    public static void A02() {
        A03 = new byte[]{96, 71, 79, 74, 67, 66, 6, 82, 73, 6, 66, 67, 82, 67, 84, 75, 79, 72, 67, 6, 68, 79, 82, 85, 82, 84, 67, 71, 75, 6, 82, 95, 86, 67};
    }

    static {
        A02();
        A05 = new HD() { // from class: com.facebook.ads.redexgen.X.lx
            @Override // com.instagram.common.viewpoint.core.HD
            public final H9[] A5N() {
                return C2145lw.A04();
            }

            @Override // com.instagram.common.viewpoint.core.HD
            public final /* synthetic */ H9[] A5O(Uri uri, Map map) {
                return HC.A01(this, uri, map);
            }
        };
    }

    public static C06474v A00(C06474v c06474v) {
        c06474v.A0f(0);
        return c06474v;
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private boolean A03(InterfaceC2191ms interfaceC2191ms) throws IOException {
        JX jx = new JX();
        if (!jx.A05(interfaceC2191ms, true) || (jx.A04 & 2) != 2) {
            return false;
        }
        int length = Math.min(jx.A00, 8);
        C06474v c06474v = new C06474v(length);
        interfaceC2191ms.AGt(c06474v.A0l(), 0, length);
        if (C2147ly.A01(A00(c06474v))) {
            this.A01 = new C2147ly();
        } else if (C2142lt.A06(A00(c06474v))) {
            this.A01 = new C2142lt();
        } else {
            if (!C2144lv.A02(A00(c06474v))) {
                return false;
            }
            this.A01 = new C2144lv();
        }
        return true;
    }

    public static /* synthetic */ H9[] A04() {
        return new H9[]{new C2145lw()};
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AAC(HA ha) {
        this.A00 = ha;
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final int AHL(InterfaceC2191ms interfaceC2191ms, HV hv) throws IOException {
        AbstractC06243y.A02(this.A00);
        if (this.A01 == null) {
            if (A03(interfaceC2191ms)) {
                interfaceC2191ms.AIl();
            } else {
                throw C3K.A01(A01(0, 34, 2), null);
            }
        }
        boolean z3 = this.A02;
        if (A04[0].charAt(6) == 'U') {
            throw new RuntimeException();
        }
        A04[5] = "ISTJLhLpuA8o4P7J";
        if (!z3) {
            InterfaceC0947Hd AKS = this.A00.AKS(0, 1);
            this.A00.A6O();
            this.A01.A08(this.A00, AKS);
            this.A02 = true;
        }
        return this.A01.A04(interfaceC2191ms, hv);
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AHb() {
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AJ6(long j6, long j9) {
        if (this.A01 != null) {
            this.A01.A07(j6, j9);
        }
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final boolean AK5(InterfaceC2191ms interfaceC2191ms) throws IOException {
        try {
            return A03(interfaceC2191ms);
        } catch (C3K unused) {
            return false;
        }
    }
}
