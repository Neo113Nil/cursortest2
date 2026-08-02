package ru.CryptoPro.reprov.array;

import defpackage.b64;
import defpackage.ny61;
import defpackage.oyr;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Date;
import java.util.Vector;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public class DerInputStream {
    DerInputBuffer buffer;
    public byte tag;

    public DerInputStream(DerInputBuffer derInputBuffer) {
        this.buffer = derInputBuffer;
        derInputBuffer.mark(Integer.MAX_VALUE);
    }

    public static int getLength(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & HProv.PP_VERSION_TIMESTAMP;
        if (i2 == 0) {
            return -1;
        }
        if (i2 < 0 || i2 > 4) {
            StringBuilder t = b64.t(i2, "DerInputStream.getLength(): lengthTag=", Extension.FIX_SPACE);
            t.append(i2 < 0 ? "incorrect DER encoding." : "too big.");
            throw new IOException(t.toString());
        }
        int i3 = 0;
        while (i2 > 0) {
            i3 = (i3 << 8) + (inputStream.read() & 255);
            i2--;
        }
        return i3;
    }

    private void init(byte[] bArr, int i, int i2) throws IOException {
        if (i + 2 > bArr.length || i + i2 > bArr.length) {
            ny61.v("Encoding bytes too short");
            return;
        }
        if (DerIndefLenConverter.isIndefinite(bArr[i + 1])) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            this.buffer = new DerInputBuffer(new DerIndefLenConverter().convert(bArr2));
        } else {
            this.buffer = new DerInputBuffer(bArr, i, i2);
        }
        this.buffer.mark(Integer.MAX_VALUE);
    }

    private String readString(byte b, String str, String str2) throws IOException {
        if (this.buffer.read() != b) {
            ny61.v(oyr.p("DER input not a ", str, " string"));
            return null;
        }
        int length = getLength(this.buffer);
        byte[] bArr = new byte[length];
        if (length == 0 || this.buffer.read(bArr) == length) {
            return new String(bArr, str2);
        }
        ny61.v(oyr.p("short read of DER ", str, " string"));
        return null;
    }

    public int available() {
        return this.buffer.available();
    }

    public String getBMPString() throws IOException {
        return readString((byte) 30, "BMP", "UnicodeBigUnmarked");
    }

    public BigInteger getBigInteger() throws IOException {
        if (this.buffer.read() == 2) {
            DerInputBuffer derInputBuffer = this.buffer;
            return derInputBuffer.getBigInteger(getLength(derInputBuffer), false);
        }
        ny61.v("DER input, Integer tag error");
        return null;
    }

    public byte[] getBitString() throws IOException {
        if (this.buffer.read() == 3) {
            DerInputBuffer derInputBuffer = this.buffer;
            return derInputBuffer.getBitString(getLength(derInputBuffer));
        }
        ny61.v("DER input not an bit string");
        return null;
    }

    public int getByte() throws IOException {
        return this.buffer.read() & 255;
    }

    public void getBytes(byte[] bArr) throws IOException {
        if (bArr.length == 0 || this.buffer.read(bArr) == bArr.length) {
            return;
        }
        ny61.v("short read of DER octet string");
    }

    public DerValue getDerValue() throws IOException {
        return new DerValue(this.buffer);
    }

    public int getEnumerated() throws IOException {
        if (this.buffer.read() == 10) {
            DerInputBuffer derInputBuffer = this.buffer;
            return derInputBuffer.getInteger(getLength(derInputBuffer));
        }
        ny61.v("DER input, Enumerated tag error");
        return 0;
    }

    public String getGeneralString() throws IOException {
        return readString(DerValue.tag_GeneralString, "General", "ASCII");
    }

    public Date getGeneralizedTime() throws IOException {
        if (this.buffer.read() == 24) {
            DerInputBuffer derInputBuffer = this.buffer;
            return derInputBuffer.getGeneralizedTime(getLength(derInputBuffer));
        }
        ny61.v("DER input, GeneralizedTime tag invalid ");
        return null;
    }

    public String getIA5String() throws IOException {
        return readString((byte) 22, "IA5", "ASCII");
    }

    public int getInteger() throws IOException {
        if (this.buffer.read() == 2) {
            DerInputBuffer derInputBuffer = this.buffer;
            return derInputBuffer.getInteger(getLength(derInputBuffer));
        }
        ny61.v("DER input, Integer tag error");
        return 0;
    }

    public void getNull() throws IOException {
        if (this.buffer.read() == 5 && this.buffer.read() == 0) {
            return;
        }
        ny61.v("getNull, bad data");
    }

    public ObjectIdentifier getOID() throws IOException {
        return new ObjectIdentifier(this);
    }

    public byte[] getOctetString() throws IOException {
        String str;
        if (this.buffer.read() == 4) {
            int length = getLength(this.buffer);
            byte[] bArr = new byte[length];
            if (length == 0 || this.buffer.read(bArr) == length) {
                return bArr;
            }
            str = "short read of DER octet string";
        } else {
            str = "DER input not an octet string";
        }
        ny61.v(str);
        return null;
    }

    public BigInteger getPositiveBigInteger() throws IOException {
        if (this.buffer.read() == 2) {
            DerInputBuffer derInputBuffer = this.buffer;
            return derInputBuffer.getBigInteger(getLength(derInputBuffer), true);
        }
        ny61.v("DER input, Integer tag error");
        return null;
    }

    public String getPrintableString() throws IOException {
        return readString((byte) 19, "Printable", "ASCII");
    }

    public DerValue[] getSequence(int i) throws IOException {
        byte read = (byte) this.buffer.read();
        this.tag = read;
        if (read == 48) {
            return readVector(i);
        }
        ny61.v("Sequence tag error");
        return null;
    }

    public DerValue[] getSet(int i, boolean z) throws IOException {
        byte read = (byte) this.buffer.read();
        this.tag = read;
        if (z || read == 49) {
            return readVector(i);
        }
        ny61.v("Set tag error");
        return null;
    }

    public String getT61String() throws IOException {
        return readString((byte) 20, "T61", "ISO-8859-1");
    }

    public Date getUTCTime() throws IOException {
        if (this.buffer.read() == 23) {
            DerInputBuffer derInputBuffer = this.buffer;
            return derInputBuffer.getUTCTime(getLength(derInputBuffer));
        }
        ny61.v("DER input, UTCtime tag invalid ");
        return null;
    }

    public String getUTF8String() throws IOException {
        return readString((byte) 12, "UTF-8", "UTF8");
    }

    public BitArray getUnalignedBitString() throws IOException {
        if (this.buffer.read() != 3) {
            ny61.v("DER input not a bit string");
            return null;
        }
        int length = getLength(this.buffer) - 1;
        int read = (length * 8) - this.buffer.read();
        byte[] bArr = new byte[length];
        if (length == 0 || this.buffer.read(bArr) == length) {
            return new BitArray(read, bArr);
        }
        ny61.v("short read of DER bit string");
        return null;
    }

    public void mark(int i) {
        this.buffer.mark(i);
    }

    public int peekByte() throws IOException {
        return this.buffer.peek();
    }

    public DerValue[] readVector(int i) throws IOException {
        String str;
        byte read = (byte) this.buffer.read();
        int length = getLength(read & 255, this.buffer);
        if (length == -1) {
            int available = this.buffer.available();
            byte[] bArr = new byte[available + 2];
            bArr[0] = this.tag;
            bArr[1] = read;
            DataInputStream dataInputStream = new DataInputStream(this.buffer);
            dataInputStream.readFully(bArr, 2, available);
            dataInputStream.close();
            DerInputBuffer derInputBuffer = new DerInputBuffer(new DerIndefLenConverter().convert(bArr));
            this.buffer = derInputBuffer;
            if (this.tag != derInputBuffer.read()) {
                str = "Indefinite length encoding not supported";
                ny61.v(str);
                return null;
            }
            length = getLength(this.buffer);
        }
        if (length == 0) {
            return new DerValue[0];
        }
        if (this.buffer.available() != length) {
            this = subStream(length, true);
        }
        Vector vector = new Vector(i);
        do {
            vector.addElement(new DerValue(this.buffer));
        } while (this.available() > 0);
        if (this.available() != 0) {
            str = "extra data at end of vector";
            ny61.v(str);
            return null;
        }
        int size = vector.size();
        DerValue[] derValueArr = new DerValue[size];
        for (int i2 = 0; i2 < size; i2++) {
            derValueArr[i2] = (DerValue) vector.elementAt(i2);
        }
        return derValueArr;
    }

    public void reset() {
        this.buffer.reset();
    }

    public DerInputStream subStream(int i, boolean z) throws IOException {
        DerInputBuffer dup = this.buffer.dup();
        dup.truncate(i);
        if (z) {
            this.buffer.skip(i);
        }
        return new DerInputStream(dup);
    }

    public byte[] toByteArray() {
        return this.buffer.toByteArray();
    }

    public DerInputStream(byte[] bArr) throws IOException {
        init(bArr, 0, bArr.length);
    }

    public DerInputStream(byte[] bArr, int i, int i2) throws IOException {
        init(bArr, i, i2);
    }

    public DerValue[] getSet(int i) throws IOException {
        byte read = (byte) this.buffer.read();
        this.tag = read;
        if (read == 49) {
            return readVector(i);
        }
        ny61.v("Set tag error");
        return null;
    }

    public int getLength() throws IOException {
        return getLength(this.buffer);
    }

    public static int getLength(InputStream inputStream) throws IOException {
        return getLength(inputStream.read(), inputStream);
    }
}
