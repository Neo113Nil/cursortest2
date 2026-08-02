package androidx.media3.common;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.RegularImmutableList;
import com.google.common.collect.RegularImmutableMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class TrackSelectionParameters {
    public final AudioOffloadPreferences audioOffloadPreferences;
    public final ImmutableSet disabledTrackTypes;
    public final int ignoredTextSelectionFlags;
    public final boolean isViewportSizeLimitedByPhysicalDisplaySize;
    public final int maxAudioBitrate;
    public final int maxAudioChannelCount;
    public final int maxVideoBitrate;
    public final int maxVideoFrameRate;
    public final int maxVideoHeight;
    public final int maxVideoWidth;
    public final RegularImmutableMap overrides;
    public final ImmutableList preferredAudioLabels;
    public final ImmutableList preferredAudioLanguages;
    public final ImmutableList preferredAudioMimeTypes;
    public final ImmutableList preferredTextLabels;
    public final ImmutableList preferredTextLanguages;
    public final ImmutableList preferredVideoLabels;
    public final ImmutableList preferredVideoLanguages;
    public final ImmutableList preferredVideoMimeTypes;
    public final boolean usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager;
    public final int viewportHeight;
    public final boolean viewportOrientationMayChange;
    public final int viewportWidth;

    public final class AudioOffloadPreferences {
        public static final AudioOffloadPreferences DEFAULT = new AudioOffloadPreferences();

        static {
            Util.intToStringMaxRadix(1);
            Util.intToStringMaxRadix(2);
            Util.intToStringMaxRadix(3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || AudioOffloadPreferences.class != obj.getClass()) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return 29791;
        }
    }

    public class Builder {
        public AudioOffloadPreferences audioOffloadPreferences;
        public HashSet disabledTrackTypes;
        public int ignoredTextSelectionFlags;
        public int maxAudioBitrate;
        public int maxAudioChannelCount;
        public HashMap overrides;
        public ImmutableList preferredAudioLabels;
        public ImmutableList preferredAudioLanguages;
        public ImmutableList preferredAudioMimeTypes;
        public ImmutableList preferredTextLabels;
        public ImmutableList preferredTextLanguages;
        public ImmutableList preferredVideoLabels;
        public ImmutableList preferredVideoLanguages;
        public ImmutableList preferredVideoMimeTypes;
        public boolean usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager;
        public int maxVideoWidth = Integer.MAX_VALUE;
        public int maxVideoHeight = Integer.MAX_VALUE;
        public int maxVideoFrameRate = Integer.MAX_VALUE;
        public int maxVideoBitrate = Integer.MAX_VALUE;
        public int viewportWidth = Integer.MAX_VALUE;
        public int viewportHeight = Integer.MAX_VALUE;
        public boolean isViewportSizeLimitedByPhysicalDisplaySize = true;
        public boolean viewportOrientationMayChange = true;

        public Builder() {
            ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
            RegularImmutableList regularImmutableList = RegularImmutableList.EMPTY;
            this.preferredVideoMimeTypes = regularImmutableList;
            this.preferredVideoLabels = regularImmutableList;
            this.preferredVideoLanguages = regularImmutableList;
            this.preferredAudioLanguages = regularImmutableList;
            this.preferredAudioLabels = regularImmutableList;
            this.maxAudioChannelCount = Integer.MAX_VALUE;
            this.maxAudioBitrate = Integer.MAX_VALUE;
            this.preferredAudioMimeTypes = regularImmutableList;
            this.audioOffloadPreferences = AudioOffloadPreferences.DEFAULT;
            this.preferredTextLanguages = regularImmutableList;
            this.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager = true;
            this.preferredTextLabels = regularImmutableList;
            this.ignoredTextSelectionFlags = 0;
            this.overrides = new HashMap();
            this.disabledTrackTypes = new HashSet();
        }

        public TrackSelectionParameters build() {
            return new TrackSelectionParameters(this);
        }

        public Builder clearOverridesOfType(int i) {
            Iterator it = this.overrides.values().iterator();
            while (it.hasNext()) {
                if (((TrackSelectionOverride) it.next()).mediaTrackGroup.f871type == i) {
                    it.remove();
                }
            }
            return this;
        }

        public final void init(TrackSelectionParameters trackSelectionParameters) {
            this.maxVideoWidth = trackSelectionParameters.maxVideoWidth;
            this.maxVideoHeight = trackSelectionParameters.maxVideoHeight;
            this.maxVideoFrameRate = trackSelectionParameters.maxVideoFrameRate;
            this.maxVideoBitrate = trackSelectionParameters.maxVideoBitrate;
            this.viewportWidth = trackSelectionParameters.viewportWidth;
            this.viewportHeight = trackSelectionParameters.viewportHeight;
            this.isViewportSizeLimitedByPhysicalDisplaySize = trackSelectionParameters.isViewportSizeLimitedByPhysicalDisplaySize;
            this.viewportOrientationMayChange = trackSelectionParameters.viewportOrientationMayChange;
            this.preferredVideoLabels = trackSelectionParameters.preferredVideoLabels;
            this.preferredVideoMimeTypes = trackSelectionParameters.preferredVideoMimeTypes;
            this.preferredVideoLanguages = trackSelectionParameters.preferredVideoLanguages;
            this.preferredAudioLanguages = trackSelectionParameters.preferredAudioLanguages;
            this.preferredAudioLabels = trackSelectionParameters.preferredAudioLabels;
            this.maxAudioChannelCount = trackSelectionParameters.maxAudioChannelCount;
            this.maxAudioBitrate = trackSelectionParameters.maxAudioBitrate;
            this.preferredAudioMimeTypes = trackSelectionParameters.preferredAudioMimeTypes;
            this.audioOffloadPreferences = trackSelectionParameters.audioOffloadPreferences;
            this.preferredTextLanguages = trackSelectionParameters.preferredTextLanguages;
            this.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager = trackSelectionParameters.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager;
            this.preferredTextLabels = trackSelectionParameters.preferredTextLabels;
            this.ignoredTextSelectionFlags = trackSelectionParameters.ignoredTextSelectionFlags;
            this.disabledTrackTypes = new HashSet(trackSelectionParameters.disabledTrackTypes);
            this.overrides = new HashMap(trackSelectionParameters.overrides);
        }

        public Builder setIgnoredTextSelectionFlags() {
            this.ignoredTextSelectionFlags = -3;
            return this;
        }

        public Builder setOverrideForType(TrackSelectionOverride trackSelectionOverride) {
            TrackGroup trackGroup = trackSelectionOverride.mediaTrackGroup;
            clearOverridesOfType(trackGroup.f871type);
            this.overrides.put(trackGroup, trackSelectionOverride);
            return this;
        }

        public Builder setPreferredTextLanguage() {
            return setPreferredTextLanguages(new String[0]);
        }

        public Builder setPreferredTextLanguages(String... strArr) {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (String str : strArr) {
                str.getClass();
                builder.m2032add((Object) Util.normalizeLanguageCode(str));
            }
            this.preferredTextLanguages = builder.build();
            this.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager = false;
            return this;
        }

        public Builder setPreferredTextRoleFlags() {
            this.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager = false;
            return this;
        }

        public Builder setTrackTypeDisabled(int i, boolean z) {
            HashSet hashSet = this.disabledTrackTypes;
            if (z) {
                hashSet.add(Integer.valueOf(i));
                return this;
            }
            hashSet.remove(Integer.valueOf(i));
            return this;
        }
    }

    static {
        new TrackSelectionParameters(new Builder());
        Util.intToStringMaxRadix(1);
        Util.intToStringMaxRadix(2);
        Util.intToStringMaxRadix(3);
        Util.intToStringMaxRadix(4);
        Fragment$5$$ExternalSyntheticOutline0.m$1(5, 6, 7, 8, 9);
        Fragment$5$$ExternalSyntheticOutline0.m$1(10, 11, 12, 13, 14);
        Fragment$5$$ExternalSyntheticOutline0.m$1(15, 16, 17, 18, 19);
        Fragment$5$$ExternalSyntheticOutline0.m$1(20, 21, 22, 23, 24);
        Fragment$5$$ExternalSyntheticOutline0.m$1(25, 26, 27, 28, 29);
        Fragment$5$$ExternalSyntheticOutline0.m$1(30, 31, 32, 33, 34);
        Util.intToStringMaxRadix(35);
        Util.intToStringMaxRadix(36);
        Util.intToStringMaxRadix(37);
        Util.intToStringMaxRadix(38);
    }

    public TrackSelectionParameters(Builder builder) {
        this.maxVideoWidth = builder.maxVideoWidth;
        this.maxVideoHeight = builder.maxVideoHeight;
        this.maxVideoFrameRate = builder.maxVideoFrameRate;
        this.maxVideoBitrate = builder.maxVideoBitrate;
        this.viewportWidth = builder.viewportWidth;
        this.viewportHeight = builder.viewportHeight;
        this.isViewportSizeLimitedByPhysicalDisplaySize = builder.isViewportSizeLimitedByPhysicalDisplaySize;
        this.viewportOrientationMayChange = builder.viewportOrientationMayChange;
        this.preferredVideoMimeTypes = builder.preferredVideoMimeTypes;
        this.preferredVideoLabels = builder.preferredVideoLabels;
        this.preferredVideoLanguages = builder.preferredVideoLanguages;
        this.preferredAudioLanguages = builder.preferredAudioLanguages;
        this.maxAudioChannelCount = builder.maxAudioChannelCount;
        this.preferredAudioLabels = builder.preferredAudioLabels;
        this.maxAudioBitrate = builder.maxAudioBitrate;
        this.preferredAudioMimeTypes = builder.preferredAudioMimeTypes;
        this.audioOffloadPreferences = builder.audioOffloadPreferences;
        this.preferredTextLanguages = builder.preferredTextLanguages;
        this.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager = builder.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager;
        this.preferredTextLabels = builder.preferredTextLabels;
        this.ignoredTextSelectionFlags = builder.ignoredTextSelectionFlags;
        this.overrides = RegularImmutableMap.copyOf((Map) builder.overrides);
        this.disabledTrackTypes = ImmutableSet.copyOf((Collection) builder.disabledTrackTypes);
    }

    public Builder buildUpon() {
        Builder builder = new Builder();
        builder.init(this);
        return builder;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TrackSelectionParameters trackSelectionParameters = (TrackSelectionParameters) obj;
        if (this.maxVideoWidth != trackSelectionParameters.maxVideoWidth || this.maxVideoHeight != trackSelectionParameters.maxVideoHeight || this.maxVideoFrameRate != trackSelectionParameters.maxVideoFrameRate || this.maxVideoBitrate != trackSelectionParameters.maxVideoBitrate || this.viewportOrientationMayChange != trackSelectionParameters.viewportOrientationMayChange || this.viewportWidth != trackSelectionParameters.viewportWidth || this.viewportHeight != trackSelectionParameters.viewportHeight || this.isViewportSizeLimitedByPhysicalDisplaySize != trackSelectionParameters.isViewportSizeLimitedByPhysicalDisplaySize) {
            return false;
        }
        ImmutableList immutableList = trackSelectionParameters.preferredVideoMimeTypes;
        ImmutableList immutableList2 = this.preferredVideoMimeTypes;
        immutableList2.getClass();
        if (!Maps.equalsImpl(immutableList, immutableList2)) {
            return false;
        }
        ImmutableList immutableList3 = trackSelectionParameters.preferredVideoLabels;
        ImmutableList immutableList4 = this.preferredVideoLabels;
        immutableList4.getClass();
        if (!Maps.equalsImpl(immutableList3, immutableList4)) {
            return false;
        }
        ImmutableList immutableList5 = trackSelectionParameters.preferredVideoLanguages;
        ImmutableList immutableList6 = this.preferredVideoLanguages;
        immutableList6.getClass();
        if (!Maps.equalsImpl(immutableList5, immutableList6)) {
            return false;
        }
        ImmutableList immutableList7 = trackSelectionParameters.preferredAudioLanguages;
        ImmutableList immutableList8 = this.preferredAudioLanguages;
        immutableList8.getClass();
        if (!Maps.equalsImpl(immutableList7, immutableList8) || this.maxAudioChannelCount != trackSelectionParameters.maxAudioChannelCount) {
            return false;
        }
        ImmutableList immutableList9 = trackSelectionParameters.preferredAudioLabels;
        ImmutableList immutableList10 = this.preferredAudioLabels;
        immutableList10.getClass();
        if (!Maps.equalsImpl(immutableList9, immutableList10) || this.maxAudioBitrate != trackSelectionParameters.maxAudioBitrate) {
            return false;
        }
        ImmutableList immutableList11 = trackSelectionParameters.preferredAudioMimeTypes;
        ImmutableList immutableList12 = this.preferredAudioMimeTypes;
        immutableList12.getClass();
        if (!Maps.equalsImpl(immutableList11, immutableList12) || !this.audioOffloadPreferences.equals(trackSelectionParameters.audioOffloadPreferences)) {
            return false;
        }
        ImmutableList immutableList13 = trackSelectionParameters.preferredTextLabels;
        ImmutableList immutableList14 = this.preferredTextLabels;
        immutableList14.getClass();
        if (!Maps.equalsImpl(immutableList13, immutableList14)) {
            return false;
        }
        ImmutableList immutableList15 = trackSelectionParameters.preferredTextLanguages;
        ImmutableList immutableList16 = this.preferredTextLanguages;
        immutableList16.getClass();
        if (!Maps.equalsImpl(immutableList15, immutableList16) || this.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager != trackSelectionParameters.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager || this.ignoredTextSelectionFlags != trackSelectionParameters.ignoredTextSelectionFlags) {
            return false;
        }
        RegularImmutableMap regularImmutableMap = trackSelectionParameters.overrides;
        RegularImmutableMap regularImmutableMap2 = this.overrides;
        regularImmutableMap2.getClass();
        return Maps.equalsImpl(regularImmutableMap2, regularImmutableMap) && this.disabledTrackTypes.equals(trackSelectionParameters.disabledTrackTypes);
    }

    public int hashCode() {
        int hashCode = (this.preferredAudioMimeTypes.hashCode() + ((((this.preferredAudioLabels.hashCode() + ((((this.preferredAudioLanguages.hashCode() + ((this.preferredVideoLanguages.hashCode() + ((this.preferredVideoLabels.hashCode() + ((this.preferredVideoMimeTypes.hashCode() + ((((((((((((((((this.maxVideoWidth + 31) * 31) + this.maxVideoHeight) * 31) + this.maxVideoFrameRate) * 31) + this.maxVideoBitrate) * 28629151) + (this.viewportOrientationMayChange ? 1 : 0)) * 31) + this.viewportWidth) * 31) + this.viewportHeight) * 31) + (this.isViewportSizeLimitedByPhysicalDisplaySize ? 1 : 0)) * 31)) * 31)) * 31)) * 961)) * 961) + this.maxAudioChannelCount) * 31)) * 31) + this.maxAudioBitrate) * 31)) * 31;
        this.audioOffloadPreferences.getClass();
        return this.disabledTrackTypes.hashCode() + ((this.overrides.hashCode() + ((((this.preferredTextLabels.hashCode() + ((((this.preferredTextLanguages.hashCode() + ((hashCode + 29791) * 961)) * 961) + (this.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager ? 1 : 0)) * 31)) * 31) + this.ignoredTextSelectionFlags) * 28629151)) * 31);
    }
}
