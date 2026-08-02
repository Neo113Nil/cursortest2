package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.aL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1467aL {
    public static String[] A00 = {"JDSePW2HSG4YeS6gtlV", "82T2GFaLeV3aTbLMJos0KxEKOb8V", "eQCDfbwHDs1I63LCwtRfVvk7aOq68Yi1", "mKAtiPzaErPw2g5AsekgNJUywNJKgzbn", "W6CrCk7jl5WmpSSnHELA9a4ylCy3ZwGN", "yC8I8b2mmbmFe3RpkHIpYdmwx30s8PcH", "t7vLS6XVWI7z", "7V80TKFhnzYK6cwmq9Eavbn4uXT7"};

    public static EnumC1471aP A00(AbstractC2025jd abstractC2025jd) {
        if (abstractC2025jd.A2U()) {
            EnumC1471aP enumC1471aP = EnumC1471aP.A02;
            if (A00[3].charAt(31) != 'n') {
                throw new RuntimeException();
            }
            A00[0] = "myUXVCGo2IYKrTscb4wiG";
            return enumC1471aP;
        }
        return EnumC1471aP.A03;
    }

    public static void A01(C1860gi c1860gi, EnumC1468aM enumC1468aM) {
        c1860gi.A0F().AAz(enumC1468aM.name().toLowerCase(Locale.US));
    }

    public static void A02(C1860gi c1860gi, EnumC1468aM enumC1468aM) {
        c1860gi.A0F().AB9(enumC1468aM.name().toLowerCase(Locale.US));
    }

    public static void A03(C1860gi c1860gi, EnumC1468aM enumC1468aM) {
        c1860gi.A0F().AC7(enumC1468aM.name().toLowerCase(Locale.US));
    }

    public static void A04(C1860gi c1860gi, EnumC1468aM enumC1468aM) {
        A01(c1860gi, enumC1468aM);
    }

    public static void A05(C1860gi c1860gi, EnumC1468aM enumC1468aM) {
        A02(c1860gi, enumC1468aM);
    }

    public static void A06(C1860gi c1860gi, EnumC1468aM enumC1468aM) {
        A03(c1860gi, enumC1468aM);
    }

    public static void A07(VI vi, C1860gi c1860gi, InterfaceC1401Yh interfaceC1401Yh, AbstractC2025jd abstractC2025jd, EnumC1468aM enumC1468aM) {
        if (vi != null) {
            vi.A04(VH.A0A, null);
        }
        if (abstractC2025jd.A2Q()) {
            c1860gi.A0F().AB8(enumC1468aM.name().toLowerCase(Locale.US));
        }
        if (abstractC2025jd.A2U()) {
            c1860gi.A0F().AAy(enumC1468aM.name().toLowerCase(Locale.US));
        }
        C1150Og A002 = AbstractC1151Oh.A00(c1860gi.A02());
        C1856ge A02 = c1860gi.A02();
        if (A00[6].length() != 12) {
            throw new RuntimeException();
        }
        A00[0] = "Fh7";
        if (A002.A0O(A02, true)) {
            if (interfaceC1401Yh != null) {
                interfaceC1401Yh.AAo(abstractC2025jd.A2E(), abstractC2025jd.A2C());
            }
        } else {
            if (TextUtils.isEmpty(abstractC2025jd.A2C().A00())) {
                return;
            }
            X6.A0O(new X6(), c1860gi, XB.A00(abstractC2025jd.A2C().A00()), abstractC2025jd.A2E());
        }
    }
}
