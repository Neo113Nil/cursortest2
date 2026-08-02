package ru.CryptoPro.JCP.tools;

import defpackage.s2u0;
import ru.CryptoPro.JCP.Util.JavaVersionSupport;

/* loaded from: classes4.dex */
public class TestJavaVersion extends SelfTested implements SelfTesterStrings {
    @Override // ru.CryptoPro.JCP.tools.SelfTested
    public final void run() {
        try {
            JavaVersionSupport.validateJavaVersion();
        } catch (RuntimeException e) {
            s2u0.o(e);
        }
    }
}
