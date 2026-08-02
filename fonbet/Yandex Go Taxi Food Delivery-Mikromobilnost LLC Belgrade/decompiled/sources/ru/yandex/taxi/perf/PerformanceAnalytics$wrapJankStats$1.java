package ru.yandex.taxi.perf;

import android.view.View;
import defpackage.t9h0;
import defpackage.xva0;
import defpackage.yuf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"ru/yandex/taxi/perf/PerformanceAnalytics$wrapJankStats$1", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "Lzy11;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "impl"}, k = 1, mv = {2, 4, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class PerformanceAnalytics$wrapJankStats$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ String $eventName;
    final /* synthetic */ Ref$ObjectRef<View.OnAttachStateChangeListener> $listener;
    final /* synthetic */ View $view;

    public PerformanceAnalytics$wrapJankStats$1(View view, String str, Ref$ObjectRef<View.OnAttachStateChangeListener> ref$ObjectRef) {
        this.$view = view;
        this.$eventName = str;
        this.$listener = ref$ObjectRef;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
        View rootView = this.$view.getRootView();
        Object tag = rootView.getTag(t9h0.metricsStateHolder);
        if (tag == null) {
            tag = new xva0();
            rootView.setTag(t9h0.metricsStateHolder, tag);
        }
        yuf0 yuf0Var = ((xva0) tag).a;
        if (yuf0Var != null) {
            yuf0Var.I(this.$eventName);
        }
        View view = this.$view;
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.$listener.element;
        view.removeOnAttachStateChangeListener(onAttachStateChangeListener == null ? null : onAttachStateChangeListener);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
    }
}
