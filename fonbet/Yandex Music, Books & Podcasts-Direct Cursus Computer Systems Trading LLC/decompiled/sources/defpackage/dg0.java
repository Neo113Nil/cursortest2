package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class dg0 implements Closeable {
    public final SQLiteDatabase a;
    public final /* synthetic */ nsh b;

    public dg0(nsh nshVar, SQLiteDatabase sQLiteDatabase) {
        this.b = nshVar;
        this.a = sQLiteDatabase;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        eg0 eg0Var = (eg0) this.b.b;
        SQLiteDatabase sQLiteDatabase = this.a;
        synchronized (eg0Var) {
            try {
                if (Intrinsics.d(sQLiteDatabase, (SQLiteDatabase) eg0Var.g)) {
                    ((LinkedHashSet) eg0Var.e).remove(Thread.currentThread());
                    if (((LinkedHashSet) eg0Var.e).isEmpty()) {
                        while (true) {
                            int i = eg0Var.b;
                            eg0Var.b = i - 1;
                            if (i <= 0) {
                                break;
                            }
                            SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) eg0Var.g;
                            sQLiteDatabase2.getClass();
                            sQLiteDatabase2.close();
                        }
                    }
                } else if (Intrinsics.d(sQLiteDatabase, (SQLiteDatabase) eg0Var.f)) {
                    ((LinkedHashSet) eg0Var.d).remove(Thread.currentThread());
                    if (((LinkedHashSet) eg0Var.d).isEmpty()) {
                        while (true) {
                            int i2 = eg0Var.a;
                            eg0Var.a = i2 - 1;
                            if (i2 <= 0) {
                                break;
                            }
                            SQLiteDatabase sQLiteDatabase3 = (SQLiteDatabase) eg0Var.f;
                            sQLiteDatabase3.getClass();
                            sQLiteDatabase3.close();
                        }
                    }
                } else {
                    sQLiteDatabase.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
