package com.squareup.cash.formview.components;

import android.view.View;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.EmbeddedHeaderScope;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Fonts;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.cell.RealCellActivityAvatarScope;
import com.squareup.cash.arcade.components.list.ListUnorderedScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.family.familyhub.views.FamilyMemberRowKt$$ExternalSyntheticLambda5;
import com.squareup.cash.formview.components.FormViewCtaButtons;
import com.squareup.cash.formview.components.arcade.ArcadeFormTextInputGroupView;
import com.squareup.cash.formview.viewmodels.ButtonIcon;
import com.squareup.cash.formview.viewmodels.ButtonIcon$DrawableResource$GooglePay;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel$Item$Accessory$ButtonAccessory;
import com.squareup.cash.globalsearch.views.QuickAccessBarKt;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsActivityViewModel;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import com.squareup.cash.history.viewmodels.PaymentReceiptDialogViewModel;
import com.squareup.cash.history.views.PaymentReceiptDialogView;
import com.squareup.cash.incentives.finishsetup.applets.viewmodels.FinishSetupAppletTileViewModel;
import com.squareup.cash.initialscreenloader.viewmodels.AppUpgradeViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionBlockerViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionViewModel;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel;
import com.squareup.cash.instruments.viewmodels.TransferOptionPickerViewModel;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda11;
import com.squareup.cash.investing.components.custom.order.CustomOrderKt;
import com.squareup.cash.investing.components.custom.order.CustomOrderTooltipViewKt$WhenMappings;
import com.squareup.cash.investing.components.market.hours.InvestingPlaceholderGraphView;
import com.squareup.cash.investing.components.news.NewsArticleAdapter$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.viewmodels.InvestingDetailRowContentModel;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel;
import com.squareup.cash.investing.viewmodels.PerformanceViewModel;
import com.squareup.cash.investing.viewmodels.StockMetric;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryFilterViewModel;
import com.squareup.cash.investing.viewmodels.custom.order.CustomOrderTooltipViewModel$CurrentPrice;
import com.squareup.cash.investing.viewmodels.custom.order.CustomOrderTooltipViewModel$Informational;
import com.squareup.cash.investing.viewmodels.custom.order.CustomOrderTooltipViewModel$PercentChange;
import com.squareup.cash.investing.viewmodels.custom.order.InvestingCustomOrderContentModel;
import com.squareup.cash.investing.viewmodels.dependent.DependentWelcomeViewModel;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentLearnMoreSheetViewModel;
import com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewModel;
import com.squareup.cash.investing.viewmodels.families.DependentActivityViewModel;
import com.squareup.cash.investing.viewmodels.holdings.Holding;
import com.squareup.cash.investing.viewmodels.keystats.InvestingKeyStatsDetailsViewModel;
import com.squareup.cash.investing.viewmodels.market.hours.InvestingPlaceholderGraphViewModel;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.invest.ui.Section;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.TypesJVMKt;
import kotlin.reflect.jvm.KCallablesJvm;

/* loaded from: classes6.dex */
public final /* synthetic */ class FormView$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ FormView$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    private final Object invoke$com$squareup$cash$investing$components$families$DependentInvestingActivityViewKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3) {
        DependentActivityViewModel dependentActivityViewModel = (DependentActivityViewModel) this.f$0;
        EmbeddedHeaderScope embeddedHeaderScope = (EmbeddedHeaderScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        embeddedHeaderScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(embeddedHeaderScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            String str = dependentActivityViewModel.title;
            boolean changedInstance = gapComposer.changedInstance(dependentActivityViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new RealGooglePayer$$ExternalSyntheticLambda0(dependentActivityViewModel, 20);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            embeddedHeaderScope.DefaultHeader((intValue << 9) & 7168, 2, gapComposer, str, null, (Function0) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$investing$components$holdings$InvestingEtfHoldingsComponentKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3) {
        long j;
        AvatarImage localIcon;
        Holding holding = (Holding) this.f$0;
        RealCellActivityAvatarScope realCellActivityAvatarScope = (RealCellActivityAvatarScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        realCellActivityAvatarScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(realCellActivityAvatarScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            String str = holding.name;
            Image image = holding.image;
            if (image != null) {
                gapComposer.startReplaceGroup(35142201);
                gapComposer.end(false);
                j = Color.Unspecified;
            } else {
                gapComposer.startReplaceGroup(35199489);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.icon.standard;
                gapComposer.end(false);
            }
            long j2 = j;
            if (image != null) {
                gapComposer.startReplaceGroup(35344228);
                localIcon = new AvatarImage.Remote.Image(ThemablesKt.urlForTheme(image, gapComposer), false, null, 0L, new InstrumentCellKt$$ExternalSyntheticLambda11(23), 62);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(35544860);
                gapComposer.end(false);
                localIcon = new AvatarImage.LocalIcon(Icons.Employer24, 0L, 6);
            }
            realCellActivityAvatarScope.Avatar(new AvatarEntry(str, j2, null, localIcon, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), gapComposer, (intValue << 6) & 896);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$investing$components$keystats$InvestingKeyStatsDetailsKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        float f;
        InvestingKeyStatsDetailsViewModel investingKeyStatsDetailsViewModel = (InvestingKeyStatsDetailsViewModel) this.f$0;
        ListUnorderedScope listUnorderedScope = (ListUnorderedScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        listUnorderedScope.getClass();
        final int i = 2;
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(listUnorderedScope) ? 4 : 2;
        }
        int i2 = intValue;
        final int i3 = 0;
        final int i4 = 1;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArrayList arrayList = ((InvestingKeyStatsDetailsViewModel.Content) investingKeyStatsDetailsViewModel).rows;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                final InvestingKeyStatsDetailsViewModel.Content.Row row = (InvestingKeyStatsDetailsViewModel.Content.Row) arrayList.get(i5);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new NewsArticleAdapter$$ExternalSyntheticLambda1(20);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier semantics = SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, true, (Function1) rememberedValue);
                if (i5 == 0) {
                    gapComposer.startReplaceGroup(627678427);
                    gapComposer.end(false);
                    f = RecyclerView.DECELERATION_RATE;
                } else {
                    gapComposer.startReplaceGroup(627679518);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    gapComposer.end(false);
                    f = 8.0f;
                }
                listUnorderedScope.ListUnorderedItem(Expect_jvmKt.rememberComposableLambda(1367705851, new Function2() { // from class: com.squareup.cash.investing.components.keystats.InvestingKeyStatsDetailsKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj4, Object obj5) {
                        int i6 = i3;
                        InvestingKeyStatsDetailsViewModel.Content.Row row2 = row;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, row2.key, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj4;
                                int intValue3 = ((Integer) obj5).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, row2.value, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj4;
                                int intValue4 = ((Integer) obj5).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(1 & intValue4, (intValue4 & 3) != 2)) {
                                    String str = row2.details;
                                    if (str == null) {
                                        gapComposer4.startReplaceGroup(-1244253518);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1244253517);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer4.end(false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), SpacerKt.m302paddingqDBjuR0$default(semantics, RecyclerView.DECELERATION_RATE, f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), (Function2) null, Expect_jvmKt.rememberComposableLambda(-957580802, new Function2() { // from class: com.squareup.cash.investing.components.keystats.InvestingKeyStatsDetailsKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj4, Object obj5) {
                        int i6 = i4;
                        InvestingKeyStatsDetailsViewModel.Content.Row row2 = row;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, row2.key, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj4;
                                int intValue3 = ((Integer) obj5).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, row2.value, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj4;
                                int intValue4 = ((Integer) obj5).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(1 & intValue4, (intValue4 & 3) != 2)) {
                                    String str = row2.details;
                                    if (str == null) {
                                        gapComposer4.startReplaceGroup(-1244253518);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1244253517);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer4.end(false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), Expect_jvmKt.rememberComposableLambda(-1732676353, new Function2() { // from class: com.squareup.cash.investing.components.keystats.InvestingKeyStatsDetailsKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj4, Object obj5) {
                        int i6 = i;
                        InvestingKeyStatsDetailsViewModel.Content.Row row2 = row;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, row2.key, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj4;
                                int intValue3 = ((Integer) obj5).intValue();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, row2.value, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer4 = (Composer) obj4;
                                int intValue4 = ((Integer) obj5).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(1 & intValue4, (intValue4 & 3) != 2)) {
                                    String str = row2.details;
                                    if (str == null) {
                                        gapComposer4.startReplaceGroup(-1244253518);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1244253517);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer4.end(false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, ((i2 << 15) & 458752) | 27654, 4);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier wrapContentHeight;
        float f;
        Function2 function2;
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Icons icons = null;
        int i2 = 0;
        char c = 1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                Integer num = (Integer) obj3;
                num.getClass();
                ((View) obj).getClass();
                ((FormView) obj4).fullBleedHeaderHeight = num;
                return Unit.INSTANCE;
            case 1:
                FormViewCtaButtons.ButtonProps buttonProps = (FormViewCtaButtons.ButtonProps) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                int i3 = FormViewCtaButtons.$r8$clinit;
                ((RowScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    ButtonIcon buttonIcon = (ButtonIcon) buttonProps.icon$delegate.getValue();
                    if (buttonIcon instanceof ButtonIcon.ArcadeIcon) {
                        gapComposer.startReplaceGroup(-1373947134);
                        zzd zzdVar = Icons.Companion;
                        String str = ((ButtonIcon.ArcadeIcon) buttonIcon).arcadeId;
                        zzdVar.getClass();
                        Icons icons2 = zzd.get(str);
                        if (icons2 == null) {
                            gapComposer.startReplaceGroup(-1373947135);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(-1373947134);
                            Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, 0L, gapComposer, 48, 12);
                            gapComposer.end(false);
                        }
                        gapComposer.end(false);
                    } else if (buttonIcon instanceof ButtonIcon$DrawableResource$GooglePay) {
                        gapComposer.startReplaceGroup(-1373791111);
                        ImageKt.Image(Countries.painterResource(R.drawable.gpay_icon, 0, gapComposer), null, null, null, null, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 48, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1373675202);
                        gapComposer.end(false);
                    }
                    String str2 = (String) buttonProps.text$delegate.getValue();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2 == null ? "" : str2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ArcadeFormTextInputGroupView arcadeFormTextInputGroupView = (ArcadeFormTextInputGroupView) obj4;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Trace.m1191Iconww6aTOc(Icons.LockLockedFill16, arcadeFormTextInputGroupView.securityText, (Modifier) null, 0L, gapComposer2, 6, 12);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, arcadeFormTextInputGroupView.securityText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                GlobalSearchViewModel$Item$Accessory$ButtonAccessory globalSearchViewModel$Item$Accessory$ButtonAccessory = (GlobalSearchViewModel$Item$Accessory$ButtonAccessory) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, globalSearchViewModel$Item$Accessory$ButtonAccessory.button.text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                GlobalSearchViewModel.ErrorToast errorToast = (GlobalSearchViewModel.ErrorToast) obj4;
                Composer composer4 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                wrapContentHeight = SizeKt.wrapContentHeight(companion, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                String str3 = errorToast != null ? errorToast.title : null;
                ModalKt.m3381ToastBAHpl2s(wrapContentHeight, null, str3 == null ? "" : str3, QuickAccessBarKt.f427lambda$46438653, errorToast != null ? errorToast.body : null, null, null, composer4, 3078, 482);
                return Unit.INSTANCE;
            case 5:
                GrowToolsActivityViewModel growToolsActivityViewModel = (GrowToolsActivityViewModel) obj4;
                Composer composer5 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((EmbeddedHeaderScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer5;
                if (!gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    gapComposer4.skipToGroupEnd();
                } else if (growToolsActivityViewModel.totalStats.isEmpty()) {
                    gapComposer4.startReplaceGroup(-1361621647);
                    gapComposer4.end(false);
                } else {
                    gapComposer4.startReplaceGroup(-1361716786);
                    KCallablesJvm.StatsHeader(growToolsActivityViewModel.totalStats, gapComposer4, 0);
                    DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer4, null);
                    gapComposer4.end(false);
                }
                return Unit.INSTANCE;
            case 6:
                GrowToolsManagerViewModel.Loaded.Dialog dialog = (GrowToolsManagerViewModel.Loaded.Dialog) obj4;
                Composer composer6 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer6;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialog.primaryButton, (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                PaymentReceiptDialogViewModel paymentReceiptDialogViewModel = (PaymentReceiptDialogViewModel) obj4;
                Composer composer7 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                int i4 = PaymentReceiptDialogView.$r8$clinit;
                ((RowScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer7;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, paymentReceiptDialogViewModel.dismissButtonLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                FinishSetupAppletTileViewModel.Installed installed = (FinishSetupAppletTileViewModel.Installed) obj4;
                BoxScope boxScope = (BoxScope) obj;
                Composer composer8 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                boxScope.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((GapComposer) composer8).changed(boxScope) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer8;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                    Modifier align = boxScope.align(companion, Alignment.Companion.Center);
                    String str4 = installed.progressLabel;
                    TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer7.consume(ArcadeThemeKt.LocalTypography)).labelSmall, 0L, Room.getSp(10), null, Fonts.CashSansMono, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777181);
                    Colors colors = (Colors) gapComposer7.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                    } else {
                        gapComposer7.startReplaceGroup(-1762997739);
                        gapComposer7.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors.semantic.text.standard, (Composer) gapComposer7, align, m994copyp1EtxEg$default, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                AppUpgradeViewModel appUpgradeViewModel = (AppUpgradeViewModel) obj4;
                Composer composer9 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer9;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, appUpgradeViewModel.positiveButtonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                InstrumentCellViewModel.Accessory accessory = (InstrumentCellViewModel.Accessory) obj4;
                Composer composer10 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer10;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((InstrumentCellViewModel.Accessory.Button) accessory).text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                InstrumentSelectionBlockerViewModel.Content content = (InstrumentSelectionBlockerViewModel.Content) obj4;
                Composer composer11 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer11;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, content.ctaButtonLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                InstrumentSelectionViewModel.Ready ready = (InstrumentSelectionViewModel.Ready) obj4;
                Composer composer12 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer12;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ready.nextButtonTitle, (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                SelectPaymentInstrumentViewModel.PaymentInstrument paymentInstrument = (SelectPaymentInstrumentViewModel.PaymentInstrument) obj4;
                Composer composer13 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer13;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, paymentInstrument.getName(), (Map) null, (Function1) null, false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                TransferOptionPickerViewModel transferOptionPickerViewModel = (TransferOptionPickerViewModel) obj4;
                Composer composer14 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer14;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, transferOptionPickerViewModel.cta, (Map) null, (Function1) null, false);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                InvestingDetailRowContentModel investingDetailRowContentModel = (InvestingDetailRowContentModel) obj4;
                ListUnorderedScope listUnorderedScope = (ListUnorderedScope) obj;
                Composer composer15 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                listUnorderedScope.getClass();
                if ((intValue14 & 6) == 0) {
                    intValue14 |= ((GapComposer) composer15).changed(listUnorderedScope) ? 4 : 2;
                }
                GapComposer gapComposer14 = (GapComposer) composer15;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 19) != 18)) {
                    for (Object obj5 : investingDetailRowContentModel.rows) {
                        int i5 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        InvestingDetailRowContentModel.Row row = (InvestingDetailRowContentModel.Row) obj5;
                        listUnorderedScope.ListUnorderedItem(new AnnotatedString(row.key), SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, i2 == 0 ? 0.0f : 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), (Icons) null, new AnnotatedString(row.value), (AnnotatedString) null, gapComposer14, (intValue14 << 15) & 458752, 20);
                        i2 = i5;
                    }
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                PerformanceViewModel.Section section = (PerformanceViewModel.Section) obj4;
                ListUnorderedScope listUnorderedScope2 = (ListUnorderedScope) obj;
                Composer composer16 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                listUnorderedScope2.getClass();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= ((GapComposer) composer16).changed(listUnorderedScope2) ? 4 : 2;
                }
                GapComposer gapComposer15 = (GapComposer) composer16;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 19) != 18)) {
                    List list = section.section.rows;
                    int size = list.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        final Section.Row row2 = (Section.Row) list.get(i6);
                        if (i6 == 0) {
                            gapComposer15.startReplaceGroup(-1542112920);
                            gapComposer15.end(false);
                            f = 0.0f;
                        } else {
                            gapComposer15.startReplaceGroup(-1542111829);
                            ((DefaultSizes) gapComposer15.consume(ArcadeThemeKt.LocalSizes)).getClass();
                            DefaultSizes.spacing.getClass();
                            gapComposer15.end(false);
                            f = 8.0f;
                        }
                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                        Section.Row.MoreInfo moreInfo = row2.more_info;
                        String str5 = moreInfo != null ? moreInfo.text : null;
                        if (str5 == null) {
                            gapComposer15.startReplaceGroup(-560000633);
                            gapComposer15.end(false);
                            function2 = null;
                        } else {
                            gapComposer15.startReplaceGroup(-560000632);
                            Function2 rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-294710904, new FamilyMemberRowKt$$ExternalSyntheticLambda5(str5, 29), gapComposer15);
                            gapComposer15.end(false);
                            function2 = rememberComposableLambda;
                        }
                        final int i7 = r14 ? 1 : 0;
                        ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1588885252, new Function2() { // from class: com.squareup.cash.investing.components.InvestingPerformanceKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj6, Object obj7) {
                                Icons icons3;
                                int i8;
                                int i9;
                                int i10 = i7;
                                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                                Section.Row row3 = row2;
                                switch (i10) {
                                    case 0:
                                        Composer composer17 = (Composer) obj6;
                                        int intValue16 = ((Integer) obj7).intValue();
                                        GapComposer gapComposer16 = (GapComposer) composer17;
                                        if (gapComposer16.shouldExecute(1 & intValue16, (intValue16 & 3) != 2)) {
                                            String str6 = row3.label;
                                            String str7 = str6 == null ? "" : str6;
                                            boolean changedInstance = gapComposer16.changedInstance(row3);
                                            Object rememberedValue = gapComposer16.rememberedValue();
                                            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                                                rememberedValue = new GpsConfigQueries$$ExternalSyntheticLambda2(row3, 23);
                                                gapComposer16.updateRememberedValue(rememberedValue);
                                            }
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer16, SemanticsModifierKt.semantics(companion2, false, (Function1) rememberedValue), (TextStyle) null, (TextLineBalancing) null, str7, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer16.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        Section.Row.Value value = row3.value;
                                        Composer composer18 = (Composer) obj6;
                                        int intValue17 = ((Integer) obj7).intValue();
                                        GapComposer gapComposer17 = (GapComposer) composer18;
                                        if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                                            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer17, 48);
                                            int hashCode = Long.hashCode(gapComposer17.compositeKeyHashCode);
                                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer17.currentCompositionLocalScope();
                                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer17, companion2);
                                            ComposeUiNode.Companion.getClass();
                                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                            if (gapComposer17.applier == null) {
                                                Updater.invalidApplier();
                                                throw null;
                                            }
                                            gapComposer17.startReusableNode();
                                            if (gapComposer17.inserting) {
                                                gapComposer17.createNode(layoutNode$Companion$Constructor$1);
                                            } else {
                                                gapComposer17.useNode();
                                            }
                                            Updater.m576setimpl(gapComposer17, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                            Updater.m576setimpl(gapComposer17, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                            Updater.m576setimpl(gapComposer17, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                            Updater.m575reconcileimpl(gapComposer17, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                            Updater.m576setimpl(gapComposer17, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                            Section.Row.Value.Icon icon = value != null ? value.icon : null;
                                            if (icon == null) {
                                                gapComposer17.startReplaceGroup(1699213262);
                                                gapComposer17.end(false);
                                            } else {
                                                gapComposer17.startReplaceGroup(1699213263);
                                                int ordinal = icon.ordinal();
                                                if (ordinal == 0) {
                                                    icons3 = Icons.TickerUp16;
                                                } else {
                                                    if (ordinal != 1) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        return null;
                                                    }
                                                    icons3 = Icons.TickerDown16;
                                                }
                                                Icons icons4 = icons3;
                                                int ordinal2 = icon.ordinal();
                                                if (ordinal2 == 0) {
                                                    i8 = -1036174310;
                                                    i9 = R.string.investing_components_up_arrow_content_description;
                                                } else {
                                                    if (ordinal2 != 1) {
                                                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer17, -1036175141, false);
                                                    }
                                                    i8 = -1036171332;
                                                    i9 = R.string.investing_components_down_arrow_content_description;
                                                }
                                                Trace.m1191Iconww6aTOc(icons4, re$$ExternalSyntheticOutline0.m(gapComposer17, i8, i9, gapComposer17, false), (Modifier) null, 0L, gapComposer17, 0, 12);
                                                gapComposer17.end(false);
                                            }
                                            String str8 = value != null ? value.text : null;
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str8 == null ? "" : str8, (Map) null, (Function1) null, false);
                                            gapComposer17.end(true);
                                        } else {
                                            gapComposer17.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }, gapComposer15);
                        final char c2 = c == true ? 1 : 0;
                        listUnorderedScope2.ListUnorderedItem(rememberComposableLambda2, m302paddingqDBjuR0$default, (Function2) null, Expect_jvmKt.rememberComposableLambda(-89839391, new Function2() { // from class: com.squareup.cash.investing.components.InvestingPerformanceKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj6, Object obj7) {
                                Icons icons3;
                                int i8;
                                int i9;
                                int i10 = c2;
                                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                                Section.Row row3 = row2;
                                switch (i10) {
                                    case 0:
                                        Composer composer17 = (Composer) obj6;
                                        int intValue16 = ((Integer) obj7).intValue();
                                        GapComposer gapComposer16 = (GapComposer) composer17;
                                        if (gapComposer16.shouldExecute(1 & intValue16, (intValue16 & 3) != 2)) {
                                            String str6 = row3.label;
                                            String str7 = str6 == null ? "" : str6;
                                            boolean changedInstance = gapComposer16.changedInstance(row3);
                                            Object rememberedValue = gapComposer16.rememberedValue();
                                            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                                                rememberedValue = new GpsConfigQueries$$ExternalSyntheticLambda2(row3, 23);
                                                gapComposer16.updateRememberedValue(rememberedValue);
                                            }
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer16, SemanticsModifierKt.semantics(companion2, false, (Function1) rememberedValue), (TextStyle) null, (TextLineBalancing) null, str7, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer16.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    default:
                                        Section.Row.Value value = row3.value;
                                        Composer composer18 = (Composer) obj6;
                                        int intValue17 = ((Integer) obj7).intValue();
                                        GapComposer gapComposer17 = (GapComposer) composer18;
                                        if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                                            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer17, 48);
                                            int hashCode = Long.hashCode(gapComposer17.compositeKeyHashCode);
                                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer17.currentCompositionLocalScope();
                                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer17, companion2);
                                            ComposeUiNode.Companion.getClass();
                                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                            if (gapComposer17.applier == null) {
                                                Updater.invalidApplier();
                                                throw null;
                                            }
                                            gapComposer17.startReusableNode();
                                            if (gapComposer17.inserting) {
                                                gapComposer17.createNode(layoutNode$Companion$Constructor$1);
                                            } else {
                                                gapComposer17.useNode();
                                            }
                                            Updater.m576setimpl(gapComposer17, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                            Updater.m576setimpl(gapComposer17, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                            Updater.m576setimpl(gapComposer17, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                            Updater.m575reconcileimpl(gapComposer17, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                            Updater.m576setimpl(gapComposer17, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                            Section.Row.Value.Icon icon = value != null ? value.icon : null;
                                            if (icon == null) {
                                                gapComposer17.startReplaceGroup(1699213262);
                                                gapComposer17.end(false);
                                            } else {
                                                gapComposer17.startReplaceGroup(1699213263);
                                                int ordinal = icon.ordinal();
                                                if (ordinal == 0) {
                                                    icons3 = Icons.TickerUp16;
                                                } else {
                                                    if (ordinal != 1) {
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        return null;
                                                    }
                                                    icons3 = Icons.TickerDown16;
                                                }
                                                Icons icons4 = icons3;
                                                int ordinal2 = icon.ordinal();
                                                if (ordinal2 == 0) {
                                                    i8 = -1036174310;
                                                    i9 = R.string.investing_components_up_arrow_content_description;
                                                } else {
                                                    if (ordinal2 != 1) {
                                                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer17, -1036175141, false);
                                                    }
                                                    i8 = -1036171332;
                                                    i9 = R.string.investing_components_down_arrow_content_description;
                                                }
                                                Trace.m1191Iconww6aTOc(icons4, re$$ExternalSyntheticOutline0.m(gapComposer17, i8, i9, gapComposer17, false), (Modifier) null, 0L, gapComposer17, 0, 12);
                                                gapComposer17.end(false);
                                            }
                                            String str8 = value != null ? value.text : null;
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str8 == null ? "" : str8, (Map) null, (Function1) null, false);
                                            gapComposer17.end(true);
                                        } else {
                                            gapComposer17.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                }
                            }
                        }, gapComposer15), function2, gapComposer15, ((intValue15 << 15) & 458752) | 3078, 4);
                    }
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                InvestingStockSelectionViewModel.Loaded loaded = (InvestingStockSelectionViewModel.Loaded) obj4;
                Composer composer17 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer17;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((InvestingStockSelectionViewModel.Loaded.MultiSelect) loaded).getMultiselectParameters().ctaLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                InvestingCategoryFilterViewModel.Content.FilterOption.Selection.OptionRow optionRow = (InvestingCategoryFilterViewModel.Content.FilterOption.Selection.OptionRow) obj4;
                Composer composer18 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer18;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, optionRow.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                InvestingCategoryFilterViewModel investingCategoryFilterViewModel = (InvestingCategoryFilterViewModel) obj4;
                Composer composer19 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer19;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer18, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((InvestingCategoryFilterViewModel.Content) investingCategoryFilterViewModel).primaryButtonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                InvestingCustomOrderContentModel.Content content2 = (InvestingCustomOrderContentModel.Content) obj4;
                String str6 = (String) obj;
                Composer composer20 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                str6.getClass();
                if ((intValue19 & 6) == 0) {
                    intValue19 |= ((GapComposer) composer20).changed(str6) ? 4 : 2;
                }
                GapComposer gapComposer19 = (GapComposer) composer20;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 19) != 18)) {
                    ((DefaultSizes) gapComposer19.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer19, 0);
                    int hashCode = Long.hashCode(gapComposer19.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer19.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer19, m300paddingVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer19.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer19.startReusableNode();
                    if (gapComposer19.inserting) {
                        gapComposer19.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer19.useNode();
                    }
                    Updater.m576setimpl(gapComposer19, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer19, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer19, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer19, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer19, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    StockMetric stockMetric = content2.headerViewModel.metric;
                    if (stockMetric == null) {
                        gapComposer19.startReplaceGroup(1421034458);
                        gapComposer19.end(false);
                    } else {
                        gapComposer19.startReplaceGroup(1421034459);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer19, (Modifier) null, ((Typography) gapComposer19.consume(ArcadeThemeKt.LocalTypography)).header, (TextLineBalancing) null, stockMetric.getText(), (Map) null, (Function1) null, false);
                        DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer19, null);
                        gapComposer19.end(false);
                    }
                    TextStyle textStyle = ((Typography) gapComposer19.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                    Colors colors2 = (Colors) gapComposer19.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer19, -1762997026, gapComposer19, false);
                    } else {
                        gapComposer19.startReplaceGroup(-1762997739);
                        gapComposer19.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, intValue19 & 14, 0, 4082, colors2.semantic.text.subtle, (Composer) gapComposer19, (Modifier) null, textStyle, (TextLineBalancing) null, str6, (Map) null, (Function1) null, false);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer19, null);
                    gapComposer19.end(true);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                StockMetric stockMetric2 = (StockMetric) obj4;
                Composer composer21 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer21;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer20, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, stockMetric2.getText(), (Map) null, (Function1) null, false);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                TypesJVMKt typesJVMKt = (TypesJVMKt) obj4;
                Composer composer22 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer22;
                if (!gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 17) != 16)) {
                    gapComposer21.skipToGroupEnd();
                } else if (typesJVMKt instanceof CustomOrderTooltipViewModel$CurrentPrice) {
                    gapComposer21.startReplaceGroup(902491366);
                    CustomOrderTooltipViewModel$CurrentPrice customOrderTooltipViewModel$CurrentPrice = (CustomOrderTooltipViewModel$CurrentPrice) typesJVMKt;
                    CustomOrderKt.TopText(customOrderTooltipViewModel$CurrentPrice.topText, gapComposer21, 0);
                    CustomOrderKt.BottomText(customOrderTooltipViewModel$CurrentPrice.bottomText, null, gapComposer21, 0, 2);
                    gapComposer21.end(false);
                } else if (typesJVMKt instanceof CustomOrderTooltipViewModel$Informational) {
                    gapComposer21.startReplaceGroup(902607213);
                    CustomOrderKt.InformationText(((CustomOrderTooltipViewModel$Informational) typesJVMKt).text, gapComposer21, 0);
                    gapComposer21.end(false);
                } else {
                    if (!(typesJVMKt instanceof CustomOrderTooltipViewModel$PercentChange)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer21, -663625035, false);
                    }
                    gapComposer21.startReplaceGroup(902687968);
                    CustomOrderTooltipViewModel$PercentChange customOrderTooltipViewModel$PercentChange = (CustomOrderTooltipViewModel$PercentChange) typesJVMKt;
                    CustomOrderKt.TopText(customOrderTooltipViewModel$PercentChange.topText, gapComposer21, 0);
                    String str7 = customOrderTooltipViewModel$PercentChange.bottomText;
                    int i8 = CustomOrderTooltipViewKt$WhenMappings.$EnumSwitchMapping$0[customOrderTooltipViewModel$PercentChange.bottomTextIcon.ordinal()];
                    if (i8 == 1) {
                        icons = Icons.TickerUp16;
                    } else if (i8 == 2) {
                        icons = Icons.TickerDown16;
                    }
                    CustomOrderKt.BottomText(str7, icons, gapComposer21, 0, 0);
                    gapComposer21.end(false);
                }
                return Unit.INSTANCE;
            case 23:
                DependentWelcomeViewModel dependentWelcomeViewModel = (DependentWelcomeViewModel) obj4;
                Composer composer23 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer22 = (GapComposer) composer23;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer22, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dependentWelcomeViewModel.ctaLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                DividendReinvestmentLearnMoreSheetViewModel dividendReinvestmentLearnMoreSheetViewModel = (DividendReinvestmentLearnMoreSheetViewModel) obj4;
                Composer composer24 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer24;
                if (gapComposer23.shouldExecute(intValue23 & 1, (intValue23 & 17) != 16)) {
                    String str8 = dividendReinvestmentLearnMoreSheetViewModel.dismissButtonLabel;
                    TextStyle textStyle2 = ((Typography) gapComposer23.consume(ArcadeThemeKt.LocalTypography)).button;
                    Colors colors3 = (Colors) gapComposer23.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer23, -1762997026, gapComposer23, false);
                    } else {
                        gapComposer23.startReplaceGroup(-1762997739);
                        gapComposer23.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors3.semantic.text.standard, (Composer) gapComposer23, (Modifier) null, textStyle2, (TextLineBalancing) null, str8, (Map) null, (Function1) null, false);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                InvestingExchangeViewModel investingExchangeViewModel = (InvestingExchangeViewModel) obj4;
                Composer composer25 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer24 = (GapComposer) composer25;
                if (gapComposer24.shouldExecute(intValue24 & 1, (intValue24 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer24, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((InvestingExchangeViewModel.Content) investingExchangeViewModel).getSubmitLabel(), (Map) null, (Function1) null, false);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                return invoke$com$squareup$cash$investing$components$families$DependentInvestingActivityViewKt$$ExternalSyntheticLambda3(obj, obj2, obj3);
            case 27:
                return invoke$com$squareup$cash$investing$components$holdings$InvestingEtfHoldingsComponentKt$$ExternalSyntheticLambda0(obj, obj2, obj3);
            case 28:
                return invoke$com$squareup$cash$investing$components$keystats$InvestingKeyStatsDetailsKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            default:
                InvestingPlaceholderGraphViewModel investingPlaceholderGraphViewModel = (InvestingPlaceholderGraphViewModel) obj4;
                Composer composer26 = (Composer) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                int i9 = InvestingPlaceholderGraphView.$r8$clinit;
                ((RowScope) obj).getClass();
                GapComposer gapComposer25 = (GapComposer) composer26;
                if (gapComposer25.shouldExecute(intValue25 & 1, (intValue25 & 17) != 16)) {
                    investingPlaceholderGraphViewModel.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer25, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, "$0.00", (Map) null, (Function1) null, false);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer25.consume(staticProvidableCompositionLocal)).getClass();
                    Request$Priority$EnumUnboxingLocalUtility.m$1(DefaultSizes.spacing, companion, 4.0f, gapComposer25);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer25, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, "0%", (Map) null, (Function1) null, false);
                    ((DefaultSizes) gapComposer25.consume(staticProvidableCompositionLocal)).getClass();
                    SpacerKt.Spacer(gapComposer25, SizeKt.m290width3ABfNKs(companion, 4.0f));
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer25, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, investingPlaceholderGraphViewModel.timePeriod, (Map) null, (Function1) null, false);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
