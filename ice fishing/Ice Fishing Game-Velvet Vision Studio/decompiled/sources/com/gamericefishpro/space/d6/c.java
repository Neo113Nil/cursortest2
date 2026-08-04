package com.gamericefishpro.space.d6;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public final int a;

    public static void a(String str) {
        if (kotlin.text.d.g(str, ":memory:", true)) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.d(str.charAt(!z ? i : length), 32) <= 0;
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

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public void f(com.gamericefishpro.space.e6.c db) {
        Intrinsics.checkNotNullParameter(db, "db");
    }

    public abstract void g(com.gamericefishpro.space.e6.c cVar);

    public abstract void h(com.gamericefishpro.space.e6.c cVar, int i, int i2);

    public abstract void i(com.gamericefishpro.space.e6.c cVar);

    public abstract void j(com.gamericefishpro.space.e6.c cVar, int i, int i2);
}
