package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes5.dex */
public class setAutoSizeTextTypeUniformWithPresetSizes implements setFillViewport {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char get;
    private static int getSDKInfo;
    private static int getSDKVersion;
    private static char[] initialize;
    private final Logger ThreeDS2Service = LoggerFactory.getLogger((Class<?>) setAutoSizeTextTypeUniformWithPresetSizes.class);
    private final ExecutorService ThreeDS2ServiceInstance;
    private final setFillViewport getWarnings;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKInfo = 0;
        getSDKVersion = 1;
        initialize = new char[]{37902, 37906, 37915, 37910, 37898, 37896, 37934, 37978, 37919, 37890, 37918, 37914, 37913, 37907, 37917, 37904, 37916, 37909, 37911, 37903, 37912, 37905, 38880, 37897, 37908};
        get = (char) 41445;
    }

    public setAutoSizeTextTypeUniformWithPresetSizes(ExecutorService executorService, setFillViewport setfillviewport) {
        this.ThreeDS2ServiceInstance = executorService;
        this.getWarnings = setfillviewport;
    }

    public static /* synthetic */ Void ThreeDS2Service(setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes, setOnItemClickListener setonitemclicklistener, String str) {
        getSDKVersion = (getSDKInfo + 19) % 128;
        Void ThreeDS2ServiceInstance = setautosizetexttypeuniformwithpresetsizes.ThreeDS2ServiceInstance(setonitemclicklistener, str);
        getSDKInfo = (getSDKVersion + 45) % 128;
        return ThreeDS2ServiceInstance;
    }

    private static void a(byte b, String str, int i, Object[] objArr) {
        char[] cArr;
        char c;
        int i2;
        char c2;
        char c3;
        char c4;
        Object method;
        int i3 = $11;
        $10 = (i3 + 117) % 128;
        int i4 = 0;
        if (str != null) {
            int i5 = i3 + 31;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                cArr = str.toCharArray();
                int i6 = 14 / 0;
            } else {
                cArr = str.toCharArray();
            }
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        getParamValue getparamvalue = new getParamValue();
        char[] cArr3 = initialize;
        Class cls = Integer.TYPE;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            c = 2;
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 29;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i7])};
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj = map.get(-78420608);
                        if (obj == null) {
                            Class cls2 = (Class) removeParam.initialize(View.combineMeasuredStates(i4, i4) + 94, (char) (KeyEvent.getMaxKeyCode() >> 16), 1559 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                            Object[] objArr3 = new Object[1];
                            b((short) 0, 0, 0, objArr3);
                            Method method2 = cls2.getMethod((String) objArr3[0], cls);
                            map.put(-78420608, method2);
                            obj = method2;
                        }
                        cArr4[i7] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                        i7 %= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr4 = {Integer.valueOf(cArr3[i7])};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(-78420608);
                    if (obj2 == null) {
                        Class cls3 = (Class) removeParam.initialize((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 93, (char) (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), 1559 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        Object[] objArr5 = new Object[1];
                        b((short) 0, 0, 0, objArr5);
                        obj2 = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(-78420608, obj2);
                    }
                    cArr4[i7] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                    i7++;
                }
                i4 = 0;
            }
            cArr3 = cArr4;
        } else {
            c = 2;
        }
        Object[] objArr6 = {Integer.valueOf(get)};
        Map map3 = removeParam.visaSchemeConfiguration;
        Object obj3 = map3.get(-78420608);
        if (obj3 == null) {
            Class cls4 = (Class) removeParam.initialize((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 93, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getEdgeSlop() >> 16) + 1559);
            Object[] objArr7 = new Object[1];
            b((short) 0, 0, 0, objArr7);
            obj3 = cls4.getMethod((String) objArr7[0], cls);
            map3.put(-78420608, obj3);
        }
        char charValue = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr5[i2] = (char) (cArr2[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            getparamvalue.getWarnings = 0;
            while (true) {
                int i9 = getparamvalue.getWarnings;
                if (i9 >= i2) {
                    break;
                }
                $10 = ($11 + 1) % 128;
                char c5 = cArr2[i9];
                getparamvalue.get = c5;
                char c6 = cArr2[i9 + 1];
                getparamvalue.initialize = c6;
                if (c5 == c6) {
                    cArr5[i9] = (char) (c5 - b);
                    cArr5[i9 + 1] = (char) (c6 - b);
                } else {
                    Object[] objArr8 = new Object[13];
                    objArr8[12] = getparamvalue;
                    objArr8[11] = Integer.valueOf(charValue);
                    objArr8[10] = getparamvalue;
                    objArr8[9] = getparamvalue;
                    objArr8[8] = Integer.valueOf(charValue);
                    objArr8[7] = getparamvalue;
                    objArr8[6] = getparamvalue;
                    objArr8[5] = Integer.valueOf(charValue);
                    objArr8[4] = getparamvalue;
                    objArr8[3] = getparamvalue;
                    objArr8[c] = Integer.valueOf(charValue);
                    objArr8[1] = getparamvalue;
                    objArr8[0] = getparamvalue;
                    Map map4 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map4.get(-1395483366);
                    if (obj4 != null) {
                        c2 = '\t';
                        c3 = 7;
                        method = obj4;
                        c4 = '\b';
                    } else {
                        c2 = '\t';
                        c3 = 7;
                        c4 = '\b';
                        Class cls5 = (Class) removeParam.initialize((ViewConfiguration.getKeyRepeatDelay() >> 16) + 48, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 3221 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)));
                        Object[] objArr9 = new Object[1];
                        b((short) 0, 0, 1, objArr9);
                        String str2 = (String) objArr9[0];
                        Class cls6 = Integer.TYPE;
                        method = cls5.getMethod(str2, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class);
                        map4.put(-1395483366, method);
                    }
                    int intValue = ((Integer) ((Method) method).invoke(null, objArr8)).intValue();
                    int i10 = getparamvalue.cleanup;
                    if (intValue == i10) {
                        Object[] objArr10 = new Object[11];
                        objArr10[10] = getparamvalue;
                        objArr10[c2] = Integer.valueOf(charValue);
                        objArr10[c4] = getparamvalue;
                        objArr10[c3] = Integer.valueOf(charValue);
                        objArr10[6] = Integer.valueOf(charValue);
                        objArr10[5] = getparamvalue;
                        objArr10[4] = getparamvalue;
                        objArr10[3] = Integer.valueOf(charValue);
                        objArr10[c] = Integer.valueOf(charValue);
                        objArr10[1] = getparamvalue;
                        objArr10[0] = getparamvalue;
                        Object obj5 = map4.get(1507360409);
                        if (obj5 == null) {
                            Class cls7 = (Class) removeParam.initialize((Process.myTid() >> 22) + 47, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 25643), (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 11488);
                            Class cls8 = Integer.TYPE;
                            obj5 = cls7.getMethod("x", Object.class, Object.class, cls8, cls8, Object.class, Object.class, cls8, cls8, Object.class, cls8, Object.class);
                            map4.put(1507360409, obj5);
                        }
                        int intValue2 = ((Integer) ((Method) obj5).invoke(null, objArr10)).intValue();
                        int i11 = (getparamvalue.ThreeDS2ServiceInstance * charValue) + getparamvalue.cleanup;
                        int i12 = getparamvalue.getWarnings;
                        cArr5[i12] = cArr3[intValue2];
                        cArr5[i12 + 1] = cArr3[i11];
                    } else {
                        int i13 = getparamvalue.ThreeDS2Service;
                        int i14 = getparamvalue.ThreeDS2ServiceInstance;
                        int i15 = getparamvalue.ThreeDS2ServiceInitializationCallback;
                        if (i13 == i14) {
                            int m = Thread$State$EnumUnboxingLocalUtility.m(i15, charValue, 1, charValue);
                            getparamvalue.ThreeDS2ServiceInitializationCallback = m;
                            int m2 = Thread$State$EnumUnboxingLocalUtility.m(i10, charValue, 1, charValue);
                            getparamvalue.cleanup = m2;
                            int i16 = (i14 * charValue) + m2;
                            int i17 = getparamvalue.getWarnings;
                            cArr5[i17] = cArr3[(i13 * charValue) + m];
                            cArr5[i17 + 1] = cArr3[i16];
                        } else {
                            int i18 = (i13 * charValue) + i10;
                            int i19 = getparamvalue.getWarnings;
                            cArr5[i19] = cArr3[i18];
                            cArr5[i19 + 1] = cArr3[(i14 * charValue) + i15];
                        }
                    }
                }
                getparamvalue.getWarnings += 2;
            }
        }
        for (int i20 = 0; i20 < i; i20++) {
            cArr5[i20] = (char) (cArr5[i20] ^ 13722);
        }
        objArr[0] = new String(cArr5);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, int i, int i2, Object[] objArr) {
        int i3;
        int i4 = s * 2;
        int i5 = (i * 4) + 4;
        int i6 = 119 - (i2 * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i7 = 0;
            int i8 = i6;
            int i9 = i5;
            int i10 = i9 + 1;
            i6 = i5 + i8;
            i5 = i10;
            bArr = bArr3;
            i3 = i7;
            bArr2[i3] = (byte) i6;
            if (i3 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i11 = i6;
            i9 = i5;
            i5 = bArr[i5];
            i7 = i3 + 1;
            bArr3 = bArr;
            i8 = i11;
            int i102 = i9 + 1;
            i6 = i5 + i8;
            i5 = i102;
            bArr = bArr3;
            i3 = i7;
            bArr2[i3] = (byte) i6;
            if (i3 == i4) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            if (i3 == i4) {
            }
        }
    }

    public static /* synthetic */ Void getWarnings(setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes) {
        getSDKInfo = (getSDKVersion + 61) % 128;
        Void r3 = (Void) ThreeDS2Service(new Object[]{setautosizetexttypeuniformwithpresetsizes}, 848732283, -848732283, System.identityHashCode(setautosizetexttypeuniformwithpresetsizes));
        int i = getSDKVersion + 35;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            return r3;
        }
        throw null;
    }

    public static void init$0() {
        $$a = new byte[]{7, Byte.MAX_VALUE, -125, 18};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a A[RETURN] */
    @Override // com.netcetera.threeds.sdk.infrastructure.setFillViewport
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ThreeDS2ServiceInstance(setOnItemClickListener setonitemclicklistener, String str, String str2, String str3, String str4) {
        setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes;
        int i;
        try {
            setautosizetexttypeuniformwithpresetsizes = this;
            try {
                this.ThreeDS2ServiceInstance.submit(new setTransformationMethod(setautosizetexttypeuniformwithpresetsizes, setonitemclicklistener, str, str2, str3, str4));
            } catch (NullPointerException | RejectedExecutionException e) {
                e = e;
                Throwable th = e;
                Logger logger = setautosizetexttypeuniformwithpresetsizes.ThreeDS2Service;
                Object[] objArr = new Object[1];
                a((byte) (20 - TextUtils.lastIndexOf("", '0', 0, 0)), "\u000b\u0006\u0006\t\u0000\f\b\t\u0007\u000e\t\u0003\u0003\n\u0013\u0016\f\u0016㘎㘎\u000f\t\u0006\t\f\u0005\u000e\u000f\b\n\u0004\u0013\u0005\u0002\u0007\u0000\u0014\u0018\u0007\u0011\u0003\n\u0013\u0016\b\u0002\u0013\f\n\u000e\u0004\u0013", TextUtils.indexOf("", "", 0) + 52, objArr);
                logger.warn(((String) objArr[0]).intern(), th);
                i = getSDKVersion + 69;
                getSDKInfo = i % 128;
                if (i % 2 == 0) {
                }
            }
        } catch (NullPointerException | RejectedExecutionException e2) {
            e = e2;
            setautosizetexttypeuniformwithpresetsizes = this;
        }
        i = getSDKVersion + 69;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFillViewport
    public void get() {
        try {
            this.ThreeDS2ServiceInstance.submit(new setMovementMethod(this));
            getSDKInfo = (getSDKVersion + 125) % 128;
        } catch (NullPointerException | RejectedExecutionException e) {
            Logger logger = this.ThreeDS2Service;
            Object[] objArr = new Object[1];
            a((byte) (21 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), "\u000b\u0006\u0006\t\u0000\f\b\t\u0007\u000e\t\u0003\u0003\n\u0013\u0016\f\u0016㘎㘎\u000f\t\u0006\t\f\u0005\u000e\u000f\b\n\u0004\u0013\u0005\u0002\u0007\u0000\u0014\u0018\u0007\u0011\u0003\n\u0013\u0016\b\u0002\u0013\f\n\u000e\u0004\u0013", TextUtils.indexOf((CharSequence) "", '0', 0) + 53, objArr);
            logger.warn(((String) objArr[0]).intern(), e);
        }
        this.ThreeDS2ServiceInstance.shutdown();
        int i = getSDKInfo + 83;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setFillViewport
    public void initialize(setOnItemClickListener setonitemclicklistener, String str) {
        try {
            this.ThreeDS2ServiceInstance.submit(new setAutoSizeTextTypeWithDefaults(this, setonitemclicklistener, str));
            getSDKInfo = (getSDKVersion + 35) % 128;
        } catch (NullPointerException | RejectedExecutionException e) {
            Logger logger = this.ThreeDS2Service;
            Object[] objArr = new Object[1];
            a((byte) (21 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1))), "\u000b\u0006\u0006\t\u0000\f\b\t\u0007\u000e\t\u0003\u0003\n\u0013\u0016\f\u0016㘎㘎\u000f\t\u0006\t\f\u0005\u000e\u000f\b\n\u0004\u0013\u0005\u0002\u0007\u0000\u0014\u0018\u0007\u0011\u0003\n\u0013\u0016\b\u0002\u0013\f\n\u000e\u0004\u0013", 52 - View.resolveSizeAndState(0, 0, 0), objArr);
            logger.warn(((String) objArr[0]).intern(), e);
        }
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        return get(objArr);
    }

    private /* synthetic */ Void getWarnings(setOnItemClickListener setonitemclicklistener, String str, String str2, String str3, String str4) {
        int i = getSDKVersion + 47;
        getSDKInfo = i % 128;
        int i2 = i % 2;
        setFillViewport setfillviewport = this.getWarnings;
        if (i2 == 0) {
            setfillviewport.ThreeDS2ServiceInstance(setonitemclicklistener, str, str2, str3, str4);
            return null;
        }
        setfillviewport.ThreeDS2ServiceInstance(setonitemclicklistener, str, str2, str3, str4);
        throw null;
    }

    private /* synthetic */ Void ThreeDS2ServiceInstance(setOnItemClickListener setonitemclicklistener, String str) {
        getSDKVersion = (getSDKInfo + 45) % 128;
        this.getWarnings.initialize(setonitemclicklistener, str);
        int i = getSDKVersion + 83;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static setFillViewport ThreeDS2ServiceInstance(setFillViewport setfillviewport) {
        setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes = new setAutoSizeTextTypeUniformWithPresetSizes(Executors.newSingleThreadExecutor(), setfillviewport);
        int i = getSDKVersion + 53;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            return setautosizetexttypeuniformwithpresetsizes;
        }
        throw null;
    }

    public static /* synthetic */ Void ThreeDS2ServiceInstance(setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes, setOnItemClickListener setonitemclicklistener, String str, String str2, String str3, String str4) {
        getSDKVersion = (getSDKInfo + 107) % 128;
        Void warnings = setautosizetexttypeuniformwithpresetsizes.getWarnings(setonitemclicklistener, str, str2, str3, str4);
        int i = getSDKInfo + 5;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            return warnings;
        }
        throw null;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes = (setAutoSizeTextTypeUniformWithPresetSizes) objArr[0];
        int i = getSDKVersion + 67;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            setautosizetexttypeuniformwithpresetsizes.getWarnings.get();
            return null;
        }
        setautosizetexttypeuniformwithpresetsizes.getWarnings.get();
        throw null;
    }
}
