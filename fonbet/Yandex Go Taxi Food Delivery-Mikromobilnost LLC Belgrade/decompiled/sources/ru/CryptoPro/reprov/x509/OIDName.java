package ru.CryptoPro.reprov.x509;

import defpackage.w511;
import java.io.IOException;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.reprov.array.ObjectIdentifier;

/* loaded from: classes4.dex */
public class OIDName implements GeneralNameInterface {
    private ObjectIdentifier oid;

    public OIDName(String str) throws IOException {
        try {
            this.oid = new ObjectIdentifier(str);
        } catch (Exception e) {
            w511.h(e, "Unable to create OIDName: ");
            throw null;
        }
    }

    @Override // ru.CryptoPro.reprov.x509.GeneralNameInterface
    public int constrains(GeneralNameInterface generalNameInterface) throws UnsupportedOperationException {
        if (generalNameInterface == null || generalNameInterface.getType() != 8) {
            return -1;
        }
        if (equals((OIDName) generalNameInterface)) {
            return 0;
        }
        w511.x("Narrowing and widening are not supported for OIDNames");
        return 0;
    }

    @Override // ru.CryptoPro.reprov.x509.GeneralNameInterface
    public void encode(DerOutputStream derOutputStream) throws IOException {
        derOutputStream.putOID(this.oid);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OIDName) {
            return this.oid.equals((Object) ((OIDName) obj).oid);
        }
        return false;
    }

    public ObjectIdentifier getOID() {
        return this.oid;
    }

    @Override // ru.CryptoPro.reprov.x509.GeneralNameInterface
    public int getType() {
        return 8;
    }

    public int hashCode() {
        return this.oid.hashCode();
    }

    @Override // ru.CryptoPro.reprov.x509.GeneralNameInterface
    public int subtreeDepth() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("subtreeDepth() not supported for OIDName.");
    }

    public String toString() {
        return "OIDName: " + this.oid.toString();
    }

    public OIDName(DerValue derValue) throws IOException {
        this.oid = derValue.getOID();
    }

    public OIDName(ObjectIdentifier objectIdentifier) {
        this.oid = objectIdentifier;
    }
}
