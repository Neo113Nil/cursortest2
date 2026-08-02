package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.api.ThreeDS2Service;
import com.netcetera.threeds.sdk.api.ui.logic.UiCustomization;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes5.dex */
public class setTextLocale implements com.netcetera.threeds.sdk.api.ThreeDS2Service {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] ThreeDS2Service;
    private static int cleanup;
    private static int get;
    private static char initialize;
    private final nk ThreeDS2ServiceInstance;
    private final com.netcetera.threeds.sdk.api.ThreeDS2Service getWarnings;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        get = 0;
        cleanup = 1;
        ThreeDS2Service = new char[]{37971, 37950, 37929, 37974, 37907, 37908, 37975, 37910, 37888, 37977, 37970, 37906, 37896, 37973, 37979, 37913, 37978, 37915, 37919, 37902, 37900, 37976, 37960, 37934, 37972};
        initialize = (char) 41445;
    }

    public setTextLocale(Object obj, nk nkVar) {
        try {
            Map map = removeParam.visaSchemeConfiguration;
            Object obj2 = map.get(-1608593175);
            if (obj2 == null) {
                obj2 = ((Class) removeParam.initialize(Process.getGidForName("") + 69, (char) KeyEvent.getDeadChar(0, 0), 10682 - TextUtils.getOffsetBefore("", 0))).getMethod("ThreeDS2Service", null);
                map.put(-1608593175, obj2);
            }
            this.getWarnings = (com.netcetera.threeds.sdk.api.ThreeDS2Service) ((Method) obj2).invoke(obj, null);
            this.ThreeDS2ServiceInstance = nkVar;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static com.netcetera.threeds.sdk.api.ThreeDS2Service ThreeDS2Service() {
        setTextLocale settextlocale = new setTextLocale(setThreeDSRequestorAppURL.initialize((Class) removeParam.initialize(69 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) TextUtils.getCapsMode("", 0, 0), 10681 - TextUtils.indexOf((CharSequence) "", '0'))), new nk());
        int i = get + 55;
        cleanup = i % 128;
        if (i % 2 != 0) {
            return settextlocale;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0135, code lost:
    
        if (r10 == r12) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x015a, code lost:
    
        r9 = new java.lang.Object[13];
        r9[12] = r7;
        r9[11] = java.lang.Integer.valueOf(r3);
        r9[10] = r7;
        r9[9] = r7;
        r9[8] = java.lang.Integer.valueOf(r3);
        r9[7] = r7;
        r9[6] = r7;
        r9[5] = java.lang.Integer.valueOf(r3);
        r9[4] = r7;
        r9[3] = r7;
        r9[r16] = java.lang.Integer.valueOf(r3);
        r9[1] = r7;
        r9[0] = r7;
        r10 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
        r22 = r10.get(-1395483366);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a4, code lost:
    
        if (r22 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a6, code lost:
    
        r23 = '\t';
        r24 = 7;
        r25 = 6;
        r12 = r22;
        r22 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0204, code lost:
    
        r9 = ((java.lang.Integer) ((java.lang.reflect.Method) r12).invoke(null, r9)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0211, code lost:
    
        r12 = r7.cleanup;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0213, code lost:
    
        if (r9 != r12) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0215, code lost:
    
        r9 = new java.lang.Object[11];
        r9[10] = r7;
        r9[r23] = java.lang.Integer.valueOf(r3);
        r9[r22] = r7;
        r9[r24] = java.lang.Integer.valueOf(r3);
        r9[r25] = java.lang.Integer.valueOf(r3);
        r9[5] = r7;
        r9[4] = r7;
        r9[3] = java.lang.Integer.valueOf(r3);
        r9[r16] = java.lang.Integer.valueOf(r3);
        r9[1] = r7;
        r9[0] = r7;
        r12 = r10.get(1507360409);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0248, code lost:
    
        if (r12 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x028c, code lost:
    
        r9 = ((java.lang.Integer) ((java.lang.reflect.Method) r12).invoke(null, r9)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0299, code lost:
    
        r10 = (r7.ThreeDS2ServiceInstance * r3) + r7.cleanup;
        r11 = r7.getWarnings;
        r4[r11] = r8[r9];
        r4[r11 + 1] = r8[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x024b, code lost:
    
        r11 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(android.graphics.Color.red(0) + 47, (char) (25644 - (android.util.TypedValue.complexToFloat(0) > androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE ? 1 : (android.util.TypedValue.complexToFloat(0) == androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE ? 0 : -1))), 11489 - (android.view.ViewConfiguration.getTapTimeout() >> 16));
        r21 = java.lang.Integer.TYPE;
        r12 = r11.getMethod("x", java.lang.Object.class, java.lang.Object.class, r21, r21, java.lang.Object.class, java.lang.Object.class, r21, r21, java.lang.Object.class, r21, java.lang.Object.class);
        r10.put(1507360409, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02af, code lost:
    
        r9 = r7.ThreeDS2Service;
        r10 = r7.ThreeDS2ServiceInstance;
        r11 = r7.ThreeDS2ServiceInitializationCallback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x02b6, code lost:
    
        if (r9 != r10) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02b8, code lost:
    
        r11 = com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility.m(r11, r3, 1, r3);
        r7.ThreeDS2ServiceInitializationCallback = r11;
        r12 = com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility.m(r12, r3, 1, r3);
        r7.cleanup = r12;
        r9 = (r9 * r3) + r11;
        r11 = r7.getWarnings;
        r4[r11] = r8[r9];
        r4[r11 + 1] = r8[(r10 * r3) + r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02d5, code lost:
    
        r10 = (r10 * r3) + r11;
        r11 = r7.getWarnings;
        r4[r11] = r8[(r9 * r3) + r12];
        r4[r11 + 1] = r8[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01b1, code lost:
    
        r23 = '\t';
        r24 = 7;
        r22 = '\b';
        r25 = 6;
        r12 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(48 - (android.view.ViewConfiguration.getTouchSlop() >> 8), (char) (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), android.view.Gravity.getAbsoluteGravity(0, 0) + 3221);
        r15 = new java.lang.Object[1];
        b(1, (byte) 0, (byte) 0, r15);
        r13 = (java.lang.String) r15[0];
        r28 = java.lang.Integer.TYPE;
        r12 = r12.getMethod(r13, java.lang.Object.class, java.lang.Object.class, r28, java.lang.Object.class, java.lang.Object.class, r28, java.lang.Object.class, java.lang.Object.class, r28, java.lang.Object.class, java.lang.Object.class, r28, java.lang.Object.class);
        r10.put(-1395483366, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0144, code lost:
    
        r4[r9] = (char) (r7.get - r39);
        r4[r9 + 1] = (char) (r7.initialize - r39);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0142, code lost:
    
        if (r10 == r11) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, String str, int i, Object[] objArr) {
        char[] cArr;
        int i2;
        char c = 2;
        if (str != null) {
            int i3 = $10 + 37;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        getParamValue getparamvalue = new getParamValue();
        char[] cArr3 = ThreeDS2Service;
        Class cls = Integer.TYPE;
        int i4 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    char c2 = c;
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-78420608);
                    if (obj == null) {
                        Class cls2 = (Class) removeParam.initialize((KeyEvent.getMaxKeyCode() >> 16) + 94, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(i4) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i4) == 0.0d ? 0 : -1)), 1559 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                        Object[] objArr3 = new Object[1];
                        b(0, (byte) 0, (byte) 0, objArr3);
                        Method method = cls2.getMethod((String) objArr3[0], cls);
                        map.put(-78420608, method);
                        obj = method;
                    }
                    cArr4[i5] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    i5++;
                    c = c2;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        char c3 = c;
        Object[] objArr4 = {Integer.valueOf(initialize)};
        Map map2 = removeParam.visaSchemeConfiguration;
        Object obj2 = map2.get(-78420608);
        if (obj2 == null) {
            Class cls3 = (Class) removeParam.initialize(Color.blue(0) + 94, (char) View.resolveSizeAndState(0, 0, 0), 1559 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
            Object[] objArr5 = new Object[1];
            b(0, (byte) 0, (byte) 0, objArr5);
            obj2 = cls3.getMethod((String) objArr5[0], cls);
            map2.put(-78420608, obj2);
        }
        char charValue = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            $10 = ($11 + 53) % 128;
            i2 = i - 1;
            cArr5[i2] = (char) (cArr2[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            getparamvalue.getWarnings = 0;
            while (true) {
                int i6 = getparamvalue.getWarnings;
                if (i6 >= i2) {
                    break;
                }
                int i7 = $10 + 21;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    char c4 = cArr2[i6];
                    getparamvalue.get = c4;
                    char c5 = cArr2[0];
                    getparamvalue.initialize = c5;
                } else {
                    char c6 = cArr2[i6];
                    getparamvalue.get = c6;
                    char c7 = cArr2[i6 + 1];
                    getparamvalue.initialize = c7;
                }
                getparamvalue.getWarnings += 2;
                $11 = ($10 + 105) % 128;
            }
        }
        for (int i8 = 0; i8 < i; i8++) {
            cArr5[i8] = (char) (cArr5[i8] ^ 13722);
        }
        objArr[0] = new String(cArr5);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, byte b, byte b2, Object[] objArr) {
        int i2;
        int i3;
        int i4 = 119 - (i * 2);
        int i5 = 3 - (b * 2);
        byte[] bArr = $$a;
        int i6 = 1 - (b2 * 4);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i5;
            int i8 = i6;
            i3 = 0;
            int i9 = i5 + i8;
            i5 = i7;
            i4 = i9;
            i2 = i3;
            int i10 = i5 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i8 = bArr[i10];
            i5 = i4;
            i7 = i10;
            int i92 = i5 + i8;
            i5 = i7;
            i4 = i92;
            i2 = i3;
            int i102 = i5 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            int i1022 = i5 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i6) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{67, -54, Byte.MAX_VALUE, PnmConstants.PPM_TEXT_CODE};
        $$b = 48;
    }

    @Override // com.netcetera.threeds.sdk.api.ThreeDS2Service
    public synchronized void cleanup(Context context) {
        get = (cleanup + 21) % 128;
        this.getWarnings.cleanup(context);
        get = (cleanup + 21) % 128;
    }

    @Override // com.netcetera.threeds.sdk.api.ThreeDS2Service
    public synchronized com.netcetera.threeds.sdk.api.transaction.Transaction createTransaction(String str, String str2) {
        com.netcetera.threeds.sdk.api.transaction.Transaction createTransaction;
        int i = get + 49;
        cleanup = i % 128;
        int i2 = i % 2;
        com.netcetera.threeds.sdk.api.ThreeDS2Service threeDS2Service = this.getWarnings;
        if (i2 == 0) {
            threeDS2Service.createTransaction(str, str2);
            throw null;
        }
        createTransaction = threeDS2Service.createTransaction(str, str2);
        get = (cleanup + 45) % 128;
        return createTransaction;
    }

    @Override // com.netcetera.threeds.sdk.api.ThreeDS2Service
    public synchronized com.netcetera.threeds.sdk.api.info.SDKInfo getSDKInfo() {
        com.netcetera.threeds.sdk.api.ThreeDS2Service threeDS2Service;
        int i = get + 109;
        cleanup = i % 128;
        int i2 = i % 2;
        threeDS2Service = this.getWarnings;
        if (i2 == 0) {
            threeDS2Service.getSDKInfo();
            throw null;
        }
        return threeDS2Service.getSDKInfo();
    }

    @Override // com.netcetera.threeds.sdk.api.ThreeDS2Service
    public synchronized String getSDKVersion() {
        String sDKVersion;
        try {
            int i = cleanup + 31;
            get = i % 128;
            int i2 = i % 2;
            com.netcetera.threeds.sdk.api.ThreeDS2Service threeDS2Service = this.getWarnings;
            if (i2 != 0) {
                sDKVersion = threeDS2Service.getSDKVersion();
                int i3 = 24 / 0;
            } else {
                sDKVersion = threeDS2Service.getSDKVersion();
            }
            get = (cleanup + 45) % 128;
        } catch (Throwable th) {
            throw th;
        }
        return sDKVersion;
    }

    @Override // com.netcetera.threeds.sdk.api.ThreeDS2Service
    public synchronized List<com.netcetera.threeds.sdk.api.security.Warning> getWarnings() {
        com.netcetera.threeds.sdk.api.ThreeDS2Service threeDS2Service;
        int i = cleanup + 53;
        get = i % 128;
        int i2 = i % 2;
        threeDS2Service = this.getWarnings;
        if (i2 != 0) {
            threeDS2Service.getWarnings();
            throw null;
        }
        return threeDS2Service.getWarnings();
    }

    @Override // com.netcetera.threeds.sdk.api.ThreeDS2Service
    public void initialize(Context context, com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters, String str, Map<UiCustomization.UiCustomizationType, com.netcetera.threeds.sdk.api.ui.logic.UiCustomization> map) {
        Object obj;
        int i = get + 55;
        cleanup = i % 128;
        int i2 = i % 2;
        nk nkVar = this.ThreeDS2ServiceInstance;
        if (i2 == 0) {
            Object[] objArr = new Object[1];
            a((byte) (94 >>> (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), "\u0015\r\r\u0011\u0010\u0003\u0007\u0002\u0003\u0011\n\u0016\u0000\u0013\u0013\u0017\u0000\t\t\u0018\u0002\u0013\t\u0002\r\u0017\u000e\u0014㗌㗌㗋", 10 << (SystemClock.elapsedRealtime() > 1L ? 1 : (SystemClock.elapsedRealtime() == 1L ? 0 : -1)), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a((byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24), "\u0015\r\r\u0011\u0010\u0003\u0007\u0002\u0003\u0011\n\u0016\u0000\u0013\u0013\u0017\u0000\t\t\u0018\u0002\u0013\t\u0002\r\u0017\u000e\u0014㗌㗌㗋", 32 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
            obj = objArr2[0];
        }
        nkVar.ThreeDS2Service(((String) obj).intern());
        this.getWarnings.initialize(context, configParameters, str, map);
    }

    @Override // com.netcetera.threeds.sdk.api.ThreeDS2Service
    public com.netcetera.threeds.sdk.api.transaction.Transaction createTransaction(String str, String str2, Map<String, String> map) {
        int i = get + 5;
        cleanup = i % 128;
        int i2 = i % 2;
        com.netcetera.threeds.sdk.api.ThreeDS2Service threeDS2Service = this.getWarnings;
        if (i2 != 0) {
            return threeDS2Service.createTransaction(str, str2, map);
        }
        threeDS2Service.createTransaction(str, str2, map);
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.api.ThreeDS2Service
    public synchronized void initialize(Context context, com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters, String str, com.netcetera.threeds.sdk.api.ui.logic.UiCustomization uiCustomization) {
        cleanup = (get + 103) % 128;
        nk nkVar = this.ThreeDS2ServiceInstance;
        Object[] objArr = new Object[1];
        a((byte) (24 - View.MeasureSpec.makeMeasureSpec(0, 0)), "\u0015\r\r\u0011\u0010\u0003\u0007\u0002\u0003\u0011\n\u0016\u0000\u0013\u0013\u0017\u0000\t\t\u0018\u0002\u0013\t\u0002\r\u0017\u000e\u0014㗌㗌㗋", 31 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
        nkVar.ThreeDS2Service(((String) objArr[0]).intern());
        this.getWarnings.initialize(context, configParameters, str, uiCustomization);
        int i = cleanup + 39;
        get = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.api.ThreeDS2Service
    public void initialize(Context context, com.netcetera.threeds.sdk.api.configparameters.ConfigParameters configParameters, String str, Map<UiCustomization.UiCustomizationType, com.netcetera.threeds.sdk.api.ui.logic.UiCustomization> map, ThreeDS2Service.InitializationCallback initializationCallback) {
        get = (cleanup + 99) % 128;
        nk nkVar = this.ThreeDS2ServiceInstance;
        Object[] objArr = new Object[1];
        a((byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 25), "\u0015\r\r\u0011\u0010\u0003\u0007\u0002\u0003\u0011\n\u0016\u0000\u0013\u0013\u0017\u0000\t\t\u0018\u0002\u0013\t\u0002\r\u0017\u000e\u0014㗌㗌㗋", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 30, objArr);
        nkVar.ThreeDS2Service(((String) objArr[0]).intern());
        this.getWarnings.initialize(context, configParameters, str, map, initializationCallback);
        int i = cleanup + 31;
        get = i % 128;
        if (i % 2 != 0) {
            int i2 = 87 / 0;
        }
    }
}
