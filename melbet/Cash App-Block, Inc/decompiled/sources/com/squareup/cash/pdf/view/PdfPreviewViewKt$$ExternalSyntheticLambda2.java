package com.squareup.cash.pdf.view;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.credentials.Credential;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacp;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.PersonalInfoRow;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$CashMeSettingViewModel;
import com.squareup.cash.account.settings.viewmodels.SearchPrivacySectionViewEvent;
import com.squareup.cash.account.settings.viewmodels.UnsupportedSettingViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.ProgressMeter$CompletionBehavior;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.data.profile.Badge;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.paychecks.viewmodels.PaychecksReceiptViewModel;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import com.squareup.cash.paychecks.views.wheel.ReceiptWheelContentKt;
import com.squareup.cash.payments.viewmodels.NearbyPaymentsInfoItemArticle;
import com.squareup.cash.payments.viewmodels.ToolbarViewModel;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda25;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowBasicShieetScope;
import com.squareup.cash.pdf.view.PdfPreviewViewModel;
import com.squareup.cash.phoneplans.PhonePlansEsimCheckViewModel;
import com.squareup.cash.phoneplans.PhonePlansHomeViewModel;
import com.squareup.cash.phoneplans.applets.viewmodels.PhonePlansAppletTileModel;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphTabsViewKt;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import com.squareup.cash.profile.viewmodels.GenericProfileElementViewModel;
import com.squareup.cash.profile.viewmodels.NotificationSectionViewModel;
import com.squareup.cash.profile.viewmodels.OpenSourceViewModel;
import com.squareup.cash.profile.viewmodels.ProfileHeaderViewModel;
import com.squareup.cash.profile.viewmodels.TrustElementWidget;
import com.squareup.cash.profile.views.BadgeNameKt;
import com.squareup.cash.profile.views.notifications.ChannelListViewKt;
import com.squareup.cash.recipients.viewmodels.SectionViewModel;
import com.squareup.cash.retro.viewmodels.PaymentPlanSummaryViewModel;
import com.squareup.cash.retro.viewmodels.SelectPaymentPlanViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class PdfPreviewViewKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ PdfPreviewViewKt$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Badge badge = null;
        Object obj3 = this.f$0;
        switch (i3) {
            case 0:
                PdfPreviewViewModel pdfPreviewViewModel = (PdfPreviewViewModel) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    PdfPreviewViewModel.Ready ready = pdfPreviewViewModel instanceof PdfPreviewViewModel.Ready ? (PdfPreviewViewModel.Ready) pdfPreviewViewModel : null;
                    String str = ready != null ? ready.title : null;
                    Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4030, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str == null ? "" : str, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.PaychecksReceiptSection((PaychecksReceiptViewModel.Section) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                HelpSheetViewKt.PaychecksReceiptRow((PaychecksReceiptViewModel.Section.Row) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                ReceiptWheelContentKt.ReceiptWheelContent((DistributionWheelViewModel.Content.ReceiptScreen) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                ToolbarViewModel toolbarViewModel = (ToolbarViewModel) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
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
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).titleBarPageTitle, (TextLineBalancing) null, toolbarViewModel.title, (Map) null, (Function1) null, false);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                SectionViewModel sectionViewModel = (SectionViewModel) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Object rememberedValue = gapComposer3.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new MainPaymentViewKt$$ExternalSyntheticLambda25(28);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer3, SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue), (TextStyle) null, (TextLineBalancing) null, sectionViewModel.name, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                CoreFlowBasicShieetScope coreFlowBasicShieetScope = (CoreFlowBasicShieetScope) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 14.0f, 5);
                    Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    long j = colors.component.sheet.handle.border;
                    ((DefaultSizes) gapComposer4.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Object obj4 = DefaultSizes.border.entries;
                    coreFlowBasicShieetScope.m3708DragHandle9Us8nR8(j, m302paddingqDBjuR0$default, 0L, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f), gapComposer4, 48);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                NearbyPaymentsInfoItemArticle nearbyPaymentsInfoItemArticle = (NearbyPaymentsInfoItemArticle) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, nearbyPaymentsInfoItemArticle.label, (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                PhonePlansEsimCheckViewModel phonePlansEsimCheckViewModel = (PhonePlansEsimCheckViewModel) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    int ordinal = phonePlansEsimCheckViewModel.statusAvatar.ordinal();
                    if (ordinal == 0) {
                        gapComposer6.startReplaceGroup(2018541827);
                        ProgressCircularKt.ProgressCircular(0, 1, gapComposer6, null);
                        gapComposer6.end(false);
                    } else if (ordinal == 1) {
                        gapComposer6.startReplaceGroup(2018637028);
                        AvatarSize avatarSize = AvatarSize.Size64;
                        Colors colors2 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                        } else {
                            gapComposer6.startReplaceGroup(-1762997739);
                            gapComposer6.end(false);
                        }
                        TextViewKt.m3613AvatarB_rZmmc(avatarSize, "", colors2.semantic.background.brand, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.LocalIcon(Icons.Check32, 0L, 6), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer6, 199734, 0, 2000);
                        gapComposer6.end(false);
                    } else {
                        if (ordinal != 2) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer6, -1458907317, false);
                        }
                        gapComposer6.startReplaceGroup(2018960451);
                        AvatarSize avatarSize2 = AvatarSize.Size64;
                        Colors colors3 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                        } else {
                            gapComposer6.startReplaceGroup(-1762997739);
                            gapComposer6.end(false);
                        }
                        TextViewKt.m3613AvatarB_rZmmc(avatarSize2, "", colors3.semantic.background.danger, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.LocalIcon(Icons.Alert32, 0L, 6), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer6, 199734, 0, 2000);
                        gapComposer6.end(false);
                    }
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                PhonePlansHomeViewModel.Content.Link link = (PhonePlansHomeViewModel.Content.Link) obj3;
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, link.label, (Map) null, (Function1) null, false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                PhonePlansHomeViewModel.Content.Header.Inactive inactive = (PhonePlansHomeViewModel.Content.Header.Inactive) obj3;
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, inactive.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                PhonePlansHomeViewModel.Content.Header.Active active = (PhonePlansHomeViewModel.Content.Header.Active) obj3;
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, active.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                PhonePlansAppletTileModel.Installed installed = (PhonePlansAppletTileModel.Installed) obj3;
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    switch (installed.status.ordinal()) {
                        case 0:
                        case 3:
                            gapComposer10.startReplaceGroup(395864472);
                            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 56.0f);
                            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                            Colors colors4 = (Colors) gapComposer10.consume(staticProvidableCompositionLocal);
                            if (colors4 == null) {
                                colors4 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                            } else {
                                gapComposer10.startReplaceGroup(-1762997739);
                                gapComposer10.end(false);
                            }
                            long j2 = colors4.semantic.background.brand;
                            Colors colors5 = (Colors) gapComposer10.consume(staticProvidableCompositionLocal);
                            if (colors5 == null) {
                                colors5 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                            } else {
                                gapComposer10.startReplaceGroup(-1762997739);
                                gapComposer10.end(false);
                            }
                            VisibleKt.m3497ProgressMeterUV7SVM(0.33f, j2, 4.0f, m285size3ABfNKs, colors5.surface.money.applet.data.inactive.border, RecyclerView.DECELERATION_RATE, 0L, ProgressMeter$CompletionBehavior.NONE, null, null, null, null, null, gapComposer10, 12586374, 0, 8032);
                            gapComposer10.end(false);
                            break;
                        case 1:
                            gapComposer10.startReplaceGroup(396291435);
                            Icons icons = Icons.Time24;
                            Colors colors6 = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                            if (colors6 == null) {
                                colors6 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                            } else {
                                gapComposer10.startReplaceGroup(-1762997739);
                                gapComposer10.end(false);
                            }
                            SharedUIKt.m3607ZeroBalanceIconaMcp0Q(icons, colors6.semantic.background.brand, 56.0f, gapComposer10, 390, 0);
                            gapComposer10.end(false);
                            break;
                        case 2:
                        case 5:
                        case 7:
                            gapComposer10.startReplaceGroup(396784180);
                            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalColors;
                            Colors colors7 = (Colors) gapComposer10.consume(staticProvidableCompositionLocal2);
                            if (colors7 == null) {
                                colors7 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                            } else {
                                gapComposer10.startReplaceGroup(-1762997739);
                                gapComposer10.end(false);
                            }
                            long j3 = colors7.semantic.background.warning;
                            Icons icons2 = Icons.Alert24;
                            Colors colors8 = (Colors) gapComposer10.consume(staticProvidableCompositionLocal2);
                            if (colors8 == null) {
                                colors8 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                            } else {
                                gapComposer10.startReplaceGroup(-1762997739);
                                gapComposer10.end(false);
                            }
                            SharedUIKt.m3604FilledCircleWithIconJqkWdHE(j3, icons2, colors8.semantic.icon.inverse, 56.0f, gapComposer10, 3120, 0);
                            gapComposer10.end(false);
                            break;
                        case 4:
                        case 6:
                            gapComposer10.startReplaceGroup(396518851);
                            Icons icons3 = Icons.DeviceMobile24;
                            Colors colors9 = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                            if (colors9 == null) {
                                colors9 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                            } else {
                                gapComposer10.startReplaceGroup(-1762997739);
                                gapComposer10.end(false);
                            }
                            SharedUIKt.m3607ZeroBalanceIconaMcp0Q(icons3, colors9.semantic.background.brand, 56.0f, gapComposer10, 390, 0);
                            gapComposer10.end(false);
                            break;
                        default:
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer10, 428410155, false);
                    }
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                InvestingGraphTabsViewKt.UpToDateSubtitle((InvestingHomePortfolioHeaderContentModel$Subtitle$UpToDateData) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 14:
                PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet prepurchaseCardHomeSheet = (PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet) obj3;
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, prepurchaseCardHomeSheet.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet.InfoRow infoRow = (PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet.InfoRow) obj3;
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    Credential credential = infoRow.action;
                    if ((credential != null ? (PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet.ActionIconStyle) credential.data : null) == PrepurchaseCashCardPlanningViewModel.PrepurchaseCardHomeSheet.ActionIconStyle.LEADING_INFO) {
                        gapComposer12.startReplaceGroup(-64295836);
                        String str2 = infoRow.leadingText;
                        TextStyle textStyle = ((Typography) gapComposer12.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                        Painter painter = Icons.InformationFill16.painter(gapComposer12);
                        Colors colors10 = (Colors) gapComposer12.consume(ArcadeThemeKt.LocalColors);
                        if (colors10 == null) {
                            colors10 = re$$ExternalSyntheticOutline0.m(gapComposer12, -1762997026, gapComposer12, false);
                        } else {
                            gapComposer12.startReplaceGroup(-1762997739);
                            gapComposer12.end(false);
                        }
                        zzacp.m2014InlineIconTextQqsJerU(str2, painter, null, colors10.semantic.icon.extraSubtle, null, textStyle, 0L, null, 0, 0, 0, 0, false, RecyclerView.DECELERATION_RATE, gapComposer12, Painter.$stable << 3, 0, 32724);
                        gapComposer12.end(false);
                    } else {
                        gapComposer12.startReplaceGroup(-64050409);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer12, (Modifier) null, ((Typography) gapComposer12.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, infoRow.leadingText, (Map) null, (Function1) null, false);
                        gapComposer12.end(false);
                    }
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                PrepurchaseCashCardPlanningViewModel.PrepurchaseCardPaymentPlanOptionsSheet prepurchaseCardPaymentPlanOptionsSheet = (PrepurchaseCashCardPlanningViewModel.PrepurchaseCardPaymentPlanOptionsSheet) obj3;
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, prepurchaseCardPaymentPlanOptionsSheet.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                TrustElementWidget trustElementWidget = (TrustElementWidget) obj3;
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    String str3 = trustElementWidget.title;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3 == null ? "" : str3, (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                GenericProfileElementViewModel.ButtonWidget buttonWidget = (GenericProfileElementViewModel.ButtonWidget) obj3;
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    String str4 = buttonWidget.title;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str4 == null ? "" : str4, (Map) null, (Function1) null, false);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                OpenSourceViewModel.ArtifactViewModel artifactViewModel = (OpenSourceViewModel.ArtifactViewModel) obj3;
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    String str5 = artifactViewModel.name;
                    if (str5 == null) {
                        str5 = artifactViewModel.artifactId;
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                ProfileHeaderViewModel profileHeaderViewModel = (ProfileHeaderViewModel) obj3;
                Composer composer17 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    ProfileHeaderViewModel.BadgeName badgeName = profileHeaderViewModel.badgeName;
                    String str6 = badgeName.name;
                    String str7 = str6 == null ? "" : str6;
                    if (badgeName.isVerified) {
                        badge = Badge.VERIFIED;
                    } else if (badgeName.isBusiness) {
                        badge = Badge.BUSINESS;
                    }
                    BadgeNameKt.m3726BadgeName6ERogkM(str7, badge, null, 0, gapComposer17, 0, 28);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                SearchPrivacySectionViewEvent.SearchSettingType searchSettingType = (SearchPrivacySectionViewEvent.SearchSettingType) obj3;
                Composer composer18 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    int ordinal2 = searchSettingType.ordinal();
                    if (ordinal2 == 0) {
                        i = 1011990390;
                        i2 = R.string.search_visibility_name;
                    } else if (ordinal2 == 1) {
                        i = 1011992759;
                        i2 = R.string.search_visibility_phone;
                    } else {
                        if (ordinal2 != 2) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer18, 1011989551, false);
                        }
                        i = 1011994935;
                        i2 = R.string.search_visibility_email;
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer18, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, re$$ExternalSyntheticOutline0.m(gapComposer18, i, i2, gapComposer18, false), (Map) null, (Function1) null, false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                UnsupportedSettingViewModel unsupportedSettingViewModel = (UnsupportedSettingViewModel) obj3;
                Composer composer19 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 3) != 2)) {
                    Modifier clip = ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 64.0f), RoundedCornerShapeKt.CircleShape);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = ArcadeThemeKt.LocalColors;
                    Colors colors11 = (Colors) gapComposer19.consume(staticProvidableCompositionLocal3);
                    if (colors11 == null) {
                        colors11 = re$$ExternalSyntheticOutline0.m(gapComposer19, -1762997026, gapComposer19, false);
                    } else {
                        gapComposer19.startReplaceGroup(-1762997739);
                        gapComposer19.end(false);
                    }
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(clip, colors11.semantic.background.brand, ColorKt.RectangleShape), 16.0f);
                    Icons icons4 = unsupportedSettingViewModel.shouldSwitchToBusiness ? Icons.Business32 : Icons.Avatar32;
                    Colors colors12 = (Colors) gapComposer19.consume(staticProvidableCompositionLocal3);
                    if (colors12 == null) {
                        colors12 = re$$ExternalSyntheticOutline0.m(gapComposer19, -1762997026, gapComposer19, false);
                    } else {
                        gapComposer19.startReplaceGroup(-1762997739);
                        gapComposer19.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons4, (String) null, m298padding3ABfNKs, colors12.semantic.icon.inverse, gapComposer19, 48, 0);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                ChannelListViewKt.NotificationSectionView((NotificationSectionViewModel) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                PersonalInfoRow.LegalName legalName = (PersonalInfoRow.LegalName) obj3;
                Composer composer20 = (Composer) obj;
                int intValue20 = ((Integer) obj2).intValue();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 3) != 2)) {
                    gapComposer20.startReplaceGroup(-1844487688);
                    String str8 = legalName.legalName;
                    if (str8.length() == 0) {
                        str8 = Room.stringResource(gapComposer20, R.string.profile_personal_name);
                    }
                    gapComposer20.end(false);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer20, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str8, (Map) null, (Function1) null, false);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                PersonalInfoRow.Address address = (PersonalInfoRow.Address) obj3;
                Composer composer21 = (Composer) obj;
                int intValue21 = ((Integer) obj2).intValue();
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 3) != 2)) {
                    gapComposer21.startReplaceGroup(-1107970135);
                    String str9 = address.address;
                    if (str9.length() == 0) {
                        str9 = Room.stringResource(gapComposer21, R.string.profile_personal_address_hint);
                    }
                    gapComposer21.end(false);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer21, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str9, (Map) null, (Function1) null, false);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                ProfilePrivacyReadyViewModel$CashMeSettingViewModel profilePrivacyReadyViewModel$CashMeSettingViewModel = (ProfilePrivacyReadyViewModel$CashMeSettingViewModel) obj3;
                Composer composer22 = (Composer) obj;
                int intValue22 = ((Integer) obj2).intValue();
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer22, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, profilePrivacyReadyViewModel$CashMeSettingViewModel.description, (Map) null, (Function1) null, false);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                PaymentPlanSummaryViewModel.PurchasesSection.DetailRow detailRow = (PaymentPlanSummaryViewModel.PurchasesSection.DetailRow) obj3;
                Composer composer23 = (Composer) obj;
                int intValue23 = ((Integer) obj2).intValue();
                GapComposer gapComposer23 = (GapComposer) composer23;
                if (gapComposer23.shouldExecute(intValue23 & 1, (intValue23 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer23, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, detailRow.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                SelectPaymentPlanViewModel.TimelineEvent timelineEvent = (SelectPaymentPlanViewModel.TimelineEvent) obj3;
                Composer composer24 = (Composer) obj;
                int intValue24 = ((Integer) obj2).intValue();
                GapComposer gapComposer24 = (GapComposer) composer24;
                if (gapComposer24.shouldExecute(intValue24 & 1, (intValue24 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer24, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, timelineEvent.value, (Map) null, (Function1) null, false);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.OptionsConfigSheet optionsConfigSheet = (SelectPaymentPlanViewModel.SelectPaymentPlanHalfSheet.OptionsConfigSheet) obj3;
                Composer composer25 = (Composer) obj;
                int intValue25 = ((Integer) obj2).intValue();
                GapComposer gapComposer25 = (GapComposer) composer25;
                if (gapComposer25.shouldExecute(intValue25 & 1, (intValue25 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer25, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, optionsConfigSheet.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ PdfPreviewViewKt$$ExternalSyntheticLambda2(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
    }
}
