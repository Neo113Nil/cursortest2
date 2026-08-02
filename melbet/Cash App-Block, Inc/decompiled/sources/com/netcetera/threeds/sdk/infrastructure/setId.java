package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class setId {
    private static int get = 0;
    private static int initialize = 1;

    public setForegroundTintBlendMode ThreeDS2ServiceInstance(setPadding setpadding, List<setOverscrollHeader> list) {
        setRenderEffect setrendereffect;
        setRenderEffect setrendereffect2;
        Object method;
        HashMap hashMap = new HashMap();
        int i = initialize;
        int i2 = i & 109;
        int i3 = 1;
        int i4 = ((i ^ 109) | i2) << 1;
        int i5 = -((i | 109) & (~i2));
        get = (((i4 | i5) << 1) - (i5 ^ i4)) % 128;
        for (setOverscrollHeader setoverscrollheader : list) {
            setpadding.getWarnings(new HashSet(setoverscrollheader.getWarnings()), setoverscrollheader.initialize());
            String initialize2 = setoverscrollheader.initialize();
            setBackground setbackground = (setBackground) setBackground.initialize(new Object[]{setoverscrollheader.initialize()}, -1719229398, 1719229399, (int) System.currentTimeMillis());
            setDrawingCacheEnabled setdrawingcacheenabled = (setDrawingCacheEnabled) setDrawingCacheEnabled.get(new Object[]{new HashSet(setoverscrollheader.getWarnings())}, 1622279849, -1622279846, (int) System.currentTimeMillis());
            int i6 = i3;
            if (oj.initialize(setoverscrollheader.ThreeDS2ServiceInitializationCallback())) {
                StringBuilder sb = new StringBuilder();
                try {
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(213700724);
                    if (obj != null) {
                        method = obj;
                    } else {
                        method = ((Class) removeParam.initialize(60 - (ViewConfiguration.getTouchSlop() >> 8), (char) (47243 - TextUtils.lastIndexOf("", '0', 0, 0)), ExpandableListView.getPackedPositionChild(0L) + 9223)).getMethod("get", null);
                        map.put(213700724, method);
                    }
                    sb.append((String) ((Method) method).invoke(null, null));
                    sb.append(setoverscrollheader.ThreeDS2ServiceInitializationCallback());
                    setrendereffect = (setRenderEffect) setRenderEffect.initialize(new Object[]{sb.toString()}, 1470041373, -1470041372, (int) System.currentTimeMillis());
                    int i7 = get;
                    initialize = ((-2) - (((i7 ^ 6) + ((i7 & 6) << 1)) ^ (-1))) % 128;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                setrendereffect = (setRenderEffect) setRenderEffect.initialize(new Object[0], 1772295054, -1772295054, (int) System.currentTimeMillis());
                int i8 = initialize;
                get = ((((i8 ^ 41) | (i8 & 41)) << 1) - (((~i8) & 41) | (i8 & (-42)))) % 128;
            }
            if (oj.initialize(setoverscrollheader.getSDKVersion())) {
                StringBuilder sb2 = new StringBuilder();
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj2 = map2.get(213700724);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(TextUtils.lastIndexOf("", '0', 0, 0) + 61, (char) (47244 - (ViewConfiguration.getPressedStateDuration() >> 16)), 9222 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("get", null);
                    map2.put(213700724, obj2);
                }
                sb2.append((String) ((Method) obj2).invoke(null, null));
                sb2.append(setoverscrollheader.getSDKVersion());
                setrendereffect2 = (setRenderEffect) setRenderEffect.initialize(new Object[]{sb2.toString()}, 1470041373, -1470041372, (int) System.currentTimeMillis());
                initialize = (get + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            } else {
                setrendereffect2 = (setRenderEffect) setRenderEffect.initialize(new Object[0], 1772295054, -1772295054, (int) System.currentTimeMillis());
                int i9 = get;
                initialize = ((i9 ^ 13) + ((i9 & 13) << 1)) % 128;
            }
            hashMap.put(initialize2, (setLayerType) setLayerType.getWarnings(new Object[]{setbackground, setdrawingcacheenabled, setrendereffect, setrendereffect2, (setLayerPaint) setLayerPaint.initialize(new Object[]{setoverscrollheader.get(), setoverscrollheader.ThreeDS2Service()}, 2144845291, -2144845290, (int) System.currentTimeMillis()), (setBackgroundResource) setBackgroundResource.ThreeDS2ServiceInstance(new Object[]{new HashSet(setoverscrollheader.ThreeDS2ServiceInstance())}, -1666386940, 1666386942, (int) System.currentTimeMillis())}, -1347106739, 1347106739, (int) System.currentTimeMillis()));
            int i10 = get;
            int i11 = i10 & 89;
            initialize = SVG$Unit$EnumUnboxingLocalUtility.m$1(i11, ~(-(-((i10 ^ 89) | i11))), i6, 128);
            i3 = i6;
        }
        setSelected setselected = new setSelected(hashMap);
        System.identityHashCode(this);
        System.identityHashCode(this);
        return setselected;
    }

    public setForegroundTintBlendMode get(Context context, setPadding setpadding) {
        int i = get;
        initialize = ((i ^ 9) + ((i & 9) << 1)) % 128;
        try {
            Object[] objArr = {context};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(-1571290458);
            if (obj == null) {
                obj = ((Class) removeParam.initialize((ViewConfiguration.getPressedStateDuration() >> 16) + 80, (char) (ViewConfiguration.getPressedStateDuration() >> 16), 9489 - View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod("getWarnings", Context.class);
                map.put(-1571290458, obj);
            }
            setForegroundTintBlendMode ThreeDS2ServiceInstance = ThreeDS2ServiceInstance(setpadding, ((setWeightSum) ((Method) obj).invoke(null, objArr)).ThreeDS2ServiceInstance().ThreeDS2ServiceInstance());
            int i2 = initialize;
            int i3 = i2 & 1;
            int i4 = -(-((i2 ^ 1) | i3));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            get = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 79 / 0;
            }
            return ThreeDS2ServiceInstance;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
