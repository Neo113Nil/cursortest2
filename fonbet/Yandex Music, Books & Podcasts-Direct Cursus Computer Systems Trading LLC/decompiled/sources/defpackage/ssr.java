package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* loaded from: classes.dex */
public abstract class ssr {
    public final int a;

    public ssr(int i) {
        this.a = i;
    }

    public static void a(String str) {
        if (c.o(str, ":memory:", true)) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.e(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public void b(rsr rsrVar) {
        rsrVar.getClass();
    }

    public void c(rsr rsrVar) {
        rsrVar.getClass();
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + rsrVar + ".path");
        if (!rsrVar.isOpen()) {
            String path = rsrVar.getPath();
            if (path != null) {
                a(path);
                return;
            }
            return;
        }
        List list = null;
        try {
            try {
                list = rsrVar.getAttachedDbs();
            } finally {
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        obj.getClass();
                        a((String) obj);
                    }
                } else {
                    String path2 = rsrVar.getPath();
                    if (path2 != null) {
                        a(path2);
                    }
                }
            }
        } catch (SQLiteException unused) {
        }
        try {
            rsrVar.close();
        } catch (IOException unused2) {
        }
        if (list != null) {
            return;
        }
    }

    public abstract void d(rsr rsrVar);

    public abstract void e(rsr rsrVar, int i, int i2);

    public abstract void f(rsr rsrVar);

    public abstract void g(rsr rsrVar, int i, int i2);
}
