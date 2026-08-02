package com.squareup.cash.checks;

import android.icu.text.MessageFormat;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.material.ProgressIndicatorKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.InlineClassHelperKt;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagy;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.cell.RealCellActivityAvatarScope;
import com.squareup.cash.arcade.components.list.ListUnorderedScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.borrow.viewmodels.BorrowLimitHubViewModel;
import com.squareup.cash.borrow.viewmodels.FirstTimeBorrowViewModel;
import com.squareup.cash.buynowpaylater.viewmodels.ActionButton;
import com.squareup.cash.buynowpaylater.viewmodels.SUPOrderTransaction;
import com.squareup.cash.buynowpaylater.viewmodels.SUPOrderTransactions;
import com.squareup.cash.card.onboarding.CardStylePickerViewModel;
import com.squareup.cash.card.onboarding.CardStyleSectionViewModel;
import com.squareup.cash.card.onboarding.CollapsibleDetailsSection;
import com.squareup.cash.card.onboarding.IconGridSection;
import com.squareup.cash.card.onboarding.ProductDetailsPageViewModel;
import com.squareup.cash.card.onboarding.StampSheetViewModel;
import com.squareup.cash.card.onboarding.TagOrderConfirmationViewModel;
import com.squareup.cash.card.onboarding.pdp.HeroSectionKt;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightDetailViewModel;
import com.squareup.cash.cashapplite.viewmodels.ActivityAppletTileViewModel;
import com.squareup.cash.cashapplite.viewmodels.KycAppletTileModel;
import com.squareup.cash.cashapplite.views.KycAppletTileKt;
import com.squareup.cash.cashapppay.settings.viewmodels.LinkedBusinessDetailsViewModel;
import com.squareup.cash.cashapppay.settings.viewmodels.RemoveLinkedBusinessViewModel;
import com.squareup.cash.cashapppay.settings.viewmodels.UnlinkResultViewModel;
import com.squareup.cash.charting.components.AxisPlacement;
import com.squareup.cash.charting.components.SegmentedBarChartKt;
import com.squareup.cash.charting.viewmodels.SegmentedBarChartViewModel;
import com.squareup.cash.common.composeui.InfoUpsellCtaButtonScope;
import com.squareup.cash.common.composeui.SegmentedCircleConfig;
import com.squareup.cash.common.composeui.SegmentedCircleKt$$ExternalSyntheticLambda1;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.crypto.common.viewmodels.BitcoinP2pConversionPercentageViewModel;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypography;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypographyKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.sync_values.BorrowAppletPaymentTimelineTile;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.ProgressBarKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.math.MathKt__MathJVMKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class CheckDepositAmountKt$$ExternalSyntheticLambda8 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CheckDepositAmountKt$$ExternalSyntheticLambda8(SUPOrderTransactions sUPOrderTransactions) {
        this.$r8$classId = 6;
        this.f$0 = sUPOrderTransactions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String format2;
        int i;
        int i2;
        int i3;
        Pair pair;
        int i4 = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj4 = this.f$0;
        switch (i4) {
            case 0:
                CheckDepositAmountViewModel checkDepositAmountViewModel = (CheckDepositAmountViewModel) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, checkDepositAmountViewModel.primaryButtonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                FirstTimeBorrowViewModel.Content content = (FirstTimeBorrowViewModel.Content) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, content.borrowButton.label, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                FirstTimeBorrowViewModel.Content.SecondaryButton secondaryButton = (FirstTimeBorrowViewModel.Content.SecondaryButton) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, secondaryButton.label, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                BorrowLimitHubViewModel.Section.LimitInfoBulletsSection limitInfoBulletsSection = (BorrowLimitHubViewModel.Section.LimitInfoBulletsSection) obj4;
                ListUnorderedScope listUnorderedScope = (ListUnorderedScope) obj;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                listUnorderedScope.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer4).changed(listUnorderedScope) ? 4 : 2;
                }
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                    for (final BorrowLimitHubViewModel.InfoBullet infoBullet : limitInfoBulletsSection.infoBullets) {
                        final int i5 = false ? 1 : 0;
                        final int i6 = 1;
                        listUnorderedScope.ListUnorderedItem(Expect_jvmKt.rememberComposableLambda(1120109322, new Function2() { // from class: com.squareup.cash.borrow.views.LimitHubLimitInfoListSectionKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                int i7 = i5;
                                BorrowLimitHubViewModel.InfoBullet infoBullet2 = infoBullet;
                                switch (i7) {
                                    case 0:
                                        Composer composer5 = (Composer) obj5;
                                        int intValue5 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer5 = (GapComposer) composer5;
                                        if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, infoBullet2.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer5.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer6 = (Composer) obj5;
                                        int intValue6 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                        if (gapComposer6.shouldExecute(1 & intValue6, (intValue6 & 3) != 2)) {
                                            zzd zzdVar = Icons.Companion;
                                            String str = infoBullet2.icon.arcade_id;
                                            str.getClass();
                                            zzdVar.getClass();
                                            Icons icons = zzd.get(str);
                                            if (icons == null) {
                                                gapComposer6.startReplaceGroup(-529377053);
                                                gapComposer6.end(false);
                                            } else {
                                                gapComposer6.startReplaceGroup(-529377052);
                                                Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer6, 48, 12);
                                                gapComposer6.end(false);
                                            }
                                        } else {
                                            gapComposer6.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer4), (Modifier) null, Expect_jvmKt.rememberComposableLambda(-1665757496, new Function2() { // from class: com.squareup.cash.borrow.views.LimitHubLimitInfoListSectionKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                int i7 = i6;
                                BorrowLimitHubViewModel.InfoBullet infoBullet2 = infoBullet;
                                switch (i7) {
                                    case 0:
                                        Composer composer5 = (Composer) obj5;
                                        int intValue5 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer5 = (GapComposer) composer5;
                                        if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, infoBullet2.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer5.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer6 = (Composer) obj5;
                                        int intValue6 = ((Integer) obj6).intValue();
                                        GapComposer gapComposer6 = (GapComposer) composer6;
                                        if (gapComposer6.shouldExecute(1 & intValue6, (intValue6 & 3) != 2)) {
                                            zzd zzdVar = Icons.Companion;
                                            String str = infoBullet2.icon.arcade_id;
                                            str.getClass();
                                            zzdVar.getClass();
                                            Icons icons = zzd.get(str);
                                            if (icons == null) {
                                                gapComposer6.startReplaceGroup(-529377053);
                                                gapComposer6.end(false);
                                            } else {
                                                gapComposer6.startReplaceGroup(-529377052);
                                                Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer6, 48, 12);
                                                gapComposer6.end(false);
                                            }
                                        } else {
                                            gapComposer6.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer4), (Function2) null, (Function2) null, gapComposer4, ((intValue4 << 15) & 458752) | 390, 26);
                    }
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                BorrowHomeOverlayViewModel.SheetButton sheetButton = (BorrowHomeOverlayViewModel.SheetButton) obj4;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, sheetButton.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                BorrowAppletPaymentTimelineTile.Data.Button button = (BorrowAppletPaymentTimelineTile.Data.Button) obj4;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    LocalizedString localizedString = button.text;
                    localizedString.getClass();
                    String str = localizedString.translated_value;
                    str.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                SUPOrderTransactions sUPOrderTransactions = (SUPOrderTransactions) obj4;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer7, 0);
                    int hashCode = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer7, m298padding3ABfNKs);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer7.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer7, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    String str2 = sUPOrderTransactions.title;
                    if (str2 == null) {
                        str2 = re$$ExternalSyntheticOutline0.m(gapComposer7, -417279686, R.string.single_use_payment_transaction_header, gapComposer7, false);
                    } else {
                        gapComposer7.startReplaceGroup(-417280802);
                        gapComposer7.end(false);
                    }
                    String str3 = str2;
                    MooncakeTypography mooncakeTypography = (MooncakeTypography) gapComposer7.consume(MooncakeTypographyKt.LocalTypography);
                    if (mooncakeTypography == null) {
                        mooncakeTypography = ((Boolean) gapComposer7.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                    }
                    KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer7, (Modifier) null, mooncakeTypography.smallTitle, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                    gapComposer7.startReplaceGroup(-417274218);
                    for (SUPOrderTransaction sUPOrderTransaction : sUPOrderTransactions.transactions) {
                        SpacerKt.Spacer(gapComposer7, SizeKt.m277height3ABfNKs(companion, 16.0f));
                        zzagy.SingleUsePaymentTransaction(null, sUPOrderTransaction, gapComposer7, 0);
                    }
                    gapComposer7.end(false);
                    gapComposer7.end(true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                ActionButton actionButton = (ActionButton) obj4;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    String str4 = actionButton.text.text;
                    if (str4 == null) {
                        str4 = "";
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                CardStylePickerViewModel cardStylePickerViewModel = (CardStylePickerViewModel) obj4;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer9, null);
                    Countries.PageHeader(cardStylePickerViewModel.title_text, (Modifier) null, (Function2) null, (String) null, gapComposer9, 0, 14);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer9, null);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                CardStyleSectionViewModel cardStyleSectionViewModel = (CardStyleSectionViewModel) obj4;
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    String str5 = cardStyleSectionViewModel.header;
                    str5.getClass();
                    ViewfinderDefaults.SectionHeader(str5, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer10, 0, 30);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                StampSheetViewModel stampSheetViewModel = (StampSheetViewModel) obj4;
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    if (stampSheetViewModel.selectedStamps.isEmpty()) {
                        format2 = re$$ExternalSyntheticOutline0.m(gapComposer11, 741368441, R.string.stamp_add_disabled, gapComposer11, false);
                    } else {
                        gapComposer11.startReplaceGroup(741451986);
                        format2 = new MessageFormat(Room.stringResource(gapComposer11, R.string.stamp_add)).format(NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(stampSheetViewModel.selectedStamps.size()), "count"));
                        format2.getClass();
                        gapComposer11.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, format2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                TagOrderConfirmationViewModel tagOrderConfirmationViewModel = (TagOrderConfirmationViewModel) obj4;
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, tagOrderConfirmationViewModel.buttonTitle, (Map) null, (Function1) null, false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                CollapsibleDetailsSection.CollapsibleDetail collapsibleDetail = (CollapsibleDetailsSection.CollapsibleDetail) obj4;
                Composer composer13 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer13, 0);
                GapComposer gapComposer13 = (GapComposer) composer13;
                int hashCode2 = Long.hashCode(gapComposer13.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer13.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(composer13, companion);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer14 = (GapComposer) composer13;
                if (gapComposer14.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer14.startReusableNode();
                if (gapComposer14.inserting) {
                    gapComposer14.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer14.useNode();
                }
                Updater.m576setimpl(composer13, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer13, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer13, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer13, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer13, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer14.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                ((DefaultSizes) gapComposer14.consume(staticProvidableCompositionLocal)).getClass();
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(m300paddingVpY3zN4$default, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 32.0f, 7);
                String str6 = collapsibleDetail.content;
                TextStyle textStyle = ((Typography) gapComposer14.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                Colors colors = (Colors) gapComposer14.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
                } else {
                    gapComposer14.startReplaceGroup(-1762997739);
                    gapComposer14.end(false);
                }
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors.semantic.text.prominent, composer13, m302paddingqDBjuR0$default, textStyle, (TextLineBalancing) null, str6, (Map) null, (Function1) null, false);
                gapComposer14.end(true);
                return Unit.INSTANCE;
            case 13:
                IconGridSection iconGridSection = (IconGridSection) obj4;
                FlowRowScope flowRowScope = (FlowRowScope) obj;
                Composer composer14 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                flowRowScope.getClass();
                if ((intValue13 & 6) == 0) {
                    intValue13 |= ((GapComposer) composer14).changed(flowRowScope) ? 4 : 2;
                }
                GapComposer gapComposer15 = (GapComposer) composer14;
                if (gapComposer15.shouldExecute(intValue13 & 1, (intValue13 & 19) != 18)) {
                    Iterator it = iconGridSection.iconCells.iterator();
                    while (it.hasNext()) {
                        HeroSectionKt.IconCell((IconGridSection.IconCell) it.next(), flowRowScope.weight(1.0f, companion, true), gapComposer15, 0);
                    }
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                ProductDetailsPageViewModel productDetailsPageViewModel = (ProductDetailsPageViewModel) obj4;
                Composer composer15 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer15;
                if (gapComposer16.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, productDetailsPageViewModel.ctaLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                SpendingInsightDetailViewModel.Content.Button button2 = (SpendingInsightDetailViewModel.Content.Button) obj4;
                Composer composer16 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer16;
                if (gapComposer17.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button2.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                ActivityAppletTileViewModel activityAppletTileViewModel = (ActivityAppletTileViewModel) obj4;
                Composer composer17 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer17;
                if (gapComposer18.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    SpacerKt.Spacer(gapComposer18, SizeKt.m277height3ABfNKs(companion, 24.0f));
                    UiCallbackModel activityModel = activityAppletTileViewModel.getActivityModel();
                    if (activityModel == null) {
                        gapComposer18.startReplaceGroup(-1955521909);
                    } else {
                        gapComposer18.startReplaceGroup(-1955521908);
                        AvatarsKt.ActivityEmbeddedView(activityModel, null, null, null, null, gapComposer18, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                    }
                    gapComposer18.end(false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                KycAppletTileModel kycAppletTileModel = (KycAppletTileModel) obj4;
                Composer composer18 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer18;
                if (gapComposer19.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    KycAppletTileKt.TitleRow(gapComposer19, 0);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer19.consume(staticProvidableCompositionLocal2)).getClass();
                    Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, companion, 16.0f, gapComposer19);
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    kycAppletTileModel.getClass();
                    ((DefaultSizes) gapComposer19.consume(staticProvidableCompositionLocal2)).getClass();
                    ProgressBarKt.m3992ProgressBarjt2gSs(fillMaxWidth2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 4.0f, gapComposer19, 6, 2);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                RemoveLinkedBusinessViewModel removeLinkedBusinessViewModel = (RemoveLinkedBusinessViewModel) obj4;
                Composer composer19 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer19;
                if (gapComposer20.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    int ordinal = removeLinkedBusinessViewModel.actionType.ordinal();
                    int i7 = R.string.unlink_confirmation_button_linked_account;
                    if (ordinal != 4 && ordinal != 5) {
                        i7 = R.string.remove_confirmation_button;
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer20, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer20, i7), (Map) null, (Function1) null, false);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                LinkedBusinessDetailsViewModel linkedBusinessDetailsViewModel = (LinkedBusinessDetailsViewModel) obj4;
                Composer composer20 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer20;
                if (gapComposer21.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    int ordinal2 = linkedBusinessDetailsViewModel.actionType.ordinal();
                    if (ordinal2 == 4) {
                        i = 1088190466;
                        i2 = R.string.unlink_account_button_title;
                    } else if (ordinal2 != 5) {
                        i = 1088196227;
                        i2 = R.string.remove_business_button_title;
                    } else {
                        i = 1088193366;
                        i2 = R.string.remove_business_button_title_sq_btc_conversions;
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer21, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, re$$ExternalSyntheticOutline0.m(gapComposer21, i, i2, gapComposer21, false), (Map) null, (Function1) null, false);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                UnlinkResultViewModel unlinkResultViewModel = (UnlinkResultViewModel) obj4;
                Composer composer21 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer22 = (GapComposer) composer21;
                if (gapComposer22.shouldExecute(intValue20 & 1, (intValue20 & 17) != 16)) {
                    String ctaText = unlinkResultViewModel.getCtaText();
                    TextStyle textStyle2 = ((Typography) gapComposer22.consume(ArcadeThemeKt.LocalTypography)).button;
                    Colors colors2 = (Colors) gapComposer22.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer22, -1762997026, gapComposer22, false);
                    } else {
                        gapComposer22.startReplaceGroup(-1762997739);
                        gapComposer22.end(false);
                    }
                    KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4082, colors2.component.button.prominent.text.f162default, (Composer) gapComposer22, (Modifier) null, textStyle2, (TextLineBalancing) null, ctaText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                MeasureScope measureScope = (MeasureScope) obj;
                Measurable measurable = (Measurable) obj2;
                measureScope.getClass();
                measurable.getClass();
                Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(((Constraints) obj3).value);
                int i8 = (int) ((AxisPlacement) obj4).yOffset;
                int i9 = mo833measureBRTryo0.height;
                return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, i9, new ProgressIndicatorKt$$ExternalSyntheticLambda4(mo833measureBRTryo0, i8 - (i9 / 2), 7));
            case 22:
                SegmentedBarChartViewModel.Legend legend = (SegmentedBarChartViewModel.Legend) obj4;
                Composer composer22 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((FlowRowScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer22;
                if (gapComposer23.shouldExecute(intValue21 & 1, (intValue21 & 17) != 16)) {
                    Iterator it2 = legend.labels.iterator();
                    while (it2.hasNext()) {
                        SegmentedBarChartKt.LegendItem((SegmentedBarChartViewModel.Legend.Label) it2.next(), gapComposer23, 0);
                    }
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                ConfirmBackOfCheckViewModel confirmBackOfCheckViewModel = (ConfirmBackOfCheckViewModel) obj4;
                Composer composer23 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer24 = (GapComposer) composer23;
                if (gapComposer24.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer24, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, confirmBackOfCheckViewModel.callToAction, (Map) null, (Function1) null, false);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                ConfirmFrontOfCheckViewModel confirmFrontOfCheckViewModel = (ConfirmFrontOfCheckViewModel) obj4;
                Composer composer24 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer25 = (GapComposer) composer24;
                if (gapComposer25.shouldExecute(intValue23 & 1, (intValue23 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer25, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, confirmFrontOfCheckViewModel.callToAction, (Map) null, (Function1) null, false);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                VerifyCheckDialogViewModel verifyCheckDialogViewModel = (VerifyCheckDialogViewModel) obj4;
                Composer composer25 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                int i10 = VerifyCheckDialogView.$r8$clinit;
                ((RowScope) obj).getClass();
                GapComposer gapComposer26 = (GapComposer) composer25;
                if (gapComposer26.shouldExecute(intValue24 & 1, (intValue24 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer26, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, verifyCheckDialogViewModel.positiveLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                InfoUpsellCtaButtonScope infoUpsellCtaButtonScope = (InfoUpsellCtaButtonScope) obj4;
                Composer composer26 = (Composer) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer27 = (GapComposer) composer26;
                if (gapComposer27.shouldExecute(intValue25 & 1, (intValue25 & 17) != 16)) {
                    Function2 function2 = (Function2) infoUpsellCtaButtonScope.prominentButton.getValue();
                    if (function2 == null) {
                        gapComposer27.startReplaceGroup(-1761415253);
                    } else {
                        gapComposer27.startReplaceGroup(913011478);
                        function2.invoke(gapComposer27, 0);
                    }
                    gapComposer27.end(false);
                } else {
                    gapComposer27.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                SegmentedCircleConfig segmentedCircleConfig = (SegmentedCircleConfig) obj4;
                MeasureScope measureScope2 = (MeasureScope) obj;
                Measurable measurable2 = (Measurable) obj2;
                measureScope2.getClass();
                measurable2.getClass();
                Placeable mo833measureBRTryo02 = measurable2.mo833measureBRTryo0(((Constraints) obj3).value);
                int i11 = mo833measureBRTryo02.width;
                if (i11 == 0) {
                    pair = new Pair(0, 0);
                } else {
                    float f = i11;
                    float strokeWidth = VisibleKt.strokeWidth(segmentedCircleConfig.strokeThickness, f);
                    int roundToInt = MathKt__MathJVMKt.roundToInt((Math.cos(2.356194490192345d) * (r5 - (1.33f * strokeWidth))) + (f / 2.0f));
                    int ordinal3 = segmentedCircleConfig.contentHorizontalLayoutPolicy.ordinal();
                    if (ordinal3 == 0) {
                        i3 = roundToInt;
                    } else if (ordinal3 == 1) {
                        i3 = MathKt__MathJVMKt.roundToInt(strokeWidth);
                    } else {
                        if (ordinal3 != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        i3 = 0;
                    }
                    int ordinal4 = segmentedCircleConfig.contentVerticalLayoutPolicy.ordinal();
                    if (ordinal4 != 0) {
                        if (ordinal4 == 1) {
                            roundToInt = MathKt__MathJVMKt.roundToInt(strokeWidth);
                        } else {
                            if (ordinal4 != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            roundToInt = 0;
                        }
                    }
                    pair = new Pair(Integer.valueOf(i3), Integer.valueOf(roundToInt));
                }
                int intValue26 = ((Number) pair.first).intValue();
                int intValue27 = ((Number) pair.second).intValue();
                int i12 = mo833measureBRTryo02.width;
                int min = i12 - Math.min(intValue26 * 2, i12);
                int i13 = mo833measureBRTryo02.height;
                int min2 = i13 - Math.min(intValue27 * 2, i13);
                if (((min >= 0 ? (char) 1 : (char) 0) & (min2 >= 0 ? (char) 1 : (char) 0)) == 0) {
                    InlineClassHelperKt.throwIllegalArgumentException("width and height must be >= 0");
                }
                Placeable mo833measureBRTryo03 = measurable2.mo833measureBRTryo0(ConstraintsKt.createConstraints(min, min, min2, min2));
                return MeasureScope.layout$default(measureScope2, mo833measureBRTryo03.width, mo833measureBRTryo03.height, new SegmentedCircleKt$$ExternalSyntheticLambda1(mo833measureBRTryo03, intValue26, intValue27));
            case 28:
                RealCellActivityAvatarScope realCellActivityAvatarScope = (RealCellActivityAvatarScope) obj4;
                Composer composer27 = (Composer) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer28 = (GapComposer) composer27;
                if (gapComposer28.shouldExecute(intValue28 & 1, (intValue28 & 17) != 16)) {
                    Colors colors3 = (Colors) gapComposer28.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer28, -1762997026, gapComposer28, false);
                    } else {
                        gapComposer28.startReplaceGroup(-1762997739);
                        gapComposer28.end(false);
                    }
                    realCellActivityAvatarScope.m3395AvatarOadGlvw("", colors3.semantic.background.subtle, null, null, gapComposer28, 6, 60);
                } else {
                    gapComposer28.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                BitcoinP2pConversionPercentageViewModel.Content.AlertModel alertModel = (BitcoinP2pConversionPercentageViewModel.Content.AlertModel) obj4;
                Composer composer28 = (Composer) obj2;
                int intValue29 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer29 = (GapComposer) composer28;
                if (gapComposer29.shouldExecute(intValue29 & 1, (intValue29 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer29, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, alertModel.acknowledgeText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer29.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CheckDepositAmountKt$$ExternalSyntheticLambda8(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
