package defpackage;

import io.appmetrica.analytics.BuildConfig;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class i7a {
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final tf6 e = gld.e(dm6.b);
    public final jyr f;

    public i7a(jyr jyrVar, jyr jyrVar2, jyr jyrVar3, jyr jyrVar4, jyr jyrVar5) {
        this.a = jyrVar;
        this.b = jyrVar2;
        this.c = jyrVar3;
        this.d = jyrVar4;
        this.f = jyrVar5;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(i7a i7aVar, String str, cg6 cg6Var) {
        e7a e7aVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof e7a) {
            e7aVar = (e7a) cg6Var;
            int i2 = e7aVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e7aVar.l = i2 - Integer.MIN_VALUE;
                Object obj = e7aVar.j;
                nm6 nm6Var = nm6.a;
                i = e7aVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    k21 k21Var = (k21) i7aVar.c.getValue();
                    e7aVar.l = 1;
                    obj = k21.b(k21Var, str, false, e7aVar, 30);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof pj6)) {
                    return null;
                }
                if (rj6Var instanceof qj6) {
                    return (i21) ((qj6) rj6Var).a;
                }
                b6e.s();
                return null;
            }
        }
        e7aVar = new e7a(i7aVar, cg6Var);
        Object obj2 = e7aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = e7aVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof pj6)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(String str, cg6 cg6Var) {
        d7a d7aVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof d7a) {
            d7aVar = (d7a) cg6Var;
            int i2 = d7aVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d7aVar.l = i2 - Integer.MIN_VALUE;
                Object obj = d7aVar.j;
                nm6 nm6Var = nm6.a;
                i = d7aVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ay ayVar = (ay) this.a.getValue();
                    d7aVar.l = 1;
                    obj = ayVar.d(str, false, d7aVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof pj6)) {
                    return null;
                }
                if (rj6Var instanceof qj6) {
                    return (oq) ((qj6) rj6Var).a;
                }
                b6e.s();
                return null;
            }
        }
        d7aVar = new d7a(this, cg6Var);
        Object obj2 = d7aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = d7aVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof pj6)) {
        }
    }

    public final t3g c() {
        return (t3g) this.d.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(String str, String str2, cg6 cg6Var) {
        f7a f7aVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof f7a) {
            f7aVar = (f7a) cg6Var;
            int i2 = f7aVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f7aVar.l = i2 - Integer.MIN_VALUE;
                f7a f7aVar2 = f7aVar;
                Object obj = f7aVar2.j;
                nm6 nm6Var = nm6.a;
                i = f7aVar2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    cut cutVar = (cut) this.b.getValue();
                    f7aVar2.l = 1;
                    obj = cut.h(cutVar, str, str2, false, false, f7aVar2, BuildConfig.API_LEVEL);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof pj6)) {
                    return null;
                }
                if (rj6Var instanceof qj6) {
                    return (rrl) ((qj6) rj6Var).a;
                }
                b6e.s();
                return null;
            }
        }
        f7aVar = new f7a(this, cg6Var);
        f7a f7aVar22 = f7aVar;
        Object obj2 = f7aVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = f7aVar22.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof pj6)) {
        }
    }
}
