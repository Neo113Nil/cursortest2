package com.squareup.cash.retro.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DatePickerDefaults$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.bindings.timeline.TimelineProtoBindingKt;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.list.ListUnorderedKt;
import com.squareup.cash.arcade.components.list.ListUnorderedProminence;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.components.list.ListUnorderedState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda8;
import com.squareup.cash.retro.viewmodels.PaymentPlanSummaryViewModel;
import com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda11;
import com.squareup.cash.savings.views.CelebrationKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda4;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda7;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.scrubbing.DateScrubber$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public abstract class PaymentPlanSummaryKt {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d7, code lost:
    
        if (r12 == androidx.compose.runtime.Composer.Companion.Empty) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LabeledLinksSection(int i, Composer composer, Modifier modifier, ArrayList arrayList, Function1 function1) {
        Modifier modifier2;
        Modifier wrapContentHeight;
        Object obj;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1882366102);
        int i2 = 2;
        int i3 = 32;
        int i4 = i | (gapComposer.changedInstance(arrayList) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        final int i5 = 0;
        final int i6 = 1;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, wrapContentHeight);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(1141823754);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                final PaymentPlanSummaryViewModel.LabeledLink labeledLink = (PaymentPlanSummaryViewModel.LabeledLink) it.next();
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-336670384, new Function2() { // from class: com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i7 = i5;
                        PaymentPlanSummaryViewModel.LabeledLink labeledLink2 = labeledLink;
                        switch (i7) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 16.0f);
                                    Object rememberedValue = gapComposer2.rememberedValue();
                                    if (rememberedValue == Composer.Companion.Empty) {
                                        rememberedValue = new CelebrationKt$$ExternalSyntheticLambda1(1);
                                        gapComposer2.updateRememberedValue(rememberedValue);
                                    }
                                    Trace.m1190Iconww6aTOc(AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(0, 30, gapComposer2, ThemablesKt.urlForTheme(labeledLink2.icon, gapComposer2)), (String) null, SemanticsModifierKt.clearAndSetSemantics(m285size3ABfNKs, (Function1) rememberedValue), 0L, gapComposer2, 48, 8);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, labeledLink2.label, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1337726255, new Function2() { // from class: com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int i7 = i6;
                        PaymentPlanSummaryViewModel.LabeledLink labeledLink2 = labeledLink;
                        switch (i7) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 16.0f);
                                    Object rememberedValue = gapComposer2.rememberedValue();
                                    if (rememberedValue == Composer.Companion.Empty) {
                                        rememberedValue = new CelebrationKt$$ExternalSyntheticLambda1(1);
                                        gapComposer2.updateRememberedValue(rememberedValue);
                                    }
                                    Trace.m1190Iconww6aTOc(AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(0, 30, gapComposer2, ThemablesKt.urlForTheme(labeledLink2.icon, gapComposer2)), (String) null, SemanticsModifierKt.clearAndSetSemantics(m285size3ABfNKs, (Function1) rememberedValue), 0L, gapComposer2, 48, 8);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, labeledLink2.label, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer);
                int i7 = ((i4 & 112) == i3 ? i6 : i5) | (gapComposer.changedInstance(labeledLink) ? 1 : 0);
                Object rememberedValue = gapComposer.rememberedValue();
                if (i7 == 0) {
                    obj = rememberedValue;
                }
                Object paymentPlanSummaryKt$$ExternalSyntheticLambda32 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda32(function1, labeledLink, i5);
                gapComposer.updateRememberedValue(paymentPlanSummaryKt$$ExternalSyntheticLambda32);
                obj = paymentPlanSummaryKt$$ExternalSyntheticLambda32;
                Function0 function02 = (Function0) obj;
                String str = labeledLink.accessoryText;
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, function02, false, true, null, null, str != null ? new CellDefaultAccessory.Label(str, i2) : CellDefaultAccessory.Push.INSTANCE, 0L, gapComposer, 1572918, 3508);
                i5 = i5;
                i4 = i4;
                i2 = i2;
                i3 = i3;
                companion = companion;
                i6 = 1;
            }
            gapComposer.end(i5);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaymentPlanSummaryKt$$ExternalSyntheticLambda33(arrayList, function1, modifier2, i, 0);
        }
    }

    public static final void PaddedHorizontalDivider(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(931469149);
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            ModalKt.HorizontalDivider(0, 0, gapComposer, SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 32.0f));
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda4(modifier, i, 11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
    public static final void PaymentPlanSummary(PaymentPlanSummaryViewModel paymentPlanSummaryViewModel, Function1 function1, Modifier modifier, ScrollState scrollState, Composer composer, int i) {
        Function1 function12;
        Modifier modifier2;
        ScrollState scrollState2;
        GapComposer gapComposer;
        ScrollState rememberScrollState;
        int i2;
        Modifier modifier3;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        Object obj;
        ?? r2;
        ComposableLambdaImpl rememberComposableLambda;
        int i3;
        NeverEqualPolicy neverEqualPolicy;
        Object obj2;
        ScrollState scrollState3;
        GapComposer gapComposer2;
        PaymentPlanSummaryViewModel paymentPlanSummaryViewModel2 = paymentPlanSummaryViewModel;
        paymentPlanSummaryViewModel2.getClass();
        ArrayList arrayList = paymentPlanSummaryViewModel2.labeledLinks;
        function1.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-1697529383);
        Applier applier = gapComposer3.applier;
        int i4 = i | (gapComposer3.changedInstance(paymentPlanSummaryViewModel2) ? 4 : 2) | (gapComposer3.changedInstance(function1) ? 32 : 16) | 1408;
        if (gapComposer3.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            gapComposer3.startDefaults();
            int i5 = i & 1;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (i5 == 0 || gapComposer3.getDefaultsInvalid()) {
                rememberScrollState = ImageKt.rememberScrollState(gapComposer3);
                i2 = i4 & (-7169);
                modifier3 = companion;
            } else {
                gapComposer3.skipToGroupEnd();
                rememberScrollState = scrollState;
                i2 = i4 & (-7169);
                modifier3 = modifier;
            }
            gapComposer3.endDefaults();
            int i6 = i2 & 112;
            boolean z = i6 == 32;
            Object rememberedValue = gapComposer3.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            Object obj3 = rememberedValue;
            if (z || rememberedValue == neverEqualPolicy2) {
                PaymentPlanSummaryKt$$ExternalSyntheticLambda0 paymentPlanSummaryKt$$ExternalSyntheticLambda0 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(0, function1);
                gapComposer3.updateRememberedValue(paymentPlanSummaryKt$$ExternalSyntheticLambda0);
                obj3 = paymentPlanSummaryKt$$ExternalSyntheticLambda0;
            }
            DBUtil.BackHandler(false, (Function0) obj3, gapComposer3, 0, 1);
            Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
            } else {
                gapComposer3.startReplaceGroup(-1762997739);
                gapComposer3.end(false);
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(modifier3, colors.semantic.background.f1047app, ColorKt.RectangleShape), 1.0f);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.Start, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            ScrollState scrollState4 = rememberScrollState;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$14);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$15);
            Modifier modifier4 = modifier3;
            NavigationType navigationType = NavigationType.CLOSE;
            boolean z2 = i6 == 32;
            Object rememberedValue2 = gapComposer3.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy2) {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                PaymentPlanSummaryKt$$ExternalSyntheticLambda0 paymentPlanSummaryKt$$ExternalSyntheticLambda02 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(5, function1);
                gapComposer3.updateRememberedValue(paymentPlanSummaryKt$$ExternalSyntheticLambda02);
                obj = paymentPlanSummaryKt$$ExternalSyntheticLambda02;
            } else {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                obj = rememberedValue2;
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$1;
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) obj, (Modifier) null, (Function3) null, gapComposer3, 54, 108);
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SpacerKt.navigationBarsPadding(ImageKt.verticalScroll$default(SizeKt.fillMaxWidth(new LayoutWeightElement(1.0f, false), 1.0f), scrollState4, false, 14)), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, 7);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.CenterHorizontally, gapComposer3, 48);
            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m302paddingqDBjuR0$default);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$12);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$14, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$16);
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth2, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            paymentPlanSummaryViewModel2 = paymentPlanSummaryViewModel;
            StackedAvatarViewModel.Single single = paymentPlanSummaryViewModel2.avatar;
            if (single == null) {
                gapComposer3.startReplaceGroup(1153637797);
                r2 = 0;
                gapComposer3.end(false);
                rememberComposableLambda = null;
            } else {
                r2 = 0;
                gapComposer3.startReplaceGroup(1153637798);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1555469512, new CalloutKt$$ExternalSyntheticLambda0(8, paymentPlanSummaryViewModel2, single), gapComposer3);
                gapComposer3.end(false);
            }
            Countries.PageHeader(paymentPlanSummaryViewModel2.title, m302paddingqDBjuR0$default2, rememberComposableLambda, paymentPlanSummaryViewModel2.subtitle, gapComposer3, 0, 0);
            DBUtil.SpacerBetweenSectionLarge(r2, 1, gapComposer3, null);
            ProgressSection(paymentPlanSummaryViewModel2.progressSection, null, gapComposer3, r2);
            PaddedHorizontalDivider(null, gapComposer3, r2);
            PaymentPlanSummaryViewModel.TimelineSection timelineSection = paymentPlanSummaryViewModel2.refundsTimelineSection;
            if (timelineSection == null) {
                gapComposer3.startReplaceGroup(1154166657);
                gapComposer3.end(r2);
                function12 = function1;
                i3 = i6;
                neverEqualPolicy = neverEqualPolicy2;
            } else {
                gapComposer3.startReplaceGroup(1154166658);
                i3 = i6;
                boolean z3 = i3 == 32;
                Object rememberedValue3 = gapComposer3.rememberedValue();
                if (z3) {
                    neverEqualPolicy = neverEqualPolicy2;
                } else {
                    neverEqualPolicy = neverEqualPolicy2;
                    if (rememberedValue3 != neverEqualPolicy) {
                        function12 = function1;
                        obj2 = rememberedValue3;
                        TimelineSection(timelineSection, (Function1) obj2, null, gapComposer3, 0);
                        gapComposer3.end(false);
                    }
                }
                function12 = function1;
                InfoSectionKt$$ExternalSyntheticLambda1 infoSectionKt$$ExternalSyntheticLambda1 = new InfoSectionKt$$ExternalSyntheticLambda1(17, function12);
                gapComposer3.updateRememberedValue(infoSectionKt$$ExternalSyntheticLambda1);
                obj2 = infoSectionKt$$ExternalSyntheticLambda1;
                TimelineSection(timelineSection, (Function1) obj2, null, gapComposer3, 0);
                gapComposer3.end(false);
            }
            PaymentPlanSummaryViewModel.TimelineSection timelineSection2 = paymentPlanSummaryViewModel2.paymentsTimelineSection;
            boolean z4 = i3 == 32;
            Object rememberedValue4 = gapComposer3.rememberedValue();
            Object obj4 = rememberedValue4;
            if (z4 || rememberedValue4 == neverEqualPolicy) {
                InfoSectionKt$$ExternalSyntheticLambda1 infoSectionKt$$ExternalSyntheticLambda12 = new InfoSectionKt$$ExternalSyntheticLambda1(18, function12);
                gapComposer3.updateRememberedValue(infoSectionKt$$ExternalSyntheticLambda12);
                obj4 = infoSectionKt$$ExternalSyntheticLambda12;
            }
            Modifier modifier5 = null;
            boolean z5 = false;
            TimelineSection(timelineSection2, (Function1) obj4, null, gapComposer3, 0);
            PaymentPlanSummaryViewModel.SummarySection summarySection = paymentPlanSummaryViewModel2.summarySection;
            if (summarySection == null) {
                gapComposer3.startReplaceGroup(1154407868);
                gapComposer3.end(false);
            } else {
                gapComposer3.startReplaceGroup(1154407869);
                PaddedHorizontalDivider(null, gapComposer3, 0);
                boolean z6 = i3 == 32;
                Object rememberedValue5 = gapComposer3.rememberedValue();
                Object obj5 = rememberedValue5;
                if (z6 || rememberedValue5 == neverEqualPolicy) {
                    PaymentPlanSummaryKt$$ExternalSyntheticLambda0 paymentPlanSummaryKt$$ExternalSyntheticLambda03 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(6, function12);
                    gapComposer3.updateRememberedValue(paymentPlanSummaryKt$$ExternalSyntheticLambda03);
                    obj5 = paymentPlanSummaryKt$$ExternalSyntheticLambda03;
                }
                modifier5 = null;
                z5 = false;
                SummarySection(summarySection, (Function0) obj5, null, gapComposer3, 0);
                gapComposer3.end(false);
            }
            PaymentPlanSummaryViewModel.PurchasesSection purchasesSection = paymentPlanSummaryViewModel2.purchasesSection;
            if (purchasesSection == null) {
                gapComposer3.startReplaceGroup(1154598425);
                gapComposer3.end(z5);
            } else {
                gapComposer3.startReplaceGroup(1154598426);
                PaddedHorizontalDivider(modifier5, gapComposer3, z5 ? 1 : 0);
                boolean z7 = i3 == 32;
                Object rememberedValue6 = gapComposer3.rememberedValue();
                Object obj6 = rememberedValue6;
                if (z7 || rememberedValue6 == neverEqualPolicy) {
                    InfoSectionKt$$ExternalSyntheticLambda1 infoSectionKt$$ExternalSyntheticLambda13 = new InfoSectionKt$$ExternalSyntheticLambda1(19, function12);
                    gapComposer3.updateRememberedValue(infoSectionKt$$ExternalSyntheticLambda13);
                    obj6 = infoSectionKt$$ExternalSyntheticLambda13;
                }
                modifier5 = null;
                z5 = false;
                PurchasesSection(purchasesSection, (Function1) obj6, null, gapComposer3, 0);
                gapComposer3.end(false);
            }
            if (arrayList.isEmpty()) {
                gapComposer3.startReplaceGroup(1154937597);
                gapComposer3.end(z5);
            } else {
                gapComposer3.startReplaceGroup(1154804018);
                PaddedHorizontalDivider(modifier5, gapComposer3, z5 ? 1 : 0);
                boolean z8 = i3 == 32;
                Object rememberedValue7 = gapComposer3.rememberedValue();
                Object obj7 = rememberedValue7;
                if (z8 || rememberedValue7 == neverEqualPolicy) {
                    InfoSectionKt$$ExternalSyntheticLambda1 infoSectionKt$$ExternalSyntheticLambda14 = new InfoSectionKt$$ExternalSyntheticLambda1(20, function12);
                    gapComposer3.updateRememberedValue(infoSectionKt$$ExternalSyntheticLambda14);
                    obj7 = infoSectionKt$$ExternalSyntheticLambda14;
                }
                z5 = false;
                LabeledLinksSection(0, gapComposer3, null, arrayList, (Function1) obj7);
                gapComposer3.end(false);
            }
            gapComposer3.end(true);
            gapComposer3.end(true);
            PaymentPlanSummaryViewModel.BottomSheetData bottomSheetData = paymentPlanSummaryViewModel2.bottomSheetData;
            if (bottomSheetData == null) {
                gapComposer3.startReplaceGroup(2144338026);
                gapComposer3.end(z5);
                scrollState3 = scrollState4;
                gapComposer2 = gapComposer3;
            } else {
                gapComposer3.startReplaceGroup(2144338027);
                boolean z9 = i3 == 32;
                Object rememberedValue8 = gapComposer3.rememberedValue();
                Object obj8 = rememberedValue8;
                if (z9 || rememberedValue8 == neverEqualPolicy) {
                    PaymentPlanSummaryKt$$ExternalSyntheticLambda0 paymentPlanSummaryKt$$ExternalSyntheticLambda04 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(7, function12);
                    gapComposer3.updateRememberedValue(paymentPlanSummaryKt$$ExternalSyntheticLambda04);
                    obj8 = paymentPlanSummaryKt$$ExternalSyntheticLambda04;
                }
                scrollState3 = scrollState4;
                SheetKt.Sheet((Function0) obj8, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(283095291, new ButtonGroupKt$$ExternalSyntheticLambda11(bottomSheetData, 9), gapComposer3), gapComposer3, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                GapComposer gapComposer4 = gapComposer3;
                gapComposer4.end(false);
                gapComposer2 = gapComposer4;
            }
            scrollState2 = scrollState3;
            modifier2 = modifier4;
            gapComposer = gapComposer2;
        } else {
            function12 = function1;
            gapComposer3.skipToGroupEnd();
            modifier2 = modifier;
            scrollState2 = scrollState;
            gapComposer = gapComposer3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaymentPlanSummaryKt$$ExternalSyntheticLambda1(paymentPlanSummaryViewModel2, function12, modifier2, scrollState2, i, 0);
        }
    }

    public static final void PaymentPlanSummaryBottomSheetContent(PaymentPlanSummaryViewModel.BottomSheetData bottomSheetData, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        bottomSheetData.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1452431672);
        int i4 = (gapComposer.changedInstance(bottomSheetData) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (gapComposer.changed(modifier2) ? 32 : 16);
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            modifier3 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(modifier3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 32.0f, 7);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopCenter, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            String str = bottomSheetData.title;
            if (str == null) {
                gapComposer.startReplaceGroup(-1743601026);
            } else {
                gapComposer.startReplaceGroup(-1743601025);
                Transformations.SheetHeader(str, (Modifier) null, (Function2) null, bottomSheetData.description, gapComposer, 0, 6);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OpenSourceKt$$ExternalSyntheticLambda1(bottomSheetData, modifier3, i, i2);
        }
    }

    public static final void ProgressBar(float f, int i, Composer composer, Modifier modifier) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1952567852);
        int i2 = (gapComposer.changed(f) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            modifier2 = Modifier.Companion.$$INSTANCE;
            Modifier clip = ClipKt.clip(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(modifier2, 1.0f), 16.0f), RoundedCornerShapeKt.RoundedCornerShape(50));
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, colors.semantic.background.subtle, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Modifier fillMaxHeight = SizeKt.fillMaxHeight(SizeKt.fillMaxWidth(modifier2, f > RecyclerView.DECELERATION_RATE ? RangesKt___RangesKt.coerceIn(f, 0.05f, 1.0f) : f), 1.0f);
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(fillMaxHeight, colors2.semantic.background.brand, RoundedCornerShapeKt.RoundedCornerShape(50)), gapComposer, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaymentPlanSummaryKt$$ExternalSyntheticLambda37(f, modifier2, i, 0);
        }
    }

    public static final void ProgressSection(PaymentPlanSummaryViewModel.ProgressSection progressSection, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Modifier wrapContentHeight;
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1771981954);
        Applier applier = gapComposer.applier;
        int i3 = (gapComposer.changedInstance(progressSection) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            modifier2 = Modifier.Companion.$$INSTANCE;
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(modifier2, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new OpenSourceKt$$ExternalSyntheticLambda8(28);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(wrapContentHeight, true, (Function1) rememberedValue);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(semantics, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Bottom, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, modifier2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            m3733TextStackyrwZFoE(progressSection.startLabel, progressSection.startText, horizontal, rowScopeInstance.weight(1.0f, modifier2, true), 0L, gapComposer, MLKEMEngine.KyberPolyBytes, 16);
            Modifier weight = rowScopeInstance.weight(1.0f, modifier2, true);
            String str = progressSection.endLabel;
            String str2 = progressSection.endText;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                i2 = 0;
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                i2 = 0;
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            m3733TextStackyrwZFoE(str, str2, Alignment.Companion.End, weight, colors.semantic.text.subtle, gapComposer, MLKEMEngine.KyberPolyBytes, 0);
            gapComposer.end(true);
            DBUtil.SpacerWithinSectionMedium(i2, 1, gapComposer, null);
            ProgressBar(progressSection.progressPercent, i2, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda0(progressSection, modifier2, i, 7);
        }
    }

    public static final void PurchasesSection(PaymentPlanSummaryViewModel.PurchasesSection purchasesSection, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Modifier wrapContentHeight;
        Modifier.Companion companion;
        ComposableLambdaImpl rememberComposableLambda;
        ComposableLambdaImpl rememberComposableLambda2;
        CellDefaultAccessory.Label label;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(753106897);
        int i2 = 16;
        char c = ' ';
        int i3 = i | (gapComposer.changedInstance(purchasesSection) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        int i4 = 1;
        boolean z = false;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(companion2, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, wrapContentHeight);
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
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ViewfinderDefaults.SectionHeader(purchasesSection.title, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
            gapComposer = gapComposer;
            gapComposer.startReplaceGroup(373599440);
            for (PaymentPlanSummaryViewModel.PurchasesSection.DetailRow detailRow : purchasesSection.detailRows) {
                StackedAvatarViewModel.Single single = detailRow.avatar;
                if (single == null) {
                    gapComposer.startReplaceGroup(275158813);
                    gapComposer.end(z);
                    rememberComposableLambda = null;
                } else {
                    gapComposer.startReplaceGroup(275158814);
                    rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(279496169, new CalloutKt$$ExternalSyntheticLambda0(6, single, detailRow), gapComposer);
                    gapComposer.end(z);
                }
                ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(1099504422, new PdfPreviewViewKt$$ExternalSyntheticLambda2(detailRow, 27), gapComposer);
                String str = detailRow.subtitle;
                if (str == null) {
                    gapComposer.startReplaceGroup(275542066);
                    gapComposer.end(z);
                    rememberComposableLambda2 = null;
                } else {
                    gapComposer.startReplaceGroup(275542067);
                    rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(319947147, new InfoSectionKt$$ExternalSyntheticLambda7(str, 15), gapComposer);
                    gapComposer.end(z);
                }
                String str2 = detailRow.detail;
                if (str2 == null) {
                    gapComposer.startReplaceGroup(275630323);
                    gapComposer.end(z);
                    label = null;
                } else {
                    gapComposer.startReplaceGroup(275630324);
                    label = new CellDefaultAccessory.Label(Expect_jvmKt.rememberComposableLambda(502367946, new InfoSectionKt$$ExternalSyntheticLambda7(str2, i2), gapComposer), i4);
                    gapComposer.end(z);
                }
                GapComposer gapComposer2 = gapComposer;
                CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, rememberComposableLambda3, null, null, null, false, false, rememberComposableLambda2, null, label, 0L, null, gapComposer2, 48, 0, 3452);
                z = z;
                gapComposer = gapComposer2;
                i2 = i2;
                c = ' ';
                i4 = 1;
            }
            boolean z2 = z;
            gapComposer.end(z2);
            PaymentPlanSummaryViewModel.PurchasesSection.ActionButton actionButton = purchasesSection.button;
            if (actionButton == null) {
                gapComposer.startReplaceGroup(-1302641463);
                gapComposer.end(z2);
                companion = companion2;
            } else {
                gapComposer.startReplaceGroup(-1302641462);
                companion = companion2;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                boolean changedInstance = ((i3 & 112) == 32 ? true : z2 ? 1 : 0) | gapComposer.changedInstance(actionButton);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new PaymentPlanSummaryKt$$ExternalSyntheticLambda25(function1, actionButton, z2 ? 1 : 0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                coil3.size.SizeKt.Button((Function0) rememberedValue, m300paddingVpY3zN4$default, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-1898752977, new ButtonGroupKt$$ExternalSyntheticLambda11(actionButton, 12), gapComposer), gapComposer, 1573248, 56);
                gapComposer.end(z2);
            }
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RetroUiFactory$$ExternalSyntheticLambda3(modifier2, (Object) purchasesSection, function1, i, 15);
        }
    }

    public static final void SourceInfoSection(StackedAvatarViewModel.Single single, String str, Function0 function0, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Modifier modifier2;
        Modifier.Companion companion;
        ComposableLambdaImpl rememberComposableLambda;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1638478799);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer2.changed(single) : gapComposer2.changedInstance(single) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            if (function0 != null) {
                companion = companion2;
                fillMaxWidth = fillMaxWidth.then(ImageKt.m183clickableoSLSa3U$default(companion2, false, null, null, function0, 15));
            } else {
                companion = companion2;
            }
            Modifier modifier3 = fillMaxWidth;
            if (single == null) {
                gapComposer2.startReplaceGroup(381713896);
                gapComposer2.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer2.startReplaceGroup(381713897);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(467827630, new PaymentPlanSummaryKt$$ExternalSyntheticLambda42(single, 0, (byte) 0), gapComposer2);
                gapComposer2.end(false);
            }
            CellDefaultAccessory.Label label = new CellDefaultAccessory.Label(PaymentPlanSummaryViewKt.f646lambda$554124701, 1);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-598212434, new InfoSectionKt$$ExternalSyntheticLambda7(str, 17), gapComposer2);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new DateScrubber$$ExternalSyntheticLambda0(21);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, modifier3, null, null, false, true, null, null, label, 0L, (Function0) rememberedValue, gapComposer, 1572912, 48, 1464);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4(single, i, str, function0, modifier2, 10);
        }
    }

    public static final void SummarySection(PaymentPlanSummaryViewModel.SummarySection summarySection, Function0 function0, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        Modifier wrapContentHeight;
        ComposableLambdaImpl rememberComposableLambda;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1496354226);
        int i2 = i | (gapComposer2.changedInstance(summarySection) ? 4 : 2) | (gapComposer2.changedInstance(function0) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(companion, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, wrapContentHeight);
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
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String str = summarySection.title;
            if (str == null) {
                gapComposer2.startReplaceGroup(-516696407);
                gapComposer2.end(false);
                gapComposer = gapComposer2;
            } else {
                gapComposer2.startReplaceGroup(-516696406);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1892237087, new InfoSectionKt$$ExternalSyntheticLambda7(str, 13), gapComposer2);
                String str2 = summarySection.summaryMarkdownText;
                if (str2 == null) {
                    gapComposer2.startReplaceGroup(-1184089101);
                    gapComposer2.end(false);
                    rememberComposableLambda = null;
                } else {
                    gapComposer2.startReplaceGroup(-1184089100);
                    rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-764905592, new InfoSectionKt$$ExternalSyntheticLambda7(str2, 14), gapComposer2);
                    gapComposer2.end(false);
                }
                gapComposer = gapComposer2;
                ViewfinderDefaults.SectionHeader(rememberComposableLambda2, (Modifier) null, (Function2) null, (Function0) null, rememberComposableLambda, gapComposer, 6, 14);
                gapComposer.end(false);
            }
            if (summarySection.detailItems.isEmpty()) {
                gapComposer.startReplaceGroup(-515898714);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-516396512);
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                GapComposer gapComposer3 = gapComposer;
                ListUnorderedKt.ListUnordered((Modifier) null, (ListUnorderedState) null, (ListUnorderedProminence) null, (ListUnorderedSize) null, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(-876056409, new ButtonGroupKt$$ExternalSyntheticLambda11(summarySection, 11), gapComposer), gapComposer3, 196608, 31);
                gapComposer = gapComposer3;
                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                gapComposer.end(false);
            }
            StackedAvatarViewModel.Single single = summarySection.sourceIcon;
            String str3 = summarySection.sourceText;
            if (single == null && str3 == null) {
                gapComposer.startReplaceGroup(-515675514);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-515768731);
                GapComposer gapComposer4 = gapComposer;
                SourceInfoSection(single, str3, function0, null, gapComposer4, ((i2 << 3) & 896) | 8);
                gapComposer = gapComposer4;
                gapComposer.end(false);
            }
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaymentPlanSummaryKt$$ExternalSyntheticLambda19(summarySection, function0, modifier2, i, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if ((r33 & 16) != 0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0052  */
    /* renamed from: TextStack-yrwZFoE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3733TextStackyrwZFoE(String str, String str2, BiasAlignment.Horizontal horizontal, Modifier modifier, long j, Composer composer, int i, int i2) {
        long j2;
        int i3;
        int i4;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1689450448);
        int i5 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16) | (gapComposer.changed(modifier) ? 2048 : 1024);
        if ((i2 & 16) == 0) {
            j2 = j;
            if (gapComposer.changed(j2)) {
                i3 = 16384;
                i4 = i5 | i3;
                if (gapComposer.shouldExecute(i4 & 1, (i4 & 9363) == 9362)) {
                    gapComposer.skipToGroupEnd();
                } else {
                    gapComposer.startDefaults();
                    if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                        if ((i2 & 16) != 0) {
                            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(false);
                            }
                            j2 = colors.semantic.text.prominent;
                            i4 &= -57345;
                        }
                        long j3 = j2;
                        gapComposer.endDefaults();
                        int i6 = 5;
                        if (!horizontal.equals(Alignment.Companion.Start)) {
                            if (horizontal.equals(Alignment.Companion.CenterHorizontally)) {
                                i6 = 3;
                            } else if (horizontal.equals(Alignment.Companion.End)) {
                                i6 = 6;
                            }
                        }
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer, 48);
                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
                        Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                        TextStyle textStyle = ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodyMedium;
                        Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        int i7 = i6;
                        Room.m1165Text25TpFw(0, 0, 0, i7, i4 & 14, 0, 3826, colors2.semantic.text.subtle, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                        Room.m1165Text25TpFw(0, 0, 0, i7, (i4 >> 3) & 7182, 0, 3826, j3, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).numeralSmall, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                        gapComposer.end(true);
                        j2 = j3;
                    } else {
                        gapComposer.skipToGroupEnd();
                    }
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.block = new DatePickerDefaults$$ExternalSyntheticLambda1(str, str2, horizontal, modifier, j2, i, i2);
                    return;
                }
                return;
            }
        } else {
            j2 = j;
        }
        i3 = PKIFailureInfo.certRevoked;
        i4 = i5 | i3;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void TimelineSection(PaymentPlanSummaryViewModel.TimelineSection timelineSection, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        Modifier wrapContentHeight;
        GapComposer gapComposer2;
        float f;
        ButtonProminence buttonProminence;
        Modifier.Companion companion;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-454796935);
        int i2 = i | (gapComposer3.changedInstance(timelineSection) ? 4 : 2) | (gapComposer3.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer3.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(companion2, 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, wrapContentHeight);
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
            String str = timelineSection.title;
            if (str == null) {
                gapComposer3.startReplaceGroup(461112762);
                gapComposer3.end(false);
                f = 1.0f;
                gapComposer2 = gapComposer3;
            } else {
                gapComposer3.startReplaceGroup(461112763);
                gapComposer2 = gapComposer3;
                f = 1.0f;
                ViewfinderDefaults.SectionHeader(str, (Modifier) null, (String) null, (Function0) null, timelineSection.subtitle, gapComposer2, 0, 14);
                gapComposer2.end(false);
            }
            Timeline timeline = timelineSection.timeline;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new OpenSourceKt$$ExternalSyntheticLambda8(27);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            GapComposer gapComposer4 = gapComposer2;
            TimelineProtoBindingKt.Timeline(timeline, (Function1) rememberedValue, null, null, gapComposer4, 48, 12);
            gapComposer = gapComposer4;
            PaymentPlanSummaryViewModel.SubmitButton submitButton = timelineSection.button;
            if (submitButton == null) {
                gapComposer.startReplaceGroup(461266739);
                gapComposer.end(false);
                companion = companion2;
            } else {
                gapComposer.startReplaceGroup(461266740);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, f);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(fillMaxWidth, 16.0f, 8.0f);
                int ordinal = submitButton.style.ordinal();
                if (ordinal == 0) {
                    buttonProminence = ButtonProminence.STANDARD;
                } else if (ordinal == 1) {
                    buttonProminence = ButtonProminence.PROMINENT;
                } else {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    buttonProminence = ButtonProminence.SUBTLE;
                }
                ButtonProminence buttonProminence2 = buttonProminence;
                boolean changedInstance = ((i2 & 112) == 32) | gapComposer.changedInstance(submitButton);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new PaymentPlanSummaryKt$$ExternalSyntheticLambda13(function1, submitButton, 0);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                companion = companion2;
                coil3.size.SizeKt.Button((Function0) rememberedValue2, m299paddingVpY3zN4, buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(1352920350, new ButtonGroupKt$$ExternalSyntheticLambda11(submitButton, 10), gapComposer), gapComposer, 1572864, 56);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer3;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RetroUiFactory$$ExternalSyntheticLambda3(modifier2, (Object) timelineSection, function1, i, 14);
        }
    }
}
