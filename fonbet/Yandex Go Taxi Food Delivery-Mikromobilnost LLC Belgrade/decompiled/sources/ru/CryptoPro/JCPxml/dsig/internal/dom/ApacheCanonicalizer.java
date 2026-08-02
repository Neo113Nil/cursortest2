package ru.CryptoPro.JCPxml.dsig.internal.dom;

import defpackage.ny61;
import defpackage.xfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Set;
import javax.xml.crypto.Data;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.NodeSetData;
import javax.xml.crypto.OctetStreamData;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.crypto.dsig.TransformService;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.Init;
import org.apache.xml.security.c14n.Canonicalizer;
import org.apache.xml.security.c14n.InvalidCanonicalizerException;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.transforms.Transform;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public abstract class ApacheCanonicalizer extends TransformService {
    private static Log log;
    protected Canonicalizer apacheCanonicalizer;
    private Transform apacheTransform;
    protected String inclusiveNamespaces;
    protected Document ownerDoc;
    protected C14NMethodParameterSpec params;
    protected Element transformElem;

    static {
        Init.init();
        log = LogFactory.getLog(ApacheCanonicalizer.class);
    }

    public Data canonicalize(Data data, XMLCryptoContext xMLCryptoContext, OutputStream outputStream) throws TransformException {
        Set nodeSet;
        if (this.apacheCanonicalizer == null) {
            try {
                this.apacheCanonicalizer = Canonicalizer.getInstance(getAlgorithm());
                if (log.isDebugEnabled()) {
                    log.debug("Created canonicalizer for algorithm: " + getAlgorithm());
                }
            } catch (InvalidCanonicalizerException e) {
                throw new TransformException("Couldn't find Canonicalizer for: " + getAlgorithm() + Extension.COLON_SPACE + e.getMessage(), e);
            }
        }
        Canonicalizer canonicalizer = this.apacheCanonicalizer;
        if (outputStream == null) {
            outputStream = new ByteArrayOutputStream();
        }
        canonicalizer.setWriter(outputStream);
        try {
            if (data instanceof ApacheData) {
                XMLSignatureInput xMLSignatureInput = ((ApacheData) data).getXMLSignatureInput();
                if (xMLSignatureInput.isElement()) {
                    return this.inclusiveNamespaces != null ? new OctetStreamData(new ByteArrayInputStream(this.apacheCanonicalizer.canonicalizeSubtree(xMLSignatureInput.getSubNode(), this.inclusiveNamespaces))) : new OctetStreamData(new ByteArrayInputStream(this.apacheCanonicalizer.canonicalizeSubtree(xMLSignatureInput.getSubNode())));
                }
                if (!xMLSignatureInput.isNodeSet()) {
                    return new OctetStreamData(new ByteArrayInputStream(this.apacheCanonicalizer.canonicalize(Utils.readBytesFromStream(xMLSignatureInput.getOctetStream()))));
                }
                nodeSet = xMLSignatureInput.getNodeSet();
            } else {
                if (data instanceof DOMSubTreeData) {
                    DOMSubTreeData dOMSubTreeData = (DOMSubTreeData) data;
                    return this.inclusiveNamespaces != null ? new OctetStreamData(new ByteArrayInputStream(this.apacheCanonicalizer.canonicalizeSubtree(dOMSubTreeData.getRoot(), this.inclusiveNamespaces))) : new OctetStreamData(new ByteArrayInputStream(this.apacheCanonicalizer.canonicalizeSubtree(dOMSubTreeData.getRoot())));
                }
                if (!(data instanceof NodeSetData)) {
                    return new OctetStreamData(new ByteArrayInputStream(this.apacheCanonicalizer.canonicalize(Utils.readBytesFromStream(((OctetStreamData) data).getOctetStream()))));
                }
                nodeSet = Utils.toNodeSet(((NodeSetData) data).iterator());
                if (log.isDebugEnabled()) {
                    log.debug("Canonicalizing " + nodeSet.size() + " nodes");
                }
            }
            return this.inclusiveNamespaces != null ? new OctetStreamData(new ByteArrayInputStream(this.apacheCanonicalizer.canonicalizeXPathNodeSet(nodeSet, this.inclusiveNamespaces))) : new OctetStreamData(new ByteArrayInputStream(this.apacheCanonicalizer.canonicalizeXPathNodeSet(nodeSet)));
        } catch (Exception e2) {
            throw new TransformException(e2);
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
        XMLSignatureInput xMLSignatureInput;
        XMLSignatureInput xMLSignatureInput2;
        if (data == null) {
            str = "data must not be null";
        } else {
            if (outputStream != null) {
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
                try {
                    XMLSignatureInput performTransform = this.apacheTransform.performTransform(xMLSignatureInput2, outputStream);
                    if (performTransform.isNodeSet() || performTransform.isElement()) {
                        return performTransform.isOctetStream() ? new ApacheOctetStreamData(performTransform) : new ApacheNodeSetData(performTransform);
                    }
                    return null;
                } catch (Exception e3) {
                    throw new TransformException(e3);
                }
            }
            str = "output stream must not be null";
        }
        ny61.t(str);
        return null;
    }

    public Data canonicalize(Data data, XMLCryptoContext xMLCryptoContext) throws TransformException {
        return canonicalize(data, xMLCryptoContext, null);
    }
}
