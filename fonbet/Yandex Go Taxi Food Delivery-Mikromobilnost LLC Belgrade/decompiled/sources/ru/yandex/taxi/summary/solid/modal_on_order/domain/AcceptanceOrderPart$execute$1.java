package ru.yandex.taxi.summary.solid.modal_on_order.domain;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.response.TariffAction;
import defpackage.dd;
import defpackage.jl40;
import defpackage.jn40;
import defpackage.md;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.qqy;
import defpackage.rcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.x880;
import defpackage.y880;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.summary.solid.modal_on_order.domain.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.modal_on_order.domain.AcceptanceOrderPart$execute$1", f = "AcceptanceOrderPart.kt", l = {32}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class AcceptanceOrderPart$execute$1 extends SuspendLambda implements wls {
    final /* synthetic */ x880 $chainCallback;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcceptanceOrderPart$execute$1(a aVar, x880 x880Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$chainCallback = x880Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AcceptanceOrderPart$execute$1(this.this$0, this.$chainCallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AcceptanceOrderPart$execute$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        dd ddVar;
        Set set;
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        kotlin.b.b(obj);
        md mdVar = (md) this.this$0.b;
        pex0 m = ((k) mdVar.b).m();
        ?? r5 = EmptyList.a;
        ArrayList<dd> arrayList = r5;
        if (m != null) {
            ListBuilder a = rcc.a();
            a.add(m);
            if (m.K0) {
                jn40 jn40Var = m.V;
                if (jn40Var != null && (set = jn40Var.f) != null && (list = m.U) != null) {
                    r5 = new ArrayList();
                    for (Object obj4 : list) {
                        if (set.contains(((pex0) obj4).b)) {
                            r5.add(obj4);
                        }
                    }
                }
                a.addAll((Collection) r5);
            }
            ListBuilder j = a.j();
            ArrayList arrayList2 = new ArrayList();
            ListIterator listIterator = j.listIterator(0);
            while (true) {
                qqy qqyVar = (qqy) listIterator;
                if (!qqyVar.hasNext()) {
                    break;
                }
                Iterator it = ((pex0) qqyVar.next()).q0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if ("order_button_tap".equalsIgnoreCase(((TariffAction) obj2).a)) {
                        break;
                    }
                }
                TariffAction tariffAction = (TariffAction) obj2;
                TariffAction.Action action = tariffAction != null ? tariffAction.b : null;
                if (action == null) {
                    ddVar = null;
                } else {
                    Iterator it2 = ((com.yandex.go.agreement.interactor.a) mdVar.a).b.a().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it2.next();
                        dd ddVar2 = (dd) obj3;
                        if (ddVar2.c() && jl40.l(ddVar2.a(), action.b)) {
                            break;
                        }
                    }
                    ddVar = (dd) obj3;
                }
                if (ddVar != null) {
                    arrayList2.add(ddVar);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                if (hashSet.add(((dd) next).a())) {
                    arrayList3.add(next);
                }
            }
            arrayList = arrayList3;
        }
        if (arrayList.isEmpty()) {
            this.$chainCallback.n();
            return zy11Var;
        }
        d dVar = new d();
        final a aVar = this.this$0;
        for (final dd ddVar3 : arrayList) {
            aVar.getClass();
            dVar.a.add(new y880() { // from class: od
                @Override // defpackage.y880
                public final void a(x880 x880Var) {
                    a aVar2 = a.this;
                    aVar2.c.a(ddVar3, new tb(1, aVar2, x880Var), new nd(x880Var, 0));
                }
            });
        }
        x880 x880Var = this.$chainCallback;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 1;
        return dVar.a(x880Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
