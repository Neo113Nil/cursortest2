package com.squareup.cash.maps.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.benefits.components.viewmodels.BenefitsComparisonTableViewModel;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel;
import com.squareup.cash.bitcoin.views.exchange.BitcoinExchangeSubtitleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.investing.components.exchange.InvestingExchangeSubtitleKt;
import com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewModel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class ClusterItemKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ ClusterItemKt$$ExternalSyntheticLambda2(int i, int i2, ComposableLambdaImpl composableLambdaImpl) {
        this.$r8$classId = 4;
        this.f$1 = i;
        this.f$0 = composableLambdaImpl;
        this.f$2 = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v17 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        float f;
        float f2;
        boolean z2;
        Applier applier;
        int i;
        int i2;
        ?? r10;
        GapComposer gapComposer;
        TextStyle textStyle;
        int i3 = this.$r8$classId;
        int i4 = this.f$2;
        Object obj3 = this.f$0;
        int i5 = this.f$1;
        switch (i3) {
            case 0:
                ((Integer) obj2).getClass();
                ClusterItemKt.ClusterItem((String) obj3, i5, i4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                BenefitsComparisonTableViewModel.BenefitsComparisonTableRow benefitsComparisonTableRow = (BenefitsComparisonTableViewModel.BenefitsComparisonTableRow) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                int i6 = 0;
                int i7 = 2;
                GapComposer gapComposer2 = (GapComposer) composer;
                boolean shouldExecute = gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2);
                Applier applier2 = gapComposer2.applier;
                if (shouldExecute) {
                    List list = benefitsComparisonTableRow.cells;
                    boolean z3 = benefitsComparisonTableRow.hasHorizontalDivider;
                    Iterator it = list.iterator();
                    int i8 = 0;
                    GapComposer gapComposer3 = gapComposer2;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        BenefitsComparisonTableViewModel.BenefitsComparisonTableCell benefitsComparisonTableCell = (BenefitsComparisonTableViewModel.BenefitsComparisonTableCell) next;
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(z3 ? SpacerKt.Bottom : SpacerKt.Top, (i5 != i7 || i8 == 0) ? Alignment.Companion.Start : Alignment.Companion.End, gapComposer3, i6);
                        int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, companion);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        if (applier2 == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer3.useNode();
                        }
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                        Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                        Integer valueOf = Integer.valueOf(hashCode);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                        Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                        Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
                        if (i4 == 0) {
                            gapComposer3.startReplaceGroup(-670821824);
                            z = false;
                            gapComposer3.end(false);
                            f = RecyclerView.DECELERATION_RATE;
                        } else {
                            gapComposer3.startReplaceGroup(-670820732);
                            ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                            DefaultSizes.spacing.getClass();
                            z = false;
                            gapComposer3.end(false);
                            f = 16.0f;
                        }
                        Iterator it2 = it;
                        if (i8 == 0) {
                            gapComposer3.startReplaceGroup(-670818816);
                            gapComposer3.end(z);
                            f2 = RecyclerView.DECELERATION_RATE;
                        } else {
                            gapComposer3.startReplaceGroup(-670817724);
                            ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                            DefaultSizes.spacing.getClass();
                            gapComposer3.end(z);
                            f2 = 16.0f;
                        }
                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, f2, f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12);
                        if (benefitsComparisonTableCell instanceof BenefitsComparisonTableViewModel.BenefitsComparisonTableCell.TextCell) {
                            gapComposer3.startReplaceGroup(679610325);
                            String str = ((BenefitsComparisonTableViewModel.BenefitsComparisonTableCell.TextCell) benefitsComparisonTableCell).text;
                            if (i8 == i5 - 1) {
                                gapComposer3.startReplaceGroup(679826829);
                                textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).labelSmall;
                                gapComposer3.end(false);
                            } else {
                                gapComposer3.startReplaceGroup(679919054);
                                textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                gapComposer3.end(false);
                            }
                            GapComposer gapComposer4 = gapComposer3;
                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer4, m302paddingqDBjuR0$default, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                            GapComposer gapComposer5 = gapComposer4;
                            r10 = 0;
                            gapComposer5.end(false);
                            z2 = z3;
                            applier = applier2;
                            i2 = 1;
                            i = 2;
                            gapComposer = gapComposer5;
                        } else {
                            if (!(benefitsComparisonTableCell instanceof BenefitsComparisonTableViewModel.BenefitsComparisonTableCell.IconCell)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -670814914, false);
                            }
                            gapComposer3.startReplaceGroup(-670797820);
                            gapComposer3.startReplaceGroup(-670786518);
                            z2 = z3;
                            applier = applier2;
                            float mo231toDpGaN1DYA = ((Density) gapComposer3.consume(CompositionLocalsKt.LocalDensity)).mo231toDpGaN1DYA(((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).labelSmall.paragraphStyle.lineHeight);
                            gapComposer3.end(false);
                            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(m302paddingqDBjuR0$default, mo231toDpGaN1DYA, RecyclerView.DECELERATION_RATE, 2);
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.BottomCenter, false);
                            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m279heightInVpY3zN4$default);
                            gapComposer3.startReusableNode();
                            if (gapComposer3.inserting) {
                                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                            } else {
                                gapComposer3.useNode();
                            }
                            Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                            zzd zzdVar = Icons.Companion;
                            BenefitsComparisonTableViewModel.BenefitsComparisonTableCell.IconCell iconCell = (BenefitsComparisonTableViewModel.BenefitsComparisonTableCell.IconCell) benefitsComparisonTableCell;
                            String str2 = iconCell.icon.arcade_id;
                            str2.getClass();
                            zzdVar.getClass();
                            Icons icons = zzd.get(str2);
                            icons.getClass();
                            i = 2;
                            Trace.m1191Iconww6aTOc(icons, iconCell.contentDescription, (Modifier) null, 0L, gapComposer3, 0, 12);
                            i2 = 1;
                            gapComposer3.end(true);
                            r10 = 0;
                            gapComposer3.end(false);
                            gapComposer = gapComposer3;
                        }
                        if (z2) {
                            gapComposer.startReplaceGroup(680983284);
                            DBUtil.SpacerWithinSectionMedium(r10, i2, gapComposer, null);
                            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 1.0f);
                            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, (boolean) r10);
                            } else {
                                gapComposer.startReplaceGroup(-1762997739);
                                gapComposer.end(r10);
                            }
                            BoxKt.Box(ImageKt.m177backgroundbw27NRU(m277height3ABfNKs, colors.semantic.border.standard, ColorKt.RectangleShape), gapComposer, r10);
                            gapComposer.end(r10);
                        } else {
                            gapComposer.startReplaceGroup(681275428);
                            gapComposer.end(r10);
                        }
                        gapComposer.end(true);
                        i7 = i;
                        i6 = r10;
                        applier2 = applier;
                        z3 = z2;
                        i8 = i9;
                        it = it2;
                        gapComposer3 = gapComposer;
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                BitcoinExchangeSubtitleKt.m3418BitcoinExchangeSubtitle5stqomU((BitcoinTransferViewModel.Content.Subtitle) obj3, i5, (Composer) obj, Updater.updateChangedFlags(1), i4);
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                InvestingExchangeSubtitleKt.m3583InvestingExchangeSubtitle5stqomU((InvestingExchangeViewModel.Content.Subtitle) obj3, i5, (Composer) obj, Updater.updateChangedFlags(1), i4);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ClusterItemKt.ClusterItem(i5, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i4));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ClusterItemKt$$ExternalSyntheticLambda2(BenefitsComparisonTableViewModel.BenefitsComparisonTableRow benefitsComparisonTableRow, int i, int i2) {
        this.$r8$classId = 1;
        this.f$0 = benefitsComparisonTableRow;
        this.f$1 = i;
        this.f$2 = i2;
    }

    public /* synthetic */ ClusterItemKt$$ExternalSyntheticLambda2(Object obj, int i, int i2, int i3, int i4) {
        this.$r8$classId = i4;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = i3;
    }

    public /* synthetic */ ClusterItemKt$$ExternalSyntheticLambda2(String str, int i, int i2, int i3) {
        this.$r8$classId = 0;
        this.f$0 = str;
        this.f$1 = i;
        this.f$2 = i2;
    }
}
