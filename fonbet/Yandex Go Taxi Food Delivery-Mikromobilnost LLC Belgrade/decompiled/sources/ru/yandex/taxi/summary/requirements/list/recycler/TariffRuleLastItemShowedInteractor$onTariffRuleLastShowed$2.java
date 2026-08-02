package ru.yandex.taxi.summary.requirements.list.recycler;

import com.yandex.go.zone.dto.objects.ServiceLevel;
import defpackage.cnx0;
import defpackage.cpj0;
import defpackage.dij0;
import defpackage.dpj0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o7r0;
import defpackage.pex0;
import defpackage.qmx0;
import defpackage.rmx0;
import defpackage.tse;
import defpackage.ubx0;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.recycler.TariffRuleLastItemShowedInteractor$onTariffRuleLastShowed$2", f = "TariffRuleLastItemShowedInteractor.kt", l = {18}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TariffRuleLastItemShowedInteractor$onTariffRuleLastShowed$2 extends SuspendLambda implements wls {
    final /* synthetic */ dij0 $item;
    boolean Z$0;
    int label;
    final /* synthetic */ qmx0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffRuleLastItemShowedInteractor$onTariffRuleLastShowed$2(qmx0 qmx0Var, dij0 dij0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qmx0Var;
        this.$item = dij0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffRuleLastItemShowedInteractor$onTariffRuleLastShowed$2(this.this$0, this.$item, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffRuleLastItemShowedInteractor$onTariffRuleLastShowed$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Set M0;
        boolean add;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        rmx0 rmx0Var = this.this$0.b;
        dij0 dij0Var = this.$item;
        r0 r0Var = rmx0Var.a;
        do {
            value = r0Var.getValue();
            M0 = kotlin.collections.a.M0((Set) value);
            add = M0.add(dij0Var);
        } while (!r0Var.k(value, M0));
        if (add) {
            cpj0 cpj0Var = this.this$0.c;
            this.Z$0 = add;
            this.label = 1;
            pex0 a = cpj0Var.a.a();
            dpj0 dpj0Var = cpj0Var.b;
            cnx0 cnx0Var = dpj0Var.a;
            if (a != null) {
                List list = a.x0.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((ServiceLevel.TariffCard.Bullet) obj2).a.d()) {
                        arrayList.add(obj2);
                    }
                }
                int size = arrayList.size();
                String str = a.b;
                cnx0 cnx0Var2 = new cnx0(str, size);
                if (!jl40.l(cnx0Var, cnx0Var2)) {
                    o7r0 o7r0Var = ((ubx0) cpj0Var.c.b).a;
                    if (str == null) {
                        str = "";
                    }
                    o7r0Var.getClass();
                    HashMap hashMap = new HashMap();
                    hashMap.put("bullets_count", Integer.valueOf(size));
                    hashMap.put("tariff_class", str);
                    o7r0Var.a.a("TariffCard.Bullets.LastItemDisplayed", hashMap, 1, new HashMap());
                    dpj0Var.a = cnx0Var2;
                }
            }
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
