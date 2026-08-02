package defpackage;

import java.util.Hashtable;
import ru.CryptoPro.XAdES.cl_63;
import ru.CryptoPro.reprov.array.ObjectIdentifier;

/* loaded from: classes4.dex */
public class wx61 {
    public static final ObjectIdentifier[] a = new ObjectIdentifier[18];
    public static final ObjectIdentifier b;
    public static final Hashtable c = null;
    public static final Hashtable d = null;

    static {
        int i = 1;
        while (true) {
            ObjectIdentifier[] objectIdentifierArr = a;
            if (i >= objectIdentifierArr.length - 2) {
                objectIdentifierArr[objectIdentifierArr.length - 2] = ObjectIdentifier.newInternal(new int[]{1, 2, 840, 113549, 1, 9, 16, 2, 12});
                objectIdentifierArr[objectIdentifierArr.length - 1] = ObjectIdentifier.newInternal(new int[]{1, 2, 840, 113549, 1, 9, 16, 2, 14});
                b = objectIdentifierArr[1];
                ObjectIdentifier objectIdentifier = objectIdentifierArr[2];
                ObjectIdentifier objectIdentifier2 = objectIdentifierArr[3];
                ObjectIdentifier objectIdentifier3 = objectIdentifierArr[4];
                ObjectIdentifier objectIdentifier4 = objectIdentifierArr[5];
                ObjectIdentifier objectIdentifier5 = objectIdentifierArr[6];
                ObjectIdentifier objectIdentifier6 = objectIdentifierArr[7];
                ObjectIdentifier objectIdentifier7 = objectIdentifierArr[8];
                ObjectIdentifier objectIdentifier8 = objectIdentifierArr[9];
                ObjectIdentifier objectIdentifier9 = objectIdentifierArr[10];
                ObjectIdentifier objectIdentifier10 = objectIdentifierArr[14];
                ObjectIdentifier objectIdentifier11 = objectIdentifierArr[15];
                ObjectIdentifier objectIdentifier12 = objectIdentifierArr[16];
                ObjectIdentifier objectIdentifier13 = objectIdentifierArr[17];
                Hashtable hashtable = new Hashtable(18);
                hashtable.put("emailaddress", objectIdentifierArr[1]);
                hashtable.put("unstructuredname", objectIdentifierArr[2]);
                hashtable.put("contenttype", objectIdentifierArr[3]);
                hashtable.put("messagedigest", objectIdentifierArr[4]);
                hashtable.put("signingtime", objectIdentifierArr[5]);
                hashtable.put("countersignature", objectIdentifierArr[6]);
                hashtable.put("challengepassword", objectIdentifierArr[7]);
                hashtable.put("unstructuredaddress", objectIdentifierArr[8]);
                hashtable.put("extendedcertificateattributes", objectIdentifierArr[9]);
                hashtable.put("issuerandserialnumber", objectIdentifierArr[10]);
                hashtable.put("rsaproprietary", objectIdentifierArr[11]);
                hashtable.put("rsaproprietary", objectIdentifierArr[12]);
                hashtable.put("signingdescription", objectIdentifierArr[13]);
                hashtable.put("extensionrequest", objectIdentifierArr[14]);
                hashtable.put("smimecapability", objectIdentifierArr[15]);
                hashtable.put("signingcertificate", objectIdentifierArr[16]);
                hashtable.put("signaturetimestamptoken", objectIdentifierArr[17]);
                Hashtable hashtable2 = new Hashtable(16);
                hashtable2.put(objectIdentifierArr[1], "EmailAddress");
                hashtable2.put(objectIdentifierArr[2], "UnstructuredName");
                hashtable2.put(objectIdentifierArr[3], "ContentType");
                hashtable2.put(objectIdentifierArr[4], "MessageDigest");
                hashtable2.put(objectIdentifierArr[5], cl_63.i);
                hashtable2.put(objectIdentifierArr[6], "Countersignature");
                hashtable2.put(objectIdentifierArr[7], "ChallengePassword");
                hashtable2.put(objectIdentifierArr[8], "UnstructuredAddress");
                hashtable2.put(objectIdentifierArr[9], "ExtendedCertificateAttributes");
                hashtable2.put(objectIdentifierArr[10], "IssuerAndSerialNumber");
                hashtable2.put(objectIdentifierArr[11], "RSAProprietary");
                hashtable2.put(objectIdentifierArr[12], "RSAProprietary");
                hashtable2.put(objectIdentifierArr[13], "SMIMESigningDesc");
                hashtable2.put(objectIdentifierArr[14], "ExtensionRequest");
                hashtable2.put(objectIdentifierArr[15], "SMIMECapability");
                hashtable2.put(objectIdentifierArr[16], cl_63.j);
                hashtable2.put(objectIdentifierArr[17], "SignatureTimestampToken");
                return;
            }
            objectIdentifierArr[i] = ObjectIdentifier.newInternal(new int[]{1, 2, 840, 113549, 1, 9, i});
            i++;
        }
    }
}
