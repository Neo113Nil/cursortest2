package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.nx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2257nx implements CH {
    public static byte[] A08;
    public static String[] A09 = {"6Pd6msxcVNGBSX02eJXjJuTK1755qRBj", "HohFYYIoFYVFLjySAriRsbI1EyK3MfzH", "CeUiguCmFwn8TW5CDLSIDkbyI8ACimQb", "zlyrIOO0KfkMjpYTb9psfC0NNgHcfA", "hplEZcFLtp2y3xCWfrXOGnyD7Ln2K5MA", "IDL7x3RfZufseciwLxrhiUDjrsxZNied", "XKrD5ajpOT4k5Fxpc35DaF0adCV7zARl", "Sdgzg0MlhPfZZU1TENhiXzUXxxUExQMT"};
    public CG A00;
    public final AbstractC06053d A01;
    public final C06605i A02;
    public final C8B A03;
    public final C1077Me A04;
    public final Executor A05;
    public volatile AbstractRunnableFutureC06504y<Void, IOException> A06;
    public volatile boolean A07;

    public static String A01(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i6);
        int i10 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A09;
            if (strArr[5].charAt(20) == strArr[2].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A09;
            strArr2[1] = "fxMtGUUqqO78zEEYN3IhZEPjI2AJG4xW";
            strArr2[6] = "cS7s2KNWeBHf1m4W4BuqIbsBl519HGHJ";
            if (i10 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 68);
            i10++;
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
        boolean z3 = false;
        while (!z3) {
            try {
                if (this.A07) {
                    break;
                }
                this.A06 = new C2258ny(this);
                if (0 != 0) {
                    throw new NullPointerException(A01(3, 7, 104));
                }
                this.A05.execute(this.A06);
                try {
                    this.A06.get();
                    z3 = true;
                } catch (ExecutionException e9) {
                    Throwable th = (Throwable) AbstractC06243y.A01(e9.getCause());
                    if (0 == 0) {
                        if (th instanceof IOException) {
                            throw ((IOException) th);
                        }
                        C5C.A11(th);
                        throw null;
                    }
                }
            } catch (Throwable th2) {
                ((AbstractRunnableFutureC06504y) AbstractC06243y.A01(this.A06)).A02();
                if (0 == 0) {
                    throw th2;
                }
                throw new NullPointerException(A01(10, 6, 86));
            }
        }
        ((AbstractRunnableFutureC06504y) AbstractC06243y.A01(this.A06)).A02();
        if (0 != 0) {
            throw new NullPointerException(A01(10, 6, 86));
        }
    }

    static {
        A02();
    }

    public C2257nx(C2389q7 c2389q7, C2056kT c2056kT, Executor executor) {
        this.A05 = (Executor) AbstractC06243y.A01(executor);
        AbstractC06243y.A01(c2389q7.A03);
        this.A02 = new C06575f().A06(c2389q7.A03.A00).A08(c2389q7.A03.A04).A02(4).A09();
        this.A03 = c2056kT.A07();
        this.A04 = new C1077Me(this.A03, this.A02, null, new InterfaceC1076Md() { // from class: com.facebook.ads.redexgen.X.nz
            @Override // com.instagram.common.viewpoint.core.InterfaceC1076Md
            public final void AFX(long j6, long j9, long j10) {
                C2257nx.this.A03(j6, j9, j10);
            }
        });
        this.A01 = c2056kT.A02();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(long j6, long j9, long j10) {
        float f3;
        if (this.A00 == null) {
            return;
        }
        if (j6 == -1 || j6 == 0) {
            f3 = -1.0f;
        } else {
            f3 = (j9 * 100.0f) / j6;
        }
        this.A00.AFW(j6, j9, f3);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4y != com.facebook.ads.androidx.media3.common.util.RunnableFutureTask<java.lang.Void, java.io.IOException> */
    @Override // com.instagram.common.viewpoint.core.CH
    public final void cancel() {
        this.A07 = true;
        AbstractRunnableFutureC06504y<Void, IOException> abstractRunnableFutureC06504y = this.A06;
        if (abstractRunnableFutureC06504y != null) {
            abstractRunnableFutureC06504y.cancel(true);
        }
    }

    @Override // com.instagram.common.viewpoint.core.CH
    public final void remove() {
        this.A03.A0E().AIU(this.A03.A0F().A4l(this.A02));
    }
}
