package defpackage;

import java.util.ArrayList;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import ru.CryptoPro.XAdES.XAdESParameters;
import ru.CryptoPro.XAdES.XAdESType;
import ru.CryptoPro.XAdES.cl_63;

/* loaded from: classes4.dex */
public final class qu61 extends xw61 {
    public Document A;
    public final String x;
    public mv61 y;
    public lv61 z;

    public qu61(Element element, String str) {
        super(element, XAdESParameters.XADES_SIGNATURE_PREFIX, XAdESParameters.XADES_SIGNATURE_NAMESPACE, XAdESParameters.XML_SIGNATURE_PREFIX);
        this.A = element.getOwnerDocument();
        this.x = str;
        Element b = XAdESType.b(this);
        if (b != null) {
            mv61 mv61Var = new mv61(b, XAdESParameters.XADES_SIGNATURE_PREFIX, XAdESParameters.XADES_SIGNATURE_NAMESPACE, XAdESParameters.XML_SIGNATURE_PREFIX);
            mv61Var.z = b.getOwnerDocument();
            this.y = mv61Var;
        }
        Element d = XAdESType.d(this);
        if (d != null) {
            lv61 lv61Var = new lv61(d, XAdESParameters.XADES_SIGNATURE_PREFIX, XAdESParameters.XADES_SIGNATURE_NAMESPACE, XAdESParameters.XML_SIGNATURE_PREFIX);
            lv61Var.x = d.getOwnerDocument();
            Element d2 = XAdESType.d(this);
            if (d2 != null) {
                mw61 mw61Var = new mw61(d2, XAdESParameters.XADES_SIGNATURE_PREFIX, XAdESParameters.XADES_SIGNATURE_NAMESPACE, XAdESParameters.XML_SIGNATURE_PREFIX);
                mw61Var.x = new ArrayList();
                mw61Var.C = d2.getOwnerDocument();
                lv61Var.y = mw61Var;
            }
            this.z = lv61Var;
        }
    }

    public final mv61 h() {
        qu61 qu61Var;
        if (this.y == null) {
            Document document = this.A;
            String str = this.x;
            qu61Var = this;
            mv61 mv61Var = new mv61(document, qu61Var, cl_63.g, this.b, this.c, this.w);
            mv61Var.z = document;
            mv61Var.a(null, "Id", str + "-SignedProperties");
            qu61Var.y = mv61Var;
        } else {
            qu61Var = this;
        }
        return qu61Var.y;
    }
}
