package com.squareup.cash.bitcoin.presenters.applet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class BitcoinHomePresenter$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BitcoinHomePresenter f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ BitcoinHomePresenter$$ExternalSyntheticLambda0(BitcoinHomePresenter bitcoinHomePresenter, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = bitcoinHomePresenter;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$1;
        BitcoinHomePresenter bitcoinHomePresenter = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                bitcoinHomePresenter.HandleDependentScreenView(composer, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                bitcoinHomePresenter.HandleOpenAnalytics(composer, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                bitcoinHomePresenter.HandleTransferRequirements(composer, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
