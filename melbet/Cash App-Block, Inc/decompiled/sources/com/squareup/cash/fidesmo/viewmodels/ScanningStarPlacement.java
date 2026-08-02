package com.squareup.cash.fidesmo.viewmodels;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public interface ScanningStarPlacement {

    public final class Bounce implements ScanningStarPlacement {
        public static final Bounce INSTANCE = new Bounce();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Bounce);
        }

        @Override // com.squareup.cash.fidesmo.viewmodels.ScanningStarPlacement
        public final String getAnalyticsLabel() {
            return "bounce";
        }

        public final int hashCode() {
            return 2008841124;
        }

        public final String toString() {
            return "Bounce";
        }
    }

    public final class Companion {
        public static final Position TopCenter = new Position(0.5f, RecyclerView.DECELERATION_RATE);
        public static final Position Center = new Position(0.5f, 0.5f);
        public static final Position TopLeftVariant = new Position(0.1f, 0.2f);
    }

    public final class Position implements ScanningStarPlacement {
        public final float xFraction;
        public final float yFraction;

        public Position(float f, float f2) {
            this.xFraction = f;
            this.yFraction = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Position)) {
                return false;
            }
            Position position = (Position) obj;
            return Float.compare(this.xFraction, position.xFraction) == 0 && Float.compare(this.yFraction, position.yFraction) == 0;
        }

        @Override // com.squareup.cash.fidesmo.viewmodels.ScanningStarPlacement
        public final String getAnalyticsLabel() {
            return equals(Companion.TopCenter) ? "top_center" : equals(Companion.TopLeftVariant) ? "top_left" : equals(Companion.Center) ? "center" : "antenna_position";
        }

        public final int hashCode() {
            return Float.hashCode(this.yFraction) + (Float.hashCode(this.xFraction) * 31);
        }

        public final String toString() {
            return "Position(xFraction=" + this.xFraction + ", yFraction=" + this.yFraction + ")";
        }
    }

    public final class Snake implements ScanningStarPlacement {
        public static final Snake INSTANCE = new Snake();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Snake);
        }

        @Override // com.squareup.cash.fidesmo.viewmodels.ScanningStarPlacement
        public final String getAnalyticsLabel() {
            return "snake";
        }

        public final int hashCode() {
            return 1881567396;
        }

        public final String toString() {
            return "Snake";
        }
    }

    public final class Unknown implements ScanningStarPlacement {
        public static final Unknown INSTANCE = new Unknown();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unknown);
        }

        @Override // com.squareup.cash.fidesmo.viewmodels.ScanningStarPlacement
        public final String getAnalyticsLabel() {
            return "unknown";
        }

        public final int hashCode() {
            return 1789381294;
        }

        public final String toString() {
            return "Unknown";
        }
    }

    String getAnalyticsLabel();
}
