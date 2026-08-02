package androidx.lifecycle.viewmodel.internal;

import androidx.core.os.BundleKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.reflect.KClass;
import papa.PapaEvent;

/* loaded from: classes3.dex */
public final class DefaultViewModelProviderFactory implements ViewModelProvider$Factory {
    public static final DefaultViewModelProviderFactory INSTANCE = new DefaultViewModelProviderFactory();

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel create(KClass kClass, CreationExtras creationExtras) {
        kClass.getClass();
        return BundleKt.createViewModel(PapaEvent.getJavaClass(kClass));
    }
}
