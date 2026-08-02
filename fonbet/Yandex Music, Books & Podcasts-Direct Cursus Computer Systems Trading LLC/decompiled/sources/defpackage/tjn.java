package defpackage;

import android.database.Cursor;
import java.io.Closeable;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class tjn implements Closeable {
    public final Function0 a;
    public final szm b;
    public Cursor c;

    public tjn(Function0 function0, szm szmVar) {
        this.a = function0;
        this.b = szmVar;
    }

    public final Cursor a() {
        if (this.c != null) {
            wvs.p("Cursor should be called only once");
            return null;
        }
        Cursor cursor = (Cursor) this.b.get();
        this.c = cursor;
        return cursor;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Cursor cursor = this.c;
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
        this.a.invoke();
    }
}
