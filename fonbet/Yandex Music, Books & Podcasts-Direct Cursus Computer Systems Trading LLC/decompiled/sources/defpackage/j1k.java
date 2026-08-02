package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class j1k {
    public final Object a;
    public final hyd b;
    public final pt0 c = new pt0(14);
    public final pt0 d = new pt0(14);
    public final pjc e = hyf.M(new h1j(this, (Continuation) null, 14));

    public j1k(Function1 function1, hyd hydVar) {
        this.a = function1;
        this.b = hydVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(j1k j1kVar, s4k s4kVar, cg6 cg6Var) {
        i1k i1kVar;
        int i;
        s4k s4kVar2;
        boolean z;
        if (cg6Var instanceof i1k) {
            i1kVar = (i1k) cg6Var;
            int i2 = i1kVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i1kVar.n = i2 - Integer.MIN_VALUE;
                Object obj = i1kVar.l;
                nm6 nm6Var = nm6.a;
                i = i1kVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    ?? r14 = j1kVar.a;
                    i1kVar.j = j1kVar;
                    i1kVar.k = s4kVar;
                    i1kVar.n = 1;
                    obj = r14.invoke(i1kVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    s4kVar = i1kVar.k;
                    j1kVar = i1kVar.j;
                    qgg.h0(obj);
                }
                j1k j1kVar2 = j1kVar;
                s4kVar2 = (s4k) obj;
                if (s4kVar2 != s4kVar) {
                    xq0.q("An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource.");
                    return null;
                }
                msj msjVar = new msj(0, j1kVar2, j1k.class, "invalidate", "invalidate()V", 0, 6);
                s4kVar2.getClass();
                fmq fmqVar = s4kVar2.a;
                fmqVar.getClass();
                if (fmqVar.b) {
                    msjVar.invoke();
                } else {
                    ((ReentrantLock) fmqVar.c).lock();
                    try {
                        if (fmqVar.b) {
                            z = true;
                        } else {
                            ((ArrayList) fmqVar.d).add(msjVar);
                            z = false;
                        }
                        if (z) {
                            msjVar.invoke();
                        }
                    } finally {
                    }
                }
                if (s4kVar != null) {
                    msj msjVar2 = new msj(0, j1kVar2, j1k.class, "invalidate", "invalidate()V", 0, 7);
                    fmq fmqVar2 = s4kVar.a;
                    ((ReentrantLock) fmqVar2.c).lock();
                    try {
                        ((ArrayList) fmqVar2.d).remove(msjVar2);
                    } finally {
                    }
                }
                if (s4kVar != null) {
                    s4kVar.d();
                }
                if (hyf.a != null && Log.isLoggable("Paging", 3)) {
                    Log.d("Paging", "Generated new PagingSource " + s4kVar2);
                }
                return s4kVar2;
            }
        }
        i1kVar = new i1k(j1kVar, cg6Var);
        Object obj2 = i1kVar.l;
        nm6 nm6Var2 = nm6.a;
        i = i1kVar.n;
        if (i != 0) {
        }
        j1k j1kVar22 = j1kVar;
        s4kVar2 = (s4k) obj2;
        if (s4kVar2 != s4kVar) {
        }
    }
}
