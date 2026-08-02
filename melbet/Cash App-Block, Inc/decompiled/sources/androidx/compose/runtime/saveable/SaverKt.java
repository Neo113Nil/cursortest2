package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda2;
import androidx.paging.CachedPageEventFlow$$ExternalSyntheticLambda0;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import androidx.room.InvalidationTracker$$ExternalSyntheticLambda0;
import androidx.work.impl.WorkLauncherImpl;
import com.squareup.wire.GrpcMethod;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes.dex */
public abstract class SaverKt {
    public static final WorkLauncherImpl AutoSaver = new WorkLauncherImpl(8, new SaversKt$$ExternalSyntheticLambda0(5), new SaversKt$$ExternalSyntheticLambda2(11));

    public static final String generateCannotBeSavedErrorMessage(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final Object rememberSaveable(Object[] objArr, Saver saver, String str, Function0 function0, Composer composer, int i, int i2) {
        Object[] objArr2;
        final Object obj;
        Object consumeRestored;
        if ((i2 & 2) != 0) {
            saver = AutoSaver;
        }
        final Saver saver2 = saver;
        if ((i2 & 4) != 0) {
            str = null;
        }
        GapComposer gapComposer = (GapComposer) composer;
        long j = gapComposer.compositeKeyHashCode;
        if (str == null || str.length() == 0) {
            str = Long.toString(j, CharsKt.checkRadix(36));
            str.getClass();
        }
        final String str2 = str;
        saver2.getClass();
        final SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) gapComposer.consume(SaveableStateRegistryKt.LocalSaveableStateRegistry);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            Object mo380restore = (saveableStateRegistry == null || (consumeRestored = saveableStateRegistry.consumeRestored(str2)) == null) ? null : saver2.mo380restore(consumeRestored);
            if (mo380restore == null) {
                mo380restore = function0.invoke();
            }
            objArr2 = objArr;
            SaveableHolder saveableHolder = new SaveableHolder(saver2, saveableStateRegistry, str2, mo380restore, objArr2);
            gapComposer.updateRememberedValue(saveableHolder);
            rememberedValue = saveableHolder;
        } else {
            objArr2 = objArr;
        }
        final SaveableHolder saveableHolder2 = (SaveableHolder) rememberedValue;
        Object obj2 = Arrays.equals(objArr2, saveableHolder2.inputs) ? saveableHolder2.value : null;
        if (obj2 == null) {
            obj2 = function0.invoke();
        }
        boolean changedInstance = gapComposer.changedInstance(saveableHolder2) | ((((i & 112) ^ 48) > 32 && gapComposer.changedInstance(saver2)) || (i & 48) == 32) | gapComposer.changedInstance(saveableStateRegistry) | gapComposer.changed(str2) | gapComposer.changedInstance(obj2) | gapComposer.changedInstance(objArr2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            final Object[] objArr3 = objArr2;
            obj = obj2;
            Function0 function02 = new Function0() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean z;
                    SaveableHolder saveableHolder3 = SaveableHolder.this;
                    SaveableStateRegistry saveableStateRegistry2 = saveableHolder3.registry;
                    SaveableStateRegistry saveableStateRegistry3 = saveableStateRegistry;
                    boolean z2 = true;
                    if (saveableStateRegistry2 != saveableStateRegistry3) {
                        saveableHolder3.registry = saveableStateRegistry3;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str3 = saveableHolder3.key;
                    String str4 = str2;
                    if (Intrinsics.areEqual(str3, str4)) {
                        z2 = z;
                    } else {
                        saveableHolder3.key = str4;
                    }
                    saveableHolder3.saver = saver2;
                    saveableHolder3.value = obj;
                    saveableHolder3.inputs = objArr3;
                    GrpcMethod grpcMethod = saveableHolder3.entry;
                    if (grpcMethod != null && z2) {
                        grpcMethod.unregister();
                        saveableHolder3.entry = null;
                        saveableHolder3.register$1();
                    }
                    return Unit.INSTANCE;
                }
            };
            gapComposer.updateRememberedValue(function02);
            rememberedValue2 = function02;
        } else {
            obj = obj2;
        }
        Updater.SideEffect((Function0) rememberedValue2, gapComposer);
        return obj;
    }

    public static final SaveableStateHolderImpl rememberSaveableStateHolder(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1967007413);
        Object[] objArr = new Object[0];
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new InvalidationTracker$$ExternalSyntheticLambda0(17);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        SaveableStateHolderImpl saveableStateHolderImpl = (SaveableStateHolderImpl) m581rememberSaveable(objArr, (Saver) SaveableStateHolderImpl.Saver, (Function0) rememberedValue, (Composer) gapComposer, MLKEMEngine.KyberPolyBytes);
        saveableStateHolderImpl.parentSaveableStateRegistry = (SaveableStateRegistry) gapComposer.consume(SaveableStateRegistryKt.LocalSaveableStateRegistry);
        gapComposer.end(false);
        return saveableStateHolderImpl;
    }

    public static final Object rememberSaveable(Object[] objArr, Function0 function0, Composer composer, int i) {
        return rememberSaveable(Arrays.copyOf(objArr, objArr.length), AutoSaver, null, function0, composer, ((i << 6) & 7168) | MLKEMEngine.KyberPolyBytes, 0);
    }

    /* renamed from: rememberSaveable, reason: collision with other method in class */
    public static final Object m581rememberSaveable(Object[] objArr, Saver saver, Function0 function0, Composer composer, int i) {
        return rememberSaveable(Arrays.copyOf(objArr, objArr.length), saver, null, function0, composer, (i & 112) | MLKEMEngine.KyberPolyBytes | ((i << 3) & 7168), 0);
    }

    public static final MutableState rememberSaveable(Object[] objArr, Saver saver, Function0 function0, Composer composer, int i) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        saver.getClass();
        return (MutableState) rememberSaveable(copyOf, new WorkLauncherImpl(8, new HintHandler$$ExternalSyntheticLambda0(saver, 18), new CachedPageEventFlow$$ExternalSyntheticLambda0(saver, 7)), null, function0, composer, ((i << 3) & 7168) | MLKEMEngine.KyberPolyBytes, 0);
    }
}
