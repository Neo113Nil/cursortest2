package androidx.room.driver;

import androidx.room.driver.SupportSQLiteStatement;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.Locale;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class SupportSQLiteConnection implements SQLiteConnection {
    public final SupportSQLiteDatabase db;

    public SupportSQLiteConnection(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.getClass();
        this.db = supportSQLiteDatabase;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.db.close();
    }

    @Override // androidx.sqlite.SQLiteConnection
    public final SupportSQLiteStatement prepare(String str) {
        str.getClass();
        SupportSQLiteDatabase supportSQLiteDatabase = this.db;
        supportSQLiteDatabase.getClass();
        String obj = StringsKt.trim(str).toString();
        if (obj.length() >= 3) {
            String upperCase = obj.substring(0, 3).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            int hashCode = upperCase.hashCode();
            if (hashCode == 79487 ? upperCase.equals("PRA") : !(hashCode == 81978 ? !upperCase.equals("SEL") : !(hashCode == 85954 && upperCase.equals("WIT")))) {
                SupportSQLiteStatement.SupportAndroidSQLiteStatement supportAndroidSQLiteStatement = new SupportSQLiteStatement.SupportAndroidSQLiteStatement(supportSQLiteDatabase, str);
                supportAndroidSQLiteStatement.bindingTypes = new int[0];
                supportAndroidSQLiteStatement.longBindings = new long[0];
                supportAndroidSQLiteStatement.doubleBindings = new double[0];
                supportAndroidSQLiteStatement.stringBindings = new String[0];
                supportAndroidSQLiteStatement.blobBindings = new byte[0][];
                return supportAndroidSQLiteStatement;
            }
        }
        return new SupportSQLiteStatement.SupportOtherAndroidSQLiteStatement(supportSQLiteDatabase, str);
    }
}
