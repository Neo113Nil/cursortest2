package ru.yandex.logistics.sdk.cargo_form.core.impl.data;

import defpackage.an2;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.V2FormRequestDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.V2FormResponseDto;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/core/impl/data/FormApi;", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/V2FormRequestDto;", "request", "Lan2;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/V2FormResponseDto;", "a", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/V2FormRequestDto;)Lan2;", "core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FormApi {
    @s490("/4.0/cargo-c2c/v2/delivery/form")
    an2<V2FormResponseDto> a(@q76 V2FormRequestDto request);
}
