package defpackage;

import android.os.Build;
import android.system.Os;
import android.system.StructUtsname;
import com.yandex.pulse.metrics.g;

/* loaded from: classes8.dex */
public abstract class s1x0 {
    public static final String a;

    static {
        g gVar = g.a;
        StructUtsname uname = Os.uname();
        a = uname != null ? uname.machine : Build.CPU_ABI;
    }
}
