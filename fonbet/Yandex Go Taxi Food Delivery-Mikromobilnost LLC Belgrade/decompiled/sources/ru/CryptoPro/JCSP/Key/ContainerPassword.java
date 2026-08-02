package ru.CryptoPro.JCSP.Key;

import java.io.ByteArrayOutputStream;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.CPString;
import ru.CryptoPro.JCSP.CStructReader.PinParamStructure;
import ru.CryptoPro.JCSP.CStructReader.StructException;
import ru.CryptoPro.JCSP.Random.JCSPCPRandom;

/* loaded from: classes4.dex */
public class ContainerPassword {
    private static final int c = 10;
    private static final byte[] d = {0};
    private PinParamStructure a;
    private byte[] b;

    public ContainerPassword(byte[] bArr, byte[] bArr2) {
        bArr = bArr == null ? bArr2 : bArr;
        this.b = bArr;
        PinParamStructure pinParamStructure = bArr != null ? new PinParamStructure((byte) 0, 0L) : new PinParamStructure((byte) 5, 0L);
        this.a = pinParamStructure;
        pinParamStructure.setAligned(4);
    }

    private static byte[] a() {
        byte[] bArr = new byte[10];
        new JCSPCPRandom().makeRandom(bArr, 0, 10);
        return CPString.getArray(Array.toHexString(bArr, 0).replaceAll(" ", ""));
    }

    public void clear() {
        byte[] bArr = this.b;
        if (bArr != null) {
            Array.clear(bArr);
        }
        this.b = null;
    }

    public int getOffset() {
        return this.a.type.length();
    }

    public byte[] getPassword() {
        return this.b;
    }

    public byte[] getStructArray() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(0);
        try {
            this.a.write(byteArrayOutputStream);
        } catch (StructException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public byte getUnionType() {
        return this.a.value.getUnionType();
    }

    public ContainerPassword(byte[] bArr) {
        this(bArr, d);
    }

    public ContainerPassword() {
        this(a(), d);
    }
}
