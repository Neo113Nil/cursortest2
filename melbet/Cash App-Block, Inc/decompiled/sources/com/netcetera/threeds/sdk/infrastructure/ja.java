package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.setCacheColorHint;
import com.netcetera.threeds.sdk.infrastructure.setProgressBackgroundTintList;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.KeyPair;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class ja {
    private static int cleanup = 1;
    private static int getSDKVersion;
    private final setOnItemClickListener ThreeDS2Service;
    private final gc ThreeDS2ServiceInstance;
    private final setTextDirection createTransaction;
    private final Object get;
    private final Object getWarnings;
    private final RuntimeErrorEvent initialize;

    public ja(setOnItemClickListener setonitemclicklistener, RuntimeErrorEvent runtimeErrorEvent, Object obj, Object obj2, gc gcVar, setTextDirection settextdirection) {
        this.ThreeDS2Service = setonitemclicklistener;
        this.initialize = runtimeErrorEvent;
        this.get = obj;
        this.getWarnings = obj2;
        this.ThreeDS2ServiceInstance = gcVar;
        this.createTransaction = settextdirection;
    }

    public static ja ThreeDS2Service(Context context, setOnItemClickListener setonitemclicklistener) {
        return (ja) initialize(new Object[]{context, setonitemclicklistener}, -1905730258, 1905730258, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        Context context = (Context) objArr[0];
        setOnItemClickListener setonitemclicklistener = (setOnItemClickListener) objArr[1];
        setScrollbarFadingEnabled setscrollbarfadingenabled = new setScrollbarFadingEnabled();
        try {
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(135024197);
            if (obj == null) {
                obj = ((Class) removeParam.initialize(49 - (Process.myPid() >> 22), (char) (ViewConfiguration.getWindowTouchSlop() >> 8), 11333 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).getDeclaredConstructor(null);
                map.put(135024197, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(null);
            Object obj2 = map.get(1786857358);
            if (obj2 == null) {
                obj2 = ((Class) removeParam.initialize(64 - TextUtils.indexOf("", "", 0), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 5011 - Color.blue(0))).getMethod("initialize", null);
                map.put(1786857358, obj2);
            }
            ja jaVar = new ja(setonitemclicklistener, setscrollbarfadingenabled, newInstance, ((Method) obj2).invoke(null, null), new gc(), setTextDirection.initialize(context));
            int i = cleanup + 67;
            getSDKVersion = i % 128;
            if (i % 2 != 0) {
                int i2 = 57 / 0;
            }
            return jaVar;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static /* synthetic */ Object initialize(Object[] objArr, int i, int i2, int i3) {
        return ThreeDS2ServiceInstance(objArr);
    }

    public com.netcetera.threeds.sdk.api.transaction.Transaction get(CompletionEvent completionEvent, ProtocolErrorEvent protocolErrorEvent, setLayerType setlayertype, me meVar, ju juVar, setCacheColorHint.getWarnings getwarnings, String str, String str2, nh nhVar, setProgressTintMode setprogresstintmode, setProgressBackgroundTintList.getWarnings getwarnings2) {
        int i;
        Integer num;
        Integer num2;
        Object[] objArr;
        Object declaredConstructor;
        Integer num3;
        Integer num4;
        Integer num5;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        Object[] objArr5;
        Object[] objArr6;
        Object[] objArr7;
        try {
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(1217885709);
            if (obj != null) {
                num = 1001037017;
                i = 0;
                declaredConstructor = obj;
                num2 = 1175924713;
                objArr = null;
            } else {
                i = 0;
                num = 1001037017;
                num2 = 1175924713;
                objArr = null;
                declaredConstructor = ((Class) removeParam.initialize((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 48, (char) (63350 - (ViewConfiguration.getPressedStateDuration() >> 16)), 11536 - KeyEvent.normalizeMetaState(0))).getDeclaredConstructor(null);
                map.put(1217885709, declaredConstructor);
            }
            Object newInstance = ((Constructor) declaredConstructor).newInstance(objArr);
            RuntimeErrorEvent runtimeErrorEvent = this.initialize;
            setOnItemClickListener setonitemclicklistener = this.ThreeDS2Service;
            Object[] objArr8 = new Object[5];
            objArr8[4] = str;
            objArr8[3] = setonitemclicklistener;
            objArr8[2] = newInstance;
            objArr8[1] = protocolErrorEvent;
            objArr8[i] = runtimeErrorEvent;
            Object obj2 = map.get(25528514);
            if (obj2 != null) {
                num3 = 425247348;
                num4 = -168368230;
                num5 = 75843292;
            } else {
                int i2 = i;
                num3 = 425247348;
                num4 = -168368230;
                num5 = 75843292;
                obj2 = ((Class) removeParam.initialize(48 - Color.argb(i2, i2, i2, i2), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.resolveSizeAndState(i2, i2, i2) + 11441)).getDeclaredConstructor(RuntimeErrorEvent.class, ProtocolErrorEvent.class, setShiftDrawingOffsetForStartOverhang.class, setOnItemClickListener.class, String.class);
                map.put(25528514, obj2);
            }
            setUseBoundsForWidth setuseboundsforwidth = (setUseBoundsForWidth) ((Constructor) obj2).newInstance(objArr8);
            Object[] objArr9 = {setlayertype.getSDKInfo().get()};
            Object obj3 = map.get(762079114);
            if (obj3 == null) {
                obj3 = ((Class) removeParam.initialize((ViewConfiguration.getPressedStateDuration() >> 16) + 63, (char) (ViewConfiguration.getPressedStateDuration() >> 16), 4571 - View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod("get", Set.class);
                map.put(762079114, obj3);
            }
            Object invoke = ((Method) obj3).invoke(null, objArr9);
            Object obj4 = this.getWarnings;
            Object[] objArr10 = {str2};
            Object obj5 = map.get(-530488174);
            if (obj5 == null) {
                obj5 = ((Class) removeParam.initialize((AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 64, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.blue(0) + 5011)).getMethod("get", String.class);
                map.put(-530488174, obj5);
            }
            KeyPair keyPair = (KeyPair) ((Method) obj5).invoke(obj4, objArr10);
            setBreakStrategy warnings$4f6930a6 = setBreakStrategy.getWarnings$4f6930a6(invoke);
            fx warnings = this.ThreeDS2ServiceInstance.getWarnings(getwarnings);
            iv ivVar = new iv(completionEvent, setuseboundsforwidth, str2, warnings, keyPair, (ih) ih.get(new Object[]{warnings$4f6930a6, keyPair, juVar, str2, this.ThreeDS2Service.ThreeDS2Service(getwarnings), warnings, getwarnings2}, 1474449817, -1474449817, (int) System.currentTimeMillis()), jm.ThreeDS2Service((jj) jj.ThreeDS2ServiceInstance(new Object[]{setlayertype, this.createTransaction, meVar}, -1884160052, 1884160052, (int) System.currentTimeMillis()), juVar), new nc(), (je) jg.getWarnings(new Object[0], 273640014, -273640012, (int) System.currentTimeMillis()), nhVar);
            Object obj6 = this.get;
            Object[] objArr11 = {ivVar};
            Object obj7 = map.get(-857926637);
            if (obj7 == null) {
                obj7 = ((Class) removeParam.initialize(TextUtils.getOffsetBefore("", 0) + 49, (char) ((Process.getThreadPriority(0) + 20) >> 6), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 11332)).getMethod("initialize", com.netcetera.threeds.sdk.api.transaction.Transaction.class);
                map.put(-857926637, obj7);
            }
            Object invoke2 = ((Method) obj7).invoke(obj6, objArr11);
            Object obj8 = map.get(-942303663);
            if (obj8 != null) {
                objArr2 = null;
            } else {
                objArr2 = null;
                obj8 = ((Class) removeParam.initialize(KeyEvent.keyCodeFromString("") + 59, (char) (TextUtils.lastIndexOf("", '0', 0) + 24832), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 11381)).getMethod("getWarnings", null);
                map.put(-942303663, obj8);
            }
            Object invoke3 = ((Method) obj8).invoke(invoke2, objArr2);
            Object obj9 = map.get(625432144);
            if (obj9 != null) {
                objArr3 = null;
            } else {
                objArr3 = null;
                obj9 = ((Class) removeParam.initialize((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 59, (char) (24831 - Gravity.getAbsoluteGravity(0, 0)), 11382 - TextUtils.getOffsetBefore("", 0))).getMethod("initialize", null);
                map.put(625432144, obj9);
            }
            Object invoke4 = ((Method) obj9).invoke(invoke3, objArr3);
            Object[] objArr12 = {setprogresstintmode, getwarnings2};
            Integer num6 = num5;
            Object obj10 = map.get(num6);
            if (obj10 == null) {
                obj10 = ((Class) removeParam.initialize(60 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((Process.myTid() >> 22) + 24831), 11382 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("initialize", setProgressTintMode.class, setProgressBackgroundTintList.getWarnings.class);
                map.put(num6, obj10);
            }
            Object invoke5 = ((Method) obj10).invoke(invoke4, objArr12);
            Integer num7 = num4;
            Object obj11 = map.get(num7);
            if (obj11 != null) {
                objArr4 = null;
            } else {
                objArr4 = null;
                obj11 = ((Class) removeParam.initialize((ViewConfiguration.getTouchSlop() >> 8) + 59, (char) (Color.argb(0, 0, 0, 0) + 24831), (-16765834) - Color.rgb(0, 0, 0))).getMethod("get", null);
                map.put(num7, obj11);
            }
            Object invoke6 = ((Method) obj11).invoke(invoke5, objArr4);
            Integer num8 = num3;
            Object obj12 = map.get(num8);
            if (obj12 != null) {
                objArr5 = null;
            } else {
                objArr5 = null;
                obj12 = ((Class) removeParam.initialize(59 - Color.red(0), (char) (24831 - Gravity.getAbsoluteGravity(0, 0)), 11382 - (Process.myTid() >> 22))).getMethod("ThreeDS2Service", null);
                map.put(num8, obj12);
            }
            Object invoke7 = ((Method) obj12).invoke(invoke6, objArr5);
            Integer num9 = num2;
            Object obj13 = map.get(num9);
            if (obj13 != null) {
                objArr6 = null;
            } else {
                objArr6 = null;
                obj13 = ((Class) removeParam.initialize(View.MeasureSpec.getSize(0) + 59, (char) (24830 - ExpandableListView.getPackedPositionChild(0L)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11381)).getMethod("ThreeDS2ServiceInstance", null);
                map.put(num9, obj13);
            }
            Object invoke8 = ((Method) obj13).invoke(invoke7, objArr6);
            Integer num10 = num;
            Object obj14 = map.get(num10);
            if (obj14 != null) {
                objArr7 = null;
            } else {
                objArr7 = null;
                obj14 = ((Class) removeParam.initialize(58 - TextUtils.lastIndexOf("", '0'), (char) (24831 - KeyEvent.getDeadChar(0, 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11382)).getMethod("ThreeDS2ServiceInitializationCallback", null);
                map.put(num10, obj14);
            }
            com.netcetera.threeds.sdk.api.transaction.Transaction transaction = (com.netcetera.threeds.sdk.api.transaction.Transaction) ((Method) obj14).invoke(invoke8, objArr7);
            cleanup = (getSDKVersion + 71) % 128;
            return transaction;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
