package com.squareup.cash.core.navigationcontainer;

import androidx.compose.runtime.saveable.SaveableStateRegistry;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.wire.GrpcMethod;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class ValidatingSaveableStateRegistry implements SaveableStateRegistry {
    public final SaveableStateRegistry delegate;

    public ValidatingSaveableStateRegistry(SaveableStateRegistry saveableStateRegistry) {
        this.delegate = saveableStateRegistry;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final boolean canBeSaved(Object obj) {
        obj.getClass();
        return this.delegate.canBeSaved(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Object consumeRestored(String str) {
        str.getClass();
        return this.delegate.consumeRestored(str);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Map performSave() {
        return this.delegate.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final GrpcMethod registerProvider(String str, Function0 function0) {
        str.getClass();
        return this.delegate.registerProvider(str, new ComposeDialogKt$$ExternalSyntheticLambda10(16, function0));
    }
}
