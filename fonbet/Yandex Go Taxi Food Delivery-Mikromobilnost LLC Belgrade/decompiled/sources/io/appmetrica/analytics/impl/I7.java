package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import defpackage.x4e;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class I7 {
    public final ReentrantReadWriteLock.ReadLock a;
    public final ReentrantReadWriteLock.WriteLock b;
    public final V7 c;
    public final Context d;
    public final S5 e;
    public final AtomicLong f;
    public final ArrayList g;
    public final F7 h;
    public final C0241c8 i;
    public final O3 j;

    public I7(S5 s5, V7 v7, F7 f7, C0241c8 c0241c8) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock.readLock();
        this.b = reentrantReadWriteLock.writeLock();
        AtomicLong atomicLong = new AtomicLong();
        this.f = atomicLong;
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        this.c = v7;
        this.d = s5.getContext();
        this.e = s5;
        this.h = f7;
        this.i = c0241c8;
        atomicLong.set(b());
        this.j = new O3(new S9(v7, s5, atomicLong, arrayList, f7, reentrantReadWriteLock), Jb.k().w().f());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:2|3)|(9:5|7|8|(2:10|11)|13|14|15|(2:17|18)|21)|24|13|14|15|(0)|21) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[Catch: all -> 0x0064, TRY_LEAVE, TryCatch #0 {all -> 0x0064, blocks: (B:15:0x004f, B:17:0x0059), top: B:14:0x004f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0603oo a(long j, EnumC0718so enumC0718so) {
        Cursor cursor;
        String asString;
        SQLiteDatabase readableDatabase;
        ContentValues contentValues = new ContentValues();
        this.a.lock();
        try {
            readableDatabase = this.c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("sessions", new String[]{"report_request_parameters"}, "id = ? AND type = ?", new String[]{String.valueOf(j), String.valueOf(enumC0718so.a)}, null, null, null, "1");
            try {
                if (cursor.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues2);
                    contentValues = contentValues2;
                }
            } catch (Throwable unused2) {
            }
            Or.a(cursor);
            this.a.unlock();
            asString = contentValues.getAsString("report_request_parameters");
            if (!StringUtils.isNullOrEmpty(asString)) {
                return new C0603oo(new JSONObject(asString));
            }
            return null;
        }
        cursor = null;
        Or.a(cursor);
        this.a.unlock();
        asString = contentValues.getAsString("report_request_parameters");
        if (!StringUtils.isNullOrEmpty(asString)) {
        }
        return null;
    }

    public final long b() {
        long j;
        SQLiteDatabase readableDatabase;
        this.a.lock();
        try {
            readableDatabase = this.c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            j = DBUtils.queryRowsCount(readableDatabase, "events");
            this.a.unlock();
            return j;
        }
        j = 0;
        this.a.unlock();
        return j;
    }

    public final void c() {
        Cursor cursor;
        Cursor cursor2;
        this.a.lock();
        Cursor cursor3 = null;
        try {
            SQLiteDatabase readableDatabase = this.c.getReadableDatabase();
            if (readableDatabase != null) {
                cursor2 = readableDatabase.query(true, "sessions", new String[]{"id"}, null, null, null, null, "id ASC", null);
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("All sessions in db: ");
                    while (cursor2.moveToNext()) {
                        stringBuffer.append(cursor2.getString(0));
                        stringBuffer.append(Extension.FIX_SPACE);
                    }
                    cursor3 = readableDatabase.query(true, "events", new String[]{"session_id"}, null, null, null, null, "session_id ASC", null);
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("All sessions in reports db: ");
                    while (cursor3.moveToNext()) {
                        stringBuffer2.append(cursor3.getString(0));
                        stringBuffer2.append(Extension.FIX_SPACE);
                    }
                } catch (Throwable unused) {
                    cursor = cursor3;
                    cursor3 = cursor2;
                    Cursor cursor4 = cursor;
                    cursor2 = cursor3;
                    cursor3 = cursor4;
                    this.a.unlock();
                    Or.a(cursor2);
                    Or.a(cursor3);
                }
            } else {
                cursor2 = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        this.a.unlock();
        Or.a(cursor2);
        Or.a(cursor3);
    }

    public final long a(Set set) {
        long j;
        SQLiteDatabase readableDatabase;
        String[] strArr;
        String str;
        this.a.lock();
        try {
            readableDatabase = this.c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            if (set.isEmpty()) {
                strArr = null;
                str = null;
            } else {
                StringBuilder sb = new StringBuilder("type IN (");
                strArr = new String[set.size()];
                Iterator it = set.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    if (i > 0) {
                        sb.append(Extension.FIX_SPACE);
                    }
                    sb.append("?");
                    strArr[i] = String.valueOf(num);
                    i++;
                }
                sb.append(Extension.C_BRAKE);
                str = sb.toString();
            }
            j = DatabaseUtils.queryNumEntries(readableDatabase, "events", str, strArr);
            this.a.unlock();
            return j;
        }
        j = 0;
        this.a.unlock();
        return j;
    }

    public final void a(InterfaceC0387ha interfaceC0387ha) {
        this.g.add(interfaceC0387ha);
    }

    public final void a(ContentValues contentValues) {
        if (contentValues == null) {
            return;
        }
        this.b.lock();
        try {
            SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", null, contentValues);
            }
        } catch (Throwable unused) {
        }
        this.b.unlock();
    }

    public final D7 a(SQLiteDatabase sQLiteDatabase, String str, C0228bo c0228bo) {
        return this.h.a(sQLiteDatabase, str, new String[]{Long.toString(c0228bo.a), Integer.toString(c0228bo.b), Long.toString(c0228bo.c)}, 1, this.e.b.b, c0228bo.d);
    }

    public final long a() {
        this.a.lock();
        try {
            return this.f.get();
        } finally {
            this.a.unlock();
        }
    }

    public static String a(LinkedHashMap linkedHashMap) {
        StringBuilder sb = new StringBuilder("id >= ?");
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            x4e.C(sb, sb.length() > 0 ? " AND " : "", (String) it.next(), " = ? ");
        }
        if (TextUtils.isEmpty(sb.toString())) {
            return null;
        }
        return sb.toString();
    }
}
