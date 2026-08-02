package defpackage;

import java.text.ParseException;
import java.util.Date;
import java.util.TreeMap;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.AdES.external.decode.AdESBESAttributeDecoder;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.XAdES.XAdESParameters;
import ru.CryptoPro.XAdES.XAdESType;
import ru.CryptoPro.XAdES.cl_63;
import ru.CryptoPro.XAdES.cl_64;
import ru.CryptoPro.XAdES.exception.XAdESException;
import ru.CryptoPro.XAdES.util.SystemUtils;

/* loaded from: classes4.dex */
public class tr61 extends jt61 implements AdESBESAttributeDecoder {
    public final TreeMap y;
    public cr80 z;

    public tr61(Element element) {
        super(element);
        this.y = new TreeMap();
        this.z = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [zv61] */
    /* JADX WARN: Type inference failed for: r7v4, types: [xw61] */
    /* JADX WARN: Type inference failed for: r7v6, types: [sv61, xw61] */
    @Override // defpackage.jt61, ru.CryptoPro.AdES.external.decode.AdESAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESBESAttributeDecoder, ru.CryptoPro.AdES.external.decode.AdESTAttributeDecoder
    public void decode() {
        fw61 fw61Var;
        bw61 fw61Var2;
        JCPLogger.subEnter();
        JCPLogger.fine("Decoding as XAdES-BES structure...");
        super.decode();
        JCPLogger.subEnter();
        qu61 a = XAdESType.a(this.x);
        TreeMap treeMap = this.y;
        if (a != null) {
            try {
                Element e = a.e();
                for (cl_64 cl_64Var : cl_64.values()) {
                    NodeList elementsByTagNameNS = e.getElementsByTagNameNS(XAdESParameters.XADES_SIGNATURE_NAMESPACE, cl_64Var.b());
                    if (elementsByTagNameNS != null && elementsByTagNameNS.getLength() > 0) {
                        cl_64 cl_64Var2 = cl_64.d;
                        if (cl_64Var2.equals(cl_64Var)) {
                            Node item = elementsByTagNameNS.item(0);
                            ?? sv61Var = new sv61(item, XAdESParameters.XADES_SIGNATURE_PREFIX, XAdESParameters.XADES_SIGNATURE_NAMESPACE, XAdESParameters.XML_SIGNATURE_PREFIX);
                            sv61Var.x = item.getOwnerDocument();
                            fw61Var = sv61Var;
                        } else {
                            cl_64Var2 = cl_64.e;
                            if (cl_64Var2.equals(cl_64Var)) {
                                fw61Var = new iw61(elementsByTagNameNS.item(0), XAdESParameters.XADES_SIGNATURE_PREFIX, XAdESParameters.XADES_SIGNATURE_NAMESPACE, XAdESParameters.XML_SIGNATURE_PREFIX);
                            } else {
                                cl_64Var2 = cl_64.f;
                                if (cl_64Var2.equals(cl_64Var)) {
                                    fw61Var = new zv61(elementsByTagNameNS.item(0), XAdESParameters.XADES_SIGNATURE_PREFIX, XAdESParameters.XADES_SIGNATURE_NAMESPACE, XAdESParameters.XML_SIGNATURE_PREFIX);
                                } else {
                                    cl_64Var2 = cl_64.g;
                                    if (cl_64Var2.equals(cl_64Var)) {
                                        fw61Var = new fw61(elementsByTagNameNS.item(0), XAdESParameters.XADES_SIGNATURE_PREFIX, XAdESParameters.XADES_SIGNATURE_NAMESPACE, XAdESParameters.XML_SIGNATURE_PREFIX);
                                    }
                                }
                            }
                        }
                        treeMap.put(cl_64Var2, fw61Var);
                    }
                }
            } catch (Exception e2) {
                throw new XAdESException(e2, IAdESException.ecSignatureMarshallingFailed);
            }
        }
        JCPLogger.subExit();
        h();
        JCPLogger.subEnter();
        sv61 sv61Var2 = (sv61) treeMap.get(cl_64.d);
        if (sv61Var2 == null) {
            throw new XAdESException("SignedSignatureProperties in node not found", IAdESException.ecNodeNotFound);
        }
        Element f = sv61Var2.f(cl_63.j);
        if (f != null) {
            fw61Var2 = new zv61(f, sv61Var2.b, sv61Var2.c, sv61Var2.w);
        } else {
            Element f2 = sv61Var2.f(cl_63.k);
            fw61Var2 = f2 != null ? new fw61(f2, sv61Var2.b, sv61Var2.c, sv61Var2.w) : null;
        }
        if (fw61Var2 == null) {
            throw new XAdESException("SigningCertificate in node not found", IAdESException.ecNodeNotFound);
        }
        this.z = fw61Var2.a();
        JCPLogger.subExit();
        JCPLogger.subExit();
    }

    @Override // defpackage.jt61
    /* renamed from: e */
    public final cr80 getSignerCertificateReference() {
        return this.z;
    }

    @Override // defpackage.jt61, ru.CryptoPro.AdES.external.decode.AdESAttributeDecoder
    public final cr80 getSignerCertificateReference() {
        return this.z;
    }

    @Override // ru.CryptoPro.AdES.external.decode.AdESBESAttributeDecoder
    public final Date getSigningTime() {
        iw61 iw61Var = (iw61) this.y.get(cl_64.e);
        if (iw61Var != null) {
            try {
                String textContent = iw61Var.e().getTextContent();
                if (textContent != null) {
                    return SystemUtils.parseDate(textContent);
                }
            } catch (ParseException e) {
                JCPLogger.thrown(e);
            }
        }
        return null;
    }

    public void h() {
    }
}
