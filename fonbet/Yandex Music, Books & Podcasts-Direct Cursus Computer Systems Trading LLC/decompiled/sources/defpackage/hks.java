package defpackage;

import android.content.Context;
import com.yandex.music.shared.offline.recommender.proto.a;
import java.io.IOException;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class hks {
    public final Context a;
    public final jyr b = btf.b(new wfs(3, this));

    public hks(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (defpackage.x97.V(defpackage.dm6.b, new defpackage.fpq(r8, r3, 21), r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        fks fksVar;
        int i;
        if (cg6Var instanceof fks) {
            fksVar = (fks) cg6Var;
            int i2 = fksVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fksVar.l = i2 - Integer.MIN_VALUE;
                Object obj = fksVar.j;
                nm6 nm6Var = nm6.a;
                i = fksVar.l;
                Continuation continuation = null;
                int i3 = 2;
                if (i != 0) {
                    qgg.h0(obj);
                    cks cksVar = (cks) this.b.getValue();
                    fksVar.l = 1;
                    cksVar.getClass();
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                wb7 wb7Var = (wb7) iks.b.getValue(this.a, iks.a[0]);
                z0i z0iVar = new z0i(i3, 27, continuation);
                fksVar.l = 2;
                Object a = wb7Var.a(z0iVar, fksVar);
                return a != nm6Var ? nm6Var : a;
            }
        }
        fksVar = new fks(this, cg6Var);
        Object obj2 = fksVar.j;
        nm6 nm6Var2 = nm6.a;
        i = fksVar.l;
        Continuation continuation2 = null;
        int i32 = 2;
        if (i != 0) {
        }
        wb7 wb7Var2 = (wb7) iks.b.getValue(this.a, iks.a[0]);
        z0i z0iVar2 = new z0i(i32, 27, continuation2);
        fksVar.l = 2;
        Object a2 = wb7Var2.a(z0iVar2, fksVar);
        if (a2 != nm6Var2) {
        }
    }

    public final Object b(glj gljVar) {
        cks cksVar = (cks) this.b.getValue();
        cksVar.getClass();
        return x97.V(dm6.b, new e05(cksVar, null), gljVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(cg6 cg6Var) {
        gks gksVar;
        int i;
        try {
            if (cg6Var instanceof gks) {
                gksVar = (gks) cg6Var;
                int i2 = gksVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    gksVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = gksVar.j;
                    nm6 nm6Var = nm6.a;
                    i = gksVar.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        pjc data = ((wb7) iks.b.getValue(this.a, iks.a[0])).getData();
                        gksVar.l = 1;
                        obj = zsd.g0(data, gksVar);
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
                    return (a) obj;
                }
            }
            if (i != 0) {
            }
            return (a) obj;
        } catch (IOException e) {
            ssg.a(6, "TinyMlStorage", "Cannot restore state!", e);
            a aVar = a.e;
            aVar.getClass();
            return aVar;
        }
        gksVar = new gks(this, cg6Var);
        Object obj2 = gksVar.j;
        nm6 nm6Var2 = nm6.a;
        i = gksVar.l;
    }
}
