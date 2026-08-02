package androidx.sqlite.db;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import java.io.Closeable;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.internal.connection.Exchange;

/* loaded from: classes.dex */
public interface SupportSQLiteOpenHelper extends Closeable {

    public abstract class Callback {
        public final int version;

        public Callback(int i) {
            this.version = i;
        }

        public static void deleteDatabaseFile(String str) {
            if (StringsKt__StringsJVMKt.equals(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
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

        public void onConfigure(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        }

        public abstract void onCreate(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        public void onDowngrade(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i, int i2) {
            throw new SQLiteException(Recorder$$ExternalSyntheticOutline2.m("Can't downgrade database from version ", i, i2, " to "));
        }

        public void onOpen(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        }

        public abstract void onUpgrade(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i, int i2);
    }

    public interface Factory {
        SupportSQLiteOpenHelper create(Exchange exchange);
    }

    String getDatabaseName();

    SupportSQLiteDatabase getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}
