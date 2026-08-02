package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;

/* loaded from: classes.dex */
public final class e6d {
    public final GestureDetector a;

    public e6d(Context context, GestureDetector.SimpleOnGestureListener simpleOnGestureListener, Handler handler) {
        this.a = new GestureDetector(context, simpleOnGestureListener, handler);
    }
}
