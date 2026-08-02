package com.squareup.cash.payments.views.nearby;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.RoomDatabase$performClear$1;
import androidx.room.util.DBUtil;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda11;
import app.cash.molecule.PlatformKt;
import app.cash.versioned.Versioned;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda8;
import com.squareup.cash.formview.components.arcade.ArcadeFormDateInputView$Content$7$1;
import com.squareup.cash.maps.views.CashMapViewKt$CashMapView$3$1;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda3;
import com.squareup.cash.nearby.views.DotGridKt;
import com.squareup.cash.nearby.views.DotGridPhase;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda1;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestTab;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPerson;
import com.squareup.cash.payments.views.DissolveTransitionStyle;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.payments.views.WarningDialogViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda11;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda3;
import com.squareup.cash.score.views.ScoreSummaryKt$ScoreSummary$1$3$1;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda8;
import com.squareup.cash.storage.AndroidFileSaver$save$2;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda10;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.work.data.real.RealPayDataLoader$fetchData$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class NearbyPayRequestViewKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NearbyPayRequestViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ NearbyPayRequestViewKt$$ExternalSyntheticLambda1(NearbyPayRequestViewModel nearbyPayRequestViewModel, Function1 function1, int i) {
        this.$r8$classId = 2;
        this.f$0 = nearbyPayRequestViewModel;
        this.f$1 = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0333 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x027f  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        String title;
        boolean z;
        Object rememberedValue;
        MutableState mutableState;
        boolean changed;
        Object rememberedValue2;
        boolean z2;
        Object rememberedValue3;
        Object rememberedValue4;
        MutableState mutableState2;
        Versioned versioned;
        boolean z3;
        Object rememberedValue5;
        MutableState mutableState3;
        boolean changedInstance;
        Object rememberedValue6;
        MutableState mutableState4;
        boolean changed2;
        Object rememberedValue7;
        Applier applier;
        Continuation continuation;
        boolean booleanValue;
        boolean changedInstance2;
        Object rememberedValue8;
        Continuation continuation2;
        Object rememberedValue9;
        Set set;
        Object rememberedValue10;
        MutableState mutableState5;
        boolean changedInstance3;
        Object rememberedValue11;
        NearbyPayRequestViewModel nearbyPayRequestViewModel;
        MutableState mutableState6;
        Continuation continuation3;
        Object rememberedValue12;
        Object rememberedValue13;
        MutableState mutableState7;
        boolean changed3;
        Object rememberedValue14;
        MutableState mutableState8;
        MutableState mutableState9;
        MutableState mutableState10;
        boolean booleanValue2;
        Object rememberedValue15;
        MutableState mutableState11;
        int i;
        boolean changed4;
        Object rememberedValue16;
        Set set2;
        boolean z4;
        boolean z5;
        ComposableLambdaImpl composableLambdaImpl;
        float f;
        boolean z6;
        int i2 = this.$r8$classId;
        Object obj3 = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NearbyPayRequestViewModel nearbyPayRequestViewModel2 = this.f$0;
        Function1 function1 = this.f$1;
        switch (i2) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(697464164, new NearbyPayRequestViewKt$$ExternalSyntheticLambda1(nearbyPayRequestViewModel2, function1, 3, (byte) 0), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    NearbyPayRequestViewModel.Ready ready = nearbyPayRequestViewModel2 instanceof NearbyPayRequestViewModel.Ready ? (NearbyPayRequestViewModel.Ready) nearbyPayRequestViewModel2 : null;
                    String stringResource = Room.stringResource(gapComposer2, R.string.nearby_pay_request_title_still_looking_help);
                    String stringResource2 = Room.stringResource(gapComposer2, R.string.nearby_pay_request_title_still_looking_help_accessibility);
                    String stringResource3 = Room.stringResource(gapComposer2, R.string.nearby_pay_request_title_people_overflow);
                    String stringResource4 = Room.stringResource(gapComposer2, R.string.nearby_pay_request_title_people_overflow_accessibility);
                    NearbyPayRequestTab nearbyPayRequestTab = ready != null ? ready.selectedTab : null;
                    Object rememberedValue17 = gapComposer2.rememberedValue();
                    Object obj4 = rememberedValue17;
                    if (rememberedValue17 == obj3) {
                        NearbyPayRequestTab[] nearbyPayRequestTabArr = {nearbyPayRequestTab};
                        gapComposer2.updateRememberedValue(nearbyPayRequestTabArr);
                        obj4 = nearbyPayRequestTabArr;
                    }
                    NearbyPayRequestTab[] nearbyPayRequestTabArr2 = (NearbyPayRequestTab[]) obj4;
                    boolean changedInstance4 = gapComposer2.changedInstance(nearbyPayRequestTabArr2) | gapComposer2.changed(nearbyPayRequestTab == null ? -1 : nearbyPayRequestTab.ordinal());
                    Object rememberedValue18 = gapComposer2.rememberedValue();
                    if (changedInstance4 || rememberedValue18 == obj3) {
                        rememberedValue18 = new MainPaymentView$Content$2$1(nearbyPayRequestTabArr2, nearbyPayRequestTab, null, 25);
                        gapComposer2.updateRememberedValue(rememberedValue18);
                    }
                    Updater.LaunchedEffect(gapComposer2, nearbyPayRequestTab, (Function2) rememberedValue18);
                    if ((nearbyPayRequestViewModel2 instanceof NearbyPayRequestViewModel.NotReady) && ((NearbyPayRequestViewModel.NotReady) nearbyPayRequestViewModel2).isError) {
                        title = re$$ExternalSyntheticOutline0.m(gapComposer2, 676487006, R.string.nearby_pay_request_error_title, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(676567978);
                        gapComposer2.end(false);
                        title = nearbyPayRequestViewModel2.getTitle();
                    }
                    String str = (ready == null || !ready.showHelpLink) ? title : stringResource2;
                    boolean changed5 = gapComposer2.changed(str);
                    Object rememberedValue19 = gapComposer2.rememberedValue();
                    if (changed5 || rememberedValue19 == obj3) {
                        rememberedValue19 = new ClusterItemKt$$ExternalSyntheticLambda3(str, 24);
                        gapComposer2.updateRememberedValue(rememberedValue19);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue19);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    NearbyPayRequestTab nearbyPayRequestTab2 = nearbyPayRequestTab;
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, semantics);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Triple triple = new Triple(title, Boolean.valueOf(ready != null && ready.showHelpLink), false);
                    NearbyPayRequestTab nearbyPayRequestTab3 = nearbyPayRequestTabArr2[0];
                    QuickPayViewKt.DissolveWipeContent(triple, null, 0, RecyclerView.DECELERATION_RATE, nearbyPayRequestTab3 == nearbyPayRequestTab2 ? DissolveTransitionStyle.FADE : DissolveTransitionStyle.WIPE, nearbyPayRequestTab3 == NearbyPayRequestTab.GET_PAID && nearbyPayRequestTab2 == NearbyPayRequestTab.PAY, Expect_jvmKt.rememberComposableLambda(408681771, new ComposeDialogKt$$ExternalSyntheticLambda8(stringResource3, this.f$1, stringResource4, stringResource, stringResource2), gapComposer2), gapComposer2, 1572864);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                NearbyPayRequestViewKt.NearbyPayRequestTitleBar(nearbyPayRequestViewModel2, function1, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                GapComposer gapComposer3 = (GapComposer) composer3;
                boolean shouldExecute = gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2);
                Applier applier2 = gapComposer3.applier;
                if (shouldExecute) {
                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    Modifier fillMaxSize = SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, colors.semantic.background.f1047app, ColorKt.RectangleShape), 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer3, 0);
                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, fillMaxSize);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier2 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer3.useNode();
                    }
                    Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer3, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    NearbyPayRequestViewModel nearbyPayRequestViewModel3 = this.f$0;
                    NearbyPayRequestViewKt.NearbyPayRequestTitleBar(nearbyPayRequestViewModel3, function1, gapComposer3, 0);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                    boolean z7 = nearbyPayRequestViewModel3 instanceof NearbyPayRequestViewModel.Ready;
                    if (z7) {
                        NearbyPayRequestViewModel.Ready ready2 = (NearbyPayRequestViewModel.Ready) nearbyPayRequestViewModel3;
                        if (ready2.selectedTab == NearbyPayRequestTab.PAY && !ready2.avatars.isEmpty()) {
                            z = true;
                            rememberedValue = gapComposer3.rememberedValue();
                            if (rememberedValue == obj3) {
                                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                                gapComposer3.updateRememberedValue(rememberedValue);
                            }
                            mutableState = (MutableState) rememberedValue;
                            Boolean valueOf = Boolean.valueOf(z);
                            changed = gapComposer3.changed(z);
                            rememberedValue2 = gapComposer3.rememberedValue();
                            if (!changed || rememberedValue2 == obj3) {
                                rememberedValue2 = new CashMapViewKt$CashMapView$3$1(z, mutableState, null, 10);
                                gapComposer3.updateRememberedValue(rememberedValue2);
                            }
                            Updater.LaunchedEffect(gapComposer3, valueOf, (Function2) rememberedValue2);
                            boolean z8 = !z7 && ((NearbyPayRequestViewModel.Ready) nearbyPayRequestViewModel3).selectedTab == NearbyPayRequestTab.GET_PAID;
                            boolean z9 = nearbyPayRequestViewModel3 instanceof NearbyPayRequestViewModel.NotReady;
                            boolean z10 = !z9 && ((NearbyPayRequestViewModel.NotReady) nearbyPayRequestViewModel3).isBluetoothOff;
                            boolean z11 = !z9 && ((NearbyPayRequestViewModel.NotReady) nearbyPayRequestViewModel3).isError;
                            z2 = (z9 || z10 || z11) ? false : true;
                            rememberedValue3 = gapComposer3.rememberedValue();
                            if (rememberedValue3 == obj3) {
                                rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
                                gapComposer3.updateRememberedValue(rememberedValue3);
                            }
                            MutableState mutableState12 = (MutableState) rememberedValue3;
                            if (z2) {
                                mutableState12.setValue(Boolean.TRUE);
                            }
                            rememberedValue4 = gapComposer3.rememberedValue();
                            if (rememberedValue4 == obj3) {
                                rememberedValue4 = Updater.mutableStateOf$default(Boolean.FALSE);
                                gapComposer3.updateRememberedValue(rememberedValue4);
                            }
                            mutableState2 = (MutableState) rememberedValue4;
                            DotGridPhase dotGridPhase = !z2 ? DotGridPhase.NuxPulse : z8 ? DotGridPhase.RadialTransition : z11 ? DotGridPhase.ErrorPulse : z ? DotGridPhase.PersonFound : (((Boolean) mutableState.getValue()).booleanValue() || ((Boolean) mutableState12.getValue()).booleanValue()) ? DotGridPhase.Scanning : DotGridPhase.Formation;
                            DotGridPhase dotGridPhase2 = !z10 ? DotGridPhase.BluetoothPulse : z11 ? DotGridPhase.ErrorPulse : DotGridPhase.Scanning;
                            NearbyPayRequestViewModel.Ready ready3 = !z7 ? (NearbyPayRequestViewModel.Ready) nearbyPayRequestViewModel3 : null;
                            versioned = ready3 == null ? ready3.vibrate : null;
                            z3 = !z7 && ((NearbyPayRequestViewModel.Ready) nearbyPayRequestViewModel3).selectedTab == NearbyPayRequestTab.PAY;
                            RealCashVibrator realCashVibrator = (RealCashVibrator) gapComposer3.consume(LocalCashVibratorKt.LocalCashVibrator);
                            rememberedValue5 = gapComposer3.rememberedValue();
                            if (rememberedValue5 == obj3) {
                                rememberedValue5 = Updater.mutableStateOf$default(null);
                                gapComposer3.updateRememberedValue(rememberedValue5);
                            }
                            mutableState3 = (MutableState) rememberedValue5;
                            changedInstance = gapComposer3.changedInstance(versioned) | gapComposer3.changed(z3) | gapComposer3.changedInstance(realCashVibrator);
                            DotGridPhase dotGridPhase3 = dotGridPhase;
                            rememberedValue6 = gapComposer3.rememberedValue();
                            if (!changedInstance || rememberedValue6 == obj3) {
                                rememberedValue6 = new ArcadeFormDateInputView$Content$7$1(4, versioned, realCashVibrator, mutableState2, mutableState3, null, z3);
                                mutableState4 = mutableState3;
                                gapComposer3.updateRememberedValue(rememberedValue6);
                            } else {
                                mutableState4 = mutableState3;
                            }
                            Updater.LaunchedEffect(gapComposer3, versioned, (Function2) rememberedValue6);
                            Boolean valueOf2 = Boolean.valueOf(z3);
                            changed2 = gapComposer3.changed(z3);
                            DotGridPhase dotGridPhase4 = dotGridPhase2;
                            rememberedValue7 = gapComposer3.rememberedValue();
                            if (!changed2 || rememberedValue7 == obj3) {
                                applier = applier2;
                                continuation = null;
                                rememberedValue7 = new CashMapViewKt$CashMapView$3$1(z3, mutableState4, null, 11);
                                gapComposer3.updateRememberedValue(rememberedValue7);
                            } else {
                                applier = applier2;
                                continuation = null;
                            }
                            Updater.LaunchedEffect(gapComposer3, valueOf2, (Function2) rememberedValue7);
                            booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
                            Boolean valueOf3 = Boolean.valueOf(booleanValue);
                            changedInstance2 = gapComposer3.changedInstance(realCashVibrator);
                            rememberedValue8 = gapComposer3.rememberedValue();
                            if (!changedInstance2 || rememberedValue8 == obj3) {
                                continuation2 = continuation;
                                rememberedValue8 = new AndroidFileSaver$save$2(realCashVibrator, mutableState2, mutableState4, continuation2, 6);
                                gapComposer3.updateRememberedValue(rememberedValue8);
                            } else {
                                continuation2 = continuation;
                            }
                            Updater.LaunchedEffect(gapComposer3, valueOf3, (Function2) rememberedValue8);
                            rememberedValue9 = gapComposer3.rememberedValue();
                            if (rememberedValue9 == obj3) {
                                EmptyMap emptyMap = EmptyMap.INSTANCE;
                                emptyMap.getClass();
                                rememberedValue9 = Updater.mutableStateOf$default(emptyMap);
                                gapComposer3.updateRememberedValue(rememberedValue9);
                            }
                            MutableState mutableState13 = (MutableState) rememberedValue9;
                            if (z7) {
                                NearbyPayRequestViewModel.Ready ready4 = (NearbyPayRequestViewModel.Ready) nearbyPayRequestViewModel3;
                                if (ready4.selectedTab == NearbyPayRequestTab.PAY) {
                                    List list = ready4.avatars;
                                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((NearbyPerson) it.next()).customerToken);
                                    }
                                    set = CollectionsKt.toSet(arrayList);
                                    rememberedValue10 = gapComposer3.rememberedValue();
                                    if (rememberedValue10 == obj3) {
                                        EmptyMap emptyMap2 = EmptyMap.INSTANCE;
                                        emptyMap2.getClass();
                                        rememberedValue10 = Updater.mutableStateOf$default(emptyMap2);
                                        gapComposer3.updateRememberedValue(rememberedValue10);
                                    }
                                    mutableState5 = (MutableState) rememberedValue10;
                                    Boolean bool = (Boolean) mutableState2.getValue();
                                    bool.booleanValue();
                                    changedInstance3 = gapComposer3.changedInstance(nearbyPayRequestViewModel3);
                                    rememberedValue11 = gapComposer3.rememberedValue();
                                    if (!changedInstance3 || rememberedValue11 == obj3) {
                                        rememberedValue11 = new AndroidFileSaver$save$2(nearbyPayRequestViewModel3, mutableState2, mutableState5, continuation2, 7);
                                        nearbyPayRequestViewModel = nearbyPayRequestViewModel3;
                                        mutableState6 = mutableState5;
                                        continuation3 = continuation2;
                                        gapComposer3.updateRememberedValue(rememberedValue11);
                                    } else {
                                        nearbyPayRequestViewModel = nearbyPayRequestViewModel3;
                                        mutableState6 = mutableState5;
                                        continuation3 = continuation2;
                                    }
                                    Updater.LaunchedEffect(set, bool, (Function2) rememberedValue11, gapComposer3);
                                    rememberedValue12 = gapComposer3.rememberedValue();
                                    if (rememberedValue12 == obj3) {
                                        rememberedValue12 = Updater.mutableStateOf$default(Boolean.FALSE);
                                        gapComposer3.updateRememberedValue(rememberedValue12);
                                    }
                                    MutableState mutableState14 = (MutableState) rememberedValue12;
                                    rememberedValue13 = gapComposer3.rememberedValue();
                                    if (rememberedValue13 == obj3) {
                                        rememberedValue13 = Updater.mutableStateOf$default(Boolean.FALSE);
                                        gapComposer3.updateRememberedValue(rememberedValue13);
                                    }
                                    mutableState7 = (MutableState) rememberedValue13;
                                    Boolean valueOf4 = Boolean.valueOf(z8);
                                    changed3 = gapComposer3.changed(z8);
                                    rememberedValue14 = gapComposer3.rememberedValue();
                                    if (!changed3 || rememberedValue14 == obj3) {
                                        RealPayDataLoader$fetchData$1 realPayDataLoader$fetchData$1 = new RealPayDataLoader$fetchData$1(z8, mutableState2, mutableState13, mutableState14, mutableState7, (Continuation) null);
                                        mutableState8 = mutableState2;
                                        mutableState9 = mutableState13;
                                        mutableState10 = mutableState7;
                                        gapComposer3.updateRememberedValue(realPayDataLoader$fetchData$1);
                                        rememberedValue14 = realPayDataLoader$fetchData$1;
                                    } else {
                                        mutableState9 = mutableState13;
                                        mutableState8 = mutableState2;
                                        mutableState10 = mutableState7;
                                    }
                                    Updater.LaunchedEffect(gapComposer3, valueOf4, (Function2) rememberedValue14);
                                    booleanValue2 = ((Boolean) mutableState14.getValue()).booleanValue();
                                    float f2 = RecyclerView.DECELERATION_RATE;
                                    if (booleanValue2) {
                                        f2 = 1.0f;
                                    }
                                    State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f2, AnimatableKt.spring$default(0.5f, 200.0f, continuation3, 4), "radialAvatarScale", null, gapComposer3, 3120, 20);
                                    float mo236toPx0680j_4 = ((Density) gapComposer3.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(56.0f);
                                    rememberedValue15 = gapComposer3.rememberedValue();
                                    if (rememberedValue15 == obj3) {
                                        rememberedValue15 = Updater.mutableStateOf$default(continuation3);
                                        gapComposer3.updateRememberedValue(rememberedValue15);
                                    }
                                    mutableState11 = (MutableState) rememberedValue15;
                                    NearbyPayRequestViewModel.Ready ready5 = z7 ? (NearbyPayRequestViewModel.Ready) nearbyPayRequestViewModel : continuation3;
                                    List list2 = ready5 != 0 ? ready5.payers : EmptyList.INSTANCE;
                                    i = ready5 != 0 ? ready5.confirmedPaymentCount : 0;
                                    List list3 = list2;
                                    Integer valueOf5 = Integer.valueOf(i);
                                    changed4 = gapComposer3.changed(i);
                                    float f3 = mo236toPx0680j_4;
                                    rememberedValue16 = gapComposer3.rememberedValue();
                                    if (!changed4 || rememberedValue16 == obj3) {
                                        set2 = set;
                                        rememberedValue16 = new ScoreSummaryKt$ScoreSummary$1$3$1(i, mutableState11, mutableState10, (Continuation) null);
                                        gapComposer3.updateRememberedValue(rememberedValue16);
                                    } else {
                                        set2 = set;
                                    }
                                    Updater.LaunchedEffect(gapComposer3, valueOf5, (Function2) rememberedValue16);
                                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(new LayoutWeightElement(1.0f, true), 1.0f);
                                    ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                    DefaultSizes.spacing.getClass();
                                    Modifier clipToBounds = ClipKt.clipToBounds(SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2));
                                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                                    int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, clipToBounds);
                                    ComposeUiNode.Companion.getClass();
                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                                    if (applier == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    gapComposer3.startReusableNode();
                                    MutableState mutableState15 = mutableState10;
                                    if (gapComposer3.inserting) {
                                        gapComposer3.createNode(layoutNode$Companion$Constructor$13);
                                    } else {
                                        gapComposer3.useNode();
                                    }
                                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer3, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                                    Object rememberedValue20 = gapComposer3.rememberedValue();
                                    if (rememberedValue20 == obj3) {
                                        rememberedValue20 = new TabToolbarsKt$$ExternalSyntheticLambda10(1, mutableState11);
                                        gapComposer3.updateRememberedValue(rememberedValue20);
                                    }
                                    Function1 function12 = (Function1) rememberedValue20;
                                    Object rememberedValue21 = gapComposer3.rememberedValue();
                                    if (rememberedValue21 == obj3) {
                                        rememberedValue21 = new TabToolbarsKt$$ExternalSyntheticLambda10(2, mutableState9);
                                        gapComposer3.updateRememberedValue(rememberedValue21);
                                    }
                                    Function1 function13 = (Function1) rememberedValue21;
                                    Object rememberedValue22 = gapComposer3.rememberedValue();
                                    if (rememberedValue22 == obj3) {
                                        rememberedValue22 = new OverlayKt$$ExternalSyntheticLambda1(13, mutableState8);
                                        gapComposer3.updateRememberedValue(rememberedValue22);
                                    }
                                    Set set3 = set2;
                                    DotGridKt.DotGrid(fillMaxSize2, dotGridPhase3, true, dotGridPhase4, 0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, null, function12, set3, function13, (Function0) rememberedValue22, Expect_jvmKt.rememberComposableLambda(1758898878, new PdfPreviewViewKt$$ExternalSyntheticLambda0(6, nearbyPayRequestViewModel, animateFloatAsState), gapComposer3), gapComposer3, 805309494);
                                    GapComposer gapComposer4 = gapComposer3;
                                    gapComposer4.startReplaceGroup(974269527);
                                    Iterator it2 = ((Map) mutableState6.getValue()).entrySet().iterator();
                                    while (it2.hasNext()) {
                                        Map.Entry entry = (Map.Entry) it2.next();
                                        String str2 = (String) entry.getKey();
                                        NearbyPerson nearbyPerson = (NearbyPerson) entry.getValue();
                                        gapComposer4.startMovableGroup(974271158, str2);
                                        boolean contains = set3.contains(str2);
                                        Object rememberedValue23 = gapComposer4.rememberedValue();
                                        if (rememberedValue23 == obj3) {
                                            rememberedValue23 = Updater.mutableStateOf$default(null);
                                            gapComposer4.updateRememberedValue(rememberedValue23);
                                        }
                                        MutableState mutableState16 = (MutableState) rememberedValue23;
                                        Offset offset = (Offset) ((Map) mutableState9.getValue()).get(str2);
                                        if (offset != null) {
                                            mutableState16.setValue(new Offset(offset.packedValue));
                                        }
                                        Object rememberedValue24 = gapComposer4.rememberedValue();
                                        if (rememberedValue24 == obj3) {
                                            rememberedValue24 = Updater.mutableStateOf$default(Boolean.FALSE);
                                            gapComposer4.updateRememberedValue(rememberedValue24);
                                        }
                                        MutableState mutableState17 = (MutableState) rememberedValue24;
                                        Boolean valueOf6 = Boolean.valueOf(contains);
                                        boolean changed6 = gapComposer4.changed(contains) | gapComposer4.changed(str2);
                                        Iterator it3 = it2;
                                        Object rememberedValue25 = gapComposer4.rememberedValue();
                                        if (changed6 || rememberedValue25 == obj3) {
                                            rememberedValue25 = new RoomDatabase$performClear$1.AnonymousClass1(contains, str2, mutableState17, mutableState6, (Continuation) null, 16);
                                            gapComposer4.updateRememberedValue(rememberedValue25);
                                        }
                                        Updater.LaunchedEffect(gapComposer4, valueOf6, (Function2) rememberedValue25);
                                        GapComposer gapComposer5 = gapComposer4;
                                        State animateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState17.getValue()).booleanValue() ? 1.0f : RecyclerView.DECELERATION_RATE, AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), "avatarAlpha", null, gapComposer5, 3120, 20);
                                        State animateFloatAsState3 = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState17.getValue()).booleanValue() ? 1.0f : 0.5f, AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), "avatarScale", null, gapComposer5, 3120, 20);
                                        gapComposer4 = gapComposer5;
                                        Offset offset2 = (Offset) mutableState16.getValue();
                                        if (offset2 != null && ((Number) animateFloatAsState2.getValue()).floatValue() > RecyclerView.DECELERATION_RATE) {
                                            gapComposer4.startReplaceGroup(139022078);
                                            long j = offset2.packedValue;
                                            float floatValue = ((Number) animateFloatAsState2.getValue()).floatValue();
                                            float floatValue2 = ((Number) animateFloatAsState3.getValue()).floatValue();
                                            boolean changed7 = gapComposer4.changed(function1) | gapComposer4.changedInstance(nearbyPerson);
                                            Object rememberedValue26 = gapComposer4.rememberedValue();
                                            if (changed7 || rememberedValue26 == obj3) {
                                                rememberedValue26 = new ProfileKt$$ExternalSyntheticLambda11(3, function1, nearbyPerson);
                                                gapComposer4.updateRememberedValue(rememberedValue26);
                                            }
                                            f = f3;
                                            NearbyPayRequestViewKt.m3710PersonFoundAvatarjHo2IpA(nearbyPerson, j, f, floatValue, floatValue2, (Function0) rememberedValue26, Room.stringResource(R.string.nearby_pay_request_action_pay_person, new Object[]{nearbyPerson.name}, gapComposer4), gapComposer4, 6);
                                            gapComposer4 = gapComposer4;
                                            z6 = false;
                                            gapComposer4.end(false);
                                            gapComposer4.end(z6);
                                            f3 = f;
                                            it2 = it3;
                                        }
                                        f = f3;
                                        z6 = false;
                                        gapComposer4.startReplaceGroup(139479514);
                                        gapComposer4.end(false);
                                        gapComposer4.end(z6);
                                        f3 = f;
                                        it2 = it3;
                                    }
                                    gapComposer4.end(false);
                                    boolean changed8 = gapComposer4.changed(function1);
                                    Object rememberedValue27 = gapComposer4.rememberedValue();
                                    if (changed8 || rememberedValue27 == obj3) {
                                        rememberedValue27 = new WarningDialogViewKt$$ExternalSyntheticLambda5(28, function1);
                                        gapComposer4.updateRememberedValue(rememberedValue27);
                                    }
                                    NearbyPayRequestViewModel nearbyPayRequestViewModel4 = nearbyPayRequestViewModel;
                                    GapComposer gapComposer6 = gapComposer4;
                                    NearbyPayRequestViewKt.PayerOverlay(nearbyPayRequestViewModel4, (Function0) rememberedValue27, ((Boolean) mutableState15.getValue()).booleanValue(), list3, gapComposer6, 6);
                                    GapComposer gapComposer7 = gapComposer6;
                                    gapComposer7.end(true);
                                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer7, null);
                                    if (z9) {
                                        gapComposer7.startReplaceGroup(-97602602);
                                        NearbyPayRequestViewModel.NotReady notReady = (NearbyPayRequestViewModel.NotReady) nearbyPayRequestViewModel4;
                                        if (notReady.isError) {
                                            gapComposer7.startReplaceGroup(-97590822);
                                            DimensionKt.ButtonCtaGroup(null, false, ButtonCtaGroupOrientation.AUTOMATIC, NearbyPayRequestViewKt.lambda$546355482, Expect_jvmKt.rememberComposableLambda(1753309305, new PdfPreviewViewKt$$ExternalSyntheticLambda4(4, function1), gapComposer7), gapComposer7, 28032, 3);
                                            gapComposer7 = gapComposer7;
                                            z5 = false;
                                            gapComposer7.end(false);
                                        } else {
                                            gapComposer7.startReplaceGroup(-96986973);
                                            String str3 = notReady.buttonLabel;
                                            if (str3 != null) {
                                                gapComposer7.startReplaceGroup(-96899956);
                                                ButtonCtaGroupOrientation buttonCtaGroupOrientation = ButtonCtaGroupOrientation.AUTOMATIC;
                                                String str4 = notReady.disclaimer;
                                                if (str4 == null) {
                                                    gapComposer7.startReplaceGroup(-96790248);
                                                    gapComposer7.end(false);
                                                    composableLambdaImpl = null;
                                                } else {
                                                    gapComposer7.startReplaceGroup(-96790247);
                                                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(325718242, new SheetKt$$ExternalSyntheticLambda8(str4, 5), gapComposer7);
                                                    gapComposer7.end(false);
                                                    composableLambdaImpl = rememberComposableLambda;
                                                }
                                                DimensionKt.ButtonCtaGroup(null, false, buttonCtaGroupOrientation, composableLambdaImpl, Expect_jvmKt.rememberComposableLambda(-1087772843, new TabContentViewKt$$ExternalSyntheticLambda11(function1, str3, 27), gapComposer7), gapComposer7, 24960, 3);
                                                gapComposer7 = gapComposer7;
                                                z5 = false;
                                                gapComposer7.end(false);
                                            } else {
                                                z5 = false;
                                                gapComposer7.startReplaceGroup(-96400236);
                                                gapComposer7.end(false);
                                            }
                                            gapComposer7.end(z5);
                                        }
                                        gapComposer7.end(z5);
                                        z4 = true;
                                    } else {
                                        if (!z7) {
                                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer7, -972981158, false);
                                        }
                                        gapComposer7.startReplaceGroup(-96305500);
                                        Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(companion);
                                        ((DefaultSizes) gapComposer7.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                        DefaultSizes.spacing.getClass();
                                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(navigationBarsPadding, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                                        ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer7, 0);
                                        int hashCode4 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                                        PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer7.currentCompositionLocalScope();
                                        Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer7, m302paddingqDBjuR0$default);
                                        ComposeUiNode.Companion.getClass();
                                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                                        if (applier == null) {
                                            Updater.invalidApplier();
                                            throw null;
                                        }
                                        gapComposer7.startReusableNode();
                                        if (gapComposer7.inserting) {
                                            gapComposer7.createNode(layoutNode$Companion$Constructor$14);
                                        } else {
                                            gapComposer7.useNode();
                                        }
                                        Updater.m576setimpl(gapComposer7, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                                        Updater.m576setimpl(gapComposer7, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                        Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                                        Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                        Updater.m576setimpl(gapComposer7, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                                        int ordinal = ((NearbyPayRequestViewModel.Ready) nearbyPayRequestViewModel4).selectedTab.ordinal();
                                        boolean changed9 = gapComposer7.changed(function1);
                                        Object rememberedValue28 = gapComposer7.rememberedValue();
                                        if (changed9 || rememberedValue28 == obj3) {
                                            rememberedValue28 = new ProfileKt$$ExternalSyntheticLambda3(1, function1);
                                            gapComposer7.updateRememberedValue(rememberedValue28);
                                        }
                                        Function1 function14 = (Function1) rememberedValue28;
                                        Object rememberedValue29 = gapComposer7.rememberedValue();
                                        if (rememberedValue29 == obj3) {
                                            rememberedValue29 = new PoolDetailsViewKt$$ExternalSyntheticLambda3(7);
                                            gapComposer7.updateRememberedValue(rememberedValue29);
                                        }
                                        ModalKt.SegmentedControl(ordinal, function14, null, (Function1) rememberedValue29, gapComposer7, 3072, 4);
                                        gapComposer7 = gapComposer7;
                                        z4 = true;
                                        DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer7, null);
                                        gapComposer7.end(true);
                                        gapComposer7.end(false);
                                    }
                                    gapComposer7.end(z4);
                                }
                            }
                            set = EmptySet.INSTANCE;
                            rememberedValue10 = gapComposer3.rememberedValue();
                            if (rememberedValue10 == obj3) {
                            }
                            mutableState5 = (MutableState) rememberedValue10;
                            Boolean bool2 = (Boolean) mutableState2.getValue();
                            bool2.booleanValue();
                            changedInstance3 = gapComposer3.changedInstance(nearbyPayRequestViewModel3);
                            rememberedValue11 = gapComposer3.rememberedValue();
                            if (changedInstance3) {
                            }
                            rememberedValue11 = new AndroidFileSaver$save$2(nearbyPayRequestViewModel3, mutableState2, mutableState5, continuation2, 7);
                            nearbyPayRequestViewModel = nearbyPayRequestViewModel3;
                            mutableState6 = mutableState5;
                            continuation3 = continuation2;
                            gapComposer3.updateRememberedValue(rememberedValue11);
                            Updater.LaunchedEffect(set, bool2, (Function2) rememberedValue11, gapComposer3);
                            rememberedValue12 = gapComposer3.rememberedValue();
                            if (rememberedValue12 == obj3) {
                            }
                            MutableState mutableState142 = (MutableState) rememberedValue12;
                            rememberedValue13 = gapComposer3.rememberedValue();
                            if (rememberedValue13 == obj3) {
                            }
                            mutableState7 = (MutableState) rememberedValue13;
                            Boolean valueOf42 = Boolean.valueOf(z8);
                            changed3 = gapComposer3.changed(z8);
                            rememberedValue14 = gapComposer3.rememberedValue();
                            if (changed3) {
                            }
                            RealPayDataLoader$fetchData$1 realPayDataLoader$fetchData$12 = new RealPayDataLoader$fetchData$1(z8, mutableState2, mutableState13, mutableState142, mutableState7, (Continuation) null);
                            mutableState8 = mutableState2;
                            mutableState9 = mutableState13;
                            mutableState10 = mutableState7;
                            gapComposer3.updateRememberedValue(realPayDataLoader$fetchData$12);
                            rememberedValue14 = realPayDataLoader$fetchData$12;
                            Updater.LaunchedEffect(gapComposer3, valueOf42, (Function2) rememberedValue14);
                            booleanValue2 = ((Boolean) mutableState142.getValue()).booleanValue();
                            float f22 = RecyclerView.DECELERATION_RATE;
                            if (booleanValue2) {
                            }
                            State animateFloatAsState4 = AnimateAsStateKt.animateFloatAsState(f22, AnimatableKt.spring$default(0.5f, 200.0f, continuation3, 4), "radialAvatarScale", null, gapComposer3, 3120, 20);
                            float mo236toPx0680j_42 = ((Density) gapComposer3.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(56.0f);
                            rememberedValue15 = gapComposer3.rememberedValue();
                            if (rememberedValue15 == obj3) {
                            }
                            mutableState11 = (MutableState) rememberedValue15;
                            if (z7) {
                            }
                            if (ready5 != 0) {
                            }
                            if (ready5 != 0) {
                            }
                            List list32 = list2;
                            Integer valueOf52 = Integer.valueOf(i);
                            changed4 = gapComposer3.changed(i);
                            float f32 = mo236toPx0680j_42;
                            rememberedValue16 = gapComposer3.rememberedValue();
                            if (changed4) {
                            }
                            set2 = set;
                            rememberedValue16 = new ScoreSummaryKt$ScoreSummary$1$3$1(i, mutableState11, mutableState10, (Continuation) null);
                            gapComposer3.updateRememberedValue(rememberedValue16);
                            Updater.LaunchedEffect(gapComposer3, valueOf52, (Function2) rememberedValue16);
                            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(new LayoutWeightElement(1.0f, true), 1.0f);
                            ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                            DefaultSizes.spacing.getClass();
                            Modifier clipToBounds2 = ClipKt.clipToBounds(SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, 16.0f, RecyclerView.DECELERATION_RATE, 2));
                            MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                            int hashCode32 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope32 = gapComposer3.currentCompositionLocalScope();
                            Modifier materializeModifier32 = PlatformKt.materializeModifier(gapComposer3, clipToBounds2);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$132 = ComposeUiNode.Companion.Constructor;
                            if (applier == null) {
                            }
                        }
                    }
                    z = false;
                    rememberedValue = gapComposer3.rememberedValue();
                    if (rememberedValue == obj3) {
                    }
                    mutableState = (MutableState) rememberedValue;
                    Boolean valueOf7 = Boolean.valueOf(z);
                    changed = gapComposer3.changed(z);
                    rememberedValue2 = gapComposer3.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue2 = new CashMapViewKt$CashMapView$3$1(z, mutableState, null, 10);
                    gapComposer3.updateRememberedValue(rememberedValue2);
                    Updater.LaunchedEffect(gapComposer3, valueOf7, (Function2) rememberedValue2);
                    if (z7) {
                    }
                    boolean z92 = nearbyPayRequestViewModel3 instanceof NearbyPayRequestViewModel.NotReady;
                    if (z92) {
                    }
                    if (z92) {
                    }
                    if (z92) {
                    }
                    rememberedValue3 = gapComposer3.rememberedValue();
                    if (rememberedValue3 == obj3) {
                    }
                    MutableState mutableState122 = (MutableState) rememberedValue3;
                    if (z2) {
                    }
                    rememberedValue4 = gapComposer3.rememberedValue();
                    if (rememberedValue4 == obj3) {
                    }
                    mutableState2 = (MutableState) rememberedValue4;
                    if (!z2) {
                    }
                    if (!z10) {
                    }
                    if (!z7) {
                    }
                    if (ready3 == null) {
                    }
                    if (z7) {
                    }
                    RealCashVibrator realCashVibrator2 = (RealCashVibrator) gapComposer3.consume(LocalCashVibratorKt.LocalCashVibrator);
                    rememberedValue5 = gapComposer3.rememberedValue();
                    if (rememberedValue5 == obj3) {
                    }
                    mutableState3 = (MutableState) rememberedValue5;
                    changedInstance = gapComposer3.changedInstance(versioned) | gapComposer3.changed(z3) | gapComposer3.changedInstance(realCashVibrator2);
                    DotGridPhase dotGridPhase32 = dotGridPhase;
                    rememberedValue6 = gapComposer3.rememberedValue();
                    if (changedInstance) {
                    }
                    rememberedValue6 = new ArcadeFormDateInputView$Content$7$1(4, versioned, realCashVibrator2, mutableState2, mutableState3, null, z3);
                    mutableState4 = mutableState3;
                    gapComposer3.updateRememberedValue(rememberedValue6);
                    Updater.LaunchedEffect(gapComposer3, versioned, (Function2) rememberedValue6);
                    Boolean valueOf22 = Boolean.valueOf(z3);
                    changed2 = gapComposer3.changed(z3);
                    DotGridPhase dotGridPhase42 = dotGridPhase2;
                    rememberedValue7 = gapComposer3.rememberedValue();
                    if (changed2) {
                    }
                    applier = applier2;
                    continuation = null;
                    rememberedValue7 = new CashMapViewKt$CashMapView$3$1(z3, mutableState4, null, 11);
                    gapComposer3.updateRememberedValue(rememberedValue7);
                    Updater.LaunchedEffect(gapComposer3, valueOf22, (Function2) rememberedValue7);
                    booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
                    Boolean valueOf32 = Boolean.valueOf(booleanValue);
                    changedInstance2 = gapComposer3.changedInstance(realCashVibrator2);
                    rememberedValue8 = gapComposer3.rememberedValue();
                    if (changedInstance2) {
                    }
                    continuation2 = continuation;
                    rememberedValue8 = new AndroidFileSaver$save$2(realCashVibrator2, mutableState2, mutableState4, continuation2, 6);
                    gapComposer3.updateRememberedValue(rememberedValue8);
                    Updater.LaunchedEffect(gapComposer3, valueOf32, (Function2) rememberedValue8);
                    rememberedValue9 = gapComposer3.rememberedValue();
                    if (rememberedValue9 == obj3) {
                    }
                    MutableState mutableState132 = (MutableState) rememberedValue9;
                    if (z7) {
                    }
                    set = EmptySet.INSTANCE;
                    rememberedValue10 = gapComposer3.rememberedValue();
                    if (rememberedValue10 == obj3) {
                    }
                    mutableState5 = (MutableState) rememberedValue10;
                    Boolean bool22 = (Boolean) mutableState2.getValue();
                    bool22.booleanValue();
                    changedInstance3 = gapComposer3.changedInstance(nearbyPayRequestViewModel3);
                    rememberedValue11 = gapComposer3.rememberedValue();
                    if (changedInstance3) {
                    }
                    rememberedValue11 = new AndroidFileSaver$save$2(nearbyPayRequestViewModel3, mutableState2, mutableState5, continuation2, 7);
                    nearbyPayRequestViewModel = nearbyPayRequestViewModel3;
                    mutableState6 = mutableState5;
                    continuation3 = continuation2;
                    gapComposer3.updateRememberedValue(rememberedValue11);
                    Updater.LaunchedEffect(set, bool22, (Function2) rememberedValue11, gapComposer3);
                    rememberedValue12 = gapComposer3.rememberedValue();
                    if (rememberedValue12 == obj3) {
                    }
                    MutableState mutableState1422 = (MutableState) rememberedValue12;
                    rememberedValue13 = gapComposer3.rememberedValue();
                    if (rememberedValue13 == obj3) {
                    }
                    mutableState7 = (MutableState) rememberedValue13;
                    Boolean valueOf422 = Boolean.valueOf(z8);
                    changed3 = gapComposer3.changed(z8);
                    rememberedValue14 = gapComposer3.rememberedValue();
                    if (changed3) {
                    }
                    RealPayDataLoader$fetchData$1 realPayDataLoader$fetchData$122 = new RealPayDataLoader$fetchData$1(z8, mutableState2, mutableState132, mutableState1422, mutableState7, (Continuation) null);
                    mutableState8 = mutableState2;
                    mutableState9 = mutableState132;
                    mutableState10 = mutableState7;
                    gapComposer3.updateRememberedValue(realPayDataLoader$fetchData$122);
                    rememberedValue14 = realPayDataLoader$fetchData$122;
                    Updater.LaunchedEffect(gapComposer3, valueOf422, (Function2) rememberedValue14);
                    booleanValue2 = ((Boolean) mutableState1422.getValue()).booleanValue();
                    float f222 = RecyclerView.DECELERATION_RATE;
                    if (booleanValue2) {
                    }
                    State animateFloatAsState42 = AnimateAsStateKt.animateFloatAsState(f222, AnimatableKt.spring$default(0.5f, 200.0f, continuation3, 4), "radialAvatarScale", null, gapComposer3, 3120, 20);
                    float mo236toPx0680j_422 = ((Density) gapComposer3.consume(CompositionLocalsKt.LocalDensity)).mo236toPx0680j_4(56.0f);
                    rememberedValue15 = gapComposer3.rememberedValue();
                    if (rememberedValue15 == obj3) {
                    }
                    mutableState11 = (MutableState) rememberedValue15;
                    if (z7) {
                    }
                    if (ready5 != 0) {
                    }
                    if (ready5 != 0) {
                    }
                    List list322 = list2;
                    Integer valueOf522 = Integer.valueOf(i);
                    changed4 = gapComposer3.changed(i);
                    float f322 = mo236toPx0680j_422;
                    rememberedValue16 = gapComposer3.rememberedValue();
                    if (changed4) {
                    }
                    set2 = set;
                    rememberedValue16 = new ScoreSummaryKt$ScoreSummary$1$3$1(i, mutableState11, mutableState10, (Continuation) null);
                    gapComposer3.updateRememberedValue(rememberedValue16);
                    Updater.LaunchedEffect(gapComposer3, valueOf522, (Function2) rememberedValue16);
                    Modifier fillMaxWidth22 = SizeKt.fillMaxWidth(new LayoutWeightElement(1.0f, true), 1.0f);
                    ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier clipToBounds22 = ClipKt.clipToBounds(SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth22, 16.0f, RecyclerView.DECELERATION_RATE, 2));
                    MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode322 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope322 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier322 = PlatformKt.materializeModifier(gapComposer3, clipToBounds22);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1322 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                    }
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ NearbyPayRequestViewKt$$ExternalSyntheticLambda1(NearbyPayRequestViewModel nearbyPayRequestViewModel, Function1 function1, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = nearbyPayRequestViewModel;
        this.f$1 = function1;
    }
}
