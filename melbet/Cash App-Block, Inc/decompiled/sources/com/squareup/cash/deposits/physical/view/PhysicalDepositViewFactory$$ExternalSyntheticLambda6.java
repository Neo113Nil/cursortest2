package com.squareup.cash.deposits.physical.view;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.BadgePlacement;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda1;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.deposits.physical.view.map.AtmClusterItem;
import com.squareup.cash.deposits.physical.view.map.AtmWithdrawalMapViewArcadeKt;
import com.squareup.cash.deposits.physical.view.map.ComposableSingletons$AtmWithdrawalMapViewArcadeKt;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmMarkerLocation;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmWithdrawalMapViewModel;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda4;
import com.squareup.cash.maps.viewmodels.CashMapViewModel;
import com.squareup.cash.maps.views.CashMapViewKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class PhysicalDepositViewFactory$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ AtmWithdrawalMapViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ PhysicalDepositViewFactory$$ExternalSyntheticLambda6(AtmWithdrawalMapViewModel atmWithdrawalMapViewModel, Function1 function1) {
        this.f$0 = atmWithdrawalMapViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.$r8$classId;
        final AtmWithdrawalMapViewModel atmWithdrawalMapViewModel = this.f$0;
        Function1 function1 = this.f$1;
        final int i2 = 0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    AtmWithdrawalMapViewArcadeKt.AtmWithdrawalMapArcade(atmWithdrawalMapViewModel, function1, gapComposer, 0);
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
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, systemBarsPadding);
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
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-142199807, new Function2() { // from class: com.squareup.cash.deposits.physical.view.map.AtmWithdrawalMapViewArcadeKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            int i3 = i2;
                            AtmWithdrawalMapViewModel atmWithdrawalMapViewModel2 = atmWithdrawalMapViewModel;
                            switch (i3) {
                                case 0:
                                    Composer composer3 = (Composer) obj3;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                                        ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer3, 48);
                                        int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                        if (gapComposer3.applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer3.startReusableNode();
                                        if (gapComposer3.inserting) {
                                            gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                                        } else {
                                            gapComposer3.useNode();
                                        }
                                        Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer3, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                        if (atmWithdrawalMapViewModel2.showAddress) {
                                            gapComposer3.startReplaceGroup(-1467991824);
                                            String stringResource = Room.stringResource(gapComposer3, R.string.locations_near_address_label);
                                            TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                                            Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                            if (colors2 == null) {
                                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                            } else {
                                                gapComposer3.startReplaceGroup(-1762997739);
                                                gapComposer3.end(false);
                                            }
                                            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, colors2.semantic.text.subtle, (Composer) gapComposer3, (Modifier) null, textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                                            Room.m1165Text25TpFw(2, 1, 0, 3, 1769472, 0, 3742, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, atmWithdrawalMapViewModel2.searchedAddress, (Map) null, (Function1) null, false);
                                            gapComposer3.end(false);
                                        } else {
                                            gapComposer3.startReplaceGroup(-1467496041);
                                            String str = atmWithdrawalMapViewModel2.viewTextViewModel.mapScreen.header_title;
                                            str.getClass();
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                            gapComposer3.end(false);
                                        }
                                        gapComposer3.end(true);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    Composer composer4 = (Composer) obj3;
                                    int intValue4 = ((Integer) obj4).intValue();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (!gapComposer4.shouldExecute(1 & intValue4, (intValue4 & 3) != 2)) {
                                        gapComposer4.skipToGroupEnd();
                                    } else if (atmWithdrawalMapViewModel2.hasSeenExplainer) {
                                        gapComposer4.startReplaceGroup(-1028555029);
                                        Trace.m1191Iconww6aTOc(Icons.Help24, Room.stringResource(gapComposer4, R.string.withdrawal_help_description), (Modifier) null, 0L, gapComposer4, 6, 12);
                                        gapComposer4.end(false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1028374764);
                                        Room.BadgeAssetLayout(Badge.Small.INSTANCE, BadgePlacement.TitleBarIcon, null, false, ComposableSingletons$AtmWithdrawalMapViewArcadeKt.f370lambda$1112071785, gapComposer4, 24576, 12);
                                        gapComposer4.end(false);
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, gapComposer2);
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda4(14, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.TitleBarSub(rememberComposableLambda, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-1922440100, new BookletGridKt$$ExternalSyntheticLambda1(23, function1), gapComposer2), gapComposer2, 1572918, 44);
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, layoutWeightElement);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                    List list = atmWithdrawalMapViewModel.atmLocations;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new AtmClusterItem((AtmMarkerLocation) it.next()));
                    }
                    UiCallbackModel uiCallbackModel = atmWithdrawalMapViewModel.cashMapUiModel;
                    CashMapViewKt.CashMapView(fillMaxSize2, arrayList, (CashMapViewModel) uiCallbackModel.model, ComposableSingletons$AtmWithdrawalMapViewArcadeKt.f372lambda$77311707, ComposableSingletons$AtmWithdrawalMapViewArcadeKt.f371lambda$1385168376, null, null, null, null, null, null, false, false, uiCallbackModel.onEvent, gapComposer2, 221190, 0, 16328);
                    ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier align = BoxScopeInstance.INSTANCE.align(SpacerKt.m298padding3ABfNKs(companion, 16.0f), Alignment.Companion.BottomStart);
                    boolean changed2 = gapComposer2.changed(function1);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ComposeDialogKt$$ExternalSyntheticLambda4(15, function1);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    final int i3 = 1;
                    CashMapViewKt.ArcadeMapIconButton(MLKEMEngine.KyberPolyBytes, 8, gapComposer2, Expect_jvmKt.rememberComposableLambda(-235175733, new Function2() { // from class: com.squareup.cash.deposits.physical.view.map.AtmWithdrawalMapViewArcadeKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            int i32 = i3;
                            AtmWithdrawalMapViewModel atmWithdrawalMapViewModel2 = atmWithdrawalMapViewModel;
                            switch (i32) {
                                case 0:
                                    Composer composer3 = (Composer) obj3;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                                        ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer3, 48);
                                        int hashCode22 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope22 = gapComposer3.currentCompositionLocalScope();
                                        Modifier materializeModifier22 = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                        if (gapComposer3.applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer3.startReusableNode();
                                        if (gapComposer3.inserting) {
                                            gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                                        } else {
                                            gapComposer3.useNode();
                                        }
                                        Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope22, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode22), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer3, materializeModifier22, ComposeUiNode.Companion.SetModifier);
                                        if (atmWithdrawalMapViewModel2.showAddress) {
                                            gapComposer3.startReplaceGroup(-1467991824);
                                            String stringResource = Room.stringResource(gapComposer3, R.string.locations_near_address_label);
                                            TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                                            Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                            if (colors2 == null) {
                                                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                            } else {
                                                gapComposer3.startReplaceGroup(-1762997739);
                                                gapComposer3.end(false);
                                            }
                                            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, colors2.semantic.text.subtle, (Composer) gapComposer3, (Modifier) null, textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                                            Room.m1165Text25TpFw(2, 1, 0, 3, 1769472, 0, 3742, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, atmWithdrawalMapViewModel2.searchedAddress, (Map) null, (Function1) null, false);
                                            gapComposer3.end(false);
                                        } else {
                                            gapComposer3.startReplaceGroup(-1467496041);
                                            String str = atmWithdrawalMapViewModel2.viewTextViewModel.mapScreen.header_title;
                                            str.getClass();
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                            gapComposer3.end(false);
                                        }
                                        gapComposer3.end(true);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    Composer composer4 = (Composer) obj3;
                                    int intValue4 = ((Integer) obj4).intValue();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (!gapComposer4.shouldExecute(1 & intValue4, (intValue4 & 3) != 2)) {
                                        gapComposer4.skipToGroupEnd();
                                    } else if (atmWithdrawalMapViewModel2.hasSeenExplainer) {
                                        gapComposer4.startReplaceGroup(-1028555029);
                                        Trace.m1191Iconww6aTOc(Icons.Help24, Room.stringResource(gapComposer4, R.string.withdrawal_help_description), (Modifier) null, 0L, gapComposer4, 6, 12);
                                        gapComposer4.end(false);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1028374764);
                                        Room.BadgeAssetLayout(Badge.Small.INSTANCE, BadgePlacement.TitleBarIcon, null, false, ComposableSingletons$AtmWithdrawalMapViewArcadeKt.f370lambda$1112071785, gapComposer4, 24576, 12);
                                        gapComposer4.end(false);
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, gapComposer2), align, (Function0) rememberedValue2, false);
                    gapComposer2.end(true);
                    AtmWithdrawalMapViewModel.AtmFeeViewModel atmFeeViewModel = atmWithdrawalMapViewModel.feeViewModel;
                    if (atmFeeViewModel == null) {
                        gapComposer2.startReplaceGroup(-401785050);
                        z = false;
                    } else {
                        z = false;
                        gapComposer2.startReplaceGroup(-401785049);
                        AtmWithdrawalMapViewArcadeKt.FeeInformationFooter(atmFeeViewModel, gapComposer2, 0);
                    }
                    gapComposer2.end(z);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ PhysicalDepositViewFactory$$ExternalSyntheticLambda6(Function1 function1, AtmWithdrawalMapViewModel atmWithdrawalMapViewModel) {
        this.f$1 = function1;
        this.f$0 = atmWithdrawalMapViewModel;
    }
}
