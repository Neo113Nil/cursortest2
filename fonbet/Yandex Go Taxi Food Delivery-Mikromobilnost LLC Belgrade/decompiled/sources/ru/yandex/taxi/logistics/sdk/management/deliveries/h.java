package ru.yandex.taxi.logistics.sdk.management.deliveries;

import defpackage.an2;
import defpackage.bvf0;
import defpackage.h3y;
import defpackage.io2;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.sdk.deliveries.api.source.DeliveriesApi;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveries.DeliveriesRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveries.Responses$DeliveriesResponseDto;

/* loaded from: classes9.dex */
public final class h {
    public final h3y a;
    public final r0 b = bvf0.c(null);

    public h(h3y h3yVar) {
        this.a = h3yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(DeliveriesRequestDto deliveriesRequestDto, ContinuationImpl continuationImpl) {
        DeliveriesSource$request$1 deliveriesSource$request$1;
        int i;
        if (continuationImpl instanceof DeliveriesSource$request$1) {
            deliveriesSource$request$1 = (DeliveriesSource$request$1) continuationImpl;
            int i2 = deliveriesSource$request$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveriesSource$request$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveriesSource$request$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveriesSource$request$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    an2<Responses$DeliveriesResponseDto> a = ((DeliveriesApi) this.a.get()).a(deliveriesRequestDto);
                    deliveriesSource$request$1.L$0 = null;
                    deliveriesSource$request$1.label = 1;
                    ru.yandex.taxi.logistics.sdk.network.b bVar = (ru.yandex.taxi.logistics.sdk.network.b) a;
                    obj = bVar.e(bVar.a, deliveriesSource$request$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                io2 io2Var = (io2) obj;
                this.b.l(io2Var);
                return io2Var;
            }
        }
        deliveriesSource$request$1 = new DeliveriesSource$request$1(this, continuationImpl);
        Object obj2 = deliveriesSource$request$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveriesSource$request$1.label;
        if (i != 0) {
        }
        io2 io2Var2 = (io2) obj2;
        this.b.l(io2Var2);
        return io2Var2;
    }
}
