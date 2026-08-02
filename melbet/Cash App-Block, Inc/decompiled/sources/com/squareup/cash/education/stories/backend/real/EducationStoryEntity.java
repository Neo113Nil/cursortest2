package com.squareup.cash.education.stories.backend.real;

import com.squareup.cash.education.stories.db.Education_story;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class EducationStoryEntity {
    public final ArrayList sceneData;
    public final Education_story story;

    public EducationStoryEntity(Education_story education_story, ArrayList arrayList) {
        education_story.getClass();
        this.story = education_story;
        this.sceneData = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EducationStoryEntity)) {
            return false;
        }
        EducationStoryEntity educationStoryEntity = (EducationStoryEntity) obj;
        return Intrinsics.areEqual(this.story, educationStoryEntity.story) && this.sceneData.equals(educationStoryEntity.sceneData);
    }

    public final int hashCode() {
        return this.sceneData.hashCode() + (this.story.hashCode() * 31);
    }

    public final String toString() {
        return "EducationStoryEntity(story=" + this.story + ", sceneData=" + this.sceneData + ")";
    }
}
