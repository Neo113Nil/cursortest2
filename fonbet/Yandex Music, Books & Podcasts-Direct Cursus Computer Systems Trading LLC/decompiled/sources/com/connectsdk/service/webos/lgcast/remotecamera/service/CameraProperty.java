package com.connectsdk.service.webos.lgcast.remotecamera.service;

import com.connectsdk.service.webos.lgcast.common.utils.JSONObjectEx;
import com.connectsdk.service.webos.lgcast.common.utils.Logger;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.hrg;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CameraProperty {
    public static final String AUDIO = "audio";
    public static final String AUTO_WHITE_BALANCE = "autoWhiteBalance";
    public static final String BRIGHTNESS = "brightness";
    public static final String FACING = "facing";
    public static final String HEIGHT = "height";
    public static final String ROTATION = "rotation";
    public static final String WHITE_BALANCE = "whiteBalance";
    public static final String WIDTH = "width";
    public int width = 1280;
    public int height = 720;
    public int facing = 0;
    public int brightness = 50;
    public int whiteBalance = RemoteCameraConfig.Properties.DEFAULT_WHITE_BALANCE;
    public boolean autoWhiteBalance = false;
    public boolean audio = true;
    public int rotation = -1;

    public void debug() {
        StringBuilder u = hrg.u("width=" + this.width, "height=", new Object[0]);
        u.append(this.height);
        StringBuilder u2 = hrg.u(u.toString(), "facing=", new Object[0]);
        u2.append(this.facing);
        StringBuilder u3 = hrg.u(u2.toString(), "brightness=", new Object[0]);
        u3.append(this.brightness);
        StringBuilder u4 = hrg.u(u3.toString(), "whiteBalance=", new Object[0]);
        u4.append(this.whiteBalance);
        StringBuilder u5 = hrg.u(u4.toString(), "autoWhiteBalance=", new Object[0]);
        u5.append(this.autoWhiteBalance);
        StringBuilder u6 = hrg.u(u5.toString(), "audio=", new Object[0]);
        u6.append(this.audio);
        StringBuilder u7 = hrg.u(u6.toString(), "rotation=", new Object[0]);
        u7.append(this.rotation);
        Logger.debug(u7.toString(), new Object[0]);
        Logger.debug("", new Object[0]);
    }

    public JSONObject toJSONObject() {
        JSONObjectEx jSONObjectEx = new JSONObjectEx();
        jSONObjectEx.put(WIDTH, this.width);
        jSONObjectEx.put(HEIGHT, this.height);
        jSONObjectEx.put(FACING, this.facing);
        jSONObjectEx.put(BRIGHTNESS, this.brightness);
        jSONObjectEx.put(WHITE_BALANCE, this.whiteBalance);
        jSONObjectEx.put(AUTO_WHITE_BALANCE, this.autoWhiteBalance);
        jSONObjectEx.put(AUDIO, this.audio);
        jSONObjectEx.put(ROTATION, this.rotation);
        return jSONObjectEx.toJSONObject();
    }
}
