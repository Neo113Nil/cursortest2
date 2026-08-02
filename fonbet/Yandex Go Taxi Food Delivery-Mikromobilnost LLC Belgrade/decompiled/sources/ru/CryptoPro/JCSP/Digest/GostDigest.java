package ru.CryptoPro.JCSP.Digest;

import ru.CryptoPro.JCP.Key.KeyInterface;
import ru.CryptoPro.JCP.params.OID;

/* loaded from: classes4.dex */
public abstract class GostDigest extends BaseGostDigest {
    public GostDigest(OID oid, String str) {
        this(oid, 75, str);
    }

    public GostDigest(String str, int i) {
        this((OID) null, i, str);
    }

    public GostDigest(OID oid, int i, String str) {
        super(oid, i, str);
    }

    public GostDigest(int i, KeyInterface keyInterface, String str) {
        super(null, i, keyInterface, str);
    }

    public GostDigest(GostDigest gostDigest, String str) {
        super(gostDigest, str);
    }
}
