package ru.yandex.taxi.summary.requirements.list.mapper;

import com.yandex.go.zone.dto.objects.ServiceLevel;
import defpackage.bnx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lbnx0;", "<anonymous>", "(Ltse;)Lbnx0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.mapper.TariffRulesMapper$map$2", f = "TariffRulesMapper.kt", l = {27}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TariffRulesMapper$map$2 extends SuspendLambda implements wls {
    final /* synthetic */ ServiceLevel.TariffCard $tariffCard;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffRulesMapper$map$2(ServiceLevel.TariffCard tariffCard, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$tariffCard = tariffCard;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TariffRulesMapper$map$2 tariffRulesMapper$map$2 = new TariffRulesMapper$map$2(this.$tariffCard, this.this$0, continuation);
        tariffRulesMapper$map$2.L$0 = obj;
        return tariffRulesMapper$map$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffRulesMapper$map$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List list = this.$tariffCard.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((ServiceLevel.TariffCard.Bullet) obj2).a.d()) {
                    arrayList.add(obj2);
                }
            }
            b bVar = this.this$0;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(tje.h(tseVar, null, null, new TariffRulesMapper$map$2$items$2$1(bVar, (ServiceLevel.TariffCard.Bullet) it.next(), null), 3));
            }
            str = this.$tariffCard.b;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = str;
            this.label = 1;
            obj = kotlinx.coroutines.a.b(arrayList2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$2;
            kotlin.b.b(obj);
        }
        return new bnx0(str, (List) obj);
    }
}
