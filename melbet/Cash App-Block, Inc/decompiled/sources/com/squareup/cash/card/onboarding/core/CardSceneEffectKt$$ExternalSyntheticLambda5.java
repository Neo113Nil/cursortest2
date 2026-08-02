package com.squareup.cash.card.onboarding.core;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$Horizontal;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.Colors;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda2;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.compose_ui.ComposeColorPalette;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.ButtonSize;
import com.squareup.cash.mooncake.compose_ui.components.ButtonStyle;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.OnPressBehaviour;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.offers.db.OffersHomeQueries$$ExternalSyntheticLambda1;
import java.util.Map;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardSceneEffectKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$10;
    public final /* synthetic */ Object f$11;
    public final /* synthetic */ Object f$12;
    public final /* synthetic */ Function f$13;
    public final /* synthetic */ Object f$14;
    public final /* synthetic */ int f$17;
    public final /* synthetic */ State f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ boolean f$5;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ Object f$8;
    public final /* synthetic */ Object f$9;

    public /* synthetic */ CardSceneEffectKt$$ExternalSyntheticLambda5(Modifier modifier, MutableState mutableState, State state, State state2, State state3, boolean z, MutableState mutableState2, MutableState mutableState3, State state4, State state5, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i, int i2) {
        this.f$0 = modifier;
        this.f$1 = mutableState;
        this.f$2 = state;
        this.f$3 = state2;
        this.f$4 = state3;
        this.f$5 = z;
        this.f$7 = mutableState2;
        this.f$8 = mutableState3;
        this.f$9 = state4;
        this.f$10 = state5;
        this.f$11 = function1;
        this.f$12 = function12;
        this.f$13 = function13;
        this.f$14 = function14;
        this.f$17 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Applier applier;
        MooncakePillButton.Style style;
        long j;
        Modifier modifier;
        boolean z;
        Modifier m178borderxT4_qwU;
        boolean z2;
        float f;
        int i = this.$r8$classId;
        Object obj3 = this.f$14;
        Function function = this.f$13;
        Object obj4 = this.f$12;
        Object obj5 = this.f$11;
        Object obj6 = this.f$10;
        Object obj7 = this.f$9;
        Object obj8 = this.f$4;
        Object obj9 = this.f$3;
        Object obj10 = this.f$8;
        Object obj11 = this.f$7;
        Object obj12 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                CardSceneEffectKt.CardSceneEffect(this.f$0, (MutableState) obj12, this.f$2, (State) obj9, (State) obj8, this.f$5, (MutableState) obj11, (MutableState) obj10, (State) obj7, (State) obj6, (Function1) obj5, (Function1) obj4, (Function1) function, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1), this.f$17);
                return Unit.INSTANCE;
            case 1:
                ButtonSize buttonSize = (ButtonSize) obj12;
                ButtonStyle buttonStyle = (ButtonStyle) obj11;
                OnPressBehaviour onPressBehaviour = (OnPressBehaviour) obj10;
                Function0 function0 = (Function0) obj9;
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj8;
                Color color = (Color) obj7;
                String str = (String) obj6;
                MooncakePillButton.Style style2 = (MooncakePillButton.Style) obj5;
                Arrangement$Horizontal arrangement$Horizontal = (Arrangement$Horizontal) obj4;
                Function3 function3 = (Function3) function;
                String str2 = (String) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Updater.CompositionLocalProvider(new ProvidedValue[]{ComposeMooncakeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(buttonSize.textStyle), re$$ExternalSyntheticOutline0.m(buttonStyle.textColor, ComposeMooncakeThemeKt.LocalTextColor)}, Expect_jvmKt.rememberComposableLambda(-1193944069, new CardSceneEffectKt$$ExternalSyntheticLambda5(this.f$0, buttonSize, onPressBehaviour, this.f$2, buttonStyle, this.f$5, function0, mutableInteractionSourceImpl, color, str, style2, arrangement$Horizontal, function3, str2, this.f$17), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ButtonSize buttonSize2 = (ButtonSize) obj12;
                OnPressBehaviour onPressBehaviour2 = (OnPressBehaviour) obj11;
                ButtonStyle buttonStyle2 = (ButtonStyle) obj10;
                Function0 function02 = (Function0) obj9;
                MutableInteractionSourceImpl mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) obj8;
                Color color2 = (Color) obj7;
                String str3 = (String) obj6;
                MooncakePillButton.Style style3 = (MooncakePillButton.Style) obj5;
                Arrangement$Horizontal arrangement$Horizontal2 = (Arrangement$Horizontal) obj4;
                Function3 function32 = (Function3) function;
                String str4 = (String) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                boolean shouldExecute = gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2);
                Applier applier2 = gapComposer2.applier;
                if (shouldExecute) {
                    Modifier m276defaultMinSizeVpY3zN4$default = SizeKt.m276defaultMinSizeVpY3zN4$default(this.f$0, RecyclerView.DECELERATION_RATE, buttonSize2.minHeight, 1);
                    boolean changed = gapComposer2.changed(onPressBehaviour2.ordinal());
                    State state = this.f$2;
                    boolean changed2 = changed | gapComposer2.changed(state);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changed2 || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new MusicViewKt$$ExternalSyntheticLambda6(15, onPressBehaviour2, state);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Modifier graphicsLayer = ColorKt.graphicsLayer(m276defaultMinSizeVpY3zN4$default, (Function1) rememberedValue);
                    boolean z3 = buttonStyle2.hasRoundedCorners;
                    long j2 = buttonStyle2.backgroundColor;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier then = graphicsLayer.then(z3 ? ClipKt.clip(companion, RoundedCornerShapeKt.RoundedCornerShape(50)) : companion);
                    boolean z4 = this.f$5;
                    if (!z4 || function02 == null) {
                        applier = applier2;
                        style = style3;
                        j = j2;
                        gapComposer2.startReplaceGroup(2132527284);
                        boolean changed3 = gapComposer2.changed(str3) | gapComposer2.changed(function02) | gapComposer2.changed(z4);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (changed3 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new DialogHostKt$$ExternalSyntheticLambda2(str3, z4, function02, 9);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        Modifier semantics = SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue2);
                        gapComposer2.end(false);
                        modifier = semantics;
                    } else {
                        gapComposer2.startReplaceGroup(2131969563);
                        MooncakeTheme.getColors(gapComposer2);
                        applier = applier2;
                        style = style3;
                        j = j2;
                        Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(companion, mutableInteractionSourceImpl2, RippleKt.m500rippleH2RKhps$default(RecyclerView.DECELERATION_RATE, 3, ComposeColorPalette.m3637pressColorEGaQkGg(color2 != null ? color2.value : j2, gapComposer2), false), false, str3, null, function02, 20);
                        companion = companion;
                        Object rememberedValue3 = gapComposer2.rememberedValue();
                        if (rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new OffersHomeQueries$$ExternalSyntheticLambda1(9);
                            gapComposer2.updateRememberedValue(rememberedValue3);
                        }
                        modifier = SemanticsModifierKt.semantics(m182clickableO2vRcR0$default, false, (Function1) rememberedValue3);
                        gapComposer2.end(false);
                    }
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(then.then(modifier), color2 != null ? color2.value : j, ColorKt.RectangleShape);
                    int ordinal = style.ordinal();
                    if (ordinal == 4) {
                        z = false;
                        gapComposer2.startReplaceGroup(-623921518);
                        m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(companion, 2.0f, MooncakeTheme.getColors(gapComposer2).outlineButtonBorder, RoundedCornerShapeKt.RoundedCornerShape(50));
                        gapComposer2.end(false);
                    } else if (ordinal != 5) {
                        gapComposer2.startReplaceGroup(-623906813);
                        z = false;
                        gapComposer2.end(false);
                        m178borderxT4_qwU = companion;
                    } else {
                        z = false;
                        gapComposer2.startReplaceGroup(-623913574);
                        m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(companion, 2.0f, MooncakeTheme.getColors(gapComposer2).outlineButtonSelectedBorder, RoundedCornerShapeKt.RoundedCornerShape(50));
                        gapComposer2.end(false);
                    }
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(m177backgroundbw27NRU.then(m178borderxT4_qwU), buttonSize2.horizontal, buttonSize2.vertical);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, z);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m299paddingVpY3zN4);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$Horizontal2, Alignment.Companion.CenterVertically, gapComposer2, 48);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, companion);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    if (function32 != null) {
                        gapComposer2.startReplaceGroup(-552855912);
                        function32.invoke(RowScopeInstance.INSTANCE, gapComposer2, 6);
                        z2 = false;
                        gapComposer2.end(false);
                    } else {
                        z2 = false;
                        gapComposer2.startReplaceGroup(-552820355);
                        gapComposer2.end(false);
                    }
                    if (z4) {
                        gapComposer2.startReplaceGroup(512713465);
                        gapComposer2.end(z2);
                        f = 1.0f;
                    } else {
                        gapComposer2.startReplaceGroup(-294921075);
                        long j3 = ((Color) gapComposer2.consume(ContentColorKt.LocalContentColor)).value;
                        if (((Colors) gapComposer2.consume(ColorsKt.LocalColors)).isLight()) {
                            ColorKt.m690luminance8_81llA(j3);
                        } else {
                            ColorKt.m690luminance8_81llA(j3);
                        }
                        gapComposer2.end(false);
                        f = 0.38f;
                    }
                    Modifier alpha = AlphaKt.alpha(companion, f);
                    gapComposer2.startReplaceGroup(302311945);
                    long j4 = ((Color) gapComposer2.consume(ComposeMooncakeThemeKt.LocalTextColor)).value;
                    if (j4 == 16) {
                        j4 = MooncakeTheme.getColors(gapComposer2).label;
                    }
                    long j5 = j4;
                    gapComposer2.end(false);
                    KeypadKt.m3651TextPdH14aY(this.f$17, 0, 3, 0, 0, 0, 3796, j5, (Composer) gapComposer2, alpha, (TextStyle) null, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                    gapComposer2.startReplaceGroup(-552377923);
                    gapComposer2.end(false);
                    gapComposer2.end(true);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CardSceneEffectKt$$ExternalSyntheticLambda5(Modifier modifier, ButtonSize buttonSize, OnPressBehaviour onPressBehaviour, State state, ButtonStyle buttonStyle, boolean z, Function0 function0, MutableInteractionSourceImpl mutableInteractionSourceImpl, Color color, String str, MooncakePillButton.Style style, Arrangement$Horizontal arrangement$Horizontal, Function3 function3, String str2, int i) {
        this.f$0 = modifier;
        this.f$1 = buttonSize;
        this.f$7 = onPressBehaviour;
        this.f$2 = state;
        this.f$8 = buttonStyle;
        this.f$5 = z;
        this.f$3 = function0;
        this.f$4 = mutableInteractionSourceImpl;
        this.f$9 = color;
        this.f$10 = str;
        this.f$11 = style;
        this.f$12 = arrangement$Horizontal;
        this.f$13 = function3;
        this.f$14 = str2;
        this.f$17 = i;
    }

    public /* synthetic */ CardSceneEffectKt$$ExternalSyntheticLambda5(ButtonSize buttonSize, ButtonStyle buttonStyle, Modifier modifier, OnPressBehaviour onPressBehaviour, State state, boolean z, Function0 function0, MutableInteractionSourceImpl mutableInteractionSourceImpl, Color color, String str, MooncakePillButton.Style style, Arrangement$Horizontal arrangement$Horizontal, Function3 function3, String str2, int i) {
        this.f$1 = buttonSize;
        this.f$7 = buttonStyle;
        this.f$0 = modifier;
        this.f$8 = onPressBehaviour;
        this.f$2 = state;
        this.f$5 = z;
        this.f$3 = function0;
        this.f$4 = mutableInteractionSourceImpl;
        this.f$9 = color;
        this.f$10 = str;
        this.f$11 = style;
        this.f$12 = arrangement$Horizontal;
        this.f$13 = function3;
        this.f$14 = str2;
        this.f$17 = i;
    }
}
