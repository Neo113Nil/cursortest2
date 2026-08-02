package com.datadog.android.rum.internal.instrumentation.gestures;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class WindowCallbackWrapper$dispatchKeyEvent$1 extends Lambda implements Function0 {
    public static final WindowCallbackWrapper$dispatchKeyEvent$1 INSTANCE;
    public static final WindowCallbackWrapper$dispatchKeyEvent$1 INSTANCE$1;
    public static final WindowCallbackWrapper$dispatchKeyEvent$1 INSTANCE$2;
    public static final WindowCallbackWrapper$dispatchKeyEvent$1 INSTANCE$3;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE = new WindowCallbackWrapper$dispatchKeyEvent$1(i, 0);
        INSTANCE$1 = new WindowCallbackWrapper$dispatchKeyEvent$1(i, 1);
        INSTANCE$2 = new WindowCallbackWrapper$dispatchKeyEvent$1(i, 2);
        INSTANCE$3 = new WindowCallbackWrapper$dispatchKeyEvent$1(i, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WindowCallbackWrapper$dispatchKeyEvent$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return "Received null KeyEvent";
            case 1:
                return "Error processing MotionEvent";
            case 2:
                return "Received null MotionEvent";
            default:
                return "Wrapped Window.Callback failed processing event";
        }
    }
}
