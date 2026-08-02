package com.squareup.cash.education.stories.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public interface EducationStoryViewEvent {

    public final class OnNavigateBack implements EducationStoryViewEvent {
        public static final OnNavigateBack INSTANCE = new OnNavigateBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnNavigateBack);
        }

        public final int hashCode() {
            return -1352857783;
        }

        public final String toString() {
            return "OnNavigateBack";
        }
    }

    public final class OnRefresh implements EducationStoryViewEvent {
        public static final OnRefresh INSTANCE = new OnRefresh();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnRefresh);
        }

        public final int hashCode() {
            return -1262347542;
        }

        public final String toString() {
            return "OnRefresh";
        }
    }

    public final class OnStateRestored implements EducationStoryViewEvent {
        public final int currentSceneIndex;

        public OnStateRestored(int i) {
            this.currentSceneIndex = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnStateRestored) && this.currentSceneIndex == ((OnStateRestored) obj).currentSceneIndex;
        }

        public final int hashCode() {
            return Integer.hashCode(this.currentSceneIndex);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.currentSceneIndex, "OnStateRestored(currentSceneIndex=", ")");
        }
    }
}
