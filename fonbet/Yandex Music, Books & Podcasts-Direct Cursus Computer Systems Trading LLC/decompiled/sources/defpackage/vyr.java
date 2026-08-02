package defpackage;

import android.os.Build;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;

/* loaded from: classes4.dex */
public enum vyr {
    StatusBar(RemoteCameraConfig.Notification.ID),
    NavigationBar(Build.VERSION.SDK_INT >= 27 ? 16 : 0);

    public final int a;

    vyr(int i) {
        this.a = i;
    }
}
