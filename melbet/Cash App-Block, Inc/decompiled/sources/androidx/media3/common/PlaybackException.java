package androidx.media3.common;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.util.Util;

/* loaded from: classes3.dex */
public class PlaybackException extends Exception {
    public final int errorCode;
    public final long timestampMs;

    static {
        Fragment$5$$ExternalSyntheticOutline0.m$1(0, 1, 2, 3, 4);
        Util.intToStringMaxRadix(5);
    }

    public PlaybackException(String str, Throwable th, int i, long j) {
        super(str, th);
        this.errorCode = i;
        this.timestampMs = j;
    }
}
