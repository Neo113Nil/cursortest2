package com.squareup.cash.education.stories.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class EducationStoryViewPagerViewModel {
    public final ArrayList storyViewModels;

    public EducationStoryViewPagerViewModel(ArrayList arrayList) {
        this.storyViewModels = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EducationStoryViewPagerViewModel) && this.storyViewModels.equals(((EducationStoryViewPagerViewModel) obj).storyViewModels);
    }

    public final int hashCode() {
        return this.storyViewModels.hashCode();
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("EducationStoryViewPagerViewModel(storyViewModels=", ")", this.storyViewModels);
    }
}
