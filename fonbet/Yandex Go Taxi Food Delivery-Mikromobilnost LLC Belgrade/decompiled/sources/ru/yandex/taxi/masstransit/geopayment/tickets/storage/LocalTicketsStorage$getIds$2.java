package ru.yandex.taxi.masstransit.geopayment.tickets.storage;

import defpackage.cne0;
import defpackage.gw00;
import defpackage.k4o;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.masstransit.geopayment.tickets.model.MtTicketsResponse;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lru/yandex/taxi/masstransit/geopayment/tickets/model/a;", "<anonymous>", "(Ltse;)Lru/yandex/taxi/masstransit/geopayment/tickets/model/a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.tickets.storage.LocalTicketsStorage$getIds$2", f = "LocalTicketsStorage.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class LocalTicketsStorage$getIds$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTicketsStorage$getIds$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocalTicketsStorage$getIds$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocalTicketsStorage$getIds$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        k4o b = MtTicketsResponse.TicketType.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : b) {
            if (((MtTicketsResponse.TicketType) obj2) != MtTicketsResponse.TicketType.UNKNOWN) {
                arrayList.add(obj2);
            }
        }
        a aVar = this.this$0;
        int d = gw00.d(tcc.n(arrayList, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            List m = ((cne0) aVar.b).m("ru.yandex.taxi.masstransit.LOCAL_MT_TICKETS_STORAGE.ids." + ((MtTicketsResponse.TicketType) next), ";");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : m) {
                if (((String) obj3).length() > 0) {
                    arrayList2.add(obj3);
                }
            }
            linkedHashMap.put(next, arrayList2);
        }
        return new ru.yandex.taxi.masstransit.geopayment.tickets.model.a(linkedHashMap);
    }
}
