package ru.yandex.taxi.due_selector.impl.presentation.ui.picker;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/due_selector/impl/presentation/ui/picker/EndTransitionListener;", "Landroid/animation/LayoutTransition$TransitionListener;", "Landroid/animation/LayoutTransition;", "transition", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "view", "", "transitionType", "Lzy11;", "startTransition", "(Landroid/animation/LayoutTransition;Landroid/view/ViewGroup;Landroid/view/View;I)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface EndTransitionListener extends LayoutTransition.TransitionListener {
    @Override // android.animation.LayoutTransition.TransitionListener
    default void startTransition(LayoutTransition transition, ViewGroup container, View view, int transitionType) {
    }
}
