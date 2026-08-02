package com.squareup.cash.sheet;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.DpCornerSize;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda2;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import app.cash.trifle.Trifle;
import bo.app.re$$ExternalSyntheticOutline0;
import com.fillr.core.analytics.FillrAnalyticsServiceBuilder;
import com.google.android.gms.common.api.internal.zabr;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.FilterBarChipType;
import com.squareup.cash.arcade.components.FilterBarKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel;
import com.squareup.cash.blockers.views.CalendarDatePickerKt;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda10;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda14;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.support.viewmodels.SupportHomeViewModel;
import com.squareup.cash.support.views.home.SupportHomeViewKt;
import com.squareup.cash.support.views.home.SupportHomeViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda28;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda8;
import com.squareup.cash.work.views.WorkTitleBarViewKt$$ExternalSyntheticLambda4;
import com.squareup.util.Strings;
import com.squareup.util.compose.SquircleShape;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import com.stripe.android.financialconnections.model.Bullet;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.ui.ImageResource$Network;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.sdui.BulletUI;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import java.time.LocalDate;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class SheetKt$$ExternalSyntheticLambda4 implements Function3 {
    public final /* synthetic */ int $r8$classId = 3;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda4(AnimatedContentScopeImpl animatedContentScopeImpl, MutableState mutableState, SetNameViewModel setNameViewModel, TouchRecorder touchRecorder, Function1 function1, boolean z) {
        this.f$1 = setNameViewModel;
        this.f$2 = touchRecorder;
        this.f$3 = function1;
        this.f$4 = animatedContentScopeImpl;
        this.f$0 = z;
        this.f$5 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ComposableLambdaImpl composableLambdaImpl;
        GapComposer gapComposer;
        String str;
        int i = this.$r8$classId;
        boolean z = this.f$0;
        int i2 = 21;
        Object obj4 = this.f$5;
        Object obj5 = this.f$4;
        Object obj6 = this.f$3;
        Object obj7 = this.f$2;
        Object obj8 = this.f$1;
        switch (i) {
            case 0:
                String str2 = (String) obj8;
                SheetTopCornerBehavior sheetTopCornerBehavior = (SheetTopCornerBehavior) obj7;
                ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj6;
                CoroutineScope coroutineScope = (CoroutineScope) obj5;
                RealSheetState realSheetState = (RealSheetState) obj4;
                BasicShieetScope basicShieetScope = (BasicShieetScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                basicShieetScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(basicShieetScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    if (z) {
                        gapComposer2.startReplaceGroup(32736271);
                        Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        basicShieetScope.m3745Dimmer3JVO9M((intValue << 6) & 896, colors.component.ui.dimmer.background, gapComposer2, null);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(32816034);
                        gapComposer2.end(false);
                    }
                    DpCornerSize dpCornerSize = new DpCornerSize(40.0f);
                    Trifle trifle = CornerSizeKt.ZeroCornerSize;
                    SquircleShape squircleShape = new SquircleShape(dpCornerSize, dpCornerSize, trifle, trifle);
                    Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    int i3 = 0;
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    long j = colors2.component.sheet.background;
                    if (str2 == null) {
                        gapComposer2.startReplaceGroup(33581981);
                        gapComposer2.end(false);
                        composableLambdaImpl = null;
                    } else {
                        gapComposer2.startReplaceGroup(33581982);
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1974699229, new SheetKt$$ExternalSyntheticLambda5(i3, coroutineScope, realSheetState, str2), gapComposer2);
                        gapComposer2.end(false);
                        composableLambdaImpl = rememberComposableLambda;
                    }
                    basicShieetScope.m3747SheetContainerPd0RII(j, squircleShape, Expect_jvmKt.rememberComposableLambda(-1031247953, new SheetKt$$ExternalSyntheticLambda6(basicShieetScope, i3), gapComposer2), null, sheetTopCornerBehavior, composableLambdaImpl, composableLambdaImpl2, gapComposer2, ((intValue << 21) & 29360128) | MLKEMEngine.KyberPolyBytes);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Function0 function0 = (Function0) obj8;
                Modifier modifier = (Modifier) obj7;
                FilterBarChipType filterBarChipType = (FilterBarChipType) obj5;
                ComposableLambdaImpl composableLambdaImpl3 = (ComposableLambdaImpl) obj6;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    FilterBarKt.Chip(function0, modifier, true, this.f$0, filterBarChipType, this.f$5, false, composableLambdaImpl3, gapComposer3, 0, 64);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                LocalDate localDate = (LocalDate) obj8;
                LocalDate localDate2 = (LocalDate) obj7;
                LocalDate localDate3 = (LocalDate) obj6;
                LocalDate localDate4 = (LocalDate) obj5;
                Function1 function1 = (Function1) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((LazyGridItemScopeImpl) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    localDate.getClass();
                    CalendarDatePickerKt.CalendarDay(this.f$0, localDate3, localDate4, localDate, function1, Intrinsics.areEqual(localDate2, localDate), gapComposer4, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                SetNameViewModel setNameViewModel = (SetNameViewModel) obj8;
                TouchRecorder touchRecorder = (TouchRecorder) obj7;
                Function1 function12 = (Function1) obj6;
                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj5;
                MutableState mutableState = (MutableState) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    if (setNameViewModel.helpItemsAvailable) {
                        gapComposer5.startReplaceGroup(92895579);
                        Strings.TouchRecordingLayout(touchRecorder, null, Expect_jvmKt.rememberComposableLambda(-2130363637, new SsnViewKt$$ExternalSyntheticLambda12(5, function12), gapComposer5), gapComposer5, 392, 2);
                        gapComposer = gapComposer5;
                        gapComposer.end(false);
                    } else {
                        gapComposer = gapComposer5;
                        gapComposer.startReplaceGroup(93205021);
                        gapComposer.end(false);
                    }
                    Strings.TouchRecordingLayout(touchRecorder, null, Expect_jvmKt.rememberComposableLambda(445761264, new TooltipKt$$ExternalSyntheticLambda2(animatedContentScopeImpl, mutableState, setNameViewModel, touchRecorder, function12, this.f$0), gapComposer), gapComposer, 392, 2);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ScrollState scrollState = (ScrollState) obj8;
                Function1 function13 = (Function1) obj7;
                State state = (State) obj6;
                SupportHomeViewModel supportHomeViewModel = (SupportHomeViewModel) obj5;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj4;
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                boxWithConstraintsScopeImpl.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer5).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer6 = (GapComposer) composer5;
                boolean shouldExecute = gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18);
                Applier applier = gapComposer6.applier;
                if (shouldExecute) {
                    float mo233toDpu2uoSUM = boxWithConstraintsScopeImpl.density.mo233toDpu2uoSUM(Constraints.m1026getMinHeightimpl(boxWithConstraintsScopeImpl.constraints));
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer6, fillMaxSize);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer6.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer6, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer6, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer6, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer6, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(SpacerKt.m302paddingqDBjuR0$default(ImageKt.verticalScroll$default(SizeKt.fillMaxSize(ZIndexModifierKt.zIndex(companion, 1.0f), 1.0f), scrollState, false, 14), RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 5));
                    Object rememberedValue = gapComposer6.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new TabToolbarsKt$$ExternalSyntheticLambda28(16);
                        gapComposer6.updateRememberedValue(rememberedValue);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(navigationBarsPadding, false, (Function1) rememberedValue);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer6, 0);
                    int hashCode2 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer6, semantics);
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer6.useNode();
                    }
                    Updater.m576setimpl(gapComposer6, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer6, composeUiNode$Companion$SetModifier$13, gapComposer6, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer6, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    String stringResource = Room.stringResource(gapComposer6, R.string.support_home_title);
                    TextStyle textStyle = ((Typography) gapComposer6.consume(ArcadeThemeKt.LocalTypography)).header;
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 16.0f, 2);
                    Object rememberedValue2 = gapComposer6.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new TabToolbarsKt$$ExternalSyntheticLambda28(17);
                        gapComposer6.updateRememberedValue(rememberedValue2);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer6, SemanticsModifierKt.semantics(m302paddingqDBjuR0$default, false, (Function1) rememberedValue2), textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                    Boolean bool = (Boolean) state.getValue();
                    bool.booleanValue();
                    boolean changed = gapComposer6.changed(state);
                    Object rememberedValue3 = gapComposer6.rememberedValue();
                    if (changed || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new MoneyTabUIKt$$ExternalSyntheticLambda10(state, 19);
                        gapComposer6.updateRememberedValue(rememberedValue3);
                    }
                    AnimatedContentKt.AnimatedContent(bool, null, (Function1) rememberedValue3, null, "loading transition", null, Expect_jvmKt.rememberComposableLambda(622119766, new SupportHomeViewKt$$ExternalSyntheticLambda10(mo233toDpu2uoSUM, supportHomeViewModel, function13, 0), gapComposer6), gapComposer6, 1597440, 42);
                    if (z) {
                        gapComposer6.startReplaceGroup(345549316);
                        SpacerKt.Spacer(gapComposer6, SizeKt.m277height3ABfNKs(companion, ((Density) gapComposer6.consume(CompositionLocalsKt.LocalDensity)).mo233toDpu2uoSUM(parcelableSnapshotMutableIntState.getIntValue()) + 32.0f));
                        gapComposer6.end(false);
                    } else {
                        gapComposer6.startReplaceGroup(345805903);
                        gapComposer6.end(false);
                    }
                    gapComposer6.end(true);
                    if (z) {
                        gapComposer6.startReplaceGroup(1812196124);
                        boolean changed2 = gapComposer6.changed(function13);
                        Object rememberedValue4 = gapComposer6.rememberedValue();
                        if (changed2 || rememberedValue4 == neverEqualPolicy) {
                            rememberedValue4 = new TabToolbarsKt$$ExternalSyntheticLambda8(10, function13);
                            gapComposer6.updateRememberedValue(rememberedValue4);
                        }
                        Function0 function02 = (Function0) rememberedValue4;
                        Modifier navigationBarsPadding2 = SpacerKt.navigationBarsPadding(SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomCenter), 1.0f), 16.0f));
                        Object rememberedValue5 = gapComposer6.rememberedValue();
                        if (rememberedValue5 == neverEqualPolicy) {
                            rememberedValue5 = new MoneyTabUIKt$$ExternalSyntheticLambda14(27, parcelableSnapshotMutableIntState);
                            gapComposer6.updateRememberedValue(rememberedValue5);
                        }
                        coil3.size.SizeKt.ButtonCta(function02, ZIndexModifierKt.zIndex(RulerKt.onSizeChanged(navigationBarsPadding2, (Function1) rememberedValue5), 2.0f), ButtonProminence.PROMINENT, false, false, null, SupportHomeViewKt.lambda$1171997853, gapComposer6, 1573248, 56);
                        gapComposer6.end(false);
                    } else {
                        gapComposer6.startReplaceGroup(1812727557);
                        gapComposer6.end(false);
                    }
                    gapComposer6.end(true);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                NetworkingLinkSignupState.Payload payload = (NetworkingLinkSignupState.Payload) obj8;
                Function1 function14 = (Function1) obj7;
                Async async = (Async) obj6;
                FocusRequester focusRequester = (FocusRequester) obj5;
                FocusRequester focusRequester2 = (FocusRequester) obj4;
                ColumnScope columnScope = (ColumnScope) obj;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                columnScope.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer6).changed(columnScope) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer6;
                if (gapComposer7.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18)) {
                    NetworkingLinkSignupState.Content content = payload.content;
                    String str3 = content.title;
                    String str4 = content.message;
                    FillrAnalyticsServiceBuilder.Title(str3, gapComposer7, 0);
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    SpacerKt.Spacer(gapComposer7, SizeKt.m285size3ABfNKs(companion2, 24.0f));
                    if (str4 != null) {
                        gapComposer7.startReplaceGroup(1364127479);
                        FillrAnalyticsServiceBuilder.Body(str4, gapComposer7, 0);
                        SpacerKt.Spacer(gapComposer7, SizeKt.m285size3ABfNKs(companion2, 24.0f));
                    } else {
                        gapComposer7.startReplaceGroup(1356898124);
                    }
                    gapComposer7.end(false);
                    gapComposer7.startReplaceGroup(-1202917531);
                    for (Bullet bullet : content.bullets) {
                        bullet.getClass();
                        Image image = bullet.icon;
                        ImageResource$Network imageResource$Network = (image == null || (str = image.f809default) == null) ? null : new ImageResource$Network(str);
                        String str5 = bullet.title;
                        TextResource.Text text = str5 != null ? new TextResource.Text(zabr.fromHtml(str5)) : null;
                        String str6 = bullet.content;
                        ListItemKt.ListItem(new BulletUI(text, str6 != null ? new TextResource.Text(zabr.fromHtml(str6)) : null, imageResource$Network), function14, gapComposer7, 0);
                        SpacerKt.Spacer(gapComposer7, SizeKt.m285size3ABfNKs(companion2, 16.0f));
                    }
                    gapComposer7.end(false);
                    SimpleTextFieldController simpleTextFieldController = payload.emailController;
                    boolean z2 = this.f$0;
                    FillrAnalyticsServiceBuilder.EmailSection(simpleTextFieldController, z2, async instanceof Async.Loading, focusRequester, gapComposer7, 24646);
                    AnimatedContentKt.AnimatedVisibility(columnScope, z2, null, null, null, null, Expect_jvmKt.rememberComposableLambda(2132771198, new WorkTitleBarViewKt$$ExternalSyntheticLambda4(i2, payload, focusRequester2), gapComposer7), gapComposer7, (intValue6 & 14) | 1572864, 30);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda4(ScrollState scrollState, boolean z, Function1 function1, State state, SupportHomeViewModel supportHomeViewModel, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState) {
        this.f$1 = scrollState;
        this.f$0 = z;
        this.f$2 = function1;
        this.f$3 = state;
        this.f$4 = supportHomeViewModel;
        this.f$5 = parcelableSnapshotMutableIntState;
    }

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda4(NetworkingLinkSignupState.Payload payload, Function1 function1, Async async, boolean z, FocusRequester focusRequester, FocusRequester focusRequester2) {
        this.f$1 = payload;
        this.f$2 = function1;
        this.f$3 = async;
        this.f$0 = z;
        this.f$4 = focusRequester;
        this.f$5 = focusRequester2;
    }

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda4(LocalDate localDate, LocalDate localDate2, boolean z, LocalDate localDate3, LocalDate localDate4, Function1 function1) {
        this.f$1 = localDate;
        this.f$2 = localDate2;
        this.f$0 = z;
        this.f$3 = localDate3;
        this.f$4 = localDate4;
        this.f$5 = function1;
    }

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda4(Function0 function0, Modifier modifier, boolean z, FilterBarChipType filterBarChipType, Object obj, ComposableLambdaImpl composableLambdaImpl) {
        this.f$1 = function0;
        this.f$2 = modifier;
        this.f$0 = z;
        this.f$4 = filterBarChipType;
        this.f$5 = obj;
        this.f$3 = composableLambdaImpl;
    }

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda4(boolean z, String str, SheetTopCornerBehavior sheetTopCornerBehavior, ComposableLambdaImpl composableLambdaImpl, CoroutineScope coroutineScope, RealSheetState realSheetState) {
        this.f$0 = z;
        this.f$1 = str;
        this.f$2 = sheetTopCornerBehavior;
        this.f$3 = composableLambdaImpl;
        this.f$4 = coroutineScope;
        this.f$5 = realSheetState;
    }
}
