package com.squareup.cash.music.viewmodels;

import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface MusicViewEvent {

    public final class ChooseTapped implements MusicViewEvent {
        public static final ChooseTapped INSTANCE = new ChooseTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ChooseTapped);
        }

        public final int hashCode() {
            return -1149737571;
        }

        public final String toString() {
            return "ChooseTapped";
        }
    }

    public final class Close implements MusicViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1314414306;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class SearchTextChanged implements MusicViewEvent {
        public final String query;

        public SearchTextChanged(String str) {
            str.getClass();
            this.query = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchTextChanged) && Intrinsics.areEqual(this.query, ((SearchTextChanged) obj).query);
        }

        public final int hashCode() {
            return this.query.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SearchTextChanged(query=", this.query, ")");
        }
    }

    public final class TrackTapped implements MusicViewEvent {
        public final String musicId;

        public TrackTapped(String str) {
            str.getClass();
            this.musicId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TrackTapped) && Intrinsics.areEqual(this.musicId, ((TrackTapped) obj).musicId);
        }

        public final int hashCode() {
            return this.musicId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TrackTapped(musicId=", this.musicId, ")");
        }
    }
}
