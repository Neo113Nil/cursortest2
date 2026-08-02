package defpackage;

import yads.t92;

/* loaded from: classes7.dex */
public final /* synthetic */ class sj61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tj61 b;
    public final /* synthetic */ String c;

    public /* synthetic */ sj61(tj61 tj61Var, String str, int i) {
        this.a = i;
        this.b = tj61Var;
        this.c = str;
    }

    public final void a(String str) {
        int i = this.a;
        String str2 = this.c;
        tj61 tj61Var = this.b;
        switch (i) {
            case 0:
                tj61Var.d = str;
                ((t92) tj61Var.b.b).loadUrl(str2);
                break;
            default:
                tj61Var.d = str;
                t92 t92Var = (t92) tj61Var.b.b;
                t92Var.loadDataWithBaseURL("https://yandex.ru", t92Var.a(str2), "text/html", "UTF-8", null);
                break;
        }
    }
}
