package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1iSDKG18222$AFa1vSDK implements OnCompleteListener<IntegrityTokenResponse> {
    private /* synthetic */ AFi1jSDK AFAdRevenueData;
    private final long getCurrencyIso4217Code;

    public AFi1iSDKG18222$AFa1vSDK(AFi1jSDK aFi1jSDK, long j2) {
        this.AFAdRevenueData = aFi1jSDK;
        this.getCurrencyIso4217Code = j2;
    }

    public final void onComplete(Task<IntegrityTokenResponse> task) throws Throwable {
        Object objInvoke;
        String str;
        Intrinsics.checkNotNullParameter(task, "");
        if (task.isSuccessful()) {
            str = ((IntegrityTokenResponse) task.getResult()).token();
            objInvoke = null;
        } else {
            try {
                Object[] objArr = {this.AFAdRevenueData, task.getException()};
                Map map = AFi1hSDK.registerClient;
                Object method = map.get(2144477203);
                if (method == null) {
                    method = ((Class) AFi1hSDK.getMonetizationNetwork(AndroidCharacter.getMirror('0') - 11, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (64180 - Color.red(0)))).getMethod("getMonetizationNetwork", (Class) AFi1hSDK.getMonetizationNetwork(38 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 64179)), Exception.class);
                    map.put(2144477203, method);
                }
                objInvoke = ((Method) method).invoke(null, objArr);
                str = null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        Object[] objArr2 = {this.AFAdRevenueData, Long.valueOf(this.getCurrencyIso4217Code), str, objInvoke};
        Map map2 = AFi1hSDK.registerClient;
        Object method2 = map2.get(1691062553);
        if (method2 == null) {
            method2 = ((Class) AFi1hSDK.getMonetizationNetwork((ViewConfiguration.getScrollBarSize() >> 8) + 37, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) ((-16713036) - Color.rgb(0, 0, 0)))).getMethod("getMonetizationNetwork", (Class) AFi1hSDK.getMonetizationNetwork(Gravity.getAbsoluteGravity(0, 0) + 37, Process.getGidForName("") + 1, (char) ((-16713036) - Color.rgb(0, 0, 0))), Long.TYPE, String.class, String.class);
            map2.put(1691062553, method2);
        }
        ((Method) method2).invoke(null, objArr2);
        Object[] objArr3 = {this.AFAdRevenueData};
        Object method3 = map2.get(-650568520);
        if (method3 == null) {
            method3 = ((Class) AFi1hSDK.getMonetizationNetwork(36 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), ViewConfiguration.getWindowTouchSlop() >> 8, (char) (64180 - TextUtils.indexOf("", "", 0, 0)))).getMethod("getRevenue", (Class) AFi1hSDK.getMonetizationNetwork((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 36, KeyEvent.normalizeMetaState(0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 64181)));
            map2.put(-650568520, method3);
        }
        ((CountDownLatch) ((Method) method3).invoke(null, objArr3)).countDown();
    }
}
