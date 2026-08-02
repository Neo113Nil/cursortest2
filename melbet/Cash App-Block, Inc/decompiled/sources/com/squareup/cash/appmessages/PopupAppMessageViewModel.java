package com.squareup.cash.appmessages;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import kotlin.jvm.internal.Intrinsics;
import utils.StringUtilsKt;

/* loaded from: classes5.dex */
public interface PopupAppMessageViewModel {

    public final class Loaded implements PopupAppMessageViewModel {
        public final StringUtilsKt actions;
        public final AppMessageViewEvent.AppMessageActionTaken backEvent;
        public final AppMessageImage image;
        public final String messageToken;
        public final String subtitle;
        public final String title;

        public Loaded(String str, AppMessageImage appMessageImage, String str2, String str3, StringUtilsKt stringUtilsKt, AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken) {
            this.messageToken = str;
            this.image = appMessageImage;
            this.title = str2;
            this.subtitle = str3;
            this.actions = stringUtilsKt;
            this.backEvent = appMessageActionTaken;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.messageToken.equals(loaded.messageToken) && Intrinsics.areEqual(this.image, loaded.image) && Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.subtitle, loaded.subtitle) && this.actions.equals(loaded.actions) && this.backEvent.equals(loaded.backEvent);
        }

        public final int hashCode() {
            int hashCode = this.messageToken.hashCode() * 31;
            AppMessageImage appMessageImage = this.image;
            int hashCode2 = (hashCode + (appMessageImage == null ? 0 : appMessageImage.hashCode())) * 31;
            String str = this.title;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitle;
            return this.backEvent.hashCode() + ((this.actions.hashCode() + ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(messageToken=");
            sb.append(this.messageToken);
            sb.append(", image=");
            sb.append(this.image);
            sb.append(", title=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.title, ", subtitle=", this.subtitle, ", actions=");
            sb.append(this.actions);
            sb.append(", backEvent=");
            sb.append(this.backEvent);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class Loading implements PopupAppMessageViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 859287891;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
