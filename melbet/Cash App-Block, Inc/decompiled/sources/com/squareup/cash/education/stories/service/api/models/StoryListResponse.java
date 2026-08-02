package com.squareup.cash.education.stories.service.api.models;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/education/stories/service/api/models/StoryListResponse;", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class StoryListResponse {
    public final List results;

    public StoryListResponse(List list) {
        this.results = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoryListResponse) && this.results.equals(((StoryListResponse) obj).results);
    }

    public final int hashCode() {
        return this.results.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("StoryListResponse(results=", ")", this.results);
    }
}
