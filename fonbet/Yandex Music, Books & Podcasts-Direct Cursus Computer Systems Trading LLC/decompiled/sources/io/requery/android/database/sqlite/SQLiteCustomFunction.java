package io.requery.android.database.sqlite;

import defpackage.xq0;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* loaded from: classes5.dex */
public final class SQLiteCustomFunction {
    public final SQLiteDatabase.CustomFunction callback;
    public final String name;
    public final int numArgs;

    public SQLiteCustomFunction(String str, int i, SQLiteDatabase.CustomFunction customFunction) {
        if (str == null) {
            xq0.x("name must not be null.");
            throw null;
        }
        this.name = str;
        this.numArgs = i;
    }

    private String dispatchCallback(String[] strArr) {
        throw null;
    }
}
