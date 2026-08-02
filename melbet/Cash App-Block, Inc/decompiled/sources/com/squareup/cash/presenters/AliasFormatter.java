package com.squareup.cash.presenters;

import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1$1;
import androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.DialogWrapper;
import androidx.glance.layout.SpacerKt$Spacer$3;
import app.cash.molecule.PlatformKt;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.presenters.AliasFormatter;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.util.android.PhoneNumbers;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class AliasFormatter {
    public static final void Dialog(Function0 function0, DialogProperties dialogProperties, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        int i3;
        Object obj;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(826668973);
        int i4 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(dialogProperties) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 256 : 128;
        }
        int i5 = i2;
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
            View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            LayoutDirection layoutDirection = (LayoutDirection) gapComposer.consume(CompositionLocalsKt.LocalLayoutDirection);
            GapComposer.CompositionContextImpl buildContext = gapComposer.buildContext();
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(composableLambdaImpl, gapComposer);
            Object[] objArr = new Object[0];
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            Object obj2 = rememberedValue;
            if (rememberedValue == neverEqualPolicy) {
                AndroidPopup_androidKt$Popup$popupId$1$1 androidPopup_androidKt$Popup$popupId$1$1 = AndroidPopup_androidKt$Popup$popupId$1$1.INSTANCE$1;
                gapComposer.updateRememberedValue(androidPopup_androidKt$Popup$popupId$1$1);
                obj2 = androidPopup_androidKt$Popup$popupId$1$1;
            }
            UUID uuid = (UUID) SaverKt.rememberSaveable(objArr, (Function0) obj2, gapComposer, 48);
            boolean changed = gapComposer.changed(dialogProperties.windowType) | gapComposer.changed(view) | gapComposer.changed(density) | gapComposer.changed((Object) null);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                DialogWrapper dialogWrapper = new DialogWrapper(function0, dialogProperties, view, layoutDirection, density, uuid);
                dialogWrapper.dialogLayout.setContent(buildContext, new ComposableLambdaImpl(new SpacerKt$Spacer$3(rememberUpdatedState, i4), true, -1338939603));
                gapComposer.updateRememberedValue(dialogWrapper);
                rememberedValue2 = dialogWrapper;
            }
            DialogWrapper dialogWrapper2 = (DialogWrapper) rememberedValue2;
            boolean changedInstance = gapComposer.changedInstance(dialogWrapper2);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                i3 = 1;
                DialogWrapper.AnonymousClass2 anonymousClass2 = new DialogWrapper.AnonymousClass2(dialogWrapper2, i3);
                gapComposer.updateRememberedValue(anonymousClass2);
                obj = anonymousClass2;
            } else {
                i3 = 1;
                obj = rememberedValue3;
            }
            Updater.DisposableEffect(dialogWrapper2, (Function1) obj, gapComposer);
            int i6 = (gapComposer.changedInstance(dialogWrapper2) ? 1 : 0) | ((i5 & 14) == 4 ? i3 : 0) | ((i5 & 112) == 32 ? i3 : 0) | (gapComposer.changed(layoutDirection.ordinal()) ? 1 : 0);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (i6 != 0 || rememberedValue4 == neverEqualPolicy) {
                AndroidPopup_androidKt$Popup$3$1 androidPopup_androidKt$Popup$3$1 = new AndroidPopup_androidKt$Popup$3$1(dialogWrapper2, function0, dialogProperties, layoutDirection, 1);
                gapComposer.updateRememberedValue(androidPopup_androidKt$Popup$3$1);
                rememberedValue4 = androidPopup_androidKt$Popup$3$1;
            }
            Updater.SideEffect((Function0) rememberedValue4, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AndroidDialog_androidKt$Dialog$3(function0, dialogProperties, composableLambdaImpl, i, 0);
        }
    }

    public static final void access$DialogLayout(final Modifier modifier, final Function2 function2, Composer composer, final int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1090521195);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function2) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = AndroidPopup_androidKt$SimpleStack$1$1.INSTANCE$1;
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            int i3 = ((i2 << 3) & 112) | ((i2 >> 3) & 14) | MLKEMEngine.KyberPolyBytes;
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            int i4 = ((i3 << 6) & 896) | 6;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, measurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Recorder$$ExternalSyntheticOutline1.m((i4 >> 6) & 14, function2, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                    AliasFormatter.access$DialogLayout(Modifier.this, function2, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewBoostInBoostPicker.deepLinkSpecs;
    }

    public static final String getDisplayText(String str, UiAlias.Type type2, PhoneNumbers.Format format2) {
        str.getClass();
        type2.getClass();
        int ordinal = type2.ordinal();
        if (ordinal == 0) {
            return PhoneNumbers.format(str, "US", format2);
        }
        if (ordinal == 1 || ordinal == 2) {
            return str;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m((Object) type2, "Invalid type: ");
        return null;
    }
}
