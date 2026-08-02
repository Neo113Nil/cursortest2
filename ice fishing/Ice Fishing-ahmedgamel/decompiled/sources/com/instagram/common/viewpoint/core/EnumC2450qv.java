package com.instagram.common.viewpoint.core;

import com.anythink.basead.b.b.j;
import java.util.Arrays;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/DeprecationLevel;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "HIDDEN", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = j.f6602W)
/* renamed from: com.facebook.ads.redexgen.X.qv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC2450qv {
    A05,
    A03,
    A04;

    public static byte[] A00;
    public static final /* synthetic */ InterfaceC0790Ac A01;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 47);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{126, 105, 105, 116, 105, 78, 79, 66, 66, 67, 72, 100, 114, 97, 125, 122, 125, 116};
    }

    static {
        A01();
        A01 = AbstractC2437qd.A01(A02);
    }
}
