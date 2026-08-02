package com.squareup.cash.education.stories.service.api.models;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/education/stories/service/api/models/StoryMedia;", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class StoryMedia {
    public final StoryPoster poster;

    public StoryMedia(StoryPoster storyPoster) {
        this.poster = storyPoster;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoryMedia) && this.poster.equals(((StoryMedia) obj).poster);
    }

    public final int hashCode() {
        return this.poster.landscape.hashCode();
    }

    public final String toString() {
        return "StoryMedia(poster=" + this.poster + ")";
    }
}
