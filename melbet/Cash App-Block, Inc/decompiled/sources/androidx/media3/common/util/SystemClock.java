package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class SystemClock {
    public static final SystemClock DEFAULT = new SystemClock();

    public final SystemHandlerWrapper createHandler(Looper looper, Handler.Callback callback) {
        return new SystemHandlerWrapper(new Handler(looper, callback));
    }
}
