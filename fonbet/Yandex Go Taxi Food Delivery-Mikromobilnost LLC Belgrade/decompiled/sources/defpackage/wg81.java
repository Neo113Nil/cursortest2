package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.a;
import yads.fx0;
import yads.ht2;
import yads.sz2;
import yads.yw0;

/* loaded from: classes7.dex */
public final class wg81 {
    public final gg81 a;
    public final ht2 b;
    public boolean c;
    public final a d = gtq0.a();

    public wg81(gg81 gg81Var, ht2 ht2Var) {
        this.a = gg81Var;
        this.b = ht2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055 A[Catch: all -> 0x00dd, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00dd, blocks: (B:11:0x004d, B:16:0x0055), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        sz2 sz2Var;
        int i;
        g050 g050Var;
        Object obj;
        try {
            if (continuationImpl instanceof sz2) {
                sz2Var = (sz2) continuationImpl;
                int i2 = sz2Var.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    sz2Var.e = i2 - Integer.MIN_VALUE;
                    Object obj2 = sz2Var.c;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = sz2Var.e;
                    zy11 zy11Var = zy11.a;
                    if (i != 0) {
                        b.b(obj2);
                        if (!this.c) {
                            a aVar = this.d;
                            sz2Var.b = aVar;
                            sz2Var.e = 1;
                            if (aVar.a(sz2Var) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            g050Var = aVar;
                        }
                        return zy11Var;
                    }
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g050Var = sz2Var.b;
                    b.b(obj2);
                    if (!this.c) {
                        return zy11Var;
                    }
                    this.c = true;
                    g050Var.d(null);
                    List<u671> list = this.a.P0;
                    if (list != null) {
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list != null) {
                            nb71 nb71Var = (nb71) this.b.invoke();
                            for (u671 u671Var : list) {
                                pt81 pt81Var = yw0.c;
                                String str = u671Var.b.b;
                                pt81Var.getClass();
                                Iterator<E> it = yw0.h.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it.next();
                                    if (jl40.l(((yw0) obj).b, str)) {
                                        break;
                                    }
                                }
                                yw0 yw0Var = (yw0) obj;
                                if (yw0Var != null) {
                                    try {
                                        nl61 nl61Var = new nl61(u671Var.a, null, null, null, false);
                                        nw71 nw71Var = (nw71) nb71Var.b.get(yw0Var);
                                        if (nw71Var != null) {
                                            tse tseVar = nb71Var.a;
                                            sjh sjhVar = uyj.a;
                                            tje.N(tseVar, o400.a, null, new fx0(nb71Var, nl61Var, yw0Var, nw71Var, null), 2);
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        }
                    }
                    return zy11Var;
                }
            }
            if (!this.c) {
            }
        } finally {
            g050Var.d(null);
        }
        sz2Var = new sz2(this, continuationImpl);
        Object obj22 = sz2Var.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sz2Var.e;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
    }
}
