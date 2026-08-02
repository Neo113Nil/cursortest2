package androidx.core.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt$WhenMappings;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes3.dex */
public final /* synthetic */ class MenuHostHelper$$ExternalSyntheticLambda0 implements LifecycleEventObserver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Serializable f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ MenuHostHelper$$ExternalSyntheticLambda0(int i, Serializable serializable, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = serializable;
        this.f$2 = obj2;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = this.$r8$classId;
        Object obj = this.f$2;
        Serializable serializable = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                MenuHostHelper menuHostHelper = (MenuHostHelper) obj2;
                Lifecycle.State state = (Lifecycle.State) serializable;
                MenuProvider menuProvider = (MenuProvider) obj;
                menuHostHelper.getClass();
                Runnable runnable = menuHostHelper.mOnInvalidateMenuCallback;
                CopyOnWriteArrayList copyOnWriteArrayList = menuHostHelper.mMenuProviders;
                Lifecycle.Event.Companion.getClass();
                if (event != Lifecycle.Event.Companion.upTo(state)) {
                    if (event != Lifecycle.Event.ON_DESTROY) {
                        if (event == Lifecycle.Event.Companion.downFrom(state)) {
                            copyOnWriteArrayList.remove(menuProvider);
                            runnable.run();
                            break;
                        }
                    } else {
                        menuHostHelper.removeMenuProvider(menuProvider);
                        break;
                    }
                } else {
                    copyOnWriteArrayList.add(menuProvider);
                    runnable.run();
                    break;
                }
                break;
            default:
                LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope = (LifecycleResumePauseEffectScope) obj2;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) serializable;
                Function1 function1 = (Function1) obj;
                int i2 = LifecycleEffectKt$WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
                if (i2 == 3) {
                    ref$ObjectRef.element = function1.invoke(lifecycleResumePauseEffectScope);
                    break;
                } else if (i2 == 4) {
                    LifecyclePauseOrDisposeEffectResult lifecyclePauseOrDisposeEffectResult = (LifecyclePauseOrDisposeEffectResult) ref$ObjectRef.element;
                    if (lifecyclePauseOrDisposeEffectResult != null) {
                        lifecyclePauseOrDisposeEffectResult.runPauseOrOnDisposeEffect();
                    }
                    ref$ObjectRef.element = null;
                    break;
                }
                break;
        }
    }
}
