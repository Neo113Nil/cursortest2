package yads;

import defpackage.b64;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class ta0 extends IllegalStateException {
    public ta0(int i, int i2) {
        super(b64.d(i, i2, "Buffer too small (", " < ", Extension.C_BRAKE));
    }
}
