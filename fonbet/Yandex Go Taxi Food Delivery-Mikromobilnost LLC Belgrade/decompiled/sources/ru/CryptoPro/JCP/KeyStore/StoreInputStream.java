package ru.CryptoPro.JCP.KeyStore;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class StoreInputStream extends InputStream {
    public String a;
    public final String b;
    public final boolean c;

    public StoreInputStream(String str) {
        this.a = null;
        this.c = false;
        this.b = str;
    }

    public String getContainerAlias() {
        String str = this.a;
        String str2 = this.b;
        return str != null ? str.concat(str2) : str2;
    }

    public boolean isFqcnName() {
        return this.c || this.a != null;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return -1;
    }

    public void setContainerPrefix(String str) {
        this.a = str;
    }

    public StoreInputStream(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = true;
    }

    public StoreInputStream(String str, boolean z) {
        this.a = null;
        this.b = str;
        this.c = z;
    }
}
