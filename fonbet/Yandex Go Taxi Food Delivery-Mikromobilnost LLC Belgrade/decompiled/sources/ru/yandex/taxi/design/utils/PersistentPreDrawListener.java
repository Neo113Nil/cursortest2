package ru.yandex.taxi.design.utils;

import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import defpackage.g18;
import defpackage.op70;
import defpackage.sls;
import defpackage.t2b0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0016B\u001f\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/design/utils/PersistentPreDrawListener;", "Landroid/view/View$OnAttachStateChangeListener;", "Lg18;", "Landroid/view/View;", "view", "Lkotlin/Function0;", "Lzy11;", "action", "<init>", "(Landroid/view/View;Lsls;)V", "clearPreDrawListener", "()V", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "cancel", "Landroid/view/View;", "Lsls;", "Landroidx/core/view/OneShotPreDrawListener;", "preDrawListener", "Landroidx/core/view/OneShotPreDrawListener;", "Companion", "t2b0", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PersistentPreDrawListener implements View.OnAttachStateChangeListener, g18 {
    public static final t2b0 Companion = new t2b0();
    private final sls action;
    private OneShotPreDrawListener preDrawListener;
    private final View view;

    private PersistentPreDrawListener(View view, sls slsVar) {
        this.view = view;
        this.action = slsVar;
    }

    private final void clearPreDrawListener() {
        OneShotPreDrawListener oneShotPreDrawListener = this.preDrawListener;
        if (oneShotPreDrawListener != null) {
            oneShotPreDrawListener.removeListener();
        }
        this.preDrawListener = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewAttachedToWindow$lambda$0(PersistentPreDrawListener persistentPreDrawListener) {
        persistentPreDrawListener.cancel();
        persistentPreDrawListener.action.invoke();
    }

    @Override // defpackage.g18
    public void cancel() {
        this.view.removeOnAttachStateChangeListener(this);
        clearPreDrawListener();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        clearPreDrawListener();
        this.preDrawListener = OneShotPreDrawListener.add(view, new op70(25, this));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        clearPreDrawListener();
    }

    public /* synthetic */ PersistentPreDrawListener(View view, sls slsVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, slsVar);
    }
}
