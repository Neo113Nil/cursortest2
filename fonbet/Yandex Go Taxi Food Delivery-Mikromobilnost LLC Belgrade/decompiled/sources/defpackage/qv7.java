package defpackage;

/* loaded from: classes9.dex */
public final class qv7 implements rv7 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ qv7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.rv7
    public final void a(Throwable th) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((tls) obj).invoke(th);
                break;
            default:
                ((m1k) obj).dispose();
                break;
        }
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((tls) obj).getClass().getSimpleName() + '@' + wwg.s(this) + ']';
            default:
                return "DisposeOnCancel[" + ((m1k) obj) + ']';
        }
    }
}
