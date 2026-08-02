package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.os.Parcel;
import com.anythink.expressad.video.module.a.a;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Jh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1022Jh {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ a.f22543z);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{33};
    }

    public final BP<C2370pT> A02(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return AnonymousClass44.A01(C2370pT.A0I, (ArrayList) AbstractC06443y.A01(readBundle.getParcelableArrayList(A00(0, 1, 47))));
    }
}
