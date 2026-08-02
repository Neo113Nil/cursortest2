package com.netcetera.threeds.sdk.infrastructure;

import android.app.Activity;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeStatusReceiver;
import com.netcetera.threeds.sdk.infrastructure.setCacheColorHint;
import com.netcetera.threeds.sdk.infrastructure.setProgressBackgroundTintList;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.KeyPair;
import java.util.Map;

/* loaded from: classes5.dex */
class ih {
    private static int createTransaction = 0;
    private static int onCompleted = 1;
    private final ju ThreeDS2Service;
    private final fx ThreeDS2ServiceInitializationCallback;
    private final setBreakStrategy ThreeDS2ServiceInstance;
    private final mj<Activity> cleanup;
    private final String get;
    private final String getSDKInfo;
    private final setProgressBackgroundTintList.getWarnings getSDKVersion;
    private final KeyPair getWarnings;
    private final Object initialize;

    public ih(setBreakStrategy setbreakstrategy, KeyPair keyPair, ju juVar, String str, Object obj, String str2, fx fxVar, mj<Activity> mjVar, setProgressBackgroundTintList.getWarnings getwarnings) {
        this.ThreeDS2ServiceInstance = setbreakstrategy;
        this.getWarnings = keyPair;
        this.ThreeDS2Service = juVar;
        this.get = str;
        this.initialize = obj;
        this.getSDKInfo = str2;
        this.ThreeDS2ServiceInitializationCallback = fxVar;
        this.cleanup = mjVar;
        this.getSDKVersion = getwarnings;
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        setBreakStrategy setbreakstrategy = (setBreakStrategy) objArr[0];
        KeyPair keyPair = (KeyPair) objArr[1];
        ju juVar = (ju) objArr[2];
        String str = (String) objArr[3];
        String str2 = (String) objArr[4];
        fx fxVar = (fx) objArr[5];
        setProgressBackgroundTintList.getWarnings getwarnings = (setProgressBackgroundTintList.getWarnings) objArr[6];
        try {
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(330070146);
            if (obj == null) {
                obj = ((Class) removeParam.initialize(Color.rgb(0, 0, 0) + 16777276, (char) (1 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1))), View.MeasureSpec.getSize(0) + 5956)).getMethod("get", null);
                map.put(330070146, obj);
            }
            ih ihVar = new ih(setbreakstrategy, keyPair, juVar, str, ((Method) obj).invoke(null, null), str2, fxVar, mf.initialize(), getwarnings);
            int i4 = onCompleted;
            int i5 = i4 ^ 71;
            int i6 = (i4 & 71) << 1;
            createTransaction = ((i5 ^ i6) + ((i6 & i5) << 1)) % 128;
            return ihVar;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public setLetterSpacing ThreeDS2Service(Activity activity, com.netcetera.threeds.sdk.api.transaction.challenge.ChallengeParameters challengeParameters, ChallengeStatusReceiver challengeStatusReceiver, int i, com.netcetera.threeds.sdk.api.ui.ProgressView progressView, nh nhVar, iz izVar, jh jhVar) {
        char c;
        char c2;
        setLocalePreferredLineHeightForMinimumUsed ThreeDS2Service = this.ThreeDS2ServiceInstance.ThreeDS2Service(challengeParameters.getAcsSignedContent());
        setCacheColorHint.getWarnings initialize = this.ThreeDS2ServiceInitializationCallback.initialize();
        setFontFeatureSettings setfontfeaturesettings = new setFontFeatureSettings(challengeParameters, ThreeDS2Service, initialize, this.getWarnings, 0, this.get);
        setJustificationMode setjustificationmode = (setJustificationMode) setJustificationMode.ThreeDS2ServiceInstance(new Object[]{challengeStatusReceiver, setfontfeaturesettings.createTransaction(), initialize}, 1793143546, -1793143545, (int) System.currentTimeMillis());
        Object obj = this.initialize;
        try {
            Object[] objArr = {setfontfeaturesettings, this.getSDKInfo, this.ThreeDS2ServiceInitializationCallback, nhVar, jhVar, this.getSDKVersion};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj2 = map.get(-299647722);
            if (obj2 != null) {
                c = 4;
                c2 = 5;
            } else {
                c = 4;
                c2 = 5;
                obj2 = ((Class) removeParam.initialize((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 59, (char) ((-1) - MotionEvent.axisFromString("")), 5956 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("ThreeDS2ServiceInstance", setFontFeatureSettings.class, String.class, fx.class, nh.class, jh.class, setProgressBackgroundTintList.getWarnings.class);
                map.put(-299647722, obj2);
            }
            Object invoke = ((Method) obj2).invoke(obj, objArr);
            ii iiVar = new ii();
            iw iwVar = (iw) iw.get(new Object[]{setfontfeaturesettings, this.ThreeDS2ServiceInitializationCallback, izVar}, 1181349752, -1181349751, (int) System.currentTimeMillis());
            cj cjVar = new cj(this.ThreeDS2Service, activity, new setMaxLines(setfontfeaturesettings.cleanup()), this.ThreeDS2ServiceInitializationCallback, progressView, this.cleanup);
            setLinkTextColor setlinktextcolor = (setLinkTextColor) setLinkTextColor.ThreeDS2Service(new Object[]{Integer.valueOf(i)}, 316398404, -316398404, i);
            Object[] objArr2 = new Object[6];
            objArr2[c2] = iiVar;
            objArr2[c] = setlinktextcolor;
            objArr2[3] = cjVar;
            objArr2[2] = iwVar;
            objArr2[1] = invoke;
            objArr2[0] = setjustificationmode;
            Object obj3 = map.get(1690125500);
            if (obj3 == null) {
                obj3 = ((Class) removeParam.initialize(47 - View.MeasureSpec.getMode(0), (char) (25644 - TextUtils.indexOf("", "")), 11489 - Gravity.getAbsoluteGravity(0, 0))).getDeclaredConstructor(setJustificationMode.class, setHorizontalScrollbarOverlay.class, iw.class, cj.class, setLinkTextColor.class, ii.class);
                map.put(1690125500, obj3);
            }
            setLetterSpacing setletterspacing = (setLetterSpacing) ((Constructor) obj3).newInstance(objArr2);
            int i2 = createTransaction;
            int i3 = i2 & 53;
            int i4 = i3 + ((i2 ^ 53) | i3);
            onCompleted = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 99 / 0;
            }
            return setletterspacing;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
