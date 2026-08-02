package defpackage;

import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;

/* loaded from: classes4.dex */
public class zsr implements ca20, tsr {
    public Context a;
    public ea20 b;
    public Ringtone c;

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        Context context = ssrVar.a;
        tt5 tt5Var = ssrVar.c;
        this.a = context;
        new RingtoneManager(this.a).setStopPreviousRingtone(true);
        ea20 ea20Var = new ea20(tt5Var, "flutter_ringtone_player");
        this.b = ea20Var;
        ea20Var.b(this);
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        this.a = null;
        this.b.b(null);
        this.b = null;
    }

    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        Uri uri;
        try {
            if (x920Var.a.equals("play")) {
                uri = x920Var.c(LaunchBrowserActivity.KEY_URI) ? Uri.parse((String) x920Var.a(LaunchBrowserActivity.KEY_URI)) : null;
                if (x920Var.c(ConstantDeviceInfo.APP_PLATFORM)) {
                    int intValue = ((Integer) x920Var.a(ConstantDeviceInfo.APP_PLATFORM)).intValue();
                    if (intValue == 1) {
                        uri = RingtoneManager.getActualDefaultRingtoneUri(this.a, 4);
                    } else if (intValue == 2) {
                        uri = RingtoneManager.getActualDefaultRingtoneUri(this.a, 2);
                    } else if (intValue != 3) {
                        ((ba20) da20Var).notImplemented();
                    } else {
                        uri = RingtoneManager.getActualDefaultRingtoneUri(this.a, 1);
                    }
                }
            } else {
                if (x920Var.a.equals("stop")) {
                    Ringtone ringtone = this.c;
                    if (ringtone != null) {
                        ringtone.stop();
                    }
                    ((ba20) da20Var).success(null);
                }
                uri = null;
            }
            if (uri != null) {
                Ringtone ringtone2 = this.c;
                if (ringtone2 != null) {
                    ringtone2.stop();
                }
                this.c = RingtoneManager.getRingtone(this.a, uri);
                if (x920Var.c("volume")) {
                    this.c.setVolume((float) ((Double) x920Var.a("volume")).doubleValue());
                }
                if (x920Var.c("looping")) {
                    this.c.setLooping(((Boolean) x920Var.a("looping")).booleanValue());
                }
                if (x920Var.c("asAlarm") && ((Boolean) x920Var.a("asAlarm")).booleanValue()) {
                    this.c.setStreamType(4);
                }
                this.c.play();
                ((ba20) da20Var).success(null);
            }
        } catch (Exception e) {
            ((ba20) da20Var).error("Exception", e.getMessage(), null);
        }
    }
}
