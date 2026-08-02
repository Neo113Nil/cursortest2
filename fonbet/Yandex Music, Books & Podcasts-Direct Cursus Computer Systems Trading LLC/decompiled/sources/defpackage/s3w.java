package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class s3w {
    public static final String i = jsg.n("WorkContinuationImpl");
    public final g4w a;
    public final String b;
    public final opb c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f = new ArrayList();
    public boolean g;
    public xzi h;

    public s3w(g4w g4wVar, String str, opb opbVar, List list, int i2) {
        this.a = g4wVar;
        this.b = str;
        this.c = opbVar;
        this.d = list;
        this.e = new ArrayList(list.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (opbVar == opb.a && ((p4w) list.get(i3)).b.u != Long.MAX_VALUE) {
                xq0.x("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String uuid = ((p4w) list.get(i3)).a.toString();
            uuid.getClass();
            this.e.add(uuid);
            this.f.add(uuid);
        }
    }

    public static HashSet b(s3w s3wVar) {
        HashSet hashSet = new HashSet();
        s3wVar.getClass();
        return hashSet;
    }

    public final xzi a() {
        if (this.g) {
            jsg.j().o(i, "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        } else {
            g4w g4wVar = this.a;
            this.h = a4g.K(g4wVar.b.m, "EnqueueRunnable_" + this.c.name(), g4wVar.d.a, new dxv(9, this));
        }
        return this.h;
    }
}
