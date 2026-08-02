package com.squareup.cash.payments.views.personalization;

import androidx.collection.internal.Lock;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.LinearGradient;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.borrow.views.BorrowHomeOverlayKt$BorrowHomeOverlay$1;
import com.squareup.cash.borrow.views.BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$2;
import com.squareup.cash.dialog.ArcadeModal2Kt;
import com.squareup.cash.mosaic.models.v1.TextFormat;
import com.squareup.cash.payments.viewmodels.Background;
import com.squareup.cash.payments.viewmodels.DialogViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentRecipientViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizedPaymentsReactionsState;
import com.squareup.cash.payments.viewmodels.SelectedTrack;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$2$1$1;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$4$1;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$3;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$4;
import com.squareup.cash.payments.views.UtilKt;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda3;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.ComposeBottomSheetKt;
import com.squareup.protos.cash.ui.Image;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class PersonalizePaymentRecipientViewKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ PersonalizePaymentRecipientViewModel.Loaded f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ PersonalizePaymentRecipientViewKt$$ExternalSyntheticLambda5(PersonalizePaymentRecipientViewModel.Loaded loaded, Function1 function1) {
        this.f$0 = loaded;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String m;
        Color m2;
        List list;
        Object quickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2;
        ConstraintSetForInlineDsl constraintSetForInlineDsl;
        MutableState mutableState;
        Object obj3;
        LinearGradient m132linearGradientmHitzGk;
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i = 2;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    final PersonalizePaymentRecipientViewModel.Loaded loaded = this.f$0;
                    Background background = loaded.background;
                    Image image = background != null ? background.fullSize : null;
                    if (image == null) {
                        gapComposer.startReplaceGroup(-941934765);
                        gapComposer.end(false);
                        m = null;
                    } else {
                        m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer, -1692952978, image, gapComposer, false);
                    }
                    if (m == null) {
                        m = "";
                    }
                    com.squareup.protos.cash.ui.Color color = background != null ? background.color : null;
                    if (color == null) {
                        gapComposer.startReplaceGroup(-941866410);
                        gapComposer.end(false);
                        m2 = null;
                    } else {
                        m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -1692950773, color, gapComposer, false);
                    }
                    long j = m2 != null ? m2.value : Color.Black;
                    if (background == null || (list = background.effects) == null) {
                        list = EmptyList.INSTANCE;
                    }
                    AlphaKt.m3714PersonalizePaymentBackgroundcf5BqRc(fillMaxSize, m, j, list, gapComposer, 6);
                    if (loaded.showExpressivePaymentsUi) {
                        gapComposer.startReplaceGroup(-941685121);
                        Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                        m132linearGradientmHitzGk = Lock.m132linearGradientmHitzGk((Pair[]) Arrays.copyOf(r8, new Pair[]{new Pair(Float.valueOf(RecyclerView.DECELERATION_RATE), new Color(Color.m675copywmQWz5c$default(0.5f, Color.Black, 14))), new Pair(Float.valueOf(0.5f), new Color(Color.Transparent))}.length), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & BodyPartID.bodyIdMax));
                        BoxKt.Box(ImageKt.background$default(fillMaxSize2, m132linearGradientmHitzGk, null, 6), gapComposer, 6);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-941375679);
                        gapComposer.end(false);
                    }
                    Modifier fillMaxSize3 = SizeKt.fillMaxSize(companion, 1.0f);
                    gapComposer.startReplaceGroup(-1003410150);
                    gapComposer.startReplaceGroup(212064437);
                    gapComposer.end(false);
                    Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                    Object rememberedValue = gapComposer.rememberedValue();
                    Object obj4 = Composer.Companion.Empty;
                    if (rememberedValue == obj4) {
                        rememberedValue = new Measurer2(density);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Measurer2 measurer2 = (Measurer2) rememberedValue;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == obj4) {
                        rememberedValue2 = new ConstraintLayoutScope();
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) rememberedValue2;
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (rememberedValue3 == obj4) {
                        rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    MutableState mutableState2 = (MutableState) rememberedValue3;
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (rememberedValue4 == obj4) {
                        rememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                        gapComposer.updateRememberedValue(rememberedValue4);
                    }
                    ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) rememberedValue4;
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    if (rememberedValue5 == obj4) {
                        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(Unit.INSTANCE, NeverEqualPolicy.INSTANCE);
                        gapComposer.updateRememberedValue(parcelableSnapshotMutableState);
                        rememberedValue5 = parcelableSnapshotMutableState;
                    }
                    final MutableState mutableState3 = (MutableState) rememberedValue5;
                    boolean changedInstance = gapComposer.changedInstance(measurer2) | gapComposer.changed(EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                    Object rememberedValue6 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue6 == obj4) {
                        quickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2 = new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2(mutableState3, measurer2, constraintSetForInlineDsl2, mutableState2, 4);
                        constraintSetForInlineDsl = constraintSetForInlineDsl2;
                        mutableState = mutableState2;
                        gapComposer.updateRememberedValue(quickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2);
                    } else {
                        quickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2 = rememberedValue6;
                        constraintSetForInlineDsl = constraintSetForInlineDsl2;
                        mutableState = mutableState2;
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) quickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2;
                    Object rememberedValue7 = gapComposer.rememberedValue();
                    if (rememberedValue7 == obj4) {
                        rememberedValue7 = new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$3(mutableState, constraintSetForInlineDsl, 4);
                        gapComposer.updateRememberedValue(rememberedValue7);
                    }
                    final Function0 function0 = (Function0) rememberedValue7;
                    boolean changedInstance2 = gapComposer.changedInstance(measurer2);
                    Object rememberedValue8 = gapComposer.rememberedValue();
                    if (changedInstance2 || rememberedValue8 == obj4) {
                        rememberedValue8 = new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$4(measurer2, 4);
                        gapComposer.updateRememberedValue(rememberedValue8);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(fillMaxSize3, false, (Function1) rememberedValue8);
                    final Function1 function1 = this.f$1;
                    RulerKt.MultiMeasureLayout(semantics, Expect_jvmKt.rememberComposableLambda(1200550679, new Function2() { // from class: com.squareup.cash.payments.views.personalization.PersonalizePaymentRecipientViewKt$PersonalizePaymentRecipient$lambda$0$0$$inlined$ConstraintLayout$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj5, Object obj6) {
                            PersonalizePaymentRecipientViewModel.Loaded loaded2;
                            Color m3;
                            Color m4;
                            TextFormat textFormat;
                            TextFormat textFormat2;
                            ConstrainedLayoutReference constrainedLayoutReference;
                            ConstrainedLayoutReference constrainedLayoutReference2;
                            Function1 function12;
                            Color m5;
                            Color m6;
                            TextFormat textFormat3;
                            TextFormat textFormat4;
                            Composer composer2 = (Composer) obj5;
                            if ((((Number) obj6).intValue() & 3) == 2) {
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.getSkipping()) {
                                    gapComposer2.skipToGroupEnd();
                                    return Unit.INSTANCE;
                                }
                            }
                            MutableState.this.setValue(Unit.INSTANCE);
                            ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                            constraintLayoutScope2.getClass();
                            constraintLayoutScope2.reset();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            gapComposer3.startReplaceGroup(1953807872);
                            ConstraintLayoutScope constraintLayoutScope3 = (ConstraintLayoutScope) constraintLayoutScope2.createRefs().mClientFragmentManager;
                            ConstrainedLayoutReference createRef = constraintLayoutScope3.createRef();
                            ConstrainedLayoutReference createRef2 = constraintLayoutScope3.createRef();
                            ConstrainedLayoutReference createRef3 = constraintLayoutScope3.createRef();
                            ConstrainedLayoutReference createRef4 = constraintLayoutScope3.createRef();
                            ConstrainedLayoutReference createRef5 = constraintLayoutScope3.createRef();
                            ConstrainedLayoutReference createRef6 = constraintLayoutScope3.createRef();
                            ConstrainedLayoutReference createRef7 = constraintLayoutScope3.createRef();
                            ConstrainedLayoutReference createRef8 = constraintLayoutScope3.createRef();
                            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                            Modifier zIndex = ZIndexModifierKt.zIndex(companion2, Float.MAX_VALUE);
                            Object rememberedValue9 = gapComposer3.rememberedValue();
                            Object obj7 = Composer.Companion.Empty;
                            if (rememberedValue9 == obj7) {
                                rememberedValue9 = PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1.INSTANCE$1;
                                gapComposer3.updateRememberedValue(rememberedValue9);
                            }
                            Modifier constrainAs = ConstraintLayoutScope.constrainAs(zIndex, createRef6, (Function1) rememberedValue9);
                            PersonalizePaymentRecipientViewModel.Loaded loaded3 = loaded;
                            PersonalizedPaymentsReactionsState personalizedPaymentsReactionsState = loaded3.reactionsState;
                            boolean z = loaded3.showExpressivePaymentsUi;
                            Background background2 = loaded3.background;
                            boolean isReactionBarVisible = personalizedPaymentsReactionsState.isReactionBarVisible();
                            EnterTransitionImpl fadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 3);
                            ExitTransitionImpl fadeOut$default = EnterExitTransitionKt.fadeOut$default(null, 3);
                            Function1 function13 = function1;
                            AnimatedContentKt.AnimatedVisibility(isReactionBarVisible, constrainAs, fadeIn$default, fadeOut$default, (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(1829310768, new BorrowHomeOverlayKt$BorrowHomeOverlay$1(1, function13), gapComposer3), (Composer) gapComposer3, 200064, 16);
                            Modifier statusBarsPadding = z ? companion2 : SpacerKt.statusBarsPadding(companion2);
                            Object rememberedValue10 = gapComposer3.rememberedValue();
                            if (rememberedValue10 == obj7) {
                                rememberedValue10 = PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1.INSTANCE$3;
                                gapComposer3.updateRememberedValue(rememberedValue10);
                            }
                            Modifier overlay = UtilKt.overlay(ConstraintLayoutScope.constrainAs(statusBarsPadding, createRef, (Function1) rememberedValue10), personalizedPaymentsReactionsState.isReactionBarVisible());
                            boolean changed = gapComposer3.changed(function13);
                            Object rememberedValue11 = gapComposer3.rememberedValue();
                            if (changed || rememberedValue11 == obj7) {
                                rememberedValue11 = new QuickPayViewKt$QuickPay$1$1$1$2$2$1$1(7, function13);
                                gapComposer3.updateRememberedValue(rememberedValue11);
                            }
                            AlphaKt.PersonalizedPaymentToolbar(overlay, (Function0) rememberedValue11, null, loaded3.recipients, false, true, loaded3.isCurrentCustomerSender, loaded3.showExpressivePaymentsUi, null, false, gapComposer3, 196608, 788);
                            GapComposer gapComposer4 = gapComposer3;
                            if (z) {
                                gapComposer4.startReplaceGroup(1955259477);
                                boolean changed2 = gapComposer4.changed(createRef);
                                Object rememberedValue12 = gapComposer4.rememberedValue();
                                if (changed2 || rememberedValue12 == obj7) {
                                    rememberedValue12 = new QuickPayViewKt$QuickPay$1$1$1$4$1(createRef, 5);
                                    gapComposer4.updateRememberedValue(rememberedValue12);
                                }
                                Modifier overlay2 = UtilKt.overlay(ConstraintLayoutScope.constrainAs(companion2, createRef2, (Function1) rememberedValue12), personalizedPaymentsReactionsState.isReactionBarVisible());
                                loaded2 = loaded3;
                                String str = loaded2.amount;
                                com.squareup.protos.cash.ui.Color color2 = (background2 == null || (textFormat4 = background2.defaultTextFormat) == null) ? null : textFormat4.text_color;
                                if (color2 == null) {
                                    gapComposer4.startReplaceGroup(1955617247);
                                    gapComposer4.end(false);
                                    m5 = null;
                                } else {
                                    m5 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer4, -1322388894, color2, gapComposer4, false);
                                }
                                long j2 = m5 != null ? m5.value : Color.White;
                                com.squareup.protos.cash.ui.Color color3 = (background2 == null || (textFormat3 = background2.defaultTextFormat) == null) ? null : textFormat3.text_border_color;
                                if (color3 == null) {
                                    gapComposer4.startReplaceGroup(1955740255);
                                    gapComposer4.end(false);
                                    m6 = null;
                                } else {
                                    m6 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer4, -1322384926, color3, gapComposer4, false);
                                }
                                AlphaKt.m3713ExpressiveAmountVieweaDK9VM(overlay2, str, j2, m6 != null ? m6.value : Color.Transparent, gapComposer4, 0);
                                boolean changed3 = gapComposer4.changed(createRef2);
                                Object rememberedValue13 = gapComposer4.rememberedValue();
                                if (changed3 || rememberedValue13 == obj7) {
                                    rememberedValue13 = new QuickPayViewKt$QuickPay$1$1$1$4$1(createRef2, 6);
                                    gapComposer4.updateRememberedValue(rememberedValue13);
                                }
                                AlphaKt.ExpressiveDetailsRow(loaded2.detailsModel, UtilKt.overlay(ConstraintLayoutScope.constrainAs(companion2, createRef7, (Function1) rememberedValue13), personalizedPaymentsReactionsState.isReactionBarVisible()), gapComposer4, 0);
                                gapComposer4.end(false);
                            } else {
                                loaded2 = loaded3;
                                gapComposer4.startReplaceGroup(1956165018);
                                boolean changed4 = gapComposer4.changed(createRef);
                                Object rememberedValue14 = gapComposer4.rememberedValue();
                                if (changed4 || rememberedValue14 == obj7) {
                                    rememberedValue14 = new QuickPayViewKt$QuickPay$1$1$1$4$1(createRef, 7);
                                    gapComposer4.updateRememberedValue(rememberedValue14);
                                }
                                Modifier overlay3 = UtilKt.overlay(ConstraintLayoutScope.constrainAs(companion2, createRef2, (Function1) rememberedValue14), personalizedPaymentsReactionsState.isReactionBarVisible());
                                String str2 = loaded2.amount;
                                com.squareup.protos.cash.ui.Color color4 = (background2 == null || (textFormat2 = background2.defaultTextFormat) == null) ? null : textFormat2.text_color;
                                if (color4 == null) {
                                    gapComposer4.startReplaceGroup(1956563615);
                                    gapComposer4.end(false);
                                    m3 = null;
                                } else {
                                    m3 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer4, -1322358366, color4, gapComposer4, false);
                                }
                                long j3 = m3 != null ? m3.value : Color.Black;
                                com.squareup.protos.cash.ui.Color color5 = (background2 == null || (textFormat = background2.defaultTextFormat) == null) ? null : textFormat.text_border_color;
                                if (color5 == null) {
                                    gapComposer4.startReplaceGroup(1956686623);
                                    gapComposer4.end(false);
                                    m4 = null;
                                } else {
                                    m4 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer4, -1322354398, color5, gapComposer4, false);
                                }
                                AlphaKt.m3712AmountVieweaDK9VM(overlay3, str2, j3, m4 != null ? m4.value : Color.White, gapComposer4, 0);
                                gapComposer4.end(false);
                            }
                            SelectedTrack selectedTrack = loaded2.selectedTrack;
                            if (selectedTrack == null) {
                                gapComposer4.startReplaceGroup(1956788489);
                                gapComposer4.end(false);
                                constrainedLayoutReference = createRef4;
                            } else {
                                gapComposer4.startReplaceGroup(1956788490);
                                constrainedLayoutReference = createRef4;
                                boolean changedInstance3 = gapComposer4.changedInstance(loaded2) | gapComposer4.changed(constrainedLayoutReference);
                                Object rememberedValue15 = gapComposer4.rememberedValue();
                                if (changedInstance3 || rememberedValue15 == obj7) {
                                    rememberedValue15 = new VerifyCheckDepositPresenter$models$3$2(29, loaded2, constrainedLayoutReference);
                                    gapComposer4.updateRememberedValue(rememberedValue15);
                                }
                                QuickPayViewKt.SelectedTrackCard(selectedTrack, UtilKt.overlay(SpacerKt.m298padding3ABfNKs(ConstraintLayoutScope.constrainAs(companion2, createRef8, (Function1) rememberedValue15), 24.0f), personalizedPaymentsReactionsState.isReactionBarVisible()), gapComposer4, 0);
                                gapComposer4.end(false);
                            }
                            if (loaded2.isCurrentCustomerSender) {
                                constrainedLayoutReference2 = constrainedLayoutReference;
                                function12 = function13;
                                gapComposer4.startReplaceGroup(1958860778);
                                gapComposer4.end(false);
                            } else {
                                gapComposer4.startReplaceGroup(1957612439);
                                Object rememberedValue16 = gapComposer4.rememberedValue();
                                if (rememberedValue16 == obj7) {
                                    rememberedValue16 = PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1.INSTANCE$4;
                                    gapComposer4.updateRememberedValue(rememberedValue16);
                                }
                                Modifier overlay4 = UtilKt.overlay(SpacerKt.navigationBarsPadding(ConstraintLayoutScope.constrainAs(companion2, constrainedLayoutReference, (Function1) rememberedValue16)), personalizedPaymentsReactionsState.isReactionBarVisible());
                                Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1852892251, new PersonalizePaymentRecipientViewKt$PersonalizePaymentRecipient$1$1$1$10(loaded2, function13), gapComposer4);
                                constrainedLayoutReference2 = constrainedLayoutReference;
                                function12 = function13;
                                coil3.size.SizeKt.AdaptiveStack(overlay4, null, null, arrangement$SpacedAligned, null, null, rememberComposableLambda, gapComposer4, 1575936, 54);
                                gapComposer4 = gapComposer4;
                                gapComposer4.end(false);
                            }
                            Modifier zIndex2 = ZIndexModifierKt.zIndex(companion2, Float.MAX_VALUE);
                            boolean changed5 = gapComposer4.changed(constrainedLayoutReference2);
                            Object rememberedValue17 = gapComposer4.rememberedValue();
                            if (changed5 || rememberedValue17 == obj7) {
                                rememberedValue17 = new QuickPayViewKt$QuickPay$1$1$1$4$1(constrainedLayoutReference2, 4);
                                gapComposer4.updateRememberedValue(rememberedValue17);
                            }
                            AnimatedContentKt.AnimatedVisibility(personalizedPaymentsReactionsState.isReactionBarVisible(), ConstraintLayoutScope.constrainAs(zIndex2, createRef5, (Function1) rememberedValue17), EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(644053863, new PersonalizePaymentRecipientViewKt$PersonalizePaymentRecipient$1$1$1$10(function12, loaded2), gapComposer4), (Composer) gapComposer4, 200064, 16);
                            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(companion2);
                            Object rememberedValue18 = gapComposer4.rememberedValue();
                            if (rememberedValue18 == obj7) {
                                rememberedValue18 = PersonalizePaymentViewKt$PersonalizePayment$1$2$2$1$1.INSTANCE$2;
                                gapComposer4.updateRememberedValue(rememberedValue18);
                            }
                            Modifier constrainAs2 = ConstraintLayoutScope.constrainAs(navigationBarsPadding, createRef3, (Function1) rememberedValue18);
                            boolean changed6 = gapComposer4.changed(function12);
                            Object rememberedValue19 = gapComposer4.rememberedValue();
                            if (changed6 || rememberedValue19 == obj7) {
                                rememberedValue19 = new BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3(12, function12);
                                gapComposer4.updateRememberedValue(rememberedValue19);
                            }
                            AlphaKt.ViewOnlyPersonalization(0, gapComposer4, UtilKt.positioned(constrainAs2, (Function1) rememberedValue19), loaded2.elements, function12);
                            gapComposer4.end(false);
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), measurePolicy, gapComposer, 48);
                    gapComposer.end(false);
                    gapComposer.end(true);
                    List extendedReactionsList = loaded.reactionsState.getExtendedReactionsList();
                    List list2 = extendedReactionsList;
                    if (list2 == null || list2.isEmpty()) {
                        obj3 = obj4;
                        gapComposer.startReplaceGroup(1074635975);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1074303283);
                        boolean changed = gapComposer.changed(function1);
                        Object rememberedValue9 = gapComposer.rememberedValue();
                        if (changed || rememberedValue9 == obj4) {
                            rememberedValue9 = new ActionMenuKt$$ExternalSyntheticLambda0(24, function1);
                            gapComposer.updateRememberedValue(rememberedValue9);
                        }
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1610106219, new InfoSectionKt$$ExternalSyntheticLambda0(i, function1, extendedReactionsList), gapComposer);
                        obj3 = obj4;
                        ComposeBottomSheetKt.BottomSheet(null, extendedReactionsList, (Function0) rememberedValue9, true, false, 1200, null, null, rememberComposableLambda, gapComposer, 100862976, EnumC0170g.SDK_ASSET_ICON_INCOMPLETE_VALUE);
                        gapComposer = gapComposer;
                        gapComposer.end(false);
                    }
                    DialogViewModel dialogViewModel = loaded.dialogModel;
                    if (dialogViewModel == null) {
                        gapComposer.startReplaceGroup(1074676832);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1074676833);
                        String title = dialogViewModel.getTitle();
                        String message = dialogViewModel.getMessage();
                        String positiveButtonText = dialogViewModel.getPositiveButtonText();
                        String negativeButtonText = dialogViewModel.getNegativeButtonText();
                        boolean changed2 = gapComposer.changed(function1);
                        Object rememberedValue10 = gapComposer.rememberedValue();
                        if (changed2 || rememberedValue10 == obj3) {
                            rememberedValue10 = new ProfileKt$$ExternalSyntheticLambda3(5, function1);
                            gapComposer.updateRememberedValue(rememberedValue10);
                        }
                        Function1 function12 = (Function1) rememberedValue10;
                        boolean changed3 = gapComposer.changed(function1);
                        Object rememberedValue11 = gapComposer.rememberedValue();
                        if (changed3 || rememberedValue11 == obj3) {
                            rememberedValue11 = new ActionMenuKt$$ExternalSyntheticLambda0(19, function1);
                            gapComposer.updateRememberedValue(rememberedValue11);
                        }
                        Function0 function02 = (Function0) rememberedValue11;
                        boolean changed4 = gapComposer.changed(function1);
                        Object rememberedValue12 = gapComposer.rememberedValue();
                        if (changed4 || rememberedValue12 == obj3) {
                            rememberedValue12 = new ActionMenuKt$$ExternalSyntheticLambda0(20, function1);
                            gapComposer.updateRememberedValue(rememberedValue12);
                        }
                        ArcadeModal2Kt.AlertDialog(title, message, positiveButtonText, negativeButtonText, function12, function02, (Function0) rememberedValue12, gapComposer, 0);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                AlphaKt.PersonalizePaymentRecipient(this.f$0, this.f$1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ PersonalizePaymentRecipientViewKt$$ExternalSyntheticLambda5(PersonalizePaymentRecipientViewModel.Loaded loaded, Function1 function1, int i) {
        this.f$0 = loaded;
        this.f$1 = function1;
    }
}
