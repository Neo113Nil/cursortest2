package com.squareup.cash.blockers.viewmodels;

import com.squareup.protos.cash.ui.Icon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface GpsLocationConsentBlockerViewModel {

    public final class Loaded implements GpsLocationConsentBlockerViewModel {
        public final String description;
        public final Icon icon;
        public final Button primaryButton;
        public final Button standardButton;
        public final Button subtleButton;
        public final String title;

        public final class Button {
            public final GpsLocationConsentBlockerViewEvent event;
            public final Icon icon;
            public final String text;

            public Button(String str, Icon icon, GpsLocationConsentBlockerViewEvent gpsLocationConsentBlockerViewEvent) {
                str.getClass();
                this.text = str;
                this.icon = icon;
                this.event = gpsLocationConsentBlockerViewEvent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return Intrinsics.areEqual(this.text, button.text) && Intrinsics.areEqual(this.icon, button.icon) && Intrinsics.areEqual(this.event, button.event);
            }

            public final int hashCode() {
                int hashCode = this.text.hashCode() * 31;
                Icon icon = this.icon;
                return this.event.hashCode() + ((hashCode + (icon == null ? 0 : icon.hashCode())) * 31);
            }

            public final String toString() {
                return "Button(text=" + this.text + ", icon=" + this.icon + ", event=" + this.event + ")";
            }
        }

        public Loaded(Icon icon, String str, String str2, Button button, Button button2, Button button3) {
            icon.getClass();
            str.getClass();
            str2.getClass();
            this.icon = icon;
            this.title = str;
            this.description = str2;
            this.subtleButton = button;
            this.standardButton = button2;
            this.primaryButton = button3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.icon, loaded.icon) && Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.description, loaded.description) && Intrinsics.areEqual(this.subtleButton, loaded.subtleButton) && Intrinsics.areEqual(this.standardButton, loaded.standardButton) && this.primaryButton.equals(loaded.primaryButton);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.icon.hashCode() * 31, 31, this.title), 31, this.description);
            Button button = this.subtleButton;
            int hashCode = (m + (button == null ? 0 : button.hashCode())) * 31;
            Button button2 = this.standardButton;
            return this.primaryButton.hashCode() + ((hashCode + (button2 != null ? button2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Loaded(icon=" + this.icon + ", title=" + this.title + ", description=" + this.description + ", subtleButton=" + this.subtleButton + ", standardButton=" + this.standardButton + ", primaryButton=" + this.primaryButton + ")";
        }
    }

    public final class Loading implements GpsLocationConsentBlockerViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1825292335;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
