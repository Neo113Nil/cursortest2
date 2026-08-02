package ru.CryptoPro.JCP.params;

import java.nio.charset.StandardCharsets;
import javax.crypto.spec.PBEKeySpec;
import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
public class JCPPBEKeySpec extends PBEKeySpec {
    public static final int PBKDF2_2012_256 = 32827;
    public static final int PBKDF2_2012_512 = 32826;
    public static final int PBKDF2_94_256 = 32832;
    public final byte[] a;

    public JCPPBEKeySpec(char[] cArr) {
        super(cArr);
        this.a = new String(cArr).getBytes(StandardCharsets.UTF_8);
    }

    public byte[] getPasswd() {
        return this.a;
    }

    public JCPPBEKeySpec(byte[] bArr, byte[] bArr2, int i, int i2) {
        super(null, bArr2, i, i2);
        this.a = Array.copy(bArr);
    }

    public JCPPBEKeySpec(byte[] bArr, byte[] bArr2, int i) {
        super(null, bArr2, i);
        this.a = Array.copy(bArr);
    }

    public JCPPBEKeySpec(char[] cArr, byte[] bArr, int i) {
        super(cArr, bArr, i);
        this.a = new String(cArr).getBytes(StandardCharsets.UTF_8);
    }

    public JCPPBEKeySpec(char[] cArr, byte[] bArr, int i, int i2) {
        super(cArr, bArr, i, i2);
        this.a = new String(cArr).getBytes(StandardCharsets.UTF_8);
    }
}
