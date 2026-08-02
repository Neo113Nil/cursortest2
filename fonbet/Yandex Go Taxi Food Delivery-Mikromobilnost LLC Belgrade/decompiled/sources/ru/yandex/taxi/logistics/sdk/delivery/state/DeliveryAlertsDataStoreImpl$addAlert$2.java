package ru.yandex.taxi.logistics.sdk.delivery.state;

import defpackage.ez40;
import defpackage.kme0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions.MultiorderDialogDto;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lez40;", Constants.KEY_DATA, "Lzy11;", "<anonymous>", "(Lez40;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.delivery.state.DeliveryAlertsDataStoreImpl$addAlert$2", f = "DeliveryAlertsDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryAlertsDataStoreImpl$addAlert$2 extends SuspendLambda implements wls {
    final /* synthetic */ MultiorderDialogDto $alertDto;
    final /* synthetic */ String $deliveryId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryAlertsDataStoreImpl$addAlert$2(String str, MultiorderDialogDto multiorderDialogDto, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$deliveryId = str;
        this.$alertDto = multiorderDialogDto;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryAlertsDataStoreImpl$addAlert$2 deliveryAlertsDataStoreImpl$addAlert$2 = new DeliveryAlertsDataStoreImpl$addAlert$2(this.$deliveryId, this.$alertDto, this.this$0, continuation);
        deliveryAlertsDataStoreImpl$addAlert$2.L$0 = obj;
        return deliveryAlertsDataStoreImpl$addAlert$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeliveryAlertsDataStoreImpl$addAlert$2 deliveryAlertsDataStoreImpl$addAlert$2 = (DeliveryAlertsDataStoreImpl$addAlert$2) create((ez40) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deliveryAlertsDataStoreImpl$addAlert$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ?? r3;
        ez40 ez40Var = (ez40) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        kme0 kme0Var = new kme0(this.$deliveryId);
        Set set = (Set) ez40Var.c(kme0Var);
        if (set != null) {
            b bVar = this.this$0;
            r3 = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                MultiorderDialogDto multiorderDialogDto = (MultiorderDialogDto) bVar.d.fromJson((String) it.next());
                if (multiorderDialogDto != null) {
                    r3.add(multiorderDialogDto);
                }
            }
        } else {
            r3 = EmptyList.a;
        }
        ArrayList o0 = kotlin.collections.a.o0((Collection) r3, this.$alertDto);
        b bVar2 = this.this$0;
        ArrayList arrayList = new ArrayList(tcc.n(o0, 10));
        Iterator it2 = o0.iterator();
        while (it2.hasNext()) {
            arrayList.add(bVar2.d.toJson((MultiorderDialogDto) it2.next()));
        }
        ez40Var.g(kme0Var, kotlin.collections.a.N0(arrayList));
        return zy11.a;
    }
}
