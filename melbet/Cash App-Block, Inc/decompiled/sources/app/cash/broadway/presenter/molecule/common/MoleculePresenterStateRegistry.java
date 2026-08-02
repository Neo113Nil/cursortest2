package app.cash.broadway.presenter.molecule.common;

import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryImpl;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.room.TransactorKt$$ExternalSyntheticLambda0;
import app.cash.broadway.presenter.SavedState;
import com.squareup.wire.GrpcMethod;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MoleculePresenterStateRegistry implements SaveableStateRegistry {
    public final SaveableStateRegistry registry;

    public MoleculePresenterStateRegistry(SavedState savedState) {
        Map map = savedState.value;
        map = map instanceof Map ? map : null;
        TransactorKt$$ExternalSyntheticLambda0 transactorKt$$ExternalSyntheticLambda0 = new TransactorKt$$ExternalSyntheticLambda0(26);
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = SaveableStateRegistryKt.LocalSaveableStateRegistry;
        this.registry = new SaveableStateRegistryImpl(map, transactorKt$$ExternalSyntheticLambda0);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final boolean canBeSaved(Object obj) {
        obj.getClass();
        return this.registry.canBeSaved(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Object consumeRestored(String str) {
        str.getClass();
        return this.registry.consumeRestored(str);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Map performSave() {
        return this.registry.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final GrpcMethod registerProvider(String str, Function0 function0) {
        str.getClass();
        return this.registry.registerProvider(str, function0);
    }
}
