package androidx.compose.animation;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import androidx.compose.runtime.saveable.SaveableStateRegistryWrapper;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda8;
import androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.core.navigationcontainer.navigator.EventListener;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class AnimatedContentKt$AnimatedContent$6$1$5$1$1$invoke$$inlined$onDispose$1 implements DisposableEffectResult {
    public final /* synthetic */ Object $currentlyVisible$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $rootScope$inlined;
    public final /* synthetic */ Object $stateForContent$inlined;

    public /* synthetic */ AnimatedContentKt$AnimatedContent$6$1$5$1$1$invoke$$inlined$onDispose$1(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.$currentlyVisible$inlined = obj;
        this.$stateForContent$inlined = obj2;
        this.$rootScope$inlined = obj3;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        int i = this.$r8$classId;
        Object obj = this.$rootScope$inlined;
        Object obj2 = this.$stateForContent$inlined;
        Object obj3 = this.$currentlyVisible$inlined;
        switch (i) {
            case 0:
                ((SnapshotStateList) obj3).remove(obj2);
                ((AnimatedContentTransitionScopeImpl) obj).targetSizeMap.remove(obj2);
                break;
            case 1:
                SaveableStateHolderImpl saveableStateHolderImpl = (SaveableStateHolderImpl) obj3;
                SaveableStateRegistryWrapper saveableStateRegistryWrapper = (SaveableStateRegistryWrapper) obj;
                if (saveableStateHolderImpl.registries.remove(obj2) == saveableStateRegistryWrapper) {
                    Map map = saveableStateHolderImpl.savedStates;
                    Map performSave = saveableStateRegistryWrapper.performSave();
                    if (performSave.isEmpty()) {
                        map.remove(obj2);
                        break;
                    } else {
                        map.put(obj2, performSave);
                        break;
                    }
                }
                break;
            case 2:
                ((LifecycleOwner) obj3).getLifecycle().removeObserver((LifecycleEffectKt$$ExternalSyntheticLambda8) obj2);
                LifecycleStopOrDisposeEffectResult lifecycleStopOrDisposeEffectResult = (LifecycleStopOrDisposeEffectResult) ((Ref$ObjectRef) obj).element;
                if (lifecycleStopOrDisposeEffectResult != null) {
                    lifecycleStopOrDisposeEffectResult.runStopOrDisposeEffect();
                    break;
                }
                break;
            default:
                NavigationModel.Ready.Location location = (NavigationModel.Ready.Location) obj2;
                ((Function1) obj3).invoke(location.getStateKey());
                for (EventListener eventListener : (List) obj) {
                    Screen screen = location.getScreen();
                    eventListener.getClass();
                    screen.getClass();
                }
                break;
        }
    }
}
