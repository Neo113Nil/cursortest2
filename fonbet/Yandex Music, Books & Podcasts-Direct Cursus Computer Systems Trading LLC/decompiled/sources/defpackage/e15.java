package defpackage;

import com.yandex.music.databases.main.MainDatabase;
import java.util.Arrays;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class e15 {
    public final zb0 a;
    public final xp0 b;
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public final jyr f = btf.b(new r93(28, this));

    public e15(jyr jyrVar, jyr jyrVar2, jyr jyrVar3, zb0 zb0Var, xp0 xp0Var) {
        this.a = zb0Var;
        this.b = xp0Var;
        this.c = jyrVar;
        this.d = jyrVar2;
        this.e = jyrVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e15 e15Var, String str, cg6 cg6Var) {
        d15 d15Var;
        int i;
        if (cg6Var instanceof d15) {
            d15Var = (d15) cg6Var;
            int i2 = d15Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d15Var.l = i2 - Integer.MIN_VALUE;
                Object obj = d15Var.j;
                nm6 nm6Var = nm6.a;
                i = d15Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    i5h g = e15Var.g();
                    d15Var.l = 1;
                    obj = g.b(str, d15Var);
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
                return ((MainDatabase) obj).P();
            }
        }
        d15Var = new d15(e15Var, cg6Var);
        Object obj2 = d15Var.j;
        nm6 nm6Var2 = nm6.a;
        i = d15Var.l;
        if (i != 0) {
        }
        return ((MainDatabase) obj2).P();
    }

    public static pjc b(e15 e15Var, String str, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        return zsd.b0(new c05(e15Var.h("album_mview"), e15Var, str, 1));
    }

    public static Object e(e15 e15Var, uhn uhnVar, Boolean bool, Integer num, cg6 cg6Var, int i) {
        if ((i & 1) != 0) {
            uhnVar = null;
        }
        return x97.V(dm6.b, new n05(e15Var, num, uhnVar, bool, null, null), cg6Var);
    }

    public static Object f(e15 e15Var, uhn uhnVar, Boolean bool, Integer num, Continuation continuation, int i) {
        if ((i & 1) != 0) {
            uhnVar = null;
        }
        return x97.V(dm6.b, new o05(e15Var, num, uhnVar, bool, null, null), continuation);
    }

    public static Object i(e15 e15Var, String str, Integer num, cg6 cg6Var, int i) {
        Boolean bool = Boolean.TRUE;
        String str2 = (i & 1) != 0 ? null : str;
        Boolean bool2 = (i & 4) != 0 ? null : bool;
        Boolean bool3 = (i & 8) != 0 ? Boolean.FALSE : null;
        e15Var.getClass();
        return x97.V(dm6.b, new q05(e15Var, num, bool3, bool2, str2, null, null), cg6Var);
    }

    public final pjc c(Integer num) {
        return zsd.b0(new h05(h("artist_mview"), this, num, 0));
    }

    public final Object d(String str, String str2, cg6 cg6Var) {
        return x97.V(dm6.b, new rc4(this, str, str2, null, 11), cg6Var);
    }

    public final i5h g() {
        return (i5h) this.c.getValue();
    }

    public final tc4 h(String... strArr) {
        String str = ((frt) l18.b.c(hag.I(frt.class))).c().a;
        str.getClass();
        return ox6.L(g().g(str, (String[]) Arrays.copyOf(strArr, strArr.length)), 1000L);
    }
}
