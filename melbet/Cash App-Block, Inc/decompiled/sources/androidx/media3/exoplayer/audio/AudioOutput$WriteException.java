package androidx.media3.exoplayer.audio;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class AudioOutput$WriteException extends Exception {
    public final int errorCode;
    public final boolean isRecoverable;

    public AudioOutput$WriteException(int i, boolean z) {
        super(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "AudioOutput write failed: "));
        this.isRecoverable = z;
        this.errorCode = i;
    }
}
