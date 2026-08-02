package androidx.activity;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes.dex */
public final /* synthetic */ class ComponentActivity$$ExternalSyntheticLambda12 implements LifecycleEventObserver {
    public final /* synthetic */ OnBackPressedDispatcher f$0;
    public final /* synthetic */ ComponentActivity f$1;

    public /* synthetic */ ComponentActivity$$ExternalSyntheticLambda12(OnBackPressedDispatcher onBackPressedDispatcher, ComponentActivity componentActivity) {
        this.f$0 = onBackPressedDispatcher;
        this.f$1 = componentActivity;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        ComponentActivity.$r8$lambda$XCwb6u5X87zpWrZW4Zmu6tsKQC8(this.f$0, this.f$1, lifecycleOwner, event);
    }
}
