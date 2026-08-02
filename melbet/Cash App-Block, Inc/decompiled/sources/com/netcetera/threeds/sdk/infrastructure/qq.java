package com.netcetera.threeds.sdk.infrastructure;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.security.PublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.Map;

/* loaded from: classes5.dex */
public class qq extends qn {

    public static class ThreeDS2Service extends qq {
        public ThreeDS2Service() {
            super("PS256", "SHA256withRSAandMGF1");
            MGF1ParameterSpec mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
            ThreeDS2ServiceInstance(new PSSParameterSpec(mGF1ParameterSpec.getDigestAlgorithm(), "MGF1", mGF1ParameterSpec, 32, 1));
        }
    }

    public static class ThreeDS2ServiceInstance extends qq {
        public ThreeDS2ServiceInstance() {
            super("RS384", "SHA384withRSA");
        }
    }

    public static class get extends qq {
        public get() {
            super("PS384", "SHA384withRSAandMGF1");
            MGF1ParameterSpec mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
            ThreeDS2ServiceInstance(new PSSParameterSpec(mGF1ParameterSpec.getDigestAlgorithm(), "MGF1", mGF1ParameterSpec, 48, 1));
        }
    }

    public static class getWarnings extends qq {
        public getWarnings() {
            super("RS256", "SHA256withRSA");
        }
    }

    public static class initialize extends qq {
        public initialize() {
            super("PS512", "SHA512withRSAandMGF1");
            MGF1ParameterSpec mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
            ThreeDS2ServiceInstance(new PSSParameterSpec(mGF1ParameterSpec.getDigestAlgorithm(), "MGF1", mGF1ParameterSpec, 64, 1));
        }
    }

    public qq(String str, String str2) {
        super(str, str2, "RSA");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.qn
    public void ThreeDS2ServiceInstance(PublicKey publicKey) {
        qv.get(publicKey);
    }

    public static class createTransaction extends qq {
        private static int get = 0;
        private static int initialize = 1;

        public createTransaction() {
            super("RS512", "SHA512withRSA");
        }

        private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
            ((Number) objArr[0]).longValue();
            ((Number) objArr[1]).longValue();
            int i = initialize;
            int i2 = i & 49;
            int i3 = (i | 49) & (~i2);
            int i4 = i2 << 1;
            get = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
            try {
                Object[] objArr2 = {((Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0', 0) + 79, (char) (10195 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 7936 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).getField("ThreeDS2Service").get(null), Boolean.TRUE};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1643948346);
                if (obj == null) {
                    obj = ((Class) removeParam.initialize(78 - TextUtils.indexOf("", "", 0, 0), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 59653), 7711 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("get", (Class) removeParam.initialize(77 - TextUtils.indexOf((CharSequence) "", '0'), (char) (10195 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1))), 7935 - (ViewConfiguration.getTouchSlop() >> 8)), Boolean.TYPE);
                    map.put(-1643948346, obj);
                }
                ((Method) obj).invoke(null, objArr2);
                int i5 = initialize;
                int i6 = i5 & 25;
                int i7 = (((i5 | 25) & (~i6)) - (~(-(-(i6 << 1))))) - 1;
                get = i7 % 128;
                if (i7 % 2 == 0) {
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

        public static /* synthetic */ Object getWarnings(Object[] objArr, int i, int i2, int i3) {
            return ThreeDS2ServiceInstance(objArr);
        }

        public static void ThreeDS2ServiceInstance(long j, long j2) {
            getWarnings(new Object[]{Long.valueOf(j), Long.valueOf(j2)}, -1610952523, 1610952523, (int) System.currentTimeMillis());
        }
    }
}
