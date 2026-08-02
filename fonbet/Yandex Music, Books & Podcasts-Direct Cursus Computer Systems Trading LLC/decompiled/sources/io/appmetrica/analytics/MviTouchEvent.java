package io.appmetrica.analytics;

import android.content.Context;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import defpackage.hvo;

/* loaded from: classes5.dex */
public class MviTouchEvent {
    private final hvo a;

    private MviTouchEvent(hvo hvoVar) {
        this.a = hvoVar;
    }

    public static MviTouchEvent from(@NonNull Context context, @NonNull MotionEvent motionEvent) {
        return new MviTouchEvent(new hvo(context, motionEvent));
    }

    @NonNull
    public hvo getTouch() {
        return this.a;
    }

    @NonNull
    public String toString() {
        return "MviTouchEvent{touch=" + this.a + '}';
    }
}
