package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class dv implements compute {
    private static int get = 0;
    private static int getSDKInfo = 1;
    private compute ThreeDS2ServiceInstance;
    private final no ThreeDS2Service = (no) nu.initialize(new Object[]{dv.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private volatile boolean getWarnings = false;

    public static void ThreeDS2ServiceInstance(long j, long j2) {
        get = (getSDKInfo + 37) % 128;
        try {
            Object[] objArr = {((Class) removeParam.initialize('~' - AndroidCharacter.getMirror('0'), (char) (Color.alpha(0) + 10195), 7935 - TextUtils.indexOf("", ""))).getField("getWarnings").get(null), Boolean.TRUE};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(-1643948346);
            if (obj == null) {
                obj = ((Class) removeParam.initialize(KeyEvent.getDeadChar(0, 0) + 78, (char) (59701 - AndroidCharacter.getMirror('0')), 7710 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).getMethod("get", (Class) removeParam.initialize((ViewConfiguration.getPressedStateDuration() >> 16) + 78, (char) (10195 - Color.red(0)), (Process.myPid() >> 22) + 7935), Boolean.TYPE);
                map.put(-1643948346, obj);
            }
            ((Method) obj).invoke(null, objArr);
            int i = get + 79;
            getSDKInfo = i % 128;
            if (i % 2 == 0) {
                int i2 = 63 / 0;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.compute
    public void ThreeDS2Service(replace replaceVar) {
        if (this.ThreeDS2ServiceInstance == null || this.getWarnings) {
            CdmaCellLocation.convertQuartSecToDecDegrees(0);
        } else {
            get = (getSDKInfo + 29) % 128;
            Color.rgb(0, 0, 0);
            this.getWarnings = true;
            this.ThreeDS2ServiceInstance.ThreeDS2Service(replaceVar);
            get = (getSDKInfo + 111) % 128;
        }
        int i = get + 75;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            int i2 = 18 / 0;
        }
    }

    public void get(compute computeVar) {
        int i = (getSDKInfo + 27) % 128;
        get = i;
        this.ThreeDS2ServiceInstance = computeVar;
        getSDKInfo = (i + 3) % 128;
    }
}
