package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.collection.ScatterSetKt;
import androidx.compose.foundation.ClickableKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda8;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryImpl;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.wire.GrpcMethod;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final class LazySaveableStateHolder implements SaveableStateRegistry, SaveableStateHolder {
    public final MutableScatterSet previouslyComposedKeys;
    public final SaveableStateHolder wrappedHolder;
    public final SaveableStateRegistryImpl wrappedRegistry;

    public LazySaveableStateHolder(SaveableStateRegistry saveableStateRegistry, Map map, SaveableStateHolder saveableStateHolder) {
        ObjectList$$ExternalSyntheticLambda0 objectList$$ExternalSyntheticLambda0 = new ObjectList$$ExternalSyntheticLambda0(saveableStateRegistry, 23);
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = SaveableStateRegistryKt.LocalSaveableStateRegistry;
        this.wrappedRegistry = new SaveableStateRegistryImpl(map, objectList$$ExternalSyntheticLambda0);
        this.wrappedHolder = saveableStateHolder;
        MutableScatterSet mutableScatterSet = ScatterSetKt.EmptyScatterSet;
        this.previouslyComposedKeys = new MutableScatterSet();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public final void SaveableStateProvider(Object obj, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-858296452);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            this.wrappedHolder.SaveableStateProvider(obj, composableLambdaImpl, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changedInstance(obj);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ClickableKt$$ExternalSyntheticLambda0(25, this, obj);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.DisposableEffect(obj, (Function1) rememberedValue, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8(this, obj, composableLambdaImpl, i, 4);
        }
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final boolean canBeSaved(Object obj) {
        return this.wrappedRegistry.canBeSaved(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Object consumeRestored(String str) {
        return this.wrappedRegistry.consumeRestored(str);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Map performSave() {
        MutableScatterSet mutableScatterSet = this.previouslyComposedKeys;
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.wrappedHolder.removeState(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return this.wrappedRegistry.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final GrpcMethod registerProvider(String str, Function0 function0) {
        return this.wrappedRegistry.registerProvider(str, function0);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public final void removeState(Object obj) {
        this.wrappedHolder.removeState(obj);
    }
}
