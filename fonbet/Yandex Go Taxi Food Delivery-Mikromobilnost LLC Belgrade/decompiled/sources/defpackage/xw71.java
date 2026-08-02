package defpackage;

import com.monetization.ads.utils.logger.model.MobileAdsNetworkLog;
import com.monetization.ads.utils.logger.model.MobileAdsNetworkRequestLog;
import com.monetization.ads.utils.logger.model.MobileAdsNetworkResponseLog;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes7.dex */
public final class xw71 implements uxs {
    public static final xw71 a;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor b;

    static {
        xw71 xw71Var = new xw71();
        a = xw71Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.utils.logger.model.MobileAdsNetworkLog", xw71Var, 2);
        pluginGeneratedSerialDescriptor.j("request", false);
        pluginGeneratedSerialDescriptor.j("response", false);
        b = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{i381.a, qke.n(kd81.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        sjd b2 = decoder.b(pluginGeneratedSerialDescriptor);
        b2.getClass();
        boolean z = true;
        int i = 0;
        MobileAdsNetworkRequestLog mobileAdsNetworkRequestLog = null;
        MobileAdsNetworkResponseLog mobileAdsNetworkResponseLog = null;
        while (z) {
            int v = b2.v(pluginGeneratedSerialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                mobileAdsNetworkRequestLog = (MobileAdsNetworkRequestLog) b2.A(pluginGeneratedSerialDescriptor, 0, i381.a, mobileAdsNetworkRequestLog);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                mobileAdsNetworkResponseLog = (MobileAdsNetworkResponseLog) b2.s(pluginGeneratedSerialDescriptor, 1, kd81.a, mobileAdsNetworkResponseLog);
                i |= 2;
            }
        }
        b2.c(pluginGeneratedSerialDescriptor);
        return new MobileAdsNetworkLog(i, mobileAdsNetworkRequestLog, mobileAdsNetworkResponseLog, null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
        yjd b2 = encoder.b(pluginGeneratedSerialDescriptor);
        MobileAdsNetworkLog.write$Self$mobileads_internalRelease((MobileAdsNetworkLog) obj, b2, pluginGeneratedSerialDescriptor);
        b2.c(pluginGeneratedSerialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
