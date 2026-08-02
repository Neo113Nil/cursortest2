package com.connectsdk.service.webos.lgcast.screenmirroring.capability;

import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.common.utils.Logger;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import com.lge.lib.lgcast.iface.MasterKey;
import defpackage.hrg;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MirroringSourceCapability {
    public int audioChannels;
    public int audioClockRate;
    public String audioCodec;
    public int audioFrequency;
    public String audioStreamMuxConfig;
    public ArrayList<MasterKey> masterKeys;
    public String screenOrientation;
    public boolean uibcEnabled;
    public int videoActiveHeight;
    public int videoActiveWidth;
    public int videoClockRate;
    public String videoCodec;
    public int videoFramerate;
    public int videoHeight;
    public String videoOrientation;
    public int videoWidth;

    public void debug() {
        StringBuilder u = hrg.u("videoCodec=" + this.videoCodec, "videoClockRate=", new Object[0]);
        u.append(this.videoClockRate);
        StringBuilder u2 = hrg.u(u.toString(), "videoFramerate=", new Object[0]);
        u2.append(this.videoFramerate);
        StringBuilder u3 = hrg.u(u2.toString(), "videoWidth=", new Object[0]);
        u3.append(this.videoWidth);
        StringBuilder u4 = hrg.u(u3.toString(), "videoHeight=", new Object[0]);
        u4.append(this.videoHeight);
        StringBuilder u5 = hrg.u(u4.toString(), "videoActiveWidth=", new Object[0]);
        u5.append(this.videoActiveWidth);
        StringBuilder u6 = hrg.u(u5.toString(), "videoActiveHeight=", new Object[0]);
        u6.append(this.videoActiveHeight);
        StringBuilder u7 = hrg.u(u6.toString(), "videoOrientation=", new Object[0]);
        u7.append(this.videoOrientation);
        StringBuilder u8 = hrg.u(u7.toString(), "audioCodec=", new Object[0]);
        u8.append(this.audioCodec);
        StringBuilder u9 = hrg.u(u8.toString(), "audioClockRate=", new Object[0]);
        u9.append(this.audioClockRate);
        StringBuilder u10 = hrg.u(u9.toString(), "audioFrequency=", new Object[0]);
        u10.append(this.audioFrequency);
        StringBuilder u11 = hrg.u(u10.toString(), "audioStreamMuxConfig=", new Object[0]);
        u11.append(this.audioStreamMuxConfig);
        StringBuilder u12 = hrg.u(u11.toString(), "audioChannels=", new Object[0]);
        u12.append(this.audioChannels);
        StringBuilder u13 = hrg.u(u12.toString(), "uibcEnabled=", new Object[0]);
        u13.append(this.uibcEnabled);
        StringBuilder u14 = hrg.u(u13.toString(), "screenOrientation=", new Object[0]);
        u14.append(this.screenOrientation);
        Logger.debug(u14.toString(), new Object[0]);
        Logger.debug("", new Object[0]);
    }

    public JSONObject toJSONObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("codec", this.videoCodec);
            jSONObject.put("clockRate", this.videoClockRate);
            jSONObject.put("framerate", this.videoFramerate);
            jSONObject.put(CameraProperty.WIDTH, this.videoWidth);
            jSONObject.put(CameraProperty.HEIGHT, this.videoHeight);
            jSONObject.put("activeWidth", this.videoActiveWidth);
            jSONObject.put("activeHeight", this.videoActiveHeight);
            jSONObject.put("orientation", this.videoOrientation);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("codec", this.audioCodec);
            jSONObject2.put("clockRate", this.audioClockRate);
            jSONObject2.put("frequency", this.audioFrequency);
            jSONObject2.put("streamMuxConfig", this.audioStreamMuxConfig);
            jSONObject2.put("channels", this.audioChannels);
            JSONArray jSONArray = new JSONArray();
            Iterator<MasterKey> it = this.masterKeys.iterator();
            while (it.hasNext()) {
                MasterKey next = it.next();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("mki", next.mkiSecureText);
                jSONObject3.put(PListParser.TAG_KEY, next.keySecureText);
                jSONArray.put(jSONObject3);
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("screenOrientation", this.screenOrientation);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("video", jSONObject);
            jSONObject5.put(CameraProperty.AUDIO, jSONObject2);
            jSONObject5.put("crypto", jSONArray);
            jSONObject5.put("uibcEnabled", this.uibcEnabled);
            jSONObject5.put("supportedFeatures", jSONObject4);
            return jSONObject5;
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }
}
