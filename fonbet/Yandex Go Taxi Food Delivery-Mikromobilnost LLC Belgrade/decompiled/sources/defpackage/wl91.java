package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.j;
import com.google.android.gms.measurement.internal.zzoh;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public final class wl91 implements hqs {
    public final Object a;
    public Object b;

    public wl91(yvi0 yvi0Var, lb7 lb7Var) {
        this.b = lb7Var;
        ((e) yvi0Var.a).d(new rg91(this));
        this.a = new HashSet();
    }

    public void a() {
        g gVar = (g) ((j) this.b).b;
        o5a1 o5a1Var = gVar.x;
        g.e(o5a1Var);
        SparseArray Mg = o5a1Var.Mg();
        zzoh zzohVar = (zzoh) this.a;
        Mg.put(zzohVar.zzc, Long.valueOf(zzohVar.zzb));
        o5a1 o5a1Var2 = gVar.x;
        g.e(o5a1Var2);
        int[] iArr = new int[Mg.size()];
        long[] jArr = new long[Mg.size()];
        for (int i = 0; i < Mg.size(); i++) {
            iArr[i] = Mg.keyAt(i);
            jArr[i] = ((Long) Mg.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        o5a1Var2.H.F(bundle);
    }

    @Override // defpackage.hqs
    public void onFailure(Throwable th) {
        zzoh zzohVar = (zzoh) this.a;
        j jVar = (j) this.b;
        jVar.Gg();
        jVar.C = false;
        g gVar = (g) jVar.b;
        j691 j691Var = gVar.w;
        y1a1 y1a1Var = gVar.y;
        int i = 2;
        if (j691Var.Qg(null, nw91.T0)) {
            String message = th.getMessage();
            jVar.H = false;
            if (message != null) {
                if ((th instanceof IllegalStateException) || message.contains("garbage collected") || th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                    if (message.contains("Background")) {
                        jVar.H = true;
                    }
                    i = 1;
                } else if ((th instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                    i = 3;
                }
            }
        }
        int i2 = i - 1;
        if (i2 == 0) {
            g.g(y1a1Var);
            y1a1Var.C.c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", y1a1.Og(gVar.l().Mg()), y1a1.Og(th.toString()));
            jVar.D = 1;
            jVar.eh().add(zzohVar);
            return;
        }
        if (i2 != 1) {
            g.g(y1a1Var);
            y1a1Var.z.c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", y1a1.Og(gVar.l().Mg()), th);
            a();
            jVar.D = 1;
            jVar.fh();
            return;
        }
        jVar.eh().add(zzohVar);
        if (jVar.D > ((Integer) nw91.w0.a(null)).intValue()) {
            jVar.D = 1;
            g.g(y1a1Var);
            y1a1Var.C.c("registerTriggerAsync failed. May try later. App ID, throwable", y1a1.Og(gVar.l().Mg()), y1a1.Og(th.toString()));
            return;
        }
        g.g(y1a1Var);
        y1a1Var.C.d("registerTriggerAsync failed. App ID, delay in seconds, throwable", y1a1.Og(gVar.l().Mg()), y1a1.Og(String.valueOf(jVar.D)), y1a1.Og(th.toString()));
        int i3 = jVar.D;
        if (jVar.E == null) {
            jVar.E = new cla1(jVar, gVar, 1);
        }
        jVar.E.b(i3 * 1000);
        int i4 = jVar.D;
        jVar.D = i4 + i4;
    }

    @Override // defpackage.hqs
    public void onSuccess(Object obj) {
        j jVar = (j) this.b;
        jVar.Gg();
        a();
        jVar.C = false;
        jVar.D = 1;
        y1a1 y1a1Var = ((g) jVar.b).y;
        g.g(y1a1Var);
        y1a1Var.G.b(((zzoh) this.a).zza, "Successfully registered trigger URI");
        jVar.fh();
    }

    public wl91() {
        this.a = new ConcurrentHashMap(16, 0.75f, 10);
        this.b = new ReferenceQueue();
    }

    public /* synthetic */ wl91(r8 r8Var, Object obj) {
        this.a = obj;
        this.b = r8Var;
    }

    public wl91(ffa1 ffa1Var) {
        this.b = new nra1();
        this.a = ffa1Var;
        h2b1.k();
    }
}
