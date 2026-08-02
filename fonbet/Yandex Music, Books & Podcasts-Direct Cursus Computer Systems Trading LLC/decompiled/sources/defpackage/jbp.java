package defpackage;

import android.net.Uri;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class jbp implements ika {
    public final nb7 a;
    public final c8k b;
    public final ArrayList c;
    public final ip3 d;
    public final so3 e;
    public final vp3 f;
    public final ssm g;
    public final Executor h;
    public final long i;
    public final ArrayList j;
    public volatile boolean k;

    public jbp(onh onhVar, c8k c8kVar, ip3 ip3Var, Executor executor) {
        onhVar.b.getClass();
        gnh gnhVar = onhVar.b;
        this.a = c(gnhVar.a);
        this.b = c8kVar;
        this.c = new ArrayList(gnhVar.e);
        this.d = ip3Var;
        this.h = executor;
        so3 so3Var = ip3Var.a;
        so3Var.getClass();
        this.e = so3Var;
        this.f = ip3Var.d;
        this.g = ip3Var.g;
        this.j = new ArrayList();
        this.i = dvt.Y(20000L);
    }

    public static nb7 c(Uri uri) {
        Map map = Collections.EMPTY_MAP;
        vq1.C(uri, "The uri must be set.");
        return new nb7(uri, 0L, 1, null, map, 0L, -1L, null, 1);
    }

    public static void e(List list, vp3 vp3Var, long j) {
        HashMap hashMap = new HashMap();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            hbp hbpVar = (hbp) list.get(i2);
            nb7 nb7Var = hbpVar.b;
            String f = vp3Var.f(nb7Var);
            Integer num = (Integer) hashMap.get(f);
            hbp hbpVar2 = num == null ? null : (hbp) list.get(num.intValue());
            if (hbpVar2 != null) {
                long j2 = hbpVar2.a;
                nb7 nb7Var2 = hbpVar2.b;
                if (hbpVar.a <= j2 + j) {
                    Uri uri = nb7Var2.a;
                    long j3 = nb7Var2.g;
                    if (uri.equals(nb7Var.a)) {
                        if (j3 != -1 && nb7Var2.f + j3 == nb7Var.f && Objects.equals(nb7Var2.h, nb7Var.h) && nb7Var2.i == nb7Var.i && nb7Var2.c == nb7Var.c && nb7Var2.e.equals(nb7Var.e)) {
                            long j4 = nb7Var.g;
                            nb7 e = nb7Var2.e(0L, j4 != -1 ? j3 + j4 : -1L);
                            num.getClass();
                            list.set(num.intValue(), new hbp(j2, e));
                        }
                    }
                }
            }
            hashMap.put(f, Integer.valueOf(i));
            list.set(i, hbpVar);
            i++;
        }
        dvt.d0(i, list.size(), list);
    }

    public final void a(ljo ljoVar) {
        synchronized (this.j) {
            try {
                if (this.k) {
                    throw new InterruptedException();
                }
                this.j.add(ljoVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object b(ljo ljoVar, boolean z) {
        if (z) {
            ljoVar.run();
            try {
                return ljoVar.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                int i = dvt.a;
                throw e;
            }
        }
        while (!this.k) {
            ssm ssmVar = this.g;
            if (ssmVar != null) {
                ssmVar.b();
            }
            a(ljoVar);
            this.h.execute(ljoVar);
            try {
                return ljoVar.get();
            } catch (ExecutionException e2) {
                Throwable cause2 = e2.getCause();
                cause2.getClass();
                if (!(cause2 instanceof rsm)) {
                    if (cause2 instanceof IOException) {
                        throw ((IOException) cause2);
                    }
                    int i2 = dvt.a;
                    throw e2;
                }
            } finally {
                ljoVar.c();
                g(ljoVar);
            }
        }
        b6e.h();
        return null;
    }

    @Override // defpackage.ika
    public final void cancel() {
        synchronized (this.j) {
            try {
                this.k = true;
                for (int i = 0; i < this.j.size(); i++) {
                    ((ljo) this.j.get(i)).cancel(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract ArrayList d(jp3 jp3Var, icc iccVar, boolean z);

    public final void f(int i) {
        synchronized (this.j) {
            this.j.remove(i);
        }
    }

    public final void g(ljo ljoVar) {
        synchronized (this.j) {
            this.j.remove(ljoVar);
        }
    }

    @Override // defpackage.ika
    public final void remove() {
        so3 so3Var = this.e;
        vp3 vp3Var = this.f;
        nb7 nb7Var = this.a;
        ip3 ip3Var = this.d;
        jp3 d = ip3Var.d(null, ip3Var.i | 1, -4000);
        try {
            try {
                ArrayList d2 = d(d, (icc) b(new fbp(this, d, nb7Var), true), true);
                for (int i = 0; i < d2.size(); i++) {
                    so3Var.k(vp3Var.f(((hbp) d2.get(i)).b));
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception unused2) {
            }
        } finally {
            so3Var.k(vp3Var.f(nb7Var));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:45|(3:47|118|(2:53|54))|60|61|63|54) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012d, code lost:
    
        r0 = r0.getCause();
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0136, code lost:
    
        if ((r0 instanceof defpackage.rsm) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0138, code lost:
    
        r2.addFirst(r7.h);
        f(r5);
        r3.addLast(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0148, code lost:
    
        if ((r0 instanceof java.io.IOException) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014c, code lost:
    
        throw ((java.io.IOException) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014d, code lost:
    
        throw r0;
     */
    @Override // defpackage.ika
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(hka hkaVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        jp3 c;
        byte[] bArr;
        boolean z;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        ssm ssmVar = this.g;
        if (ssmVar != null) {
            ssmVar.a(-4000);
        }
        try {
            jp3 c2 = this.d.c();
            icc iccVar = (icc) b(new fbp(this, c2, this.a), false);
            if (!this.c.isEmpty()) {
                iccVar = (icc) iccVar.a(this.c);
            }
            ArrayList d = d(c2, iccVar, false);
            Collections.sort(d);
            e(d, this.f, this.i);
            int size = d.size();
            int i = 0;
            long j = 0;
            long j2 = 0;
            for (int size2 = d.size() - 1; size2 >= 0; size2--) {
                nb7 nb7Var = ((hbp) d.get(size2)).b;
                String f = this.f.f(nb7Var);
                long j3 = nb7Var.g;
                if (j3 == -1) {
                    long a = qc6.a(this.e.a(f));
                    if (a != -1) {
                        j3 = a - nb7Var.f;
                    }
                }
                long j4 = j3;
                long h = this.e.h(nb7Var.f, j4, f);
                j2 += h;
                if (j4 != -1) {
                    if (j4 == h) {
                        i++;
                        d.remove(size2);
                    }
                    if (j != -1) {
                        j += j4;
                    }
                } else {
                    j = -1;
                }
            }
            gbp gbpVar = hkaVar != null ? new gbp(hkaVar, j, size, j2, i) : null;
            arrayDeque.addAll(d);
            while (!this.k && !arrayDeque.isEmpty()) {
                ssm ssmVar2 = this.g;
                if (ssmVar2 != null) {
                    ssmVar2.b();
                }
                if (arrayDeque2.isEmpty()) {
                    c = this.d.c();
                    bArr = new byte[SQLiteDatabase.OPEN_SHAREDCACHE];
                } else {
                    ibp ibpVar = (ibp) arrayDeque2.removeFirst();
                    c = ibpVar.i;
                    bArr = ibpVar.k;
                }
                ibp ibpVar2 = new ibp((hbp) arrayDeque.removeFirst(), c, gbpVar, bArr);
                a(ibpVar2);
                this.h.execute(ibpVar2);
                int size3 = this.j.size() - 1;
                while (size3 >= 0) {
                    ibp ibpVar3 = (ibp) this.j.get(size3);
                    if (!arrayDeque.isEmpty()) {
                        n20 n20Var = ibpVar3.b;
                        synchronized (n20Var) {
                            z = n20Var.a;
                        }
                        if (!z) {
                            continue;
                            size3--;
                        }
                    }
                    ibpVar3.get();
                    f(size3);
                    arrayDeque2.addLast(ibpVar3);
                    size3--;
                }
                ibpVar2.a.c();
            }
            int i2 = 0;
            while (true) {
                int size4 = this.j.size();
                arrayList2 = this.j;
                if (i2 >= size4) {
                    break;
                }
                ((ljo) arrayList2.get(i2)).cancel(true);
                i2++;
            }
            for (int size5 = arrayList2.size() - 1; size5 >= 0; size5--) {
                ((ljo) this.j.get(size5)).c();
                f(size5);
            }
            ssm ssmVar3 = this.g;
            if (ssmVar3 != null) {
                ssmVar3.d(-4000);
            }
        } catch (Throwable th) {
            int i3 = 0;
            while (true) {
                int size6 = this.j.size();
                arrayList = this.j;
                if (i3 >= size6) {
                    break;
                }
                ((ljo) arrayList.get(i3)).cancel(true);
                i3++;
            }
            for (int size7 = arrayList.size() - 1; size7 >= 0; size7--) {
                ((ljo) this.j.get(size7)).c();
                f(size7);
            }
            ssm ssmVar4 = this.g;
            if (ssmVar4 != null) {
                ssmVar4.d(-4000);
            }
            throw th;
        }
    }
}
