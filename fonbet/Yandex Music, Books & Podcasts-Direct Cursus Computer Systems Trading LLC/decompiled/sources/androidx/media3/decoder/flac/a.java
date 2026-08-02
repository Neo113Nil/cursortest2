package androidx.media3.decoder.flac;

import defpackage.au1;
import defpackage.q03;
import defpackage.r03;
import defpackage.rgc;
import defpackage.s2c;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a implements r03 {
    public final FlacDecoderJni a;
    public final au1 b;

    public a(FlacDecoderJni flacDecoderJni, au1 au1Var) {
        this.a = flacDecoderJni;
        this.b = au1Var;
    }

    @Override // defpackage.r03
    public final q03 b(s2c s2cVar, long j) {
        q03 q03Var = q03.d;
        au1 au1Var = this.b;
        ByteBuffer byteBuffer = (ByteBuffer) au1Var.c;
        long position = s2cVar.getPosition();
        FlacDecoderJni flacDecoderJni = this.a;
        flacDecoderJni.reset(position);
        try {
            flacDecoderJni.decodeSampleWithBacktrackPosition(byteBuffer, position);
            if (byteBuffer.limit() == 0) {
                return q03Var;
            }
            long lastFrameFirstSampleIndex = flacDecoderJni.getLastFrameFirstSampleIndex();
            long nextFrameFirstSampleIndex = flacDecoderJni.getNextFrameFirstSampleIndex();
            long decodePosition = flacDecoderJni.getDecodePosition();
            if (lastFrameFirstSampleIndex > j || nextFrameFirstSampleIndex <= j) {
                return nextFrameFirstSampleIndex <= j ? new q03(-2, nextFrameFirstSampleIndex, decodePosition) : new q03(-1, lastFrameFirstSampleIndex, position);
            }
            au1Var.b = flacDecoderJni.getLastFrameTimestamp();
            return q03.b(s2cVar.getPosition());
        } catch (rgc unused) {
            return q03Var;
        }
    }
}
