package ru.CryptoPro.JCPxml.dsig.internal.dom;

import javax.xml.crypto.MarshalException;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMCryptoContext;
import org.w3c.dom.Node;
import ru.CryptoPro.JCP.tools.SelfTester_Auxiliary;

/* loaded from: classes4.dex */
public abstract class DOMStructure implements XMLStructure {
    public DOMStructure() {
        SelfTester_Auxiliary.checkClass(DOMStructure.class);
    }

    public final boolean isFeatureSupported(String str) {
        str.getClass();
        return false;
    }

    public abstract void marshal(Node node, String str, DOMCryptoContext dOMCryptoContext) throws MarshalException;
}
