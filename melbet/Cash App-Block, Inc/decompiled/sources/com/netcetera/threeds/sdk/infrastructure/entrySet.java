package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class entrySet implements notify {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long ThreeDS2Service = 0;
    private static char ThreeDS2ServiceInitializationCallback = 0;
    private static final /* synthetic */ entrySet[] ThreeDS2ServiceInstance;
    private static int cleanup = 0;
    private static int createTransaction = 1;
    private static int getSDKVersion;
    public static final entrySet getWarnings;
    public static final entrySet initialize;
    private final String get;

    static {
        initialize();
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", (-220078275) - ExpandableListView.getPackedPositionChild(0L), (char) (ExpandableListView.getPackedPositionType(0L) + 5722), "基㰤멂", "㸕\ue1df嫲䨖", objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("\u0000\u0000\u0000\u0000", (ViewConfiguration.getTapTimeout() >> 16) - 750713610, (char) (Color.red(0) + 40760), "嚮", "\uf686䄄㣓Ο", objArr2);
        getWarnings = new entrySet(intern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a("\u0000\u0000\u0000\u0000", ExpandableListView.getPackedPositionType(0L), (char) (1487 - MotionEvent.axisFromString("")), "\uf856伌", "晱ۓ킶먅", objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a("\u0000\u0000\u0000\u0000", 1786277474 - TextUtils.getCapsMode("", 0, 0), (char) (13299 - AndroidCharacter.getMirror('0')), "曗", "扳确썪똳", objArr4);
        initialize = new entrySet(intern2, 1, ((String) objArr4[0]).intern());
        ThreeDS2ServiceInstance = ThreeDS2Service();
        int i = createTransaction + 107;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private entrySet(String str, int i, String str2) {
        this.get = str2;
    }

    private static /* synthetic */ entrySet[] ThreeDS2Service() {
        int i = getSDKVersion + 17;
        createTransaction = i % 128;
        if (i % 2 != 0) {
            return new entrySet[]{getWarnings, initialize};
        }
        entrySet[] entrysetArr = new entrySet[4];
        entrysetArr[1] = getWarnings;
        entrysetArr[1] = initialize;
        return entrysetArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (r28 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0031, code lost:
    
        r4 = r28.toCharArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x002f, code lost:
    
        if (r28 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0036, code lost:
    
        r4 = r28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(String str, int i, char c, String str2, String str3, Object[] objArr) {
        char[] charArray;
        char[] cArr;
        int i2;
        Integer num;
        int i3;
        Integer num2 = -258783473;
        int i4 = $10 + 9;
        $11 = i4 % 128;
        int i5 = 2;
        if (i4 % 2 == 0) {
            int i6 = 33 / 0;
        }
        char[] cArr2 = charArray;
        if (str2 != 0) {
            int i7 = $11 + 15;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                str2.toCharArray();
                throw null;
            }
            cArr = str2.toCharArray();
        } else {
            cArr = str2;
        }
        char[] cArr3 = cArr;
        char[] charArray2 = str != null ? str.toCharArray() : str;
        ConfigParameters configParameters = new ConfigParameters();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = charArray2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(charArray2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        configParameters.initialize = 0;
        while (configParameters.initialize < length3) {
            $10 = ($11 + 103) % 128;
            try {
                Object[] objArr2 = {configParameters};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(num2);
                int i8 = i5;
                if (obj != null) {
                    i2 = length3;
                } else {
                    i2 = length3;
                    obj = ((Class) removeParam.initialize(TextUtils.lastIndexOf("", '0', 0) + 59, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 6414 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)))).getMethod("j", Object.class);
                    map.put(num2, obj);
                }
                int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {configParameters};
                Object obj2 = map.get(246986610);
                if (obj2 != null) {
                    num = num2;
                    i3 = intValue;
                } else {
                    num = num2;
                    i3 = intValue;
                    obj2 = ((Class) removeParam.initialize(Process.getGidForName("") + 64, (char) (KeyEvent.getDeadChar(0, 0) + 11345), 8577 - Gravity.getAbsoluteGravity(0, 0))).getMethod("i", Object.class);
                    map.put(246986610, obj2);
                }
                int intValue2 = ((Integer) ((Method) obj2).invoke(null, objArr3)).intValue();
                int i9 = cArr4[configParameters.initialize % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i8] = Integer.valueOf(cArr5[i3]);
                objArr4[1] = Integer.valueOf(i9);
                objArr4[0] = configParameters;
                Object obj3 = map.get(828230935);
                Class cls = Integer.TYPE;
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(74 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0') + 1), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 9819)).getMethod("o", Object.class, cls, cls);
                    map.put(828230935, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
                int i10 = cArr4[intValue2] * 32718;
                Object[] objArr5 = new Object[i8];
                objArr5[1] = Integer.valueOf(cArr5[i3]);
                objArr5[0] = Integer.valueOf(i10);
                Object obj4 = map.get(196637707);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize(ImageFormat.getBitsPerPixel(0) + 49, (char) (View.resolveSize(0, 0) + 63350), Color.red(0) + 11536)).getMethod("n", cls, cls);
                    map.put(196637707, obj4);
                }
                cArr5[intValue2] = ((Character) ((Method) obj4).invoke(null, objArr5)).charValue();
                cArr4[intValue2] = configParameters.get;
                int i11 = configParameters.initialize;
                cArr6[i11] = (char) ((((r4 ^ cArr3[i11]) ^ (ThreeDS2Service ^ (-8880716800597159563L))) ^ ((int) (cleanup ^ (-8880716800597159563L)))) ^ ((char) (ThreeDS2ServiceInitializationCallback ^ (-8880716800597159563L))));
                configParameters.initialize = i11 + 1;
                length3 = i2;
                num2 = num;
                i5 = 2;
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

    public static void initialize() {
        ThreeDS2Service = -8880716800597159563L;
        cleanup = -1538861786;
        ThreeDS2ServiceInitializationCallback = (char) 4469;
    }

    public static entrySet valueOf(String str) {
        createTransaction = (getSDKVersion + 83) % 128;
        entrySet entryset = (entrySet) Enum.valueOf(entrySet.class, str);
        int i = createTransaction + 93;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            return entryset;
        }
        throw null;
    }

    public static entrySet[] values() {
        getSDKVersion = (createTransaction + 67) % 128;
        entrySet[] entrysetArr = (entrySet[]) ThreeDS2ServiceInstance.clone();
        int i = createTransaction + 29;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            int i2 = 46 / 0;
        }
        return entrysetArr;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.notify
    public String getWarnings() {
        int i = createTransaction + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getSDKVersion = i % 128;
        int i2 = i % 2;
        String str = this.get;
        if (i2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // java.lang.Enum
    public String toString() {
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", ImageFormat.getBitsPerPixel(0) + 1, (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 62512), "\uf04b㽫ᖲ핲㦎倁\ue2c4ṩꐣ㢝훆쐰均샹룁䅭", "煘孝ピ䯴", objArr);
        StringBuilder sb = new StringBuilder(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a("\u0000\u0000\u0000\u0000", Gravity.getAbsoluteGravity(0, 0) - 98998388, (char) (48038 - Color.argb(0, 0, 0, 0)), "燍ὥᘄ᭞꺘粃ﺨ跖粥ạ哫⿌ᬍ鼹ࠖ\ue435黎", "賨ᥧ\ua6fa覻", objArr2);
        sb.append(((String) objArr2[0]).intern());
        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.get, "'}");
        int i = getSDKVersion + 19;
        createTransaction = i % 128;
        if (i % 2 != 0) {
            return m;
        }
        throw null;
    }
}
