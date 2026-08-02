package defpackage;

import okhttp3.OkHttpClient;

/* loaded from: classes12.dex */
public final /* synthetic */ class ynt implements xf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ynt(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xf7
    public final yf7 newCall(d5j0 d5j0Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((OkHttpClient) ((i3y) obj).getValue()).newCall(d5j0Var);
            case 1:
                return ((k3y) obj).a().clone();
            default:
                return ((OkHttpClient) ((h3y) obj).get()).newCall(d5j0Var);
        }
    }
}
