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
import androidx.compose.runtime.ComposerKt;
import com.appsflyer.AFLogger;
import com.facebook.appevents.AppEventsConstants;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AFd1pSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFAdRevenueData = 0;
    private static int component3 = 1;
    private static char[] getMediationNetwork;
    private static int[] getMonetizationNetwork;
    private final Map<String, Object> getCurrencyIso4217Code;
    private final Context getRevenue;

    public AFd1pSDK(Map<String, Object> map, Context context) {
        this.getCurrencyIso4217Code = map;
        this.getRevenue = context;
        put(AFAdRevenueData(), getMonetizationNetwork());
    }

    private static StringBuilder getMonetizationNetwork(String... strArr) throws Exception {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        for (int i2 = 0; i2 < 3; i2++) {
            arrayList.add(Integer.valueOf(strArr[i2].length()));
        }
        Collections.sort(arrayList);
        int intValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < intValue; i3++) {
            int i4 = component3 + 1;
            AFAdRevenueData = i4 % 128;
            int i5 = i4 % 2;
            int length2 = strArr.length;
            Integer num = null;
            for (int i6 = 0; i6 < 3; i6++) {
                int charAt = strArr[i6].charAt(i3);
                if (num != null) {
                    charAt ^= num.intValue();
                } else {
                    int i7 = AFAdRevenueData + 79;
                    component3 = i7 % 128;
                    int i8 = i7 % 2;
                }
                num = Integer.valueOf(charAt);
            }
            sb.append(Integer.toHexString(num.intValue()));
        }
        return sb;
    }

    private String AFAdRevenueData() {
        int i = 2 % 2;
        int i2 = AFAdRevenueData + 17;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        try {
            String num = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.getCurrencyIso4217Code;
            Object[] objArr = new Object[1];
            a("\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001", false, new int[]{0, 12, 39, 0}, objArr);
            String obj = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getCurrencyIso4217Code;
            Object[] objArr2 = new Object[1];
            b(new int[]{-567587348, 685275732, 774183725, 1950249640}, 5 - (Process.myPid() >> 22), objArr2);
            String obj2 = map2.get(((String) objArr2[0]).intern()).toString();
            if (obj2 == null) {
                int i4 = AFAdRevenueData + 15;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr3 = new Object[1];
                b(new int[]{771415351, 1340640973, 898108640, 1414007016}, 8 - (ViewConfiguration.getEdgeSlop() >> 16), objArr3);
                obj2 = ((String) objArr3[0]).intern();
            }
            StringBuilder sb = new StringBuilder(obj);
            sb.reverse();
            StringBuilder monetizationNetwork = getMonetizationNetwork(num, obj2, sb.toString());
            int length = monetizationNetwork.length();
            if (length > 4) {
                int i6 = AFAdRevenueData + 121;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                monetizationNetwork.delete(4, length);
            } else {
                while (length < 4) {
                    int i8 = AFAdRevenueData + 63;
                    component3 = i8 % 128;
                    if (i8 % 2 == 0) {
                        length += 60;
                        monetizationNetwork.append('\\');
                    } else {
                        length++;
                        monetizationNetwork.append('1');
                    }
                }
            }
            Object[] objArr4 = new Object[1];
            b(new int[]{-1162491069, 578015546}, 3 - ExpandableListView.getPackedPositionGroup(0L), objArr4);
            monetizationNetwork.insert(0, ((String) objArr4[0]).intern());
            return monetizationNetwork.toString();
        } catch (Exception e) {
            Object[] objArr5 = new Object[1];
            a("\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001", true, new int[]{12, 40, 198, 0}, objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e);
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            a(null, true, new int[]{52, 42, 5, 36}, objArr6);
            AFLogger.afRDLog(sb2.append(((String) objArr6[0]).intern()).append(e).toString());
            Object[] objArr7 = new Object[1];
            b(new int[]{-1926642792, 534003380, 211775158, 1507918137}, TextUtils.getOffsetBefore("", 0) + 7, objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    private static void b(int[] iArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        AFk1pSDK aFk1pSDK = new AFk1pSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getMonetizationNetwork;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr3[i3] = (int) (iArr2[i3] ^ 7040698834646313678L);
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
                iArr6[i6] = (int) (iArr5[i6] ^ 7040698834646313678L);
                i6++;
                int i7 = $11 + 79;
                $10 = i7 % 128;
                int i8 = i7 % 2;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        aFk1pSDK.AFAdRevenueData = 0;
        while (aFk1pSDK.AFAdRevenueData < iArr.length) {
            int i9 = $10 + 101;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            cArr[0] = (char) (iArr[aFk1pSDK.AFAdRevenueData] >> 16);
            cArr[1] = (char) iArr[aFk1pSDK.AFAdRevenueData];
            cArr[2] = (char) (iArr[aFk1pSDK.AFAdRevenueData + 1] >> 16);
            cArr[3] = (char) iArr[aFk1pSDK.AFAdRevenueData + 1];
            aFk1pSDK.getCurrencyIso4217Code = (cArr[0] << 16) + cArr[1];
            aFk1pSDK.getMonetizationNetwork = (cArr[2] << 16) + cArr[3];
            AFk1pSDK.getCurrencyIso4217Code(iArr4);
            for (int i11 = 0; i11 < 16; i11++) {
                aFk1pSDK.getCurrencyIso4217Code ^= iArr4[i11];
                aFk1pSDK.getMonetizationNetwork = AFk1pSDK.getRevenue(aFk1pSDK.getCurrencyIso4217Code) ^ aFk1pSDK.getMonetizationNetwork;
                int i12 = aFk1pSDK.getCurrencyIso4217Code;
                aFk1pSDK.getCurrencyIso4217Code = aFk1pSDK.getMonetizationNetwork;
                aFk1pSDK.getMonetizationNetwork = i12;
            }
            int i13 = aFk1pSDK.getCurrencyIso4217Code;
            aFk1pSDK.getCurrencyIso4217Code = aFk1pSDK.getMonetizationNetwork;
            aFk1pSDK.getMonetizationNetwork = i13;
            aFk1pSDK.getMonetizationNetwork ^= iArr4[16];
            aFk1pSDK.getCurrencyIso4217Code ^= iArr4[17];
            int i14 = aFk1pSDK.getCurrencyIso4217Code;
            int i15 = aFk1pSDK.getMonetizationNetwork;
            cArr[0] = (char) (aFk1pSDK.getCurrencyIso4217Code >>> 16);
            cArr[1] = (char) aFk1pSDK.getCurrencyIso4217Code;
            cArr[2] = (char) (aFk1pSDK.getMonetizationNetwork >>> 16);
            cArr[3] = (char) aFk1pSDK.getMonetizationNetwork;
            AFk1pSDK.getCurrencyIso4217Code(iArr4);
            cArr2[aFk1pSDK.AFAdRevenueData * 2] = cArr[0];
            cArr2[(aFk1pSDK.AFAdRevenueData * 2) + 1] = cArr[1];
            cArr2[(aFk1pSDK.AFAdRevenueData * 2) + 2] = cArr[2];
            cArr2[(aFk1pSDK.AFAdRevenueData * 2) + 3] = cArr[3];
            aFk1pSDK.AFAdRevenueData += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0291 A[Catch: Exception -> 0x02d3, TRY_LEAVE, TryCatch #2 {Exception -> 0x02d3, blocks: (B:6:0x0120, B:8:0x0144, B:9:0x0165, B:11:0x016f, B:14:0x019d, B:16:0x0291, B:20:0x02a8, B:24:0x02b3, B:26:0x02bc, B:22:0x02c0, B:34:0x02c6), top: B:5:0x0120 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0356  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String getMonetizationNetwork() {
        String obj;
        String obj2;
        int i;
        int i2;
        String str;
        int i3;
        int i4 = 2 % 2;
        try {
            Map<String, Object> map = this.getCurrencyIso4217Code;
            Object[] objArr = new Object[1];
            a("\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001", false, new int[]{0, 12, 39, 0}, objArr);
            String obj3 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getCurrencyIso4217Code;
            Object[] objArr2 = new Object[1];
            b(new int[]{726627632, 173948392, -971365962, -1290526670, 496583791, 1611731301, -854873576, 1171477091}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15, objArr2);
            String obj4 = map2.get(((String) objArr2[0]).intern()).toString();
            Object[] objArr3 = new Object[1];
            a("\u0001\u0001\u0000\u0001\u0000\u0000", false, new int[]{94, 6, 167, 5}, objArr3);
            String intern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a(null, true, new int[]{100, 5, 5, 1}, objArr4);
            obj = new StringBuilder("").append(AFb1jSDK.getMonetizationNetwork(new StringBuilder().append(obj3).append(obj4).append(intern.replaceAll(((String) objArr4[0]).intern(), "")).toString()).substring(0, 16)).toString();
        } catch (Exception e) {
            Object[] objArr5 = new Object[1];
            a("\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", true, new int[]{105, 38, 60, 0}, objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e);
            StringBuilder sb = new StringBuilder();
            Object[] objArr6 = new Object[1];
            b(new int[]{1712496745, 151611036, 505401292, 2023297096, -473626413, 307324942, 234471005, 1362816938, -898545452, -1586430336, -1607907224, -2090943757, 34948886, 178598096, 1422264568, -1253681083, 686493704, 1638577605, 1049285378, -1734561900, 1245407779, -1396956316}, ExpandableListView.getPackedPositionGroup(0L) + 44, objArr6);
            AFLogger.afRDLog(sb.append(((String) objArr6[0]).intern()).append(e).toString());
            StringBuilder sb2 = new StringBuilder("");
            Object[] objArr7 = new Object[1];
            a("\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001", true, new int[]{143, 18, 0, 0}, objArr7);
            obj = sb2.append(((String) objArr7[0]).intern()).toString();
        }
        String str2 = obj;
        try {
            Context context = this.getRevenue;
            Object[] objArr8 = new Object[1];
            a("\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", true, new int[]{161, 37, 0, 0}, objArr8);
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter(((String) objArr8[0]).intern()));
            if (registerReceiver != null) {
                Object[] objArr9 = new Object[1];
                b(new int[]{2097992175, -1897829786, -1047684686, 1273950990, 494613021, 1456481066}, 11 - Gravity.getAbsoluteGravity(0, 0), objArr9);
                i2 = registerReceiver.getIntExtra(((String) objArr9[0]).intern(), -2700);
            } else {
                i2 = -2700;
            }
            str = this.getRevenue.getApplicationInfo().nativeLibraryDir;
        } catch (Exception e2) {
            Object[] objArr10 = new Object[1];
            b(new int[]{-1586736807, -139902341, 1561286769, -714825600, 1489920205, -722802406, 1086091119, -862119559}, 16 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr10);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr10[0]).intern(), e2);
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr11 = new Object[1];
            b(new int[]{1712496745, 151611036, 505401292, 2023297096, -473626413, 307324942, 234471005, 1362816938, -898545452, -1586430336, -1607907224, -2090943757, 34948886, 178598096, 1422264568, -1253681083, 686493704, 1638577605, 1049285378, -1734561900, 1245407779, -1396956316}, 43 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr11);
            AFLogger.afRDLog(sb3.append(((String) objArr11[0]).intern()).append(e2).toString());
            StringBuilder append = new StringBuilder().append(str2);
            Object[] objArr12 = new Object[1];
            a("\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000", true, new int[]{ComposerKt.providerValuesKey, 16, 0, 0}, objArr12);
            obj2 = append.append(((String) objArr12[0]).intern()).toString();
        }
        if (str != null) {
            Object[] objArr13 = new Object[1];
            a("\u0001\u0000\u0000", false, new int[]{198, 3, 61, 0}, objArr13);
            if (str.contains(((String) objArr13[0]).intern())) {
                i3 = 1;
                Context context2 = this.getRevenue;
                Object[] objArr14 = new Object[1];
                b(new int[]{-1434160454, -1689268116, -642429517, 1605132998}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 6, objArr14);
                int size = ((SensorManager) context2.getSystemService(((String) objArr14[0]).intern())).getSensorList(-1).size();
                StringBuilder sb4 = new StringBuilder();
                Object[] objArr15 = new Object[1];
                b(new int[]{-2015277125, -1118196083}, 1 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr15);
                StringBuilder append2 = sb4.append(((String) objArr15[0]).intern()).append(i2);
                Object[] objArr16 = new Object[1];
                b(new int[]{550716812, -1029519528}, 3 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr16);
                StringBuilder append3 = append2.append(((String) objArr16[0]).intern()).append(i3);
                Object[] objArr17 = new Object[1];
                b(new int[]{987814401, 147414703}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1, objArr17);
                StringBuilder append4 = append3.append(((String) objArr17[0]).intern()).append(size);
                Object[] objArr18 = new Object[1];
                a("\u0001\u0000", false, new int[]{ComposerKt.providerKey, 2, 189, 1}, objArr18);
                String obj5 = append4.append(((String) objArr18[0]).intern()).append(this.getCurrencyIso4217Code.size()).toString();
                StringBuilder append5 = new StringBuilder().append(str2);
                byte[] AFAdRevenueData2 = AFa1tSDK.AFAdRevenueData(AFa1tSDK.AFAdRevenueData(obj5));
                StringBuilder sb5 = new StringBuilder();
                for (byte b : AFAdRevenueData2) {
                    String hexString = Integer.toHexString(b);
                    if (hexString.length() == 1) {
                        int i5 = AFAdRevenueData + 21;
                        component3 = i5 % 128;
                        if (i5 % 2 == 0) {
                            AppEventsConstants.EVENT_PARAM_VALUE_NO.concat(String.valueOf(hexString));
                            throw null;
                        }
                        hexString = AppEventsConstants.EVENT_PARAM_VALUE_NO.concat(String.valueOf(hexString));
                    }
                    sb5.append(hexString);
                }
                obj2 = append5.append(sb5.toString()).toString();
                i = component3 + 1;
                AFAdRevenueData = i % 128;
                if (i % 2 != 0) {
                    int i6 = 32 / 0;
                }
                return obj2;
            }
        }
        int i7 = component3 + 121;
        AFAdRevenueData = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 5 % 4;
        }
        i3 = 0;
        Context context22 = this.getRevenue;
        Object[] objArr142 = new Object[1];
        b(new int[]{-1434160454, -1689268116, -642429517, 1605132998}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 6, objArr142);
        int size2 = ((SensorManager) context22.getSystemService(((String) objArr142[0]).intern())).getSensorList(-1).size();
        StringBuilder sb42 = new StringBuilder();
        Object[] objArr152 = new Object[1];
        b(new int[]{-2015277125, -1118196083}, 1 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr152);
        StringBuilder append22 = sb42.append(((String) objArr152[0]).intern()).append(i2);
        Object[] objArr162 = new Object[1];
        b(new int[]{550716812, -1029519528}, 3 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr162);
        StringBuilder append32 = append22.append(((String) objArr162[0]).intern()).append(i3);
        Object[] objArr172 = new Object[1];
        b(new int[]{987814401, 147414703}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1, objArr172);
        StringBuilder append42 = append32.append(((String) objArr172[0]).intern()).append(size2);
        Object[] objArr182 = new Object[1];
        a("\u0001\u0000", false, new int[]{ComposerKt.providerKey, 2, 189, 1}, objArr182);
        String obj52 = append42.append(((String) objArr182[0]).intern()).append(this.getCurrencyIso4217Code.size()).toString();
        StringBuilder append52 = new StringBuilder().append(str2);
        byte[] AFAdRevenueData22 = AFa1tSDK.AFAdRevenueData(AFa1tSDK.AFAdRevenueData(obj52));
        StringBuilder sb52 = new StringBuilder();
        while (r8 < r7) {
        }
        obj2 = append52.append(sb52.toString()).toString();
        i = component3 + 1;
        AFAdRevenueData = i % 128;
        if (i % 2 != 0) {
        }
        return obj2;
    }

    public static class AFa1tSDK {
        static byte[] AFAdRevenueData(String str) throws Exception {
            return str.getBytes(Charset.defaultCharset());
        }

        static byte[] AFAdRevenueData(byte[] bArr) throws Exception {
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
            }
            return bArr;
        }
    }

    private static void a(String str, boolean z, int[] iArr, Object[] objArr) {
        int i;
        int length;
        char[] cArr;
        int i2;
        String str2 = str;
        int i3 = 2 % 2;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = getMediationNetwork;
        if (cArr2 != null) {
            int i8 = $11 + 19;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                cArr[i2] = (char) (cArr2[i2] ^ 740144413554588574L);
                i2++;
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr2, i4, cArr3, 0, i5);
        if (bArr2 != null) {
            int i9 = $11 + 49;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr4 = new char[i5];
            aFk1oSDK.getCurrencyIso4217Code = 0;
            char c = 0;
            while (aFk1oSDK.getCurrencyIso4217Code < i5) {
                if (bArr2[aFk1oSDK.getCurrencyIso4217Code] == 1) {
                    cArr4[aFk1oSDK.getCurrencyIso4217Code] = (char) (((cArr3[aFk1oSDK.getCurrencyIso4217Code] * 2) + 1) - c);
                    int i11 = $10 + 61;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    cArr4[aFk1oSDK.getCurrencyIso4217Code] = (char) ((cArr3[aFk1oSDK.getCurrencyIso4217Code] * 2) - c);
                }
                c = cArr4[aFk1oSDK.getCurrencyIso4217Code];
                aFk1oSDK.getCurrencyIso4217Code++;
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i13 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i13, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i13);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            aFk1oSDK.getCurrencyIso4217Code = 0;
            while (aFk1oSDK.getCurrencyIso4217Code < i5) {
                cArr6[aFk1oSDK.getCurrencyIso4217Code] = cArr3[(i5 - aFk1oSDK.getCurrencyIso4217Code) - 1];
                aFk1oSDK.getCurrencyIso4217Code++;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            aFk1oSDK.getCurrencyIso4217Code = 0;
            while (aFk1oSDK.getCurrencyIso4217Code < i5) {
                int i14 = $10 + 9;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    cArr3[aFk1oSDK.getCurrencyIso4217Code] = (char) (cArr3[aFk1oSDK.getCurrencyIso4217Code] * iArr[2]);
                    i = aFk1oSDK.getCurrencyIso4217Code - 1;
                } else {
                    cArr3[aFk1oSDK.getCurrencyIso4217Code] = (char) (cArr3[aFk1oSDK.getCurrencyIso4217Code] - iArr[2]);
                    i = aFk1oSDK.getCurrencyIso4217Code + 1;
                }
                aFk1oSDK.getCurrencyIso4217Code = i;
                int i15 = $11 + 77;
                $10 = i15 % 128;
                int i16 = i15 % 2;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static void getRevenue() {
        getMediationNetwork = new char[]{15322, 15124, 15127, 15118, 15115, 15116, 15118, 15117, 15108, 15119, 15120, 15115, 15113, 15018, 15018, 15016, 14991, 14988, 15019, 15024, 14997, 14999, 15029, 15024, 14997, 14999, 15022, 15023, 15018, 15022, 15025, 15023, 15025, 15025, 15026, 14999, 14998, 15028, 15024, 15022, 15029, 15031, 14999, 14988, 15019, 14976, 15002, 14996, 15029, 15020, 15026, 14999, 15339, 15348, 15350, 15331, 15348, 15291, 15347, 15335, 15344, 15330, 15291, 15328, 15348, 15342, 15291, 15349, 15348, 15342, 15291, 15346, 15341, 15344, 15335, 15352, 15337, 15348, 15341, 15348, 15346, 15291, 15351, 15348, 15343, 15344, 15352, 15349, 15291, 15265, 15341, 15338, 15344, 15335, 15348, 15176, 15172, 15174, 15177, 15173, 15276, 15281, 15277, 15350, 15337, 15310, 15159, 15154, 15164, 15161, 15129, 15329, 15167, 15162, 15135, 15329, 15160, 15161, 15156, 15160, 15163, 15161, 15163, 15163, 15164, 15329, 15328, 15166, 15162, 15160, 15167, 15105, 15329, 15328, 15159, 15154, 15164, 15113, 15134, 15134, 15167, 15158, 15164, 15234, 15274, 15278, 15279, 15314, 15317, 15275, 15312, 15316, 15276, 15274, 15276, 15316, 15357, 15357, 15357, 15359, 15359, 15292, 15322, 15320, 15316, 15321, 15322, 15323, 15311, 15298, 15307, 15317, 15314, 15306, 15316, 15327, 15270, 15312, 15344, 15346, 15344, 15349, 15356, 15321, 15311, 15343, 15351, 15346, 15343, 15349, 15317, 15319, 15352, 15346, 15342, 15349, 15351, 15353, 15300, 15115, 15338, 15112, 14998, 15272, 15353, 15348, 15344, 15355, 15316, 15276, 15311, 15310, 15310, 15310, 15311, 15310, 15310, 15310, 15317};
        getMonetizationNetwork = new int[]{-1334944241, -2015133716, 1811231825, -1913690757, -174115752, 1467114833, 1797153774, 2026579881, 1639262049, 1847177514, 514793336, 368887070, 831481797, -2035262010, -2018931947, -1447277916, 1856515781, -1151882951};
    }

    static {
        getRevenue();
        TextUtils.getOffsetAfter("", 0);
        Color.green(0);
        ExpandableListView.getPackedPositionGroup(0L);
        View.MeasureSpec.getMode(0);
        int i = component3 + 33;
        AFAdRevenueData = i % 128;
        int i2 = i % 2;
    }
}
