package com.squareup.cash;

import android.content.Context;
import app.cash.badging.backend.BadgeClearingWorker;
import app.cash.badging.backend.InternalBadger;
import app.cash.cdp.backend.android.BatchUploadWorker;
import app.cash.cdp.backend.jvm.BatchUploader;
import app.cash.cdp.backend.jvm.JvmBatchUploadWorker;
import app.cash.cdp.integration.CashCdpConfigProvider;
import app.cash.cdp.integration.CashCdpMessageBackfiller;
import app.cash.cdp.persistence.repository.PersistedEventRepository;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.VariantSandboxedComponent;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.lottie.CashSansFontsKt;
import com.squareup.cash.notifications.CashNotificationFactory;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.payments.backend.api.OfflineManager;
import com.squareup.cash.payments.backend.real.OfflineWorker;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.support.chat.backend.real.RealChatNotificationSuppressor;
import com.squareup.cash.ui.gcm.NotificationWorker;
import com.squareup.cash.ui.gcm.SandboxedCashWorkerFactory;
import com.squareup.moshi.Moshi;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;
import retrofit2.OkHttpCall;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class CashApp$onCreate$5 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CashApp $application;
    public final /* synthetic */ int $r8$classId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CashApp$onCreate$5(CashApp cashApp, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$application = cashApp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        CashApp cashApp = this.$application;
        switch (i) {
            case 0:
                return new CashApp$onCreate$5(cashApp, continuation, 0);
            default:
                return new CashApp$onCreate$5(cashApp, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CashApp$onCreate$5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r10 == r0) goto L11;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CashApp cashApp = this.$application;
        Continuation continuation = null;
        switch (i) {
            case 0:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                    this.label = 1;
                    LinkedHashMap linkedHashMap = CashSansFontsKt._CashSansFontMap;
                    Object withContext = JobKt.withContext(defaultIoScheduler, new CashApp$onCreate$1(cashApp, continuation, 4), this);
                    if (withContext != obj2) {
                        withContext = Unit.INSTANCE;
                    }
                    if (withContext == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Deferred sandboxedComponentFlow = cashApp.getSandboxedComponentFlow();
                    this.label = 1;
                    obj = sandboxedComponentFlow.await(this);
                    break;
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                VariantSandboxedComponent.Impl impl = (VariantSandboxedComponent.Impl) ((VariantSandboxedComponent) ((StateFlow) obj).getValue());
                BadgeClearingWorker badgeClearingWorker = new BadgeClearingWorker((InternalBadger) impl.realBadger2Provider.getValue());
                NotificationWorker notificationWorker = new NotificationWorker(impl.getRealVersionUpdater(), (SessionManager) impl.variantAppComponentSessionManagerProvider.lambda.invoke(), impl.getRealNotificationDispatcher(), (Moshi) impl.variantAppComponentMoshiProvider.lambda.invoke(), new CashNotificationFactory((RealClientRouteParser) impl.provideClientRouteParserProvider.getValue(), (RealChatNotificationSuppressor) impl.realChatNotificationSuppressorProvider.getValue()));
                CashCdpConfigProvider cashCdpConfigProvider = (CashCdpConfigProvider) impl.variantAppComponentCdpConfigurationProvider.lambda.invoke();
                Retrofit retrofit = (Retrofit) impl.provideRetrofitProvider.getValue();
                CashCdpMessageBackfiller cashCdpMessageBackfiller = new CashCdpMessageBackfiller((SessionManager) impl.variantAppComponentSessionManagerProvider.lambda.invoke());
                PersistedEventRepository persistedEventRepository = (PersistedEventRepository) impl.persistedEventRepositoryProvider.invoke();
                cashCdpConfigProvider.getClass();
                retrofit.getClass();
                Object create = retrofit.create(BatchUploader.class);
                create.getClass();
                obj3 = new SandboxedCashWorkerFactory(badgeClearingWorker, notificationWorker, new BatchUploadWorker(new JvmBatchUploadWorker(persistedEventRepository, cashCdpConfigProvider, (BatchUploader) create, cashCdpMessageBackfiller)), new OfflineWorker((OfflineManager) impl.realOfflineManagerProvider.invoke()), new OkHttpCall.AnonymousClass1((Context) impl.provideSandboxedContextProvider.getValue(), impl.coroutineScopeInstance), (ErrorReporter) impl.variantAppComponentErrorReporterProvider.lambda.invoke());
                return obj3;
        }
    }
}
