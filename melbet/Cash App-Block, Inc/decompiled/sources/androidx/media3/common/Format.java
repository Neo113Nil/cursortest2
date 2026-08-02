package androidx.media3.common;

import android.text.TextUtils;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.util.Util;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.RegularImmutableList;
import com.google.common.math.DoubleMath;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class Format {
    public final int accessibilityChannel;
    public final int auxiliaryTrackType;
    public final int averageBitrate;
    public final int bitrate;
    public final int channelCount;
    public final String codecs;
    public final ColorInfo colorInfo;
    public final String containerMimeType;
    public final int cryptoType;
    public final int cueReplacementBehavior;
    public final int decodedHeight;
    public final int decodedWidth;
    public final DrmInitData drmInitData;
    public final int encoderDelay;
    public final int encoderPadding;
    public final float frameRate;
    public final boolean hasPrerollSamples;
    public int hashCode;
    public final int height;
    public final String id;
    public final List initializationData;
    public final String label;
    public final ImmutableList labels;
    public final String language;
    public final int maxInputSize;
    public final int maxNumReorderSamples;
    public final int maxSubLayers;
    public final Metadata metadata;
    public final int pcmEncoding;
    public final int peakBitrate;
    public final float pixelWidthHeightRatio;
    public final String primaryTrackGroupId;
    public final byte[] projectionData;
    public final int roleFlags;
    public final int rotationDegrees;
    public final String sampleMimeType;
    public final int sampleRate;
    public final int selectionFlags;
    public final int stereoMode;
    public final long subsampleOffsetUs;
    public final int tileCountHorizontal;
    public final int tileCountVertical;
    public final int width;

    public final class Builder {
        public int accessibilityChannel;
        public int auxiliaryTrackType;
        public int averageBitrate;
        public int channelCount;
        public String codecs;
        public ColorInfo colorInfo;
        public String containerMimeType;
        public int cryptoType;
        public int cueReplacementBehavior;
        public int decodedHeight;
        public int decodedWidth;
        public DrmInitData drmInitData;
        public int encoderDelay;
        public int encoderPadding;
        public float frameRate;
        public boolean hasPrerollSamples;
        public int height;
        public String id;
        public List initializationData;
        public String label;
        public ImmutableList labels;
        public String language;
        public int maxInputSize;
        public int maxNumReorderSamples;
        public int maxSubLayers;
        public Metadata metadata;
        public int pcmEncoding;
        public int peakBitrate;
        public float pixelWidthHeightRatio;
        public String primaryTrackGroupId;
        public byte[] projectionData;
        public int roleFlags;
        public int rotationDegrees;
        public String sampleMimeType;
        public int sampleRate;
        public int selectionFlags;
        public int stereoMode;
        public long subsampleOffsetUs;
        public int tileCountHorizontal;
        public int tileCountVertical;
        public int width;

        public Builder() {
            ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
            this.labels = RegularImmutableList.EMPTY;
            this.averageBitrate = -1;
            this.peakBitrate = -1;
            this.maxInputSize = -1;
            this.maxNumReorderSamples = -1;
            this.subsampleOffsetUs = Long.MAX_VALUE;
            this.width = -1;
            this.height = -1;
            this.decodedWidth = -1;
            this.decodedHeight = -1;
            this.frameRate = -1.0f;
            this.pixelWidthHeightRatio = 1.0f;
            this.stereoMode = -1;
            this.maxSubLayers = -1;
            this.channelCount = -1;
            this.sampleRate = -1;
            this.pcmEncoding = -1;
            this.accessibilityChannel = -1;
            this.cueReplacementBehavior = 1;
            this.tileCountHorizontal = -1;
            this.tileCountVertical = -1;
            this.cryptoType = 0;
            this.auxiliaryTrackType = 0;
        }

        public final Format build() {
            return new Format(this);
        }
    }

    static {
        new Builder().build();
        Util.intToStringMaxRadix(0);
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
    }

    public Format(Builder builder) {
        boolean z;
        String str;
        this.id = builder.id;
        String normalizeLanguageCode = Util.normalizeLanguageCode(builder.language);
        this.language = normalizeLanguageCode;
        if (builder.labels.isEmpty() && builder.label != null) {
            this.labels = ImmutableList.of((Object) new Label(normalizeLanguageCode, builder.label));
            this.label = builder.label;
        } else if (builder.labels.isEmpty() || builder.label != null) {
            if (!builder.labels.isEmpty() || builder.label != null) {
                for (int i = 0; i < builder.labels.size(); i++) {
                    if (!((Label) builder.labels.get(i)).value.equals(builder.label)) {
                    }
                }
                z = false;
                Trace.checkState(z);
                this.labels = builder.labels;
                this.label = builder.label;
            }
            z = true;
            Trace.checkState(z);
            this.labels = builder.labels;
            this.label = builder.label;
        } else {
            ImmutableList immutableList = builder.labels;
            this.labels = immutableList;
            Iterator it = immutableList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((Label) immutableList.get(0)).value;
                    break;
                }
                Label label = (Label) it.next();
                if (TextUtils.equals(label.language, normalizeLanguageCode)) {
                    str = label.value;
                    break;
                }
            }
            this.label = str;
        }
        this.selectionFlags = builder.selectionFlags;
        Trace.checkState("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", builder.auxiliaryTrackType == 0 || (builder.roleFlags & 32768) != 0);
        this.roleFlags = builder.roleFlags;
        this.auxiliaryTrackType = builder.auxiliaryTrackType;
        int i2 = builder.averageBitrate;
        this.averageBitrate = i2;
        int i3 = builder.peakBitrate;
        this.peakBitrate = i3;
        this.bitrate = i3 != -1 ? i3 : i2;
        this.codecs = builder.codecs;
        this.metadata = builder.metadata;
        this.primaryTrackGroupId = builder.primaryTrackGroupId;
        this.containerMimeType = builder.containerMimeType;
        this.sampleMimeType = builder.sampleMimeType;
        this.maxInputSize = builder.maxInputSize;
        this.maxNumReorderSamples = builder.maxNumReorderSamples;
        List list = builder.initializationData;
        this.initializationData = list == null ? Collections.EMPTY_LIST : list;
        DrmInitData drmInitData = builder.drmInitData;
        this.drmInitData = drmInitData;
        this.subsampleOffsetUs = builder.subsampleOffsetUs;
        this.hasPrerollSamples = builder.hasPrerollSamples;
        this.width = builder.width;
        this.height = builder.height;
        this.decodedWidth = builder.decodedWidth;
        this.decodedHeight = builder.decodedHeight;
        this.frameRate = builder.frameRate;
        int i4 = builder.rotationDegrees;
        this.rotationDegrees = i4 == -1 ? 0 : i4;
        float f = builder.pixelWidthHeightRatio;
        this.pixelWidthHeightRatio = f == -1.0f ? 1.0f : f;
        this.projectionData = builder.projectionData;
        this.stereoMode = builder.stereoMode;
        this.colorInfo = builder.colorInfo;
        this.maxSubLayers = builder.maxSubLayers;
        this.channelCount = builder.channelCount;
        this.sampleRate = builder.sampleRate;
        this.pcmEncoding = builder.pcmEncoding;
        int i5 = builder.encoderDelay;
        this.encoderDelay = i5 == -1 ? 0 : i5;
        int i6 = builder.encoderPadding;
        this.encoderPadding = i6 != -1 ? i6 : 0;
        this.accessibilityChannel = builder.accessibilityChannel;
        this.cueReplacementBehavior = builder.cueReplacementBehavior;
        this.tileCountHorizontal = builder.tileCountHorizontal;
        this.tileCountVertical = builder.tileCountVertical;
        int i7 = builder.cryptoType;
        if (i7 != 0 || drmInitData == null) {
            this.cryptoType = i7;
        } else {
            this.cryptoType = 1;
        }
    }

    public static String toLogString(Format format2) {
        int i;
        String str;
        String str2;
        if (format2 == null) {
            return "null";
        }
        int i2 = format2.selectionFlags;
        ImmutableList immutableList = format2.labels;
        String str3 = format2.language;
        int i3 = format2.sampleRate;
        int i4 = format2.channelCount;
        int i5 = format2.maxSubLayers;
        float f = format2.frameRate;
        ColorInfo colorInfo = format2.colorInfo;
        float f2 = format2.pixelWidthHeightRatio;
        int i6 = format2.decodedHeight;
        int i7 = format2.decodedWidth;
        int i8 = format2.height;
        int i9 = format2.width;
        DrmInitData drmInitData = format2.drmInitData;
        String str4 = format2.codecs;
        int i10 = format2.bitrate;
        String str5 = format2.primaryTrackGroupId;
        String str6 = format2.containerMimeType;
        int i11 = format2.roleFlags;
        Joiner joiner = new Joiner(String.valueOf(','));
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m("id=");
        m.append(format2.id);
        m.append(", mimeType=");
        m.append(format2.sampleMimeType);
        if (str6 != null) {
            m.append(", container=");
            m.append(str6);
        }
        if (str5 != null) {
            m.append(", primaryGroupId=");
            m.append(str5);
        }
        if (i10 != -1) {
            m.append(", bitrate=");
            m.append(i10);
        }
        if (str4 != null) {
            m.append(", codecs=");
            m.append(str4);
        }
        if (drmInitData != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i12 = 0; i12 < drmInitData.schemeDataCount; i12++) {
                UUID uuid = drmInitData.schemeDatas[i12].uuid;
                if (uuid.equals(C.COMMON_PSSH_UUID)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(C.CLEARKEY_UUID)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(C.PLAYREADY_UUID)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(C.WIDEVINE_UUID)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(C.UUID_NIL)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            m.append(", drm=[");
            joiner.appendTo$1(m, linkedHashSet.iterator());
            m.append(']');
        }
        if (i9 != -1 && i8 != -1) {
            Fragment$5$$ExternalSyntheticOutline0.m(i9, i8, ", res=", "x", m);
        }
        if (i7 != -1 && i6 != -1) {
            Fragment$5$$ExternalSyntheticOutline0.m(i7, i6, ", decRes=", "x", m);
        }
        double d = f2;
        int i13 = DoubleMath.$r8$clinit;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            m.append(", par=");
            Object[] objArr = {Float.valueOf(f2)};
            String str7 = Util.DEVICE_DEBUG_INFO;
            m.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (colorInfo != null) {
            int i14 = colorInfo.chromaBitdepth;
            int i15 = colorInfo.lumaBitdepth;
            if ((i15 != -1 && i14 != -1) || colorInfo.isDataSpaceValid()) {
                m.append(", color=");
                if (colorInfo.isDataSpaceValid()) {
                    String colorSpaceToString = ColorInfo.colorSpaceToString(colorInfo.colorSpace);
                    String colorRangeToString = ColorInfo.colorRangeToString(colorInfo.colorRange);
                    String colorTransferToString = ColorInfo.colorTransferToString(colorInfo.colorTransfer);
                    Locale locale = Locale.US;
                    str2 = Boxes$$ExternalSyntheticOutline1.m$1(colorSpaceToString, "/", colorRangeToString, "/", colorTransferToString);
                } else {
                    str2 = "NA/NA/NA";
                }
                m.append(str2 + "/" + ((i15 == -1 || i14 == -1) ? "NA/NA" : i15 + "/" + i14));
            }
        }
        if (f != -1.0f) {
            m.append(", fps=");
            m.append(f);
        }
        if (i5 != -1) {
            m.append(", maxSubLayers=");
            m.append(i5);
        }
        if (i4 != -1) {
            m.append(", channels=");
            m.append(i4);
        }
        if (i3 != -1) {
            m.append(", sample_rate=");
            m.append(i3);
        }
        if (str3 != null) {
            m.append(", language=");
            m.append(str3);
        }
        if (!immutableList.isEmpty()) {
            m.append(", labels=[");
            joiner.appendTo$1(m, Maps.transform(immutableList, new Format$$ExternalSyntheticLambda1(0)).iterator());
            m.append("]");
        }
        if (i2 != 0) {
            m.append(", selectionFlags=[");
            String str8 = Util.DEVICE_DEBUG_INFO;
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i2 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i2 & 2) != 0) {
                arrayList.add("forced");
            }
            joiner.appendTo$1(m, arrayList.iterator());
            m.append("]");
        }
        if (i11 != 0) {
            m.append(", roleFlags=[");
            String str9 = Util.DEVICE_DEBUG_INFO;
            ArrayList arrayList2 = new ArrayList();
            if ((i11 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i11 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i11 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i11 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i11 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i11 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i11 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i11;
            if ((i & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & PKIFailureInfo.certRevoked) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            joiner.appendTo$1(m, arrayList2.iterator());
            m.append("]");
        } else {
            i = i11;
        }
        if ((i & 32768) != 0) {
            m.append(", auxiliaryTrackType=");
            int i16 = format2.auxiliaryTrackType;
            String str10 = Util.DEVICE_DEBUG_INFO;
            if (i16 == 0) {
                str = "undefined";
            } else if (i16 == 1) {
                str = "original";
            } else if (i16 == 2) {
                str = "depth-linear";
            } else if (i16 == 3) {
                str = "depth-inverse";
            } else {
                if (i16 != 4) {
                    a$$ExternalSyntheticBUOutline0.m$1("Unsupported auxiliary track type");
                    return null;
                }
                str = "depth metadata";
            }
            m.append(str);
        }
        return m.toString();
    }

    public final Builder buildUpon() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.label = this.label;
        builder.labels = this.labels;
        builder.language = this.language;
        builder.selectionFlags = this.selectionFlags;
        builder.roleFlags = this.roleFlags;
        builder.averageBitrate = this.averageBitrate;
        builder.peakBitrate = this.peakBitrate;
        builder.codecs = this.codecs;
        builder.metadata = this.metadata;
        builder.primaryTrackGroupId = this.primaryTrackGroupId;
        builder.containerMimeType = this.containerMimeType;
        builder.sampleMimeType = this.sampleMimeType;
        builder.maxInputSize = this.maxInputSize;
        builder.maxNumReorderSamples = this.maxNumReorderSamples;
        builder.initializationData = this.initializationData;
        builder.drmInitData = this.drmInitData;
        builder.subsampleOffsetUs = this.subsampleOffsetUs;
        builder.hasPrerollSamples = this.hasPrerollSamples;
        builder.width = this.width;
        builder.height = this.height;
        builder.decodedWidth = this.decodedWidth;
        builder.decodedHeight = this.decodedHeight;
        builder.frameRate = this.frameRate;
        builder.rotationDegrees = this.rotationDegrees;
        builder.pixelWidthHeightRatio = this.pixelWidthHeightRatio;
        builder.projectionData = this.projectionData;
        builder.stereoMode = this.stereoMode;
        builder.colorInfo = this.colorInfo;
        builder.maxSubLayers = this.maxSubLayers;
        builder.channelCount = this.channelCount;
        builder.sampleRate = this.sampleRate;
        builder.pcmEncoding = this.pcmEncoding;
        builder.encoderDelay = this.encoderDelay;
        builder.encoderPadding = this.encoderPadding;
        builder.accessibilityChannel = this.accessibilityChannel;
        builder.cueReplacementBehavior = this.cueReplacementBehavior;
        builder.tileCountHorizontal = this.tileCountHorizontal;
        builder.tileCountVertical = this.tileCountVertical;
        builder.cryptoType = this.cryptoType;
        return builder;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format2 = (Format) obj;
        int i2 = this.hashCode;
        if ((i2 != 0 && (i = format2.hashCode) != 0 && i2 != i) || this.selectionFlags != format2.selectionFlags || this.roleFlags != format2.roleFlags || this.auxiliaryTrackType != format2.auxiliaryTrackType || this.averageBitrate != format2.averageBitrate || this.peakBitrate != format2.peakBitrate || this.maxInputSize != format2.maxInputSize || this.subsampleOffsetUs != format2.subsampleOffsetUs || this.width != format2.width || this.height != format2.height || this.decodedWidth != format2.decodedWidth || this.decodedHeight != format2.decodedHeight || this.rotationDegrees != format2.rotationDegrees || this.stereoMode != format2.stereoMode || this.maxSubLayers != format2.maxSubLayers || this.channelCount != format2.channelCount || this.sampleRate != format2.sampleRate || this.pcmEncoding != format2.pcmEncoding || this.encoderDelay != format2.encoderDelay || this.encoderPadding != format2.encoderPadding || this.accessibilityChannel != format2.accessibilityChannel || this.tileCountHorizontal != format2.tileCountHorizontal || this.tileCountVertical != format2.tileCountVertical || this.cryptoType != format2.cryptoType || Float.compare(this.frameRate, format2.frameRate) != 0 || Float.compare(this.pixelWidthHeightRatio, format2.pixelWidthHeightRatio) != 0 || !Objects.equals(this.id, format2.id) || !Objects.equals(this.label, format2.label)) {
            return false;
        }
        ImmutableList immutableList = format2.labels;
        ImmutableList immutableList2 = this.labels;
        immutableList2.getClass();
        return Maps.equalsImpl(immutableList, immutableList2) && Objects.equals(this.codecs, format2.codecs) && Objects.equals(this.primaryTrackGroupId, format2.primaryTrackGroupId) && Objects.equals(this.containerMimeType, format2.containerMimeType) && Objects.equals(this.sampleMimeType, format2.sampleMimeType) && Objects.equals(this.language, format2.language) && Arrays.equals(this.projectionData, format2.projectionData) && Objects.equals(this.metadata, format2.metadata) && Objects.equals(this.colorInfo, format2.colorInfo) && Objects.equals(this.drmInitData, format2.drmInitData) && initializationDataEquals(format2);
    }

    public final int hashCode() {
        if (this.hashCode == 0) {
            String str = this.id;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.label;
            int hashCode2 = (this.labels.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.language;
            int hashCode3 = (((((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.selectionFlags) * 31) + this.roleFlags) * 31) + this.auxiliaryTrackType) * 31) + this.averageBitrate) * 31) + this.peakBitrate) * 31;
            String str4 = this.codecs;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.metadata;
            int hashCode5 = (hashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 961;
            String str5 = this.primaryTrackGroupId;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.containerMimeType;
            int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.sampleMimeType;
            this.hashCode = ((((((((((((((((((((((Float.floatToIntBits(this.pixelWidthHeightRatio) + ((((Float.floatToIntBits(this.frameRate) + ((((((((((((((hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.maxInputSize) * 31) + ((int) this.subsampleOffsetUs)) * 31) + this.width) * 31) + this.height) * 31) + this.decodedWidth) * 31) + this.decodedHeight) * 31)) * 31) + this.rotationDegrees) * 31)) * 31) + this.stereoMode) * 31) + this.maxSubLayers) * 31) + this.channelCount) * 31) + this.sampleRate) * 31) + this.pcmEncoding) * 31) + this.encoderDelay) * 31) + this.encoderPadding) * 31) + this.accessibilityChannel) * 31) + this.tileCountHorizontal) * 31) + this.tileCountVertical) * 31) + this.cryptoType;
        }
        return this.hashCode;
    }

    public final boolean initializationDataEquals(Format format2) {
        List list = this.initializationData;
        if (list.size() != format2.initializationData.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) format2.initializationData.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.id);
        sb.append(", ");
        sb.append(this.label);
        sb.append(", ");
        sb.append(this.containerMimeType);
        sb.append(", ");
        sb.append(this.sampleMimeType);
        sb.append(", ");
        sb.append(this.codecs);
        sb.append(", ");
        sb.append(this.bitrate);
        sb.append(", ");
        sb.append(this.language);
        sb.append(", [");
        sb.append(this.width);
        sb.append(", ");
        sb.append(this.height);
        sb.append(", ");
        sb.append(this.frameRate);
        sb.append(", ");
        sb.append(this.colorInfo);
        sb.append("], [");
        sb.append(this.channelCount);
        sb.append(", ");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.sampleRate, "])", sb);
    }
}
