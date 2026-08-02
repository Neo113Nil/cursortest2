package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
class setNextFocusForwardId implements getCornerRadius.get {
    private static int ThreeDS2Service = 1;
    private static int get;
    private final getCornerRadius getWarnings;

    public setNextFocusForwardId(getCornerRadius getcornerradius) {
        this.getWarnings = getcornerradius;
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        ((Number) objArr[0]).longValue();
        ((Number) objArr[1]).longValue();
        int i4 = get;
        int i5 = (i4 ^ 75) + ((i4 & 75) << 1);
        ThreeDS2Service = i5 % 128;
        int i6 = i5 % 2;
        Class cls = Boolean.TYPE;
        try {
            if (i6 == 0) {
                Object[] objArr2 = {((Class) removeParam.initialize(TextUtils.getOffsetAfter("", 0) + 78, (char) ((TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 10195), 7935 - TextUtils.getTrimmedLength(""))).getField("initialize").get(null), Boolean.TRUE};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1643948346);
                if (obj == null) {
                    obj = ((Class) removeParam.initialize((ViewConfiguration.getDoubleTapTimeout() >> 16) + 78, (char) (59652 - TextUtils.lastIndexOf("", '0', 0, 0)), 7711 - View.getDefaultSize(0, 0))).getMethod("get", (Class) removeParam.initialize((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 77, (char) (10195 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), Color.rgb(0, 0, 0) + 16785151), cls);
                    map.put(-1643948346, obj);
                }
                ((Method) obj).invoke(null, objArr2);
            } else {
                Object[] objArr3 = {((Class) removeParam.initialize(77 - ImageFormat.getBitsPerPixel(0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10194), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 7934)).getField("initialize").get(null), Boolean.TRUE};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj2 = map2.get(-1643948346);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 77, (char) (59653 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), 7711 - View.resolveSize(0, 0))).getMethod("get", (Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0') + 79, (char) ((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 10194), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 7934), cls);
                    map2.put(-1643948346, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
            }
            return null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return (ButtonCustomization) getCornerRadius.ThreeDS2Service(new Object[]{this.getWarnings}, -1376016957, 1376017029, (int) System.currentTimeMillis());
    }

    public static void get(long j, long j2) {
        get(new Object[]{Long.valueOf(j), Long.valueOf(j2)}, -1787672165, 1787672165, (int) System.currentTimeMillis());
    }
}
