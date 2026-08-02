package com.squareup.cash.incentives.finishsetup.applets.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface FinishSetupAppletTileViewModel {

    public final class Installed implements FinishSetupAppletTileViewModel {
        public final Image heroImage;
        public final float progress;
        public final String progressLabel;
        public final String sectionLabel;
        public final String title;

        public Installed(String str, String str2, float f, String str3, Image image) {
            str.getClass();
            str2.getClass();
            this.sectionLabel = str;
            this.title = str2;
            this.progress = f;
            this.progressLabel = str3;
            this.heroImage = image;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Installed)) {
                return false;
            }
            Installed installed = (Installed) obj;
            return Intrinsics.areEqual(this.sectionLabel, installed.sectionLabel) && Intrinsics.areEqual(this.title, installed.title) && Float.compare(this.progress, installed.progress) == 0 && this.progressLabel.equals(installed.progressLabel) && this.heroImage.equals(installed.heroImage);
        }

        public final int hashCode() {
            return this.heroImage.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.progress, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sectionLabel.hashCode() * 31, 31, this.title), 31), 31, this.progressLabel);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Installed(sectionLabel=", this.sectionLabel, ", title=", this.title, ", progress=");
            m.append(this.progress);
            m.append(", progressLabel=");
            m.append(this.progressLabel);
            m.append(", heroImage=");
            m.append(this.heroImage);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading implements FinishSetupAppletTileViewModel {
        public final String title;

        public Loading(String str) {
            str.getClass();
            this.title = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.areEqual(this.title, ((Loading) obj).title);
        }

        public final int hashCode() {
            return this.title.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loading(title=", this.title, ")");
        }
    }
}
