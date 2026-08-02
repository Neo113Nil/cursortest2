package ru.yandex.taxi.layers.source.factory;

import defpackage.a5e0;
import defpackage.cwa1;
import defpackage.d5e0;
import defpackage.if61;
import defpackage.j4e0;
import defpackage.m4e0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p4e0;
import defpackage.q5z;
import defpackage.s4e0;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.wls;
import defpackage.x4e0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "", "Lx4e0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.source.factory.PolylinesFactory$createPolylines$1", f = "PolylinesFactory.kt", l = {31}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PolylinesFactory$createPolylines$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<j4e0> $features;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolylinesFactory$createPolylines$1(List list, e eVar, Continuation continuation) {
        super(2, continuation);
        this.$features = list;
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PolylinesFactory$createPolylines$1 polylinesFactory$createPolylines$1 = new PolylinesFactory$createPolylines$1(this.$features, this.this$0, continuation);
        polylinesFactory$createPolylines$1.L$0 = obj;
        return polylinesFactory$createPolylines$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PolylinesFactory$createPolylines$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014a A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x4e0 x4e0Var;
        m4e0 b;
        List a;
        s4e0 c;
        Float[] a2;
        String e;
        Float d;
        d5e0 c2;
        Float b2;
        d5e0 c3;
        Float b3;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List<j4e0> list = this.$features;
            e eVar = this.this$0;
            ArrayList arrayList = new ArrayList();
            for (j4e0 j4e0Var : list) {
                eVar.getClass();
                String a3 = j4e0Var.getA();
                if (a3 != null && (b = j4e0Var.getB()) != null && (a = b.getA()) != null) {
                    List list2 = a;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(cwa1.d((zzs) it.next()));
                    }
                    p4e0 c4 = j4e0Var.getC();
                    if (c4 != null && (c = c4.getC()) != null && (a2 = c.getA()) != null) {
                        if61 l = a.l(a2);
                        Float b4 = j4e0Var.getC().getC().getB();
                        if (b4 != null) {
                            float floatValue = b4.floatValue();
                            if (j4e0Var.getC().getD() != null && (e = j4e0Var.getC().getE()) != null) {
                                a5e0 a4 = j4e0Var.getC().getA();
                                int Q = q5z.Q(-65536, a4 != null ? a4.getA() : null);
                                a5e0 a5 = j4e0Var.getC().getA();
                                float floatValue2 = (a5 == null || (b3 = a5.getB()) == null) ? 4.0f : b3.floatValue();
                                a5e0 a6 = j4e0Var.getC().getA();
                                int Q2 = q5z.Q(0, (a6 == null || (c3 = a6.getC()) == null) ? null : c3.getA());
                                a5e0 a7 = j4e0Var.getC().getA();
                                float floatValue3 = (a7 == null || (c2 = a7.getC()) == null || (b2 = c2.getB()) == null) ? 2.0f : b2.floatValue();
                                a5e0 a8 = j4e0Var.getC().getA();
                                x4e0Var = new x4e0(a3, arrayList2, l, floatValue, e, Q, floatValue2, Q2, floatValue3, (a8 == null || (d = a8.getD()) == null) ? 10.0f : d.floatValue());
                                if (x4e0Var == null) {
                                    arrayList.add(x4e0Var);
                                }
                            }
                        }
                    }
                }
                x4e0Var = null;
                if (x4e0Var == null) {
                }
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(arrayList, this) == coroutineSingletons) {
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
