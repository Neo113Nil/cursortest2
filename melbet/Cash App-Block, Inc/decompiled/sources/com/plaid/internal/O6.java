package com.plaid.internal;

import java.io.BufferedInputStream;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class O6 {
    public final BufferedInputStream a;

    public O6(InputStream inputStream) {
        this.a = new BufferedInputStream(inputStream);
    }

    public final String a() {
        int read;
        StringBuilder sb = new StringBuilder();
        while (true) {
            read = this.a.read();
            if (read == -1 || read == 10) {
                break;
            }
            if (read != 13) {
                sb.append((char) read);
            }
        }
        if (read == -1 && sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }
}
