package androidx.media3.exoplayer;

import android.text.TextUtils;
import androidx.media3.common.Format;
import androidx.tracing.Trace;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class DecoderReuseEvaluation {
    public final String decoderName;
    public final int discardReasons;
    public final Format newFormat;
    public final Format oldFormat;
    public final int result;

    public DecoderReuseEvaluation(String str, Format format2, Format format3, int i, int i2) {
        Trace.checkArgument(i == 0 || i2 == 0);
        Trace.checkArgument(true ^ TextUtils.isEmpty(str));
        this.decoderName = str;
        format2.getClass();
        this.oldFormat = format2;
        format3.getClass();
        this.newFormat = format3;
        this.result = i;
        this.discardReasons = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DecoderReuseEvaluation.class == obj.getClass()) {
            DecoderReuseEvaluation decoderReuseEvaluation = (DecoderReuseEvaluation) obj;
            if (this.result == decoderReuseEvaluation.result && this.discardReasons == decoderReuseEvaluation.discardReasons && this.decoderName.equals(decoderReuseEvaluation.decoderName) && this.oldFormat.equals(decoderReuseEvaluation.oldFormat) && this.newFormat.equals(decoderReuseEvaluation.newFormat)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.newFormat.hashCode() + ((this.oldFormat.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((((527 + this.result) * 31) + this.discardReasons) * 31, 31, this.decoderName)) * 31);
    }
}
