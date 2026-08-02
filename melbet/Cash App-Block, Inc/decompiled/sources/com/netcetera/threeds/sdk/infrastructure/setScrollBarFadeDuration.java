package com.netcetera.threeds.sdk.infrastructure;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.setCacheColorHint;
import java.lang.reflect.Method;
import java.security.Key;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Map;

/* loaded from: classes5.dex */
public final class setScrollBarFadeDuration implements showProgress {
    private static int get = 1;
    private static int initialize;
    private final completed ThreeDS2Service;

    public setScrollBarFadeDuration(completed completedVar) {
        this.ThreeDS2Service = completedVar;
    }

    public static showProgress ThreeDS2Service() {
        return (showProgress) getWarnings(new Object[0], -1465142305, 1465142305, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object getWarnings(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | i2);
        int i5 = (((~(i | i3)) | (~((~i2) | i)) | i4) * 70) + ((~(i | i2 | i3)) * 70) + (((~(i2 | i3)) | i4) * (-140)) + (i2 * (-69)) + (i * 71);
        return i5 != 1 ? i5 != 2 ? initialize(objArr) : get(objArr) : getWarnings(objArr);
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        setScrollBarFadeDuration setscrollbarfadeduration = new setScrollBarFadeDuration(setPointerIcon.ThreeDS2ServiceInstance());
        int i = get;
        int i2 = i & 13;
        int i3 = (i | 13) & (~i2);
        int i4 = i2 << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        initialize = i5 % 128;
        if (i5 % 2 == 0) {
            return setscrollbarfadeduration;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.showProgress
    public ProtocolErrorEvent get(String str, String str2, String str3, setCacheColorHint.getWarnings getwarnings) {
        initialize = (get + 81) % 128;
        PublicKey ThreeDS2ServiceInstance = this.ThreeDS2Service.ThreeDS2ServiceInstance(str);
        try {
            if (((Boolean) getWarnings(new Object[]{this, ThreeDS2ServiceInstance}, 2083944214, -2083944212, System.identityHashCode(this))).booleanValue()) {
                int i = get;
                initialize = (((i | 37) << 1) - (i ^ 37)) % 128;
                Object[] objArr = {(RSAPublicKey) ThreeDS2ServiceInstance, str3, getwarnings};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1688587132);
                if (obj == null) {
                    obj = ((Class) removeParam.initialize(81 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (ViewConfiguration.getTapTimeout() >> 16), 5272 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).getDeclaredMethod("get", RSAPublicKey.class, String.class, setCacheColorHint.getWarnings.class);
                    map.put(-1688587132, obj);
                }
                ProtocolErrorEvent protocolErrorEvent = (ProtocolErrorEvent) ((Method) obj).invoke(null, objArr);
                int i2 = initialize;
                int i3 = i2 & 69;
                int i4 = (i3 - (~((i2 ^ 69) | i3))) - 1;
                get = i4 % 128;
                if (i4 % 2 != 0) {
                    return protocolErrorEvent;
                }
                throw null;
            }
            if (!((Boolean) getWarnings(new Object[]{this, ThreeDS2ServiceInstance}, 1595127537, -1595127536, System.identityHashCode(this))).booleanValue()) {
                throw setTextAlignment.toString.initialize(str);
            }
            int i5 = initialize;
            int i6 = i5 & 99;
            int i7 = ((i5 | 99) & (~i6)) + (i6 << 1);
            get = i7 % 128;
            if (i7 % 2 == 0) {
                Object[] objArr2 = {(ECPublicKey) ThreeDS2ServiceInstance, str2, str3, getwarnings};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj2 = map2.get(-137550774);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(64 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), View.MeasureSpec.getSize(0) + 5208)).getMethod("getWarnings", ECPublicKey.class, String.class, String.class, setCacheColorHint.getWarnings.class);
                    map2.put(-137550774, obj2);
                }
                throw null;
            }
            Object[] objArr3 = {(ECPublicKey) ThreeDS2ServiceInstance, str2, str3, getwarnings};
            Map map3 = removeParam.visaSchemeConfiguration;
            Object obj3 = map3.get(-137550774);
            if (obj3 == null) {
                obj3 = ((Class) removeParam.initialize((ViewConfiguration.getTapTimeout() >> 16) + 63, (char) KeyEvent.keyCodeFromString(""), TextUtils.lastIndexOf("", '0', 0, 0) + 5209)).getDeclaredMethod("getWarnings", ECPublicKey.class, String.class, String.class, setCacheColorHint.getWarnings.class);
                map3.put(-137550774, obj3);
            }
            ProtocolErrorEvent protocolErrorEvent2 = (ProtocolErrorEvent) ((Method) obj3).invoke(null, objArr3);
            int i8 = get;
            int i9 = i8 ^ 109;
            int i10 = ((i8 & 109) | i9) << 1;
            int i11 = -i9;
            initialize = ((i10 ^ i11) + ((i10 & i11) << 1)) % 128;
            return protocolErrorEvent2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        Key key = (Key) objArr[1];
        int i = get;
        int i2 = i & 11;
        int i3 = ((i ^ 11) | i2) << 1;
        int i4 = -((i | 11) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        initialize = i5 % 128;
        if (i5 % 2 == 0) {
            return Boolean.valueOf(key instanceof ECPublicKey);
        }
        throw null;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        Key key = (Key) objArr[1];
        int i = get;
        int i2 = i & 125;
        int i3 = (i | 125) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        initialize = i5 % 128;
        boolean z = key instanceof RSAPublicKey;
        if (i5 % 2 != 0) {
            int i6 = 77 / 0;
        }
        return Boolean.valueOf(z);
    }
}
