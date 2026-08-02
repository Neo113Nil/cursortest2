package defpackage;

import android.os.Build;
import android.system.Os;
import android.system.StructUtsname;

/* loaded from: classes5.dex */
public abstract class qyr {
    public static final String a;

    static {
        String str;
        uyr uyrVar = uyr.a;
        StructUtsname uname = Os.uname();
        if (uname != null) {
            str = uname.machine;
            str.getClass();
        } else {
            str = Build.CPU_ABI;
            str.getClass();
        }
        a = str;
    }
}
