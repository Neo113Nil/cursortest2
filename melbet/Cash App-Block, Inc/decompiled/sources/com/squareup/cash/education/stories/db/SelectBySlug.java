package com.squareup.cash.education.stories.db;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SelectBySlug {
    public final Long backgroundColor;
    public final String id;
    public final Long id_;
    public final Long primaryColor;
    public final long priority;
    public final long published_at_millis;
    public final Long scene_index;
    public final String slug;
    public final String storyId;
    public final String thumbnail;
    public final String title;
    public final String url;

    public SelectBySlug(String str, String str2, String str3, String str4, String str5, Long l, long j, long j2, Long l2, Long l3, Long l4, String str6) {
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
        this.id_ = l2;
        this.scene_index = l3;
        this.backgroundColor = l4;
        this.storyId = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectBySlug)) {
            return false;
        }
        SelectBySlug selectBySlug = (SelectBySlug) obj;
        return this.id.equals(selectBySlug.id) && Intrinsics.areEqual(this.url, selectBySlug.url) && this.slug.equals(selectBySlug.slug) && Intrinsics.areEqual(this.title, selectBySlug.title) && Intrinsics.areEqual(this.thumbnail, selectBySlug.thumbnail) && Intrinsics.areEqual(this.primaryColor, selectBySlug.primaryColor) && this.published_at_millis == selectBySlug.published_at_millis && this.priority == selectBySlug.priority && Intrinsics.areEqual(this.id_, selectBySlug.id_) && Intrinsics.areEqual(this.scene_index, selectBySlug.scene_index) && Intrinsics.areEqual(this.backgroundColor, selectBySlug.backgroundColor) && Intrinsics.areEqual(this.storyId, selectBySlug.storyId);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.url), 31, this.slug), 31, this.title);
        String str = this.thumbnail;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.primaryColor;
        int m2 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.published_at_millis), 31, this.priority);
        Long l2 = this.id_;
        int hashCode2 = (m2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.scene_index;
        int hashCode3 = (hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.backgroundColor;
        int hashCode4 = (hashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str2 = this.storyId;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SelectBySlug(id=", this.id, ", url=", this.url, ", slug=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.slug, ", title=", this.title, ", thumbnail=");
        Request$Priority$EnumUnboxingLocalUtility.m(this.primaryColor, this.thumbnail, ", primaryColor=", ", published_at_millis=", m);
        m.append(this.published_at_millis);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.priority, ", priority=", ", id_=", m);
        Thread$State$EnumUnboxingLocalUtility.m(m, this.id_, ", scene_index=", this.scene_index, ", backgroundColor=");
        m.append(this.backgroundColor);
        m.append(", storyId=");
        m.append(this.storyId);
        m.append(")");
        return m.toString();
    }
}
