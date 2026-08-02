package app.cash.trifle.signers;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public final class Buffer extends ByteArrayOutputStream {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Buffer(int i) {
        super(8193);
        this.$r8$classId = i;
        switch (i) {
            case 1:
                break;
        }
    }

    public byte[] getBuffer() {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        bArr.getClass();
        return bArr;
    }

    @Override // java.io.ByteArrayOutputStream
    public void reset() {
        switch (this.$r8$classId) {
            case 0:
                Arrays.fill(((ByteArrayOutputStream) this).buf, 0, ((ByteArrayOutputStream) this).count, (byte) 0);
                ((ByteArrayOutputStream) this).count = 0;
                break;
            default:
                super.reset();
                break;
        }
    }
}
