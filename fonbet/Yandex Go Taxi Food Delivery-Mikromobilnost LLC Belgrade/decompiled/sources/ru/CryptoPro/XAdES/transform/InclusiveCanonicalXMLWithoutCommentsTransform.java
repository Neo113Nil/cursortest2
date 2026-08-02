package ru.CryptoPro.XAdES.transform;

/* loaded from: classes4.dex */
public class InclusiveCanonicalXMLWithoutCommentsTransform extends AbstractTransform {
    @Override // ru.CryptoPro.XAdES.transform.AbstractTransform, ru.CryptoPro.XAdES.transform.ITransform
    public String getAlgorithm() {
        return "http://www.w3.org/TR/2001/REC-xml-c14n-20010315";
    }
}
