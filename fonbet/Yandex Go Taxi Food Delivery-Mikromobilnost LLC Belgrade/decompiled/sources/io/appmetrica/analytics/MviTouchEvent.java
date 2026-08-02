package io.appmetrica.analytics;

import android.content.Context;
import android.view.MotionEvent;
import defpackage.gfp0;

/* loaded from: classes11.dex */
public class MviTouchEvent {
    private final gfp0 a;

    private MviTouchEvent(gfp0 gfp0Var) {
        this.a = gfp0Var;
    }

    public static MviTouchEvent from(Context context, MotionEvent motionEvent) {
        return new MviTouchEvent(new gfp0(context, motionEvent));
    }

    public gfp0 getTouch() {
        return this.a;
    }

    public String toString() {
        return "MviTouchEvent{touch=" + this.a + '}';
    }
}
