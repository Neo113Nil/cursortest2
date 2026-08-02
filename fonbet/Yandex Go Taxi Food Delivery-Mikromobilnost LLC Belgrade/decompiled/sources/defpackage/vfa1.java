package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import skeletor.render.SkeletonContentView;
import yads.fw;
import yads.l13;
import yads.pf1;

/* loaded from: classes7.dex */
public abstract class vfa1 {
    public static volatile yy71 a;
    public static final Object b = new Object();
    public static au2 c;
    public static mgv d;

    public static zq71 a(Context context) {
        new xt71();
        new hx71();
        pf1 a2 = s881.a(context, context.getPackageName() + "_preferences");
        zq71 zq71Var = new zq71();
        for (fw fwVar : fw.values()) {
            bk81 bk81Var = null;
            fw fwVar2 = a2.a(fwVar.c) ? fwVar : null;
            bk81 a3 = fwVar2 != null ? hx71.a(a2, fwVar2) : null;
            if (a3 == null) {
                String str = fwVar.b;
                if (str == null || !a2.a(str)) {
                    fwVar = null;
                }
                if (fwVar != null) {
                    bk81Var = xt71.a(a2, fwVar);
                }
            } else {
                bk81Var = a3;
            }
            zq71Var.a(bk81Var);
        }
        if (a2.e.isEmpty()) {
            ((SharedPreferences) a2.d.getValue()).registerOnSharedPreferenceChangeListener(a2);
        }
        a2.e.add(new WeakReference(zq71Var));
        return zq71Var;
    }

    public static yy71 b(Context context) {
        z171 z171Var;
        m471 m471Var;
        Context applicationContext = context.getApplicationContext();
        l13 l13Var = new l13(applicationContext);
        m471 m471Var2 = m471.d;
        if (m471Var2 == null) {
            synchronized (m471.c) {
                m471Var = m471.d;
                if (m471Var == null) {
                    m471Var = new m471();
                    m471.d = m471Var;
                }
            }
            m471Var2 = m471Var;
        }
        synchronized (m471.c) {
            z171Var = m471Var2.b;
            if (z171Var == null) {
                m471Var2.a.getClass();
                z171Var = h171.a(applicationContext);
                m471Var2.b = z171Var;
            }
        }
        mk71 mk71Var = new mk71();
        new ou71();
        hn71 hn71Var = new hn71(applicationContext, new hn71(14, ou71.a(), mk71Var.a(applicationContext)));
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(4);
        wu81 wu81Var = new wu81(l13Var);
        ly61 ly61Var = new ly61();
        ly61Var.a = z171Var;
        ly61Var.b = hn71Var;
        return new yy71(applicationContext, wu81Var, new i191(ly61Var, newFixedThreadPool));
    }

    public static final mgv c() {
        mgv mgvVar = d;
        if (mgvVar != null) {
            return mgvVar;
        }
        lgv lgvVar = new lgv("QuestionOutlineXxs", 8.0f, 8.0f, 8.0f, 8.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA));
        uq90 e = nnm.e(4.1426f, 5.4697f);
        e.d(4.6343f, 5.4697f, 5.0332f, 5.8687f, 5.0332f, 6.3604f);
        e.d(5.033f, 6.8519f, 4.6342f, 7.25f, 4.1426f, 7.25f);
        e.d(3.6511f, 7.2499f, 3.2531f, 6.8518f, 3.2529f, 6.3604f);
        e.d(3.2529f, 5.8687f, 3.6509f, 5.4698f, 4.1426f, 5.4697f);
        e.c();
        e.j(4.1426f, 1.0f);
        e.d(4.5818f, 1.0f, 5.08f, 1.0916f, 5.4951f, 1.3486f);
        e.d(5.941f, 1.6249f, 6.286f, 2.0977f, 6.2861f, 2.7451f);
        e.o(2.8916f);
        e.d(6.2835f, 3.0697f, 6.2608f, 3.3334f, 6.126f, 3.6006f);
        e.d(5.9943f, 3.8614f, 5.7869f, 4.077f, 5.5254f, 4.2754f);
        e.h(5.2471f, 4.4688f);
        e.d(4.9472f, 4.6629f, 4.9072f, 4.7295f, 4.9072f, 4.7295f);
        e.d(4.9183f, 4.7099f, 4.8926f, 4.7172f, 4.8926f, 5.0f);
        e.f(3.3926f);
        e.d(3.3926f, 4.7134f, 3.4014f, 4.3441f, 3.6035f, 3.9883f);
        e.d(3.7966f, 3.6485f, 4.1112f, 3.4174f, 4.4316f, 3.21f);
        e.h(4.626f, 3.0742f);
        e.d(4.7307f, 2.9939f, 4.7697f, 2.9463f, 4.7822f, 2.9297f);
        e.d(4.7833f, 2.9095f, 4.7862f, 2.8585f, 4.7861f, 2.7461f);
        e.d(4.7861f, 2.7044f, 4.7771f, 2.689f, 4.7744f, 2.6846f);
        e.d(4.7698f, 2.677f, 4.753f, 2.6537f, 4.7051f, 2.624f);
        e.d(4.5978f, 2.5577f, 4.3994f, 2.5f, 4.1426f, 2.5f);
        e.d(3.8543f, 2.5f, 3.6822f, 2.5527f, 3.6016f, 2.6065f);
        e.d(3.5712f, 2.6267f, 3.5535f, 2.646f, 3.54f, 2.6728f);
        e.d(3.525f, 2.7029f, 3.5f, 2.7733f, 3.5f, 2.9111f);
        e.f(2.0f);
        e.d(2.0f, 2.2284f, 2.2742f, 1.6886f, 2.7695f, 1.3584f);
        e.d(3.2111f, 1.0641f, 3.7348f, 1.0f, 4.1426f, 1.0f);
        e.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e.a);
        mgv d2 = lgvVar.d();
        d = d2;
        return d2;
    }
}
