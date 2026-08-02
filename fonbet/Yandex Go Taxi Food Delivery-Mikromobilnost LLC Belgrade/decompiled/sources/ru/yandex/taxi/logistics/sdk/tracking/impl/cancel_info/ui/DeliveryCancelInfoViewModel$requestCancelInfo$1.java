package ru.yandex.taxi.logistics.sdk.tracking.impl.cancel_info.ui;

import defpackage.bpc;
import defpackage.bxh;
import defpackage.czh;
import defpackage.dpc;
import defpackage.fpc;
import defpackage.hxh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vwa0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.cancel_info.ui.DeliveryCancelInfoViewModel$requestCancelInfo$1", f = "DeliveryCancelInfoViewModel.kt", l = {66, 72, 81}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryCancelInfoViewModel$requestCancelInfo$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryCancelInfoViewModel$requestCancelInfo$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryCancelInfoViewModel$requestCancelInfo$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryCancelInfoViewModel$requestCancelInfo$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r7 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        if (com.yandex.delivery.utils.dialogmanager.a.e(r6.this$0.w, (defpackage.bpc) r7, r6) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003c, code lost:
    
        if (r7 == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            ru.yandex.taxi.logistics.sdk.tracking.domain.impl.repository.a aVar = bVar.c;
            String str = bVar.b.a;
            this.label = 1;
            obj = aVar.b(str, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    ((czh) this.this$0.y.a).dismiss();
                    return zy11.a;
                }
                kotlin.b.b(obj);
                hxh hxhVar = (hxh) obj;
                r0 r0Var = this.this$0.A;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, hxhVar));
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        fpc fpcVar = (fpc) obj;
        if (fpcVar instanceof dpc) {
            b bVar2 = this.this$0;
            bxh bxhVar = (bxh) ((dpc) fpcVar).a;
            bVar2.C = bxhVar.a;
            ru.yandex.taxi.logistics.sdk.tracking.impl.cancel_info.mapper.a aVar2 = bVar2.x;
            vwa0 vwa0Var = bVar2.b.b;
            this.L$0 = null;
            this.label = 2;
            obj = aVar2.a(bxhVar, vwa0Var, this);
        } else {
            if (!(fpcVar instanceof bpc)) {
                w511.b();
                return null;
            }
            this.L$0 = null;
            this.label = 3;
        }
        return coroutineSingletons;
    }
}
