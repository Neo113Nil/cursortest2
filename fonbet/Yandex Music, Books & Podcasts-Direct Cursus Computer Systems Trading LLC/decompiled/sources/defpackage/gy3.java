package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class gy3 {
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public final jyr f;

    public gy3() {
        bdt I = hag.I(k6l.class);
        l18 l18Var = l18.b;
        this.a = l18Var.b(I, true);
        this.b = l18Var.b(hag.I(uwu.class), true);
        this.c = l18Var.b(hag.I(qwu.class), true);
        this.d = l18Var.b(hag.I(qy7.class), true);
        this.e = l18Var.b(hag.I(i0j.class), true);
        l18Var.b(hag.I(z66.class), true);
        this.f = l18Var.b(hag.I(nmj.class), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Continuation continuation) {
        ey3 ey3Var;
        int i;
        rj6 rj6Var;
        ox6 ox6Var;
        if (continuation instanceof ey3) {
            ey3Var = (ey3) continuation;
            int i2 = ey3Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ey3Var.l = i2 - Integer.MIN_VALUE;
                Object obj = ey3Var.j;
                nm6 nm6Var = nm6.a;
                i = ey3Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    l18 l18Var = l18.b;
                    bdt I = hag.I(cy3.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    cy3 cy3Var = (cy3) qdcVar.C(I);
                    ey3Var.l = 1;
                    obj = cy3Var.a(str, ey3Var);
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
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (rj6Var instanceof pj6) {
                        return rj6Var;
                    }
                    b6e.s();
                    return null;
                }
                List<ax3> list = (List) ((qj6) rj6Var).a;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                for (ax3 ax3Var : list) {
                    ax3Var.getClass();
                    se seVar = ax3Var.e;
                    if (seVar != null) {
                        ox6Var = new qd3(seVar.b, seVar.a, seVar.c);
                    } else {
                        s1u s1uVar = ax3Var.d;
                        if (s1uVar != null) {
                            int i3 = ax3Var.c;
                            String str2 = s1uVar.a;
                            List c = t75.c(s1uVar.b);
                            String str3 = s1uVar.c;
                            String hexString = Integer.toHexString(i3);
                            hexString.getClass();
                            ox6Var = new rd3(str2, null, s1uVar.b, str3, null, "#".concat(hexString), null, c);
                        } else {
                            ox6Var = null;
                        }
                    }
                    arrayList.add(new zw3(ax3Var.a, ax3Var.b, ox6Var));
                }
                return new qj6(arrayList);
            }
        }
        ey3Var = new ey3(this, continuation);
        Object obj2 = ey3Var.j;
        nm6 nm6Var2 = nm6.a;
        i = ey3Var.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }
}
