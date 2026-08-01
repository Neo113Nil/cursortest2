package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.text.TextUtils;
import com.anythink.expressad.video.module.a.a;
import com.facebook.ads.AdSettings;
import com.facebook.ads.RewardData;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.ea, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1708ea {
    public static byte[] A05;
    public Executor A00 = YG.A06;
    public final C1840gi A01;
    public final InterfaceC1381Yh A02;
    public final ZU A03;
    public final String A04;

    static {
        A05();
    }

    public static String A03(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 76);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{5, 20, 20, 13, 8, 19, 31, 31, 27, 30, -27, -38, -38, 34, 34, 34, -39, -48, 30, -39, 17, 12, 14, 16, 13, 26, 26, 22, -39, 14, 26, 24, -38, 12, 32, 15, 20, 16, 25, 14, 16, 10, 25, 16, 31, 34, 26, 29, 22, -38, 30, 16, 29, 33, 16, 29, 10, 30, 20, 15, 16, 10, 29, 16, 34, 12, 29, 15, -31, -19, -19, -23, -20, -77, -88, -88, -16, -16, -16, -89, -33, -38, -36, -34, -37, -24, -24, -28, -89, -36, -24, -26, -88, -38, -18, -35, -30, -34, -25, -36, -34, -40, -25, -34, -19, -16, -24, -21, -28, -88, -20, -34, -21, -17, -34, -21, -40, -20, -30, -35, -34, -40, -21, -34, -16, -38, -21, -35, 20, 7, 31, 35, 24, 19, 42, 47, 35, 30};
    }

    public C1708ea(C1840gi c1840gi, ZU zu, String str, InterfaceC1381Yh interfaceC1381Yh) {
        this.A01 = c1840gi;
        this.A03 = zu;
        this.A04 = str;
        this.A02 = interfaceC1381Yh;
    }

    public static String A04(RewardData rewardData, String str, String str2) {
        String urlPrefix;
        if (rewardData != null) {
            String serverSideProxyURL = AdSettings.getUrlPrefix();
            if (serverSideProxyURL == null || serverSideProxyURL.isEmpty()) {
                urlPrefix = A03(68, 60, 45);
            } else {
                String urlPrefix2 = A03(5, 63, 95);
                urlPrefix = String.format(Locale.US, urlPrefix2, serverSideProxyURL);
            }
            Uri A00 = XB.A00(urlPrefix);
            Uri.Builder uriBuilder = new Uri.Builder();
            String urlPrefix3 = A00.getScheme();
            uriBuilder.scheme(urlPrefix3);
            String urlPrefix4 = A00.getAuthority();
            uriBuilder.authority(urlPrefix4);
            String urlPrefix5 = A00.getPath();
            uriBuilder.path(urlPrefix5);
            String urlPrefix6 = A00.getQuery();
            uriBuilder.query(urlPrefix6);
            String urlPrefix7 = A00.getFragment();
            uriBuilder.fragment(urlPrefix7);
            String serverSideProxyURL2 = A03(134, 4, 110);
            String urlPrefix8 = rewardData.getUserID();
            uriBuilder.appendQueryParameter(serverSideProxyURL2, urlPrefix8);
            String serverSideProxyURL3 = A03(128, 2, 88);
            String urlPrefix9 = rewardData.getCurrency();
            uriBuilder.appendQueryParameter(serverSideProxyURL3, urlPrefix9);
            String urlPrefix10 = A03(a.f21731U, 4, 99);
            uriBuilder.appendQueryParameter(urlPrefix10, str);
            String urlPrefix11 = A03(0, 5, 88);
            uriBuilder.appendQueryParameter(urlPrefix11, str2);
            String urlPrefix12 = uriBuilder.build().toString();
            return urlPrefix12;
        }
        return null;
    }

    public final void A06() {
        if (!TextUtils.isEmpty(this.A04)) {
            AsyncTaskC1811gF asyncTaskC1811gF = new AsyncTaskC1811gF(this.A01, new HashMap());
            asyncTaskC1811gF.A07(new F8(this));
            asyncTaskC1811gF.executeOnExecutor(this.A00, this.A04);
        }
    }
}
