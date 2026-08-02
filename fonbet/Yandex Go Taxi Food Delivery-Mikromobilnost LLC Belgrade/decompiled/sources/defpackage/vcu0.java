package defpackage;

import android.content.Context;
import android.database.Cursor;

/* loaded from: classes15.dex */
public final class vcu0 implements e1k {
    public final Context a;
    public final Cursor b;
    public final Cursor c;
    public final qgn0 w = new qgn0(29, this);
    public final ucu0 x = new ucu0(this);

    public vcu0(Cursor cursor, Cursor cursor2, Context context) {
        this.a = context;
        this.b = cursor;
        this.c = cursor2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
        this.c.close();
    }
}
