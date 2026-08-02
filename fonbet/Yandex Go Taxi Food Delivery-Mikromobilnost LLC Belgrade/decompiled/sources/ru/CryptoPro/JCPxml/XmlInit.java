package ru.CryptoPro.JCPxml;

import com.yandex.passport.internal.ui.router.GlobalRouterActivity;
import com.yandex.yphone.service.settings.AppSettingsContract$Setting;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.xml.security.Init;
import org.apache.xml.security.algorithms.JCEMapper;
import org.apache.xml.security.algorithms.MessageDigestAlgorithm;
import org.apache.xml.security.algorithms.SignatureAlgorithm;
import org.apache.xml.security.c14n.Canonicalizer;
import org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException;
import org.apache.xml.security.keys.keyresolver.KeyResolver;
import org.apache.xml.security.transforms.Transform;
import org.apache.xml.security.utils.ElementProxy;
import org.apache.xml.security.utils.I18n;
import org.apache.xml.security.utils.XMLUtils;
import org.apache.xml.security.utils.resolver.ResourceResolver;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.Platform;
import ru.CryptoPro.JCP.tools.SelfTester_Auxiliary;

/* loaded from: classes4.dex */
public class XmlInit implements Consts {
    public static final String JCP_XML_DOCUMENT_ID_RESOLVER = "ru.CryptoPro.JCPxml.utility.DocumentIdResolver";
    private static boolean initiated;
    private static boolean isXmlSecVersionLowerThen15;

    private XmlInit() {
    }

    private static void callAndroidXmlSecurityInit(Class cls, Class cls2, Object obj) {
        try {
            cls.getDeclaredMethod("init", cls2).invoke(null, obj);
        } catch (Exception e) {
            JCPLogger.subThrown(e);
        }
    }

    private static void fileInit(InputStream inputStream) {
        Node item;
        String str;
        SelfTester_Auxiliary.checkClass(XmlInit.class);
        try {
            DocumentBuilderFactory createDocFactory = Utils.createDocFactory();
            short s = 1;
            createDocFactory.setNamespaceAware(true);
            createDocFactory.setValidating(false);
            Node firstChild = createDocFactory.newDocumentBuilder().parse(inputStream).getFirstChild();
            while (firstChild != null && !"Configuration".equals(firstChild.getLocalName())) {
                firstChild = firstChild.getNextSibling();
            }
            if (firstChild == null) {
                JCPLogger.warning("Error in reading configuration file - Configuration element not found");
                return;
            }
            Node firstChild2 = firstChild.getFirstChild();
            while (firstChild2 != null) {
                if (s == firstChild2.getNodeType()) {
                    String localName = firstChild2.getLocalName();
                    if (localName.equals("CanonicalizationMethods")) {
                        if (isXmlSecVersionLowerThen15) {
                            callAndroidXmlSecurityInit(Canonicalizer.class, "init");
                        }
                        Element[] selectNodes = XMLUtils.selectNodes(firstChild2.getFirstChild(), "http://www.xmlsecurity.org/NS/#configuration", "CanonicalizationMethod");
                        for (int i = 0; i < selectNodes.length; i++) {
                            String attributeNS = selectNodes[i].getAttributeNS(null, GlobalRouterActivity.URI);
                            String attributeNS2 = selectNodes[i].getAttributeNS(null, "JAVACLASS");
                            try {
                                Canonicalizer.register(attributeNS, attributeNS2);
                                JCPLogger.fineFormat("Canonicalizer.register({0}, {1})", attributeNS, attributeNS2);
                            } catch (ClassNotFoundException unused) {
                                JCPLogger.warning(I18n.translate("algorithm.classDoesNotExist", new Object[]{attributeNS, attributeNS2}));
                            } catch (AlgorithmAlreadyRegisteredException unused2) {
                                JCPLogger.fineFormat("Registered ({0}, {1})", attributeNS, attributeNS2);
                            }
                        }
                    }
                    if (localName.equals("TransformAlgorithms")) {
                        if (isXmlSecVersionLowerThen15) {
                            callAndroidXmlSecurityInit(Transform.class, "init");
                        }
                        Element[] selectNodes2 = XMLUtils.selectNodes(firstChild2.getFirstChild(), "http://www.xmlsecurity.org/NS/#configuration", "TransformAlgorithm");
                        for (int i2 = 0; i2 < selectNodes2.length; i2++) {
                            String attributeNS3 = selectNodes2[i2].getAttributeNS(null, GlobalRouterActivity.URI);
                            String attributeNS4 = selectNodes2[i2].getAttributeNS(null, "JAVACLASS");
                            try {
                                Transform.register(attributeNS3, attributeNS4);
                                JCPLogger.fineFormat("Transform.register ({0}, {1})", attributeNS3, attributeNS4);
                            } catch (AlgorithmAlreadyRegisteredException unused3) {
                                JCPLogger.fineFormat("Registered ({0}, {1})", attributeNS3, attributeNS4);
                            } catch (ClassNotFoundException unused4) {
                                str = I18n.translate("algorithm.classDoesNotExist", new Object[]{attributeNS3, attributeNS4});
                                JCPLogger.warning(str);
                            } catch (NoClassDefFoundError unused5) {
                                str = "Not able to found dependencies for algorithm, I'll keep working.";
                                JCPLogger.warning(str);
                            }
                        }
                    }
                    if ("JCEAlgorithmMappings".equals(localName)) {
                        if (isXmlSecVersionLowerThen15) {
                            callAndroidXmlSecurityInit(JCEMapper.class, Element.class, firstChild2);
                        }
                        if (!isXmlSecVersionLowerThen15 && (item = ((Element) firstChild2).getElementsByTagName("Algorithms").item(0)) != null) {
                            for (Element element : XMLUtils.selectNodes(item.getFirstChild(), "http://www.xmlsecurity.org/NS/#configuration", "Algorithm")) {
                                JCEMapper.register(element.getAttribute(GlobalRouterActivity.URI), new JCEMapper.Algorithm(element));
                            }
                        }
                    }
                    if (localName.equals("SignatureAlgorithms")) {
                        if (isXmlSecVersionLowerThen15) {
                            callAndroidXmlSecurityInit(SignatureAlgorithm.class, "providerInit");
                        }
                        Element[] selectNodes3 = XMLUtils.selectNodes(firstChild2.getFirstChild(), "http://www.xmlsecurity.org/NS/#configuration", "SignatureAlgorithm");
                        for (int i3 = 0; i3 < selectNodes3.length; i3++) {
                            String attributeNS5 = selectNodes3[i3].getAttributeNS(null, GlobalRouterActivity.URI);
                            String attributeNS6 = selectNodes3[i3].getAttributeNS(null, "JAVACLASS");
                            try {
                                SignatureAlgorithm.register(attributeNS5, attributeNS6);
                                JCPLogger.fineFormat("SignatureAlgorithm.register ({0}, {1})", attributeNS5, attributeNS6);
                            } catch (AlgorithmAlreadyRegisteredException unused6) {
                                JCPLogger.fineFormat("Registered ({0}, {1})", attributeNS5, attributeNS6);
                            } catch (ClassNotFoundException unused7) {
                                JCPLogger.warning(I18n.translate("algorithm.classDoesNotExist", new Object[]{attributeNS5, attributeNS6}));
                            }
                        }
                    }
                    if (localName.equals("ResourceResolvers")) {
                        if (isXmlSecVersionLowerThen15) {
                            callAndroidXmlSecurityInit(ResourceResolver.class, "init");
                        }
                        Element[] selectNodes4 = XMLUtils.selectNodes(firstChild2.getFirstChild(), "http://www.xmlsecurity.org/NS/#configuration", "Resolver");
                        for (int i4 = 0; i4 < selectNodes4.length; i4++) {
                            String attributeNS7 = selectNodes4[i4].getAttributeNS(null, "JAVACLASS");
                            String attributeNS8 = selectNodes4[i4].getAttributeNS(null, "DESCRIPTION");
                            if (attributeNS8 == null || attributeNS8.length() <= 0) {
                                JCPLogger.fineFormat("Register Resolver: {0}: {1}", attributeNS7, ": For unknown purposes");
                            } else {
                                JCPLogger.fineFormat("Register Resolver: {0}: {1}", attributeNS7, attributeNS8);
                            }
                            try {
                                ResourceResolver.register(attributeNS7);
                                JCPLogger.fineFormat("ResourceResolver.register({0})", attributeNS7);
                            } catch (Throwable th) {
                                JCPLogger.warningFormat("Cannot register:{0} perhaps some needed jars are not installed", attributeNS7);
                                JCPLogger.warning(th);
                            }
                        }
                    }
                    if (localName.equals("KeyResolver")) {
                        if (isXmlSecVersionLowerThen15) {
                            callAndroidXmlSecurityInit(KeyResolver.class, "init");
                        }
                        Element[] selectNodes5 = XMLUtils.selectNodes(firstChild2.getFirstChild(), "http://www.xmlsecurity.org/NS/#configuration", "Resolver");
                        ArrayList arrayList = new ArrayList(selectNodes5.length);
                        for (int i5 = 0; i5 < selectNodes5.length; i5++) {
                            String attributeNS9 = selectNodes5[i5].getAttributeNS(null, "JAVACLASS");
                            String attributeNS10 = selectNodes5[i5].getAttributeNS(null, "DESCRIPTION");
                            if (attributeNS10 == null || attributeNS10.length() <= 0) {
                                JCPLogger.fineFormat("Register Resolver: {0}: {1}", attributeNS9, ": For unknown purposes");
                            } else {
                                JCPLogger.fineFormat("Register Resolver: {0}: {1}", attributeNS9, attributeNS10);
                            }
                            arrayList.add(attributeNS9);
                            if (isXmlSecVersionLowerThen15) {
                                registerKeyResolverSecurityInit(KeyResolver.class, "register", String.class, attributeNS9);
                                JCPLogger.fineFormat("KeyResolver.register({0})", attributeNS9);
                            }
                        }
                        if (!isXmlSecVersionLowerThen15) {
                            registerKeyResolverSecurityInit(KeyResolver.class, "registerClassNames", List.class, arrayList);
                            JCPLogger.fine("KeyResolver.registerClassNames");
                        }
                    }
                    if (localName.equals("PrefixMappings")) {
                        JCPLogger.fine("Now I try to bind prefixes:");
                        Element[] selectNodes6 = XMLUtils.selectNodes(firstChild2.getFirstChild(), "http://www.xmlsecurity.org/NS/#configuration", "PrefixMapping");
                        for (int i6 = 0; i6 < selectNodes6.length; i6++) {
                            String attributeNS11 = selectNodes6[i6].getAttributeNS(null, "namespace");
                            String attributeNS12 = selectNodes6[i6].getAttributeNS(null, AppSettingsContract$Setting.COLUMN_PREFIX);
                            JCPLogger.fineFormat("Now I try to bind {0} to {1} ", attributeNS12, attributeNS11);
                            ElementProxy.setDefaultPrefix(attributeNS11, attributeNS12);
                            JCPLogger.fineFormat("ElementProxy.setDefaultPrefix({0}, {1})", attributeNS11, attributeNS12);
                        }
                    }
                }
                firstChild2 = firstChild2.getNextSibling();
                s = 1;
            }
        } catch (Exception e) {
            JCPLogger.warning("Bad: ", (Throwable) e);
        }
    }

    public static synchronized void init() {
        synchronized (XmlInit.class) {
            SelfTester_Auxiliary.checkClass(XmlInit.class);
            init_(Consts.CONFIG);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:6|7|(2:31|32)|9|(4:14|15|(1:17)|18)|20|21|(3:23|24|25)|15|(0)|18) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003c, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003d, code lost:
    
        ru.CryptoPro.JCP.tools.JCPLogger.warning(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c A[Catch: all -> 0x001c, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0007, B:32:0x0012, B:9:0x0022, B:11:0x0028, B:14:0x002d, B:15:0x0048, B:17:0x004c, B:18:0x0051, B:21:0x0031, B:23:0x0042, B:25:0x0045, B:30:0x003d, B:35:0x001f), top: B:3:0x0003, inners: #0, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static synchronized void init_(String str) {
        synchronized (XmlInit.class) {
            if (!initiated) {
                System.setProperty(Consts.PROPERTY_NAME, str);
                InputStream inputStream = null;
                if (Platform.isAndroid) {
                    try {
                        Canonicalizer.class.getDeclaredMethod("init", null);
                        isXmlSecVersionLowerThen15 = true;
                    } catch (Exception e) {
                        JCPLogger.subThrown(e);
                    }
                }
                if (!Init.isInitialized() && !Platform.isAndroid) {
                    Init.init();
                    if (!Platform.isAndroid) {
                        ResourceResolver.registerAtStart(JCP_XML_DOCUMENT_ID_RESOLVER);
                    }
                    initiated = true;
                }
                inputStream = Class.forName("org.apache.xml.security.Init").getResourceAsStream(str);
                if (inputStream != null) {
                    fileInit(inputStream);
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                if (!Platform.isAndroid) {
                }
                initiated = true;
            }
        }
    }

    public static synchronized boolean isInitialized() {
        boolean isInitialized_;
        synchronized (XmlInit.class) {
            isInitialized_ = isInitialized_();
        }
        return isInitialized_;
    }

    private static boolean isInitialized_() {
        boolean z = initiated;
        if (!z) {
            try {
                MessageDigestAlgorithm.getInstance(Utils.createEmptyDocument(), Consts.URI_GOST_DIGEST);
                return true;
            } catch (Throwable th) {
                JCPLogger.subThrown(th);
            }
        }
        return z;
    }

    private static void registerKeyResolverSecurityInit(Class cls, String str, Class cls2, Object obj) {
        try {
            cls.getDeclaredMethod(str, cls2).invoke(null, obj);
        } catch (Exception e) {
            JCPLogger.subThrown(e);
        }
    }

    private static void callAndroidXmlSecurityInit(Class cls, String str) {
        try {
            cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception e) {
            JCPLogger.subThrown(e);
        }
    }
}
