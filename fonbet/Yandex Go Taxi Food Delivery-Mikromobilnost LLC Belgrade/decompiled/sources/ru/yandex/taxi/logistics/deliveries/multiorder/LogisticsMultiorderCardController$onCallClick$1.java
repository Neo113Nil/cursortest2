package ru.yandex.taxi.logistics.deliveries.multiorder;

import defpackage.aj7;
import defpackage.fjz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.riz;
import defpackage.siz;
import defpackage.tiz;
import defpackage.tje;
import defpackage.tse;
import defpackage.v7j0;
import defpackage.w511;
import defpackage.wls;
import defpackage.yxe0;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.deliveries.multiorder.LogisticsMultiorderCardController$onCallClick$1", f = "LogisticsMultiorderCardController.kt", l = {HProv.PP_CACHE_SIZE, HProv.PP_SECURITY_LEVEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class LogisticsMultiorderCardController$onCallClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ tiz $communicationMethod;
    final /* synthetic */ Map<String, Object> $deliveriesMetrics;
    boolean Z$0;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.logistics.deliveries.multiorder.LogisticsMultiorderCardController$onCallClick$1$1", f = "LogisticsMultiorderCardController.kt", l = {HProv.PP_SAME_MEDIA}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.logistics.deliveries.multiorder.LogisticsMultiorderCardController$onCallClick$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ tiz $communicationMethod;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, tiz tizVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$communicationMethod = tizVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$communicationMethod, continuation);
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
                c cVar = this.this$0;
                siz sizVar = (siz) this.$communicationMethod;
                this.label = 1;
                if (c.a(cVar, sizVar, this) == coroutineSingletons) {
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
    public LogisticsMultiorderCardController$onCallClick$1(c cVar, Map map, tiz tizVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$deliveriesMetrics = map;
        this.$communicationMethod = tizVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LogisticsMultiorderCardController$onCallClick$1(this.this$0, this.$deliveriesMetrics, this.$communicationMethod, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LogisticsMultiorderCardController$onCallClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        if (ru.yandex.taxi.logistics.deliveries.multiorder.c.b(r3, r19) == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        if (r2 == r1) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            fjz fjzVar = this.this$0.a;
            Map<String, Object> map = this.$deliveriesMetrics;
            if (map == null) {
                map = kotlin.collections.b.f();
            }
            yxe0.b(fjzVar.f, map.toString(), "call", null, null, null, null, null, null, null, null, 2044);
            v7j0 v7j0Var = this.this$0.i;
            this.label = 1;
            d = ((com.yandex.go.permission.b) v7j0Var).d(2, this);
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
            d = obj;
        }
        boolean booleanValue = ((Boolean) d).booleanValue();
        if (booleanValue) {
            tiz tizVar = this.$communicationMethod;
            if (tizVar instanceof riz) {
                ((aj7) this.this$0.b).b(((riz) tizVar).a, false);
            } else {
                if (!(tizVar instanceof siz)) {
                    w511.b();
                    return null;
                }
                c cVar = this.this$0;
                tje.N(cVar.e, null, null, new AnonymousClass1(cVar, tizVar, null), 3);
            }
        } else {
            c cVar2 = this.this$0;
            this.Z$0 = booleanValue;
            this.label = 2;
        }
        return zy11.a;
    }
}
