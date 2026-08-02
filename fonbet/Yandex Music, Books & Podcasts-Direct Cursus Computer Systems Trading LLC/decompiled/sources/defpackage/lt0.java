package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class lt0 {
    public static ScheduledFuture c;
    public static volatile pa7 a = new pa7(1);
    public static final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    public static final q d = q.e;

    public static final pa7 a() {
        if (bp6.a.contains(lt0.class)) {
            return null;
        }
        try {
            return a;
        } catch (Throwable th) {
            bp6.a(lt0.class, th);
            return null;
        }
    }

    public static final ood b(la laVar, tlp tlpVar, boolean z, j4x j4xVar) {
        Set set = bp6.a;
        if (!set.contains(lt0.class)) {
            try {
                String str = laVar.b;
                n8c f = q8c.f(str, false);
                String str2 = ood.j;
                ood S = h1b.S(null, String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1)), null, null);
                S.i = true;
                Bundle bundle = S.d;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putString("access_token", laVar.a);
                synchronized (pt0.j()) {
                    set.contains(pt0.class);
                }
                String u = y9w.u();
                if (u != null) {
                    bundle.putString("install_referrer", u);
                }
                S.d = bundle;
                int d2 = tlpVar.d(S, j3c.b(), f != null ? f.a : false, z);
                if (d2 != 0) {
                    j4xVar.b += d2;
                    jt0 jt0Var = new jt0(laVar, S, tlpVar, j4xVar);
                    HashSet hashSet = j3c.a;
                    synchronized (hashSet) {
                    }
                    synchronized (hashSet) {
                    }
                    S.f = jt0Var;
                    return S;
                }
            } catch (Throwable th) {
                bp6.a(lt0.class, th);
                return null;
            }
        }
        return null;
    }

    public static final ArrayList c(pa7 pa7Var, j4x j4xVar) {
        tlp tlpVar;
        if (bp6.a.contains(lt0.class)) {
            return null;
        }
        try {
            pa7Var.getClass();
            boolean g = j3c.g(j3c.b());
            ArrayList arrayList = new ArrayList();
            for (la laVar : pa7Var.d()) {
                synchronized (pa7Var) {
                    laVar.getClass();
                    tlpVar = (tlp) pa7Var.a.get(laVar);
                }
                if (tlpVar == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ood b2 = b(laVar, tlpVar, g, j4xVar);
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            bp6.a(lt0.class, th);
            return null;
        }
    }

    public static final void d(int i) {
        if (bp6.a.contains(lt0.class)) {
            return;
        }
        try {
            if (i == 0) {
                throw null;
            }
            b.execute(new kt0(i));
        } catch (Throwable th) {
            bp6.a(lt0.class, th);
        }
    }

    public static final void e(int i) {
        if (bp6.a.contains(lt0.class)) {
            return;
        }
        try {
            if (i == 0) {
                throw null;
            }
            a.a(nt0.J());
            try {
                j4x f = f(i, a);
                if (f != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", f.b);
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", (xnc) f.c);
                    phg.a(j3c.b()).c(intent);
                }
            } catch (Exception e) {
                Log.w("lt0", "Caught unexpected exception while flushing app events: ", e);
            }
        } catch (Throwable th) {
            bp6.a(lt0.class, th);
        }
    }

    public static final j4x f(int i, pa7 pa7Var) {
        if (!bp6.a.contains(lt0.class)) {
            try {
                if (i == 0) {
                    throw null;
                }
                pa7Var.getClass();
                j4x j4xVar = new j4x(7, false);
                j4xVar.c = xnc.a;
                ArrayList c2 = c(pa7Var, j4xVar);
                if (!c2.isEmpty()) {
                    HashMap hashMap = lsg.d;
                    switch (i) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            synchronized (j3c.a) {
                            }
                            Iterator it = c2.iterator();
                            while (it.hasNext()) {
                                ((ood) it.next()).c();
                            }
                            return j4xVar;
                        default:
                            throw null;
                    }
                }
            } catch (Throwable th) {
                bp6.a(lt0.class, th);
                return null;
            }
        }
        return null;
    }
}
