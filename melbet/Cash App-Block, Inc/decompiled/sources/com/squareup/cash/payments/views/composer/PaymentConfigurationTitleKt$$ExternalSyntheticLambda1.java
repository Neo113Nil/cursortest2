package com.squareup.cash.payments.views.composer;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationTitleViewModel;
import com.squareup.cash.payments.viewmodels.TitleTapped;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda25;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda8;
import com.squareup.protos.cash.ui.Image;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class PaymentConfigurationTitleKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PaymentConfigurationTitleViewModel.TitleViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ PaymentConfigurationTitleKt$$ExternalSyntheticLambda1(PaymentConfigurationTitleViewModel.TitleViewModel titleViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = titleViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        String m;
        boolean z2;
        Color m2;
        long j;
        int i = this.$r8$classId;
        Object obj3 = Composer.Companion.Empty;
        Function1 function1 = this.f$1;
        final PaymentConfigurationTitleViewModel.TitleViewModel titleViewModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = 1;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-175655257, new PaymentConfigurationTitleKt$$ExternalSyntheticLambda1(titleViewModel, function1, i2), gapComposer);
                    if (titleViewModel.animationEnabled) {
                        gapComposer.startReplaceGroup(1115172536);
                        EnterTransitionImpl fadeIn = EnterExitTransitionKt.fadeIn(0.05f, AnimatableKt.tween$default(0, 0, null, 7));
                        TweenSpec tween$default = AnimatableKt.tween$default(0, 0, null, 7);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == obj3) {
                            rememberedValue = new SvgDecoder$$ExternalSyntheticLambda0(1);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        AnimatedContentKt.AnimatedVisibility(true, (Modifier) null, fadeIn.plus(EnterExitTransitionKt.slideInVertically(tween$default, (Function1) rememberedValue)), ExitTransitionImpl.None, (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(-1353201959, new OverlayKt$$ExternalSyntheticLambda0(rememberComposableLambda, 26), gapComposer), (Composer) gapComposer, 196998, 18);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1115459813);
                        rememberComposableLambda.invoke((Object) gapComposer, (Object) 6);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                boolean shouldExecute = gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2);
                Applier applier = gapComposer2.applier;
                if (shouldExecute) {
                    BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                    boolean changedInstance = gapComposer2.changedInstance(titleViewModel) | gapComposer2.changed(function1);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue2 == obj3) {
                        rememberedValue2 = new OpenSourceKt$$ExternalSyntheticLambda11(3, titleViewModel, function1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue2);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer2, 48);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, clearAndSetSemantics);
                    ComposeUiNode.Companion.getClass();
                    Function0 function0 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(function0);
                    } else {
                        gapComposer2.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                    gapComposer2.startReplaceGroup(-1648334307);
                    if (!(((double) 1.0f) > 0.0d)) {
                        InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (rememberedValue3 == obj3) {
                        rememberedValue3 = new MainPaymentViewKt$$ExternalSyntheticLambda25(23);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    Modifier clearAndSetSemantics2 = SemanticsModifierKt.clearAndSetSemantics(layoutWeightElement, (Function1) rememberedValue3);
                    TitleTapped titleTapped = titleViewModel.action;
                    if (titleTapped != null) {
                        gapComposer2.startReplaceGroup(1534629087);
                        Object rememberedValue4 = gapComposer2.rememberedValue();
                        if (rememberedValue4 == obj3) {
                            rememberedValue4 = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
                        }
                        MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue4;
                        boolean changed = gapComposer2.changed(function1) | gapComposer2.changedInstance(titleTapped);
                        Object rememberedValue5 = gapComposer2.rememberedValue();
                        if (changed || rememberedValue5 == obj3) {
                            z = false;
                            rememberedValue5 = new PaymentConfigurationTitleKt$$ExternalSyntheticLambda7(function1, titleTapped, 0);
                            gapComposer2.updateRememberedValue(rememberedValue5);
                        } else {
                            z = false;
                        }
                        clearAndSetSemantics2 = ImageKt.m182clickableO2vRcR0$default(clearAndSetSemantics2, mutableInteractionSourceImpl, null, false, null, null, (Function0) rememberedValue5, 28);
                        gapComposer2.end(z);
                    } else {
                        z = false;
                        gapComposer2.startReplaceGroup(1534886449);
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(z);
                    RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer2, 48);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, clearAndSetSemantics2);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(function0);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    PaymentConfigurationTitleViewModel.TitleViewModel.AvatarViewModel avatarViewModel = titleViewModel.avatar;
                    if (avatarViewModel == null) {
                        gapComposer2.startReplaceGroup(-1272622895);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1272622894);
                        AvatarSize avatarSize = AvatarSize.Size32;
                        Image image = avatarViewModel.image;
                        if (image == null) {
                            gapComposer2.startReplaceGroup(1264665989);
                            gapComposer2.end(false);
                            m = null;
                        } else {
                            m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer2, -1067582980, image, gapComposer2, false);
                        }
                        AvatarImage.Remote.Image image2 = m != null ? new AvatarImage.Remote.Image(m, false, null, 0L, new SheetKt$$ExternalSyntheticLambda8(m, 1), 62) : null;
                        String valueOf2 = String.valueOf(avatarViewModel.monogram);
                        com.squareup.protos.cash.ui.Color color = avatarViewModel.accentColor;
                        if (color == null) {
                            gapComposer2.startReplaceGroup(1265088488);
                            z2 = false;
                            gapComposer2.end(false);
                            m2 = null;
                        } else {
                            z2 = false;
                            m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer2, -1067569351, color, gapComposer2, false);
                        }
                        if (m2 == null) {
                            gapComposer2.startReplaceGroup(-1067567849);
                            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, z2);
                            } else {
                                gapComposer2.startReplaceGroup(-1762997739);
                                gapComposer2.end(z2);
                            }
                            j = colors.semantic.icon.standard;
                            gapComposer2.end(z2);
                        } else {
                            gapComposer2.startReplaceGroup(-1067569802);
                            gapComposer2.end(z2);
                            j = m2.value;
                        }
                        TextViewKt.Avatar(avatarSize, new AvatarEntry(valueOf2, j, null, image2, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, true, gapComposer2, 3078, 20);
                        gapComposer2.end(false);
                    }
                    Room.m1165Text25TpFw(2, 1, 0, 0, 1769472, 0, 3998, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, titleViewModel.title, (Map) null, (Function1) null, false);
                    gapComposer2.end(true);
                    Object rememberedValue6 = gapComposer2.rememberedValue();
                    if (rememberedValue6 == obj3) {
                        rememberedValue6 = new MutableTransitionState(Boolean.FALSE);
                        gapComposer2.updateRememberedValue(rememberedValue6);
                    }
                    MutableTransitionState mutableTransitionState = (MutableTransitionState) rememberedValue6;
                    mutableTransitionState.setTargetState(Boolean.valueOf(titleViewModel.amount != null));
                    final int i3 = 0;
                    AnimatedContentKt.AnimatedVisibility(mutableTransitionState, (Modifier) null, EnterExitTransitionKt.expandHorizontally$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), null, 14).plus(EnterExitTransitionKt.fadeIn(0.05f, AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6))), EnterExitTransitionKt.shrinkHorizontally$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), null, 14).plus(EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), 2)), (String) null, Expect_jvmKt.rememberComposableLambda(1649819363, new Function3() { // from class: com.squareup.cash.payments.views.composer.PaymentConfigurationTitleKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            int i4 = i3;
                            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                            PaymentConfigurationTitleViewModel.TitleViewModel titleViewModel2 = titleViewModel;
                            switch (i4) {
                                case 0:
                                    Composer composer3 = (Composer) obj5;
                                    ((Integer) obj6).getClass();
                                    ((AnimatedVisibilityScope) obj4).getClass();
                                    String str = titleViewModel2.amount;
                                    String concat = " ".concat(str != null ? str : "");
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    Object rememberedValue7 = gapComposer3.rememberedValue();
                                    if (rememberedValue7 == neverEqualPolicy) {
                                        rememberedValue7 = new MainPaymentViewKt$$ExternalSyntheticLambda25(21);
                                        gapComposer3.updateRememberedValue(rememberedValue7);
                                    }
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer3, SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue7), (TextStyle) null, (TextLineBalancing) null, concat, (Map) null, (Function1) null, false);
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj5;
                                    ((Integer) obj6).getClass();
                                    ((AnimatedVisibilityScope) obj4).getClass();
                                    String str2 = titleViewModel2.preposition;
                                    String str3 = str2 == null ? "" : str2;
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                    if (colors2 == null) {
                                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1762997739);
                                        gapComposer4.end(false);
                                    }
                                    long j2 = colors2.semantic.text.subtle;
                                    Object rememberedValue8 = gapComposer4.rememberedValue();
                                    if (rememberedValue8 == neverEqualPolicy) {
                                        rememberedValue8 = new MainPaymentViewKt$$ExternalSyntheticLambda25(22);
                                        gapComposer4.updateRememberedValue(rememberedValue8);
                                    }
                                    Room.m1165Text25TpFw(3, 0, 0, 0, 196608, 0, 4052, j2, (Composer) gapComposer4, SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue8), (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), gapComposer2, 1600518);
                    Object rememberedValue7 = gapComposer2.rememberedValue();
                    if (rememberedValue7 == obj3) {
                        rememberedValue7 = new MutableTransitionState(Boolean.FALSE);
                        gapComposer2.updateRememberedValue(rememberedValue7);
                    }
                    MutableTransitionState mutableTransitionState2 = (MutableTransitionState) rememberedValue7;
                    mutableTransitionState2.setTargetState(Boolean.valueOf(titleViewModel.preposition != null));
                    final int i4 = 1;
                    AnimatedContentKt.AnimatedVisibility(mutableTransitionState2, (Modifier) null, EnterExitTransitionKt.fadeIn(0.05f, AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6)), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), 2), (String) null, Expect_jvmKt.rememberComposableLambda(1801537178, new Function3() { // from class: com.squareup.cash.payments.views.composer.PaymentConfigurationTitleKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            int i42 = i4;
                            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                            PaymentConfigurationTitleViewModel.TitleViewModel titleViewModel2 = titleViewModel;
                            switch (i42) {
                                case 0:
                                    Composer composer3 = (Composer) obj5;
                                    ((Integer) obj6).getClass();
                                    ((AnimatedVisibilityScope) obj4).getClass();
                                    String str = titleViewModel2.amount;
                                    String concat = " ".concat(str != null ? str : "");
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    Object rememberedValue72 = gapComposer3.rememberedValue();
                                    if (rememberedValue72 == neverEqualPolicy) {
                                        rememberedValue72 = new MainPaymentViewKt$$ExternalSyntheticLambda25(21);
                                        gapComposer3.updateRememberedValue(rememberedValue72);
                                    }
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer3, SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue72), (TextStyle) null, (TextLineBalancing) null, concat, (Map) null, (Function1) null, false);
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj5;
                                    ((Integer) obj6).getClass();
                                    ((AnimatedVisibilityScope) obj4).getClass();
                                    String str2 = titleViewModel2.preposition;
                                    String str3 = str2 == null ? "" : str2;
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                    if (colors2 == null) {
                                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1762997739);
                                        gapComposer4.end(false);
                                    }
                                    long j2 = colors2.semantic.text.subtle;
                                    Object rememberedValue8 = gapComposer4.rememberedValue();
                                    if (rememberedValue8 == neverEqualPolicy) {
                                        rememberedValue8 = new MainPaymentViewKt$$ExternalSyntheticLambda25(22);
                                        gapComposer4.updateRememberedValue(rememberedValue8);
                                    }
                                    Room.m1165Text25TpFw(3, 0, 0, 0, 196608, 0, 4052, j2, (Composer) gapComposer4, SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue8), (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), gapComposer2, 1600518);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
