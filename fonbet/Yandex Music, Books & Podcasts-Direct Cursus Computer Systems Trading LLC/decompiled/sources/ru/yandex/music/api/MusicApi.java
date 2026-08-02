package ru.yandex.music.api;

import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.dto.concert.ConcertDto;
import defpackage.dak;
import defpackage.lzc;
import retrofit2.Call;
import ru.yandex.music.network.response.eventdata.EventDataDto;

/* loaded from: classes3.dex */
public interface MusicApi {
    @lzc("feed/promotions/{id}")
    Call<MusicBackendResponse<EventDataDto>> a(@dak("id") String str);

    @lzc("concerts/{concertId}")
    Call<MusicBackendResponse<ConcertDto>> b(@dak("concertId") String str);
}
