package com.appsflyer.internal;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1ySDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long getCurrencyIso4217Code = 0;
    private static int getMediationNetwork = 1;
    private static int getMonetizationNetwork;

    static {
        getRevenue();
        Process.getElapsedCpuTime();
        int i2 = getMonetizationNetwork + 125;
        getMediationNetwork = i2 % 128;
        if ((i2 % 2 == 0 ? 'Y' : (char) 25) != 25) {
            int i3 = 77 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v4, types: [char[]] */
    private static void a(String str, int i2, Object[] objArr) {
        int i3 = $10 + 21;
        int i4 = i3 % 128;
        $11 = i4;
        int i5 = i3 % 2;
        if (str != 0) {
            int i6 = i4 + 107;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            str = str.toCharArray();
        }
        char[] cArr = (char[]) str;
        AFk1rSDK aFk1rSDK = new AFk1rSDK();
        aFk1rSDK.AFAdRevenueData = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        aFk1rSDK.getMediationNetwork = 0;
        while (true) {
            int i8 = aFk1rSDK.getMediationNetwork;
            if ((i8 < cArr.length ? '$' : ';') != '$') {
                break;
            }
            int i9 = $10 + 31;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            jArr[i8] = (((long) cArr[i8]) ^ (((long) i8) * ((long) aFk1rSDK.AFAdRevenueData))) ^ (getCurrencyIso4217Code ^ 7264887542928058188L);
            aFk1rSDK.getMediationNetwork = i8 + 1;
        }
        char[] cArr2 = new char[length];
        aFk1rSDK.getMediationNetwork = 0;
        while (true) {
            int i11 = aFk1rSDK.getMediationNetwork;
            if (i11 >= cArr.length) {
                objArr[0] = new String(cArr2);
                return;
            }
            int i12 = $11 + 35;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr2[i11] = (char) jArr[i11];
            aFk1rSDK.getMediationNetwork = i11 + 1;
        }
    }

    private static AFi1tSDK getMonetizationNetwork(AFi1vSDK aFi1vSDK, String str, String str2, String str3) {
        String string;
        if (str == null) {
            return new AFi1tSDK(aFi1vSDK.getCurrencyIso4217Code == AFi1zSDK.DEFAULT, AFi1wSDK.NA);
        }
        Object[] objArr = new Object[1];
        a("ᕨ侻ꃊԑ縤퍲㖞溨쏰␉饒\uf273咍觘\ue2e5䜴롙ᵮ瞹\ua8c7ക昭\udb4d㶖隧쯰Ⰱ腞啕岏뇔\ueae7伍ꁞը羶탁㕥渼썉▕黕\uf3f0呫褨\ue27d䒂맒ዼ県ꡞ\u0d65枰\ud8c3㷫阿쭄ⷡ蚧\ufbcf尛넯\uea73䳷", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23250, objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (aFi1vSDK.getCurrencyIso4217Code == AFi1zSDK.CUSTOM) {
            string = new StringBuilder(str2).reverse().toString();
        } else {
            string = "";
            str3 = strIntern;
        }
        boolean zEquals = getMediationNetwork(new StringBuilder(str3).reverse().toString(), aFi1vSDK.AFAdRevenueData, "android", "v1", string).equals(str);
        return new AFi1tSDK(zEquals, zEquals ? AFi1wSDK.SUCCESS : AFi1wSDK.FAILURE);
    }

    public static void getRevenue() {
        getCurrencyIso4217Code = -2677878734856900073L;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0023  */
    /* JADX WARN: Code duplicated, block: B:17:0x0025  */
    /* JADX WARN: Code duplicated, block: B:19:0x0029  */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0030  */
    /* JADX WARN: Code duplicated, block: B:26:0x003c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0044  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    public final AFi1tSDK getMediationNetwork(AFi1vSDK aFi1vSDK, String str, String str2, String str3) {
        char c2;
        AFi1tSDK monetizationNetwork;
        int i2;
        int i3 = getMediationNetwork;
        int i4 = i3 + 37;
        getMonetizationNetwork = i4 % 128;
        boolean z = true;
        if (!(i4 % 2 != 0)) {
            if ((aFi1vSDK != null ? 'R' : '_') == 'R') {
                if (str2 == null) {
                    if (str3 != null) {
                        c2 = '0';
                    } else {
                        c2 = 'C';
                    }
                    if (c2 != '0') {
                        int i5 = i3 + 91;
                        getMonetizationNetwork = i5 % 128;
                        int i6 = i5 % 2;
                    }
                }
            }
            if (!z) {
                return new AFi1tSDK(false, AFi1wSDK.INTERNAL_ERROR);
            }
            monetizationNetwork = getMonetizationNetwork(aFi1vSDK, str, str2, str3);
            i2 = getMonetizationNetwork + 37;
            getMediationNetwork = i2 % 128;
            if (i2 % 2 != 0) {
                return monetizationNetwork;
            }
            throw null;
        }
        int i7 = 4 / 0;
        if (aFi1vSDK != null) {
            if (str2 == null) {
                if (str3 != null) {
                    c2 = '0';
                } else {
                    c2 = 'C';
                }
                if (c2 != '0') {
                    int i8 = i3 + 91;
                    getMonetizationNetwork = i8 % 128;
                    int i9 = i8 % 2;
                }
            }
        }
        if (!z) {
            return new AFi1tSDK(false, AFi1wSDK.INTERNAL_ERROR);
        }
        monetizationNetwork = getMonetizationNetwork(aFi1vSDK, str, str2, str3);
        i2 = getMonetizationNetwork + 37;
        getMediationNetwork = i2 % 128;
        if (i2 % 2 != 0) {
            return monetizationNetwork;
        }
        throw null;
        z = false;
        if (!z) {
            return new AFi1tSDK(false, AFi1wSDK.INTERNAL_ERROR);
        }
        monetizationNetwork = getMonetizationNetwork(aFi1vSDK, str, str2, str3);
        i2 = getMonetizationNetwork + 37;
        getMediationNetwork = i2 % 128;
        if (i2 % 2 != 0) {
            return monetizationNetwork;
        }
        throw null;
    }

    private static String getMediationNetwork(String str, String str2, String str3, String str4, String str5) {
        int i2 = getMonetizationNetwork + 101;
        getMediationNetwork = i2 % 128;
        int i3 = i2 % 2;
        String monetizationNetwork = AFb1jSDK.getMonetizationNetwork(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, ""}), str);
        if (!(monetizationNetwork.length() < 12)) {
            return monetizationNetwork.substring(0, 12);
        }
        int i4 = getMediationNetwork + 49;
        getMonetizationNetwork = i4 % 128;
        if ((i4 % 2 != 0 ? '#' : 'M') == 'M') {
            return monetizationNetwork;
        }
        throw null;
    }
}
