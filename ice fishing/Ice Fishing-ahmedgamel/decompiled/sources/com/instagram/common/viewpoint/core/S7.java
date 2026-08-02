package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class S7 extends AsyncTask<S9, Void, Drawable> {
    public static byte[] A03;
    public static String[] A04 = {"Er5x4Nf8UA9tVLePD2EX", "DtYF9X90t5u", "I941X6fzqWLmgCmjxes", "iBgQ7OI2DFUGAw4NUel9vSUdaaiAzSqO", "QcmiodlDN7oY3kgnmckrDpvdiERsjn9V", "z", "b", "KLyCCmbDECCjA8c7XM6gY8wQDdZdMwfW"};
    public final S8 A00;
    public final C1860gi A01;
    public final boolean A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final Drawable A00(S9... s9Arr) {
        if (!WU.A02(this) && s9Arr != null) {
            try {
                if (s9Arr.length >= 1) {
                    String str = s9Arr[0].A01;
                    String str2 = s9Arr[0].A00;
                    Bitmap bitmap = null;
                    try {
                        bitmap = new C1266Sx(this.A01).A0O(str, -1, -1);
                    } catch (Throwable th) {
                        this.A01.A08().ABC(A01(0, 7, 4), AbstractC1272Td.A1V, new C1273Te(th));
                    }
                    if (bitmap != null) {
                        return UK.A05(this.A01, bitmap, this.A02, str2);
                    }
                    return null;
                }
            } catch (Throwable th2) {
                WU.A00(th2, this);
                return null;
            }
        }
        return null;
    }

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            int i10 = (copyOfRange[i9] ^ i6) ^ 36;
            String[] strArr = A04;
            if (strArr[6].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A04[2] = "XzO4PGfz9rpTObXE3Krp6";
            copyOfRange[i9] = (byte) i10;
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{71, 69, 78, 69, 82, 73, 67};
    }

    static {
        A02();
    }

    public S7(C1860gi c1860gi, S8 s82, boolean z6) {
        this.A01 = c1860gi;
        this.A00 = s82;
        this.A02 = z6;
    }

    public /* synthetic */ S7(C1860gi c1860gi, S8 s82, boolean z6, C1882h4 c1882h4) {
        this(c1860gi, s82, z6);
    }

    private final void A03(Drawable drawable) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.AE8(drawable);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Drawable doInBackground(S9[] s9Arr) {
        if (WU.A02(this)) {
            return null;
        }
        try {
            return A00(s9Arr);
        } catch (Throwable th) {
            WU.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Drawable drawable) {
        if (WU.A02(this)) {
            return;
        }
        try {
            A03(drawable);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
