package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1417Yx implements Runnable {
    public static byte[] A01;
    public static String[] A02 = {"JeM6kmZAAg", "yJwYoPJztMSqfbMPjoq6sPzsNl0d2Qkw", "1vq6MwLSZBl2WPzhpozbGLZi9rrad1f9", "vjzuY9RuACrmk67MWB8bQQLqhnnjvlnw", "kHeV6GAm5S3szdTA016nUt4W7GUOLctP", "rR76lLTsWYWDKlm4eMbeJOmHt8WwoEDS", "9YmMINBhFsFgZ71fMaPUEV5EHdzCcqYn", "A0SJ2dkt1ZSdfCokN2Yc1r5dcbPSTFSd"};
    public final /* synthetic */ C07126o A00;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            int i10 = (copyOfRange[i9] ^ i6) ^ 31;
            if (A02[5].charAt(14) != 'm') {
                throw new RuntimeException();
            }
            A02[1] = "mB4Y7S7yqXGV2GUhso5SlG9iabxazBAS";
            copyOfRange[i9] = (byte) i10;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{58, 5, 8, 9, 3, 60, 0, 13, 21, 14, 13, 15, 7, 41, 30, 30, 3, 30};
    }

    static {
        A01();
    }

    public RunnableC1417Yx(C07126o c07126o) {
        this.A00 = c07126o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0897Ek c0897Ek;
        if (WU.A02(this)) {
            return;
        }
        try {
            c0897Ek = this.A00.A00.A06;
            c0897Ek.A0b(10);
            ((AbstractC1160Oq) this.A00.A00).A08.A0F().A3a(A00(0, 18, 115));
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
