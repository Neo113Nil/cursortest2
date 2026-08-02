package com.squareup.cash.blockers.presenters;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.onboarding.util.AliasRegistrar$Args;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class RegisterAliasPresenter$register$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $alias;
    public final /* synthetic */ AliasRegistrar$Args.DeliveryMechanism $deliveryMechanism;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 $updateViewModel;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ RegisterAliasPresenter this$0;

    /* renamed from: com.squareup.cash.blockers.presenters.RegisterAliasPresenter$register$2$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ String $alias;
        public final /* synthetic */ AliasRegistrar$Args.DeliveryMechanism $deliveryMechanism;
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Function1 $updateViewModel;
        public RegisterAliasPresenter L$0;
        public int label;
        public final /* synthetic */ RegisterAliasPresenter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(RegisterAliasPresenter registerAliasPresenter, AliasRegistrar$Args.DeliveryMechanism deliveryMechanism, String str, Function1 function1, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = registerAliasPresenter;
            this.$deliveryMechanism = deliveryMechanism;
            this.$alias = str;
            this.$updateViewModel = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            switch (this.$r8$classId) {
                case 0:
                    return new AnonymousClass1(this.this$0, this.$deliveryMechanism, this.$alias, this.$updateViewModel, continuation, 0);
                default:
                    return new AnonymousClass1(this.this$0, this.$deliveryMechanism, this.$alias, this.$updateViewModel, continuation, 1);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            RegisterAliasPresenter registerAliasPresenter;
            RegisterAliasPresenter registerAliasPresenter2;
            int i = this.$r8$classId;
            Function1 function1 = this.$updateViewModel;
            String str = this.$alias;
            AliasRegistrar$Args.DeliveryMechanism deliveryMechanism = this.$deliveryMechanism;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RegisterAliasPresenter registerAliasPresenter3 = this.this$0;
                        BlockersScreens.RegisterAliasScreen.RegisterAliasType registerAliasType = registerAliasPresenter3.args.registerAliasType;
                        registerAliasType.getClass();
                        this.L$0 = registerAliasPresenter3;
                        this.label = 1;
                        obj = RegisterAliasPresenter.access$createShippingAddressWithAlias(registerAliasPresenter3, this.$deliveryMechanism, this.$alias, (BlockersScreens.RegisterAliasScreen.RegisterAliasType.CreateShippingAddressWithAlias) registerAliasType, this.$updateViewModel, this);
                        if (obj == coroutineSingletons) {
                            break;
                        } else {
                            registerAliasPresenter = registerAliasPresenter3;
                        }
                    } else if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        registerAliasPresenter = this.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    RegisterAliasPresenter.access$handleShippingAddressAliasResult(registerAliasPresenter, (ApiResult) obj, deliveryMechanism, str, function1);
                    break;
                default:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RegisterAliasPresenter registerAliasPresenter4 = this.this$0;
                        BlockersScreens.RegisterAliasScreen.RegisterAliasType registerAliasType2 = registerAliasPresenter4.args.registerAliasType;
                        registerAliasType2.getClass();
                        this.L$0 = registerAliasPresenter4;
                        this.label = 1;
                        obj = RegisterAliasPresenter.access$updateShippingAddressAlias(registerAliasPresenter4, this.$deliveryMechanism, this.$alias, (BlockersScreens.RegisterAliasScreen.RegisterAliasType.SetShippingAddressAlias) registerAliasType2, this.$updateViewModel, this);
                        if (obj == coroutineSingletons2) {
                            break;
                        } else {
                            registerAliasPresenter2 = registerAliasPresenter4;
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        registerAliasPresenter2 = this.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    RegisterAliasPresenter.access$handleShippingAddressAliasResult(registerAliasPresenter2, (ApiResult) obj, deliveryMechanism, str, function1);
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RegisterAliasPresenter$register$2(RegisterAliasPresenter registerAliasPresenter, AliasRegistrar$Args.DeliveryMechanism deliveryMechanism, String str, Function1 function1, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = registerAliasPresenter;
        this.$deliveryMechanism = deliveryMechanism;
        this.$alias = str;
        this.$updateViewModel = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                RegisterAliasPresenter$register$2 registerAliasPresenter$register$2 = new RegisterAliasPresenter$register$2(this.this$0, this.$deliveryMechanism, this.$alias, this.$updateViewModel, continuation, 0);
                registerAliasPresenter$register$2.L$0 = obj;
                return registerAliasPresenter$register$2;
            default:
                RegisterAliasPresenter$register$2 registerAliasPresenter$register$22 = new RegisterAliasPresenter$register$2(this.this$0, this.$deliveryMechanism, this.$alias, this.$updateViewModel, continuation, 1);
                registerAliasPresenter$register$22.L$0 = obj;
                return registerAliasPresenter$register$22;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RegisterAliasPresenter$register$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.this$0, this.$deliveryMechanism, this.$alias, this.$updateViewModel, null, 0), 3);
            default:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return JobKt.launch$default(coroutineScope2, null, null, new AnonymousClass1(this.this$0, this.$deliveryMechanism, this.$alias, this.$updateViewModel, null, 1), 3);
        }
    }
}
