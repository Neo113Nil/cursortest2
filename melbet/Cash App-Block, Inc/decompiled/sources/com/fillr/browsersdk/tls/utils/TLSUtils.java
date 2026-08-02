package com.fillr.browsersdk.tls.utils;

import androidx.camera.core.impl.utils.Exif;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.caverock.androidsvg.SVG;
import com.fillr.browsersdk.Fillr;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.PrfHmacJce;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes4.dex */
public abstract class TLSUtils {
    public static final AnonymousClass2 CIPHER_AES;
    public static final AnonymousClass2 CIPHER_RSA;
    public static final AnonymousClass2 HMAC_SHA_1;
    public static final AnonymousClass2 HMAC_SHA_256;
    public static final byte[] TLS_RSA_WITH_AES_128_CBC_SHA = {0, 47};
    public static final char[] HEX = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Exif.AnonymousClass1 DIGEST_SHA_256 = new Exif.AnonymousClass1(6);

    /* renamed from: com.fillr.browsersdk.tls.utils.TLSUtils$2, reason: invalid class name */
    public final class AnonymousClass2 extends ThreadLocal {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object val$name;

        public /* synthetic */ AnonymousClass2(Object obj, int i) {
            this.$r8$classId = i;
            this.val$name = obj;
        }

        @Override // java.lang.ThreadLocal
        public final Object initialValue() {
            int i = this.$r8$classId;
            Object obj = this.val$name;
            switch (i) {
                case 0:
                    try {
                        break;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return null;
                    }
                case 1:
                    try {
                        break;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        return null;
                    }
                default:
                    PrfHmacJce prfHmacJce = (PrfHmacJce) obj;
                    try {
                        EngineFactory engineFactory = EngineFactory.MAC;
                        Mac mac = (Mac) engineFactory.policy.getInstance(prfHmacJce.algorithm);
                        mac.init(prfHmacJce.key);
                        break;
                    } catch (GeneralSecurityException e3) {
                        OptionalProvider$$ExternalSyntheticLambda0.m(e3);
                        return null;
                    }
            }
            return null;
        }
    }

    static {
        int i = 0;
        CIPHER_AES = new AnonymousClass2("AES/CBC/NoPadding", i);
        CIPHER_RSA = new AnonymousClass2("RSA/ECB/PKCS1Padding", i);
        int i2 = 1;
        HMAC_SHA_1 = new AnonymousClass2("HmacSHA1", i2);
        HMAC_SHA_256 = new AnonymousClass2("HmacSHA256", i2);
    }

    public static byte[] arrayConcat(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length == 0) {
            return bArr2 == null ? bArr : bArr2;
        }
        if (bArr2 == null || bArr2.length == 0) {
            return bArr;
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static String arrayDump(byte[] bArr) {
        if (bArr == null) {
            return "(null)";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i++) {
            if (i > 0 && i % 32 == 0) {
                sb.append(",\n");
            } else if (i > 0) {
                sb.append(", ");
            }
            byte b = bArr[i];
            sb.append("0x");
            char[] cArr = HEX;
            sb.append(cArr[(b & 255) >>> 4]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }

    public static String denseHexDump(byte[] bArr) {
        return arrayDump(bArr).replaceAll("(0x|\\, |\\,)", "").replaceAll("([A-Z0-9]{8})", "$1 ").replaceAll(" \\n", "\n").trim();
    }

    public static byte[] hmacSha256Signature(byte[] bArr, byte[] bArr2) {
        try {
            Mac mac = (Mac) HMAC_SHA_256.get();
            mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
            return mac.doFinal(bArr2);
        } catch (Exception e) {
            e.getMessage();
            SVG svg = Fillr.getInstance().fillrConfig;
            return null;
        }
    }

    public static byte[] prf(String str, byte[] bArr, byte[] bArr2, int i) {
        byte[] arrayConcat = arrayConcat(str.getBytes(), bArr2);
        byte[] hmacSha256Signature = hmacSha256Signature(bArr, arrayConcat);
        if (hmacSha256Signature == null) {
            return null;
        }
        byte[] bArr3 = new byte[0];
        while (bArr3.length < i) {
            bArr3 = arrayConcat(bArr3, hmacSha256Signature(bArr, arrayConcat(hmacSha256Signature, arrayConcat)));
            hmacSha256Signature = hmacSha256Signature(bArr, hmacSha256Signature);
        }
        byte[] bArr4 = new byte[i];
        System.arraycopy(bArr3, 0, bArr4, 0, i);
        return bArr4;
    }

    public static byte[] readBytes(InputStream inputStream, int i) {
        int i2 = 0;
        if (i == 0) {
            return new byte[0];
        }
        if (i > 134217728) {
            a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Requested read size is too large; requested=", ", max=134217728"));
            return null;
        }
        byte[] bArr = new byte[i];
        do {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        } while (i2 < i);
        if (i2 == i) {
            return bArr;
        }
        a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline2.m(i, i2, "Was asked to read ", " bytes, but read ", " bytes instead!"));
        return null;
    }

    public static byte[] readRLEByteArray(InputStream inputStream) {
        int readUint8 = 65535.0d < Math.pow(2.0d, 8.0d) ? readUint8(inputStream) : 65535.0d < Math.pow(2.0d, 16.0d) ? ((inputStream.read() << 8) | inputStream.read()) & 65535 : 65535.0d < Math.pow(2.0d, 24.0d) ? readUint24(inputStream) : (int) (((inputStream.read() << 24) | (inputStream.read() << 16) | (inputStream.read() << 8) | inputStream.read()) & BodyPartID.bodyIdMax);
        return readUint8 > 0 ? readBytes(inputStream, readUint8) : new byte[0];
    }

    public static int readUint24(InputStream inputStream) {
        return (inputStream.read() | (inputStream.read() << 16) | (inputStream.read() << 8)) & 16777215;
    }

    public static int readUint8(InputStream inputStream) {
        int read = inputStream.read();
        return read == -1 ? read : read & 255;
    }

    public static byte[] sha256Hash(byte[] bArr) {
        try {
            return ((MessageDigest) DIGEST_SHA_256.get()).digest(bArr);
        } catch (Exception e) {
            e.getMessage();
            SVG svg = Fillr.getInstance().fillrConfig;
            return null;
        }
    }

    public static String version(int i, int i2) {
        return (i != 3 || i2 < 1 || i2 > 3) ? Recorder$$ExternalSyntheticOutline2.m(i, i2, "Unknown (", ".", ")") : i2 == 3 ? "1.2" : i2 == 2 ? "1.1" : "1.0";
    }

    public static void writeRLEByteArray(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, int i) {
        if (bArr.length > i) {
            a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline2.m(bArr.length, i, ", maxDataSize=", new StringBuilder("Data length exceeds limit; dataSize=")));
            return;
        }
        double d = i;
        if (d < Math.pow(2.0d, 8.0d)) {
            byteArrayOutputStream.write(bArr.length & 255);
        } else if (d < Math.pow(2.0d, 16.0d)) {
            int length = bArr.length;
            byteArrayOutputStream.write((65280 & length) >> 8);
            byteArrayOutputStream.write(length & 255);
        } else if (d < Math.pow(2.0d, 24.0d)) {
            writeUint24(byteArrayOutputStream, bArr.length);
        } else {
            long length2 = bArr.length;
            byteArrayOutputStream.write((int) (((-16777216) & length2) >> 24));
            byteArrayOutputStream.write((int) ((16711680 & length2) >> 16));
            byteArrayOutputStream.write((int) ((65280 & length2) >> 8));
            byteArrayOutputStream.write((int) (length2 & 255));
        }
        if (bArr.length > 0) {
            byteArrayOutputStream.write(bArr);
        }
    }

    public static void writeUint24(ByteArrayOutputStream byteArrayOutputStream, int i) {
        byteArrayOutputStream.write((16711680 & i) >> 16);
        byteArrayOutputStream.write((65280 & i) >> 8);
        byteArrayOutputStream.write(i & 255);
    }
}
