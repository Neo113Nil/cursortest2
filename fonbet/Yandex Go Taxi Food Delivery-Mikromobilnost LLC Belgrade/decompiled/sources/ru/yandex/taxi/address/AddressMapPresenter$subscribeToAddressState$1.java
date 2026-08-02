package ru.yandex.taxi.address;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.q330;
import defpackage.tse;
import defpackage.w31;
import defpackage.w511;
import defpackage.wls;
import defpackage.ye60;
import defpackage.z2e;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i0;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.address.repository.AddressResolveRepository;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.address.AddressMapPresenter$subscribeToAddressState$1", f = "AddressMapPresenter.kt", l = {HProv.PP_HANDLE_COUNT}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AddressMapPresenter$subscribeToAddressState$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/yandex/taxi/address/repository/AddressResolveRepository$State;", "it", "Lzy11;", "<anonymous>", "(Lru/yandex/taxi/address/repository/AddressResolveRepository$State;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.address.AddressMapPresenter$subscribeToAddressState$1$1", f = "AddressMapPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.address.AddressMapPresenter$subscribeToAddressState$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((AddressResolveRepository.State) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AddressResolveRepository.State state = (AddressResolveRepository.State) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            int i = w31.a[state.ordinal()];
            if (i == 1 || i == 2) {
                this.this$0.Pg(new q330(false, false));
                this.this$0.Ng(new z2e(13, false, false, false));
            } else if (i == 3) {
                this.this$0.Pg(new q330(false, false, 1));
                this.this$0.Ng(new z2e(13, false, false, false));
            } else if (i == 4) {
                this.this$0.Pg(new q330(false, true, 1));
                this.this$0.Ng(new z2e(9, false, false, true));
            } else {
                if (i != 5) {
                    w511.b();
                    return null;
                }
                this.this$0.Pg(new q330(false, false, 1));
                this.this$0.Ng(new z2e(9, false, true, false));
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPresenter$subscribeToAddressState$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressMapPresenter$subscribeToAddressState$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressMapPresenter$subscribeToAddressState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        r0 r0Var = cVar.x.a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar, null);
        this.label = 1;
        Object collect = r0Var.collect(new i0(ye60.a, anonymousClass1), this);
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        if (collect != coroutineSingletons) {
            collect = zy11Var;
        }
        return collect == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
