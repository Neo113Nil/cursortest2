package defpackage;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class irt {
    public final jyr a = l18.b.b(hag.I(mcb.class), true);

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (defpackage.x97.V(r8, r9, r1) != r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        if (r9.c(r3, r1) == r2) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(yxc yxcVar, cg6 cg6Var) {
        hrt hrtVar;
        int i;
        l18 l18Var = l18.b;
        if (cg6Var instanceof hrt) {
            hrtVar = (hrt) cg6Var;
            int i2 = hrtVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hrtVar.m = i2 - Integer.MIN_VALUE;
                Object obj = hrtVar.k;
                nm6 nm6Var = nm6.a;
                i = hrtVar.m;
                int i3 = 1;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    bdt I = hag.I(wst.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    wst wstVar = (wst) qdcVar.C(I);
                    xxq d = yxcVar.d();
                    hrtVar.j = yxcVar;
                    hrtVar.m = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        jyr jyrVar = k3j.e;
                        if (ixf.x()) {
                            bdt I2 = hag.I(oi5.class);
                            qdc qdcVar2 = l18Var.a;
                            qdcVar2.getClass();
                            oi5 oi5Var = (oi5) qdcVar2.C(I2);
                            Parcelable.Creator<zh5> creator = zh5.CREATOR;
                            ArrayList l = l48.l();
                            ArrayList arrayList = new ArrayList(v75.o(l, 10));
                            Iterator it = l.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((zh5) it.next()).a);
                            }
                            oi5.f(oi5Var, arrayList);
                        } else {
                            bdt I3 = hag.I(pi5.class);
                            qdc qdcVar3 = l18Var.a;
                            qdcVar3.getClass();
                            jk5 jk5Var = (jk5) ((pi5) qdcVar3.C(I3)).a;
                            jk5Var.k.d(jk5.n[0], x97.y(jk5Var.h, null, null, new ek5(30000L, jk5Var, (Continuation) null), 3));
                        }
                        bdt I4 = hag.I(x6r.class);
                        qdc qdcVar4 = l18Var.a;
                        qdcVar4.getClass();
                        ((x6r) qdcVar4.C(I4)).a();
                        return Unit.a;
                    }
                    yxcVar = hrtVar.j;
                    qgg.h0(obj);
                }
                pjt pjtVar = new pjt(yxcVar, continuation, i3);
                mn7 mn7Var = dm6.b;
                hrtVar.j = null;
                hrtVar.m = 2;
            }
        }
        hrtVar = new hrt(this, cg6Var);
        Object obj2 = hrtVar.k;
        nm6 nm6Var2 = nm6.a;
        i = hrtVar.m;
        int i32 = 1;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        pjt pjtVar2 = new pjt(yxcVar, continuation2, i32);
        mn7 mn7Var2 = dm6.b;
        hrtVar.j = null;
        hrtVar.m = 2;
    }
}
