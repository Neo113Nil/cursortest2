package com.squareup.cash.appmessages;

import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface InAppNotificationModel {

    public final class NotAvailable implements InAppNotificationModel {
        public static final NotAvailable INSTANCE = new NotAvailable();
    }

    public final class Ready implements InAppNotificationModel {
        public final AppMessageViewEvent.AppMessageActionTaken action;
        public final Color color;
        public final String description;
        public final AppMessageViewEvent.AppMessageActionTaken dismiss;
        public final Long duration;
        public final AppMessageImage image;
        public final boolean showChevron;
        public final String token;
        public final AppMessageViewEvent.AppMessageViewed viewed;

        public Ready(String str, AppMessageImage appMessageImage, String str2, Color color, boolean z, Long l, AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken, AppMessageViewEvent.AppMessageActionTaken appMessageActionTaken2, AppMessageViewEvent.AppMessageViewed appMessageViewed) {
            str.getClass();
            this.token = str;
            this.image = appMessageImage;
            this.description = str2;
            this.color = color;
            this.showChevron = z;
            this.duration = l;
            this.action = appMessageActionTaken;
            this.dismiss = appMessageActionTaken2;
            this.viewed = appMessageViewed;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return Intrinsics.areEqual(this.token, ready.token) && Intrinsics.areEqual(this.image, ready.image) && this.description.equals(ready.description) && Intrinsics.areEqual(this.color, ready.color) && this.showChevron == ready.showChevron && Intrinsics.areEqual(this.duration, ready.duration) && this.action.equals(ready.action) && this.dismiss.equals(ready.dismiss) && this.viewed.equals(ready.viewed);
        }

        public final int hashCode() {
            int hashCode = this.token.hashCode() * 31;
            AppMessageImage appMessageImage = this.image;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (appMessageImage == null ? 0 : appMessageImage.hashCode())) * 31, 31, this.description);
            Color color = this.color;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (color == null ? 0 : color.hashCode())) * 31, 31, this.showChevron);
            Long l = this.duration;
            return this.viewed.hashCode() + ((this.dismiss.hashCode() + ((this.action.hashCode() + ((m2 + (l != null ? l.hashCode() : 0)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Ready(token=" + this.token + ", image=" + this.image + ", description=" + this.description + ", color=" + this.color + ", showChevron=" + this.showChevron + ", duration=" + this.duration + ", action=" + this.action + ", dismiss=" + this.dismiss + ", viewed=" + this.viewed + ")";
        }
    }
}
