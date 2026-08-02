package ru.CryptoPro.JCP.spec;

import ru.CryptoPro.JCP.params.AlgIdSpecForeign;
import ru.CryptoPro.JCP.params.OID;

/* loaded from: classes4.dex */
public class NameAlgIdSpecForeign extends AlgIdSpecForeign implements ProviderParameterInterface {
    public final String c;
    public final boolean w;
    public final String x;

    public NameAlgIdSpecForeign(String str, boolean z, String str2) {
        super(AlgIdSpecForeign.OID_RSA);
        this.c = str;
        this.w = z;
        this.x = str2;
    }

    @Override // ru.CryptoPro.JCP.spec.ProviderParameterInterface
    public String getName() {
        return this.c;
    }

    @Override // ru.CryptoPro.JCP.spec.ProviderParameterInterface
    public String getProviderName() {
        return this.x;
    }

    @Override // ru.CryptoPro.JCP.spec.ProviderParameterInterface
    public boolean isOnlyStoreType() {
        return this.w;
    }

    public NameAlgIdSpecForeign(String str, boolean z) {
        this(str, z, (String) null);
    }

    public NameAlgIdSpecForeign(String str) {
        this(str, false, (String) null);
    }

    public NameAlgIdSpecForeign(OID oid, String str) {
        this(oid, null, str, false, null);
    }

    public NameAlgIdSpecForeign(OID oid, String str, boolean z, String str2) {
        this(oid, null, str, z, str2);
    }

    public NameAlgIdSpecForeign(OID oid, OID oid2, String str) {
        this(oid, oid2, str, false, null);
    }

    public NameAlgIdSpecForeign(OID oid, OID oid2, String str, boolean z, String str2) {
        super(oid, oid2);
        this.c = str;
        this.w = z;
        this.x = str2;
    }
}
