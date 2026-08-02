package com.squareup.cash.education.stories.service.api;

import app.cash.api.ApiResult;
import com.squareup.cash.education.stories.service.api.models.StoryListResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0002\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/squareup/cash/education/stories/service/api/CashAppStoryService;", "", "getStories", "Lapp/cash/api/ApiResult;", "Lcom/squareup/cash/education/stories/service/api/models/StoryListResponse;", "tag", "", "sortKey", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CashAppStoryService {
    @GET("cash-app/bitcoin/info/query/v1/cashapp/stories")
    Object getStories(@Query("tag") String str, @Query("sort_key") String str2, Continuation<? super ApiResult<StoryListResponse>> continuation);
}
