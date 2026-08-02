package com.squareup.cash.offers.backend.real;

import androidx.camera.camera2.impl.FlashControl$applyScreenFlash$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.cash.cashsuggest.api.OffersTabHomeResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealOffersTabRepository$saveHomeResponse$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ OffersTabHomeResponse $response;
    public int label;
    public final /* synthetic */ RealOffersTabRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealOffersTabRepository$saveHomeResponse$2$1(RealOffersTabRepository realOffersTabRepository, OffersTabHomeResponse offersTabHomeResponse, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realOffersTabRepository;
        this.$response = offersTabHomeResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        OffersTabHomeResponse offersTabHomeResponse = this.$response;
        RealOffersTabRepository realOffersTabRepository = this.this$0;
        switch (i) {
            case 0:
                return new RealOffersTabRepository$saveHomeResponse$2$1(offersTabHomeResponse, realOffersTabRepository, continuation);
            default:
                return new RealOffersTabRepository$saveHomeResponse$2$1(realOffersTabRepository, offersTabHomeResponse, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealOffersTabRepository$saveHomeResponse$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    OffersTabHomeResponse offersTabHomeResponse = this.$response;
                    Long l = offersTabHomeResponse.expire_at_ms;
                    if (l != null) {
                        long longValue = l.longValue();
                        this.label = 1;
                        RealOffersTabRepository realOffersTabRepository = this.this$0;
                        Object withContext = JobKt.withContext(realOffersTabRepository.ioDispatcher, new FlashControl$applyScreenFlash$2(offersTabHomeResponse, realOffersTabRepository, longValue, (Continuation) null, 8), this);
                        if (withContext != obj2) {
                            withContext = Unit.INSTANCE;
                        }
                        if (withContext == obj2) {
                            break;
                        }
                    }
                } else if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list = this.$response.sheets_preload;
                    this.label = 1;
                    if (this.this$0.saveSheetPreload(list, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealOffersTabRepository$saveHomeResponse$2$1(OffersTabHomeResponse offersTabHomeResponse, RealOffersTabRepository realOffersTabRepository, Continuation continuation) {
        super(2, continuation);
        this.$response = offersTabHomeResponse;
        this.this$0 = realOffersTabRepository;
    }
}
