package ru.yandex.taxi.logistics.sdk.delivery_launch.data;

import defpackage.jl40;
import defpackage.m0i;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.TypedConfigsDto;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ m0i b;
    public final /* synthetic */ String c;

    public a(vpr vprVar, m0i m0iVar, String str) {
        this.a = vprVar;
        this.b = m0iVar;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveryConfigStateRepositoryImpl$getConfigItemFlow$$inlined$map$1$2$1 deliveryConfigStateRepositoryImpl$getConfigItemFlow$$inlined$map$1$2$1;
        int i;
        TypedConfigsDto.ItemsDto itemsDto;
        TypedConfigsDto typedConfigsDto;
        List<TypedConfigsDto.ItemsDto> items;
        Object obj2;
        if (continuation instanceof DeliveryConfigStateRepositoryImpl$getConfigItemFlow$$inlined$map$1$2$1) {
            deliveryConfigStateRepositoryImpl$getConfigItemFlow$$inlined$map$1$2$1 = (DeliveryConfigStateRepositoryImpl$getConfigItemFlow$$inlined$map$1$2$1) continuation;
            int i2 = deliveryConfigStateRepositoryImpl$getConfigItemFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryConfigStateRepositoryImpl$getConfigItemFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = deliveryConfigStateRepositoryImpl$getConfigItemFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryConfigStateRepositoryImpl$getConfigItemFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Map map = (Map) obj;
                    if (map == null || (typedConfigsDto = (TypedConfigsDto) map.get(this.b)) == null || (items = typedConfigsDto.getItems()) == null) {
                        itemsDto = null;
                    } else {
                        Iterator<T> it = items.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (jl40.l(((TypedConfigsDto.ItemsDto) obj2).getName(), this.c)) {
                                break;
                            }
                        }
                        itemsDto = (TypedConfigsDto.ItemsDto) obj2;
                    }
                    deliveryConfigStateRepositoryImpl$getConfigItemFlow$$inlined$map$1$2$1.L$0 = null;
                    deliveryConfigStateRepositoryImpl$getConfigItemFlow$$inlined$map$1$2$1.L$1 = null;
                    deliveryConfigStateRepositoryImpl$getConfigItemFlow$$inlined$map$1$2$1.L$2 = null;
                    deliveryConfigStateRepositoryImpl$getConfigItemFlow$$inlined$map$1$2$1.L$3 = null;
                    deliveryConfigStateRepositoryImpl$getConfigItemFlow$$inlined$map$1$2$1.I$0 = 0;
                    deliveryConfigStateRepositoryImpl$getConfigItemFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(itemsDto, deliveryConfigStateRepositoryImpl$getConfigItemFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        deliveryConfigStateRepositoryImpl$getConfigItemFlow$$inlined$map$1$2$1 = new DeliveryConfigStateRepositoryImpl$getConfigItemFlow$$inlined$map$1$2$1(this, continuation);
        Object obj32 = deliveryConfigStateRepositoryImpl$getConfigItemFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryConfigStateRepositoryImpl$getConfigItemFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
