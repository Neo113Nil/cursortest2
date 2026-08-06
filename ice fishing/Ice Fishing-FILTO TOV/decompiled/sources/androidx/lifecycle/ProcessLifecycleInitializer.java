package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.as0;
import defpackage.bs0;
import defpackage.f4;
import defpackage.l90;
import defpackage.n90;
import defpackage.o10;
import defpackage.o4;
import defpackage.o90;
import defpackage.xp;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements o10 {
    @Override // defpackage.o10
    public final List GWasM1elztuh() {
        return xp.OOA6hdeuvCS;
    }

    @Override // defpackage.o10
    public final Object Yi7zF1RB1(Context context) {
        context.getClass();
        f4 AvO7iQsrTN = f4.AvO7iQsrTN(context);
        AvO7iQsrTN.getClass();
        if (!((HashSet) AvO7iQsrTN.X1lG3V04pd).contains(ProcessLifecycleInitializer.class)) {
            o4.jivtDDk9H("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!o90.GWasM1elztuh.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new n90());
        }
        bs0 bs0Var = bs0.XnEVoBF0td1l;
        bs0Var.getClass();
        bs0Var.mOu10nynGul = new Handler();
        bs0Var.JFJ3QoxA.xqGvceK5x(l90.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new as0(bs0Var));
        return bs0Var;
    }
}
