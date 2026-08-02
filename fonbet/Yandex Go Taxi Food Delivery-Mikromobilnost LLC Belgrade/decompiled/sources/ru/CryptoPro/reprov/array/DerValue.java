package ru.CryptoPro.reprov.array;

import defpackage.ny61;
import defpackage.yci0;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Date;
import ru.CryptoPro.JCP.tools.SelfTester_Auxiliary;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;

/* loaded from: classes4.dex */
public class DerValue {
    public static final byte TAG_APPLICATION = 64;
    public static final byte TAG_CONTEXT = Byte.MIN_VALUE;
    public static final byte TAG_PRIVATE = -64;
    public static final byte TAG_UNIVERSAL = 0;
    public static final byte tag_BMPString = 30;
    public static final byte tag_BitString = 3;
    public static final byte tag_Boolean = 1;
    public static final byte tag_Enumerated = 10;
    public static final byte tag_GeneralString = 27;
    public static final byte tag_GeneralizedTime = 24;
    public static final byte tag_IA5String = 22;
    public static final byte tag_Integer = 2;
    public static final byte tag_Null = 5;
    public static final byte tag_NumericString = 18;
    public static final byte tag_ObjectId = 6;
    public static final byte tag_OctetString = 4;
    public static final byte tag_PrintableString = 19;
    public static final byte tag_Sequence = 48;
    public static final byte tag_SequenceOf = 48;
    public static final byte tag_Set = 49;
    public static final byte tag_SetOf = 49;
    public static final byte tag_T61String = 20;
    public static final byte tag_UTF8String = 12;
    public static final byte tag_UniversalString = 28;
    public static final byte tag_UtcTime = 23;
    protected DerInputBuffer buffer;
    public final DerInputStream data;
    private int length;
    public byte tag;

    public DerValue(DerInputBuffer derInputBuffer) throws IOException {
        int i;
        SelfTester_Auxiliary.checkClass(DerValue.class);
        this.tag = (byte) derInputBuffer.read();
        byte read = (byte) derInputBuffer.read();
        int length = DerInputStream.getLength(read & 255, derInputBuffer);
        this.length = length;
        if (length == -1) {
            DerInputBuffer dup = derInputBuffer.dup();
            int available = dup.available();
            byte[] bArr = new byte[available + 2];
            bArr[0] = this.tag;
            bArr[1] = read;
            DataInputStream dataInputStream = new DataInputStream(dup);
            dataInputStream.readFully(bArr, 2, available);
            dataInputStream.close();
            DerInputBuffer derInputBuffer2 = new DerInputBuffer(new DerIndefLenConverter().convert(bArr));
            if (this.tag != derInputBuffer2.read()) {
                ny61.v("Indefinite length encoding not supported");
                throw null;
            }
            this.length = DerInputStream.getLength(derInputBuffer2);
            DerInputBuffer dup2 = derInputBuffer2.dup();
            this.buffer = dup2;
            dup2.truncate(this.length);
            this.data = new DerInputStream(this.buffer);
            i = this.length + 2;
        } else {
            DerInputBuffer dup3 = derInputBuffer.dup();
            this.buffer = dup3;
            dup3.truncate(this.length);
            this.data = new DerInputStream(this.buffer);
            i = this.length;
        }
        derInputBuffer.skip(i);
    }

    private byte[] append(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte createTag(byte b, boolean z, byte b2) {
        byte b3 = (byte) (b | b2);
        return z ? (byte) (b3 | BlobHeaderStructure.BLOB_VERSION) : b3;
    }

    private static boolean doEquals(DerValue derValue, DerValue derValue2) {
        boolean equals;
        synchronized (derValue.data) {
            synchronized (derValue2.data) {
                derValue.data.reset();
                derValue2.data.reset();
                equals = derValue.buffer.equals(derValue2.buffer);
            }
        }
        return equals;
    }

    private DerInputStream init(boolean z, InputStream inputStream) throws IOException {
        String str;
        this.tag = (byte) inputStream.read();
        byte read = (byte) inputStream.read();
        int length = DerInputStream.getLength(read & 255, inputStream);
        this.length = length;
        if (length == -1) {
            int available = inputStream.available();
            byte[] bArr = new byte[available + 2];
            bArr[0] = this.tag;
            bArr[1] = read;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            dataInputStream.readFully(bArr, 2, available);
            dataInputStream.close();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new DerIndefLenConverter().convert(bArr));
            if (this.tag != byteArrayInputStream.read()) {
                str = "Indefinite length encoding not supported";
                ny61.v(str);
                return null;
            }
            this.length = DerInputStream.getLength(byteArrayInputStream);
            inputStream = byteArrayInputStream;
        }
        if (z && inputStream.available() != this.length) {
            str = "extra data given to DerValue constructor";
            ny61.v(str);
            return null;
        }
        byte[] bArr2 = new byte[this.length];
        new DataInputStream(inputStream).readFully(bArr2);
        DerInputBuffer derInputBuffer = new DerInputBuffer(bArr2);
        this.buffer = derInputBuffer;
        return new DerInputStream(derInputBuffer);
    }

    public static boolean isPrintableStringChar(char c) {
        if ((c < 'a' || c > 'z') && ((c < 'A' || c > 'Z') && ((c < '0' || c > '9') && c != ' ' && c != ':' && c != '=' && c != '?'))) {
            switch (c) {
                default:
                    switch (c) {
                    }
                    return true;
                case '\'':
                case '(':
                case ')':
                    return true;
            }
        }
        return true;
    }

    public void encode(DerOutputStream derOutputStream) throws IOException {
        derOutputStream.write(this.tag);
        derOutputStream.putLength(this.length);
        int i = this.length;
        if (i > 0) {
            byte[] bArr = new byte[i];
            synchronized (this.data) {
                try {
                    this.buffer.reset();
                    if (this.buffer.read(bArr) != this.length) {
                        throw new IOException("short DER value read (encode)");
                    }
                    derOutputStream.write(bArr);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean equals(DerValue derValue) {
        if (this == derValue) {
            return true;
        }
        if (this.tag != derValue.tag) {
            return false;
        }
        DerInputStream derInputStream = this.data;
        if (derInputStream == derValue.data) {
            return true;
        }
        return System.identityHashCode(derInputStream) > System.identityHashCode(derValue.data) ? doEquals(this, derValue) : doEquals(derValue, this);
    }

    public String getAsString() throws IOException {
        byte b = this.tag;
        if (b == 12) {
            return getUTF8String();
        }
        if (b == 18) {
            return getNumericString();
        }
        if (b == 19) {
            return getPrintableString();
        }
        if (b == 20) {
            return getT61String();
        }
        if (b == 22) {
            return getIA5String();
        }
        if (b == 30) {
            return getBMPString();
        }
        if (b == 27) {
            return getGeneralString();
        }
        return null;
    }

    public String getBMPString() throws IOException {
        if (this.tag == 30) {
            return new String(getDataBytes(), "UnicodeBigUnmarked");
        }
        yci0.s(this.tag, "DerValue.getBMPString, not BMP ");
        return null;
    }

    public BigInteger getBigInteger() throws IOException {
        if (this.tag == 2) {
            return this.buffer.getBigInteger(this.data.available(), false);
        }
        yci0.s(this.tag, "DerValue.getBigInteger, not an int ");
        return null;
    }

    public byte[] getBitString() throws IOException {
        if (this.tag == 3) {
            return this.buffer.getBitString();
        }
        yci0.s(this.tag, "DerValue.getBitString, not a bit string ");
        return null;
    }

    public boolean getBoolean() throws IOException {
        String str;
        int i;
        if (this.tag != 1) {
            str = "DerValue.getBoolean, not a BOOLEAN ";
            i = this.tag;
        } else {
            if (this.length == 1) {
                return this.buffer.read() != 0;
            }
            str = "DerValue.getBoolean, invalid length ";
            i = this.length;
        }
        yci0.s(i, str);
        return false;
    }

    public final DerInputStream getData() {
        return this.data;
    }

    public byte[] getDataBytes() throws IOException {
        byte[] bArr = new byte[this.length];
        synchronized (this.data) {
            this.data.reset();
            this.data.getBytes(bArr);
        }
        return bArr;
    }

    public int getEnumerated() throws IOException {
        if (this.tag == 10) {
            return this.buffer.getInteger(this.data.available());
        }
        yci0.s(this.tag, "DerValue.getEnumerated, incorrect tag: ");
        return 0;
    }

    public String getGeneralString() throws IOException {
        if (this.tag == 27) {
            return new String(getDataBytes(), "ASCII");
        }
        yci0.s(this.tag, "DerValue.getGeneralString, not GeneralString ");
        return null;
    }

    public Date getGeneralizedTime() throws IOException {
        if (this.tag == 24) {
            return this.buffer.getGeneralizedTime(this.data.available());
        }
        yci0.s(this.tag, "DerValue.getGeneralizedTime, not a GeneralizedTime: ");
        return null;
    }

    public String getIA5String() throws IOException {
        if (this.tag == 22) {
            return new String(getDataBytes(), "ASCII");
        }
        yci0.s(this.tag, "DerValue.getIA5String, not IA5 ");
        return null;
    }

    public int getInteger() throws IOException {
        if (this.tag == 2) {
            return this.buffer.getInteger(this.data.available());
        }
        yci0.s(this.tag, "DerValue.getInteger, not an int ");
        return 0;
    }

    public String getNumericString() throws IOException {
        if (this.tag == 18) {
            return new String(getDataBytes(), "ASCII");
        }
        yci0.s(this.tag, "DerValue.getNumericString, not a numeric string ");
        return null;
    }

    public ObjectIdentifier getOID() throws IOException {
        if (this.tag == 6) {
            return new ObjectIdentifier(this.buffer);
        }
        yci0.s(this.tag, "DerValue.getOID, not an OID ");
        return null;
    }

    public byte[] getOctetString() throws IOException {
        if (this.tag != 4 && !isConstructed((byte) 4)) {
            yci0.s(this.tag, "DerValue.getOctetString, not an Octet String: ");
            return null;
        }
        int i = this.length;
        byte[] bArr = new byte[i];
        if (i != 0) {
            if (this.buffer.read(bArr) != this.length) {
                ny61.v("short read on DerValue buffer");
                return null;
            }
            if (isConstructed()) {
                DerInputStream derInputStream = new DerInputStream(bArr);
                bArr = null;
                while (derInputStream.available() != 0) {
                    bArr = append(bArr, derInputStream.getOctetString());
                }
            }
        }
        return bArr;
    }

    public String getPrintableString() throws IOException {
        if (this.tag == 19) {
            return new String(getDataBytes(), "ASCII");
        }
        yci0.s(this.tag, "DerValue.getPrintableString, not a string ");
        return null;
    }

    public String getT61String() throws IOException {
        if (this.tag == 20) {
            return new String(getDataBytes(), "ISO-8859-1");
        }
        yci0.s(this.tag, "DerValue.getT61String, not T61 ");
        return null;
    }

    public String getUTF8String() throws IOException {
        if (this.tag == 12) {
            return new String(getDataBytes(), "UTF8");
        }
        yci0.s(this.tag, "DerValue.getUTF8String, not UTF-8 ");
        return null;
    }

    public BitArray getUnalignedBitString(boolean z) throws IOException {
        if (z || this.tag == 3) {
            return this.buffer.getUnalignedBitString();
        }
        yci0.s(this.tag, "DerValue.getBitString, not a bit string ");
        return null;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public boolean isConstructed(byte b) {
        return isConstructed() && (this.tag & 31) == b;
    }

    public boolean isContextSpecific(byte b) {
        return isContextSpecific() && (this.tag & 31) == b;
    }

    public int length() {
        return this.length;
    }

    public void resetTag(byte b) {
        this.tag = b;
    }

    public byte[] toByteArray() throws IOException {
        DerOutputStream derOutputStream = new DerOutputStream();
        encode(derOutputStream);
        this.data.reset();
        return derOutputStream.toByteArray();
    }

    public DerInputStream toDerInputStream() throws IOException {
        byte b = this.tag;
        if (b == 48 || b == 49) {
            return new DerInputStream(this.buffer);
        }
        yci0.s(this.tag, "toDerInputStream rejects tag type ");
        return null;
    }

    public String toString() {
        try {
            String asString = getAsString();
            if (asString != null) {
                return "\"" + asString + "\"";
            }
            byte b = this.tag;
            if (b == 5) {
                return "[DerValue, null]";
            }
            if (b == 6) {
                return "OID." + getOID();
            }
            return "[DerValue, tag = " + ((int) this.tag) + ", length = " + this.length + "]";
        } catch (IOException unused) {
            ny61.g("misformatted DER value");
            return null;
        }
    }

    public boolean isConstructed() {
        return (this.tag & BlobHeaderStructure.BLOB_VERSION) == 32;
    }

    public boolean isContextSpecific() {
        return (this.tag & TAG_PRIVATE) == 128;
    }

    public BitArray getUnalignedBitString() throws IOException {
        if (this.tag == 3) {
            return this.buffer.getUnalignedBitString();
        }
        yci0.s(this.tag, "DerValue.getBitString, not a bit string ");
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DerValue) {
            return equals((DerValue) obj);
        }
        return false;
    }

    private DerInputStream init(byte b, String str) throws IOException {
        String str2;
        this.tag = b;
        if (b != 12) {
            if (b != 22 && b != 27) {
                if (b != 30) {
                    switch (b) {
                        case 18:
                        case 19:
                            break;
                        case 20:
                            str2 = "ISO-8859-1";
                            break;
                        default:
                            ny61.g("Unsupported DER string type");
                            return null;
                    }
                } else {
                    str2 = "UnicodeBigUnmarked";
                }
            }
            str2 = "ASCII";
        } else {
            str2 = "UTF8";
        }
        byte[] bytes = str.getBytes(str2);
        this.length = bytes.length;
        DerInputBuffer derInputBuffer = new DerInputBuffer(bytes);
        this.buffer = derInputBuffer;
        DerInputStream derInputStream = new DerInputStream(derInputBuffer);
        derInputStream.mark(Integer.MAX_VALUE);
        return derInputStream;
    }

    public DerValue(byte b, byte[] bArr) {
        SelfTester_Auxiliary.checkClass(DerValue.class);
        this.tag = b;
        DerInputBuffer derInputBuffer = new DerInputBuffer((byte[]) bArr.clone());
        this.buffer = derInputBuffer;
        this.length = bArr.length;
        DerInputStream derInputStream = new DerInputStream(derInputBuffer);
        this.data = derInputStream;
        derInputStream.mark(Integer.MAX_VALUE);
    }

    public DerValue(InputStream inputStream) throws IOException {
        SelfTester_Auxiliary.checkClass(DerValue.class);
        this.data = init(false, inputStream);
    }

    public DerValue(String str) throws IOException {
        byte b;
        SelfTester_Auxiliary.checkClass(DerValue.class);
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                b = 19;
                break;
            } else {
                if (!isPrintableStringChar(str.charAt(i))) {
                    b = 12;
                    break;
                }
                i++;
            }
        }
        this.data = init(b, str);
    }

    public DerValue(byte b, String str) throws IOException {
        SelfTester_Auxiliary.checkClass(DerValue.class);
        this.data = init(b, str);
    }

    public DerValue(byte[] bArr) throws IOException {
        SelfTester_Auxiliary.checkClass(DerValue.class);
        this.data = init(true, (InputStream) new ByteArrayInputStream(bArr));
    }
}
