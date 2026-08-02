package androidx.media3.extractor.metadata.emsg;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.VorbisBitArray;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class EventMessageDecoder extends SimpleMetadataDecoder {
    public final /* synthetic */ int $r8$classId;

    @Override // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    public final Metadata decode(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        switch (this.$r8$classId) {
            case 0:
                ParsableByteArray parsableByteArray = new ParsableByteArray(byteBuffer.array(), byteBuffer.limit());
                String readNullTerminatedString = parsableByteArray.readNullTerminatedString();
                readNullTerminatedString.getClass();
                String readNullTerminatedString2 = parsableByteArray.readNullTerminatedString();
                readNullTerminatedString2.getClass();
                return new Metadata(new EventMessage(readNullTerminatedString, readNullTerminatedString2, parsableByteArray.readLong(), parsableByteArray.readLong(), Arrays.copyOfRange(parsableByteArray.data, parsableByteArray.position, parsableByteArray.limit)));
            default:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                VorbisBitArray vorbisBitArray = new VorbisBitArray(byteBuffer.array(), byteBuffer.limit());
                vorbisBitArray.skipBits(12);
                int bytePosition = (vorbisBitArray.getBytePosition() + vorbisBitArray.readBits(12)) - 4;
                vorbisBitArray.skipBits(44);
                vorbisBitArray.skipBytes(vorbisBitArray.readBits(12));
                vorbisBitArray.skipBits(16);
                ArrayList arrayList = new ArrayList();
                while (vorbisBitArray.getBytePosition() < bytePosition) {
                    vorbisBitArray.skipBits(48);
                    int readBits = vorbisBitArray.readBits(8);
                    vorbisBitArray.skipBits(4);
                    int bytePosition2 = vorbisBitArray.getBytePosition() + vorbisBitArray.readBits(12);
                    String str = null;
                    String str2 = null;
                    while (vorbisBitArray.getBytePosition() < bytePosition2) {
                        int readBits2 = vorbisBitArray.readBits(8);
                        int readBits3 = vorbisBitArray.readBits(8);
                        int bytePosition3 = vorbisBitArray.getBytePosition() + readBits3;
                        if (readBits2 == 2) {
                            int readBits4 = vorbisBitArray.readBits(16);
                            vorbisBitArray.skipBits(8);
                            if (readBits4 == 3) {
                                while (vorbisBitArray.getBytePosition() < bytePosition3) {
                                    int readBits5 = vorbisBitArray.readBits(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[readBits5];
                                    vorbisBitArray.readBytes(readBits5, bArr);
                                    String str3 = new String(bArr, charset);
                                    int readBits6 = vorbisBitArray.readBits(8);
                                    for (int i = 0; i < readBits6; i++) {
                                        vorbisBitArray.skipBytes(vorbisBitArray.readBits(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (readBits2 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[readBits3];
                            vorbisBitArray.readBytes(readBits3, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        vorbisBitArray.setPosition(bytePosition3 * 8);
                    }
                    vorbisBitArray.setPosition(bytePosition2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new AppInfoTable(readBits, str.concat(str2)));
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new Metadata(arrayList);
        }
    }
}
