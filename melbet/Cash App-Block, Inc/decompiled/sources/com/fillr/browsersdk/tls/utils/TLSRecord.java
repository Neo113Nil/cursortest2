package com.fillr.browsersdk.tls.utils;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.caverock.androidsvg.SVG;
import com.fillr.browsersdk.Fillr;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes4.dex */
public final class TLSRecord {
    public static final int MAX_ENCRYPTED_RECORD_LENGTH;
    public static final int MAX_PLAINTEXT_RECORD_LENGTH;
    public byte[] data;
    public int length;
    public byte[] mac;
    public int numDecrypted;

    /* renamed from: type, reason: collision with root package name */
    public int f988type;
    public int versionHigh;
    public int versionLow;

    static {
        int pow = (int) Math.pow(2.0d, 14.0d);
        MAX_PLAINTEXT_RECORD_LENGTH = pow;
        MAX_ENCRYPTED_RECORD_LENGTH = pow + 2048;
    }

    public TLSRecord(int i, int i2, int i3, byte[] bArr, ByteArrayOutputStream byteArrayOutputStream) {
        if (i < 20 || i > 23) {
            a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unrecognized TLS Record Type:  "));
            throw null;
        }
        int i4 = i == 23 ? MAX_ENCRYPTED_RECORD_LENGTH : MAX_PLAINTEXT_RECORD_LENGTH;
        if (bArr.length > i4) {
            a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline2.m(bArr.length, i4, ", maxLength=", new StringBuilder("Invalid TLS Record size:  length=")));
            throw null;
        }
        this.f988type = i;
        this.versionHigh = i2;
        this.versionLow = i3;
        this.data = bArr;
        this.length = bArr.length;
        if (i != 22 || byteArrayOutputStream == null) {
            return;
        }
        byteArrayOutputStream.write(bArr);
    }

    public static ArrayList packetize(int i, int i2, byte[] bArr) {
        int length = bArr.length;
        int i3 = MAX_PLAINTEXT_RECORD_LENGTH;
        int length2 = i3 < length ? i3 : bArr.length;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (true) {
            int i5 = length2 - i4;
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, i4, bArr2, 0, i5);
            int i6 = i;
            int i7 = i2;
            arrayList.add(new TLSRecord(23, i6, i7, bArr2, null));
            i4 += i5;
            length2 += i3;
            if (length2 > bArr.length) {
                length2 = bArr.length;
            }
            if (i4 >= bArr.length) {
                return arrayList;
            }
            i = i6;
            i2 = i7;
        }
    }

    public static TLSRecord read(InputStream inputStream, String str, byte[] bArr, ByteArrayOutputStream byteArrayOutputStream) {
        TLSRecord tLSRecord = new TLSRecord();
        int readUint8 = TLSUtils.readUint8(inputStream);
        tLSRecord.f988type = readUint8;
        if (readUint8 < 20 || readUint8 > 23) {
            throw new IOException("Unrecognized TLS Record Type (" + str + "):  " + readUint8);
        }
        tLSRecord.numDecrypted = 0;
        tLSRecord.versionHigh = TLSUtils.readUint8(inputStream);
        tLSRecord.versionLow = TLSUtils.readUint8(inputStream);
        byte[] readRLEByteArray = TLSUtils.readRLEByteArray(inputStream);
        tLSRecord.data = readRLEByteArray;
        int length = readRLEByteArray.length;
        tLSRecord.length = length;
        int i = readUint8 == 23 ? MAX_ENCRYPTED_RECORD_LENGTH : MAX_PLAINTEXT_RECORD_LENGTH;
        if (length > i) {
            a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline2.m(tLSRecord.data.length, i, ", maxLength=", JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Invalid TLS Record size (", str, "):  length=")));
            return null;
        }
        if (bArr != null && readUint8 != 20) {
            tLSRecord.decrypt(bArr);
            tLSRecord.numDecrypted = 1;
        }
        while (tLSRecord.f988type != 23 && new TLSPayload(new ByteArrayInputStream(tLSRecord.data), tLSRecord.f988type).toBytes().length > tLSRecord.length) {
            int readUint82 = TLSUtils.readUint8(inputStream);
            if (readUint82 != tLSRecord.f988type) {
                a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline2.m(tLSRecord.f988type, readUint82, ", actualType=", new StringBuilder("Invalid TLS Record fragment; expectedType=")));
                return null;
            }
            int readUint83 = TLSUtils.readUint8(inputStream);
            int readUint84 = TLSUtils.readUint8(inputStream);
            if (readUint83 != tLSRecord.versionHigh || readUint84 != tLSRecord.versionLow) {
                f$$ExternalSyntheticLambda0.m$3("Unexpected TLS protocol change; expectedVersion=", TLSUtils.version(tLSRecord.versionHigh, tLSRecord.versionLow), ", actualVersion=", TLSUtils.version(readUint83, readUint84));
                return null;
            }
            byte[] readRLEByteArray2 = TLSUtils.readRLEByteArray(inputStream);
            TLSRecord tLSRecord2 = new TLSRecord(readUint82, readUint83, readUint84, readRLEByteArray2, null);
            int i2 = tLSRecord.f988type;
            if (bArr != null && i2 != 20) {
                tLSRecord2.decrypt(bArr);
                tLSRecord.numDecrypted++;
            }
            byte[] bArr2 = tLSRecord.data;
            int length2 = bArr2.length + tLSRecord2.data.length;
            byte[] bArr3 = new byte[length2];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            System.arraycopy(readRLEByteArray2, 0, bArr3, tLSRecord.data.length, readRLEByteArray2.length);
            tLSRecord.data = bArr3;
            tLSRecord.length = length2;
        }
        if (tLSRecord.f988type == 22 && byteArrayOutputStream != null) {
            byteArrayOutputStream.write(tLSRecord.data);
        }
        return tLSRecord;
    }

    public final byte[] calculateMac(long j, byte[] bArr) {
        int i = this.f988type;
        byte[] bArr2 = this.data;
        byte[] bArr3 = TLSUtils.TLS_RSA_WITH_AES_128_CBC_SHA;
        byte[] bArr4 = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write((int) (((-72057594037927936L) & j) >> 56));
            byteArrayOutputStream.write((int) ((71776119061217280L & j) >> 48));
            byteArrayOutputStream.write((int) ((280375465082880L & j) >> 40));
            byteArrayOutputStream.write((int) ((1095216660480L & j) >> 32));
            byteArrayOutputStream.write((int) ((4278190080L & j) >> 24));
            byteArrayOutputStream.write((int) ((16711680 & j) >> 16));
            byteArrayOutputStream.write((int) ((65280 & j) >> 8));
            byteArrayOutputStream.write((int) (j & 255));
            byteArrayOutputStream.write(i & 255);
            byteArrayOutputStream.write(3);
            byteArrayOutputStream.write(3);
            int length = bArr2.length;
            byteArrayOutputStream.write((65280 & length) >> 8);
            byteArrayOutputStream.write(length & 255);
            byteArrayOutputStream.write(bArr2);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                Mac mac = (Mac) TLSUtils.HMAC_SHA_1.get();
                mac.init(new SecretKeySpec(bArr, "HmacSHA1"));
                bArr4 = mac.doFinal(byteArray);
                return bArr4;
            } catch (Exception e) {
                e.getMessage();
                SVG svg = Fillr.getInstance().fillrConfig;
                return null;
            }
        } catch (Exception e2) {
            e2.getMessage();
            SVG svg2 = Fillr.getInstance().fillrConfig;
            return bArr4;
        }
    }

    public final void decrypt(byte[] bArr) {
        byte[] bArr2;
        int i = this.length;
        if (i < 16) {
            return;
        }
        byte[] bArr3 = new byte[16];
        int i2 = i - 16;
        byte[] bArr4 = new byte[i2];
        System.arraycopy(this.data, 0, bArr3, 0, 16);
        System.arraycopy(this.data, 16, bArr4, 0, i2);
        int i3 = 2;
        byte[] bArr5 = null;
        try {
            byte[] bArr6 = TLSUtils.TLS_RSA_WITH_AES_128_CBC_SHA;
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = (Cipher) TLSUtils.CIPHER_AES.get();
            cipher.init(2, secretKeySpec, ivParameterSpec);
            bArr2 = cipher.doFinal(bArr4);
        } catch (Exception e) {
            e.getMessage();
            SVG svg = Fillr.getInstance().fillrConfig;
            bArr2 = null;
        }
        if (bArr2 == null || bArr2.length < 1) {
            bArr5 = bArr2;
        } else {
            try {
                int length = bArr2.length - (bArr2[bArr2.length - 1] + 1);
                byte[] bArr7 = new byte[length];
                System.arraycopy(bArr2, 0, bArr7, 0, length);
                bArr5 = bArr7;
            } catch (Exception unused) {
            }
        }
        this.data = bArr5;
        if (bArr5 == null) {
            this.length = 0;
            return;
        }
        this.mac = new byte[20];
        int i4 = this.f988type;
        if (i4 == 22) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.data);
            byteArrayInputStream.read();
            i3 = TLSUtils.readUint24(byteArrayInputStream) + 4;
        } else if (i4 != 21) {
            i3 = i4 == 23 ? bArr5.length - 20 : 0;
        }
        byte[] bArr8 = new byte[i3];
        System.arraycopy(this.data, 0, bArr8, 0, i3);
        byte[] bArr9 = this.data;
        byte[] bArr10 = this.mac;
        System.arraycopy(bArr9, i3, bArr10, 0, bArr10.length);
        this.data = bArr8;
        this.length = i3;
    }

    public final int getType() {
        return this.f988type;
    }

    public final byte[] toAesEncryptedBytes(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] arrayConcat = TLSUtils.arrayConcat(this.data, calculateMac(j, bArr));
        int length = 16 - ((arrayConcat.length + 1) % 16);
        if (length == 16) {
            length = 0;
        }
        byte[] bArr5 = new byte[arrayConcat.length + length + 1];
        Arrays.fill(bArr5, (byte) length);
        System.arraycopy(arrayConcat, 0, bArr5, 0, arrayConcat.length);
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher cipher = (Cipher) TLSUtils.CIPHER_AES.get();
            cipher.init(1, secretKeySpec, ivParameterSpec);
            bArr4 = cipher.doFinal(bArr5);
        } catch (Exception e) {
            e.getMessage();
            SVG svg = Fillr.getInstance().fillrConfig;
            bArr4 = null;
        }
        byteArrayOutputStream.write(this.f988type & 255);
        byteArrayOutputStream.write(this.versionHigh & 255);
        byteArrayOutputStream.write(this.versionLow & 255);
        TLSUtils.writeRLEByteArray(byteArrayOutputStream, TLSUtils.arrayConcat(bArr3, bArr4), 65535);
        return byteArrayOutputStream.toByteArray();
    }

    public final byte[] toBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = this.f988type;
        byte[] bArr = TLSUtils.TLS_RSA_WITH_AES_128_CBC_SHA;
        byteArrayOutputStream.write(i & 255);
        byteArrayOutputStream.write(this.versionHigh & 255);
        byteArrayOutputStream.write(this.versionLow & 255);
        TLSUtils.writeRLEByteArray(byteArrayOutputStream, this.data, 65535);
        return byteArrayOutputStream.toByteArray();
    }
}
