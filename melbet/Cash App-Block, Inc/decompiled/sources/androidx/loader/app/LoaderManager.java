package androidx.loader.app;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import coil3.request.OneShotDisposable;
import com.google.android.gms.auth.api.signin.internal.zbc;

/* loaded from: classes3.dex */
public abstract class LoaderManager {
    public static LoaderManagerImpl getInstance(LifecycleOwner lifecycleOwner) {
        return new LoaderManagerImpl(lifecycleOwner, ((ViewModelStoreOwner) lifecycleOwner).getViewModelStore());
    }

    public abstract zbc initLoader(OneShotDisposable oneShotDisposable);
}
