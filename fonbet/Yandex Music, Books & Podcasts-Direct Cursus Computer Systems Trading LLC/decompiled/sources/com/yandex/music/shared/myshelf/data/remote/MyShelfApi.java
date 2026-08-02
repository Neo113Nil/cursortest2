package com.yandex.music.shared.myshelf.data.remote;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import defpackage.lzc;
import defpackage.r6n;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J(\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/yandex/music/shared/myshelf/data/remote/MyShelfApi;", "", "bookshelf", "Lretrofit2/Call;", "Lcom/yandex/music/shared/backend_utils/MusicBackendResponse;", "Lcom/yandex/music/shared/myshelf/data/remote/MyShelfCatalogDto;", "newEpisodes", "myShelfHistory", "Lcom/yandex/music/shared/myshelf/data/remote/MyShelfHistoryDto;", Constants.KEY_PAGE, "", "pageSize", "shared-myshelf"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public interface MyShelfApi {
    @lzc("non-music/bookshelf")
    @NotNull
    Call<MusicBackendResponse<MyShelfCatalogDto>> bookshelf();

    @lzc("non-music/bookshelf/recently-played")
    @NotNull
    Call<MusicBackendResponse<MyShelfHistoryDto>> myShelfHistory(@r6n("page") int page, @r6n("pageSize") int pageSize);

    @lzc("non-music/new-episodes")
    @NotNull
    Call<MusicBackendResponse<MyShelfCatalogDto>> newEpisodes();
}
