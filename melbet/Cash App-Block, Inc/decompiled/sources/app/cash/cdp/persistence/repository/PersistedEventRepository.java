package app.cash.cdp.persistence.repository;

import com.fillr.n;
import com.squareup.cash.datetimeformatter.real.RealTodayDateTimeFormatter;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db.db.CashAppDatabaseImpl;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.paychecks.presenters.PaychecksActivityFeedProducer;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.userjourneys.tracker.RealCdfJourneyMap;
import com.squareup.cash.userjourneys.tracker.UserJourneyInterceptor;
import com.squareup.cash.userjourneys.tracker.UserJourneySignalProcessor;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.work.data.real.RealShiftTimeFormatter;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class PersistedEventRepository {
    public final CoroutineContext ioDispatcher;
    public final SessionQueries oldQueries;
    public final SessionQueries queries;

    public PersistedEventRepository(CashAccountDatabaseImpl cashAccountDatabaseImpl, CashAppDatabaseImpl cashAppDatabaseImpl, CoroutineContext coroutineContext) {
        this.ioDispatcher = coroutineContext;
        this.queries = cashAppDatabaseImpl.analyticsMessageQueries;
        this.oldQueries = cashAccountDatabaseImpl.analyticsMessageQueries;
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final LambdaProvider appDatabase;
        public final Provider database;
        public final Provider ioDispatcher;

        public MetroFactory(LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3) {
            this.$r8$classId = 1;
            this.database = lambdaProvider;
            this.ioDispatcher = lambdaProvider2;
            this.appDatabase = lambdaProvider3;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.ioDispatcher;
            Provider provider2 = this.database;
            LambdaProvider lambdaProvider = this.appDatabase;
            switch (i) {
                case 0:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider2.invoke();
                    CashAppDatabaseImpl cashAppDatabaseImpl = (CashAppDatabaseImpl) lambdaProvider.lambda.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    cashAccountDatabaseImpl.getClass();
                    cashAppDatabaseImpl.getClass();
                    coroutineContext.getClass();
                    return new PersistedEventRepository(cashAccountDatabaseImpl, cashAppDatabaseImpl, coroutineContext);
                case 1:
                    AndroidClock androidClock = (AndroidClock) provider2.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider.invoke();
                    AndroidDateFormatManager androidDateFormatManager = (AndroidDateFormatManager) lambdaProvider.lambda.invoke();
                    androidClock.getClass();
                    androidStringManager.getClass();
                    androidDateFormatManager.getClass();
                    return new RealTodayDateTimeFormatter(androidClock, androidStringManager, androidDateFormatManager);
                case 2:
                    ErrorReporter errorReporter = (ErrorReporter) lambdaProvider.lambda.invoke();
                    SampleStrategy sampleStrategy = (SampleStrategy) provider2.invoke();
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) provider.invoke();
                    errorReporter.getClass();
                    sampleStrategy.getClass();
                    factory.getClass();
                    return new PaychecksActivityFeedProducer(errorReporter, sampleStrategy, factory);
                case 3:
                    UserJourneyTracker userJourneyTracker = (UserJourneyTracker) provider2.invoke();
                    UserJourneySignalProcessor userJourneySignalProcessor = (UserJourneySignalProcessor) lambdaProvider.lambda.invoke();
                    RealCdfJourneyMap realCdfJourneyMap = (RealCdfJourneyMap) provider.invoke();
                    userJourneyTracker.getClass();
                    userJourneySignalProcessor.getClass();
                    realCdfJourneyMap.getClass();
                    return new UserJourneyInterceptor(userJourneyTracker, userJourneySignalProcessor, realCdfJourneyMap);
                default:
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) lambdaProvider.lambda.invoke();
                    RealShiftTimeFormatter realShiftTimeFormatter = (RealShiftTimeFormatter) provider2.invoke();
                    LocalizedMoneyFormatter.Factory factory2 = (LocalizedMoneyFormatter.Factory) provider.invoke();
                    androidStringManager2.getClass();
                    realShiftTimeFormatter.getClass();
                    factory2.getClass();
                    return new n(androidStringManager2, realShiftTimeFormatter, factory2);
            }
        }

        public /* synthetic */ MetroFactory(LambdaProvider lambdaProvider, Factory factory, RealMessageSigner.MetroFactory metroFactory, int i) {
            this.$r8$classId = i;
            this.appDatabase = lambdaProvider;
            this.database = factory;
            this.ioDispatcher = metroFactory;
        }

        public /* synthetic */ MetroFactory(Provider provider, LambdaProvider lambdaProvider, Provider provider2, int i) {
            this.$r8$classId = i;
            this.database = provider;
            this.appDatabase = lambdaProvider;
            this.ioDispatcher = provider2;
        }
    }
}
