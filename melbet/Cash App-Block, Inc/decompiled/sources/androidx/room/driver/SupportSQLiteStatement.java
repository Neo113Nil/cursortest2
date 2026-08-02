package androidx.room.driver;

import android.database.Cursor;
import androidx.room.Room;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteDatabase;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.MemoryCacheService;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class SupportSQLiteStatement implements SQLiteStatement {
    public final SupportSQLiteDatabase db;
    public boolean isClosed;
    public final String sql;

    public final class SupportAndroidSQLiteStatement extends SupportSQLiteStatement {
        public int[] bindingTypes;
        public byte[][] blobBindings;
        public Cursor cursor;
        public double[] doubleBindings;
        public long[] longBindings;
        public String[] stringBindings;

        public static void throwIfInvalidColumn(Cursor cursor, int i) {
            if (i < 0 || i >= cursor.getColumnCount()) {
                Room.throwSQLiteException(25, "column index out of range");
                throw null;
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final void bindBlob(int i, byte[] bArr) {
            throwIfClosed();
            ensureCapacity(4, i);
            this.bindingTypes[i] = 4;
            this.blobBindings[i] = bArr;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final void bindLong(int i, long j) {
            throwIfClosed();
            ensureCapacity(1, i);
            this.bindingTypes[i] = 1;
            this.longBindings[i] = j;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final void bindNull(int i) {
            throwIfClosed();
            ensureCapacity(5, i);
            this.bindingTypes[i] = 5;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final void bindText(int i, String str) {
            str.getClass();
            throwIfClosed();
            ensureCapacity(3, i);
            this.bindingTypes[i] = 3;
            this.stringBindings[i] = str;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            if (!this.isClosed) {
                throwIfClosed();
                this.bindingTypes = new int[0];
                this.longBindings = new long[0];
                this.doubleBindings = new double[0];
                this.stringBindings = new String[0];
                this.blobBindings = new byte[0][];
                reset();
            }
            this.isClosed = true;
        }

        public final void ensureCapacity(int i, int i2) {
            int i3 = i2 + 1;
            int[] iArr = this.bindingTypes;
            if (iArr.length < i3) {
                this.bindingTypes = Arrays.copyOf(iArr, i3);
            }
            if (i == 1) {
                long[] jArr = this.longBindings;
                if (jArr.length < i3) {
                    this.longBindings = Arrays.copyOf(jArr, i3);
                    return;
                }
                return;
            }
            if (i == 2) {
                double[] dArr = this.doubleBindings;
                if (dArr.length < i3) {
                    this.doubleBindings = Arrays.copyOf(dArr, i3);
                    return;
                }
                return;
            }
            if (i == 3) {
                String[] strArr = this.stringBindings;
                if (strArr.length < i3) {
                    this.stringBindings = (String[]) Arrays.copyOf(strArr, i3);
                    return;
                }
                return;
            }
            if (i != 4) {
                return;
            }
            byte[][] bArr = this.blobBindings;
            if (bArr.length < i3) {
                this.blobBindings = (byte[][]) Arrays.copyOf(bArr, i3);
            }
        }

        public final void ensureCursor() {
            if (this.cursor == null) {
                this.cursor = this.db.query(new MemoryCacheService(this, 19));
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final byte[] getBlob(int i) {
            throwIfClosed();
            Cursor throwIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(throwIfNoRow, i);
            byte[] blob = throwIfNoRow.getBlob(i);
            blob.getClass();
            return blob;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final int getColumnCount() {
            throwIfClosed();
            ensureCursor();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final String getColumnName(int i) {
            throwIfClosed();
            ensureCursor();
            Cursor cursor = this.cursor;
            if (cursor == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return null;
            }
            throwIfInvalidColumn(cursor, i);
            String columnName = cursor.getColumnName(i);
            columnName.getClass();
            return columnName;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final long getLong(int i) {
            throwIfClosed();
            Cursor throwIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(throwIfNoRow, i);
            return throwIfNoRow.getLong(i);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final String getText(int i) {
            throwIfClosed();
            Cursor throwIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(throwIfNoRow, i);
            String string2 = throwIfNoRow.getString(i);
            string2.getClass();
            return string2;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final boolean isNull(int i) {
            throwIfClosed();
            Cursor throwIfNoRow = throwIfNoRow();
            throwIfInvalidColumn(throwIfNoRow, i);
            return throwIfNoRow.isNull(i);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final void reset() {
            throwIfClosed();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                cursor.close();
            }
            this.cursor = null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final boolean step() {
            throwIfClosed();
            ensureCursor();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
            return false;
        }

        public final Cursor throwIfNoRow() {
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor;
            }
            Room.throwSQLiteException(21, "no row");
            throw null;
        }
    }

    public final class SupportOtherAndroidSQLiteStatement extends SupportSQLiteStatement {
        public final androidx.sqlite.db.SupportSQLiteStatement delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SupportOtherAndroidSQLiteStatement(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
            super(supportSQLiteDatabase, str);
            supportSQLiteDatabase.getClass();
            str.getClass();
            this.delegate = supportSQLiteDatabase.compileStatement(str);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final void bindBlob(int i, byte[] bArr) {
            throwIfClosed();
            this.delegate.bindBlob(i, bArr);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final void bindLong(int i, long j) {
            throwIfClosed();
            this.delegate.bindLong(i, j);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final void bindNull(int i) {
            throwIfClosed();
            this.delegate.bindNull(i);
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final void bindText(int i, String str) {
            str.getClass();
            throwIfClosed();
            this.delegate.bindString(i, str);
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            this.delegate.close();
            this.isClosed = true;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final byte[] getBlob(int i) {
            throwIfClosed();
            Room.throwSQLiteException(21, "no row");
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final int getColumnCount() {
            throwIfClosed();
            return 0;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final String getColumnName(int i) {
            throwIfClosed();
            Room.throwSQLiteException(21, "no row");
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final long getLong(int i) {
            throwIfClosed();
            Room.throwSQLiteException(21, "no row");
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final String getText(int i) {
            throwIfClosed();
            Room.throwSQLiteException(21, "no row");
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final boolean isNull(int i) {
            throwIfClosed();
            Room.throwSQLiteException(21, "no row");
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final void reset() {
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final boolean step() {
            throwIfClosed();
            this.delegate.execute();
            return false;
        }
    }

    public SupportSQLiteStatement(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        this.db = supportSQLiteDatabase;
        this.sql = str;
    }

    public final void throwIfClosed() {
        if (this.isClosed) {
            Room.throwSQLiteException(21, "statement is closed");
            throw null;
        }
    }
}
