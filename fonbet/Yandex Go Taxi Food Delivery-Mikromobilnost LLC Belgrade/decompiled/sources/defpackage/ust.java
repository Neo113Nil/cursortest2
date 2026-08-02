package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.zaae;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class ust implements j7u {
    public final Context a;
    public final String b;
    public final zm2 c;
    public final mm2 d;
    public final wn2 e;
    public final Looper f;
    public final int g;
    public final my81 h;
    public final o8u0 i;
    public final GoogleApiManager j;

    public ust(Context context, Activity activity, zm2 zm2Var, mm2 mm2Var, sst sstVar) {
        cvw.m(context, "Null context is not permitted.");
        cvw.m(zm2Var, "Api must not be null.");
        cvw.m(sstVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        cvw.m(applicationContext, "The provided context did not have an application context.");
        this.a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.b = attributionTag;
        this.c = zm2Var;
        this.d = mm2Var;
        this.f = sstVar.b;
        wn2 wn2Var = new wn2(zm2Var, mm2Var, attributionTag);
        this.e = wn2Var;
        this.h = new my81(this);
        GoogleApiManager zak = GoogleApiManager.zak(applicationContext);
        this.j = zak;
        this.g = zak.zaa();
        this.i = sstVar.a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            zaae.zad(activity, zak, wn2Var);
        }
        zak.zaz(this);
    }

    public final x2c a() {
        x2c x2cVar = new x2c();
        Set set = Collections.EMPTY_SET;
        if (x2cVar.a == null) {
            x2cVar.a = new j63();
        }
        x2cVar.a.addAll(set);
        Context context = this.a;
        x2cVar.c = context.getClass().getName();
        x2cVar.b = context.getPackageName();
        return x2cVar;
    }

    public final Task b(o8g0 o8g0Var) {
        yy81 yy81Var = (yy81) o8g0Var.a;
        cvw.m(yy81Var.a(), "Listener has already been released.");
        zy81 zy81Var = (zy81) o8g0Var.b;
        cvw.m(zy81Var.a(), "Listener has already been released.");
        return this.j.zao(this, yy81Var, zy81Var, uj.L);
    }

    public final Task c(luy luyVar, int i) {
        cvw.m(luyVar, "Listener key cannot be null.");
        return this.j.zap(this, luyVar, i);
    }

    public final zzw d(int i, bz81 bz81Var) {
        atx0 atx0Var = new atx0();
        this.j.zav(this, i, bz81Var, atx0Var, this.i);
        return atx0Var.a;
    }
}
