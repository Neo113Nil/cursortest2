package defpackage;

/* loaded from: classes.dex */
public abstract class hv0 extends java.util.concurrent.CancellationException {
    public final /* synthetic */ int adDC3e2L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hv0(java.lang.String str, int i) {
        super(str);
        this.adDC3e2L = i;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        switch (this.adDC3e2L) {
            case 0:
                setStackTrace(defpackage.fm.G3OKOH3wZRC);
                break;
            case 1:
                setStackTrace(defpackage.w70.wll2JLbTBC2);
                break;
            default:
                setStackTrace(defpackage.h1.kNAkVymC);
                break;
        }
        return this;
    }
}
