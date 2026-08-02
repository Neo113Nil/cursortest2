package com.squareup.cash.formview.components;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.EquatableBitmap;
import com.squareup.cash.card.onboarding.RealStyledCardPresenter$Factory$Impl;
import com.squareup.cash.card.onboarding.StyledCardViewModel;
import com.squareup.cash.card.onboarding.core.CardSceneEffectKt;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda5;
import com.squareup.cash.data.blockers.RealBlockersHelper$skipBlocker$1;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda3;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda5;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda10;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.WorkViewFactory$$ExternalSyntheticLambda12;
import com.squareup.protos.franklin.api.CardPresentationStyle;
import com.squareup.protos.franklin.cards.CardCustomizationData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class FormCustomizedCardView extends AbstractComposeView {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final /* synthetic */ int $r8$classId = 1;
    public final Object data;
    public final Object presenterFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormCustomizedCardView(CardCustomizationData cardCustomizationData, RealStyledCardPresenter$Factory$Impl realStyledCardPresenter$Factory$Impl, Context context) {
        super(context, null, 6, 0);
        cardCustomizationData.getClass();
        context.getClass();
        this.data = cardCustomizationData;
        this.presenterFactory = realStyledCardPresenter$Factory$Impl;
    }

    public static Modifier fillMaxWidth$default(FormCustomizedCardView formCustomizedCardView, int i) {
        return ValueInsets.layout(Modifier.Companion.$$INSTANCE, new ArcadeModal$$ExternalSyntheticLambda3(Alignment.Companion.CenterHorizontally, 29));
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        FormCustomizedCardView formCustomizedCardView;
        int i2;
        MutableState mutableState;
        Object realBlockersHelper$skipBlocker$1;
        NeverEqualPolicy neverEqualPolicy;
        MutableState mutableState2;
        MutableState mutableState3;
        boolean z;
        boolean z2;
        int i3;
        switch (this.$r8$classId) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startRestartGroup(-1022184396);
                Applier applier = gapComposer.applier;
                int i4 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
                if (gapComposer.shouldExecute(i4 & 1, (i4 & 3) != 2)) {
                    Object rememberedValue = gapComposer.rememberedValue();
                    Continuation continuation = null;
                    NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy2) {
                        rememberedValue = Updater.mutableStateOf$default(null);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    MutableState mutableState4 = (MutableState) rememberedValue;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy2) {
                        rememberedValue2 = Updater.mutableStateOf$default(null);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    MutableState mutableState5 = (MutableState) rememberedValue2;
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy2) {
                        rememberedValue3 = Updater.mutableStateOf$default(CardPresentationStyle.PSEUDO_3D);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    MutableState mutableState6 = (MutableState) rememberedValue3;
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy2) {
                        rememberedValue4 = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer.updateRememberedValue(rememberedValue4);
                    }
                    MutableState mutableState7 = (MutableState) rememberedValue4;
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy2) {
                        rememberedValue5 = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer.updateRememberedValue(rememberedValue5);
                    }
                    MutableState mutableState8 = (MutableState) rememberedValue5;
                    Object rememberedValue6 = gapComposer.rememberedValue();
                    if (rememberedValue6 == neverEqualPolicy2) {
                        rememberedValue6 = Updater.mutableStateOf$default(null);
                        gapComposer.updateRememberedValue(rememberedValue6);
                    }
                    MutableState mutableState9 = (MutableState) rememberedValue6;
                    Unit unit = Unit.INSTANCE;
                    boolean changedInstance = gapComposer.changedInstance(this);
                    Object rememberedValue7 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue7 == neverEqualPolicy2) {
                        mutableState = mutableState5;
                        neverEqualPolicy = neverEqualPolicy2;
                        mutableState2 = mutableState8;
                        mutableState3 = mutableState9;
                        realBlockersHelper$skipBlocker$1 = new RealBlockersHelper$skipBlocker$1(this, mutableState, mutableState6, mutableState7, mutableState4, null, 29);
                        gapComposer.updateRememberedValue(realBlockersHelper$skipBlocker$1);
                    } else {
                        neverEqualPolicy = neverEqualPolicy2;
                        mutableState3 = mutableState9;
                        mutableState = mutableState5;
                        realBlockersHelper$skipBlocker$1 = rememberedValue7;
                        mutableState2 = mutableState8;
                    }
                    Updater.LaunchedEffect(gapComposer, unit, (Function2) realBlockersHelper$skipBlocker$1);
                    StyledCardViewModel styledCardViewModel = (StyledCardViewModel) mutableState.getValue();
                    byte[] bArr = styledCardViewModel != null ? styledCardViewModel.customizationOverrideBytes : null;
                    boolean changedInstance2 = gapComposer.changedInstance(bArr);
                    Object rememberedValue8 = gapComposer.rememberedValue();
                    if (changedInstance2 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new AnimationsKt$takeUntil$1$1.AnonymousClass1(bArr, mutableState3, continuation, 12);
                        gapComposer.updateRememberedValue(rememberedValue8);
                    }
                    Updater.LaunchedEffect(gapComposer, bArr, (Function2) rememberedValue8);
                    Modifier fillMaxWidth$default = fillMaxWidth$default(this, 3);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    MutableState mutableState10 = mutableState;
                    Modifier aspectRatio = OffsetKt.aspectRatio(1.5857725f, SizeKt.m292widthInVpY3zN4$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 500.0f, 1), false);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, aspectRatio);
                    gapComposer.startReusableNode();
                    MutableState mutableState11 = mutableState3;
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    CardModelView.ViewModel viewModel = (CardModelView.ViewModel) mutableState4.getValue();
                    StyledCardViewModel styledCardViewModel2 = (StyledCardViewModel) mutableState10.getValue();
                    if (viewModel == null || ((Boolean) mutableState2.getValue()).booleanValue()) {
                        i2 = 16;
                        z = true;
                        formCustomizedCardView = this;
                        if (styledCardViewModel2 != null) {
                            gapComposer.startReplaceGroup(-1562119878);
                            Modifier fillMaxWidth$default2 = fillMaxWidth$default(formCustomizedCardView, 3);
                            Object rememberedValue9 = gapComposer.rememberedValue();
                            if (rememberedValue9 == neverEqualPolicy) {
                                rememberedValue9 = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(17, mutableState6);
                                gapComposer.updateRememberedValue(rememberedValue9);
                            }
                            Function1 function1 = (Function1) rememberedValue9;
                            boolean changedInstance3 = gapComposer.changedInstance(styledCardViewModel2);
                            Object rememberedValue10 = gapComposer.rememberedValue();
                            if (changedInstance3 || rememberedValue10 == neverEqualPolicy) {
                                rememberedValue10 = new GpsConfigQueries$$ExternalSyntheticLambda2(styledCardViewModel2, 2);
                                gapComposer.updateRememberedValue(rememberedValue10);
                            }
                            AndroidView_androidKt.AndroidView(function1, fillMaxWidth$default2, (Function1) rememberedValue10, gapComposer, 6, 0);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(-1561763998);
                            gapComposer.end(false);
                        }
                    } else {
                        gapComposer.startReplaceGroup(-1563233770);
                        if (((Boolean) mutableState7.getValue()).booleanValue()) {
                            gapComposer.startReplaceGroup(-1563204630);
                            formCustomizedCardView = this;
                            Modifier aspectRatio2 = OffsetKt.aspectRatio(1.0f, fillMaxWidth$default(formCustomizedCardView, 1), false);
                            MutableState rememberUpdatedState = Updater.rememberUpdatedState(viewModel, gapComposer);
                            MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(Float.valueOf(8.75f), gapComposer);
                            MutableState rememberUpdatedState3 = Updater.rememberUpdatedState(Float.valueOf(25.0f), gapComposer);
                            MutableState rememberUpdatedState4 = Updater.rememberUpdatedState((EquatableBitmap) mutableState11.getValue(), gapComposer);
                            Object rememberedValue11 = gapComposer.rememberedValue();
                            if (rememberedValue11 == neverEqualPolicy) {
                                i3 = 16;
                                rememberedValue11 = new CaptureCheckFaceKt$$ExternalSyntheticLambda5(16, mutableState2);
                                gapComposer.updateRememberedValue(rememberedValue11);
                            } else {
                                i3 = 16;
                            }
                            z = true;
                            i2 = i3;
                            CardSceneEffectKt.CardSceneEffect(aspectRatio2, rememberUpdatedState, null, null, null, false, rememberUpdatedState3, rememberUpdatedState2, null, rememberUpdatedState4, null, null, (Function1) rememberedValue11, null, gapComposer, 0, 23164);
                            gapComposer = gapComposer;
                            z2 = false;
                            gapComposer.end(false);
                        } else {
                            i2 = 16;
                            z = true;
                            formCustomizedCardView = this;
                            gapComposer.startReplaceGroup(-1562656519);
                            EquatableBitmap equatableBitmap = (EquatableBitmap) mutableState11.getValue();
                            Bitmap bitmap = equatableBitmap != null ? equatableBitmap.bitmap : null;
                            Modifier aspectRatio3 = OffsetKt.aspectRatio(1.0f, fillMaxWidth$default(formCustomizedCardView, 1), false);
                            Object rememberedValue12 = gapComposer.rememberedValue();
                            int i5 = 8;
                            if (rememberedValue12 == neverEqualPolicy) {
                                rememberedValue12 = new GpsConfigQueries$$ExternalSyntheticLambda1(i5);
                                gapComposer.updateRememberedValue(rememberedValue12);
                            }
                            Function1 function12 = (Function1) rememberedValue12;
                            boolean changedInstance4 = gapComposer.changedInstance(viewModel) | gapComposer.changedInstance(bitmap);
                            Object rememberedValue13 = gapComposer.rememberedValue();
                            if (changedInstance4 || rememberedValue13 == neverEqualPolicy) {
                                rememberedValue13 = new GLSceneScope$$ExternalSyntheticLambda10(i5, viewModel, bitmap);
                                gapComposer.updateRememberedValue(rememberedValue13);
                            }
                            AndroidView_androidKt.AndroidView(function12, aspectRatio3, (Function1) rememberedValue13, gapComposer, 6, 0);
                            z2 = false;
                            gapComposer.end(false);
                        }
                        gapComposer.end(z2);
                    }
                    gapComposer.end(z);
                    gapComposer.end(z);
                } else {
                    formCustomizedCardView = this;
                    i2 = 16;
                    gapComposer.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new ArcadeModal$$ExternalSyntheticLambda5(formCustomizedCardView, i, i2);
                    return;
                }
                return;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(2120975636);
                ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(853020969, new WorkViewFactory$$ExternalSyntheticLambda12(11, (PageTagSlotKt$$ExternalSyntheticLambda0) this.presenterFactory, (Context) this.data), gapComposer2), gapComposer2, 3072, 7);
                gapComposer2.end(false);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormCustomizedCardView(Context context, PageTagSlotKt$$ExternalSyntheticLambda0 pageTagSlotKt$$ExternalSyntheticLambda0) {
        super(context, null, 6, 0);
        this.data = context;
        this.presenterFactory = pageTagSlotKt$$ExternalSyntheticLambda0;
    }
}
