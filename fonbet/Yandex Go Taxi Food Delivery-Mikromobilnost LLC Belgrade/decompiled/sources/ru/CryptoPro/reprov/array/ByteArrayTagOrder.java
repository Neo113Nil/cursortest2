package ru.CryptoPro.reprov.array;

import java.util.Comparator;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;

/* loaded from: classes4.dex */
public class ByteArrayTagOrder implements Comparator {
    @Override // java.util.Comparator
    public final int compare(byte[] bArr, byte[] bArr2) {
        return (bArr[0] | BlobHeaderStructure.BLOB_VERSION) - (bArr2[0] | BlobHeaderStructure.BLOB_VERSION);
    }
}
