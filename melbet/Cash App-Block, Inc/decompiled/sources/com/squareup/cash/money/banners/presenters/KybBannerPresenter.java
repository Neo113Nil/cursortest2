package com.squareup.cash.money.banners.presenters;

import androidx.compose.material3.SliderState$drag$2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.appmessages.CardAppMessageViewModel;
import com.squareup.cash.appmessages.InlineAppMessageV2ViewModel;
import com.squareup.cash.appmessages.presenters.CardAppMessagePresenterHelper$Factory$Impl;
import com.squareup.cash.appmessages.presenters.InlineAppMessageV2PresenterHelper$Factory$Impl;
import com.squareup.cash.appmessages.presenters.RealAppMessageActionPerformer$Factory$Impl;
import com.squareup.cash.appmessages.presenters.RealAppMessageActionPresenterHelper;
import com.squareup.cash.businessaccount.kybrestriction.presenters.KybRestrictionBannerPresenter$AssistedInjectionFactory$Impl;
import com.squareup.cash.businessaccount.screens.KybRestrictionBannerScreen;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.CardStudioPresenterV2$MetroFactory;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.education.stories.presenters.EducationStoryPresenter;
import com.squareup.cash.invitations.InviteContactsReferralHeaderModel;
import com.squareup.cash.invitations.InviteContactsReferralRulesViewModel;
import com.squareup.cash.invitations.screens.InviteReferralsRulesBottomSheet;
import com.squareup.cash.money.banners.presenters.KybBannerItemModel;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.moneybot.presenters.plugins.NavigationCardPresenter;
import com.squareup.cash.payments.presenters.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda1;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter$models$1$2;
import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.InviteFriendsEnableReferralText;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public final class KybBannerPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId;
    public final Object kybRestrictionBannerPresenter;

    public KybBannerPresenter(Flow flow, CardAppMessagePresenterHelper$Factory$Impl cardAppMessagePresenterHelper$Factory$Impl, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 2;
        DisclosurePresenter.MetroFactory metroFactory = cardAppMessagePresenterHelper$Factory$Impl.delegateFactory;
        CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) metroFactory.analytics.getValue();
        AppMessageClientService appMessageClientService = (AppMessageClientService) metroFactory.appService.getValue();
        RealAppMessageActionPerformer$Factory$Impl realAppMessageActionPerformer$Factory$Impl = (RealAppMessageActionPerformer$Factory$Impl) metroFactory.blockersNavigator.invoke();
        RealAppMessageActionPresenterHelper realAppMessageActionPresenterHelper = (RealAppMessageActionPresenterHelper) metroFactory.launcher.invoke();
        CoroutineContext coroutineContext = (CoroutineContext) metroFactory.stringManager.lambda.invoke();
        cashAccountDatabaseImpl.getClass();
        appMessageClientService.getClass();
        realAppMessageActionPerformer$Factory$Impl.getClass();
        realAppMessageActionPresenterHelper.getClass();
        coroutineContext.getClass();
        this.kybRestrictionBannerPresenter = new CardStudioPresenter(cashAccountDatabaseImpl, appMessageClientService, realAppMessageActionPerformer$Factory$Impl, realAppMessageActionPresenterHelper, coroutineContext, flow, screenNavigator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16, types: [com.squareup.cash.invitations.InviteContactsReferralHeaderModel$Default] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        InviteContactsReferralHeaderModel.Remote remote;
        int i2 = this.$r8$classId;
        Object obj = this.kybRestrictionBannerPresenter;
        ?? r3 = 0;
        switch (i2) {
            case 0:
                return models(flow, composer);
            case 1:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-1682152289);
                UiCallbackModel models = ((EducationStoryPresenter) obj).models(gapComposer);
                Updater.LaunchedEffect(gapComposer, flow, new SliderState$drag$2(flow, (Continuation) (r3 == true ? 1 : 0), models, 18));
                Object obj2 = models.model;
                gapComposer.end(false);
                return obj2;
            case 2:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-664770552);
                CardAppMessageViewModel models2 = ((CardStudioPresenter) obj).models(flow, gapComposer2);
                gapComposer2.end(false);
                return models2;
            case 3:
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(-1813627243);
                InlineAppMessageV2ViewModel models3 = ((DisclosurePresenter) obj).models(flow, (Composer) gapComposer3);
                gapComposer3.end(false);
                return models3;
            case 4:
                flow.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(1544298818);
                InviteReferralsRulesBottomSheet inviteReferralsRulesBottomSheet = (InviteReferralsRulesBottomSheet) obj;
                InviteFriendsEnableReferralText inviteFriendsEnableReferralText = inviteReferralsRulesBottomSheet.enableReferralText;
                Image image = inviteFriendsEnableReferralText != null ? inviteFriendsEnableReferralText.image : null;
                if (image == null) {
                    remote = InviteContactsReferralHeaderModel.Default.INSTANCE;
                } else {
                    Integer num = inviteFriendsEnableReferralText.image_width;
                    if (num == null) {
                        Path$$ExternalSyntheticBUOutline0.m$1(image, "missing image_width for ");
                        return null;
                    }
                    int intValue = num.intValue();
                    Integer num2 = inviteFriendsEnableReferralText.image_height;
                    if (num2 == null) {
                        Path$$ExternalSyntheticBUOutline0.m$1(image, "missing image_height for ");
                        return null;
                    }
                    remote = new InviteContactsReferralHeaderModel.Remote(image, intValue, num2.intValue());
                }
                InviteFriendsEnableReferralText inviteFriendsEnableReferralText2 = inviteReferralsRulesBottomSheet.enableReferralText;
                String str = inviteFriendsEnableReferralText2 != null ? inviteFriendsEnableReferralText2.title : null;
                String str2 = inviteFriendsEnableReferralText2 != null ? inviteFriendsEnableReferralText2.subtitle : null;
                List<String> list = inviteFriendsEnableReferralText2 != null ? inviteFriendsEnableReferralText2.redemption_steps : null;
                if (list == null) {
                    list = EmptyList.INSTANCE;
                }
                InviteContactsReferralRulesViewModel inviteContactsReferralRulesViewModel = new InviteContactsReferralRulesViewModel(remote, str, str2, list, inviteFriendsEnableReferralText2 != null ? inviteFriendsEnableReferralText2.footer : null);
                gapComposer4.end(false);
                return inviteContactsReferralRulesViewModel;
            default:
                m3608models(flow, composer, i);
                return Unit.INSTANCE;
        }
    }

    public KybBannerPresenter(InviteReferralsRulesBottomSheet inviteReferralsRulesBottomSheet) {
        this.$r8$classId = 4;
        inviteReferralsRulesBottomSheet.getClass();
        this.kybRestrictionBannerPresenter = inviteReferralsRulesBottomSheet;
    }

    public /* synthetic */ KybBannerPresenter(Object obj, int i) {
        this.$r8$classId = i;
        this.kybRestrictionBannerPresenter = obj;
    }

    public KybBannerPresenter(KybRestrictionBannerPresenter$AssistedInjectionFactory$Impl kybRestrictionBannerPresenter$AssistedInjectionFactory$Impl, CoroutineScope coroutineScope, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 0;
        this.kybRestrictionBannerPresenter = kybRestrictionBannerPresenter$AssistedInjectionFactory$Impl.create(screenNavigator, new KybRestrictionBannerScreen(new MoneyTabScreen(null), KybEligibilityWarning.RestrictedFeature.RESTRICTED_FEATURE_MONEY));
    }

    public KybBannerPresenter(Flow flow, InlineAppMessageV2PresenterHelper$Factory$Impl inlineAppMessageV2PresenterHelper$Factory$Impl, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 3;
        CardStudioPresenterV2$MetroFactory cardStudioPresenterV2$MetroFactory = inlineAppMessageV2PresenterHelper$Factory$Impl.delegateFactory;
        CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) cardStudioPresenterV2$MetroFactory.cashDatabase.getValue();
        AppMessageClientService appMessageClientService = (AppMessageClientService) cardStudioPresenterV2$MetroFactory.appConfig.getValue();
        RealAppMessageActionPerformer$Factory$Impl realAppMessageActionPerformer$Factory$Impl = (RealAppMessageActionPerformer$Factory$Impl) cardStudioPresenterV2$MetroFactory.deviceOrientationProvider.invoke();
        CoroutineContext coroutineContext = (CoroutineContext) cardStudioPresenterV2$MetroFactory.ioContext.lambda.invoke();
        cashAccountDatabaseImpl.getClass();
        appMessageClientService.getClass();
        realAppMessageActionPerformer$Factory$Impl.getClass();
        coroutineContext.getClass();
        this.kybRestrictionBannerPresenter = new DisclosurePresenter(cashAccountDatabaseImpl, appMessageClientService, realAppMessageActionPerformer$Factory$Impl, coroutineContext, flow, screenNavigator);
    }

    /* renamed from: models, reason: collision with other method in class */
    public void m3608models(Flow flow, Composer composer, int i) {
        int i2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-887297122);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(flow) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Updater.LaunchedEffect(gapComposer, flow, new SelectPaymentPlanBlockerPresenter$models$1$2(flow, null, this, i3));
            boolean changedInstance = gapComposer.changedInstance(this);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(this, 26);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.DisposableEffect("finish-activity", (Function1) rememberedValue, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OpenSourceKt$$ExternalSyntheticLambda1(this, flow, i, 23);
        }
    }

    public KybBannerItemModel models(Flow flow, Composer composer) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-238317706);
        UiCallbackModel models = ((NavigationCardPresenter) this.kybRestrictionBannerPresenter).models(gapComposer);
        boolean changed = gapComposer.changed(models);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            if (models.model != null) {
                rememberedValue = new KybBannerItemModel.Available(models);
            } else {
                rememberedValue = KybBannerItemModel.Unavailable.INSTANCE;
            }
            gapComposer.updateRememberedValue(rememberedValue);
        }
        KybBannerItemModel kybBannerItemModel = (KybBannerItemModel) rememberedValue;
        gapComposer.end(false);
        return kybBannerItemModel;
    }
}
