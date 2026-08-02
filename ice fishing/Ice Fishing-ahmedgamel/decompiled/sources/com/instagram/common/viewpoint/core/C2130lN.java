package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.lN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2130lN implements InterfaceC1062Kv {
    public static byte[] A06;
    public int A00;
    public int A01;
    public long A02 = b.f7168b;
    public boolean A03;
    public final List<LC> A04;
    public final InterfaceC0967Hd[] A05;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 49);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{1, 16, 16, 12, 9, 3, 1, 20, 9, 15, 14, -49, 4, 22, 2, 19, 21, 2, 19};
    }

    public C2130lN(List<LC> list) {
        this.A04 = list;
        this.A05 = new InterfaceC0967Hd[list.size()];
    }

    private boolean A02(C06674v c06674v, int i) {
        if (c06674v.A07() == 0) {
            return false;
        }
        if (c06674v.A0I() != i) {
            this.A03 = false;
        }
        this.A00--;
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1062Kv
    public final void A5A(C06674v c06674v) {
        if (this.A03) {
            if (this.A00 == 2 && !A02(c06674v, 32)) {
                return;
            }
            if (this.A00 == 1 && !A02(c06674v, 0)) {
                return;
            }
            int A09 = c06674v.A09();
            int A07 = c06674v.A07();
            for (InterfaceC0967Hd interfaceC0967Hd : this.A05) {
                c06674v.A0f(A09);
                interfaceC0967Hd.AIr(c06674v, A07);
            }
            int dataPosition = this.A01;
            this.A01 = dataPosition + A07;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    @Override // com.instagram.common.viewpoint.core.InterfaceC1062Kv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A5c(HA ha, LG lg) {
        for (int i = 0; i < i; i++) {
            LC lc = this.A04.get(i);
            lg.A05();
            InterfaceC0967Hd AKS = ha.AKS(lg.A03(), 3);
            AKS.A6e(new C06112p().A0y(lg.A04()).A11(A00(0, 19, 111)).A12(Collections.singletonList(lc.A02)).A10(lc.A01).A14());
            this.A05[i] = AKS;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1062Kv
    public final void AGp() {
        if (this.A03) {
            if (this.A02 != b.f7168b) {
                for (InterfaceC0967Hd interfaceC0967Hd : this.A05) {
                    interfaceC0967Hd.AIu(this.A02, 1, this.A01, 0, null);
                }
            }
            this.A03 = false;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1062Kv
    public final void AGq(long j6, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.A03 = true;
        if (j6 != b.f7168b) {
            this.A02 = j6;
        }
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1062Kv
    public final void AJ5() {
        this.A03 = false;
        this.A02 = b.f7168b;
    }
}
