package ru.yandex.taxi.logistics.sdk.tracking.impl.extend_expiration_date.data;

import defpackage.an2;
import defpackage.fwo;
import defpackage.gwo;
import defpackage.h3y;
import defpackage.ho2;
import defpackage.io2;
import defpackage.mw7;
import defpackage.ny61;
import java.util.Collections;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.logistics.sdk.delivery.edit.DeliveryEditApi;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.Responses$OperationIdResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveryedit.DeliveryEditRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveryeditoptions.DeliveryOptionsRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.orderedit.LpOrderEditInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.orderedit.LpOrderEditPayloadDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.orderedit.NddEditStoragePeriodDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.orderedit.OrderEditPayloadDto;
import ru.yandex.taxi.logistics.sdk.network.c;

/* loaded from: classes5.dex */
public final class a extends c implements fwo {
    public final h3y i;
    public final h3y j;

    public a(h3y h3yVar, h3y h3yVar2, gwo gwoVar) {
        super(new mw7(3, gwoVar), 0L, 14);
        this.i = h3yVar;
        this.j = h3yVar2;
    }

    public final Object b(String str, String str2, DeliveryOptionsRequestDto.PayloadDto.Payload_StoragePeriodDto payload_StoragePeriodDto, Continuation continuation) {
        return a(new ExtendExpirationDateRepositoryImpl$getExtendExpirationDateScreenData$2(this, new DeliveryOptionsRequestDto(str, str2, payload_StoragePeriodDto), null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        ExtendExpirationDateRepositoryImpl$sendNewDateInfo$1 extendExpirationDateRepositoryImpl$sendNewDateInfo$1;
        int i;
        if (continuationImpl instanceof ExtendExpirationDateRepositoryImpl$sendNewDateInfo$1) {
            extendExpirationDateRepositoryImpl$sendNewDateInfo$1 = (ExtendExpirationDateRepositoryImpl$sendNewDateInfo$1) continuationImpl;
            int i2 = extendExpirationDateRepositoryImpl$sendNewDateInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                extendExpirationDateRepositoryImpl$sendNewDateInfo$1.label = i2 - Integer.MIN_VALUE;
                ExtendExpirationDateRepositoryImpl$sendNewDateInfo$1 extendExpirationDateRepositoryImpl$sendNewDateInfo$12 = extendExpirationDateRepositoryImpl$sendNewDateInfo$1;
                Object obj = extendExpirationDateRepositoryImpl$sendNewDateInfo$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = extendExpirationDateRepositoryImpl$sendNewDateInfo$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    an2<Responses$OperationIdResponseDto> a = ((DeliveryEditApi) this.j.get()).a(new DeliveryEditRequestDto(str, null, new OrderEditPayloadDto.OrderEditPayload_LogisticPlatformDto(new LpOrderEditPayloadDto(Collections.singletonList(new LpOrderEditInfoDto.LpOrderEditInfo_StoragePeriodDto(new NddEditStoragePeriodDto(str3))))), str2));
                    extendExpirationDateRepositoryImpl$sendNewDateInfo$12.L$0 = null;
                    extendExpirationDateRepositoryImpl$sendNewDateInfo$12.L$1 = null;
                    extendExpirationDateRepositoryImpl$sendNewDateInfo$12.L$2 = null;
                    extendExpirationDateRepositoryImpl$sendNewDateInfo$12.L$3 = null;
                    extendExpirationDateRepositoryImpl$sendNewDateInfo$12.label = 1;
                    obj = ((ru.yandex.taxi.logistics.sdk.network.b) a).c(3, 2000L, 10000L, extendExpirationDateRepositoryImpl$sendNewDateInfo$12);
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
                return Boolean.valueOf(((io2) obj) instanceof ho2);
            }
        }
        extendExpirationDateRepositoryImpl$sendNewDateInfo$1 = new ExtendExpirationDateRepositoryImpl$sendNewDateInfo$1(this, continuationImpl);
        ExtendExpirationDateRepositoryImpl$sendNewDateInfo$1 extendExpirationDateRepositoryImpl$sendNewDateInfo$122 = extendExpirationDateRepositoryImpl$sendNewDateInfo$1;
        Object obj2 = extendExpirationDateRepositoryImpl$sendNewDateInfo$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = extendExpirationDateRepositoryImpl$sendNewDateInfo$122.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((io2) obj2) instanceof ho2);
    }
}
