package com.squareup.cash.education.stories.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface EducationStoryViewModel {

    public final class Error implements EducationStoryViewModel {
        public final int backgroundColor;
        public final String refreshLabel;
        public final String subtitle;
        public final String title;

        public Error(int i, String str, String str2, String str3) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.backgroundColor = i;
            this.title = str;
            this.subtitle = str2;
            this.refreshLabel = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return this.backgroundColor == error.backgroundColor && Intrinsics.areEqual(this.title, error.title) && Intrinsics.areEqual(this.subtitle, error.subtitle) && Intrinsics.areEqual(this.refreshLabel, error.refreshLabel);
        }

        @Override // com.squareup.cash.education.stories.viewmodels.EducationStoryViewModel
        public final int getBackgroundColor() {
            return this.backgroundColor;
        }

        public final int hashCode() {
            return this.refreshLabel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Integer.hashCode(this.backgroundColor) * 31, 31, this.title), 31, this.subtitle);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(re$$ExternalSyntheticOutline0.m("Error(backgroundColor=", this.backgroundColor, ", title=", this.title, ", subtitle="), this.subtitle, ", refreshLabel=", this.refreshLabel, ")");
        }
    }

    public final class NotReady implements EducationStoryViewModel {
        public final int backgroundColor;

        public NotReady(int i) {
            this.backgroundColor = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotReady) && this.backgroundColor == ((NotReady) obj).backgroundColor;
        }

        @Override // com.squareup.cash.education.stories.viewmodels.EducationStoryViewModel
        public final int getBackgroundColor() {
            return this.backgroundColor;
        }

        public final int hashCode() {
            return Integer.hashCode(this.backgroundColor);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.backgroundColor, "NotReady(backgroundColor=", ")");
        }
    }

    public final class Ready implements EducationStoryViewModel {
        public final int backgroundColor;
        public final int currentSceneIndex;
        public final boolean showProgressIndicator;
        public final String storyUrl;

        public Ready(int i, int i2, String str, boolean z) {
            this.storyUrl = str;
            this.backgroundColor = i;
            this.currentSceneIndex = i2;
            this.showProgressIndicator = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return this.storyUrl.equals(ready.storyUrl) && this.backgroundColor == ready.backgroundColor && this.currentSceneIndex == ready.currentSceneIndex && this.showProgressIndicator == ready.showProgressIndicator;
        }

        @Override // com.squareup.cash.education.stories.viewmodels.EducationStoryViewModel
        public final int getBackgroundColor() {
            return this.backgroundColor;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showProgressIndicator) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.currentSceneIndex, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.backgroundColor, this.storyUrl.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("Ready(storyUrl=", this.backgroundColor, this.storyUrl, ", backgroundColor=", ", currentSceneIndex=");
            m.append(this.currentSceneIndex);
            m.append(", showProgressIndicator=");
            m.append(this.showProgressIndicator);
            m.append(")");
            return m.toString();
        }
    }

    int getBackgroundColor();
}
