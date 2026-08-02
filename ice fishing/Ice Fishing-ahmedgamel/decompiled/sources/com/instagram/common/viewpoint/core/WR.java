package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;
import com.anythink.core.common.s.a.c;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

/* loaded from: assets/audience_network/classes2.dex */
public class WR extends AbstractRunnableC1347Wc {
    public static byte[] A01;
    public static String[] A02 = {"Cp4y0jGzgjmlhNOtolFVOVefspLcmrKL", "5GK8sLOcHtszB", "AOLPTOXU9sJ8f7mkW5imzLW9uvMXwnIa", "cYEf6saXY9z3veQOBiLayO", "AetyrNGNYAsiijDpUFLgJdlj31dZpeYf", "GwgqZOf2k60xdBESFLM8urtE7U9bH", "vGNTznilo2MQ1OpS5sYGGd", "eyCkGrJdBkkJqznMzmMtN6FzCpyOGqXF"};
    public final /* synthetic */ T8 A00;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        int i9 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[4].charAt(20) == '2') {
                throw new RuntimeException();
            }
            A02[5] = "yU9Q3i2imseGifaShK33hUjg5wmSv";
            if (i9 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 100);
            i9++;
        }
    }

    public static void A01() {
        A01 = new byte[]{4, 16, 14, -49, 7, 2, 4, 6, 3, 16, 16, 12, -49, 2, 5, 20, -49, -19, -16, -28, -30, -19, 0, -28, -16, -10, -17, -11, -26, -13, -12, -2, 1, -11, -13, -2, -15, -11, 1, 7, 0, 6, -9, 4, 5, -13, -21, -25, -7, -5, -8, -21, -22, -27, -7, -21, -7, -7, -17, -11, -12, -27, -17, -22, 67, 59, 55, 73, 75, 72, 59, 58, 53, 73, 59, 73, 73, c.f17105c, 69, 68, 53, 74, c.f17105c, 67, 59};
    }

    static {
        A01();
    }

    public WR(T8 t82) {
        this.A00 = t82;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        Map map;
        AtomicInteger atomicInteger;
        SharedPreferences sharedPreferences = null;
        try {
            sharedPreferences = this.A00.getApplicationContext().getSharedPreferences(ProcessUtils.getProcessSpecificName(A00(0, 31, 61), this.A00), 0);
            Map<String, ?> all = sharedPreferences.getAll();
            if (all.size() > 1) {
                VL.A06(this.A00, C1829gD.A00(this.A00), all);
            }
            sharedPreferences.edit().clear().apply();
            sharedPreferences.edit().putString(A00(45, 19, 34), this.A00.A09().A02()).putString(A00(64, 21, 114), Y1.A03(this.A00.A09().A01())).apply();
        } catch (JSONException e9) {
            this.A00.A08().ABC(A00(31, 14, 46), 3502, new C1273Te(e9));
            sharedPreferences.edit().clear().apply();
        }
        synchronized (VL.class) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            map = VL.A02;
            for (Map.Entry entry : map.entrySet()) {
                edit.putInt((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
            }
            edit.apply();
            atomicInteger = VL.A03;
            atomicInteger.set(2);
        }
    }
}
