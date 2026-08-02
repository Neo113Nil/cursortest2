package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.a;

/* loaded from: classes.dex */
public final class n5w {
    public final t4w a;
    public final Context b;
    public final String c;
    public final j4w d;
    public final r46 e;
    public final z7l f;
    public final htm g;
    public final WorkDatabase h;
    public final x4w i;
    public final rx7 j;
    public final ArrayList k;
    public final String l;
    public final w2f m;

    public n5w(rn5 rn5Var) {
        t4w t4wVar = (t4w) rn5Var.f;
        this.a = t4wVar;
        this.b = (Context) rn5Var.h;
        String str = t4wVar.a;
        this.c = str;
        this.d = (j4w) rn5Var.c;
        r46 r46Var = (r46) rn5Var.b;
        this.e = r46Var;
        this.f = r46Var.d;
        this.g = (htm) rn5Var.d;
        WorkDatabase workDatabase = (WorkDatabase) rn5Var.e;
        this.h = workDatabase;
        this.i = workDatabase.A();
        this.j = workDatabase.v();
        ArrayList arrayList = (ArrayList) rn5Var.g;
        this.k = arrayList;
        this.l = su4.o(ouj.u("Work [ id=", str, ", tags={ "), CollectionsKt.X(arrayList, StringUtils.COMMA, null, null, null, 62), " } ]");
        this.m = saf.p();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(final n5w n5wVar, cg6 cg6Var) {
        m5w m5wVar;
        int i;
        boolean z;
        nm6 nm6Var;
        String str;
        String str2;
        final int i2;
        int i3;
        OverwritingInputMerger overwritingInputMerger;
        q97 c;
        int i4;
        Throwable th;
        String str3;
        CancellationException e;
        jsg j;
        String str4 = n5wVar.l;
        String str5 = n5wVar.c;
        j4w j4wVar = n5wVar.d;
        WorkDatabase workDatabase = n5wVar.h;
        r46 r46Var = n5wVar.e;
        ogp ogpVar = r46Var.m;
        t4w t4wVar = n5wVar.a;
        if (cg6Var instanceof m5w) {
            m5wVar = (m5w) cg6Var;
            int i5 = m5wVar.l;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                m5wVar.l = i5 - Integer.MIN_VALUE;
                Object obj = m5wVar.j;
                nm6 nm6Var2 = nm6.a;
                i = m5wVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    a5w a5wVar = r46Var.e;
                    ogpVar.getClass();
                    boolean H = y7g.H();
                    String str6 = t4wVar.x;
                    String str7 = t4wVar.c;
                    String str8 = t4wVar.d;
                    if (!H || str6 == null) {
                        z = H;
                    } else {
                        int hashCode = t4wVar.hashCode();
                        z = H;
                        if (Build.VERSION.SDK_INT >= 29) {
                            aqs.a(y7g.X(str6), hashCode);
                        } else {
                            String X = y7g.X(str6);
                            try {
                                if (y7g.c == null) {
                                    i4 = hashCode;
                                    str2 = str6;
                                    try {
                                        str = str4;
                                        nm6Var = nm6Var2;
                                        try {
                                            y7g.c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                                        } catch (Exception e2) {
                                            e = e2;
                                            y7g.E("asyncTraceBegin", e);
                                            i2 = 0;
                                            i3 = 24;
                                            if (!((Boolean) workDatabase.s(new b6n(i3, new Callable(n5wVar) { // from class: g5w
                                                public final /* synthetic */ n5w b;

                                                {
                                                    this.b = n5wVar;
                                                }

                                                @Override // java.util.concurrent.Callable
                                                public final Object call() {
                                                    switch (i2) {
                                                        case 0:
                                                            n5w n5wVar2 = this.b;
                                                            t4w t4wVar2 = n5wVar2.a;
                                                            c4w c4wVar = t4wVar2.b;
                                                            String str9 = t4wVar2.c;
                                                            c4w c4wVar2 = c4w.a;
                                                            if (c4wVar != c4wVar2) {
                                                                String str10 = o5w.a;
                                                                jsg.j().e(str10, str9 + " is not in ENQUEUED state. Nothing more to do");
                                                                return Boolean.TRUE;
                                                            }
                                                            if (t4wVar2.c() || (t4wVar2.b == c4wVar2 && t4wVar2.k > 0)) {
                                                                n5wVar2.f.getClass();
                                                                if (System.currentTimeMillis() < t4wVar2.a()) {
                                                                    jsg.j().e(o5w.a, "Delaying execution for " + str9 + " because it is being executed before schedule.");
                                                                    return Boolean.TRUE;
                                                                }
                                                            }
                                                            return Boolean.FALSE;
                                                        default:
                                                            n5w n5wVar3 = this.b;
                                                            x4w x4wVar = n5wVar3.i;
                                                            String str11 = n5wVar3.c;
                                                            boolean z2 = false;
                                                            if (x4wVar.d(str11) == c4w.a) {
                                                                x4wVar.j(c4w.b, str11);
                                                                ((Number) up6.F(x4wVar.a, false, true, new v4w(str11, 5))).intValue();
                                                                x4wVar.k(-256, str11);
                                                                z2 = true;
                                                            }
                                                            return Boolean.valueOf(z2);
                                                    }
                                                }
                                            }))).booleanValue()) {
                                            }
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        str = str4;
                                        nm6Var = nm6Var2;
                                        y7g.E("asyncTraceBegin", e);
                                        i2 = 0;
                                        i3 = 24;
                                        if (!((Boolean) workDatabase.s(new b6n(i3, new Callable(n5wVar) { // from class: g5w
                                            public final /* synthetic */ n5w b;

                                            {
                                                this.b = n5wVar;
                                            }

                                            @Override // java.util.concurrent.Callable
                                            public final Object call() {
                                                switch (i2) {
                                                    case 0:
                                                        n5w n5wVar2 = this.b;
                                                        t4w t4wVar2 = n5wVar2.a;
                                                        c4w c4wVar = t4wVar2.b;
                                                        String str9 = t4wVar2.c;
                                                        c4w c4wVar2 = c4w.a;
                                                        if (c4wVar != c4wVar2) {
                                                            String str10 = o5w.a;
                                                            jsg.j().e(str10, str9 + " is not in ENQUEUED state. Nothing more to do");
                                                            return Boolean.TRUE;
                                                        }
                                                        if (t4wVar2.c() || (t4wVar2.b == c4wVar2 && t4wVar2.k > 0)) {
                                                            n5wVar2.f.getClass();
                                                            if (System.currentTimeMillis() < t4wVar2.a()) {
                                                                jsg.j().e(o5w.a, "Delaying execution for " + str9 + " because it is being executed before schedule.");
                                                                return Boolean.TRUE;
                                                            }
                                                        }
                                                        return Boolean.FALSE;
                                                    default:
                                                        n5w n5wVar3 = this.b;
                                                        x4w x4wVar = n5wVar3.i;
                                                        String str11 = n5wVar3.c;
                                                        boolean z2 = false;
                                                        if (x4wVar.d(str11) == c4w.a) {
                                                            x4wVar.j(c4w.b, str11);
                                                            ((Number) up6.F(x4wVar.a, false, true, new v4w(str11, 5))).intValue();
                                                            x4wVar.k(-256, str11);
                                                            z2 = true;
                                                        }
                                                        return Boolean.valueOf(z2);
                                                }
                                            }
                                        }))).booleanValue()) {
                                        }
                                    }
                                } else {
                                    i4 = hashCode;
                                    str = str4;
                                    nm6Var = nm6Var2;
                                    str2 = str6;
                                }
                                y7g.c.invoke(null, Long.valueOf(y7g.a), X, Integer.valueOf(i4));
                            } catch (Exception e4) {
                                e = e4;
                                str = str4;
                                nm6Var = nm6Var2;
                                str2 = str6;
                            }
                            i2 = 0;
                            i3 = 24;
                            if (!((Boolean) workDatabase.s(new b6n(i3, new Callable(n5wVar) { // from class: g5w
                                public final /* synthetic */ n5w b;

                                {
                                    this.b = n5wVar;
                                }

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    switch (i2) {
                                        case 0:
                                            n5w n5wVar2 = this.b;
                                            t4w t4wVar2 = n5wVar2.a;
                                            c4w c4wVar = t4wVar2.b;
                                            String str9 = t4wVar2.c;
                                            c4w c4wVar2 = c4w.a;
                                            if (c4wVar != c4wVar2) {
                                                String str10 = o5w.a;
                                                jsg.j().e(str10, str9 + " is not in ENQUEUED state. Nothing more to do");
                                                return Boolean.TRUE;
                                            }
                                            if (t4wVar2.c() || (t4wVar2.b == c4wVar2 && t4wVar2.k > 0)) {
                                                n5wVar2.f.getClass();
                                                if (System.currentTimeMillis() < t4wVar2.a()) {
                                                    jsg.j().e(o5w.a, "Delaying execution for " + str9 + " because it is being executed before schedule.");
                                                    return Boolean.TRUE;
                                                }
                                            }
                                            return Boolean.FALSE;
                                        default:
                                            n5w n5wVar3 = this.b;
                                            x4w x4wVar = n5wVar3.i;
                                            String str11 = n5wVar3.c;
                                            boolean z2 = false;
                                            if (x4wVar.d(str11) == c4w.a) {
                                                x4wVar.j(c4w.b, str11);
                                                ((Number) up6.F(x4wVar.a, false, true, new v4w(str11, 5))).intValue();
                                                x4wVar.k(-256, str11);
                                                z2 = true;
                                            }
                                            return Boolean.valueOf(z2);
                                    }
                                }
                            }))).booleanValue()) {
                                return new j5w();
                            }
                            if (t4wVar.c()) {
                                c = t4wVar.e;
                            } else {
                                r46Var.f.getClass();
                                str8.getClass();
                                String str9 = pne.a;
                                try {
                                } catch (Exception e5) {
                                    e = e5;
                                }
                                try {
                                    Object newInstance = Class.forName(str8).getDeclaredConstructor(null).newInstance(null);
                                    newInstance.getClass();
                                    overwritingInputMerger = (OverwritingInputMerger) newInstance;
                                } catch (Exception e6) {
                                    e = e6;
                                    jsg.j().h(pne.a, "Trouble instantiating ".concat(str8), e);
                                    overwritingInputMerger = null;
                                    if (overwritingInputMerger != null) {
                                    }
                                }
                                if (overwritingInputMerger != null) {
                                    jsg.j().g(o5w.a, "Could not create Input Merger ".concat(str8));
                                    return new h5w();
                                }
                                List c2 = t75.c(t4wVar.e);
                                x4w x4wVar = n5wVar.i;
                                x4wVar.getClass();
                                str5.getClass();
                                ArrayList g0 = CollectionsKt.g0(c2, (List) up6.F(x4wVar.a, true, false, new v4w(str5, 4)));
                                p97 p97Var = new p97(0);
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                Iterator it = g0.iterator();
                                while (it.hasNext()) {
                                    Map unmodifiableMap = Collections.unmodifiableMap(((q97) it.next()).a);
                                    unmodifiableMap.getClass();
                                    linkedHashMap.putAll(unmodifiableMap);
                                }
                                p97Var.f(linkedHashMap);
                                c = p97Var.c();
                            }
                            UUID fromString = UUID.fromString(str5);
                            ArrayList arrayList = n5wVar.k;
                            int i6 = t4wVar.k;
                            ExecutorService executorService = r46Var.a;
                            dq7 dq7Var = r46Var.b;
                            z3w z3wVar = new z3w(workDatabase, n5wVar.g, j4wVar);
                            WorkerParameters workerParameters = new WorkerParameters();
                            workerParameters.a = fromString;
                            workerParameters.b = c;
                            new HashSet(arrayList);
                            workerParameters.c = i6;
                            workerParameters.d = executorService;
                            workerParameters.e = dq7Var;
                            workerParameters.f = j4wVar;
                            workerParameters.g = a5wVar;
                            try {
                                ucg b = a5wVar.b(n5wVar.b, str7, workerParameters);
                                final int i7 = 1;
                                b.d = true;
                                CoroutineContext.Element element = m5wVar.getContext().get(o6c.l);
                                element.getClass();
                                r2f r2fVar = (r2f) element;
                                r2fVar.R(new epa(b, z, str2, n5wVar, 3));
                                Object s = workDatabase.s(new b6n(i3, new Callable(n5wVar) { // from class: g5w
                                    public final /* synthetic */ n5w b;

                                    {
                                        this.b = n5wVar;
                                    }

                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        switch (i7) {
                                            case 0:
                                                n5w n5wVar2 = this.b;
                                                t4w t4wVar2 = n5wVar2.a;
                                                c4w c4wVar = t4wVar2.b;
                                                String str92 = t4wVar2.c;
                                                c4w c4wVar2 = c4w.a;
                                                if (c4wVar != c4wVar2) {
                                                    String str10 = o5w.a;
                                                    jsg.j().e(str10, str92 + " is not in ENQUEUED state. Nothing more to do");
                                                    return Boolean.TRUE;
                                                }
                                                if (t4wVar2.c() || (t4wVar2.b == c4wVar2 && t4wVar2.k > 0)) {
                                                    n5wVar2.f.getClass();
                                                    if (System.currentTimeMillis() < t4wVar2.a()) {
                                                        jsg.j().e(o5w.a, "Delaying execution for " + str92 + " because it is being executed before schedule.");
                                                        return Boolean.TRUE;
                                                    }
                                                }
                                                return Boolean.FALSE;
                                            default:
                                                n5w n5wVar3 = this.b;
                                                x4w x4wVar2 = n5wVar3.i;
                                                String str11 = n5wVar3.c;
                                                boolean z2 = false;
                                                if (x4wVar2.d(str11) == c4w.a) {
                                                    x4wVar2.j(c4w.b, str11);
                                                    ((Number) up6.F(x4wVar2.a, false, true, new v4w(str11, 5))).intValue();
                                                    x4wVar2.k(-256, str11);
                                                    z2 = true;
                                                }
                                                return Boolean.valueOf(z2);
                                        }
                                    }
                                }));
                                s.getClass();
                                if (!((Boolean) s).booleanValue()) {
                                    return new j5w();
                                }
                                if (r2fVar.isCancelled()) {
                                    return new j5w();
                                }
                                lno lnoVar = j4wVar.d;
                                lnoVar.getClass();
                                a E = u2x.E(lnoVar);
                                try {
                                    wzv wzvVar = new wzv(n5wVar, b, z3wVar, null, 3);
                                    m5wVar.l = 1;
                                    obj = x97.V(E, wzvVar, m5wVar);
                                    nm6 nm6Var3 = nm6Var;
                                    if (obj == nm6Var3) {
                                        return nm6Var3;
                                    }
                                } catch (CancellationException e7) {
                                    e = e7;
                                    str3 = str;
                                    String str10 = o5w.a;
                                    j = jsg.j();
                                    String n = ouj.n(str3, " was cancelled");
                                    if (j.b <= 4) {
                                    }
                                    throw e;
                                } catch (Throwable th2) {
                                    th = th2;
                                    String str11 = o5w.a;
                                    jsg.j().h(str11, str + " failed because it threw an exception/error", th);
                                    return new h5w();
                                }
                            } catch (Throwable unused) {
                                String str12 = o5w.a;
                                jsg.j().g(str12, "Could not create Worker " + str7);
                                return new h5w();
                            }
                        }
                    }
                    str = str4;
                    nm6Var = nm6Var2;
                    str2 = str6;
                    i2 = 0;
                    i3 = 24;
                    if (!((Boolean) workDatabase.s(new b6n(i3, new Callable(n5wVar) { // from class: g5w
                        public final /* synthetic */ n5w b;

                        {
                            this.b = n5wVar;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            switch (i2) {
                                case 0:
                                    n5w n5wVar2 = this.b;
                                    t4w t4wVar2 = n5wVar2.a;
                                    c4w c4wVar = t4wVar2.b;
                                    String str92 = t4wVar2.c;
                                    c4w c4wVar2 = c4w.a;
                                    if (c4wVar != c4wVar2) {
                                        String str102 = o5w.a;
                                        jsg.j().e(str102, str92 + " is not in ENQUEUED state. Nothing more to do");
                                        return Boolean.TRUE;
                                    }
                                    if (t4wVar2.c() || (t4wVar2.b == c4wVar2 && t4wVar2.k > 0)) {
                                        n5wVar2.f.getClass();
                                        if (System.currentTimeMillis() < t4wVar2.a()) {
                                            jsg.j().e(o5w.a, "Delaying execution for " + str92 + " because it is being executed before schedule.");
                                            return Boolean.TRUE;
                                        }
                                    }
                                    return Boolean.FALSE;
                                default:
                                    n5w n5wVar3 = this.b;
                                    x4w x4wVar2 = n5wVar3.i;
                                    String str112 = n5wVar3.c;
                                    boolean z2 = false;
                                    if (x4wVar2.d(str112) == c4w.a) {
                                        x4wVar2.j(c4w.b, str112);
                                        ((Number) up6.F(x4wVar2.a, false, true, new v4w(str112, 5))).intValue();
                                        x4wVar2.k(-256, str112);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                            }
                        }
                    }))).booleanValue()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    try {
                        qgg.h0(obj);
                        str = str4;
                    } catch (CancellationException e8) {
                        e = e8;
                        str3 = str4;
                        String str102 = o5w.a;
                        j = jsg.j();
                        String n2 = ouj.n(str3, " was cancelled");
                        if (j.b <= 4) {
                            Log.i(str102, n2, e);
                        }
                        throw e;
                    } catch (Throwable th3) {
                        th = th3;
                        str = str4;
                        String str112 = o5w.a;
                        jsg.j().h(str112, str + " failed because it threw an exception/error", th);
                        return new h5w();
                    }
                }
                tcg tcgVar = (tcg) obj;
                tcgVar.getClass();
                return new i5w(tcgVar);
            }
        }
        m5wVar = new m5w(n5wVar, cg6Var);
        Object obj2 = m5wVar.j;
        nm6 nm6Var22 = nm6.a;
        i = m5wVar.l;
        if (i != 0) {
        }
        tcg tcgVar2 = (tcg) obj2;
        tcgVar2.getClass();
        return new i5w(tcgVar2);
    }

    public final void b(int i) {
        c4w c4wVar = c4w.a;
        x4w x4wVar = this.i;
        String str = this.c;
        x4wVar.j(c4wVar, str);
        this.f.getClass();
        x4wVar.i(System.currentTimeMillis(), str);
        x4wVar.h(this.a.v, str);
        x4wVar.g(-1L, str);
        x4wVar.k(i, str);
    }

    public final void c() {
        this.f.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        x4w x4wVar = this.i;
        String str = this.c;
        x4wVar.i(currentTimeMillis, str);
        x4wVar.j(c4w.a, str);
        ueo ueoVar = x4wVar.a;
        ((Number) up6.F(ueoVar, false, true, new v4w(str, 2))).intValue();
        x4wVar.h(this.a.v, str);
        up6.F(ueoVar, false, true, new v4w(str, 3));
        x4wVar.g(-1L, str);
    }

    public final void d(tcg tcgVar) {
        tcgVar.getClass();
        String str = this.c;
        ArrayList j = u75.j(str);
        while (true) {
            boolean isEmpty = j.isEmpty();
            x4w x4wVar = this.i;
            if (isEmpty) {
                q97 q97Var = ((qcg) tcgVar).a;
                q97Var.getClass();
                x4wVar.h(this.a.v, str);
                up6.F(x4wVar.a, false, true, new itv(11, q97Var, str));
                return;
            }
            String str2 = (String) z75.A(j);
            if (x4wVar.d(str2) != c4w.f) {
                x4wVar.j(c4w.d, str2);
            }
            j.addAll(this.j.a(str2));
        }
    }
}
