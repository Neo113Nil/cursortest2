package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.xml.security.utils.Base64;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.XAdES.SigAndRefsTimeStamp;
import ru.CryptoPro.XAdES.SignatureTimeStamp;
import ru.CryptoPro.XAdES.SignatureTimeStampImpl;
import ru.CryptoPro.XAdES.XAdESParameters;
import ru.CryptoPro.XAdES.cl_63;
import ru.CryptoPro.XAdES.exception.XAdESException;

/* loaded from: classes4.dex */
public abstract class uu61 extends xw61 {
    /* JADX WARN: Multi-variable type inference failed */
    public uu61(Document document, mw61 mw61Var, SigAndRefsTimeStamp sigAndRefsTimeStamp, int i, List list, dr61 dr61Var, cs61 cs61Var, String str, Element element, String str2) {
        super(document, mw61Var, cl_63.P, XAdESParameters.XADES141_SIGNATURE_PREFIX, XAdESParameters.XADES141_SIGNATURE_NAMESPACE, str2);
        if (str != null) {
            a(null, "Id", qv10.h(i, str, "-SigAndRefsTimestamp-"));
        }
        if (list.isEmpty()) {
            throw new XAdESException("Invalid signature-timestamp count", IAdESException.ecTimestampNotFound);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(element);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((Element) it.next());
        }
        arrayList.add(((xw61) dr61Var).e());
        arrayList.add(((xw61) cs61Var).e());
        Iterator it2 = arrayList.iterator();
        boolean z = true;
        while (it2.hasNext()) {
            String attribute = ((Element) it2.next()).getAttribute("Id");
            z &= (attribute == null || attribute.trim().isEmpty()) ? false : true;
        }
        if (z) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                SignatureTimeStampImpl.addHashDataInfoElement(this, (Element) it3.next(), null);
            }
        }
        sigAndRefsTimeStamp.setSignatureTimestampsDetailsElements(list);
        sigAndRefsTimeStamp.setCompleteCertificateReferences(dr61Var);
        sigAndRefsTimeStamp.setCompleteRevocationReferences(cs61Var);
        sigAndRefsTimeStamp.generateEncapsulatedTimeStamp(this.a, str);
        try {
            Element c = c("http://www.w3.org/2000/09/xmldsig#", str2, "CanonicalizationMethod");
            c.setAttributeNS(null, "Algorithm", SignatureTimeStamp.DEFAULT_CANONICALIZATION_ALGORITHM);
            getNode().appendChild(c);
            String encode = Base64.encode(sigAndRefsTimeStamp.getTimestampToken().a.b.getEncoded("DL"));
            Element c2 = c(XAdESParameters.XADES_SIGNATURE_NAMESPACE, XAdESParameters.XADES_SIGNATURE_PREFIX, "EncapsulatedTimeStamp");
            c2.appendChild(this.a.createTextNode(encode));
            getNode().appendChild(c2);
        } catch (IOException e) {
            throw new XAdESException(e, IAdESException.ecNodeEncodingFailed);
        }
    }
}
