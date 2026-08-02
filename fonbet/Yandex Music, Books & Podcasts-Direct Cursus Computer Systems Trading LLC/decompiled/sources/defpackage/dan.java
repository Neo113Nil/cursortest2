package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.music.shared.wave.api.StartWaveQueueCommand;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import ru.yandex.music.common.media.context.e;
import ru.yandex.music.common.media.context.h;

/* loaded from: classes5.dex */
public final class dan {
    public final can a = new can(this);

    public static StartWaveQueueCommand b(igr igrVar, v9n v9nVar) {
        xsu xsuVar = igrVar.c;
        xsuVar.getClass();
        nyn nynVar = igrVar.d;
        nynVar.getClass();
        nyu R = v7g.R(igrVar);
        boolean z = igrVar.e;
        xys xysVar = igrVar.f;
        xysVar.getClass();
        String str = igrVar.m;
        t0q t0qVar = igrVar.l;
        t0qVar.getClass();
        return new StartWaveQueueCommand(new qs(igrVar, null, 9), new mzu(xsuVar, nynVar, R, z, xysVar, str, t0qVar, v9nVar.b), v9nVar.a, v9nVar.c, v9nVar.d, v9nVar.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0072, code lost:
    
        if (r1 == r4) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(se5 se5Var, v9n v9nVar, cg6 cg6Var) {
        w9n w9nVar;
        nm6 nm6Var;
        int i;
        v9n v9nVar2;
        hof hofVar;
        SharedPreferences sharedPreferences;
        boolean z;
        hyn hynVar;
        int ordinal;
        nyn nynVar;
        Object b;
        List list;
        hof hofVar2;
        se5 se5Var2;
        boolean z2;
        nyn nynVar2;
        v9n v9nVar3;
        se5 se5Var3 = se5Var;
        if (cg6Var instanceof w9n) {
            w9nVar = (w9n) cg6Var;
            int i2 = w9nVar.r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w9nVar.r = i2 - Integer.MIN_VALUE;
                Object obj = w9nVar.p;
                nm6Var = nm6.a;
                i = w9nVar.r;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    c5l c5lVar = new c5l(se5Var3, continuation, 22);
                    mn7 mn7Var = dm6.b;
                    w9nVar.j = se5Var3;
                    v9nVar2 = v9nVar;
                    w9nVar.k = v9nVar2;
                    w9nVar.l = null;
                    w9nVar.r = 1;
                    obj = x97.V(mn7Var, c5lVar, w9nVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z2 = w9nVar.o;
                        nyn nynVar3 = w9nVar.n;
                        hofVar2 = w9nVar.m;
                        List list2 = w9nVar.l;
                        v9nVar3 = w9nVar.k;
                        se5Var2 = w9nVar.j;
                        qgg.h0(obj);
                        nynVar2 = nynVar3;
                        list = list2;
                        iyp iypVar = (iyp) obj;
                        qdc qdcVar = new qdc((e) null, (h) null, 3);
                        wsu wsuVar = new wsu(list, c5b.a, new ssu(hofVar2.f, list.size(), new Long(se5Var2.i)), !z2 ? new seq(se5Var2.o, hofVar2.c) : req.a, iypVar.b);
                        boolean z3 = se5Var2.l;
                        xys xysVar = iypVar.a;
                        gxc gxcVar = se5Var2.j.a.b;
                        gxcVar.getClass();
                        t0q t0qVar = se5Var2.n;
                        nynVar2.getClass();
                        t0qVar.getClass();
                        f0t f0tVar = f0t.a;
                        nyn nynVar4 = nyn.a;
                        return b(new igr(wsuVar, nynVar2, z3, xysVar, new q3r("default"), gxcVar, qdcVar, f0tVar, null, t0qVar), v9nVar3);
                    }
                    v9n v9nVar4 = w9nVar.k;
                    se5 se5Var4 = w9nVar.j;
                    qgg.h0(obj);
                    v9nVar2 = v9nVar4;
                    se5Var3 = se5Var4;
                }
                Pair pair = (Pair) obj;
                List list3 = (List) pair.a;
                hofVar = (hof) pair.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(Context.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                sharedPreferences = ((Context) qdcVar2.C(I)).getSharedPreferences("Yandex_Music", 0);
                sharedPreferences.getClass();
                z = hofVar.b;
                hynVar = hofVar.d;
                if (!hofVar.a && !se5Var3.l) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putBoolean("is_shuffle", z);
                    edit.apply();
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putInt("repeat_mode", hynVar.a);
                    edit2.apply();
                }
                ordinal = hynVar.ordinal();
                if (ordinal != 0) {
                    nynVar = nyn.b;
                } else if (ordinal == 1) {
                    nynVar = nyn.c;
                } else {
                    if (ordinal != 2) {
                        b6e.s();
                        return null;
                    }
                    nynVar = nyn.a;
                }
                jml jmlVar = pyp.d;
                w9nVar.j = se5Var3;
                w9nVar.k = v9nVar2;
                w9nVar.l = list3;
                w9nVar.m = hofVar;
                w9nVar.n = nynVar;
                w9nVar.o = z;
                w9nVar.r = 2;
                b = jmlVar.b(se5Var3, w9nVar);
                if (b != nm6Var) {
                    list = list3;
                    hofVar2 = hofVar;
                    obj = b;
                    se5Var2 = se5Var3;
                    z2 = z;
                    nynVar2 = nynVar;
                    v9nVar3 = v9nVar2;
                    iyp iypVar2 = (iyp) obj;
                    qdc qdcVar3 = new qdc((e) null, (h) null, 3);
                    wsu wsuVar2 = new wsu(list, c5b.a, new ssu(hofVar2.f, list.size(), new Long(se5Var2.i)), !z2 ? new seq(se5Var2.o, hofVar2.c) : req.a, iypVar2.b);
                    boolean z32 = se5Var2.l;
                    xys xysVar2 = iypVar2.a;
                    gxc gxcVar2 = se5Var2.j.a.b;
                    gxcVar2.getClass();
                    t0q t0qVar2 = se5Var2.n;
                    nynVar2.getClass();
                    t0qVar2.getClass();
                    f0t f0tVar2 = f0t.a;
                    nyn nynVar42 = nyn.a;
                    return b(new igr(wsuVar2, nynVar2, z32, xysVar2, new q3r("default"), gxcVar2, qdcVar3, f0tVar2, null, t0qVar2), v9nVar3);
                }
                return nm6Var;
            }
        }
        w9nVar = new w9n(this, cg6Var);
        Object obj2 = w9nVar.p;
        nm6Var = nm6.a;
        i = w9nVar.r;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj2;
        List list32 = (List) pair2.a;
        hofVar = (hof) pair2.b;
        l18 l18Var2 = l18.b;
        bdt I2 = hag.I(Context.class);
        qdc qdcVar22 = l18Var2.a;
        qdcVar22.getClass();
        sharedPreferences = ((Context) qdcVar22.C(I2)).getSharedPreferences("Yandex_Music", 0);
        sharedPreferences.getClass();
        z = hofVar.b;
        hynVar = hofVar.d;
        if (!hofVar.a) {
            SharedPreferences.Editor edit3 = sharedPreferences.edit();
            edit3.putBoolean("is_shuffle", z);
            edit3.apply();
            SharedPreferences.Editor edit22 = sharedPreferences.edit();
            edit22.putInt("repeat_mode", hynVar.a);
            edit22.apply();
        }
        ordinal = hynVar.ordinal();
        if (ordinal != 0) {
        }
        jml jmlVar2 = pyp.d;
        w9nVar.j = se5Var3;
        w9nVar.k = v9nVar2;
        w9nVar.l = list32;
        w9nVar.m = hofVar;
        w9nVar.n = nynVar;
        w9nVar.o = z;
        w9nVar.r = 2;
        b = jmlVar2.b(se5Var3, w9nVar);
        if (b != nm6Var) {
        }
        return nm6Var;
    }
}
