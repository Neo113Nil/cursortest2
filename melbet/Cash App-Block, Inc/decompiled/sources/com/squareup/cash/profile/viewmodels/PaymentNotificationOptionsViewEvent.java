package com.squareup.cash.profile.viewmodels;

import android.net.Uri;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface PaymentNotificationOptionsViewEvent {

    public final class Exit implements PaymentNotificationOptionsViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return 1397461420;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class PickRingtone implements PaymentNotificationOptionsViewEvent {
        public final List additionalItems;
        public final Uri currentRingtone;

        public PickRingtone(Uri uri, List list) {
            this.currentRingtone = uri;
            this.additionalItems = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PickRingtone)) {
                return false;
            }
            PickRingtone pickRingtone = (PickRingtone) obj;
            return Intrinsics.areEqual(this.currentRingtone, pickRingtone.currentRingtone) && Intrinsics.areEqual(this.additionalItems, pickRingtone.additionalItems);
        }

        public final int hashCode() {
            Uri uri = this.currentRingtone;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((uri == null ? 0 : uri.hashCode()) * 31, 31, true), 31, true);
            List list = this.additionalItems;
            return m + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            return "PickRingtone(currentRingtone=" + this.currentRingtone + ", showDefault=true, showSilent=true, additionalItems=" + this.additionalItems + ")";
        }
    }
}
