package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.core.common.s.a.c;
import com.anythink.expressad.video.module.a.a;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class MI implements InterfaceC1381Yi {
    public static byte[] A0D;
    public int A00;
    public C0886Eu A01;
    public C4L A02;
    public String A03;
    public final C1839gi A04;
    public final VA A05;
    public final InterfaceC1380Yh A06;
    public final ZP A07;
    public final C0876Ek A08;
    public final E2 A0C = new E2() { // from class: com.facebook.ads.redexgen.X.6d
        public static byte[] A01;

        static {
            A01();
        }

        public static String A00(int i, int i4, int i9) {
            byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
            for (int i10 = 0; i10 < copyOfRange.length; i10++) {
                copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 58);
            }
            return new String(copyOfRange);
        }

        public static void A01() {
            A01 = new byte[]{115, 108, 97, 96, 106, 76, 107, 113, 96, 119, 118, 113, 108, 113, 100, 105, c.f16475b, 115, 96, 107, 113};
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.UN
        /* renamed from: A02, reason: merged with bridge method [inline-methods] */
        public final void A03(E3 e32) {
            InterfaceC1380Yh interfaceC1380Yh;
            interfaceC1380Yh = MI.this.A06;
            interfaceC1380Yh.A4k(A00(0, 21, 63), e32);
        }
    };
    public final E4 A0B = new E4() { // from class: com.facebook.ads.redexgen.X.6a
        public static byte[] A01;

        static {
            A01();
        }

        public static String A00(int i, int i4, int i9) {
            byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
            for (int i10 = 0; i10 < copyOfRange.length; i10++) {
                copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 120);
            }
            return new String(copyOfRange);
        }

        public static void A01() {
            A01 = new byte[]{38, 57, 52, 53, c.f16476c, 25, 62, 36, 53, 34, 35, 36, 57, 36, 49, 60, 21, 38, 53, 62, 36};
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.UN
        /* renamed from: A02, reason: merged with bridge method [inline-methods] */
        public final void A03(C4B c4b) {
            InterfaceC1380Yh interfaceC1380Yh;
            interfaceC1380Yh = MI.this.A06;
            interfaceC1380Yh.A4k(A00(0, 21, 40), c4b);
        }
    };
    public final EA A09 = new EA() { // from class: com.facebook.ads.redexgen.X.6Z
        public static byte[] A01;
        public static String[] A02 = {"cVYzzU3WDwilAiB6lBwH", "ltb11yKnDLf", "qD1l7ddw57WScFbFlpW6gLQQ4LJZYMm4", "7tmDLtuP1dSUokfmYRKMMhnjp75BOUEQ", "O1T", "OUAaXGhWo5xW6BfvCbr", "NPW6PnCzVK8iTd9b27h5", "ykk8Miz3Z2gvnB5Rb4Sxgn912BIo"};

        public static String A00(int i, int i4, int i9) {
            byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
            for (int i10 = 0; i10 < copyOfRange.length; i10++) {
                int i11 = copyOfRange[i10] ^ i9;
                if (A02[2].charAt(8) != '5') {
                    throw new RuntimeException();
                }
                A02[5] = "7KI0j9KfVtSFY3dF";
                copyOfRange[i10] = (byte) (i11 ^ 70);
            }
            return new String(copyOfRange);
        }

        public static void A01() {
            A01 = new byte[]{3, 28, 17, 16, 26, 60, 27, 1, 16, 7, 6, 1, 28, 1, 20, 25, 48, 3, 16, 27, 1};
        }

        static {
            A01();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.UN
        /* renamed from: A02, reason: merged with bridge method [inline-methods] */
        public final void A03(C4K c4k) {
            InterfaceC1380Yh interfaceC1380Yh;
            interfaceC1380Yh = MI.this.A06;
            interfaceC1380Yh.A4k(A00(0, 21, 51), c4k);
        }
    };
    public final E8 A0A = new E8() { // from class: com.facebook.ads.redexgen.X.6Y
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.instagram.common.viewpoint.core.UN
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(E9 e9) {
            ZP zp;
            zp = MI.this.A07;
            zp.ADv();
        }
    };

    static {
        A03();
    }

    public static String A02(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 102);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0D = new byte[]{44, 56, 57, 34, 61, 33, 44, 52, 122, 117, 112, 124, 119, 109, 77, 118, 114, 124, 119, 20, 18, 4, 47, 0, 21, 8, 23, 4, 34, 21, 0, 35, 20, 21, 21, 14, 15, 55, 40, 37, 36, 46, 8, 47, 53, 36, 51, 50, 53, 40, 53, 32, 45, 4, 55, 36, 47, 53, 81, 78, 67, 66, 72, 107, 72, c.f16475b, c.f16475b, 66, 85, 116, 107, 102, 103, 109, 79, 82, 70, 103, 120, 117, 116, 126, 66, 116, 116, 122, 69, 120, 124, 116, c.f16476c, 32, 45, 44, 38, 28, 27, 5};
    }

    public MI(C1839gi c1839gi, ZP zp, VA va, InterfaceC1380Yh interfaceC1380Yh) {
        this.A04 = c1839gi;
        this.A05 = va;
        this.A07 = zp;
        this.A08 = new C0876Ek(c1839gi);
        this.A08.A0f(new C06153q(c1839gi));
        this.A08.getEventBus().A03(this.A0C, this.A0B, this.A09, this.A0A);
        this.A06 = interfaceC1380Yh;
        this.A08.setIsFullScreen(true);
        this.A08.setVolume(1.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        interfaceC1380Yh.A45(this.A08, layoutParams);
        C1388Yp closeButton = new C1388Yp(c1839gi);
        closeButton.setOnClickListener(new ZN(this));
        RelativeLayout.LayoutParams params = closeButton.getDefaultLayoutParams();
        interfaceC1380Yh.A45(closeButton, params);
    }

    public final void A04(int i) {
        this.A08.setVideoProgressReportIntervalMs(i);
    }

    public final void A05(View view) {
        this.A08.setControlsAnchorView(view);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1381Yi
    public final void AAu(Intent intent, Bundle bundle, C1201Re c1201Re) {
        String ctaText = A02(8, 11, a.f21886R);
        if (bundle == null) {
            this.A03 = intent.getStringExtra(ctaText);
        } else {
            this.A03 = bundle.getString(ctaText);
        }
        String stringExtra = intent.getStringExtra(A02(19, 18, 7));
        if (stringExtra != null && !stringExtra.isEmpty()) {
            C1675e3 c1675e3 = new C1675e3(this.A04, stringExtra);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            int i = (int) (16.0f * XX.A02);
            layoutParams.setMargins(i, i, i, i);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            c1675e3.setOnClickListener(new ZO(this));
            this.A06.A45(c1675e3, layoutParams);
        }
        this.A00 = intent.getIntExtra(A02(77, 13, 119), 0);
        this.A02 = new C4L(this.A04, this.A05, this.A08, this.A03, intent.getBundleExtra(A02(58, 11, 65)), null);
        if (C1289Up.A20(this.A04)) {
            this.A01 = new C0886Eu(this.A04, this.A05, this.A08, this.A03, false, this.A02, null);
        } else {
            this.A01 = null;
        }
        this.A08.setVideoMPD(intent.getStringExtra(A02(69, 8, 100)));
        this.A08.setVideoURI(intent.getStringExtra(A02(90, 8, 47)));
        if (this.A00 > 0) {
            this.A08.A0a(this.A00);
        }
        if (intent.getBooleanExtra(A02(0, 8, 43), false)) {
            this.A08.A0e(EnumC1726et.A04, 17);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1381Yi
    public final void AFA(boolean z8) {
        this.A06.A4k(A02(37, 21, 39), new E6());
        this.A08.A0X();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1381Yi
    public final void AFi(boolean z8) {
        this.A06.A4k(A02(37, 21, 39), new E5());
        if (!this.A08.A0o()) {
            this.A08.A0e(EnumC1726et.A04, 18);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1381Yi
    public final void AIv(Bundle bundle) {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1381Yi
    public final String getCurrentClientToken() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1381Yi
    public final boolean onActivityResult(int i, int i4, Intent intent) {
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1381Yi
    public final void onDestroy() {
        this.A06.A4k(A02(37, 21, 39), new C0864Dy(this.A00, this.A08.getCurrentPositionInMillis()));
        this.A02.A0j(this.A08.getCurrentPositionInMillis());
        if (this.A01 != null) {
            this.A01.A08();
        }
        this.A08.A0b(1);
        this.A08.A0W();
    }
}
