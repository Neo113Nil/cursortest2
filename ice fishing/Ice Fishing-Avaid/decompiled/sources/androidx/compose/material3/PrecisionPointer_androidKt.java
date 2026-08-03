package androidx.compose.material3;

import android.content.Context;
import android.hardware.input.InputManager;
import android.view.InputDevice;
import androidx.collection.IntSet;
import androidx.collection.MutableIntSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.core.content.ContextCompat;
import androidx.core.view.InputDeviceCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: PrecisionPointer.android.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0002\u0010\u0005\u001a\u0015\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0003¢\u0006\u0002\u0010\t\u001a&\u0010\r\u001a\u0004\u0018\u00010\b*\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0002\u001a\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\fH\u0002\u001a\u000e\u0010\u0010\u001a\u00020\f*\u0004\u0018\u00010\u0016H\u0002\u001a\u000e\u0010\u0011\u001a\u00020\f*\u0004\u0018\u00010\u0016H\u0002\u001a\u0014\u0010\u0017\u001a\u00020\f*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000fH\u0002\"\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"EnsurePrecisionPointerListenersRegistered", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "rememberDevicesState", "Landroidx/compose/runtime/State;", "Landroidx/compose/material3/Devices;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "LocalIsPrecisionPointerListenerRegistered", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "withUpdateForDevice", "deviceId", "", "isKeyboard", "isMouse", "withUpdatedValuePresence", "Landroidx/collection/IntSet;", "value", "shouldBePresent", "Landroid/view/InputDevice;", "hasSource", "source", "material3"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class PrecisionPointer_androidKt {
    private static final ProvidableCompositionLocal<Boolean> LocalIsPrecisionPointerListenerRegistered = CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: androidx.compose.material3.PrecisionPointer_androidKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            boolean LocalIsPrecisionPointerListenerRegistered$lambda$0;
            LocalIsPrecisionPointerListenerRegistered$lambda$0 = PrecisionPointer_androidKt.LocalIsPrecisionPointerListenerRegistered$lambda$0();
            return Boolean.valueOf(LocalIsPrecisionPointerListenerRegistered$lambda$0);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EnsurePrecisionPointerListenersRegistered$lambda$0(Function2 function2, int i, Composer composer, int i2) {
        EnsurePrecisionPointerListenersRegistered(function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LocalIsPrecisionPointerListenerRegistered$lambda$0() {
        return false;
    }

    public static final void EnsurePrecisionPointerListenersRegistered(final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        boolean z;
        Composer startRestartGroup = composer.startRestartGroup(442516910);
        ComposerKt.sourceInformation(startRestartGroup, "C(EnsurePrecisionPointerListenersRegistered)N(content):PrecisionPointer.android.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z2 = false;
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(442516910, i2, -1, "androidx.compose.material3.EnsurePrecisionPointerListenersRegistered (PrecisionPointer.android.kt:37)");
            }
            if (ComposeMaterial3Flags.isPrecisionPointerComponentSizingEnabled) {
                startRestartGroup.startReplaceGroup(56994752);
                ComposerKt.sourceInformation(startRestartGroup, "40@1673L7");
                ProvidableCompositionLocal<Boolean> providableCompositionLocal = LocalIsPrecisionPointerListenerRegistered;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(providableCompositionLocal);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                z = !((Boolean) consume).booleanValue();
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1766838549);
                startRestartGroup.endReplaceGroup();
                z = false;
            }
            if (z) {
                startRestartGroup.startReplaceGroup(1766933538);
                ComposerKt.sourceInformation(startRestartGroup, "44@1899L22,47@2084L90");
                Devices value = rememberDevicesState(startRestartGroup, 0).getValue();
                MutableState<Boolean> shouldUsePrecisionPointerComponentSizing = PrecisionPointer.getShouldUsePrecisionPointerComponentSizing();
                if (value != null && value.getKeyboards().isNotEmpty() && value.getMice().isNotEmpty()) {
                    z2 = true;
                }
                shouldUsePrecisionPointerComponentSizing.setValue(Boolean.valueOf(z2));
                CompositionLocalKt.CompositionLocalProvider(LocalIsPrecisionPointerListenerRegistered.provides(true), function2, startRestartGroup, ((i2 << 3) & 112) | ProvidedValue.$stable);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1767392772);
                ComposerKt.sourceInformation(startRestartGroup, "51@2347L9");
                function2.invoke(startRestartGroup, Integer.valueOf(i2 & 14));
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: androidx.compose.material3.PrecisionPointer_androidKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit EnsurePrecisionPointerListenersRegistered$lambda$0;
                    EnsurePrecisionPointerListenersRegistered$lambda$0 = PrecisionPointer_androidKt.EnsurePrecisionPointerListenersRegistered$lambda$0(Function2.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return EnsurePrecisionPointerListenersRegistered$lambda$0;
                }
            });
        }
    }

    private static final State<Devices> rememberDevicesState(Composer composer, int i) {
        composer.startReplaceGroup(57893307);
        ComposerKt.sourceInformation(composer, "C(rememberDevicesState)57@2463L7,64@2664L613,80@3309L1225,80@3283L1251:PrecisionPointer.android.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(57893307, i, -1, "androidx.compose.material3.rememberDevicesState (PrecisionPointer.android.kt:56)");
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) consume;
        final InputManager inputManager = (InputManager) ContextCompat.getSystemService(context, InputManager.class);
        if (inputManager == null) {
            composer.startReplaceGroup(-1877171018);
            ComposerKt.sourceInformation(composer, "61@2566L42");
            ComposerKt.sourceInformationMarkerStart(composer, -199101019, "CC(remember):PrecisionPointer.android.kt#9igjgp");
            boolean changed = composer.changed(context);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return mutableState;
        }
        composer.startReplaceGroup(-199102972);
        composer.endReplaceGroup();
        ComposerKt.sourceInformationMarkerStart(composer, -199097312, "CC(remember):PrecisionPointer.android.kt#9igjgp");
        boolean changed2 = composer.changed(context);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            MutableIntSet mutableIntSet = new MutableIntSet(0, 1, null);
            MutableIntSet mutableIntSet2 = new MutableIntSet(0, 1, null);
            for (int i2 : inputManager.getInputDeviceIds()) {
                InputDevice inputDevice = inputManager.getInputDevice(i2);
                if (isKeyboard(inputDevice)) {
                    mutableIntSet.add(i2);
                }
                if (isMouse(inputDevice)) {
                    mutableIntSet2.add(i2);
                }
            }
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Devices(mutableIntSet, mutableIntSet2), null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        final MutableState mutableState2 = (MutableState) rememberedValue2;
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerStart(composer, -199076060, "CC(remember):PrecisionPointer.android.kt#9igjgp");
        boolean changedInstance = composer.changedInstance(inputManager) | composer.changed(mutableState2);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function1() { // from class: androidx.compose.material3.PrecisionPointer_androidKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    DisposableEffectResult rememberDevicesState$lambda$2$0;
                    rememberDevicesState$lambda$2$0 = PrecisionPointer_androidKt.rememberDevicesState$lambda$2$0(inputManager, mutableState2, (DisposableEffectScope) obj);
                    return rememberDevicesState$lambda$2$0;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        EffectsKt.DisposableEffect(context, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return mutableState2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.compose.material3.PrecisionPointer_androidKt$rememberDevicesState$1$1$listener$1] */
    public static final DisposableEffectResult rememberDevicesState$lambda$2$0(final InputManager inputManager, final MutableState mutableState, DisposableEffectScope disposableEffectScope) {
        final ?? r3 = new InputManager.InputDeviceListener() { // from class: androidx.compose.material3.PrecisionPointer_androidKt$rememberDevicesState$1$1$listener$1
            @Override // android.hardware.input.InputManager.InputDeviceListener
            public void onInputDeviceAdded(int deviceId) {
                maybeUpdateDevice(deviceId);
            }

            @Override // android.hardware.input.InputManager.InputDeviceListener
            public void onInputDeviceRemoved(int deviceId) {
                maybeUpdateDevice(deviceId);
            }

            @Override // android.hardware.input.InputManager.InputDeviceListener
            public void onInputDeviceChanged(int deviceId) {
                maybeUpdateDevice(deviceId);
            }

            private final void maybeUpdateDevice(int deviceId) {
                boolean isKeyboard;
                boolean isMouse;
                Devices withUpdateForDevice;
                InputDevice inputDevice = inputManager.getInputDevice(deviceId);
                Devices value = mutableState.getValue();
                isKeyboard = PrecisionPointer_androidKt.isKeyboard(inputDevice);
                isMouse = PrecisionPointer_androidKt.isMouse(inputDevice);
                withUpdateForDevice = PrecisionPointer_androidKt.withUpdateForDevice(value, deviceId, isKeyboard, isMouse);
                if (withUpdateForDevice != null) {
                    mutableState.setValue(withUpdateForDevice);
                }
            }
        };
        inputManager.registerInputDeviceListener((InputManager.InputDeviceListener) r3, null);
        return new DisposableEffectResult() { // from class: androidx.compose.material3.PrecisionPointer_androidKt$rememberDevicesState$lambda$2$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                inputManager.unregisterInputDeviceListener(r3);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Devices withUpdateForDevice(Devices devices, int i, boolean z, boolean z2) {
        IntSet withUpdatedValuePresence = withUpdatedValuePresence(devices.getKeyboards(), i, z);
        IntSet withUpdatedValuePresence2 = withUpdatedValuePresence(devices.getMice(), i, z2);
        if (withUpdatedValuePresence == null && withUpdatedValuePresence2 == null) {
            return null;
        }
        if (withUpdatedValuePresence == null) {
            withUpdatedValuePresence = devices.getKeyboards();
        }
        if (withUpdatedValuePresence2 == null) {
            withUpdatedValuePresence2 = devices.getMice();
        }
        return devices.copy(withUpdatedValuePresence, withUpdatedValuePresence2);
    }

    private static final IntSet withUpdatedValuePresence(IntSet intSet, int i, boolean z) {
        boolean contains = intSet.contains(i);
        if (!contains || z) {
            if (contains || !z) {
                return null;
            }
            MutableIntSet mutableIntSet = new MutableIntSet(intSet.getSize() + 1);
            mutableIntSet.addAll(intSet);
            mutableIntSet.add(i);
            return mutableIntSet;
        }
        MutableIntSet mutableIntSet2 = new MutableIntSet(intSet.getSize() - 1);
        int[] iArr = intSet.elements;
        long[] jArr = intSet.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128 && iArr[(i2 << 3) + i4] != i) {
                            mutableIntSet2.add(i);
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return mutableIntSet2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isKeyboard(InputDevice inputDevice) {
        return inputDevice != null && !inputDevice.isVirtual() && hasSource(inputDevice, InputDeviceCompat.SOURCE_KEYBOARD) && inputDevice.getKeyboardType() == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isMouse(InputDevice inputDevice) {
        return (inputDevice == null || inputDevice.isVirtual() || !hasSource(inputDevice, InputDeviceCompat.SOURCE_MOUSE) || hasSource(inputDevice, InputDeviceCompat.SOURCE_STYLUS)) ? false : true;
    }

    private static final boolean hasSource(InputDevice inputDevice, int i) {
        return (inputDevice.getSources() & i) == i;
    }
}
