package ru.CryptoPro.reprov.x509;

import defpackage.ny61;
import java.io.IOException;
import java.util.Enumeration;
import ru.CryptoPro.reprov.array.ArrayUtils;
import ru.CryptoPro.reprov.array.BitArray;
import ru.CryptoPro.reprov.array.DerInputStream;
import ru.CryptoPro.reprov.array.DerOutputStream;
import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes4.dex */
public class ReasonFlags {
    private boolean[] bitString;
    public static final String UNUSED = "unused";
    public static final String KEY_COMPROMISE = "key_compromise";
    public static final String CA_COMPROMISE = "ca_compromise";
    public static final String AFFILIATION_CHANGED = "affiliation_changed";
    public static final String SUPERSEDED = "superseded";
    public static final String CESSATION_OF_OPERATION = "cessation_of_operation";
    public static final String CERTIFICATE_HOLD = "certificate_hold";
    public static final String PRIVILEGE_WITHDRAWN = "privilege_withdrawn";
    public static final String AA_COMPROMISE = "aa_compromise";
    private static final String[] NAMES = {UNUSED, KEY_COMPROMISE, CA_COMPROMISE, AFFILIATION_CHANGED, SUPERSEDED, CESSATION_OF_OPERATION, CERTIFICATE_HOLD, PRIVILEGE_WITHDRAWN, AA_COMPROMISE};

    public ReasonFlags(DerInputStream derInputStream) throws IOException {
        this.bitString = derInputStream.getDerValue().getUnalignedBitString(true).toBooleanArray();
    }

    private boolean isSet(int i) {
        return this.bitString[i];
    }

    private static int name2Index(String str) throws IOException {
        int i = 0;
        while (true) {
            String[] strArr = NAMES;
            if (i >= strArr.length) {
                ny61.v("Name not recognized by ReasonFlags");
                return 0;
            }
            if (strArr[i].equalsIgnoreCase(str)) {
                return i;
            }
            i++;
        }
    }

    public void delete(String str) throws IOException {
        set(str, Boolean.FALSE);
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        derOutputStream.putUnalignedBitString(ArrayUtils.truncate(new BitArray(this.bitString)));
    }

    public Object get(String str) throws IOException {
        return Boolean.valueOf(isSet(name2Index(str)));
    }

    public Enumeration getElements() {
        AttributeNameEnumeration attributeNameEnumeration = new AttributeNameEnumeration();
        int i = 0;
        while (true) {
            String[] strArr = NAMES;
            if (i >= strArr.length) {
                return attributeNameEnumeration.elements();
            }
            attributeNameEnumeration.addElement(strArr[i]);
            i++;
        }
    }

    public boolean[] getFlags() {
        return this.bitString;
    }

    public void set(String str, Object obj) throws IOException {
        if (!(obj instanceof Boolean)) {
            ny61.v("Attribute must be of type Boolean.");
        } else {
            set(name2Index(str), ((Boolean) obj).booleanValue());
        }
    }

    public String toString() {
        String str;
        str = "Reason Flags [\n";
        try {
            str = isSet(0) ? "Reason Flags [\n  Unused\n" : "Reason Flags [\n";
            if (isSet(1)) {
                str = str.concat("  Key Compromise\n");
            }
            if (isSet(2)) {
                str = str.concat("  CA Compromise\n");
            }
            if (isSet(3)) {
                str = str.concat("  Affiliation_Changed\n");
            }
            if (isSet(4)) {
                str = str.concat("  Superseded\n");
            }
            if (isSet(5)) {
                str = str.concat("  Cessation Of Operation\n");
            }
            if (isSet(6)) {
                str = str.concat("  Certificate Hold\n");
            }
            if (isSet(7)) {
                str = str.concat("  Privilege Withdrawn\n");
            }
            if (isSet(8)) {
                str = str.concat("  AA Compromise\n");
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return str.concat("]\n");
    }

    public ReasonFlags(BitArray bitArray) {
        this.bitString = bitArray.toBooleanArray();
    }

    public ReasonFlags(DerValue derValue) throws IOException {
        this.bitString = derValue.getUnalignedBitString(true).toBooleanArray();
    }

    public ReasonFlags(byte[] bArr) {
        this.bitString = new BitArray(bArr.length * 8, bArr).toBooleanArray();
    }

    public ReasonFlags(boolean[] zArr) {
        this.bitString = zArr;
    }

    private void set(int i, boolean z) {
        boolean[] zArr = this.bitString;
        if (i >= zArr.length) {
            boolean[] zArr2 = new boolean[i + 1];
            System.arraycopy(zArr, 0, zArr2, 0, zArr.length);
            this.bitString = zArr2;
        }
        this.bitString[i] = z;
    }
}
