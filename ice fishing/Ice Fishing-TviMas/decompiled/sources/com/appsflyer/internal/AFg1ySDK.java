package com.appsflyer.internal;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;

/* loaded from: classes4.dex */
public final class AFg1ySDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long getCurrencyIso4217Code = 0;
    private static int getMediationNetwork = 1;
    private static int getMonetizationNetwork;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        r1 = r1 + 91;
        com.appsflyer.internal.AFg1ySDK.getMonetizationNetwork = r1 % 128;
        r1 = r1 % 2;
        r5 = getMonetizationNetwork(r5, r6, r7, r8);
        r6 = com.appsflyer.internal.AFg1ySDK.getMonetizationNetwork + 37;
        com.appsflyer.internal.AFg1ySDK.getMediationNetwork = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if ((r6 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0014, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r7 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r8 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AFi1tSDK getMediationNetwork(AFi1vSDK aFi1vSDK, String str, String str2, String str3) {
        int i = 2 % 2;
        int i2 = getMediationNetwork;
        int i3 = i2 + 37;
        getMonetizationNetwork = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 4 / 0;
        }
        return new AFi1tSDK(false, AFi1wSDK.INTERNAL_ERROR);
    }

    private static AFi1tSDK getMonetizationNetwork(AFi1vSDK aFi1vSDK, String str, String str2, String str3) {
        String str4;
        if (str == null) {
            return new AFi1tSDK(aFi1vSDK.getCurrencyIso4217Code == AFi1zSDK.DEFAULT, AFi1wSDK.NA);
        }
        Object[] objArr = new Object[1];
        a("ᕨ侻ꃊԑ縤퍲㖞溨쏰␉饒\uf273咍觘\ue2e5䜴롙ᵮ瞹\ua8c7ക昭\udb4d㶖隧쯰Ⰱ腞啕岏뇔\ueae7伍ꁞը羶탁㕥渼썉▕黕\uf3f0呫褨\ue27d䒂맒ዼ県ꡞ\u0d65枰\ud8c3㷫阿쭄ⷡ蚧\ufbcf尛넯\uea73䳷", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23250, objArr);
        String intern = ((String) objArr[0]).intern();
        if (aFi1vSDK.getCurrencyIso4217Code != AFi1zSDK.CUSTOM) {
            str4 = "";
            str3 = intern;
        } else {
            str4 = new StringBuilder(str2).reverse().toString();
        }
        boolean equals = getMediationNetwork(new StringBuilder(str3).reverse().toString(), aFi1vSDK.AFAdRevenueData, "android", "v1", str4).equals(str);
        return new AFi1tSDK(equals, equals ? AFi1wSDK.SUCCESS : AFi1wSDK.FAILURE);
    }

    private static void a(String str, int i, Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = $10 + 21;
        int i4 = i3 % 128;
        $11 = i4;
        int i5 = i3 % 2;
        char[] cArr = str;
        if (str != null) {
            int i6 = i4 + 107;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFk1rSDK aFk1rSDK = new AFk1rSDK();
        aFk1rSDK.AFAdRevenueData = i;
        int length = cArr2.length;
        long[] jArr = new long[length];
        aFk1rSDK.getMediationNetwork = 0;
        while (aFk1rSDK.getMediationNetwork < cArr2.length) {
            int i8 = $10 + 31;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            jArr[aFk1rSDK.getMediationNetwork] = (cArr2[aFk1rSDK.getMediationNetwork] ^ (aFk1rSDK.getMediationNetwork * aFk1rSDK.AFAdRevenueData)) ^ (getCurrencyIso4217Code ^ 7264887542928058188L);
            aFk1rSDK.getMediationNetwork++;
        }
        char[] cArr3 = new char[length];
        aFk1rSDK.getMediationNetwork = 0;
        while (aFk1rSDK.getMediationNetwork < cArr2.length) {
            int i10 = $11 + 35;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr3[aFk1rSDK.getMediationNetwork] = (char) jArr[aFk1rSDK.getMediationNetwork];
            aFk1rSDK.getMediationNetwork++;
        }
        objArr[0] = new String(cArr3);
    }

    private static String getMediationNetwork(String str, String str2, String str3, String str4, String str5) {
        int i = 2 % 2;
        int i2 = getMonetizationNetwork + 101;
        getMediationNetwork = i2 % 128;
        int i3 = i2 % 2;
        String monetizationNetwork = AFb1jSDK.getMonetizationNetwork(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, ""}), str);
        if (monetizationNetwork.length() < 12) {
            int i4 = getMediationNetwork + 49;
            getMonetizationNetwork = i4 % 128;
            if (i4 % 2 == 0) {
                return monetizationNetwork;
            }
            throw null;
        }
        return monetizationNetwork.substring(0, 12);
    }

    static void getRevenue() {
        getCurrencyIso4217Code = -2677878734856900073L;
    }

    static {
        getRevenue();
        Process.getElapsedCpuTime();
        int i = getMonetizationNetwork + 125;
        getMediationNetwork = i % 128;
        if (i % 2 == 0) {
            int i2 = 77 / 0;
        }
    }
}
