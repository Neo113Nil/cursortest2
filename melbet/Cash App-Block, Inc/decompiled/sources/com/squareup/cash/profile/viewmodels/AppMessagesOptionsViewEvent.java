package com.squareup.cash.profile.viewmodels;

import android.net.Uri;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes7.dex */
public interface AppMessagesOptionsViewEvent {

    public final class LightPreferenceChanged implements AppMessagesOptionsViewEvent {
        public final boolean checked;

        public LightPreferenceChanged(boolean z) {
            this.checked = z;
        }
    }

    /* loaded from: classes6.dex */
    public final class NavigationClicked implements AppMessagesOptionsViewEvent {
        public static final NavigationClicked INSTANCE = new NavigationClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NavigationClicked);
        }

        public final int hashCode() {
            return 1389317921;
        }

        public final String toString() {
            return "NavigationClicked";
        }
    }

    public final class PickRingtone implements AppMessagesOptionsViewEvent {
        public final List additionalItems;
        public final Uri currentRingtone;

        public PickRingtone(Uri uri, EmptyList emptyList) {
            this.currentRingtone = uri;
            this.additionalItems = emptyList;
        }
    }

    public final class VibratePreferenceChanged implements AppMessagesOptionsViewEvent {
        public final boolean checked;

        public VibratePreferenceChanged(boolean z) {
            this.checked = z;
        }
    }
}
