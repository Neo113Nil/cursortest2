package ru.domesticroots.certificatetransparency.datasource;

import defpackage.jpg;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Value", "Ltse;", "", "Lzy11;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
@mvg(c = "ru.domesticroots.certificatetransparency.datasource.DataSource$compose$1$set$2", f = "DataSource.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DataSource$compose$1$set$2 extends SuspendLambda implements wls {
    final /* synthetic */ jpg $b;
    final /* synthetic */ Object $value;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ jpg this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Value", "Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
    @mvg(c = "ru.domesticroots.certificatetransparency.datasource.DataSource$compose$1$set$2$1", f = "DataSource.kt", l = {70}, m = "invokeSuspend")
    /* renamed from: ru.domesticroots.certificatetransparency.datasource.DataSource$compose$1$set$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ Object $value;
        int label;
        final /* synthetic */ jpg this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(jpg jpgVar, Object obj, Continuation continuation) {
            super(2, continuation);
            this.this$0 = jpgVar;
            this.$value = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$value, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                jpg jpgVar = this.this$0;
                Object obj2 = this.$value;
                this.label = 1;
                if (jpgVar.k(obj2, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Value", "Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
    @mvg(c = "ru.domesticroots.certificatetransparency.datasource.DataSource$compose$1$set$2$2", f = "DataSource.kt", l = {70}, m = "invokeSuspend")
    /* renamed from: ru.domesticroots.certificatetransparency.datasource.DataSource$compose$1$set$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ jpg $b;
        final /* synthetic */ Object $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(jpg jpgVar, Object obj, Continuation continuation) {
            super(2, continuation);
            this.$b = jpgVar;
            this.$value = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$b, this.$value, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                jpg jpgVar = this.$b;
                Object obj2 = this.$value;
                this.label = 1;
                if (jpgVar.k(obj2, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataSource$compose$1$set$2(jpg jpgVar, Object obj, jpg jpgVar2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jpgVar;
        this.$value = obj;
        this.$b = jpgVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DataSource$compose$1$set$2 dataSource$compose$1$set$2 = new DataSource$compose$1$set$2(this.this$0, this.$value, this.$b, continuation);
        dataSource$compose$1$set$2.L$0 = obj;
        return dataSource$compose$1$set$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DataSource$compose$1$set$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        tse tseVar = (tse) this.L$0;
        noh[] nohVarArr = {tje.h(tseVar, null, null, new AnonymousClass1(this.this$0, this.$value, null), 3), tje.h(tseVar, null, null, new AnonymousClass2(this.$b, this.$value, null), 3)};
        this.label = 1;
        Object c = kotlinx.coroutines.a.c(nohVarArr, this);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
