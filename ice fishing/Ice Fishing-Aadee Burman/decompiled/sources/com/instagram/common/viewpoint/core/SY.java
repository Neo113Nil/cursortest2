package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;
import com.anythink.expressad.video.module.a.a;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class SY {
    public static byte[] A01;
    public SharedPreferences A00;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ a.f21728R);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{41, 44, 62, 45, 58, 60, 33, 59, 33, 38, 47, 1, 44, 80, 69, 69, 67, 88, 83, 68, 69, 88, 94, 95, 120, 85, 93, 95, 93, 86, 91, 106, 109, 24, 20, 22, 85, 29, 26, 24, 30, 25, 20, 20, 16, 85, 26, 31, 8, 85, 18, 31, 29, 26, 115, 118, 114, 118, 107, 94, 123, 75, 109, 126, 124, 116, 118, 113, 120};
    }

    public SY(T8 t82) {
        this.A00 = t82.getSharedPreferences(ProcessUtils.getProcessSpecificName(A00(33, 21, 4), t82), 0);
    }

    public final SX A02() {
        SharedPreferences sharedPreferences = this.A00;
        String A00 = A00(0, 13, 55);
        if (sharedPreferences.contains(A00)) {
            return new SX(this.A00.getString(A00, A00(0, 0, 75)), this.A00.getBoolean(A00(54, 15, 96), false), SW.A08, this.A00.getLong(A00(26, 7, 65), -1L));
        }
        return SX.A00();
    }

    public final String A03() {
        return this.A00.getString(A00(13, 13, 78), A00(0, 0, 75));
    }

    public final void A04(SX sx) {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putString(A00(0, 13, 55), sx.A03());
        edit.putBoolean(A00(54, 15, 96), sx.A04());
        edit.putLong(A00(26, 7, 65), sx.A01());
        edit.apply();
    }

    public final void A05(String str) {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putString(A00(13, 13, 78), str);
        edit.apply();
    }
}
