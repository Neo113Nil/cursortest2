package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class a65 {
    public final rus a;
    public final p3u b;
    public final b8u c;
    public final e0h d;

    public a65(rus rusVar, p3u p3uVar, b8u b8uVar) {
        rusVar.getClass();
        p3uVar.getClass();
        b8uVar.getClass();
        this.a = rusVar;
        this.b = p3uVar;
        this.c = b8uVar;
        this.d = new e0h(20);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        y55 y55Var;
        nm6 nm6Var;
        int i;
        Object h;
        pjc pjcVar;
        if (cg6Var instanceof y55) {
            y55Var = (y55) cg6Var;
            int i2 = y55Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y55Var.n = i2 - Integer.MIN_VALUE;
                Object obj = y55Var.l;
                nm6Var = nm6.a;
                i = y55Var.n;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    y55Var.j = str;
                    y55Var.n = 1;
                    obj = this.a.d(str, y55Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pjcVar = y55Var.k;
                        qgg.h0(obj);
                        return new cz(new u21(10, pjcVar, (pjc) obj, new jw4(3, 2, continuation)), this, 24);
                    }
                    str = y55Var.j;
                    qgg.h0(obj);
                }
                pjc pjcVar2 = (pjc) obj;
                Set Y = xz0.Y(new j1g[]{j1g.a, j1g.c});
                y55Var.j = null;
                y55Var.k = pjcVar2;
                y55Var.n = 2;
                h = ((b4u) this.b).h(str, Y, y55Var);
                if (h != nm6Var) {
                    obj = h;
                    pjcVar = pjcVar2;
                    return new cz(new u21(10, pjcVar, (pjc) obj, new jw4(3, 2, continuation)), this, 24);
                }
                return nm6Var;
            }
        }
        y55Var = new y55(this, cg6Var);
        Object obj2 = y55Var.l;
        nm6Var = nm6.a;
        i = y55Var.n;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        pjc pjcVar22 = (pjc) obj2;
        Set Y2 = xz0.Y(new j1g[]{j1g.a, j1g.c});
        y55Var.j = null;
        y55Var.k = pjcVar22;
        y55Var.n = 2;
        h = ((b4u) this.b).h(str, Y2, y55Var);
        if (h != nm6Var) {
        }
        return nm6Var;
    }
}
