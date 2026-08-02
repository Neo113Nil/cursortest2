package defpackage;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import ru.CryptoPro.XAdES.XAdESParameters;

/* loaded from: classes4.dex */
public final class rr61 extends lr61 {
    public rr61(Node node, String str) {
        super(node, XAdESParameters.XADES141_SIGNATURE_PREFIX, XAdESParameters.XADES141_SIGNATURE_NAMESPACE, str);
    }

    @Override // defpackage.lr61, defpackage.dr61
    public final ft61 a() {
        if (this.x == null) {
            Element f = f("CertRefs");
            if (f != null) {
                this.x = new ft61(f, this.b, this.c, this.w, 2);
            } else {
                Element b = b("CertRefs", XAdESParameters.XADES_SIGNATURE_NAMESPACE);
                if (b != null) {
                    this.x = new ft61(b, XAdESParameters.XADES_SIGNATURE_PREFIX, XAdESParameters.XADES_SIGNATURE_NAMESPACE, this.w, 2);
                }
            }
        }
        return this.x;
    }
}
