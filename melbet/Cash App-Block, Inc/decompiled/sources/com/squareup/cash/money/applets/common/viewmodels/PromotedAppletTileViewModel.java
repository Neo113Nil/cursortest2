package com.squareup.cash.money.applets.common.viewmodels;

import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PromotedAppletTileViewModel {

    public final class Failed implements PromotedAppletTileViewModel {
        public static final Failed INSTANCE = new Failed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public final int hashCode() {
            return -1962794428;
        }

        public final String toString() {
            return "Failed";
        }
    }

    public final class Loaded implements PromotedAppletTileViewModel {
        public final Image image;
        public final Integer imageResource;
        public final String subtitle;
        public final String title;

        public Loaded(String str, String str2, Integer num, Image image) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.subtitle = str2;
            this.imageResource = num;
            this.image = image;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.subtitle, loaded.subtitle) && Intrinsics.areEqual(this.imageResource, loaded.imageResource) && Intrinsics.areEqual(this.image, loaded.image);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
            Integer num = this.imageResource;
            int hashCode = (m + (num == null ? 0 : num.hashCode())) * 31;
            Image image = this.image;
            return hashCode + (image != null ? image.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(title=", this.title, ", subtitle=", this.subtitle, ", imageResource=");
            m.append(this.imageResource);
            m.append(", image=");
            m.append(this.image);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading implements PromotedAppletTileViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 706155541;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
