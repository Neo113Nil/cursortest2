package com.squareup.cash.bitcoin.presenters;

import app.cash.broadway.navigation.Navigator;
import com.google.android.gms.internal.measurement.zzlj;
import com.squareup.cash.bitcoin.screens.BitcoinAmountPickerScreen;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.common.Money;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class RealBitcoinAmountPickerPresenter$Factory$Impl {
    public final zzlj delegateFactory;

    public RealBitcoinAmountPickerPresenter$Factory$Impl(zzlj zzljVar) {
        this.delegateFactory = zzljVar;
    }

    public final RealBitcoinAmountPickerPresenter create$1(Money money, Money money2, BitcoinAmountPickerScreen bitcoinAmountPickerScreen, Navigator navigator) {
        bitcoinAmountPickerScreen.getClass();
        zzlj zzljVar = this.delegateFactory;
        AndroidStringManager androidStringManager = (AndroidStringManager) ((Provider) zzljVar.zza).invoke();
        RealBitcoinKeypadStateStore$Factory$Impl realBitcoinKeypadStateStore$Factory$Impl = (RealBitcoinKeypadStateStore$Factory$Impl) ((InstanceFactory) zzljVar.zzb).value;
        RealBitcoinKeypadPresenter realBitcoinKeypadPresenter = (RealBitcoinKeypadPresenter) ((Provider) zzljVar.zzc).invoke();
        Flow flow = (Flow) ((InstanceFactory) zzljVar.zze).value;
        LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) ((Provider) zzljVar.zzd).invoke();
        AndroidClock androidClock = (AndroidClock) ((Provider) zzljVar.zzf).invoke();
        androidStringManager.getClass();
        realBitcoinKeypadStateStore$Factory$Impl.getClass();
        realBitcoinKeypadPresenter.getClass();
        flow.getClass();
        factory.getClass();
        androidClock.getClass();
        return new RealBitcoinAmountPickerPresenter(androidStringManager, realBitcoinKeypadStateStore$Factory$Impl, realBitcoinKeypadPresenter, flow, factory, androidClock, money, money2, bitcoinAmountPickerScreen, navigator);
    }
}
