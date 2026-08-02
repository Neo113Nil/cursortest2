package yads;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import android.webkit.WebView;
import defpackage.at71;
import defpackage.bvf0;
import defpackage.bz61;
import defpackage.cvu0;
import defpackage.cvw;
import defpackage.evu0;
import defpackage.ht81;
import defpackage.i4a1;
import defpackage.jl40;
import defpackage.lm71;
import defpackage.m2v;
import defpackage.mdh;
import defpackage.n291;
import defpackage.nk61;
import defpackage.qc71;
import defpackage.qhw0;
import defpackage.qx71;
import defpackage.rm61;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tb71;
import defpackage.tje;
import defpackage.uyj;
import defpackage.wha1;
import defpackage.xga1;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class vt1 extends Lambda implements sls {
    public final /* synthetic */ Context b;
    public final /* synthetic */ n291 c;
    public final /* synthetic */ bz61 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt1(Context context, n291 n291Var, bz61 bz61Var) {
        super(0);
        this.b = context;
        this.c = n291Var;
        this.d = bz61Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Context context = this.b;
        n291 n291Var = this.c;
        bz61 bz61Var = this.d;
        new at71().a.getClass();
        String processName = Application.getProcessName();
        int i = 0;
        if (processName == null || (!cvu0.s(processName, ":Metrica", false) && !cvu0.s(processName, ":AppMetrica", false))) {
            Context context2 = n291Var.a;
            qx71 qx71Var = new qx71(i, wha1.c(context2, context2));
            qhw0 a = jl40.a();
            sjh sjhVar = uyj.a;
            tje.N(bvf0.a(cvw.U(a, mdh.b).plus(qx71Var)), null, null, new xt1(context, n291Var, null), 3);
            new rm61().a.getClass();
            String processName2 = Application.getProcessName();
            String d0 = processName2 != null ? evu0.d0(processName2, ":", "") : null;
            if (d0 != null && d0.length() > 0) {
                try {
                    WebView.setDataDirectorySuffix(d0);
                } catch (Throwable unused) {
                }
            }
            Context applicationContext = context.getApplicationContext();
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            int i2 = 1;
            if (xga1.c(applicationContext) && !jl40.l(Thread.currentThread(), Looper.getMainLooper().getThread()) && !atomicBoolean.getAndSet(true)) {
                qc71.c("SDK API usage from a background thread detected. Please, use SDK API only from the main thread.", new Object[0]);
            }
            m2v e = i4a1.e(n291Var);
            tb71.b(context);
            ((ht81) ((lm71) e.a).b).b.execute(new nk61(i2, e, context, bz61Var));
        }
        return zy11.a;
    }
}
