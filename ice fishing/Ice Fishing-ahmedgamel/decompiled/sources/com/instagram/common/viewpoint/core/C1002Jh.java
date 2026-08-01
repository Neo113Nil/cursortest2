package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.os.Parcel;
import com.anythink.expressad.video.module.a.a;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Jh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1002Jh {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ a.f21756z);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{33};
    }

    public final BP<C2350pT> A02(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return AnonymousClass44.A01(C2350pT.A0I, (ArrayList) AbstractC06243y.A01(readBundle.getParcelableArrayList(A00(0, 1, 47))));
    }
}
