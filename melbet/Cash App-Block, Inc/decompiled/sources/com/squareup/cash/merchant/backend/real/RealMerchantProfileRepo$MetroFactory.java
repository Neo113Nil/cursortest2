package com.squareup.cash.merchant.backend.real;

import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.appmessages.RealAppMessageManager;
import com.squareup.cash.crypto.service.CryptoService;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.C4BClientService;
import com.squareup.protos.cash.cashcustomerprofile.api.v1.CustomerProfileClientService;
import com.squareup.protos.cash.cashface.api.CashFaceClientService;
import com.squareup.protos.cash.piggybank.appapi.PiggybankAppService;
import com.squareup.protos.franklin.app.AppService;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import io.noties.markwon.MarkwonConfiguration;
import kotlin.coroutines.CoroutineContext;
import squareup.cash.registrar.api.RegistrarClientService;

/* loaded from: classes.dex */
public final class RealMerchantProfileRepo$MetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final DoubleCheck appService;
    public final DoubleCheck cashDatabase;
    public final LambdaProvider ioDispatcher;

    public /* synthetic */ RealMerchantProfileRepo$MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, int i) {
        this.$r8$classId = i;
        this.appService = doubleCheck;
        this.cashDatabase = doubleCheck2;
        this.ioDispatcher = lambdaProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        LambdaProvider lambdaProvider = this.ioDispatcher;
        DoubleCheck doubleCheck = this.cashDatabase;
        DoubleCheck doubleCheck2 = this.appService;
        switch (i) {
            case 0:
                CashFaceClientService cashFaceClientService = (CashFaceClientService) doubleCheck2.getValue();
                CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) doubleCheck.getValue();
                CoroutineContext coroutineContext = (CoroutineContext) lambdaProvider.lambda.invoke();
                cashFaceClientService.getClass();
                cashAccountDatabaseImpl.getClass();
                coroutineContext.getClass();
                return new EglCore(cashFaceClientService, cashAccountDatabaseImpl, coroutineContext);
            case 1:
                C4BClientService c4BClientService = (C4BClientService) doubleCheck2.getValue();
                CustomerProfileClientService customerProfileClientService = (CustomerProfileClientService) doubleCheck.getValue();
                CoroutineContext coroutineContext2 = (CoroutineContext) lambdaProvider.lambda.invoke();
                c4BClientService.getClass();
                customerProfileClientService.getClass();
                coroutineContext2.getClass();
                return new n(17, c4BClientService, customerProfileClientService, coroutineContext2);
            case 2:
                AppService appService = (AppService) doubleCheck2.getValue();
                CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) doubleCheck.getValue();
                CoroutineContext coroutineContext3 = (CoroutineContext) lambdaProvider.lambda.invoke();
                appService.getClass();
                cashAccountDatabaseImpl2.getClass();
                coroutineContext3.getClass();
                return new EglCore(appService, cashAccountDatabaseImpl2, coroutineContext3);
            case 3:
                CashAccountDatabaseImpl cashAccountDatabaseImpl3 = (CashAccountDatabaseImpl) doubleCheck2.getValue();
                RegistrarClientService registrarClientService = (RegistrarClientService) doubleCheck.getValue();
                CoroutineContext coroutineContext4 = (CoroutineContext) lambdaProvider.lambda.invoke();
                cashAccountDatabaseImpl3.getClass();
                registrarClientService.getClass();
                coroutineContext4.getClass();
                return new MarkwonConfiguration(cashAccountDatabaseImpl3, registrarClientService, coroutineContext4);
            case 4:
                CryptoService cryptoService = (CryptoService) doubleCheck2.getValue();
                CashAccountDatabaseImpl cashAccountDatabaseImpl4 = (CashAccountDatabaseImpl) doubleCheck.getValue();
                CoroutineContext coroutineContext5 = (CoroutineContext) lambdaProvider.lambda.invoke();
                cryptoService.getClass();
                cashAccountDatabaseImpl4.getClass();
                coroutineContext5.getClass();
                return new EglCore(cryptoService, cashAccountDatabaseImpl4, coroutineContext5);
            case 5:
                CashAccountDatabaseImpl cashAccountDatabaseImpl5 = (CashAccountDatabaseImpl) doubleCheck2.getValue();
                CashAccountDatabaseImpl cashAccountDatabaseImpl6 = (CashAccountDatabaseImpl) doubleCheck.getValue();
                CoroutineContext coroutineContext6 = (CoroutineContext) lambdaProvider.lambda.invoke();
                cashAccountDatabaseImpl5.getClass();
                cashAccountDatabaseImpl6.getClass();
                coroutineContext6.getClass();
                return new EglCore(cashAccountDatabaseImpl5, cashAccountDatabaseImpl6, coroutineContext6);
            case 6:
                CashAccountDatabaseImpl cashAccountDatabaseImpl7 = (CashAccountDatabaseImpl) doubleCheck2.getValue();
                AppService appService2 = (AppService) doubleCheck.getValue();
                CoroutineContext coroutineContext7 = (CoroutineContext) lambdaProvider.lambda.invoke();
                cashAccountDatabaseImpl7.getClass();
                appService2.getClass();
                coroutineContext7.getClass();
                return new EglCore(cashAccountDatabaseImpl7, appService2, coroutineContext7);
            case 7:
                RealAppMessageManager realAppMessageManager = (RealAppMessageManager) doubleCheck2.getValue();
                CashAccountDatabaseImpl cashAccountDatabaseImpl8 = (CashAccountDatabaseImpl) doubleCheck.getValue();
                CoroutineContext coroutineContext8 = (CoroutineContext) lambdaProvider.lambda.invoke();
                realAppMessageManager.getClass();
                cashAccountDatabaseImpl8.getClass();
                coroutineContext8.getClass();
                return new EglCore(realAppMessageManager, cashAccountDatabaseImpl8, coroutineContext8);
            default:
                PiggybankAppService piggybankAppService = (PiggybankAppService) doubleCheck2.getValue();
                CashAccountDatabaseImpl cashAccountDatabaseImpl9 = (CashAccountDatabaseImpl) doubleCheck.getValue();
                CoroutineContext coroutineContext9 = (CoroutineContext) lambdaProvider.lambda.invoke();
                piggybankAppService.getClass();
                cashAccountDatabaseImpl9.getClass();
                coroutineContext9.getClass();
                return new EglCore(piggybankAppService, cashAccountDatabaseImpl9, coroutineContext9);
        }
    }
}
