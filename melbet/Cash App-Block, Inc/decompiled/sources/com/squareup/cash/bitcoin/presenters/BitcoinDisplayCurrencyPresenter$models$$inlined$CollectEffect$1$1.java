package com.squareup.cash.bitcoin.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.MutableState;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.paraphrase.FormattedResource;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.aiedge.MLKitTitleGenerator$prepareModel$1;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferTitleSubtitleProvider;
import com.squareup.cash.bitcoin.presenters.transfer.BitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1;
import com.squareup.cash.bitcoin.screens.BitcoinSymbolLearnMoreSheetScreen;
import com.squareup.cash.bitcoin.screens.BitcoinTransferScreen;
import com.squareup.cash.bitcoin.screens.SatoshiLearnMoreSheetScreen;
import com.squareup.cash.bitcoin.viewmodels.BitcoinDisplayCurrencyViewEvent;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel;
import com.squareup.cash.card.onboarding.CardStudioViewKt$ThemedCard$1$4$1;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.balance.CryptoBalance$StablecoinBalance;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class BitcoinDisplayCurrencyPresenter$models$$inlined$CollectEffect$1$1 implements FlowCollector {
    public final /* synthetic */ Object $localSelectedDisplayPreference$delegate$inlined;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ boolean $symbolExperimentEnabled$inlined;
    public final /* synthetic */ Object $updateUnitsJob$delegate$inlined;
    public final /* synthetic */ Object this$0;

    public BitcoinDisplayCurrencyPresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, LocalHomePresenter localHomePresenter, boolean z, MutableState mutableState, MutableState mutableState2) {
        this.this$0 = localHomePresenter;
        this.$symbolExperimentEnabled$inlined = z;
        this.$localSelectedDisplayPreference$delegate$inlined = mutableState;
        this.$updateUnitsJob$delegate$inlined = mutableState2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0190, code lost:
    
        if (r0.emit(r5, r8) != r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1 bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1;
        int i;
        FlowCollector flowCollector;
        BitcoinTransferViewModel.Content.Subtitle subtitle;
        BitcoinTransferViewModel.Content.Subtitle subtitle2;
        int i2;
        FlowCollector flowCollector2;
        int i3;
        int i4 = this.$r8$classId;
        Object obj2 = this.$updateUnitsJob$delegate$inlined;
        boolean z = this.$symbolExperimentEnabled$inlined;
        Object obj3 = this.this$0;
        Object obj4 = this.$localSelectedDisplayPreference$delegate$inlined;
        Continuation continuation2 = null;
        switch (i4) {
            case 0:
                MutableState mutableState = (MutableState) obj2;
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj3;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localHomePresenter.navigator;
                BitcoinDisplayCurrencyViewEvent bitcoinDisplayCurrencyViewEvent = (BitcoinDisplayCurrencyViewEvent) obj;
                if (!(bitcoinDisplayCurrencyViewEvent instanceof BitcoinDisplayCurrencyViewEvent.BitcoinDisplayUnitsSelected)) {
                    if (!Intrinsics.areEqual(bitcoinDisplayCurrencyViewEvent, BitcoinDisplayCurrencyViewEvent.LearnMorePressed.INSTANCE)) {
                        if (!Intrinsics.areEqual(bitcoinDisplayCurrencyViewEvent, BitcoinDisplayCurrencyViewEvent.BackPressed.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            screenNavigator.goTo(Back.INSTANCE);
                        }
                    } else if (z) {
                        screenNavigator.goTo(BitcoinSymbolLearnMoreSheetScreen.INSTANCE);
                    } else {
                        screenNavigator.goTo(SatoshiLearnMoreSheetScreen.INSTANCE);
                    }
                } else {
                    ((MutableState) obj4).setValue(((BitcoinDisplayCurrencyViewEvent.BitcoinDisplayUnitsSelected) bitcoinDisplayCurrencyViewEvent).units);
                    Job job = (Job) mutableState.getValue();
                    if (job != null) {
                        job.cancel(null);
                    }
                    mutableState.setValue(JobKt.launch$default((CoroutineScope) localHomePresenter.syncer, null, null, new MLKitTitleGenerator$prepareModel$1(localHomePresenter, bitcoinDisplayCurrencyViewEvent, continuation2, 21), 3));
                }
                break;
            default:
                BitcoinTransferTitleSubtitleProvider bitcoinTransferTitleSubtitleProvider = (BitcoinTransferTitleSubtitleProvider) obj4;
                AndroidStringManager androidStringManager = bitcoinTransferTitleSubtitleProvider.stringManager;
                if (continuation instanceof BitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1) {
                    bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1 = (BitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1) continuation;
                    int i5 = bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1.label;
                    if ((i5 & PKIFailureInfo.systemUnavail) != 0) {
                        bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1.label = i5 - PKIFailureInfo.systemUnavail;
                        Object obj5 = bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj5);
                            flowCollector = (FlowCollector) obj3;
                            if (((Boolean) obj).booleanValue()) {
                                RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(bitcoinTransferTitleSubtitleProvider.cryptoBalanceRepo.getStablecoinBalance(), 24);
                                bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1.L$4 = flowCollector;
                                bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1.I$0 = 0;
                                bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1.label = 1;
                                Object first = FlowKt.first(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1);
                                if (first != coroutineSingletons) {
                                    flowCollector2 = flowCollector;
                                    obj5 = first;
                                    i3 = 0;
                                }
                                break;
                            } else {
                                Money money = (Money) obj2;
                                MoneyFormatter moneyFormatter = bitcoinTransferTitleSubtitleProvider.moneyFormatter;
                                BitcoinTransferScreen bitcoinTransferScreen = bitcoinTransferTitleSubtitleProvider.args;
                                if (!z) {
                                    BitcoinTransferScreen.OrderType orderType = bitcoinTransferScreen.orderType;
                                    RecurringSchedule.Frequency frequency = bitcoinTransferScreen.frequency;
                                    if (!(orderType instanceof BitcoinTransferScreen.OrderType.CustomOrder)) {
                                        if (!Intrinsics.areEqual(orderType, BitcoinTransferScreen.OrderType.Standard.INSTANCE)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            break;
                                        } else {
                                            subtitle = new BitcoinTransferViewModel.Content.Subtitle(androidStringManager.get(BitcoinTransferTitleSubtitleProvider.getLabel(frequency)), frequency != null ? BitcoinTransferViewModel.Content.Icon.RECURRING : null);
                                        }
                                    } else {
                                        BitcoinTransferScreen.OrderType.CustomOrder customOrder = (BitcoinTransferScreen.OrderType.CustomOrder) orderType;
                                        long j = customOrder.targetUsdPerBtc;
                                        String format2 = moneyFormatter.format(new Money(Long.valueOf(j), CurrencyCode.USD, 4));
                                        if (bitcoinTransferScreen.isBuy) {
                                            long j2 = customOrder.currentUsdPerBtc;
                                            FormattedResources formattedResources = FormattedResources.INSTANCE;
                                            subtitle2 = new BitcoinTransferViewModel.Content.Subtitle(androidStringManager.getString((FormattedResource) (j > j2 ? new CardStudioViewKt$ThemedCard$1$4$1(1, formattedResources, FormattedResources.class, "investing_transfer_bitcoin_subtitle_up_custom", "investing_transfer_bitcoin_subtitle_up_custom(Ljava/lang/Object;)Lapp/cash/paraphrase/FormattedResource;", 0, 6) : new CardStudioViewKt$ThemedCard$1$4$1(1, formattedResources, FormattedResources.class, "investing_transfer_bitcoin_subtitle_down_custom", "investing_transfer_bitcoin_subtitle_down_custom(Ljava/lang/Object;)Lapp/cash/paraphrase/FormattedResource;", 0, 7)).invoke(format2)), null);
                                            i2 = 0;
                                            bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1.L$4 = null;
                                            bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1.I$0 = i2;
                                            bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1.label = 2;
                                            break;
                                        } else {
                                            String format3 = moneyFormatter.format(money);
                                            format3.getClass();
                                            format2.getClass();
                                            Resources resources = androidStringManager.resources;
                                            resources.getClass();
                                            String format4 = new MessageFormat(resources.getString(R.string.investing_transfer_bitcoin_custom_sell_limit_with_info)).format(new Object[]{format3, format2});
                                            format4.getClass();
                                            subtitle = new BitcoinTransferViewModel.Content.Subtitle(format4, null);
                                        }
                                    }
                                } else {
                                    subtitle = new BitcoinTransferViewModel.Content.Subtitle(androidStringManager.get(BitcoinTransferTitleSubtitleProvider.getLabel(bitcoinTransferScreen.frequency)), bitcoinTransferScreen.frequency != null ? BitcoinTransferViewModel.Content.Icon.RECURRING : null);
                                }
                                subtitle2 = subtitle;
                                i2 = 0;
                                bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1.L$4 = null;
                                bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1.I$0 = i2;
                                bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1.label = 2;
                            }
                        } else if (i == 1) {
                            i3 = bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1.I$0;
                            flowCollector2 = bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1.L$4;
                            SafeTrace.throwOnFailure(obj5);
                        } else if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            SafeTrace.throwOnFailure(obj5);
                            break;
                        }
                        CryptoBalance$StablecoinBalance cryptoBalance$StablecoinBalance = (CryptoBalance$StablecoinBalance) obj5;
                        MoneyFormatter moneyFormatter2 = bitcoinTransferTitleSubtitleProvider.symbolAndCodeFormatter;
                        cryptoBalance$StablecoinBalance.getClass();
                        String format5 = moneyFormatter2.format(new Money(Long.valueOf(cryptoBalance$StablecoinBalance.amount), CurrencyCode.XUS, 4));
                        format5.getClass();
                        Resources resources2 = androidStringManager.resources;
                        resources2.getClass();
                        String format6 = new MessageFormat(resources2.getString(R.string.bitcoin_presenters_convert_btc_sub_title)).format(new Object[]{format5});
                        format6.getClass();
                        subtitle2 = new BitcoinTransferViewModel.Content.Subtitle(format6, null);
                        i2 = i3;
                        flowCollector = flowCollector2;
                        bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1.L$4 = null;
                        bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1.I$0 = i2;
                        bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1.label = 2;
                    }
                }
                bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1 = new BitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1(this, continuation);
                Object obj52 = bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1.label;
                if (i != 0) {
                }
                CryptoBalance$StablecoinBalance cryptoBalance$StablecoinBalance2 = (CryptoBalance$StablecoinBalance) obj52;
                MoneyFormatter moneyFormatter22 = bitcoinTransferTitleSubtitleProvider.symbolAndCodeFormatter;
                cryptoBalance$StablecoinBalance2.getClass();
                String format52 = moneyFormatter22.format(new Money(Long.valueOf(cryptoBalance$StablecoinBalance2.amount), CurrencyCode.XUS, 4));
                format52.getClass();
                Resources resources22 = androidStringManager.resources;
                resources22.getClass();
                String format62 = new MessageFormat(resources22.getString(R.string.bitcoin_presenters_convert_btc_sub_title)).format(new Object[]{format52});
                format62.getClass();
                subtitle2 = new BitcoinTransferViewModel.Content.Subtitle(format62, null);
                i2 = i3;
                flowCollector = flowCollector2;
                bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1.L$4 = null;
                bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1.I$0 = i2;
                bitcoinTransferTitleSubtitleProvider$subtitle$$inlined$map$1$2$1.label = 2;
        }
        return null;
    }

    public BitcoinDisplayCurrencyPresenter$models$$inlined$CollectEffect$1$1(FlowCollector flowCollector, BitcoinTransferTitleSubtitleProvider bitcoinTransferTitleSubtitleProvider, boolean z, Money money) {
        this.this$0 = flowCollector;
        this.$localSelectedDisplayPreference$delegate$inlined = bitcoinTransferTitleSubtitleProvider;
        this.$symbolExperimentEnabled$inlined = z;
        this.$updateUnitsJob$delegate$inlined = money;
    }
}
