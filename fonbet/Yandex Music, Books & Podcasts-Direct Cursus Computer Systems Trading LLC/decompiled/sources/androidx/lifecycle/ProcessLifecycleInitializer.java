package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.btm;
import defpackage.c5b;
import defpackage.ctm;
import defpackage.kyf;
import defpackage.lme;
import defpackage.nsh;
import defpackage.ryf;
import defpackage.syf;
import defpackage.xq0;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Llme;", "Ldzf;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements lme {
    @Override // defpackage.lme
    public final List a() {
        return c5b.a;
    }

    @Override // defpackage.lme
    public final Object create(Context context) {
        context.getClass();
        nsh z = nsh.z(context);
        z.getClass();
        if (!((HashSet) z.c).contains(ProcessLifecycleInitializer.class)) {
            xq0.q("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!syf.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new ryf());
        }
        ctm ctmVar = ctm.i;
        ctmVar.getClass();
        ctmVar.e = new Handler();
        ctmVar.f.g(kyf.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new btm(ctmVar));
        return ctmVar;
    }
}
