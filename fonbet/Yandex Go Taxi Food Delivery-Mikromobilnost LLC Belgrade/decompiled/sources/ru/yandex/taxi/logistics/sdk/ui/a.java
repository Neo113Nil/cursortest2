package ru.yandex.taxi.logistics.sdk.ui;

import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes9.dex */
public abstract class a {
    public static final Object a(AppVisibilitySubscriptionImpl appVisibilitySubscriptionImpl, ContinuationImpl continuationImpl) {
        Object x = e.x(appVisibilitySubscriptionImpl.observe(), new AppVisibilitySubscriptionKt$awaitForeground$2(2, null), continuationImpl);
        return x == CoroutineSingletons.COROUTINE_SUSPENDED ? x : zy11.a;
    }
}
