package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes6.dex */
public final class zt70 {
    public static final yt70 Companion = new yt70();
    public final boolean a;

    public /* synthetic */ zt70(int i, boolean z) {
        if (1 == (i & 1)) {
            this.a = z;
        } else {
            qje.Z(i, 1, xt70.a.getDescriptor());
            throw null;
        }
    }

    public final String toString() {
        return nzs.b("ManualLookup(enabled=", Extension.C_BRAKE, this.a);
    }

    public zt70(boolean z) {
        this.a = z;
    }
}
