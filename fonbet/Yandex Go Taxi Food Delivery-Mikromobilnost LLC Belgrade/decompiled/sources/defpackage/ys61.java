package defpackage;

import org.apache.xml.security.exceptions.Base64DecodingException;
import org.apache.xml.security.utils.Base64;
import org.w3c.dom.Document;
import ru.CryptoPro.AdES.evidence.wrapper.CertificateListWrapper;
import ru.CryptoPro.AdES.exception.IAdESException;
import ru.CryptoPro.XAdES.exception.XAdESException;

/* loaded from: classes4.dex */
public final class ys61 extends xw61 implements us61 {
    public m79 x;
    public String y;

    public ys61(Document document, pu61 pu61Var, CertificateListWrapper certificateListWrapper, String str, String str2, String str3, String str4) {
        super(document, pu61Var, "EncapsulatedCRLValue", str2, str3, str4);
        this.x = certificateListWrapper.getEvidence();
        String index = certificateListWrapper.getIndex();
        if (index != null && str != null) {
            try {
                String str5 = str + "-EncapsulatedCRLValue-" + index;
                this.y = str5;
                a(null, "Id", str5);
            } catch (Exception e) {
                throw new XAdESException(e, IAdESException.ecSignatureMarshallingFailed);
            }
        }
        e().setTextContent(Base64.encode(this.x.getEncoded()));
    }

    public final m79 h() {
        String textContent;
        if (this.x == null && (textContent = e().getTextContent()) != null) {
            String trim = textContent.trim();
            if (trim.length() > 0) {
                try {
                    this.x = m79.m(Base64.decode(trim));
                } catch (Base64DecodingException e) {
                    throw new XAdESException((Exception) e, IAdESException.ecNodeInvalidContent);
                }
            }
        }
        return this.x;
    }
}
