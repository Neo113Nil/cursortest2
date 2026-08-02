package ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.data;

import defpackage.an2;
import defpackage.s490;
import kotlin.Metadata;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.api.clientapi.DashboardChooseProfileResponseDto;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dashboard/chooseprofile/data/ChooseProfileApi;", "", "Lan2;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/api/clientapi/DashboardChooseProfileResponseDto;", "a", "()Lan2;", "choose-profile"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ChooseProfileApi {
    @s490("/4.0/cargo-c2c/v1/dashboard/choose-profile")
    an2<DashboardChooseProfileResponseDto> a();
}
