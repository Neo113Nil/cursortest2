package ru.yandex.logistics.cargo_form.async.impl.data;

import defpackage.an2;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import kotlin.Metadata;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formasynctask.V2FormAsyncTaskRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formasynctask.V2FormAsyncTaskResponseDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formasynctask.V2FormAsyncTaskStatusRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formasynctask.V2FormAsyncTaskStatusResponseDto;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0005\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lru/yandex/logistics/cargo_form/async/impl/data/FormAsyncApi;", "", "", "idempotencyToken", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/V2FormAsyncTaskRequestDto;", "request", "Lan2;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/V2FormAsyncTaskResponseDto;", "b", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/V2FormAsyncTaskRequestDto;)Lan2;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/V2FormAsyncTaskStatusRequestDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/V2FormAsyncTaskStatusResponseDto;", "a", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/V2FormAsyncTaskStatusRequestDto;)Lan2;", "async"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface FormAsyncApi {
    @s490("/4.0/cargo-c2c/v2/delivery/form/async/status")
    an2<V2FormAsyncTaskStatusResponseDto> a(@q76 V2FormAsyncTaskStatusRequestDto request);

    @s490("/4.0/cargo-c2c/v2/delivery/form/async")
    an2<V2FormAsyncTaskResponseDto> b(@z8u("X-Idempotency-Token") String idempotencyToken, @q76 V2FormAsyncTaskRequestDto request);
}
