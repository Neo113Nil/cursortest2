package defpackage;

import java.io.Serializable;
import java.util.Collection;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class yc0 {
    public final jyr a;

    public yc0(jyr jyrVar) {
        this.a = jyrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(String str, cg6 cg6Var) {
        xc0 xc0Var;
        nm6 nm6Var;
        int i;
        int i2;
        int i3;
        Object a;
        Collection collection;
        if (cg6Var instanceof xc0) {
            xc0Var = (xc0) cg6Var;
            int i4 = xc0Var.p;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                xc0Var.p = i4 - Integer.MIN_VALUE;
                xc0 xc0Var2 = xc0Var;
                Object obj = xc0Var2.n;
                nm6Var = nm6.a;
                i = xc0Var2.p;
                jyr jyrVar = this.a;
                if (i != 0) {
                    qgg.h0(obj);
                    str.getClass();
                    rtl rtlVar = (rtl) jyrVar.getValue();
                    xc0Var2.j = str;
                    i2 = 0;
                    xc0Var2.l = 0;
                    xc0Var2.m = 0;
                    xc0Var2.p = 1;
                    obj = rtlVar.g(str, Integer.MAX_VALUE, xc0Var2);
                    if (obj != nm6Var) {
                        i3 = 0;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = xc0Var2.k;
                    qgg.h0(obj);
                    return CollectionsKt.g0(collection, (Iterable) obj);
                }
                int i5 = xc0Var2.m;
                int i6 = xc0Var2.l;
                String str2 = xc0Var2.j;
                qgg.h0(obj);
                i2 = i5;
                str = str2;
                i3 = i6;
                Collection collection2 = (Collection) obj;
                rtl rtlVar2 = (rtl) jyrVar.getValue();
                xc0Var2.j = null;
                xc0Var2.k = collection2;
                xc0Var2.l = i3;
                xc0Var2.m = i2;
                xc0Var2.p = 2;
                rtlVar2.getClass();
                a = rtlVar2.a(str, Boolean.FALSE, Boolean.TRUE, null, xc0Var2);
                if (a != nm6Var) {
                    obj = a;
                    collection = collection2;
                    return CollectionsKt.g0(collection, (Iterable) obj);
                }
                return nm6Var;
            }
        }
        xc0Var = new xc0(this, cg6Var);
        xc0 xc0Var22 = xc0Var;
        Object obj2 = xc0Var22.n;
        nm6Var = nm6.a;
        i = xc0Var22.p;
        jyr jyrVar2 = this.a;
        if (i != 0) {
        }
        Collection collection22 = (Collection) obj2;
        rtl rtlVar22 = (rtl) jyrVar2.getValue();
        xc0Var22.j = null;
        xc0Var22.k = collection22;
        xc0Var22.l = i3;
        xc0Var22.m = i2;
        xc0Var22.p = 2;
        rtlVar22.getClass();
        a = rtlVar22.a(str, Boolean.FALSE, Boolean.TRUE, null, xc0Var22);
        if (a != nm6Var) {
        }
        return nm6Var;
    }
}
