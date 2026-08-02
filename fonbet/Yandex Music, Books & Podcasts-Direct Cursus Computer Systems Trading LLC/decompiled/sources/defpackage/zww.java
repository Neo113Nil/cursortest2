package defpackage;

/* loaded from: classes.dex */
public final class zww implements qj2 {
    public final /* synthetic */ umd a;

    public zww(umd umdVar) {
        this.a = umdVar;
    }

    @Override // defpackage.qj2
    public final void a(boolean z) {
        fsn fsnVar = this.a.n;
        fsnVar.sendMessage(fsnVar.obtainMessage(1, Boolean.valueOf(z)));
    }
}
