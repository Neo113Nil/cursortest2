package defpackage;

import android.content.Context;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yads.j62;

/* loaded from: classes7.dex */
public final class qr71 {
    public final vi71 a;
    public final nr41 b;

    public qr71(Context context, fe81 fe81Var, e971 e971Var, v981 v981Var) {
        vi71 vi71Var = new vi71(context, new qz61());
        nr41 nr41Var = new nr41(context, e971Var, new i971(4, fe81Var), new wo71(), v981Var, fe81Var);
        this.a = vi71Var;
        this.b = nr41Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable a(qr71 qr71Var, List list, ContinuationImpl continuationImpl) {
        j62 j62Var;
        int i;
        ij71 ij71Var;
        qr71Var.getClass();
        if (continuationImpl instanceof j62) {
            j62Var = (j62) continuationImpl;
            int i2 = j62Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j62Var.d = i2 - Integer.MIN_VALUE;
                Object obj = j62Var.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = j62Var.d;
                if (i != 0) {
                    b.b(obj);
                    nr41 nr41Var = qr71Var.b;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((i581) it.next()).b);
                    }
                    j62Var.d = 1;
                    nr41Var.getClass();
                    j18 j18Var = new j18(1, dvw.b(j62Var));
                    j18Var.u();
                    mc3 mc3Var = new mc3(j18Var, 5);
                    s421 s421Var = (s421) nr41Var.b;
                    Object obj2 = new Object();
                    ((u371) s421Var.w).getClass();
                    rr41 a = u371.a(arrayList);
                    ((ArrayList) s421Var.x).addAll((List) a.b);
                    ((tpq0) s421Var.c).a((Context) s421Var.b, (List) a.c, new mj31(s421Var, mc3Var, obj2, false, 20), obj2);
                    obj = j18Var.s();
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                ij71Var = (ij71) obj;
                if (!(ij71Var instanceof bd71)) {
                    return EmptyList.a;
                }
                if (ij71Var instanceof fg71) {
                    return qr71Var.a.b(((fg71) ij71Var).a);
                }
                w511.b();
                return null;
            }
        }
        j62Var = new j62(qr71Var, continuationImpl);
        Object obj3 = j62Var.b;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = j62Var.d;
        if (i != 0) {
        }
        ij71Var = (ij71) obj3;
        if (!(ij71Var instanceof bd71)) {
        }
    }
}
