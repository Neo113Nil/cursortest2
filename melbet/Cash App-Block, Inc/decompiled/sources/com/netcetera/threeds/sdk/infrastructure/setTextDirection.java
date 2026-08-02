package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.netcetera.threeds.sdk.infrastructure.jj;
import com.netcetera.threeds.sdk.infrastructure.setRenderEffect;
import com.plaid.internal.EnumC0170g;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes5.dex */
public class setTextDirection {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2ServiceInitializationCallback;
    private static int cleanup;
    private static char[] createTransaction;
    private static char getSDKVersion;
    private final setSpannableFactory ThreeDS2Service;
    private final no ThreeDS2ServiceInstance = (no) nu.initialize(new Object[]{setTextDirection.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private final Resources get;
    private final Object getSDKInfo;
    private final setFocusedSearchResultHighlightColor getWarnings;
    private final ExecutorService initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ThreeDS2ServiceInitializationCallback = 0;
        cleanup = 1;
        createTransaction = new char[]{37912, 37913, 37901, 37903, 37915, 37972, 37917, 37902, 37908, 37918, 38880, 37896, 37910, 37945, 37914, 37890, 37911, 37919, 37909, 37978, 37907, 38881, 37916, 37897, 37983};
        getSDKVersion = (char) 41445;
    }

    public setTextDirection(Resources resources, setFocusedSearchResultHighlightColor setfocusedsearchresulthighlightcolor, setSpannableFactory setspannablefactory, ExecutorService executorService, Object obj) {
        this.get = resources;
        this.getWarnings = setfocusedsearchresulthighlightcolor;
        this.ThreeDS2Service = setspannablefactory;
        this.initialize = executorService;
        this.getSDKInfo = obj;
    }

    private static void a(byte b, String str, int i, Object[] objArr) {
        char[] cArr;
        int i2;
        char c;
        char c2;
        char c3;
        Object method;
        int length;
        char[] cArr2;
        int i3;
        char[] cArr3;
        Object method2;
        if (str != null) {
            cArr = str.toCharArray();
            $11 = ($10 + 81) % 128;
        } else {
            cArr = str;
        }
        char[] cArr4 = cArr;
        getParamValue getparamvalue = new getParamValue();
        char[] cArr5 = createTransaction;
        Class cls = Integer.TYPE;
        char c4 = 2;
        if (cArr5 != null) {
            int i4 = $10 + 85;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                length = cArr5.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr5.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr5[i3])};
                    char c5 = c4;
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-78420608);
                    if (obj != null) {
                        cArr3 = cArr4;
                        method2 = obj;
                    } else {
                        Class cls2 = (Class) removeParam.initialize((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 93, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 1559 - Color.alpha(0));
                        Object[] objArr3 = new Object[1];
                        cArr3 = cArr4;
                        b((short) 0, (short) 1, 0, objArr3);
                        method2 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(-78420608, method2);
                    }
                    cArr2[i3] = ((Character) ((Method) method2).invoke(null, objArr2)).charValue();
                    i3++;
                    $10 = ($11 + 59) % 128;
                    c4 = c5;
                    cArr4 = cArr3;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr5 = cArr2;
        }
        char[] cArr6 = cArr4;
        char c6 = c4;
        Object[] objArr4 = {Integer.valueOf(getSDKVersion)};
        Map map2 = removeParam.visaSchemeConfiguration;
        Object obj2 = map2.get(-78420608);
        if (obj2 == null) {
            Class cls3 = (Class) removeParam.initialize(Color.red(0) + 94, (char) ((-16777216) - Color.rgb(0, 0, 0)), 1559 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
            Object[] objArr5 = new Object[1];
            b((short) 0, (short) 1, 0, objArr5);
            obj2 = cls3.getMethod((String) objArr5[0], cls);
            map2.put(-78420608, obj2);
        }
        char charValue = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr7 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr7[i2] = (char) (cArr6[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i5 = $11 + 11;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                getparamvalue.getWarnings = 1;
            } else {
                getparamvalue.getWarnings = 0;
            }
            while (true) {
                int i6 = getparamvalue.getWarnings;
                if (i6 >= i2) {
                    break;
                }
                char c7 = cArr6[i6];
                getparamvalue.get = c7;
                char c8 = cArr6[i6 + 1];
                getparamvalue.initialize = c8;
                if (c7 == c8) {
                    cArr7[i6] = (char) (c7 - b);
                    cArr7[i6 + 1] = (char) (c8 - b);
                } else {
                    Object[] objArr6 = new Object[13];
                    objArr6[12] = getparamvalue;
                    objArr6[11] = Integer.valueOf(charValue);
                    objArr6[10] = getparamvalue;
                    objArr6[9] = getparamvalue;
                    objArr6[8] = Integer.valueOf(charValue);
                    objArr6[7] = getparamvalue;
                    objArr6[6] = getparamvalue;
                    objArr6[5] = Integer.valueOf(charValue);
                    objArr6[4] = getparamvalue;
                    objArr6[3] = getparamvalue;
                    objArr6[c6] = Integer.valueOf(charValue);
                    objArr6[1] = getparamvalue;
                    objArr6[0] = getparamvalue;
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(-1395483366);
                    if (obj3 != null) {
                        c = 7;
                        c3 = 6;
                        method = obj3;
                        c2 = '\b';
                    } else {
                        c = 7;
                        c2 = '\b';
                        c3 = 6;
                        Class cls4 = (Class) removeParam.initialize((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 48, (char) View.combineMeasuredStates(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 3221);
                        Object[] objArr7 = new Object[1];
                        b((short) 0, (short) 0, 0, objArr7);
                        String str2 = (String) objArr7[0];
                        Class cls5 = Integer.TYPE;
                        method = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                        map3.put(-1395483366, method);
                    }
                    int intValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                    int i7 = getparamvalue.cleanup;
                    if (intValue == i7) {
                        Object[] objArr8 = new Object[11];
                        objArr8[10] = getparamvalue;
                        objArr8[9] = Integer.valueOf(charValue);
                        objArr8[c2] = getparamvalue;
                        objArr8[c] = Integer.valueOf(charValue);
                        objArr8[c3] = Integer.valueOf(charValue);
                        objArr8[5] = getparamvalue;
                        objArr8[4] = getparamvalue;
                        objArr8[3] = Integer.valueOf(charValue);
                        objArr8[c6] = Integer.valueOf(charValue);
                        objArr8[1] = getparamvalue;
                        objArr8[0] = getparamvalue;
                        Object obj4 = map3.get(1507360409);
                        if (obj4 == null) {
                            Class cls6 = (Class) removeParam.initialize(47 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (25643 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), View.MeasureSpec.getSize(0) + 11489);
                            Class cls7 = Integer.TYPE;
                            obj4 = cls6.getMethod("x", Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                            map3.put(1507360409, obj4);
                        }
                        int intValue2 = ((Integer) ((Method) obj4).invoke(null, objArr8)).intValue();
                        int i8 = (getparamvalue.ThreeDS2ServiceInstance * charValue) + getparamvalue.cleanup;
                        int i9 = getparamvalue.getWarnings;
                        cArr7[i9] = cArr5[intValue2];
                        cArr7[i9 + 1] = cArr5[i8];
                    } else {
                        int i10 = getparamvalue.ThreeDS2Service;
                        int i11 = getparamvalue.ThreeDS2ServiceInstance;
                        if (i10 == i11) {
                            $10 = ($11 + 125) % 128;
                            int m = Thread$State$EnumUnboxingLocalUtility.m(getparamvalue.ThreeDS2ServiceInitializationCallback, charValue, 1, charValue);
                            getparamvalue.ThreeDS2ServiceInitializationCallback = m;
                            int m2 = Thread$State$EnumUnboxingLocalUtility.m(i7, charValue, 1, charValue);
                            getparamvalue.cleanup = m2;
                            int i12 = (i10 * charValue) + m;
                            int i13 = getparamvalue.getWarnings;
                            cArr7[i13] = cArr5[i12];
                            cArr7[i13 + 1] = cArr5[(i11 * charValue) + m2];
                        } else {
                            int i14 = (i11 * charValue) + getparamvalue.ThreeDS2ServiceInitializationCallback;
                            int i15 = getparamvalue.getWarnings;
                            cArr7[i15] = cArr5[(i10 * charValue) + i7];
                            cArr7[i15 + 1] = cArr5[i14];
                            getparamvalue.getWarnings += 2;
                        }
                    }
                }
                getparamvalue.getWarnings += 2;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr7[i16] = (char) (cArr7[i16] ^ 13722);
        }
        objArr[0] = new String(cArr7);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, int i, Object[] objArr) {
        int i2;
        int i3 = 1 - (i * 3);
        int i4 = (s2 * 2) + 117;
        byte[] bArr = $$a;
        int i5 = (s * 3) + 4;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i5;
            int i7 = i3;
            i2 = 0;
            int i8 = i6 + 1;
            i4 = i5 + (-i7);
            i5 = i8;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i5];
            int i9 = i4;
            i6 = i5;
            i5 = i9;
            int i82 = i6 + 1;
            i4 = i5 + (-i7);
            i5 = i82;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            i2++;
            if (i2 == i3) {
            }
        }
    }

    private void get(String str, jj.initialize initializeVar) {
        if (oj.initialize(str)) {
            Object obj = this.getSDKInfo;
            try {
                Object[] objArr = {str};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj2 = map.get(74561564);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0') + 49, (char) (ImageFormat.getBitsPerPixel(0) + 37871), View.resolveSizeAndState(0, 0, 0) + 11680)).getMethod("get", String.class);
                    map.put(74561564, obj2);
                }
                if (((Boolean) ((Method) obj2).invoke(obj, objArr)).booleanValue()) {
                    cleanup = (ThreeDS2ServiceInitializationCallback + 99) % 128;
                    BitmapDrawable p_ = p_(str);
                    if (og.getWarnings(p_)) {
                        cleanup = (ThreeDS2ServiceInitializationCallback + 125) % 128;
                        initializeVar.bB_(p_);
                    }
                }
                get(new Object[]{this, str, initializeVar}, 758820281, -758820281, System.identityHashCode(this));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.og.getWarnings(r6) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getWarnings(Integer num, jj.initialize initializeVar) {
        int i = ThreeDS2ServiceInitializationCallback + 115;
        cleanup = i % 128;
        try {
            if (i % 2 == 0) {
                Object[] objArr = new Object[0];
                objArr[0] = num;
                if (og.getWarnings(objArr)) {
                    Drawable drawable = this.get.getDrawable(num.intValue(), null);
                    if (og.getWarnings(drawable)) {
                        initializeVar.bB_(drawable);
                    }
                }
                cleanup = (ThreeDS2ServiceInitializationCallback + 121) % 128;
                return;
            }
        } catch (Exception e) {
            no noVar = this.ThreeDS2ServiceInstance;
            Object[] objArr2 = new Object[1];
            a((byte) (30 - TextUtils.indexOf((CharSequence) "", '0', 0)), "\u0012\u0017\u0002\r\u000e\u0018\r\u0017\t\u0011\u0012\u0010\u0006\f\u0000\u0002\t\u0011\u0006\u000e\u0000\u0003\u0000\u0001\u0011\u0016\u0010\u000e\u0012\u0016\u0017\b\u0010\u0006\u0012\u000f\u0015\f\u0013\u0011\u000f\u0018\u000e\u0018\u0014\u0018㗓", (ViewConfiguration.getTapTimeout() >> 16) + 47, objArr2);
            noVar.ThreeDS2ServiceInstance(String.format(((String) objArr2[0]).intern(), num), e);
        }
        no noVar2 = this.ThreeDS2ServiceInstance;
        Object[] objArr22 = new Object[1];
        a((byte) (30 - TextUtils.indexOf((CharSequence) "", '0', 0)), "\u0012\u0017\u0002\r\u000e\u0018\r\u0017\t\u0011\u0012\u0010\u0006\f\u0000\u0002\t\u0011\u0006\u000e\u0000\u0003\u0000\u0001\u0011\u0016\u0010\u000e\u0012\u0016\u0017\b\u0010\u0006\u0012\u000f\u0015\f\u0013\u0011\u000f\u0018\u000e\u0018\u0014\u0018㗓", (ViewConfiguration.getTapTimeout() >> 16) + 47, objArr22);
        noVar2.ThreeDS2ServiceInstance(String.format(((String) objArr22[0]).intern(), num), e);
    }

    public static void init$0() {
        $$a = new byte[]{11, 115, 115, -11};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE;
    }

    public static setTextDirection initialize(Context context) {
        Resources resources = context.getResources();
        try {
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(1001894213);
            if (obj == null) {
                obj = ((Class) removeParam.initialize(Gravity.getAbsoluteGravity(0, 0) + 61, (char) (11444 - ImageFormat.getBitsPerPixel(0)), 9364 - Color.alpha(0))).getMethod("get", null);
                map.put(1001894213, obj);
            }
            setFocusedSearchResultHighlightColor ThreeDS2Service = setTextKeepState.ThreeDS2Service((setWebContentsDebuggingEnabled) ((Method) obj).invoke(null, null));
            setSpannableFactory setspannablefactory = new setSpannableFactory();
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            Object[] objArr = {context};
            Object obj2 = map.get(-1029982151);
            if (obj2 == null) {
                obj2 = ((Class) removeParam.initialize(50 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) Color.blue(0), 11728 - TextUtils.indexOf("", ""))).getMethod("ThreeDS2ServiceInstance", Context.class);
                map.put(-1029982151, obj2);
            }
            setTextDirection settextdirection = new setTextDirection(resources, ThreeDS2Service, setspannablefactory, newSingleThreadExecutor, ((Method) obj2).invoke(null, objArr));
            int i = ThreeDS2ServiceInitializationCallback + 7;
            cleanup = i % 128;
            if (i % 2 == 0) {
                int i2 = 34 / 0;
            }
            return settextdirection;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private void o_(String str, Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String initialize = op.initialize(byteArrayOutputStream.toByteArray());
        Object obj = this.getSDKInfo;
        try {
            Object[] objArr = {str, initialize};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj2 = map.get(-1392497171);
            if (obj2 == null) {
                obj2 = ((Class) removeParam.initialize((ViewConfiguration.getTouchSlop() >> 8) + 48, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 37870), 11680 - TextUtils.getOffsetBefore("", 0))).getMethod("ThreeDS2ServiceInstance", String.class, String.class);
                map.put(-1392497171, obj2);
            }
            ((Method) obj2).invoke(obj, objArr);
            int i = cleanup + 103;
            ThreeDS2ServiceInitializationCallback = i % 128;
            if (i % 2 != 0) {
                int i2 = 11 / 0;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private BitmapDrawable p_(String str) {
        cleanup = (ThreeDS2ServiceInitializationCallback + 117) % 128;
        Object obj = this.getSDKInfo;
        try {
            Object[] objArr = {str, ""};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj2 = map.get(861263582);
            if (obj2 == null) {
                obj2 = ((Class) removeParam.initialize(47 - TextUtils.lastIndexOf("", '0', 0, 0), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 37870), 11681 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).getMethod("get", String.class, String.class);
                map.put(861263582, obj2);
            }
            String str2 = (String) ((Method) obj2).invoke(obj, objArr);
            if (oj.initialize(str2)) {
                return new BitmapDrawable(this.get, this.ThreeDS2Service.x_(op.getWarnings(str2)));
            }
            cleanup = (ThreeDS2ServiceInitializationCallback + 91) % 128;
            return null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public void ThreeDS2Service(setRenderEffect setrendereffect, jj.initialize initializeVar) {
        setRenderEffect.initialize initialize = setrendereffect.initialize();
        if (initialize.ThreeDS2Service().equals(setRenderEffect.ThreeDS2Service.get)) {
            int i = ThreeDS2ServiceInitializationCallback + 113;
            cleanup = i % 128;
            if (i % 2 != 0) {
                getWarnings(initialize.ThreeDS2ServiceInstance(), initializeVar);
                return;
            } else {
                getWarnings(initialize.ThreeDS2ServiceInstance(), initializeVar);
                int i2 = 76 / 0;
                return;
            }
        }
        if (initialize.ThreeDS2Service().equals(setRenderEffect.ThreeDS2Service.ThreeDS2Service)) {
            int i3 = cleanup + 77;
            ThreeDS2ServiceInitializationCallback = i3 % 128;
            if (i3 % 2 == 0) {
                get(initialize.initialize(), initializeVar);
            } else {
                get(initialize.initialize(), initializeVar);
                int i4 = 54 / 0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        o_(r4, r0);
        r5.bB_(new android.graphics.drawable.BitmapDrawable(r3.get, r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.og.getWarnings(r0) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.og.getWarnings(r2) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private /* synthetic */ Void ThreeDS2Service(String str, jj.initialize initializeVar) {
        Bitmap y_;
        int i = ThreeDS2ServiceInitializationCallback + 5;
        cleanup = i % 128;
        int i2 = i % 2;
        setFocusedSearchResultHighlightColor setfocusedsearchresulthighlightcolor = this.getWarnings;
        if (i2 == 0) {
            y_ = setfocusedsearchresulthighlightcolor.y_(str, true);
            Object[] objArr = new Object[0];
            objArr[0] = y_;
        } else {
            y_ = setfocusedsearchresulthighlightcolor.y_(str, true);
        }
        int i3 = ThreeDS2ServiceInitializationCallback + 93;
        cleanup = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        setTextDirection settextdirection = (setTextDirection) objArr[0];
        settextdirection.initialize.submit(new setOverScrollMode(settextdirection, (String) objArr[1], (jj.initialize) objArr[2]));
        ThreeDS2ServiceInitializationCallback = (cleanup + 51) % 128;
        return null;
    }

    public static /* synthetic */ Void initialize(setTextDirection settextdirection, String str, jj.initialize initializeVar) {
        ThreeDS2ServiceInitializationCallback = (cleanup + 119) % 128;
        Void ThreeDS2Service = settextdirection.ThreeDS2Service(str, initializeVar);
        int i = cleanup + 81;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 == 0) {
            return ThreeDS2Service;
        }
        throw null;
    }
}
