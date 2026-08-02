package defpackage;

import android.database.Cursor;
import java.io.Closeable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zm9 implements pin, Closeable {
    public final Cursor a;
    public boolean b;
    public final String c;
    public final Object d;

    public zm9(dn9 dn9Var, Cursor cursor) {
        this.a = cursor;
        this.c = cursor.getString(dn9.g(dn9Var, cursor, "raw_json_id"));
        this.d = btf.a(bwf.c, new qs6(24, this, dn9Var));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    @Override // defpackage.pin
    public final JSONObject getData() {
        return (JSONObject) this.d.getValue();
    }

    @Override // defpackage.pin
    public final String getId() {
        return this.c;
    }
}
