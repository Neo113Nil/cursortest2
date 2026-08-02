package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.bridge.fbsdk.FBLoginASID;
import com.facebook.ads.internal.bridge.gms.AdvertisingId;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ao, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1496ao implements TD {
    public static byte[] A01;
    public final T8 A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 57);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-20, 25, 15, 29, 26, 20, 15};
    }

    public C1496ao(T8 t82) {
        this.A00 = t82;
    }

    @Override // com.instagram.common.viewpoint.core.TD
    public final String A79() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.TD
    public final String A86() {
        return WI.A02(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.TD
    public final String A87() {
        return FBLoginASID.getFBLoginASID();
    }

    @Override // com.instagram.common.viewpoint.core.TD
    public final String A8V() {
        return AdInternalSettings.getMediationService();
    }

    @Override // com.instagram.common.viewpoint.core.TD
    public final String A8c() {
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.TD
    public final TC A8x() {
        AdvertisingId advertisingIdInfoDirectly = AdvertisingId.getAdvertisingIdInfoDirectly(this.A00);
        if (advertisingIdInfoDirectly == null) {
            return null;
        }
        return new C1505ax(this, advertisingIdInfoDirectly);
    }

    @Override // com.instagram.common.viewpoint.core.TD
    public final String A9Q() {
        return AdInternalSettings.getUrlPrefix();
    }

    @Override // com.instagram.common.viewpoint.core.TD
    public final String A9S() {
        return A00(0, 7, 114);
    }

    @Override // com.instagram.common.viewpoint.core.TD
    public final String A9T() {
        return BuildConfigApi.getVersionName(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.TD
    public final boolean AAO() {
        return BuildConfigApi.isDebug();
    }
}
