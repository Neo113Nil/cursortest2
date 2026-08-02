package com.squareup.cash.payments.viewmodels;

import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface NearbyPermissionsPromptSheetViewModel {

    public final class Loading implements NearbyPermissionsPromptSheetViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1439627180;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Ready implements NearbyPermissionsPromptSheetViewModel {
        public final String body;
        public final String buttonLabel;
        public final Image heroImage;
        public final String title;

        public Ready(Image image, String str, String str2, String str3) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            image.getClass();
            this.title = str;
            this.body = str2;
            this.buttonLabel = str3;
            this.heroImage = image;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return Intrinsics.areEqual(this.title, ready.title) && Intrinsics.areEqual(this.body, ready.body) && Intrinsics.areEqual(this.buttonLabel, ready.buttonLabel) && Intrinsics.areEqual(this.heroImage, ready.heroImage);
        }

        public final int hashCode() {
            return this.heroImage.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body), 31, this.buttonLabel);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Ready(title=", this.title, ", body=", this.body, ", buttonLabel=");
            m.append(this.buttonLabel);
            m.append(", heroImage=");
            m.append(this.heroImage);
            m.append(")");
            return m.toString();
        }
    }
}
