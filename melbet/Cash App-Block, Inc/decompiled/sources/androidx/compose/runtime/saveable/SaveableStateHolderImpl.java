package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda2;
import androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda7;
import androidx.savedstate.compose.LocalSavedStateRegistryOwnerKt;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.molecule.MoleculeKt$$ExternalSyntheticLambda1;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes.dex */
public final class SaveableStateHolderImpl implements SaveableStateHolder {
    public static final WorkLauncherImpl Saver = new WorkLauncherImpl(8, new SaversKt$$ExternalSyntheticLambda0(4), new SaversKt$$ExternalSyntheticLambda2(10));
    public final CashApp$$ExternalSyntheticLambda2 canBeSaved;
    public SaveableStateRegistry parentSaveableStateRegistry;
    public final MutableScatterMap registries;
    public final Map savedStates;

    public SaveableStateHolderImpl(Map map) {
        this.savedStates = map;
        long[] jArr = ScatterMapKt.EmptyGroup;
        this.registries = new MutableScatterMap();
        this.canBeSaved = new CashApp$$ExternalSyntheticLambda2(this, 14);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public final void SaveableStateProvider(Object obj, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(533563200);
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
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.startReusableGroup(obj);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                CashApp$$ExternalSyntheticLambda2 cashApp$$ExternalSyntheticLambda2 = this.canBeSaved;
                if (!((Boolean) cashApp$$ExternalSyntheticLambda2.invoke(obj)).booleanValue()) {
                    Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle.", obj));
                    return;
                }
                Map map = (Map) this.savedStates.get(obj);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = SaveableStateRegistryKt.LocalSaveableStateRegistry;
                SaveableStateRegistryWrapper saveableStateRegistryWrapper = new SaveableStateRegistryWrapper(new SaveableStateRegistryImpl(map, cashApp$$ExternalSyntheticLambda2));
                gapComposer.updateRememberedValue(saveableStateRegistryWrapper);
                rememberedValue = saveableStateRegistryWrapper;
            }
            SaveableStateRegistryWrapper saveableStateRegistryWrapper2 = (SaveableStateRegistryWrapper) rememberedValue;
            Updater.CompositionLocalProvider(new ProvidedValue[]{SaveableStateRegistryKt.LocalSaveableStateRegistry.defaultProvidedValue$runtime(saveableStateRegistryWrapper2), LocalSavedStateRegistryOwnerKt.LocalSavedStateRegistryOwner.defaultProvidedValue$runtime(saveableStateRegistryWrapper2)}, composableLambdaImpl, gapComposer, (i2 & 112) | 8);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changedInstance(obj) | gapComposer.changedInstance(saveableStateRegistryWrapper2);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new MoleculeKt$$ExternalSyntheticLambda1(i3, this, obj, saveableStateRegistryWrapper2);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.DisposableEffect(unit, (Function1) rememberedValue2, gapComposer);
            if (gapComposer.reusing && gapComposer.reader.parent == gapComposer.reusingGroup) {
                gapComposer.reusingGroup = -1;
                gapComposer.reusing = false;
            }
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleEffectKt$$ExternalSyntheticLambda7(this, obj, composableLambdaImpl, i, 2);
        }
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public final void removeState(Object obj) {
        if (this.registries.remove(obj) == null) {
            this.savedStates.remove(obj);
        }
    }
}
