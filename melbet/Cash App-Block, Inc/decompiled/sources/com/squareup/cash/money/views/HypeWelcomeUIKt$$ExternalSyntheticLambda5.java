package com.squareup.cash.money.views;

import androidx.activity.result.PickVisualMediaRequestKt;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DatePickerStateImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.presenters.home.LocalHomeGeoPresenter$$ExternalSyntheticLambda2;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.compose.UtilsKt$$ExternalSyntheticLambda0;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.EmbeddedHeaderScope;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.RealCellActivityAvatarScope;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.components.list.ListUnorderedScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.investing.viewmodels.InvestingAboutContentModel;
import com.squareup.cash.investing.viewmodels.InvestingDetailRowContentModel;
import com.squareup.cash.investing.viewmodels.SectionMoreInfoViewModel;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingRecurringFrequencyPickerViewModel;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingRecurringPurchaseReceiptViewModel;
import com.squareup.cash.investingcrypto.viewmodels.common.orders.PeriodSelectionViewModel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsArticleViewModel;
import com.squareup.cash.invitations.InvitationSuccessToastViewModel;
import com.squareup.cash.invitations.InviteContactsViewModel;
import com.squareup.cash.merchant.viewmodels.MerchantBlockingViewModel;
import com.squareup.cash.merchant.viewmodels.MerchantInfoFeedbackViewModel;
import com.squareup.cash.merchant.views.components.ButtonConfig;
import com.squareup.cash.money.booklet.CollapsibleDetailsSection;
import com.squareup.cash.money.booklet.ListUnorderedCardSection;
import com.squareup.cash.money.booklet.ListUnorderedSection;
import com.squareup.cash.money.booklet.MoneyTabBookletViewModel;
import com.squareup.cash.money.viewmodels.HypeWelcomeModel;
import com.squareup.cash.money.viewmodels.api.ViewModel;
import com.squareup.cash.moneybot.genie.MoneybotScaffoldViewKt;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.genie.protos.MoneybotScaffold;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel;
import com.squareup.cash.moneybot.viewmodels.amountinput.MoneybotAmountInputViewModel;
import com.squareup.cash.moneybot.viewmodels.feedback.MoneybotFeedbackViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.ActionCardViewModel;
import com.squareup.cash.moneybot.viewmodels.plugins.CellActionCardViewModel;
import com.squareup.cash.wallet.views.CardTransitionKt;
import com.squareup.protos.franklin.ui.LimitsPageletInlineMessage;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class HypeWelcomeUIKt$$ExternalSyntheticLambda5 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ HypeWelcomeUIKt$$ExternalSyntheticLambda5(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    private final Object invoke$com$squareup$cash$moneybot$views$menu$OpenSessionByIdDialogKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        TextFieldState textFieldState = (TextFieldState) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((ColumnScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            String stringResource = Room.stringResource(gapComposer, R.string.moneybot_open_chat_session_by_id_dialog_hint);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            InputFieldKt.InputField(textFieldState, SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2), false, false, false, null, null, null, null, stringResource, new KeyboardOptions(0, (Boolean) null, 1, 7, (Boolean) null, 115), null, null, null, null, null, gapComposer, 0, 6, 63996);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$moneybot$views$plugins$ActionCardKt$$ExternalSyntheticLambda10(Object obj, Object obj2, Object obj3) {
        ActionCardViewModel.ButtonGroup buttonGroup = (ActionCardViewModel.ButtonGroup) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonGroup.primaryButton.text, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$moneybot$views$plugins$ActionCardKt$$ExternalSyntheticLambda8(Object obj, Object obj2, Object obj3) {
        ActionCardViewModel.ButtonGroup.Button button = (ActionCardViewModel.ButtonGroup.Button) this.f$0;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((RowScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button.text, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Icons icons;
        long j;
        Color m;
        long j2;
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i2 = 0;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                HypeWelcomeModel hypeWelcomeModel = (HypeWelcomeModel) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    String str = hypeWelcomeModel.customNotifyButtonText;
                    if (str == null) {
                        str = re$$ExternalSyntheticOutline0.m(gapComposer, -25230670, R.string.hype_welcome_notify_me, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-25231662);
                        gapComposer.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                InvestingCryptoNewsArticleViewModel investingCryptoNewsArticleViewModel = (InvestingCryptoNewsArticleViewModel) obj4;
                RealCellActivityAvatarScope realCellActivityAvatarScope = (RealCellActivityAvatarScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                realCellActivityAvatarScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(realCellActivityAvatarScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    Color forTheme = ThemablesKt.forTheme(investingCryptoNewsArticleViewModel.accentColor, gapComposer2);
                    long j3 = forTheme != null ? forTheme.value : Color.Unspecified;
                    String urlForTheme = ThemablesKt.urlForTheme(investingCryptoNewsArticleViewModel.avatar, gapComposer2);
                    RealImageLoader realImageLoader = (RealImageLoader) gapComposer2.consume(LocalImageLoaderKt.LocalImageLoader);
                    realImageLoader.getClass();
                    realCellActivityAvatarScope.Avatar(new AvatarEntry("", j3, null, new AvatarImage.Remote.Image(urlForTheme, false, null, 0L, new UtilsKt$$ExternalSyntheticLambda0(realImageLoader, r15 ? 1 : 0), 62), investingCryptoNewsArticleViewModel.provider, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), gapComposer2, (intValue2 << 6) & 896);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                InvestingRecurringFrequencyPickerViewModel investingRecurringFrequencyPickerViewModel = (InvestingRecurringFrequencyPickerViewModel) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((InvestingRecurringFrequencyPickerViewModel.Content) investingRecurringFrequencyPickerViewModel).minPurchaseAmountMessage, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                InvestingRecurringPurchaseReceiptViewModel investingRecurringPurchaseReceiptViewModel = (InvestingRecurringPurchaseReceiptViewModel) obj4;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((InvestingRecurringPurchaseReceiptViewModel.Content) investingRecurringPurchaseReceiptViewModel).cancelButtonLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                SectionMoreInfoViewModel sectionMoreInfoViewModel = (SectionMoreInfoViewModel) obj4;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, sectionMoreInfoViewModel.closeText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                InvestingAboutContentModel investingAboutContentModel = (InvestingAboutContentModel) obj4;
                ListUnorderedScope listUnorderedScope = (ListUnorderedScope) obj;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                listUnorderedScope.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer6).changed(listUnorderedScope) ? 4 : 2;
                }
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18)) {
                    ArrayList arrayList = investingAboutContentModel.detailRows.rows;
                    int size = arrayList.size();
                    while (i2 < size) {
                        InvestingDetailRowContentModel.Row row = (InvestingDetailRowContentModel.Row) arrayList.get(i2);
                        listUnorderedScope.ListUnorderedItem(new AnnotatedString(row.key), SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, i2 > 0 ? 8.0f : 0.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), (Icons) null, new AnnotatedString(row.value), (AnnotatedString) null, gapComposer6, (intValue6 << 15) & 458752, 20);
                        i2++;
                    }
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                UiCallbackModel uiCallbackModel = (UiCallbackModel) obj4;
                EmbeddedHeaderScope embeddedHeaderScope = (EmbeddedHeaderScope) obj;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                embeddedHeaderScope.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((GapComposer) composer7).changed(embeddedHeaderScope) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                    String stringResource = Room.stringResource(gapComposer7, R.string.activity_title);
                    String stringResource2 = Room.stringResource(gapComposer7, R.string.investing_components_view_all_activity);
                    boolean changedInstance = gapComposer7.changedInstance(uiCallbackModel);
                    Object rememberedValue = gapComposer7.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new LocalHomeGeoPresenter$$ExternalSyntheticLambda2(uiCallbackModel, 1);
                        gapComposer7.updateRememberedValue(rememberedValue);
                    }
                    embeddedHeaderScope.DefaultHeader((intValue7 << 9) & 7168, 0, gapComposer7, stringResource, stringResource2, (Function0) rememberedValue);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                PeriodSelectionViewModel periodSelectionViewModel = (PeriodSelectionViewModel) obj4;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((PeriodSelectionViewModel.ContentModel) periodSelectionViewModel).submitLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                InviteContactsViewModel.PromotionUpsellViewModel promotionUpsellViewModel = (InviteContactsViewModel.PromotionUpsellViewModel) obj4;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    String str2 = promotionUpsellViewModel.cta;
                    if (str2 == null) {
                        str2 = "";
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                InvitationSuccessToastViewModel invitationSuccessToastViewModel = (InvitationSuccessToastViewModel) obj4;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                PickVisualMediaRequestKt.InviteSuccessToast(6, (Composer) obj2, SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 6.0f, 2), invitationSuccessToastViewModel.inviteeName, invitationSuccessToastViewModel.subtitle);
                return Unit.INSTANCE;
            case 10:
                LimitsPageletInlineMessage.Icon icon = (LimitsPageletInlineMessage.Icon) obj4;
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
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
                    Updater.m576setimpl(gapComposer10, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer10, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer10, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer10, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer10, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    AvatarSize avatarSize = AvatarSize.Size64;
                    int ordinal = icon.ordinal();
                    if (ordinal == 0) {
                        icons = Icons.LockLockedFill32;
                    } else if (ordinal == 1) {
                        icons = Icons.TickerDown24;
                    } else if (ordinal == 2) {
                        icons = Icons.Failed32;
                    } else {
                        if (ordinal != 3 && ordinal != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        icons = Icons.Alert32;
                    }
                    AvatarImage.LocalIcon localIcon = new AvatarImage.LocalIcon(icons, 0L, 6);
                    int ordinal2 = icon.ordinal();
                    if (ordinal2 == 0) {
                        gapComposer10.startReplaceGroup(-331314044);
                        Colors colors = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                        } else {
                            gapComposer10.startReplaceGroup(-1762997739);
                            gapComposer10.end(false);
                        }
                        j = colors.semantic.background.brand;
                        gapComposer10.end(false);
                    } else {
                        if (ordinal2 != 1 && ordinal2 != 2 && ordinal2 != 3 && ordinal2 != 4) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer10, -331316579, false);
                        }
                        gapComposer10.startReplaceGroup(-331308603);
                        Colors colors2 = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                        } else {
                            gapComposer10.startReplaceGroup(-1762997739);
                            gapComposer10.end(false);
                        }
                        j = colors2.semantic.background.danger;
                        gapComposer10.end(false);
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize, "", j, (String) null, (Modifier) null, (AvatarImage) localIcon, (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer10, 3126, 0, 2000);
                    gapComposer10.end(true);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                MerchantBlockingViewModel.MerchantBlockingSectionViewModel.SectionList.SectionLoaded.SectionRow sectionRow = (MerchantBlockingViewModel.MerchantBlockingSectionViewModel.SectionList.SectionLoaded.SectionRow) obj4;
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    MerchantBlockingViewModel.MerchantBlockingSectionViewModel.SectionList.SectionLoaded.Button button = sectionRow.button;
                    String str3 = button.label;
                    com.squareup.protos.cash.ui.Color color = button.color;
                    if (color == null) {
                        gapComposer11.startReplaceGroup(-1459043695);
                        gapComposer11.end(false);
                        m = null;
                    } else {
                        m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer11, 1754049392, color, gapComposer11, false);
                    }
                    if (m == null) {
                        gapComposer11.startReplaceGroup(1754050894);
                        Colors colors3 = (Colors) gapComposer11.consume(ArcadeThemeKt.LocalColors);
                        if (colors3 == null) {
                            colors3 = re$$ExternalSyntheticOutline0.m(gapComposer11, -1762997026, gapComposer11, false);
                        } else {
                            gapComposer11.startReplaceGroup(-1762997739);
                            gapComposer11.end(false);
                        }
                        j2 = colors3.semantic.text.standard;
                        gapComposer11.end(false);
                    } else {
                        gapComposer11.startReplaceGroup(1754048817);
                        gapComposer11.end(false);
                        j2 = m.value;
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, j2, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection selection = (MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Selection) obj4;
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, selection.buttonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Confirmation confirmation = (MerchantInfoFeedbackViewModel.MerchantInfoFeedbackContentViewModel.Confirmation) obj4;
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, confirmation.buttonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                ButtonConfig buttonConfig = (ButtonConfig) obj4;
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonConfig.text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                CollapsibleDetailsSection.CollapsibleDetail collapsibleDetail = (CollapsibleDetailsSection.CollapsibleDetail) obj4;
                Composer composer15 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer15, 0);
                GapComposer gapComposer15 = (GapComposer) composer15;
                int hashCode2 = Long.hashCode(gapComposer15.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer15.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(composer15, companion);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer16 = (GapComposer) composer15;
                if (gapComposer16.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer16.startReusableNode();
                if (gapComposer16.inserting) {
                    gapComposer16.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer16.useNode();
                }
                Updater.m576setimpl(composer15, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer15, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer15, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer15, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer15, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                ((DefaultSizes) gapComposer16.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth2, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                String str4 = collapsibleDetail.description;
                TextStyle textStyle = ((Typography) gapComposer16.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                Colors colors4 = (Colors) gapComposer16.consume(ArcadeThemeKt.LocalColors);
                if (colors4 == null) {
                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer16, -1762997026, gapComposer16, false);
                } else {
                    gapComposer16.startReplaceGroup(-1762997739);
                    gapComposer16.end(false);
                }
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors4.semantic.text.subtle, composer15, m300paddingVpY3zN4$default, textStyle, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                gapComposer16.end(true);
                return Unit.INSTANCE;
            case 16:
                ListUnorderedCardSection listUnorderedCardSection = (ListUnorderedCardSection) obj4;
                ListUnorderedScope listUnorderedScope2 = (ListUnorderedScope) obj;
                Composer composer16 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                listUnorderedScope2.getClass();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= ((GapComposer) composer16).changed(listUnorderedScope2) ? 4 : 2;
                }
                GapComposer gapComposer17 = (GapComposer) composer16;
                if (gapComposer17.shouldExecute(intValue15 & 1, (intValue15 & 19) != 18)) {
                    for (ListUnorderedSection.ListUnorderedItem listUnorderedItem : listUnorderedCardSection.items) {
                        zzd zzdVar = Icons.Companion;
                        String str5 = listUnorderedItem.iconId;
                        zzdVar.getClass();
                        listUnorderedScope2.ListUnorderedItem(new AnnotatedString(listUnorderedItem.label), (Modifier) null, zzd.get(str5), (AnnotatedString) null, (AnnotatedString) null, gapComposer17, (intValue15 << 15) & 458752, 26);
                    }
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                ListUnorderedSection listUnorderedSection = (ListUnorderedSection) obj4;
                ListUnorderedScope listUnorderedScope3 = (ListUnorderedScope) obj;
                Composer composer17 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                listUnorderedScope3.getClass();
                if ((intValue16 & 6) == 0) {
                    intValue16 |= ((GapComposer) composer17).changed(listUnorderedScope3) ? 4 : 2;
                }
                GapComposer gapComposer18 = (GapComposer) composer17;
                if (gapComposer18.shouldExecute(intValue16 & 1, (intValue16 & 19) != 18)) {
                    for (ListUnorderedSection.ListUnorderedItem listUnorderedItem2 : listUnorderedSection.items) {
                        zzd zzdVar2 = Icons.Companion;
                        String str6 = listUnorderedItem2.iconId;
                        zzdVar2.getClass();
                        listUnorderedScope3.ListUnorderedItem(new AnnotatedString(listUnorderedItem2.label), (Modifier) null, zzd.get(str6), (AnnotatedString) null, (AnnotatedString) null, gapComposer18, (intValue16 << 15) & 458752, 26);
                    }
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                MoneyTabBookletViewModel moneyTabBookletViewModel = (MoneyTabBookletViewModel) obj4;
                Composer composer18 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer18;
                if (gapComposer19.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer19, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, moneyTabBookletViewModel.ctaLabel, (Map) null, (Function1) null, false);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                ViewModel.HeaderModel headerModel = (ViewModel.HeaderModel) obj4;
                Composer composer19 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer19;
                if (gapComposer20.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    Modifier evolutionBackground = HypeWelcomeUIKt.evolutionBackground(CardTransitionKt.cardSlideInOut(companion, gapComposer20), null, gapComposer20, 3);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode3 = Long.hashCode(gapComposer20.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer20.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer20, evolutionBackground);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer20.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer20.startReusableNode();
                    if (gapComposer20.inserting) {
                        gapComposer20.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer20.useNode();
                    }
                    Updater.m576setimpl(gapComposer20, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer20, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer20, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer20, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer20, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    HypeWelcomeUIKt.UI(headerModel.header, headerModel.id, gapComposer20, 0);
                    gapComposer20.end(true);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                DatePickerStateImpl datePickerStateImpl = (DatePickerStateImpl) obj4;
                Composer composer20 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer20;
                if (gapComposer21.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    DatePickerKt.DatePicker(datePickerStateImpl, null, null, null, null, null, false, null, gapComposer21, 0);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                MoneybotScaffold.Evidence.Breakdown breakdown = (MoneybotScaffold.Evidence.Breakdown) obj4;
                Composer composer21 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer22 = (GapComposer) composer21;
                if (gapComposer22.shouldExecute(intValue20 & 1, (intValue20 & 17) != 16)) {
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(12.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer22, 6);
                    int hashCode4 = Long.hashCode(gapComposer22.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer22.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer22, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer22.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer22.startReusableNode();
                    if (gapComposer22.inserting) {
                        gapComposer22.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer22.useNode();
                    }
                    Updater.m576setimpl(gapComposer22, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer22, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer22, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer22, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer22, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    MoneybotScaffoldViewKt.BreakdownChart(breakdown.chart, gapComposer22, 0);
                    gapComposer22.startReplaceGroup(-1317796334);
                    Iterator it = breakdown.rows.iterator();
                    while (it.hasNext()) {
                        MoneybotScaffoldViewKt.CategoryRow((MoneybotScaffold.Evidence.Breakdown.CategoryRow) it.next(), gapComposer22, 0);
                    }
                    gapComposer22.end(false);
                    gapComposer22.end(true);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                MoneybotAmountInputViewModel moneybotAmountInputViewModel = (MoneybotAmountInputViewModel) obj4;
                Composer composer22 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer22;
                if (gapComposer23.shouldExecute(intValue21 & 1, (intValue21 & 17) != 16)) {
                    String str7 = moneybotAmountInputViewModel.ctaText;
                    if (str7 == null) {
                        str7 = re$$ExternalSyntheticOutline0.m(gapComposer23, -1413916400, R.string.moneybot_amount_input_done_cta, gapComposer23, false);
                    } else {
                        gapComposer23.startReplaceGroup(-1413916927);
                        gapComposer23.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer23, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str7, (Map) null, (Function1) null, false);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                MoneybotFeedbackViewModel moneybotFeedbackViewModel = (MoneybotFeedbackViewModel) obj4;
                Composer composer23 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer24 = (GapComposer) composer23;
                if (gapComposer24.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer24, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, moneybotFeedbackViewModel.submitButtonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                MoneybotFeedbackViewModel.ReasonOption reasonOption = (MoneybotFeedbackViewModel.ReasonOption) obj4;
                Composer composer24 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer25 = (GapComposer) composer24;
                if (gapComposer25.shouldExecute(intValue23 & 1, (intValue23 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer25, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, reasonOption.label, (Map) null, (Function1) null, false);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                MoneybotHomeViewModel.NextBestAction nextBestAction = (MoneybotHomeViewModel.NextBestAction) obj4;
                Composer composer25 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer26 = (GapComposer) composer25;
                if (gapComposer26.shouldExecute(intValue24 & 1, (intValue24 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer26, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, nextBestAction.cta, (Map) null, (Function1) null, false);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                return invoke$com$squareup$cash$moneybot$views$menu$OpenSessionByIdDialogKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 27:
                return invoke$com$squareup$cash$moneybot$views$plugins$ActionCardKt$$ExternalSyntheticLambda10(obj, obj2, obj3);
            case 28:
                return invoke$com$squareup$cash$moneybot$views$plugins$ActionCardKt$$ExternalSyntheticLambda8(obj, obj2, obj3);
            default:
                CellActionCardViewModel.ButtonGroup.Button button2 = (CellActionCardViewModel.ButtonGroup.Button) obj4;
                Composer composer26 = (Composer) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer27 = (GapComposer) composer26;
                if (gapComposer27.shouldExecute(intValue25 & 1, (intValue25 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer27, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, button2.text, (Map) null, (Function1) null, false);
                } else {
                    gapComposer27.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
