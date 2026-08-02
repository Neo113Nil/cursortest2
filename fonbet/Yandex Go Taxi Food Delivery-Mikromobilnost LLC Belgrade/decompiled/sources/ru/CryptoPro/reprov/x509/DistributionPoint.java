package ru.CryptoPro.reprov.x509;

import defpackage.ny61;
import defpackage.oyr;
import java.io.IOException;
import java.util.Arrays;
import ru.CryptoPro.reprov.array.ArrayUtils;
import ru.CryptoPro.reprov.array.BitArray;
import ru.CryptoPro.reprov.array.DerInputStream;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class DistributionPoint {
    public static final int AA_COMPROMISE = 8;
    public static final int AFFILIATION_CHANGED = 3;
    public static final int CA_COMPROMISE = 2;
    public static final int CERTIFICATE_HOLD = 6;
    public static final int CESSATION_OF_OPERATION = 5;
    public static final int KEY_COMPROMISE = 1;
    public static final int PRIVILEGE_WITHDRAWN = 7;
    private static final String[] REASON_STRINGS = {null, "key compromise", "CA compromise", "affiliation changed", ReasonFlags.SUPERSEDED, "cessation of operation", "certificate hold", "privilege withdrawn", "AA compromise"};
    public static final int SUPERSEDED = 4;
    private static final byte TAG_DIST_PT = 0;
    private static final byte TAG_FULL_NAME = 0;
    private static final byte TAG_ISSUER = 2;
    private static final byte TAG_REASONS = 1;
    private static final byte TAG_REL_NAME = 1;
    private GeneralNames crlIssuer;
    private GeneralNames fullName;
    private volatile int hashCode;
    private boolean[] reasonFlags;
    private RDN relativeName;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bd, code lost:
    
        defpackage.ny61.v("Invalid encoding of DistributionPoint.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x006e, code lost:
    
        defpackage.ny61.v("Duplicate DistributionPointName in DistributionPoint.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0073, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c3, code lost:
    
        if (r7.crlIssuer != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c7, code lost:
    
        if (r7.fullName != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00cb, code lost:
    
        if (r7.relativeName == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ce, code lost:
    
        defpackage.ny61.v("One of fullName, relativeName,  and crlIssuer has to be set");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00d3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00d4, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DistributionPoint(DerValue derValue) throws IOException {
        if (derValue.tag != 48) {
            ny61.v("Invalid encoding of DistributionPoint.");
            throw null;
        }
        while (true) {
            DerInputStream derInputStream = derValue.data;
            if (derInputStream == null || derInputStream.available() == 0) {
                break;
            }
            DerValue derValue2 = derValue.data.getDerValue();
            if (derValue2.isContextSpecific((byte) 0) && derValue2.isConstructed()) {
                if (this.fullName != null || this.relativeName != null) {
                    break;
                }
                DerValue derValue3 = derValue2.data.getDerValue();
                if (derValue3.isContextSpecific((byte) 0) && derValue3.isConstructed()) {
                    derValue3.resetTag((byte) 48);
                    this.fullName = new GeneralNames(derValue3);
                } else {
                    if (!derValue3.isContextSpecific((byte) 1) || !derValue3.isConstructed()) {
                        break;
                    }
                    derValue3.resetTag((byte) 49);
                    this.relativeName = new RDN(derValue3);
                }
            } else if (!derValue2.isContextSpecific((byte) 1) || derValue2.isConstructed()) {
                if (!derValue2.isContextSpecific((byte) 2) || !derValue2.isConstructed()) {
                    break;
                }
                if (this.crlIssuer != null) {
                    ny61.v("Duplicate CRLIssuer in DistributionPoint.");
                    throw null;
                }
                derValue2.resetTag((byte) 48);
                this.crlIssuer = new GeneralNames(derValue2);
            } else {
                if (this.reasonFlags != null) {
                    ny61.v("Duplicate Reasons in DistributionPoint.");
                    throw null;
                }
                derValue2.resetTag((byte) 3);
                this.reasonFlags = derValue2.getUnalignedBitString().toBooleanArray();
            }
        }
        ny61.v("Invalid DistributionPointName in DistributionPoint");
        throw null;
    }

    private static String reasonToString(int i) {
        if (i > 0) {
            String[] strArr = REASON_STRINGS;
            if (i < strArr.length) {
                return strArr[i];
            }
        }
        return oyr.i(i, "Unknown reason ");
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        DerOutputStream derOutputStream2;
        byte createTag;
        DerOutputStream derOutputStream3 = new DerOutputStream();
        if (this.fullName != null || this.relativeName != null) {
            DerOutputStream derOutputStream4 = new DerOutputStream();
            if (this.fullName != null) {
                derOutputStream2 = new DerOutputStream();
                this.fullName.encode(derOutputStream2);
                createTag = DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 0);
            } else {
                if (this.relativeName != null) {
                    derOutputStream2 = new DerOutputStream();
                    this.relativeName.encode(derOutputStream2);
                    createTag = DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 1);
                }
                derOutputStream3.write(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 0), derOutputStream4);
            }
            derOutputStream4.writeImplicit(createTag, derOutputStream2);
            derOutputStream3.write(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 0), derOutputStream4);
        }
        if (this.reasonFlags != null) {
            DerOutputStream derOutputStream5 = new DerOutputStream();
            derOutputStream5.putUnalignedBitString(ArrayUtils.truncate(new BitArray(this.reasonFlags)));
            derOutputStream3.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, false, (byte) 1), derOutputStream5);
        }
        if (this.crlIssuer != null) {
            DerOutputStream derOutputStream6 = new DerOutputStream();
            this.crlIssuer.encode(derOutputStream6);
            derOutputStream3.writeImplicit(DerValue.createTag(DerValue.TAG_CONTEXT, true, (byte) 2), derOutputStream6);
        }
        derOutputStream.write((byte) 48, derOutputStream3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistributionPoint)) {
            return false;
        }
        DistributionPoint distributionPoint = (DistributionPoint) obj;
        return equals(this.fullName, distributionPoint.fullName) && equals(this.relativeName, distributionPoint.relativeName) && equals(this.crlIssuer, distributionPoint.crlIssuer) && Arrays.equals(this.reasonFlags, distributionPoint.reasonFlags);
    }

    public GeneralNames getCRLIssuer() {
        return this.crlIssuer;
    }

    public GeneralNames getFullName() {
        return this.fullName;
    }

    public boolean[] getReasonFlags() {
        return this.reasonFlags;
    }

    public RDN getRelativeName() {
        return this.relativeName;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        GeneralNames generalNames = this.fullName;
        int hashCode = generalNames != null ? 1 + generalNames.hashCode() : 1;
        RDN rdn = this.relativeName;
        if (rdn != null) {
            hashCode += rdn.hashCode();
        }
        GeneralNames generalNames2 = this.crlIssuer;
        if (generalNames2 != null) {
            hashCode += generalNames2.hashCode();
        }
        if (this.reasonFlags != null) {
            int i2 = 0;
            while (true) {
                boolean[] zArr = this.reasonFlags;
                if (i2 >= zArr.length) {
                    break;
                }
                if (zArr[i2]) {
                    hashCode += i2;
                }
                i2++;
            }
        }
        this.hashCode = hashCode;
        return hashCode;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.fullName != null) {
            stringBuffer.append("DistributionPoint:\n     " + this.fullName + "\n");
        }
        if (this.relativeName != null) {
            stringBuffer.append("DistributionPoint:\n     " + this.relativeName + "\n");
        }
        if (this.reasonFlags != null) {
            stringBuffer.append("   ReasonFlags:\n");
            int i = 0;
            while (true) {
                boolean[] zArr = this.reasonFlags;
                if (i >= zArr.length) {
                    break;
                }
                if (zArr[i]) {
                    stringBuffer.append(ru.CryptoPro.JCP.tools.CertReader.Extension.TAB_CHAR + reasonToString(i) + "\n");
                }
                i++;
            }
        }
        if (this.crlIssuer != null) {
            stringBuffer.append("   CRLIssuer:" + this.crlIssuer + "\n");
        }
        return stringBuffer.toString();
    }

    private static boolean equals(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public DistributionPoint(GeneralNames generalNames, boolean[] zArr, GeneralNames generalNames2) {
        if (generalNames == null && generalNames2 == null) {
            ny61.g("fullName and crlIssuer may not both be null");
            throw null;
        }
        this.fullName = generalNames;
        this.reasonFlags = zArr;
        this.crlIssuer = generalNames2;
    }

    public DistributionPoint(RDN rdn, boolean[] zArr, GeneralNames generalNames) {
        if (rdn == null && generalNames == null) {
            ny61.g("relativeName and crlIssuer may not both be null");
            throw null;
        }
        this.relativeName = rdn;
        this.reasonFlags = zArr;
        this.crlIssuer = generalNames;
    }
}
