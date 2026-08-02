package androidx.media3.extractor.metadata.emsg;

import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class EventMessage implements Metadata.Entry {
    public static final Format ID3_FORMAT;
    public static final Format SCTE35_FORMAT;
    public final long durationMs;
    public int hashCode;
    public final long id;
    public final byte[] messageData;
    public final String schemeIdUri;
    public final String value;

    static {
        Format.Builder builder = new Format.Builder();
        builder.sampleMimeType = MimeTypes.normalizeMimeType("application/id3");
        ID3_FORMAT = new Format(builder);
        Format.Builder builder2 = new Format.Builder();
        builder2.sampleMimeType = MimeTypes.normalizeMimeType("application/x-scte35");
        SCTE35_FORMAT = new Format(builder2);
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.schemeIdUri = str;
        this.value = str2;
        this.durationMs = j;
        this.id = j2;
        this.messageData = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.durationMs == eventMessage.durationMs && this.id == eventMessage.id && this.schemeIdUri.equals(eventMessage.schemeIdUri) && this.value.equals(eventMessage.value) && Arrays.equals(this.messageData, eventMessage.messageData);
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.messageData;
        }
        return null;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final Format getWrappedMetadataFormat() {
        switch (this.schemeIdUri) {
            case "urn:scte:scte35:2014:bin":
                return SCTE35_FORMAT;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return ID3_FORMAT;
            default:
                return null;
        }
    }

    public final int hashCode() {
        if (this.hashCode == 0) {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(527, 31, this.schemeIdUri), 31, this.value);
            long j = this.durationMs;
            int i = (m + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.id;
            this.hashCode = Arrays.hashCode(this.messageData) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.hashCode;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.schemeIdUri + ", id=" + this.id + ", durationMs=" + this.durationMs + ", value=" + this.value;
    }
}
