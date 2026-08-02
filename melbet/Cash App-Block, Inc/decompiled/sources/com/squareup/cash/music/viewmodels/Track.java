package com.squareup.cash.music.viewmodels;

import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Track {
    public final String artist;
    public final Image image;
    public final boolean isSelected;
    public final String musicId;
    public final String title;

    public Track(String str, String str2, Image image, boolean z, String str3) {
        str3.getClass();
        this.title = str;
        this.artist = str2;
        this.image = image;
        this.isSelected = z;
        this.musicId = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Track)) {
            return false;
        }
        Track track = (Track) obj;
        return this.title.equals(track.title) && this.artist.equals(track.artist) && this.image.equals(track.image) && this.isSelected == track.isSelected && Intrinsics.areEqual(this.musicId, track.musicId);
    }

    public final int hashCode() {
        return this.musicId.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.image.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.artist)) * 31, 31, this.isSelected);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Track(title=", this.title, ", artist=", this.artist, ", image=");
        m.append(this.image);
        m.append(", isSelected=");
        m.append(this.isSelected);
        m.append(", musicId=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.musicId, ")");
    }
}
