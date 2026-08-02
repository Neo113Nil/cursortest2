package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import com.anythink.core.common.s.a.c;
import com.facebook.ads.AdSDKNotificationListener;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network/classes2.dex */
public class OZ implements Runnable {
    public static byte[] A02;
    public final /* synthetic */ String A00;
    public final /* synthetic */ List A01;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 42);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{112, 123, 118, 103, 108, 101, 97, 112, 113, 74, 118, 101, 120, 57, 61, 32, 34, 53, 35, 35, 57, c.f17105c, 62};
    }

    public OZ(List list, String str) {
        this.A01 = list;
        this.A00 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (WU.A02(this)) {
            return;
        }
        try {
            for (AdSDKNotificationListener adSDKNotificationListener : this.A01) {
                Bundle data = new Bundle();
                data.putString(A00(0, 13, 63), this.A00);
                adSDKNotificationListener.onAdEvent(A00(13, 10, 122), data);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
