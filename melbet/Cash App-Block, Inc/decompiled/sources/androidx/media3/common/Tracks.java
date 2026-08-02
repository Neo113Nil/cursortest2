package androidx.media3.common;

import androidx.media3.common.util.Util;
import androidx.tracing.Trace;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.RegularImmutableList;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class Tracks {
    public static final Tracks EMPTY;
    public final ImmutableList groups;

    public final class Group {
        public final boolean adaptiveSupported;
        public final int length;
        public final TrackGroup mediaTrackGroup;
        public final boolean[] trackSelected;
        public final int[] trackSupport;

        static {
            Util.intToStringMaxRadix(0);
            Util.intToStringMaxRadix(1);
            Util.intToStringMaxRadix(3);
            Util.intToStringMaxRadix(4);
        }

        public Group(TrackGroup trackGroup, boolean z, int[] iArr, boolean[] zArr) {
            int i = trackGroup.length;
            this.length = i;
            boolean z2 = false;
            Trace.checkArgument(i == iArr.length && i == zArr.length);
            this.mediaTrackGroup = trackGroup;
            if (z && i > 1) {
                z2 = true;
            }
            this.adaptiveSupported = z2;
            this.trackSupport = (int[]) iArr.clone();
            this.trackSelected = (boolean[]) zArr.clone();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Group.class == obj.getClass()) {
                Group group = (Group) obj;
                if (this.adaptiveSupported == group.adaptiveSupported && this.mediaTrackGroup.equals(group.mediaTrackGroup) && Arrays.equals(this.trackSupport, group.trackSupport) && Arrays.equals(this.trackSelected, group.trackSelected)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(this.trackSelected) + ((Arrays.hashCode(this.trackSupport) + (((this.mediaTrackGroup.hashCode() * 31) + (this.adaptiveSupported ? 1 : 0)) * 31)) * 31);
        }
    }

    static {
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        EMPTY = new Tracks(RegularImmutableList.EMPTY);
        Util.intToStringMaxRadix(0);
    }

    public Tracks(RegularImmutableList regularImmutableList) {
        this.groups = ImmutableList.copyOf((Collection) regularImmutableList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Tracks.class != obj.getClass()) {
            return false;
        }
        ImmutableList immutableList = ((Tracks) obj).groups;
        ImmutableList immutableList2 = this.groups;
        immutableList2.getClass();
        return Maps.equalsImpl(immutableList, immutableList2);
    }

    public final int hashCode() {
        return this.groups.hashCode();
    }

    public final boolean isTypeSelected(int i) {
        int i2 = 0;
        while (true) {
            ImmutableList immutableList = this.groups;
            if (i2 >= immutableList.size()) {
                return false;
            }
            Group group = (Group) immutableList.get(i2);
            boolean[] zArr = group.trackSelected;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (!zArr[i3]) {
                    i3++;
                } else if (group.mediaTrackGroup.f871type == i) {
                    return true;
                }
            }
            i2++;
        }
    }
}
