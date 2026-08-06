package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class ez0 extends java.util.concurrent.CancellationException {
    public final /* synthetic */ int WDYagTQQm9ns;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ez0(java.lang.String str, int i) {
        super(str);
        this.WDYagTQQm9ns = i;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        switch (this.WDYagTQQm9ns) {
            case 0:
                setStackTrace(defpackage.h0.fNwYGHIYeJcR);
                break;
            case 1:
                setStackTrace(defpackage.ma0.EgL5gQQnyJKX);
                break;
            default:
                setStackTrace(defpackage.nn.GE9mJIPrb8gP);
                break;
        }
        return this;
    }
}
