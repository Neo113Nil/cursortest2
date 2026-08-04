package com.gamericefishpro.space.n9;

import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {
    public long a;
    public Object b;
    public Serializable c;
    public Serializable d;
    public final /* synthetic */ a2 e;

    public /* synthetic */ e1(f1 f1Var, long j) {
        this.e = f1Var;
        com.gamericefishpro.space.v8.c0.d("health_monitor");
        com.gamericefishpro.space.v8.c0.b(j > 0);
        this.b = "health_monitor:start";
        this.c = "health_monitor:count";
        this.d = "health_monitor:value";
        this.a = j;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009a  */
    /* JADX WARN: Code duplicated, block: B:25:0x00cd A[RETURN] */
    public boolean a(long j, com.gamericefishpro.space.i9.a3 a3Var) {
        int size;
        if (((ArrayList) this.d) == null) {
            this.d = new ArrayList();
        }
        if (((ArrayList) this.c) == null) {
            this.c = new ArrayList();
        }
        if (((ArrayList) this.d).isEmpty() || ((((com.gamericefishpro.space.i9.a3) ((ArrayList) this.d).get(0)).u() / 1000) / 60) / 60 == ((a3Var.u() / 1000) / 60) / 60) {
            long jK = this.a + ((long) a3Var.k());
            m4 m4Var = (m4) this.e;
            if (!m4Var.d0().B(null, e0.d1)) {
                m4Var.d0();
                if (jK < Math.max(0, ((Integer) e0.j.a(null)).intValue())) {
                    this.a = jK;
                    ((ArrayList) this.d).add(a3Var);
                    ((ArrayList) this.c).add(Long.valueOf(j));
                    size = ((ArrayList) this.d).size();
                    m4Var.d0();
                    if (size < Math.max(1, ((Integer) e0.k.a(null)).intValue())) {
                        return true;
                    }
                }
            } else if (((ArrayList) this.d).isEmpty()) {
                this.a = jK;
                ((ArrayList) this.d).add(a3Var);
                ((ArrayList) this.c).add(Long.valueOf(j));
                size = ((ArrayList) this.d).size();
                m4Var.d0();
                if (size < Math.max(1, ((Integer) e0.k.a(null)).intValue())) {
                    return true;
                }
            } else {
                m4Var.d0();
                if (jK < Math.max(0, ((Integer) e0.j.a(null)).intValue())) {
                    this.a = jK;
                    ((ArrayList) this.d).add(a3Var);
                    ((ArrayList) this.c).add(Long.valueOf(j));
                    size = ((ArrayList) this.d).size();
                    m4Var.d0();
                    if (size < Math.max(1, ((Integer) e0.k.a(null)).intValue())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void b() {
        f1 f1Var = (f1) this.e;
        f1Var.r();
        ((r1) f1Var.d).D.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = f1Var.v().edit();
        editorEdit.remove((String) this.c);
        editorEdit.remove((String) this.d);
        editorEdit.putLong((String) this.b, jCurrentTimeMillis);
        editorEdit.apply();
    }

    public /* synthetic */ e1(m4 m4Var) {
        this.e = m4Var;
    }
}
