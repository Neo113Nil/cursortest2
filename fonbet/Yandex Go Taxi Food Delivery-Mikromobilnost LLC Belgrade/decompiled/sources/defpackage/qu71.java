package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.a;
import yads.lj0;
import yads.m42;
import yads.rj0;
import yads.t31;
import yads.wk2;

/* loaded from: classes7.dex */
public final class qu71 {
    public final Context a;
    public final i3y b = a.a(new m42(this));
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public qu71(Context context) {
        this.a = context.getApplicationContext();
    }

    public final void a() {
        ConcurrentHashMap concurrentHashMap = this.c;
        Iterator it = concurrentHashMap.entrySet().iterator();
        while (it.hasNext()) {
            String str = (String) ((Map.Entry) it.next()).getKey();
            yy71 yy71Var = (yy71) this.b.getValue();
            if (yy71Var != null) {
                yy71Var.c++;
                yy71Var.a.obtainMessage(7, str).sendToTarget();
            }
        }
        concurrentHashMap.clear();
    }

    public final void b(String str, oy71 oy71Var, String str2) {
        yy71 yy71Var = (yy71) this.b.getValue();
        if (yy71Var == null) {
            oy71Var.b();
            a();
            return;
        }
        lj0 lj0Var = yy71Var.a;
        CopyOnWriteArraySet copyOnWriteArraySet = yy71Var.b;
        Uri parse = Uri.parse(str);
        p481 p481Var = t31.b;
        rj0 rj0Var = new rj0(str2, parse, null, wk2.x, null, null, null);
        this.c.put(str2, oy71Var);
        copyOnWriteArraySet.add(new yi81(str2, oy71Var));
        yy71Var.c++;
        lj0Var.obtainMessage(6, 0, 0, rj0Var).sendToTarget();
        if (yy71Var.d) {
            yy71Var.d = false;
            yy71Var.c++;
            lj0Var.obtainMessage(1, 0, 0).sendToTarget();
            boolean a = yy71Var.a();
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                ((yi81) it.next()).getClass();
            }
            if (a) {
                Iterator it2 = copyOnWriteArraySet.iterator();
                while (it2.hasNext()) {
                    ((yi81) it2.next()).getClass();
                }
            }
        }
    }
}
