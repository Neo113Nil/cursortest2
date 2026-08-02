package ru.CryptoPro.JCPRequest.cert;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.GeneralName_otherName;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.CertReader.ExtensionProcessor;
import ru.CryptoPro.JCP.tools.CertReader.SplitDirectName;

/* loaded from: classes4.dex */
public abstract class AltNameProcessor extends JCPRequestExtensionProcessor {
    public static final String[] c = {"Other Name", "RFC822 Name", "DNS Name", "X.400 Address", "Directory Name", "EDI Party Name", "Uniform Resource Identifier", "IP Address", "Registered ID"};

    public final Extension a(Collection collection) {
        Extension extension;
        Extension extension2;
        Vector vector = new Vector();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            int intValue = ((Integer) list.get(0)).intValue();
            String[] strArr = c;
            switch (intValue) {
                case 0:
                    Object obj = list.get(1);
                    Asn1Tag asn1Tag = new Asn1Tag();
                    Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer((byte[]) obj);
                    asn1BerDecodeBuffer.mark(8);
                    GeneralName_otherName generalName_otherName = new GeneralName_otherName();
                    try {
                        generalName_otherName.decode(asn1BerDecodeBuffer, false, asn1BerDecodeBuffer.decodeTagAndLength(asn1Tag));
                        extension = GeneralNamesProcessor.d(generalName_otherName);
                        continue;
                    } catch (Asn1Exception unused) {
                        extension = new Extension(strArr[0], new Extension(ExtensionProcessor.getErrorParamMessage()), 22);
                        break;
                    } catch (IOException unused2) {
                        extension = new Extension(strArr[0], new Extension(ExtensionProcessor.getErrorParamMessage()), 22);
                        break;
                    } catch (ClassCastException unused3) {
                        extension = new Extension(strArr[0], new Extension(ExtensionProcessor.getErrorParamMessage()), 22);
                        break;
                    }
                case 1:
                    extension2 = new Extension(strArr[1], new Extension(list.get(1).toString()), 22);
                    break;
                case 2:
                    extension2 = new Extension(strArr[2], new Extension(list.get(1).toString()), 22);
                    break;
                case 3:
                    extension2 = new Extension(strArr[3], new Extension(Array.toHexLowString((byte[]) list.get(1))), 22);
                    break;
                case 4:
                    extension2 = new Extension(strArr[4], SplitDirectName.getExtensionsOfNames(SplitDirectName.splitName(list.get(1).toString())), 22);
                    break;
                case 5:
                    extension2 = new Extension(strArr[5], new Extension(Array.toHexLowString((byte[]) list.get(1))), 22);
                    break;
                case 6:
                    extension2 = new Extension(strArr[6], new Extension(list.get(1).toString()), 22);
                    break;
                case 7:
                    extension2 = new Extension(strArr[7], new Extension(list.get(1).toString()), 22);
                    break;
                case 8:
                    extension2 = new Extension(strArr[8], new Extension(list.get(1).toString()), 22);
                    break;
                default:
                    extension = new Extension(JCPRequestExtensionProcessor.b.getString("AltNameProcessor.UnknownExtension"), new Extension(ExtensionProcessor.getErrorParamMessage()));
                    continue;
            }
            extension = extension2;
            vector.add(extension);
        }
        return new Extension(getName(), vector, 22);
    }
}
