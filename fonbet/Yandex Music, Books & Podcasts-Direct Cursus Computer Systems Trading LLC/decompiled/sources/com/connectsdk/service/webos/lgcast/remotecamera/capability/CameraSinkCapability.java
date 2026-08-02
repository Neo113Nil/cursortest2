package com.connectsdk.service.webos.lgcast.remotecamera.capability;

import com.connectsdk.service.config.ServiceDescription;
import com.connectsdk.service.webos.lgcast.common.utils.Logger;
import defpackage.e7o;
import defpackage.hrg;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CameraSinkCapability {
    public String devicePlatform;
    public String deviceSoC;
    public String deviceType;
    public String deviceVersion;
    public String ipAddress;
    public int keepAliveTimeout;
    public String publicKey;

    public CameraSinkCapability(JSONObject jSONObject) {
        if (jSONObject == null) {
            e7o.e();
            throw null;
        }
        this.ipAddress = jSONObject.optString(ServiceDescription.KEY_IP_ADDRESS, "0.0.0.0");
        this.keepAliveTimeout = jSONObject.optInt("keepAliveTimeout", 60) * 1000;
        this.publicKey = jSONObject.optString("publicKey");
        if (jSONObject.has("deviceInfo")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("deviceInfo");
            this.deviceType = optJSONObject.optString("type");
            this.deviceVersion = optJSONObject.optString("version");
            this.devicePlatform = optJSONObject.optString("platform");
            this.deviceSoC = optJSONObject.optString("SoC");
        }
    }

    public void debug() {
        StringBuilder u = hrg.u("ipAddress=" + this.ipAddress, "keepAliveTimeout=", new Object[0]);
        u.append(this.keepAliveTimeout);
        StringBuilder u2 = hrg.u(u.toString(), "deviceType=", new Object[0]);
        u2.append(this.deviceType);
        StringBuilder u3 = hrg.u(u2.toString(), "deviceVersion=", new Object[0]);
        u3.append(this.deviceVersion);
        StringBuilder u4 = hrg.u(u3.toString(), "devicePlatform=", new Object[0]);
        u4.append(this.devicePlatform);
        StringBuilder u5 = hrg.u(u4.toString(), "deviceSoC=", new Object[0]);
        u5.append(this.deviceSoC);
        Logger.debug(u5.toString(), new Object[0]);
        Logger.debug("", new Object[0]);
    }
}
