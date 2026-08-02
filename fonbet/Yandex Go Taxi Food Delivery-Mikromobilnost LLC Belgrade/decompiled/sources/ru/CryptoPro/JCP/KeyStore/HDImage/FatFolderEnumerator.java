package ru.CryptoPro.JCP.KeyStore.HDImage;

import defpackage.ny61;
import java.io.File;
import java.util.Enumeration;

/* loaded from: classes4.dex */
public final class FatFolderEnumerator implements Enumeration {
    public static final File[] c = new File[0];
    public final File[] a;
    public int b;

    public FatFolderEnumerator(File file) {
        File[] listFiles = file.listFiles();
        this.a = listFiles == null ? c : listFiles;
        this.b = 0;
        a();
    }

    public final void a() {
        int i = this.b;
        while (true) {
            File[] fileArr = this.a;
            if (i >= fileArr.length) {
                break;
            }
            File file = fileArr[i];
            String name = file.getName();
            if (file.isDirectory() && name.length() <= 13) {
                break;
            } else {
                i++;
            }
        }
        this.b = i;
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.b < this.a.length;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        int i = this.b;
        File[] fileArr = this.a;
        if (i >= fileArr.length) {
            ny61.p();
            return null;
        }
        this.b = i + 1;
        String name = fileArr[i].getName();
        a();
        return name;
    }

    public String toString() {
        int i = this.b;
        File[] fileArr = this.a;
        return i < fileArr.length ? fileArr[i].getName() : "";
    }
}
