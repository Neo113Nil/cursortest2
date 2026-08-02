package com.datadog.android.rum.internal.domain.scope;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class RumActionScope$handleEvent$1 extends Lambda implements Function1 {
    public static final RumActionScope$handleEvent$1 INSTANCE = new RumActionScope$handleEvent$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WeakReference weakReference = (WeakReference) obj;
        weakReference.getClass();
        return Boolean.valueOf(weakReference.get() == null);
    }
}
