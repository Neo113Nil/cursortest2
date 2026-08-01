package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.lN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2110lN implements InterfaceC1042Kv {
    public static byte[] A06;
    public int A00;
    public int A01;
    public long A02 = b.f6382b;
    public boolean A03;
    public final List<LC> A04;
    public final InterfaceC0947Hd[] A05;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 49);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{1, 16, 16, 12, 9, 3, 1, 20, 9, 15, 14, -49, 4, 22, 2, 19, 21, 2, 19};
    }

    public C2110lN(List<LC> list) {
        this.A04 = list;
        this.A05 = new InterfaceC0947Hd[list.size()];
    }

    private boolean A02(C06474v c06474v, int i) {
        if (c06474v.A07() == 0) {
            return false;
        }
        if (c06474v.A0I() != i) {
            this.A03 = false;
        }
        this.A00--;
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1042Kv
    public final void A5A(C06474v c06474v) {
        if (this.A03) {
            if (this.A00 == 2 && !A02(c06474v, 32)) {
                return;
            }
            if (this.A00 == 1 && !A02(c06474v, 0)) {
                return;
            }
            int A09 = c06474v.A09();
            int A07 = c06474v.A07();
            for (InterfaceC0947Hd interfaceC0947Hd : this.A05) {
                c06474v.A0f(A09);
                interfaceC0947Hd.AIr(c06474v, A07);
            }
            int dataPosition = this.A01;
            this.A01 = dataPosition + A07;
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    @Override // com.instagram.common.viewpoint.core.InterfaceC1042Kv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A5c(HA ha, LG lg) {
        for (int i = 0; i < i; i++) {
            LC lc = this.A04.get(i);
            lg.A05();
            InterfaceC0947Hd AKS = ha.AKS(lg.A03(), 3);
            AKS.A6e(new C05912p().A0y(lg.A04()).A11(A00(0, 19, 111)).A12(Collections.singletonList(lc.A02)).A10(lc.A01).A14());
            this.A05[i] = AKS;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1042Kv
    public final void AGp() {
        if (this.A03) {
            if (this.A02 != b.f6382b) {
                for (InterfaceC0947Hd interfaceC0947Hd : this.A05) {
                    interfaceC0947Hd.AIu(this.A02, 1, this.A01, 0, null);
                }
            }
            this.A03 = false;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1042Kv
    public final void AGq(long j6, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.A03 = true;
        if (j6 != b.f6382b) {
            this.A02 = j6;
        }
        this.A01 = 0;
        this.A00 = 2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1042Kv
    public final void AJ5() {
        this.A03 = false;
        this.A02 = b.f6382b;
    }
}
