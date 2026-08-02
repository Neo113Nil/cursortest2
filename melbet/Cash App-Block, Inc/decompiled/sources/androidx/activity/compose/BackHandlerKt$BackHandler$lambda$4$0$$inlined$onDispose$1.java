package androidx.activity.compose;

import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.compose.internal.BackHandlerDispatcherCompat;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import app.cash.broadway.ui.compose.DialogEventDispatcher;
import com.squareup.cash.core.navigationcontainer.ScreenLifecycle;
import com.squareup.wire.GrpcMethod;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class BackHandlerKt$BackHandler$lambda$4$0$$inlined$onDispose$1 implements DisposableEffectResult {
    public final /* synthetic */ Object $dispatcher$inlined;
    public final /* synthetic */ Object $handler$inlined;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BackHandlerKt$BackHandler$lambda$4$0$$inlined$onDispose$1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.$dispatcher$inlined = obj;
        this.$handler$inlined = obj2;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        int i = this.$r8$classId;
        Object obj = this.$handler$inlined;
        Object obj2 = this.$dispatcher$inlined;
        switch (i) {
            case 0:
                ((BackHandlerDispatcherCompat) obj2).removeHandler((ComposeBackHandler) obj);
                break;
            case 1:
                ((Transition) obj2)._transitions.remove((Transition) obj);
                break;
            case 2:
                Transition transition = (Transition) obj2;
                transition.getClass();
                Transition.DeferredAnimation.DeferredAnimationData deferredAnimationData = (Transition.DeferredAnimation.DeferredAnimationData) ((Transition.DeferredAnimation) obj).data$delegate.getValue();
                if (deferredAnimationData != null) {
                    transition._animations.remove(deferredAnimationData.animation);
                    break;
                }
                break;
            case 3:
                WindowInsetsHolder windowInsetsHolder = (WindowInsetsHolder) obj2;
                View view = (View) obj;
                int i2 = windowInsetsHolder.accessCount - 1;
                windowInsetsHolder.accessCount = i2;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                    ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(view, null);
                    ViewCompat.setWindowInsetsAnimationCallback(view, null);
                    view.removeOnAttachStateChangeListener(windowInsetsHolder.insetsListener);
                    break;
                }
                break;
            case 4:
                DialogEventDispatcher dialogEventDispatcher = (DialogEventDispatcher) obj2;
                Function1 function1 = (Function1) obj;
                dialogEventDispatcher.getClass();
                function1.getClass();
                dialogEventDispatcher.eventListeners.remove(function1);
                break;
            case 5:
                AtomicReference atomicReference = (AtomicReference) obj2;
                OnBackPressedDispatcher onBackPressedDispatcher = (OnBackPressedDispatcher) obj;
                while (!atomicReference.compareAndSet(onBackPressedDispatcher, null) && atomicReference.get() == onBackPressedDispatcher) {
                }
            default:
                GrpcMethod grpcMethod = (GrpcMethod) obj2;
                if (grpcMethod != null) {
                    grpcMethod.unregister();
                }
                ((ScreenLifecycle) obj).lifecycleRegistry.setCurrentState(Lifecycle.State.DESTROYED);
                break;
        }
    }
}
