package com.squareup.cash.investing.backend.api;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.util.clock.AndroidClock;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public abstract class NetworkStatus {

    public final class Available extends NetworkStatus {
        public static final Available INSTANCE = new Available();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Available);
        }

        public final int hashCode() {
            return 757636826;
        }

        public final String toString() {
            return "Available";
        }
    }

    /* loaded from: classes6.dex */
    public final class Unavailable extends NetworkStatus {
        public final long sinceMillis;

        public Unavailable(long j) {
            this.sinceMillis = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unavailable) && this.sinceMillis == ((Unavailable) obj).sinceMillis;
        }

        public final long getSinceMillis() {
            return this.sinceMillis;
        }

        public final int hashCode() {
            return Long.hashCode(this.sinceMillis);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.sinceMillis, "Unavailable(sinceMillis=", ")");
        }
    }

    public final long ageMillis(AndroidClock androidClock) {
        if (this instanceof Available) {
            return 0L;
        }
        if (!(this instanceof Unavailable)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0L;
        }
        long millis = androidClock.millis() - ((Unavailable) this).getSinceMillis();
        if (millis < 0) {
            return 0L;
        }
        return millis;
    }
}
