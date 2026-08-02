package defpackage;

import android.content.Context;
import androidx.fragment.app.y;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class ysj {
    public final Context a;
    public final ljf b;
    public final y c;
    public final jyr d;
    public final nrf e;

    public ysj(Context context, ljf ljfVar, y yVar, s63 s63Var) {
        context.getClass();
        yVar.getClass();
        s63Var.getClass();
        this.a = context;
        this.b = ljfVar;
        this.c = yVar;
        this.d = l18.b.b(hag.I(kvn.class), true);
        this.e = ((fsj) s63Var.a).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ysj ysjVar, eul eulVar, Continuation continuation) {
        xsj xsjVar;
        int i;
        rj6 rj6Var;
        ysjVar.getClass();
        if (continuation instanceof xsj) {
            xsjVar = (xsj) continuation;
            int i2 = xsjVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xsjVar.l = i2 - Integer.MIN_VALUE;
                xsj xsjVar2 = xsjVar;
                Object obj = xsjVar2.j;
                nm6 nm6Var = nm6.a;
                i = xsjVar2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    kvn kvnVar = (kvn) ysjVar.d.getValue();
                    nvl d = eulVar.d();
                    xsjVar2.l = 1;
                    obj = cut.h((cut) kvnVar.b.getValue(), d.a, d.b, false, true, xsjVar2, 112);
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
                        throw ((pj6) rj6Var).a();
                    }
                    b6e.s();
                    return null;
                }
                List list = ((rrl) ((qj6) rj6Var).a).c;
                if (list != null) {
                    return list;
                }
                c5b c5bVar = c5b.a;
                su4.s(2, null, "tracks info is not received", null);
                return c5bVar;
            }
        }
        xsjVar = new xsj(ysjVar, continuation);
        xsj xsjVar22 = xsjVar;
        Object obj2 = xsjVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = xsjVar22.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }
}
