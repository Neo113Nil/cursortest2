package com.squareup.cash.appmessages;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import utils.StringUtilsKt;

/* loaded from: classes5.dex */
public interface InlineAppMessageViewModel {

    public final class NotAvailable implements InlineAppMessageViewModel {
        public static final NotAvailable INSTANCE = new NotAvailable();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotAvailable);
        }

        public final int hashCode() {
            return -1397592782;
        }

        public final String toString() {
            return "NotAvailable";
        }
    }

    public final class Ready implements InlineAppMessageViewModel {
        public final StringUtilsKt actions;
        public final AppMessageImage image;
        public final String messageToken;
        public final int priority;
        public final String subtitle;
        public final String title;

        public Ready(String str, AppMessageImage appMessageImage, String str2, String str3, int i, StringUtilsKt stringUtilsKt) {
            this.messageToken = str;
            this.image = appMessageImage;
            this.title = str2;
            this.subtitle = str3;
            this.priority = i;
            this.actions = stringUtilsKt;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return this.messageToken.equals(ready.messageToken) && Intrinsics.areEqual(this.image, ready.image) && Intrinsics.areEqual(this.title, ready.title) && Intrinsics.areEqual(this.subtitle, ready.subtitle) && this.priority == ready.priority && this.actions.equals(ready.actions);
        }

        public final int hashCode() {
            int hashCode = this.messageToken.hashCode() * 31;
            AppMessageImage appMessageImage = this.image;
            int hashCode2 = (hashCode + (appMessageImage == null ? 0 : appMessageImage.hashCode())) * 31;
            String str = this.title;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitle;
            return this.actions.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.priority, (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Ready(messageToken=");
            sb.append(this.messageToken);
            sb.append(", image=");
            sb.append(this.image);
            sb.append(", title=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.title, ", subtitle=", this.subtitle, ", priority=");
            sb.append(this.priority);
            sb.append(", actions=");
            sb.append(this.actions);
            sb.append(")");
            return sb.toString();
        }
    }
}
