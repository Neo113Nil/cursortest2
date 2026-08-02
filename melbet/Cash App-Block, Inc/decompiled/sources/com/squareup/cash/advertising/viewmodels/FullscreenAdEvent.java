package com.squareup.cash.advertising.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.knotapi.knot.utilities.Constants;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class FullscreenAdEvent {

    public final class Close extends FullscreenAdEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1027066787;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class HasAudioTrack extends FullscreenAdEvent {
        public static final HasAudioTrack INSTANCE = new HasAudioTrack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HasAudioTrack);
        }

        public final int hashCode() {
            return -2038790;
        }

        public final String toString() {
            return "HasAudioTrack";
        }
    }

    public final class PlaybackBuffer extends FullscreenAdEvent {
        public final long durationMillis;

        public PlaybackBuffer(long j) {
            this.durationMillis = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PlaybackBuffer) && this.durationMillis == ((PlaybackBuffer) obj).durationMillis;
        }

        public final int hashCode() {
            return Long.hashCode(this.durationMillis);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m(this.durationMillis, "PlaybackBuffer(durationMillis=", ")");
        }
    }

    public final class Retry extends FullscreenAdEvent {
        public static final Retry INSTANCE = new Retry();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Retry);
        }

        public final int hashCode() {
            return 1040715859;
        }

        public final String toString() {
            return "Retry";
        }
    }

    public final class TapActionButton extends FullscreenAdEvent {
        public final String analyticsValue;
        public final String urlToOpen;

        public TapActionButton(String str, String str2) {
            this.analyticsValue = str;
            this.urlToOpen = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TapActionButton)) {
                return false;
            }
            TapActionButton tapActionButton = (TapActionButton) obj;
            return this.analyticsValue.equals(tapActionButton.analyticsValue) && Intrinsics.areEqual(this.urlToOpen, tapActionButton.urlToOpen);
        }

        public final int hashCode() {
            int hashCode = this.analyticsValue.hashCode() * 31;
            String str = this.urlToOpen;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("TapActionButton(analyticsValue=", this.analyticsValue, ", urlToOpen=", this.urlToOpen, ")");
        }
    }

    public final class VolumeChange extends FullscreenAdEvent {
        public final boolean muted;

        public VolumeChange(boolean z) {
            this.muted = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VolumeChange) && this.muted == ((VolumeChange) obj).muted;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.muted);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("VolumeChange(muted=", ")", this.muted);
        }
    }
}
