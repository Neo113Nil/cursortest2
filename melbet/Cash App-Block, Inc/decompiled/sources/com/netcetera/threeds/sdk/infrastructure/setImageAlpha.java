package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class setImageAlpha {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final setImageAlpha ThreeDS2Service;
    private static int ThreeDS2ServiceInitializationCallback = 0;
    private static int ThreeDS2ServiceInstance = 0;
    private static int getSDKInfo = 1;
    public static final setImageAlpha getWarnings;
    private static final /* synthetic */ setImageAlpha[] initialize;
    private final String get;

    static {
        initialize();
        Object[] objArr = new Object[1];
        a(false, TextUtils.lastIndexOf("", '0') + 5, 10 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\u0007￼\u0002\u0001\u0003\u0005\u0002\ufff7\b\ufff6", 167 - Gravity.getAbsoluteGravity(0, 0), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(true, (-16777215) - Color.rgb(0, 0, 0), 4 - KeyEvent.keyCodeFromString(""), "\u0003\ufff7\u0002\u0005", 167 - View.resolveSize(0, 0), objArr2);
        ThreeDS2Service = new setImageAlpha(intern, 0, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        a(true, 6 - (ViewConfiguration.getEdgeSlop() >> 16), 7 - Color.red(0), "\ufff7\ufffb\b\ufff7\u0004\u0002\t", 216 - AndroidCharacter.getMirror('0'), objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a(true, 1 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), 5 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), "\u0001\u0007\ufff6\u0003", TextUtils.indexOf("", "") + EnumC0170g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, objArr4);
        getWarnings = new setImageAlpha(intern2, 1, ((String) objArr4[0]).intern());
        initialize = ThreeDS2ServiceInstance();
        int i = ThreeDS2ServiceInitializationCallback + 121;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            int i2 = 70 / 0;
        }
    }

    private setImageAlpha(String str, int i, String str2) {
        this.get = str2;
    }

    public static setImageAlpha ThreeDS2Service(String str) {
        int i = ThreeDS2ServiceInitializationCallback + 121;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            oj.get(ThreeDS2Service.getWarnings(), str);
            throw null;
        }
        setImageAlpha setimagealpha = ThreeDS2Service;
        if (!oj.get(setimagealpha.getWarnings(), str)) {
            setimagealpha = getWarnings;
        }
        getSDKInfo = (ThreeDS2ServiceInitializationCallback + 65) % 128;
        return setimagealpha;
    }

    private static /* synthetic */ setImageAlpha[] ThreeDS2ServiceInstance() {
        int i = getSDKInfo + 117;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 == 0) {
            return new setImageAlpha[]{ThreeDS2Service, getWarnings};
        }
        setImageAlpha[] setimagealphaArr = new setImageAlpha[4];
        setimagealphaArr[0] = ThreeDS2Service;
        setimagealphaArr[1] = getWarnings;
        return setimagealphaArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(boolean z, int i, int i2, String str, int i3, Object[] objArr) {
        int i4;
        Throwable cause;
        int i5;
        char[] charArray = str != null ? str.toCharArray() : str;
        getSDKInfo getsdkinfo = new getSDKInfo();
        char[] cArr = new char[i2];
        int i6 = 0;
        getsdkinfo.getWarnings = 0;
        while (true) {
            int i7 = getsdkinfo.getWarnings;
            if (i7 >= i2) {
                break;
            }
            $11 = ($10 + 67) % 128;
            char c = charArray[i7];
            getsdkinfo.ThreeDS2ServiceInstance = c;
            char c2 = (char) (i3 + c);
            cArr[i7] = c2;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(ThreeDS2ServiceInstance);
                objArr2[i6] = Integer.valueOf(c2);
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1313942774);
                if (obj != null) {
                    i5 = i6;
                } else {
                    i5 = i6;
                    Class cls = (Class) removeParam.initialize(Process.getGidForName("") + 68, (char) (45769 - TextUtils.indexOf("", "")), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4879);
                    Class cls2 = Integer.TYPE;
                    Method method = cls.getMethod("t", cls2, cls2);
                    map.put(-1313942774, method);
                    obj = method;
                }
                cArr[i7] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr3 = new Object[2];
                objArr3[1] = getsdkinfo;
                objArr3[i5] = getsdkinfo;
                Object obj2 = map.get(1981656970);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(58 - ImageFormat.getBitsPerPixel(i5), (char) (TextUtils.indexOf((CharSequence) "", '0', i5) + 1), 12374 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))).getMethod("r", Object.class, Object.class);
                    map.put(1981656970, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
                i6 = 0;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        if (i > 0) {
            getsdkinfo.get = i;
            char[] cArr2 = new char[i2];
            i4 = 0;
            System.arraycopy(cArr, 0, cArr2, 0, i2);
            int i8 = getsdkinfo.get;
            System.arraycopy(cArr2, 0, cArr, i2 - i8, i8);
            int i9 = getsdkinfo.get;
            System.arraycopy(cArr2, i9, cArr, 0, i2 - i9);
        } else {
            i4 = 0;
        }
        if (z) {
            char[] cArr3 = new char[i2];
            getsdkinfo.getWarnings = i4;
            while (true) {
                int i10 = getsdkinfo.getWarnings;
                if (i10 >= i2) {
                    break;
                }
                $10 = ($11 + 65) % 128;
                cArr3[i10] = cArr[(i2 - i10) - 1];
                Object[] objArr4 = {getsdkinfo, getsdkinfo};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(1981656970);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 59, (char) KeyEvent.keyCodeFromString(""), 12374 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)))).getMethod("r", Object.class, Object.class);
                    map2.put(1981656970, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    public static void initialize() {
        ThreeDS2ServiceInstance = 1141902424;
    }

    public static setImageAlpha valueOf(String str) {
        int i = getSDKInfo + 9;
        ThreeDS2ServiceInitializationCallback = i % 128;
        int i2 = i % 2;
        setImageAlpha setimagealpha = (setImageAlpha) Enum.valueOf(setImageAlpha.class, str);
        if (i2 != 0) {
            int i3 = 45 / 0;
        }
        return setimagealpha;
    }

    public static setImageAlpha[] values() {
        int i = ThreeDS2ServiceInitializationCallback + 53;
        getSDKInfo = i % 128;
        if (i % 2 != 0) {
            return (setImageAlpha[]) initialize.clone();
        }
        initialize.clone();
        throw null;
    }

    public String getWarnings() {
        int i = getSDKInfo + 53;
        ThreeDS2ServiceInitializationCallback = i % 128;
        int i2 = i % 2;
        String str = this.get;
        if (i2 == 0) {
            return str;
        }
        throw null;
    }
}
