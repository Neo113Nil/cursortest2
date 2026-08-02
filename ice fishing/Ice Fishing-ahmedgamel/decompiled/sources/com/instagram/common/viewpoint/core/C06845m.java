package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import com.anythink.expressad.video.module.a.a;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.5m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C06845m extends E8 {
    public static byte[] A01;
    public final /* synthetic */ C1636d4 A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{19, 4, 4, 25, 4};
    }

    public C06845m(C1636d4 c1636d4) {
        this.A00 = c1636d4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.UN
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A03(E9 e9) {
        InterfaceC1635d3 interfaceC1635d3;
        JSONObject A03;
        new Handler(Looper.getMainLooper()).post(new RunnableC1634d2(this));
        interfaceC1635d3 = this.A00.A0B;
        A03 = this.A00.A03();
        interfaceC1635d3.AGR(A00(0, 5, a.f22514Q), A03);
    }
}
