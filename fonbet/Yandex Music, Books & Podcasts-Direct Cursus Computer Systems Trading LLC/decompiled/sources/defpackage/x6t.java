package defpackage;

/* loaded from: classes3.dex */
public abstract class x6t extends viq implements jzc {
    public abstract void n(Object obj);

    @Override // defpackage.jzc
    public final void s(Exception exc, Object obj) {
        if (isCancelled()) {
            return;
        }
        if (exc != null) {
            k(exc, null);
            return;
        }
        try {
            n(obj);
        } catch (Exception e) {
            k(e, null);
        }
    }
}
