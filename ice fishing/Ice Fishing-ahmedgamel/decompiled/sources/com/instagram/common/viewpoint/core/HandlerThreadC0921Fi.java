package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.facebook.ads.androidx.media3.exoplayer.video.DummySurface;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Fi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class HandlerThreadC0921Fi extends HandlerThread implements Handler.Callback {
    public static byte[] A05;
    public static String[] A06 = {"6kuie4aYgPB75l0BZDCG97Ci8L2oTJru", "l6cPtwgabkjuGz5CGYDwVz25JELI4cH1", "ZWx6OKWQHSAUUpB5i", "EzrPiu1XHV7NearbxEmg0OLwBftw8IiR", "WDaMG3q3woavC04Kn8C74ndkvxFOsuJP", "mphQp1xRvmcoCppqdKDkA9aBwN9eJkVD", "Bip3dWfDJBluF0z6EYAQ2tUBnuWGs1iH", "Qe"};
    public Handler A00;
    public C4G A01;
    public DummySurface A02;
    public Error A03;
    public RuntimeException A04;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            int i10 = copyOfRange[i9] ^ i6;
            String[] strArr = A06;
            if (strArr[6].charAt(1) == strArr[4].charAt(1)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[6] = "ZYchz1gCfuPSGZN7lZw97cRKorp74rZl";
            strArr2[4] = "DndbQji8K3ZDCB5sBvfJw1HHxvL19lCS";
            copyOfRange[i9] = (byte) (i10 ^ 107);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{13, 60, 36, 36, 48, 26, 60, 59, 47, 40, 42, 44, 58, 29, 21, 16, 25, 24, 92, 8, 19, 92, 21, 18, 21, 8, 21, 29, 16, 21, 6, 25, 92, 24, 9, 17, 17, 5, 92, 15, 9, 14, 26, 29, 31, 25, 94, 121, 113, 116, 125, 124, 56, 108, 119, 56, 106, 125, 116, 125, 121, 107, 125, 56, 124, 109, 117, 117, 97, 56, 107, 109, 106, 126, 121, 123, 125, 49, 32, 56, 56, 44, 6, 32, 39, 51, 52, 54, 48};
    }

    static {
        A02();
    }

    public HandlerThreadC0921Fi() {
        super(A00(77, 12, 62));
    }

    private void A01() {
        AbstractC06443y.A01(this.A01);
        this.A01.A08();
    }

    private void A03(int i) {
        AbstractC06443y.A01(this.A01);
        this.A01.A09(i);
        this.A02 = new DummySurface(this, this.A01.A07(), i != 0);
    }

    public final DummySurface A04(int i) {
        start();
        this.A00 = new Handler(getLooper(), this);
        this.A01 = new C4G(this.A00);
        boolean z6 = false;
        synchronized (this) {
            this.A00.obtainMessage(1, i, 0).sendToTarget();
            while (this.A02 == null && this.A04 == null && this.A03 == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z6 = true;
                }
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        if (this.A04 == null) {
            if (this.A03 == null) {
                return (DummySurface) AbstractC06443y.A01(this.A02);
            }
            throw this.A03;
        }
        throw this.A04;
    }

    public final void A05() {
        AbstractC06443y.A01(this.A00);
        this.A00.sendEmptyMessage(2);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 1:
                    try {
                        A03(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e9) {
                        AbstractC06524g.A08(A00(0, 12, 34), A00(12, 34, 23), e9);
                        this.A03 = e9;
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e10) {
                        AbstractC06524g.A08(A00(0, 12, 34), A00(12, 34, 23), e10);
                        this.A04 = e10;
                        synchronized (this) {
                            notify();
                        }
                    }
                    return true;
                case 2:
                    try {
                        A01();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                default:
                    return true;
            }
        } catch (Throwable th) {
            synchronized (this) {
            }
        }
        synchronized (this) {
            notify();
            throw th;
        }
    }
}
