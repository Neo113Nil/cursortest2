package com.squareup.cash.offers.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.cash.cashsuggest.api.OffersTabSearchResponse;
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
public final class RealOffersTabRepository$search$3$1$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ OffersTabSearchResponse $it;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ RealOffersTabRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealOffersTabRepository$search$3$1$2(RealOffersTabRepository realOffersTabRepository, OffersTabSearchResponse offersTabSearchResponse, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realOffersTabRepository;
        this.$it = offersTabSearchResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new RealOffersTabRepository$search$3$1$2(this.this$0, this.$it, continuation, 0);
            default:
                return new RealOffersTabRepository$search$3$1$2(this.this$0, this.$it, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealOffersTabRepository$search$3$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        OffersTabSearchResponse offersTabSearchResponse = this.$it;
        RealOffersTabRepository realOffersTabRepository = this.this$0;
        switch (i) {
            case 0:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list = offersTabSearchResponse.invalid_recently_viewed_engaged_tokens;
                    this.label = 1;
                    Object withContext = JobKt.withContext(realOffersTabRepository.ioDispatcher, new RealOffersTabRepository$saveSheetPreload$2(realOffersTabRepository, list, (Continuation) null), this);
                    if (withContext != obj2) {
                        withContext = Unit.INSTANCE;
                    }
                    if (withContext == obj2) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    List list2 = offersTabSearchResponse.sheets_preload;
                    this.label = 1;
                    if (realOffersTabRepository.saveSheetPreload(list2, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
