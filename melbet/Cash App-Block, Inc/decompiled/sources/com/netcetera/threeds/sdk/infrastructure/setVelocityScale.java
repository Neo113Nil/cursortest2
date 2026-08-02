package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.setCacheColorHint;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class setVelocityScale implements setCacheColorHint {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static byte[] ThreeDS2Service;
    private static short[] cleanup;
    private static int createTransaction;
    private static int get;
    private static int getSDKInfo;
    private static int getWarnings;
    private static int initialize;
    private final setWeightSum ThreeDS2ServiceInstance;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKInfo = 0;
        createTransaction = 1;
        get = 1098308693;
        initialize = -1686431730;
        getWarnings = 1137096589;
        ThreeDS2Service = new byte[]{-118, 120, -113, -72, 24};
    }

    public setVelocityScale(setWeightSum setweightsum) {
        this.ThreeDS2ServiceInstance = setweightsum;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, byte b, short s, int i2, int i3, Object[] objArr) {
        long j;
        int i4;
        int i5;
        long j2;
        boolean z;
        char c;
        int i6;
        int i7;
        int i8;
        byte[] bArr;
        int i9;
        Object method;
        getSDKVersion getsdkversion = new getSDKVersion();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(initialize)};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(981393365);
            Class cls = Integer.TYPE;
            if (obj != null) {
                j = 0;
            } else {
                j = 0;
                Class cls2 = (Class) removeParam.initialize(Color.alpha(0) + 62, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 653);
                Object[] objArr3 = new Object[1];
                b((byte) 0, (short) 0, 2, objArr3);
                obj = cls2.getMethod((String) objArr3[0], cls, cls);
                map.put(981393365, obj);
            }
            int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                int i10 = $11 + 107;
                $10 = i10 % 128;
                if (i10 % 2 == 0) {
                    i4 = 1;
                    if (i4 == 0) {
                        byte[] bArr2 = ThreeDS2Service;
                        if (bArr2 != null) {
                            j2 = 2786809877878216728L;
                            int length = bArr2.length;
                            byte[] bArr3 = new byte[length];
                            i6 = 2;
                            int i11 = 0;
                            while (i11 < length) {
                                $11 = ($10 + 113) % 128;
                                Object[] objArr4 = {Integer.valueOf(bArr2[i11])};
                                Map map2 = removeParam.visaSchemeConfiguration;
                                Object obj2 = map2.get(-1684720202);
                                if (obj2 != null) {
                                    i8 = i11;
                                    i9 = i4;
                                    method = obj2;
                                    bArr = bArr2;
                                } else {
                                    i8 = i11;
                                    bArr = bArr2;
                                    i9 = i4;
                                    Class cls3 = (Class) removeParam.initialize(58 - Process.getGidForName(""), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 3162 - View.MeasureSpec.makeMeasureSpec(0, 0));
                                    Object[] objArr5 = new Object[1];
                                    b((byte) 0, (short) 0, 0, objArr5);
                                    method = cls3.getMethod((String) objArr5[0], cls);
                                    map2.put(-1684720202, method);
                                }
                                bArr3[i8] = ((Byte) ((Method) method).invoke(null, objArr4)).byteValue();
                                i11 = i8 + 1;
                                bArr2 = bArr;
                                i4 = i9;
                            }
                            i5 = i4;
                            $11 = ($10 + 49) % 128;
                            bArr2 = bArr3;
                        } else {
                            i6 = 2;
                            i5 = i4;
                            j2 = 2786809877878216728L;
                        }
                        if (bArr2 != null) {
                            int i12 = $11 + 117;
                            $10 = i12 % 128;
                            if (i12 % 2 != 0) {
                                byte[] bArr4 = ThreeDS2Service;
                                Object[] objArr6 = new Object[i6];
                                objArr6[1] = Integer.valueOf(get);
                                objArr6[0] = Integer.valueOf(i2);
                                Map map3 = removeParam.visaSchemeConfiguration;
                                Object obj3 = map3.get(981393365);
                                if (obj3 == null) {
                                    Class cls4 = (Class) removeParam.initialize(62 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), View.getDefaultSize(0, 0) + 654);
                                    Object[] objArr7 = new Object[1];
                                    b((byte) 0, (short) 0, 2, objArr7);
                                    obj3 = cls4.getMethod((String) objArr7[0], cls, cls);
                                    map3.put(981393365, obj3);
                                }
                                i7 = ((byte) (bArr4[((Integer) ((Method) obj3).invoke(null, objArr6)).intValue()] + j2)) >>> ((int) (initialize * j2));
                            } else {
                                byte[] bArr5 = ThreeDS2Service;
                                Object[] objArr8 = {Integer.valueOf(i2), Integer.valueOf(get)};
                                Map map4 = removeParam.visaSchemeConfiguration;
                                Object obj4 = map4.get(981393365);
                                if (obj4 == null) {
                                    Class cls5 = (Class) removeParam.initialize(62 - ((Process.getThreadPriority(0) + 20) >> 6), (char) View.MeasureSpec.getMode(0), 653 - TextUtils.lastIndexOf("", '0', 0, 0));
                                    Object[] objArr9 = new Object[1];
                                    b((byte) 0, (short) 0, 2, objArr9);
                                    obj4 = cls5.getMethod((String) objArr9[0], cls, cls);
                                    map4.put(981393365, obj4);
                                }
                                i7 = ((byte) (bArr5[((Integer) ((Method) obj4).invoke(null, objArr8)).intValue()] ^ j2)) + ((int) (initialize ^ j2));
                            }
                            intValue = (byte) i7;
                        } else {
                            intValue = (short) (((short) (cleanup[i2 + ((int) (get ^ j2))] ^ j2)) + ((int) (initialize ^ j2)));
                        }
                    } else {
                        i5 = i4;
                        j2 = 2786809877878216728L;
                    }
                    if (intValue > 0) {
                        $11 = ($10 + 57) % 128;
                        getsdkversion.ThreeDS2ServiceInstance = ((i2 + intValue) - 2) + ((int) (get ^ j2)) + i5;
                        Object[] objArr10 = {getsdkversion, Integer.valueOf(i), Integer.valueOf(getWarnings), sb};
                        Map map5 = removeParam.visaSchemeConfiguration;
                        Object obj5 = map5.get(-1855485602);
                        if (obj5 == null) {
                            Class cls6 = (Class) removeParam.initialize((ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 53, (char) (Gravity.getAbsoluteGravity(0, 0) + 13764), 2801 - TextUtils.lastIndexOf("", '0'));
                            Object[] objArr11 = new Object[1];
                            b((byte) 0, (short) 0, 1, objArr11);
                            obj5 = cls6.getMethod((String) objArr11[0], Object.class, cls, cls, Object.class);
                            map5.put(-1855485602, obj5);
                        }
                        ((StringBuilder) ((Method) obj5).invoke(null, objArr10)).append(getsdkversion.ThreeDS2Service);
                        getsdkversion.getWarnings = getsdkversion.ThreeDS2Service;
                        byte[] bArr6 = ThreeDS2Service;
                        if (bArr6 != null) {
                            int length2 = bArr6.length;
                            byte[] bArr7 = new byte[length2];
                            for (int i13 = 0; i13 < length2; i13++) {
                                bArr7[i13] = (byte) (bArr6[i13] ^ j2);
                            }
                            bArr6 = bArr7;
                        }
                        if (bArr6 != null) {
                            int i14 = $10 + 107;
                            $11 = i14 % 128;
                            if (i14 % 2 != 0) {
                                z = true;
                                getsdkversion.initialize = 1;
                                while (getsdkversion.initialize < intValue) {
                                    int i15 = ($10 + 55) % 128;
                                    $11 = i15;
                                    if (z) {
                                        int i16 = i15 + 33;
                                        $10 = i16 % 128;
                                        int i17 = i16 % 2;
                                        int i18 = getsdkversion.ThreeDS2ServiceInstance;
                                        if (i17 != 0) {
                                            byte[] bArr8 = ThreeDS2Service;
                                            getsdkversion.ThreeDS2ServiceInstance = i18;
                                            c = (char) (getsdkversion.getWarnings >>> (((byte) (((byte) (bArr8[i18] % j2)) + s)) ^ b));
                                        } else {
                                            byte[] bArr9 = ThreeDS2Service;
                                            getsdkversion.ThreeDS2ServiceInstance = i18 - 1;
                                            c = (char) (getsdkversion.getWarnings + (((byte) (((byte) (bArr9[i18] ^ j2)) + s)) ^ b));
                                        }
                                        getsdkversion.ThreeDS2Service = c;
                                    } else {
                                        short[] sArr = cleanup;
                                        getsdkversion.ThreeDS2ServiceInstance = getsdkversion.ThreeDS2ServiceInstance - 1;
                                        getsdkversion.ThreeDS2Service = (char) (getsdkversion.getWarnings + (((short) (((short) (sArr[r2] ^ j2)) + s)) ^ b));
                                    }
                                    sb.append(getsdkversion.ThreeDS2Service);
                                    getsdkversion.getWarnings = getsdkversion.ThreeDS2Service;
                                    getsdkversion.initialize++;
                                }
                            }
                        }
                        z = false;
                        getsdkversion.initialize = 1;
                        while (getsdkversion.initialize < intValue) {
                        }
                    }
                    objArr[0] = sb.toString();
                }
            }
            i4 = 0;
            if (i4 == 0) {
            }
            if (intValue > 0) {
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(byte b, short s, int i, Object[] objArr) {
        int i2;
        int i3 = i + 102;
        int i4 = s * 3;
        int i5 = 4 - (b * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i7 = 0;
            int i8 = i3;
            int i9 = i5;
            int i10 = i9 + 1;
            i3 = (-i5) + i8;
            i5 = i10;
            bArr = bArr3;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i11 = i3;
            i9 = i5;
            i5 = bArr[i5];
            i7 = i2 + 1;
            bArr3 = bArr;
            i8 = i11;
            int i102 = i9 + 1;
            i3 = (-i5) + i8;
            i5 = i102;
            bArr = bArr3;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{81, -51, 83, 43};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCacheColorHint
    public setCacheColorHint.getWarnings ThreeDS2Service(String str) {
        int i;
        int i2 = getSDKInfo + 13;
        createTransaction = i2 % 128;
        if (i2 % 2 == 0) {
            setCacheColorHint.getWarnings.getWarnings.getWarnings().equals(str);
            throw null;
        }
        setCacheColorHint.getWarnings getwarnings = setCacheColorHint.getWarnings.getWarnings;
        if (getwarnings.getWarnings().equals(str)) {
            i = getSDKInfo + 115;
        } else {
            getwarnings = setCacheColorHint.getWarnings.ThreeDS2ServiceInstance;
            if (!getwarnings.getWarnings().equals(str)) {
                setCacheColorHint.getWarnings getwarnings2 = setCacheColorHint.getWarnings.get;
                if (!getwarnings2.getWarnings().equals(str)) {
                    return null;
                }
                int i3 = getSDKInfo + 9;
                createTransaction = i3 % 128;
                if (i3 % 2 != 0) {
                    return getwarnings2;
                }
                throw null;
            }
            i = getSDKInfo + 49;
        }
        createTransaction = i % 128;
        return getwarnings;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCacheColorHint
    public setCacheColorHint.get ThreeDS2ServiceInstance() {
        getSDKInfo = (createTransaction + 83) % 128;
        setCacheColorHint.get getVar = setCacheColorHint.get.get(this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance().get().initialize());
        Object[] objArr = new Object[1];
        a(658657455 - ((Process.getThreadPriority(0) + 20) >> 6), (byte) TextUtils.getCapsMode("", 0, 0), (short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 113), 636631987 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), TextUtils.indexOf("", "", 0) - 17, objArr);
        setCacheColorHint.get getVar2 = (setCacheColorHint.get) og.ThreeDS2Service(getVar, setCacheColorHint.get.valueOf(((String) objArr[0]).intern()));
        getSDKInfo = (createTransaction + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return getVar2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCacheColorHint
    public setCacheColorHint.getWarnings getWarnings() {
        int i = getSDKInfo + 49;
        createTransaction = i % 128;
        if (i % 2 == 0) {
            setCacheColorHint.getWarnings getwarnings = setCacheColorHint.getWarnings.getWarnings;
            throw null;
        }
        setCacheColorHint.getWarnings getwarnings2 = setCacheColorHint.getWarnings.get;
        int i2 = createTransaction + 119;
        getSDKInfo = i2 % 128;
        if (i2 % 2 == 0) {
            return getwarnings2;
        }
        throw null;
    }
}
