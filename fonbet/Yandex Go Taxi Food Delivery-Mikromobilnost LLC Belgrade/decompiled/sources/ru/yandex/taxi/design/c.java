package ru.yandex.taxi.design;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import defpackage.wh;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;

/* loaded from: classes5.dex */
public final class c extends AccessibilityDelegateCompat {
    public final AnimatedListItemInputComponent a;

    public c(AnimatedListItemInputComponent animatedListItemInputComponent) {
        this.a = animatedListItemInputComponent;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        AnimatedListItemInputComponent.State state;
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        AnimatedListItemInputComponent animatedListItemInputComponent = this.a;
        state = animatedListItemInputComponent.currentState;
        int i = b.a[state.ordinal()];
        if (i == 1 || i == 2) {
            animatedListItemInputComponent.setImportantForAccessibility(2);
        } else {
            animatedListItemInputComponent.setImportantForAccessibility(1);
            animatedListItemInputComponent.setScreenReaderFocusable(true);
            animatedListItemInputComponent.setFocusable(true);
        }
        accessibilityEvent.setClassName("android.widget.Button");
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        AnimatedListItemInputComponent.State state;
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        AnimatedListItemInputComponent animatedListItemInputComponent = this.a;
        state = animatedListItemInputComponent.currentState;
        int i = b.a[state.ordinal()];
        if (i == 1 || i == 2) {
            animatedListItemInputComponent.setImportantForAccessibility(2);
            whVar.q(false);
        } else {
            animatedListItemInputComponent.setImportantForAccessibility(1);
            animatedListItemInputComponent.setScreenReaderFocusable(true);
            animatedListItemInputComponent.setFocusable(true);
            whVar.q(true);
        }
        whVar.p("android.widget.Button");
    }
}
