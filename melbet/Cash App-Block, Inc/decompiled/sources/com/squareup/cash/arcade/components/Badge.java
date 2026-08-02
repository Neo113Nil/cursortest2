package com.squareup.cash.arcade.components;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes.dex */
public interface Badge {

    /* loaded from: classes5.dex */
    public final class Large implements Badge {
        public final long count;
        public final String text;

        public Large(long j) {
            this.count = j;
            this.text = (0 > j || j >= 100) ? "99+" : String.valueOf(j);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Large) && this.count == ((Large) obj).count;
        }

        public final long getCount() {
            return this.count;
        }

        public final int hashCode() {
            return Long.hashCode(this.count);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.count, "Large(count=", ")");
        }
    }

    /* loaded from: classes4.dex */
    public final class Small implements Badge {
        public static final Small INSTANCE = new Small();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Small);
        }

        public final int hashCode() {
            return 197009744;
        }

        public final String toString() {
            return "Small";
        }
    }
}
