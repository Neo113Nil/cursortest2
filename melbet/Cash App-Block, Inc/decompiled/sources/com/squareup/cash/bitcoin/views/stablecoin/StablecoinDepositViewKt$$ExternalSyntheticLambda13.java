package com.squareup.cash.bitcoin.views.stablecoin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositViewModel$Loaded;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class StablecoinDepositViewKt$$ExternalSyntheticLambda13 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StablecoinDepositViewModel$Loaded f$0;
    public final /* synthetic */ Function1 f$1;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ StablecoinDepositViewKt$$ExternalSyntheticLambda13(StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded, Function1 function1, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = stablecoinDepositViewModel$Loaded;
        this.f$1 = function1;
        this.f$2 = modifier;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                SendStablecoinViewKt.StablecoinDepositQrContent(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(this.f$3 | 1));
                break;
            default:
                SendStablecoinViewKt.StablecoinDepositsQrCode(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(this.f$3 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
