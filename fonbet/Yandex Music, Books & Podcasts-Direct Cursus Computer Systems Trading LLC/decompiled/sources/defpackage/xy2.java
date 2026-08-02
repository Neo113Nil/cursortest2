package defpackage;

/* loaded from: classes.dex */
public final class xy2 extends rt2 {
    public volatile Object c;

    @Override // defpackage.rt2
    public final void a(zjj zjjVar) {
        zjjVar.onNext(this.c);
    }

    @Override // defpackage.rt2
    public final void b(Object obj) {
        this.c = obj;
    }
}
