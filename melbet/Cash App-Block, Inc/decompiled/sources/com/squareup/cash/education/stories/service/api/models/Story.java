package com.squareup.cash.education.stories.service.api.models;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import java.util.List;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/education/stories/service/api/models/Story;", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Story {
    public final String id;
    public final StoryMedia media;
    public final long priority;
    public final Instant publishedAt;
    public final List sceneData;
    public final String slug;
    public final String title;
    public final String url;

    public Story(String str, String str2, String str3, String str4, StoryMedia storyMedia, List list, Instant instant, long j) {
        this.id = str;
        this.url = str2;
        this.slug = str3;
        this.title = str4;
        this.media = storyMedia;
        this.sceneData = list;
        this.publishedAt = instant;
        this.priority = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Story)) {
            return false;
        }
        Story story = (Story) obj;
        return this.id.equals(story.id) && this.url.equals(story.url) && this.slug.equals(story.slug) && this.title.equals(story.title) && this.media.equals(story.media) && this.sceneData.equals(story.sceneData) && this.publishedAt.equals(story.publishedAt) && this.priority == story.priority;
    }

    public final int hashCode() {
        return Long.hashCode(this.priority) + ((this.publishedAt.hashCode() + Recorder$$ExternalSyntheticOutline2.m((this.media.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.url), 31, this.slug), 31, this.title)) * 31, 31, this.sceneData)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Story(id=", this.id, ", url=", this.url, ", slug=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.slug, ", title=", this.title, ", media=");
        m.append(this.media);
        m.append(", sceneData=");
        m.append(this.sceneData);
        m.append(", publishedAt=");
        m.append(this.publishedAt);
        m.append(", priority=");
        m.append(this.priority);
        m.append(")");
        return m.toString();
    }
}
