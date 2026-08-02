package com.squareup.cash.fidesmo.viewmodels;

import android.app.Activity;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public interface FidesmoProvisioningViewEvent {

    public final class ActivityReady implements FidesmoProvisioningViewEvent {
        public final Activity activity;

        public ActivityReady(Activity activity) {
            this.activity = activity;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActivityReady) && this.activity.equals(((ActivityReady) obj).activity);
        }

        public final int hashCode() {
            return this.activity.hashCode();
        }

        public final String toString() {
            return "ActivityReady(activity=" + this.activity + ")";
        }
    }

    public final class ActivityResumed implements FidesmoProvisioningViewEvent {
        public final boolean isNfcEnabled;

        public ActivityResumed(boolean z) {
            this.isNfcEnabled = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActivityResumed) && this.isNfcEnabled == ((ActivityResumed) obj).isNfcEnabled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isNfcEnabled);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("ActivityResumed(isNfcEnabled=", ")", this.isNfcEnabled);
        }
    }

    public final class Close implements FidesmoProvisioningViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -420881679;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class ContactSupport implements FidesmoProvisioningViewEvent {
        public static final ContactSupport INSTANCE = new ContactSupport();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ContactSupport);
        }

        public final int hashCode() {
            return 930060982;
        }

        public final String toString() {
            return "ContactSupport";
        }
    }

    public final class OpenNfcSettings implements FidesmoProvisioningViewEvent {
        public static final OpenNfcSettings INSTANCE = new OpenNfcSettings();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenNfcSettings);
        }

        public final int hashCode() {
            return -303933443;
        }

        public final String toString() {
            return "OpenNfcSettings";
        }
    }

    public final class OpenUrl implements FidesmoProvisioningViewEvent {
        public final String url;

        public OpenUrl(String str) {
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenUrl) && this.url.equals(((OpenUrl) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenUrl(url=", this.url, ")");
        }
    }

    public final class PreScanInstructionsCompleted implements FidesmoProvisioningViewEvent {
        public static final PreScanInstructionsCompleted INSTANCE = new PreScanInstructionsCompleted();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PreScanInstructionsCompleted);
        }

        public final int hashCode() {
            return -1784497875;
        }

        public final String toString() {
            return "PreScanInstructionsCompleted";
        }
    }

    public final class Retry implements FidesmoProvisioningViewEvent {
        public static final Retry INSTANCE = new Retry();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Retry);
        }

        public final int hashCode() {
            return -407232607;
        }

        public final String toString() {
            return "Retry";
        }
    }
}
