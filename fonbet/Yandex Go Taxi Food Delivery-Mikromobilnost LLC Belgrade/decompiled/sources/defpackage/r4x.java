package defpackage;

import ru.CryptoPro.JCP.tools.JarChecker;

/* loaded from: classes4.dex */
public final class r4x {
    public final String a;
    public final String b;
    public final /* synthetic */ JarChecker c;

    public r4x(JarChecker jarChecker, byte[] bArr) {
        this.c = jarChecker;
        this.a = "Digest-Manifest-Main-Attributes";
        this.b = jarChecker.h.encode(bArr);
    }

    public r4x(JarChecker jarChecker) {
        this.c = jarChecker;
        this.a = "Signature-Version";
        this.b = "1.0";
    }
}
