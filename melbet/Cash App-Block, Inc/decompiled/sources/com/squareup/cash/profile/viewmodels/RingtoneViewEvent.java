package com.squareup.cash.profile.viewmodels;

/* loaded from: classes7.dex */
public interface RingtoneViewEvent {

    public final class CancelClicked implements RingtoneViewEvent {
        public static final CancelClicked INSTANCE = new CancelClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CancelClicked);
        }

        public final int hashCode() {
            return -1634119286;
        }

        public final String toString() {
            return "CancelClicked";
        }
    }

    public final class OkClicked implements RingtoneViewEvent {
        public final RingtoneResult result;

        public OkClicked(RingtoneResult ringtoneResult) {
            this.result = ringtoneResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OkClicked) && this.result.equals(((OkClicked) obj).result);
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final String toString() {
            return "OkClicked(result=" + this.result + ")";
        }
    }
}
