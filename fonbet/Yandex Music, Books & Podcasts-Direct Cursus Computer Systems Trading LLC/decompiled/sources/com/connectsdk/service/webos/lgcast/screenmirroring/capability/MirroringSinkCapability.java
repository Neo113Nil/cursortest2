package com.connectsdk.service.webos.lgcast.screenmirroring.capability;

import com.connectsdk.service.config.ServiceDescription;
import com.connectsdk.service.webos.lgcast.common.utils.Logger;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import defpackage.e7o;
import defpackage.hrg;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MirroringSinkCapability {
    public String audioCodec;
    public int audioUdpPort;
    public String devicePlatform;
    public String deviceSoC;
    public String deviceType;
    public String deviceVersion;
    public String displayOrientation;
    public String ipAddress;
    public int keepAliveTimeout;
    public String publicKey;
    public String supportedOrientation;
    public String videoCodec;
    public int videoLandscapeMaxHeight;
    public int videoLandscapeMaxWidth;
    public int videoPortraitMaxHeight;
    public int videoPortraitMaxWidth;
    public int videoUdpPort;

    public MirroringSinkCapability(JSONObject jSONObject) {
        if (jSONObject == null) {
            e7o.e();
            throw null;
        }
        this.ipAddress = jSONObject.optString(ServiceDescription.KEY_IP_ADDRESS, "127.0.0.1");
        this.keepAliveTimeout = jSONObject.optInt("keepAliveTimeout", 60) * 1000;
        this.publicKey = jSONObject.optString("publicKey");
        JSONObject optJSONObject = jSONObject.optJSONObject("deviceInfo");
        if (optJSONObject != null) {
            this.deviceType = optJSONObject.optString("type");
            this.deviceVersion = optJSONObject.optString("version");
            this.devicePlatform = optJSONObject.optString("platform");
            this.deviceSoC = optJSONObject.optString("SoC");
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mirroring");
        if (optJSONObject2 != null) {
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("video");
            if (optJSONObject3 != null) {
                this.videoCodec = optJSONObject3.optString("codec");
                this.videoUdpPort = optJSONObject3.optInt("udpPort");
                JSONObject optJSONObject4 = optJSONObject3.optJSONObject("portrait");
                if (optJSONObject4 != null) {
                    this.videoPortraitMaxWidth = optJSONObject4.optInt("maxWidth", ScreenMirroringConfig.Video.DEFAULT_HEIGHT);
                    this.videoPortraitMaxHeight = optJSONObject4.optInt("maxHeight", ScreenMirroringConfig.Video.DEFAULT_WIDTH);
                }
                JSONObject optJSONObject5 = optJSONObject3.optJSONObject("landscape");
                if (optJSONObject5 != null) {
                    this.videoLandscapeMaxWidth = optJSONObject5.optInt("maxWidth", ScreenMirroringConfig.Video.DEFAULT_WIDTH);
                    this.videoLandscapeMaxHeight = optJSONObject5.optInt("maxHeight", ScreenMirroringConfig.Video.DEFAULT_HEIGHT);
                } else {
                    this.videoLandscapeMaxWidth = ScreenMirroringConfig.Video.DEFAULT_WIDTH;
                    this.videoLandscapeMaxHeight = ScreenMirroringConfig.Video.DEFAULT_HEIGHT;
                }
            }
            JSONObject optJSONObject6 = optJSONObject2.optJSONObject(CameraProperty.AUDIO);
            if (optJSONObject6 != null) {
                this.audioCodec = optJSONObject6.optString("codec", "none");
                this.audioUdpPort = optJSONObject6.optInt("udpPort");
            }
            JSONObject optJSONObject7 = optJSONObject2.optJSONObject("supportedFeatures");
            if (optJSONObject7 != null) {
                this.supportedOrientation = optJSONObject7.optString("screenOrientation", "landscape");
            }
            this.displayOrientation = optJSONObject2.optString("displayOrientation", "landscape");
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
        StringBuilder u6 = hrg.u(u5.toString(), "videoCodec=", new Object[0]);
        u6.append(this.videoCodec);
        StringBuilder u7 = hrg.u(u6.toString(), "videoUdpPort=", new Object[0]);
        u7.append(this.videoUdpPort);
        StringBuilder u8 = hrg.u(u7.toString(), "videoPortraitMaxWidth=", new Object[0]);
        u8.append(this.videoPortraitMaxWidth);
        StringBuilder u9 = hrg.u(u8.toString(), "videoPortraitMaxHeight=", new Object[0]);
        u9.append(this.videoPortraitMaxHeight);
        StringBuilder u10 = hrg.u(u9.toString(), "videoLandscapeMaxWidth=", new Object[0]);
        u10.append(this.videoLandscapeMaxWidth);
        StringBuilder u11 = hrg.u(u10.toString(), "videoLandscapeMaxHeight=", new Object[0]);
        u11.append(this.videoLandscapeMaxHeight);
        StringBuilder u12 = hrg.u(u11.toString(), "audioCodec=", new Object[0]);
        u12.append(this.audioCodec);
        StringBuilder u13 = hrg.u(u12.toString(), "audioUdpPort=", new Object[0]);
        u13.append(this.audioUdpPort);
        StringBuilder u14 = hrg.u(u13.toString(), "supportedOrientation=", new Object[0]);
        u14.append(this.supportedOrientation);
        StringBuilder u15 = hrg.u(u14.toString(), "displayOrientation=", new Object[0]);
        u15.append(this.displayOrientation);
        Logger.debug(u15.toString(), new Object[0]);
        Logger.debug("", new Object[0]);
    }

    public boolean isDisplayLandscape() {
        return "landscape".equals(this.displayOrientation);
    }

    public boolean isDisplayPortrait() {
        return "portrait".equals(this.displayOrientation);
    }

    public boolean isSupportLandscapeMode() {
        String str = this.supportedOrientation;
        return str != null && str.contains("landscape");
    }

    public boolean isSupportPortraitMode() {
        String str = this.supportedOrientation;
        return str != null && str.contains("portrait");
    }

    public MirroringSinkCapability() {
    }
}
