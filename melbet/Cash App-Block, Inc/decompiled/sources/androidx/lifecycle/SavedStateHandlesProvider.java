package androidx.lifecycle;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateRegistry;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import java.util.Arrays;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.EmptyMap;

/* loaded from: classes.dex */
public final class SavedStateHandlesProvider implements SavedStateRegistry.SavedStateProvider {
    public boolean restored;
    public Bundle restoredState;
    public final SavedStateRegistry savedStateRegistry;
    public final Lazy viewModel$delegate;

    public SavedStateHandlesProvider(SavedStateRegistry savedStateRegistry, ViewModelStoreOwner viewModelStoreOwner) {
        savedStateRegistry.getClass();
        this.savedStateRegistry = savedStateRegistry;
        this.viewModel$delegate = LazyKt.lazy(new ImageLoader$Builder$$ExternalSyntheticLambda1(viewModelStoreOwner, 16));
    }

    public final void performRestore() {
        if (this.restored) {
            return;
        }
        Bundle consumeRestoredStateForKey = this.savedStateRegistry.consumeRestoredStateForKey("androidx.lifecycle.internal.SavedStateHandlesProvider");
        EmptyMap.INSTANCE.getClass();
        Bundle bundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            bundleOf.putAll(bundle);
        }
        if (consumeRestoredStateForKey != null) {
            bundleOf.putAll(consumeRestoredStateForKey);
        }
        this.restoredState = bundleOf;
        this.restored = true;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle saveState() {
        EmptyMap.INSTANCE.getClass();
        Bundle bundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            bundleOf.putAll(bundle);
        }
        for (Map.Entry entry : ((SavedStateHandlesVM) this.viewModel$delegate.getValue()).handles.entrySet()) {
            String str = (String) entry.getKey();
            Bundle saveState = ((SavedStateHandle) entry.getValue()).savedStateProvider().saveState();
            if (!saveState.isEmpty()) {
                str.getClass();
                bundleOf.putBundle(str, saveState);
            }
        }
        this.restored = false;
        return bundleOf;
    }
}
