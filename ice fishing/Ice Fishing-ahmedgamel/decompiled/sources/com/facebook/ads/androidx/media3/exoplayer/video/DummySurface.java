package com.facebook.ads.androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import com.anythink.core.common.s.a.c;
import com.anythink.expressad.video.module.a.a;
import com.instagram.common.viewpoint.core.AbstractC06243y;
import com.instagram.common.viewpoint.core.C5C;
import com.instagram.common.viewpoint.core.HandlerThreadC0901Fi;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class DummySurface extends Surface {
    public static int A03;
    public static boolean A04;
    public static byte[] A05;
    public static String[] A06 = {"ToLQMf4zVEPQ4KvEooDgfRDe7yK6oNRK", "K0o48H12GfZKMIt1wQk8mac7vZfrpMfZ", "E5u", "BRaMCvq", "l9UvErrzvq13nAT2kKu87XSUotDZHlU4", "KpcnqVP7VQEeHX003zJg7kklGvYVOXV6", "nWaipra9RnK7e6o7QCyQoP578AoonQfH", "y6ffzf1HkvdiGAu1g8uZUTsw8JywLKMO"};
    public boolean A00;
    public final boolean A01;
    public final HandlerThreadC0901Fi A02;

    public static String A02(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 72);
            String[] strArr = A06;
            if (strArr[4].charAt(13) != strArr[7].charAt(13)) {
                throw new RuntimeException();
            }
            A06[6] = "JqkQNQrwLqX5JhphVyehfhpUDDUdSiIM";
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{22, 20, 31, 12, 22, 11, 7, 12, 35, 33, 60, 39, 54, 48, 39, 54, 55, 12, 48, 60, 61, 39, 54, 61, 39, 4, 6, 13, 30, 10, 9, 19, 30, 50, 52, 51, 39, 32, 34, 36, 45, 36, 50, 50, 30, 34, 46, 47, 53, 36, 57, 53, 32, 27, 6, 0, 5, 5, 26, 7, 1, 16, 17, 85, 5, 7, 28, 26, 7, 85, 1, 26, 85, 52, 37, 60, 85, 25, 16, 3, 16, 25, 85, 68, 66, 101, 105, 12, 11, 8, 13, c.f16318c, 48, 58, 44, 49, 55, 58, 112, 54, c.f16318c, 44, 58, 41, c.f16318c, 44, 59, 112, 40, 44, 112, 54, 55, 57, 54, 1, 46, 59, 44, 56, 49, 44, 51, c.f16318c, 48, 61, 59, 11, 25, 21, 11, 13, 22, 31};
        if (A06[6].charAt(20) == 'p') {
            throw new RuntimeException();
        }
        A06[0] = "LdigSr1cvkrlhyQY3m7v5wXMq9EFvMie";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static synchronized boolean A05(Context context) {
        boolean z3;
        synchronized (DummySurface.class) {
            z3 = true;
            if (!A04) {
                A03 = C5C.A02 < 24 ? 0 : A00(context);
                A04 = true;
            }
            if (A03 == 0) {
                z3 = false;
            }
        }
        return z3;
    }

    static {
        A04();
    }

    public DummySurface(HandlerThreadC0901Fi handlerThreadC0901Fi, SurfaceTexture surfaceTexture, boolean z3) {
        super(surfaceTexture);
        this.A02 = handlerThreadC0901Fi;
        this.A01 = z3;
    }

    public static int A00(Context context) {
        String eglQueryString;
        if (C5C.A02 < 26 && (A02(a.f21728R, 7, 48).equals(C5C.A05) || A02(85, 6, 117).equals(C5C.A06))) {
            return 0;
        }
        if ((C5C.A02 < 26 && !context.getPackageManager().hasSystemFeature(A02(91, 36, 22))) || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains(A02(0, 25, 27))) {
            return 0;
        }
        if (eglQueryString.contains(A02(25, 27, 9))) {
            return 1;
        }
        return 2;
    }

    public static DummySurface A01(Context context, boolean z3) {
        A03();
        AbstractC06243y.A08(!z3 || A05(context));
        return new HandlerThreadC0901Fi().A04(z3 ? A03 : 0);
    }

    public static void A03() {
        if (C5C.A02 >= 17) {
        } else {
            throw new UnsupportedOperationException(A02(52, 33, 61));
        }
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.A02) {
            if (!this.A00) {
                this.A02.A05();
                this.A00 = true;
            }
        }
    }
}
