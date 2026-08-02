package com.squareup.cash.money.views;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda5;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.PausedCompositionImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import app.cash.local.viewmodels.LocalBrandLocationCheckoutViewModel;
import app.cash.local.viewmodels.LocalCartSummaryLineViewModel;
import app.cash.local.viewmodels.LocalCheckoutOrderSummaryViewModel;
import app.cash.local.views.brand.checkout.CheckoutExpandableReviewRowKt;
import app.cash.local.views.brand.checkout.LocalBrandLocationCheckoutViewKt;
import app.cash.molecule.PlatformKt;
import bo.app.b$$ExternalSyntheticLambda0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.mooncake.components.LoadingHelper$InDirection;
import com.squareup.cash.mooncake.components.LoadingHelper$afterMinimumTime$$inlined$doOnEnd$1;
import com.squareup.cash.support.chat.viewmodels.ChatContentViewModel;
import com.squareup.cash.support.chat.viewmodels.ChatRowViewModel;
import com.squareup.cash.support.chat.views.transcript.message.ActionBodyViewKt;
import com.squareup.cash.support.chat.views.transcript.message.SuggestedRepliesViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.views.shift.ShiftListViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.work.webview.views.WorkWebViewKt;
import com.squareup.util.Strings;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabUIKt$$ExternalSyntheticLambda16 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda16(Object obj, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LoadingHelper$InDirection loadingHelper$InDirection;
        int i = this.$r8$classId;
        int i2 = 14;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        boolean z = this.f$1;
        Object obj4 = this.f$0;
        final int i3 = 0;
        switch (i) {
            case 0:
                LazyListState lazyListState = (LazyListState) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Modifier testTag = TestTagKt.testTag(SizeKt.fillMaxSize(companion, 1.0f), "applet_grid");
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda13(i2);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(testTag, (Function1) rememberedValue);
                    boolean changed = gapComposer.changed(z);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new MoneyTabUIKt$$ExternalSyntheticLambda24(z, i3);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    LazyDslKt.LazyColumn(clearAndSetSemantics, lazyListState, null, null, null, null, false, null, (Function1) rememberedValue2, gapComposer, 0, 508);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                LocalBrandLocationCheckoutViewModel localBrandLocationCheckoutViewModel = (LocalBrandLocationCheckoutViewModel) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    LocalCheckoutOrderSummaryViewModel localCheckoutOrderSummaryViewModel = localBrandLocationCheckoutViewModel.orderSummary;
                    if (localCheckoutOrderSummaryViewModel == null) {
                        Iterator it = localBrandLocationCheckoutViewModel.selections.iterator();
                        int i4 = 0;
                        while (it.hasNext()) {
                            i4 += ((LocalCartSummaryLineViewModel) it.next()).quantity;
                        }
                        localCheckoutOrderSummaryViewModel = new LocalCheckoutOrderSummaryViewModel(i4, localBrandLocationCheckoutViewModel.selections, localBrandLocationCheckoutViewModel.extraLines, this.f$1, 24);
                    }
                    Object[] objArr = new Object[0];
                    boolean changedInstance = gapComposer2.changedInstance(localCheckoutOrderSummaryViewModel);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    Object obj5 = rememberedValue3;
                    if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                        Worker$$ExternalSyntheticLambda0 worker$$ExternalSyntheticLambda0 = new Worker$$ExternalSyntheticLambda0(localCheckoutOrderSummaryViewModel, 23);
                        gapComposer2.updateRememberedValue(worker$$ExternalSyntheticLambda0);
                        obj5 = worker$$ExternalSyntheticLambda0;
                    }
                    MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) obj5, gapComposer2, 0);
                    Modifier modifier = LocalBrandLocationCheckoutViewKt.SectionItemModifier;
                    String stringResource = Room.stringResource(gapComposer2, R.string.local_views_order_summary);
                    String str = localBrandLocationCheckoutViewModel.summaryItemCount;
                    boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                    boolean changed2 = gapComposer2.changed(mutableState);
                    Object rememberedValue4 = gapComposer2.rememberedValue();
                    Object obj6 = rememberedValue4;
                    if (changed2 || rememberedValue4 == neverEqualPolicy) {
                        DateInputKt$$ExternalSyntheticLambda5 dateInputKt$$ExternalSyntheticLambda5 = new DateInputKt$$ExternalSyntheticLambda5(i2, mutableState);
                        gapComposer2.updateRememberedValue(dateInputKt$$ExternalSyntheticLambda5);
                        obj6 = dateInputKt$$ExternalSyntheticLambda5;
                    }
                    CheckoutExpandableReviewRowKt.m1298CheckoutExpandableReviewRowIBGS8fI(modifier, stringResource, str, null, booleanValue, (Function1) obj6, false, false, false, null, SpacerKt.m297PaddingValuesa9UjIt4$default(RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, 16.0f, 5), Expect_jvmKt.rememberComposableLambda(1871007311, new SliderDefaults$$ExternalSyntheticLambda3(localCheckoutOrderSummaryViewModel, 5), gapComposer2), gapComposer2, 6, 54, 968);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Density density = (Density) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                    Modifier fillMaxSize = SizeKt.fillMaxSize(SpacerKt.navigationBarsPadding(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SpacerKt.statusBarsPadding(!z ? ImageKt.m177backgroundbw27NRU(companion, ColorsDarkKt.colorsDark.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1) : companion), RoundedCornerShapeKt.m342RoundedCornerShapea9UjIt4$default(32.0f, 32.0f, 12)), Strings.getColors(gapComposer3).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1)), 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                    int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxSize);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer3.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    BoxKt.Box(SpacerKt.m300paddingVpY3zN4$default(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SpacerKt.m301paddingqDBjuR0(OffsetKt.aspectRatio(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), false), 2.0f, 2.0f, 2.0f, 2.0f), RoundedCornerShapeKt.m341RoundedCornerShapea9UjIt4(32.0f, 32.0f, 28.0f, 28.0f)), Strings.getColors(gapComposer3).semantic.background.subtle, rectangleShapeKt$RectangleShape$1), 68.0f, RecyclerView.DECELERATION_RATE, 2), gapComposer3, 0);
                    Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(companion, 24.0f, gapComposer3, companion, 0.5f);
                    gapComposer3.startReplaceGroup(1692444033);
                    float mo231toDpGaN1DYA = density.mo231toDpGaN1DYA(Strings.getTypography(gapComposer3).labelMedium.paragraphStyle.lineHeight);
                    gapComposer3.end(false);
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(SpacerKt.m302paddingqDBjuR0$default(SizeKt.m277height3ABfNKs(m, mo231toDpGaN1DYA), 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 10), Strings.getColors(gapComposer3).semantic.background.subtle, rectangleShapeKt$RectangleShape$1), gapComposer3, 0);
                    Modifier m2 = Request$Priority$EnumUnboxingLocalUtility.m(companion, 8.0f, gapComposer3, companion, 1.0f);
                    gapComposer3.startReplaceGroup(1692455202);
                    float mo231toDpGaN1DYA2 = density.mo231toDpGaN1DYA(Strings.getTypography(gapComposer3).numeralSmall.paragraphStyle.lineHeight);
                    gapComposer3.end(false);
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(SpacerKt.m302paddingqDBjuR0$default(SizeKt.m277height3ABfNKs(m2, mo231toDpGaN1DYA2), 24.0f, RecyclerView.DECELERATION_RATE, 40.0f, RecyclerView.DECELERATION_RATE, 10), Strings.getColors(gapComposer3).semantic.background.subtle, rectangleShapeKt$RectangleShape$1), gapComposer3, 0);
                    Modifier m3 = Request$Priority$EnumUnboxingLocalUtility.m(companion, 8.0f, gapComposer3, companion, 0.5f);
                    gapComposer3.startReplaceGroup(1692466528);
                    float mo231toDpGaN1DYA3 = density.mo231toDpGaN1DYA(Strings.getTypography(gapComposer3).bodyMedium.paragraphStyle.lineHeight);
                    gapComposer3.end(false);
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(SpacerKt.m302paddingqDBjuR0$default(SizeKt.m277height3ABfNKs(m3, mo231toDpGaN1DYA3), 24.0f, RecyclerView.DECELERATION_RATE, 48.0f, RecyclerView.DECELERATION_RATE, 10), Strings.getColors(gapComposer3).semantic.background.subtle, rectangleShapeKt$RectangleShape$1), gapComposer3, 0);
                    Modifier m4 = Request$Priority$EnumUnboxingLocalUtility.m(companion, 16.0f, gapComposer3, companion, 1.0f);
                    gapComposer3.startReplaceGroup(1692477796);
                    float mo231toDpGaN1DYA4 = density.mo231toDpGaN1DYA(Strings.getTypography(gapComposer3).bodyMedium.paragraphStyle.lineHeight) * 2.0f;
                    gapComposer3.end(false);
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(SpacerKt.m302paddingqDBjuR0$default(SizeKt.m277height3ABfNKs(m4, mo231toDpGaN1DYA4), 24.0f, RecyclerView.DECELERATION_RATE, 48.0f, RecyclerView.DECELERATION_RATE, 10), Strings.getColors(gapComposer3).semantic.background.subtle, rectangleShapeKt$RectangleShape$1), gapComposer3, 0);
                    gapComposer3.end(true);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj4;
                Composer composer4 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, composer4, 0);
                GapComposer gapComposer4 = (GapComposer) composer4;
                int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(composer4, companion);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (gapComposer5.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer5.startReusableNode();
                if (gapComposer5.inserting) {
                    gapComposer5.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer5.useNode();
                }
                Updater.m576setimpl(composer4, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer4, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer4, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer4, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                if (z) {
                    gapComposer5.startReplaceGroup(1541406614);
                    SpacerKt.Spacer(composer4, SizeKt.m290width3ABfNKs(companion, 8.0f));
                    gapComposer5.end(false);
                } else {
                    gapComposer5.startReplaceGroup(1541468118);
                    gapComposer5.end(false);
                }
                composableLambdaImpl.invoke((Object) composer4, (Object) 0);
                gapComposer5.end(true);
                return Unit.INSTANCE;
            case 4:
                PausedCompositionImpl pausedCompositionImpl = (PausedCompositionImpl) obj4;
                ((Integer) obj2).getClass();
                ((Integer) obj3).getClass();
                ((View) obj).getClass();
                if (z || !((loadingHelper$InDirection = (LoadingHelper$InDirection) pausedCompositionImpl.composer) == LoadingHelper$InDirection.FORWARD || loadingHelper$InDirection == LoadingHelper$InDirection.BACKWARD)) {
                    pausedCompositionImpl.animate(z);
                } else {
                    b$$ExternalSyntheticLambda0 b__externalsyntheticlambda0 = new b$$ExternalSyntheticLambda0(pausedCompositionImpl, z, 7);
                    ValueAnimator valueAnimator = (ValueAnimator) pausedCompositionImpl.pausableApplier;
                    if (valueAnimator == null || !valueAnimator.isRunning()) {
                        b__externalsyntheticlambda0.invoke();
                    } else {
                        valueAnimator.addListener(new LoadingHelper$afterMinimumTime$$inlined$doOnEnd$1(0, b__externalsyntheticlambda0));
                    }
                }
                return Unit.INSTANCE;
            case 5:
                final ChatRowViewModel.SuggestedRepliesRowViewModel suggestedRepliesRowViewModel = (ChatRowViewModel.SuggestedRepliesRowViewModel) obj4;
                Composer composer5 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((FlowRowScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (gapComposer6.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    for (final ChatContentViewModel.SuggestedRepliesViewModel.SuggestedReplyViewModel suggestedReplyViewModel : suggestedRepliesRowViewModel.model.replies) {
                        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                        if (z) {
                            gapComposer6.startReplaceGroup(1186047212);
                            String str2 = suggestedReplyViewModel.text;
                            boolean changedInstance2 = gapComposer6.changedInstance(suggestedRepliesRowViewModel) | gapComposer6.changedInstance(suggestedReplyViewModel);
                            Object rememberedValue5 = gapComposer6.rememberedValue();
                            Object obj7 = rememberedValue5;
                            if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
                                Function0 function0 = new Function0() { // from class: com.squareup.cash.support.chat.views.transcript.message.SuggestedRepliesViewKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i5 = i3;
                                        ChatContentViewModel.SuggestedRepliesViewModel.SuggestedReplyViewModel suggestedReplyViewModel2 = suggestedReplyViewModel;
                                        ChatRowViewModel.SuggestedRepliesRowViewModel suggestedRepliesRowViewModel2 = suggestedRepliesRowViewModel;
                                        switch (i5) {
                                            case 0:
                                                suggestedRepliesRowViewModel2.onReplySelected.invoke(suggestedReplyViewModel2.token);
                                                break;
                                            default:
                                                suggestedRepliesRowViewModel2.onReplySelected.invoke(suggestedReplyViewModel2.token);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                gapComposer6.updateRememberedValue(function0);
                                obj7 = function0;
                            }
                            ActionBodyViewKt.SuggestedReplyButton(MLKEMEngine.KyberPolyBytes, gapComposer6, SpacerKt.m302paddingqDBjuR0$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), str2, (Function0) obj7);
                            gapComposer6.end(false);
                        } else {
                            gapComposer6.startReplaceGroup(1186241954);
                            boolean changedInstance3 = gapComposer6.changedInstance(suggestedRepliesRowViewModel) | gapComposer6.changedInstance(suggestedReplyViewModel);
                            Object rememberedValue6 = gapComposer6.rememberedValue();
                            Object obj8 = rememberedValue6;
                            if (changedInstance3 || rememberedValue6 == neverEqualPolicy) {
                                final boolean z2 = true ? 1 : 0;
                                Function0 function02 = new Function0() { // from class: com.squareup.cash.support.chat.views.transcript.message.SuggestedRepliesViewKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i5 = z2;
                                        ChatContentViewModel.SuggestedRepliesViewModel.SuggestedReplyViewModel suggestedReplyViewModel2 = suggestedReplyViewModel;
                                        ChatRowViewModel.SuggestedRepliesRowViewModel suggestedRepliesRowViewModel2 = suggestedRepliesRowViewModel;
                                        switch (i5) {
                                            case 0:
                                                suggestedRepliesRowViewModel2.onReplySelected.invoke(suggestedReplyViewModel2.token);
                                                break;
                                            default:
                                                suggestedRepliesRowViewModel2.onReplySelected.invoke(suggestedReplyViewModel2.token);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                gapComposer6.updateRememberedValue(function02);
                                obj8 = function02;
                            }
                            coil3.size.SizeKt.ButtonCompact((Function0) obj8, SpacerKt.m302paddingqDBjuR0$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), null, false, false, null, Expect_jvmKt.rememberComposableLambda(-1650023844, new SuggestedRepliesViewKt$$ExternalSyntheticLambda4(suggestedReplyViewModel, i3), gapComposer6), gapComposer6, 1572912, 60);
                            gapComposer6.end(false);
                        }
                    }
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Function1 function1 = (Function1) obj4;
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer6 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer6).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer6;
                if (!gapComposer7.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    gapComposer7.skipToGroupEnd();
                } else if (z) {
                    gapComposer7.startReplaceGroup(1990332573);
                    boolean changed3 = gapComposer7.changed(function1);
                    Object rememberedValue7 = gapComposer7.rememberedValue();
                    if (changed3 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new ShiftListViewKt$$ExternalSyntheticLambda4(9, function1);
                        gapComposer7.updateRememberedValue(rememberedValue7);
                    }
                    modalButtonScope.PrimaryModalButton((Function0) rememberedValue7, null, false, WorkWebViewKt.f794lambda$896487773, gapComposer7, ((intValue5 << 12) & 57344) | 3072, 6);
                    gapComposer7.end(false);
                } else {
                    gapComposer7.startReplaceGroup(1990515256);
                    boolean changed4 = gapComposer7.changed(function1);
                    Object rememberedValue8 = gapComposer7.rememberedValue();
                    if (changed4 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new ShiftListViewKt$$ExternalSyntheticLambda4(10, function1);
                        gapComposer7.updateRememberedValue(rememberedValue8);
                    }
                    modalButtonScope.PrimaryModalButton((Function0) rememberedValue8, null, false, WorkWebViewKt.f795lambda$998691718, gapComposer7, ((intValue5 << 12) & 57344) | 3072, 6);
                    gapComposer7.end(false);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda16(boolean z, Object obj, int i) {
        this.$r8$classId = i;
        this.f$1 = z;
        this.f$0 = obj;
    }
}
