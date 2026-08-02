package ru.CryptoPro.XAdES.transform;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;

/* loaded from: classes4.dex */
public abstract class AbstractTransform implements ITransform {
    protected TransformParameterSpec transformParameterSpec;

    @Override // ru.CryptoPro.XAdES.transform.ITransform
    public abstract /* synthetic */ String getAlgorithm();

    @Override // ru.CryptoPro.XAdES.transform.ITransform
    public Transform getTransform(XMLSignatureFactory xMLSignatureFactory) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        return xMLSignatureFactory.newTransform(getAlgorithm(), this.transformParameterSpec);
    }

    @Override // ru.CryptoPro.XAdES.transform.ITransform
    public void setTransformParameterSpec(TransformParameterSpec transformParameterSpec) {
        this.transformParameterSpec = transformParameterSpec;
    }
}
