package defpackage;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Lambda;
import yads.mn;

/* loaded from: classes7.dex */
public final class r181 extends nw71 {
    public final /* synthetic */ int e;
    public final Lambda f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r181(Context context, v981 v981Var, jk81 jk81Var, tse tseVar, Lambda lambda, int i) {
        super(context, v981Var, jk81Var, tseVar);
        this.e = i;
        this.f = lambda;
    }

    @Override // defpackage.nw71
    public final Object a(nl61 nl61Var, Object obj, mn mnVar) {
        switch (this.e) {
            case 0:
                sc71 sc71Var = (sc71) obj;
                if (rb81.d == null) {
                    synchronized (rb81.c) {
                        if (rb81.d == null) {
                            rb81.d = new rb81();
                        }
                    }
                }
                rb81 rb81Var = rb81.d;
                if (rb81Var == null) {
                    ny61.g("Required value was null.");
                    return null;
                }
                d281 d281Var = rb81Var.a;
                rb81Var.b.getClass();
                Object b = d281Var.b(pg81.a(nl61Var), sc71Var, mnVar);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (b != coroutineSingletons) {
                    b = zy11.a;
                }
                Object obj2 = b;
                return obj2 == coroutineSingletons ? obj2 : zy11.a;
            case 1:
                o471 o471Var = (o471) obj;
                if (fj61.d == null) {
                    synchronized (fj61.c) {
                        if (fj61.d == null) {
                            fj61.d = new fj61();
                        }
                    }
                }
                fj61 fj61Var = fj61.d;
                if (fj61Var == null) {
                    ny61.g("Required value was null.");
                    return null;
                }
                d281 d281Var2 = fj61Var.a;
                fj61Var.b.getClass();
                Object b2 = d281Var2.b(pg81.a(nl61Var), o471Var, mnVar);
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (b2 != coroutineSingletons2) {
                    b2 = zy11.a;
                }
                Object obj3 = b2;
                return obj3 == coroutineSingletons2 ? obj3 : zy11.a;
            default:
                n581 n581Var = (n581) obj;
                if (ry71.d == null) {
                    synchronized (ry71.c) {
                        if (ry71.d == null) {
                            ry71.d = new ry71();
                        }
                    }
                }
                ry71 ry71Var = ry71.d;
                if (ry71Var == null) {
                    ny61.g("Required value was null.");
                    return null;
                }
                d281 d281Var3 = ry71Var.a;
                ry71Var.b.getClass();
                Object b3 = d281Var3.b(pg81.a(nl61Var), n581Var, mnVar);
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (b3 != coroutineSingletons3) {
                    b3 = zy11.a;
                }
                Object obj4 = b3;
                return obj4 == coroutineSingletons3 ? obj4 : zy11.a;
        }
    }

    @Override // defpackage.nw71
    public final zn71 c(nl61 nl61Var, fk71 fk71Var) {
        int i = 25;
        boolean z = false;
        switch (this.e) {
            case 0:
                cf71 cf71Var = new cf71(this, nl61Var, z, 14);
                kh61 kh61Var = new kh61(this.a, this.b, new hv71(), cf71Var, nl61Var);
                String str = nl61Var.a;
                kh61Var.c.a(str);
                fp71 fp71Var = kh61Var.W;
                fp71Var.x = str;
                i971 i971Var = new i971(6, fk71Var);
                fp71Var.w = i971Var;
                ((xrr) fp71Var.c).e(i971Var);
                kh61Var.i(nl61Var);
                return kh61Var;
            case 1:
                cf71 cf71Var2 = new cf71(this, nl61Var, z, 21);
                bt81 bt81Var = new bt81(this.a, this.b, new p981(), cf71Var2, nl61Var);
                bt81Var.c.a(nl61Var.a);
                cr71 cr71Var = bt81Var.W;
                cr71Var.getClass();
                nr41 nr41Var = new nr41(25, fk71Var);
                cr71Var.x = nr41Var;
                ((xrr) cr71Var.w).e(nr41Var);
                bt81Var.i(nl61Var);
                return bt81Var;
            default:
                cf71 cf71Var3 = new cf71(this, nl61Var, z, i);
                hd71 hd71Var = new hd71(this.a, this.b, new hf81(), cf71Var3, nl61Var);
                hd71Var.c.a(nl61Var.a);
                lm71 lm71Var = new lm71(8, fk71Var);
                cr71 cr71Var2 = hd71Var.W;
                cr71Var2.x = lm71Var;
                ((xrr) cr71Var2.c).e(lm71Var);
                hd71Var.i(nl61Var);
                return hd71Var;
        }
    }
}
