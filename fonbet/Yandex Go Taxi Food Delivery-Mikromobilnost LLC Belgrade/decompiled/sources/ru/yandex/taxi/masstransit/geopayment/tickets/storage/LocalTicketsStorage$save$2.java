package ru.yandex.taxi.masstransit.geopayment.tickets.storage;

import defpackage.cne0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.geopayment.tickets.model.MtTicketsResponse;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.tickets.storage.LocalTicketsStorage$save$2", f = "LocalTicketsStorage.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class LocalTicketsStorage$save$2 extends SuspendLambda implements wls {
    final /* synthetic */ ru.yandex.taxi.masstransit.geopayment.tickets.model.a $tickets;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTicketsStorage$save$2(a aVar, ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$tickets = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocalTicketsStorage$save$2(this.this$0, this.$tickets, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        LocalTicketsStorage$save$2 localTicketsStorage$save$2 = (LocalTicketsStorage$save$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        localTicketsStorage$save$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        ((cne0) this.this$0.b).a();
        Set<Map.Entry> entrySet = this.$tickets.a.entrySet();
        a aVar = this.this$0;
        for (Map.Entry entry : entrySet) {
            MtTicketsResponse.TicketType ticketType = (MtTicketsResponse.TicketType) entry.getKey();
            List list = (List) entry.getValue();
            if (!list.isEmpty()) {
                ((cne0) aVar.b).s("ru.yandex.taxi.masstransit.LOCAL_MT_TICKETS_STORAGE.ids." + ticketType, ";", list);
            }
        }
        return zy11.a;
    }
}
