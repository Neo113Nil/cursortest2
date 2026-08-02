package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* loaded from: classes5.dex */
public class setPictureListener implements setWebContentsDebuggingEnabled {
    private static int ThreeDS2ServiceInstance = 0;
    private static int initialize = 1;
    private final Object ThreeDS2Service;
    private final Object get;

    public setPictureListener(Object obj, Object obj2) {
        this.get = obj;
        this.ThreeDS2Service = obj2;
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        try {
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(-782591534);
            if (obj == null) {
                obj = ((Class) removeParam.initialize(74 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (Process.myTid() >> 22), TextUtils.indexOf("", "", 0) + 7511)).getDeclaredConstructor(null);
                map.put(-782591534, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(null);
            Object obj2 = map.get(-354281461);
            if (obj2 == null) {
                obj2 = ((Class) removeParam.initialize(69 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (45113 - (Process.myPid() >> 22)), TextUtils.indexOf((CharSequence) "", '0') + 7382)).getDeclaredConstructor(null);
                map.put(-354281461, obj2);
            }
            setPictureListener setpicturelistener = new setPictureListener(newInstance, ((Constructor) obj2).newInstance(null));
            int i = initialize + 29;
            ThreeDS2ServiceInstance = i % 128;
            if (i % 2 == 0) {
                return setpicturelistener;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static /* synthetic */ Object getWarnings(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | i2);
        int i5 = ~i3;
        int i6 = (((~(i5 | i2)) | i4) * (-1188)) + (i2 * (-1187)) + (i * 595);
        int i7 = ~i2;
        int i8 = (~(i3 | i7)) | i4;
        int i9 = ~(i5 | i);
        if ((((~(i | i7)) | (~(i7 | i5)) | i9) * 594) + ((i8 | i9) * 594) + i6 == 1) {
            return ThreeDS2ServiceInstance(objArr);
        }
        setPictureListener setpicturelistener = (setPictureListener) objArr[0];
        String str = (String) objArr[1];
        Object obj = setpicturelistener.get;
        Object obj2 = setpicturelistener.ThreeDS2Service;
        try {
            Map map = removeParam.visaSchemeConfiguration;
            Object obj3 = map.get(-1799057037);
            if (obj3 == null) {
                obj3 = ((Class) removeParam.initialize(61 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (125 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 7449)).getMethod("get", null);
                map.put(-1799057037, obj3);
            }
            Object invoke = ((Method) obj3).invoke(obj2, null);
            Object obj4 = setpicturelistener.ThreeDS2Service;
            Object obj5 = map.get(1784190551);
            if (obj5 == null) {
                obj5 = ((Class) removeParam.initialize(61 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), 7449 - TextUtils.lastIndexOf("", '0', 0, 0))).getMethod("initialize", null);
                map.put(1784190551, obj5);
            }
            Object[] objArr2 = {invoke, ((Method) obj5).invoke(obj4, null)};
            Object obj6 = map.get(-1947411637);
            if (obj6 == null) {
                obj6 = ((Class) removeParam.initialize(73 - View.MeasureSpec.getSize(0), (char) TextUtils.getTrimmedLength(""), 7511 - Color.blue(0))).getMethod("initialize", KeyManager[].class, TrustManager[].class);
                map.put(-1947411637, obj6);
            }
            setDownloadListener setdownloadlistener = new setDownloadListener((SSLSocketFactory) ((Method) obj6).invoke(obj, objArr2), str);
            int i10 = initialize;
            int i11 = i10 & 67;
            ThreeDS2ServiceInstance = SVG$Unit$EnumUnboxingLocalUtility.m$1(i11, ~(-(-((i10 ^ 67) | i11))), 1, 128);
            return setdownloadlistener;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setWebContentsDebuggingEnabled
    public setFindListener get(String str) {
        int i = ThreeDS2ServiceInstance;
        int i2 = i & 37;
        initialize = SVG$Unit$EnumUnboxingLocalUtility.m$1(i2, ~((i ^ 37) | i2), 1, 128);
        setFindListener setfindlistener = (setFindListener) getWarnings(new Object[]{this, str}, 742069311, -742069311, System.identityHashCode(this));
        int i3 = initialize;
        int i4 = i3 & 75;
        int i5 = i3 | 75;
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        ThreeDS2ServiceInstance = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 37 / 0;
        }
        return setfindlistener;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setWebContentsDebuggingEnabled
    public setFindListener initialize() {
        int i = initialize;
        int i2 = i & 31;
        int i3 = (i | 31) & (~i2);
        int i4 = i2 << 1;
        ThreeDS2ServiceInstance = ((i3 & i4) + (i3 | i4)) % 128;
        setFindListener setfindlistener = (setFindListener) getWarnings(new Object[]{this, ""}, 742069311, -742069311, System.identityHashCode(this));
        int i5 = ThreeDS2ServiceInstance;
        int i6 = ((i5 | 108) << 1) - (i5 ^ 108);
        initialize = ((i6 ^ (-1)) + (i6 << 1)) % 128;
        return setfindlistener;
    }

    public static setPictureListener getWarnings() {
        return (setPictureListener) getWarnings(new Object[0], -2036580896, 2036580897, (int) System.currentTimeMillis());
    }
}
