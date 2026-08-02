package androidx.savedstate.internal;

import androidx.compose.ui.platform.AbstractComposeView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes.dex */
public final /* synthetic */ class SavedStateRegistryImpl$$ExternalSyntheticLambda0 implements LifecycleEventObserver {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SavedStateRegistryImpl$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                SavedStateRegistryImpl savedStateRegistryImpl = (SavedStateRegistryImpl) obj;
                if (event != Lifecycle.Event.ON_START) {
                    if (event == Lifecycle.Event.ON_STOP) {
                        savedStateRegistryImpl.isAllowingSavingState = false;
                        break;
                    }
                } else {
                    savedStateRegistryImpl.isAllowingSavingState = true;
                    break;
                }
                break;
            case 1:
                AbstractComposeView abstractComposeView = (AbstractComposeView) obj;
                if (event == Lifecycle.Event.ON_DESTROY) {
                    abstractComposeView.disposeComposition();
                    break;
                }
                break;
            default:
                ProducerCoroutine producerCoroutine = (ProducerCoroutine) ((ProducerScope) obj);
                producerCoroutine.mo1159trySendJP2dKIU(event);
                if (event.getTargetState() == Lifecycle.State.DESTROYED) {
                    producerCoroutine.close(null);
                    break;
                }
                break;
        }
    }
}
