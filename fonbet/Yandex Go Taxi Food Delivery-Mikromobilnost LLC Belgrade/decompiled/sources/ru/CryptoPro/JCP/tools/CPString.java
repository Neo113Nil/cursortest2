package ru.CryptoPro.JCP.tools;

import defpackage.ny61;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Vector;

/* loaded from: classes4.dex */
public class CPString {
    public static final int STR = 1;
    public static final int TSTR = 2;
    public static final int WSTR = 3;

    public static byte[] getArray(String str, int i) {
        if (i != 3 && i != 2) {
            if (i == 1) {
                try {
                    byte[] array = Charset.forName("windows-1251").newEncoder().encode(CharBuffer.wrap(str.toCharArray())).array();
                    int length = array.length;
                    byte[] bArr = new byte[length + 1];
                    System.arraycopy(array, 0, bArr, 0, array.length);
                    bArr[length] = 0;
                    return bArr;
                } catch (CharacterCodingException e) {
                    ny61.g(e.getMessage());
                }
            }
            return null;
        }
        return getArray(str);
    }

    public static int getNullChar(byte[] bArr, int i) {
        if (bArr == null) {
            return -1;
        }
        int length = bArr.length;
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return length;
    }

    public static String getString(byte[] bArr, int i, int[] iArr, int i2) {
        iArr[0] = i;
        String str = null;
        if (bArr != null) {
            int nullChar = getNullChar(bArr, i);
            if (i2 == 3 || i2 == 2) {
                str = new String(bArr, i, nullChar - i);
            } else if (i2 == 1) {
                try {
                    str = new String(Charset.forName("windows-1251").newDecoder().decode(ByteBuffer.wrap(bArr, i, nullChar - i)).array());
                } catch (CharacterCodingException e) {
                    ny61.g(e.getMessage());
                    return null;
                }
            }
            iArr[0] = nullChar + 1;
        }
        return str;
    }

    public static String[] getStrings(byte[] bArr) {
        int i = 0;
        Vector vector = new Vector(0);
        int[] iArr = new int[1];
        for (int i2 = 0; i2 < bArr.length; i2 = iArr[0]) {
            vector.add(getString(bArr, i2, iArr));
        }
        String[] strArr = new String[vector.size()];
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            strArr[i] = (String) it.next();
            i++;
        }
        return strArr;
    }

    public static byte[] getArray(String str) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        byte[] bArr = new byte[length + 1];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        bArr[length] = 0;
        return bArr;
    }

    public static byte[] getArray(String[] strArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(0);
        for (String str : strArr) {
            try {
                byteArrayOutputStream.write(getArray(str));
            } catch (IOException unused) {
                byteArrayOutputStream.reset();
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static String getString(byte[] bArr) {
        return getString(bArr, 0, new int[1]);
    }

    public static String getString(byte[] bArr, int i) {
        return getString(bArr, 0, new int[1], i);
    }

    public static String getString(byte[] bArr, int i, int[] iArr) {
        iArr[0] = i;
        if (bArr == null) {
            return null;
        }
        int nullChar = getNullChar(bArr, i);
        String str = new String(bArr, i, nullChar - i);
        iArr[0] = nullChar + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0013, code lost:
    
        r0.write(0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getString(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(0);
        while (true) {
            try {
                if (inputStream.available() <= 0) {
                    break;
                }
                int read = inputStream.read();
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(read);
                if (read == 0) {
                    break;
                }
            } catch (IOException unused) {
            }
        }
        return getString(byteArrayOutputStream.toByteArray());
    }
}
