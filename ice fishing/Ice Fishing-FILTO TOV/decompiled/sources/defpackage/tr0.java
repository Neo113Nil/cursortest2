package defpackage;

import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class tr0 {
    public static final sr0 GWasM1elztuh;

    static {
        sr0 sr0Var;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("robolectric")) {
                sr0Var = new sr0();
                GWasM1elztuh = sr0Var;
            }
        }
        sr0Var = null;
        GWasM1elztuh = sr0Var;
    }
}
