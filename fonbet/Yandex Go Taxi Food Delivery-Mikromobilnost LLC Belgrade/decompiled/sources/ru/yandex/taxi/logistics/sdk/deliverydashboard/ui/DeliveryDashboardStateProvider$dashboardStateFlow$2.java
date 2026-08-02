package ru.yandex.taxi.logistics.sdk.deliverydashboard.ui;

import defpackage.bpc;
import defpackage.dms;
import defpackage.hhg;
import defpackage.ikg;
import defpackage.jkg;
import defpackage.kkg;
import defpackage.lkg;
import defpackage.lw;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oig;
import defpackage.oo0;
import defpackage.qkg;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Llkg;", "dashboardLoadingState", "", "isDarkTheme", "Loo0;", "currentAddress", "", "", "<unused var>", "Lqkg;", "<anonymous>", "(Llkg;ZLoo0;Ljava/util/Map;)Lqkg;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.DeliveryDashboardStateProvider$dashboardStateFlow$2", f = "DeliveryDashboardStateProvider.kt", l = {41, 47, 52}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryDashboardStateProvider$dashboardStateFlow$2 extends SuspendLambda implements dms {
    int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.DeliveryDashboardStateProvider$dashboardStateFlow$2$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            ((lw) this.receiver).a((hhg) obj);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryDashboardStateProvider$dashboardStateFlow$2(c cVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        DeliveryDashboardStateProvider$dashboardStateFlow$2 deliveryDashboardStateProvider$dashboardStateFlow$2 = new DeliveryDashboardStateProvider$dashboardStateFlow$2(this.this$0, (Continuation) obj5);
        deliveryDashboardStateProvider$dashboardStateFlow$2.L$0 = (lkg) obj;
        deliveryDashboardStateProvider$dashboardStateFlow$2.Z$0 = booleanValue;
        deliveryDashboardStateProvider$dashboardStateFlow$2.L$1 = (oo0) obj3;
        return deliveryDashboardStateProvider$dashboardStateFlow$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ab, code lost:
    
        if (r1 == r4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r0 == r4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        if (r8.b(r1, r10, r17) == r4) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        Object b2;
        lkg lkgVar = (lkg) this.L$0;
        boolean z = this.Z$0;
        oo0 oo0Var = (oo0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (lkgVar instanceof kkg) {
                return this.this$0.e;
            }
            if (lkgVar instanceof jkg) {
                ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.mapper.a aVar = this.this$0.a;
                oig oigVar = ((jkg) lkgVar).a;
                String str = oo0Var.a;
                this.L$0 = null;
                this.L$1 = null;
                this.Z$0 = z;
                this.label = 1;
                b = aVar.b(oigVar, z, str, this);
            } else {
                if (!(lkgVar instanceof ikg)) {
                    w511.b();
                    return null;
                }
                c cVar = this.this$0;
                ru.yandex.taxi.logistics.sdk.deliverydashboard.interactors.a aVar2 = cVar.c;
                bpc bpcVar = ((ikg) lkgVar).a;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, cVar.d, lw.class, "onAction", "onAction(Lcom/yandex/delivery/mapper/model/DashboardAction;)V", 4);
                this.L$0 = null;
                this.L$1 = oo0Var;
                this.Z$0 = z;
                this.label = 2;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            kotlin.b.b(obj);
            b = obj;
            return (qkg) b;
        }
        if (i != 2) {
            if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b2 = obj;
            qkg qkgVar = (qkg) b2;
            if (qkgVar != null) {
                return qkgVar;
            }
            return this.this$0.e;
        }
        kotlin.b.b(obj);
        c cVar2 = this.this$0;
        oig oigVar2 = cVar2.b.a;
        if (oigVar2 != null) {
            ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.mapper.a aVar3 = cVar2.a;
            String str2 = oo0Var.a;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.Z$0 = z;
            this.I$0 = 0;
            this.label = 3;
            b2 = aVar3.b(oigVar2, z, str2, this);
        }
        return this.this$0.e;
    }
}
