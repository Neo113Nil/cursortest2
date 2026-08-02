package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.ny61;
import defpackage.oyr;
import defpackage.xfo;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.xml.crypto.Data;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.NodeSetData;
import javax.xml.crypto.OctetStreamData;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.crypto.dsig.TransformService;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.Init;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.transforms.Transform;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/* loaded from: classes4.dex */
public abstract class ApacheTransform extends TransformService {
    private static Log log;
    private Transform apacheTransform;
    protected Document ownerDoc;
    protected TransformParameterSpec params;
    protected Element transformElem;

    static {
        Init.init();
        log = LogFactory.getLog(ApacheTransform.class);
    }

    private Data transformIt(Data data, XMLCryptoContext xMLCryptoContext, OutputStream outputStream) throws TransformException {
        XMLSignatureInput xMLSignatureInput;
        XMLSignatureInput xMLSignatureInput2;
        XMLSignatureInput performTransform;
        if (this.ownerDoc == null) {
            throw new TransformException("transform must be marshalled");
        }
        if (this.apacheTransform == null) {
            try {
                Transform transform = new Transform(this.ownerDoc, getAlgorithm(), this.transformElem.getChildNodes());
                this.apacheTransform = transform;
                transform.setElement(this.transformElem, xMLCryptoContext.getBaseURI());
                if (log.isDebugEnabled()) {
                    log.debug("Created transform for algorithm: " + getAlgorithm());
                }
            } catch (Exception e) {
                throw new TransformException("Couldn't find Transform for: " + getAlgorithm(), e);
            }
        }
        Boolean bool = (Boolean) xMLCryptoContext.getProperty("org.apache.jcp.xml.dsig.secureValidation");
        if (bool != null && bool.booleanValue()) {
            String algorithm = getAlgorithm();
            if ("http://www.w3.org/TR/1999/REC-xslt-19991116".equals(algorithm)) {
                throw new TransformException(oyr.p("Transform ", algorithm, " is forbidden when secure validation is enabled"));
            }
        }
        if (data instanceof ApacheData) {
            if (log.isDebugEnabled()) {
                log.debug("ApacheData = true");
            }
            xMLSignatureInput2 = ((ApacheData) data).getXMLSignatureInput();
        } else {
            if (data instanceof NodeSetData) {
                if (log.isDebugEnabled()) {
                    log.debug("isNodeSet() = true");
                }
                if (data instanceof DOMSubTreeData) {
                    if (log.isDebugEnabled()) {
                        log.debug("DOMSubTreeData = true");
                    }
                    DOMSubTreeData dOMSubTreeData = (DOMSubTreeData) data;
                    xMLSignatureInput = new XMLSignatureInput(dOMSubTreeData.getRoot());
                    xMLSignatureInput.setExcludeComments(dOMSubTreeData.excludeComments());
                } else {
                    xMLSignatureInput = new XMLSignatureInput(Utils.toNodeSet(((NodeSetData) data).iterator()));
                }
            } else {
                if (log.isDebugEnabled()) {
                    log.debug("isNodeSet() = false");
                }
                try {
                    xMLSignatureInput = new XMLSignatureInput(((OctetStreamData) data).getOctetStream());
                } catch (Exception e2) {
                    throw new TransformException(e2);
                }
            }
            xMLSignatureInput2 = xMLSignatureInput;
        }
        Transform transform2 = this.apacheTransform;
        try {
            if (outputStream != null) {
                performTransform = transform2.performTransform(xMLSignatureInput2, outputStream);
                if (!performTransform.isNodeSet() && !performTransform.isElement()) {
                    return null;
                }
            } else {
                performTransform = transform2.performTransform(xMLSignatureInput2);
            }
            return performTransform.isOctetStream() ? new ApacheOctetStreamData(performTransform) : new ApacheNodeSetData(performTransform);
        } catch (Exception e3) {
            throw new TransformException(e3);
        }
    }

    public final AlgorithmParameterSpec getParameterSpec() {
        return this.params;
    }

    public void init(XMLStructure xMLStructure, XMLCryptoContext xMLCryptoContext) throws InvalidAlgorithmParameterException {
        if (xMLCryptoContext != null && !(xMLCryptoContext instanceof DOMCryptoContext)) {
            xfo.h("context must be of type DOMCryptoContext");
            return;
        }
        Element element = (Element) ((javax.xml.crypto.dom.DOMStructure) xMLStructure).getNode();
        this.transformElem = element;
        this.ownerDoc = DOMUtils.getOwnerDocument(element);
    }

    public final boolean isFeatureSupported(String str) {
        str.getClass();
        return false;
    }

    public void marshalParams(XMLStructure xMLStructure, XMLCryptoContext xMLCryptoContext) throws MarshalException {
        if (xMLCryptoContext != null && !(xMLCryptoContext instanceof DOMCryptoContext)) {
            xfo.h("context must be of type DOMCryptoContext");
            return;
        }
        Element element = (Element) ((javax.xml.crypto.dom.DOMStructure) xMLStructure).getNode();
        this.transformElem = element;
        this.ownerDoc = DOMUtils.getOwnerDocument(element);
    }

    public Data transform(Data data, XMLCryptoContext xMLCryptoContext, OutputStream outputStream) throws TransformException {
        String str;
        if (data == null) {
            str = "data must not be null";
        } else {
            if (outputStream != null) {
                return transformIt(data, xMLCryptoContext, outputStream);
            }
            str = "output stream must not be null";
        }
        ny61.t(str);
        return null;
    }

    public Data transform(Data data, XMLCryptoContext xMLCryptoContext) throws TransformException {
        if (data != null) {
            return transformIt(data, xMLCryptoContext, null);
        }
        ny61.t("data must not be null");
        return null;
    }
}
