package defpackage;

import android.webkit.WebView;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class rev {
    public final x0q a;
    public final x6k b;
    public final x6k c;

    public rev(mm6 mm6Var) {
        mm6Var.getClass();
        this.a = y0q.b(0, 0, null, 7);
        Boolean bool = Boolean.FALSE;
        this.b = szf.g0(bool);
        this.c = szf.g0(bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(WebView webView, cg6 cg6Var) {
        qev qevVar;
        int i;
        if (cg6Var instanceof qev) {
            qevVar = (qev) cg6Var;
            int i2 = qevVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qevVar.l = i2 - Integer.MIN_VALUE;
                Object obj = qevVar.j;
                nm6 nm6Var = nm6.a;
                i = qevVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    dq7 dq7Var = ca8.a;
                    bsd bsdVar = j5h.a;
                    y6v y6vVar = new y6v(this, webView, (Continuation) null, 2);
                    qevVar.l = 1;
                    if (x97.V(bsdVar, y6vVar, qevVar) == nm6Var) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
            }
        }
        qevVar = new qev(this, cg6Var);
        Object obj2 = qevVar.j;
        nm6 nm6Var2 = nm6.a;
        i = qevVar.l;
        if (i != 0) {
        }
        rj7.f();
    }
}
