package yads;

import java.io.IOException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class ef1 extends IOException {
    public ef1(Throwable th) {
        super("Unexpected " + th.getClass().getSimpleName() + Extension.COLON_SPACE + th.getMessage(), th);
    }
}
