package androidx.media3.exoplayer;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;
import androidx.tracing.Trace;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.pnm.PnmImageParser;

/* loaded from: classes3.dex */
public final class ExoPlaybackException extends PlaybackException {
    public final boolean isRecoverable;
    public final MediaSource$MediaPeriodId mediaPeriodId;
    public final Format rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;

    /* renamed from: type, reason: collision with root package name */
    public final int f876type;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExoPlaybackException(int i, Exception exc, int i2, String str, int i3, Format format2, int i4, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, boolean z) {
        this(TextUtils.isEmpty(null) ? r1 : r1.concat(": null"), exc, i2, i, r5, r6, r7, i4, mediaSource$MediaPeriodId, SystemClock.elapsedRealtime(), z);
        String str2;
        int i5;
        Format format3;
        String str3;
        String str4;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            format3 = format2;
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
            str2 = str;
            i5 = i3;
            format3 = format2;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            format3 = format2;
            sb.append(format3);
            sb.append(", format_supported=");
            String str5 = Util.DEVICE_DEBUG_INFO;
            if (i4 == 0) {
                str4 = PnmImageParser.PARAM_VALUE_PNM_RAWBITS_NO;
            } else if (i4 == 1) {
                str4 = "NO_UNSUPPORTED_SUBTYPE";
            } else if (i4 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    Path$$ExternalSyntheticBUOutline0.m();
                    throw null;
                }
                str4 = PnmImageParser.PARAM_VALUE_PNM_RAWBITS_YES;
            }
            sb.append(str4);
            str3 = sb.toString();
        }
    }

    public final ExoPlaybackException copyWithMediaPeriodId(MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
        String message = getMessage();
        String str = Util.DEVICE_DEBUG_INFO;
        return new ExoPlaybackException(message, getCause(), this.errorCode, this.f876type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, mediaSource$MediaPeriodId, this.timestampMs, this.isRecoverable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExoPlaybackException(String str, Throwable th, int i, int i2, String str2, int i3, Format format2, int i4, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, long j, boolean z) {
        super(str, th, i, j);
        Bundle bundle = Bundle.EMPTY;
        Trace.checkArgument(!z || i2 == 1);
        Trace.checkArgument(th != null || i2 == 3);
        this.f876type = i2;
        this.rendererName = str2;
        this.rendererIndex = i3;
        this.rendererFormat = format2;
        this.rendererFormatSupport = i4;
        this.mediaPeriodId = mediaSource$MediaPeriodId;
        this.isRecoverable = z;
    }

    public ExoPlaybackException(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }
}
