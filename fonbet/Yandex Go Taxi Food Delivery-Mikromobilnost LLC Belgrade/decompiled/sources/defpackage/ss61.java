package defpackage;

import java.io.IOException;
import ru.CryptoPro.JCP.tools.License;

/* loaded from: classes4.dex */
public class ss61 {
    public static final boolean a;

    static {
        boolean z;
        try {
            z = new License().hasCrypt();
        } catch (IOException unused) {
            z = false;
        }
        a = z;
    }
}
