package com.squareup.cash.card.onboarding;

import androidx.room.util.DBUtil;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager$cashLiteConfig$$inlined$map$1;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.db2.StampsConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardStylePickerPresenter$models$1$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ CardStylePickerPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardStylePickerPresenter$models$1$2(CardStylePickerPresenter cardStylePickerPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = cardStylePickerPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        CardStylePickerPresenter cardStylePickerPresenter = this.this$0;
        switch (i) {
            case 0:
                return new CardStylePickerPresenter$models$1$2(cardStylePickerPresenter, continuation, 0);
            case 1:
                return new CardStylePickerPresenter$models$1$2(cardStylePickerPresenter, continuation, 1);
            case 2:
                return new CardStylePickerPresenter$models$1$2(cardStylePickerPresenter, continuation, 2);
            default:
                return new CardStylePickerPresenter$models$1$2(cardStylePickerPresenter, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CardStylePickerPresenter$models$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (((com.squareup.cash.data.db.RealAppConfigManager) r0).update(true, r9) == r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
    
        if (r10 == r5) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object first;
        int i = this.$r8$classId;
        CardStylePickerPresenter cardStylePickerPresenter = this.this$0;
        Continuation continuation = null;
        int i2 = 1;
        switch (i) {
            case 0:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object withContext = JobKt.withContext(cardStylePickerPresenter.ioDispatcher, new CardStylePickerPresenter$models$2$1(cardStylePickerPresenter, continuation, i2), this);
                    if (withContext != obj2) {
                        withContext = Unit.INSTANCE;
                    }
                    if (withContext == obj2) {
                        return obj2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 != 0) {
                    if (i4 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                RealAppConfigManager$cashLiteConfig$$inlined$map$1 realAppConfigManager$cashLiteConfig$$inlined$map$1 = new RealAppConfigManager$cashLiteConfig$$inlined$map$1(new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(cardStylePickerPresenter.cardStudioQueries.select$2()), cardStylePickerPresenter.ioDispatcher), 5);
                this.label = 1;
                Object first2 = FlowKt.first(realAppConfigManager$cashLiteConfig$$inlined$map$1, this);
                return first2 == coroutineSingletons ? coroutineSingletons : first2;
            case 2:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 != 0) {
                    if (i5 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                CardPreviewPresenter$cashtag$$inlined$map$1 cardPreviewPresenter$cashtag$$inlined$map$1 = new CardPreviewPresenter$cashtag$$inlined$map$1(FlowKt.take(cardStylePickerPresenter.profileManager.publicProfile(), 1), i2);
                this.label = 1;
                Object first3 = FlowKt.first(cardPreviewPresenter$cashtag$$inlined$map$1, this);
                return first3 == coroutineSingletons2 ? coroutineSingletons2 : first3;
            default:
                AppConfigManager appConfigManager = cardStylePickerPresenter.appConfig;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FinishSetupTileBadgeCounter stampConfig = ((RealAppConfigManager) appConfigManager).stampConfig();
                    this.label = 1;
                    obj = FlowKt.first(stampConfig, this);
                    break;
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 == 3) {
                                SafeTrace.throwOnFailure(obj);
                                return obj;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        RealTransferManager$addCash$$inlined$map$1 realTransferManager$addCash$$inlined$map$1 = new RealTransferManager$addCash$$inlined$map$1(((RealAppConfigManager) appConfigManager).stampConfig(), cardStylePickerPresenter, 11);
                        this.label = 3;
                        first = FlowKt.first(realTransferManager$addCash$$inlined$map$1, this);
                        if (first != coroutineSingletons3) {
                            return first;
                        }
                        return coroutineSingletons3;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                if (((StampsConfig) obj).stamps == null) {
                    this.label = 2;
                    break;
                }
                RealTransferManager$addCash$$inlined$map$1 realTransferManager$addCash$$inlined$map$12 = new RealTransferManager$addCash$$inlined$map$1(((RealAppConfigManager) appConfigManager).stampConfig(), cardStylePickerPresenter, 11);
                this.label = 3;
                first = FlowKt.first(realTransferManager$addCash$$inlined$map$12, this);
                if (first != coroutineSingletons3) {
                }
                return coroutineSingletons3;
        }
    }
}
