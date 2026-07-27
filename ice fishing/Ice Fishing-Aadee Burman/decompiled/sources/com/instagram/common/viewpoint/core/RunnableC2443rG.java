package com.instagram.common.viewpoint.core;

import android.os.Handler;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.rG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC2443rG implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C2442rF A01;
    public final /* synthetic */ Exception A02;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{58, 56, 41, 25, 56, 49, 60, 36};
    }

    public RunnableC2443rG(C2442rF c2442rF, int i, Exception exc) {
        this.A01 = c2442rF;
        this.A00 = i;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        InterfaceC1896hc interfaceC1896hc;
        Handler handler;
        Runnable runnable;
        boolean A0B;
        if (WU.A02(this)) {
            return;
        }
        try {
            try {
                z3 = this.A01.A01;
                if (z3) {
                    if (C0780Ao.A07) {
                        A0B = this.A01.A0B();
                        if (A0B) {
                            this.A01.A0F();
                            return;
                        }
                    }
                    C2442rF c2442rF = this.A01;
                    interfaceC1896hc = this.A01.A05;
                    c2442rF.A08(interfaceC1896hc.ACf());
                    C2442rF.A03(this.A01);
                    if (0 == 0) {
                        int delay = this.A00;
                        handler = this.A01.A04;
                        runnable = this.A01.A0C;
                        handler.postDelayed(runnable, delay);
                        return;
                    }
                    C2442rF.A03(this.A01);
                    throw new NullPointerException(A00(0, 8, 12));
                }
            } catch (Exception ex) {
                ex.initCause(this.A02);
                throw ex;
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
