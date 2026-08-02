package defpackage;

import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yads.q80;
import yads.rx0;
import yads.x80;

/* loaded from: classes7.dex */
public final class vd81 {
    public final b881 a;

    public vd81(b881 b881Var) {
        this.a = b881Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        rx0 rx0Var;
        int i;
        if (continuationImpl instanceof rx0) {
            rx0Var = (rx0) continuationImpl;
            int i2 = rx0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rx0Var.d = i2 - Integer.MIN_VALUE;
                Object obj = rx0Var.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rx0Var.d;
                if (i != 0) {
                    b.b(obj);
                    rx0Var.d = 1;
                    b881 b881Var = this.a;
                    obj = tje.k0(b881Var.d, new q80(b881Var, null), rx0Var);
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
                vx71 vx71Var = (vx71) obj;
                List list = vx71Var.h;
                b971 b971Var = vx71Var.a;
                al81 al81Var = vx71Var.b;
                boolean z = al81Var.b;
                List list2 = al81Var.c;
                return new h181(list, b971Var, new fo81(al81Var.a, new qu81(!z ? list2.isEmpty() ? x80.b : x80.c : x80.d, list2)), vx71Var.c, vx71Var.d, vx71Var.e, vx71Var.f);
            }
        }
        rx0Var = new rx0(this, continuationImpl);
        Object obj2 = rx0Var.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rx0Var.d;
        if (i != 0) {
        }
        vx71 vx71Var2 = (vx71) obj2;
        List list3 = vx71Var2.h;
        b971 b971Var2 = vx71Var2.a;
        al81 al81Var2 = vx71Var2.b;
        boolean z2 = al81Var2.b;
        List list22 = al81Var2.c;
        return new h181(list3, b971Var2, new fo81(al81Var2.a, new qu81(!z2 ? list22.isEmpty() ? x80.b : x80.c : x80.d, list22)), vx71Var2.c, vx71Var2.d, vx71Var2.e, vx71Var2.f);
    }
}
