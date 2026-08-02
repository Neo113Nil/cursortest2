package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;

/* loaded from: classes3.dex */
public final class a3b implements vsr {
    public final /* synthetic */ vsr a;
    public final /* synthetic */ wc5 b;
    public final /* synthetic */ anx c;

    public a3b(vsr vsrVar, wc5 wc5Var, anx anxVar) {
        this.a = vsrVar;
        this.b = wc5Var;
        this.c = anxVar;
    }

    public final rsr a(int i, boolean z) {
        vsr vsrVar = this.a;
        try {
            return z ? vsrVar.getWritableDatabase() : vsrVar.getReadableDatabase();
        } catch (SQLiteException e) {
            if (i >= 2) {
                throw e;
            }
            if (e instanceof SQLiteDatabaseCorruptException) {
                wc5.c(this.b, (Context) this.c.b, e);
            }
            return a(i + 1, z);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.vsr
    public final String getDatabaseName() {
        return this.a.getDatabaseName();
    }

    @Override // defpackage.vsr
    public final rsr getReadableDatabase() {
        return a(0, false);
    }

    @Override // defpackage.vsr
    public final rsr getWritableDatabase() {
        return a(0, true);
    }

    @Override // defpackage.vsr
    public final void setWriteAheadLoggingEnabled(boolean z) {
        this.a.setWriteAheadLoggingEnabled(z);
    }
}
