package ru.CryptoPro.JCP.params;

import defpackage.ny61;
import java.security.KeyStore;

/* loaded from: classes4.dex */
public class JCPProtectionParameter extends KeyStore.PasswordProtection {
    public static final int AT_ANY = 0;
    public static final int AT_KEYEXCHANGE = 1;
    public static final int AT_SIGNATURE = 2;
    public static final int AT_SYMMETRIC = -2147483643;
    public final boolean a;
    public final boolean b;
    public final int c;

    public JCPProtectionParameter(char[] cArr, boolean z, boolean z2, int i, boolean z3) {
        super(cArr);
        this.a = false;
        this.b = false;
        this.c = 1;
        if (i != 1 && i != 2 && i != -2147483643 && i != 0) {
            ny61.g("Bad key type!");
            throw null;
        }
        this.c = i;
        this.a = z;
        this.b = z2;
    }

    public int getKeyType() {
        return this.c;
    }

    public boolean isAllowEmptyChain() {
        return this.b;
    }

    public boolean isSilentMode() {
        return this.a;
    }

    public JCPProtectionParameter(char[] cArr, boolean z) {
        this(cArr, z, false);
    }

    public JCPProtectionParameter(char[] cArr, boolean z, boolean z2) {
        this(cArr, z, z2, 0);
    }

    public JCPProtectionParameter(char[] cArr, boolean z, boolean z2, int i) {
        this(cArr, z, z2, i, false);
    }

    public JCPProtectionParameter(char[] cArr) {
        this(cArr, false);
    }
}
