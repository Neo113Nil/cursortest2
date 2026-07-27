package androidx.versionedparcelable;

import java.io.OutputStream;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class YellowLoopRegistryCompressionPCzomp0XGxi2DJUl9679644847452665 extends OutputStream {
    public long RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 += i2;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867++;
    }
}
