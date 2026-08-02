package com.squareup.cash.account.settings.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface AccountSettingsViewModel {

    public final class Content implements AccountSettingsViewModel {
        public final GlobalSettings globalSettings;
        public final String header;
        public final List rows;

        public Content(String str, List list, GlobalSettings globalSettings) {
            str.getClass();
            list.getClass();
            this.header = str;
            this.rows = list;
            this.globalSettings = globalSettings;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.header, content.header) && Intrinsics.areEqual(this.rows, content.rows) && Intrinsics.areEqual(this.globalSettings, content.globalSettings);
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(this.header.hashCode() * 31, 31, this.rows);
            GlobalSettings globalSettings = this.globalSettings;
            return m + (globalSettings == null ? 0 : globalSettings.hashCode());
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("Content(header=", this.header, ", rows=", ", globalSettings=", this.rows);
            m.append(this.globalSettings);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading implements AccountSettingsViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -740245175;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
