package com.squareup.cash.onboarding.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes6.dex */
public abstract class OnboardingLandingViewEvent {

    public final class GetStartedClicked extends OnboardingLandingViewEvent {
        public final long tapTimeMs;

        public GetStartedClicked(long j) {
            this.tapTimeMs = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetStartedClicked) && this.tapTimeMs == ((GetStartedClicked) obj).tapTimeMs;
        }

        public final int hashCode() {
            return Long.hashCode(this.tapTimeMs);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.tapTimeMs, "GetStartedClicked(tapTimeMs=", ")");
        }
    }

    public final class VideoLoaded extends OnboardingLandingViewEvent {
        public final long loadTimeMs;

        public VideoLoaded(long j) {
            this.loadTimeMs = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VideoLoaded) && this.loadTimeMs == ((VideoLoaded) obj).loadTimeMs;
        }

        public final int hashCode() {
            return Long.hashCode(this.loadTimeMs);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.loadTimeMs, "VideoLoaded(loadTimeMs=", ")");
        }
    }
}
