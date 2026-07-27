package androidx.versionedparcelable;

import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class XenoGridAnnotationEncryptionUe6hRPmhdnT0AVPoem91174490703252 {
    public static final Pattern RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final String AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final String ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public XenoGridAnnotationEncryptionUe6hRPmhdnT0AVPoem91174490703252(String str, String str2) {
        String substring = (str2 == null || !str2.startsWith("/topics/")) ? str2 : str2.substring(8);
        if (substring == null || !RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.matcher(substring).matches()) {
            throw new IllegalArgumentException("Invalid topic name: " + substring + " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}.");
        }
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = substring;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = str;
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = str + "!" + str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof XenoGridAnnotationEncryptionUe6hRPmhdnT0AVPoem91174490703252)) {
            return false;
        }
        XenoGridAnnotationEncryptionUe6hRPmhdnT0AVPoem91174490703252 xenoGridAnnotationEncryptionUe6hRPmhdnT0AVPoem91174490703252 = (XenoGridAnnotationEncryptionUe6hRPmhdnT0AVPoem91174490703252) obj;
        return this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.equals(xenoGridAnnotationEncryptionUe6hRPmhdnT0AVPoem91174490703252.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) && this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.equals(xenoGridAnnotationEncryptionUe6hRPmhdnT0AVPoem91174490703252.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365, this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800});
    }
}
