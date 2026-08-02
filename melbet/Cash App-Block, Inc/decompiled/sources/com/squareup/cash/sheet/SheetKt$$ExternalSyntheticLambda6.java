package com.squareup.cash.sheet;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.glance.appwidget.protobuf.Utf8;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.molecule.PlatformKt;
import app.cash.sqldelight.TransactionCallbacks;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db.Session;
import com.squareup.cash.merchant.views.SquareLoyaltyDetailsView;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.backend.api.mappers.SavingsScreenMappersKt;
import com.squareup.cash.savings.backend.api.model.SavingsScreen;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter;
import com.squareup.cash.savings.viewmodels.CellDefaultViewModel;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance;
import com.squareup.cash.savings.views.ButtonGroupKt;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda1;
import com.squareup.cash.securityhub.viewmodels.SecurityEducationSupportRowViewModel;
import com.squareup.cash.session.backend.DbSessionManager;
import com.squareup.cash.session.backend.DbSessionManagerKt;
import com.squareup.cash.session.backend.OnboardedWithoutFullSession;
import com.squareup.cash.sharesheet.ShareIcon;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.sharesheet.ShareSheetViewKt;
import com.squareup.cash.shopping.viewmodels.ShoppingViewModel;
import com.squareup.cash.shopping.viewmodels.WebNavigationHeaderModel;
import com.squareup.cash.shopping.views.ShoppingWebContainerViewKt;
import com.squareup.cash.stablecoin.viewmodels.widgets.StablecoinHomeBalanceWidgetViewModel;
import com.squareup.cash.stablecoin.viewmodels.widgets.StablecoinHomeWidgetViewModel;
import com.squareup.cash.stablecoin.viewmodels.widgets.StablecoinWelcomeWidgetViewModel;
import com.squareup.cash.support.backend.api.articles.Article;
import com.squareup.cash.support.backend.api.disputesTracker.DisputeRow;
import com.squareup.cash.support.chat.viewmodels.BodyViewModel$TransactionBodyViewModel;
import com.squareup.cash.support.chat.views.transcript.LoadingRowView;
import com.squareup.cash.support.chat.views.transcript.message.ActionBodyViewKt;
import com.squareup.cash.support.chat.views.transcript.message.EnhancedSuggestedRepliesView;
import com.squareup.cash.support.chat.views.transcript.viewholder.MessageTypingIndicatorComposeView;
import com.squareup.cash.support.viewmodels.ArticleViewModel;
import com.squareup.cash.support.viewmodels.ScreenshotReviewViewModel;
import com.squareup.cash.support.viewmodels.SupportHomeContactOptionsSheetViewModel;
import com.squareup.cash.support.viewmodels.SupportHomeViewModel;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import com.squareup.cash.support.views.home.SupportHomeViewKt;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda28;
import com.squareup.cash.tax.applets.presenters.RealTaxesAppletTileRepository;
import com.squareup.cash.tax.applets.presenters.TaxesAppletTilePresenter$WhenMappings;
import com.squareup.cash.tax.viewmodels.TaxesAppletTileModel;
import com.squareup.cash.tax.viewmodels.TaxesIconType;
import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.protos.cash.cashtes.app.v1beta1.ReturnStatus;
import com.squareup.protos.cash.cashtes.app.v1beta1.UserData2Response;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.common.SessionStatus;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.savings.VersionedSavingsScreens;

/* loaded from: classes7.dex */
public final /* synthetic */ class SheetKt$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda6(ShareSheetPresenter shareSheetPresenter, PromotedAppletTileViewModel.Loaded loaded) {
        this.$r8$classId = 29;
        this.f$0 = loaded;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        TextStyle textStyle;
        TaxesAppletTileModel.Installed.Pending pending;
        TaxesAppletTileModel.Installed.Pending pending2;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i2 = 3;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                BasicShieetScope basicShieetScope = (BasicShieetScope) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 32.0f, 5);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    long j = colors.component.sheet.handle.border;
                    ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                    Object obj4 = DefaultSizes.border.entries;
                    basicShieetScope.m3746DragHandle9Us8nR8(j, m302paddingqDBjuR0$default, 0L, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f), gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                SavingsScreenPresenter savingsScreenPresenter = (SavingsScreenPresenter) obj3;
                VersionedSavingsScreens versionedSavingsScreens = (VersionedSavingsScreens) obj;
                List list = (List) obj2;
                list.getClass();
                if (versionedSavingsScreens != null) {
                    return SavingsScreenMappersKt.toSavingsScreen(savingsScreenPresenter, versionedSavingsScreens, (SavingsScreen.ScreenType) savingsScreenPresenter.screenType, list);
                }
                return null;
            case 2:
                CellDefaultViewModel cellDefaultViewModel = (CellDefaultViewModel) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, cellDefaultViewModel.label, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                CellDefaultViewModel.Accessory accessory = (CellDefaultViewModel.Accessory) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    CellDefaultViewModel.Accessory.LabeledPush labeledPush = (CellDefaultViewModel.Accessory.LabeledPush) accessory;
                    ButtonGroupKt.LabeledPushWithColors(labeledPush.text, labeledPush.textColor, gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance = (SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    String str = savingsScreenViewModel$Content$SavingsScreenElement$Header$Balance.sectionTitleText;
                    if (str == null) {
                        gapComposer4.startReplaceGroup(-653175280);
                    } else {
                        gapComposer4.startReplaceGroup(-653175279);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    }
                    gapComposer4.end(false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                SavingsScreenViewModel.Content.SavingsScreenElement savingsScreenElement = (SavingsScreenViewModel.Content.SavingsScreenElement) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((SavingsScreenViewModel.Content.SavingsScreenElement.CompactCard) savingsScreenElement).body, (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                SavingsScreenViewModel.Content.SavingsScreenElement.SectionHeader sectionHeader = (SavingsScreenViewModel.Content.SavingsScreenElement.SectionHeader) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    String str2 = sectionHeader.title;
                    Object rememberedValue = gapComposer6.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new CalloutKt$$ExternalSyntheticLambda1(1);
                        gapComposer6.updateRememberedValue(rememberedValue);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer6, SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue), (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                CashCreditScoreHomeData.InfoSection.Callout callout = (CashCreditScoreHomeData.InfoSection.Callout) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    LocalizedString localizedString = callout.title;
                    String str3 = localizedString != null ? localizedString.translated_value : null;
                    if (str3 == null) {
                        gapComposer7.startReplaceGroup(-1701643655);
                    } else {
                        gapComposer7.startReplaceGroup(-1701643654);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                    }
                    gapComposer7.end(false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                CashCreditScoreHomeData.InfoSection.Row row = (CashCreditScoreHomeData.InfoSection.Row) obj3;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    LocalizedString localizedString2 = row.title;
                    String str4 = localizedString2 != null ? localizedString2.translated_value : null;
                    if (str4 == null) {
                        gapComposer8.startReplaceGroup(552771364);
                    } else {
                        gapComposer8.startReplaceGroup(552771365);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                    }
                    gapComposer8.end(false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                SecurityEducationSupportRowViewModel securityEducationSupportRowViewModel = (SecurityEducationSupportRowViewModel) obj3;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, securityEducationSupportRowViewModel.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                DbSessionManager dbSessionManager = (DbSessionManager) obj3;
                Session session = (Session) obj2;
                ((TransactionCallbacks) obj).getClass();
                session.getClass();
                com.squareup.cash.session.backend.Session session2 = DbSessionManagerKt.getSession(session);
                SessionStatus sessionStatus = session2 != null ? session2.status : null;
                if (sessionStatus != SessionStatus.FULL) {
                    dbSessionManager.errorReporter.report(new OnboardedWithoutFullSession(sessionStatus), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                }
                return Session.copy$default(session, null, null, null, null, null, true, 95);
            case 11:
                ((Integer) obj2).getClass();
                ShareSheetViewKt.Render((ShareIcon) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                ((SquareLoyaltyDetailsView) obj3).LoadingContent((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                ShoppingWebContainerViewKt.AnimatedAutofillSuccessToast((ShoppingViewModel.ValidUrl) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 14:
                WebNavigationHeaderModel webNavigationHeaderModel = (WebNavigationHeaderModel) obj3;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer10, 48);
                    int hashCode = Long.hashCode(gapComposer10.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer10.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer10, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer10.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer10.startReusableNode();
                    if (gapComposer10.inserting) {
                        gapComposer10.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer10.useNode();
                    }
                    Updater.m576setimpl(gapComposer10, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer10, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer10, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer10, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer10, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    String str5 = webNavigationHeaderModel.urlText;
                    if (str5 == null) {
                        gapComposer10.startReplaceGroup(-1129604402);
                        gapComposer10.end(false);
                    } else {
                        gapComposer10.startReplaceGroup(-1129604401);
                        Room.m1165Text25TpFw(2, 1, 0, 0, 1769472, 0, 3994, 0L, (Composer) gapComposer10, (Modifier) null, ((Typography) gapComposer10.consume(ArcadeThemeKt.LocalTypography)).titleBarPageTitle, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                        gapComposer10.end(false);
                    }
                    gapComposer10.end(true);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                StablecoinHomeWidgetViewModel stablecoinHomeWidgetViewModel = (StablecoinHomeWidgetViewModel) obj3;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    Utf8.SafeProcessor.StablecoinWelcomeWidget((StablecoinWelcomeWidgetViewModel) stablecoinHomeWidgetViewModel, null, gapComposer11, 0);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                StablecoinHomeBalanceWidgetViewModel stablecoinHomeBalanceWidgetViewModel = (StablecoinHomeBalanceWidgetViewModel) obj3;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(companion, 42.0f, 32.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode2 = Long.hashCode(gapComposer12.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer12.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer12, m299paddingVpY3zN4);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer12.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer12.startReusableNode();
                    if (gapComposer12.inserting) {
                        gapComposer12.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer12.useNode();
                    }
                    Updater.m576setimpl(gapComposer12, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer12, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer12, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer12, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer12, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    String str6 = stablecoinHomeBalanceWidgetViewModel.amount;
                    TextStyle textStyle2 = ((Typography) gapComposer12.consume(ArcadeThemeKt.LocalTypography)).numeralLarge;
                    Colors colors2 = (Colors) gapComposer12.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer12, -1762997026, gapComposer12, false);
                    } else {
                        gapComposer12.startReplaceGroup(-1762997739);
                        gapComposer12.end(false);
                    }
                    zzacn.m2012AutoScaleTextZLomxE(1, 3, 0, 1597488, MLKEMEngine.KyberPolyBytes, colors2.semantic.text.prominent, Room.getSp(24), gapComposer12, fillMaxWidth2, textStyle2, str6, null);
                    gapComposer12.end(true);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                AndroidStringManager androidStringManager = (AndroidStringManager) obj3;
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    String str7 = androidStringManager.get(R.string.support_chat_title);
                    TextStyle textStyle3 = ((Typography) gapComposer13.consume(ArcadeThemeKt.LocalTypography)).titleBarPageTitle;
                    Painter painter = Icons.AccountVerified16.painter(gapComposer13);
                    Colors colors3 = (Colors) gapComposer13.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer13, -1762997026, gapComposer13, false);
                    } else {
                        gapComposer13.startReplaceGroup(-1762997739);
                        gapComposer13.end(false);
                    }
                    zzacp.m2014InlineIconTextQqsJerU(str7, painter, null, colors3.semantic.icon.info, null, textStyle3, 0L, null, 0, 0, 0, 0, false, 4.0f, gapComposer13, Painter.$stable << 3, 24576, 16340);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                int i3 = LoadingRowView.$r8$clinit;
                ((LoadingRowView) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                int i4 = EnhancedSuggestedRepliesView.$r8$clinit;
                ((EnhancedSuggestedRepliesView) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                ActionBodyViewKt.LoadedContent((BodyViewModel$TransactionBodyViewModel.Loaded) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                int i5 = MessageTypingIndicatorComposeView.$r8$clinit;
                ((MessageTypingIndicatorComposeView) obj3).Content((Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.UploadStatusAccessory((ScreenshotReviewViewModel.UploadStatus) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                DisputeRow disputeRow = (DisputeRow) obj3;
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, disputeRow.amount, (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                SupportHomeContactOptionsSheetViewModel.ContactOption contactOption = (SupportHomeContactOptionsSheetViewModel.ContactOption) obj3;
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, contactOption.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                ArticleViewModel.Loaded loaded = (ArticleViewModel.Loaded) obj3;
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    Article article = loaded.article;
                    boolean z = article.appearance == Article.Appearance.ISSUE && article.callToAction != null;
                    String str8 = article.title;
                    if (z) {
                        gapComposer16.startReplaceGroup(-2004338854);
                        textStyle = ((Typography) gapComposer16.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
                        gapComposer16.end(false);
                    } else {
                        gapComposer16.startReplaceGroup(-2004337164);
                        textStyle = ((Typography) gapComposer16.consume(ArcadeThemeKt.LocalTypography)).header;
                        gapComposer16.end(false);
                    }
                    TextStyle textStyle4 = textStyle;
                    Object rememberedValue2 = gapComposer16.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new TabToolbarsKt$$ExternalSyntheticLambda28(i2);
                        gapComposer16.updateRememberedValue(rememberedValue2);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4088, 0L, (Composer) gapComposer16, SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue2), textStyle4, (TextLineBalancing) null, str8, (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                SupportHomeViewModel.SuggestedAction suggestedAction = (SupportHomeViewModel.SuggestedAction) obj3;
                Composer composer17 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4030, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, suggestedAction.link.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                SupportHomeViewModel.Loaded.ActivitySectionConfig activitySectionConfig = (SupportHomeViewModel.Loaded.ActivitySectionConfig) obj3;
                Composer composer18 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    SupportHomeViewKt.ActivityPicker(((SupportHomeViewModel.Loaded.ActivitySectionConfig.PickerAndDisputes) activitySectionConfig).activityEmbeddedViewModel, gapComposer18, 0);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                SupportHomeViewKt.ActivityPicker((UiCallbackModel) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                PromotedAppletTileViewModel.Loaded loaded2 = (PromotedAppletTileViewModel.Loaded) obj3;
                RealTaxesAppletTileRepository.TaxesModel taxesModel = (RealTaxesAppletTileRepository.TaxesModel) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                taxesModel.getClass();
                boolean z2 = taxesModel instanceof RealTaxesAppletTileRepository.TaxesModel.Installed;
                TaxesIconType.Standard standard = TaxesIconType.Standard.INSTANCE;
                if (!z2) {
                    if (!(taxesModel instanceof RealTaxesAppletTileRepository.TaxesModel.Uninstalled)) {
                        if (taxesModel instanceof RealTaxesAppletTileRepository.TaxesModel.PendingRequest) {
                            return !((RealTaxesAppletTileRepository.TaxesModel.PendingRequest) taxesModel).installed ? new TaxesAppletTileModel.Uninstalled("Pay $0 to file", new TaxesAppletTileModel.Accessory.Icon(standard, false), booleanValue, loaded2) : new TaxesAppletTileModel.Loading();
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    UserData2Response userData2Response = ((RealTaxesAppletTileRepository.TaxesModel.Uninstalled) taxesModel).taxTileData;
                    if (userData2Response == null) {
                        return new TaxesAppletTileModel.Uninstalled("Pay $0 to file", new TaxesAppletTileModel.Accessory.Icon(standard, false), booleanValue, loaded2);
                    }
                    String str9 = userData2Response.header;
                    str9.getClass();
                    return new TaxesAppletTileModel.Uninstalled(str9, new TaxesAppletTileModel.Accessory.Icon(standard, false), booleanValue, loaded2);
                }
                UserData2Response userData2Response2 = ((RealTaxesAppletTileRepository.TaxesModel.Installed) taxesModel).taxTileData;
                if (userData2Response2 != null) {
                    String str10 = userData2Response2.header_emphasized;
                    UserData2Response.InteractionEvents interactionEvents = userData2Response2.event_status;
                    if (str10 == null || str10.length() <= 0) {
                        str10 = null;
                    }
                    String str11 = userData2Response2.header_regular;
                    if (str11 == null || str11.length() <= 0) {
                        str11 = null;
                    }
                    if (str10 != null || str11 != null) {
                        if (str11 == null) {
                            str11 = "";
                        }
                        Pair pair = new Pair(str10, str11);
                        String str12 = (!(interactionEvents != null ? Intrinsics.areEqual(interactionEvents.show_badge, Boolean.TRUE) : false) || interactionEvents == null) ? null : interactionEvents.badge_text;
                        Float valueOf = userData2Response2.progress_percent != null ? Float.valueOf(r3.intValue()) : null;
                        valueOf.getClass();
                        float floatValue = valueOf.floatValue();
                        ReturnStatus returnStatus = userData2Response2.progress;
                        switch (returnStatus == null ? -1 : TaxesAppletTilePresenter$WhenMappings.$EnumSwitchMapping$0[returnStatus.ordinal()]) {
                            case -1:
                            case 5:
                            case 6:
                            case 7:
                                return new TaxesAppletTileModel.Installed.Idle(pair, str12, new TaxesAppletTileModel.Accessory.Icon(standard, false));
                            case 0:
                            default:
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            case 1:
                                return new TaxesAppletTileModel.Installed.Pending(pair, str12, new TaxesAppletTileModel.Accessory.Icon(TaxesIconType.Alert.INSTANCE, true), "Return rejected");
                            case 2:
                            case 3:
                                pending2 = new TaxesAppletTileModel.Installed.Pending(pair, str12, new TaxesAppletTileModel.Accessory.Progress(floatValue / 100.0f), null);
                                break;
                            case 4:
                                if (floatValue <= RecyclerView.DECELERATION_RATE) {
                                    return new TaxesAppletTileModel.Installed.Idle(pair, str12, new TaxesAppletTileModel.Accessory.Icon(standard, false));
                                }
                                pending2 = new TaxesAppletTileModel.Installed.Pending(pair, str12, new TaxesAppletTileModel.Accessory.Progress(floatValue / 100.0f), null);
                                break;
                        }
                        return pending2;
                    }
                    pending = new TaxesAppletTileModel.Installed.Pending(new Pair(null, "Estimate your tax refund"), null, new TaxesAppletTileModel.Accessory.Icon(standard, false), null);
                } else {
                    pending = new TaxesAppletTileModel.Installed.Pending(new Pair(null, "Estimate your tax refund"), null, new TaxesAppletTileModel.Accessory.Icon(standard, false), null);
                }
                return pending;
        }
    }

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda6(StablecoinHomeBalanceWidgetViewModel stablecoinHomeBalanceWidgetViewModel) {
        this.$r8$classId = 16;
        this.f$0 = stablecoinHomeBalanceWidgetViewModel;
    }

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda6(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda6(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
    }
}
