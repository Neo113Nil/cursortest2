package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import papa.PapaEvent;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"androidx/lifecycle/ViewModelProvider$Factory", "", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ViewModelProvider$Factory {
    default ViewModel create(KClass kClass, CreationExtras creationExtras) {
        kClass.getClass();
        creationExtras.getClass();
        return create(PapaEvent.getJavaClass(kClass), creationExtras);
    }

    default ViewModel create(Class cls, CreationExtras creationExtras) {
        cls.getClass();
        creationExtras.getClass();
        return create(cls);
    }

    default ViewModel create(Class cls) {
        cls.getClass();
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
