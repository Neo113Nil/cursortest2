package ru.yandex.taxi.preorder.source.pickup;

import defpackage.dgv;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.wpb0;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.pickup.PickupHelper$preloadPickupImages$1", f = "PickupHelper.kt", l = {284, 299}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PickupHelper$preloadPickupImages$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<wpb0> $points;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickupHelper$preloadPickupImages$1(a aVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$points = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PickupHelper$preloadPickupImages$1 pickupHelper$preloadPickupImages$1 = new PickupHelper$preloadPickupImages$1(this.this$0, this.$points, continuation);
        pickupHelper$preloadPickupImages$1.L$0 = obj;
        return pickupHelper$preloadPickupImages$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PickupHelper$preloadPickupImages$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c1, code lost:
    
        if (kotlinx.coroutines.a.b(r2, r11) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x002f, code lost:
    
        if (r12.b(r11) == r1) goto L41;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.yandex.go.lifecycle.a aVar = this.this$0.g;
            this.L$0 = tseVar;
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
        List<wpb0> list = this.$points;
        a aVar2 = this.this$0;
        ArrayList arrayList = new ArrayList();
        for (wpb0 wpb0Var : list) {
            SetBuilder setBuilder = new SetBuilder();
            String str = wpb0Var.e;
            if (str == null) {
                str = "";
            }
            if (str.length() != 0) {
                k7x0 k7x0Var = aVar2.c;
                String str2 = wpb0Var.e;
                setBuilder.add(((m7x0) k7x0Var).a(str2 != null ? str2 : ""));
            }
            dgv dgvVar = wpb0Var.j;
            String b = dgvVar != null ? dgvVar.getB() : null;
            if (b != null && b.length() != 0) {
                setBuilder.add(b);
            }
            ycc.r(setBuilder.b(), arrayList);
        }
        a aVar3 = this.this$0;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(tje.h(tseVar, null, null, new PickupHelper$preloadPickupImages$1$2$1(aVar3, (String) it.next(), null), 3));
        }
        this.L$0 = null;
        this.label = 2;
    }
}
