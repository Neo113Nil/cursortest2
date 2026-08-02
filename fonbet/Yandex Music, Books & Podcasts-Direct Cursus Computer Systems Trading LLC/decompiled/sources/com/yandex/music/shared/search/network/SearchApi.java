package com.yandex.music.shared.search.network;

import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.search.api.feedback.SearchFeedbackRequest;
import defpackage.a0k;
import defpackage.dak;
import defpackage.k83;
import defpackage.lzc;
import defpackage.r6n;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J¡\u0001\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00112\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00112\b\b\u0001\u0010\u0017\u001a\u00020\u0016H'¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u00120\u00112\b\b\u0001\u0010\u001b\u001a\u00020\u00022\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u001d\u001a\u00020\u0002H'¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u00112\b\b\u0001\u0010\u001b\u001a\u00020\u0002H'¢\u0006\u0004\b\"\u0010#ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006$À\u0006\u0001"}, d2 = {"Lcom/yandex/music/shared/search/network/SearchApi;", "", "", "text", "", "nocorrect", "contentType", "inputType", "", Constants.KEY_PAGE, "pageSize", "type", "artistId", "filterId", "withBestResults", "withBestResultReleases", "locations", "Lretrofit2/Call;", "Lcom/yandex/music/shared/backend_utils/MusicBackendResponse;", "Lcom/yandex/music/shared/search/network/SearchResultDto;", "b", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lretrofit2/Call;", "Lcom/yandex/music/shared/search/api/feedback/SearchFeedbackRequest;", ServiceCommand.TYPE_REQ, "", "a", "(Lcom/yandex/music/shared/search/api/feedback/SearchFeedbackRequest;)Lretrofit2/Call;", "ownerUid", "searchType", "supportedTypes", "", "Lcom/yandex/music/shared/search/network/SearchItemSuggestDto;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;", "d", "(Ljava/lang/String;)Lretrofit2/Call;", "shared-search"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public interface SearchApi {
    @a0k("search/feedback")
    @NotNull
    Call<Unit> a(@k83 @NotNull SearchFeedbackRequest request);

    @lzc("search/instant/mixed?withLikesCount=true")
    @NotNull
    Call<MusicBackendResponse<SearchResultDto>> b(@r6n("text") String text, @r6n("nocorrect") boolean nocorrect, @r6n("contentType") String contentType, @r6n("inputType") @NotNull String inputType, @r6n("page") int page, @r6n("pageSize") int pageSize, @r6n("type") @NotNull String type, @r6n("artistId") String artistId, @r6n("filter") String filterId, @r6n("withBestResults") Boolean withBestResults, @r6n("withBestResultReleases") Boolean withBestResultReleases, @r6n("locations") String locations);

    @lzc("users/{owner-uid}/search-history")
    @NotNull
    Call<MusicBackendResponse<List<SearchItemSuggestDto>>> c(@dak("owner-uid") @NotNull String ownerUid, @r6n("contentType") String searchType, @r6n("supportedTypes") @NotNull String supportedTypes);

    @lzc("users/{owner-uid}/search-history/clear")
    @NotNull
    Call<Unit> d(@dak("owner-uid") @NotNull String ownerUid);
}
