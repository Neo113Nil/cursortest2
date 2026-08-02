package ru.CryptoPro.JCP.VMInspector;

import defpackage.b64;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.util.Vector;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.Util.PaneDefaultProvider;
import ru.CryptoPro.JCP.tools.Array;
import ru.CryptoPro.JCP.tools.Encoder;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes4.dex */
public class JreDigest {
    public static final int DIGEST_LENGTH = 44;
    public static final String DEFAULT_JRE = System.getProperty("java.home");
    private static final MessageDigest digest = createDigest();

    private JreDigest() {
    }

    public static void checkFile(File file, String str, Vector vector) {
        File file2 = new File(file, str);
        if (!file2.isDirectory()) {
            vector.add(file2.getAbsolutePath());
            return;
        }
        Vector createList = createList(new File(file, str));
        for (int i = 0; i < createList.size(); i++) {
            vector.add(createList.elementAt(i));
        }
    }

    public static MessageDigest createDigest() {
        String defaultDigestSignatureProvider = PaneDefaultProvider.getDefaultDigestSignatureProvider(null);
        try {
            return MessageDigest.getInstance(JCP.GOST_DIGEST_2012_256_NAME, defaultDigestSignatureProvider);
        } catch (NoSuchAlgorithmException e) {
            ProviderException providerException = new ProviderException("GOST3411_2012_256 not found");
            providerException.initCause(e);
            throw providerException;
        } catch (NoSuchProviderException e2) {
            ProviderException providerException2 = new ProviderException(b64.j(defaultDigestSignatureProvider, " not found"));
            providerException2.initCause(e2);
            throw providerException2;
        }
    }

    public static Vector createList(File file) {
        Vector vector = new Vector(16);
        for (String str : file.list()) {
            checkFile(file, str, vector);
        }
        return vector;
    }

    public static String extractRelativePath(String str, String str2) {
        return str.substring(str2.length());
    }

    public static String fileDigest(String str, String str2) throws IOException {
        MessageDigest messageDigest = digest;
        messageDigest.reset();
        return new Encoder().encode(messageDigest.digest(Array.readFile(new File(str2, str))));
    }

    public static void main(String[] strArr) throws IOException {
        String str = strArr.length > 0 ? strArr[0] : DEFAULT_JRE;
        Vector createList = createList(new File(str));
        int size = createList.size();
        String[] strArr2 = new String[size];
        for (int i = 0; i < size; i++) {
            strArr2[i] = extractRelativePath((String) createList.elementAt(i), str);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (i2 <= strArr2[i3].length()) {
                i2 = strArr2[i3].length();
            }
        }
        int i4 = i2 + 1;
        int i5 = i2 + 45;
        char[] cArr = new char[i5];
        for (int i6 = 0; i6 < size; i6++) {
            String fileDigest = fileDigest(strArr2[i6], str);
            for (int i7 = 0; i7 < i5; i7++) {
                cArr[i7] = HexString.CHAR_SPACE;
            }
            for (int i8 = 0; i8 < strArr2[i6].length(); i8++) {
                cArr[i8] = strArr2[i6].charAt(i8);
            }
            for (int i9 = 0; i9 < fileDigest.length(); i9++) {
                cArr[i4 + i9] = fileDigest.charAt(i9);
            }
            System.out.getClass();
        }
    }
}
