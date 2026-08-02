package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.util.encoders.DecoderException;
import org.w3c.dom.Element;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.XAdES.exception.XAdESException;
import ru.CryptoPro.XAdES.util.XAdESUtility;

/* loaded from: classes4.dex */
public final class rv61 extends xw61 {
    public ax61 x;
    public yt61 y;

    public static cr80 h(rv61 rv61Var) {
        r0x r0xVar;
        ax61 i = rv61Var.i();
        if (i == null) {
            throw new XAdESException("CertDigest not found", IAdESException.ecNodeNotFound);
        }
        Element b = i.b("DigestMethod", "http://www.w3.org/2000/09/xmldsig#");
        String attribute = b == null ? null : b.getAttribute("Algorithm");
        String findDigestNameByDigestUri = XAdESUtility.findDigestNameByDigestUri(attribute);
        if (findDigestNameByDigestUri == null) {
            throw new XAdESException(g8e.o("Invalid digest method: ", attribute), IAdESException.ecNodeDecodingFailed);
        }
        String findDigestOidByDigestName = XAdESUtility.findDigestOidByDigestName(findDigestNameByDigestUri);
        JCPLogger.fine("Digest oid: " + findDigestOidByDigestName);
        if (findDigestOidByDigestName == null) {
            throw new XAdESException("Invalid digest algorithm: ".concat(findDigestNameByDigestUri), IAdESException.ecNodeDecodingFailed);
        }
        byte[] h = i.h();
        if (rv61Var.j() == null) {
            return new cr80(new xr1(new u2(findDigestOidByDigestName)), h, null);
        }
        xr1 xr1Var = new xr1(new u2(findDigestOidByDigestName));
        yt61 j = rv61Var.j();
        switch (j.x) {
            case 0:
                r0xVar = (r0x) j.y;
                break;
            default:
                r0xVar = (r0x) j.y;
                break;
        }
        return new cr80(xr1Var, h, r0xVar);
    }

    public final ax61 i() {
        Element f;
        if (this.x == null && (f = f("CertDigest")) != null) {
            this.x = new ax61(f, this.b, this.c, this.w);
        }
        return this.x;
    }

    public final yt61 j() {
        if (this.y == null) {
            Element f = f("IssuerSerial");
            if (f != null) {
                yt61 yt61Var = new yt61(f, this.b, this.c, this.w, 0);
                yt61Var.y = null;
                Element b = yt61Var.b("X509IssuerName", "http://www.w3.org/2000/09/xmldsig#");
                try {
                    jc51 convertStringToX500Name = XAdESUtility.convertStringToX500Name(b != null ? b.getTextContent() : null);
                    Element b2 = yt61Var.b("X509SerialNumber", "http://www.w3.org/2000/09/xmldsig#");
                    yt61Var.y = new r0x(convertStringToX500Name, new BigInteger(b2 != null ? b2.getTextContent() : null));
                    this.y = yt61Var;
                } catch (IOException e) {
                    throw new XAdESException(e, IAdESException.ecNodeDecodingFailed);
                }
            } else {
                Element f2 = f("IssuerSerialV2");
                if (f2 != null) {
                    yt61 yt61Var2 = new yt61(f2, this.b, this.c, this.w, 1);
                    yt61Var2.y = null;
                    String textContent = yt61Var2.e().getTextContent();
                    kw4 kw4Var = dw4.a;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((textContent.length() / 4) * 3);
                    try {
                        dw4.a.a(byteArrayOutputStream, textContent);
                        yt61Var2.y = r0x.m(byteArrayOutputStream.toByteArray());
                        this.y = yt61Var2;
                    } catch (Exception e2) {
                        throw new DecoderException("unable to decode base64 string: " + e2.getMessage(), e2);
                    }
                }
            }
        }
        return this.y;
    }
}
