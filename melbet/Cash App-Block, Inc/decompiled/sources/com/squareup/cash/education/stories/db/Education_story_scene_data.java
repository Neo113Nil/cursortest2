package com.squareup.cash.education.stories.db;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Education_story_scene_data {
    public final Long backgroundColor;
    public final long id;
    public final long scene_index;
    public final String storyId;

    public Education_story_scene_data(long j, long j2, Long l, String str) {
        this.id = j;
        this.scene_index = j2;
        this.backgroundColor = l;
        this.storyId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Education_story_scene_data)) {
            return false;
        }
        Education_story_scene_data education_story_scene_data = (Education_story_scene_data) obj;
        return this.id == education_story_scene_data.id && this.scene_index == education_story_scene_data.scene_index && Intrinsics.areEqual(this.backgroundColor, education_story_scene_data.backgroundColor) && this.storyId.equals(education_story_scene_data.storyId);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.id) * 31, 31, this.scene_index);
        Long l = this.backgroundColor;
        return this.storyId.hashCode() + ((m + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(this.id, "Education_story_scene_data(id=", ", scene_index=");
        m1149m.append(this.scene_index);
        m1149m.append(", backgroundColor=");
        m1149m.append(this.backgroundColor);
        return Recorder$$ExternalSyntheticOutline2.m(m1149m, ", storyId=", this.storyId, ")");
    }
}
