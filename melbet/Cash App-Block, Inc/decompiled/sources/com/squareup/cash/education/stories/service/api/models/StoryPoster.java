package com.squareup.cash.education.stories.service.api.models;

import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/education/stories/service/api/models/StoryPoster;", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class StoryPoster {
    public final String landscape;

    public StoryPoster(String str) {
        this.landscape = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoryPoster) && this.landscape.equals(((StoryPoster) obj).landscape);
    }

    public final int hashCode() {
        return this.landscape.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StoryPoster(landscape=", this.landscape, ")");
    }
}
