package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;
import android.os.Build;
import com.anythink.core.common.s.a.c;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: assets/audience_network/classes2.dex */
public class UA implements Callable<Boolean> {
    public static byte[] A04;
    public static String[] A05 = {"dMyKB8n8mY8sFmfmCsf5VwvZBLoVpPiR", "TBvdqjLuIRaxglwGY5TjNnUOxCNoUnNv", "FK0GmuaP9q8EyodOlfs4PJ6Rrg0VVoxV", "1UM", "Fv6ZlsmxNYwaZ6XY1w8nvtw6Sd1Ai0k0", "lERcqI9wEyu6Ta8yIDBCfbsl7aq4DQ3Q", "fq", "Qdyh6wSbko6o8Mj4qT2RTqVvwzMlz"};
    public final /* synthetic */ SharedPreferences A00;
    public final /* synthetic */ T8 A01;
    public final /* synthetic */ C1263To A02;
    public final /* synthetic */ String A03;

    public static String A01(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 46);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{37, 105, 103, 122, 105, 121, 61, 49, 51, 112, c.f16318c, 48, 58, 44, 49, 55, 58, 112, 40, 59, 48, 58, 55, 48, 57, 48, 32, 50, 35, 58, 62, 46, 49, 58, 62, 99, 97, 106, 97, 118, 109, 103};
    }

    static {
        A02();
    }

    public UA(T8 t82, C1263To c1263To, SharedPreferences sharedPreferences, String str) {
        this.A01 = t82;
        this.A02 = c1263To;
        this.A00 = sharedPreferences;
        this.A03 = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r1.equals(r0) != false) goto L6;
     */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean call() throws Exception {
        AtomicInteger atomicInteger;
        String str = null;
        if (Build.VERSION.SDK_INT < 31) {
            String A01 = A01(0, 1, 88);
            String checksumApiFingerprint = Build.VERSION.CODENAME;
        }
        if (C1290Up.A2o(this.A01)) {
            String A0B = this.A02.A0B();
            String checksumApiFingerprint2 = A01(6, 19, 112);
            if (checksumApiFingerprint2.equals(A0B)) {
                T8 t82 = this.A01;
                String checksumApiFingerprint3 = this.A01.getPackageName();
                str = C1348Xa.A01(t82, checksumApiFingerprint3);
            }
        }
        if (str == null) {
            T8 t83 = this.A01;
            String checksumApiFingerprint4 = this.A01.getPackageName();
            UB.A00 = C1337Wn.A02(t83, checksumApiFingerprint4);
        } else {
            boolean A1k = C1290Up.A1k(this.A01);
            String[] strArr = A05;
            String str2 = strArr[7];
            String checksumApiFingerprint5 = strArr[0];
            if (str2.length() == checksumApiFingerprint5.length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[1] = "kDvoq9mMnaUwO0DWwqxaQOFrfqCdc2U4";
            strArr2[5] = "nyTkqSQWVKKnLYnFLp1tRd7YKhoP35dr";
            if (A1k) {
                T8 t84 = this.A01;
                String checksumApiFingerprint6 = this.A01.getPackageName();
                String A02 = C1337Wn.A02(t84, checksumApiFingerprint6);
                String checksumApiFingerprint7 = A01(1, 5, 36);
                C1253Te c1253Te = new C1253Te(checksumApiFingerprint7);
                c1253Te.A05(1);
                c1253Te.A06(1);
                c1253Te.A0A(false);
                JSONObject jSONObject = new JSONObject();
                String checksumApiFingerprint8 = A01(25, 5, 125);
                jSONObject.put(checksumApiFingerprint8, str);
                String checksumApiFingerprint9 = A01(30, 5, 115);
                jSONObject.put(checksumApiFingerprint9, A02);
                c1253Te.A07(jSONObject);
                InterfaceC1251Tc A08 = this.A01.A08();
                int i = AbstractC1252Td.A1I;
                String checksumApiFingerprint10 = A01(35, 7, 42);
                A08.ABD(checksumApiFingerprint10, i, c1253Te);
            }
            UB.A00 = str;
        }
        SharedPreferences.Editor edit = this.A00.edit();
        String str3 = this.A03;
        String checksumApiFingerprint11 = UB.A00;
        edit.putString(str3, checksumApiFingerprint11).apply();
        atomicInteger = UB.A05;
        atomicInteger.set(2);
        return true;
    }
}
