package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.mlkit_vision_barcode.k;
import com.google.android.gms.internal.mlkit_vision_barcode.n;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzro;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.a;
import defpackage.aa91;
import defpackage.eg91;
import defpackage.ekb1;
import defpackage.gv91;
import defpackage.i971;
import defpackage.igb1;
import defpackage.ii91;
import defpackage.kz;
import defpackage.mgb1;
import defpackage.ny61;
import defpackage.o3;
import defpackage.qv91;
import defpackage.ru91;
import defpackage.yra1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes11.dex */
public final class yra1 extends c000 {
    public static boolean j = true;
    public final uv4 d;
    public final txa1 e;
    public final n f;
    public final btb1 g;
    public final z06 h = new z06();
    public boolean i;

    public yra1(qk20 qk20Var, uv4 uv4Var, txa1 txa1Var, n nVar) {
        cvw.m(qk20Var, "MlKitContext can not be null");
        cvw.m(uv4Var, "BarcodeScannerOptions can not be null");
        this.d = uv4Var;
        this.e = txa1Var;
        this.f = nVar;
        this.g = new btb1(qk20Var.b(), 1);
    }

    @Override // defpackage.u430
    public final synchronized void b() {
        this.i = this.e.zzc();
    }

    @Override // defpackage.u430
    public final synchronized void c() {
        try {
            this.e.zzb();
            j = true;
            ekb1 ekb1Var = new ekb1();
            zzra zzraVar = this.i ? zzra.TYPE_THICK : zzra.TYPE_THIN;
            n nVar = this.f;
            ekb1Var.c = zzraVar;
            slb1 slb1Var = new slb1();
            slb1Var.b = e891.a(this.d);
            ekb1Var.d = new cmb1(slb1Var);
            a.c().execute(new kz(nVar, new o3(ekb1Var, 0), zzrc.ON_DEVICE_BARCODE_CLOSE, nVar.c(), 18));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.c000
    public final Object d(xzv xzvVar) {
        yra1 yra1Var;
        xzv xzvVar2;
        synchronized (this) {
            try {
                try {
                    z06 z06Var = this.h;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    z06Var.a(xzvVar);
                    try {
                        ArrayList a = this.e.a(xzvVar);
                        yra1Var = this;
                        xzvVar2 = xzvVar;
                        try {
                            yra1Var.e(zzrb.NO_ERROR, elapsedRealtime, xzvVar2, a);
                            j = false;
                            return a;
                        } catch (MlKitException e) {
                            e = e;
                            MlKitException mlKitException = e;
                            yra1Var.e(mlKitException.a() == 14 ? zzrb.MODEL_NOT_DOWNLOADED : zzrb.UNKNOWN_ERROR, elapsedRealtime, xzvVar2, null);
                            throw mlKitException;
                        }
                    } catch (MlKitException e2) {
                        e = e2;
                        yra1Var = this;
                        xzvVar2 = xzvVar;
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        throw th;
    }

    public final void e(zzrb zzrbVar, long j2, xzv xzvVar, List list) {
        k kVar = new k();
        k kVar2 = new k();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                fv4 fv4Var = (fv4) it.next();
                int format = fv4Var.a.getFormat();
                if (format > 4096 || format == 0) {
                    format = -1;
                }
                zzrn zzrnVar = (zzrn) e891.a.get(format);
                if (zzrnVar == null) {
                    zzrnVar = zzrn.FORMAT_UNKNOWN;
                }
                kVar.a(zzrnVar);
                zzro zzroVar = (zzro) e891.b.get(fv4Var.a.f());
                if (zzroVar == null) {
                    zzroVar = zzro.TYPE_UNKNOWN;
                }
                kVar2.a(zzroVar);
            }
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j2;
        this.f.b(new f381(this, elapsedRealtime, zzrbVar, kVar, kVar2, xzvVar), zzrc.ON_DEVICE_BARCODE_DETECT);
        wu91 wu91Var = new wu91();
        wu91Var.a = zzrbVar;
        wu91Var.b = Boolean.valueOf(j);
        wu91Var.c = e891.a(this.d);
        wu91Var.d = kVar.c();
        wu91Var.e = kVar2.c();
        final gv91 gv91Var = new gv91(wu91Var);
        final i971 i971Var = new i971(28, this);
        final n nVar = this.f;
        final zzrc zzrcVar = zzrc.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
        a.c().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.m
            @Override // java.lang.Runnable
            public final void run() {
                final n nVar2 = n.this;
                HashMap hashMap = nVar2.j;
                final zzrc zzrcVar2 = zzrcVar;
                if (!hashMap.containsKey(zzrcVar2)) {
                    hashMap.put(zzrcVar2, new zzbw(new zzci()));
                }
                ii91 ii91Var = (eg91) hashMap.get(zzrcVar2);
                Long valueOf = Long.valueOf(elapsedRealtime);
                zzci zzciVar = (zzci) ((zzbr) ii91Var).c;
                gv91 gv91Var2 = gv91Var;
                Collection collection = (Collection) zzciVar.get(gv91Var2);
                if (collection == null) {
                    ArrayList arrayList = new ArrayList(3);
                    if (!arrayList.add(valueOf)) {
                        ny61.f("New Collection violated the Collection spec");
                        return;
                    }
                    zzciVar.put(gv91Var2, arrayList);
                } else {
                    collection.add(valueOf);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (nVar2.d(zzrcVar2, elapsedRealtime2)) {
                    nVar2.i.put(zzrcVar2, Long.valueOf(elapsedRealtime2));
                    Executor c = com.google.mlkit.common.sdkinternal.a.c();
                    final i971 i971Var2 = i971Var;
                    c.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            n nVar3 = n.this;
                            HashMap hashMap2 = nVar3.j;
                            zzrc zzrcVar3 = zzrcVar2;
                            ii91 ii91Var2 = (eg91) hashMap2.get(zzrcVar3);
                            if (ii91Var2 != null) {
                                Iterator it2 = ((d) ((f) ii91Var2).b()).iterator();
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    zzbe zzbeVar = (zzbe) ii91Var2;
                                    Object obj = (Collection) ((zzci) zzbeVar.c).get(next);
                                    if (obj == null) {
                                        obj = new ArrayList(3);
                                    }
                                    List list2 = (List) obj;
                                    ArrayList arrayList2 = new ArrayList(list2 instanceof RandomAccess ? new aa91(zzbeVar, next, list2, null) : new e(zzbeVar, next, list2, null));
                                    Collections.sort(arrayList2);
                                    igb1 igb1Var = new igb1();
                                    Iterator it3 = arrayList2.iterator();
                                    long j3 = 0;
                                    while (it3.hasNext()) {
                                        j3 += ((Long) it3.next()).longValue();
                                    }
                                    igb1Var.c = Long.valueOf((j3 / arrayList2.size()) & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                                    igb1Var.a = Long.valueOf(n.a(100.0d, arrayList2) & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                                    igb1Var.f = Long.valueOf(n.a(75.0d, arrayList2) & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                                    igb1Var.e = Long.valueOf(n.a(50.0d, arrayList2) & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                                    igb1Var.d = Long.valueOf(n.a(25.0d, arrayList2) & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                                    igb1Var.b = Long.valueOf(n.a(0.0d, arrayList2) & ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                                    mgb1 mgb1Var = new mgb1(igb1Var);
                                    int size = arrayList2.size();
                                    yra1 yra1Var = (yra1) i971Var2.b;
                                    gv91 gv91Var3 = (gv91) next;
                                    ekb1 ekb1Var = new ekb1();
                                    ekb1Var.c = yra1Var.i ? zzra.TYPE_THICK : zzra.TYPE_THIN;
                                    ru91 ru91Var = new ru91();
                                    ru91Var.b = Integer.valueOf(size & Integer.MAX_VALUE);
                                    ru91Var.a = gv91Var3;
                                    ru91Var.c = mgb1Var;
                                    ekb1Var.f = new qv91(ru91Var);
                                    com.google.mlkit.common.sdkinternal.a.c().execute(new kz(nVar3, new o3(ekb1Var, 0), zzrcVar3, nVar3.c(), 18));
                                }
                                hashMap2.remove(zzrcVar3);
                            }
                        }
                    });
                }
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = this.i;
        long j3 = currentTimeMillis - elapsedRealtime;
        btb1 btb1Var = this.g;
        int i = true != z ? 24301 : 24302;
        int zza = zzrbVar.zza();
        synchronized (btb1Var) {
            AtomicLong atomicLong = btb1Var.b;
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1 && elapsedRealtime2 - btb1Var.b.get() <= 1800000) {
                return;
            }
            btb1Var.a.e(new TelemetryData(0, Arrays.asList(new MethodInvocation(i, zza, 0, j3, currentTimeMillis, null, null, 0, -1)))).d(new qgg(btb1Var, elapsedRealtime2, 14));
        }
    }
}
