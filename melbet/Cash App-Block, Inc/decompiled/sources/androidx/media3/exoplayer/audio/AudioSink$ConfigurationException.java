package androidx.media3.exoplayer.audio;

import androidx.media3.common.Format;

/* loaded from: classes3.dex */
public final class AudioSink$ConfigurationException extends Exception {

    /* renamed from: format, reason: collision with root package name */
    public final Format f882format;

    public AudioSink$ConfigurationException(Exception exc, Format format2) {
        super(exc);
        this.f882format = format2;
    }

    public AudioSink$ConfigurationException(String str, Format format2) {
        super(str);
        this.f882format = format2;
    }
}
