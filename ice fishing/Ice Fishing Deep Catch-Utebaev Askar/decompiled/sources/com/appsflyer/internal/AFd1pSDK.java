package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1pSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFAdRevenueData = 0;
    private static int component3 = 1;
    private static char[] getMediationNetwork;
    private static int[] getMonetizationNetwork;
    private final Map<String, Object> getCurrencyIso4217Code;
    private final Context getRevenue;

    public static class AFa1tSDK {
        public static byte[] AFAdRevenueData(String str) {
            return str.getBytes(Charset.defaultCharset());
        }

        public static byte[] AFAdRevenueData(byte[] bArr) {
            for (int i2 = 0; i2 < bArr.length; i2++) {
                bArr[i2] = (byte) (bArr[i2] ^ ((i2 % 2) + 42));
            }
            return bArr;
        }
    }

    static {
        getRevenue();
        TextUtils.getOffsetAfter("", 0);
        Color.green(0);
        ExpandableListView.getPackedPositionGroup(0L);
        View.MeasureSpec.getMode(0);
        int i2 = component3 + 33;
        AFAdRevenueData = i2 % 128;
        int i3 = i2 % 2;
    }

    public AFd1pSDK(Map<String, Object> map, Context context) {
        this.getCurrencyIso4217Code = map;
        this.getRevenue = context;
        put(AFAdRevenueData(), getMonetizationNetwork());
    }

    private String AFAdRevenueData() throws UnsupportedEncodingException {
        int i2 = AFAdRevenueData + 17;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        try {
            String string = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.getCurrencyIso4217Code;
            Object[] objArr = new Object[1];
            a("\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001", false, new int[]{0, 12, 39, 0}, objArr);
            String string2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getCurrencyIso4217Code;
            Object[] objArr2 = new Object[1];
            b(new int[]{-567587348, 685275732, 774183725, 1950249640}, 5 - (Process.myPid() >> 22), objArr2);
            String string3 = map2.get(((String) objArr2[0]).intern()).toString();
            if (string3 == null) {
                int i4 = AFAdRevenueData + 15;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr3 = new Object[1];
                b(new int[]{771415351, 1340640973, 898108640, 1414007016}, 8 - (ViewConfiguration.getEdgeSlop() >> 16), objArr3);
                string3 = ((String) objArr3[0]).intern();
            }
            StringBuilder sb = new StringBuilder(string2);
            sb.reverse();
            StringBuilder monetizationNetwork = getMonetizationNetwork(string, string3, sb.toString());
            int length = monetizationNetwork.length();
            if ((length > 4 ? 'F' : '7') == '7') {
                while (true) {
                    if (length >= 4) {
                        break;
                    }
                    int i6 = AFAdRevenueData + 63;
                    component3 = i6 % 128;
                    if ((i6 % 2 == 0 ? 'T' : 'S') != 'S') {
                        length += 60;
                        monetizationNetwork.append('\\');
                    } else {
                        length++;
                        monetizationNetwork.append('1');
                    }
                }
            } else {
                int i7 = AFAdRevenueData + 121;
                component3 = i7 % 128;
                int i8 = i7 % 2;
                monetizationNetwork.delete(4, length);
            }
            Object[] objArr4 = new Object[1];
            b(new int[]{-1162491069, 578015546}, 3 - ExpandableListView.getPackedPositionGroup(0L), objArr4);
            monetizationNetwork.insert(0, ((String) objArr4[0]).intern());
            return monetizationNetwork.toString();
        } catch (Exception e2) {
            Object[] objArr5 = new Object[1];
            a("\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001", true, new int[]{12, 40, 198, 0}, objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e2);
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            a(null, true, new int[]{52, 42, 5, 36}, objArr6);
            sb2.append(((String) objArr6[0]).intern());
            sb2.append(e2);
            AFLogger.afRDLog(sb2.toString());
            Object[] objArr7 = new Object[1];
            b(new int[]{-1926642792, 534003380, 211775158, 1507918137}, TextUtils.getOffsetBefore("", 0) + 7, objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v15, types: [byte[]] */
    private static void a(String str, boolean z, int[] iArr, Object[] objArr) throws UnsupportedEncodingException {
        int i2;
        int length;
        char[] cArr;
        int i3;
        ?? bytes = str;
        if ((bytes != 0 ? '9' : '5') == '9') {
            bytes = bytes.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = getMediationNetwork;
        if ((cArr2 != null ? 'V' : (char) 19) == 'V') {
            int i8 = $11 + 19;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i3 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                cArr[i3] = (char) (((long) cArr2[i3]) ^ 740144413554588574L);
                i3++;
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr2, i4, cArr3, 0, i5);
        if (bArr != null) {
            int i9 = $11 + 49;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i5];
            aFk1oSDK.getCurrencyIso4217Code = 0;
            char c2 = 0;
            while (true) {
                int i11 = aFk1oSDK.getCurrencyIso4217Code;
                if (i11 >= i5) {
                    break;
                }
                if (bArr[i11] == 1) {
                    cArr4[i11] = (char) (((cArr3[i11] * 2) + 1) - c2);
                    int i12 = $10 + 61;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                } else {
                    cArr4[i11] = (char) ((cArr3[i11] * 2) - c2);
                }
                c2 = cArr4[i11];
                aFk1oSDK.getCurrencyIso4217Code = i11 + 1;
            }
            cArr3 = cArr4;
        }
        if ((i7 > 0 ? '7' : (char) 4) != 4) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i14 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i14, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i14);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            aFk1oSDK.getCurrencyIso4217Code = 0;
            while (true) {
                int i15 = aFk1oSDK.getCurrencyIso4217Code;
                if (i15 >= i5) {
                    break;
                }
                cArr6[i15] = cArr3[(i5 - i15) - 1];
                aFk1oSDK.getCurrencyIso4217Code = i15 + 1;
            }
            cArr3 = cArr6;
        }
        if (!(i6 <= 0)) {
            aFk1oSDK.getCurrencyIso4217Code = 0;
            while (true) {
                int i16 = aFk1oSDK.getCurrencyIso4217Code;
                if ((i16 < i5 ? '!' : '%') != '!') {
                    break;
                }
                int i17 = $10 + 9;
                int i18 = i17 % 128;
                $11 = i18;
                if (!(i17 % 2 == 0)) {
                    cArr3[i16] = (char) (cArr3[i16] - iArr[2]);
                    i2 = i16 + 1;
                } else {
                    cArr3[i16] = (char) (cArr3[i16] * iArr[2]);
                    i2 = i16 - 1;
                }
                aFk1oSDK.getCurrencyIso4217Code = i2;
                int i19 = i18 + 77;
                $10 = i19 % 128;
                int i20 = i19 % 2;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void b(int[] iArr, int i2, Object[] objArr) {
        AFk1pSDK aFk1pSDK = new AFk1pSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getMonetizationNetwork;
        if ((iArr2 != null ? (char) 2 : '\n') == 2) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr3[i3] = (int) (((long) iArr2[i3]) ^ 7040698834646313678L);
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getMonetizationNetwork;
        if (iArr5 != null) {
            int i4 = $11 + 65;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i6 = 0;
            while (i6 < length3) {
                iArr6[i6] = (int) (((long) iArr5[i6]) ^ 7040698834646313678L);
                i6++;
                int i7 = $11 + 79;
                $10 = i7 % 128;
                int i8 = i7 % 2;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        aFk1pSDK.AFAdRevenueData = 0;
        while (true) {
            int i9 = aFk1pSDK.AFAdRevenueData;
            if ((i9 < iArr.length ? '8' : ':') == ':') {
                objArr[0] = new String(cArr2, 0, i2);
                return;
            }
            int i10 = $10 + 101;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            int i12 = iArr[i9];
            char c2 = (char) (i12 >> 16);
            cArr[0] = c2;
            char c3 = (char) i12;
            cArr[1] = c3;
            char c4 = (char) (iArr[i9 + 1] >> 16);
            cArr[2] = c4;
            char c5 = (char) iArr[i9 + 1];
            cArr[3] = c5;
            aFk1pSDK.getCurrencyIso4217Code = (c2 << 16) + c3;
            aFk1pSDK.getMonetizationNetwork = (c4 << 16) + c5;
            AFk1pSDK.getCurrencyIso4217Code(iArr4);
            for (int i13 = 0; i13 < 16; i13++) {
                int i14 = aFk1pSDK.getCurrencyIso4217Code ^ iArr4[i13];
                aFk1pSDK.getCurrencyIso4217Code = i14;
                int revenue = AFk1pSDK.getRevenue(i14) ^ aFk1pSDK.getMonetizationNetwork;
                int i15 = aFk1pSDK.getCurrencyIso4217Code;
                aFk1pSDK.getCurrencyIso4217Code = revenue;
                aFk1pSDK.getMonetizationNetwork = i15;
            }
            int i16 = aFk1pSDK.getCurrencyIso4217Code;
            int i17 = aFk1pSDK.getMonetizationNetwork;
            int i18 = i16 ^ iArr4[16];
            aFk1pSDK.getMonetizationNetwork = i18;
            int i19 = i17 ^ iArr4[17];
            aFk1pSDK.getCurrencyIso4217Code = i19;
            cArr[0] = (char) (i19 >>> 16);
            cArr[1] = (char) i19;
            cArr[2] = (char) (i18 >>> 16);
            cArr[3] = (char) i18;
            AFk1pSDK.getCurrencyIso4217Code(iArr4);
            int i20 = aFk1pSDK.AFAdRevenueData;
            cArr2[i20 * 2] = cArr[0];
            cArr2[(i20 * 2) + 1] = cArr[1];
            cArr2[(i20 * 2) + 2] = cArr[2];
            cArr2[(i20 * 2) + 3] = cArr[3];
            aFk1pSDK.AFAdRevenueData = i20 + 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0189  */
    private String getMonetizationNetwork() throws UnsupportedEncodingException {
        String string;
        String string2;
        int i2;
        try {
            Map<String, Object> map = this.getCurrencyIso4217Code;
            Object[] objArr = new Object[1];
            a("\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001", false, new int[]{0, 12, 39, 0}, objArr);
            String string3 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getCurrencyIso4217Code;
            Object[] objArr2 = new Object[1];
            b(new int[]{726627632, 173948392, -971365962, -1290526670, 496583791, 1611731301, -854873576, 1171477091}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15, objArr2);
            String string4 = map2.get(((String) objArr2[0]).intern()).toString();
            Object[] objArr3 = new Object[1];
            a("\u0001\u0001\u0000\u0001\u0000\u0000", false, new int[]{94, 6, 167, 5}, objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a(null, true, new int[]{100, 5, 5, 1}, objArr4);
            String strReplaceAll = strIntern.replaceAll(((String) objArr4[0]).intern(), "");
            StringBuilder sb = new StringBuilder();
            sb.append(string3);
            sb.append(string4);
            sb.append(strReplaceAll);
            String monetizationNetwork = AFb1jSDK.getMonetizationNetwork(sb.toString());
            StringBuilder sb2 = new StringBuilder("");
            sb2.append(monetizationNetwork.substring(0, 16));
            string = sb2.toString();
        } catch (Exception e2) {
            Object[] objArr5 = new Object[1];
            a("\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", true, new int[]{105, 38, 60, 0}, objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e2);
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            b(new int[]{1712496745, 151611036, 505401292, 2023297096, -473626413, 307324942, 234471005, 1362816938, -898545452, -1586430336, -1607907224, -2090943757, 34948886, 178598096, 1422264568, -1253681083, 686493704, 1638577605, 1049285378, -1734561900, 1245407779, -1396956316}, ExpandableListView.getPackedPositionGroup(0L) + 44, objArr6);
            sb3.append(((String) objArr6[0]).intern());
            sb3.append(e2);
            AFLogger.afRDLog(sb3.toString());
            StringBuilder sb4 = new StringBuilder("");
            Object[] objArr7 = new Object[1];
            a("\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001", true, new int[]{143, 18, 0, 0}, objArr7);
            sb4.append(((String) objArr7[0]).intern());
            string = sb4.toString();
        }
        String str = string;
        try {
            Context context = this.getRevenue;
            Object[] objArr8 = new Object[1];
            a("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", true, new int[]{161, 37, 0, 0}, objArr8);
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter(((String) objArr8[0]).intern()));
            int intExtra = -2700;
            if (!(intentRegisterReceiver == null)) {
                Object[] objArr9 = new Object[1];
                b(new int[]{2097992175, -1897829786, -1047684686, 1273950990, 494613021, 1456481066}, 11 - Gravity.getAbsoluteGravity(0, 0), objArr9);
                intExtra = intentRegisterReceiver.getIntExtra(((String) objArr9[0]).intern(), -2700);
            }
            String str2 = this.getRevenue.getApplicationInfo().nativeLibraryDir;
            if (str2 != null) {
                Object[] objArr10 = new Object[1];
                a("\u0001\u0000\u0000", false, new int[]{198, 3, 61, 0}, objArr10);
                if (str2.contains(((String) objArr10[0]).intern())) {
                    i2 = 1;
                } else {
                    int i3 = component3 + 121;
                    AFAdRevenueData = i3 % 128;
                    int i4 = i3 % 2;
                    i2 = 0;
                }
            } else {
                int i5 = component3 + 121;
                AFAdRevenueData = i5 % 128;
                int i6 = i5 % 2;
                i2 = 0;
            }
            Context context2 = this.getRevenue;
            Object[] objArr11 = new Object[1];
            b(new int[]{-1434160454, -1689268116, -642429517, 1605132998}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 6, objArr11);
            int size = ((SensorManager) context2.getSystemService(((String) objArr11[0]).intern())).getSensorList(-1).size();
            StringBuilder sb5 = new StringBuilder();
            Object[] objArr12 = new Object[1];
            b(new int[]{-2015277125, -1118196083}, 1 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr12);
            sb5.append(((String) objArr12[0]).intern());
            sb5.append(intExtra);
            Object[] objArr13 = new Object[1];
            b(new int[]{550716812, -1029519528}, 3 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr13);
            sb5.append(((String) objArr13[0]).intern());
            sb5.append(i2);
            Object[] objArr14 = new Object[1];
            b(new int[]{987814401, 147414703}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1, objArr14);
            sb5.append(((String) objArr14[0]).intern());
            sb5.append(size);
            Object[] objArr15 = new Object[1];
            a("\u0001\u0000", false, new int[]{201, 2, 189, 1}, objArr15);
            sb5.append(((String) objArr15[0]).intern());
            sb5.append(this.getCurrencyIso4217Code.size());
            String string5 = sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str);
            byte[] bArrAFAdRevenueData = AFa1tSDK.AFAdRevenueData(AFa1tSDK.AFAdRevenueData(string5));
            StringBuilder sb7 = new StringBuilder();
            for (byte b2 : bArrAFAdRevenueData) {
                String hexString = Integer.toHexString(b2);
                if (hexString.length() == 1) {
                    int i7 = AFAdRevenueData + 21;
                    component3 = i7 % 128;
                    if (i7 % 2 == 0) {
                        "0".concat(hexString);
                        throw null;
                    }
                    hexString = "0".concat(hexString);
                }
                sb7.append(hexString);
            }
            sb6.append(sb7.toString());
            string2 = sb6.toString();
        } catch (Exception e3) {
            Object[] objArr16 = new Object[1];
            b(new int[]{-1586736807, -139902341, 1561286769, -714825600, 1489920205, -722802406, 1086091119, -862119559}, 16 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr16);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr16[0]).intern(), e3);
            StringBuilder sb8 = new StringBuilder();
            Object[] objArr17 = new Object[1];
            b(new int[]{1712496745, 151611036, 505401292, 2023297096, -473626413, 307324942, 234471005, 1362816938, -898545452, -1586430336, -1607907224, -2090943757, 34948886, 178598096, 1422264568, -1253681083, 686493704, 1638577605, 1049285378, -1734561900, 1245407779, -1396956316}, 43 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr17);
            sb8.append(((String) objArr17[0]).intern());
            sb8.append(e3);
            AFLogger.afRDLog(sb8.toString());
            StringBuilder sb9 = new StringBuilder();
            sb9.append(str);
            Object[] objArr18 = new Object[1];
            a("\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000", true, new int[]{203, 16, 0, 0}, objArr18);
            sb9.append(((String) objArr18[0]).intern());
            string2 = sb9.toString();
        }
        int i8 = component3 + 1;
        AFAdRevenueData = i8 % 128;
        if (i8 % 2 == 0) {
            return string2;
        }
        int i9 = 32 / 0;
        return string2;
    }

    public static void getRevenue() {
        getMediationNetwork = new char[]{15322, 15124, 15127, 15118, 15115, 15116, 15118, 15117, 15108, 15119, 15120, 15115, 15113, 15018, 15018, 15016, 14991, 14988, 15019, 15024, 14997, 14999, 15029, 15024, 14997, 14999, 15022, 15023, 15018, 15022, 15025, 15023, 15025, 15025, 15026, 14999, 14998, 15028, 15024, 15022, 15029, 15031, 14999, 14988, 15019, 14976, 15002, 14996, 15029, 15020, 15026, 14999, 15339, 15348, 15350, 15331, 15348, 15291, 15347, 15335, 15344, 15330, 15291, 15328, 15348, 15342, 15291, 15349, 15348, 15342, 15291, 15346, 15341, 15344, 15335, 15352, 15337, 15348, 15341, 15348, 15346, 15291, 15351, 15348, 15343, 15344, 15352, 15349, 15291, 15265, 15341, 15338, 15344, 15335, 15348, 15176, 15172, 15174, 15177, 15173, 15276, 15281, 15277, 15350, 15337, 15310, 15159, 15154, 15164, 15161, 15129, 15329, 15167, 15162, 15135, 15329, 15160, 15161, 15156, 15160, 15163, 15161, 15163, 15163, 15164, 15329, 15328, 15166, 15162, 15160, 15167, 15105, 15329, 15328, 15159, 15154, 15164, 15113, 15134, 15134, 15167, 15158, 15164, 15234, 15274, 15278, 15279, 15314, 15317, 15275, 15312, 15316, 15276, 15274, 15276, 15316, 15357, 15357, 15357, 15359, 15359, 15292, 15322, 15320, 15316, 15321, 15322, 15323, 15311, 15298, 15307, 15317, 15314, 15306, 15316, 15327, 15270, 15312, 15344, 15346, 15344, 15349, 15356, 15321, 15311, 15343, 15351, 15346, 15343, 15349, 15317, 15319, 15352, 15346, 15342, 15349, 15351, 15353, 15300, 15115, 15338, 15112, 14998, 15272, 15353, 15348, 15344, 15355, 15316, 15276, 15311, 15310, 15310, 15310, 15311, 15310, 15310, 15310, 15317};
        getMonetizationNetwork = new int[]{-1334944241, -2015133716, 1811231825, -1913690757, -174115752, 1467114833, 1797153774, 2026579881, 1639262049, 1847177514, 514793336, 368887070, 831481797, -2035262010, -2018931947, -1447277916, 1856515781, -1151882951};
    }

    private static StringBuilder getMonetizationNetwork(String... strArr) {
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        for (int i2 = 0; i2 < 3; i2++) {
            arrayList.add(Integer.valueOf(strArr[i2].length()));
        }
        Collections.sort(arrayList);
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (true) {
            if ((i3 < iIntValue ? '*' : ' ') == ' ') {
                return sb;
            }
            int i4 = component3 + 1;
            AFAdRevenueData = i4 % 128;
            int i5 = i4 % 2;
            Integer numValueOf = null;
            for (int i6 = 0; i6 < 3; i6++) {
                int iCharAt = strArr[i6].charAt(i3);
                if ((numValueOf == null ? '<' : 'A') != 'A') {
                    int i7 = AFAdRevenueData + 79;
                    component3 = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    iCharAt ^= numValueOf.intValue();
                }
                numValueOf = Integer.valueOf(iCharAt);
            }
            sb.append(Integer.toHexString(numValueOf.intValue()));
            i3++;
        }
    }
}
