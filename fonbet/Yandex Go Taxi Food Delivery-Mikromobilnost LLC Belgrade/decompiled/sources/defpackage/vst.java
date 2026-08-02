package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.zak;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes11.dex */
public final class vst {
    public final String c;
    public final String d;
    public final Context f;
    public hdy h;
    public xst j;
    public Looper k;
    public final HashSet a = new HashSet();
    public final HashSet b = new HashSet();
    public final w53 e = new w53();
    public final w53 g = new w53();
    public int i = -1;
    public final a l = a.d;
    public final esw m = dz81.a;
    public final ArrayList n = new ArrayList();
    public final ArrayList o = new ArrayList();

    public vst(Context context) {
        this.f = context;
        this.k = context.getMainLooper();
        this.c = context.getPackageName();
        this.d = context.getClass().getName();
    }

    public final void a(zm2 zm2Var) {
        cvw.m(zm2Var, "Api must not be null");
        this.g.put(zm2Var, null);
        jm2 jm2Var = zm2Var.a;
        cvw.m(jm2Var, "Base client builder must not be null");
        List a = jm2Var.a(null);
        this.b.addAll(a);
        this.a.addAll(a);
    }

    public final d b() {
        cvw.d("must call addApi() to add at least one API", !this.g.isEmpty());
        hbs0 hbs0Var = hbs0.a;
        w53 w53Var = this.g;
        zm2 zm2Var = dz81.b;
        if (w53Var.containsKey(zm2Var)) {
            hbs0Var = (hbs0) w53Var.get(zm2Var);
        }
        y2c y2cVar = new y2c(this.a, this.e, this.c, this.d, hbs0Var);
        Map map = y2cVar.c;
        w53 w53Var2 = new w53();
        w53 w53Var3 = new w53();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((s53) this.g.keySet()).iterator();
        zm2 zm2Var2 = null;
        while (it.hasNext()) {
            zm2 zm2Var3 = (zm2) it.next();
            Object obj = this.g.get(zm2Var3);
            boolean z = map.get(zm2Var3) != null;
            w53Var2.put(zm2Var3, Boolean.valueOf(z));
            h091 h091Var = new h091(zm2Var3, z);
            arrayList.add(h091Var);
            zm2 zm2Var4 = zm2Var2;
            jm2 jm2Var = zm2Var3.a;
            cvw.l(jm2Var);
            y2c y2cVar2 = y2cVar;
            om2 c = jm2Var.c(this.f, this.k, y2cVar2, obj, h091Var, h091Var);
            w53Var3.put(zm2Var3.b, c);
            if (!c.providesSignIn()) {
                zm2Var2 = zm2Var4;
            } else {
                if (zm2Var4 != null) {
                    ny61.r(g8e.p(zm2Var3.c, " cannot be used with ", zm2Var4.c));
                    return null;
                }
                zm2Var2 = zm2Var3;
            }
            y2cVar = y2cVar2;
        }
        y2c y2cVar3 = y2cVar;
        zm2 zm2Var5 = zm2Var2;
        if (zm2Var5 != null) {
            boolean equals = this.a.equals(this.b);
            String str = zm2Var5.c;
            if (!equals) {
                ny61.r(oyr.p("Must not set scopes in GoogleApiClient.Builder when using ", str, ". Set account in GoogleSignInOptions.Builder instead."));
                return null;
            }
        }
        d dVar = new d(this.f, new ReentrantLock(), this.k, y2cVar3, this.l, this.m, w53Var2, this.n, this.o, w53Var3, this.i, d.q(w53Var3.values(), true), arrayList);
        Set set = yst.a;
        synchronized (set) {
            set.add(dVar);
        }
        if (this.i >= 0) {
            zak.zaa(this.h).zad(this.i, dVar, this.j);
        }
        return dVar;
    }
}
