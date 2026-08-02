package androidx.media3.exoplayer.source;

import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.RegularImmutableList;

/* loaded from: classes3.dex */
public final class TrackGroupArray {
    public static final TrackGroupArray EMPTY = new TrackGroupArray(new TrackGroup[0]);
    public int hashCode;
    public final int length;
    public final RegularImmutableList trackGroups;

    static {
        Util.intToStringMaxRadix(0);
    }

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        RegularImmutableList copyOf = ImmutableList.copyOf(trackGroupArr);
        this.trackGroups = copyOf;
        this.length = trackGroupArr.length;
        int i = 0;
        while (i < copyOf.size) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < copyOf.size; i3++) {
                if (((TrackGroup) copyOf.get(i)).equals(copyOf.get(i3))) {
                    Log.e("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroupArray.class != obj.getClass()) {
            return false;
        }
        TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
        if (this.length != trackGroupArray.length) {
            return false;
        }
        RegularImmutableList regularImmutableList = trackGroupArray.trackGroups;
        RegularImmutableList regularImmutableList2 = this.trackGroups;
        regularImmutableList2.getClass();
        return Maps.equalsImpl(regularImmutableList, regularImmutableList2);
    }

    public final TrackGroup get(int i) {
        return (TrackGroup) this.trackGroups.get(i);
    }

    public final int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = this.trackGroups.hashCode();
        }
        return this.hashCode;
    }

    public final String toString() {
        return this.trackGroups.toString();
    }
}
