package ru.yandex.taxi.scooters.data.mapper;

import defpackage.b9o;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.xnt;
import defpackage.zy11;
import java.io.BufferedInputStream;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lb9o;", "<anonymous>", "(Ltse;)Lb9o;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.data.mapper.ScootersErrorMapper$parseErrorResponse$errorResponse$1", f = "ScootersErrorMapper.kt", l = {122}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersErrorMapper$parseErrorResponse$errorResponse$1 extends SuspendLambda implements wls {
    final /* synthetic */ BufferedInputStream $errorBody;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.scooters.data.mapper.ScootersErrorMapper$parseErrorResponse$errorResponse$1$1", f = "ScootersErrorMapper.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.scooters.data.mapper.ScootersErrorMapper$parseErrorResponse$errorResponse$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ BufferedInputStream $errorBody;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BufferedInputStream bufferedInputStream, Continuation continuation) {
            super(2, continuation);
            this.$errorBody = bufferedInputStream;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$errorBody, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return s8o.L(this.$errorBody);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersErrorMapper$parseErrorResponse$errorResponse$1(c cVar, BufferedInputStream bufferedInputStream, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$errorBody = bufferedInputStream;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersErrorMapper$parseErrorResponse$errorResponse$1(this.this$0, this.$errorBody, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersErrorMapper$parseErrorResponse$errorResponse$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.b.getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$errorBody, null);
            this.label = 1;
            obj = tje.k0(mdhVar, anonymousClass1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        String str = (String) obj;
        if (str == null) {
            return null;
        }
        return (b9o) ((xnt) this.this$0.a).c(str, b9o.Companion.serializer());
    }
}
