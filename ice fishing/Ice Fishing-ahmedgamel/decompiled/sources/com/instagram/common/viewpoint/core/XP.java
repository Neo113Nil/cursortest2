package com.instagram.common.viewpoint.core;

import android.view.View;
import com.anythink.core.common.s.a.c;
import com.anythink.expressad.f.a.b;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class XP implements VM {
    public static byte[] A04;
    public static String[] A05 = {"HMqNF3eSIzlMBYXVNU3nP1NvWYo5", "x1o785RKTr7Jq0RcU0BPUyycJ3fBjUeE", "GBfmO3K", "Po", "VaaklUluHJvo1XkXnH3kavV5L6d7gpHG", "rG9SvJ3uZ6", "s9MPDvRc6n", "AU4sbnw7bsTTRuLyXll9UaPcK28fS"};
    public static final String A06;
    public ViewOnAttachStateChangeListenerC1372Xe A00;
    public C2469rN<C1317Uw, V1> A01;
    public final C1856ge A02;
    public final C0800Ao A03 = C0800Ao.A01();

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i4);
        int i9 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A05[1].length() == 18) {
                throw new RuntimeException();
            }
            A05[1] = "YaUcq3PJYQGMSsmKTTLasxzUL6lFeW7O";
            if (i9 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 121);
            i9++;
        }
    }

    public static void A02() {
        A04 = new byte[]{79, 115, 126, 59, 118, 126, Byte.MAX_VALUE, 114, 122, 59, 120, 105, 126, 122, 111, 114, 109, 126, 59, 109, 114, 126, 108, 59, 114, 104, 59, 117, 110, 119, 119, 53, 121, 66, 94, 73, 75, 69, 95, 88, 73, 94, 69, 66, 75, 12, 77, 12, 66, 89, c.f17104b, c.f17104b, 12, 79, 94, 73, 77, 88, 69, 90, 73, 12, 90, 69, 73, 91, 13, 83, 108, 96, 114, 117, 106, 108, 107, 113, 65, 100, 113, 100, 37, 108, 118, 37, 107, 112, 105, 105, 36, 25, 15, 9, 5, 4, 14, 53, 9, 2, 11, 4, 4, 15, 6};
    }

    static {
        A02();
        A06 = XP.class.getSimpleName();
    }

    public XP(C1856ge c1856ge) {
        this.A02 = c1856ge;
    }

    private void A01() {
        this.A02.A08().ABC(A00(89, 14, 19), b.cl, new C1273Te(A00(67, 22, 124)));
    }

    @Override // com.instagram.common.viewpoint.core.VM
    public final void ADb() {
        if (this.A01 != null) {
            this.A01.A07.A00();
        } else {
            A01();
        }
    }

    @Override // com.instagram.common.viewpoint.core.VM
    public final void AGc() {
        if (this.A01 != null) {
            this.A01.A07.A03();
        } else {
            A01();
        }
    }

    @Override // com.instagram.common.viewpoint.core.VM
    public final void AKU(View view) {
        if (this.A01 == null) {
            this.A02.A08().ABC(A00(89, 14, 19), b.cl, new C1273Te(A00(32, 35, 85)));
            return;
        }
        this.A03.A08(view);
    }

    @Override // com.instagram.common.viewpoint.core.VM
    public final void AKn(View view, String str, boolean z6) {
        AKo(view, str, z6, false);
    }

    @Override // com.instagram.common.viewpoint.core.VM
    public final void AKo(View view, String str, boolean z6, boolean z9) {
        AKp(view, str, z6, z9, false);
    }

    @Override // com.instagram.common.viewpoint.core.VM
    public final void AKp(View view, String str, boolean z6, boolean z9, boolean z10) {
        if (view != null) {
            this.A00 = new ViewOnAttachStateChangeListenerC1372Xe(view, this.A02);
            this.A03.A0A(this.A00, view);
            if (z9) {
                this.A00.A04();
            }
            this.A01 = C2469rN.A00(new C1317Uw(this.A02, view, str, z6, z10), new V1(), A06).A06(new C1373Xf(new XM())).A07();
            this.A03.A09(view, this.A01);
            return;
        }
        this.A02.A08().ABC(A00(89, 14, 19), b.cl, new C1273Te(A00(0, 32, 98)));
    }
}
