package ru.CryptoPro.JCP.tools;

import java.net.URL;

/* loaded from: classes4.dex */
public class TestVerifyClassJar extends SelfTested implements SelfTesterStrings {
    public final URL a;

    public TestVerifyClassJar(URL url) {
        this.a = url;
    }

    @Override // ru.CryptoPro.JCP.tools.SelfTested
    public final long getPeriod() {
        return 86400000L;
    }

    @Override // ru.CryptoPro.JCP.tools.SelfTested
    public final void run() {
    }

    public final String toString() {
        return getClass().getName() + this.a.toString();
    }
}
