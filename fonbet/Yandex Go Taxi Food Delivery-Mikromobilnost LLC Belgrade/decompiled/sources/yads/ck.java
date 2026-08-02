package yads;

import defpackage.b64;
import defpackage.qd81;
import defpackage.vfc;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class ck extends Exception {
    public final int b;
    public final boolean c;
    public final qd81 d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ck(int i, int i2, int i3, int i4, qd81 qd81Var, boolean z, RuntimeException runtimeException) {
        super(r5.toString(), runtimeException);
        StringBuilder s = b64.s(i, i2, "AudioTrack init failed ", " Config(", Extension.FIX_SPACE);
        vfc.u(i3, i4, Extension.FIX_SPACE, Extension.C_BRAKE, s);
        s.append(z ? " (recoverable)" : "");
        this.b = i;
        this.c = z;
        this.d = qd81Var;
    }
}
