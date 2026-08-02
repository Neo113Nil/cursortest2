package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes7.dex */
public final class vb81 {
    public final jse a;
    public final Handler b;

    public vb81(jse jseVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = jseVar;
        this.b = handler;
    }
}
