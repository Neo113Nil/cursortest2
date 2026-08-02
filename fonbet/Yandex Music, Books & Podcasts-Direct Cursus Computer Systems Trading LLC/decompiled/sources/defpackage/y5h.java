package defpackage;

import android.os.SystemClock;
import android.util.Printer;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes5.dex */
public final class y5h implements Printer {
    public final /* synthetic */ uk7 a;

    public y5h(uk7 uk7Var) {
        this.a = uk7Var;
    }

    @Override // android.util.Printer
    public final void println(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean startsWith = str.startsWith(">>>>> Dispatching to ");
        uk7 uk7Var = this.a;
        if (startsWith) {
            uk7Var.g = uptimeMillis;
            return;
        }
        if (str.startsWith("<<<<< Finished to ")) {
            long j = uk7Var.g;
            if (j != 0) {
                long j2 = uptimeMillis - j;
                if (j2 >= uk7Var.f) {
                    owg owgVar = new owg(j, j2);
                    if (((h5n) uk7Var.d) == null) {
                        ((ArrayList) uk7Var.c).add(owgVar);
                    } else {
                        ((h5n) uk7Var.d).c(Collections.singletonList(owgVar));
                    }
                }
            }
        }
    }
}
