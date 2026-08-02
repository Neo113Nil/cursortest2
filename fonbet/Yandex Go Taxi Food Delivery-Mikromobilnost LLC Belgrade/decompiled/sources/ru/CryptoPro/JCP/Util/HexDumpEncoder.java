package ru.CryptoPro.JCP.Util;

import com.ybsdk.widgets.common.MoneyInputEditView;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;

/* loaded from: classes4.dex */
public class HexDumpEncoder extends CharacterEncoder {
    private int currentByte;
    private int offset;
    private byte[] thisLine = new byte[16];
    private int thisLineLength;

    public static void hexDigit(PrintStream printStream, byte b) {
        char c = (char) ((b >> 4) & 15);
        printStream.write((char) (c > '\t' ? c + '7' : c + MoneyInputEditView.DEFAULT_VALUE));
        char c2 = (char) (b & PKIBody._CCP);
        printStream.write((char) (c2 > '\t' ? c2 + '7' : c2 + MoneyInputEditView.DEFAULT_VALUE));
    }

    @Override // ru.CryptoPro.JCP.Util.CharacterEncoder
    public int bytesPerAtom() {
        return 1;
    }

    @Override // ru.CryptoPro.JCP.Util.CharacterEncoder
    public int bytesPerLine() {
        return 16;
    }

    @Override // ru.CryptoPro.JCP.Util.CharacterEncoder
    public void encodeAtom(OutputStream outputStream, byte[] bArr, int i, int i2) throws IOException {
        this.thisLine[this.currentByte] = bArr[i];
        hexDigit(this.pStream, bArr[i]);
        this.pStream.getClass();
        int i3 = this.currentByte + 1;
        this.currentByte = i3;
        if (i3 == 8) {
            this.pStream.getClass();
        }
    }

    @Override // ru.CryptoPro.JCP.Util.CharacterEncoder
    public void encodeBufferPrefix(OutputStream outputStream) throws IOException {
        this.offset = 0;
        super.encodeBufferPrefix(outputStream);
    }

    @Override // ru.CryptoPro.JCP.Util.CharacterEncoder
    public void encodeLinePrefix(OutputStream outputStream, int i) throws IOException {
        hexDigit(this.pStream, (byte) ((this.offset >>> 8) & 255));
        hexDigit(this.pStream, (byte) (this.offset & 255));
        this.pStream.getClass();
        this.currentByte = 0;
        this.thisLineLength = i;
    }

    @Override // ru.CryptoPro.JCP.Util.CharacterEncoder
    public void encodeLineSuffix(OutputStream outputStream) throws IOException {
        int i = this.thisLineLength;
        if (i < 16) {
            while (i < 16) {
                this.pStream.getClass();
                if (i == 7) {
                    this.pStream.getClass();
                }
                i++;
            }
        }
        this.pStream.getClass();
        for (int i2 = 0; i2 < this.thisLineLength; i2++) {
            byte b = this.thisLine[i2];
            if (b < 32 || b > 122) {
                this.pStream.getClass();
            } else {
                this.pStream.write(b);
            }
        }
        this.pStream.getClass();
        this.offset += this.thisLineLength;
    }
}
