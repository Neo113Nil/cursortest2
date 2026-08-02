package ru.CryptoPro.JCP.spec;

import ru.CryptoPro.JCP.ASN.PKIX1Explicit88.AlgorithmIdentifier;
import ru.CryptoPro.JCP.params.AlgIdSpec;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.params.ParamsInterface;

/* loaded from: classes4.dex */
public class NameAlgIdSpec extends AlgIdSpec implements ProviderParameterInterface {
    public final String J;
    public final boolean K;
    public final boolean L;
    public final String M;

    public NameAlgIdSpec(String str, boolean z, String str2) {
        super((OID) null);
        this.J = str;
        this.K = true;
        this.L = z;
        this.M = str2;
    }

    @Override // ru.CryptoPro.JCP.spec.ProviderParameterInterface
    public String getName() {
        return this.J;
    }

    @Override // ru.CryptoPro.JCP.spec.ProviderParameterInterface
    public String getProviderName() {
        return this.M;
    }

    @Override // ru.CryptoPro.JCP.spec.ProviderParameterInterface
    public boolean isOnlyStoreType() {
        return this.L;
    }

    public boolean isUseDefaultParameters() {
        return this.K;
    }

    public NameAlgIdSpec(String str, String str2) {
        this(str, str2, (String) null);
    }

    public NameAlgIdSpec(String str, String str2, String str3) {
        this(str, str2, false, str3);
    }

    public NameAlgIdSpec(String str, String str2, boolean z) {
        this(str, str2, z, (String) null);
    }

    public NameAlgIdSpec(String str, String str2, boolean z, String str3) {
        super(str);
        this.J = str2;
        this.K = false;
        this.L = z;
        this.M = str3;
    }

    public NameAlgIdSpec(String str, boolean z) {
        this(str, z, (String) null);
    }

    public NameAlgIdSpec(String str) {
        this(str, false, (String) null);
    }

    public NameAlgIdSpec(AlgorithmIdentifier algorithmIdentifier, String str) {
        this(algorithmIdentifier, str, (String) null);
    }

    public NameAlgIdSpec(AlgorithmIdentifier algorithmIdentifier, String str, String str2) {
        super(algorithmIdentifier);
        this.L = false;
        this.J = str;
        this.K = false;
        this.M = str2;
    }

    public NameAlgIdSpec(OID oid, String str) {
        this(oid, str, (String) null);
    }

    public NameAlgIdSpec(OID oid, String str, String str2) {
        this(oid, str, false, str2);
    }

    public NameAlgIdSpec(OID oid, String str, boolean z) {
        this(oid, str, z, (String) null);
    }

    public NameAlgIdSpec(OID oid, String str, boolean z, String str2) {
        super(oid);
        this.J = str;
        this.K = false;
        this.L = z;
        this.M = str2;
    }

    public NameAlgIdSpec(OID oid, OID oid2, OID oid3, OID oid4, String str) {
        this(oid, oid2, oid3, oid4, str, (String) null);
    }

    public NameAlgIdSpec(OID oid, OID oid2, OID oid3, OID oid4, String str, String str2) {
        super(oid, oid2, oid3, oid4);
        this.L = false;
        this.J = str;
        this.K = false;
        this.M = str2;
    }

    public NameAlgIdSpec(OID oid, ParamsInterface paramsInterface, ParamsInterface paramsInterface2, ParamsInterface paramsInterface3, String str) {
        this(oid, paramsInterface, paramsInterface2, paramsInterface3, str, false, null);
    }

    public NameAlgIdSpec(OID oid, ParamsInterface paramsInterface, ParamsInterface paramsInterface2, ParamsInterface paramsInterface3, String str, String str2) {
        this(oid, paramsInterface, paramsInterface2, paramsInterface3, str, false, str2);
    }

    public NameAlgIdSpec(OID oid, ParamsInterface paramsInterface, ParamsInterface paramsInterface2, ParamsInterface paramsInterface3, String str, boolean z) {
        this(oid, paramsInterface, paramsInterface2, paramsInterface3, str, z, null);
    }

    public NameAlgIdSpec(OID oid, ParamsInterface paramsInterface, ParamsInterface paramsInterface2, ParamsInterface paramsInterface3, String str, boolean z, String str2) {
        super(oid, paramsInterface, paramsInterface2, paramsInterface3);
        this.J = str;
        this.K = false;
        this.L = z;
        this.M = str2;
    }
}
