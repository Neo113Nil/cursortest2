package defpackage;

import com.monetization.ads.base.webview.HtmlWebViewClient;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import yads.fj3;
import yads.fv1;
import yads.t92;
import yads.xu1;

/* loaded from: classes7.dex */
public final class tj61 {
    public final t92 a;
    public final i971 b;
    public final gg81 c;
    public String d;
    public boolean e;
    public final fp71 f;
    public final String g;
    public lm71 h;
    public mj61 i;
    public s291 j;
    public bl81 k;
    public dv81 l;
    public fj3 m;
    public gj81 n;

    public tj61(t92 t92Var, i971 i971Var, mm81 mm81Var, gg81 gg81Var) {
        this.a = t92Var;
        this.b = i971Var;
        this.c = gg81Var;
        HtmlWebViewClient htmlWebViewClient = new HtmlWebViewClient(new i971(22, this), null, 2, null);
        htmlWebViewClient.setWebResourceRequestInterceptor(new hj61("mraid.js", new gp51(6, this)));
        this.m = fj3.d;
        t92Var.setWebViewClient(htmlWebViewClient);
        this.f = new fp71(t92Var, mm81Var, this);
        int i = cs71.b;
        String obj = toString();
        this.g = obj == null ? "" : obj;
    }

    public final void a(Map map) {
        dg61 dg61Var;
        if (this.h != null) {
            gg81 gg81Var = this.c;
            if (gg81Var == null || !gg81Var.E0 || this.e) {
                String str = (String) map.get("url");
                if (str == null || str.length() <= 0) {
                    throw new xu1(String.format("Mraid open command sent an invalid URL: %s", Arrays.copyOf(new Object[]{str}, 1)));
                }
                lm71 lm71Var = this.h;
                if (lm71Var == null || (dg61Var = (dg61) ((WeakReference) lm71Var.b).get()) == null) {
                    return;
                }
                dg61Var.a(str);
            }
        }
    }

    public final void b(fv1 fv1Var, LinkedHashMap linkedHashMap) {
        if (this.h == null) {
            throw new xu1("Invalid state to execute this command");
        }
        switch (fv1Var.ordinal()) {
            case 0:
                dv81 dv81Var = this.l;
                if (dv81Var != null) {
                    dv81Var.a.post(new hos0(15, dv81Var));
                    return;
                }
                return;
            case 1:
                s291 s291Var = this.j;
                if (s291Var != null) {
                    s291Var.e();
                    return;
                }
                return;
            case 2:
                s291 s291Var2 = this.j;
                if (s291Var2 != null) {
                    s291Var2.b();
                    return;
                }
                return;
            case 3:
                if (fj3.c == this.m) {
                    fj3 fj3Var = fj3.e;
                    this.m = fj3Var;
                    this.b.B(fj3Var);
                    bl81 bl81Var = this.k;
                    if (bl81Var != null) {
                        bl81Var.c();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                a(linkedHashMap);
                return;
            case 5:
                mj61 mj61Var = this.i;
                if (mj61Var != null) {
                    mj61Var.a();
                    return;
                }
                return;
            case 6:
                boolean parseBoolean = Boolean.parseBoolean((String) linkedHashMap.get("shouldUseCustomClose"));
                bl81 bl81Var2 = this.k;
                if (bl81Var2 != null) {
                    bl81Var2.a(parseBoolean);
                    return;
                }
                return;
            case 7:
            default:
                throw new xu1("Unspecified MRAID Javascript command");
            case 8:
                gg81 gg81Var = this.c;
                if (gg81Var == null || !gg81Var.C0) {
                    return;
                }
                this.a.onPageFinished();
                return;
        }
    }
}
