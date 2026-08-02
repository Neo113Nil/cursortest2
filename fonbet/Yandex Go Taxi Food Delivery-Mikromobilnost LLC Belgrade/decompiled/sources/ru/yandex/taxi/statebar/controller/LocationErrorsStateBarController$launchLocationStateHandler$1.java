package ru.yandex.taxi.statebar.controller;

import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p8z;
import defpackage.q8z;
import defpackage.r8z;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.w511;
import defpackage.w8z;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.statebar.controller.LocationErrorsStateBarController$launchLocationStateHandler$1", f = "LocationErrorsStateBarController.kt", l = {99}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class LocationErrorsStateBarController$launchLocationStateHandler$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr8z;", "it", "Lzy11;", "<anonymous>", "(Lr8z;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.statebar.controller.LocationErrorsStateBarController$launchLocationStateHandler$1$1", f = "LocationErrorsStateBarController.kt", l = {HProv.PP_HASHOID, HProv.PP_HASHOID}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.statebar.controller.LocationErrorsStateBarController$launchLocationStateHandler$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        long J$0;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((r8z) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        
            if (kotlinx.coroutines.a.i(0, r10) == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        
            if (kotlinx.coroutines.a.i(1000, r10) == r1) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            r8z r8zVar = (r8z) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                if (r8zVar instanceof q8z) {
                    this.this$0.o.getClass();
                    long currentTimeMillis = System.currentTimeMillis() - this.this$0.t;
                    this.L$0 = null;
                    this.J$0 = currentTimeMillis;
                    if (currentTimeMillis > 1000) {
                        this.label = 1;
                    } else {
                        this.label = 2;
                    }
                } else {
                    if (!(r8zVar instanceof p8z)) {
                        w511.b();
                        return null;
                    }
                    b bVar = this.this$0;
                    bVar.o.getClass();
                    bVar.t = System.currentTimeMillis();
                }
            } else {
                if (i != 1 && i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationErrorsStateBarController$launchLocationStateHandler$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocationErrorsStateBarController$launchLocationStateHandler$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocationErrorsStateBarController$launchLocationStateHandler$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            g I = e.I(bVar.m.a, new AnonymousClass1(bVar, null));
            this.this$0.k.getClass();
            sjh sjhVar = uyj.a;
            tpr F = e.F(I, mdh.b);
            w8z w8zVar = new w8z(this.this$0, 2);
            this.label = 1;
            if (F.collect(w8zVar, this) == coroutineSingletons) {
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
