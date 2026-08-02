package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.getCornerRadius;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class setElevation implements getCornerRadius.get {
    private static int ThreeDS2Service = 1;
    private static int ThreeDS2ServiceInstance;
    private final getCornerRadius getWarnings;

    public setElevation(getCornerRadius getcornerradius) {
        this.getWarnings = getcornerradius;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        ((Number) objArr[0]).longValue();
        ((Number) objArr[1]).longValue();
        int i = ThreeDS2ServiceInstance;
        int i2 = (i ^ 3) + ((i & 3) << 1);
        ThreeDS2Service = i2 % 128;
        int i3 = i2 % 2;
        Class cls = Boolean.TYPE;
        try {
            if (i3 == 0) {
                Object[] objArr2 = {((Class) removeParam.initialize(78 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 10195), ((byte) KeyEvent.getModifierMetaStateMask()) + 7936)).getField("initialize").get(null), Boolean.FALSE};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1643948346);
                if (obj == null) {
                    obj = ((Class) removeParam.initialize(78 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 59653), TextUtils.lastIndexOf("", '0', 0, 0) + 7712)).getMethod("get", (Class) removeParam.initialize((PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 78, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 10195), (Process.myTid() >> 22) + 7935), cls);
                    map.put(-1643948346, obj);
                }
                ((Method) obj).invoke(null, objArr2);
            } else {
                Object[] objArr3 = {((Class) removeParam.initialize(78 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 10194), ExpandableListView.getPackedPositionGroup(0L) + 7935)).getField("initialize").get(null), Boolean.TRUE};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj2 = map2.get(-1643948346);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(77 - TextUtils.indexOf((CharSequence) "", '0'), (char) (59652 - ((byte) KeyEvent.getModifierMetaStateMask())), 7711 - ExpandableListView.getPackedPositionGroup(0L))).getMethod("get", (Class) removeParam.initialize(78 - TextUtils.indexOf("", "", 0, 0), (char) (Color.rgb(0, 0, 0) + 16787411), 7934 - ImageFormat.getBitsPerPixel(0)), cls);
                    map2.put(-1643948346, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
            }
            int i4 = ThreeDS2ServiceInstance;
            int i5 = i4 & 1;
            int i6 = (i4 | 1) & (~i5);
            int i7 = -(-(i5 << 1));
            int i8 = (i6 & i7) + (i6 | i7);
            ThreeDS2Service = i8 % 128;
            if (i8 % 2 != 0) {
                return null;
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

    @Override // com.netcetera.threeds.sdk.infrastructure.getCornerRadius.get
    public ButtonCustomization getWarnings() {
        return getCornerRadius.getSchemeId(this.getWarnings);
    }

    public static /* synthetic */ Object getWarnings(Object[] objArr, int i, int i2, int i3) {
        return initialize(objArr);
    }

    public static void initialize(long j, long j2) {
        getWarnings(new Object[]{Long.valueOf(j), Long.valueOf(j2)}, 976047656, -976047656, (int) System.currentTimeMillis());
    }
}
