package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class setForegroundTintList {
    private static int ThreeDS2Service = 1;
    private static int initialize;

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        setLayerType setlayertype = (setLayerType) objArr[1];
        setPadding setpadding = (setPadding) objArr[2];
        Map map = (Map) objArr[3];
        int i = initialize;
        int i2 = (((i | 84) << 1) - (i ^ 84)) - 1;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 != 0) {
            setpadding.getWarnings(setlayertype.ThreeDS2Service().getWarnings(), setlayertype.initialize().get());
            map.put(setlayertype.initialize().get(), setlayertype);
            return null;
        }
        setpadding.getWarnings(setlayertype.ThreeDS2Service().getWarnings(), setlayertype.initialize().get());
        map.put(setlayertype.initialize().get(), setlayertype);
        int i3 = 77 / 0;
        return null;
    }

    public setForegroundTintBlendMode getWarnings(Context context, setPadding setpadding) {
        float f;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        Object[] objArr6;
        Object[] objArr7;
        HashMap hashMap = new HashMap();
        try {
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(1907111064);
            if (obj == null) {
                obj = ((Class) removeParam.initialize(60 - (KeyEvent.getMaxKeyCode() >> 16), (char) TextUtils.indexOf("", "", 0), (ViewConfiguration.getScrollBarSize() >> 8) + 5762)).getDeclaredConstructor(null);
                map.put(1907111064, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(null);
            Object[] objArr8 = {context};
            Object obj2 = map.get(-862776383);
            if (obj2 != null) {
                f = RecyclerView.DECELERATION_RATE;
            } else {
                int tapTimeout = 60 - (ViewConfiguration.getTapTimeout() >> 16);
                f = RecyclerView.DECELERATION_RATE;
                obj2 = ((Class) removeParam.initialize(tapTimeout, (char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 5761)).getMethod("getWarnings", Context.class);
                map.put(-862776383, obj2);
            }
            getWarnings(new Object[]{this, ((Method) obj2).invoke(newInstance, objArr8), setpadding, hashMap}, 224386291, -224386291, System.identityHashCode(this));
            Object obj3 = map.get(581020292);
            if (obj3 != null) {
                objArr = null;
            } else {
                objArr = null;
                obj3 = ((Class) removeParam.initialize(Color.argb(0, 0, 0, 0) + 66, (char) KeyEvent.keyCodeFromString(""), 5890 - ExpandableListView.getPackedPositionType(0L))).getDeclaredConstructor(null);
                map.put(581020292, obj3);
            }
            Object newInstance2 = ((Constructor) obj3).newInstance(objArr);
            Object[] objArr9 = {context};
            Object obj4 = map.get(-1317020907);
            if (obj4 == null) {
                obj4 = ((Class) removeParam.initialize(TextUtils.indexOf("", "", 0) + 66, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), TextUtils.getTrimmedLength("") + 5890)).getMethod("ThreeDS2ServiceInstance", Context.class);
                map.put(-1317020907, obj4);
            }
            getWarnings(new Object[]{this, ((Method) obj4).invoke(newInstance2, objArr9), setpadding, hashMap}, 224386291, -224386291, System.identityHashCode(this));
            Object obj5 = map.get(1723056111);
            if (obj5 != null) {
                objArr2 = null;
            } else {
                objArr2 = null;
                obj5 = ((Class) removeParam.initialize(75 - TextUtils.indexOf((CharSequence) "", '0'), (char) (View.MeasureSpec.getMode(0) + 38982), 5419 - TextUtils.indexOf("", "", 0, 0))).getDeclaredConstructor(null);
                map.put(1723056111, obj5);
            }
            Object newInstance3 = ((Constructor) obj5).newInstance(objArr2);
            Object[] objArr10 = {context};
            Object obj6 = map.get(-1677132001);
            if (obj6 == null) {
                obj6 = ((Class) removeParam.initialize(TextUtils.indexOf("", "", 0) + 76, (char) (38982 - (Process.myPid() >> 22)), View.combineMeasuredStates(0, 0) + 5419)).getMethod("initialize", Context.class);
                map.put(-1677132001, obj6);
            }
            getWarnings(new Object[]{this, ((Method) obj6).invoke(newInstance3, objArr10), setpadding, hashMap}, 224386291, -224386291, System.identityHashCode(this));
            Object obj7 = map.get(1433802688);
            if (obj7 != null) {
                objArr3 = null;
            } else {
                objArr3 = null;
                obj7 = ((Class) removeParam.initialize(72 - View.MeasureSpec.getSize(0), (char) (17593 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 5555 - (ViewConfiguration.getFadingEdgeLength() >> 16))).getDeclaredConstructor(null);
                map.put(1433802688, obj7);
            }
            Object newInstance4 = ((Constructor) obj7).newInstance(objArr3);
            Object[] objArr11 = {context};
            Object obj8 = map.get(-1427574336);
            if (obj8 == null) {
                obj8 = ((Class) removeParam.initialize(71 - ExpandableListView.getPackedPositionChild(0L), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 17593), 5555 - (ViewConfiguration.getScrollBarSize() >> 8))).getMethod("get", Context.class);
                map.put(-1427574336, obj8);
            }
            getWarnings(new Object[]{this, ((Method) obj8).invoke(newInstance4, objArr11), setpadding, hashMap}, 224386291, -224386291, System.identityHashCode(this));
            Object obj9 = map.get(-713845430);
            if (obj9 != null) {
                objArr4 = null;
            } else {
                float f2 = f;
                objArr4 = null;
                obj9 = ((Class) removeParam.initialize((PointF.length(f2, f2) > f2 ? 1 : (PointF.length(f2, f2) == f2 ? 0 : -1)) + 68, (char) (21546 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), TextUtils.indexOf("", "") + 5822)).getDeclaredConstructor(null);
                map.put(-713845430, obj9);
            }
            Object newInstance5 = ((Constructor) obj9).newInstance(objArr4);
            Object[] objArr12 = {context};
            Object obj10 = map.get(1863168243);
            if (obj10 == null) {
                obj10 = ((Class) removeParam.initialize(69 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (21548 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 5822)).getMethod("getWarnings", Context.class);
                map.put(1863168243, obj10);
            }
            getWarnings(new Object[]{this, ((Method) obj10).invoke(newInstance5, objArr12), setpadding, hashMap}, 224386291, -224386291, System.identityHashCode(this));
            Object obj11 = map.get(-954930537);
            if (obj11 != null) {
                objArr5 = null;
            } else {
                objArr5 = null;
                obj11 = ((Class) removeParam.initialize(((Process.getThreadPriority(0) + 20) >> 6) + 67, (char) (Drawable.resolveOpacity(0, 0) + 64360), 5695 - (ViewConfiguration.getLongPressTimeout() >> 16))).getDeclaredConstructor(null);
                map.put(-954930537, obj11);
            }
            Object newInstance6 = ((Constructor) obj11).newInstance(objArr5);
            Object[] objArr13 = {context};
            Object obj12 = map.get(-244975273);
            if (obj12 == null) {
                obj12 = ((Class) removeParam.initialize((-16777149) - Color.rgb(0, 0, 0), (char) (64360 - View.resolveSizeAndState(0, 0, 0)), View.resolveSizeAndState(0, 0, 0) + 5695)).getMethod("get", Context.class);
                map.put(-244975273, obj12);
            }
            getWarnings(new Object[]{this, ((Method) obj12).invoke(newInstance6, objArr13), setpadding, hashMap}, 224386291, -224386291, System.identityHashCode(this));
            Object obj13 = map.get(1060343223);
            if (obj13 != null) {
                objArr6 = null;
            } else {
                objArr6 = null;
                obj13 = ((Class) removeParam.initialize((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 59, (char) (View.resolveSize(0, 0) + 52844), (ViewConfiguration.getFadingEdgeLength() >> 16) + 5495)).getDeclaredConstructor(null);
                map.put(1060343223, obj13);
            }
            Object newInstance7 = ((Constructor) obj13).newInstance(objArr6);
            Object[] objArr14 = {context};
            Object obj14 = map.get(-1270978985);
            if (obj14 == null) {
                obj14 = ((Class) removeParam.initialize(60 - Gravity.getAbsoluteGravity(0, 0), (char) (View.MeasureSpec.getSize(0) + 52844), 5495 - View.combineMeasuredStates(0, 0))).getMethod("initialize", Context.class);
                map.put(-1270978985, obj14);
            }
            getWarnings(new Object[]{this, ((Method) obj14).invoke(newInstance7, objArr14), setpadding, hashMap}, 224386291, -224386291, System.identityHashCode(this));
            Object obj15 = map.get(-2008489494);
            if (obj15 != null) {
                objArr7 = null;
            } else {
                objArr7 = null;
                obj15 = ((Class) removeParam.initialize((ViewConfiguration.getTouchSlop() >> 8) + 68, (char) ((-1) - MotionEvent.axisFromString("")), 5627 - (Process.myPid() >> 22))).getDeclaredConstructor(null);
                map.put(-2008489494, obj15);
            }
            Object newInstance8 = ((Constructor) obj15).newInstance(objArr7);
            Object[] objArr15 = {context};
            Object obj16 = map.get(1813194131);
            if (obj16 == null) {
                obj16 = ((Class) removeParam.initialize((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 68, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 5627 - View.MeasureSpec.getMode(0))).getMethod("getWarnings", Context.class);
                map.put(1813194131, obj16);
            }
            getWarnings(new Object[]{this, ((Method) obj16).invoke(newInstance8, objArr15), setpadding, hashMap}, 224386291, -224386291, System.identityHashCode(this));
            setSelected setselected = new setSelected(hashMap);
            int i = initialize;
            int i2 = ((i | 7) << 1) - (i ^ 7);
            ThreeDS2Service = i2 % 128;
            if (i2 % 2 != 0) {
                return setselected;
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
        return ThreeDS2Service(objArr);
    }
}
