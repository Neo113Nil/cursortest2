package ru.yandex.taxi.banners.model;

import androidx.lifecycle.Lifecycle;
import defpackage.b2k;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.model.PromotionsProvider$init$1", f = "PromotionsProvider.kt", l = {85, MSException.ERROR_INVALID_PARAMETER}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PromotionsProvider$init$1 extends SuspendLambda implements wls {
    final /* synthetic */ Lifecycle $appLifecycle;
    int label;
    final /* synthetic */ h this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.banners.model.PromotionsProvider$init$1$1", f = "PromotionsProvider.kt", l = {90}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.banners.model.PromotionsProvider$init$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ h this$0;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzy11;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "ru.yandex.taxi.banners.model.PromotionsProvider$init$1$1$1", f = "PromotionsProvider.kt", l = {103}, m = "invokeSuspend", v = 2)
        /* renamed from: ru.yandex.taxi.banners.model.PromotionsProvider$init$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C01041 extends SuspendLambda implements wls {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ h this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01041(h hVar, Continuation continuation) {
                super(2, continuation);
                this.this$0 = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C01041 c01041 = new C01041(this.this$0, continuation);
                c01041.L$0 = obj;
                return c01041;
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((C01041) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String str = (String) this.L$0;
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
                if (!jl40.l(str, this.this$0.w)) {
                    h hVar = this.this$0;
                    hVar.w = str;
                    if (!hVar.u) {
                        hVar.u = true;
                        return zy11Var;
                    }
                    this.L$0 = null;
                    this.label = 1;
                    if (hVar.m(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(h hVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
            h hVar = this.this$0;
            if (hVar.k.a) {
                b2k b2kVar = hVar.d.a;
                C01041 c01041 = new C01041(hVar, null);
                this.label = 1;
                if (kotlinx.coroutines.flow.e.k(b2kVar, c01041, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionsProvider$init$1(h hVar, Lifecycle lifecycle, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$appLifecycle = lifecycle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PromotionsProvider$init$1(this.this$0, this.$appLifecycle, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PromotionsProvider$init$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (androidx.lifecycle.b0.b(r7, r1, r4, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r7.m(r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0.g;
            tje.N(dVar.t, null, null, new BannersLoader$init$1(dVar, null), 3);
            h hVar = this.this$0;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        Lifecycle lifecycle = this.$appLifecycle;
        Lifecycle.State state = Lifecycle.State.RESUMED;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
        this.label = 2;
    }
}
