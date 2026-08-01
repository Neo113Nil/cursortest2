package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes2.dex */
public interface Jz {
    RunnableFutureC2966bE a(Context context);

    void b(MotionEvent motionEvent);

    String c();

    RunnableFutureC2966bE d(Context context, View view, Activity activity);

    RunnableFutureC2966bE e(Context context, String str, View view);

    ID f();

    int h();
}
