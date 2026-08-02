package defpackage;

import android.os.Build;

/* loaded from: classes3.dex */
public final class crg implements vsr {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ vsr b;
    public final /* synthetic */ Object c;

    public crg(vsr vsrVar) {
        this.c = vsrVar;
        this.b = vsrVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                wc5 wc5Var = (wc5) this.c;
                try {
                    this.b.close();
                    return;
                } catch (Throwable th) {
                    wc5.b(wc5Var, th);
                    throw th;
                }
            default:
                this.b.close();
                return;
        }
    }

    @Override // defpackage.vsr
    public final String getDatabaseName() {
        switch (this.a) {
            case 0:
                wc5 wc5Var = (wc5) this.c;
                try {
                    return this.b.getDatabaseName();
                } catch (Throwable th) {
                    wc5.b(wc5Var, th);
                    throw th;
                }
            default:
                return this.b.getDatabaseName();
        }
    }

    @Override // defpackage.vsr
    public final rsr getReadableDatabase() {
        switch (this.a) {
            case 0:
                wc5 wc5Var = (wc5) this.c;
                try {
                    return this.b.getReadableDatabase();
                } catch (Throwable th) {
                    wc5.b(wc5Var, th);
                    throw th;
                }
            default:
                return new rfc(((vsr) this.c).getReadableDatabase(), 1);
        }
    }

    @Override // defpackage.vsr
    public final rsr getWritableDatabase() {
        switch (this.a) {
            case 0:
                wc5 wc5Var = (wc5) this.c;
                try {
                    return this.b.getWritableDatabase();
                } catch (Throwable th) {
                    wc5.b(wc5Var, th);
                    throw th;
                }
            default:
                try {
                    return new rfc(((vsr) this.c).getWritableDatabase(), 1);
                } catch (UnsatisfiedLinkError e) {
                    String[] strArr = Build.SUPPORTED_ABIS;
                    strArr.getClass();
                    if (strArr.length == 0) {
                        String str = Build.CPU_ABI2;
                        str.getClass();
                        strArr = str.length() > 0 ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
                    }
                    ssg.a(7, "UnsatisfiedLinkError", "ABIs = ".concat(xz0.J(strArr, null, null, 63)), e);
                    throw e;
                }
        }
    }

    @Override // defpackage.vsr
    public final void setWriteAheadLoggingEnabled(boolean z) {
        switch (this.a) {
            case 0:
                wc5 wc5Var = (wc5) this.c;
                try {
                    this.b.setWriteAheadLoggingEnabled(z);
                    return;
                } catch (Throwable th) {
                    wc5.b(wc5Var, th);
                    throw th;
                }
            default:
                this.b.setWriteAheadLoggingEnabled(z);
                return;
        }
    }

    public crg(wc5 wc5Var, vsr vsrVar) {
        this.c = wc5Var;
        this.b = vsrVar;
    }
}
