package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yads.px0;
import yads.q80;

/* loaded from: classes7.dex */
public final class s681 {
    public final b881 a;

    public s681(b881 b881Var) {
        this.a = b881Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c A[LOOP:0: B:11:0x0056->B:13:0x005c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        px0 px0Var;
        int i;
        if (continuationImpl instanceof px0) {
            px0Var = (px0) continuationImpl;
            int i2 = px0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                px0Var.d = i2 - Integer.MIN_VALUE;
                Object obj = px0Var.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = px0Var.d;
                if (i != 0) {
                    b.b(obj);
                    px0Var.d = 1;
                    b881 b881Var = this.a;
                    obj = tje.k0(b881Var.d, new q80(b881Var, null), px0Var);
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
                List<ee81> list = ((vx71) obj).g;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                for (ee81 ee81Var : list) {
                    arrayList.add(new eu81(ee81Var.a, ee81Var.b, ee81Var.c));
                }
                return new c181(arrayList);
            }
        }
        px0Var = new px0(this, continuationImpl);
        Object obj2 = px0Var.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = px0Var.d;
        if (i != 0) {
        }
        List<ee81> list2 = ((vx71) obj2).g;
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        while (r5.hasNext()) {
        }
        return new c181(arrayList2);
    }
}
