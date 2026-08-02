package com.squareup.cash.payments.presenters;

import android.animation.Animator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.icu.text.MessageFormat;
import android.view.View;
import androidx.collection.ArrayMap;
import androidx.compose.foundation.layout.OffsetKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.lazy.LazyListMeasuredItem;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.platform.ShapeContainingUtilKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1;
import androidx.room.util.DBUtil;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventName;
import com.squareup.cash.R;
import com.squareup.cash.agents.applets.views.AgentsHomeViewKt$AgentsHome$lambda$1$0$$inlined$items$3;
import com.squareup.cash.arcade.components.RealSegmentedControlScope;
import com.squareup.cash.arcade.components.list.ListOrderedStandardItemsScope;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.borrow.views.BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2;
import com.squareup.cash.cdf.asset.PersonalizationOrigin;
import com.squareup.cash.cdf.notificationssettings.AliasType;
import com.squareup.cash.cdf.notificationssettings.ConfirmationSheetOrigin;
import com.squareup.cash.cdf.notificationssettings.NotificationsSettingsAddAlias;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewEvent$Click;
import com.squareup.cash.money.banners.presenters.KybBannerPresenter;
import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.moneybot.views.rawmessages.RawMessagesViewKt$RawMessagesView$lambda$0$1$0$$inlined$items$default$4;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.multiplatform.accentcolors.AccentColorsKt;
import com.squareup.cash.music.views.MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3;
import com.squareup.cash.overlays.RealOverlayLayer;
import com.squareup.cash.overlays.RealOverlayLayer$RealSession$transitionIn$lambda$0$$inlined$doOnEnd$1;
import com.squareup.cash.paychecks.views.MaxPercentCappedKeypadListener;
import com.squareup.cash.paymentpad.viewmodels.ExchangeRatePreview;
import com.squareup.cash.payments.screens.InstrumentSelectionData;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.viewmodels.Element;
import com.squareup.cash.payments.viewmodels.HeaderAvatar;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestHelpViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPayersSheetViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentStickersViewModel;
import com.squareup.cash.payments.viewmodels.PreviewSticker;
import com.squareup.cash.payments.viewmodels.Sticker;
import com.squareup.cash.pdf.backend.real.PdfBitmapRender;
import com.squareup.cash.pdf.view.PdfPreviewViewKt;
import com.squareup.cash.plaid.api.Institution;
import com.squareup.cash.plaid.api.PlaidLinkEvent;
import com.squareup.cash.plaid.api.PlaidLinkParams;
import com.squareup.cash.pools.applets.presenters.ActivePool;
import com.squareup.cash.pools.applets.presenters.PoolIcon;
import com.squareup.cash.pools.applets.presenters.PoolsAppletTileModel;
import com.squareup.cash.pools.backend.api.Participant;
import com.squareup.cash.pools.backend.api.ParticipantType;
import com.squareup.cash.pools.backend.api.PoolAppletPreview;
import com.squareup.cash.pools.backend.api.PoolsAppletData;
import com.squareup.cash.pools.viewmodels.PoolParticipant;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphTimeRangeViewModel;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphTabsView;
import com.squareup.cash.profile.presenters.notifications.NotificationSectionPresenter;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.AliasItem;
import com.squareup.cash.profile.viewmodels.ContactMethodSectionViewEvent;
import com.squareup.cash.profile.viewmodels.ContactMethodType;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter;
import com.squareup.cash.qrcodes.viewmodels.CashQrScannerViewModel;
import com.squareup.cash.qrcodes.views.CameraXPreviewKt;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.cash.recipients.viewmodels.SectionViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.score.applets.views.ScoreAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.screens.RedactedParcelableList;
import com.squareup.cash.tax.applet.views.TaxesAppletTile;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.contour.YInt;
import com.squareup.moshi.LinkedHashTreeMap;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.AppCreationActivity;
import com.squareup.util.cash.ColorsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import okhttp3.internal.Tags;
import squareup.cash.paychecks.UiConfiguration;

/* loaded from: classes6.dex */
public final /* synthetic */ class UtilsKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ UtilsKt$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        String str;
        int i;
        Image image;
        AliasType aliasType;
        UiAlias.Type type2;
        AliasType aliasType2;
        BlockersScreens.RegisterAliasScreen startRegisterSmsFlow$default;
        int i2 = this.$r8$classId;
        int i3 = 25;
        PromotedAppletTileViewEvent$Click promotedAppletTileViewEvent$Click = PromotedAppletTileViewEvent$Click.INSTANCE;
        Object obj2 = this.f$0;
        switch (i2) {
            case 0:
                PaymentScreens.PersonalizePayment personalizePayment = (PaymentScreens.PersonalizePayment) obj2;
                AskedQuestion askedQuestion = (AskedQuestion) obj;
                askedQuestion.getClass();
                UUID uuid = personalizePayment.paymentToken;
                Money money = personalizePayment.amount;
                Redacted redacted = personalizePayment.recipients;
                Redacted redacted2 = personalizePayment.note;
                InstrumentSelectionData instrumentSelectionData = personalizePayment.instrumentSelection;
                boolean z2 = personalizePayment.ignoreDuplicate;
                String str2 = personalizePayment.referrer;
                String str3 = personalizePayment.launchUrl;
                AppCreationActivity appCreationActivity = personalizePayment.appCreationActivity;
                String str4 = personalizePayment.exchangeRatesToken;
                Screen screen = personalizePayment.exitScreen;
                boolean z3 = personalizePayment.creditCardLinkingEnabled;
                long j = personalizePayment.creditCardFeeBps;
                boolean z4 = personalizePayment.cashBalanceEnabled;
                ClientScenario clientScenario = personalizePayment.clientScenario;
                String str5 = personalizePayment.flowToken;
                BlockersData.MoneybotContext moneybotContext = personalizePayment.moneybotContext;
                boolean z5 = personalizePayment.forceHideTextOptions;
                PersonalizationOrigin personalizationOrigin = personalizePayment.origin;
                uuid.getClass();
                money.getClass();
                redacted.getClass();
                redacted2.getClass();
                appCreationActivity.getClass();
                screen.getClass();
                clientScenario.getClass();
                str5.getClass();
                personalizationOrigin.getClass();
                return new PaymentScreens.PersonalizePayment(uuid, money, redacted, redacted2, instrumentSelectionData, z2, str2, str3, appCreationActivity, str4, screen, z3, j, z4, clientScenario, str5, moneybotContext, z5, personalizationOrigin, askedQuestion);
            case 1:
                RealOverlayLayer.LifecycleExitCallback lifecycleExitCallback = (RealOverlayLayer.LifecycleExitCallback) obj2;
                RealOverlayLayer.RealSession realSession = (RealOverlayLayer.RealSession) obj;
                realSession.getClass();
                if (realSession.lifecycleExitCallback != lifecycleExitCallback) {
                    z = false;
                } else {
                    Animator exitAnimator = realSession.overlay.exitAnimator();
                    exitAnimator.addListener(new RealOverlayLayer$RealSession$transitionIn$lambda$0$$inlined$doOnEnd$1(realSession.this$0, realSession, 2));
                    exitAnimator.start();
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                TaxesAppletTile taxesAppletTile = (TaxesAppletTile) obj2;
                PromotedAppletTileViewEvent$Click promotedAppletTileViewEvent$Click2 = (PromotedAppletTileViewEvent$Click) obj;
                promotedAppletTileViewEvent$Click2.getClass();
                if (promotedAppletTileViewEvent$Click2.equals(promotedAppletTileViewEvent$Click)) {
                    ((TaxesAppletViewsModule$$ExternalSyntheticLambda1) taxesAppletTile.onClick).invoke();
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 3:
                UiConfiguration uiConfiguration = (UiConfiguration) obj;
                uiConfiguration.getClass();
                return ShapeContainingUtilKt.toPaychecksUiConfiguration((LocalHomePresenter) obj2, uiConfiguration);
            case 4:
                UiConfiguration uiConfiguration2 = (UiConfiguration) obj;
                uiConfiguration2.getClass();
                return ShapeContainingUtilKt.toPaychecksUiConfiguration((WorkHomePresenter) obj2, uiConfiguration2).distributionSummary.helpSheet;
            case 5:
                UiConfiguration uiConfiguration3 = (UiConfiguration) obj;
                uiConfiguration3.getClass();
                return ShapeContainingUtilKt.toPaychecksUiConfiguration((LocalHomePresenter) obj2, uiConfiguration3);
            case 6:
                UiConfiguration uiConfiguration4 = (UiConfiguration) obj;
                uiConfiguration4.getClass();
                return ShapeContainingUtilKt.toPaychecksUiConfiguration((LocalHomePresenter) obj2, uiConfiguration4);
            case 7:
                MaxPercentCappedKeypadListener maxPercentCappedKeypadListener = (MaxPercentCappedKeypadListener) obj2;
                KeypadViewModel.KeypadKey keypadKey = (KeypadViewModel.KeypadKey) obj;
                keypadKey.getClass();
                if (keypadKey.isDigit()) {
                    maxPercentCappedKeypadListener.onDigit(Integer.parseInt(keypadKey.value));
                } else if (keypadKey.isClear()) {
                    maxPercentCappedKeypadListener.onBackspace();
                } else if (keypadKey.isSeparator()) {
                    maxPercentCappedKeypadListener.onDecimal();
                }
                return Unit.INSTANCE;
            case 8:
                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj;
                layoutNodeDrawScope.getClass();
                Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(layoutNodeDrawScope.canvasDrawScope.drawContext.getCanvas());
                int saveLayer = nativeCanvas.saveLayer(null, null);
                ((OffsetKt$$ExternalSyntheticLambda0) obj2).invoke(layoutNodeDrawScope);
                nativeCanvas.restoreToCount(saveLayer);
                return Unit.INSTANCE;
            case 9:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, ((ExchangeRatePreview) obj2).contentDescription);
                return Unit.INSTANCE;
            case 10:
                ((DisposableEffectScope) obj).getClass();
                return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1((PersonalizePaymentRecipientPresenter) obj2, i3);
            case 11:
                LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) obj;
                lazyListMeasuredItem.getClass();
                return Boolean.valueOf(lazyListMeasuredItem.key.equals(((RecipientViewModel) obj2).listUniqueId));
            case 12:
                return ((RecipientViewModel) ((SectionViewModel) obj2).recipients.get(((Integer) obj).intValue())).listUniqueId;
            case 13:
                ListOrderedStandardItemsScope listOrderedStandardItemsScope = (ListOrderedStandardItemsScope) obj;
                listOrderedStandardItemsScope.getClass();
                Iterator it = ((NearbyPayRequestHelpViewModel) obj2).steps.iterator();
                while (it.hasNext()) {
                    listOrderedStandardItemsScope.item(new ComposableLambdaImpl(new PoolCreateViewKt$$ExternalSyntheticLambda5((String) it.next(), i3), true, -1027748281), null);
                }
                return Unit.INSTANCE;
            case 14:
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                List list = ((NearbyPayersSheetViewModel) obj2).payers;
                lazyListScope.items(list.size(), null, new MusicViewKt$LoadedMusicContent$lambda$1$0$0$0$$inlined$items$default$3(list, 6), new ComposableLambdaImpl(new RawMessagesViewKt$RawMessagesView$lambda$0$1$0$$inlined$items$default$4(list, 1), true, 802480018));
                return Unit.INSTANCE;
            case 15:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                reusableGraphicsLayerScope.setRotationZ(((PreviewSticker) obj2).rotation);
                return Unit.INSTANCE;
            case 16:
                return ((Sticker) ((PersonalizePaymentStickersViewModel) obj2).stickers.get(((Integer) obj).intValue())).remoteId;
            case 17:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, ((HeaderAvatar) obj2).name);
                return Unit.INSTANCE;
            case 18:
                Element element = (Element) obj2;
                ReusableGraphicsLayerScope reusableGraphicsLayerScope2 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope2.getClass();
                reusableGraphicsLayerScope2.setScaleX(element.getProperties().zoom.scale);
                reusableGraphicsLayerScope2.setScaleY(element.getProperties().zoom.scale);
                reusableGraphicsLayerScope2.setRotationZ(element.getProperties().rotation.rotation);
                return Unit.INSTANCE;
            case 19:
                LazyListScope lazyListScope2 = (LazyListScope) obj;
                lazyListScope2.getClass();
                LazyListScope.item$default(lazyListScope2, null, null, PdfPreviewViewKt.lambda$1443514694, 3);
                ArrayList arrayList = ((PdfBitmapRender) obj2).pdfBitmaps;
                lazyListScope2.items(arrayList.size(), null, new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2(16, arrayList), new ComposableLambdaImpl(new AgentsHomeViewKt$AgentsHome$lambda$1$0$$inlined$items$3(arrayList, 2), true, 802480018));
                return Unit.INSTANCE;
            case 20:
                TaxesAppletTile taxesAppletTile2 = (TaxesAppletTile) obj2;
                PromotedAppletTileViewEvent$Click promotedAppletTileViewEvent$Click3 = (PromotedAppletTileViewEvent$Click) obj;
                promotedAppletTileViewEvent$Click3.getClass();
                if (promotedAppletTileViewEvent$Click3.equals(promotedAppletTileViewEvent$Click)) {
                    ((ScoreAppletViewsModule$$ExternalSyntheticLambda1) taxesAppletTile2.onClick).invoke(ItemId.PROMOTED_PHONE_PLANS.INSTANCE);
                    return Unit.INSTANCE;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 21:
                LinkTokenConfiguration.Builder builder = (LinkTokenConfiguration.Builder) obj;
                builder.getClass();
                builder.setToken(((PlaidLinkParams) obj2).linkToken);
                return Unit.INSTANCE;
            case 22:
                ProducerScope producerScope = (ProducerScope) obj2;
                LinkEvent linkEvent = (LinkEvent) obj;
                String linkEventName = linkEvent.getEventName().toString();
                Institution institution = new Institution(linkEvent.getMetadata().getInstitutionId(), linkEvent.getMetadata().getInstitutionName());
                ((ProducerCoroutine) producerScope).mo1159trySendJP2dKIU(Intrinsics.areEqual(linkEvent.getEventName(), LinkEventName.SEARCH_INSTITUTION.INSTANCE) ? new PlaidLinkEvent.SearchEvent(linkEventName, institution) : new PlaidLinkEvent.GenericEvent(linkEventName, institution));
                return Unit.INSTANCE;
            case 23:
                WorkHomePresenter workHomePresenter = (WorkHomePresenter) obj2;
                PoolsAppletData poolsAppletData = (PoolsAppletData) obj;
                MoneyFormatter moneyFormatter = (MoneyFormatter) workHomePresenter.youPresenter;
                AndroidStringManager androidStringManager = (AndroidStringManager) workHomePresenter.shiftsAnalytics;
                Resources resources = androidStringManager.resources;
                if (poolsAppletData != null) {
                    CurrencyCode currencyCode = poolsAppletData.currencyCode;
                    int i4 = poolsAppletData.closedPoolsCount;
                    int i5 = poolsAppletData.activePoolsCount;
                    List list2 = poolsAppletData.highlightedPools;
                    if (i5 != 0 || i4 != 0) {
                        List list3 = list2;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            PoolAppletPreview poolAppletPreview = (PoolAppletPreview) it2.next();
                            String str6 = poolAppletPreview.name;
                            if (str6 == null) {
                                str6 = "";
                            }
                            float f = poolAppletPreview.progressPercent;
                            List list4 = poolAppletPreview.participants;
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj3 : list4) {
                                if (((Participant) obj3).f1187type == ParticipantType.CASH_APP_USER) {
                                    arrayList3.add(obj3);
                                }
                            }
                            List sortedWith = CollectionsKt.sortedWith(arrayList3, new LinkedHashTreeMap.AnonymousClass1(2));
                            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10));
                            Iterator it3 = sortedWith.iterator();
                            while (it3.hasNext()) {
                                Participant participant = (Participant) it3.next();
                                String str7 = participant.customerToken;
                                str7.getClass();
                                String str8 = participant.fullName;
                                Iterator it4 = it2;
                                String str9 = participant.profilePhotoUrl;
                                Iterator it5 = it3;
                                if (str9 != null) {
                                    i = i4;
                                    image = new Image(str9, str9, 4);
                                } else {
                                    i = i4;
                                    image = null;
                                }
                                arrayList4.add(new PoolParticipant(str8, str7, image, ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(25, null, participant.customerToken, participant.fullName, null, null))));
                                it2 = it4;
                                it3 = it5;
                                i4 = i;
                            }
                            arrayList2.add(new ActivePool(str6, new PoolIcon.Pool(f, Tags.toPersistentList(arrayList4))));
                            it2 = it2;
                        }
                        int i6 = i4;
                        int max = Math.max(0, i5 - list2.size());
                        if (i5 == 0) {
                            Object[] objArr = {Integer.valueOf(i6)};
                            resources.getClass();
                            str = new MessageFormat(resources.getString(R.string.applet_footer_closed_pools)).format(objArr);
                            str.getClass();
                        } else if (i5 == 1) {
                            String format2 = moneyFormatter.format(new Money(Long.valueOf(((PoolAppletPreview) list2.get(0)).balance), currencyCode, 4));
                            String format3 = moneyFormatter.format(new Money(Long.valueOf(((PoolAppletPreview) list2.get(0)).goal), currencyCode, 4));
                            format2.getClass();
                            format3.getClass();
                            ArrayMap arrayMap = new ArrayMap(2);
                            arrayMap.put("balance", format2);
                            arrayMap.put("goal", format3);
                            resources.getClass();
                            str = new MessageFormat(resources.getString(R.string.applet_footer_single_active_pool)).format(arrayMap);
                            str.getClass();
                        } else if (i5 > 2) {
                            Object[] objArr2 = {Integer.valueOf(i5 - 2)};
                            resources.getClass();
                            str = new MessageFormat(resources.getString(R.string.applet_footer_more_pools)).format(objArr2);
                            str.getClass();
                        } else {
                            str = null;
                        }
                        return new PoolsAppletTileModel.Installed(max, str, arrayList2);
                    }
                }
                return new PoolsAppletTileModel.Uninstalled(androidStringManager.get(R.string.uninstalled_applet_title), androidStringManager.get(R.string.uninstalled_applet_subtitle));
            case 24:
                InvestingGraphTabsView investingGraphTabsView = (InvestingGraphTabsView) obj2;
                int i7 = InvestingGraphTabsView.$r8$clinit;
                View childAt = investingGraphTabsView.getChildAt(0);
                childAt.getClass();
                return new YInt(investingGraphTabsView.m3815heightdBGyhoQ(childAt));
            case 25:
                InvestingGraphTabsView investingGraphTabsView2 = (InvestingGraphTabsView) obj;
                investingGraphTabsView2.getClass();
                investingGraphTabsView2.selectToggle(((InvestingGraphTimeRangeViewModel) obj2).range);
                return Unit.INSTANCE;
            case 26:
                ((DisposableEffectScope) obj).getClass();
                return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1((KybBannerPresenter) obj2, 27);
            case 27:
                NotificationSectionPresenter notificationSectionPresenter = (NotificationSectionPresenter) obj2;
                Screen screen2 = notificationSectionPresenter.args;
                FlowStarter flowStarter = notificationSectionPresenter.blockersNavigator;
                AndroidStringManager androidStringManager2 = notificationSectionPresenter.stringManager;
                BetterNavigator.ScreenNavigator screenNavigator = notificationSectionPresenter.navigator;
                ContactMethodSectionViewEvent contactMethodSectionViewEvent = (ContactMethodSectionViewEvent) obj;
                contactMethodSectionViewEvent.getClass();
                if (contactMethodSectionViewEvent instanceof ContactMethodSectionViewEvent.AddAliasClicked) {
                    AliasItem aliasItem = ((ContactMethodSectionViewEvent.AddAliasClicked) contactMethodSectionViewEvent).aliasType;
                    Analytics analytics = notificationSectionPresenter.analytics;
                    aliasItem.getClass();
                    int ordinal = aliasItem.ordinal();
                    if (ordinal == 0) {
                        aliasType2 = AliasType.SMS;
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        aliasType2 = AliasType.EMAIL;
                    }
                    analytics.track(new NotificationsSettingsAddAlias(aliasType2), null);
                    int ordinal2 = aliasItem.ordinal();
                    if (ordinal2 == 0) {
                        startRegisterSmsFlow$default = FlowStarter.startRegisterSmsFlow$default(flowStarter, screen2, androidStringManager2.get(R.string.notifications_enter_phone_number_title), 12);
                    } else {
                        if (ordinal2 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        startRegisterSmsFlow$default = FlowStarter.startRegisterEmailFlow$default(flowStarter, screen2, androidStringManager2.get(R.string.notifications_enter_email_address_title), 12);
                    }
                    screenNavigator.goTo(startRegisterSmsFlow$default);
                } else if (contactMethodSectionViewEvent instanceof ContactMethodSectionViewEvent.ContactMethodClicked) {
                    ContactMethodType contactMethodType = ((ContactMethodSectionViewEvent.ContactMethodClicked) contactMethodSectionViewEvent).contactMethod;
                    AliasItem aliasItem2 = contactMethodType.aliasType;
                    String str10 = androidStringManager2.get(aliasItem2.title);
                    String str11 = androidStringManager2.get(aliasItem2.body);
                    RedactedParcelableList redactList = DBUtil.redactList(contactMethodType.aliases);
                    int ordinal3 = aliasItem2.ordinal();
                    if (ordinal3 == 0) {
                        type2 = UiAlias.Type.SMS;
                    } else {
                        if (ordinal3 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        type2 = UiAlias.Type.EMAIL;
                    }
                    screenNavigator.goTo(new ProfileScreens.ContactMethodDetailsScreen(str10, str11, redactList, type2));
                } else {
                    if (!(contactMethodSectionViewEvent instanceof ContactMethodSectionViewEvent.ReviewAliasesClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ContactMethodSectionViewEvent.ReviewAliasesClicked reviewAliasesClicked = (ContactMethodSectionViewEvent.ReviewAliasesClicked) contactMethodSectionViewEvent;
                    List list5 = reviewAliasesClicked.aliases;
                    AliasItem aliasItem3 = reviewAliasesClicked.aliasType;
                    List list6 = aliasItem3 == AliasItem.PHONE ? list5 : null;
                    if (list6 == null) {
                        list6 = EmptyList.INSTANCE;
                    }
                    RedactedParcelableList redactList2 = DBUtil.redactList(list6);
                    if (aliasItem3 != AliasItem.EMAIL) {
                        list5 = null;
                    }
                    if (list5 == null) {
                        list5 = EmptyList.INSTANCE;
                    }
                    RedactedParcelableList redactList3 = DBUtil.redactList(list5);
                    ConfirmationSheetOrigin confirmationSheetOrigin = ConfirmationSheetOrigin.CONTACT_METHOD;
                    aliasItem3.getClass();
                    int ordinal4 = aliasItem3.ordinal();
                    if (ordinal4 == 0) {
                        aliasType = AliasType.SMS;
                    } else {
                        if (ordinal4 != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        aliasType = AliasType.EMAIL;
                    }
                    screenNavigator.goTo(new ProfileScreens.EnableAliasSheetScreen(redactList2, redactList3, confirmationSheetOrigin, aliasType, 67));
                }
                return Unit.INSTANCE;
            case 28:
                CashQrScannerPresenter cashQrScannerPresenter = (CashQrScannerPresenter) obj2;
                ((DisposableEffectScope) obj).getClass();
                cashQrScannerPresenter.nfcPaymentsManager.enableReaderMode(null, null, null);
                return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1(cashQrScannerPresenter, 28);
            default:
                RealSegmentedControlScope realSegmentedControlScope = (RealSegmentedControlScope) obj;
                realSegmentedControlScope.getClass();
                boolean z6 = ((CashQrScannerViewModel) obj2).showUpdatedSharingUi;
                SnapshotStateList snapshotStateList = realSegmentedControlScope.segments;
                if (z6) {
                    snapshotStateList.add(CameraXPreviewKt.f643lambda$694087202);
                    snapshotStateList.add(CameraXPreviewKt.f640lambda$1936299883);
                } else {
                    snapshotStateList.add(CameraXPreviewKt.f639lambda$1563971865);
                    snapshotStateList.add(CameraXPreviewKt.f642lambda$255768738);
                }
                return Unit.INSTANCE;
        }
    }
}
