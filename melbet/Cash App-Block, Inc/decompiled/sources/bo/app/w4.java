package bo.app;

import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DeviceKey;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class w4 {
    public final void a(BrazeConfigurationProvider brazeConfigurationProvider, JSONObject jSONObject, DeviceKey deviceKey, Object obj) {
        brazeConfigurationProvider.getClass();
        jSONObject.getClass();
        deviceKey.getClass();
        if (!brazeConfigurationProvider.isDeviceObjectAllowlistEnabled() || brazeConfigurationProvider.getDeviceObjectAllowlist().contains(deviceKey)) {
            jSONObject.putOpt(deviceKey.getKey(), obj);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new h$$ExternalSyntheticLambda0(deviceKey, 24), 6, (Object) null);
        }
    }

    public static final String a(DeviceKey deviceKey) {
        return "Not adding device key <" + deviceKey + "> to export due to allowlist restrictions.";
    }
}
