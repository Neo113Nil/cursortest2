package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class omd {
    public final Context a;
    public final String b;
    public final po0 c;
    public final eo0 d;
    public final wo0 e;
    public final Looper f;
    public final int g;
    public final dxw h;
    public final rwd i;
    public final umd j;

    public omd(Context context, Activity activity, po0 po0Var, eo0 eo0Var, nmd nmdVar) {
        y1g.H(context, "Null context is not permitted.");
        y1g.H(po0Var, "Api must not be null.");
        y1g.H(nmdVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        y1g.H(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.b = attributionTag;
        this.c = po0Var;
        this.d = eo0Var;
        this.f = nmdVar.b;
        wo0 wo0Var = new wo0(po0Var, eo0Var, attributionTag);
        this.e = wo0Var;
        this.h = new dxw(this);
        umd g = umd.g(applicationContext);
        this.j = g;
        this.g = g.h.getAndIncrement();
        this.i = nmdVar.a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            vyf c = LifecycleCallback.c(new oyf(activity));
            fww fwwVar = (fww) c.b("ConnectionlessLifecycleHelper", fww.class);
            if (fwwVar == null) {
                int i = pmd.c;
                fwwVar = new fww(c, g);
            }
            fwwVar.f.add(wo0Var);
            g.a(fwwVar);
        }
        fsn fsnVar = g.n;
        fsnVar.sendMessage(fsnVar.obtainMessage(7, this));
    }

    public final nsh a() {
        nsh nshVar = new nsh(26, false);
        Set set = Collections.EMPTY_SET;
        if (((cz0) nshVar.b) == null) {
            nshVar.b = new cz0(0);
        }
        ((cz0) nshVar.b).addAll(set);
        Context context = this.a;
        nshVar.d = context.getClass().getName();
        nshVar.c = context.getPackageName();
        return nshVar;
    }

    public final wcg b(r0x r0xVar) {
        Looper looper = this.f;
        y1g.H(r0xVar, "Listener must not be null");
        y1g.H(looper, "Looper must not be null");
        wcg wcgVar = new wcg();
        new fsn(looper, 6);
        y1g.C("castDeviceControllerListenerKey");
        wcgVar.a = new vcg(r0xVar);
        return wcgVar;
    }

    public final onx c(int i, h8s h8sVar) {
        i8s i8sVar = new i8s();
        umd umdVar = this.j;
        umdVar.getClass();
        umdVar.f(i8sVar, h8sVar.a, this);
        pxw pxwVar = new pxw(new dyw(i, h8sVar, i8sVar, this.i), umdVar.i.get(), this);
        fsn fsnVar = umdVar.n;
        fsnVar.sendMessage(fsnVar.obtainMessage(4, pxwVar));
        return i8sVar.a;
    }
}
