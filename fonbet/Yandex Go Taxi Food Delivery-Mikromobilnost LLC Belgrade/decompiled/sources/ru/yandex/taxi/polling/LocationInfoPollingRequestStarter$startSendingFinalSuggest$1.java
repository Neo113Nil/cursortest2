package ru.yandex.taxi.polling;

import defpackage.c9z;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.polling.LocationInfoPollingRequestStarter$startSendingFinalSuggest$1", f = "LocationInfoPollingRequestStarter.kt", l = {BuildConfig.API_LEVEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class LocationInfoPollingRequestStarter$startSendingFinalSuggest$1 extends SuspendLambda implements wls {
    final /* synthetic */ c9z $pollingData;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.polling.LocationInfoPollingRequestStarter$startSendingFinalSuggest$1$1", f = "LocationInfoPollingRequestStarter.kt", l = {HProv.PP_INFO, 119}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.polling.LocationInfoPollingRequestStarter$startSendingFinalSuggest$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ c9z $pollingData;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c9z c9zVar, Continuation continuation, d dVar) {
            super(2, continuation);
            this.this$0 = dVar;
            this.$pollingData = c9zVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$pollingData, continuation, this.this$0);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
        
            if (kotlinx.coroutines.a.i(r5, r7) != r0) goto L7;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x003d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0057 -> B:6:0x0017). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            d dVar;
            c9z c9zVar;
            d dVar2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                dVar = this.this$0;
                c9zVar = this.$pollingData;
                if (kotlinx.coroutines.a.p(get_context())) {
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c9zVar = (c9z) this.L$1;
                    dVar2 = (d) this.L$0;
                    kotlin.b.b(obj);
                    dVar = dVar2;
                    if (kotlinx.coroutines.a.p(get_context())) {
                        return zy11.a;
                    }
                    this.L$0 = dVar;
                    this.L$1 = c9zVar;
                    this.label = 1;
                    if (d.d(dVar, this) != coroutineSingletons) {
                        dVar2 = dVar;
                        long j = c9zVar.b;
                        this.L$0 = dVar2;
                        this.L$1 = c9zVar;
                        this.label = 2;
                    }
                    return coroutineSingletons;
                }
                c9zVar = (c9z) this.L$1;
                dVar2 = (d) this.L$0;
                kotlin.b.b(obj);
                long j2 = c9zVar.b;
                this.L$0 = dVar2;
                this.L$1 = c9zVar;
                this.label = 2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationInfoPollingRequestStarter$startSendingFinalSuggest$1(c9z c9zVar, Continuation continuation, d dVar) {
        super(2, continuation);
        this.$pollingData = c9zVar;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocationInfoPollingRequestStarter$startSendingFinalSuggest$1(this.$pollingData, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationInfoPollingRequestStarter$startSendingFinalSuggest$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c9z c9zVar = this.$pollingData;
            long j = c9zVar.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c9zVar, null, this.this$0);
            this.label = 1;
            if (kotlinx.coroutines.a.u(j, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
