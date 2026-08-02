package com.squareup.cash.cashapppay.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import coil3.RealImageLoader;
import com.squareup.cash.cashapppay.viewmodels.GrantViewModel;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class GrantSheetKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GrantViewModel f$0;
    public final /* synthetic */ RealImageLoader f$1;
    public final /* synthetic */ MoneyFormatter f$2;
    public final /* synthetic */ Function1 f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ GrantSheetKt$$ExternalSyntheticLambda1(GrantViewModel grantViewModel, RealImageLoader realImageLoader, MoneyFormatter moneyFormatter, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = grantViewModel;
        this.f$1 = realImageLoader;
        this.f$2 = moneyFormatter;
        this.f$3 = function1;
        this.f$4 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$4;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                GrantSheetKt.GrantSheetContent(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                GrantScreenKt.GrantScreenContent(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
