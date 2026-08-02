package defpackage;

import javax.xml.crypto.dom.DOMStructure;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import ru.CryptoPro.XAdES.XAdESParameters;
import ru.CryptoPro.XAdES.util.XMLUtils;

/* loaded from: classes4.dex */
public class xw61 extends DOMStructure implements XAdESParameters {
    public final Document a;
    public final String b;
    public final String c;
    public final String w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xw61(Document document, xw61 xw61Var, String str, String str2, String str3, String str4) {
        this(document.createElementNS(str3, str), str2, str3, str4);
        Element e = xw61Var.e();
        this.a = document;
        this.b = str2;
        this.c = str3;
        this.w = str4;
        Element e2 = e();
        e2.setPrefix(str2);
        e.appendChild(e2);
    }

    public final void a(String str, String str2, String str3) {
        e().setAttributeNS(str, str2, str3);
        if ("Id".equals(str2)) {
            e().setIdAttributeNS(null, "Id", true);
        }
    }

    public final Element b(String str, String str2) {
        return XMLUtils.getChildElementByTagNameNS(e(), str, str2);
    }

    public final Element c(String str, String str2, String str3) {
        Element createElementNS = this.a.createElementNS(str, str3);
        createElementNS.setPrefix(str2);
        return createElementNS;
    }

    public final String d(String str) {
        return e().getAttribute(str);
    }

    public final Element e() {
        return (Element) getNode();
    }

    public final Element f(String str) {
        return XMLUtils.getChildElementByTagNameNS(e(), str, this.c);
    }

    public final Element g(String str) {
        Element createElementNS = this.a.createElementNS(this.c, str);
        createElementNS.setPrefix(this.b);
        return createElementNS;
    }

    public xw61(Node node, String str, String str2, String str3) {
        super(node);
        this.a = node.getOwnerDocument();
        this.b = str;
        this.c = str2;
        this.w = str3;
    }
}
