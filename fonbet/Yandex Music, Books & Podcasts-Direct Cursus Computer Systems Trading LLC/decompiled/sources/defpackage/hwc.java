package defpackage;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;

/* loaded from: classes.dex */
public class hwc implements wsr {
    public final /* synthetic */ int a = 1;
    public final Closeable b;

    public hwc(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.b = sQLiteProgram;
    }

    @Override // defpackage.wsr
    public final void bindBlob(int i, byte[] bArr) {
        switch (this.a) {
            case 0:
                bArr.getClass();
                ((SQLiteProgram) this.b).bindBlob(i, bArr);
                break;
            default:
                ((afo) this.b).bindBlob(i, bArr);
                break;
        }
    }

    @Override // defpackage.wsr
    public final void bindDouble(int i, double d) {
        switch (this.a) {
            case 0:
                ((SQLiteProgram) this.b).bindDouble(i, d);
                break;
            default:
                ((afo) this.b).bindDouble(i, d);
                break;
        }
    }

    @Override // defpackage.wsr
    public final void bindLong(int i, long j) {
        switch (this.a) {
            case 0:
                ((SQLiteProgram) this.b).bindLong(i, j);
                break;
            default:
                ((afo) this.b).bindLong(i, j);
                break;
        }
    }

    @Override // defpackage.wsr
    public final void bindNull(int i) {
        switch (this.a) {
            case 0:
                ((SQLiteProgram) this.b).bindNull(i);
                break;
            default:
                ((afo) this.b).bindNull(i);
                break;
        }
    }

    @Override // defpackage.wsr
    public final void bindString(int i, String str) {
        switch (this.a) {
            case 0:
                str.getClass();
                ((SQLiteProgram) this.b).bindString(i, str);
                break;
            default:
                ((afo) this.b).bindString(i, str);
                break;
        }
    }

    @Override // defpackage.wsr
    public void clearBindings() {
        ((SQLiteProgram) this.b).clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                ((SQLiteProgram) this.b).close();
                break;
        }
    }

    public hwc(afo afoVar) {
        this.b = afoVar;
    }

    private final void a() {
    }
}
