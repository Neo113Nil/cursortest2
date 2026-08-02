package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.api.info.CertificateInfo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.PublicKey;
import java.util.Map;

/* loaded from: classes5.dex */
public class setPointerIcon implements completed {
    private static int createTransaction = 1;
    private static int get;
    private static int[] initialize = {-1836877341, -560889026, 1286781299, -1037924781, 1785055254, 1510123637, -1477518755, -485120206, 857864784, 1002485691, 443688066, 1966050189, -1306543717, 1589381347, -423869717, -690921924, 389953159, -279595715};
    private final completed ThreeDS2Service;
    private final completed ThreeDS2ServiceInstance;
    private final no getWarnings = (no) nu.initialize(new Object[]{setPointerIcon.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());

    public setPointerIcon(completed completedVar, completed completedVar2) {
        this.ThreeDS2ServiceInstance = completedVar;
        this.ThreeDS2Service = completedVar2;
    }

    public static completed ThreeDS2ServiceInstance() {
        try {
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(1061544933);
            if (obj == null) {
                obj = ((Class) removeParam.initialize((Process.myPid() >> 22) + 70, (char) (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), 4501 - TextUtils.getOffsetBefore("", 0))).getDeclaredConstructor(null);
                map.put(1061544933, obj);
            }
            completed completedVar = (completed) ((Constructor) obj).newInstance(null);
            Object obj2 = map.get(1956144657);
            if (obj2 == null) {
                obj2 = ((Class) removeParam.initialize(59 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (53578 - ((Process.getThreadPriority(0) + 20) >> 6)), 4762 - Color.green(0))).getMethod("ThreeDS2ServiceInstance", null);
                map.put(1956144657, obj2);
            }
            setPointerIcon setpointericon = new setPointerIcon(completedVar, (completed) ((Method) obj2).invoke(null, null));
            int i = get + 53;
            createTransaction = i % 128;
            if (i % 2 != 0) {
                return setpointericon;
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

    private PublicKey initialize(completed completedVar, String str) {
        createTransaction = (get + 113) % 128;
        try {
            PublicKey ThreeDS2ServiceInstance = completedVar.ThreeDS2ServiceInstance(str);
            get = (createTransaction + 69) % 128;
            return ThreeDS2ServiceInstance;
        } catch (setScrollCaptureCallback unused) {
            ExpandableListView.getPackedPositionChild(0L);
            return null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.completed
    public CertificateInfo.CertificateType get(String str) {
        int i = createTransaction + 119;
        get = i % 128;
        int i2 = i % 2;
        completed completedVar = this.ThreeDS2ServiceInstance;
        try {
            if (i2 == 0) {
                return completedVar.get(str);
            }
            completedVar.get(str);
            throw null;
        } catch (setScrollCaptureCallback unused) {
            return this.ThreeDS2Service.get(str);
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.completed
    public PublicKey ThreeDS2ServiceInstance(String str) {
        int i = createTransaction + 51;
        get = i % 128;
        int i2 = i % 2;
        completed completedVar = this.ThreeDS2ServiceInstance;
        if (i2 != 0) {
            initialize(completedVar, str);
            throw null;
        }
        PublicKey initialize2 = initialize(completedVar, str);
        if (initialize2 != null) {
            int i3 = createTransaction + 81;
            get = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 53 / 0;
            }
            return initialize2;
        }
        PublicKey initialize3 = initialize(this.ThreeDS2Service, str);
        if (initialize3 != null) {
            get = (createTransaction + 85) % 128;
            return initialize3;
        }
        throw setTextAlignment.InvalidInputException.initialize(str);
    }
}
