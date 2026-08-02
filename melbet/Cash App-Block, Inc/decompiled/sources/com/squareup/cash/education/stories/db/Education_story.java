package com.squareup.cash.education.stories.db;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Education_story {
    public final String id;
    public final Long primaryColor;
    public final long priority;
    public final long published_at_millis;
    public final String slug;
    public final String thumbnail;
    public final String title;
    public final String url;

    public Education_story(String str, String str2, String str3, String str4, String str5, Long l, long j, long j2) {
        str2.getClass();
        str4.getClass();
        this.id = str;
        this.url = str2;
        this.slug = str3;
        this.title = str4;
        this.thumbnail = str5;
        this.primaryColor = l;
        this.published_at_millis = j;
        this.priority = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Education_story)) {
            return false;
        }
        Education_story education_story = (Education_story) obj;
        return this.id.equals(education_story.id) && Intrinsics.areEqual(this.url, education_story.url) && this.slug.equals(education_story.slug) && Intrinsics.areEqual(this.title, education_story.title) && Intrinsics.areEqual(this.thumbnail, education_story.thumbnail) && Intrinsics.areEqual(this.primaryColor, education_story.primaryColor) && this.published_at_millis == education_story.published_at_millis && this.priority == education_story.priority;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.url), 31, this.slug), 31, this.title);
        String str = this.thumbnail;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.primaryColor;
        return Long.hashCode(this.priority) + Recorder$$ExternalSyntheticOutline2.m((hashCode + (l != null ? l.hashCode() : 0)) * 31, 31, this.published_at_millis);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Education_story(id=", this.id, ", url=", this.url, ", slug=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.slug, ", title=", this.title, ", thumbnail=");
        Request$Priority$EnumUnboxingLocalUtility.m(this.primaryColor, this.thumbnail, ", primaryColor=", ", published_at_millis=", m);
        m.append(this.published_at_millis);
        return Boxes$$ExternalSyntheticOutline1.m(this.priority, ", priority=", ")", m);
    }
}
