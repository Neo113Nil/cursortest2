package com.squareup.cash.payments.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import coil3.request.CachePolicy;
import coil3.request.ImageRequest;
import com.squareup.cash.payments.viewmodels.LocalSticker;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$special$$inlined$filter$1;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PersonalizePaymentPresenter$models$6$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ PersonalizePaymentPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PersonalizePaymentPresenter$models$6$2(PersonalizePaymentPresenter personalizePaymentPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = personalizePaymentPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        PersonalizePaymentPresenter personalizePaymentPresenter = this.this$0;
        switch (i) {
            case 0:
                return new PersonalizePaymentPresenter$models$6$2(personalizePaymentPresenter, continuation, 0);
            default:
                return new PersonalizePaymentPresenter$models$6$2(personalizePaymentPresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PersonalizePaymentPresenter$models$6$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    EmptyList emptyList = EmptyList.INSTANCE;
                    PersonalizePaymentPresenter personalizePaymentPresenter = this.this$0;
                    String str = (String) personalizePaymentPresenter.args.note.getValue();
                    this.label = 1;
                    if (personalizePaymentPresenter.send$presenters(emptyList, str, null, true, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                PersonalizePaymentPresenter personalizePaymentPresenter2 = this.this$0;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CashQrScannerPresenter$special$$inlined$filter$1 cashQrScannerPresenter$special$$inlined$filter$1 = new CashQrScannerPresenter$special$$inlined$filter$1(personalizePaymentPresenter2.personalizePaymentManager.personalizationRepository.loadStickers(), 3);
                    this.label = 1;
                    obj = FlowKt.firstOrNull(cashQrScannerPresenter$special$$inlined$filter$1, this);
                    if (obj == coroutineSingletons2) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                List<LocalSticker> list = (List) obj;
                if (list != null) {
                    for (LocalSticker localSticker : list) {
                        RealImageLoader realImageLoader = personalizePaymentPresenter2.imageLoader;
                        ImageRequest.Builder builder = new ImageRequest.Builder(personalizePaymentPresenter2.context);
                        builder.data = localSticker.previewUrl;
                        CachePolicy cachePolicy = CachePolicy.ENABLED;
                        builder.diskCachePolicy = cachePolicy;
                        builder.memoryCachePolicy = cachePolicy;
                        realImageLoader.enqueue(builder.build());
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
