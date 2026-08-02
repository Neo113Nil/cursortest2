package ru.CryptoPro.JCP.KeyStore;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1BitString;
import com.objsys.asn1j.runtime.Asn1Boolean;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import com.objsys.asn1j.runtime.Asn1OctetString;
import com.objsys.asn1j.runtime.Asn1OpenType;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.Asn1UTF8String;
import defpackage.g8e;
import defpackage.gq61;
import defpackage.hr61;
import defpackage.i97;
import defpackage.ir61;
import defpackage.j6a1;
import defpackage.oyr;
import defpackage.w511;
import defpackage.wu61;
import defpackage.ww61;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.AccessController;
import java.security.InvalidKeyException;
import java.security.KeyException;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.ProviderException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.ResourceBundle;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_Key;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax.Gost28147_89_MAC;
import ru.CryptoPro.JCP.ASN.Gost28147_89_EncryptionSyntax._Gost28147_89_EncryptionSyntaxValues;
import ru.CryptoPro.JCP.ASN.GostR3410_2001_PKISyntax._GostR3410_2001_PKISyntaxValues;
import ru.CryptoPro.JCP.ASN.GostR3410_2012_PKISyntax._GostR3410_2012_PKISyntaxValues;
import ru.CryptoPro.JCP.ASN.GostR3411_2012_DigestSyntax._GostR3411_2012_DigestSyntaxValues;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey.CProKCCAttributes;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey.CProKeyHeader;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey.CProKeyInfo;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey.CProPrivateKeyAttributes;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey.CProPrivateKeyParameters;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey.CProPublicKeyInfo;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey.CProSoftAuthInfo;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey.CProSoftPassword;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey.GostKeyContainer;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey.GostKeyContainerContent;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey.GostKeyContainerContentAttributes;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey.GostKeyContainerName;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey.GostPrivateCertificateStore;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey.GostPrivateKeys;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey.GostPrivateMasks;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey.TBSCProKeyHeader;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extension;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extensions;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.SubjectPublicKeyInfo;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Key.GostPrivateKey;
import ru.CryptoPro.JCP.Key.GostPublicKey;
import ru.CryptoPro.JCP.Key.PrivateKeyInterface;
import ru.CryptoPro.JCP.Key.PrivateKeySpec;
import ru.CryptoPro.JCP.Key.PublicKeyInterface;
import ru.CryptoPro.JCP.Key.SecretKeySpec;
import ru.CryptoPro.JCP.Key.SpecKey;
import ru.CryptoPro.JCP.Random.CPRandom;
import ru.CryptoPro.JCP.Util.ConverterCP1251;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCP.params.CryptParamsSpec;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.pref.BundleChooser;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.LocalMutex;
import ru.CryptoPro.JCSP.KeyStore.CSPStore;
import ru.CryptoPro.XAdES.XAdESSignature;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class CPKeyContainer {
    public static final ResourceBundle j = BundleChooser.getDefaultBundle(BundleChooser.EXRES_NAME);
    public static final ResourceBundle k = BundleChooser.getDefaultBundle("ru.CryptoPro.JCP.pref.resources.panelres");
    public static final ResourceBundle l = ResourceBundle.getBundle("ru.CryptoPro.JCP.KeyStore.resources.KeyStore", Locale.getDefault());
    public final PrivateKeyInterface[] a;
    public GostKeyContainer b;
    public CProKeyHeader c;
    public final int d;
    public final GostKeyContainerName e;
    public boolean f;
    public boolean g;
    public final Object h;
    public final ContainerEncoder i;

    public CPKeyContainer(ContainerReaderInterface containerReaderInterface) throws IOException, UnrecoverableKeyException {
        this.a = new PrivateKeyInterface[2];
        this.b = null;
        this.c = null;
        this.g = false;
        this.h = new Object();
        this.i = new ContainerEncoder(containerReaderInterface);
        try {
            i97 i97Var = (i97) AccessController.doPrivileged(new hr61(6, this));
            int i = i97Var.d;
            this.d = i;
            ResourceBundle resourceBundle = l;
            try {
                if (i == 2) {
                    this.e = i97Var.a;
                    GostKeyContainer gostKeyContainer = i97Var.b;
                    this.b = gostKeyContainer;
                    GostKeyContainerContent gostKeyContainerContent = gostKeyContainer.keyContainerContent;
                    if (gostKeyContainerContent.containerName != null) {
                        throw new OldKeyException();
                    }
                    if (!gostKeyContainerContent.containerAlgoritmIdentifier.algorithm.equals(new Asn1ObjectIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_v2_full))) {
                        throw new UnsupportedKeyFormatException();
                    }
                    if (gostKeyContainerContent.encryptionContainerName != null || gostKeyContainerContent.passwordPolicy != null || gostKeyContainerContent.containerSecurityLevel.value > 4) {
                        throw new UnsupportedKeyFormatException();
                    }
                    byte[] x = x();
                    if (!Array.compare(x, this.b.hmacKeyContainerContent.value, x.length)) {
                        throw new UnrecoverableKeyException(resourceBundle.getString("err.header.imit"));
                    }
                } else {
                    CProKeyHeader cProKeyHeader = i97Var.c;
                    this.c = cProKeyHeader;
                    TBSCProKeyHeader tBSCProKeyHeader = cProKeyHeader.tbsCProKeyHeader;
                    GostKeyContainerName gostKeyContainerName = i97Var.a;
                    this.e = gostKeyContainerName == null ? new GostKeyContainerName(tBSCProKeyHeader.containerName.value) : gostKeyContainerName;
                    if (!tBSCProKeyHeader.containerAlgoritmIdentifier.algorithm.equals(new Asn1ObjectIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_v4))) {
                        throw new UnsupportedKeyFormatException();
                    }
                    CProSoftAuthInfo cProSoftAuthInfo = tBSCProKeyHeader.authInfo;
                    if ((cProSoftAuthInfo != null && !cProSoftAuthInfo.algorithm.algorithm.equals(new Asn1ObjectIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_container_auth_password))) || tBSCProKeyHeader.containerSecurityLevel.value > 4) {
                        throw new UnsupportedKeyFormatException();
                    }
                    if (!tBSCProKeyHeader.attributes.isSet(2)) {
                        OID oid = new OID(tBSCProKeyHeader.primaryKey.privateKeyParameters.privateKeyAlgorithm.algorithm.value);
                        OID oid2 = AlgIdSpec.OID_98;
                        if (!oid.equals(oid2) && !oid.equals(AlgIdSpec.OID_19) && !oid.equals(AlgIdSpec.OID_PARAMS_EXC_2012_256) && !oid.equals(AlgIdSpec.OID_PARAMS_SIG_2012_256) && !oid.equals(AlgIdSpec.OID_PARAMS_EXC_2012_512) && !oid.equals(AlgIdSpec.OID_PARAMS_SIG_2012_512)) {
                            throw new UnrecoverableKeyException(resourceBundle.getString("err.only.gost"));
                        }
                        if (!this.c.signatureAlgorithm.algorithm.equals(tBSCProKeyHeader.primaryKey.privateKeyParameters.privateKeyAlgorithm.algorithm)) {
                            OID oid3 = new OID(this.c.signatureAlgorithm.algorithm.value);
                            if ((oid.equals(oid2) && !oid3.equals(AlgIdSpec.OID_19)) || ((oid.equals(AlgIdSpec.OID_PARAMS_EXC_2012_256) && !oid3.equals(AlgIdSpec.OID_PARAMS_SIG_2012_256)) || (oid.equals(AlgIdSpec.OID_PARAMS_EXC_2012_512) && !oid3.equals(AlgIdSpec.OID_PARAMS_SIG_2012_512)))) {
                                throw new UnrecoverableKeyException(resourceBundle.getString("err.sign.alg"));
                            }
                        }
                        if (!n(this.c.signature.value)) {
                            throw new UnrecoverableKeyException(resourceBundle.getString("err.sign.value"));
                        }
                    } else {
                        if (!this.c.signatureAlgorithm.algorithm.equals(new Asn1ObjectIdentifier(_GostR3411_2012_DigestSyntaxValues.id_tc26_gost3411_2012_256))) {
                            throw new UnrecoverableKeyException(resourceBundle.getString("err.hash.alg"));
                        }
                        byte[] w = w();
                        if (!Array.compare(w, this.c.signature.value, w.length)) {
                            throw new UnrecoverableKeyException(resourceBundle.getString("err.hash.value"));
                        }
                    }
                }
                this.f = true;
            } catch (Asn1Exception e) {
                throw j6a1.b(e);
            } catch (KeyException e2) {
                throw j6a1.b(e2);
            }
        } catch (PrivilegedActionException e3) {
            boolean z = e3.getCause() instanceof IOException;
            Throwable cause = e3.getCause();
            if (!z) {
                throw j6a1.b((Asn1Exception) cause);
            }
            throw ((IOException) cause);
        }
    }

    public static Asn1OctetString a(Certificate certificate) {
        if (certificate == null) {
            return null;
        }
        try {
            return new Asn1OctetString(certificate.getEncoded());
        } catch (CertificateEncodingException e) {
            throw j6a1.a(e);
        }
    }

    public static String b(SpecKey specKey) {
        String algorithm = specKey.getAlgorithm();
        return (algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_256_NAME) || algorithm.equalsIgnoreCase(JCP.GOST_DH_2012_256_NAME)) ? JCP.CRYPTOPRO_SIGN_2012_256_NAME : (algorithm.equalsIgnoreCase(JCP.GOST_EL_2012_512_NAME) || algorithm.equalsIgnoreCase(JCP.GOST_DH_2012_512_NAME)) ? JCP.CRYPTOPRO_SIGN_2012_512_NAME : JCP.CRYPTOPRO_SIGN_NAME;
    }

    public static String c(ContainerReaderInterface containerReaderInterface) {
        MediaInterface media = containerReaderInterface.getMedia();
        String mediaInterface = media.toString();
        String mediaUnique = media.mediaUnique();
        String folder = containerReaderInterface.folder();
        String str = mediaInterface + CSPStore.UNIQUE_SEPARATOR;
        if (mediaUnique != null) {
            str = str.concat(mediaUnique);
        }
        String concat = str.concat("\\");
        return folder != null ? concat.concat(folder) : concat;
    }

    public static Certificate d(Asn1OctetString asn1OctetString) {
        return CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME).generateCertificate(asn1OctetString.toInputStream());
    }

    public static void delete(ContainerReaderInterface containerReaderInterface, String str) throws IOException {
        LocalMutex e = e(containerReaderInterface, str);
        for (int i = 0; i < ContainerEncoder.KEYNAMES.length; i++) {
            try {
                try {
                    h(containerReaderInterface, i);
                } catch (IOException e2) {
                    JCPLogger.ignoredException(e2);
                    e.unlockFinally();
                    return;
                }
            } catch (Throwable th) {
                e.unlockFinally();
                throw th;
            }
        }
        containerReaderInterface.removeFolder();
        e.unlockFinally();
    }

    public static LocalMutex e(ContainerReaderInterface containerReaderInterface, String str) {
        String f;
        MediaInterface media = containerReaderInterface.getMedia();
        String mediaInterface = media.toString();
        String mediaUnique = media.mediaUnique();
        String folder = containerReaderInterface.folder();
        if (str == null || str.length() == 0) {
            String o = g8e.o(".5a189306-c591-40ef-97f7-1693c008c9bf_", mediaInterface);
            if (mediaUnique != null) {
                o = oyr.f('_', o, mediaUnique);
            }
            f = oyr.f('_', o, folder);
        } else {
            f = g8e.o(".5a189306-c591-40ef-97f7-1693c008c9bf_", folder);
        }
        LocalMutex localMutex = new LocalMutex(f);
        try {
            AccessController.doPrivileged(new hr61(7, localMutex));
            return localMutex;
        } catch (PrivilegedActionException e) {
            throw ((IOException) e.getException());
        }
    }

    public static String getContainerName(ContainerReaderInterface containerReaderInterface) {
        GostKeyContainerName readName = new ContainerEncoder(containerReaderInterface).readName();
        if (readName != null) {
            return ConverterCP1251.toUnicode(readName.containerName.toString());
        }
        ContainerEncoder containerEncoder = new ContainerEncoder(containerReaderInterface);
        if (!containerEncoder.isHeaderExist()) {
            return null;
        }
        try {
            CProKeyHeader readHeaderV4 = containerEncoder.readHeaderV4();
            if (readHeaderV4 != null) {
                return readHeaderV4.tbsCProKeyHeader.containerName.value;
            }
        } catch (Exception e) {
            JCPLogger.ignoredException(e);
        }
        try {
            return c(containerReaderInterface);
        } catch (IOException e2) {
            JCPLogger.ignoredException(e2);
            return null;
        }
    }

    public static void h(ContainerReaderInterface containerReaderInterface, int i) {
        try {
            int fileSize = containerReaderInterface.fileSize(i);
            byte[] bArr = {0, DerValue.TAG_CONTEXT, 0};
            if (fileSize > 0) {
                byte[] bArr2 = new byte[fileSize];
                for (int i2 = 0; i2 < 3; i2++) {
                    Arrays.fill(bArr2, bArr[i2]);
                    containerReaderInterface.storeFile(i, bArr2, false);
                }
            }
        } catch (IOException e) {
            JCPLogger.ignoredException(e);
        }
        try {
            containerReaderInterface.removeFile(i);
        } catch (IOException e2) {
            JCPLogger.ignoredException(e2);
        }
    }

    public static Extension[] p(Asn1ObjectIdentifier asn1ObjectIdentifier, boolean z, Certificate[] certificateArr) {
        Extension[] extensionArr = (!z || certificateArr.length <= 1) ? new Extension[1] : new Extension[2];
        extensionArr[0] = new Extension();
        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
        Extension extension = extensionArr[0];
        extension.extnID = asn1ObjectIdentifier;
        extension.critical = new Asn1Boolean(false);
        GostPrivateCertificateStore gostPrivateCertificateStore = new GostPrivateCertificateStore(1);
        gostPrivateCertificateStore.elements[0] = new Asn1OpenType(a(certificateArr[certificateArr.length - 1]).value);
        try {
            gostPrivateCertificateStore.encode(asn1BerEncodeBuffer);
            extensionArr[0].extnValue = new Asn1OctetString(asn1BerEncodeBuffer.getMsgCopy());
            asn1BerEncodeBuffer.reset();
            if (!z || certificateArr.length <= 1) {
                return extensionArr;
            }
            Extension extension2 = new Extension();
            extensionArr[1] = extension2;
            extension2.extnID = new Asn1ObjectIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_extension_intermidiate_store);
            extensionArr[1].critical = new Asn1Boolean(false);
            GostPrivateCertificateStore gostPrivateCertificateStore2 = new GostPrivateCertificateStore(certificateArr.length - 1);
            for (int i = 0; i < certificateArr.length - 1; i++) {
                gostPrivateCertificateStore2.elements[i] = new Asn1OpenType(a(certificateArr[i]).value);
            }
            try {
                gostPrivateCertificateStore2.encode(asn1BerEncodeBuffer);
                extensionArr[1].extnValue = new Asn1OctetString(asn1BerEncodeBuffer.getMsgCopy());
                return extensionArr;
            } catch (Asn1Exception e) {
                KeyStoreException keyStoreException = new KeyStoreException();
                keyStoreException.initCause(e);
                throw keyStoreException;
            }
        } catch (Asn1Exception e2) {
            KeyStoreException keyStoreException2 = new KeyStoreException();
            keyStoreException2.initCause(e2);
            throw keyStoreException2;
        }
    }

    public static GostKeyContainer q() {
        GostKeyContainer gostKeyContainer = new GostKeyContainer();
        GostKeyContainerContent gostKeyContainerContent = new GostKeyContainerContent();
        gostKeyContainer.keyContainerContent = gostKeyContainerContent;
        gostKeyContainerContent.containerAlgoritmIdentifier = new AlgorithmIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_v2_full);
        gostKeyContainer.keyContainerContent.attributes = new GostKeyContainerContentAttributes();
        gostKeyContainer.keyContainerContent.attributes.set(2, true);
        gostKeyContainer.keyContainerContent.attributes.set(1, true);
        gostKeyContainer.keyContainerContent.primaryPrivateKeyParameters = new CProPrivateKeyParameters();
        gostKeyContainer.keyContainerContent.primaryPrivateKeyParameters.attributes = new CProPrivateKeyAttributes();
        gostKeyContainer.keyContainerContent.containerSecurityLevel = new Asn1Integer(1L);
        gostKeyContainer.keyContainerContent.primaryPrivateKeyParameters.attributes.set(0, true);
        return gostKeyContainer;
    }

    public static void validateCreationAlias(String str) throws KeyStoreException {
        if (str.indexOf(92) >= 0) {
            throw new InvalidAliasException();
        }
        if (str.indexOf("::::") >= 0) {
            throw new InvalidAliasException();
        }
        if (str.indexOf("****") >= 0) {
            throw new InvalidAliasException();
        }
    }

    public final void f() {
        synchronized (this.h) {
            try {
                if (!this.g) {
                    try {
                        AccessController.doPrivileged(new ir61(2));
                        this.g = true;
                    } catch (Exception e) {
                        throw new ProviderException(k.getString("license.check.failed"), e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(PrivateKeyInterface privateKeyInterface, boolean z) {
        this.a[0] = privateKeyInterface;
        AlgIdInterface algIdInterface = (AlgIdInterface) privateKeyInterface.getParams();
        if (this.d == 2) {
            GostKeyContainerContent gostKeyContainerContent = this.b.keyContainerContent;
            gostKeyContainerContent.attributes.set(2, false);
            gostKeyContainerContent.primaryPrivateKeyParameters.privateKeyAlgorithm = (AlgorithmIdentifier) algIdInterface.getDecoded();
            gostKeyContainerContent.primaryPrivateKeyParameters.attributes.set(2, z);
            byte[] bArr = new byte[8];
            System.arraycopy(privateKeyInterface.generatePublic().encode(), 0, bArr, 0, 8);
            gostKeyContainerContent.primaryFP = new Asn1OctetString(bArr);
            gostKeyContainerContent.primaryPrivateKeyParameters.attributes.set(0, privateKeyInterface.isExportable() && privateKeyInterface.isPreExportable());
            gostKeyContainerContent.primaryPrivateKeyParameters.attributes.set(1, privateKeyInterface.isUserProtected());
            gostKeyContainerContent.primaryPrivateKeyParameters.attributes.set(5, privateKeyInterface.isDhAllowed());
        } else {
            TBSCProKeyHeader tBSCProKeyHeader = this.c.tbsCProKeyHeader;
            tBSCProKeyHeader.attributes.set(2, false);
            tBSCProKeyHeader.primaryKey.privateKeyParameters.privateKeyAlgorithm = (AlgorithmIdentifier) algIdInterface.getDecoded();
            tBSCProKeyHeader.primaryKey.privateKeyParameters.attributes.set(2, z);
            tBSCProKeyHeader.primaryKey.privateKeyParameters.attributes.set(0, privateKeyInterface.isExportable() && privateKeyInterface.isPreExportable());
            tBSCProKeyHeader.primaryKey.privateKeyParameters.attributes.set(1, privateKeyInterface.isUserProtected());
            tBSCProKeyHeader.primaryKey.privateKeyParameters.attributes.set(5, privateKeyInterface.isDhAllowed());
            CProKeyInfo cProKeyInfo = tBSCProKeyHeader.primaryKey;
            if (cProKeyInfo.publicKeyInfo == null) {
                cProKeyInfo.publicKeyInfo = new CProPublicKeyInfo();
            }
            byte[] encode = privateKeyInterface.generatePublic().encode();
            tBSCProKeyHeader.primaryKey.publicKeyInfo.set_publicKey(new Asn1BitString(encode.length << 3, encode));
        }
        t(privateKeyInterface, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0014, code lost:
    
        if (r4 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        if (r4 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AlgIdInterface getAlgidSpec(int i) {
        CProPrivateKeyParameters cProPrivateKeyParameters;
        AlgorithmIdentifier algorithmIdentifier = null;
        if (this.d == 2) {
            GostKeyContainerContent gostKeyContainerContent = this.b.keyContainerContent;
            if (i == 0) {
                cProPrivateKeyParameters = gostKeyContainerContent.primaryPrivateKeyParameters;
            } else if (i == 1) {
                cProPrivateKeyParameters = gostKeyContainerContent.secondaryPrivateKeyParameters;
            }
            algorithmIdentifier = cProPrivateKeyParameters.privateKeyAlgorithm;
        } else {
            TBSCProKeyHeader tBSCProKeyHeader = this.c.tbsCProKeyHeader;
            if (i == 0) {
                cProPrivateKeyParameters = tBSCProKeyHeader.primaryKey.privateKeyParameters;
            } else if (i == 1) {
                CProKeyInfo cProKeyInfo = tBSCProKeyHeader.secondaryKey;
                if (cProKeyInfo != null) {
                    cProPrivateKeyParameters = cProKeyInfo.privateKeyParameters;
                }
            }
            algorithmIdentifier = cProPrivateKeyParameters.privateKeyAlgorithm;
        }
        return new AlgIdSpec(algorithmIdentifier);
    }

    public Certificate[] getContainerCertificateChain(boolean z) throws CertificateException {
        Extension[] extensionArr;
        Certificate[] certificateArr;
        Certificate certificate;
        Asn1OpenType[] asn1OpenTypeArr;
        Asn1OpenType[] asn1OpenTypeArr2;
        Asn1ObjectIdentifier asn1ObjectIdentifier = z ? new Asn1ObjectIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_extension_signature_trust_store) : new Asn1ObjectIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_extension_exchange_trust_store);
        Asn1ObjectIdentifier asn1ObjectIdentifier2 = new Asn1ObjectIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_extension_intermidiate_store);
        if (!keyAbsent()) {
            Extensions extensions = this.d == 2 ? this.b.keyContainerContent.extensions : this.c.tbsCProKeyHeader.extensions;
            if (extensions != null && (extensionArr = extensions.elements) != null && extensionArr.length != 0) {
                int i = 0;
                GostPrivateCertificateStore gostPrivateCertificateStore = null;
                GostPrivateCertificateStore gostPrivateCertificateStore2 = null;
                while (true) {
                    Extension[] extensionArr2 = extensions.elements;
                    if (i >= extensionArr2.length) {
                        break;
                    }
                    if (extensionArr2[i].extnID.equals(asn1ObjectIdentifier2)) {
                        Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(extensions.elements[i].extnValue.value);
                        GostPrivateCertificateStore gostPrivateCertificateStore3 = new GostPrivateCertificateStore();
                        try {
                            gostPrivateCertificateStore3.decode(asn1BerDecodeBuffer);
                            gostPrivateCertificateStore = gostPrivateCertificateStore3;
                        } catch (Asn1Exception e) {
                            CertificateException certificateException = new CertificateException();
                            certificateException.initCause(e);
                            throw certificateException;
                        } catch (IOException e2) {
                            CertificateException certificateException2 = new CertificateException();
                            certificateException2.initCause(e2);
                            throw certificateException2;
                        }
                    }
                    if (extensions.elements[i].extnID.equals(asn1ObjectIdentifier)) {
                        Asn1BerDecodeBuffer asn1BerDecodeBuffer2 = new Asn1BerDecodeBuffer(extensions.elements[i].extnValue.value);
                        GostPrivateCertificateStore gostPrivateCertificateStore4 = new GostPrivateCertificateStore();
                        try {
                            gostPrivateCertificateStore4.decode(asn1BerDecodeBuffer2);
                            gostPrivateCertificateStore2 = gostPrivateCertificateStore4;
                        } catch (Asn1Exception e3) {
                            CertificateException certificateException3 = new CertificateException();
                            certificateException3.initCause(e3);
                            throw certificateException3;
                        } catch (IOException e4) {
                            CertificateException certificateException4 = new CertificateException();
                            certificateException4.initCause(e4);
                            throw certificateException4;
                        }
                    }
                    i++;
                }
                CertificateFactory certificateFactory = CertificateFactory.getInstance(JCP.CERTIFICATE_FACTORY_NAME);
                if (gostPrivateCertificateStore == null || (asn1OpenTypeArr2 = gostPrivateCertificateStore.elements) == null) {
                    certificateArr = null;
                } else {
                    certificateArr = new Certificate[asn1OpenTypeArr2.length];
                    for (int i2 = 0; i2 < gostPrivateCertificateStore.elements.length; i2++) {
                        certificateArr[i2] = certificateFactory.generateCertificate(new ByteArrayInputStream(gostPrivateCertificateStore.elements[i2].value));
                    }
                }
                if (gostPrivateCertificateStore2 == null || (asn1OpenTypeArr = gostPrivateCertificateStore2.elements) == null || asn1OpenTypeArr.length == 0) {
                    certificate = null;
                } else {
                    if (asn1OpenTypeArr.length > 1) {
                        w511.y("Only one trust certificate is supported");
                        return null;
                    }
                    certificate = certificateFactory.generateCertificate(new ByteArrayInputStream(gostPrivateCertificateStore2.elements[0].value));
                }
                if (certificateArr != null) {
                    Certificate[] certificateArr2 = new Certificate[certificateArr.length + (certificate == null ? 0 : 1)];
                    for (int i3 = 0; i3 < certificateArr.length; i3++) {
                        certificateArr2[i3] = certificateArr[i3];
                    }
                    if (certificate != null) {
                        certificateArr2[certificateArr.length] = certificate;
                    }
                    return certificateArr2;
                }
                if (certificate != null) {
                    return new Certificate[]{certificate};
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PrivateKeyInterface getExchange(char[] cArr) throws IOException, UnrecoverableKeyException {
        char c;
        f();
        try {
            if (this.f) {
                s(cArr);
            }
            if (!keyAbsent()) {
                if (isPrimaryExchange()) {
                    c = 0;
                } else if (!secondaryAbsent()) {
                    c = 1;
                }
                if (c != 65535 && this.f) {
                    try {
                        j(cArr, false);
                    } catch (KeyException e) {
                        JCPLogger.warning(e.toString());
                        throw j6a1.b(e);
                    }
                }
                if (c == 65535) {
                    return this.a[c];
                }
                return null;
            }
            c = 65535;
            if (c != 65535) {
                j(cArr, false);
            }
            if (c == 65535) {
            }
        } catch (KeyException e2) {
            throw j6a1.b(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Certificate getExchangeCertificate() throws CertificateException {
        Asn1OctetString asn1OctetString;
        CProPublicKeyInfo cProPublicKeyInfo;
        CProKeyInfo cProKeyInfo;
        if (!keyAbsent()) {
            if (this.d == 2) {
                GostKeyContainerContent gostKeyContainerContent = this.b.keyContainerContent;
                if (isPrimaryExchange()) {
                    asn1OctetString = gostKeyContainerContent.primary_certificate;
                } else if (!secondaryAbsent()) {
                    asn1OctetString = gostKeyContainerContent.secondary_certificate;
                }
            } else {
                TBSCProKeyHeader tBSCProKeyHeader = this.c.tbsCProKeyHeader;
                if (isPrimaryExchange()) {
                    CProPublicKeyInfo cProPublicKeyInfo2 = tBSCProKeyHeader.primaryKey.publicKeyInfo;
                    if (cProPublicKeyInfo2 != null && cProPublicKeyInfo2.getChoiceID() == 2) {
                        cProKeyInfo = tBSCProKeyHeader.primaryKey;
                        asn1OctetString = (Asn1OctetString) cProKeyInfo.publicKeyInfo.getElement();
                    }
                } else if (!secondaryAbsent() && (cProPublicKeyInfo = tBSCProKeyHeader.secondaryKey.publicKeyInfo) != null && cProPublicKeyInfo.getChoiceID() == 2) {
                    cProKeyInfo = tBSCProKeyHeader.secondaryKey;
                    asn1OctetString = (Asn1OctetString) cProKeyInfo.publicKeyInfo.getElement();
                }
            }
            if (asn1OctetString == null) {
                return d(asn1OctetString);
            }
            return null;
        }
        asn1OctetString = null;
        if (asn1OctetString == null) {
        }
    }

    public Extension[] getExtensions() {
        Extension[] extensionArr;
        Extension[] extensionArr2;
        if (this.d == 2) {
            Extensions extensions = this.b.keyContainerContent.extensions;
            if (extensions == null || (extensionArr2 = extensions.elements) == null) {
                return null;
            }
            return extensionArr2;
        }
        Extensions extensions2 = this.c.tbsCProKeyHeader.extensions;
        if (extensions2 == null || (extensionArr = extensions2.elements) == null) {
            return null;
        }
        return extensionArr;
    }

    public byte[] getFP(int i) {
        Asn1OctetString asn1OctetString;
        if (this.d != 2) {
            return null;
        }
        GostKeyContainerContent gostKeyContainerContent = this.b.keyContainerContent;
        if (i == 0) {
            Asn1OctetString asn1OctetString2 = gostKeyContainerContent.primaryFP;
            if (asn1OctetString2 != null) {
                return Array.copy(asn1OctetString2.value);
            }
            return null;
        }
        if (i != 1 || (asn1OctetString = gostKeyContainerContent.secondaryFP) == null) {
            return null;
        }
        return Array.copy(asn1OctetString.value);
    }

    public CProPrivateKeyParameters getPrivateKeyParameters(boolean z) {
        if (this.d == 2) {
            GostKeyContainerContent gostKeyContainerContent = this.b.keyContainerContent;
            return z ? gostKeyContainerContent.primaryPrivateKeyParameters : gostKeyContainerContent.secondaryPrivateKeyParameters;
        }
        TBSCProKeyHeader tBSCProKeyHeader = this.c.tbsCProKeyHeader;
        if (z) {
            CProKeyInfo cProKeyInfo = tBSCProKeyHeader.primaryKey;
            if (cProKeyInfo != null) {
                return cProKeyInfo.privateKeyParameters;
            }
            return null;
        }
        CProKeyInfo cProKeyInfo2 = tBSCProKeyHeader.secondaryKey;
        if (cProKeyInfo2 != null) {
            return cProKeyInfo2.privateKeyParameters;
        }
        return null;
    }

    public byte[] getPublicKey(int i) {
        CProKeyInfo cProKeyInfo;
        CProPublicKeyInfo cProPublicKeyInfo;
        Asn1Type element;
        if (this.d != 4) {
            return null;
        }
        TBSCProKeyHeader tBSCProKeyHeader = this.c.tbsCProKeyHeader;
        try {
            if (i == 0) {
                CProPublicKeyInfo cProPublicKeyInfo2 = tBSCProKeyHeader.primaryKey.publicKeyInfo;
                if (cProPublicKeyInfo2 == null) {
                    return null;
                }
                int choiceID = cProPublicKeyInfo2.getChoiceID();
                if (choiceID == 2) {
                    Asn1OctetString asn1OctetString = (Asn1OctetString) tBSCProKeyHeader.primaryKey.publicKeyInfo.getElement();
                    if (asn1OctetString != null) {
                        return Array.copy(((PublicKeyInterface) new GostPublicKey(d(asn1OctetString).getPublicKey().getEncoded(), true).getSpec()).encode());
                    }
                    return null;
                }
                if (choiceID != 1) {
                    return null;
                }
                element = tBSCProKeyHeader.primaryKey.publicKeyInfo.getElement();
            } else {
                if (i != 1 || (cProKeyInfo = tBSCProKeyHeader.secondaryKey) == null || (cProPublicKeyInfo = cProKeyInfo.publicKeyInfo) == null) {
                    return null;
                }
                int choiceID2 = cProPublicKeyInfo.getChoiceID();
                if (choiceID2 == 2) {
                    Asn1OctetString asn1OctetString2 = (Asn1OctetString) tBSCProKeyHeader.secondaryKey.publicKeyInfo.getElement();
                    if (asn1OctetString2 != null) {
                        return Array.copy(((PublicKeyInterface) new GostPublicKey(d(asn1OctetString2).getPublicKey().getEncoded(), true).getSpec()).encode());
                    }
                    return null;
                }
                if (choiceID2 != 1) {
                    return null;
                }
                element = tBSCProKeyHeader.secondaryKey.publicKeyInfo.getElement();
            }
            return ((Asn1BitString) element).value;
        } catch (CertificateException | InvalidKeySpecException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PrivateKeyInterface getSignature(char[] cArr) throws IOException, UnrecoverableKeyException {
        char c;
        f();
        try {
            if (this.f) {
                s(cArr);
            }
            if (!keyAbsent()) {
                if (!isPrimaryExchange()) {
                    c = 0;
                } else if (!secondaryAbsent()) {
                    c = 1;
                }
                if (c != 65535 && this.f) {
                    try {
                        j(cArr, false);
                    } catch (KeyException e) {
                        JCPLogger.warning(e.toString());
                        throw j6a1.b(e);
                    }
                }
                if (c == 65535) {
                    return this.a[c];
                }
                return null;
            }
            c = 65535;
            if (c != 65535) {
                j(cArr, false);
            }
            if (c == 65535) {
            }
        } catch (KeyException e2) {
            throw j6a1.b(e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Certificate getSignatureCertificate() throws CertificateException {
        Asn1OctetString asn1OctetString;
        CProPublicKeyInfo cProPublicKeyInfo;
        CProKeyInfo cProKeyInfo;
        if (!keyAbsent()) {
            if (this.d == 2) {
                GostKeyContainerContent gostKeyContainerContent = this.b.keyContainerContent;
                if (!isPrimaryExchange()) {
                    asn1OctetString = gostKeyContainerContent.primary_certificate;
                } else if (!secondaryAbsent()) {
                    asn1OctetString = gostKeyContainerContent.secondary_certificate;
                }
            } else {
                TBSCProKeyHeader tBSCProKeyHeader = this.c.tbsCProKeyHeader;
                if (!isPrimaryExchange()) {
                    CProPublicKeyInfo cProPublicKeyInfo2 = tBSCProKeyHeader.primaryKey.publicKeyInfo;
                    if (cProPublicKeyInfo2 != null && cProPublicKeyInfo2.getChoiceID() == 2) {
                        cProKeyInfo = tBSCProKeyHeader.primaryKey;
                        asn1OctetString = (Asn1OctetString) cProKeyInfo.publicKeyInfo.getElement();
                    }
                } else if (!secondaryAbsent() && (cProPublicKeyInfo = tBSCProKeyHeader.secondaryKey.publicKeyInfo) != null && cProPublicKeyInfo.getChoiceID() == 2) {
                    cProKeyInfo = tBSCProKeyHeader.secondaryKey;
                    asn1OctetString = (Asn1OctetString) cProKeyInfo.publicKeyInfo.getElement();
                }
            }
            if (asn1OctetString == null) {
                return d(asn1OctetString);
            }
            return null;
        }
        asn1OctetString = null;
        if (asn1OctetString == null) {
        }
    }

    public final void i(char[] cArr) {
        CProKeyHeader cProKeyHeader;
        AlgorithmIdentifier algorithmIdentifier;
        if (this.d == 2) {
            GostKeyContainerContent gostKeyContainerContent = this.b.keyContainerContent;
            gostKeyContainerContent.attributes.set(0, cArr != null);
            if (cArr != null) {
                gostKeyContainerContent.hmacPassword = new Gost28147_89_MAC(o(cArr, gostKeyContainerContent.primaryFP.value));
            }
            this.b.hmacKeyContainerContent = new Gost28147_89_MAC(x());
            return;
        }
        TBSCProKeyHeader tBSCProKeyHeader = this.c.tbsCProKeyHeader;
        if (tBSCProKeyHeader.containerName == null) {
            tBSCProKeyHeader.containerName = new Asn1UTF8String(this.e.containerName.value);
        }
        tBSCProKeyHeader.attributes.set(0, cArr != null);
        if (cArr != null) {
            if (tBSCProKeyHeader.authInfo == null) {
                tBSCProKeyHeader.authInfo = new CProSoftAuthInfo();
            }
            tBSCProKeyHeader.authInfo.algorithm = new AlgorithmIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_container_auth_password);
            CProSoftPassword cProSoftPassword = new CProSoftPassword();
            cProSoftPassword.algorithm = new AlgorithmIdentifier(_Gost28147_89_EncryptionSyntaxValues.id_Gost28147_89_MAC);
            byte[] makeRandomBytes = new CPRandom().makeRandomBytes(8);
            cProSoftPassword.iv = new Asn1OctetString(makeRandomBytes);
            cProSoftPassword.cmac = new Asn1OctetString(o(cArr, makeRandomBytes));
            Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
            cProSoftPassword.encode(asn1BerEncodeBuffer);
            tBSCProKeyHeader.authInfo.value = new Asn1OctetString(asn1BerEncodeBuffer.getMsgCopy());
        }
        if (tBSCProKeyHeader.attributes.isSet(2)) {
            this.c.signatureAlgorithm = new AlgorithmIdentifier(_GostR3411_2012_DigestSyntaxValues.id_tc26_gost3411_2012_256);
            byte[] w = w();
            this.c.signature = new Asn1BitString(w.length << 3, w);
            return;
        }
        OID oid = new OID(tBSCProKeyHeader.primaryKey.privateKeyParameters.privateKeyAlgorithm.algorithm.value);
        if (oid.equals(AlgIdSpec.OID_98)) {
            cProKeyHeader = this.c;
            algorithmIdentifier = new AlgorithmIdentifier(_GostR3410_2001_PKISyntaxValues.id_GostR3410_2001);
        } else {
            if (!oid.equals(AlgIdSpec.OID_PARAMS_EXC_2012_256)) {
                boolean equals = oid.equals(AlgIdSpec.OID_PARAMS_EXC_2012_512);
                this.c.signatureAlgorithm = equals ? new AlgorithmIdentifier(_GostR3410_2012_PKISyntaxValues.id_tc26_gost3410_2012_512) : tBSCProKeyHeader.primaryKey.privateKeyParameters.privateKeyAlgorithm;
                byte[] v = v();
                this.c.signature = new Asn1BitString(v.length << 3, v);
            }
            cProKeyHeader = this.c;
            algorithmIdentifier = new AlgorithmIdentifier(_GostR3410_2012_PKISyntaxValues.id_tc26_gost3410_2012_256);
        }
        cProKeyHeader.signatureAlgorithm = algorithmIdentifier;
        byte[] v2 = v();
        this.c.signature = new Asn1BitString(v2.length << 3, v2);
    }

    public boolean isDhAllowed(boolean z) {
        CProPrivateKeyAttributes cProPrivateKeyAttributes;
        CProPrivateKeyParameters privateKeyParameters = getPrivateKeyParameters(z);
        return privateKeyParameters != null && (cProPrivateKeyAttributes = privateKeyParameters.attributes) != null && cProPrivateKeyAttributes.numbits > 5 && cProPrivateKeyAttributes.isSet(5);
    }

    public boolean isExchangeExist() {
        if (keyAbsent()) {
            return false;
        }
        return isPrimaryExchange() || !secondaryAbsent();
    }

    public boolean isExportable(boolean z) {
        CProPrivateKeyAttributes cProPrivateKeyAttributes;
        CProPrivateKeyParameters privateKeyParameters = getPrivateKeyParameters(z);
        return privateKeyParameters != null && (cProPrivateKeyAttributes = privateKeyParameters.attributes) != null && cProPrivateKeyAttributes.numbits > 0 && cProPrivateKeyAttributes.isSet(0);
    }

    public boolean isLongGost2012(AlgIdInterface algIdInterface) {
        if (algIdInterface == null) {
            algIdInterface = getAlgidSpec(0);
        }
        return algIdInterface.getOID().equals(AlgIdSpec.OID_PARAMS_SIG_2012_512) || algIdInterface.getOID().equals(AlgIdSpec.OID_PARAMS_EXC_2012_512);
    }

    public boolean isNewContVersion() {
        return this.d == 4;
    }

    public boolean isPasswordProtected() {
        return (this.d == 2 ? this.b.keyContainerContent.attributes : this.c.tbsCProKeyHeader.attributes).isSet(0);
    }

    public boolean isPrimaryExchange() {
        if (this.d == 2) {
            CProPrivateKeyAttributes cProPrivateKeyAttributes = this.b.keyContainerContent.primaryPrivateKeyParameters.attributes;
            return cProPrivateKeyAttributes.value.length != 0 && cProPrivateKeyAttributes.isSet(2);
        }
        CProPrivateKeyAttributes cProPrivateKeyAttributes2 = this.c.tbsCProKeyHeader.primaryKey.privateKeyParameters.attributes;
        return cProPrivateKeyAttributes2.value.length != 0 && cProPrivateKeyAttributes2.isSet(2);
    }

    public boolean isSignatureExist() {
        if (keyAbsent()) {
            return false;
        }
        return (isPrimaryExchange() && secondaryAbsent()) ? false : true;
    }

    public boolean isUserProtected(boolean z) {
        CProPrivateKeyAttributes cProPrivateKeyAttributes;
        CProPrivateKeyParameters privateKeyParameters = getPrivateKeyParameters(z);
        return privateKeyParameters != null && (cProPrivateKeyAttributes = privateKeyParameters.attributes) != null && cProPrivateKeyAttributes.numbits > 1 && cProPrivateKeyAttributes.isSet(1);
    }

    public final void j(char[] cArr, boolean z) {
        boolean z2;
        if (z) {
            s(cArr);
        }
        GostKeyContainerName gostKeyContainerName = this.e;
        LocalMutex e = e(this.i.getReader(), gostKeyContainerName != null ? gostKeyContainerName.containerName.toString() : null);
        try {
            try {
                if ((this.d == 2 ? this.b.keyContainerContent.containerSecurityLevel : this.c.tbsCProKeyHeader.containerSecurityLevel).value > 1) {
                    gq61 b = gq61.b();
                    ResourceBundle resourceBundle = j;
                    if (!b.c(new String[]{resourceBundle.getString("security.level.1"), resourceBundle.getString("security.level.2"), resourceBundle.getString("security.level.3"), resourceBundle.getString("security.level.4")})) {
                        throw new UnsupportedKeyFormatException();
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                AccessController.doPrivileged(new ww61(this, this, cArr, z2));
                e.unlockFinally();
            } catch (PrivilegedActionException e2) {
                if (!(e2.getCause() instanceof UnrecoverableKeyException)) {
                    throw ((KeyException) e2.getCause());
                }
                throw ((UnrecoverableKeyException) e2.getCause());
            }
        } catch (Throwable th) {
            e.unlockFinally();
            throw th;
        }
    }

    public final void k(wu61[] wu61VarArr, byte[] bArr, int i) {
        byte[] bArr2;
        GostPrivateMasks gostPrivateMasks = null;
        try {
            GostPrivateMasks readMasks = this.i.readMasks(i);
            AlgIdInterface algidSpec = getAlgidSpec(0);
            isLongGost2012(algidSpec);
            byte[] bArr3 = readMasks.mask.value;
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr3, bArr3.length - 32, 32, (CryptParamsInterface) algidSpec.getCryptParams());
            if (!secretKeySpec.checkContainerImito(readMasks.randomStatus.value, readMasks.hmacRandom.value, (CryptParamsInterface) algidSpec.getCryptParams())) {
                throw new UnrecoverableKeyException(l.getString("err.mask.imit"));
            }
            wu61VarArr[0].s(readMasks.mask.value);
            wu61 wu61Var = wu61VarArr[1];
            if (wu61Var != null) {
                wu61Var.s(readMasks.mask.value);
            }
            int length = bArr.length;
            byte[] bArr4 = readMasks.randomStatus.value;
            if (length > bArr4.length) {
                throw new Asn1Exception("Invalid random status length");
            }
            System.arraycopy(bArr4, 0, bArr, 0, bArr.length);
            secretKeySpec.clear();
            byte[] bArr5 = readMasks.mask.value;
            if (bArr5 != null) {
                Arrays.fill(bArr5, (byte) 0);
            }
        } catch (Throwable th) {
            if (0 != 0 && (bArr2 = gostPrivateMasks.mask.value) != null) {
                Arrays.fill(bArr2, (byte) 0);
            }
            throw th;
        }
    }

    public boolean keyAbsent() {
        return (this.d == 2 ? this.b.keyContainerContent.attributes : this.c.tbsCProKeyHeader.attributes).isSet(2);
    }

    public final void l(wu61[] wu61VarArr, byte[] bArr, char[] cArr, int i) {
        GostPrivateKeys readPrimary = this.i.readPrimary(i);
        if (readPrimary.hmacKey != null) {
            throw new OldKeyException();
        }
        AlgIdInterface algidSpec = getAlgidSpec(0);
        int i2 = isLongGost2012(algidSpec) ? 16 : 8;
        SecretKeySpec secretKeySpec = new SecretKeySpec(cArr, bArr, algidSpec.getDigestParams(), (AlgIdInterface) null);
        int[] commutator = ((CryptParamsInterface) algidSpec.getCryptParams()).getCommutator();
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        try {
            iArr = Array.toIntArray(readPrimary.primaryKey.value);
            secretKeySpec.contextDecrypt(iArr, commutator, wu61VarArr[0]);
            Gost28147_89_Key gost28147_89_Key = readPrimary.secondaryKey;
            if (gost28147_89_Key != null) {
                iArr2 = Array.toIntArray(gost28147_89_Key.value);
                secretKeySpec.contextDecrypt(iArr2, commutator, wu61VarArr[1]);
            }
        } finally {
            Array.clear(iArr);
            Array.clear(iArr2);
            Gost28147_89_Key gost28147_89_Key2 = readPrimary.primaryKey;
            if (gost28147_89_Key2 != null) {
                Array.clear(gost28147_89_Key2.value);
            }
            Gost28147_89_Key gost28147_89_Key3 = readPrimary.secondaryKey;
            if (gost28147_89_Key3 != null) {
                Array.clear(gost28147_89_Key3.value);
            }
        }
    }

    public void loadPrimaryToSpec(wu61[] wu61VarArr, byte[] bArr, char[] cArr, int i) throws IOException, UnrecoverableKeyException, KeyException {
        try {
            k(wu61VarArr, bArr, i);
            l(wu61VarArr, bArr, cArr, i);
        } catch (Asn1Exception e) {
            throw j6a1.b(e);
        }
    }

    public final boolean m(Certificate certificate, int i) {
        byte[] encode = ((PublicKeyInterface) new GostPublicKey(certificate.getPublicKey().getEncoded(), true).getSpec()).encode();
        int i2 = this.d;
        byte[] fp = i2 == 2 ? getFP(i) : getPublicKey(i);
        return Array.compare(fp, encode, i2 == 2 ? 8 : fp.length);
    }

    public boolean matchFP(PrivateKeyInterface privateKeyInterface, int i) {
        int length;
        int i2 = this.d;
        byte[] fp = i2 == 2 ? getFP(i) : getPublicKey(i);
        if (fp == null) {
            return false;
        }
        if (i2 == 2) {
            length = 8;
        } else {
            try {
                length = fp.length;
            } catch (InvalidKeyException e) {
                JCPLogger.subThrown(e);
                return false;
            }
        }
        return privateKeyInterface.checkFP(fp, length);
    }

    public final boolean n(byte[] bArr) {
        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
        this.c.tbsCProKeyHeader.encode(asn1BerEncodeBuffer);
        byte[] msgCopy = asn1BerEncodeBuffer.getMsgCopy();
        try {
            Asn1OctetString asn1OctetString = new Asn1OctetString(getPublicKey(0));
            Asn1BerEncodeBuffer asn1BerEncodeBuffer2 = new Asn1BerEncodeBuffer();
            asn1OctetString.encode(asn1BerEncodeBuffer2);
            SubjectPublicKeyInfo subjectPublicKeyInfo = new SubjectPublicKeyInfo(this.c.tbsCProKeyHeader.primaryKey.privateKeyParameters.privateKeyAlgorithm, new Asn1BitString(asn1BerEncodeBuffer2.getMsgLength() << 3, asn1BerEncodeBuffer2.getMsgCopy()));
            asn1BerEncodeBuffer2.reset();
            subjectPublicKeyInfo.encode(asn1BerEncodeBuffer2);
            GostPublicKey gostPublicKey = new GostPublicKey(asn1BerEncodeBuffer2.getMsgCopy(), true);
            asn1BerEncodeBuffer2.reset();
            Signature signature = Signature.getInstance(b(gostPublicKey));
            signature.initVerify(gostPublicKey);
            signature.update(msgCopy);
            return signature.verify(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new KeyException(e);
        } catch (SignatureException e2) {
            throw new KeyException(e2);
        } catch (InvalidKeySpecException e3) {
            throw new KeyException(e3);
        }
    }

    public final byte[] o(char[] cArr, byte[] bArr) {
        byte[] bArr2 = new byte[16];
        Array.clear(bArr2);
        AlgIdInterface algidSpec = getAlgidSpec(0);
        return new SecretKeySpec(cArr, bArr, algidSpec.getDigestParams(), (AlgIdInterface) null).computeContainerImito(bArr2, (CryptParamsInterface) algidSpec.getCryptParams());
    }

    public final void r(PrivateKeyInterface privateKeyInterface, boolean z) {
        this.a[1] = privateKeyInterface;
        AlgIdInterface algIdInterface = (AlgIdInterface) privateKeyInterface.getParams();
        if (this.d == 2) {
            GostKeyContainerContent gostKeyContainerContent = this.b.keyContainerContent;
            byte[] bArr = new byte[8];
            System.arraycopy(privateKeyInterface.generatePublic().encode(), 0, bArr, 0, 8);
            gostKeyContainerContent.secondaryFP = new Asn1OctetString(bArr);
            if (gostKeyContainerContent.secondaryPrivateKeyParameters == null) {
                gostKeyContainerContent.secondaryPrivateKeyParameters = new CProPrivateKeyParameters();
            }
            CProPrivateKeyParameters cProPrivateKeyParameters = gostKeyContainerContent.secondaryPrivateKeyParameters;
            if (cProPrivateKeyParameters.attributes == null) {
                cProPrivateKeyParameters.attributes = new CProPrivateKeyAttributes();
            }
            gostKeyContainerContent.secondaryPrivateKeyParameters.privateKeyAlgorithm = (AlgorithmIdentifier) algIdInterface.getDecoded();
            gostKeyContainerContent.secondaryPrivateKeyParameters.attributes.set(2, z);
            gostKeyContainerContent.secondaryPrivateKeyParameters.attributes.set(0, privateKeyInterface.isExportable() && privateKeyInterface.isPreExportable());
            gostKeyContainerContent.secondaryPrivateKeyParameters.attributes.set(1, privateKeyInterface.isUserProtected());
            gostKeyContainerContent.secondaryPrivateKeyParameters.attributes.set(5, privateKeyInterface.isDhAllowed());
        } else {
            TBSCProKeyHeader tBSCProKeyHeader = this.c.tbsCProKeyHeader;
            if (tBSCProKeyHeader.secondaryKey == null) {
                tBSCProKeyHeader.secondaryKey = new CProKeyInfo();
            }
            CProKeyInfo cProKeyInfo = tBSCProKeyHeader.secondaryKey;
            if (cProKeyInfo.privateKeyParameters == null) {
                cProKeyInfo.privateKeyParameters = new CProPrivateKeyParameters();
            }
            CProPrivateKeyParameters cProPrivateKeyParameters2 = tBSCProKeyHeader.secondaryKey.privateKeyParameters;
            if (cProPrivateKeyParameters2.attributes == null) {
                cProPrivateKeyParameters2.attributes = new CProPrivateKeyAttributes();
            }
            tBSCProKeyHeader.secondaryKey.privateKeyParameters.privateKeyAlgorithm = (AlgorithmIdentifier) algIdInterface.getDecoded();
            tBSCProKeyHeader.secondaryKey.privateKeyParameters.attributes.set(2, z);
            tBSCProKeyHeader.secondaryKey.privateKeyParameters.attributes.set(0, privateKeyInterface.isExportable() && privateKeyInterface.isPreExportable());
            tBSCProKeyHeader.secondaryKey.privateKeyParameters.attributes.set(1, privateKeyInterface.isUserProtected());
            tBSCProKeyHeader.secondaryKey.privateKeyParameters.attributes.set(5, privateKeyInterface.isDhAllowed());
            CProKeyInfo cProKeyInfo2 = tBSCProKeyHeader.secondaryKey;
            if (cProKeyInfo2.publicKeyInfo == null) {
                cProKeyInfo2.publicKeyInfo = new CProPublicKeyInfo();
            }
            byte[] encode = privateKeyInterface.generatePublic().encode();
            tBSCProKeyHeader.secondaryKey.publicKeyInfo.set_publicKey(new Asn1BitString(encode.length << 3, encode));
        }
        t(privateKeyInterface, z);
    }

    public void reset() {
        if (this.d == 2) {
            this.b = q();
        } else {
            CProKeyHeader cProKeyHeader = new CProKeyHeader();
            TBSCProKeyHeader tBSCProKeyHeader = new TBSCProKeyHeader();
            cProKeyHeader.tbsCProKeyHeader = tBSCProKeyHeader;
            tBSCProKeyHeader.containerAlgoritmIdentifier = new AlgorithmIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_v4);
            cProKeyHeader.tbsCProKeyHeader.attributes = new CProKCCAttributes();
            cProKeyHeader.tbsCProKeyHeader.attributes.set(2, true);
            cProKeyHeader.tbsCProKeyHeader.attributes.set(1, true);
            cProKeyHeader.tbsCProKeyHeader.primaryKey = new CProKeyInfo();
            cProKeyHeader.tbsCProKeyHeader.primaryKey.privateKeyParameters = new CProPrivateKeyParameters();
            cProKeyHeader.tbsCProKeyHeader.primaryKey.privateKeyParameters.attributes = new CProPrivateKeyAttributes();
            cProKeyHeader.tbsCProKeyHeader.primaryKey.privateKeyParameters.attributes.set(0, true);
            cProKeyHeader.tbsCProKeyHeader.containerSecurityLevel = new Asn1Integer(1L);
            this.c = cProKeyHeader;
        }
        this.f = false;
        Arrays.fill(this.a, (Object) null);
    }

    public final void s(char[] cArr) {
        int i = this.d;
        boolean isSet = (i == 2 ? this.b.keyContainerContent.attributes : this.c.tbsCProKeyHeader.attributes).isSet(0);
        ResourceBundle resourceBundle = l;
        if (cArr == null && isSet) {
            throw new UnrecoverableKeyException(resourceBundle.getString("err.need.pass"));
        }
        if (cArr != null && !isSet) {
            throw new UnrecoverableKeyException(resourceBundle.getString("err.no.need.pass"));
        }
        if (cArr != null) {
            if (i == 2) {
                GostKeyContainerContent gostKeyContainerContent = this.b.keyContainerContent;
                byte[] o = o(cArr, gostKeyContainerContent.primaryFP.value);
                if (!Array.compare(o, gostKeyContainerContent.hmacPassword.value, o.length)) {
                    throw new UnrecoverableKeyException(resourceBundle.getString("err.pass.invalid"));
                }
                return;
            }
            TBSCProKeyHeader tBSCProKeyHeader = this.c.tbsCProKeyHeader;
            CProSoftAuthInfo cProSoftAuthInfo = tBSCProKeyHeader.authInfo;
            if (cProSoftAuthInfo == null || !cProSoftAuthInfo.algorithm.algorithm.equals(new Asn1ObjectIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_container_auth_password))) {
                throw new UnrecoverableKeyException(resourceBundle.getString("err.invalid.pass.struct"));
            }
            Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(tBSCProKeyHeader.authInfo.value.value);
            CProSoftPassword cProSoftPassword = new CProSoftPassword();
            try {
                cProSoftPassword.decode(asn1BerDecodeBuffer);
                if (!cProSoftPassword.algorithm.algorithm.equals(new Asn1ObjectIdentifier(_Gost28147_89_EncryptionSyntaxValues.id_Gost28147_89_MAC))) {
                    throw new UnrecoverableKeyException(resourceBundle.getString("err.invalid.pass.struct"));
                }
                byte[] o2 = o(cArr, cProSoftPassword.iv.value);
                if (!Array.compare(o2, cProSoftPassword.cmac.value, o2.length)) {
                    throw new UnrecoverableKeyException(resourceBundle.getString("err.pass.invalid"));
                }
            } catch (Asn1Exception | IOException unused) {
                throw new UnrecoverableKeyException(resourceBundle.getString("err.invalid.pass.struct"));
            }
        }
    }

    public void save(char[] cArr, boolean z) throws KeyStoreException {
        ContainerEncoder containerEncoder = this.i;
        GostKeyContainerName gostKeyContainerName = this.e;
        try {
            LocalMutex e = e(containerEncoder.getReader(), gostKeyContainerName != null ? gostKeyContainerName.containerName.toString() : null);
            int i = this.d;
            try {
                try {
                    try {
                        try {
                            PrivateKeySpec.firstSaveSpec(this, cArr, this.a, (i == 2 ? this.b.keyContainerContent.attributes : this.c.tbsCProKeyHeader.attributes).isSet(1) ? 1 : 0, z);
                            i(cArr);
                            if (i == 2) {
                                containerEncoder.storeHeaderV2(this.b);
                            } else {
                                containerEncoder.storeHeaderV4(this.c);
                            }
                            containerEncoder.storeName(gostKeyContainerName);
                            e.unlockFinally();
                        } catch (IOException e2) {
                            throw j6a1.a(e2);
                        }
                    } catch (Asn1Exception e3) {
                        throw j6a1.a(e3);
                    }
                } catch (KeyException e4) {
                    throw j6a1.a(e4);
                }
            } catch (Throwable th) {
                e.unlockFinally();
                throw th;
            }
        } catch (IOException e5) {
            throw j6a1.a(e5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6, types: [ru.CryptoPro.JCP.KeyStore.MutexInterface] */
    /* JADX WARN: Type inference failed for: r1v7, types: [ru.CryptoPro.JCP.KeyStore.MutexInterface, ru.CryptoPro.JCP.tools.LocalMutex] */
    public void saveCert(char[] cArr) throws KeyStoreException {
        ContainerEncoder containerEncoder = this.i;
        int i = this.d;
        if (i == 4) {
            try {
                if (this.f && !keyAbsent()) {
                    j(cArr, true);
                }
            } catch (IOException e) {
                throw new KeyStoreException(e);
            } catch (KeyException e2) {
                throw new KeyStoreException(e2);
            } catch (UnrecoverableKeyException e3) {
                throw new KeyStoreException(e3);
            }
        }
        GostKeyContainerName gostKeyContainerName = this.e;
        ?? asn1CharString = gostKeyContainerName != null ? gostKeyContainerName.containerName.toString() : 0;
        try {
            try {
                asn1CharString = e(containerEncoder.getReader(), asn1CharString);
                try {
                    u();
                    if (i == 2) {
                        containerEncoder.storeHeaderV2(this.b);
                    } else {
                        containerEncoder.storeHeaderV4(this.c);
                    }
                    containerEncoder.storeName(gostKeyContainerName);
                    asn1CharString.unlockFinally();
                } catch (Asn1Exception e4) {
                    throw j6a1.a(e4);
                } catch (IOException e5) {
                    throw j6a1.a(e5);
                } catch (KeyException e6) {
                    throw j6a1.a(e6);
                }
            } catch (IOException e7) {
                throw j6a1.a(e7);
            }
        } catch (Throwable th) {
            asn1CharString.unlockFinally();
            throw th;
        }
    }

    public boolean secondaryAbsent() {
        if (this.d == 2) {
            return this.b.keyContainerContent.secondaryPrivateKeyParameters == null;
        }
        CProKeyInfo cProKeyInfo = this.c.tbsCProKeyHeader.secondaryKey;
        return cProKeyInfo == null || cProKeyInfo.privateKeyParameters == null;
    }

    public void setContainerCertificateChain(boolean z, Certificate[] certificateArr) throws KeyStoreException {
        TBSCProKeyHeader tBSCProKeyHeader;
        Extensions extensions;
        GostKeyContainerContent gostKeyContainerContent;
        Extensions extensions2;
        Extension[] extensionArr;
        Extension[] extensionArr2;
        Asn1OpenType[] asn1OpenTypeArr;
        Extension extension;
        Asn1OctetString asn1OctetString;
        Asn1ObjectIdentifier asn1ObjectIdentifier = z ? new Asn1ObjectIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_extension_signature_trust_store) : new Asn1ObjectIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_extension_exchange_trust_store);
        if (certificateArr != null) {
            if (keyAbsent()) {
                throw new CertWithoutKeyException();
            }
            int i = this.d;
            Extensions extensions3 = i == 2 ? this.b.keyContainerContent.extensions : this.c.tbsCProKeyHeader.extensions;
            if (extensions3 == null || (extensionArr = extensions3.elements) == null || extensionArr.length == 0) {
                int length = certificateArr.length;
                if (i == 2) {
                    GostKeyContainer gostKeyContainer = this.b;
                    if (length > 1) {
                        gostKeyContainerContent = gostKeyContainer.keyContainerContent;
                        extensions2 = new Extensions(2);
                    } else {
                        gostKeyContainerContent = gostKeyContainer.keyContainerContent;
                        extensions2 = new Extensions(1);
                    }
                    gostKeyContainerContent.extensions = extensions2;
                } else {
                    CProKeyHeader cProKeyHeader = this.c;
                    if (length > 1) {
                        tBSCProKeyHeader = cProKeyHeader.tbsCProKeyHeader;
                        extensions = new Extensions(2);
                    } else {
                        tBSCProKeyHeader = cProKeyHeader.tbsCProKeyHeader;
                        extensions = new Extensions(1);
                    }
                    tBSCProKeyHeader.extensions = extensions;
                }
                Extension[] p = p(asn1ObjectIdentifier, true, certificateArr);
                for (int i2 = 0; i2 < p.length; i2++) {
                    if (i == 2) {
                        this.b.keyContainerContent.extensions.elements[i2] = p[i2];
                    } else {
                        this.c.tbsCProKeyHeader.extensions.elements[i2] = p[i2];
                    }
                }
                return;
            }
            int i3 = 0;
            boolean z2 = false;
            boolean z3 = false;
            int i4 = -1;
            while (true) {
                extensionArr2 = extensions3.elements;
                if (i3 >= extensionArr2.length) {
                    break;
                }
                if (extensionArr2[i3].extnID.equals(new Asn1ObjectIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_extension_intermidiate_store))) {
                    Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(extensions3.elements[i3].extnValue.value);
                    GostPrivateCertificateStore gostPrivateCertificateStore = new GostPrivateCertificateStore();
                    try {
                        gostPrivateCertificateStore.decode(asn1BerDecodeBuffer);
                        GostPrivateCertificateStore gostPrivateCertificateStore2 = new GostPrivateCertificateStore((certificateArr.length - 1) + gostPrivateCertificateStore.elements.length);
                        int i5 = 0;
                        while (true) {
                            asn1OpenTypeArr = gostPrivateCertificateStore.elements;
                            if (i5 >= asn1OpenTypeArr.length) {
                                break;
                            }
                            gostPrivateCertificateStore2.elements[i5] = asn1OpenTypeArr[i5];
                            i5++;
                        }
                        int length2 = asn1OpenTypeArr.length;
                        while (true) {
                            Asn1OpenType[] asn1OpenTypeArr2 = gostPrivateCertificateStore2.elements;
                            if (length2 >= asn1OpenTypeArr2.length) {
                                break;
                            }
                            asn1OpenTypeArr2[length2] = new Asn1OpenType(a(certificateArr[length2 - gostPrivateCertificateStore.elements.length]).value);
                            length2++;
                        }
                        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
                        try {
                            gostPrivateCertificateStore2.encode(asn1BerEncodeBuffer);
                            if (i == 2) {
                                extension = this.b.keyContainerContent.extensions.elements[i3];
                                asn1OctetString = new Asn1OctetString(asn1BerEncodeBuffer.getMsgCopy());
                            } else {
                                extension = this.c.tbsCProKeyHeader.extensions.elements[i3];
                                asn1OctetString = new Asn1OctetString(asn1BerEncodeBuffer.getMsgCopy());
                            }
                            extension.extnValue = asn1OctetString;
                            z2 = true;
                        } catch (Asn1Exception e) {
                            KeyStoreException keyStoreException = new KeyStoreException();
                            keyStoreException.initCause(e);
                            throw keyStoreException;
                        }
                    } catch (Asn1Exception e2) {
                        KeyStoreException keyStoreException2 = new KeyStoreException();
                        keyStoreException2.initCause(e2);
                        throw keyStoreException2;
                    } catch (IOException e3) {
                        KeyStoreException keyStoreException3 = new KeyStoreException();
                        keyStoreException3.initCause(e3);
                        throw keyStoreException3;
                    }
                }
                if (extensions3.elements[i3].extnID.equals(asn1ObjectIdentifier)) {
                    z3 = true;
                    i4 = i3;
                }
                i3++;
            }
            int length3 = extensionArr2.length;
            Extensions extensions4 = new Extensions((z2 || certificateArr.length <= 1) ? !z3 ? length3 + 1 : length3 : length3 + 2);
            Extension[] p2 = p(asn1ObjectIdentifier, !z2, certificateArr);
            for (int i6 = 0; i6 < length3; i6++) {
                extensions4.elements[i6] = extensions3.elements[i6];
            }
            if (z2 || certificateArr.length <= 1) {
                Extension[] extensionArr3 = extensions4.elements;
                if (z3) {
                    extensionArr3[i4] = p2[0];
                } else {
                    extensionArr3[length3] = p2[0];
                }
            } else {
                Extension[] extensionArr4 = extensions4.elements;
                extensionArr4[length3] = p2[1];
                if (z3) {
                    extensionArr4[i4] = p2[0];
                } else {
                    extensionArr4[length3 + 1] = p2[0];
                }
            }
            if (i == 2) {
                this.b.keyContainerContent.extensions = extensions4;
            } else {
                this.c.tbsCProKeyHeader.extensions = extensions4;
            }
        }
    }

    public void setExchange(PrivateKeyInterface privateKeyInterface, char[] cArr) throws IOException, UnrecoverableKeyException {
        try {
            if (this.f && !keyAbsent()) {
                j(cArr, true);
            }
            if (!keyAbsent() && !isPrimaryExchange()) {
                r(privateKeyInterface, true);
                return;
            }
            g(privateKeyInterface, true);
        } catch (KeyException e) {
            JCPLogger.warning(e.toString());
            throw j6a1.b(e);
        }
    }

    public void setExchangeCertificate(Certificate certificate) throws KeyStoreException, InvalidKeySpecException {
        if (keyAbsent()) {
            throw new CertWithoutKeyException();
        }
        boolean isPrimaryExchange = isPrimaryExchange();
        int i = this.d;
        if (isPrimaryExchange) {
            if (!m(certificate, 0)) {
                throw new CertificateValidityException();
            }
            if (i == 2) {
                this.b.keyContainerContent.primary_certificate = a(certificate);
                return;
            } else {
                CProKeyInfo cProKeyInfo = this.c.tbsCProKeyHeader.primaryKey;
                if (cProKeyInfo.publicKeyInfo == null) {
                    cProKeyInfo.publicKeyInfo = new CProPublicKeyInfo();
                }
                this.c.tbsCProKeyHeader.primaryKey.publicKeyInfo.set_certificate(a(certificate));
                return;
            }
        }
        if (secondaryAbsent()) {
            throw new CertWithoutKeyException();
        }
        if (!m(certificate, 1)) {
            throw new CertificateValidityException();
        }
        if (i == 2) {
            this.b.keyContainerContent.secondary_certificate = a(certificate);
        } else {
            CProKeyInfo cProKeyInfo2 = this.c.tbsCProKeyHeader.secondaryKey;
            if (cProKeyInfo2.publicKeyInfo == null) {
                cProKeyInfo2.publicKeyInfo = new CProPublicKeyInfo();
            }
            this.c.tbsCProKeyHeader.secondaryKey.publicKeyInfo.set_certificate(a(certificate));
        }
    }

    public void setSignature(PrivateKeyInterface privateKeyInterface, char[] cArr) throws IOException, UnrecoverableKeyException {
        try {
            if (this.f && !keyAbsent()) {
                j(cArr, true);
            }
            if (!keyAbsent() && isPrimaryExchange()) {
                r(privateKeyInterface, false);
                return;
            }
            g(privateKeyInterface, false);
        } catch (KeyException e) {
            JCPLogger.warning(e.toString());
            throw j6a1.b(e);
        }
    }

    public void setSignatureCertificate(Certificate certificate) throws KeyStoreException, InvalidKeySpecException {
        if (keyAbsent()) {
            throw new CertWithoutKeyException();
        }
        boolean isPrimaryExchange = isPrimaryExchange();
        int i = this.d;
        if (!isPrimaryExchange) {
            if (!m(certificate, 0)) {
                throw new CertificateValidityException();
            }
            if (i == 2) {
                this.b.keyContainerContent.primary_certificate = a(certificate);
                return;
            } else {
                CProKeyInfo cProKeyInfo = this.c.tbsCProKeyHeader.primaryKey;
                if (cProKeyInfo.publicKeyInfo == null) {
                    cProKeyInfo.publicKeyInfo = new CProPublicKeyInfo();
                }
                this.c.tbsCProKeyHeader.primaryKey.publicKeyInfo.set_certificate(a(certificate));
                return;
            }
        }
        if (secondaryAbsent()) {
            throw new CertWithoutKeyException();
        }
        if (!m(certificate, 1)) {
            throw new CertificateValidityException();
        }
        if (i == 2) {
            this.b.keyContainerContent.secondary_certificate = a(certificate);
        } else {
            CProKeyInfo cProKeyInfo2 = this.c.tbsCProKeyHeader.secondaryKey;
            if (cProKeyInfo2.publicKeyInfo == null) {
                cProKeyInfo2.publicKeyInfo = new CProPublicKeyInfo();
            }
            this.c.tbsCProKeyHeader.secondaryKey.publicKeyInfo.set_certificate(a(certificate));
        }
    }

    public final void t(PrivateKeyInterface privateKeyInterface, boolean z) {
        Extension[] extensionArr;
        int i = this.d;
        Extensions extensions = i == 2 ? this.b.keyContainerContent.extensions : this.c.tbsCProKeyHeader.extensions;
        Extension[] extensions2 = privateKeyInterface.getExtensions();
        if (extensions2 == null || extensions2.length <= 0) {
            return;
        }
        Extension extension = privateKeyInterface.getExtension(z ? new Asn1ObjectIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_extension_exchange_key_usage_period) : new Asn1ObjectIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_extension_signature_key_usage_period));
        Extension extension2 = privateKeyInterface.getExtension(new Asn1ObjectIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_extension_key_time_validity_control_mode));
        LinkedList<Extension> linkedList = new LinkedList();
        if (extension != null) {
            linkedList.add(extension);
        }
        if (extension2 != null) {
            linkedList.add(extension2);
        }
        if (linkedList.isEmpty()) {
            return;
        }
        if (extensions == null || (extensionArr = extensions.elements) == null || extensionArr.length == 0) {
            Extensions extensions3 = new Extensions((Extension[]) linkedList.toArray(new Extension[linkedList.size()]));
            if (i == 2) {
                this.b.keyContainerContent.extensions = extensions3;
                return;
            } else {
                this.c.tbsCProKeyHeader.extensions = extensions3;
                return;
            }
        }
        LinkedList linkedList2 = new LinkedList(Arrays.asList(extensions.elements));
        HashSet hashSet = new HashSet();
        Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            Asn1ObjectIdentifier asn1ObjectIdentifier = ((Extension) it.next()).extnID;
            for (Extension extension3 : linkedList) {
                if (!extension3.extnID.equals(asn1ObjectIdentifier)) {
                    hashSet.add(extension3);
                }
            }
        }
        linkedList2.addAll(hashSet);
        Extensions extensions4 = new Extensions((Extension[]) linkedList2.toArray(new Extension[linkedList2.size()]));
        if (i == 2) {
            this.b.keyContainerContent.extensions = extensions4;
        } else {
            this.c.tbsCProKeyHeader.extensions = extensions4;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append("CryptoPro Container Key:");
        if (keyAbsent()) {
            stringBuffer.append("No avaible keys");
        } else {
            stringBuffer.append(HexString.CHAR_SPACE);
            if (isPrimaryExchange()) {
                stringBuffer.append("Exchange");
            } else {
                stringBuffer.append(XAdESSignature.ELEMENT_SIGNATURE);
            }
            if (!secondaryAbsent()) {
                stringBuffer.append(HexString.CHAR_SPACE);
                if (isPrimaryExchange()) {
                    stringBuffer.append(XAdESSignature.ELEMENT_SIGNATURE);
                } else {
                    stringBuffer.append("Exchange");
                }
            }
        }
        return stringBuffer.toString();
    }

    public final void u() {
        if (this.d == 2) {
            this.b.hmacKeyContainerContent = new Gost28147_89_MAC(x());
            return;
        }
        TBSCProKeyHeader tBSCProKeyHeader = this.c.tbsCProKeyHeader;
        boolean isSet = tBSCProKeyHeader.attributes.isSet(2);
        CProKeyHeader cProKeyHeader = this.c;
        if (isSet) {
            cProKeyHeader.signatureAlgorithm = new AlgorithmIdentifier(_GostR3411_2012_DigestSyntaxValues.id_tc26_gost3411_2012_256);
            byte[] w = w();
            this.c.signature = new Asn1BitString(w.length << 3, w);
            return;
        }
        cProKeyHeader.signatureAlgorithm = tBSCProKeyHeader.primaryKey.privateKeyParameters.privateKeyAlgorithm;
        byte[] v = v();
        this.c.signature = new Asn1BitString(v.length << 3, v);
    }

    public final byte[] v() {
        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
        this.c.tbsCProKeyHeader.encode(asn1BerEncodeBuffer);
        byte[] msgCopy = asn1BerEncodeBuffer.getMsgCopy();
        PrivateKeyInterface[] privateKeyInterfaceArr = this.a;
        if (privateKeyInterfaceArr[0] == null) {
            throw new KeyException("Container not loaded");
        }
        try {
            GostPrivateKey gostPrivateKey = new GostPrivateKey(privateKeyInterfaceArr[0]);
            Signature signature = Signature.getInstance(b(gostPrivateKey));
            signature.initSign(gostPrivateKey);
            signature.update(msgCopy);
            return signature.sign();
        } catch (NoSuchAlgorithmException e) {
            throw new KeyException(e);
        } catch (SignatureException e2) {
            throw new KeyException(e2);
        } catch (InvalidKeySpecException e3) {
            throw new KeyException(e3);
        }
    }

    public final byte[] w() {
        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
        this.c.tbsCProKeyHeader.encode(asn1BerEncodeBuffer);
        byte[] msgCopy = asn1BerEncodeBuffer.getMsgCopy();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(JCP.GOST_DIGEST_2012_256_NAME);
            messageDigest.update(msgCopy);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new KeyException(e);
        }
    }

    public void writeSpec(wu61 wu61Var, byte[] bArr, byte[] bArr2, wu61 wu61Var2, char[] cArr, int i) throws IOException, KeyStoreException, KeyException {
        byte[] bArr3;
        ContainerEncoder containerEncoder = this.i;
        GostPrivateMasks gostPrivateMasks = new GostPrivateMasks();
        AlgIdInterface algidSpec = getAlgidSpec(0);
        int i2 = isLongGost2012(algidSpec) ? 16 : 8;
        try {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, bArr.length - 32, 32, (CryptParamsInterface) algidSpec.getCryptParams());
                byte[] computeContainerImito = secretKeySpec.computeContainerImito(bArr2, (CryptParamsInterface) algidSpec.getCryptParams());
                secretKeySpec.clear();
                gostPrivateMasks.hmacRandom = new Gost28147_89_MAC(computeContainerImito);
                gostPrivateMasks.randomStatus = new Asn1OctetString(bArr2);
                gostPrivateMasks.mask = new Gost28147_89_Key(bArr);
                containerEncoder.storeMasks(gostPrivateMasks, i);
                int[] iArr = new int[i2];
                int[] iArr2 = new int[i2];
                try {
                    try {
                        SecretKeySpec secretKeySpec2 = new SecretKeySpec(cArr, bArr2, algidSpec.getDigestParams(), (AlgIdInterface) null);
                        int[] commutator = ((CryptParamsInterface) algidSpec.getCryptParams()).getCommutator();
                        secretKeySpec2.contextEncrypt(wu61Var, commutator, iArr);
                        byte[] byteArray = Array.toByteArray(iArr);
                        GostPrivateKeys gostPrivateKeys = new GostPrivateKeys();
                        gostPrivateKeys.primaryKey = new Gost28147_89_Key(byteArray);
                        if (wu61Var2 != null) {
                            secretKeySpec2.contextEncrypt(wu61Var2, commutator, iArr2);
                            gostPrivateKeys.secondaryKey = new Gost28147_89_Key(Array.toByteArray(iArr2));
                        }
                        containerEncoder.storePrimary(gostPrivateKeys, i);
                        secretKeySpec2.clear();
                        Array.clear(iArr);
                        Array.clear(iArr2);
                    } catch (Throwable th) {
                        Array.clear(iArr);
                        Array.clear(iArr2);
                        throw th;
                    }
                } catch (Asn1Exception e) {
                    throw j6a1.a(e);
                }
            } catch (Asn1Exception e2) {
                throw j6a1.a(e2);
            }
        } finally {
            Gost28147_89_Key gost28147_89_Key = gostPrivateMasks.mask;
            if (gost28147_89_Key != null && (bArr3 = gost28147_89_Key.value) != null) {
                Array.clear(bArr3);
            }
        }
    }

    public final byte[] x() {
        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
        this.b.keyContainerContent.encode(asn1BerEncodeBuffer);
        AlgIdInterface algidSpec = getAlgidSpec(0);
        int i = isLongGost2012(algidSpec) ? 64 : 32;
        byte[] msgCopy = asn1BerEncodeBuffer.getMsgCopy();
        byte[] bArr = new byte[i];
        Array.clear(bArr);
        CryptParamsInterface cryptParamsInterface = (CryptParamsInterface) algidSpec.getCryptParams();
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, cryptParamsInterface);
        CProPrivateKeyParameters cProPrivateKeyParameters = this.b.keyContainerContent.primaryPrivateKeyParameters;
        if (cProPrivateKeyParameters == null) {
            throw new KeyException("The store does not contain private keys.");
        }
        OID oid = new OID(cProPrivateKeyParameters.privateKeyAlgorithm.algorithm.value);
        if (!oid.equals(AlgIdSpec.OID_PARAMS_SIG_2012_256) && !oid.equals(AlgIdSpec.OID_PARAMS_SIG_2012_512) && !oid.equals(AlgIdSpec.OID_PARAMS_EXC_2012_256) && !oid.equals(AlgIdSpec.OID_PARAMS_EXC_2012_512)) {
            cryptParamsInterface = CryptParamsSpec.getInstance(1);
        }
        return secretKeySpec.computeContainerImito(msgCopy, cryptParamsInterface);
    }

    public String getContainerName() throws IOException {
        GostKeyContainerName gostKeyContainerName = this.e;
        return gostKeyContainerName == null ? c(this.i.getReader()) : gostKeyContainerName.containerName.toString();
    }

    public CPKeyContainer(ContainerReaderInterface containerReaderInterface, String str) {
        this.a = new PrivateKeyInterface[2];
        this.b = null;
        this.c = null;
        this.g = false;
        this.h = new Object();
        this.e = new GostKeyContainerName(str);
        this.b = q();
        this.d = 2;
        this.f = false;
        this.i = new ContainerEncoder(containerReaderInterface);
    }
}
