package ru.CryptoPro.JCP.tools;

import com.ybsdk.widgets.common.MoneyInputEditView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/* loaded from: classes4.dex */
public class Encoder {
    public static final char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    protected PrintStream pStream;

    public void encode(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[57];
        encodeBufferPrefix(outputStream);
        while (true) {
            int readFully = readFully(inputStream, bArr);
            if (readFully == 0) {
                return;
            }
            int i = 0;
            while (i < readFully) {
                int i2 = i + 3;
                encodeAtom(outputStream, bArr, i, i2 <= readFully ? 3 : readFully - i);
                i = i2;
            }
            if (readFully < 57) {
                return;
            } else {
                encodeLineSuffix(outputStream);
            }
        }
    }

    public void encodeAtom(OutputStream outputStream, byte[] bArr, int i, int i2) throws IOException {
        char c = '=';
        char[] cArr = a;
        if (i2 == 1) {
            byte b = bArr[i];
            outputStream.write(cArr[(b >>> 2) & 63]);
            outputStream.write(cArr[(b << 4) & 48]);
            outputStream.write(61);
        } else if (i2 == 2) {
            byte b2 = bArr[i];
            byte b3 = bArr[i + 1];
            outputStream.write(cArr[(b2 >>> 2) & 63]);
            outputStream.write(cArr[((b2 << 4) & 48) + ((b3 >>> 4) & 15)]);
            outputStream.write(cArr[(b3 << 2) & 60]);
        } else {
            byte b4 = bArr[i];
            byte b5 = bArr[i + 1];
            byte b6 = bArr[i + 2];
            outputStream.write(cArr[(b4 >>> 2) & 63]);
            outputStream.write(cArr[((b4 << 4) & 48) + ((b5 >>> 4) & 15)]);
            outputStream.write(cArr[((b5 << 2) & 60) + ((b6 >>> 6) & 3)]);
            c = cArr[b6 & 63];
        }
        outputStream.write(c);
    }

    public void encodeBuffer(InputStream inputStream, OutputStream outputStream) throws IOException {
        int readFully;
        byte[] bArr = new byte[57];
        encodeBufferPrefix(outputStream);
        do {
            readFully = readFully(inputStream, bArr);
            if (readFully == 0) {
                return;
            }
            int i = 0;
            while (i < readFully) {
                int i2 = i + 3;
                encodeAtom(outputStream, bArr, i, i2 <= readFully ? 3 : readFully - i);
                i = i2;
            }
            encodeLineSuffix(outputStream);
        } while (readFully >= 57);
    }

    public void encodeBufferPrefix(OutputStream outputStream) throws IOException {
        this.pStream = new PrintStream(outputStream);
    }

    public void encodeLineSuffix(OutputStream outputStream) throws IOException {
        this.pStream.getClass();
    }

    public int readFully(InputStream inputStream, byte[] bArr) throws IOException {
        for (int i = 0; i < bArr.length; i++) {
            int read = inputStream.read();
            if (read == -1) {
                return i;
            }
            bArr[i] = (byte) read;
        }
        return bArr.length;
    }

    public String encodeBuffer(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encodeBuffer(new ByteArrayInputStream(bArr), byteArrayOutputStream);
            return byteArrayOutputStream.toString();
        } catch (Exception unused) {
            throw new Error("ChracterEncoder::encodeBuffer internal error");
        }
    }

    public String encode(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encode(new ByteArrayInputStream(bArr), byteArrayOutputStream);
            return byteArrayOutputStream.toString("8859_1");
        } catch (Exception unused) {
            throw new Error("ChracterEncoder::encodeBuffer internal error");
        }
    }

    public void encodeBuffer(byte[] bArr, OutputStream outputStream) throws IOException {
        encodeBuffer(new ByteArrayInputStream(bArr), outputStream);
    }

    public void encode(byte[] bArr, OutputStream outputStream) throws IOException {
        encode(new ByteArrayInputStream(bArr), outputStream);
    }
}
