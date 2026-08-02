package defpackage;

import kotlin.Pair;

/* loaded from: classes3.dex */
public final /* synthetic */ class snt implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Throwable b;

    public /* synthetic */ snt(int i, Throwable th) {
        this.a = i;
        this.b = th;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new Pair(this.b, "Document request error");
            default:
                return new Pair(this.b, "Document parse error");
        }
    }
}
