package ru.CryptoPro.JCP.tools.CPVerify;

import java.io.File;
import java.io.IOException;

/* loaded from: classes4.dex */
public class VerifiedFileListElement {
    public static final int IS_CHANGED = 2;
    public static final int IS_DELETED = 4;
    public static final int IS_NVEREFIED = 3;
    public static final int IS_OK = 1;
    public final File a;
    public int b;
    public byte[] c;

    public VerifiedFileListElement(File file, int i, byte[] bArr) {
        this.a = file;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 4;
                if (i != 4) {
                    i2 = 3;
                }
            }
        }
        this.b = i2;
        this.c = bArr;
    }

    public String getDescriptionString() throws IOException {
        StringBuilder sb;
        String str;
        int status = getStatus();
        if (status == 1) {
            sb = new StringBuilder("File ");
            sb.append(getFile().getCanonicalPath());
            str = " is OK.";
        } else if (status == 2) {
            sb = new StringBuilder("File ");
            sb.append(getFile().getCanonicalPath());
            str = " was changed!";
        } else if (status == 3) {
            sb = new StringBuilder("Can't verify file ");
            str = getFile().getCanonicalPath();
        } else {
            if (status != 4) {
                return null;
            }
            sb = new StringBuilder("File ");
            sb.append(getFile().getCanonicalPath());
            str = " was deleted!";
        }
        sb.append(str);
        return sb.toString();
    }

    public byte[] getDigest() {
        return this.c;
    }

    public File getFile() {
        return this.a;
    }

    public int getStatus() {
        return this.b;
    }

    public void setDigest(byte[] bArr) {
        this.c = bArr;
        this.b = 3;
    }

    public void setStatus(int i) {
        if (i == 1) {
            this.b = 1;
            return;
        }
        if (i == 2) {
            this.b = 2;
        } else if (i == 4) {
            this.b = 4;
        } else {
            this.b = 3;
        }
    }

    public String toString() {
        return this.a.toString();
    }
}
