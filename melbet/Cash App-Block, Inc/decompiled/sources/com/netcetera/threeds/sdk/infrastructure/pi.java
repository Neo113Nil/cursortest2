package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.ql;
import com.netcetera.threeds.sdk.infrastructure.qp;
import com.netcetera.threeds.sdk.infrastructure.qq;
import java.lang.reflect.Constructor;
import java.security.Security;
import java.util.Arrays;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* loaded from: classes5.dex */
public class pi {
    private static final Logger ThreeDS2Service = LoggerFactory.getLogger((Class<?>) pi.class);
    private static final pi ThreeDS2ServiceInstance = new pi();
    private pd<pc> get;
    private pd<rp> getSDKVersion;
    private pd<pc> getWarnings;
    private pd<qu> initialize;

    private pi() {
        cleanup();
    }

    public static pi ThreeDS2ServiceInstance() {
        return ThreeDS2ServiceInstance;
    }

    private void cleanup() {
        float f;
        System.getProperty("java.version");
        System.getProperty("java.vendor");
        System.getProperty("java.home");
        Arrays.toString(Security.getProviders());
        pd<qu> pdVar = new pd<>("alg", qu.class);
        this.initialize = pdVar;
        pdVar.get((pd<qu>) new qr());
        this.initialize.get((pd<qu>) new qp.ThreeDS2Service());
        this.initialize.get((pd<qu>) new qp.get());
        this.initialize.get((pd<qu>) new qp.initialize());
        this.initialize.get((pd<qu>) new ql.getWarnings());
        this.initialize.get((pd<qu>) new ql.get());
        this.initialize.get((pd<qu>) new ql.ThreeDS2Service());
        this.initialize.get((pd<qu>) new qq.getWarnings());
        this.initialize.get((pd<qu>) new qq.ThreeDS2ServiceInstance());
        this.initialize.get((pd<qu>) new qq.createTransaction());
        this.initialize.get((pd<qu>) new qq.ThreeDS2Service());
        this.initialize.get((pd<qu>) new qq.get());
        this.initialize.get((pd<qu>) new qq.initialize());
        this.initialize.ThreeDS2ServiceInstance();
        pd<pc> pdVar2 = new pd<>("alg", (Class) removeParam.initialize(49 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (1237 - Color.argb(0, 0, 0, 0)), 13630 - KeyEvent.keyCodeFromString("")));
        this.get = pdVar2;
        try {
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(-2005297179);
            if (obj != null) {
                f = 0.0f;
            } else {
                f = 0.0f;
                obj = ((Class) removeParam.initialize((PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 59, (char) (TextUtils.lastIndexOf("", '0') + 1), 13982 - (ViewConfiguration.getTouchSlop() >> 8))).getDeclaredConstructor(null);
                map.put(-2005297179, obj);
            }
            pdVar2.get((pd<pc>) ((Constructor) obj).newInstance(null));
            pd<pc> pdVar3 = this.get;
            Object obj2 = map.get(-1093599632);
            if (obj2 == null) {
                obj2 = ((Class) removeParam.initialize(66 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) View.resolveSizeAndState(0, 0, 0), 14041 - KeyEvent.keyCodeFromString(""))).getDeclaredConstructor(null);
                map.put(-1093599632, obj2);
            }
            pdVar3.get((pd<pc>) ((Constructor) obj2).newInstance(null));
            pd<pc> pdVar4 = this.get;
            Object obj3 = map.get(1658605735);
            if (obj3 == null) {
                obj3 = ((Class) removeParam.initialize(80 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (View.combineMeasuredStates(0, 0) + 48370), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14106)).getDeclaredConstructor(null);
                map.put(1658605735, obj3);
            }
            pdVar4.get((pd<pc>) ((Constructor) obj3).newInstance(null));
            pd<pc> pdVar5 = this.get;
            Object obj4 = map.get(-1182374620);
            if (obj4 == null) {
                obj4 = ((Class) removeParam.initialize(49 - View.MeasureSpec.getSize(0), (char) TextUtils.indexOf("", "", 0), 13170 - TextUtils.getCapsMode("", 0, 0))).getDeclaredConstructor(null);
                map.put(-1182374620, obj4);
            }
            pdVar5.get((pd<pc>) ((Constructor) obj4).newInstance(null));
            pd<pc> pdVar6 = this.get;
            Object obj5 = map.get(1470898099);
            if (obj5 == null) {
                obj5 = ((Class) removeParam.initialize(58 - TextUtils.indexOf("", "", 0, 0), (char) ((-16777216) - Color.rgb(0, 0, 0)), 12626 - View.getDefaultSize(0, 0))).getDeclaredConstructor(null);
                map.put(1470898099, obj5);
            }
            pdVar6.get((pd<pc>) ((Constructor) obj5).newInstance(null));
            pd<pc> pdVar7 = this.get;
            Object obj6 = map.get(-1669867719);
            if (obj6 == null) {
                obj6 = ((Class) removeParam.initialize(TextUtils.lastIndexOf("", '0', 0) + 80, (char) (TextUtils.indexOf((CharSequence) "", '0') + 51821), ExpandableListView.getPackedPositionChild(0L) + 12685)).getDeclaredConstructor(null);
                map.put(-1669867719, obj6);
            }
            pdVar7.get((pd<pc>) ((Constructor) obj6).newInstance(null));
            pd<pc> pdVar8 = this.get;
            Object obj7 = map.get(-54197130);
            if (obj7 == null) {
                obj7 = ((Class) removeParam.initialize(67 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 12763 - (Process.myPid() >> 22))).getDeclaredConstructor(null);
                map.put(-54197130, obj7);
            }
            pdVar8.get((pd<pc>) ((Constructor) obj7).newInstance(null));
            pd<pc> pdVar9 = this.get;
            Object obj8 = map.get(1381992171);
            if (obj8 == null) {
                obj8 = ((Class) removeParam.initialize((Process.myPid() >> 22) + 49, (char) (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), 13220 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)))).getDeclaredConstructor(null);
                map.put(1381992171, obj8);
            }
            pdVar9.get((pd<pc>) ((Constructor) obj8).newInstance(null));
            pd<pc> pdVar10 = this.get;
            Object obj9 = map.get(-598961179);
            if (obj9 == null) {
                obj9 = ((Class) removeParam.initialize(72 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) - 1), 13318 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).getDeclaredConstructor(null);
                map.put(-598961179, obj9);
            }
            pdVar10.get((pd<pc>) ((Constructor) obj9).newInstance(null));
            pd<pc> pdVar11 = this.get;
            Object obj10 = map.get(249614115);
            if (obj10 == null) {
                float f2 = f;
                obj10 = ((Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0', 0) + 67, (char) (34667 - (PointF.length(f2, f2) > f2 ? 1 : (PointF.length(f2, f2) == f2 ? 0 : -1))), (ViewConfiguration.getFadingEdgeLength() >> 16) + 13388)).getDeclaredConstructor(null);
                map.put(249614115, obj10);
            }
            pdVar11.get((pd<pc>) ((Constructor) obj10).newInstance(null));
            pd<pc> pdVar12 = this.get;
            Object obj11 = map.get(1141222252);
            if (obj11 == null) {
                obj11 = ((Class) removeParam.initialize(Color.alpha(0) + 79, (char) (22436 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 13453 - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).getDeclaredConstructor(null);
                map.put(1141222252, obj11);
            }
            pdVar12.get((pd<pc>) ((Constructor) obj11).newInstance(null));
            pd<pc> pdVar13 = this.get;
            Object obj12 = map.get(-261033728);
            if (obj12 == null) {
                obj12 = ((Class) removeParam.initialize(View.MeasureSpec.getSize(0) + 79, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 59010), 13728 - Color.blue(0))).getDeclaredConstructor(null);
                map.put(-261033728, obj12);
            }
            pdVar13.get((pd<pc>) ((Constructor) obj12).newInstance(null));
            pd<pc> pdVar14 = this.get;
            Object obj13 = map.get(401855748);
            if (obj13 == null) {
                obj13 = ((Class) removeParam.initialize((-16777149) - Color.rgb(0, 0, 0), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 19251), (Process.myPid() >> 22) + 13807)).getDeclaredConstructor(null);
                map.put(401855748, obj13);
            }
            pdVar14.get((pd<pc>) ((Constructor) obj13).newInstance(null));
            pd<pc> pdVar15 = this.get;
            Object obj14 = map.get(1507616095);
            if (obj14 == null) {
                obj14 = ((Class) removeParam.initialize(60 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (20478 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13875)).getDeclaredConstructor(null);
                map.put(1507616095, obj14);
            }
            pdVar15.get((pd<pc>) ((Constructor) obj14).newInstance(null));
            pd<pc> pdVar16 = this.get;
            Object obj15 = map.get(977730418);
            if (obj15 == null) {
                obj15 = ((Class) removeParam.initialize(Color.rgb(0, 0, 0) + 16777275, (char) View.combineMeasuredStates(0, 0), 12373 - (ViewConfiguration.getLongPressTimeout() >> 16))).getDeclaredConstructor(null);
                map.put(977730418, obj15);
            }
            pdVar16.get((pd<pc>) ((Constructor) obj15).newInstance(null));
            pd<pc> pdVar17 = this.get;
            Object obj16 = map.get(-327177674);
            if (obj16 == null) {
                obj16 = ((Class) removeParam.initialize(ExpandableListView.getPackedPositionChild(0L) + 80, (char) Gravity.getAbsoluteGravity(0, 0), 12433 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))).getDeclaredConstructor(null);
                map.put(-327177674, obj16);
            }
            pdVar17.get((pd<pc>) ((Constructor) obj16).newInstance(null));
            pd<pc> pdVar18 = this.get;
            Object obj17 = map.get(2129637997);
            if (obj17 == null) {
                obj17 = ((Class) removeParam.initialize(66 - View.MeasureSpec.getMode(0), (char) Color.argb(0, 0, 0, 0), TextUtils.indexOf("", "", 0) + 12511)).getDeclaredConstructor(null);
                map.put(2129637997, obj17);
            }
            pdVar18.get((pd<pc>) ((Constructor) obj17).newInstance(null));
            this.get.ThreeDS2ServiceInstance();
            pd<pc> pdVar19 = new pd<>("enc", (Class) removeParam.initialize(49 - View.resolveSize(0, 0), (char) (44811 - (ViewConfiguration.getLongPressTimeout() >> 16)), 12926 - View.combineMeasuredStates(0, 0)));
            this.getWarnings = pdVar19;
            Object obj18 = map.get(19688810);
            if (obj18 == null) {
                obj18 = ((Class) removeParam.initialize(58 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) (20585 - Color.red(0)), TextUtils.indexOf("", "") + 11874)).getDeclaredConstructor(null);
                map.put(19688810, obj18);
            }
            pdVar19.get((pd<pc>) ((Constructor) obj18).newInstance(null));
            pd<pc> pdVar20 = this.getWarnings;
            Object obj19 = map.get(-1387700518);
            if (obj19 == null) {
                obj19 = ((Class) removeParam.initialize((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 64, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 17330), (ViewConfiguration.getEdgeSlop() >> 16) + 11933)).getDeclaredConstructor(null);
                map.put(-1387700518, obj19);
            }
            pdVar20.get((pd<pc>) ((Constructor) obj19).newInstance(null));
            pd<pc> pdVar21 = this.getWarnings;
            Object obj20 = map.get(199759722);
            if (obj20 == null) {
                obj20 = ((Class) removeParam.initialize((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 66, (char) (62237 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11997)).getDeclaredConstructor(null);
                map.put(199759722, obj20);
            }
            pdVar21.get((pd<pc>) ((Constructor) obj20).newInstance(null));
            pd<pc> pdVar22 = this.getWarnings;
            Object obj21 = map.get(-277195173);
            if (obj21 == null) {
                obj21 = ((Class) removeParam.initialize(64 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (29655 - Color.argb(0, 0, 0, 0)), 12114 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getDeclaredConstructor(null);
                map.put(-277195173, obj21);
            }
            pdVar22.get((pd<pc>) ((Constructor) obj21).newInstance(null));
            pd<pc> pdVar23 = this.getWarnings;
            Object obj22 = map.get(1385266597);
            if (obj22 == null) {
                obj22 = ((Class) removeParam.initialize(MotionEvent.axisFromString("") + 80, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 12180 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))).getDeclaredConstructor(null);
                map.put(1385266597, obj22);
            }
            pdVar23.get((pd<pc>) ((Constructor) obj22).newInstance(null));
            pd<pc> pdVar24 = this.getWarnings;
            Object obj23 = map.get(232457624);
            if (obj23 == null) {
                obj23 = ((Class) removeParam.initialize(66 - Color.argb(0, 0, 0, 0), (char) (KeyEvent.getDeadChar(0, 0) + 47740), 12258 - TextUtils.getOffsetBefore("", 0))).getDeclaredConstructor(null);
                map.put(232457624, obj23);
            }
            pdVar24.get((pd<pc>) ((Constructor) obj23).newInstance(null));
            this.getWarnings.ThreeDS2ServiceInstance();
            pd<rp> pdVar25 = new pd<>("zip", rp.class);
            this.getSDKVersion = pdVar25;
            pdVar25.get((pd<rp>) new rs());
            this.getSDKVersion.ThreeDS2ServiceInstance();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public pd<rp> ThreeDS2Service() {
        return this.getSDKVersion;
    }

    public pd<pc> get() {
        return this.get;
    }

    public pd<pc> getWarnings() {
        return this.getWarnings;
    }

    public pd<qu> initialize() {
        return this.initialize;
    }
}
