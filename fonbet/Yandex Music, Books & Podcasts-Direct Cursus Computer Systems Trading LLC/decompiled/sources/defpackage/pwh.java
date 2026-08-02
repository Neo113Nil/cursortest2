package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class pwh implements ca7 {
    public static final String[] d = {"_data"};
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public /* synthetic */ pwh(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ca7
    public final Class a() {
        switch (this.a) {
            case 0:
                return File.class;
            case 1:
                return ((cm3) this.c).a();
            default:
                return InputStream.class;
        }
    }

    @Override // defpackage.ca7
    public final void b() {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                try {
                    ((ByteArrayInputStream) this.c).close();
                    break;
                } catch (IOException unused) {
                    return;
                }
        }
    }

    @Override // defpackage.ca7
    public final void cancel() {
        int i = this.a;
    }

    @Override // defpackage.ca7
    public final void d(nsm nsmVar, ba7 ba7Var) {
        switch (this.a) {
            case 0:
                Cursor query = ((Context) this.b).getContentResolver().query((Uri) this.c, d, null, null, null);
                if (query != null) {
                    try {
                        r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                        query.close();
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                if (!TextUtils.isEmpty(r0)) {
                    ba7Var.g(new File(r0));
                    return;
                }
                ba7Var.c(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.c)));
                return;
            case 1:
                ba7Var.g(((cm3) this.c).l((byte[]) this.b));
                return;
            default:
                try {
                    ByteArrayInputStream b = d51.b((String) this.b);
                    this.c = b;
                    ba7Var.g(b);
                    return;
                } catch (IllegalArgumentException e) {
                    ba7Var.c(e);
                    return;
                }
        }
    }

    @Override // defpackage.ca7
    public final int e() {
        switch (this.a) {
        }
        return 1;
    }

    public pwh(String str, d51 d51Var) {
        this.a = 2;
        this.b = str;
    }

    private final void c() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    private final void i() {
    }
}
