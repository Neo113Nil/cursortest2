package defpackage;

import android.webkit.WebView;

/* loaded from: classes4.dex */
public final class idv {
    public final mm6 a;
    public final j0q b;
    public final x6k c;
    public final x6k d;

    public idv(mm6 mm6Var) {
        mm6Var.getClass();
        this.a = mm6Var;
        this.b = new j0q();
        Boolean bool = Boolean.FALSE;
        this.c = szf.g0(bool);
        this.d = szf.g0(bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(WebView webView, cg6 cg6Var) {
        hdv hdvVar;
        int i;
        if (cg6Var instanceof hdv) {
            hdvVar = (hdv) cg6Var;
            int i2 = hdvVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hdvVar.l = i2 - Integer.MIN_VALUE;
                Object obj = hdvVar.j;
                nm6 nm6Var = nm6.a;
                i = hdvVar.l;
                int i3 = 1;
                if (i != 0) {
                    qgg.h0(obj);
                    dq7 dq7Var = ca8.a;
                    bsd bsdVar = j5h.a;
                    eq5 eq5Var = new eq5(this, webView, null, i3);
                    hdvVar.l = 1;
                    if (x97.V(bsdVar, eq5Var, hdvVar) == nm6Var) {
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
        hdvVar = new hdv(this, cg6Var);
        Object obj2 = hdvVar.j;
        nm6 nm6Var2 = nm6.a;
        i = hdvVar.l;
        int i32 = 1;
        if (i != 0) {
        }
        rj7.f();
    }
}
