package com.netcetera.threeds.sdk.infrastructure;

import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class ka implements jr {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ThreeDS2Service = 1;
    private static int ThreeDS2ServiceInstance = -443454435;
    private static int get = 0;
    private static long getWarnings = -8880716800597159563L;
    private static char initialize = 4469;

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(String str, int i, char c, String str2, String str3, Object[] objArr) {
        char[] cArr;
        int i2;
        char[] cArr2;
        int i3;
        Integer num;
        Integer num2;
        Integer num3 = 246986610;
        Integer num4 = -258783473;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        char[] charArray2 = str2 != 0 ? str2.toCharArray() : str2;
        int i4 = 2;
        if (str != null) {
            int i5 = $11 + 113;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            cArr = str.toCharArray();
            $10 = ($11 + 81) % 128;
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        ConfigParameters configParameters = new ConfigParameters();
        int length = charArray.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i6 = 0;
        System.arraycopy(charArray, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = charArray2.length;
        char[] cArr6 = new char[length3];
        configParameters.initialize = 0;
        while (configParameters.initialize < length3) {
            try {
                Object[] objArr2 = {configParameters};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(num4);
                int i7 = i4;
                if (obj != null) {
                    i2 = length3;
                    cArr2 = charArray2;
                } else {
                    i2 = length3;
                    cArr2 = charArray2;
                    obj = ((Class) removeParam.initialize((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 58, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.getCapsMode("", i6, i6) + 6414)).getMethod("j", Object.class);
                    map.put(num4, obj);
                }
                int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {configParameters};
                Object obj2 = map.get(num3);
                if (obj2 != null) {
                    i3 = i6;
                } else {
                    i3 = i6;
                    obj2 = ((Class) removeParam.initialize(AndroidCharacter.getMirror('0') + 15, (char) (11346 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getTouchSlop() >> 8) + 8577)).getMethod("i", Object.class);
                    map.put(num3, obj2);
                }
                int intValue2 = ((Integer) ((Method) obj2).invoke(null, objArr3)).intValue();
                int i8 = cArr4[configParameters.initialize % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i7] = Integer.valueOf(cArr5[intValue]);
                objArr4[1] = Integer.valueOf(i8);
                objArr4[i3] = configParameters;
                Object obj3 = map.get(828230935);
                Class cls = Integer.TYPE;
                if (obj3 != null) {
                    num = num3;
                    num2 = num4;
                } else {
                    num = num3;
                    num2 = num4;
                    obj3 = ((Class) removeParam.initialize(74 - ExpandableListView.getPackedPositionGroup(0L), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 9820 - (CdmaCellLocation.convertQuartSecToDecDegrees(i3) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i3) == 0.0d ? 0 : -1)))).getMethod("o", Object.class, cls, cls);
                    map.put(828230935, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
                int i9 = cArr4[intValue2] * 32718;
                Object[] objArr5 = new Object[i7];
                objArr5[1] = Integer.valueOf(cArr5[intValue]);
                objArr5[i3] = Integer.valueOf(i9);
                Object obj4 = map.get(196637707);
                if (obj4 == null) {
                    int i10 = i3;
                    obj4 = ((Class) removeParam.initialize((ViewConfiguration.getJumpTapTimeout() >> 16) + 48, (char) (63349 - ExpandableListView.getPackedPositionChild(0L)), 11536 - TextUtils.indexOf("", "", i10, i10))).getMethod("n", cls, cls);
                    map.put(196637707, obj4);
                }
                cArr5[intValue2] = ((Character) ((Method) obj4).invoke(null, objArr5)).charValue();
                cArr4[intValue2] = configParameters.get;
                int i11 = configParameters.initialize;
                cArr6[i11] = (char) ((((r2 ^ cArr2[i11]) ^ (getWarnings ^ (-8880716800597159563L))) ^ ((int) (ThreeDS2ServiceInstance ^ (-8880716800597159563L)))) ^ ((char) (initialize ^ (-8880716800597159563L))));
                configParameters.initialize = i11 + 1;
                charArray2 = cArr2;
                length3 = i2;
                num4 = num2;
                num3 = num;
                i4 = 2;
                i6 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jr
    public String ThreeDS2Service() {
        get = (ThreeDS2Service + 113) % 128;
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", (-105358161) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) TextUtils.getTrimmedLength(""), "᪨ሞ\udb67뢟겿ﭡﻌ", "꾜로雹⨍", objArr);
        String intern = ((String) objArr[0]).intern();
        ThreeDS2Service = (get + 99) % 128;
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public int ThreeDS2ServiceInstance() {
        int i = get + 63;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            int i2 = 3 / 0;
        }
        return 16;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String get() {
        get = (ThreeDS2Service + 83) % 128;
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 105358161, (char) View.MeasureSpec.getSize(0), "᪨ሞ\udb67뢟겿ﭡﻌ", "꾜로雹⨍", objArr);
        String intern = ((String) objArr[0]).intern();
        int i = get + 13;
        ThreeDS2Service = i % 128;
        if (i % 2 != 0) {
            return intern;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jr
    public int getWarnings() {
        int i = get + 25;
        ThreeDS2Service = i % 128;
        if (i % 2 != 0) {
            return 24;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.jp
    public String initialize() {
        get = (ThreeDS2Service + 7) % 128;
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (AndroidCharacter.getMirror('0') - '0'), "㭚บꤝ偍ᠲ\ue2aaࡄ㙔죈秽", "\ue222蘞䮒쑁", objArr);
        String intern = ((String) objArr[0]).intern();
        get = (ThreeDS2Service + 75) % 128;
        return intern;
    }
}
