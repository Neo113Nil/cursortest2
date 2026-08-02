package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.exoplayer.offline.DownloadService;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.HexString;
import ru.yandex.common.clid.ClidProvider;
import yads.l13;
import yads.m30;
import yads.rj0;
import yads.y13;

/* loaded from: classes7.dex */
public final class wu81 {
    public static final String d;
    public static final String[] e;
    public final l13 a;
    public final Object b = new Object();
    public boolean c;

    static {
        int[] iArr = {3, 4};
        StringBuilder sb = new StringBuilder("state IN (");
        for (int i = 0; i < 2; i++) {
            if (i > 0) {
                sb.append(HexString.CHAR_COMMA);
            }
            sb.append(iArr[i]);
        }
        sb.append(')');
        d = sb.toString();
        e = new String[]{"id", "mime_type", LaunchBrowserActivity.KEY_URI, "stream_keys", "custom_cache_key", Constants.KEY_DATA, ClidProvider.STATE, "start_time_ms", "update_time_ms", "content_length", DownloadService.KEY_STOP_REASON, "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};
    }

    public wu81(l13 l13Var) {
        this.a = l13Var;
    }

    public static pg71 b(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri parse = Uri.parse(string2);
        String string3 = cursor.getString(1);
        ArrayList d2 = d(cursor.getString(3));
        if (blob.length <= 0) {
            blob = null;
        }
        rj0 rj0Var = new rj0(string, parse, string3, d2, blob, cursor.getString(4), cursor.getBlob(5));
        m281 m281Var = new m281();
        m281Var.a = cursor.getLong(13);
        m281Var.b = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new pg71(rj0Var, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, m281Var);
    }

    public static ArrayList c(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!rf71.n(sQLiteDatabase, "ExoPlayerDownloads")) {
            return arrayList;
        }
        Cursor query = sQLiteDatabase.query("ExoPlayerDownloads", new String[]{"id", "title", LaunchBrowserActivity.KEY_URI, "stream_keys", "custom_cache_key", Constants.KEY_DATA, ClidProvider.STATE, "start_time_ms", "update_time_ms", "content_length", DownloadService.KEY_STOP_REASON, "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(i(query));
            } finally {
            }
        }
        query.close();
        return arrayList;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            int i = rf71.a;
            for (String str2 : str.split(",", -1)) {
                String[] split = str2.split("\\.", -1);
                if (split.length != 3) {
                    ny61.k();
                    return null;
                }
                arrayList.add(new y13(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2])));
            }
        }
        return arrayList;
    }

    public static void h(pg71 pg71Var, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = pg71Var.a.f;
        if (bArr == null) {
            bArr = rf71.f;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", pg71Var.a.b);
        contentValues.put("mime_type", pg71Var.a.d);
        contentValues.put(LaunchBrowserActivity.KEY_URI, pg71Var.a.c.toString());
        List list = pg71Var.a.e;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            y13 y13Var = (y13) list.get(i);
            sb.append(y13Var.b);
            sb.append('.');
            sb.append(y13Var.c);
            sb.append('.');
            sb.append(y13Var.d);
            sb.append(HexString.CHAR_COMMA);
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        contentValues.put("stream_keys", sb.toString());
        contentValues.put("custom_cache_key", pg71Var.a.g);
        contentValues.put(Constants.KEY_DATA, pg71Var.a.h);
        contentValues.put(ClidProvider.STATE, Integer.valueOf(pg71Var.b));
        contentValues.put("start_time_ms", Long.valueOf(pg71Var.c));
        contentValues.put("update_time_ms", Long.valueOf(pg71Var.d));
        contentValues.put("content_length", Long.valueOf(pg71Var.e));
        contentValues.put(DownloadService.KEY_STOP_REASON, Integer.valueOf(pg71Var.f));
        contentValues.put("failure_reason", Integer.valueOf(pg71Var.g));
        contentValues.put("percent_downloaded", Float.valueOf(pg71Var.h.b));
        contentValues.put("bytes_downloaded", Long.valueOf(pg71Var.h.a));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow("ExoPlayerDownloads", null, contentValues);
    }

    public static pg71 i(Cursor cursor) {
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        Uri parse = Uri.parse(string2);
        String string3 = cursor.getString(1);
        rj0 rj0Var = new rj0(string, parse, "dash".equals(string3) ? "application/dash+xml" : "hls".equals(string3) ? "application/x-mpegURL" : "ss".equals(string3) ? "application/vnd.ms-sstr+xml" : "video/x-unknown", d(cursor.getString(3)), null, cursor.getString(4), cursor.getBlob(5));
        m281 m281Var = new m281();
        m281Var.a = cursor.getLong(13);
        m281Var.b = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new pg71(rj0Var, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, m281Var);
    }

    public final Cursor a(String str, String[] strArr) {
        try {
            return this.a.getReadableDatabase().query("ExoPlayerDownloads", e, str, strArr, null, null, "start_time_ms ASC");
        } catch (Throwable th) {
            throw new m30(th);
        }
    }

    public final void e() {
        synchronized (this.b) {
            if (this.c) {
                return;
            }
            try {
                int a = ye81.a(this.a.getReadableDatabase(), 0, "");
                if (a != 3) {
                    SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        ye81.b(writableDatabase, 0, "", 3);
                        ArrayList c = a == 2 ? c(writableDatabase) : new ArrayList();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS ExoPlayerDownloads");
                        writableDatabase.execSQL("CREATE TABLE ExoPlayerDownloads (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        Iterator it = c.iterator();
                        while (it.hasNext()) {
                            h((pg71) it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                this.c = true;
            } catch (Throwable th2) {
                throw new m30(th2);
            }
        }
    }

    public final void f(int i, String str) {
        e();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(DownloadService.KEY_STOP_REASON, Integer.valueOf(i));
            this.a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, d + " AND id = ?", new String[]{str});
        } catch (Throwable th) {
            throw new m30(th);
        }
    }

    public final void g(pg71 pg71Var) {
        e();
        try {
            h(pg71Var, this.a.getWritableDatabase());
        } catch (Throwable th) {
            throw new m30(th);
        }
    }

    public final pg71 j(String str) {
        e();
        try {
            Cursor a = a("id = ?", new String[]{str});
            try {
                if (a.getCount() == 0) {
                    a.close();
                    return null;
                }
                a.moveToNext();
                pg71 b = b(a);
                a.close();
                return b;
            } finally {
            }
        } catch (SQLiteException e2) {
            throw new m30(e2);
        }
    }

    public final void k() {
        e();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(ClidProvider.STATE, (Integer) 0);
            this.a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, "state = 2", null);
        } catch (Throwable th) {
            throw new m30(th);
        }
    }

    public final void l() {
        e();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(ClidProvider.STATE, (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, null, null);
        } catch (Throwable th) {
            throw new m30(th);
        }
    }
}
