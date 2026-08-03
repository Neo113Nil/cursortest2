package x4;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.View;
import android.view.autofill.AutofillId;
import androidx.lifecycle.b0;
import androidx.lifecycle.z;
import androidx.work.impl.WorkDatabase;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import m0.c1;
import o4.t;
import p6.u;
import s.a0;
import x1.c0;
import x1.g0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements bd.e, g7.a, t {

    /* renamed from: g, reason: collision with root package name */
    public final Object f8294g;

    /* renamed from: h, reason: collision with root package name */
    public Object f8295h;

    public /* synthetic */ e(Object obj, Object obj2) {
        this.f8294g = obj;
        this.f8295h = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [y0.m] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void a(g0 g0Var) {
        if (g0Var.Q > 0) {
            if (g0Var.J.f8091d == c0.f7984k && !g0Var.o() && !g0Var.p() && !g0Var.R && g0Var.H()) {
                y0.m mVar = g0Var.I.f7991f;
                if ((mVar.f8446j & 256) != 0) {
                    while (mVar != null) {
                        if ((mVar.f8445i & 256) != 0) {
                            x1.m mVar2 = mVar;
                            ?? r5 = 0;
                            while (mVar2 != 0) {
                                if (mVar2 instanceof x1.o) {
                                    x1.o oVar = (x1.o) mVar2;
                                    oVar.g(x1.f.t(oVar, 256));
                                } else if ((mVar2.f8445i & 256) != 0 && (mVar2 instanceof x1.m)) {
                                    y0.m mVar3 = mVar2.f8110v;
                                    int i10 = 0;
                                    mVar2 = mVar2;
                                    r5 = r5;
                                    while (mVar3 != null) {
                                        if ((mVar3.f8445i & 256) != 0) {
                                            i10++;
                                            r5 = r5;
                                            if (i10 == 1) {
                                                mVar2 = mVar3;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new o0.e(new y0.m[16]);
                                                }
                                                if (mVar2 != 0) {
                                                    r5.b(mVar2);
                                                    mVar2 = 0;
                                                }
                                                r5.b(mVar3);
                                            }
                                        }
                                        mVar3 = mVar3.f8448l;
                                        mVar2 = mVar2;
                                        r5 = r5;
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                mVar2 = x1.f.f(r5);
                            }
                        }
                        if ((mVar.f8446j & 256) == 0) {
                            break;
                        } else {
                            mVar = mVar.f8448l;
                        }
                    }
                }
            }
            g0Var.P = false;
            o0.e w3 = g0Var.w();
            Object[] objArr = w3.f5134g;
            int i11 = w3.f5136i;
            for (int i12 = 0; i12 < i11; i12++) {
                a((g0) objArr[i12]);
            }
        }
    }

    @Override // g7.a
    public Object b(g7.o oVar) {
        l6.a aVar = (l6.a) this.f8294g;
        Bundle bundle = (Bundle) this.f8295h;
        aVar.getClass();
        if (!oVar.i()) {
            return oVar;
        }
        Bundle bundle2 = (Bundle) oVar.g();
        return (bundle2 == null || !bundle2.containsKey("google.messenger")) ? oVar : aVar.a(bundle).j(l6.n.f4205g, l6.b.f4175h);
    }

    @Override // bd.e
    public Object c(bd.f fVar, fc.d dVar) {
        Object c3 = ((f8.c) this.f8294g).c(new e5.c(fVar, (fc.i) this.f8295h, 1), dVar);
        return c3 == gc.a.f2559g ? c3 : ac.o.f277a;
    }

    public Long d(String str) {
        WorkDatabase workDatabase = (WorkDatabase) this.f8294g;
        b4.o a6 = b4.o.a("SELECT long_value FROM Preference where `key`=?", 1);
        a6.c(str, 1);
        workDatabase.b();
        Cursor m10 = workDatabase.m(a6);
        try {
            Long l10 = null;
            if (m10.moveToFirst() && !m10.isNull(0)) {
                l10 = Long.valueOf(m10.getLong(0));
            }
            return l10;
        } finally {
            m10.close();
            a6.f();
        }
    }

    public void e(d dVar) {
        WorkDatabase workDatabase = (WorkDatabase) this.f8294g;
        workDatabase.b();
        workDatabase.c();
        try {
            ((b) this.f8295h).f(dVar);
            workDatabase.o();
        } finally {
            workDatabase.k();
        }
    }

    public void f(f fVar) {
        boolean z10;
        b0 b0Var = (b0) this.f8294g;
        synchronized (b0Var.f652a) {
            z10 = b0Var.f655d == b0.f651i;
            b0Var.f655d = fVar;
        }
        if (z10) {
            n.a a02 = n.a.a0();
            z zVar = b0Var.f659h;
            n.c cVar = a02.f4973d;
            if (cVar.f4977f == null) {
                synchronized (cVar.f4975d) {
                    try {
                        if (cVar.f4977f == null) {
                            cVar.f4977f = n.c.q(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            cVar.f4977f.post(zVar);
        }
        if (fVar instanceof o4.s) {
            ((z4.j) this.f8295h).i((o4.s) fVar);
        } else if (fVar instanceof o4.q) {
            ((z4.j) this.f8295h).j(((o4.q) fVar).f5222d);
        }
    }

    public AutofillId g(long j3) {
        if (Build.VERSION.SDK_INT >= 29) {
            return a2.b.b(a2.a.j(this.f8294g), ((View) this.f8295h).getAutofillId(), j3);
        }
        return null;
    }

    public void h(e3.h hVar) {
        a5.b bVar = (a5.b) this.f8295h;
        f8.c cVar = (f8.c) this.f8294g;
        int i10 = hVar.f2085b;
        if (i10 != 0) {
            bVar.execute(new e3.a(i10, 0, cVar));
        } else {
            bVar.execute(new dd.i(1, cVar, hVar.f2084a, false));
        }
    }

    public void i(c1 c1Var) {
        Object g8 = ((s.g0) this.f8295h).g(c1Var);
        if (g8 != null) {
            if (!(g8 instanceof a0)) {
                throw new ClassCastException();
            }
            a0 a0Var = (a0) g8;
            Object[] objArr = a0Var.f6219a;
            if (a0Var.f6220b <= 0) {
                return;
            }
            pc.j.c(objArr[0], "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
            throw new ClassCastException();
        }
    }

    public int j(Context context, n6.a aVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f8294g;
        u.g(context);
        u.g(aVar);
        int e10 = aVar.e();
        int i10 = sparseIntArray.get(e10, -1);
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= sparseIntArray.size()) {
                i11 = -1;
                break;
            }
            int keyAt = sparseIntArray.keyAt(i12);
            if (keyAt > e10 && sparseIntArray.get(keyAt) == 0) {
                break;
            }
            i12++;
        }
        if (i11 == -1) {
            i11 = ((m6.f) this.f8295h).b(context, e10);
        }
        sparseIntArray.put(e10, i11);
        return i11;
    }

    public e(m6.f fVar) {
        this.f8294g = new SparseIntArray();
        u.g(fVar);
        this.f8295h = fVar;
    }

    public e(WorkDatabase workDatabase) {
        this.f8294g = workDatabase;
        this.f8295h = new b(workDatabase);
    }

    public e(int i10) {
        switch (i10) {
            case 6:
                this.f8294g = new s.g0();
                this.f8295h = new s.g0();
                break;
            case 7:
                this.f8294g = new b0();
                this.f8295h = new z4.j();
                f(t.f5224e);
                break;
            case 8:
            case 9:
            default:
                this.f8294g = new m6.i(11);
                this.f8295h = new s.q(16);
                break;
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                this.f8294g = new o0.e(new g0[16]);
                break;
            case 11:
                this.f8294g = new o0.e(new Reference[16]);
                this.f8295h = new ReferenceQueue();
                break;
        }
    }
}
