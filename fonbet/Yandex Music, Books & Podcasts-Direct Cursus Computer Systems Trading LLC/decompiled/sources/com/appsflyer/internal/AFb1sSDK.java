package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/appsflyer/internal/AFb1sSDK;", "", "Lcom/appsflyer/internal/AFh1tSDK;", "values", "<init>", "(Lcom/appsflyer/internal/AFh1tSDK;)V", "", "afInfoLog", "()V", "getMediationNetwork", "Lcom/appsflyer/internal/AFh1tSDK;", "getMonetizationNetwork"}, k = 1, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class AFb1sSDK {

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    @NotNull
    private final AFh1tSDK getMonetizationNetwork;

    public AFb1sSDK(@NotNull AFh1tSDK aFh1tSDK) {
        aFh1tSDK.getClass();
        this.getMonetizationNetwork = aFh1tSDK;
    }

    public final void afInfoLog() {
        try {
            Map map = AFa1gSDK.e;
            Object obj = map.get(601993545);
            if (obj == null) {
                obj = ((Class) AFa1gSDK.getMonetizationNetwork(37 - (ViewConfiguration.getTouchSlop() >> 8), 87 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (ViewConfiguration.getJumpTapTimeout() >> 16))).getDeclaredConstructor(null);
                map.put(601993545, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(null);
            Object[] objArr = {this.getMonetizationNetwork};
            Object obj2 = map.get(-1823987507);
            if (obj2 == null) {
                obj2 = ((Class) AFa1gSDK.getMonetizationNetwork(37 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 87 - TextUtils.getCapsMode("", 0, 0), (char) Color.alpha(0))).getMethod("getRevenue", AFh1tSDK.class);
                map.put(-1823987507, obj2);
            }
            ((Method) obj2).invoke(newInstance, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
