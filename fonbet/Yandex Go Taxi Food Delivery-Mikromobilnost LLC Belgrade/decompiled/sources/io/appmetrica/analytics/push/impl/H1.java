package io.appmetrica.analytics.push.impl;

import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes4.dex */
class H1 {
    public static int a(int i, boolean z) {
        return i | (z ? SelfTester_JCP.DECRYPT_CFB : SelfTester_JCP.DECRYPT_CBC);
    }
}
