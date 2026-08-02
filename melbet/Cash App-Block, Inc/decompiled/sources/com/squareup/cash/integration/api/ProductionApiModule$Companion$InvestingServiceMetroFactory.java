package com.squareup.cash.integration.api;

import com.squareup.cash.api.AppServiceContextWrapper;
import com.squareup.cash.api.TreelotRetrofitService;
import com.squareup.cash.cashplato.service.CashPlatoAppService;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class ProductionApiModule$Companion$InvestingServiceMetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Provider appServiceContextWrapper;

    public /* synthetic */ ProductionApiModule$Companion$InvestingServiceMetroFactory(DoubleCheck doubleCheck, int i) {
        this.$r8$classId = i;
        this.appServiceContextWrapper = doubleCheck;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Provider provider = this.appServiceContextWrapper;
        switch (i) {
            case 0:
                AppServiceContextWrapper appServiceContextWrapper = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper.getClass();
                return appServiceContextWrapper;
            case 1:
                AppServiceContextWrapper appServiceContextWrapper2 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper2.getClass();
                return appServiceContextWrapper2;
            case 2:
                AppServiceContextWrapper appServiceContextWrapper3 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper3.getClass();
                return appServiceContextWrapper3;
            case 3:
                AppServiceContextWrapper appServiceContextWrapper4 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper4.getClass();
                return appServiceContextWrapper4;
            case 4:
                AppServiceContextWrapper appServiceContextWrapper5 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper5.getClass();
                return appServiceContextWrapper5;
            case 5:
                Retrofit retrofit = (Retrofit) provider.invoke();
                retrofit.getClass();
                Object create = retrofit.create(TreelotRetrofitService.class);
                create.getClass();
                return new ProductionApiModule$Companion$createTreelotService$1((TreelotRetrofitService) create);
            case 6:
                AppServiceContextWrapper appServiceContextWrapper6 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper6.getClass();
                return appServiceContextWrapper6;
            case 7:
                AppServiceContextWrapper appServiceContextWrapper7 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper7.getClass();
                return appServiceContextWrapper7;
            case 8:
                AppServiceContextWrapper appServiceContextWrapper8 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper8.getClass();
                return appServiceContextWrapper8;
            case 9:
                AppServiceContextWrapper appServiceContextWrapper9 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper9.getClass();
                return appServiceContextWrapper9;
            case 10:
                AppServiceContextWrapper appServiceContextWrapper10 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper10.getClass();
                return appServiceContextWrapper10;
            case 11:
                AppServiceContextWrapper appServiceContextWrapper11 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper11.getClass();
                return appServiceContextWrapper11;
            case 12:
                AppServiceContextWrapper appServiceContextWrapper12 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper12.getClass();
                return appServiceContextWrapper12;
            case 13:
                AppServiceContextWrapper appServiceContextWrapper13 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper13.getClass();
                return appServiceContextWrapper13;
            case 14:
                AppServiceContextWrapper appServiceContextWrapper14 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper14.getClass();
                return appServiceContextWrapper14;
            case 15:
                AppServiceContextWrapper appServiceContextWrapper15 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper15.getClass();
                return appServiceContextWrapper15;
            case 16:
                AppServiceContextWrapper appServiceContextWrapper16 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper16.getClass();
                return appServiceContextWrapper16;
            case 17:
                AppServiceContextWrapper appServiceContextWrapper17 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper17.getClass();
                return appServiceContextWrapper17;
            case 18:
                AppServiceContextWrapper appServiceContextWrapper18 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper18.getClass();
                return appServiceContextWrapper18;
            case 19:
                AppServiceContextWrapper appServiceContextWrapper19 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper19.getClass();
                return appServiceContextWrapper19;
            case 20:
                AppServiceContextWrapper appServiceContextWrapper20 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper20.getClass();
                return appServiceContextWrapper20;
            case 21:
                AppServiceContextWrapper appServiceContextWrapper21 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper21.getClass();
                return appServiceContextWrapper21;
            case 22:
                AppServiceContextWrapper appServiceContextWrapper22 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper22.getClass();
                return appServiceContextWrapper22;
            case 23:
                AppServiceContextWrapper appServiceContextWrapper23 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper23.getClass();
                return appServiceContextWrapper23;
            case 24:
                AppServiceContextWrapper appServiceContextWrapper24 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper24.getClass();
                return appServiceContextWrapper24;
            case 25:
                Retrofit retrofit3 = (Retrofit) provider.invoke();
                retrofit3.getClass();
                Object create2 = retrofit3.create(CashPlatoAppService.class);
                create2.getClass();
                return (CashPlatoAppService) create2;
            case 26:
                AppServiceContextWrapper appServiceContextWrapper25 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper25.getClass();
                return appServiceContextWrapper25;
            case 27:
                AppServiceContextWrapper appServiceContextWrapper26 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper26.getClass();
                return appServiceContextWrapper26;
            case 28:
                AppServiceContextWrapper appServiceContextWrapper27 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper27.getClass();
                return appServiceContextWrapper27;
            default:
                AppServiceContextWrapper appServiceContextWrapper28 = (AppServiceContextWrapper) provider.invoke();
                appServiceContextWrapper28.getClass();
                return appServiceContextWrapper28;
        }
    }
}
