package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Range;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes5.dex */
public class setProgressBackgroundTintBlendMode implements setProgressTintMode {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final String ThreeDS2Service;
    private static int[] ThreeDS2ServiceInitializationCallback;
    private static int getSDKInfo;
    private static int onCompleted;
    private final setIndeterminateTintMode ThreeDS2ServiceInstance;
    private final setHorizontalGravity cleanup;
    private final setOrientation createTransaction;
    private final setProgressTintBlendMode get;
    private final setWeightSum getSDKVersion;
    private final Logger getWarnings = LoggerFactory.getLogger((Class<?>) setProgressBackgroundTintBlendMode.class);
    private final setFindListener initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKInfo = 0;
        onCompleted = 1;
        initialize();
        StringBuilder sb = new StringBuilder();
        try {
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(213700724);
            if (obj == null) {
                obj = ((Class) removeParam.initialize((ViewConfiguration.getKeyRepeatDelay() >> 16) + 60, (char) (47243 - MotionEvent.axisFromString("")), 9222 - (ViewConfiguration.getTapTimeout() >> 16))).getMethod("get", null);
                map.put(213700724, obj);
            }
            sb.append((String) ((Method) obj).invoke(null, null));
            Object[] objArr = new Object[1];
            a(new int[]{281813801, 1486723553, -1350344031, 811548478, 938197132, -1994264050, -613599082, -273209943, 150585937, -1584622414}, KeyEvent.keyCodeFromString("") + 19, objArr);
            sb.append(((String) objArr[0]).intern());
            ThreeDS2Service = sb.toString();
            int i = getSDKInfo + 87;
            onCompleted = i % 128;
            if (i % 2 == 0) {
                int i2 = 19 / 0;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public setProgressBackgroundTintBlendMode(setFindListener setfindlistener, setIndeterminateTintMode setindeterminatetintmode, setProgressTintBlendMode setprogresstintblendmode, setHorizontalGravity sethorizontalgravity, setWeightSum setweightsum, setOrientation setorientation) {
        this.initialize = setfindlistener;
        this.ThreeDS2ServiceInstance = setindeterminatetintmode;
        this.get = setprogresstintblendmode;
        this.cleanup = sethorizontalgravity;
        this.getSDKVersion = setweightsum;
        this.createTransaction = setorientation;
    }

    public static setProgressTintMode ThreeDS2Service(Context context, setIndeterminateTintMode setindeterminatetintmode, setHorizontalGravity sethorizontalgravity, setWeightSum setweightsum) {
        try {
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(1001894213);
            if (obj == null) {
                obj = ((Class) removeParam.initialize(60 - TextUtils.lastIndexOf("", '0'), (char) (11445 - (ViewConfiguration.getScrollBarSize() >> 8)), TextUtils.indexOf((CharSequence) "", '0') + 9365)).getMethod("get", null);
                map.put(1001894213, obj);
            }
            setProgressBackgroundTintBlendMode setprogressbackgroundtintblendmode = new setProgressBackgroundTintBlendMode(((setWebContentsDebuggingEnabled) ((Method) obj).invoke(null, null)).initialize(), setindeterminatetintmode, new setProgressBackgroundTintMode(), sethorizontalgravity, setweightsum, setOrientation.ThreeDS2ServiceInstance(context));
            onCompleted = (getSDKInfo + 3) % 128;
            return setprogressbackgroundtintblendmode;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        char[] cArr;
        int i2;
        int i3;
        int i4;
        Object method;
        int[] iArr2;
        int i5;
        int i6;
        int[] iArr3;
        Object method2;
        int[] iArr4;
        char[] cArr2;
        Object method3;
        int[] iArr5 = iArr;
        createTransaction createtransaction = new createTransaction();
        char[] cArr3 = new char[4];
        char[] cArr4 = new char[iArr5.length * 2];
        int[] iArr6 = ThreeDS2ServiceInitializationCallback;
        Class cls = Integer.TYPE;
        int i7 = 0;
        if (iArr6 != null) {
            i2 = 2;
            int length = iArr6.length;
            int[] iArr7 = new int[length];
            int i8 = 0;
            i3 = 16;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr6[i8])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(2095751688);
                    if (obj != null) {
                        iArr4 = iArr7;
                        method3 = obj;
                        cArr2 = cArr3;
                    } else {
                        iArr4 = iArr7;
                        cArr2 = cArr3;
                        Class cls2 = (Class) removeParam.initialize(Gravity.getAbsoluteGravity(i7, i7) + 64, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), MotionEvent.axisFromString("") + 1198);
                        Object[] objArr3 = new Object[1];
                        b((short) 0, (byte) 0, (short) 0, objArr3);
                        method3 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(2095751688, method3);
                    }
                    iArr4[i8] = ((Integer) ((Method) method3).invoke(null, objArr2)).intValue();
                    i8++;
                    cArr3 = cArr2;
                    iArr7 = iArr4;
                    i7 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr3;
            $11 = ($10 + 91) % 128;
            iArr6 = iArr7;
        } else {
            cArr = cArr3;
            i2 = 2;
            i3 = 16;
        }
        int length2 = iArr6.length;
        int[] iArr8 = new int[length2];
        int[] iArr9 = ThreeDS2ServiceInitializationCallback;
        char c = 3;
        if (iArr9 != null) {
            int i9 = ($10 + 3) % 128;
            $11 = i9;
            int length3 = iArr9.length;
            int[] iArr10 = new int[length3];
            $10 = (i9 + 37) % 128;
            int i10 = 0;
            while (i10 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr9[i10])};
                char c2 = c;
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj2 = map2.get(2095751688);
                if (obj2 != null) {
                    iArr2 = iArr9;
                    i5 = i10;
                    i6 = length3;
                    method2 = obj2;
                    iArr3 = iArr10;
                } else {
                    iArr2 = iArr9;
                    i5 = i10;
                    i6 = length3;
                    iArr3 = iArr10;
                    Class cls3 = (Class) removeParam.initialize((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 64, (char) Color.red(0), 1197 - Drawable.resolveOpacity(0, 0));
                    Object[] objArr5 = new Object[1];
                    b((short) 0, (byte) 0, (short) 0, objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], cls);
                    map2.put(2095751688, method2);
                }
                iArr3[i5] = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                i10 = i5 + 1;
                c = c2;
                iArr10 = iArr3;
                iArr9 = iArr2;
                length3 = i6;
            }
            iArr9 = iArr10;
        }
        char c3 = c;
        System.arraycopy(iArr9, 0, iArr8, 0, length2);
        createtransaction.initialize = 0;
        while (true) {
            int i11 = createtransaction.initialize;
            if (i11 >= iArr5.length) {
                objArr[0] = new String(cArr4, 0, i);
                return;
            }
            $10 = ($11 + 31) % 128;
            int i12 = iArr5[i11];
            char c4 = (char) (i12 >> 16);
            cArr[0] = c4;
            char c5 = (char) i12;
            cArr[1] = c5;
            char c6 = (char) (iArr5[i11 + 1] >> 16);
            cArr[i2] = c6;
            char c7 = (char) iArr5[i11 + 1];
            cArr[c3] = c7;
            createtransaction.getWarnings = (c4 << 16) + c5;
            createtransaction.get = (c6 << 16) + c7;
            createTransaction.ThreeDS2ServiceInstance(iArr8);
            int i13 = 0;
            while (true) {
                i4 = createtransaction.getWarnings;
                if (i13 >= i3) {
                    break;
                }
                int i14 = i4 ^ iArr8[i13];
                createtransaction.getWarnings = i14;
                int ThreeDS2Service2 = createTransaction.ThreeDS2Service(i14);
                Object[] objArr6 = new Object[4];
                objArr6[c3] = createtransaction;
                objArr6[i2] = createtransaction;
                objArr6[1] = Integer.valueOf(ThreeDS2Service2);
                objArr6[0] = createtransaction;
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj3 = map3.get(-411264147);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 48, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 13121 - (ViewConfiguration.getScrollBarSize() >> 8))).getMethod("y", Object.class, cls, Object.class, Object.class);
                    map3.put(-411264147, obj3);
                }
                int intValue = ((Integer) ((Method) obj3).invoke(null, objArr6)).intValue();
                createtransaction.getWarnings = createtransaction.get;
                createtransaction.get = intValue;
                i13++;
                $10 = ($11 + 107) % 128;
                i3 = 16;
            }
            int i15 = createtransaction.get;
            createtransaction.getWarnings = i15;
            createtransaction.get = i4;
            i3 = 16;
            int i16 = i4 ^ iArr8[16];
            createtransaction.get = i16;
            int i17 = i15 ^ iArr8[17];
            createtransaction.getWarnings = i17;
            cArr[0] = (char) (i17 >>> 16);
            cArr[1] = (char) i17;
            cArr[i2] = (char) (i16 >>> 16);
            cArr[c3] = (char) i16;
            createTransaction.ThreeDS2ServiceInstance(iArr8);
            int i18 = createtransaction.initialize;
            cArr4[i18 * 2] = cArr[0];
            cArr4[(i18 * 2) + 1] = cArr[1];
            cArr4[(i18 * 2) + 2] = cArr[i2];
            cArr4[(i18 * 2) + 3] = cArr[c3];
            Object[] objArr7 = new Object[i2];
            objArr7[1] = createtransaction;
            objArr7[0] = createtransaction;
            Map map4 = removeParam.visaSchemeConfiguration;
            Object obj4 = map4.get(-1870831722);
            if (obj4 != null) {
                method = obj4;
            } else {
                Class cls4 = (Class) removeParam.initialize(View.MeasureSpec.makeMeasureSpec(0, 0) + 99, (char) TextUtils.indexOf("", ""), 1879 - ExpandableListView.getPackedPositionChild(0L));
                byte b = (byte) ($$b & 7);
                byte b2 = (byte) (b - 1);
                Object[] objArr8 = new Object[1];
                b(b, b2, b2, objArr8);
                method = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                map4.put(-1870831722, method);
            }
            ((Method) method).invoke(null, objArr7);
            iArr5 = iArr;
            i2 = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, byte b, short s2, Object[] objArr) {
        int i;
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = 4 - (b * 3);
        int i5 = (s2 * 3) + 1;
        int i6 = (s * 5) + 113;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            i3 = 0;
            int i7 = i4;
            i4 += -i6;
            i = i7 + 1;
            bArr = bArr3;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i];
            byte[] bArr4 = bArr;
            i7 = i;
            i6 = b2;
            bArr3 = bArr4;
            i4 += -i6;
            i = i7 + 1;
            bArr = bArr3;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i4 = i6;
            i = i4;
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    private void get(setInitialScale setinitialscale, List<setProgressBackgroundTintList> list, boolean z) {
        setIndeterminateTintMode setindeterminatetintmode;
        int i = getSDKInfo + 31;
        onCompleted = i % 128;
        try {
            if (i % 2 == 0) {
                TextUtils.getOffsetAfter("", 0);
                getWarnings(setinitialscale.ThreeDS2ServiceInstance());
                setindeterminatetintmode = this.ThreeDS2ServiceInstance;
            } else {
                TextUtils.getOffsetAfter("", 0);
                getWarnings(setinitialscale.ThreeDS2ServiceInstance());
                setindeterminatetintmode = this.ThreeDS2ServiceInstance;
            }
            setindeterminatetintmode.getWarnings(list);
            ViewConfiguration.getZoomControlsTimeout();
        } catch (setScrollCaptureCallback e) {
            if (!z || !((Boolean) ThreeDS2ServiceInstance(new Object[]{this, e}, 1072555163, -1072555163, System.identityHashCode(this))).booleanValue()) {
                this.ThreeDS2ServiceInstance.initialize(list);
                return;
            }
            int i2 = onCompleted + 63;
            getSDKInfo = i2 % 128;
            int i3 = i2 % 2;
            get(setinitialscale.get(), list, false);
            getSDKInfo = (onCompleted + 83) % 128;
        }
    }

    private void getWarnings(setSafeBrowsingWhitelist setsafebrowsingwhitelist) {
        getSDKInfo = (onCompleted + 29) % 128;
        if (!setsafebrowsingwhitelist.getWarnings()) {
            if (!setRendererPriorityPolicy.get.contains((Range<Integer>) Integer.valueOf(setsafebrowsingwhitelist.ThreeDS2ServiceInstance()))) {
                throw setTextAlignment.onCompleted.initialize(Integer.valueOf(setsafebrowsingwhitelist.ThreeDS2ServiceInstance()));
            }
            throw setTextAlignment.createTransaction.initialize(Integer.valueOf(setsafebrowsingwhitelist.ThreeDS2ServiceInstance()));
        }
        int i = onCompleted + 111;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static void init$0() {
        $$a = new byte[]{89, -70, 116, 31};
        $$b = 81;
    }

    public static void initialize() {
        ThreeDS2ServiceInitializationCallback = new int[]{-52177966, -1297010710, 1911245587, 2004967179, 1693949576, 2051419336, 2141528604, 583713036, 1795997313, -837008009, 454024916, -323165658, -1514565043, -296928392, -1791300572, 1592199622, 1075076659, -447626518};
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProgressTintMode
    public void ThreeDS2ServiceInstance() {
        List<setProgressBackgroundTintList> ThreeDS2ServiceInstance = this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance();
        if (ThreeDS2ServiceInstance.isEmpty()) {
            return;
        }
        int i = onCompleted + 79;
        getSDKInfo = i % 128;
        int i2 = i % 2;
        setHorizontalGravity sethorizontalgravity = this.cleanup;
        if (i2 != 0) {
            sethorizontalgravity.get();
            throw null;
        }
        if (sethorizontalgravity.get()) {
            return;
        }
        if (!this.getSDKVersion.ThreeDS2ServiceInstance().ThreeDS2Service().booleanValue()) {
            this.ThreeDS2ServiceInstance.getWarnings(ThreeDS2ServiceInstance);
        } else {
            onCompleted = (getSDKInfo + 29) % 128;
            get(ThreeDS2Service(ThreeDS2ServiceInstance), ThreeDS2ServiceInstance, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r1.getWarnings() == com.netcetera.threeds.sdk.infrastructure.setTextAlignment.createTransaction) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
        boolean z = false;
        setScrollCaptureCallback setscrollcapturecallback = (setScrollCaptureCallback) objArr[1];
        if (setscrollcapturecallback.getWarnings() != setTextAlignment.ThreeDS2ServiceInitializationCallback) {
            getSDKInfo = (onCompleted + 7) % 128;
        }
        onCompleted = (getSDKInfo + 87) % 128;
        z = true;
        return Boolean.valueOf(z);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProgressTintMode
    public void getWarnings() {
        onCompleted = (getSDKInfo + 23) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProgressTintMode
    public void ThreeDS2Service(setProgressBackgroundTintList setprogressbackgroundtintlist) {
        getSDKInfo = (onCompleted + 109) % 128;
        if (this.getSDKVersion.ThreeDS2ServiceInstance().ThreeDS2Service().booleanValue()) {
            onCompleted = (getSDKInfo + 13) % 128;
            List<setProgressBackgroundTintList> singletonList = Collections.singletonList(setprogressbackgroundtintlist);
            if (this.cleanup.get()) {
                onCompleted = (getSDKInfo + 47) % 128;
                this.ThreeDS2ServiceInstance.initialize(singletonList);
            } else {
                get(ThreeDS2Service(singletonList), singletonList, true);
            }
        }
    }

    private setInitialScale ThreeDS2Service(List<setProgressBackgroundTintList> list) {
        onCompleted = (getSDKInfo + 19) % 128;
        String str = this.get.get(list);
        setFindListener setfindlistener = this.initialize;
        String str2 = ThreeDS2Service;
        Object[] objArr = new Object[1];
        a(new int[]{-363295646, -964202133, -243113486, 347376133, -713320070, -1450411712, 2111313485, 1215897712}, 16 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr);
        setInitialScale ThreeDS2ServiceInstance = setfindlistener.ThreeDS2ServiceInstance(str2, str, ((String) objArr[0]).intern(), this.createTransaction.ThreeDS2Service());
        onCompleted = (getSDKInfo + 59) % 128;
        return ThreeDS2ServiceInstance;
    }
}
