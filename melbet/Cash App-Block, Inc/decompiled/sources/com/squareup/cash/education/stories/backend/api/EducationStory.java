package com.squareup.cash.education.stories.backend.api;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class EducationStory {
    public final Integer primaryColor;
    public final ArrayList sceneBackgrounds;
    public final String slug;
    public final String thumbnail;
    public final String title;
    public final String url;

    public EducationStory(String str, String str2, String str3, String str4, Integer num, ArrayList arrayList) {
        str.getClass();
        str3.getClass();
        this.url = str;
        this.slug = str2;
        this.title = str3;
        this.thumbnail = str4;
        this.primaryColor = num;
        this.sceneBackgrounds = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationStory)) {
            return false;
        }
        EducationStory educationStory = (EducationStory) obj;
        return Intrinsics.areEqual(this.url, educationStory.url) && this.slug.equals(educationStory.slug) && Intrinsics.areEqual(this.title, educationStory.title) && Intrinsics.areEqual(this.thumbnail, educationStory.thumbnail) && Intrinsics.areEqual(this.primaryColor, educationStory.primaryColor) && this.sceneBackgrounds.equals(educationStory.sceneBackgrounds);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.url.hashCode() * 31, 31, this.slug), 31, this.title);
        String str = this.thumbnail;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.primaryColor;
        return this.sceneBackgrounds.hashCode() + ((hashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EducationStory(url=", this.url, ", slug=", this.slug, ", title=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.title, ", thumbnail=", this.thumbnail, ", primaryColor=");
        m.append(this.primaryColor);
        m.append(", sceneBackgrounds=");
        m.append(this.sceneBackgrounds);
        m.append(")");
        return m.toString();
    }
}
