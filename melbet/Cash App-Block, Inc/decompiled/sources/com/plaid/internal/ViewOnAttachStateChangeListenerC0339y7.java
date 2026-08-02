package com.plaid.internal;

import android.view.View;
import com.plaid.link.R;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorJobImpl;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* renamed from: com.plaid.internal.y7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnAttachStateChangeListenerC0339y7 implements CoroutineScope, View.OnAttachStateChangeListener {
    public final CoroutineContext a;

    public ViewOnAttachStateChangeListenerC0339y7() {
        SupervisorJobImpl SupervisorJob$default = JobKt.SupervisorJob$default();
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        this.a = CoroutineContext.Element.DefaultImpls.plus(SupervisorJob$default, DefaultIoScheduler.INSTANCE);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        view.setTag(R.string.plaid_view_coroutine_scope, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
        JobKt.cancel(this.a, (CancellationException) null);
        view.setTag(R.string.plaid_view_coroutine_scope, null);
    }
}
