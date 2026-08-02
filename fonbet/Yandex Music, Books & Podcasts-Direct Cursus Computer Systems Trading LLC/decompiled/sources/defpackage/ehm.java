package defpackage;

/* loaded from: classes.dex */
public final class ehm extends dhm {
    public final Object c;

    public ehm(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // defpackage.dhm, defpackage.chm
    public final boolean c(Object obj) {
        boolean c;
        obj.getClass();
        synchronized (this.c) {
            c = super.c(obj);
        }
        return c;
    }

    @Override // defpackage.dhm, defpackage.chm
    public final Object f() {
        Object f;
        synchronized (this.c) {
            f = super.f();
        }
        return f;
    }
}
