package io.requery.android.database.sqlite;

import defpackage.dfi;
import defpackage.f1d;
import defpackage.hu3;
import defpackage.k5r;
import defpackage.wsr;
import defpackage.xq0;
import java.util.Arrays;

/* loaded from: classes5.dex */
public abstract class SQLiteProgram extends SQLiteClosable implements wsr {
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    private final Object[] mBindArgs;
    private final String[] mColumnNames;
    private final SQLiteDatabase mDatabase;
    private final int mNumParameters;
    private final boolean mReadOnly;
    private final String mSql;

    public SQLiteProgram(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, hu3 hu3Var) {
        this.mDatabase = sQLiteDatabase;
        String trim = str.trim();
        this.mSql = trim;
        int sqlStatementType = SQLiteStatementType.getSqlStatementType(trim);
        if (sqlStatementType == 4 || sqlStatementType == 5 || sqlStatementType == 6) {
            this.mReadOnly = false;
            this.mColumnNames = EMPTY_STRING_ARRAY;
            this.mNumParameters = 0;
        } else {
            boolean z = sqlStatementType == 1;
            SQLiteStatementInfo sQLiteStatementInfo = new SQLiteStatementInfo();
            sQLiteDatabase.getThreadSession().prepare(trim, sQLiteDatabase.getThreadDefaultConnectionFlags(z), hu3Var, sQLiteStatementInfo);
            this.mReadOnly = sQLiteStatementInfo.readOnly;
            this.mColumnNames = sQLiteStatementInfo.columnNames;
            this.mNumParameters = sQLiteStatementInfo.numParameters;
        }
        if (objArr != null && objArr.length > this.mNumParameters) {
            StringBuilder sb = new StringBuilder("Too many bind arguments.  ");
            sb.append(objArr.length);
            sb.append(" arguments were provided but the statement needs ");
            xq0.x(f1d.i(sb, this.mNumParameters, " arguments."));
            throw null;
        }
        int i = this.mNumParameters;
        if (i == 0) {
            this.mBindArgs = null;
            return;
        }
        Object[] objArr2 = new Object[i];
        this.mBindArgs = objArr2;
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
    }

    private void bind(int i, Object obj) {
        if (i < 1 || i > this.mNumParameters) {
            xq0.x(f1d.i(k5r.q(i, "Cannot bind argument at index ", " because the index is out of range.  The statement has "), this.mNumParameters, " parameters."));
        } else {
            this.mBindArgs[i - 1] = obj;
        }
    }

    public void bindAllArgsAsStrings(String[] strArr) {
        if (strArr != null) {
            for (int length = strArr.length; length != 0; length--) {
                bindString(length, strArr[length - 1]);
            }
        }
    }

    @Override // defpackage.wsr
    public void bindBlob(int i, byte[] bArr) {
        if (bArr != null) {
            bind(i, bArr);
        } else {
            xq0.x(dfi.c(i, "the bind value at index ", " is null"));
        }
    }

    @Override // defpackage.wsr
    public void bindDouble(int i, double d) {
        bind(i, Double.valueOf(d));
    }

    @Override // defpackage.wsr
    public void bindLong(int i, long j) {
        bind(i, Long.valueOf(j));
    }

    @Override // defpackage.wsr
    public void bindNull(int i) {
        bind(i, null);
    }

    public void bindObject(int i, Object obj) {
        if (obj == null) {
            bindNull(i);
            return;
        }
        if ((obj instanceof Double) || (obj instanceof Float)) {
            bindDouble(i, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Number) {
            bindLong(i, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                bindLong(i, 1L);
                return;
            } else {
                bindLong(i, 0L);
                return;
            }
        }
        if (obj instanceof byte[]) {
            bindBlob(i, (byte[]) obj);
        } else {
            bindString(i, obj.toString());
        }
    }

    @Override // defpackage.wsr
    public void bindString(int i, String str) {
        if (str != null) {
            bind(i, str);
        } else {
            xq0.x(dfi.c(i, "the bind value at index ", " is null"));
        }
    }

    @Override // defpackage.wsr
    public void clearBindings() {
        Object[] objArr = this.mBindArgs;
        if (objArr != null) {
            Arrays.fill(objArr, (Object) null);
        }
    }

    public final Object[] getBindArgs() {
        return this.mBindArgs;
    }

    public final String[] getColumnNames() {
        return this.mColumnNames;
    }

    public final int getConnectionFlags() {
        return this.mDatabase.getThreadDefaultConnectionFlags(this.mReadOnly);
    }

    public final SQLiteDatabase getDatabase() {
        return this.mDatabase;
    }

    public final SQLiteSession getSession() {
        return this.mDatabase.getThreadSession();
    }

    public final String getSql() {
        return this.mSql;
    }

    @Override // io.requery.android.database.sqlite.SQLiteClosable
    public void onAllReferencesReleased() {
        clearBindings();
    }

    public final void onCorruption() {
        this.mDatabase.onCorruption();
    }
}
