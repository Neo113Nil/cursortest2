package ru.CryptoPro.JCP.tools;

import com.ybsdk.widgets.common.MoneyInputEditView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.util.Arrays;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes4.dex */
public class Decoder {
    public static final char[] b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    public static final byte[] c;
    protected int bytesPerAtom = 4;
    protected int bytesPerLine = 72;
    public final byte[] a = new byte[4];

    static {
        byte[] bArr = new byte[256];
        c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        while (true) {
            char[] cArr = b;
            if (i >= cArr.length) {
                return;
            }
            c[cArr[i]] = (byte) i;
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void decodeAtom(PushbackInputStream pushbackInputStream, OutputStream outputStream, int i) throws IOException {
        byte b2;
        byte b3;
        byte b4;
        int i2;
        int i3;
        int i4;
        if (i < 2) {
            throw new Error("BASE64Decoder: Not enough bytes for an atom.");
        }
        while (true) {
            int read = pushbackInputStream.read();
            byte b5 = -1;
            if (read == -1) {
                throw new Error();
            }
            if (read != 10 && read != 13) {
                byte[] bArr = this.a;
                bArr[0] = (byte) read;
                if (readFully(pushbackInputStream, bArr, 1, i - 1) == -1) {
                    throw new Error();
                }
                if (i > 3 && bArr[3] == 61) {
                    i = 3;
                }
                if (i > 2 && bArr[2] == 61) {
                    i = 2;
                }
                byte[] bArr2 = c;
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            b4 = -1;
                            b3 = -1;
                            b2 = -1;
                            if (i != 2) {
                                i2 = (b5 << 2) & 252;
                                i3 = 3 & (b3 >>> 4);
                            } else {
                                if (i == 3) {
                                    outputStream.write((byte) ((3 & (b3 >>> 4)) | ((b5 << 2) & 252)));
                                    i4 = ((b4 >>> 2) & 15) | ((b3 << 4) & PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC);
                                    outputStream.write((byte) i4);
                                    return;
                                }
                                if (i != 4) {
                                    return;
                                }
                                outputStream.write((byte) ((3 & (b3 >>> 4)) | ((b5 << 2) & 252)));
                                outputStream.write((byte) (((b3 << 4) & PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC) | ((b4 >>> 2) & 15)));
                                i2 = (b4 << 6) & 192;
                                i3 = b2 & 63;
                            }
                            i4 = i2 | i3;
                            outputStream.write((byte) i4);
                            return;
                        }
                        b5 = bArr2[bArr[3] & 255];
                    }
                    b2 = b5;
                    b5 = bArr2[bArr[2] & 255];
                } else {
                    b2 = -1;
                }
                b3 = bArr2[bArr[1] & 255];
                byte b6 = b5;
                b5 = bArr2[bArr[0] & 255];
                b4 = b6;
                if (i != 2) {
                }
                i4 = i2 | i3;
                outputStream.write((byte) i4);
                return;
            }
        }
    }

    public void decodeBuffer(InputStream inputStream, OutputStream outputStream) throws IOException {
        int i;
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream);
        while (true) {
            try {
                int decodeLinePrefix = decodeLinePrefix(pushbackInputStream, outputStream);
                int i2 = 0;
                while (true) {
                    i = this.bytesPerAtom;
                    if (i2 + i >= decodeLinePrefix) {
                        break;
                    }
                    decodeAtom(pushbackInputStream, outputStream, i);
                    i2 += this.bytesPerAtom;
                }
                if (i2 + i == decodeLinePrefix) {
                    decodeAtom(pushbackInputStream, outputStream, i);
                } else {
                    decodeAtom(pushbackInputStream, outputStream, decodeLinePrefix - i2);
                }
            } catch (Error unused) {
                return;
            }
        }
    }

    public int decodeLinePrefix(PushbackInputStream pushbackInputStream, OutputStream outputStream) throws IOException {
        return this.bytesPerLine;
    }

    public int readFully(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        for (int i3 = 0; i3 < i2; i3++) {
            int read = inputStream.read();
            if (read == -1) {
                if (i3 == 0) {
                    return -1;
                }
                return i3;
            }
            bArr[i3 + i] = (byte) read;
        }
        return i2;
    }

    public byte[] decodeBuffer(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        decodeBuffer(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public byte[] decodeBuffer(String str) throws IOException {
        byte[] bArr = new byte[str.length()];
        InputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        decodeBuffer(byteArrayInputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
