package com.squareup.cash.music.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface MusicViewModel {

    public final class Error implements MusicViewModel {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return -520008019;
        }

        public final String toString() {
            return "Error(message=Failed to load music)";
        }
    }

    public final class Loaded implements MusicViewModel {
        public final boolean hasSelectedTrack;
        public final float playbackProgress;
        public final String searchQuery;
        public final List tracks;

        public Loaded(List list, boolean z, float f, String str) {
            list.getClass();
            str.getClass();
            this.tracks = list;
            this.hasSelectedTrack = z;
            this.playbackProgress = f;
            this.searchQuery = str;
        }

        public static Loaded copy$default(Loaded loaded, List list, boolean z, float f, String str, int i) {
            if ((i & 1) != 0) {
                list = loaded.tracks;
            }
            if ((i & 2) != 0) {
                z = loaded.hasSelectedTrack;
            }
            if ((i & 4) != 0) {
                f = loaded.playbackProgress;
            }
            if ((i & 8) != 0) {
                str = loaded.searchQuery;
            }
            list.getClass();
            str.getClass();
            return new Loaded(list, z, f, str);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.tracks, loaded.tracks) && this.hasSelectedTrack == loaded.hasSelectedTrack && Float.compare(this.playbackProgress, loaded.playbackProgress) == 0 && Intrinsics.areEqual(this.searchQuery, loaded.searchQuery);
        }

        public final int hashCode() {
            return this.searchQuery.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.playbackProgress, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.tracks.hashCode() * 31, 31, this.hasSelectedTrack), 31);
        }

        public final String toString() {
            return "Loaded(tracks=" + this.tracks + ", hasSelectedTrack=" + this.hasSelectedTrack + ", playbackProgress=" + this.playbackProgress + ", searchQuery=" + this.searchQuery + ")";
        }
    }

    public final class Loading implements MusicViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 927857777;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
