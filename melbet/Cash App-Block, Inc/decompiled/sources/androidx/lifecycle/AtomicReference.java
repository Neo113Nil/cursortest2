package androidx.lifecycle;

import androidx.datastore.core.SimpleActor;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.gms.dynamite.zzg;

/* loaded from: classes.dex */
public final class AtomicReference {
    public static final zzg VIEW_MODEL_KEY = new zzg(6);
    public final Object base;

    public AtomicReference(ViewModelStore viewModelStore, ViewModelProvider$Factory viewModelProvider$Factory, CreationExtras creationExtras) {
        viewModelStore.getClass();
        viewModelProvider$Factory.getClass();
        creationExtras.getClass();
        this.base = new SimpleActor(viewModelStore, viewModelProvider$Factory, creationExtras);
    }

    public AtomicReference() {
        this.base = new java.util.concurrent.atomic.AtomicReference(null);
    }
}
