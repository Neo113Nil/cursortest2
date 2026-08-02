package ru.CryptoPro.JCSP.Key;

import com.objsys.asn1j.runtime.Asn1ObjectIdentifier;
import defpackage.dy31;
import defpackage.ny61;
import java.security.AccessController;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.crypto.SecretKey;
import javax.security.auth.DestroyFailedException;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.Extension;
import ru.CryptoPro.JCP.Key.InternalGostPublicKey;
import ru.CryptoPro.JCP.Key.PublicKeyInterface;
import ru.CryptoPro.JCP.Key.SecretKeyInterface;
import ru.CryptoPro.JCP.KeyStore.InvalidPasswordException;
import ru.CryptoPro.JCP.KeyStore.KeyIsNotExportableException;
import ru.CryptoPro.JCP.Sign.SignValue;
import ru.CryptoPro.JCP.params.AlgIdInterface;
import ru.CryptoPro.JCP.params.CryptParamsInterface;
import ru.CryptoPro.JCP.params.DigestParamsSpec;
import ru.CryptoPro.JCP.params.DiversKeyBase;
import ru.CryptoPro.JCP.params.DiversKeyInterface;
import ru.CryptoPro.JCP.params.EllipticParamsInterface;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.params.ParamsInterface;
import ru.CryptoPro.JCP.spec.NameAlgIdSpec;
import ru.CryptoPro.JCP.spec.NameAlgIdSpecForeign;
import ru.CryptoPro.JCP.spec.ProviderParameterInterface;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.CPString;
import ru.CryptoPro.JCP.tools.Platform;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.Key.AlgorithmGroups;
import ru.CryptoPro.JCSP.Key.foreign.JCSPForeignSecretKeySpec;
import ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase;
import ru.CryptoPro.JCSP.MSCAPI.CAPI;
import ru.CryptoPro.JCSP.MSCAPI.HContainer;
import ru.CryptoPro.JCSP.MSCAPI.HHash;
import ru.CryptoPro.JCSP.MSCAPI.HKey;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.ReaderInfo;
import ru.CryptoPro.JCSP.Random.JCSPCPRandom;
import ru.CryptoPro.JCSP.Sign.GostSignature;

/* loaded from: classes4.dex */
public abstract class AbstractKeySpec implements DiversKeyInterface, JCSPForgetKeyPasswordInterface, JCSPPrivateKeyInterface, JCSPSignatureKeyPreHashInterface {
    public static final String BUNDLE_NAME = "ru.CryptoPro.JCP.tools.resources.checker";
    public static final int KEY_AVAILABLE_WITHOUT_PASSWORD = 1;
    public static final int KEY_AVAILABLE_WITH_PASSWORD = 0;
    public static final int KEY_UNAVAILABLE = -1;
    private static final int RANDOM_NAME_SEQ_LENGTH = 16;
    protected static final String STR_ENCRYPT_NOT_SUPPORT;
    private static final String STR_LICENSE_CHECK_FAILED;
    private static final String STR_LICENSE_CHECK_FAILED_NO_CERT;
    public static final ResourceBundle resource;
    private boolean alreadyCheckJavaCSPLicense;
    private boolean alreadyCreated;
    protected CryptParamsInterface cachedCryptParams;
    private boolean checkJavaCSPLicenseFailed;
    private HContainer container;
    private boolean cryptAllowDh;
    protected volatile transient boolean destroyed;
    private boolean exportable;
    private volatile List extensionList;
    protected HKey insideKey;
    private AlgorithmGroups.KeyAlgorithmGroup keyAlgorithmGroup;
    private int keyLength;
    protected String keyName;
    private final Object mutexLicense;
    protected AlgIdInterface params;
    private boolean userProtected;
    private boolean willBeDeleted;

    static {
        ResourceBundle bundle = ResourceBundle.getBundle("ru.CryptoPro.JCP.tools.resources.checker", Locale.getDefault());
        resource = bundle;
        STR_LICENSE_CHECK_FAILED = bundle.getString("license.check.failed");
        STR_LICENSE_CHECK_FAILED_NO_CERT = bundle.getString("license.check.failed.no_cert");
        STR_ENCRYPT_NOT_SUPPORT = bundle.getString("encrypt.not.support");
    }

    public AbstractKeySpec(AlgIdInterface algIdInterface, boolean z, boolean z2, boolean z3) {
        String str = null;
        this.params = null;
        this.cachedCryptParams = null;
        this.alreadyCreated = false;
        this.willBeDeleted = false;
        this.exportable = true;
        this.cryptAllowDh = false;
        this.extensionList = null;
        this.keyLength = 0;
        this.keyAlgorithmGroup = AlgorithmGroups.KeyAlgorithmGroup.Unknown;
        this.destroyed = false;
        JCSPLogger.subEnter();
        this.params = algIdInterface;
        this.keyName = null;
        if (algIdInterface != null && algIdInterface.getOID() != null) {
            this.keyAlgorithmGroup = AlgorithmGroups.a(this.params.getOID());
        }
        this.alreadyCheckJavaCSPLicense = false;
        this.checkJavaCSPLicenseFailed = true;
        this.mutexLicense = new Object();
        AlgIdInterface algIdInterface2 = this.params;
        if (algIdInterface2 instanceof ProviderParameterInterface) {
            boolean isOnlyStoreType = ((ProviderParameterInterface) algIdInterface2).isOnlyStoreType();
            ProviderParameterInterface providerParameterInterface = (ProviderParameterInterface) this.params;
            if (isOnlyStoreType) {
                str = providerParameterInterface.getName();
            } else {
                this.keyName = providerParameterInterface.getName();
            }
        }
        if (!z3 && this.keyName == null) {
            this.keyName = a(str);
            this.willBeDeleted = true;
        }
        this.container = new HContainer(this.keyName);
        this.exportable = z;
        this.cryptAllowDh = z2;
        f();
        JCSPLogger.subExit();
    }

    private String a(String str) {
        JCSPCPRandom jCSPCPRandom = new JCSPCPRandom();
        int nextInt = jCSPCPRandom.nextInt() & 31;
        byte[] bArr = new byte[nextInt + 16];
        jCSPCPRandom.engineNextBytes(bArr);
        return getRandomName(str).concat(Array.toHexString(bArr, nextInt)).replaceAll(" ", "");
    }

    private void b() {
        if (Platform.isAndroid) {
            return;
        }
        synchronized (this.mutexLicense) {
            try {
                if (!this.alreadyCheckJavaCSPLicense) {
                    try {
                        JCSPLogger.finer("Check Java CSP license...");
                        AccessController.doPrivileged(new cl_0(this));
                        this.checkJavaCSPLicenseFailed = false;
                        JCSPLogger.finer("Java CSP license has been checked.");
                        this.alreadyCheckJavaCSPLicense = true;
                    } catch (Exception e) {
                        throw new ProviderException(STR_LICENSE_CHECK_FAILED, e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Extension c() {
        JCSPLogger.subEnter();
        if (this.destroyed) {
            ny61.r("The key has been destroyed.");
            return null;
        }
        JCSPLogger.subExit();
        return this.container.getCertExtension(this.insideKey, new Asn1ObjectIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_extension_key_time_validity_control_mode));
    }

    public static void copy(AbstractKeySpec abstractKeySpec, AbstractKeySpec abstractKeySpec2) throws CloneNotSupportedException {
        abstractKeySpec2.alreadyCheckJavaCSPLicense = abstractKeySpec.alreadyCheckJavaCSPLicense;
        abstractKeySpec2.checkJavaCSPLicenseFailed = abstractKeySpec.checkJavaCSPLicenseFailed;
        abstractKeySpec2.exportable = abstractKeySpec.exportable;
        abstractKeySpec2.willBeDeleted = abstractKeySpec.willBeDeleted;
        abstractKeySpec2.cryptAllowDh = abstractKeySpec.cryptAllowDh;
        abstractKeySpec2.alreadyCreated = abstractKeySpec.alreadyCreated;
        abstractKeySpec2.userProtected = abstractKeySpec.userProtected;
        abstractKeySpec2.destroyed = abstractKeySpec.destroyed;
        if (abstractKeySpec.extensionList != null) {
            abstractKeySpec2.extensionList = new LinkedList();
            abstractKeySpec2.extensionList.addAll(abstractKeySpec.extensionList);
        }
        abstractKeySpec2.container = abstractKeySpec.container;
        abstractKeySpec2.keyLength = abstractKeySpec.keyLength;
        abstractKeySpec2.keyAlgorithmGroup = abstractKeySpec.keyAlgorithmGroup;
        abstractKeySpec2.cachedCryptParams = abstractKeySpec.cachedCryptParams;
    }

    public static synchronized AbstractKeySpec copyOtherForeignKey(ReaderInfo readerInfo, ru.CryptoPro.JCSP.KeyStore.cl_0 cl_0Var, byte[] bArr, boolean z, byte[] bArr2, String str, byte[] bArr3, boolean z2, boolean z3) throws KeyIsNotExportableException, UnrecoverableKeyException {
        AbstractEncryptionKeySpec privateKeySpec;
        AbstractEncryptionKeySpec abstractEncryptionKeySpec;
        synchronized (AbstractKeySpec.class) {
            try {
                JCSPLogger.subEnter();
                HKey copyOtherForeignKey = HContainer.copyOtherForeignKey(cl_0Var, readerInfo, new ContainerPassword(bArr), str, bArr3, z2, z, new ContainerPassword(bArr2), z3);
                HContainer hContainer = new HContainer(cl_0Var.d());
                int keyAlg = copyOtherForeignKey.getKeyAlg();
                if (keyAlg == 8707 || keyAlg == 8736 || keyAlg == 9216) {
                    AlgIdInterface parameters = hContainer.getParameters(copyOtherForeignKey, 2);
                    privateKeySpec = new PrivateKeySpec(new NameAlgIdSpec(parameters.getOID(), parameters.getSignParams(), parameters.getDigestParams(), parameters.getCryptParams(), cl_0Var.d()), true, false, false);
                } else if (keyAlg == 41984 || keyAlg == 43525) {
                    AlgIdInterface parameters2 = hContainer.getParameters(copyOtherForeignKey, 1);
                    privateKeySpec = new ExchPrivateKeySpec(new NameAlgIdSpec(parameters2.getOID(), parameters2.getSignParams(), parameters2.getDigestParams(), parameters2.getCryptParams(), cl_0Var.d()), true, false, false);
                } else {
                    abstractEncryptionKeySpec = new JCSPForeignSecretKeySpec(hContainer.getParameters(copyOtherForeignKey, -2147483643), z3);
                    abstractEncryptionKeySpec.f();
                    abstractEncryptionKeySpec.insideKey = copyOtherForeignKey;
                    ((AbstractKeySpec) abstractEncryptionKeySpec).keyAlgorithmGroup = copyOtherForeignKey.getKeyAlgorithmGroup();
                    ((AbstractKeySpec) abstractEncryptionKeySpec).alreadyCreated = true;
                    JCSPLogger.subExit();
                }
                abstractEncryptionKeySpec = privateKeySpec;
                abstractEncryptionKeySpec.f();
                abstractEncryptionKeySpec.insideKey = copyOtherForeignKey;
                ((AbstractKeySpec) abstractEncryptionKeySpec).keyAlgorithmGroup = copyOtherForeignKey.getKeyAlgorithmGroup();
                ((AbstractKeySpec) abstractEncryptionKeySpec).alreadyCreated = true;
                JCSPLogger.subExit();
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractEncryptionKeySpec;
    }

    private Extension d() {
        JCSPLogger.subEnter();
        if (this.destroyed) {
            ny61.r("The key has been destroyed.");
            return null;
        }
        JCSPLogger.subExit();
        return this.container.getCertExtension(this.insideKey, a(getKeyType()));
    }

    private void e() {
        if (this.extensionList == null) {
            synchronized (this) {
                try {
                    if (this.extensionList == null) {
                        ArrayList arrayList = new ArrayList();
                        Extension d = d();
                        if (d != null) {
                            arrayList.add(d);
                        }
                        Extension c = c();
                        if (c != null) {
                            arrayList.add(c);
                        }
                        this.extensionList = arrayList;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void f() {
        this.userProtected = false;
        this.alreadyCreated = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    private int g() {
        boolean z = this.exportable;
        ?? r0 = z;
        if (this.userProtected) {
            r0 = (z ? 1 : 0) | 2;
        }
        return this.cryptAllowDh ? r0 | 8192 : r0;
    }

    private void h() {
        if (shouldBeDeleted()) {
            this.container.clear(this.insideKey);
            this.insideKey = null;
            a();
        }
    }

    public static int isKeyAvailable(String str, String str2, ReaderInfo readerInfo, char[] cArr, int i) {
        Exception exc;
        byte[] array = cArr == null ? null : CPString.getArray(new String(cArr));
        HProv provider = HProv.getProvider(i);
        if (str == null) {
            str = readerInfo.getProviderName(i);
        }
        String str3 = str;
        ContainerPassword containerPassword = new ContainerPassword(array, null);
        try {
            try {
                if (array == null) {
                    provider.openContainer(str2, str3, null, 64, true);
                    provider.releaseContext(7);
                    return 1;
                }
                provider.openContainerWithSetPin(str2, str3, containerPassword, 64, true);
                provider.releaseContext(7);
                return 0;
            } catch (Throwable th) {
                provider.releaseContext(7);
                throw th;
            }
        } catch (InvalidPasswordException e) {
            exc = e;
            JCSPLogger.ignoredException(exc);
            provider.releaseContext(7);
            return -1;
        } catch (Exception e2) {
            exc = e2;
            JCSPLogger.ignoredException(exc);
            provider.releaseContext(7);
            return -1;
        }
    }

    public static AbstractKeySpec read(AlgIdInterface algIdInterface, String str, int i, String str2, ReaderInfo readerInfo, boolean z, byte[] bArr, boolean z2, boolean z3, boolean z4) throws ProviderException, UnrecoverableKeyException, InvalidPasswordException {
        AbstractKeySpec jCSPForeignSecretKeySpec;
        JCSPLogger.subEnter();
        HContainer hContainer = new HContainer(str);
        try {
            HKey open = hContainer.open(algIdInterface, str2, readerInfo, i, z, new ContainerPassword(bArr, null), z2, z4);
            int keyAlg = open.getKeyAlg();
            if (i == -2147483643) {
                jCSPForeignSecretKeySpec = open.isForeignKey() ? new JCSPForeignSecretKeySpec(algIdInterface, str) : keyAlg != 26160 ? keyAlg != 26161 ? new JCSPSecretKeySpec(algIdInterface, str) : new JCSPSecretKeySpecK(algIdInterface, str) : new JCSPSecretKeySpecM(algIdInterface, str);
            } else if (i == 1) {
                jCSPForeignSecretKeySpec = new ExchPrivateKeySpec(algIdInterface, str);
            } else {
                if (i != 2) {
                    throw new UnrecoverableKeyException("Invalid key type: " + i);
                }
                jCSPForeignSecretKeySpec = new PrivateKeySpec(algIdInterface, str);
            }
            jCSPForeignSecretKeySpec.insideKey = open;
            jCSPForeignSecretKeySpec.keyAlgorithmGroup = open.getKeyAlgorithmGroup();
            jCSPForeignSecretKeySpec.destroyed = false;
            if (z3) {
                jCSPForeignSecretKeySpec.b();
            }
            jCSPForeignSecretKeySpec.params = hContainer.getParameters(open, i);
            jCSPForeignSecretKeySpec.alreadyCreated = true;
            JCSPLogger.subExit();
            return jCSPForeignSecretKeySpec;
        } catch (ProviderException e) {
            hContainer.clear(null);
            throw e;
        } catch (UnrecoverableKeyException e2) {
            hContainer.clear(null);
            throw e2;
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public void addExtension(Extension extension) {
        if (extension == null) {
            return;
        }
        e();
        Iterator it = this.extensionList.iterator();
        while (it.hasNext()) {
            if (((Extension) it.next()).extnID.equals(extension.extnID)) {
                return;
            }
        }
        this.extensionList.add(extension);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public boolean checkFP(byte[] bArr, int i) throws InvalidKeyException {
        return false;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public void clear() {
        f();
        HContainer hContainer = this.container;
        if (hContainer != null) {
            hContainer.clear(this.insideKey);
            this.insideKey = null;
        }
    }

    @Override // ru.CryptoPro.JCP.params.DiversKeyInterface, ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public synchronized AbstractKeySpec copyKey(ReaderInfo readerInfo, int i, ru.CryptoPro.JCSP.KeyStore.cl_0 cl_0Var, byte[] bArr, boolean z, byte[] bArr2, boolean z2, boolean z3) throws KeyIsNotExportableException, UnrecoverableKeyException {
        AbstractKeySpec jCSPSecretKeySpec;
        AbstractKeySpec abstractKeySpec;
        try {
            JCSPLogger.subEnter();
            if (this.destroyed) {
                throw new UnrecoverableKeyException("The key has been destroyed.");
            }
            if (this.container.isEqualName(this.insideKey, cl_0Var.d(), readerInfo, cl_0Var.a(), i)) {
                if (z) {
                    HContainer.changePassword(this.insideKey, new ContainerPassword(bArr2));
                }
                abstractKeySpec = this;
            } else {
                int keyType = getKeyType();
                if (keyType == 2) {
                    jCSPSecretKeySpec = new PrivateKeySpec(new NameAlgIdSpec(this.params.getOID(), this.params.getSignParams(), this.params.getDigestParams(), this.params.getCryptParams(), cl_0Var.d()), true, this.cryptAllowDh, false);
                } else if (keyType == 1) {
                    jCSPSecretKeySpec = new ExchPrivateKeySpec(new NameAlgIdSpec(this.params.getOID(), this.params.getSignParams(), this.params.getDigestParams(), this.params.getCryptParams(), cl_0Var.d()), true, this.cryptAllowDh, false);
                } else if (isForeignKey()) {
                    jCSPSecretKeySpec = new JCSPForeignSecretKeySpec(new NameAlgIdSpecForeign(this.params.getOID(), cl_0Var.d()), z2);
                } else {
                    int keyAlg = this.insideKey.getKeyAlg();
                    jCSPSecretKeySpec = keyAlg != 26160 ? keyAlg != 26161 ? new JCSPSecretKeySpec(new NameAlgIdSpec(cl_0Var.d()), z2) : new JCSPSecretKeySpecK(new NameAlgIdSpec(cl_0Var.d()), z2) : new JCSPSecretKeySpecM(new NameAlgIdSpec(cl_0Var.d()), z2);
                }
                abstractKeySpec = jCSPSecretKeySpec;
                abstractKeySpec.f();
                abstractKeySpec.insideKey = this.container.copy(this.insideKey, cl_0Var, readerInfo, new ContainerPassword(bArr), getKeyType(), z, new ContainerPassword(bArr2), z2, z3);
                abstractKeySpec.keyAlgorithmGroup = getKeyAlgorithmGroup();
                abstractKeySpec.container = new HContainer(cl_0Var.d());
                abstractKeySpec.alreadyCreated = true;
                abstractKeySpec.params = this.container.getParameters(abstractKeySpec.insideKey, abstractKeySpec.getKeyType());
                Extension extension = getExtension(a(abstractKeySpec.getKeyType()));
                if (extension != null) {
                    abstractKeySpec.container.setCertExtension(abstractKeySpec.insideKey, new OID(extension.extnID.value).toString(), extension.critical.value, extension.extnValue.value);
                }
                abstractKeySpec.a();
            }
            JCSPLogger.subExit();
        } catch (Throwable th) {
            throw th;
        }
        return abstractKeySpec;
    }

    public AbstractKeySpec create(KeyStoreConfigBase keyStoreConfigBase, byte[] bArr, boolean z, int i, String str, boolean z2) throws UnrecoverableKeyException {
        JCSPLogger.subEnter();
        boolean z3 = bArr != null || z;
        ContainerPassword containerPassword = z3 ? new ContainerPassword(bArr) : this.willBeDeleted ? new ContainerPassword() : null;
        boolean z4 = z3 || this.willBeDeleted;
        int keyType = getKeyType();
        HKey create = this.container.create(keyType == -2147483643 ? i : keyType, g(), this.keyLength, this.params, z4, containerPassword, keyStoreConfigBase, str, z2);
        this.insideKey = create;
        this.keyAlgorithmGroup = create.getKeyAlgorithmGroup();
        this.alreadyCreated = true;
        this.destroyed = false;
        JCSPLogger.subExit();
        return this;
    }

    public AbstractKeySpec createEPH(int i) throws UnrecoverableKeyException {
        JCSPLogger.subEnter();
        HKey createEPH = this.container.createEPH(i, getKeyType(), g(), this.params);
        this.insideKey = createEPH;
        AlgIdInterface parameters = this.container.getParameters(createEPH, getKeyType());
        boolean equals = parameters.getOID().equals(this.params.getOID());
        boolean equals2 = parameters.getSignParams().getOID().equals(this.params.getSignParams().getOID());
        boolean equals3 = (parameters.getDigestParams() == null || this.params.getDigestParams() == null) ? parameters.getDigestParams() == null && this.params.getDigestParams() == null : parameters.getDigestParams().getOID().equals(this.params.getDigestParams().getOID());
        boolean equals4 = (parameters.getCryptParams() == null || this.params.getCryptParams() == null) ? parameters.getCryptParams() == null && this.params.getCryptParams() == null : parameters.getCryptParams().getOID().equals(this.params.getCryptParams().getOID());
        if (!equals || !equals2 || !equals3 || !equals4) {
            this.params = parameters;
        }
        this.keyAlgorithmGroup = this.insideKey.getKeyAlgorithmGroup();
        this.alreadyCreated = true;
        this.destroyed = false;
        JCSPLogger.subExit();
        return this;
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() throws DestroyFailedException {
        if (this.destroyed) {
            return;
        }
        h();
        clear();
        this.destroyed = true;
    }

    @Override // ru.CryptoPro.JCP.params.DiversKeyInterface
    public SecretKey diversKeyByBlob(int i, DiversKeyBase diversKeyBase) {
        if (this.destroyed) {
            ny61.r("The key has been destroyed.");
            return null;
        }
        try {
            this.insideKey.readLock();
            HKey makeDiversKey = this.container.makeDiversKey(this.insideKey, i, diversKeyBase);
            return new GostSecretKey(JCSPSecretKeySpec.getInstance(makeDiversKey, makeDiversKey.getKeyAlg()));
        } finally {
            this.insideKey.readUnlock();
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public SecretKeyInterface doDHPhase(PublicKeyInterface publicKeyInterface, byte[] bArr) throws InvalidKeyException, KeyManagementException {
        if (this.destroyed) {
            dy31.v("The key has been destroyed.");
            return null;
        }
        if (this.alreadyCreated) {
            return new JCSPAgreeSecretKeySpec(this.container.makeDHSessionKey(this.insideKey, publicKeyInterface));
        }
        throw new KeyManagementException("Key is not created.");
    }

    public void finalize() throws Throwable {
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPForgetKeyPasswordInterface
    public void forget() {
        if (this.destroyed) {
            ny61.r("The key has been destroyed.");
            return;
        }
        HContainer hContainer = this.container;
        if (hContainer != null) {
            hContainer.forgetPassword(this.insideKey);
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public JCSPPublicKeyInterface generatePublic() throws InvalidKeyException {
        if (this.destroyed) {
            dy31.v("The key has been destroyed.");
            return null;
        }
        if (!this.alreadyCreated) {
            return null;
        }
        try {
            return new PublicKeySpec(new PublicKeyBlob(this.container.genPublic(this.insideKey), getKeyType() == 2), true);
        } catch (InvalidAlgorithmParameterException e) {
            dy31.s(e);
            return null;
        }
    }

    public HContainer getContainer() {
        return this.container;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public Extension getExtension(Asn1ObjectIdentifier asn1ObjectIdentifier) {
        e();
        for (Extension extension : this.extensionList) {
            if (extension.extnID.equals(asn1ObjectIdentifier)) {
                return extension;
            }
        }
        return null;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public Extension[] getExtensions() {
        e();
        return (Extension[]) this.extensionList.toArray(new Extension[this.extensionList.size()]);
    }

    public HKey getKey() {
        return this.insideKey;
    }

    public AlgorithmGroups.KeyAlgorithmGroup getKeyAlgorithmGroup() {
        return this.keyAlgorithmGroup;
    }

    public int getKeyLength() {
        if (this.destroyed) {
            ny61.r("The key has been destroyed.");
            return 0;
        }
        HContainer hContainer = this.container;
        if (hContainer != null) {
            this.keyLength = hContainer.getKeyLength(this.insideKey);
        }
        return this.keyLength;
    }

    public abstract int getKeyType();

    @Override // ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public ParamsInterface getParams() {
        if (!isSecretKey() || this.container == null) {
            return this.params;
        }
        if (this.destroyed) {
            ny61.r("The key has been destroyed.");
            return null;
        }
        if (this.cachedCryptParams == null) {
            this.cachedCryptParams = this.container.getCryptParams(this.insideKey);
        }
        return this.cachedCryptParams;
    }

    public String getRandomName(String str) {
        return AlgorithmGroups.c(getKeyAlgorithmGroup()).defKeyStorePrefix(str).concat("JCPKEY");
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.destroyed;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public boolean isDhAllowed() {
        return false;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public boolean isExportable() {
        if (this.destroyed) {
            ny61.r("The key has been destroyed.");
            return false;
        }
        if (this.alreadyCreated) {
            this.exportable = this.container.isExportable(this.insideKey);
        }
        return this.exportable;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface
    public boolean isForeignKey() {
        return AlgorithmGroups.a(getKeyAlgorithmGroup());
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public boolean isPreExportable() {
        return this.exportable;
    }

    public boolean isSecretKey() {
        return getKeyType() == -2147483643;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public boolean isUserProtected() {
        return false;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public boolean match(PublicKey publicKey, String str) throws Exception {
        if (publicKey == null) {
            return false;
        }
        if (this.destroyed) {
            ny61.r("The key has been destroyed.");
            return false;
        }
        byte[] encode = publicKey instanceof InternalGostPublicKey ? ((PublicKeyInterface) ((InternalGostPublicKey) publicKey).getSpec()).encode() : new PublicKeySpec(publicKey.getEncoded(), false).encode();
        byte[] key = new PublicKeyBlob(this.container.genPublic(this.insideKey), getKeyType() == 2).getKey();
        return (key == null || encode == null || !Array.compare(key, encode)) ? false : true;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPSignatureKeyPreHashInterface
    public HHash prepareHash(int i, DigestParamsSpec digestParamsSpec, boolean z) {
        if (!this.destroyed) {
            return this.insideKey.prepareHash(i, null, digestParamsSpec, z || HKey.USE_LOCAL_HASH_CONTEXT);
        }
        ny61.r("The key has been destroyed.");
        return null;
    }

    public void setAllCertificates(Certificate[] certificateArr) throws KeyStoreException {
        if (this.destroyed) {
            dy31.t("The key has been destroyed.");
        } else {
            this.container.setAllCertificates(this.insideKey, certificateArr, getKeyType());
        }
    }

    public void setCertificate(Certificate certificate) throws KeyException {
        if (this.destroyed) {
            dy31.v("The key has been destroyed.");
        } else {
            this.container.setCertificate(this.insideKey, certificate);
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public void setDhAllowed() {
    }

    public void setKeyLength(int i) {
        this.keyLength = i;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public void setNotExportable() {
        this.exportable = false;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public void setNotWriteAvailable() {
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface, ru.CryptoPro.JCP.Key.KeyInterface
    public void setParams(ParamsInterface paramsInterface) {
        if (this.destroyed) {
            ny61.r("The key has been destroyed.");
            return;
        }
        if ((paramsInterface instanceof CryptParamsInterface) && !isForeignKey()) {
            this.insideKey.setOIDParam(104, paramsInterface.getOID().toByteZ());
            this.cachedCryptParams = (CryptParamsInterface) paramsInterface;
        } else if ((paramsInterface instanceof EllipticParamsInterface) && !isForeignKey() && CAPI.isCSPLicenseExported) {
            this.insideKey.setOIDParam(106, ((EllipticParamsInterface) paramsInterface).getOID().toByteZ());
        }
    }

    public void setPassword(ContainerPassword containerPassword) throws InvalidPasswordException {
        if (this.destroyed) {
            ny61.r("The key has been destroyed.");
        } else {
            HContainer.setPassword(this.insideKey, containerPassword);
        }
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public void setUserProtected() {
    }

    public boolean shouldBeDeleted() {
        return this.willBeDeleted;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public SignValue signature(byte[] bArr, int i, int i2) throws SignatureException, InvalidKeyException {
        if (this.destroyed) {
            dy31.v("The key has been destroyed.");
            return null;
        }
        if (this.alreadyCreated) {
            return new GostSignature(this.container.getSign(this.insideKey, bArr, i, getKeyType(), i2));
        }
        return null;
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public SignValue signature(byte[] bArr) throws SignatureException, InvalidKeyException {
        throw new SignatureException("Unsupported method.");
    }

    private static Asn1ObjectIdentifier a(int i) {
        return i != 1 ? new Asn1ObjectIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_extension_signature_key_usage_period) : new Asn1ObjectIdentifier(_Gost_CryptoPro_PrivateKeyValues.id_CryptoPro_private_keys_extension_exchange_key_usage_period);
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface
    public SignValue signature(HHash hHash, int i) throws SignatureException, InvalidKeyException {
        if (this.destroyed) {
            dy31.v("The key has been destroyed.");
            return null;
        }
        if (this.alreadyCreated) {
            return new GostSignature(this.container.getSign(hHash, getKeyType(), i));
        }
        return null;
    }

    public void a() {
        this.willBeDeleted = false;
    }

    @Override // ru.CryptoPro.JCP.params.DiversKeyInterface
    public SecretKey diversKeyByBlob(String str, DiversKeyBase diversKeyBase) {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override // ru.CryptoPro.JCSP.Key.JCSPPrivateKeyInterface, ru.CryptoPro.JCP.Key.PrivateKeyInterface
    public boolean match(PublicKey publicKey) throws Exception {
        return match(publicKey, null);
    }

    public AbstractKeySpec create(AlgorithmGroups.KeyAlgorithmGroup keyAlgorithmGroup, byte[] bArr, boolean z, int i, String str, boolean z2) throws UnrecoverableKeyException {
        return create(AlgorithmGroups.c(keyAlgorithmGroup), bArr, z, i, str, z2);
    }

    public AbstractKeySpec(AlgIdInterface algIdInterface, String str) {
        this.params = null;
        this.cachedCryptParams = null;
        this.alreadyCreated = false;
        this.willBeDeleted = false;
        this.exportable = true;
        this.cryptAllowDh = false;
        this.extensionList = null;
        this.keyLength = 0;
        this.keyAlgorithmGroup = AlgorithmGroups.KeyAlgorithmGroup.Unknown;
        this.destroyed = false;
        JCSPLogger.subEnter();
        this.params = algIdInterface;
        if (algIdInterface != null && algIdInterface.getOID() != null) {
            this.keyAlgorithmGroup = AlgorithmGroups.a(this.params.getOID());
        }
        this.alreadyCheckJavaCSPLicense = false;
        this.checkJavaCSPLicenseFailed = true;
        this.mutexLicense = new Object();
        this.container = new HContainer(str);
        JCSPLogger.subExit();
    }

    public AbstractKeySpec(HKey hKey, String str, AlgorithmGroups.KeyAlgorithmGroup keyAlgorithmGroup) {
        this.params = null;
        this.cachedCryptParams = null;
        this.alreadyCreated = false;
        this.willBeDeleted = false;
        this.exportable = true;
        this.cryptAllowDh = false;
        this.extensionList = null;
        this.keyLength = 0;
        this.keyAlgorithmGroup = AlgorithmGroups.KeyAlgorithmGroup.Unknown;
        this.destroyed = false;
        JCSPLogger.subEnter();
        this.insideKey = hKey;
        this.alreadyCreated = true;
        this.mutexLicense = new Object();
        this.container = new HContainer(str);
        if (AlgorithmGroups.b(keyAlgorithmGroup)) {
            this.keyAlgorithmGroup = keyAlgorithmGroup;
            hKey.setKeyAlgorithmGroup(keyAlgorithmGroup);
        } else {
            this.keyAlgorithmGroup = hKey.getKeyAlgorithmGroup();
        }
        this.params = this.container.getParameters(hKey, getKeyType());
        this.alreadyCheckJavaCSPLicense = false;
        this.checkJavaCSPLicenseFailed = true;
        JCSPLogger.subExit();
    }
}
