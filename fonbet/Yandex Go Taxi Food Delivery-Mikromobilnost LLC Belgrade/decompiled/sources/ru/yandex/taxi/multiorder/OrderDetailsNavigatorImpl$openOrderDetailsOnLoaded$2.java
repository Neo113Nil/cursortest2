package ru.yandex.taxi.multiorder;

import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import defpackage.a5y0;
import defpackage.c5y0;
import defpackage.g6u;
import defpackage.h3y;
import defpackage.i1w0;
import defpackage.jst;
import defpackage.ls70;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.ovn0;
import defpackage.pdm;
import defpackage.ra00;
import defpackage.rs70;
import defpackage.sjh;
import defpackage.ts70;
import defpackage.tse;
import defpackage.uyj;
import defpackage.vs70;
import defpackage.w0b1;
import defpackage.wls;
import defpackage.ws70;
import defpackage.xby;
import defpackage.xs70;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.multiorder.multi.ServiceType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.multiorder.OrderDetailsNavigatorImpl$openOrderDetailsOnLoaded$2", f = "OrderDetailsNavigatorImpl.kt", l = {45, 49}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class OrderDetailsNavigatorImpl$openOrderDetailsOnLoaded$2 extends SuspendLambda implements wls {
    final /* synthetic */ ls70 $behaviour;
    Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ f this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.multiorder.OrderDetailsNavigatorImpl$openOrderDetailsOnLoaded$2$1", f = "OrderDetailsNavigatorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.multiorder.OrderDetailsNavigatorImpl$openOrderDetailsOnLoaded$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ boolean $isOrderLoaded;
        final /* synthetic */ xs70 $order;
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, f fVar, xs70 xs70Var, Continuation continuation) {
            super(2, continuation);
            this.$isOrderLoaded = z;
            this.this$0 = fVar;
            this.$order = xs70Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$isOrderLoaded, this.this$0, this.$order, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            boolean z = this.$isOrderLoaded;
            f fVar = this.this$0;
            if (z) {
                xs70 xs70Var = this.$order;
                yvf0 yvf0Var = fVar.f;
                h3y h3yVar = fVar.h;
                ra00 ra00Var = fVar.c;
                if (xs70Var instanceof ts70) {
                    i1w0 i1w0Var = (i1w0) h3yVar.get();
                    String alias = ServiceType.LINKED.getAlias();
                    i1w0Var.getClass();
                    i1w0Var.b(alias, DetailsOpenReason.ON_START.alias).m();
                    ts70 ts70Var = (ts70) xs70Var;
                    ra00Var.b((m950) yvf0Var.get(), new c5y0(ts70Var.a, ts70Var.c));
                } else if (xs70Var instanceof vs70) {
                    i1w0 i1w0Var2 = (i1w0) h3yVar.get();
                    String alias2 = ServiceType.SCOOTERS.getAlias();
                    i1w0Var2.getClass();
                    i1w0Var2.b(alias2, DetailsOpenReason.ON_START.alias).m();
                    ra00Var.b((m950) fVar.d.get(), new ovn0(w0b1.b(), ((vs70) xs70Var).a, null));
                } else if (xs70Var instanceof rs70) {
                    i1w0 i1w0Var3 = (i1w0) h3yVar.get();
                    String alias3 = ServiceType.DRIVE.getAlias();
                    i1w0Var3.getClass();
                    i1w0Var3.b(alias3, DetailsOpenReason.ON_START.alias).m();
                    ra00Var.b((m950) fVar.e.get(), pdm.a);
                } else if (xs70Var instanceof ws70) {
                    i1w0 i1w0Var4 = (i1w0) h3yVar.get();
                    String alias4 = ServiceType.TAXI.getAlias();
                    i1w0Var4.getClass();
                    i1w0Var4.b(alias4, DetailsOpenReason.ON_START.alias).m();
                    ra00Var.b((m950) yvf0Var.get(), new a5y0("show taxi details on loaded", null, null, 30));
                } else {
                    xby.t(jst.e, "ORDER_DETAILS_PRESENTATION", null, String.format("OrderId %s loaded, but not supported for open on cold start", Arrays.copyOf(new Object[]{xs70Var.a()}, 1)), 6);
                    ra00Var.a();
                }
            } else {
                fVar.c.a();
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderDetailsNavigatorImpl$openOrderDetailsOnLoaded$2(ls70 ls70Var, f fVar, Continuation continuation) {
        super(2, continuation);
        this.$behaviour = ls70Var;
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderDetailsNavigatorImpl$openOrderDetailsOnLoaded$2(this.$behaviour, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderDetailsNavigatorImpl$openOrderDetailsOnLoaded$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (defpackage.tje.k0(r4, r5, r8) == r0) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [xs70] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, xs70] */
    /* JADX WARN: Type inference failed for: r1v6, types: [xs70] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        ?? r1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            z = false;
            r1 = i;
        }
        if (i == 0) {
            kotlin.b.b(obj);
            ?? r12 = this.$behaviour.a;
            n nVar = (n) this.this$0.g.get();
            String a = r12.a();
            long c = r12.c();
            this.L$0 = r12;
            this.label = 1;
            obj = nVar.a(a, c, this);
            i = r12;
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            ?? r13 = (xs70) this.L$0;
            kotlin.b.b(obj);
            i = r13;
        }
        z = ((Boolean) obj).booleanValue();
        r1 = i;
        this.this$0.b.getClass();
        sjh sjhVar = uyj.a;
        g6u g6uVar = o400.a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(z, this.this$0, r1, null);
        this.L$0 = null;
        this.Z$0 = z;
        this.label = 2;
    }
}
