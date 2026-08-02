package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.Composer;
import androidx.datastore.core.SimpleActor;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.SizeKt;
import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public abstract class ViewModelKt {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewAddCashAmount.deepLinkSpecs;
    }

    public static final ViewModel viewModel(KClass kClass, ViewModelStoreOwner viewModelStoreOwner, InitializerViewModelFactory initializerViewModelFactory, CreationExtras creationExtras, Composer composer) {
        ViewModelStore viewModelStore = viewModelStoreOwner.getViewModelStore();
        viewModelStore.getClass();
        creationExtras.getClass();
        SimpleActor simpleActor = new SimpleActor(viewModelStore, initializerViewModelFactory, creationExtras);
        kClass.getClass();
        String canonicalName = SizeKt.getCanonicalName(kClass);
        if (canonicalName != null) {
            return simpleActor.getViewModel$lifecycle_viewmodel("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), kClass);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Local and anonymous classes can not be ViewModels");
        return null;
    }
}
