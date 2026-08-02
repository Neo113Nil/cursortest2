package defpackage;

/* loaded from: classes6.dex */
public final class gcl implements wa6, arr {
    public volatile int a;

    @Override // defpackage.wa6
    public final void accept(Object obj) {
        this.a = ((Number) obj).intValue();
    }

    @Override // defpackage.arr
    public final Object get() {
        return Integer.valueOf(this.a);
    }
}
