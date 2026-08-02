package com.netcetera.threeds.sdk.infrastructure;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.infrastructure.setScrollCaptureCallback;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class setFrameContentVelocity implements setTooltipText {
    private static int get = 1;
    private static int initialize;
    private final no ThreeDS2ServiceInstance = (no) nu.initialize(new Object[]{setIsCredential.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private final setLayoutTransition getWarnings;

    public setFrameContentVelocity(setLayoutTransition setlayouttransition) {
        this.getWarnings = setlayouttransition;
    }

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        ((Number) objArr[0]).longValue();
        ((Number) objArr[1]).longValue();
        int i = initialize;
        int i2 = i & 79;
        get = SVG$Unit$EnumUnboxingLocalUtility.m$1((i | 79) & (~i2), ~(-(-(i2 << 1))), 1, 128);
        try {
            Object[] objArr2 = {((Class) removeParam.initialize(78 - (Process.myPid() >> 22), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 10195), 7935 - (ViewConfiguration.getLongPressTimeout() >> 16))).getField("initialize").get(null), Boolean.TRUE};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(-1643948346);
            if (obj == null) {
                obj = ((Class) removeParam.initialize(View.getDefaultSize(0, 0) + 78, (char) (59653 - TextUtils.indexOf("", "", 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 7710)).getMethod("get", (Class) removeParam.initialize(77 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (KeyEvent.normalizeMetaState(0) + 10195), 7935 - (ViewConfiguration.getTapTimeout() >> 16)), Boolean.TYPE);
                map.put(-1643948346, obj);
            }
            ((Method) obj).invoke(null, objArr2);
            int i3 = get;
            int i4 = i3 & 31;
            int i5 = ((i3 | 31) & (~i4)) + (i4 << 1);
            initialize = i5 % 128;
            if (i5 % 2 == 0) {
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

    public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = ~(i4 | i5);
        int i7 = (i6 * 576) + (((~(i | (~i3) | i5)) | (~(i2 | i4))) * 576) + (((~(i5 | i3)) | i6) * 576) + (i2 * (-575)) + (i * (-575));
        if (i7 != 1) {
            return i7 != 2 ? initialize(objArr) : ThreeDS2Service(objArr);
        }
        setFrameContentVelocity setframecontentvelocity = (setFrameContentVelocity) objArr[0];
        setScrollCaptureCallback setscrollcapturecallback = (setScrollCaptureCallback) objArr[1];
        System.identityHashCode(setframecontentvelocity);
        System.identityHashCode(setframecontentvelocity);
        com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent warnings = setframecontentvelocity.getWarnings.getWarnings(setscrollcapturecallback);
        setframecontentvelocity.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(warnings.getErrorMessage(), setscrollcapturecallback.getCause());
        setframecontentvelocity.get(warnings);
        get = (initialize + 49) % 128;
        return null;
    }

    public static void getWarnings(long j, long j2) {
        ThreeDS2ServiceInstance(new Object[]{Long.valueOf(j), Long.valueOf(j2)}, -1488473257, 1488473259, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        setFrameContentVelocity setframecontentvelocity = (setFrameContentVelocity) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = initialize;
        int i2 = ((i ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | (i & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) << 1;
        int i3 = -(((~i) & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) | (i & (-124)));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        get = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        if (th instanceof setScrollCaptureCallback) {
            ThreeDS2ServiceInstance(new Object[]{setframecontentvelocity, (setScrollCaptureCallback) th}, -76320228, 76320229, System.identityHashCode(setframecontentvelocity));
            int i5 = initialize;
            int i6 = i5 & 99;
            int i7 = (i5 ^ 99) | i6;
            get = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
        } else {
            ThreeDS2ServiceInstance(new Object[]{setframecontentvelocity, ((setScrollCaptureCallback.initialize) setScrollCaptureCallback.getWarnings(new Object[]{setTextAlignment.getWarnings}, -1667499669, 1667499669, (int) System.currentTimeMillis())).ThreeDS2Service(th.getMessage()).ThreeDS2Service(th).ThreeDS2ServiceInstance()}, -76320228, 76320229, System.identityHashCode(setframecontentvelocity));
            int i8 = initialize;
            get = (((i8 | 95) << 1) - (i8 ^ 95)) % 128;
        }
        int i9 = initialize;
        int i10 = ((i9 | 41) << 1) - (i9 ^ 41);
        get = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public abstract void get(com.netcetera.threeds.sdk.api.transaction.challenge.events.RuntimeErrorEvent runtimeErrorEvent);

    @Override // com.netcetera.threeds.sdk.infrastructure.setTooltipText
    public final void get(Throwable th) {
        ThreeDS2ServiceInstance(new Object[]{this, th}, 1321728641, -1321728641, System.identityHashCode(this));
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTooltipText
    public final void get(setScrollCaptureCallback setscrollcapturecallback) {
        ThreeDS2ServiceInstance(new Object[]{this, setscrollcapturecallback}, -76320228, 76320229, System.identityHashCode(this));
    }
}
