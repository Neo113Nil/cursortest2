package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.nx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2277nx implements CH {
    public static byte[] A08;
    public static String[] A09 = {"6Pd6msxcVNGBSX02eJXjJuTK1755qRBj", "HohFYYIoFYVFLjySAriRsbI1EyK3MfzH", "CeUiguCmFwn8TW5CDLSIDkbyI8ACimQb", "zlyrIOO0KfkMjpYTb9psfC0NNgHcfA", "hplEZcFLtp2y3xCWfrXOGnyD7Ln2K5MA", "IDL7x3RfZufseciwLxrhiUDjrsxZNied", "XKrD5ajpOT4k5Fxpc35DaF0adCV7zARl", "Sdgzg0MlhPfZZU1TENhiXzUXxxUExQMT"};
    public CG A00;
    public final AbstractC06253d A01;
    public final C06805i A02;
    public final C8B A03;
    public final C1097Me A04;
    public final Executor A05;
    public volatile AbstractRunnableFutureC06704y<Void, IOException> A06;
    public volatile boolean A07;

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i4);
        int i9 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A09;
            if (strArr[5].charAt(20) == strArr[2].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A09;
            strArr2[1] = "fxMtGUUqqO78zEEYN3IhZEPjI2AJG4xW";
            strArr2[6] = "cS7s2KNWeBHf1m4W4BuqIbsBl519HGHJ";
            if (i9 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 68);
            i9++;
        }
    }

    public static void A02() {
        A08 = new byte[]{31, 34, 34, 28, 30, 27, 15, 17, 17, 16, 12, -1, 7, 9, 16, -1};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.CH
    public final void A63(CG cg) throws IOException, InterruptedException {
        this.A00 = cg;
        if (0 != 0) {
            throw new NullPointerException(A01(0, 3, 122));
        }
        boolean z6 = false;
        while (!z6) {
            try {
                if (this.A07) {
                    break;
                }
                this.A06 = new C2278ny(this);
                if (0 != 0) {
                    throw new NullPointerException(A01(3, 7, 104));
                }
                this.A05.execute(this.A06);
                try {
                    this.A06.get();
                    z6 = true;
                } catch (ExecutionException e9) {
                    Throwable th = (Throwable) AbstractC06443y.A01(e9.getCause());
                    if (0 == 0) {
                        if (th instanceof IOException) {
                            throw ((IOException) th);
                        }
                        C5C.A11(th);
                        throw null;
                    }
                }
            } catch (Throwable th2) {
                ((AbstractRunnableFutureC06704y) AbstractC06443y.A01(this.A06)).A02();
                if (0 == 0) {
                    throw th2;
                }
                throw new NullPointerException(A01(10, 6, 86));
            }
        }
        ((AbstractRunnableFutureC06704y) AbstractC06443y.A01(this.A06)).A02();
        if (0 != 0) {
            throw new NullPointerException(A01(10, 6, 86));
        }
    }

    static {
        A02();
    }

    public C2277nx(C2409q7 c2409q7, C2076kT c2076kT, Executor executor) {
        this.A05 = (Executor) AbstractC06443y.A01(executor);
        AbstractC06443y.A01(c2409q7.A03);
        this.A02 = new C06775f().A06(c2409q7.A03.A00).A08(c2409q7.A03.A04).A02(4).A09();
        this.A03 = c2076kT.A07();
        this.A04 = new C1097Me(this.A03, this.A02, null, new InterfaceC1096Md() { // from class: com.facebook.ads.redexgen.X.nz
            @Override // com.instagram.common.viewpoint.core.InterfaceC1096Md
            public final void AFX(long j6, long j9, long j10) {
                C2277nx.this.A03(j6, j9, j10);
            }
        });
        this.A01 = c2076kT.A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(long j6, long j9, long j10) {
        float f2;
        if (this.A00 == null) {
            return;
        }
        if (j6 == -1 || j6 == 0) {
            f2 = -1.0f;
        } else {
            f2 = (j9 * 100.0f) / j6;
        }
        this.A00.AFW(j6, j9, f2);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4y != com.facebook.ads.androidx.media3.common.util.RunnableFutureTask<java.lang.Void, java.io.IOException> */
    @Override // com.instagram.common.viewpoint.core.CH
    public final void cancel() {
        this.A07 = true;
        AbstractRunnableFutureC06704y<Void, IOException> abstractRunnableFutureC06704y = this.A06;
        if (abstractRunnableFutureC06704y != null) {
            abstractRunnableFutureC06704y.cancel(true);
        }
    }

    @Override // com.instagram.common.viewpoint.core.CH
    public final void remove() {
        this.A03.A0E().AIU(this.A03.A0F().A4l(this.A02));
    }
}
