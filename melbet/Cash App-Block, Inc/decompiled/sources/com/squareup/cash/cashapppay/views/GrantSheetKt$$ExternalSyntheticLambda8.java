package com.squareup.cash.cashapppay.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.cashapppay.viewmodels.GrantViewModel;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class GrantSheetKt$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GrantViewModel.Main f$0;
    public final /* synthetic */ MoneyFormatter f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ GrantSheetKt$$ExternalSyntheticLambda8(GrantViewModel.Main main, MoneyFormatter moneyFormatter, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = main;
        this.f$1 = moneyFormatter;
        this.f$2 = function1;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                GrantSheetKt.Main(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(this.f$3 | 1));
                break;
            default:
                GrantScreenKt.Main(this.f$0, this.f$1, this.f$2, composer, Updater.updateChangedFlags(this.f$3 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
