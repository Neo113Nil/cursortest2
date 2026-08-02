package defpackage;

import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class v741 {
    public int a = 3;
    public final String b = UUID.randomUUID().toString();

    public final void a(int i) {
        if (i != 0) {
            if (i == 0) {
                i = 0;
            } else if (i != 2 && i != 1 && i != 23 && i != 3) {
                Locale locale = Locale.US;
                ny61.g(oyr.i(i, "Invalid environment value "));
                return;
            }
        }
        this.a = i;
    }
}
