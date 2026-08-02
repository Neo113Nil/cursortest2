package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.NetcastTVService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public class kc7 extends SQLiteOpenHelper {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc7(Context context) {
        super(context.getApplicationContext(), "exoplayer_internal.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.a = 2;
    }

    public synchronized void D(Set set) {
        set.getClass();
        synchronized (ogp.c) {
            try {
                if (!set.isEmpty()) {
                    SQLiteDatabase writableDatabase = getWritableDatabase();
                    try {
                        writableDatabase.beginTransaction();
                        String X = CollectionsKt.X(set, null, "`id` IN(", ")", e27.z, 25);
                        Set set2 = set;
                        ArrayList arrayList = new ArrayList(v75.o(set2, 10));
                        Iterator it = set2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
                        }
                        writableDatabase.delete("OttTracking", X, (String[]) arrayList.toArray(new String[0]));
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        writableDatabase.close();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        writableDatabase.close();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public LinkedHashMap a() {
        LinkedHashMap linkedHashMap;
        synchronized (ogp.c) {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            try {
                Cursor query = readableDatabase.query("OttTracking", ogp.d, null, null, null, null, null, String.valueOf(50));
                try {
                    Cursor cursor = query;
                    linkedHashMap = new LinkedHashMap();
                    int columnIndex = cursor.getColumnIndex(ConnectableDevice.KEY_ID);
                    int columnIndex2 = cursor.getColumnIndex(NetcastTVService.UDAP_API_EVENT);
                    while (cursor.moveToNext()) {
                        Integer valueOf = Integer.valueOf(cursor.getInt(columnIndex));
                        String string = cursor.getString(columnIndex2);
                        string.getClass();
                        linkedHashMap.put(valueOf, string);
                    }
                    yd5.q(query, null);
                    readableDatabase.close();
                } finally {
                }
            } finally {
            }
        }
        return linkedHashMap;
    }

    public synchronized void b(String str) {
        str.getClass();
        synchronized (ogp.c) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                writableDatabase.execSQL("INSERT INTO `OttTracking`(`event`) VALUES (?)", new String[]{str});
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
                writableDatabase.close();
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.a) {
            case 0:
                sQLiteDatabase.getClass();
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `OttTracking` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `event` TEXT NOT NULL)");
                break;
            case 1:
                sQLiteDatabase.getClass();
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        switch (this.a) {
            case 2:
                Cursor query = sQLiteDatabase.query("sqlite_master", new String[]{"type", "name"}, null, null, null, null, null);
                while (query.moveToNext()) {
                    try {
                        String string = query.getString(0);
                        String string2 = query.getString(1);
                        if (!"sqlite_sequence".equals(string2)) {
                            String str = "DROP " + string + " IF EXISTS " + string2;
                            try {
                                sQLiteDatabase.execSQL(str);
                            } catch (SQLException e) {
                                vq1.L("SADatabaseProvider", "Error executing " + str, e);
                            }
                        }
                    } finally {
                    }
                }
                query.close();
                return;
            default:
                super.onDowngrade(sQLiteDatabase, i, i2);
                return;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        switch (this.a) {
            case 1:
                sQLiteDatabase.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Pair(2, new oxo(22, sQLiteDatabase)));
                if (arrayList.size() > 1) {
                    y75.s(arrayList, new ehf(12));
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    int i3 = i + 1;
                    int intValue = ((Number) pair.a).intValue();
                    if (i3 <= intValue && intValue <= i2) {
                        ((Function0) pair.b).invoke();
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kc7(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, int i2) {
        super(context, str, cursorFactory, i);
        this.a = i2;
    }

    private final void g(SQLiteDatabase sQLiteDatabase) {
    }

    private final void o(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void z(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
