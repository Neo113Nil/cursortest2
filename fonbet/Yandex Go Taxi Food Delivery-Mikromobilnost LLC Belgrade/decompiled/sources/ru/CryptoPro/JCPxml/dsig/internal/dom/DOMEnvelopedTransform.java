package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.kbs;
import java.security.InvalidAlgorithmParameterException;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;

/* loaded from: classes4.dex */
public final class DOMEnvelopedTransform extends ApacheTransform {
    public void init(TransformParameterSpec transformParameterSpec) throws InvalidAlgorithmParameterException {
        if (transformParameterSpec == null) {
            return;
        }
        kbs.t("params must be null");
    }
}
