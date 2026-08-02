package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import app.cash.arcade.values.KeypadExtraKey;
import app.cash.arcade.values.keypad.KeypadTextState;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.Widget;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.fillr.featuretoggle.UnleashContext;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.ui.widget.keypad.ExtraButton;
import com.squareup.cash.ui.widget.keypad.KeypadAmount;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class KeypadScaffoldBinding extends AbstractComposeView implements Widget {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ParcelableSnapshotMutableState decimalKey$delegate;
    public final ParcelableSnapshotMutableState extraKey$delegate;
    public final UnleashContext footer;
    public final FrameLayout footerSlot;
    public final UnleashContext header;
    public final FrameLayout headerSlot;
    public final KeypadAmount keypadAmount;
    public Modifier modifier;
    public Function1 onChanged;
    public KeypadTextState state;
    public boolean updating;
    public final KeypadScaffoldBinding value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeypadScaffoldBinding(Context context) {
        super(context, null, 6, 0);
        context.getClass();
        this.state = new KeypadTextState("0", 0L);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.headerSlot = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.footerSlot = frameLayout2;
        this.value = this;
        this.modifier = Modifier.Companion.$$INSTANCE;
        this.header = new UnleashContext(frameLayout);
        this.footer = new UnleashContext(frameLayout2);
        this.decimalKey$delegate = Updater.mutableStateOf$default(".");
        this.onChanged = new NavBarBinding$$ExternalSyntheticLambda2(21);
        this.extraKey$delegate = Updater.mutableStateOf$default(KeypadExtraKey.NONE);
        zzr zzrVar = new zzr(this, 16);
        KeypadAmount keypadAmount = new KeypadAmount();
        keypadAmount.setMaxAmount(Double.valueOf(9999999.99d));
        keypadAmount.onAmountChangedListener = zzrVar;
        this.keypadAmount = keypadAmount;
    }

    public static final void access$stateChanged(KeypadScaffoldBinding keypadScaffoldBinding, KeypadAmount keypadAmount) {
        if (keypadScaffoldBinding.updating) {
            return;
        }
        KeypadTextState keypadTextState = keypadScaffoldBinding.state;
        String str = keypadAmount.amountText;
        keypadTextState.getClass();
        long j = keypadTextState.version + 1;
        KeypadTextState keypadTextState2 = new KeypadTextState(str, j);
        KeypadTextState keypadTextState3 = keypadScaffoldBinding.state;
        keypadTextState3.getClass();
        String str2 = keypadTextState3.text;
        str2.getClass();
        if (new KeypadTextState(str2, j).equals(keypadTextState2)) {
            return;
        }
        keypadScaffoldBinding.state = keypadTextState2;
        keypadScaffoldBinding.onChanged.invoke(keypadTextState2);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        ExtraButton extraButton;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2096713565);
        int i2 = i | (gapComposer.changedInstance(this) ? 4 : 2);
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            androidx.compose.ui.Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            androidx.compose.ui.Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            androidx.compose.ui.Modifier fillMaxWidth = SizeKt.fillMaxWidth(Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier, 1.0f, true), 1.0f);
            boolean changedInstance = gapComposer.changedInstance(this);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new Function1(this) { // from class: com.squareup.cash.arcade.treehouse.KeypadScaffoldBinding$$ExternalSyntheticLambda0
                    public final /* synthetic */ KeypadScaffoldBinding f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i5 = i3;
                        KeypadScaffoldBinding keypadScaffoldBinding = this.f$0;
                        Context context = (Context) obj;
                        switch (i5) {
                            case 0:
                                int i6 = KeypadScaffoldBinding.$r8$clinit;
                                context.getClass();
                                return keypadScaffoldBinding.headerSlot;
                            default:
                                int i7 = KeypadScaffoldBinding.$r8$clinit;
                                context.getClass();
                                return keypadScaffoldBinding.footerSlot;
                        }
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AndroidView_androidKt.AndroidView((Function1) rememberedValue, fillMaxWidth, null, gapComposer, 0, 4);
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.extraKey$delegate;
            boolean changed = gapComposer.changed(((KeypadExtraKey) parcelableSnapshotMutableState.getValue()).ordinal());
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                int ordinal = ((KeypadExtraKey) parcelableSnapshotMutableState.getValue()).ordinal();
                if (ordinal == 0) {
                    extraButton = ExtraButton.NONE;
                } else if (ordinal == 1) {
                    extraButton = ExtraButton.DECIMAL;
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    extraButton = ExtraButton.ABC;
                }
                rememberedValue2 = extraButton;
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            ExtraButton extraButton2 = (ExtraButton) rememberedValue2;
            String str = (String) this.decimalKey$delegate.getValue();
            boolean changedInstance2 = gapComposer.changedInstance(this);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new Function0(this) { // from class: com.squareup.cash.arcade.treehouse.KeypadScaffoldBinding$$ExternalSyntheticLambda1
                    public final /* synthetic */ KeypadScaffoldBinding f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i5 = i3;
                        KeypadScaffoldBinding keypadScaffoldBinding = this.f$0;
                        switch (i5) {
                            case 0:
                                keypadScaffoldBinding.keypadAmount.onBackspace();
                                break;
                            default:
                                keypadScaffoldBinding.keypadAmount.onLongBackspace();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Function0 function0 = (Function0) rememberedValue3;
            boolean changedInstance3 = gapComposer.changedInstance(this);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new Function0(this) { // from class: com.squareup.cash.arcade.treehouse.KeypadScaffoldBinding$$ExternalSyntheticLambda1
                    public final /* synthetic */ KeypadScaffoldBinding f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i5 = i4;
                        KeypadScaffoldBinding keypadScaffoldBinding = this.f$0;
                        switch (i5) {
                            case 0:
                                keypadScaffoldBinding.keypadAmount.onBackspace();
                                break;
                            default:
                                keypadScaffoldBinding.keypadAmount.onLongBackspace();
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Function0 function02 = (Function0) rememberedValue4;
            boolean changedInstance4 = gapComposer.changedInstance(this) | gapComposer.changed(extraButton2.ordinal());
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance4 || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new BadgeQueries$$ExternalSyntheticLambda0(11, this, extraButton2);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            KeypadKt.m3643KeyPadf8fvdUg(null, 0L, 0L, extraButton2, str, null, function0, function02, (Function1) rememberedValue5, gapComposer, 0);
            gapComposer = gapComposer;
            androidx.compose.ui.Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            boolean changedInstance5 = gapComposer.changedInstance(this);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changedInstance5 || rememberedValue6 == neverEqualPolicy) {
                z = true;
                final char c = 1 == true ? 1 : 0;
                rememberedValue6 = new Function1(this) { // from class: com.squareup.cash.arcade.treehouse.KeypadScaffoldBinding$$ExternalSyntheticLambda0
                    public final /* synthetic */ KeypadScaffoldBinding f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i5 = c;
                        KeypadScaffoldBinding keypadScaffoldBinding = this.f$0;
                        Context context = (Context) obj;
                        switch (i5) {
                            case 0:
                                int i6 = KeypadScaffoldBinding.$r8$clinit;
                                context.getClass();
                                return keypadScaffoldBinding.headerSlot;
                            default:
                                int i7 = KeypadScaffoldBinding.$r8$clinit;
                                context.getClass();
                                return keypadScaffoldBinding.footerSlot;
                        }
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue6);
            } else {
                z = true;
            }
            AndroidView_androidKt.AndroidView((Function1) rememberedValue6, fillMaxWidth2, null, gapComposer, 48, 4);
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ButtonBinding$$ExternalSyntheticLambda2(this, i, 20);
        }
    }

    @Override // app.cash.redwood.widget.Widget
    public final app.cash.redwood.Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.value;
    }

    @Override // app.cash.redwood.widget.Widget
    public void setModifier(app.cash.redwood.Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
