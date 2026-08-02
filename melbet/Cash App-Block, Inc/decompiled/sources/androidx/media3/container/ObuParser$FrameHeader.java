package androidx.media3.container;

import androidx.media3.extractor.VorbisBitArray;
import androidx.tracing.Trace;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class ObuParser$FrameHeader {
    public final boolean isDependedOn;

    public ObuParser$FrameHeader(ObuParser$SequenceHeader obuParser$SequenceHeader, ObuParser$Obu obuParser$Obu) {
        int i = obuParser$Obu.f873type;
        ByteBuffer byteBuffer = obuParser$Obu.payload;
        Trace.checkArgument(i == 6 || i == 3);
        int min = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[min];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        VorbisBitArray vorbisBitArray = new VorbisBitArray(bArr, min);
        if (obuParser$SequenceHeader.reducedStillPictureHeader) {
            throw new ObuParser$NotYetImplementedException();
        }
        if (vorbisBitArray.readBit()) {
            this.isDependedOn = false;
            return;
        }
        int readBits = vorbisBitArray.readBits(2);
        boolean readBit = vorbisBitArray.readBit();
        if (obuParser$SequenceHeader.decoderModelInfoPresentFlag) {
            throw new ObuParser$NotYetImplementedException();
        }
        if (!readBit) {
            this.isDependedOn = true;
            return;
        }
        boolean readBit2 = (readBits == 3 || readBits == 0) ? true : vorbisBitArray.readBit();
        vorbisBitArray.skipBit();
        if (!obuParser$SequenceHeader.seqForceScreenContentTools) {
            throw new ObuParser$NotYetImplementedException();
        }
        if (vorbisBitArray.readBit()) {
            if (!obuParser$SequenceHeader.seqForceIntegerMv) {
                throw new ObuParser$NotYetImplementedException();
            }
            vorbisBitArray.skipBit();
        }
        if (obuParser$SequenceHeader.frameIdNumbersPresentFlag) {
            throw new ObuParser$NotYetImplementedException();
        }
        if (readBits != 3) {
            vorbisBitArray.skipBit();
        }
        vorbisBitArray.skipBits(obuParser$SequenceHeader.orderHintBits);
        if (readBits != 2 && readBits != 0 && !readBit2) {
            vorbisBitArray.skipBits(3);
        }
        this.isDependedOn = ((readBits == 3 || readBits == 0) ? 255 : vorbisBitArray.readBits(8)) != 0;
    }
}
