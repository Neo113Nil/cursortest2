package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* loaded from: classes.dex */
public final class xs7 {
    public final Spatializer a;
    public final boolean b;
    public final Handler c;
    public final ws7 d;

    public xs7(Context context, ct7 ct7Var) {
        AudioManager f = context == null ? null : fx1.f(context);
        if (f != null) {
            context.getClass();
            if (!dvt.W(context)) {
                Spatializer spatializer = f.getSpatializer();
                this.a = spatializer;
                this.b = spatializer.getImmersiveAudioLevel() != 0;
                ws7 ws7Var = new ws7(ct7Var);
                this.d = ws7Var;
                Looper myLooper = Looper.myLooper();
                vq1.B(myLooper);
                Handler handler = new Handler(myLooper);
                this.c = handler;
                spatializer.addOnSpatializerStateChangedListener(new dk7(handler, 0), ws7Var);
                return;
            }
        }
        this.a = null;
        this.b = false;
        this.c = null;
        this.d = null;
    }

    public final boolean a(dv1 dv1Var, dsc dscVar) {
        String str = dscVar.n;
        String str2 = dscVar.n;
        int i = dscVar.D;
        if (Objects.equals(str, "audio/eac3-joc")) {
            if (i == 16) {
                i = 12;
            }
        } else if (Objects.equals(str2, "audio/iamf")) {
            if (i == -1) {
                i = 6;
            }
        } else if (Objects.equals(str2, "audio/ac4") && (i == 18 || i == 21)) {
            i = 24;
        }
        int u = dvt.u(i);
        if (u == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(u);
        int i2 = dscVar.E;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.canBeSpatialized((AudioAttributes) dv1Var.b().a, channelMask.build());
    }

    public final boolean b() {
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.isAvailable();
    }

    public final boolean c() {
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.isEnabled();
    }

    public final void d() {
        ws7 ws7Var;
        Handler handler;
        Spatializer spatializer = this.a;
        if (spatializer == null || (ws7Var = this.d) == null || (handler = this.c) == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(ws7Var);
        handler.removeCallbacksAndMessages(null);
    }
}
