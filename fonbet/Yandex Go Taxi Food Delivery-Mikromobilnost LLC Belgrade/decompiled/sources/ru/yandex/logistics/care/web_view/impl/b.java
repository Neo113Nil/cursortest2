package ru.yandex.logistics.care.web_view.impl;

import androidx.compose.foundation.gestures.c;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import defpackage.hwd0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes4.dex */
public final class b implements PointerInputEventHandler {
    public static final b a = new b();

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(hwd0 hwd0Var, Continuation continuation) {
        Object l = c.l(hwd0Var, new CareWebViewLauncherImpl$BoxTouchBlocker$1$1$1(2, null), continuation);
        return l == CoroutineSingletons.COROUTINE_SUSPENDED ? l : zy11.a;
    }
}
