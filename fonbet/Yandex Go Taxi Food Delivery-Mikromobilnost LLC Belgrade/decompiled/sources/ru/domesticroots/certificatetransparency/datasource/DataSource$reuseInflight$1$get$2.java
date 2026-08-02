package ru.domesticroots.certificatetransparency.datasource;

import defpackage.jpg;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Value", "Ltse;", "Lnoh;", "<anonymous>", "(Ltse;)Lnoh;"}, k = 3, mv = {1, 9, 0})
@mvg(c = "ru.domesticroots.certificatetransparency.datasource.DataSource$reuseInflight$1$get$2", f = "DataSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DataSource$reuseInflight$1$get$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;
    final /* synthetic */ jpg this$1;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, d2 = {"", "Value", "Ltse;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @mvg(c = "ru.domesticroots.certificatetransparency.datasource.DataSource$reuseInflight$1$get$2$1", f = "DataSource.kt", l = {91}, m = "invokeSuspend")
    /* renamed from: ru.domesticroots.certificatetransparency.datasource.DataSource$reuseInflight$1$get$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ jpg this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(jpg jpgVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = jpgVar;
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
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            jpg jpgVar = this.this$0;
            this.label = 1;
            Object b = jpgVar.b(this);
            return b == coroutineSingletons ? coroutineSingletons : b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataSource$reuseInflight$1$get$2(c cVar, jpg jpgVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.this$1 = jpgVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DataSource$reuseInflight$1$get$2 dataSource$reuseInflight$1$get$2 = new DataSource$reuseInflight$1$get$2(this.this$0, this.this$1, continuation);
        dataSource$reuseInflight$1$get$2.L$0 = obj;
        return dataSource$reuseInflight$1$get$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DataSource$reuseInflight$1$get$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tse tseVar = (tse) this.L$0;
        qoh qohVar = this.this$0.a;
        if (qohVar != null) {
            return qohVar;
        }
        qoh h = tje.h(tseVar, null, null, new AnonymousClass1(this.this$1, null), 3);
        c cVar = this.this$0;
        cVar.a = h;
        tje.N(tseVar, null, null, new DataSource$reuseInflight$1$get$2$2$1(h, cVar, null), 3);
        return h;
    }
}
