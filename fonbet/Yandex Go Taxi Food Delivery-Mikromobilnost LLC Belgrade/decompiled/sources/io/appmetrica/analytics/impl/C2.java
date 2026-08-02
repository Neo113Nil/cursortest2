package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* loaded from: classes9.dex */
public final class C2 implements FunctionWithThrowable {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public final Object mo489apply(Object obj) {
        return ((Activity) obj).getIntent();
    }
}
