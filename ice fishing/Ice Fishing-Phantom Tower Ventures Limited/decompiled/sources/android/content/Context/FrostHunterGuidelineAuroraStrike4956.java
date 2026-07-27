package android.content.Context;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public class FrostHunterGuidelineAuroraStrike4956 extends InputStream implements DataInput {
    public ByteOrder FrostHunterAlertDialogAuroraDelta3200;
    public final DataInputStream FrostHunterCameraXPixelTurboCosmos9814;
    public int FrostHunterFlowMaxDragonHero5809;
    public final int FrostHunterFragmentBetaMegaVortex6025;
    public byte[] FrostHunterKeyframeGammaGamma1197;

    public FrostHunterGuidelineAuroraStrike4956(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.FrostHunterCameraXPixelTurboCosmos9814 = dataInputStream;
        dataInputStream.mark(0);
        this.FrostHunterFlowMaxDragonHero5809 = 0;
        this.FrostHunterAlertDialogAuroraDelta3200 = byteOrder;
        this.FrostHunterFragmentBetaMegaVortex6025 = inputStream instanceof FrostHunterGuidelineAuroraStrike4956 ? ((FrostHunterGuidelineAuroraStrike4956) inputStream).FrostHunterFragmentBetaMegaVortex6025 : -1;
    }

    public final void FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            DataInputStream dataInputStream = this.FrostHunterCameraXPixelTurboCosmos9814;
            int skip = (int) dataInputStream.skip(i3);
            if (skip <= 0) {
                if (this.FrostHunterKeyframeGammaGamma1197 == null) {
                    this.FrostHunterKeyframeGammaGamma1197 = new byte[8192];
                }
                skip = dataInputStream.read(this.FrostHunterKeyframeGammaGamma1197, 0, Math.min(8192, i3));
                if (skip == -1) {
                    throw new EOFException(FrostHunterKeyEventNovaXAlpha1220.FrostHunterFlowMaxDragonHero5809("Reached EOF while skipping ", i, " bytes."));
                }
            }
            i2 += skip;
        }
        this.FrostHunterFlowMaxDragonHero5809 += i2;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.FrostHunterCameraXPixelTurboCosmos9814.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.FrostHunterFlowMaxDragonHero5809++;
        return this.FrostHunterCameraXPixelTurboCosmos9814.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.FrostHunterFlowMaxDragonHero5809++;
        return this.FrostHunterCameraXPixelTurboCosmos9814.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.FrostHunterFlowMaxDragonHero5809++;
        int read = this.FrostHunterCameraXPixelTurboCosmos9814.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.FrostHunterFlowMaxDragonHero5809 += 2;
        return this.FrostHunterCameraXPixelTurboCosmos9814.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.FrostHunterFlowMaxDragonHero5809 += bArr.length;
        this.FrostHunterCameraXPixelTurboCosmos9814.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.FrostHunterFlowMaxDragonHero5809 += 4;
        DataInputStream dataInputStream = this.FrostHunterCameraXPixelTurboCosmos9814;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.FrostHunterAlertDialogAuroraDelta3200;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterServiceConnectionTurboPhoenixOmega6719(this.FrostHunterAlertDialogAuroraDelta3200, "Invalid byte order: ");
        return 0;
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.FrostHunterFlowMaxDragonHero5809 += 8;
        DataInputStream dataInputStream = this.FrostHunterCameraXPixelTurboCosmos9814;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.FrostHunterAlertDialogAuroraDelta3200;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
        }
        FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterServiceConnectionTurboPhoenixOmega6719(this.FrostHunterAlertDialogAuroraDelta3200, "Invalid byte order: ");
        return 0L;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.FrostHunterFlowMaxDragonHero5809 += 2;
        DataInputStream dataInputStream = this.FrostHunterCameraXPixelTurboCosmos9814;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.FrostHunterAlertDialogAuroraDelta3200;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((read << 8) + read2);
        }
        FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterServiceConnectionTurboPhoenixOmega6719(this.FrostHunterAlertDialogAuroraDelta3200, "Invalid byte order: ");
        return (short) 0;
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.FrostHunterFlowMaxDragonHero5809 += 2;
        return this.FrostHunterCameraXPixelTurboCosmos9814.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.FrostHunterFlowMaxDragonHero5809++;
        return this.FrostHunterCameraXPixelTurboCosmos9814.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.FrostHunterFlowMaxDragonHero5809 += 2;
        DataInputStream dataInputStream = this.FrostHunterCameraXPixelTurboCosmos9814;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.FrostHunterAlertDialogAuroraDelta3200;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterServiceConnectionTurboPhoenixOmega6719(this.FrostHunterAlertDialogAuroraDelta3200, "Invalid byte order: ");
        return 0;
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        this.FrostHunterFlowMaxDragonHero5809 += i2;
        this.FrostHunterCameraXPixelTurboCosmos9814.readFully(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.FrostHunterCameraXPixelTurboCosmos9814.read(bArr, i, i2);
        this.FrostHunterFlowMaxDragonHero5809 += read;
        return read;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrostHunterGuidelineAuroraStrike4956(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FrostHunterGuidelineAuroraStrike4956(byte[] bArr) {
        this(r0, 0);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.FrostHunterFragmentBetaMegaVortex6025 = bArr.length;
    }
}
