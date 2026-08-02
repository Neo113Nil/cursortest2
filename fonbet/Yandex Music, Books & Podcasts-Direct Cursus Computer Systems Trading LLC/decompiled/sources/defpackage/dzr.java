package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class dzr {
    public static final dzr a = new dzr();

    public final hzr a(Looper looper, Handler.Callback callback) {
        return new hzr(new Handler(looper, callback));
    }
}
