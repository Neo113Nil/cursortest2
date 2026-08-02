package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.reflect.KClass;

/* loaded from: classes.dex */
public final class SavedStateHandleSupport$savedStateHandlesVM$1 implements ViewModelProvider$Factory {
    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel create(KClass kClass, CreationExtras creationExtras) {
        kClass.getClass();
        return new SavedStateHandlesVM();
    }
}
