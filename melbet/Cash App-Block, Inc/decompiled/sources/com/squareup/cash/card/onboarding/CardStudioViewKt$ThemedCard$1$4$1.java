package com.squareup.cash.card.onboarding;

import app.cash.broadway.navigation.Navigator;
import app.cash.paraphrase.FormattedResource;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.loader.RealActivitiesManager;
import com.squareup.cash.banking.applets.presenters.BalanceAppletTileRepository;
import com.squareup.cash.banking.applets.presenters.LiteBalanceAppletTilePresenter$Factory$Impl;
import com.squareup.cash.banking.presenters.FormattedResources;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.bitcoin.presenters.map.BitcoinMapPresenter;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.card.onboarding.core.CardShaderGenerator;
import com.squareup.cash.cdf.crypto.CryptoSpendGrantLocationPermission;
import com.squareup.cash.graphics.swampgl.components.Entity;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.privacy.RealBalancePrivacy;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardStudioViewKt$ThemedCard$1$4$1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardStudioViewKt$ThemedCard$1$4$1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.$r8$classId = i3;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ((Timber.Forest) this.receiver).e((Throwable) obj);
                return Unit.INSTANCE;
            case 1:
                Navigator navigator = (Navigator) obj;
                navigator.getClass();
                LiteBalanceAppletTilePresenter$Factory$Impl liteBalanceAppletTilePresenter$Factory$Impl = (LiteBalanceAppletTilePresenter$Factory$Impl) this.receiver;
                liteBalanceAppletTilePresenter$Factory$Impl.getClass();
                RealActivitiesManager.MetroFactory metroFactory = liteBalanceAppletTilePresenter$Factory$Impl.delegateFactory;
                BalanceAppletTileRepository balanceAppletTileRepository = (BalanceAppletTileRepository) metroFactory.ioDispatcher.invoke();
                RealBalancePrivacy realBalancePrivacy = (RealBalancePrivacy) metroFactory.badger2.invoke();
                AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.errorReporter.invoke();
                MoneyAnalyticsService moneyAnalyticsService = (MoneyAnalyticsService) metroFactory.appService.invoke();
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) metroFactory.defaultGetRequestHandlerFactory.invoke();
                CoroutineScope coroutineScope = (CoroutineScope) metroFactory.formattingPageRequestHandlerFactory.value;
                balanceAppletTileRepository.getClass();
                realBalancePrivacy.getClass();
                androidStringManager.getClass();
                moneyAnalyticsService.getClass();
                factory.getClass();
                coroutineScope.getClass();
                return new TransfersPresenter(balanceAppletTileRepository, realBalancePrivacy, androidStringManager, moneyAnalyticsService, factory, coroutineScope, navigator);
            case 2:
                obj.getClass();
                ((FormattedResources) this.receiver).getClass();
                return new FormattedResource(R.string.balance_home_overdraft_balance, new Object[]{obj});
            case 3:
                obj.getClass();
                ((FormattedResources) this.receiver).getClass();
                return new FormattedResource(R.string.balance_home_overdraft_balance_due, new Object[]{obj});
            case 4:
                obj.getClass();
                ((FormattedResources) this.receiver).getClass();
                return new FormattedResource(R.string.balance_home_overdraft_balance_due, new Object[]{obj});
            case 5:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ((BitcoinMapPresenter) this.receiver).getClass();
                return new CryptoSpendGrantLocationPermission(booleanValue ? CryptoSpendGrantLocationPermission.AndroidLocationAuthorizationStatus.GRANTED : CryptoSpendGrantLocationPermission.AndroidLocationAuthorizationStatus.DENIED);
            case 6:
                obj.getClass();
                ((com.squareup.cash.bitcoin.presenters.FormattedResources) this.receiver).getClass();
                return new FormattedResource(R.string.investing_transfer_bitcoin_subtitle_up_custom, new Object[]{obj});
            case 7:
                obj.getClass();
                ((com.squareup.cash.bitcoin.presenters.FormattedResources) this.receiver).getClass();
                return new FormattedResource(R.string.investing_transfer_bitcoin_subtitle_down_custom, new Object[]{obj});
            case 8:
                obj.getClass();
                ((com.squareup.cash.blockers.presenters.FormattedResources) this.receiver).getClass();
                return new FormattedResource(R.string.profile_link_card_credit_card_business_warning, new Object[]{obj});
            case 9:
                obj.getClass();
                ((com.squareup.cash.blockers.presenters.FormattedResources) this.receiver).getClass();
                return new FormattedResource(R.string.profile_link_card_credit_card_warning, new Object[]{obj});
            case 10:
                ((Timber.Forest) this.receiver).e((Throwable) obj);
                return Unit.INSTANCE;
            case 11:
                ((Timber.Forest) this.receiver).e((Throwable) obj);
                return Unit.INSTANCE;
            case 12:
                ((Timber.Forest) this.receiver).e((Throwable) obj);
                return Unit.INSTANCE;
            case 13:
                ((Timber.Forest) this.receiver).e((Throwable) obj);
                return Unit.INSTANCE;
            case 14:
                ((Timber.Forest) this.receiver).e((Throwable) obj);
                return Unit.INSTANCE;
            case 15:
                ((Timber.Forest) this.receiver).e((Throwable) obj);
                return Unit.INSTANCE;
            case 16:
                ((Timber.Forest) this.receiver).e((Throwable) obj);
                return Unit.INSTANCE;
            case 17:
                ((Timber.Forest) this.receiver).e((Throwable) obj);
                return Unit.INSTANCE;
            case 18:
                ((Timber.Forest) this.receiver).e((Throwable) obj);
                return Unit.INSTANCE;
            case 19:
                ((Timber.Forest) this.receiver).e((Throwable) obj);
                return Unit.INSTANCE;
            case 20:
                ((Timber.Forest) this.receiver).e((Throwable) obj);
                return Unit.INSTANCE;
            case 21:
                ((Timber.Forest) this.receiver).e((Throwable) obj);
                return Unit.INSTANCE;
            case 22:
                ((Timber.Forest) this.receiver).e((Throwable) obj);
                return Unit.INSTANCE;
            case 23:
                ((Timber.Forest) this.receiver).e((Throwable) obj);
                return Unit.INSTANCE;
            case 24:
                ((Timber.Forest) this.receiver).e((Throwable) obj);
                return Unit.INSTANCE;
            case 25:
                ((Timber.Forest) this.receiver).e((Throwable) obj);
                return Unit.INSTANCE;
            case 26:
                ((Timber.Forest) this.receiver).e((Throwable) obj);
                return Unit.INSTANCE;
            case 27:
                Entity entity = (Entity) obj;
                entity.getClass();
                ((CardScene) this.receiver).addEntity(entity);
                return Unit.INSTANCE;
            case 28:
                String str = (String) obj;
                str.getClass();
                ((CardShaderGenerator.Instanced) this.receiver).getClass();
                switch (str.hashCode()) {
                    case -2096579276:
                        if (str.equals("IsHolo")) {
                            return "CARD.flags.x";
                        }
                        break;
                    case -2096430239:
                        if (str.equals("IsMood")) {
                            return "CARD.flags.y";
                        }
                        break;
                    case -1639895969:
                        if (str.equals("GlitterRoughness")) {
                            return "CARD.pbrParams2.z";
                        }
                        break;
                    case -1307142806:
                        if (str.equals("InkRoughness")) {
                            return "CARD.pbrParams1.x";
                        }
                        break;
                    case -837357181:
                        if (str.equals("HasSnakeSkin")) {
                            return "CARD.flags.z";
                        }
                        break;
                    case -703704093:
                        if (str.equals("MagStripeColor")) {
                            return "CARD.magStripeColor.rgb";
                        }
                        break;
                    case -385111489:
                        if (str.equals("Metallic")) {
                            return "CARD.pbrParams0.y";
                        }
                        break;
                    case -334262972:
                        if (str.equals("BackInkColor")) {
                            return "CARD.backInkColor.rgb";
                        }
                        break;
                    case 19291907:
                        if (str.equals("MetallicClearCoatRoughness")) {
                            return "CARD.pbrParams2.y";
                        }
                        break;
                    case 161542898:
                        if (str.equals("BaseColor")) {
                            return "CARD.baseColor.rgb";
                        }
                        break;
                    case 345901885:
                        if (str.equals("InkColor")) {
                            return "CARD.inkColor.rgb";
                        }
                        break;
                    case 573601293:
                        if (str.equals("MetallicClearCoat")) {
                            return "CARD.pbrParams2.x";
                        }
                        break;
                    case 732563820:
                        if (str.equals("ClearCoat")) {
                            return "CARD.pbrParams0.z";
                        }
                        break;
                    case 1644020497:
                        if (str.equals("MetallicRoughness")) {
                            return "CARD.pbrParams1.w";
                        }
                        break;
                    case 1661150852:
                        if (str.equals("ClearCoatRoughness")) {
                            return "CARD.pbrParams0.w";
                        }
                        break;
                    case 1802983024:
                        if (str.equals("Roughness")) {
                            return "CARD.pbrParams0.x";
                        }
                        break;
                    case 1917405286:
                        if (str.equals("InkClearCoat")) {
                            return "CARD.pbrParams1.y";
                        }
                        break;
                    case 2019696842:
                        if (str.equals("InkClearCoatRoughness")) {
                            return "CARD.pbrParams1.z";
                        }
                        break;
                }
                a$$ExternalSyntheticBUOutline0.m1430m((Object) "Unknown parameter: ".concat(str));
                return null;
            default:
                String str2 = (String) obj;
                str2.getClass();
                ((CardShaderGenerator.SingleCard) this.receiver).getClass();
                return "u".concat(str2);
        }
    }
}
