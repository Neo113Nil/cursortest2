package androidx.media3.extractor.flv;

import androidx.credentials.Credential;

/* loaded from: classes3.dex */
public final class AudioTagPayloadReader extends Credential {
    public static final int[] AUDIO_SAMPLING_RATE_TABLE = {5512, 11025, 22050, 44100};
    public int audioFormat;
    public boolean hasOutputFormat;
    public boolean hasParsedAudioDataHeader;
}
