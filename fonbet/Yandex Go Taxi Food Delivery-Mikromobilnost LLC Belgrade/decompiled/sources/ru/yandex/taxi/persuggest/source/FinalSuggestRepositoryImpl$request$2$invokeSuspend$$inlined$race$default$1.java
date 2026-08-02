package ru.yandex.taxi.persuggest.source;

import defpackage.eyc;
import defpackage.fse;
import defpackage.fyc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p0t;
import defpackage.p820;
import defpackage.q6r;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.persuggest.source.FinalSuggestRepositoryImpl$request$2$invokeSuspend$$inlined$race$default$1", f = "FinalSuggestRepositoryImpl.kt", l = {28}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
public final class FinalSuggestRepositoryImpl$request$2$invokeSuspend$$inlined$race$default$1 extends SuspendLambda implements wls {
    final /* synthetic */ fse $context;
    final /* synthetic */ eyc $deferredResponse$inlined;
    final /* synthetic */ q6r $finalSuggestParams$inlined;
    final /* synthetic */ p820 $metaInfo$inlined;
    final /* synthetic */ p0t $requestId$inlined;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.persuggest.source.FinalSuggestRepositoryImpl$request$2$invokeSuspend$$inlined$race$default$1$1", f = "FinalSuggestRepositoryImpl.kt", l = {17}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.persuggest.source.FinalSuggestRepositoryImpl$request$2$invokeSuspend$$inlined$race$default$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ eyc $deferredResponse$inlined;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(eyc eycVar, Continuation continuation) {
            super(2, continuation);
            this.$deferredResponse$inlined = eycVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$deferredResponse$inlined, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
                eyc eycVar = this.$deferredResponse$inlined;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                obj = ((fyc) eycVar).s(this);
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
            return new Pair(obj, Boolean.FALSE);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.persuggest.source.FinalSuggestRepositoryImpl$request$2$invokeSuspend$$inlined$race$default$1$2", f = "FinalSuggestRepositoryImpl.kt", l = {18}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.persuggest.source.FinalSuggestRepositoryImpl$request$2$invokeSuspend$$inlined$race$default$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ q6r $finalSuggestParams$inlined;
        final /* synthetic */ p820 $metaInfo$inlined;
        final /* synthetic */ p0t $requestId$inlined;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Continuation continuation, c cVar, q6r q6rVar, p820 p820Var, p0t p0tVar) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$finalSuggestParams$inlined = q6rVar;
            this.$metaInfo$inlined = p820Var;
            this.$requestId$inlined = p0tVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation, this.this$0, this.$finalSuggestParams$inlined, this.$metaInfo$inlined, this.$requestId$inlined);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
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
                c cVar = this.this$0;
                q6r q6rVar = this.$finalSuggestParams$inlined;
                boolean z = this.$metaInfo$inlined.l;
                p0t p0tVar = this.$requestId$inlined;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                obj = c.a(cVar, q6rVar, z, p0tVar, this);
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
            return new Pair(obj, Boolean.TRUE);
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "<anonymous>"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.coroutines.RaceKt$race$2$1$1", f = "Race.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.persuggest.source.FinalSuggestRepositoryImpl$request$2$invokeSuspend$$inlined$race$default$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(2, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return obj2;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "<anonymous>"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.coroutines.RaceKt$race$2$1$2", f = "Race.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.persuggest.source.FinalSuggestRepositoryImpl$request$2$invokeSuspend$$inlined$race$default$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(2, continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return obj2;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinalSuggestRepositoryImpl$request$2$invokeSuspend$$inlined$race$default$1(fse fseVar, Continuation continuation, eyc eycVar, c cVar, q6r q6rVar, p820 p820Var, p0t p0tVar) {
        super(2, continuation);
        this.$context = fseVar;
        this.$deferredResponse$inlined = eycVar;
        this.this$0 = cVar;
        this.$finalSuggestParams$inlined = q6rVar;
        this.$metaInfo$inlined = p820Var;
        this.$requestId$inlined = p0tVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FinalSuggestRepositoryImpl$request$2$invokeSuspend$$inlined$race$default$1 finalSuggestRepositoryImpl$request$2$invokeSuspend$$inlined$race$default$1 = new FinalSuggestRepositoryImpl$request$2$invokeSuspend$$inlined$race$default$1(this.$context, continuation, this.$deferredResponse$inlined, this.this$0, this.$finalSuggestParams$inlined, this.$metaInfo$inlined, this.$requestId$inlined);
        finalSuggestRepositoryImpl$request$2$invokeSuspend$$inlined$race$default$1.L$0 = obj;
        return finalSuggestRepositoryImpl$request$2$invokeSuspend$$inlined$race$default$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FinalSuggestRepositoryImpl$request$2$invokeSuspend$$inlined$race$default$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h = tje.h(tseVar, this.$context, null, new AnonymousClass1(this.$deferredResponse$inlined, null), 2);
            qoh h2 = tje.h(tseVar, this.$context, null, new AnonymousClass2(null, this.this$0, this.$finalSuggestParams$inlined, this.$metaInfo$inlined, this.$requestId$inlined), 2);
            kotlinx.coroutines.selects.b bVar = new kotlinx.coroutines.selects.b(get_context());
            bVar.h(h.H(), new AnonymousClass3(2, null));
            bVar.h(h2.H(), new AnonymousClass4(2, null));
            this.L$0 = tseVar;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 1;
            obj = bVar.e(this);
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
        kotlinx.coroutines.a.g(tseVar.getCoroutineContext(), null);
        return obj;
    }
}
