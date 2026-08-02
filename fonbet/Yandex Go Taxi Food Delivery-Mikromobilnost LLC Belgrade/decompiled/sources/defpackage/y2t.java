package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;

/* loaded from: classes.dex */
public final class y2t {
    public final GestureDetector a;

    public y2t(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.a = new GestureDetector(context, onGestureListener, handler);
    }
}
