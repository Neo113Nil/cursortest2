package defpackage;

/* loaded from: classes3.dex */
public final class j4h implements v7o {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ dsd c;

    public j4h(dsd dsdVar, String str, long j) {
        this.c = dsdVar;
        this.a = str;
        this.b = j;
    }

    @Override // defpackage.v7o
    public final void onError(veb vebVar) {
        ((m4h) this.c.b).i.remove(this.a);
    }

    @Override // defpackage.v7o
    public final void onSuccess(Object obj) {
        String str = this.a;
        long j = this.b;
        dsd dsdVar = this.c;
        dsdVar.b(j, str);
        ((m4h) dsdVar.b).a((vjp) obj);
    }
}
