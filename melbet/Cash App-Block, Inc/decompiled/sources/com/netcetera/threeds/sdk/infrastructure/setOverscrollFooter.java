package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes5.dex */
public class setOverscrollFooter implements setMinHeight {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ThreeDS2Service = 898634101;
    private static int cleanup = 1;
    private static char createTransaction = 34188;
    private static int getSDKInfo = 0;
    private static long initialize = -8880716800597159563L;
    private final setMinHeight ThreeDS2ServiceInstance;
    private final no get = (no) nu.initialize(new Object[]{setOverscrollFooter.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private final Executor getWarnings;

    public setOverscrollFooter(Executor executor, setMinHeight setminheight) {
        this.getWarnings = executor;
        this.ThreeDS2ServiceInstance = setminheight;
    }

    private /* synthetic */ void ThreeDS2ServiceInstance(setOnItemClickListener setonitemclicklistener, String str) {
        int i = getSDKInfo + 19;
        cleanup = i % 128;
        int i2 = i % 2;
        setMinHeight setminheight = this.ThreeDS2ServiceInstance;
        try {
            if (i2 == 0) {
                setminheight.initialize(setonitemclicklistener, str);
                throw null;
            }
            setminheight.initialize(setonitemclicklistener, str);
            getSDKInfo = (cleanup + 51) % 128;
        } catch (setScrollCaptureCallback e) {
            no noVar = this.get;
            Object[] objArr = new Object[1];
            a("\u0000\u0000\u0000\u0000", Color.red(0), (char) (57408 - (ViewConfiguration.getJumpTapTimeout() >> 16)), "꠆㼒蜱ਹ\ue675䐱밲媗昧쫔虊뎈⏘䜗㑺ຈ㱃⡙딫붔塈坭［恈㨪\u0095鸰甮亴펅밨䇓⚧ᦈ爇誰Χ⨝\ue588∳⏓摔ᢰ䝍冟핽ᗦ뫞뻯촕뢋髕틝ՠ纏檲\ud942䘆", "᧙릗䀮᳠", objArr);
            noVar.ThreeDS2ServiceInstance(((String) objArr[0]).intern(), e.getWarnings());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(String str, int i, char c, String str2, String str3, Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char[] cArr3;
        float f;
        int i2;
        char c2;
        Integer num;
        int i3;
        int i4;
        int i5;
        char[] cArr4;
        Integer num2 = 246986610;
        Integer num3 = -258783473;
        int i6 = 2;
        int i7 = 0;
        if (str3 != null) {
            int i8 = $11 + 59;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr = str3.toCharArray();
                int i9 = 60 / 0;
            } else {
                cArr = str3.toCharArray();
            }
        } else {
            cArr = str3;
        }
        char[] cArr5 = cArr;
        if (str2 != 0) {
            $10 = ($11 + 13) % 128;
            cArr2 = str2.toCharArray();
        } else {
            cArr2 = str2;
        }
        char[] cArr6 = cArr2;
        if (str != null) {
            $11 = ($10 + 115) % 128;
            cArr3 = str.toCharArray();
            $11 = ($10 + 23) % 128;
        } else {
            cArr3 = str;
        }
        char[] cArr7 = cArr3;
        ConfigParameters configParameters = new ConfigParameters();
        int length = cArr5.length;
        char[] cArr8 = new char[length];
        int length2 = cArr7.length;
        char[] cArr9 = new char[length2];
        System.arraycopy(cArr5, 0, cArr8, 0, length);
        System.arraycopy(cArr7, 0, cArr9, 0, length2);
        cArr8[0] = (char) (cArr8[0] ^ c);
        cArr9[2] = (char) (cArr9[2] + ((char) i));
        int length3 = cArr6.length;
        char[] cArr10 = new char[length3];
        configParameters.initialize = 0;
        $11 = ($10 + 113) % 128;
        while (configParameters.initialize < length3) {
            $10 = ($11 + 81) % 128;
            try {
                Object[] objArr2 = {configParameters};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(num3);
                int i10 = i6;
                if (obj != null) {
                    f = 0.0f;
                    i2 = i7;
                } else {
                    f = 0.0f;
                    i2 = i7;
                    obj = ((Class) removeParam.initialize(57 - ImageFormat.getBitsPerPixel(i7), (char) (TypedValue.complexToFraction(i7, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(i7, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6414)).getMethod("j", Object.class);
                    map.put(num3, obj);
                }
                int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {configParameters};
                Object obj2 = map.get(num2);
                if (obj2 != null) {
                    num = num3;
                    c2 = '0';
                } else {
                    c2 = '0';
                    num = num3;
                    obj2 = ((Class) removeParam.initialize((ViewConfiguration.getFadingEdgeLength() >> 16) + 63, (char) (11393 - AndroidCharacter.getMirror('0')), 8578 - (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)))).getMethod("i", Object.class);
                    map.put(num2, obj2);
                }
                int intValue2 = ((Integer) ((Method) obj2).invoke(null, objArr3)).intValue();
                int i11 = cArr8[configParameters.initialize % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i10] = Integer.valueOf(cArr9[intValue]);
                objArr4[1] = Integer.valueOf(i11);
                objArr4[i2] = configParameters;
                Object obj3 = map.get(828230935);
                Class cls = Integer.TYPE;
                Integer num4 = num2;
                if (obj3 != null) {
                    i3 = intValue2;
                    i4 = intValue;
                    i5 = length3;
                    cArr4 = cArr6;
                } else {
                    int i12 = i2;
                    i3 = intValue2;
                    i4 = intValue;
                    char c3 = c2;
                    i5 = length3;
                    cArr4 = cArr6;
                    obj3 = ((Class) removeParam.initialize(74 - TextUtils.getCapsMode("", i12, i12), (char) ((-1) - TextUtils.indexOf("", c3, i12)), TextUtils.indexOf("", c3, i12, i12) + 9821)).getMethod("o", Object.class, cls, cls);
                    map.put(828230935, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
                int i13 = cArr8[i3] * 32718;
                Object[] objArr5 = new Object[i10];
                objArr5[1] = Integer.valueOf(cArr9[i4]);
                objArr5[0] = Integer.valueOf(i13);
                Object obj4 = map.get(196637707);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize(48 - TextUtils.indexOf("", ""), (char) (63349 - TextUtils.indexOf((CharSequence) "", '0')), 11536 - TextUtils.getOffsetBefore("", 0))).getMethod("n", cls, cls);
                    map.put(196637707, obj4);
                }
                cArr9[i3] = ((Character) ((Method) obj4).invoke(null, objArr5)).charValue();
                cArr8[i3] = configParameters.get;
                int i14 = configParameters.initialize;
                cArr10[i14] = (char) ((((r2 ^ cArr4[i14]) ^ (initialize ^ (-8880716800597159563L))) ^ ((int) (ThreeDS2Service ^ (-8880716800597159563L)))) ^ ((char) (createTransaction ^ (-8880716800597159563L))));
                configParameters.initialize = i14 + 1;
                i6 = i10;
                num2 = num4;
                num3 = num;
                length3 = i5;
                cArr6 = cArr4;
                i7 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr10);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setMinHeight
    public void initialize(setOnItemClickListener setonitemclicklistener, String str) {
        this.getWarnings.execute(new setIndeterminate(this, setonitemclicklistener, str));
        cleanup = (getSDKInfo + 1) % 128;
    }

    public static setMinHeight ThreeDS2ServiceInstance(setMinHeight setminheight) {
        setOverscrollFooter setoverscrollfooter = new setOverscrollFooter(Executors.newSingleThreadExecutor(), setminheight);
        getSDKInfo = (cleanup + 21) % 128;
        return setoverscrollfooter;
    }

    public static /* synthetic */ void ThreeDS2ServiceInstance(setOverscrollFooter setoverscrollfooter, setOnItemClickListener setonitemclicklistener, String str) {
        cleanup = (getSDKInfo + 27) % 128;
        setoverscrollfooter.ThreeDS2ServiceInstance(setonitemclicklistener, str);
        getSDKInfo = (cleanup + 53) % 128;
    }
}
