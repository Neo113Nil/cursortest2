package ru.CryptoPro.XAdES.transform;

/* loaded from: classes4.dex */
public class EnvelopedTransform extends AbstractTransform {
    @Override // ru.CryptoPro.XAdES.transform.AbstractTransform, ru.CryptoPro.XAdES.transform.ITransform
    public String getAlgorithm() {
        return "http://www.w3.org/2000/09/xmldsig#enveloped-signature";
    }
}
