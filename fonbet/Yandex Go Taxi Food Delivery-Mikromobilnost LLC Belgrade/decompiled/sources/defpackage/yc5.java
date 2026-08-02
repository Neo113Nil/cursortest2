package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class yc5 extends d7 implements mse {
    public final /* synthetic */ int a;
    public final /* synthetic */ StackTraceElement[] b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yc5(StackTraceElement[] stackTraceElementArr, int i) {
        super(r0);
        this.a = i;
        lse lseVar = lse.a;
        this.b = stackTraceElementArr;
        switch (i) {
            case 1:
                super(lseVar);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.mse
    public final void handleException(fse fseVar, Throwable th) {
        int i = this.a;
        x4c x4cVar = pse.b;
        StackTraceElement[] stackTraceElementArr = this.b;
        switch (i) {
            case 0:
                IllegalStateException illegalStateException = new IllegalStateException("No exception handlers defined");
                illegalStateException.setStackTrace(stackTraceElementArr);
                illegalStateException.initCause(th);
                String p = g8e.p(th.getClass().getSimpleName(), Extension.COLON_SPACE, th.getMessage());
                xby.t(jst.e, "UncaughtException", illegalStateException, "Unexpected exception " + p + " in " + fseVar.get(x4cVar), 2);
                break;
            default:
                IllegalStateException illegalStateException2 = new IllegalStateException("No exception handlers defined");
                illegalStateException2.setStackTrace(stackTraceElementArr);
                illegalStateException2.initCause(th);
                String p2 = g8e.p(th.getClass().getSimpleName(), Extension.COLON_SPACE, th.getMessage());
                xby.t(xby.d, "UncaughtException", illegalStateException2, "Unexpected exception " + p2 + " in " + fseVar.get(x4cVar), 2);
                break;
        }
    }
}
