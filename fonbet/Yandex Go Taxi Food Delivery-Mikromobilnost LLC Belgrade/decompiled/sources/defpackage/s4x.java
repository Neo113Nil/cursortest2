package defpackage;

import ru.CryptoPro.JCP.tools.JarChecker;

/* loaded from: classes4.dex */
public final class s4x {
    public final String a;
    public final String b;
    public final /* synthetic */ JarChecker c;

    public s4x(JarChecker jarChecker, String str, byte[] bArr) {
        this.c = jarChecker;
        this.a = str;
        this.b = jarChecker.h.encode(bArr);
    }

    public final boolean equals(Object obj) {
        boolean z = obj == this;
        if (!(obj instanceof s4x)) {
            return z;
        }
        s4x s4xVar = (s4x) obj;
        return this.a.equals(s4xVar.a) && this.b.equals(s4xVar.b);
    }

    public s4x(JarChecker jarChecker, String str, String str2) {
        this.c = jarChecker;
        this.a = str;
        this.b = str2;
    }
}
