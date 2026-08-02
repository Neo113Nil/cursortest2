package androidx.camera.video.internal.audio;

import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class AutoValue_AudioSettings {
    public static final List COMMON_SAMPLE_RATES = Collections.unmodifiableList(Arrays.asList(192000, 48000, 44100, 24000, 22050, 16000, 12000, 11025, 8000, 4800));
    public final int audioFormat;
    public final int audioSource;
    public final int captureSampleRate;
    public final int channelCount;
    public final int encodeSampleRate;

    public AutoValue_AudioSettings(int i, int i2, int i3, int i4, int i5) {
        this.audioSource = i;
        this.captureSampleRate = i2;
        this.encodeSampleRate = i3;
        this.channelCount = i4;
        this.audioFormat = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_AudioSettings) {
            AutoValue_AudioSettings autoValue_AudioSettings = (AutoValue_AudioSettings) obj;
            if (this.audioSource == autoValue_AudioSettings.audioSource && this.captureSampleRate == autoValue_AudioSettings.captureSampleRate && this.encodeSampleRate == autoValue_AudioSettings.encodeSampleRate && this.channelCount == autoValue_AudioSettings.channelCount && this.audioFormat == autoValue_AudioSettings.audioFormat) {
                return true;
            }
        }
        return false;
    }

    public final int getBytesPerFrame() {
        int i = this.channelCount;
        TransactorKt.checkArgument("Invalid channel count: " + i, i > 0);
        int i2 = this.audioFormat;
        if (i2 == 2) {
            return i * 2;
        }
        if (i2 == 3) {
            return i;
        }
        if (i2 != 4) {
            if (i2 == 21) {
                return i * 3;
            }
            if (i2 != 22) {
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "Invalid audio encoding: "));
                return 0;
            }
        }
        return i * 4;
    }

    public final int hashCode() {
        return this.audioFormat ^ ((((((((this.audioSource ^ 1000003) * 1000003) ^ this.captureSampleRate) * 1000003) ^ this.encodeSampleRate) * 1000003) ^ this.channelCount) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSettings{audioSource=");
        sb.append(this.audioSource);
        sb.append(", captureSampleRate=");
        sb.append(this.captureSampleRate);
        sb.append(", encodeSampleRate=");
        sb.append(this.encodeSampleRate);
        sb.append(", channelCount=");
        sb.append(this.channelCount);
        sb.append(", audioFormat=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.audioFormat, "}", sb);
    }
}
