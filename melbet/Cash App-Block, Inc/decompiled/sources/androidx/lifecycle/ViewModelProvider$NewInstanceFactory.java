package androidx.lifecycle;

import androidx.core.os.BundleKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.reflect.KClass;
import papa.PapaEvent;

/* loaded from: classes.dex */
public class ViewModelProvider$NewInstanceFactory implements ViewModelProvider$Factory {
    public static ViewModelProvider$NewInstanceFactory _instance;

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel create(KClass kClass, CreationExtras creationExtras) {
        kClass.getClass();
        return create(PapaEvent.getJavaClass(kClass), creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public ViewModel create(Class cls, CreationExtras creationExtras) {
        creationExtras.getClass();
        return create(cls);
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public ViewModel create(Class cls) {
        cls.getClass();
        return BundleKt.createViewModel(cls);
    }
}
