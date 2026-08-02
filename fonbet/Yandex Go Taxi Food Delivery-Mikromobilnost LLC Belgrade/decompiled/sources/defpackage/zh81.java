package defpackage;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* loaded from: classes7.dex */
public abstract class zh81 {
    public static void a(AudioTrack audioTrack, wl61 wl61Var) {
        boolean equals;
        LogSessionId unused;
        sh61 sh61Var = wl61Var.a;
        sh61Var.getClass();
        LogSessionId logSessionId = sh61Var.a;
        unused = LogSessionId.LOG_SESSION_ID_NONE;
        equals = logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE);
        if (equals) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId);
    }
}
