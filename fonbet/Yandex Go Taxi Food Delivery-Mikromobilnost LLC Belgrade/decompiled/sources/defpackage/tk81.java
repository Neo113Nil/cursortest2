package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.sequences.b;
import yads.e52;
import yads.eq0;
import yads.f5;
import yads.n52;
import yads.o52;
import yads.p52;
import yads.q52;
import yads.s42;
import yads.t42;

/* loaded from: classes7.dex */
public final class tk81 {
    public final ike a;
    public final hp61 b;
    public final hp61 c;
    public final ak61 d;

    public tk81(Context context, ike ikeVar, fe81 fe81Var, e971 e971Var, v981 v981Var) {
        hp61 hp61Var = new hp61(context, e971Var, 0);
        hp61 hp61Var2 = new hp61(context, e971Var, 1);
        ak61 ak61Var = new ak61(context, fe81Var, e971Var, v981Var);
        this.a = ikeVar;
        this.b = hp61Var;
        this.c = hp61Var2;
        this.d = ak61Var;
    }

    public final Object a(Context context, d881 d881Var, tg81 tg81Var, z081 z081Var, ContinuationImpl continuationImpl) {
        j18 j18Var = new j18(1, dvw.b(continuationImpl));
        j18Var.u();
        bp5 bp5Var = new bp5(j18Var);
        boolean a = b9a1.a(context, eq0.c);
        e52[] e52VarArr = e52.b;
        if ("first_video_preloading_strategy".equals(d881Var.s) && a) {
            hp61 hp61Var = this.c;
            synchronized (hp61Var.d) {
                try {
                    qb71 qb71Var = tg81Var.a;
                    eb81 eb81Var = hp61Var.c;
                    eb81Var.getClass();
                    List s = b.s(new yw01(new yw01(b.o(b.l(new h73(1, qb71Var.a), new p52(eb81Var)), q52.w), n52.w), o52.w));
                    if (s.isEmpty()) {
                        bp5Var.b();
                    } else {
                        mq71 mq71Var = new mq71(hp61Var.a, bp5Var, hp61Var.b, a.J(s, 1).iterator(), z081Var);
                        hp61Var.a.b(f5.q, null);
                        Pair pair = (Pair) a.P(s);
                        hp61Var.b.b((String) pair.getFirst(), mq71Var, (String) pair.getSecond());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            hp61 hp61Var2 = this.b;
            synchronized (hp61Var2.d) {
                qb71 qb71Var2 = tg81Var.a;
                eb81 eb81Var2 = hp61Var2.c;
                eb81Var2.getClass();
                List<Pair> s2 = b.s(new yw01(new yw01(b.o(b.l(new h73(1, qb71Var2.a), new p52(eb81Var2)), q52.w), n52.w), o52.w));
                if (s2.isEmpty()) {
                    bp5Var.b();
                } else {
                    yl61 yl61Var = new yl61(hp61Var2.a, s2.size(), bp5Var, z081Var);
                    hp61Var2.a.b(f5.q, null);
                    for (Pair pair2 : s2) {
                        hp61Var2.b.b((String) pair2.getFirst(), yl61Var, (String) pair2.getSecond());
                    }
                }
            }
        }
        Object s3 = j18Var.s();
        return s3 == CoroutineSingletons.COROUTINE_SUSPENDED ? s3 : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(boolean z, Context context, tg81 tg81Var, z081 z081Var, ContinuationImpl continuationImpl) {
        s42 s42Var;
        int i;
        Object a;
        boolean z2;
        Context context2;
        s42 s42Var2;
        z081 z081Var2;
        tg81 tg81Var2;
        if (continuationImpl instanceof s42) {
            s42Var = (s42) continuationImpl;
            int i2 = s42Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s42Var.g = i2 - Integer.MIN_VALUE;
                s42 s42Var3 = s42Var;
                Object obj = s42Var3.e;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = s42Var3.g;
                if (i != 0) {
                    kotlin.b.b(obj);
                    s42Var3.c = context;
                    s42Var3.d = z081Var;
                    s42Var3.b = z;
                    s42Var3.g = 1;
                    a = this.d.a(context, tg81Var, s42Var3);
                    if (a != obj2) {
                        z2 = z;
                        context2 = context;
                        s42Var2 = s42Var3;
                        z081Var2 = z081Var;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tg81 tg81Var3 = (tg81) s42Var3.c;
                    kotlin.b.b(obj);
                    return tg81Var3;
                }
                z2 = s42Var3.b;
                z081 z081Var3 = s42Var3.d;
                Context context3 = (Context) s42Var3.c;
                kotlin.b.b(obj);
                a = obj;
                context2 = context3;
                z081Var2 = z081Var3;
                s42Var2 = s42Var3;
                tg81Var2 = (tg81) a;
                if (tg81Var2 != null) {
                    return null;
                }
                if (!z2) {
                    return tg81Var2;
                }
                z081 z081Var4 = z081Var2;
                s42 s42Var4 = s42Var2;
                d881 d881Var = tg81Var2.b;
                if (d881Var.A) {
                    tje.N(this.a, null, null, new t42(this, context2, d881Var, tg81Var2, z081Var4, null), 3);
                    return tg81Var2;
                }
                Context context4 = context2;
                if (!d881Var.u) {
                    return tg81Var2;
                }
                s42Var4.c = tg81Var2;
                s42Var4.d = null;
                s42Var4.g = 2;
                return a(context4, d881Var, tg81Var2, z081Var4, s42Var4) == obj2 ? obj2 : tg81Var2;
            }
        }
        s42Var = new s42(this, continuationImpl);
        s42 s42Var32 = s42Var;
        Object obj3 = s42Var32.e;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = s42Var32.g;
        if (i != 0) {
        }
        tg81Var2 = (tg81) a;
        if (tg81Var2 != null) {
        }
    }
}
