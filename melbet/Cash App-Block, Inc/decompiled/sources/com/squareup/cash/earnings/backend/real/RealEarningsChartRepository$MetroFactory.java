package com.squareup.cash.earnings.backend.real;

import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletHomeMapper;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.fillr.real.FillrInitializer;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.kgoose.api.v3.NextBestActionService;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAppService;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class RealEarningsChartRepository$MetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final DoubleCheck appService;
    public final Provider earningsSyncStateRepository;
    public final LambdaProvider ioDispatcher;

    public RealEarningsChartRepository$MetroFactory(RealMessageSigner.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck) {
        this.$r8$classId = 1;
        this.ioDispatcher = lambdaProvider;
        this.appService = doubleCheck;
        this.earningsSyncStateRepository = metroFactory;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        DoubleCheck doubleCheck = this.appService;
        Provider provider = this.earningsSyncStateRepository;
        LambdaProvider lambdaProvider = this.ioDispatcher;
        switch (i) {
            case 0:
                RealEarningsSyncStateRepository realEarningsSyncStateRepository = (RealEarningsSyncStateRepository) provider.invoke();
                PaychecksAppService paychecksAppService = (PaychecksAppService) doubleCheck.getValue();
                CoroutineContext coroutineContext = (CoroutineContext) lambdaProvider.lambda.invoke();
                realEarningsSyncStateRepository.getClass();
                paychecksAppService.getClass();
                coroutineContext.getClass();
                return new EglCore(7, realEarningsSyncStateRepository, paychecksAppService, coroutineContext);
            case 1:
                AndroidStringManager androidStringManager = (AndroidStringManager) lambdaProvider.lambda.invoke();
                FeatureFlagManager featureFlagManager = (FeatureFlagManager) doubleCheck.getValue();
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) provider.invoke();
                androidStringManager.getClass();
                featureFlagManager.getClass();
                factory.getClass();
                return new AfterpayAppletHomeMapper(featureFlagManager, factory, androidStringManager);
            case 2:
                RealEarningsSyncStateRepository realEarningsSyncStateRepository2 = (RealEarningsSyncStateRepository) provider.invoke();
                PaychecksAppService paychecksAppService2 = (PaychecksAppService) doubleCheck.getValue();
                CoroutineContext coroutineContext2 = (CoroutineContext) lambdaProvider.lambda.invoke();
                realEarningsSyncStateRepository2.getClass();
                paychecksAppService2.getClass();
                coroutineContext2.getClass();
                return new RealEarningsStreamsRepository(realEarningsSyncStateRepository2, paychecksAppService2, coroutineContext2);
            default:
                ErrorReporter errorReporter = (ErrorReporter) lambdaProvider.lambda.invoke();
                SampleStrategy sampleStrategy = (SampleStrategy) provider.invoke();
                NextBestActionService nextBestActionService = (NextBestActionService) doubleCheck.getValue();
                errorReporter.getClass();
                sampleStrategy.getClass();
                nextBestActionService.getClass();
                return new EglCore(22, errorReporter, sampleStrategy, nextBestActionService);
        }
    }

    public /* synthetic */ RealEarningsChartRepository$MetroFactory(FillrInitializer.MetroFactory metroFactory, DoubleCheck doubleCheck, LambdaProvider lambdaProvider, int i) {
        this.$r8$classId = i;
        this.earningsSyncStateRepository = metroFactory;
        this.appService = doubleCheck;
        this.ioDispatcher = lambdaProvider;
    }

    public RealEarningsChartRepository$MetroFactory(LambdaProvider lambdaProvider, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, DoubleCheck doubleCheck) {
        this.$r8$classId = 3;
        this.ioDispatcher = lambdaProvider;
        this.earningsSyncStateRepository = musicViewFactory$MetroFactory;
        this.appService = doubleCheck;
    }
}
