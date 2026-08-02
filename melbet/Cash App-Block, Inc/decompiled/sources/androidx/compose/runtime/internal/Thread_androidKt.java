package androidx.compose.runtime.internal;

import android.os.Looper;

/* loaded from: classes.dex */
public abstract class Thread_androidKt {
    public static final long MainThreadId;

    static {
        long j;
        try {
            j = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j = -1;
        }
        MainThreadId = j;
    }
}
