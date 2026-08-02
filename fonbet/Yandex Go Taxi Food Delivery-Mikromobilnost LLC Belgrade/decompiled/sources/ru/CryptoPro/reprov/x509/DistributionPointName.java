package ru.CryptoPro.reprov.x509;

import defpackage.ny61;
import java.io.IOException;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class DistributionPointName {
    private static final byte TAG_FULL_NAME = 0;
    private static final byte TAG_RELATIVE_NAME = 1;
    private GeneralNames fullName;
    private volatile int hashCode;
    private RDN relativeName;

    public DistributionPointName(DerValue derValue) throws IOException {
        this.fullName = null;
        this.relativeName = null;
        if (derValue.isContextSpecific((byte) 0) && derValue.isConstructed()) {
            derValue.resetTag((byte) 48);
            this.fullName = new GeneralNames(derValue);
        } else {
            if (!derValue.isContextSpecific((byte) 1) || !derValue.isConstructed()) {
                ny61.v("Invalid encoding for DistributionPointName");
                throw null;
            }
            derValue.resetTag((byte) 49);
            this.relativeName = new RDN(derValue);
        }
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        byte createTag;
        DerOutputStream derOutputStream2 = new DerOutputStream();
        GeneralNames generalNames = this.fullName;
        if (generalNames != null) {
            generalNames.encode(derOutputStream2);
            createTag = DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 0);
        } else {
            this.relativeName.encode(derOutputStream2);
            createTag = DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 1);
        }
        derOutputStream.writeImplicit(createTag, derOutputStream2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistributionPointName)) {
            return false;
        }
        DistributionPointName distributionPointName = (DistributionPointName) obj;
        return equals(this.fullName, distributionPointName.fullName) && equals(this.relativeName, distributionPointName.relativeName);
    }

    public GeneralNames getFullName() {
        return this.fullName;
    }

    public RDN getRelativeName() {
        return this.relativeName;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i == 0) {
            GeneralNames generalNames = this.fullName;
            i = (generalNames != null ? generalNames.hashCode() : this.relativeName.hashCode()) + 1;
            this.hashCode = i;
        }
        return i;
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.fullName != null) {
            sb = new StringBuilder("DistributionPointName:\n     ");
            obj = this.fullName;
        } else {
            sb = new StringBuilder("DistributionPointName:\n     ");
            obj = this.relativeName;
        }
        sb.append(obj);
        sb.append("\n");
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    private static boolean equals(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public DistributionPointName(GeneralNames generalNames) {
        this.fullName = null;
        this.relativeName = null;
        if (generalNames != null) {
            this.fullName = generalNames;
        } else {
            ny61.g("fullName must not be null");
            throw null;
        }
    }

    public DistributionPointName(RDN rdn) {
        this.fullName = null;
        this.relativeName = null;
        if (rdn != null) {
            this.relativeName = rdn;
        } else {
            ny61.g("relativeName must not be null");
            throw null;
        }
    }
}
