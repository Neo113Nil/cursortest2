package ru.CryptoPro.reprov.x509;

import defpackage.ny61;
import defpackage.w511;
import java.io.IOException;
import java.util.Arrays;
import ru.CryptoPro.reprov.array.DerInputStream;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.reprov.array.ObjectIdentifier;

/* loaded from: classes4.dex */
public class OtherName implements GeneralNameInterface {
    private static final byte TAG_VALUE = 0;
    private GeneralNameInterface gni;
    private int myhash = -1;
    private String name;
    private byte[] nameValue;
    private ObjectIdentifier oid;

    public OtherName(DerValue derValue) throws IOException {
        String str;
        this.nameValue = null;
        this.gni = null;
        DerInputStream derInputStream = derValue.toDerInputStream();
        this.oid = derInputStream.getOID();
        byte[] byteArray = derInputStream.getDerValue().toByteArray();
        this.nameValue = byteArray;
        GeneralNameInterface gni = getGNI(this.oid, byteArray);
        this.gni = gni;
        if (gni != null) {
            str = gni.toString();
        } else {
            str = "Unrecognized OID: " + this.oid.toString();
        }
        this.name = str;
    }

    private GeneralNameInterface getGNI(ObjectIdentifier objectIdentifier, byte[] bArr) throws IOException {
        try {
            Class cls = OIDMap.getClass(objectIdentifier);
            if (cls == null) {
                return null;
            }
            return (GeneralNameInterface) cls.getConstructor(Object.class).newInstance(bArr);
        } catch (Exception e) {
            throw ((IOException) new IOException("Instantiation error: " + e).initCause(e));
        }
    }

    @Override // ru.CryptoPro.reprov.x509.GeneralNameInterface
    public int constrains(GeneralNameInterface generalNameInterface) {
        if (generalNameInterface == null || generalNameInterface.getType() != 0) {
            return -1;
        }
        w511.x("Narrowing, widening, and matching are not supported for OtherName.");
        return 0;
    }

    @Override // ru.CryptoPro.reprov.x509.GeneralNameInterface
    public void encode(DerOutputStream derOutputStream) throws IOException {
        GeneralNameInterface generalNameInterface = this.gni;
        if (generalNameInterface != null) {
            generalNameInterface.encode(derOutputStream);
            return;
        }
        DerOutputStream derOutputStream2 = new DerOutputStream();
        derOutputStream2.putOID(this.oid);
        derOutputStream2.write(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 0), this.nameValue);
        derOutputStream.write((byte) 48, derOutputStream2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtherName)) {
            return false;
        }
        OtherName otherName = (OtherName) obj;
        if (!otherName.oid.equals((Object) this.oid)) {
            return false;
        }
        try {
            GeneralNameInterface gni = getGNI(otherName.oid, otherName.nameValue);
            return gni != null ? gni.constrains(this) == 0 : Arrays.equals(this.nameValue, otherName.nameValue);
        } catch (IOException unused) {
            return false;
        }
    }

    public byte[] getNameValue() {
        return (byte[]) this.nameValue.clone();
    }

    public ObjectIdentifier getOID() {
        return this.oid;
    }

    @Override // ru.CryptoPro.reprov.x509.GeneralNameInterface
    public int getType() {
        return 0;
    }

    public int hashCode() {
        if (this.myhash == -1) {
            this.myhash = this.oid.hashCode() + 37;
            int i = 0;
            while (true) {
                byte[] bArr = this.nameValue;
                if (i >= bArr.length) {
                    break;
                }
                this.myhash = (this.myhash * 37) + bArr[i];
                i++;
            }
        }
        return this.myhash;
    }

    @Override // ru.CryptoPro.reprov.x509.GeneralNameInterface
    public int subtreeDepth() {
        throw new UnsupportedOperationException("subtreeDepth() not supported for generic OtherName");
    }

    public String toString() {
        return "Other-Name: " + this.name;
    }

    public OtherName(ObjectIdentifier objectIdentifier, byte[] bArr) throws IOException {
        String str;
        this.nameValue = null;
        this.gni = null;
        if (objectIdentifier == null || bArr == null) {
            ny61.t("parameters may not be null");
            throw null;
        }
        this.oid = objectIdentifier;
        this.nameValue = bArr;
        GeneralNameInterface gni = getGNI(objectIdentifier, bArr);
        this.gni = gni;
        if (gni != null) {
            str = gni.toString();
        } else {
            str = "Unrecognized OID: " + objectIdentifier.toString();
        }
        this.name = str;
    }
}
