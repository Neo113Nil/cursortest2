package defpackage;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class udh implements dtr {
    public final /* synthetic */ int a;
    public final /* synthetic */ dtr b;
    public final /* synthetic */ dtr c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ udh(dtr dtrVar, Object obj, Object obj2, int i) {
        this.a = i;
        this.c = dtrVar;
        this.d = obj;
        this.e = obj2;
        this.b = dtrVar;
    }

    @Override // defpackage.wsr
    public final void bindBlob(int i, byte[] bArr) {
        switch (this.a) {
            case 0:
                bArr.getClass();
                this.b.bindBlob(i, bArr);
                break;
            default:
                bArr.getClass();
                this.b.bindBlob(i, bArr);
                break;
        }
    }

    @Override // defpackage.wsr
    public final void bindDouble(int i, double d) {
        switch (this.a) {
            case 0:
                this.b.bindDouble(i, d);
                break;
            default:
                this.b.bindDouble(i, d);
                break;
        }
    }

    @Override // defpackage.wsr
    public final void bindLong(int i, long j) {
        switch (this.a) {
            case 0:
                this.b.bindLong(i, j);
                break;
            default:
                this.b.bindLong(i, j);
                break;
        }
    }

    @Override // defpackage.wsr
    public final void bindNull(int i) {
        switch (this.a) {
            case 0:
                this.b.bindNull(i);
                break;
            default:
                this.b.bindNull(i);
                break;
        }
    }

    @Override // defpackage.wsr
    public final void bindString(int i, String str) {
        switch (this.a) {
            case 0:
                str.getClass();
                this.b.bindString(i, str);
                break;
            default:
                str.getClass();
                this.b.bindString(i, str);
                break;
        }
    }

    @Override // defpackage.wsr
    public final void clearBindings() {
        switch (this.a) {
            case 0:
                this.b.clearBindings();
                break;
            default:
                this.b.clearBindings();
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                this.b.close();
                break;
            default:
                this.b.close();
                break;
        }
    }

    @Override // defpackage.dtr
    public final void execute() {
        switch (this.a) {
            case 0:
                this.c.execute();
                String str = (String) this.d;
                vdh vdhVar = (vdh) this.e;
                if (str != null) {
                    vdhVar.b.I(str);
                    break;
                }
                break;
            default:
                a7n a7nVar = (a7n) this.d;
                boolean booleanValue = ((Boolean) a7nVar.c.getValue()).booleanValue();
                dtr dtrVar = this.c;
                if (!booleanValue) {
                    dtrVar.execute();
                    break;
                } else {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    dtrVar.execute();
                    a7nVar.a((c7n) this.e, SystemClock.elapsedRealtime() - elapsedRealtime);
                    break;
                }
        }
    }
}
