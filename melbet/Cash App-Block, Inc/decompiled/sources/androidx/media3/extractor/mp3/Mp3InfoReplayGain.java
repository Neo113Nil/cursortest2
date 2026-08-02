package androidx.media3.extractor.mp3;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.common.Metadata;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class Mp3InfoReplayGain implements Metadata.Entry {
    public final GainField field1;
    public final GainField field2;
    public final float peak;

    public final class GainField {
        public final float gain;
        public final int name;
        public final int originator;

        public GainField(float f, int i, int i2) {
            this.name = i;
            this.originator = i2;
            this.gain = f;
        }

        public static GainField access$000(int i) {
            int i2 = (i >> 13) & 7;
            if (i2 == 0) {
                return null;
            }
            return new GainField(((i & 511) * ((i & 512) != 0 ? -1 : 1)) / 10.0f, i2, (i >> 10) & 7);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GainField)) {
                return false;
            }
            GainField gainField = (GainField) obj;
            return this.name == gainField.name && this.originator == gainField.originator && Float.compare(this.gain, gainField.gain) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.gain) + (((this.name * 31) + this.originator) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GainField{name=");
            sb.append(this.name);
            sb.append(", originator=");
            sb.append(this.originator);
            sb.append(", gain=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.gain, '}');
        }
    }

    public Mp3InfoReplayGain(float f, GainField gainField, GainField gainField2) {
        this.peak = f;
        this.field1 = gainField;
        this.field2 = gainField2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Mp3InfoReplayGain)) {
            return false;
        }
        Mp3InfoReplayGain mp3InfoReplayGain = (Mp3InfoReplayGain) obj;
        return Float.compare(this.peak, mp3InfoReplayGain.peak) == 0 && Objects.equals(this.field1, mp3InfoReplayGain.field1) && Objects.equals(this.field2, mp3InfoReplayGain.field2);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.peak) * 31;
        GainField gainField = this.field1;
        int hashCode2 = (hashCode + (gainField != null ? gainField.hashCode() : 0)) * 31;
        GainField gainField2 = this.field2;
        return hashCode2 + (gainField2 != null ? gainField2.hashCode() : 0);
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.peak + ", field 1=" + this.field1 + ", field 2=" + this.field2;
    }
}
