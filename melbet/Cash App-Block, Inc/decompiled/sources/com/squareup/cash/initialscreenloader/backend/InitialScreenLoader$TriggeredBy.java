package com.squareup.cash.initialscreenloader.backend;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface InitialScreenLoader$TriggeredBy {

    public final class ActivityLaunch implements InitialScreenLoader$TriggeredBy {
        public final Intent launchingIntent;

        public ActivityLaunch(Intent intent) {
            intent.getClass();
            this.launchingIntent = intent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActivityLaunch) && Intrinsics.areEqual(this.launchingIntent, ((ActivityLaunch) obj).launchingIntent);
        }

        public final int hashCode() {
            return this.launchingIntent.hashCode();
        }

        public final String toString() {
            return "ActivityLaunch(launchingIntent=" + this.launchingIntent + ")";
        }
    }

    /* loaded from: classes6.dex */
    public final class SignOut implements InitialScreenLoader$TriggeredBy {
        public static final SignOut INSTANCE = new SignOut();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SignOut);
        }

        public final int hashCode() {
            return -1779514513;
        }

        public final String toString() {
            return "SignOut";
        }
    }
}
