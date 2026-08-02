package androidx.media3.muxer;

import androidx.media3.container.MdtaMetadataEntry;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.DERTaggedObject;

/* loaded from: classes3.dex */
public abstract class MuxerUtil {
    public static MdtaMetadataEntry getAuxiliaryTracksOffsetMetadata(long j) {
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) (255 & j);
            j >>= 8;
        }
        return new MdtaMetadataEntry("auxiliary.tracks.offset", bArr, 0, 78);
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewAfterpayOrderDocument.deepLinkSpecs;
    }

    public static DERTaggedObject taggedIntegerValue(int i, int i2) {
        return new DERTaggedObject(true, i, (ASN1Encodable) new ASN1Integer(i2));
    }

    public static DERTaggedObject taggedIntegerVector(int i, int... iArr) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        for (int i2 : iArr) {
            aSN1EncodableVector.add(new ASN1Integer(i2));
        }
        return new DERTaggedObject(true, i, (ASN1Encodable) new DERSet(aSN1EncodableVector));
    }
}
