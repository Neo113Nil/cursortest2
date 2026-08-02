package androidx.media3.exoplayer.audio;

import androidx.media3.common.Format;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class AudioSink$WriteException extends Exception {
    public final int errorCode;

    /* renamed from: format, reason: collision with root package name */
    public final Format f883format;
    public final boolean isRecoverable;

    public AudioSink$WriteException(int i, Format format2, boolean z) {
        super(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "AudioTrack write failed: "));
        this.isRecoverable = z;
        this.errorCode = i;
        this.f883format = format2;
    }
}
