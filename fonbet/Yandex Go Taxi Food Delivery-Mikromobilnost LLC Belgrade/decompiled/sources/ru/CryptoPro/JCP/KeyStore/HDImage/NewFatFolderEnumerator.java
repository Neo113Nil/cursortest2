package ru.CryptoPro.JCP.KeyStore.HDImage;

import defpackage.ny61;
import java.util.Enumeration;

/* loaded from: classes4.dex */
public final class NewFatFolderEnumerator implements Enumeration {
    public int a;
    public final String b;

    public NewFatFolderEnumerator(String str) {
        int length = str.length();
        char[] cArr = new char[length > 8 ? 8 : length];
        for (int i = 0; i < 8 && i < str.length(); i++) {
            char charAt = str.charAt(i);
            char lowerCase = Character.toLowerCase(charAt);
            if ((lowerCase < 'a' || lowerCase > 'z') && !Character.isDigit(charAt) && charAt != '-') {
                charAt = (char) ((((byte) charAt) % 26) + 97);
            }
            cArr[i] = charAt;
        }
        this.b = new String(cArr);
        this.a = 0;
    }

    public final String a(int i) {
        if (i >= 1000) {
            ny61.p();
            return null;
        }
        String str = this.b;
        int length = str.length();
        String valueOf = String.valueOf(i);
        int i2 = length + 4;
        StringBuffer stringBuffer = new StringBuffer(i2);
        stringBuffer.append(str);
        stringBuffer.append(".000");
        stringBuffer.replace(i2 - valueOf.length(), i2, valueOf);
        return stringBuffer.toString();
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.a < 1000;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        int i = this.a;
        this.a = i + 1;
        return a(i);
    }

    public String toString() {
        int i = this.a;
        return i < 1000 ? a(i) : "";
    }
}
