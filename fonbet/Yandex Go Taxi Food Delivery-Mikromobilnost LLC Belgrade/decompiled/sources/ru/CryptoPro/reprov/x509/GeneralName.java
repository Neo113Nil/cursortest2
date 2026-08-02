package ru.CryptoPro.reprov.x509;

import defpackage.ny61;
import defpackage.oyr;
import java.io.IOException;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class GeneralName {
    private GeneralNameInterface name;

    public GeneralName(DerValue derValue, boolean z) throws IOException {
        GeneralNameInterface otherName;
        this.name = null;
        short s = (byte) (derValue.tag & 31);
        switch (s) {
            case 0:
                if (!derValue.isContextSpecific() || !derValue.isConstructed()) {
                    ny61.v("Invalid encoding of Other-Name");
                    throw null;
                }
                derValue.resetTag((byte) 48);
                otherName = new OtherName(derValue);
                break;
                break;
            case 1:
                if (derValue.isContextSpecific() && !derValue.isConstructed()) {
                    derValue.resetTag((byte) 22);
                    otherName = new RFC822Name(derValue);
                    break;
                } else {
                    ny61.v("Invalid encoding of RFC822 name");
                    throw null;
                }
                break;
            case 2:
                if (derValue.isContextSpecific() && !derValue.isConstructed()) {
                    derValue.resetTag((byte) 22);
                    otherName = new DNSName(derValue);
                    break;
                } else {
                    ny61.v("Invalid encoding of DNS name");
                    throw null;
                }
            case 3:
            default:
                ny61.v(oyr.j(s, "Unrecognized GeneralName tag, (", ru.CryptoPro.JCP.tools.CertReader.Extension.C_BRAKE));
                throw null;
            case 4:
                if (!derValue.isContextSpecific() || !derValue.isConstructed()) {
                    ny61.v("Invalid encoding of Directory name");
                    throw null;
                }
                otherName = new X500Name(derValue.getData());
                break;
            case 5:
                if (!derValue.isContextSpecific() || !derValue.isConstructed()) {
                    ny61.v("Invalid encoding of EDI name");
                    throw null;
                }
                derValue.resetTag((byte) 48);
                otherName = new EDIPartyName(derValue);
                break;
                break;
            case 6:
                if (!derValue.isContextSpecific() || derValue.isConstructed()) {
                    ny61.v("Invalid encoding of URI");
                    throw null;
                }
                derValue.resetTag((byte) 22);
                this.name = z ? URIName.nameConstraint(derValue) : new URIName(derValue);
                return;
            case 7:
                if (derValue.isContextSpecific() && !derValue.isConstructed()) {
                    derValue.resetTag((byte) 4);
                    otherName = new IPAddressName(derValue);
                    break;
                } else {
                    ny61.v("Invalid encoding of IP address");
                    throw null;
                }
                break;
            case 8:
                if (derValue.isContextSpecific() && !derValue.isConstructed()) {
                    derValue.resetTag((byte) 6);
                    otherName = new OIDName(derValue);
                    break;
                } else {
                    ny61.v("Invalid encoding of OID name");
                    throw null;
                }
                break;
        }
        this.name = otherName;
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        DerOutputStream derOutputStream2 = new DerOutputStream();
        this.name.encode(derOutputStream2);
        int type = this.name.getType();
        if (type == 0 || type == 3 || type == 5) {
            derOutputStream.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) type), derOutputStream2);
        } else if (type == 4) {
            derOutputStream.write(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) type), derOutputStream2);
        } else {
            derOutputStream.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) type), derOutputStream2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GeneralName) {
            return this.name.constrains(((GeneralName) obj).name) == 0;
        }
        return false;
    }

    public GeneralNameInterface getName() {
        return this.name;
    }

    public int getType() {
        return this.name.getType();
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return this.name.toString();
    }

    public GeneralName(DerValue derValue) throws IOException {
        this(derValue, false);
    }

    public GeneralName(GeneralNameInterface generalNameInterface) {
        this.name = null;
        if (generalNameInterface != null) {
            this.name = generalNameInterface;
        } else {
            ny61.t("GeneralName must not be null");
            throw null;
        }
    }
}
