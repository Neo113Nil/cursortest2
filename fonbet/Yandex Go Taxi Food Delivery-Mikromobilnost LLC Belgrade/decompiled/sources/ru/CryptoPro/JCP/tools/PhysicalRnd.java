package ru.CryptoPro.JCP.tools;

import defpackage.ny61;
import java.security.SecureRandom;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools.Control.KeyUsageControlUtility;

/* loaded from: classes4.dex */
public class PhysicalRnd {
    public static void init() {
        if (KeyUsageControlUtility.isStrictModeEnabled()) {
            try {
                SecureRandom.getInstance(JCP.CP_RANDOM, "JCP").nextInt();
            } catch (Throwable th) {
                ny61.h("SecureRandom initiation failed.", th);
            }
        }
    }
}
