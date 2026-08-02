package ru.yandex.taxi.communications.activity;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tka1;
import defpackage.tse;
import defpackage.uyj;
import defpackage.w511;
import defpackage.w8x;
import defpackage.wls;
import defpackage.x8x;
import defpackage.y8x;
import defpackage.z8x;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.banners.model.h;
import ru.yandex.taxi.launch.c;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz8x;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Lz8x;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.communications.activity.PromotionsLifecycleListener$onLargestContentfulPaint$1", f = "PromotionsLifecycleListener.kt", l = {44, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PromotionsLifecycleListener$onLargestContentfulPaint$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.communications.activity.PromotionsLifecycleListener$onLargestContentfulPaint$1$1", f = "PromotionsLifecycleListener.kt", l = {56}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.communications.activity.PromotionsLifecycleListener$onLargestContentfulPaint$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
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
            if (i == 0) {
                b.b(obj);
                h hVar = (h) this.this$0.f.get();
                this.label = 1;
                if (hVar.m(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionsLifecycleListener$onLargestContentfulPaint$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PromotionsLifecycleListener$onLargestContentfulPaint$1 promotionsLifecycleListener$onLargestContentfulPaint$1 = new PromotionsLifecycleListener$onLargestContentfulPaint$1(this.this$0, continuation);
        promotionsLifecycleListener$onLargestContentfulPaint$1.L$0 = obj;
        return promotionsLifecycleListener$onLargestContentfulPaint$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PromotionsLifecycleListener$onLargestContentfulPaint$1) create((z8x) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ae, code lost:
    
        if (defpackage.tje.k0(r14, r0, r13) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x002f, code lost:
    
        if (r14.d(r13) == r1) goto L38;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        z8x z8xVar = (z8x) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            c cVar = this.this$0.a;
            this.L$0 = z8xVar;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        if (!jl40.l(z8xVar, w8x.a)) {
            if (z8xVar instanceof x8x) {
                a aVar = this.this$0;
                x8x x8xVar = (x8x) z8xVar;
                aVar.getClass();
                Long b = x8xVar.b();
                long longValue = b != null ? b.longValue() * 60000 : 86400000L;
                ru.yandex.taxi.jobs.b bVar = aVar.b;
                Long a = x8xVar.a();
                long longValue2 = a != null ? a.longValue() * 60000 : longValue;
                Boolean c = x8xVar.c();
                boolean booleanValue = c != null ? c.booleanValue() : true;
                Boolean d = x8xVar.d();
                bVar.e(tka1.j("sync_promotions", longValue, longValue2, booleanValue, d != null ? d.booleanValue() : true));
            } else {
                if (!jl40.l(z8xVar, y8x.a)) {
                    w511.b();
                    return null;
                }
                this.this$0.d.getClass();
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.L$0 = null;
                this.label = 2;
            }
        }
        return zy11.a;
    }
}
