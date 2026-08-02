package com.squareup.cash.profile.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ProfileNotificationsViewModel {

    public final class Loaded implements ProfileNotificationsViewModel {
        public final NotificationMessage notificationMessage;
        public final List sections;

        public final class NotificationMessage {
            public final String buttonText;
            public final String subtitle;
            public final String title;

            public NotificationMessage(String str, String str2, String str3) {
                re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
                this.title = str;
                this.subtitle = str2;
                this.buttonText = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NotificationMessage)) {
                    return false;
                }
                NotificationMessage notificationMessage = (NotificationMessage) obj;
                return Intrinsics.areEqual(this.title, notificationMessage.title) && Intrinsics.areEqual(this.subtitle, notificationMessage.subtitle) && Intrinsics.areEqual(this.buttonText, notificationMessage.buttonText);
            }

            public final int hashCode() {
                return this.buttonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NotificationMessage(title=", this.title, ", subtitle=", this.subtitle, ", buttonText="), this.buttonText, ")");
            }
        }

        public Loaded(List list, NotificationMessage notificationMessage) {
            list.getClass();
            this.sections = list;
            this.notificationMessage = notificationMessage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.sections, loaded.sections) && Intrinsics.areEqual(this.notificationMessage, loaded.notificationMessage);
        }

        public final int hashCode() {
            int hashCode = this.sections.hashCode() * 31;
            NotificationMessage notificationMessage = this.notificationMessage;
            return hashCode + (notificationMessage == null ? 0 : notificationMessage.hashCode());
        }

        public final String toString() {
            return "Loaded(sections=" + this.sections + ", notificationMessage=" + this.notificationMessage + ")";
        }
    }

    public final class Loading implements ProfileNotificationsViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1016196789;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
