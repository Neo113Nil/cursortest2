package defpackage;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class jof {
    public static final boolean a;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        a = lowerCase.equals("robolectric");
    }
}
